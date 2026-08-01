package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5671 implements InterfaceC5653 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final char f15590;

    public C5671(char c) {
        this.f15590 = c;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11042(Calendar calendar, Appendable appendable) throws IOException {
        appendable.append(this.f15590);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5653
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11043() {
        return 1;
    }
}
