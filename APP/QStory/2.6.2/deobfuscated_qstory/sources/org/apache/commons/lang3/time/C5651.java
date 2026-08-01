package org.apache.commons.lang3.time;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5651 implements InterfaceC5652 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15553;

    public C5651(String str) {
        this.f15553 = str;
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10985(Calendar calendar, Appendable appendable) throws IOException {
        appendable.append(this.f15553);
    }

    @Override // org.apache.commons.lang3.time.InterfaceC5652
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo10986() {
        return this.f15553.length();
    }
}
