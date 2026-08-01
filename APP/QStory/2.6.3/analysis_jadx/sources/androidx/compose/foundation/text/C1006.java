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
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1006 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2948;

    public /* synthetic */ C1006(Object obj, int i, boolean z) {
        this.f2948 = i;
        this.f2947 = obj;
        this.f2946 = z;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2948;
        C1353 c1353 = C1369.f3974;
        final boolean z = this.f2946;
        Object obj4 = this.f2947;
        switch (i) {
            case 0:
                C0998 c0998 = (C0998) obj4;
                InterfaceC1395 interfaceC1395 = c0998.f2925;
                ((Integer) obj3).getClass();
                C1324 c1324 = (C1324) ((InterfaceC1373) obj2);
                c1324.m2392(-2137546592);
                boolean z2 = ((Orientation) ((AbstractC1347) interfaceC1395).getValue()) == Orientation.Vertical || !(c1324.m2383(AbstractC1902.f5582) == LayoutDirection.Rtl);
                boolean zM2360 = c1324.m2360(c0998);
                Object objM2345 = c1324.m2345();
                if (zM2360 || objM2345 == c1353) {
                    objM2345 = new C0972(c0998, 2);
                    c1324.m2386(objM2345);
                }
                InterfaceC1395 interfaceC1395M2479 = AbstractC1367.m2479((InterfaceC6558) objM2345, c1324);
                Object objM23452 = c1324.m2345();
                if (objM23452 == c1353) {
                    C0477 c0477 = new C0477(new C0510(interfaceC1395M2479, 2));
                    c1324.m2386(c0477);
                    objM23452 = c0477;
                }
                InterfaceC0513 interfaceC0513 = (InterfaceC0513) objM23452;
                boolean zM23602 = c1324.m2360(interfaceC0513) | c1324.m2360(c0998);
                Object objM23453 = c1324.m2345();
                if (zM23602 || objM23453 == c1353) {
                    objM23453 = new C1002(interfaceC0513, c0998);
                    c1324.m2386(objM23453);
                }
                InterfaceC2129 interfaceC2129M1258 = AbstractC0498.m1258((C1002) objM23453, (Orientation) ((AbstractC1347) interfaceC1395).getValue(), z && ((AbstractC1349) c0998.f2929).m2434() != 0.0f, z2);
                c1324.m2377(false);
                return interfaceC2129M1258;
            default:
                final InterfaceC6543 interfaceC6543 = (InterfaceC6543) obj4;
                InterfaceC2129 interfaceC2129 = (InterfaceC2129) obj;
                ((Integer) obj3).getClass();
                C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                c13242.m2392(-196777734);
                final long j = ((C0930) c13242.m2383(AbstractC0929.f2638)).f2640;
                boolean zM2361 = c13242.m2361(j) | c13242.m2360(interfaceC6543) | c13242.m2379(z);
                Object objM23454 = c13242.m2345();
                if (zM2361 || objM23454 == c1353) {
                    objM23454 = new InterfaceC6558() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪苏世兰哲
                        @Override // p052.InterfaceC6558
                        public final Object invoke(Object obj5) {
                            C1435 c1435 = (C1435) obj5;
                            final C1610 c1610M1808 = AbstractC0895.m1808(c1435, Float.intBitsToFloat((int) (c1435.f4116.mo2574() >> 32)) / 2.0f);
                            final C1607 c1607 = new C1607(j, 5);
                            final InterfaceC6543 interfaceC65432 = interfaceC6543;
                            final boolean z3 = z;
                            return c1435.m2570(new InterfaceC6558() { // from class: androidx.compose.foundation.text.selection.飘花落叶言子楪世苏哲兰
                                @Override // p052.InterfaceC6558
                                public final Object invoke(Object obj6) {
                                    C1758 c1758 = (C1758) ((InterfaceC1506) obj6);
                                    c1758.m3311();
                                    C1507 c1507 = c1758.f5176;
                                    boolean zBooleanValue = ((Boolean) interfaceC65432.invoke()).booleanValue();
                                    C5176 c5176 = C5176.f14739;
                                    if (!zBooleanValue) {
                                        return c5176;
                                    }
                                    boolean z4 = z3;
                                    C1610 c1610 = c1610M1808;
                                    C1607 c16072 = c1607;
                                    if (!z4) {
                                        c1507.m2713(c1610, c16072);
                                        return c5176;
                                    }
                                    long jMo2708 = c1507.mo2708();
                                    C0108 c0108 = c1507.f4284;
                                    long jM368 = c0108.m368();
                                    c0108.m386().mo2677();
                                    try {
                                        ((C0113) c0108.f319).m433(-1.0f, 1.0f, jMo2708);
                                        c1507.m2713(c1610, c16072);
                                        return c5176;
                                    } finally {
                                        c0108.m386().mo2689();
                                        c0108.m361(jM368);
                                    }
                                }
                            });
                        }
                    };
                    c13242.m2386(objM23454);
                }
                InterfaceC2129 interfaceC2129M2584 = AbstractC1445.m2584(interfaceC2129, (InterfaceC6558) objM23454);
                c13242.m2377(false);
                return interfaceC2129M2584;
        }
    }
}
