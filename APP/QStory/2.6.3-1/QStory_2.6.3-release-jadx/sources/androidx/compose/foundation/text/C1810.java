package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AbstractC1742;
import androidx.compose.foundation.text.selection.C1731;
import androidx.compose.foundation.text.selection.C1753;
import androidx.compose.foundation.text.selection.InterfaceC1756;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.C6008;
import p068.InterfaceC7387;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1810 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3112;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3113;

    public /* synthetic */ C1810(Object obj, int i) {
        this.f3113 = i;
        this.f3112 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f3113;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f3112;
        switch (i) {
            case 0:
                ((InterfaceC2779) obj).mo4150(AbstractC1742.f2903, new C1731(Handle.Cursor, ((InterfaceC1756) obj2).mo2382(), SelectionHandleAnchor.Middle, true));
                return c6008;
            case 1:
                ((InterfaceC1851) obj2).mo2307(((C8158) obj).f19886, C1753.f2945);
                return c6008;
            default:
                C1836 c1836 = (C1836) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float fM2479 = c1836.m2479() + fFloatValue;
                InterfaceC2232 interfaceC2232 = c1836.f3274;
                if (fM2479 > ((AbstractC2184) interfaceC2232).m2994()) {
                    fFloatValue = ((AbstractC2184) interfaceC2232).m2994() - c1836.m2479();
                } else if (fM2479 < 0.0f) {
                    fFloatValue = -c1836.m2479();
                }
                ((AbstractC2184) c1836.f3275).m2995(c1836.m2479() + fFloatValue);
                return Float.valueOf(fFloatValue);
        }
    }
}
