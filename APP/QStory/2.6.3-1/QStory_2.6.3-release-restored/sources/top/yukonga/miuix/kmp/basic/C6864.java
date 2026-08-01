package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2232;
import androidx.window.area.AbstractC3400;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p132.AbstractC8176;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6864 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5703 f16826 = AbstractC8176.m13099(new C6861(7), new C6859(3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2232 f16827;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2232 f16828;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f16829;

    public C6864(float f, float f2, float f3) {
        this.f16829 = f;
        this.f16828 = AbstractC2202.m3038(f3);
        this.f16827 = AbstractC2202.m3038(f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11953(float f) {
        ((AbstractC2184) this.f16827).m2995(AbstractC3400.m5631(f, this.f16829, 0.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m11954() {
        return ((AbstractC2184) this.f16827).m2994();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m11955() {
        if (this.f16829 == 0.0f) {
            return 0.0f;
        }
        return m11954() / this.f16829;
    }
}
