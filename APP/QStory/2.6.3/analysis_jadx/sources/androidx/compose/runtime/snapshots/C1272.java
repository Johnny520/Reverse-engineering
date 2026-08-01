package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.C1021;
import androidx.compose.runtime.C1303;
import androidx.compose.runtime.C1311;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1272 extends C1271 {
    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final C1271 mo2215(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        return (C1271) ((AbstractC1286) AbstractC1280.m2259(new C1021(new C1311(interfaceC6558, 1, interfaceC65582), 1)));
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2205() {
        synchronized (AbstractC1280.f3745) {
            m2286();
        }
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC1274 mo2220() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final AbstractC1286 mo2206(InterfaceC6558 interfaceC6558) {
        int i = 1;
        return (C1268) ((AbstractC1286) AbstractC1280.m2259(new C1021(new C1303(interfaceC6558, i), i)));
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2209() {
        AbstractC1280.m2263();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2211() {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2212() {
        AbstractC1274.m2236();
        throw null;
    }
}
