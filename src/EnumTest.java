public class EnumTest {
    public static void main(String[] args) {

//        实例化枚举类
        Season season = Season.valueOf("SPRING");
        Planet planet=Planet.EARTH;
        System.out.println(planet.name());

//        遍历枚举类
        for(Planet planet1:Planet.values()) {
            System.out.println(planet1.surfaceWeight(planet1.mass()));
        }

        System.out.println(getSeasonSituation(season));
        for (Season season1 : Season.values()) {

//        三种方法返回值一样
            System.out.println(season1.name() + ":" + season1.getSeason());
            System.out.println(season1);
            System.out.println(season1.toString());
        }
//        该常量不存在时，返回空
        try {
            System.out.println(Season.valueOf("S"));
        } catch (Exception e) {
            System.out.println("出错啦！");
            e.printStackTrace();
        }
    }


        public static String getSeasonSituation (Season season){
            String situation;
            switch (season) {
                case SPRING:
                    situation = "I like spring!";
                    break;
                case SUMMER:
                    situation = "I don't like summer.";
                    break;
                case AUTUMN:
                    situation = "Wow, my favorite season.";
                    break;
                default:
                    situation = "Winter is coming!";
                    break;
            }
            return situation;
        }
    }

