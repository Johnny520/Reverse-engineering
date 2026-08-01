package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5657 implements InterfaceC5669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15560;

    public /* synthetic */ C5657(int i, int i2) {
        this.f15560 = i2;
        this.f15559 = i;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5669
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo10987(Appendable appendable, int i) throws IOException {
        switch (this.f15560) {
            case 0:
                if (i >= 100) {
                    FastDatePrinter.appendFullDigits(appendable, i, 2);
                } else {
                    FastDatePrinter.appendDigits(appendable, i);
                }
                break;
            default:
                if (i < 10) {
                    appendable.append((char) (i + 48));
                } else if (i >= 100) {
                    FastDatePrinter.appendFullDigits(appendable, i, 1);
                } else {
                    FastDatePrinter.appendDigits(appendable, i);
                }
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10985(Calendar calendar, Appendable appendable) throws IOException {
        int i = this.f15560;
        int i2 = this.f15559;
        switch (i) {
            case 0:
                mo10987(appendable, calendar.get(i2));
                break;
            default:
                mo10987(appendable, calendar.get(i2));
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo10986() {
        switch (this.f15560) {
            case 0:
                return 2;
            default:
                return 4;
        }
    }
}
