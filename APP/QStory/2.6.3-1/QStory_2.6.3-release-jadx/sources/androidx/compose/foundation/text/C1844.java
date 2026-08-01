package androidx.compose.foundation.text;

import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.compose.foundation.gestures.AbstractC1339;
import androidx.compose.foundation.gestures.C1318;
import androidx.compose.foundation.gestures.C1351;
import androidx.compose.foundation.gestures.InterfaceC1354;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.selection.AbstractC1767;
import androidx.compose.foundation.text.selection.C1768;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.draw.C2270;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1844 implements InterfaceC7380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f3291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3293;

    public /* synthetic */ C1844(Object obj, int i, boolean z) {
        this.f3293 = i;
        this.f3292 = obj;
        this.f3291 = z;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f3293;
        C2188 c2188 = C2204.f4319;
        final boolean z = this.f3291;
        Object obj4 = this.f3292;
        switch (i) {
            case 0:
                C1836 c1836 = (C1836) obj4;
                InterfaceC2230 interfaceC2230 = c1836.f3270;
                ((Integer) obj3).getClass();
                C2159 c2159 = (C2159) ((InterfaceC2208) obj2);
                c2159.m2952(-2137546592);
                boolean z2 = ((Orientation) ((AbstractC2182) interfaceC2230).getValue()) == Orientation.Vertical || !(c2159.m2943(AbstractC2737.f5927) == LayoutDirection.Rtl);
                boolean zM2920 = c2159.m2920(c1836);
                Object objM2905 = c2159.m2905();
                if (zM2920 || objM2905 == c2188) {
                    objM2905 = new C1810(c1836, 2);
                    c2159.m2946(objM2905);
                }
                InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039((InterfaceC7387) objM2905, c2159);
                Object objM29052 = c2159.m2905();
                if (objM29052 == c2188) {
                    C1318 c1318 = new C1318(new C1351(interfaceC2230M3039, 2));
                    c2159.m2946(c1318);
                    objM29052 = c1318;
                }
                InterfaceC1354 interfaceC1354 = (InterfaceC1354) objM29052;
                boolean zM29202 = c2159.m2920(interfaceC1354) | c2159.m2920(c1836);
                Object objM29053 = c2159.m2905();
                if (zM29202 || objM29053 == c2188) {
                    objM29053 = new C1840(interfaceC1354, c1836);
                    c2159.m2946(objM29053);
                }
                InterfaceC2962 interfaceC2962M1818 = AbstractC1339.m1818((C1840) objM29053, (Orientation) ((AbstractC2182) interfaceC2230).getValue(), z && ((AbstractC2184) c1836.f3274).m2994() != 0.0f, z2);
                c2159.m2937(false);
                return interfaceC2962M1818;
            default:
                final InterfaceC7372 interfaceC7372 = (InterfaceC7372) obj4;
                InterfaceC2962 interfaceC2962 = (InterfaceC2962) obj;
                ((Integer) obj3).getClass();
                C2159 c21592 = (C2159) ((InterfaceC2208) obj2);
                c21592.m2952(-196777734);
                final long j = ((C1768) c21592.m2943(AbstractC1767.f2983)).f2985;
                boolean zM2921 = c21592.m2921(j) | c21592.m2920(interfaceC7372) | c21592.m2939(z);
                Object objM29054 = c21592.m2905();
                if (zM2921 || objM29054 == c2188) {
                    objM29054 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪苏世兰哲
                        @Override // p068.InterfaceC7387
                        public final Object invoke(Object obj5) {
                            C2270 c2270 = (C2270) obj5;
                            final C2445 c2445M2368 = AbstractC1733.m2368(c2270, Float.intBitsToFloat((int) (c2270.f4461.mo3134() >> 32)) / 2.0f);
                            final C2442 c2442 = new C2442(j, 5);
                            final InterfaceC7372 interfaceC73722 = interfaceC7372;
                            final boolean z3 = z;
                            return c2270.m3130(new InterfaceC7387() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世苏哲兰
                                @Override // p068.InterfaceC7387
                                public final Object invoke(Object obj6) {
                                    C2593 c2593 = (C2593) ((InterfaceC2341) obj6);
                                    c2593.m3871();
                                    C2342 c2342 = c2593.f5521;
                                    boolean zBooleanValue = ((Boolean) interfaceC73722.invoke()).booleanValue();
                                    C6008 c6008 = C6008.f15084;
                                    if (!zBooleanValue) {
                                        return c6008;
                                    }
                                    boolean z4 = z3;
                                    C2445 c2445 = c2445M2368;
                                    C2442 c24422 = c2442;
                                    if (!z4) {
                                        c2342.m3273(c2445, c24422);
                                        return c6008;
                                    }
                                    long jMo3268 = c2342.mo3268();
                                    C0955 c0955 = c2342.f4629;
                                    long jM928 = c0955.m928();
                                    c0955.m946().mo3237();
                                    try {
                                        ((C0960) c0955.f664).m993(-1.0f, 1.0f, jMo3268);
                                        c2342.m3273(c2445, c24422);
                                        return c6008;
                                    } finally {
                                        c0955.m946().mo3249();
                                        c0955.m921(jM928);
                                    }
                                }
                            });
                        }
                    };
                    c21592.m2946(objM29054);
                }
                InterfaceC2962 interfaceC2962M3144 = AbstractC2280.m3144(interfaceC2962, (InterfaceC7387) objM29054);
                c21592.m2937(false);
                return interfaceC2962M3144;
        }
    }
}
