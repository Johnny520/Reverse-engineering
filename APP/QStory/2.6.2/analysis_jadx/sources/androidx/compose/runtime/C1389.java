package androidx.compose.runtime;

import androidx.collection.C0236;
import androidx.collection.C0252;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1389 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0252 f4031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f4032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC6553 f4033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1230 f4034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f4035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1363 f4036;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0236 f4037;

    public C1389(C1363 c1363) {
        this.f4036 = c1363;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2517(boolean z) {
        int i = this.f4035;
        this.f4035 = z ? i | 32 : i & (-33);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2518() {
        C1363 c1363 = this.f4036;
        if (c1363 != null) {
            c1363.f3945 = true;
            c1363.f3952.m442();
        }
        this.f4036 = null;
        this.f4031 = null;
        this.f4037 = null;
        this.f4033 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InvalidationResult m2519(Object obj) {
        InvalidationResult invalidationResultM2450;
        C1363 c1363 = this.f4036;
        return (c1363 == null || (invalidationResultM2450 = c1363.m2450(this, obj)) == null) ? InvalidationResult.IGNORED : invalidationResultM2450;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2520() {
        if (this.f4036 != null) {
            C1230 c1230 = this.f4034;
            if (c1230 != null ? c1230.m2051() : false) {
                return true;
            }
        }
        return false;
    }
}
