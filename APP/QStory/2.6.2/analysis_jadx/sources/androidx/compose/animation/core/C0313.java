package androidx.compose.animation.core;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0313 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC0335 f1051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Float f1052;

    public C0313(Float f, InterfaceC0335 interfaceC0335) {
        this.f1052 = f;
        this.f1051 = interfaceC0335;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0313)) {
            return false;
        }
        C0313 c0313 = (C0313) obj;
        return c0313.f1052.equals(this.f1052) && AbstractC4394.m8917(c0313.f1051, this.f1051);
    }

    public final int hashCode() {
        return this.f1051.hashCode() + AbstractC0053.m143(0, this.f1052.hashCode() * 31, 31);
    }
}
