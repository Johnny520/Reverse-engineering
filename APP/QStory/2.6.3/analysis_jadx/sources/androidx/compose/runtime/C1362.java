package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1362 extends AbstractC1256 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1361 f3941 = new C1361(AbstractC1280.m2280().mo2210());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6543 f3942;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1353 f3943;

    public C1362(InterfaceC6543 interfaceC6543, C1353 c1353) {
        this.f3942 = interfaceC6543;
        this.f3943 = c1353;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        InterfaceC6558 interfaceC6558Mo2203 = AbstractC1280.m2280().mo2203();
        if (interfaceC6558Mo2203 != null) {
            interfaceC6558Mo2203.invoke(this);
        }
        AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
        return m2441((C1361) AbstractC1280.m2279(this.f3941, abstractC1286M2280), abstractC1286M2280, true, this.f3942).f3936;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C1361 c1361 = (C1361) AbstractC1280.m2275(this.f3941);
        sb.append(c1361.m2440(this, AbstractC1280.m2280()) ? String.valueOf(c1361.f3936) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2193() {
        return this.f3941;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2194(AbstractC1255 abstractC1255) {
        this.f3941 = (C1361) abstractC1255;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.C1361 m2441(androidx.compose.runtime.C1361 r21, androidx.compose.runtime.snapshots.AbstractC1286 r22, boolean r23, p052.InterfaceC6543 r24) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1362.m2441(androidx.compose.runtime.飘花落叶言子楪兰苏世哲, androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰, boolean, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):androidx.compose.runtime.飘花落叶言子楪兰苏世哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1361 m2442() {
        AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
        return m2441((C1361) AbstractC1280.m2279(this.f3941, abstractC1286M2280), abstractC1286M2280, false, this.f3942);
    }
}
