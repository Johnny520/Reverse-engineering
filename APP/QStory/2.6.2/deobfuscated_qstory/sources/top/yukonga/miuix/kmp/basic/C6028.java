package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p000.AbstractC6087;
import p116.AbstractC7346;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6028 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4870 f16472 = AbstractC7346.m12513(new C6025(7), new C6023(3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1397 f16473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1397 f16474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f16475;

    public C6028(float f, float f2, float f3) {
        this.f16475 = f;
        this.f16474 = AbstractC1367.m2469(f3);
        this.f16473 = AbstractC1367.m2469(f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11334(float f) {
        ((AbstractC1349) this.f16473).m2425(AbstractC6087.m11419(f, this.f16475, 0.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m11335() {
        return ((AbstractC1349) this.f16473).m2424();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m11336() {
        if (this.f16475 == 0.0f) {
            return 0.0f;
        }
        return m11335() / this.f16475;
    }
}
