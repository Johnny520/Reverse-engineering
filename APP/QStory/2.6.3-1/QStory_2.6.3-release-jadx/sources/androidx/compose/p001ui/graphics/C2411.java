package androidx.compose.p001ui.graphics;

import p128.C8156;
import p128.C8157;
import p267.AbstractC9004;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2411 extends AbstractC2416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8156 f5001;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2449 f5002;

    public C2411(C8156 c8156) {
        C2449 c2449M3517;
        this.f5001 = c8156;
        if (AbstractC9004.m14197(c8156)) {
            c2449M3517 = null;
        } else {
            c2449M3517 = AbstractC2438.m3517();
            C2449.m3537(c2449M3517, c8156);
        }
        this.f5002 = c2449M3517;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2411) {
            return this.f5001.equals(((C2411) obj).f5001);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5001.hashCode();
    }

    @Override // androidx.compose.p001ui.graphics.AbstractC2416
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C8157 mo3429() {
        C8156 c8156 = this.f5001;
        return new C8157(c8156.f19878, c8156.f19877, c8156.f19876, c8156.f19875);
    }
}
