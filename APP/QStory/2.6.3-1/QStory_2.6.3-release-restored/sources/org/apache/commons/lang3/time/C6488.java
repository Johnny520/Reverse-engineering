package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6488 implements InterfaceC6500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15904;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15905;

    public /* synthetic */ C6488(int i, int i2) {
        this.f15905 = i2;
        this.f15904 = i;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6500
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11603(Appendable appendable, int i) throws IOException {
        switch (this.f15905) {
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

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11601(Calendar calendar, Appendable appendable) throws IOException {
        int i = this.f15905;
        int i2 = this.f15904;
        switch (i) {
            case 0:
                mo11603(appendable, calendar.get(i2));
                break;
            default:
                mo11603(appendable, calendar.get(i2));
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11602() {
        switch (this.f15905) {
            case 0:
                return 2;
            default:
                return 4;
        }
    }
}
