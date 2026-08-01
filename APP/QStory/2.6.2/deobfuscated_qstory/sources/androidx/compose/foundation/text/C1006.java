package androidx.compose.foundation.text;

import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.compose.foundation.gestures.AbstractC0498;
import androidx.compose.foundation.gestures.C0477;
import androidx.compose.foundation.gestures.C0510;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.selection.AbstractC0929;
import androidx.compose.foundation.text.selection.C0930;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.draw.C1435;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1006 implements InterfaceC6550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2945;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2947;

    public /* synthetic */ C1006(Object obj, int i, boolean z) {
        this.f2947 = i;
        this.f2946 = obj;
        this.f2945 = z;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2947;
        C1353 c1353 = C1369.f3973;
        final boolean z = this.f2945;
        Object obj4 = this.f2946;
        switch (i) {
            case 0:
                C0998 c0998 = (C0998) obj4;
                InterfaceC1395 interfaceC1395 = c0998.f2924;
                ((Integer) obj3).getClass();
                C1324 c1324 = (C1324) ((InterfaceC1373) obj2);
                c1324.m2382(-2137546592);
                boolean z2 = ((Orientation) ((AbstractC1347) interfaceC1395).getValue()) == Orientation.Vertical || !(c1324.m2373(AbstractC1902.f5581) == LayoutDirection.Rtl);
                boolean zM2350 = c1324.m2350(c0998);
                Object objM2335 = c1324.m2335();
                if (zM2350 || objM2335 == c1353) {
                    objM2335 = new C0972(c0998, 2);
                    c1324.m2376(objM2335);
                }
                InterfaceC1395 interfaceC1395M2463 = AbstractC1367.m2463((InterfaceC6557) objM2335, c1324);
                Object objM23352 = c1324.m2335();
                if (objM23352 == c1353) {
                    C0477 c0477 = new C0477(new C0510(interfaceC1395M2463, 2));
                    c1324.m2376(c0477);
                    objM23352 = c0477;
                }
                InterfaceC0513 interfaceC0513 = (InterfaceC0513) objM23352;
                boolean zM23502 = c1324.m2350(interfaceC0513) | c1324.m2350(c0998);
                Object objM23353 = c1324.m2335();
                if (zM23502 || objM23353 == c1353) {
                    objM23353 = new C1002(interfaceC0513, c0998);
                    c1324.m2376(objM23353);
                }
                InterfaceC2129 interfaceC2129M1248 = AbstractC0498.m1248((C1002) objM23353, (Orientation) ((AbstractC1347) interfaceC1395).getValue(), z && ((AbstractC1349) c0998.f2928).m2424() != 0.0f, z2);
                c1324.m2367(false);
                return interfaceC2129M1248;
            default:
                final InterfaceC6542 interfaceC6542 = (InterfaceC6542) obj4;
                InterfaceC2129 interfaceC2129 = (InterfaceC2129) obj;
                ((Integer) obj3).getClass();
                C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                c13242.m2382(-196777734);
                final long j = ((C0930) c13242.m2373(AbstractC0929.f2637)).f2639;
                boolean zM2351 = c13242.m2351(j) | c13242.m2350(interfaceC6542) | c13242.m2369(z);
                Object objM23354 = c13242.m2335();
                if (zM2351 || objM23354 == c1353) {
                    objM23354 = new InterfaceC6557() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪苏世兰哲
                        @Override // p052.InterfaceC6557
                        public final Object invoke(Object obj5) {
                            C1435 c1435 = (C1435) obj5;
                            final C1610 c1610M1798 = AbstractC0895.m1798(c1435, Float.intBitsToFloat((int) (c1435.f4115.mo2564() >> 32)) / 2.0f);
                            final C1607 c1607 = new C1607(j, 5);
                            final InterfaceC6542 interfaceC65422 = interfaceC6542;
                            final boolean z3 = z;
                            return c1435.m2560(new InterfaceC6557() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世苏哲兰
                                @Override // p052.InterfaceC6557
                                public final Object invoke(Object obj6) {
                                    C1758 c1758 = (C1758) ((InterfaceC1506) obj6);
                                    c1758.m3301();
                                    C1507 c1507 = c1758.f5175;
                                    boolean zBooleanValue = ((Boolean) interfaceC65422.invoke()).booleanValue();
                                    C5175 c5175 = C5175.f14739;
                                    if (!zBooleanValue) {
                                        return c5175;
                                    }
                                    boolean z4 = z3;
                                    C1610 c1610 = c1610M1798;
                                    C1607 c16072 = c1607;
                                    if (!z4) {
                                        c1507.m2703(c1610, c16072);
                                        return c5175;
                                    }
                                    long jMo2698 = c1507.mo2698();
                                    C0108 c0108 = c1507.f4283;
                                    long jM367 = c0108.m367();
                                    c0108.m385().mo2667();
                                    try {
                                        ((C0113) c0108.f319).m432(-1.0f, 1.0f, jMo2698);
                                        c1507.m2703(c1610, c16072);
                                        return c5175;
                                    } finally {
                                        c0108.m385().mo2679();
                                        c0108.m360(jM367);
                                    }
                                }
                            });
                        }
                    };
                    c13242.m2376(objM23354);
                }
                InterfaceC2129 interfaceC2129M2574 = AbstractC1445.m2574(interfaceC2129, (InterfaceC6557) objM23354);
                c13242.m2367(false);
                return interfaceC2129M2574;
        }
    }
}
