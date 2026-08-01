package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.AbstractC6523;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6479 implements InterfaceC6483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f15889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f15890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Locale f15892;

    public C6479(int i, TimeZone timeZone, Locale locale) {
        int i2 = AbstractC6523.f15971;
        this.f15892 = locale != null ? locale : Locale.getDefault();
        this.f15891 = i;
        this.f15890 = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i, locale);
        this.f15889 = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i, locale);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo11601(Calendar calendar, Appendable appendable) throws IOException {
        appendable.append(FastDatePrinter.getTimeZoneDisplay(calendar.getTimeZone(), calendar.get(16) != 0, this.f15891, this.f15892));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo11602() {
        return Math.max(this.f15890.length(), this.f15889.length());
    }
}
