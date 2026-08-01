package androidx.compose.runtime;

import androidx.collection.C0236;
import androidx.collection.C0252;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1389 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0252 f4032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f4033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC6554 f4034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1230 f4035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f4036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1363 f4037;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0236 f4038;

    public C1389(C1363 c1363) {
        this.f4037 = c1363;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2527(boolean z) {
        int i = this.f4036;
        this.f4036 = z ? i | 32 : i & (-33);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2528() {
        C1363 c1363 = this.f4037;
        if (c1363 != null) {
            c1363.f3946 = true;
            c1363.f3953.m445();
        }
        this.f4037 = null;
        this.f4032 = null;
        this.f4038 = null;
        this.f4034 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InvalidationResult m2529(Object obj) {
        InvalidationResult invalidationResultM2460;
        C1363 c1363 = this.f4037;
        return (c1363 == null || (invalidationResultM2460 = c1363.m2460(this, obj)) == null) ? InvalidationResult.IGNORED : invalidationResultM2460;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2530() {
        if (this.f4037 != null) {
            C1230 c1230 = this.f4035;
            if (c1230 != null ? c1230.m2061() : false) {
                return true;
            }
        }
        return false;
    }
}
