package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0350;
import androidx.compose.animation.core.C0357;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0350 f1917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5417 f1918;

    public C0686() {
        C0357 c0357 = AbstractC0330.f1123;
        Float fValueOf = Float.valueOf(0.0f);
        this.f1917 = AbstractC0330.m1010(c0357, fValueOf, fValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1486(float f, InterfaceC7896 interfaceC7896, InterfaceC5401 interfaceC5401) {
        if (f <= interfaceC7896.mo1344(1.0f)) {
            return;
        }
        AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
        InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
        AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
        try {
            float fFloatValue = ((Number) ((AbstractC1347) this.f1917.f1199).getValue()).floatValue();
            C5417 c5417 = this.f1918;
            if (c5417 != null) {
                c5417.mo10256(null);
            }
            C0350 c0350 = this.f1917;
            if (c0350.f1198) {
                this.f1917 = AbstractC0330.m1018(c0350, fFloatValue - f, 0.0f, 30);
            } else {
                this.f1917 = new C0350(AbstractC0330.f1123, Float.valueOf(-f), null, 60);
            }
            this.f1918 = AbstractC5399.m10477(interfaceC5401, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3);
            AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
        } catch (Throwable th) {
            AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1487() {
        C5417 c5417 = this.f1918;
        if (c5417 != null) {
            c5417.mo10256(null);
        }
        this.f1917 = new C0350(AbstractC0330.f1123, Float.valueOf(0.0f), null, 60);
    }
}
