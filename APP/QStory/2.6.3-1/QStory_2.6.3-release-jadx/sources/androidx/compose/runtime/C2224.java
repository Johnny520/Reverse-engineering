package androidx.compose.runtime;

import androidx.collection.C1083;
import androidx.collection.C1099;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2224 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1099 f4377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f4378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC7383 f4379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2065 f4380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f4381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2198 f4382;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C1083 f4383;

    public C2224(C2198 c2198) {
        this.f4382 = c2198;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3087(boolean z) {
        int i = this.f4381;
        this.f4381 = z ? i | 32 : i & (-33);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3088() {
        C2198 c2198 = this.f4382;
        if (c2198 != null) {
            c2198.f4291 = true;
            c2198.f4298.m1005();
        }
        this.f4382 = null;
        this.f4377 = null;
        this.f4383 = null;
        this.f4379 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InvalidationResult m3089(Object obj) {
        InvalidationResult invalidationResultM3020;
        C2198 c2198 = this.f4382;
        return (c2198 == null || (invalidationResultM3020 = c2198.m3020(this, obj)) == null) ? InvalidationResult.IGNORED : invalidationResultM3020;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m3090() {
        if (this.f4382 != null) {
            C2065 c2065 = this.f4380;
            if (c2065 != null ? c2065.m2621() : false) {
                return true;
            }
        }
        return false;
    }
}
