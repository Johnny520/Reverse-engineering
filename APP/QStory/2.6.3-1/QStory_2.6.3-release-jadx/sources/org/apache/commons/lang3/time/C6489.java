package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6489 implements InterfaceC6500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15909;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6489 f15908 = new C6489(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6489 f15907 = new C6489(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6489 f15906 = new C6489(2);

    public /* synthetic */ C6489(int i) {
        this.f15909 = i;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6500
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11603(Appendable appendable, int i) throws IOException {
        switch (this.f15909) {
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

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11601(Calendar calendar, Appendable appendable) throws IOException {
        switch (this.f15909) {
            case 0:
                FastDatePrinter.appendDigits(appendable, calendar.get(2) + 1);
                break;
            case 1:
                mo11603(appendable, calendar.get(1) % 100);
                break;
            default:
                mo11603(appendable, calendar.get(2) + 1);
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11602() {
        switch (this.f15909) {
        }
        return 2;
    }
}
