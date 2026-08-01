package org.apache.commons.lang3.time;

import java.text.Format;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.AbstractC5691;
import org.apache.commons.lang3.AbstractC5692;
import org.apache.commons.lang3.ObjectUtils$Null;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5663 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f15572 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f15573 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Format m10989(String str, TimeZone timeZone, Locale locale) {
        Objects.requireNonNull(str, "pattern");
        int i = AbstractC5654.f15556;
        ObjectUtils$Null objectUtils$Null = AbstractC5691.f15625;
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        int i2 = AbstractC5692.f15626;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return (Format) this.f15573.computeIfAbsent(new C5664(str, timeZone, locale), new C5665(this, str, timeZone, locale));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Format m10990(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        int i = AbstractC5692.f15626;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Locale locale2 = locale != null ? locale : Locale.getDefault();
        return m10989((String) f15572.computeIfAbsent(new C5664(num, num2, locale2), new C5665(0, num2, num, locale2)), timeZone, locale);
    }
}
