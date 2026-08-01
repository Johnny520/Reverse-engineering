package org.apache.commons.lang3.time;

import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5671 implements InterfaceC5669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5669 f15591;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15592;

    public /* synthetic */ C5671(InterfaceC5669 interfaceC5669, int i) {
        this.f15592 = i;
        this.f15591 = interfaceC5669;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5669
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo10987(Appendable appendable, int i) {
        switch (this.f15592) {
            case 0:
                this.f15591.mo10987(appendable, i);
                break;
            case 1:
                this.f15591.mo10987(appendable, i);
                break;
            case 2:
                this.f15591.mo10987(appendable, i);
                break;
            default:
                this.f15591.mo10987(appendable, i);
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10985(Calendar calendar, Appendable appendable) {
        int i = this.f15592;
        InterfaceC5669 interfaceC5669 = this.f15591;
        switch (i) {
            case 0:
                int i2 = calendar.get(7);
                interfaceC5669.mo10987(appendable, i2 != 1 ? i2 - 1 : 7);
                break;
            case 1:
                int leastMaximum = calendar.get(10);
                if (leastMaximum == 0) {
                    leastMaximum = calendar.getLeastMaximum(10) + 1;
                }
                interfaceC5669.mo10987(appendable, leastMaximum);
                break;
            case 2:
                int maximum = calendar.get(11);
                if (maximum == 0) {
                    maximum = calendar.getMaximum(11) + 1;
                }
                interfaceC5669.mo10987(appendable, maximum);
                break;
            default:
                interfaceC5669.mo10987(appendable, calendar.getWeekYear());
                break;
        }
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo10986() {
        switch (this.f15592) {
        }
        return this.f15591.mo10986();
    }
}
