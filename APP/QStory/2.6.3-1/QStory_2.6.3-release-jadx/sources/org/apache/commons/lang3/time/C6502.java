package org.apache.commons.lang3.time;

import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6502 implements InterfaceC6500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6500 f15936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15937;

    public /* synthetic */ C6502(InterfaceC6500 interfaceC6500, int i) {
        this.f15937 = i;
        this.f15936 = interfaceC6500;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6500
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11603(Appendable appendable, int i) {
        switch (this.f15937) {
            case 0:
                this.f15936.mo11603(appendable, i);
                break;
            case 1:
                this.f15936.mo11603(appendable, i);
                break;
            case 2:
                this.f15936.mo11603(appendable, i);
                break;
            default:
                this.f15936.mo11603(appendable, i);
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11601(Calendar calendar, Appendable appendable) {
        int i = this.f15937;
        InterfaceC6500 interfaceC6500 = this.f15936;
        switch (i) {
            case 0:
                int i2 = calendar.get(7);
                interfaceC6500.mo11603(appendable, i2 != 1 ? i2 - 1 : 7);
                break;
            case 1:
                int leastMaximum = calendar.get(10);
                if (leastMaximum == 0) {
                    leastMaximum = calendar.getLeastMaximum(10) + 1;
                }
                interfaceC6500.mo11603(appendable, leastMaximum);
                break;
            case 2:
                int maximum = calendar.get(11);
                if (maximum == 0) {
                    maximum = calendar.getMaximum(11) + 1;
                }
                interfaceC6500.mo11603(appendable, maximum);
                break;
            default:
                interfaceC6500.mo11603(appendable, calendar.getWeekYear());
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11602() {
        switch (this.f15937) {
        }
        return this.f15936.mo11602();
    }
}
