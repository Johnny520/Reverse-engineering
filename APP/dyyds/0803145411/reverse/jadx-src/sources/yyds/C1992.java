package yyds;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* JADX INFO: renamed from: yyds.ᲀᛴᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1992 extends AbstractC2383 {
    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo1661(Object obj) {
        TreeMap treeMap = AbstractC0159.f971;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(((String) obj).replace("p.m.", "pm").replace("a.m.", "am"), "  -/:,.+年月日曜時分秒");
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String strNextToken = stringTokenizer.nextToken();
        if (strNextToken.length() == 4 && Character.isDigit(strNextToken.charAt(0))) {
            GregorianCalendar gregorianCalendarM719 = AbstractC0159.m719();
            gregorianCalendarM719.set(1, Integer.parseInt(strNextToken));
            if (!stringTokenizer.hasMoreTokens()) {
                return gregorianCalendarM719.getTime();
            }
            gregorianCalendarM719.set(2, AbstractC0159.m724(stringTokenizer.nextToken()).intValue());
            if (!stringTokenizer.hasMoreTokens()) {
                return gregorianCalendarM719.getTime();
            }
            String strNextToken2 = stringTokenizer.nextToken();
            if (!Character.isDigit(strNextToken2.charAt(0))) {
                return gregorianCalendarM719.getTime();
            }
            if (strNextToken2.length() == 5 && strNextToken2.charAt(2) == 'T') {
                gregorianCalendarM719.set(5, Integer.parseInt(strNextToken2.substring(0, 2)));
                return AbstractC0159.m721(strNextToken2.substring(3), gregorianCalendarM719, stringTokenizer);
            }
            gregorianCalendarM719.set(5, Integer.parseInt(strNextToken2));
            return AbstractC0159.m720(stringTokenizer, gregorianCalendarM719);
        }
        if (AbstractC0159.f972.containsKey(strNextToken)) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            strNextToken = stringTokenizer.nextToken();
        }
        TreeMap treeMap2 = AbstractC0159.f971;
        if (!treeMap2.containsKey(strNextToken)) {
            if (!Character.isDigit(strNextToken.charAt(0))) {
                return null;
            }
            GregorianCalendar gregorianCalendarM7192 = AbstractC0159.m719();
            gregorianCalendarM7192.set(5, Integer.parseInt(strNextToken));
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            gregorianCalendarM7192.set(2, AbstractC0159.m724(stringTokenizer.nextToken()).intValue());
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            gregorianCalendarM7192.set(1, AbstractC0159.m725(stringTokenizer.nextToken()));
            return AbstractC0159.m720(stringTokenizer, gregorianCalendarM7192);
        }
        GregorianCalendar gregorianCalendarM7193 = AbstractC0159.m719();
        Integer num = (Integer) treeMap2.get(strNextToken);
        if (num == null) {
            C0188.m789(AbstractC2104.m4014("can not parse ", strNextToken, " as month"));
            return null;
        }
        gregorianCalendarM7193.set(2, num.intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarM7193.set(5, Integer.parseInt(stringTokenizer.nextToken()));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String strNextToken3 = stringTokenizer.nextToken();
        if (Character.isLetter(strNextToken3.charAt(0))) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            strNextToken3 = stringTokenizer.nextToken();
        }
        if (strNextToken3.length() == 4) {
            gregorianCalendarM7193.set(1, AbstractC0159.m725(strNextToken3));
        } else if (strNextToken3.length() == 2) {
            return AbstractC0159.m721(strNextToken3, gregorianCalendarM7193, stringTokenizer);
        }
        return AbstractC0159.m720(stringTokenizer, gregorianCalendarM7193);
    }
}
