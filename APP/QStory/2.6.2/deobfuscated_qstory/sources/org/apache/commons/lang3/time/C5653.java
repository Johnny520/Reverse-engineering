package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5653 implements InterfaceC5669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15555;

    public C5653(int i, int i2) {
        if (i2 < 3) {
            C5919.m11245();
            throw null;
        }
        this.f15555 = i;
        this.f15554 = i2;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5669
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo10987(Appendable appendable, int i) throws IOException {
        FastDatePrinter.appendFullDigits(appendable, i, this.f15554);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10985(Calendar calendar, Appendable appendable) throws IOException {
        mo10987(appendable, calendar.get(this.f15555));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo10986() {
        return this.f15554;
    }
}
