package androidx.compose.foundation;

import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.collection.AbstractC1117;
import androidx.collection.C1094;
import androidx.compose.foundation.gestures.C1382;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1474;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.layout.C1433;
import androidx.compose.foundation.layout.C1477;
import androidx.compose.foundation.layout.C1479;
import androidx.compose.foundation.layout.InterfaceC1491;
import androidx.compose.foundation.layout.InterfaceC1505;
import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.lazy.C1586;
import androidx.compose.foundation.lazy.C1589;
import androidx.compose.foundation.lazy.C1590;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.foundation.lazy.C1595;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.lazy.C1598;
import androidx.compose.foundation.lazy.C1599;
import androidx.compose.foundation.lazy.C1603;
import androidx.compose.foundation.lazy.layout.AbstractC1563;
import androidx.compose.foundation.lazy.layout.C1524;
import androidx.compose.foundation.lazy.layout.C1531;
import androidx.compose.foundation.lazy.layout.C1532;
import androidx.compose.foundation.lazy.layout.C1540;
import androidx.compose.foundation.lazy.layout.C1542;
import androidx.compose.foundation.lazy.layout.C1551;
import androidx.compose.foundation.lazy.layout.C1552;
import androidx.compose.foundation.lazy.layout.C1553;
import androidx.compose.foundation.lazy.layout.C1562;
import androidx.compose.foundation.lazy.layout.C1564;
import androidx.compose.foundation.lazy.layout.C1565;
import androidx.compose.material3.AbstractC1996;
import androidx.compose.material3.AbstractC2003;
import androidx.compose.material3.C2027;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2550;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2155;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2176;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2205;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2233;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2086;
import androidx.compose.runtime.internal.C2088;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5168;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5183;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.InterfaceC6233;
import p025.C7003;
import p064.C7348;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p103.C7897;
import p104.AbstractC8005;
import p104.C7981;
import p192.AbstractC8570;
import p193.C8573;
import p193.C8575;
import p221.AbstractC8726;
import p221.C8727;
import p221.C8735;
import p233.AbstractC8798;
import p252.C8945;
import p273.C9027;
import p273.C9037;
import p303.AbstractC9234;
import p345.AbstractC9594;
import p358.C9646;
import top.suzhelan.plugin.sdk.online.presenter.C6637;
import top.suzhelan.qstory.p015ui.components.AbstractC6799;
import top.yukonga.miuix.kmp.basic.C6837;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1898 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3494;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3495;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3496;

    public /* synthetic */ C1898(int i, int i2, Object obj, Object obj2) {
        this.f3496 = i2;
        this.f3494 = obj;
        this.f3495 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07bd A[LOOP:6: B:302:0x07bd->B:309:0x07dc, LOOP_START, PHI: r4 r8
  0x07bd: PHI (r4v55 java.util.List) = (r4v20 java.util.List), (r4v56 java.util.List) binds: [B:301:0x07bb, B:309:0x07dc] A[DONT_GENERATE, DONT_INLINE]
  0x07bd: PHI (r8v69 int) = (r8v24 int), (r8v73 int) binds: [B:301:0x07bb, B:309:0x07dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07eb A[LOOP:7: B:313:0x07e9->B:314:0x07eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x088c A[LOOP:10: B:339:0x088a->B:340:0x088c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0b90  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0c18  */
    @Override // p068.InterfaceC7383
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Object obj3;
        C1532 c1532;
        InterfaceC7387 interfaceC7387Mo2763;
        int i2;
        int i3;
        int i4;
        C7348 c7348;
        List list;
        C1582 c1582;
        long j;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        float f2;
        float f3;
        C1590 c1590;
        int size;
        float f4;
        int i9;
        int i10;
        int iMax;
        int i11;
        int i12;
        List arrayList;
        int size2;
        int size3;
        int i13;
        int iMin;
        int i14;
        int i15;
        float f5;
        List arrayList2;
        int size4;
        int i16;
        int size5;
        int i17;
        boolean z;
        boolean z2;
        C1532 c15322;
        ArrayList arrayList3;
        int i18;
        C1595 c1595;
        C1553 c1553;
        C1603 c1603;
        boolean z3;
        boolean z4;
        C1590 c15902;
        int i19;
        List list2;
        Integer numValueOf;
        Integer numValueOf2;
        int i20;
        InterfaceC2550 interfaceC2550;
        List list3;
        C1598 c1598;
        int i21;
        C1094 c1094;
        int[] iArr;
        int i22;
        int i23;
        int iM2123;
        Object obj4;
        int i24;
        int i25;
        int i26;
        int iMax2;
        int i27;
        int iM1416;
        int i28 = this.f3496;
        C2958 c2958 = C2958.f6621;
        C6008 c6008 = C6008.f15084;
        int i29 = 1;
        Object obj5 = this.f3495;
        Object obj6 = this.f3494;
        switch (i28) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1910.m2544((InterfaceC2962) obj6, (InterfaceC7387) obj5, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 1:
                C1552 c1552 = (C1552) obj6;
                C1551 c1551 = (C1551) obj5;
                Object obj7 = c1551.f2348;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1603 c16032 = (C1603) c1552.f2350.invoke();
                    int iM2035 = c1551.f2346;
                    if (iM2035 >= c16032.m2131() || !c16032.m2130(iM2035).equals(obj7)) {
                        iM2035 = c16032.f2571.m2035(obj7);
                        i = -1;
                        if (iM2035 != -1) {
                            c1551.f2346 = iM2035;
                        }
                    } else {
                        i = -1;
                    }
                    int i30 = iM2035;
                    if (i30 != i) {
                        c2159.m2952(-1664741271);
                        AbstractC1563.m2078(c16032, c1552.f2351, i30, obj7, c2159, 0);
                        c2159.m2937(false);
                    } else {
                        c2159.m2952(-1664505826);
                        c2159.m2937(false);
                    }
                    boolean zM2938 = c2159.m2938(c1551);
                    Object objM2905 = c2159.m2905();
                    if (zM2938 || objM2905 == C2204.f4319) {
                        objM2905 = new C1564(c1551, 1);
                        c2159.m2946(objM2905);
                    }
                    AbstractC2202.m3044(obj7, (InterfaceC7387) objM2905, c2159);
                } else {
                    c2159.m2899();
                }
                return c6008;
            case 2:
                boolean zM13916 = C8735.m13916(0L, 0L);
                C1599 c1599 = (C1599) obj5;
                InterfaceC2550 interfaceC25502 = (InterfaceC2550) obj;
                C1532 c15323 = new C1532((C1552) obj6, interfaceC25502);
                long j2 = ((C8727) obj2).f22210;
                c1599.getClass();
                InterfaceC1491 interfaceC1491 = c1599.f2564;
                InterfaceC1505 interfaceC1505 = c1599.f2566;
                C1582 c15822 = c1599.f2567;
                c15822.f2455.getValue();
                boolean z5 = c15822.f2453 || interfaceC25502.mo2057();
                AbstractC1910.m2539(j2, Orientation.Vertical);
                int iMo1903 = interfaceC25502.mo1903(interfaceC1505.mo2023(interfaceC25502.getLayoutDirection()));
                int iMo19032 = interfaceC25502.mo1903(interfaceC1505.mo2022(interfaceC25502.getLayoutDirection()));
                int iMo19033 = interfaceC25502.mo1903(interfaceC1505.mo2021());
                int iMo19034 = interfaceC25502.mo1903(interfaceC1505.mo2024()) + iMo19033;
                int i31 = iMo19032 + iMo1903;
                int i32 = iMo19034 - iMo19033;
                long jM13888 = AbstractC8726.m13888(-i31, -iMo19034, j2);
                C1603 c16033 = (C1603) c1599.f2565.invoke();
                C1586 c1586 = c16033.f2572;
                int iM13896 = C8727.m13896(jM13888);
                int iM13897 = C8727.m13897(jM13888);
                ((AbstractC2181) c1586.f2479).m2993(iM13896);
                ((AbstractC2181) c1586.f2478).m2993(iM13897);
                if (interfaceC1491 != null) {
                    int iMo19035 = interfaceC25502.mo1903(interfaceC1491.mo2015());
                    int iM2131 = c16033.m2131();
                    int iM138972 = C8727.m13897(j2) - iMo19034;
                    C1595 c15952 = new C1595(jM13888, c16033, c15323, iM2131, iMo19035, c1599.f2568, iMo19033, i32, (((long) iMo1903) << 32) | (((long) iMo19033) & 4294967295L), c1599.f2567);
                    AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
                    if (abstractC2121M2791 != null) {
                        c1532 = c15323;
                        interfaceC7387Mo2763 = abstractC2121M2791.mo2763();
                    } else {
                        c1532 = c15323;
                        interfaceC7387Mo2763 = null;
                    }
                    AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
                    try {
                        C1589 c1589 = c15822.f2450;
                        int iM2120 = c1589.m2120();
                        int iM2087 = AbstractC1563.m2087(iM2120, c16033, c1589.f2498);
                        if (iM2120 != iM2087) {
                            i2 = iMo19033;
                            ((AbstractC2181) ((InterfaceC2233) c1589.f2500)).m2993(iM2087);
                            ((C1531) c1589.f2497).m2054(iM2120);
                        } else {
                            i2 = iMo19033;
                        }
                        int iM2118 = c1589.m2118();
                        AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                        C1540 c1540 = c15822.f2456;
                        C1382 c1382 = c15822.f2466;
                        C2059 c2059 = c1382.f1912;
                        if ((c2059.f3865 != 0) || !c1540.f2310.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList();
                            if (c1382.f1912.f3865 != 0) {
                                int i33 = c2059.f3865;
                                if (i33 != 0) {
                                    i3 = iM2118;
                                    Object[] objArr = c2059.f3866;
                                    int i34 = ((C1565) objArr[0]).f2380;
                                    i4 = iM2087;
                                    int i35 = 0;
                                    while (i35 < i33) {
                                        int i36 = i33;
                                        int i37 = ((C1565) objArr[i35]).f2380;
                                        if (i37 < i34) {
                                            i34 = i37;
                                        }
                                        i35++;
                                        i33 = i36;
                                    }
                                    if (i34 < 0) {
                                        AbstractC8570.m13656("negative minIndex");
                                    }
                                    int i38 = c2059.f3865;
                                    if (i38 != 0) {
                                        Object[] objArr2 = c2059.f3866;
                                        int i39 = ((C1565) objArr2[0]).f2379;
                                        int i40 = 0;
                                        while (i40 < i38) {
                                            int i41 = i40;
                                            int i42 = ((C1565) objArr2[i40]).f2379;
                                            if (i42 > i39) {
                                                i39 = i42;
                                            }
                                            i40 = i41 + 1;
                                        }
                                        c7348 = new C7348(i34, Math.min(i39, c16033.m2131() - 1), 1);
                                    } else {
                                        C5043.m9176("MutableVector is empty.");
                                    }
                                } else {
                                    C5043.m9176("MutableVector is empty.");
                                }
                                return null;
                            }
                            i3 = iM2118;
                            i4 = iM2087;
                            c7348 = C7348.f18172;
                            int size6 = c1540.f2310.size();
                            int i43 = 0;
                            while (i43 < size6) {
                                C1542 c1542 = (C1542) c1540.get(i43);
                                int iM20872 = AbstractC1563.m2087(c1542.f2319, c16033, c1542.f2321);
                                int i44 = c7348.f18163;
                                C1540 c15402 = c1540;
                                if ((iM20872 > c7348.f18161 || i44 > iM20872) && iM20872 >= 0 && iM20872 < c16033.m2131()) {
                                    arrayList4.add(Integer.valueOf(iM20872));
                                }
                                i43++;
                                c1540 = c15402;
                            }
                            int i45 = c7348.f18163;
                            int i46 = c7348.f18161;
                            if (i45 <= i46) {
                                while (true) {
                                    arrayList4.add(Integer.valueOf(i45));
                                    if (i45 != i46) {
                                        i45++;
                                    }
                                }
                            }
                            list = arrayList4;
                        } else {
                            list = EmptyList.INSTANCE;
                            i3 = iM2118;
                            i4 = iM2087;
                        }
                        float fFloatValue = (interfaceC25502.mo2057() || !z5) ? c15822.f2467 : ((Number) ((AbstractC2182) c15822.f2458.f2262.f1544).getValue()).floatValue();
                        C1553 c15532 = c15822.f2465;
                        boolean zMo2057 = interfaceC25502.mo2057();
                        InterfaceC6233 interfaceC6233 = c1599.f2563;
                        InterfaceC2230 interfaceC2230 = c15822.f2457;
                        C1562 c1562 = c1599.f2562;
                        boolean z6 = c15822.f2471;
                        if (i2 < 0) {
                            AbstractC8570.m13656("invalid beforeContentPadding");
                        }
                        if (i32 < 0) {
                            AbstractC8570.m13656("invalid afterContentPadding");
                        }
                        C1603 c16034 = c15952.f2529;
                        if (iM2131 <= 0) {
                            int iM13900 = C8727.m13900(jM13888);
                            int iM13899 = C8727.m13899(jM13888);
                            c15532.m2071(iM13900, iM13899, new ArrayList(), c16034.f2571, c15952, zMo2057, z5, 0, 0);
                            if (!zMo2057) {
                                c15532.m2072();
                                if (!zM13916) {
                                    iM13900 = AbstractC8726.m13886(0, jM13888);
                                    iM13899 = AbstractC8726.m13879(0, jM13888);
                                }
                            }
                            c1598 = new C1598(null, 0, false, 0.0f, interfaceC25502.mo2055(AbstractC8726.m13886(iM13900 + i31, j2), AbstractC8726.m13879(iM13899 + iMo19034, j2), AbstractC5171.m9335(), new C1915(2)), 0.0f, false, interfaceC6233, c1532, c15952.f2527, EmptyList.INSTANCE, -i2, iM138972 + i32, 0, Orientation.Vertical, i32, iMo19035);
                            c1582 = c15822;
                            interfaceC2550 = interfaceC25502;
                        } else {
                            float f6 = fFloatValue;
                            boolean z7 = z5;
                            C1532 c15324 = c1532;
                            int i47 = iM2131;
                            int i48 = i2;
                            int i49 = i4;
                            if (i49 >= i47) {
                                i49 = i47 - 1;
                                i3 = 0;
                            }
                            int iRound = Math.round(f6);
                            int i50 = i3 - iRound;
                            if (i49 == 0 && i50 < 0) {
                                iRound += i50;
                                i50 = 0;
                            }
                            int i51 = i49;
                            C5183 c5183 = new C5183();
                            int i52 = -i48;
                            int i53 = i52 + (iMo19035 < 0 ? iMo19035 : 0);
                            c1582 = c15822;
                            int i54 = i50 + i53;
                            int iMax3 = 0;
                            while (true) {
                                j = c15952.f2527;
                                if (i54 < 0 && i51 > 0) {
                                    InterfaceC2230 interfaceC22302 = interfaceC2230;
                                    int i55 = i51 - 1;
                                    C1590 c1590M2124 = c15952.m2124(i55, j);
                                    c5183.add(0, c1590M2124);
                                    iMax3 = Math.max(iMax3, c1590M2124.f2509);
                                    i54 += c1590M2124.f2515;
                                    i51 = i55;
                                    interfaceC2230 = interfaceC22302;
                                }
                            }
                            InterfaceC2230 interfaceC22303 = interfaceC2230;
                            if (i54 < i53) {
                                iRound -= i53 - i54;
                                i54 = i53;
                            }
                            int i56 = iRound;
                            int i57 = i54 - i53;
                            obj3 = null;
                            int i58 = iM138972 + i32;
                            int i59 = iMax3;
                            int i60 = i58 < 0 ? 0 : i58;
                            int i61 = i52;
                            int i62 = -i57;
                            int i63 = i57;
                            int i64 = i51;
                            int i65 = 0;
                            boolean z8 = false;
                            while (i65 < c5183.size()) {
                                if (i62 >= i60) {
                                    c5183.remove(i65);
                                    z8 = true;
                                } else {
                                    i64++;
                                    i62 += ((C1590) c5183.get(i65)).f2515;
                                    i65++;
                                }
                            }
                            int iMax4 = i59;
                            int i66 = i64;
                            boolean z9 = z8;
                            while (i66 < i47 && (i62 < i60 || i62 <= 0 || c5183.isEmpty())) {
                                int i67 = i60;
                                C1590 c1590M21242 = c15952.m2124(i66, j);
                                int i68 = i47;
                                int i69 = c1590M21242.f2515;
                                i62 += i69;
                                if (i62 > i53 || i66 == i68 - 1) {
                                    iMax4 = Math.max(iMax4, c1590M21242.f2509);
                                    c5183.addLast(c1590M21242);
                                } else {
                                    i63 -= i69;
                                    i51 = i66 + 1;
                                    z9 = true;
                                }
                                i66++;
                                i60 = i67;
                                i47 = i68;
                            }
                            int i70 = i47;
                            if (i62 < iM138972) {
                                int i71 = iM138972 - i62;
                                int i72 = i62 + i71;
                                int i73 = i63 - i71;
                                while (i73 < i48 && i51 > 0) {
                                    int i74 = i71;
                                    int i75 = i51 - 1;
                                    int i76 = i72;
                                    C1590 c1590M21243 = c15952.m2124(i75, j);
                                    i51 = i75;
                                    c5183.add(0, c1590M21243);
                                    iMax4 = Math.max(iMax4, c1590M21243.f2509);
                                    i73 += c1590M21243.f2515;
                                    i71 = i74;
                                    i72 = i76;
                                }
                                int i77 = i72;
                                i6 = i56 + i71;
                                if (i73 < 0) {
                                    i6 += i73;
                                    i62 = i77 + i73;
                                    i5 = iMax4;
                                    i8 = i51;
                                    i7 = 0;
                                    int i78 = i66;
                                    float f7 = (Integer.signum(Math.round(f6)) == Integer.signum(i6) || Math.abs(Math.round(f6)) < Math.abs(i6)) ? f6 : i6;
                                    f = f6 - f7;
                                    f2 = 0.0f;
                                    if (zMo2057 && i6 > i56 && f <= 0.0f) {
                                        f2 = (i6 - i56) + f;
                                    }
                                    f3 = f2;
                                    if (i7 < 0) {
                                        AbstractC8570.m13656("negative currentFirstItemScrollOffset");
                                    }
                                    int i79 = -i7;
                                    c1590 = (C1590) c5183.first();
                                    if (i48 <= 0 || iMo19035 < 0) {
                                        int i80 = i7;
                                        size = c5183.size();
                                        C1590 c15903 = c1590;
                                        int i81 = i80;
                                        f4 = f3;
                                        i9 = 0;
                                        while (i9 < size) {
                                            int i82 = size;
                                            int i83 = ((C1590) c5183.get(i9)).f2515;
                                            if (i81 == 0 || i83 > i81 || i9 == c5183.size() - 1) {
                                                C1590 c15904 = c15903;
                                                i10 = i81;
                                                c1590 = c15904;
                                            } else {
                                                i81 -= i83;
                                                i9++;
                                                c15903 = (C1590) c5183.get(i9);
                                                size = i82;
                                            }
                                        }
                                        C1590 c159042 = c15903;
                                        i10 = i81;
                                        c1590 = c159042;
                                    } else {
                                        i10 = i7;
                                        f4 = f3;
                                    }
                                    iMax = Math.max(0, i8);
                                    i11 = i8 - 1;
                                    if (iMax > i11) {
                                        arrayList = null;
                                        while (true) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            i12 = i79;
                                            arrayList.add(c15952.m2124(i11, j));
                                            if (i11 != iMax) {
                                                i11--;
                                                i79 = i12;
                                            }
                                        }
                                    } else {
                                        i12 = i79;
                                        arrayList = null;
                                    }
                                    size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i84 = size2 - 1;
                                            int iIntValue2 = ((Number) list.get(size2)).intValue();
                                            if (iIntValue2 < iMax) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(c15952.m2124(iIntValue2, j));
                                            }
                                            if (i84 >= 0) {
                                                size2 = i84;
                                            }
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = EmptyList.INSTANCE;
                                    }
                                    int iMax5 = i5;
                                    i13 = 0;
                                    for (size3 = arrayList.size(); i13 < size3; size3 = size3) {
                                        iMax5 = Math.max(iMax5, ((C1590) arrayList.get(i13)).f2509);
                                        i13++;
                                    }
                                    iMin = Math.min(((C1590) AbstractC5176.m9367(c5183)).f2507, i70 - 1);
                                    i14 = ((C1590) AbstractC5176.m9367(c5183)).f2507 + 1;
                                    if (i14 > iMin) {
                                        List arrayList5 = null;
                                        while (true) {
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            i15 = iMax5;
                                            f5 = f7;
                                            arrayList2 = arrayList5;
                                            arrayList2.add(c15952.m2124(i14, j));
                                            if (i14 != iMin) {
                                                i14++;
                                                arrayList5 = arrayList2;
                                                iMax5 = i15;
                                                f7 = f5;
                                            }
                                        }
                                    } else {
                                        i15 = iMax5;
                                        f5 = f7;
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 != null && ((C1590) AbstractC5176.m9367(arrayList2)).f2507 > iMin) {
                                        iMin = ((C1590) AbstractC5176.m9367(arrayList2)).f2507;
                                    }
                                    size4 = list.size();
                                    i16 = 0;
                                    while (i16 < size4) {
                                        List list4 = list;
                                        int iIntValue3 = ((Number) list.get(i16)).intValue();
                                        if (iIntValue3 > iMin) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(c15952.m2124(iIntValue3, j));
                                        }
                                        i16++;
                                        list = list4;
                                    }
                                    if (arrayList2 == null) {
                                        arrayList2 = EmptyList.INSTANCE;
                                    }
                                    size5 = arrayList2.size();
                                    int iMax6 = i15;
                                    for (i17 = 0; i17 < size5; i17++) {
                                        iMax6 = Math.max(iMax6, ((C1590) arrayList2.get(i17)).f2509);
                                    }
                                    boolean z10 = !AbstractC5227.m9466(c1590, c5183.first()) && arrayList.isEmpty() && arrayList2.isEmpty();
                                    int iM13886 = AbstractC8726.m13886(iMax6, jM13888);
                                    int iM13879 = AbstractC8726.m13879(i62, jM13888);
                                    z = i62 >= Math.min(iM13879, iM138972);
                                    if (z && i12 != 0) {
                                        AbstractC8570.m13654("non-zero itemsScrollOffset");
                                    }
                                    z2 = z10;
                                    ArrayList arrayList6 = new ArrayList(arrayList2.size() + arrayList.size() + c5183.size());
                                    if (z) {
                                        c15322 = c15324;
                                        int size7 = arrayList.size();
                                        int i85 = i12;
                                        int i86 = 0;
                                        while (i86 < size7) {
                                            int i87 = size7;
                                            C1590 c15905 = (C1590) arrayList.get(i86);
                                            i85 -= c15905.f2515;
                                            c15905.m2121(i85, iM13886, iM13879);
                                            arrayList6.add(c15905);
                                            i86++;
                                            size7 = i87;
                                            arrayList = arrayList;
                                        }
                                        int size8 = c5183.size();
                                        int i88 = i12;
                                        for (int i89 = 0; i89 < size8; i89++) {
                                            C1590 c15906 = (C1590) c5183.get(i89);
                                            c15906.m2121(i88, iM13886, iM13879);
                                            arrayList6.add(c15906);
                                            i88 += c15906.f2515;
                                        }
                                        int size9 = arrayList2.size();
                                        for (int i90 = 0; i90 < size9; i90++) {
                                            C1590 c15907 = (C1590) arrayList2.get(i90);
                                            c15907.m2121(i88, iM13886, iM13879);
                                            arrayList6.add(c15907);
                                            i88 += c15907.f2515;
                                        }
                                    } else {
                                        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                                            AbstractC8570.m13656("no extra items");
                                        }
                                        int size10 = c5183.size();
                                        int[] iArr2 = new int[size10];
                                        for (int i91 = 0; i91 < size10; i91++) {
                                            iArr2[i91] = ((C1590) c5183.get(i91)).f2514;
                                        }
                                        int[] iArr3 = new int[size10];
                                        if (interfaceC1491 != null) {
                                            interfaceC1491.mo1980(iM13879, c15324, iArr2, iArr3);
                                            c15322 = c15324;
                                            C7348 c73482 = new C7348(0, size10 - 1, 1);
                                            int i92 = c73482.f18161;
                                            int i93 = c73482.f18162;
                                            if ((i93 > 0 && i92 >= 0) || (i93 < 0 && i92 <= 0)) {
                                                int i94 = 0;
                                                while (true) {
                                                    int i95 = iArr3[i94];
                                                    int i96 = i93;
                                                    C1590 c15908 = (C1590) c5183.get(i94);
                                                    c15908.m2121(i95, iM13886, iM13879);
                                                    arrayList6.add(c15908);
                                                    if (i94 != i92) {
                                                        i94 += i96;
                                                        i93 = i96;
                                                    }
                                                }
                                            }
                                        } else {
                                            AbstractC8570.m13655("null verticalArrangement when isVertical == true");
                                            C5043.m9161();
                                        }
                                    }
                                    if (z6) {
                                        c1603 = c16034;
                                        i18 = i10;
                                        c1553 = c15532;
                                        c1553.m2071(iM13886, iM13879, arrayList6, c1603.f2571, c15952, zMo2057, z7, i18, i62);
                                        arrayList3 = arrayList6;
                                        c1595 = c15952;
                                    } else {
                                        arrayList3 = arrayList6;
                                        i18 = i10;
                                        c1595 = c15952;
                                        c1553 = c15532;
                                        c1603 = c16034;
                                    }
                                    z3 = zMo2057;
                                    if (!z3) {
                                        c1553.m2072();
                                        if (!zM13916) {
                                            iM13886 = AbstractC8726.m13886(Math.max(iM13886, 0), jM13888);
                                            int iM138792 = AbstractC8726.m13879(Math.max(iM13879, 0), jM13888);
                                            if (iM138792 != iM13879) {
                                                int size11 = arrayList3.size();
                                                for (int i97 = 0; i97 < size11; i97++) {
                                                    ((C1590) arrayList3.get(i97)).f2510 = iM138792;
                                                }
                                            }
                                            iM13879 = iM138792;
                                        }
                                    }
                                    C1590 c15909 = (C1590) (!c5183.isEmpty() ? null : c5183.f13278[c5183.f13280]);
                                    int i98 = c15909 == null ? c15909.f2507 : 0;
                                    C1590 c159010 = (C1590) c5183.m9416();
                                    int i99 = c159010 == null ? c159010.f2507 : 0;
                                    c1603.f2573.getClass();
                                    C1094 c10942 = AbstractC1117.f1320;
                                    if (c1562 != null || arrayList3.isEmpty() || (i21 = c10942.f1330) == 0) {
                                        z4 = z3;
                                        c15902 = c1590;
                                        i19 = i61;
                                        list2 = EmptyList.INSTANCE;
                                    } else {
                                        if (i99 - i98 < 0 || i21 == 0) {
                                            c15902 = c1590;
                                            c1094 = c10942;
                                        } else {
                                            C7348 c7348M5627 = AbstractC3400.m5627(0, i21);
                                            int i100 = c7348M5627.f18163;
                                            int i101 = c7348M5627.f18161;
                                            c15902 = c1590;
                                            if (i100 <= i101) {
                                                iM1416 = -1;
                                                while (c10942.m1416(i100) <= i98) {
                                                    iM1416 = c10942.m1416(i100);
                                                    if (i100 != i101) {
                                                        i100++;
                                                    } else {
                                                        i27 = -1;
                                                    }
                                                }
                                                i27 = -1;
                                            } else {
                                                i27 = -1;
                                                iM1416 = -1;
                                            }
                                            if (iM1416 == i27) {
                                                c1094 = AbstractC1117.f1320;
                                            } else {
                                                c1094 = new C1094(1);
                                                c1094.m1355(iM1416);
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        ArrayList arrayList8 = new ArrayList(arrayList3.size());
                                        int size12 = arrayList3.size();
                                        int i102 = 0;
                                        while (i102 < size12) {
                                            int i103 = size12;
                                            Object obj8 = arrayList3.get(i102);
                                            int i104 = i102;
                                            int i105 = ((C1590) obj8).f2507;
                                            boolean z11 = z3;
                                            int[] iArr4 = c10942.f1331;
                                            int i106 = c10942.f1330;
                                            C1094 c10943 = c10942;
                                            int i107 = 0;
                                            while (true) {
                                                if (i107 < i106) {
                                                    int i108 = i107;
                                                    if (iArr4[i108] == i105) {
                                                        arrayList8.add(obj8);
                                                    } else {
                                                        i107 = i108 + 1;
                                                    }
                                                }
                                            }
                                            i102 = i104 + 1;
                                            size12 = i103;
                                            c10942 = c10943;
                                            z3 = z11;
                                        }
                                        z4 = z3;
                                        int[] iArr5 = c1094.f1331;
                                        int i109 = c1094.f1330;
                                        int i110 = 0;
                                        while (i110 < i109) {
                                            int i111 = iArr5[i110];
                                            Iterator it = arrayList3.iterator();
                                            int i112 = 0;
                                            while (true) {
                                                if (it.hasNext()) {
                                                    iArr = iArr5;
                                                    if (((C1590) it.next()).f2507 == i111) {
                                                        i22 = i112;
                                                    } else {
                                                        i112++;
                                                        iArr5 = iArr;
                                                    }
                                                } else {
                                                    iArr = iArr5;
                                                    i22 = -1;
                                                }
                                            }
                                            C1590 c1590M21244 = i22 == -1 ? c1595.m2124(i111, j) : (C1590) arrayList3.remove(i22);
                                            long j3 = j;
                                            int i113 = c1590M21244.f2515;
                                            if (i22 == -1) {
                                                i23 = i113;
                                                iM2123 = Integer.MIN_VALUE;
                                            } else {
                                                i23 = i113;
                                                iM2123 = (int) (c1590M21244.m2123(0) & 4294967295L);
                                            }
                                            int size13 = arrayList8.size();
                                            int i114 = i23;
                                            int i115 = 0;
                                            while (true) {
                                                if (i115 < size13) {
                                                    obj4 = arrayList8.get(i115);
                                                    int i116 = size13;
                                                    if (((C1590) obj4).f2507 == i111) {
                                                        i115++;
                                                        size13 = i116;
                                                    }
                                                } else {
                                                    obj4 = null;
                                                }
                                            }
                                            C1590 c159011 = (C1590) obj4;
                                            if (c159011 != null) {
                                                long jM2123 = c159011.m2123(0);
                                                i24 = i109;
                                                i25 = (int) (jM2123 & 4294967295L);
                                            } else {
                                                i24 = i109;
                                                i25 = Integer.MIN_VALUE;
                                            }
                                            if (iM2123 == Integer.MIN_VALUE) {
                                                iMax2 = i61;
                                                i26 = iMax2;
                                            } else {
                                                i26 = i61;
                                                iMax2 = Math.max(i26, iM2123);
                                            }
                                            if (i25 != Integer.MIN_VALUE) {
                                                iMax2 = Math.min(iMax2, i25 - i114);
                                            }
                                            c1590M21244.f2508 = true;
                                            c1590M21244.m2121(iMax2, iM13886, iM13879);
                                            arrayList7.add(c1590M21244);
                                            i110++;
                                            i109 = i24;
                                            i61 = i26;
                                            j = j3;
                                            iArr5 = iArr;
                                        }
                                        i19 = i61;
                                        list2 = arrayList7;
                                    }
                                    if (z2) {
                                        C1590 c159012 = (C1590) (c5183.isEmpty() ? null : c5183.f13278[c5183.f13280]);
                                        if (c159012 != null) {
                                            numValueOf = Integer.valueOf(c159012.f2507);
                                        }
                                        if (z2) {
                                        }
                                        if (i20 >= i70) {
                                            interfaceC2550 = interfaceC25502;
                                            InterfaceC2492 interfaceC2492Mo2055 = interfaceC2550.mo2055(AbstractC8726.m13886(iM13886 + i31, j2), AbstractC8726.m13879(iM13879 + iMo19034, j2), AbstractC5171.m9335(), new C1597(interfaceC22303, arrayList3, list2, z4));
                                            if (numValueOf == null) {
                                            }
                                            if (numValueOf2 == null) {
                                            }
                                            if (arrayList3.isEmpty()) {
                                            }
                                            c1598 = new C1598(c15902, i18, z, f5, interfaceC2492Mo2055, f4, z9, interfaceC6233, c15322, c1595.f2527, list3, i19, i58, i70, Orientation.Vertical, i32, iMo19035);
                                        }
                                    } else {
                                        C1590 c159013 = (C1590) AbstractC5176.m9374(arrayList3);
                                        numValueOf = c159013 != null ? Integer.valueOf(c159013.f2507) : null;
                                        if (z2) {
                                            C1590 c159014 = (C1590) c5183.m9416();
                                            if (c159014 != null) {
                                                numValueOf2 = Integer.valueOf(c159014.f2507);
                                                i20 = i78;
                                            }
                                            i20 = i78;
                                            numValueOf2 = null;
                                        } else {
                                            C1590 c159015 = (C1590) AbstractC5176.m9371(arrayList3);
                                            if (c159015 != null) {
                                                numValueOf2 = Integer.valueOf(c159015.f2507);
                                                i20 = i78;
                                            }
                                            i20 = i78;
                                            numValueOf2 = null;
                                        }
                                        boolean z12 = i20 >= i70 || i62 > iM138972;
                                        interfaceC2550 = interfaceC25502;
                                        InterfaceC2492 interfaceC2492Mo20552 = interfaceC2550.mo2055(AbstractC8726.m13886(iM13886 + i31, j2), AbstractC8726.m13879(iM13879 + iMo19034, j2), AbstractC5171.m9335(), new C1597(interfaceC22303, arrayList3, list2, z4));
                                        int iIntValue4 = numValueOf == null ? numValueOf.intValue() : 0;
                                        int iIntValue5 = numValueOf2 == null ? numValueOf2.intValue() : 0;
                                        if (arrayList3.isEmpty()) {
                                            ArrayList arrayListM9345 = AbstractC5176.m9345(list2);
                                            int size14 = arrayList3.size();
                                            for (int i117 = 0; i117 < size14; i117++) {
                                                C1590 c159016 = (C1590) arrayList3.get(i117);
                                                int i118 = c159016.f2507;
                                                if (iIntValue4 <= i118 && i118 <= iIntValue5) {
                                                    arrayListM9345.add(c159016);
                                                }
                                            }
                                            AbstractC5168.m9325(arrayListM9345, AbstractC1563.f2376);
                                            list3 = arrayListM9345;
                                        } else {
                                            list3 = EmptyList.INSTANCE;
                                        }
                                        c1598 = new C1598(c15902, i18, z12, f5, interfaceC2492Mo20552, f4, z9, interfaceC6233, c15322, c1595.f2527, list3, i19, i58, i70, Orientation.Vertical, i32, iMo19035);
                                    }
                                } else {
                                    i5 = iMax4;
                                    i7 = i73;
                                    i62 = i77;
                                }
                            } else {
                                i5 = iMax4;
                                i6 = i56;
                                i7 = i63;
                            }
                            i8 = i51;
                            int i782 = i66;
                            if (Integer.signum(Math.round(f6)) == Integer.signum(i6)) {
                            }
                            f = f6 - f7;
                            f2 = 0.0f;
                            if (zMo2057) {
                                f2 = (i6 - i56) + f;
                            }
                            f3 = f2;
                            if (i7 < 0) {
                            }
                            int i792 = -i7;
                            c1590 = (C1590) c5183.first();
                            if (i48 <= 0) {
                            }
                            int i802 = i7;
                            size = c5183.size();
                            C1590 c159032 = c1590;
                            int i812 = i802;
                            f4 = f3;
                            i9 = 0;
                            while (i9 < size) {
                            }
                            C1590 c1590422 = c159032;
                            i10 = i812;
                            c1590 = c1590422;
                            iMax = Math.max(0, i8);
                            i11 = i8 - 1;
                            if (iMax > i11) {
                            }
                            size2 = list.size() - 1;
                            if (size2 >= 0) {
                            }
                            if (arrayList == null) {
                            }
                            int iMax52 = i5;
                            i13 = 0;
                            while (i13 < size3) {
                            }
                            iMin = Math.min(((C1590) AbstractC5176.m9367(c5183)).f2507, i70 - 1);
                            i14 = ((C1590) AbstractC5176.m9367(c5183)).f2507 + 1;
                            if (i14 > iMin) {
                            }
                            if (arrayList2 != null) {
                                iMin = ((C1590) AbstractC5176.m9367(arrayList2)).f2507;
                            }
                            size4 = list.size();
                            i16 = 0;
                            while (i16 < size4) {
                            }
                            if (arrayList2 == null) {
                            }
                            size5 = arrayList2.size();
                            int iMax62 = i15;
                            while (i17 < size5) {
                            }
                            if (AbstractC5227.m9466(c1590, c5183.first())) {
                            }
                            int iM138862 = AbstractC8726.m13886(iMax62, jM13888);
                            int iM138793 = AbstractC8726.m13879(i62, jM13888);
                            if (i62 >= Math.min(iM138793, iM138972)) {
                            }
                            if (z) {
                                AbstractC8570.m13654("non-zero itemsScrollOffset");
                            }
                            z2 = z10;
                            ArrayList arrayList62 = new ArrayList(arrayList2.size() + arrayList.size() + c5183.size());
                            if (z) {
                            }
                            if (z6) {
                            }
                            z3 = zMo2057;
                            if (!z3) {
                            }
                            C1590 c159092 = (C1590) (!c5183.isEmpty() ? null : c5183.f13278[c5183.f13280]);
                            if (c159092 == null) {
                            }
                            C1590 c1590102 = (C1590) c5183.m9416();
                            if (c1590102 == null) {
                            }
                            c1603.f2573.getClass();
                            C1094 c109422 = AbstractC1117.f1320;
                            if (c1562 != null) {
                                z4 = z3;
                                c15902 = c1590;
                                i19 = i61;
                                list2 = EmptyList.INSTANCE;
                                if (z2) {
                                }
                            }
                        }
                        C1598 c15982 = c1598;
                        c1582.m2112(c15982, interfaceC2550.mo2057(), false);
                        return c15982;
                    } catch (Throwable th) {
                        AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                        throw th;
                    }
                }
                obj3 = null;
                AbstractC8570.m13655("null verticalArrangement when isVertical == true");
                C5043.m9161();
                return obj3;
            case 3:
                C2077 c2077 = (C2077) obj6;
                C1524 c1524 = (C1524) obj5;
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                C2159 c21592 = (C2159) interfaceC22082;
                if (c21592.m2903(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c2077.invoke(c1524, c21592, 0);
                } else {
                    c21592.m2899();
                }
                return c6008;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC2003.m2586((C2865) obj6, (C2077) obj5, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 5:
                C2086 c2086 = (C2086) obj6;
                C2070 c2070 = (C2070) obj5;
                int iIntValue7 = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC2205) {
                    ((C2059) c2086.f3973).m2607((InterfaceC2205) obj2);
                } else if (!(obj2 instanceof C2176)) {
                    if (obj2 instanceof C2155) {
                        AbstractC2202.m3033(c2070, iIntValue7, obj2);
                        c2086.m2738((C2155) obj2);
                    } else if (obj2 instanceof C2224) {
                        AbstractC2202.m3033(c2070, iIntValue7, obj2);
                        ((C2224) obj2).m3088();
                    }
                }
                return c6008;
            case 6:
                C8945 c8945 = (C8945) obj6;
                C1594 c1594 = (C1594) obj5;
                String str = (String) obj;
                List list5 = (List) obj2;
                str.getClass();
                list5.getClass();
                ArrayList arrayList9 = new ArrayList(list5.size());
                for (Object obj9 : list5) {
                    if (((Boolean) c1594.invoke(str, (String) obj9)).booleanValue()) {
                        arrayList9.add(obj9);
                    }
                }
                if (!arrayList9.isEmpty()) {
                    c8945.mo2969(str, arrayList9);
                }
                return c6008;
            case 7:
                return CombinedContext.writeReplace$lambda$0((InterfaceC5192[]) obj6, (Ref$IntRef) obj5, (C6008) obj, (InterfaceC5186) obj2);
            case 8:
                ((Integer) obj2).getClass();
                AbstractC6799.m11906((C7003) obj6, (InterfaceC7372) obj5, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 9:
                InterfaceC1505 interfaceC15052 = (InterfaceC1505) obj6;
                C2077 c20772 = (C2077) obj5;
                InterfaceC2208 interfaceC22083 = (InterfaceC2208) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                C2159 c21593 = (C2159) interfaceC22083;
                if (c21593.m2903(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    InterfaceC2962 interfaceC2962M1994 = AbstractC1469.m1994(c2958, interfaceC15052);
                    C1479 c1479M2009 = AbstractC1474.m2009(AbstractC1469.f2109, C2952.f6604, c21593, 0);
                    int iHashCode = Long.hashCode(c21593.f4182);
                    C2088 c2088M2941 = c21593.m2941();
                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21593, interfaceC2962M1994);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC7372 = C2600.f5530;
                    c21593.m2956();
                    if (c21593.f4183) {
                        c21593.m2940(interfaceC7372);
                    } else {
                        c21593.m2950();
                    }
                    AbstractC2202.m3032(c21593, c1479M2009, C2600.f5526);
                    AbstractC2202.m3032(c21593, c2088M2941, C2600.f5527);
                    AbstractC2202.m3053(c21593, Integer.valueOf(iHashCode), C2600.f5533);
                    AbstractC2202.m3041(c21593, C2600.f5532);
                    AbstractC2202.m3032(c21593, interfaceC2962M4421, C2600.f5528);
                    c20772.invoke(C1477.f2131, c21593, 6);
                    c21593.m2937(true);
                } else {
                    c21593.m2899();
                }
                return c6008;
            case 10:
                C2077 c20773 = (C2077) obj6;
                C6837 c6837 = (C6837) obj5;
                InterfaceC2208 interfaceC22084 = (InterfaceC2208) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                C2159 c21594 = (C2159) interfaceC22084;
                if (c21594.m2903(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, false);
                    int iHashCode2 = Long.hashCode(c21594.f4182);
                    C2088 c2088M29412 = c21594.m2941();
                    InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c21594, c2958);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC73722 = C2600.f5530;
                    c21594.m2956();
                    if (c21594.f4183) {
                        c21594.m2940(interfaceC73722);
                    } else {
                        c21594.m2950();
                    }
                    AbstractC2202.m3032(c21594, interfaceC2493M2011, C2600.f5526);
                    AbstractC2202.m3032(c21594, c2088M29412, C2600.f5527);
                    AbstractC2202.m3053(c21594, Integer.valueOf(iHashCode2), C2600.f5533);
                    AbstractC2202.m3041(c21594, C2600.f5532);
                    AbstractC2202.m3032(c21594, interfaceC2962M44212, C2600.f5528);
                    c20773.invoke(c6837, c21594, 6);
                    c21594.m2937(true);
                } else {
                    c21594.m2899();
                }
                return c6008;
            case 11:
                ((Integer) obj2).getClass();
                ((C8573) obj6).m13663((C8575) obj5, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 12:
                InterfaceC7380 interfaceC7380 = (InterfaceC7380) obj6;
                String str2 = (String) obj5;
                C7981 c7981 = (C7981) obj;
                AbstractC8005 abstractC8005 = (AbstractC8005) obj2;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                c7981.getClass();
                String strM15021 = AbstractC9594.m15021(AbstractC9234.m14531(2441), c7981);
                String string = strM15021 != null ? AbstractC5976.m10714(strM15021).toString() : null;
                if (string == null) {
                    string = "";
                }
                String strM150212 = AbstractC9594.m15021(AbstractC9234.m14531(2443), c7981);
                String string2 = strM150212 != null ? AbstractC5976.m10714(strM150212).toString() : null;
                String str3 = string2 != null ? string2 : "";
                if (AbstractC5976.m10731(string) && AbstractC5976.m10731(str3)) {
                    return AbstractC3738.m6891(AbstractC9234.m14531(2449), abstractC8005, true);
                }
                interfaceC7380.invoke(string, str3, AbstractC3738.m6899(str2, c7981));
                return AbstractC3738.m6891(AbstractC9234.m14531(1188), abstractC8005, false);
            case 13:
                C2027 c2027 = (C2027) obj6;
                C2077 c20774 = (C2077) obj5;
                InterfaceC2208 interfaceC22085 = (InterfaceC2208) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                AbstractC9234.m14531(3217);
                C2159 c21595 = (C2159) interfaceC22085;
                if (c21595.m2903(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC1996.m2583(c2027, null, null, AbstractC2089.m2749(-410405659, new C1433(c20774, i29), c21595), c21595, 3072);
                } else {
                    c21595.m2899();
                }
                return c6008;
            default:
                C2086 c20862 = (C2086) obj6;
                C9646 c9646 = (C9646) obj5;
                String str4 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str4.getClass();
                C9027.m14269();
                if (zBooleanValue) {
                    ProgressBar progressBar = (ProgressBar) c20862.f3978;
                    if (progressBar == null) {
                        AbstractC5227.m9467("isLoading");
                        throw null;
                    }
                    progressBar.setVisibility(0);
                    AbstractC8798.m14017(c9646, null);
                    EditText editText = (EditText) c20862.f3981;
                    if (editText == null) {
                        AbstractC5227.m9467("inputEdit");
                        throw null;
                    }
                    editText.getText().clear();
                    ((C6637) c20862.f3974).m11781((String) c20862.f3975, new C7897(c20862, 10, c9646));
                } else {
                    C9037.m14288(str4, "错误");
                }
                return c6008;
        }
    }

    public /* synthetic */ C1898(Object obj, int i, Object obj2) {
        this.f3496 = i;
        this.f3494 = obj;
        this.f3495 = obj2;
    }
}
