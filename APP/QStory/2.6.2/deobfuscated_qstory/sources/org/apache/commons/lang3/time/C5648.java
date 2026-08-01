package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.AbstractC5692;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5648 implements InterfaceC5652 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f15544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f15545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Locale f15547;

    public C5648(int i, TimeZone timeZone, Locale locale) {
        int i2 = AbstractC5692.f15626;
        this.f15547 = locale != null ? locale : Locale.getDefault();
        this.f15546 = i;
        this.f15545 = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i, locale);
        this.f15544 = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i, locale);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo10985(Calendar calendar, Appendable appendable) throws IOException {
        appendable.append(FastDatePrinter.getTimeZoneDisplay(calendar.getTimeZone(), calendar.get(16) != 0, this.f15546, this.f15547));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo10986() {
        return Math.max(this.f15545.length(), this.f15544.length());
    }
}
