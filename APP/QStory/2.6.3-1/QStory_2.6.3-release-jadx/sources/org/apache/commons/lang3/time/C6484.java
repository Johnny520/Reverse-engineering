package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6484 implements InterfaceC6500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15899;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15900;

    public C6484(int i, int i2) {
        if (i2 < 3) {
            C6755.m11865();
            throw null;
        }
        this.f15900 = i;
        this.f15899 = i2;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6500
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo11603(Appendable appendable, int i) throws IOException {
        FastDatePrinter.appendFullDigits(appendable, i, this.f15899);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11601(Calendar calendar, Appendable appendable) throws IOException {
        mo11603(appendable, calendar.get(this.f15900));
    }

    @Override // org.apache.commons.lang3.time.InterfaceC6483
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11602() {
        return this.f15899;
    }
}
