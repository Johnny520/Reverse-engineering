package org.apache.commons.lang3.time;

import java.text.Format;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.AbstractC6522;
import org.apache.commons.lang3.AbstractC6523;
import org.apache.commons.lang3.ObjectUtils$Null;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f15917 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f15918 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Format m11605(String str, TimeZone timeZone, Locale locale) {
        Objects.requireNonNull(str, "pattern");
        int i = AbstractC6485.f15901;
        ObjectUtils$Null objectUtils$Null = AbstractC6522.f15970;
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        int i2 = AbstractC6523.f15971;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return (Format) this.f15918.computeIfAbsent(new C6495(str, timeZone, locale), new C6496(this, str, timeZone, locale));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Format m11606(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        int i = AbstractC6523.f15971;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Locale locale2 = locale != null ? locale : Locale.getDefault();
        return m11605((String) f15917.computeIfAbsent(new C6495(num, num2, locale2), new C6496(0, num2, num, locale2)), timeZone, locale);
    }
}
