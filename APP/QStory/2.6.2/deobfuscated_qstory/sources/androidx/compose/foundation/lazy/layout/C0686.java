package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0350;
import androidx.compose.animation.core.C0357;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6557;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0350 f1916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5416 f1917;

    public C0686() {
        C0357 c0357 = AbstractC0330.f1123;
        Float fValueOf = Float.valueOf(0.0f);
        this.f1916 = AbstractC0330.m1009(c0357, fValueOf, fValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1476(float f, InterfaceC7895 interfaceC7895, InterfaceC5400 interfaceC5400) {
        if (f <= interfaceC7895.mo1334(1.0f)) {
            return;
        }
        AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
        AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
        try {
            float fFloatValue = ((Number) ((AbstractC1347) this.f1916.f1199).getValue()).floatValue();
            C5416 c5416 = this.f1917;
            if (c5416 != null) {
                c5416.mo10252(null);
            }
            C0350 c0350 = this.f1916;
            if (c0350.f1198) {
                this.f1916 = AbstractC0330.m1017(c0350, fFloatValue - f, 0.0f, 30);
            } else {
                this.f1916 = new C0350(AbstractC0330.f1123, Float.valueOf(-f), null, 60);
            }
            this.f1917 = AbstractC5398.m10473(interfaceC5400, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3);
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
        } catch (Throwable th) {
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1477() {
        C5416 c5416 = this.f1917;
        if (c5416 != null) {
            c5416.mo10252(null);
        }
        this.f1916 = new C0350(AbstractC0330.f1123, Float.valueOf(0.0f), null, 60);
    }
}
