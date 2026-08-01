package org.apache.commons.lang3.time;

import java.text.Format;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.AbstractC5692;
import org.apache.commons.lang3.AbstractC5693;
import org.apache.commons.lang3.ObjectUtils$Null;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5664 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f15572 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f15573 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Format m11046(String str, TimeZone timeZone, Locale locale) {
        Objects.requireNonNull(str, "pattern");
        int i = AbstractC5655.f15556;
        ObjectUtils$Null objectUtils$Null = AbstractC5692.f15625;
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        int i2 = AbstractC5693.f15626;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return (Format) this.f15573.computeIfAbsent(new C5665(str, timeZone, locale), new C5666(this, str, timeZone, locale));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Format m11047(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        int i = AbstractC5693.f15626;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Locale locale2 = locale != null ? locale : Locale.getDefault();
        return m11046((String) f15572.computeIfAbsent(new C5665(num, num2, locale2), new C5666(0, num2, num, locale2)), timeZone, locale);
    }
}
