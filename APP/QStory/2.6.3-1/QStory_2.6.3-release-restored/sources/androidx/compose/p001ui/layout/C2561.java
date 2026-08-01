package androidx.compose.p001ui.layout;

import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1120;
import androidx.collection.C1092;
import androidx.collection.C1093;
import androidx.collection.C1094;
import androidx.collection.C1124;
import androidx.compose.foundation.C1905;
import androidx.compose.foundation.C1915;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.C1426;
import androidx.compose.foundation.layout.C1431;
import androidx.compose.foundation.layout.C1443;
import androidx.compose.foundation.layout.C1444;
import androidx.compose.foundation.layout.C1445;
import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.foundation.layout.InterfaceC1491;
import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.runtime.collection.C2059;
import bsh.C3466;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2561 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2562 f5347;

    public C2561(C1426 c1426) {
        this.f5347 = c1426;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2561) && AbstractC5227.m9466(this.f5347, ((C2561) obj).f5347);
    }

    public final int hashCode() {
        return this.f5347.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f5347 + ')';
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1664(InterfaceC2534 interfaceC2534, List list, int i) {
        ArrayList arrayListM3918 = AbstractC2620.m3918(interfaceC2534);
        C1426 c1426 = (C1426) this.f5347;
        C1431 c1431 = c1426.f1979;
        List list2 = (List) AbstractC5176.m9377(1, arrayListM3918);
        InterfaceC2533 interfaceC2533 = list2 != null ? (InterfaceC2533) AbstractC5176.m9374(list2) : null;
        List list3 = (List) AbstractC5176.m9377(2, arrayListM3918);
        c1431.m1928(interfaceC2533, list3 != null ? (InterfaceC2533) AbstractC5176.m9374(list3) : null, AbstractC8726.m13883(0, i, 0, 0, 13));
        List list4 = (List) AbstractC5176.m9374(arrayListM3918);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return C1426.m1920(list4, i, interfaceC2534.mo1903(c1426.f1982), interfaceC2534.mo1903(c1426.f1980), c1426.f1979);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1665(InterfaceC2534 interfaceC2534, List list, int i) {
        ArrayList arrayListM3918 = AbstractC2620.m3918(interfaceC2534);
        C1426 c1426 = (C1426) this.f5347;
        C1431 c1431 = c1426.f1979;
        List list2 = (List) AbstractC5176.m9377(1, arrayListM3918);
        InterfaceC2533 interfaceC2533 = list2 != null ? (InterfaceC2533) AbstractC5176.m9374(list2) : null;
        List list3 = (List) AbstractC5176.m9377(2, arrayListM3918);
        c1431.m1928(interfaceC2533, list3 != null ? (InterfaceC2533) AbstractC5176.m9374(list3) : null, AbstractC8726.m13883(0, 0, 0, i, 7));
        List list4 = (List) AbstractC5176.m9374(arrayListM3918);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        int iMo1903 = interfaceC2534.mo1903(c1426.f1982);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iMo3618 = ((InterfaceC2533) list4.get(i2)).mo3618(i) + iMo1903;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iMo3618) - iMo1903);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iMo3618;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [T, androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰] */
    /* JADX WARN: Type inference failed for: r2v54, types: [T, androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰] */
    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        InterfaceC2490 interfaceC2490;
        boolean z;
        InterfaceC2490 interfaceC24902;
        C1426 c1426;
        int i;
        C1124 c1124;
        C1444 c1444;
        C1445 c1445M1935;
        int i2;
        char c;
        long j2;
        C1124 c11242;
        int i3;
        C1124 c11243;
        C1444 c14442;
        long jM1414;
        long jM14142;
        ArrayList arrayListM3918 = AbstractC2620.m3918(interfaceC2488);
        final C1426 c14262 = (C1426) this.f5347;
        final C1431 c1431 = c14262.f1979;
        final int i4 = 0;
        if (arrayListM3918.isEmpty() || (C8727.m13897(j) == 0 && c1431.f2002 != FlowLayoutOverflow$OverflowType.Visible)) {
            return interfaceC2488.mo2055(0, 0, AbstractC5171.m9335(), new C1915(2));
        }
        List list2 = (List) AbstractC5176.m9379(arrayListM3918);
        if (list2.isEmpty()) {
            return interfaceC2488.mo2055(0, 0, AbstractC5171.m9335(), new C1915(2));
        }
        final int i5 = 1;
        List list3 = (List) AbstractC5176.m9377(1, arrayListM3918);
        InterfaceC2490 interfaceC24903 = list3 != null ? (InterfaceC2490) AbstractC5176.m9374(list3) : null;
        List list4 = (List) AbstractC5176.m9377(2, arrayListM3918);
        InterfaceC2490 interfaceC24904 = list4 != null ? (InterfaceC2490) AbstractC5176.m9374(list4) : null;
        list2.size();
        c1431.getClass();
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        long jM1988 = AbstractC1469.m1988(AbstractC1469.m1981(10, AbstractC1469.m1982(j, layoutOrientation)), layoutOrientation);
        if (interfaceC24903 != null) {
            AbstractC1469.m2004(interfaceC24903, c14262, jM1988, new InterfaceC7387() { // from class: androidx.compose.foundation.layout.飘花落叶言子世哲苏兰楪
                @Override // p068.InterfaceC7387
                public final Object invoke(Object obj) {
                    int iMo3698;
                    int iMo36982;
                    int i6 = i4;
                    C6008 c6008 = C6008.f15084;
                    int iMo3699 = 0;
                    C1426 c14263 = c14262;
                    C1431 c14312 = c1431;
                    AbstractC2559 abstractC2559 = (AbstractC2559) obj;
                    switch (i6) {
                        case 0:
                            if (abstractC2559 != null) {
                                c14263.getClass();
                                iMo3699 = abstractC2559.mo3699();
                                iMo3698 = abstractC2559.mo3698();
                            } else {
                                iMo3698 = 0;
                            }
                            c14312.f1997 = new C1124(C1124.m1414(iMo3699, iMo3698));
                            c14312.f2000 = abstractC2559;
                            break;
                        default:
                            if (abstractC2559 != null) {
                                c14263.getClass();
                                iMo3699 = abstractC2559.mo3699();
                                iMo36982 = abstractC2559.mo3698();
                            } else {
                                iMo36982 = 0;
                            }
                            c14312.f2003 = new C1124(C1124.m1414(iMo3699, iMo36982));
                            c14312.f1998 = abstractC2559;
                            break;
                    }
                    return c6008;
                }
            });
            c1431.f2001 = interfaceC24903;
        }
        if (interfaceC24904 != null) {
            AbstractC1469.m2004(interfaceC24904, c14262, jM1988, new InterfaceC7387() { // from class: androidx.compose.foundation.layout.飘花落叶言子世哲苏兰楪
                @Override // p068.InterfaceC7387
                public final Object invoke(Object obj) {
                    int iMo3698;
                    int iMo36982;
                    int i6 = i5;
                    C6008 c6008 = C6008.f15084;
                    int iMo3699 = 0;
                    C1426 c14263 = c14262;
                    C1431 c14312 = c1431;
                    AbstractC2559 abstractC2559 = (AbstractC2559) obj;
                    switch (i6) {
                        case 0:
                            if (abstractC2559 != null) {
                                c14263.getClass();
                                iMo3699 = abstractC2559.mo3699();
                                iMo3698 = abstractC2559.mo3698();
                            } else {
                                iMo3698 = 0;
                            }
                            c14312.f1997 = new C1124(C1124.m1414(iMo3699, iMo3698));
                            c14312.f2000 = abstractC2559;
                            break;
                        default:
                            if (abstractC2559 != null) {
                                c14263.getClass();
                                iMo3699 = abstractC2559.mo3699();
                                iMo36982 = abstractC2559.mo3698();
                            } else {
                                iMo36982 = 0;
                            }
                            c14312.f2003 = new C1124(C1124.m1414(iMo3699, iMo36982));
                            c14312.f1998 = abstractC2559;
                            break;
                    }
                    return c6008;
                }
            });
            c1431.f1999 = interfaceC24904;
        }
        Iterator it = list2.iterator();
        float f = c14262.f1982;
        float f2 = c14262.f1980;
        long jM1982 = AbstractC1469.m1982(j, layoutOrientation);
        C1431 c14312 = c14262.f1979;
        C2059 c2059 = new C2059(0, new InterfaceC2492[16]);
        int iM13896 = C8727.m13896(jM1982);
        int iM13900 = C8727.m13900(jM1982);
        int iM13897 = C8727.m13897(jM1982);
        C1093 c1093 = AbstractC1120.f1323;
        C1093 c10932 = new C1093();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(interfaceC2488.mo1904(f));
        int iCeil2 = (int) Math.ceil(interfaceC2488.mo1904(f2));
        long jM13884 = AbstractC8726.m13884(0, iM13896, 0, iM13897);
        long jM19882 = AbstractC1469.m1988(AbstractC1469.m1981(14, jM13884), layoutOrientation);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (it.hasNext()) {
            try {
                interfaceC2490 = (InterfaceC2490) it.next();
            } catch (IndexOutOfBoundsException unused) {
                interfaceC2490 = null;
            }
            z = true;
            interfaceC24902 = interfaceC2490;
        } else {
            z = true;
            interfaceC24902 = null;
        }
        if (interfaceC24902 != null) {
            if (AbstractC1469.m1999(AbstractC1469.m2000(interfaceC24902)) == 0.0f) {
                AbstractC1469.m2000(interfaceC24902);
                ?? Mo3615 = interfaceC24902.mo3615(jM19882);
                ref$ObjectRef.element = Mo3615;
                c1426 = c14262;
                jM14142 = C1124.m1414(Mo3615.mo3699(), Mo3615.mo3698());
            } else {
                c1426 = c14262;
                int iMo3619 = interfaceC24902.mo3619(Integer.MAX_VALUE);
                jM14142 = C1124.m1414(iMo3619, interfaceC24902.mo3614(iMo3619));
            }
            i = iCeil;
            c1124 = new C1124(jM14142);
        } else {
            c1426 = c14262;
            i = iCeil;
            c1124 = null;
        }
        Integer numValueOf = c1124 != null ? Integer.valueOf((int) (c1124.f1329 >> 32)) : null;
        Integer numValueOf2 = c1124 != null ? Integer.valueOf((int) (c1124.f1329 & 4294967295L)) : null;
        C1094 c1094 = new C1094();
        InterfaceC2490 interfaceC24905 = interfaceC24902;
        C1094 c10942 = new C1094();
        Integer numValueOf3 = numValueOf2;
        C1092 c1092 = new C1092();
        C1443 c1443 = new C1443(c14312, jM1982, i, iCeil2);
        int i6 = i;
        C1124 c11244 = c1124;
        C1444 c1444M1934 = c1443.m1934(it.hasNext(), 0, C1124.m1414(iM13896, iM13897), c11244, 0, 0, 0, false, false);
        if (c1444M1934.f2037) {
            c1444 = c1444M1934;
            c1445M1935 = c1443.m1935(c1444, c11244 != null ? z : false, -1, 0, iM13896, 0);
        } else {
            c1444 = c1444M1934;
            c1445M1935 = null;
        }
        C1445 c1445 = c1445M1935;
        int i7 = iM13896;
        int i8 = iM13900;
        C1444 c14443 = c1444;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        InterfaceC2490 interfaceC24906 = interfaceC24905;
        int i14 = 0;
        while (!c14443.f2037 && interfaceC24906 != null) {
            numValueOf.getClass();
            int iIntValue = numValueOf.intValue();
            numValueOf3.getClass();
            C1092 c10922 = c1092;
            int i15 = i10 + iIntValue;
            int iMax = Math.max(i14, numValueOf3.intValue());
            int i16 = i7 - iIntValue;
            int i17 = i9 + 1;
            c14312.getClass();
            arrayList.add(interfaceC24906);
            c10932.m1350(i9, ref$ObjectRef.element);
            interfaceC24906.mo3616();
            int i18 = i17 - i11;
            if (it.hasNext()) {
                try {
                    interfaceC24906 = (InterfaceC2490) it.next();
                } catch (IndexOutOfBoundsException unused2) {
                    interfaceC24906 = null;
                }
            } else {
                interfaceC24906 = null;
            }
            ref$ObjectRef.element = null;
            if (interfaceC24906 != null) {
                if (AbstractC1469.m1999(AbstractC1469.m2000(interfaceC24906)) == 0.0f) {
                    AbstractC1469.m2000(interfaceC24906);
                    ?? Mo36152 = interfaceC24906.mo3615(jM19882);
                    ref$ObjectRef.element = Mo36152;
                    j2 = jM19882;
                    jM1414 = C1124.m1414(Mo36152.mo3699(), Mo36152.mo3698());
                } else {
                    j2 = jM19882;
                    int iMo36192 = interfaceC24906.mo3619(Integer.MAX_VALUE);
                    jM1414 = C1124.m1414(iMo36192, interfaceC24906.mo3614(iMo36192));
                }
                c11242 = new C1124(jM1414);
            } else {
                j2 = jM19882;
                c11242 = null;
            }
            Integer numValueOf4 = c11242 != null ? Integer.valueOf(((int) (c11242.f1329 >> 32)) + i6) : null;
            numValueOf3 = c11242 != null ? Integer.valueOf((int) (c11242.f1329 & 4294967295L)) : null;
            boolean zHasNext = it.hasNext();
            int i19 = i12;
            long jM14143 = C1124.m1414(i16, iM13897);
            if (c11242 == null) {
                i3 = i16;
                c11243 = null;
            } else {
                numValueOf4.getClass();
                int iIntValue2 = numValueOf4.intValue();
                numValueOf3.getClass();
                i3 = i16;
                c11243 = new C1124(C1124.m1414(iIntValue2, numValueOf3.intValue()));
            }
            C1444 c1444M19342 = c1443.m1934(zHasNext, i18, jM14143, c11243, i19, i13, iMax, false, false);
            int i20 = iMax;
            if (c1444M19342.f2038) {
                int iMin = Math.min(Math.max(i8, i15), iM13896);
                int i21 = i13 + i20;
                c14442 = c1444M19342;
                C1445 c1445M19352 = c1443.m1935(c14442, c11242 != null ? z : false, i19, i21, i3, i18);
                c10942.m1355(i20);
                iM13897 = (iM13897 - i21) - iCeil2;
                c1094.m1355(i17);
                Integer numValueOf5 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i6) : null;
                i12 = i19 + 1;
                i13 = i21 + iCeil2;
                c1445 = c1445M19352;
                numValueOf4 = numValueOf5;
                i8 = iMin;
                i3 = iM13896;
                i11 = i17;
                i20 = 0;
                i15 = 0;
            } else {
                c14442 = c1444M19342;
                i12 = i19;
            }
            i9 = i17;
            c14443 = c14442;
            i14 = i20;
            jM19882 = j2;
            i7 = i3;
            i10 = i15;
            c1092 = c10922;
            numValueOf = numValueOf4;
        }
        C1092 c10923 = c1092;
        if (c1445 != null) {
            long j3 = c1445.f2040;
            arrayList.add(c1445.f2042);
            c10932.m1350(arrayList.size() - 1, c1445.f2041);
            int i22 = c1094.f1330 - 1;
            if (c1445.f2039) {
                c10942.m1352(i22, Math.max(c10942.m1416(i22), (int) (j3 & 4294967295L)));
                c1094.m1352(i22, c1094.m1415() + 1);
            } else {
                c10942.m1355((int) (j3 & 4294967295L));
                c1094.m1355(c1094.m1415() + 1);
            }
        }
        int size = arrayList.size();
        AbstractC2559[] abstractC2559Arr = new AbstractC2559[size];
        for (int i23 = 0; i23 < size; i23++) {
            abstractC2559Arr[i23] = c10932.m1393(i23);
        }
        int i24 = c1094.f1330;
        int[] iArr = new int[i24];
        int[] iArr2 = new int[i24];
        int[] iArr3 = c1094.f1331;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i26 < i24) {
            int i28 = iArr3[i26];
            int iM1416 = c10942.m1416(i26);
            C1092 c10924 = c10923;
            if (c10924.m1344(i26)) {
                c = 65535;
            } else {
                c = 65535;
                iM1416 = C8727.m13897(jM13884) == Integer.MAX_VALUE ? Integer.MAX_VALUE : C8727.m13897(jM13884) - i27;
            }
            c10923 = c10924;
            int[] iArr4 = iArr3;
            int i29 = i8;
            ArrayList arrayList2 = arrayList;
            int i30 = i24;
            int[] iArr5 = iArr2;
            InterfaceC2492 interfaceC2492M2003 = AbstractC1469.m2003(c1426, i29, C8727.m13899(jM13884), C8727.m13896(jM13884), iM1416, i6, interfaceC2488, arrayList2, abstractC2559Arr, i25, i28, iArr, i26);
            int iMo2033 = interfaceC2492M2003.mo2033();
            int iMo2034 = interfaceC2492M2003.mo2034();
            iArr5[i26] = iMo2034;
            i27 += iMo2034;
            int iMax2 = Math.max(i29, iMo2033);
            c2059.m2607(interfaceC2492M2003);
            i26++;
            i8 = iMax2;
            i25 = i28;
            iArr2 = iArr5;
            i24 = i30;
            iArr3 = iArr4;
            arrayList = arrayList2;
        }
        int[] iArr6 = iArr2;
        int i31 = i8;
        C1426 c14263 = c1426;
        if (c2059.f3865 == 0) {
            i31 = 0;
            i2 = 0;
        } else {
            i2 = i27;
        }
        InterfaceC1491 interfaceC1491 = c14263.f1983;
        int iM703 = AbstractC0900.m703(c2059.f3865, z ? 1 : 0, interfaceC2488.mo1903(interfaceC1491.mo2015()), i2);
        int iM13899 = C8727.m13899(jM1982);
        int iM138972 = C8727.m13897(jM1982);
        if (iM703 < iM13899) {
            iM703 = iM13899;
        }
        if (iM703 <= iM138972) {
            iM138972 = iM703;
        }
        interfaceC1491.mo1980(iM138972, interfaceC2488, iArr6, iArr);
        int iM139002 = C8727.m13900(jM1982);
        int iM138962 = C8727.m13896(jM1982);
        if (i31 < iM139002) {
            i31 = iM139002;
        }
        if (i31 <= iM138962) {
            iM138962 = i31;
        }
        return interfaceC2488.mo2055(iM138962, iM138972, AbstractC5171.m9335(), new C1905(c2059, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo1667(InterfaceC2534 interfaceC2534, List list, int i) {
        int i2;
        int[] iArr;
        List list2;
        int i3;
        int i4;
        int i5;
        long jM1414;
        C1124 c1124;
        int i6;
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType;
        ArrayList arrayListM3918 = AbstractC2620.m3918(interfaceC2534);
        C1426 c1426 = (C1426) this.f5347;
        C1431 c1431 = c1426.f1979;
        int i7 = 1;
        List list3 = (List) AbstractC5176.m9377(1, arrayListM3918);
        InterfaceC2533 interfaceC2533 = list3 != null ? (InterfaceC2533) AbstractC5176.m9374(list3) : null;
        int i8 = 2;
        List list4 = (List) AbstractC5176.m9377(2, arrayListM3918);
        int i9 = 0;
        c1431.m1928(interfaceC2533, list4 != null ? (InterfaceC2533) AbstractC5176.m9374(list4) : null, AbstractC8726.m13883(0, 0, 0, i, 7));
        List list5 = (List) AbstractC5176.m9374(arrayListM3918);
        if (list5 == null) {
            list5 = EmptyList.INSTANCE;
        }
        int iMo1903 = interfaceC2534.mo1903(c1426.f1982);
        int iMo19032 = interfaceC2534.mo1903(c1426.f1980);
        C1431 c14312 = c1426.f1979;
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i10 = 0; i10 < size3; i10++) {
            InterfaceC2533 interfaceC25332 = (InterfaceC2533) list5.get(i10);
            int iMo3619 = interfaceC25332.mo3619(i);
            iArr2[i10] = iMo3619;
            iArr3[i10] = interfaceC25332.mo3614(iMo3619);
        }
        int i11 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE >= list5.size() || ((flowLayoutOverflow$OverflowType = c14312.f2002) != FlowLayoutOverflow$OverflowType.ExpandIndicator && flowLayoutOverflow$OverflowType != FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator)) {
            if (Integer.MAX_VALUE >= list5.size()) {
                c14312.getClass();
                i2 = c14312.f2002 == FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator ? 1 : 0;
            }
        }
        int iMin = Math.min(Integer.MAX_VALUE - i2, list5.size());
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += iArr2[i13];
        }
        int size4 = ((list5.size() - 1) * iMo1903) + i12;
        if (size2 == 0) {
            C3466.m5896();
            return 0;
        }
        int i14 = iArr3[0];
        int i15 = size2 - 1;
        if (1 <= i15) {
            int i16 = 1;
            while (true) {
                int i17 = iArr3[i16];
                if (i14 < i17) {
                    i14 = i17;
                }
                if (i16 == i15) {
                    break;
                }
                i16++;
            }
        }
        if (size == 0) {
            C3466.m5896();
            return 0;
        }
        int i18 = iArr2[0];
        int i19 = size - 1;
        if (1 <= i19) {
            int i20 = 1;
            while (true) {
                int i21 = iArr2[i20];
                if (i18 < i21) {
                    i18 = i21;
                }
                if (i20 == i19) {
                    break;
                }
                i20++;
            }
        }
        int i22 = size4;
        while (i18 <= i22 && i14 != i) {
            int i23 = (i18 + i22) / i8;
            if (list5.isEmpty()) {
                jM1414 = C1124.m1414(i9, i9);
                list2 = list5;
                iArr = iArr3;
            } else {
                C1443 c1443 = new C1443(c14312, AbstractC8726.m13884(i9, i23, i9, i11), iMo1903, iMo19032);
                InterfaceC2533 interfaceC25333 = (InterfaceC2533) AbstractC5176.m9377(i9, list5);
                int i24 = interfaceC25333 != null ? iArr3[i9] : i9;
                int i25 = interfaceC25333 != null ? iArr2[i9] : i9;
                iArr = iArr3;
                int i26 = 0;
                if (c1443.m1934(list5.size() > i7 ? i7 : i9, 0, C1124.m1414(i23, i11), interfaceC25333 == null ? null : new C1124(C1124.m1414(i25, i24)), 0, 0, 0, false, false).f2037) {
                    C1124 c1124M1929 = c14312.m1929(i9, i9, interfaceC25333 != null ? 1 : i9);
                    jM1414 = C1124.m1414(c1124M1929 != null ? (int) (c1124M1929.f1329 & 4294967295L) : i9, i9);
                    list2 = list5;
                } else {
                    int size5 = list5.size();
                    int i27 = i23;
                    int i28 = i9;
                    int i29 = i28;
                    int i30 = i29;
                    int i31 = 0;
                    int i32 = 0;
                    while (true) {
                        if (i28 >= size5) {
                            list2 = list5;
                            i3 = iMin;
                            i4 = i9;
                            i5 = i29;
                            break;
                        }
                        i27 -= i25;
                        i5 = i28 + 1;
                        int iMax = Math.max(i32, i24);
                        InterfaceC2533 interfaceC25334 = (InterfaceC2533) AbstractC5176.m9377(i5, list5);
                        i24 = interfaceC25334 != null ? iArr[i5] : i9;
                        if (interfaceC25334 != null) {
                            i4 = i9;
                            i9 = iArr2[i5] + iMo1903;
                        } else {
                            i4 = i9;
                        }
                        boolean z = i28 + 2 < list5.size() ? 1 : i4;
                        int i33 = i5 - i30;
                        int i34 = i31;
                        long jM14142 = C1124.m1414(i27, Integer.MAX_VALUE);
                        if (interfaceC25334 == null) {
                            list2 = list5;
                            i3 = iMin;
                            c1124 = null;
                        } else {
                            i3 = iMin;
                            list2 = list5;
                            c1124 = new C1124(C1124.m1414(i9, i24));
                        }
                        C1444 c1444M1934 = c1443.m1934(z, i33, jM14142, c1124, i34, i26, iMax, false, false);
                        if (c1444M1934.f2038) {
                            int i35 = iMax + iMo19032 + i26;
                            C1445 c1445M1935 = c1443.m1935(c1444M1934, interfaceC25334 != null ? 1 : i4, i34, i35, i27, i33);
                            i9 -= iMo1903;
                            i31 = i34 + 1;
                            if (c1444M1934.f2037) {
                                if (c1445M1935 != null) {
                                    long j = c1445M1935.f2040;
                                    if (!c1445M1935.f2039) {
                                        i35 = ((int) (j & 4294967295L)) + iMo19032 + i35;
                                    }
                                }
                                i26 = i35;
                            } else {
                                i27 = i23;
                                i30 = i5;
                                i26 = i35;
                                i32 = i4;
                            }
                        } else {
                            i31 = i34;
                            i32 = iMax;
                        }
                        iMin = i3;
                        i28 = i5;
                        i29 = i28;
                        list5 = list2;
                        i25 = i9;
                        i9 = i4;
                    }
                    jM1414 = C1124.m1414(i26 - iMo19032, i5);
                    i6 = (int) (jM1414 >> 32);
                    int i36 = (int) (jM1414 & 4294967295L);
                    if (i6 <= i || i36 < i3) {
                        i18 = i23 + 1;
                        if (i18 <= i22) {
                            return i18;
                        }
                    } else {
                        if (i6 >= i) {
                            return i23;
                        }
                        i22 = i23 - 1;
                    }
                    iArr3 = iArr;
                    i14 = i6;
                    size4 = i23;
                    iMin = i3;
                    i9 = i4;
                    list5 = list2;
                    i7 = 1;
                    i8 = 2;
                    i11 = Integer.MAX_VALUE;
                }
            }
            i3 = iMin;
            i4 = i9;
            i6 = (int) (jM1414 >> 32);
            int i362 = (int) (jM1414 & 4294967295L);
            if (i6 <= i) {
                i18 = i23 + 1;
                if (i18 <= i22) {
                }
            }
            iArr3 = iArr;
            i14 = i6;
            size4 = i23;
            iMin = i3;
            i9 = i4;
            list5 = list2;
            i7 = 1;
            i8 = 2;
            i11 = Integer.MAX_VALUE;
        }
        return size4;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1668(InterfaceC2534 interfaceC2534, List list, int i) {
        ArrayList arrayListM3918 = AbstractC2620.m3918(interfaceC2534);
        C1426 c1426 = (C1426) this.f5347;
        C1431 c1431 = c1426.f1979;
        List list2 = (List) AbstractC5176.m9377(1, arrayListM3918);
        InterfaceC2533 interfaceC2533 = list2 != null ? (InterfaceC2533) AbstractC5176.m9374(list2) : null;
        List list3 = (List) AbstractC5176.m9377(2, arrayListM3918);
        c1431.m1928(interfaceC2533, list3 != null ? (InterfaceC2533) AbstractC5176.m9374(list3) : null, AbstractC8726.m13883(0, i, 0, 0, 13));
        List list4 = (List) AbstractC5176.m9374(arrayListM3918);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return C1426.m1920(list4, i, interfaceC2534.mo1903(c1426.f1982), interfaceC2534.mo1903(c1426.f1980), c1426.f1979);
    }
}
