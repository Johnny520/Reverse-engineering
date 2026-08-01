package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1196;
import androidx.compose.animation.core.C1203;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1527 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1196 f2262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6249 f2263;

    public C1527() {
        C1203 c1203 = AbstractC1176.f1468;
        Float fValueOf = Float.valueOf(0.0f);
        this.f2262 = AbstractC1176.m1570(c1203, fValueOf, fValueOf);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2046(float f, InterfaceC8725 interfaceC8725, InterfaceC6233 interfaceC6233) {
        if (f <= interfaceC8725.mo1904(1.0f)) {
            return;
        }
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            float fFloatValue = ((Number) ((AbstractC2182) this.f2262.f1544).getValue()).floatValue();
            C6249 c6249 = this.f2263;
            if (c6249 != null) {
                c6249.mo10815(null);
            }
            C1196 c1196 = this.f2262;
            if (c1196.f1543) {
                this.f2262 = AbstractC1176.m1578(c1196, fFloatValue - f, 0.0f, 30);
            } else {
                this.f2262 = new C1196(AbstractC1176.f1468, Float.valueOf(-f), null, 60);
            }
            this.f2263 = AbstractC6231.m11036(interfaceC6233, null, null, new C0075x63fe01d4(this, null), 3);
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
        } catch (Throwable th) {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2047() {
        C6249 c6249 = this.f2263;
        if (c6249 != null) {
            c6249.mo10815(null);
        }
        this.f2262 = new C1196(AbstractC1176.f1468, Float.valueOf(0.0f), null, 60);
    }
}
