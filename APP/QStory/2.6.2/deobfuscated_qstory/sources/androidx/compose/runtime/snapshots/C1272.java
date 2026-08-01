package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.C1021;
import androidx.compose.runtime.C1303;
import androidx.compose.runtime.C1311;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1272 extends C1271 {
    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final C1271 mo2205(InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        return (C1271) ((AbstractC1286) AbstractC1280.m2249(new C1021(new C1311(interfaceC6557, 1, interfaceC65572), 1)));
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2195() {
        synchronized (AbstractC1280.f3744) {
            m2276();
        }
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC1274 mo2210() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final AbstractC1286 mo2196(InterfaceC6557 interfaceC6557) {
        int i = 1;
        return (C1268) ((AbstractC1286) AbstractC1280.m2249(new C1021(new C1303(interfaceC6557, i), i)));
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2199() {
        AbstractC1280.m2253();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2201() {
        AbstractC1274.m2226();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2202() {
        AbstractC1274.m2226();
        throw null;
    }
}
