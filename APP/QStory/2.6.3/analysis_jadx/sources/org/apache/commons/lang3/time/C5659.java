package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5659 implements InterfaceC5670 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5659 f15563 = new C5659(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5659 f15562 = new C5659(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5659 f15561 = new C5659(2);

    public /* synthetic */ C5659(int i) {
        this.f15564 = i;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5670
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11044(Appendable appendable, int i) throws IOException {
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

    @Override // org.apache.commons.lang3.time.InterfaceC5653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11042(Calendar calendar, Appendable appendable) throws IOException {
        switch (this.f15564) {
            case 0:
                FastDatePrinter.appendDigits(appendable, calendar.get(2) + 1);
                break;
            case 1:
                mo11044(appendable, calendar.get(1) % 100);
                break;
            default:
                mo11044(appendable, calendar.get(2) + 1);
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11043() {
        switch (this.f15564) {
        }
        return 2;
    }
}
