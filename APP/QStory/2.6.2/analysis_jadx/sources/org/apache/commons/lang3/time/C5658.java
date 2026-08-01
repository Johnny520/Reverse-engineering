package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5658 implements InterfaceC5669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5658 f15563 = new C5658(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5658 f15562 = new C5658(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5658 f15561 = new C5658(2);

    public /* synthetic */ C5658(int i) {
        this.f15564 = i;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5669
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo10987(Appendable appendable, int i) throws IOException {
        switch (this.f15564) {
            case 0:
                FastDatePrinter.appendDigits(appendable, i);
                break;
            case 1:
                FastDatePrinter.appendDigits(appendable, i % 100);
                break;
            default:
                if (i >= 10) {
                    FastDatePrinter.appendDigits(appendable, i);
                } else {
                    appendable.append((char) (i + 48));
                }
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10985(Calendar calendar, Appendable appendable) throws IOException {
        switch (this.f15564) {
            case 0:
                FastDatePrinter.appendDigits(appendable, calendar.get(2) + 1);
                break;
            case 1:
                mo10987(appendable, calendar.get(1) % 100);
                break;
            default:
                mo10987(appendable, calendar.get(2) + 1);
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo10986() {
        switch (this.f15564) {
        }
        return 2;
    }
}
