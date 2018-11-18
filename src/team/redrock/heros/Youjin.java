package team.redrock.heros;

import team.redrock.base.DamageSkill;
import team.redrock.base.Hero;
import team.redrock.base.Skill;
import team.redrock.base.buff.Dizzy;

public class Youjin extends Hero {
    private final static String NAME = "游琎";//你的名字
    private final static String STUID = "123456";//学号
    private final static int STR = 247;//力量
    private final static int INT = 252;//智力
    private final static int AGI = 1;//敏捷

    public Youjin() {
        super(NAME, STUID, STR, AGI, INT);
        Skill shadowRaze = new DamageSkill("要你命三千", 3200);
        super.addSkill(shadowRaze);
        Skill bachi = new Bachi();
        super.addSkill(bachi);
}
      public class Bachi extends DamageSkill implements Dizzy {
          private static final String NAME = "色诱术，日理万机";
          private static final int DAMAGE = 2;
          private static final int DIZZY_TIME = 10000000;

          public Bachi() {
              super(NAME, DAMAGE);
          }

          @Override
          public int getTime() {
              return DIZZY_TIME;
          }
    }
}

