package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5654 implements InterfaceC5670 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15555;

    public C5654(int i, int i2) {
        if (i2 < 3) {
            C5925.m11306();
            throw null;
        }
        this.f15555 = i;
        this.f15554 = i2;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5670
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo11044(Appendable appendable, int i) throws IOException {
        FastDatePrinter.appendFullDigits(appendable, i, this.f15554);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11042(Calendar calendar, Appendable appendable) throws IOException {
        mo11044(appendable, calendar.get(this.f15555));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11043() {
        return this.f15554;
    }
}
