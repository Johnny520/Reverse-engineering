package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1362 extends AbstractC1256 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1361 f3940 = new C1361(AbstractC1280.m2270().mo2200());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6542 f3941;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1353 f3942;

    public C1362(InterfaceC6542 interfaceC6542, C1353 c1353) {
        this.f3941 = interfaceC6542;
        this.f3942 = c1353;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        InterfaceC6557 interfaceC6557Mo2193 = AbstractC1280.m2270().mo2193();
        if (interfaceC6557Mo2193 != null) {
            interfaceC6557Mo2193.invoke(this);
        }
        AbstractC1286 abstractC1286M2270 = AbstractC1280.m2270();
        return m2431((C1361) AbstractC1280.m2269(this.f3940, abstractC1286M2270), abstractC1286M2270, true, this.f3941).f3935;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C1361 c1361 = (C1361) AbstractC1280.m2265(this.f3940);
        sb.append(c1361.m2430(this, AbstractC1280.m2270()) ? String.valueOf(c1361.f3935) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2183() {
        return this.f3940;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2184(AbstractC1255 abstractC1255) {
        this.f3940 = (C1361) abstractC1255;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.C1361 m2431(androidx.compose.runtime.C1361 r21, androidx.compose.runtime.snapshots.AbstractC1286 r22, boolean r23, p052.InterfaceC6542 r24) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1362.m2431(androidx.compose.runtime.飘花落叶言子楪兰苏世哲, androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰, boolean, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):androidx.compose.runtime.飘花落叶言子楪兰苏世哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1361 m2432() {
        AbstractC1286 abstractC1286M2270 = AbstractC1280.m2270();
        return m2431((C1361) AbstractC1280.m2269(this.f3940, abstractC1286M2270), abstractC1286M2270, false, this.f3941);
    }
}
