package Yue;

import Yue.InterfaceC7144;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C4857 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1178 = 4;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1179 = 14;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f11115 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f11116 = 25;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f11117 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f11119 = "\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f11120 = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f11121 = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f11122 = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f11123 = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final String f11125 = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final String f11126 = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f11127 = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f11128 = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C0510[] f11118 = {new C0510(99, 99, -1, -1), new C0510(35, 36, -1, -1), new C0510(71, 72, -1, -1), new C0510(96, 96, -1, -1), new C0510(85, 86, -1, -1), new C0510(90, 96, -1, -1), new C0510(80, 81, -1, -1), new C0510(6, 6, -1, -1), new C0510(20, 20, -1, -1), new C0510(19, 19, -1, -1), new C0510(32, 34, -1, -1), new C0510(96, 96, -1, -1), new C0510(30, 31, -1, -1), new C0510(96, 96, -1, -1), new C0510(96, 96, -1, -1), new C0510(50, 52, -1, -1), new C0510(83, 83, -1, -1), new C0510(60, 62, -1, -1), new C0510(46, 47, -1, -1), new C0510(66, 67, 73, -1), new C0510(40, 42, -1, -1), new C0510(70, 71, -1, -1), new C0510(1, 2, -1, -1), new C0510(20, 21, -1, -1), new C0510(3, 4, -1, -1), new C0510(96, 96, -1, -1), new C0510(48, 49, -1, -1), new C0510(55, 56, -1, -1), new C0510(63, 65, -1, -1), new C0510(96, 96, -1, -1), new C0510(38, 39, -1, -1), new C0510(55, 56, -1, -1), new C0510(27, 28, -1, -1), new C0510(58, 58, -1, -1), new C0510(68, 69, -1, -1), new C0510(3, 4, -1, -1), new C0510(7, 8, -1, -1), new C0510(87, 88, 86, -1), new C0510(88, 89, 96, -1), new C0510(10, 14, 0, 6), new C0510(43, 45, -1, -1), new C0510(73, 74, -1, -1), new C0510(97, 97, -1, -1), new C0510(15, 19, -1, -1), new C0510(6, 6, 0, 9), new C0510(96, 96, -1, -1), new C0510(2, 2, -1, -1), new C0510(29, 29, -1, -1), new C0510(57, 57, -1, -1), new C0510(37, 38, -1, -1), new C0510(75, 79, 87, 88), new C0510(84, 84, -1, -1), new C0510(22, 24, 20, -1), new C0510(6, 9, -1, -1), new C0510(5, 5, -1, -1), new C0510(98, 99, -1, -1), new C0510(53, 54, -1, -1), new C0510(24, 26, -1, -1), new C0510(82, 83, -1, -1)};

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final Pattern f11124 = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final Pattern f11129 = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final Pattern f11130 = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final Pattern f11131 = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final Pattern f11132 = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final Pattern f11133 = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۡ$ۥ */
    public static class C0510 {

        /* JADX INFO: renamed from: ۥ */
        public int f1180;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1181;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f11134;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f11135;

        public C0510(int i, int i2, int i3, int i4) {
            this.f1180 = i;
            this.f1181 = i2;
            this.f11134 = i3;
            this.f11135 = i4;
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m1756(String str) {
            int i = Integer.parseInt(str.substring(0, 2));
            return (this.f1180 <= i && i <= this.f1181) || i == this.f11134 || i == this.f11135;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
    
        if (r10 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        if (r9 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dd, code lost:
    
        return -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return -r13;
     */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1754(String str, MatchResult matchResult) {
        int length;
        MatchResult matchResultM14856;
        int iEnd = matchResult.end();
        Matcher matcher = f11124.matcher(str);
        String strGroup = "";
        int i = -1;
        int iEnd2 = -1;
        int i2 = 1;
        int i3 = 1;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (iEnd < str.length()) {
                if (!matcher.find(iEnd)) {
                    length = str.length();
                    break;
                }
                if (matcher.end() - matcher.start() <= 25) {
                    while (iEnd < matcher.start()) {
                        int i4 = iEnd + 1;
                        if (f11119.indexOf(str.charAt(iEnd)) != -1) {
                            i2++;
                        }
                        iEnd = i4;
                    }
                    if (i2 > 5 || (i3 = i3 + 1) > 14) {
                        break;
                    }
                    if (m14855(str, iEnd) == null) {
                        if (!m14851(matcher.group(0))) {
                            if (i3 == 5 && !z2) {
                                iEnd = matcher.end();
                                break;
                            }
                            if (z2 && i3 > 4 && (matchResultM14856 = m14856(str, iEnd)) != null) {
                                if (strGroup.equals("et") && matchResultM14856.group(0).equals("al")) {
                                    iEnd = matchResultM14856.end();
                                    break;
                                }
                                Matcher matcher2 = f11124.matcher(str);
                                if (!matcher2.find(matchResultM14856.end())) {
                                    iEnd2 = matchResultM14856.end();
                                } else if (m14854(matcher2.group(0), matchResultM14856)) {
                                    return matcher2.end();
                                }
                            }
                        } else {
                            z2 = true;
                        }
                        z = false;
                    } else {
                        if (z && i2 > 1) {
                            return -iEnd;
                        }
                        if (i == -1) {
                            i = iEnd;
                        }
                    }
                    strGroup = matcher.group(0);
                    iEnd = matcher.end();
                } else {
                    length = matcher.end();
                    break;
                }
            } else {
                break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m1755(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f11132.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int i3 = Integer.parseInt(matcher.group(1));
        if (i3 == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i4 = i3 % 10;
        if (i4 == 1) {
            return lowerCase.equals(i3 % 100 != 11 ? "st" : "th");
        }
        if (i4 == 2) {
            return lowerCase.equals(i3 % 100 != 12 ? "nd" : "th");
        }
        if (i4 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(i3 % 100 != 13 ? "rd" : "th");
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m14850(String str) {
        Matcher matcher = f11129.matcher(str);
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            if (m1755(matcher.group(0))) {
                int iStart = matcher.start();
                int iM1754 = m1754(str, matcher);
                if (iM1754 > 0) {
                    return str.substring(iStart, iM1754);
                }
                iEnd = -iM1754;
            } else {
                iEnd = matcher.end();
            }
        }
        return null;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m14851(String str) {
        return f11131.matcher(str).matches();
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m14852(String str) {
        return f11133.matcher(str).matches();
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m14853(String str, String str2) {
        return m14854(str, m14856(str2, 0));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m14854(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int iGroupCount = matchResult.groupCount();
        while (true) {
            if (iGroupCount <= 0) {
                break;
            }
            int i = iGroupCount - 1;
            if (matchResult.group(iGroupCount) != null) {
                iGroupCount = i;
                break;
            }
            iGroupCount = i;
        }
        return f11133.matcher(str).matches() && f11118[iGroupCount].m1756(str);
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static MatchResult m14855(String str, int i) {
        if (i > 0 && f11127.indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f11129.matcher(str).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            MatchResult matchResult = matcherRegion.toMatchResult();
            if (m1755(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static MatchResult m14856(String str, int i) {
        if (i > 0 && f11122.indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f11130.matcher(str).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return matcherRegion.toMatchResult();
        }
        return null;
    }
}
