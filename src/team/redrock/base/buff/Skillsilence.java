package team.redrock.base.buff;

import team.redrock.base.Hero;
import team.redrock.base.buff.Buff;

public interface Skillsilence extends Buff {
    int aRoundConsume = 70;

    @Override
    default String getDescription(){
        return "并且沉默了"+getTime()+"回合！";
    }

    @Override
    default void action(Hero hero) {
        hero.setCanDamage(true);  //沉默后可以普攻但不可以使用技能了
        hero.setCanCast(false);
    }

    @Override
    default boolean isDebuff() {
        return true;
    }

    @Override
    default int getConsume(){
        return getTime()*aRoundConsume;
    }
}