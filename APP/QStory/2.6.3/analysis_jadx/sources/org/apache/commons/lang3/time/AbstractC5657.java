package org.apache.commons.lang3.time;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Pattern f15558 = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final TimeZone f15557 = new GmtTimeZone(false, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static TimeZone m11045(String str) {
        if (!"Z".equals(str) && !"UTC".equals(str)) {
            Matcher matcher = f15558.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(2);
            boolean z = false;
            int i = strGroup != null ? Integer.parseInt(strGroup) : 0;
            String strGroup2 = matcher.group(4);
            int i2 = strGroup2 != null ? Integer.parseInt(strGroup2) : 0;
            if (i != 0 || i2 != 0) {
                String strGroup3 = matcher.group(1);
                if (strGroup3 != null && strGroup3.charAt(0) == '-') {
                    z = true;
                }
                return new GmtTimeZone(z, i, i2);
            }
        }
        return f15557;
    }
}
