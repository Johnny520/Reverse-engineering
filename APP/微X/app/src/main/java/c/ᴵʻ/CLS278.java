// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

import com.google.zxing.NotFoundException;

public final class CLS278 {
    public static final Object[][] FLD1087;
    public static final Object[][] FLD1088;
    public static final Object[][] FLD1089;
    public static final Object FLD1090;
    public static final Object[][] FLD1091;

    static {
        Object object0 = new Object();
        CLS278.FLD1090 = object0;
        CLS278.FLD1091 = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", object0, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", object0, 20}, new Object[]{"22", object0, 29}, new Object[]{"30", object0, 8}, new Object[]{"37", object0, 8}, new Object[]{"90", object0, 30}, new Object[]{"91", object0, 30}, new Object[]{"92", object0, 30}, new Object[]{"93", object0, 30}, new Object[]{"94", object0, 30}, new Object[]{"95", object0, 30}, new Object[]{"96", object0, 30}, new Object[]{"97", object0, 30}, new Object[]{"98", object0, 30}, new Object[]{"99", object0, 30}};
        CLS278.FLD1087 = new Object[][]{new Object[]{"240", object0, 30}, new Object[]{"241", object0, 30}, new Object[]{"242", object0, 6}, new Object[]{"250", object0, 30}, new Object[]{"251", object0, 30}, new Object[]{"253", object0, 17}, new Object[]{"254", object0, 20}, new Object[]{"400", object0, 30}, new Object[]{"401", object0, 30}, new Object[]{"402", 17}, new Object[]{"403", object0, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", object0, 20}, new Object[]{"421", object0, 15}, new Object[]{"422", 3}, new Object[]{"423", object0, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        CLS278.FLD1089 = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", object0, 15}, new Object[]{"391", object0, 18}, new Object[]{"392", object0, 15}, new Object[]{"393", object0, 18}, new Object[]{"703", object0, 30}};
        CLS278.FLD1088 = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", object0, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", object0, 20}, new Object[]{"8003", object0, 30}, new Object[]{"8004", object0, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", object0, 30}, new Object[]{"8008", object0, 12}, new Object[]{"8018", 18}, new Object[]{"8020", object0, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", object0, 70}, new Object[]{"8200", object0, 70}};
    }

    public static String MTH3559(int v, int v1, String s) {
        int v2 = s.length() >= v1 + v ? v1 + v : s.length();
        String s1 = "(" + s.substring(0, v) + ')' + s.substring(v, v2);
        String s2 = CLS278.MTH3560(s.substring(v2));
        return s2 == null ? s1 : s1 + s2;
    }

    public static String MTH3560(String s) {
        if(s.isEmpty()) {
            return null;
        }
        if(s.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        String s1 = s.substring(0, 2);
        Object[][] arr2_object = CLS278.FLD1091;
        for(int v = 0; v < arr2_object.length; ++v) {
            Object[] arr_object = arr2_object[v];
            if(arr_object[0].equals(s1)) {
                Object object0 = arr_object[1];
                return object0 == CLS278.FLD1090 ? CLS278.MTH3559(2, ((int)(((Integer)arr_object[2]))), s) : CLS278.MTH3561(2, ((int)(((Integer)object0))), s);
            }
        }
        if(s.length() < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String s2 = s.substring(0, 3);
        Object[][] arr2_object1 = CLS278.FLD1087;
        for(int v1 = 0; v1 < arr2_object1.length; ++v1) {
            Object[] arr_object1 = arr2_object1[v1];
            if(arr_object1[0].equals(s2)) {
                Object object1 = arr_object1[1];
                return object1 == CLS278.FLD1090 ? CLS278.MTH3559(3, ((int)(((Integer)arr_object1[2]))), s) : CLS278.MTH3561(3, ((int)(((Integer)object1))), s);
            }
        }
        Object[][] arr2_object2 = CLS278.FLD1089;
        for(int v2 = 0; v2 < arr2_object2.length; ++v2) {
            Object[] arr_object2 = arr2_object2[v2];
            if(arr_object2[0].equals(s2)) {
                Object object2 = arr_object2[1];
                return object2 == CLS278.FLD1090 ? CLS278.MTH3559(4, ((int)(((Integer)arr_object2[2]))), s) : CLS278.MTH3561(4, ((int)(((Integer)object2))), s);
            }
        }
        if(s.length() < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        String s3 = s.substring(0, 4);
        Object[][] arr2_object3 = CLS278.FLD1088;
        for(int v3 = 0; v3 < arr2_object3.length; ++v3) {
            Object[] arr_object3 = arr2_object3[v3];
            if(arr_object3[0].equals(s3)) {
                Object object3 = arr_object3[1];
                return object3 == CLS278.FLD1090 ? CLS278.MTH3559(4, ((int)(((Integer)arr_object3[2]))), s) : CLS278.MTH3561(4, ((int)(((Integer)object3))), s);
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static String MTH3561(int v, int v1, String s) {
        if(s.length() < v) {
            throw NotFoundException.getNotFoundInstance();
        }
        String s1 = s.substring(0, v);
        int v2 = v1 + v;
        if(s.length() < v2) {
            throw NotFoundException.getNotFoundInstance();
        }
        String s2 = "(" + s1 + ')' + s.substring(v, v2);
        String s3 = CLS278.MTH3560(s.substring(v2));
        return s3 == null ? s2 : s2 + s3;
    }
}

