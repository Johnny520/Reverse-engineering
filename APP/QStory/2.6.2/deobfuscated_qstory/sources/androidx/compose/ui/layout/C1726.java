package androidx.compose.ui.layout;

import androidx.activity.AbstractC0053;
import androidx.collection.AbstractC0273;
import androidx.collection.C0245;
import androidx.collection.C0246;
import androidx.collection.C0247;
import androidx.collection.C0277;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.C1077;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.C0585;
import androidx.compose.foundation.layout.C0590;
import androidx.compose.foundation.layout.C0602;
import androidx.compose.foundation.layout.C0603;
import androidx.compose.foundation.layout.C0604;
import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.foundation.layout.InterfaceC0650;
import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.node.AbstractC1785;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;
import p205.AbstractC7896;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1726 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1727 f5001;

    public C1726(C0585 c0585) {
        this.f5001 = c0585;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1726) && AbstractC4394.m8917(this.f5001, ((C1726) obj).f5001);
    }

    public final int hashCode() {
        return this.f5001.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f5001 + ')';
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1103(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayListM3348 = AbstractC1785.m3348(interfaceC1699);
        C0585 c0585 = (C0585) this.f5001;
        C0590 c0590 = c0585.f1633;
        List list2 = (List) AbstractC4343.m8831(1, arrayListM3348);
        InterfaceC1698 interfaceC1698 = list2 != null ? (InterfaceC1698) AbstractC4343.m8830(list2) : null;
        List list3 = (List) AbstractC4343.m8831(2, arrayListM3348);
        c0590.m1358(interfaceC1698, list3 != null ? (InterfaceC1698) AbstractC4343.m8830(list3) : null, AbstractC7896.m13296(0, i, 0, 0, 13));
        List list4 = (List) AbstractC4343.m8830(arrayListM3348);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return C0585.m1350(list4, i, interfaceC1699.mo1333(c0585.f1636), interfaceC1699.mo1333(c0585.f1634), c0585.f1633);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayListM3348 = AbstractC1785.m3348(interfaceC1699);
        C0585 c0585 = (C0585) this.f5001;
        C0590 c0590 = c0585.f1633;
        List list2 = (List) AbstractC4343.m8831(1, arrayListM3348);
        InterfaceC1698 interfaceC1698 = list2 != null ? (InterfaceC1698) AbstractC4343.m8830(list2) : null;
        List list3 = (List) AbstractC4343.m8831(2, arrayListM3348);
        c0590.m1358(interfaceC1698, list3 != null ? (InterfaceC1698) AbstractC4343.m8830(list3) : null, AbstractC7896.m13296(0, 0, 0, i, 7));
        List list4 = (List) AbstractC4343.m8830(arrayListM3348);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        int iMo1333 = interfaceC1699.mo1333(c0585.f1636);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iMo3048 = ((InterfaceC1698) list4.get(i2)).mo3048(i) + iMo1333;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iMo3048) - iMo1333);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iMo3048;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [T, androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰] */
    /* JADX WARN: Type inference failed for: r2v54, types: [T, androidx.compose.ui.layout.飘花落叶言子苏哲楪世兰] */
    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        InterfaceC1655 interfaceC1655;
        boolean z;
        InterfaceC1655 interfaceC16552;
        C0585 c0585;
        int i;
        C0277 c0277;
        C0603 c0603;
        C0604 c0604M1365;
        int i2;
        char c;
        long j2;
        C0277 c02772;
        int i3;
        C0277 c02773;
        C0603 c06032;
        long jM853;
        long jM8532;
        ArrayList arrayListM3348 = AbstractC1785.m3348(interfaceC1653);
        final C0585 c05852 = (C0585) this.f5001;
        final C0590 c0590 = c05852.f1633;
        final int i4 = 0;
        if (arrayListM3348.isEmpty() || (C7897.m13310(j) == 0 && c0590.f1656 != FlowLayoutOverflow$OverflowType.Visible)) {
            return interfaceC1653.mo1485(0, 0, AbstractC4338.m8781(), new C1077(2));
        }
        List list2 = (List) AbstractC4343.m8827(arrayListM3348);
        if (list2.isEmpty()) {
            return interfaceC1653.mo1485(0, 0, AbstractC4338.m8781(), new C1077(2));
        }
        final int i5 = 1;
        List list3 = (List) AbstractC4343.m8831(1, arrayListM3348);
        InterfaceC1655 interfaceC16553 = list3 != null ? (InterfaceC1655) AbstractC4343.m8830(list3) : null;
        List list4 = (List) AbstractC4343.m8831(2, arrayListM3348);
        InterfaceC1655 interfaceC16554 = list4 != null ? (InterfaceC1655) AbstractC4343.m8830(list4) : null;
        list2.size();
        c0590.getClass();
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        long jM1418 = AbstractC0628.m1418(AbstractC0628.m1411(10, AbstractC0628.m1412(j, layoutOrientation)), layoutOrientation);
        if (interfaceC16553 != null) {
            AbstractC0628.m1434(interfaceC16553, c05852, jM1418, new InterfaceC6557() { // from class: androidx.compose.foundation.layout.飘花落叶言子世哲苏兰楪
                @Override // p052.InterfaceC6557
                public final Object invoke(Object obj) {
                    int iMo3128;
                    int iMo31282;
                    int i6 = i4;
                    C5175 c5175 = C5175.f14739;
                    int iMo3129 = 0;
                    C0585 c05853 = c05852;
                    C0590 c05902 = c0590;
                    AbstractC1724 abstractC1724 = (AbstractC1724) obj;
                    switch (i6) {
                        case 0:
                            if (abstractC1724 != null) {
                                c05853.getClass();
                                iMo3129 = abstractC1724.mo3129();
                                iMo3128 = abstractC1724.mo3128();
                            } else {
                                iMo3128 = 0;
                            }
                            c05902.f1651 = new C0277(C0277.m853(iMo3129, iMo3128));
                            c05902.f1654 = abstractC1724;
                            break;
                        default:
                            if (abstractC1724 != null) {
                                c05853.getClass();
                                iMo3129 = abstractC1724.mo3129();
                                iMo31282 = abstractC1724.mo3128();
                            } else {
                                iMo31282 = 0;
                            }
                            c05902.f1657 = new C0277(C0277.m853(iMo3129, iMo31282));
                            c05902.f1652 = abstractC1724;
                            break;
                    }
                    return c5175;
                }
            });
            c0590.f1655 = interfaceC16553;
        }
        if (interfaceC16554 != null) {
            AbstractC0628.m1434(interfaceC16554, c05852, jM1418, new InterfaceC6557() { // from class: androidx.compose.foundation.layout.飘花落叶言子世哲苏兰楪
                @Override // p052.InterfaceC6557
                public final Object invoke(Object obj) {
                    int iMo3128;
                    int iMo31282;
                    int i6 = i5;
                    C5175 c5175 = C5175.f14739;
                    int iMo3129 = 0;
                    C0585 c05853 = c05852;
                    C0590 c05902 = c0590;
                    AbstractC1724 abstractC1724 = (AbstractC1724) obj;
                    switch (i6) {
                        case 0:
                            if (abstractC1724 != null) {
                                c05853.getClass();
                                iMo3129 = abstractC1724.mo3129();
                                iMo3128 = abstractC1724.mo3128();
                            } else {
                                iMo3128 = 0;
                            }
                            c05902.f1651 = new C0277(C0277.m853(iMo3129, iMo3128));
                            c05902.f1654 = abstractC1724;
                            break;
                        default:
                            if (abstractC1724 != null) {
                                c05853.getClass();
                                iMo3129 = abstractC1724.mo3129();
                                iMo31282 = abstractC1724.mo3128();
                            } else {
                                iMo31282 = 0;
                            }
                            c05902.f1657 = new C0277(C0277.m853(iMo3129, iMo31282));
                            c05902.f1652 = abstractC1724;
                            break;
                    }
                    return c5175;
                }
            });
            c0590.f1653 = interfaceC16554;
        }
        Iterator it = list2.iterator();
        float f = c05852.f1636;
        float f2 = c05852.f1634;
        long jM1412 = AbstractC0628.m1412(j, layoutOrientation);
        C0590 c05902 = c05852.f1633;
        C1224 c1224 = new C1224(0, new InterfaceC1657[16]);
        int iM13309 = C7897.m13309(jM1412);
        int iM13313 = C7897.m13313(jM1412);
        int iM13310 = C7897.m13310(jM1412);
        C0246 c0246 = AbstractC0273.f978;
        C0246 c02462 = new C0246();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(interfaceC1653.mo1334(f));
        int iCeil2 = (int) Math.ceil(interfaceC1653.mo1334(f2));
        long jM13297 = AbstractC7896.m13297(0, iM13309, 0, iM13310);
        long jM14182 = AbstractC0628.m1418(AbstractC0628.m1411(14, jM13297), layoutOrientation);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (it.hasNext()) {
            try {
                interfaceC1655 = (InterfaceC1655) it.next();
            } catch (IndexOutOfBoundsException unused) {
                interfaceC1655 = null;
            }
            z = true;
            interfaceC16552 = interfaceC1655;
        } else {
            z = true;
            interfaceC16552 = null;
        }
        if (interfaceC16552 != null) {
            if (AbstractC0628.m1429(AbstractC0628.m1430(interfaceC16552)) == 0.0f) {
                AbstractC0628.m1430(interfaceC16552);
                ?? Mo3045 = interfaceC16552.mo3045(jM14182);
                ref$ObjectRef.element = Mo3045;
                c0585 = c05852;
                jM8532 = C0277.m853(Mo3045.mo3129(), Mo3045.mo3128());
            } else {
                c0585 = c05852;
                int iMo3049 = interfaceC16552.mo3049(Integer.MAX_VALUE);
                jM8532 = C0277.m853(iMo3049, interfaceC16552.mo3044(iMo3049));
            }
            i = iCeil;
            c0277 = new C0277(jM8532);
        } else {
            c0585 = c05852;
            i = iCeil;
            c0277 = null;
        }
        Integer numValueOf = c0277 != null ? Integer.valueOf((int) (c0277.f984 >> 32)) : null;
        Integer numValueOf2 = c0277 != null ? Integer.valueOf((int) (c0277.f984 & 4294967295L)) : null;
        C0247 c0247 = new C0247();
        InterfaceC1655 interfaceC16555 = interfaceC16552;
        C0247 c02472 = new C0247();
        Integer numValueOf3 = numValueOf2;
        C0245 c0245 = new C0245();
        C0602 c0602 = new C0602(c05902, jM1412, i, iCeil2);
        int i6 = i;
        C0277 c02774 = c0277;
        C0603 c0603M1364 = c0602.m1364(it.hasNext(), 0, C0277.m853(iM13309, iM13310), c02774, 0, 0, 0, false, false);
        if (c0603M1364.f1691) {
            c0603 = c0603M1364;
            c0604M1365 = c0602.m1365(c0603, c02774 != null ? z : false, -1, 0, iM13309, 0);
        } else {
            c0603 = c0603M1364;
            c0604M1365 = null;
        }
        C0604 c0604 = c0604M1365;
        int i7 = iM13309;
        int i8 = iM13313;
        C0603 c06033 = c0603;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        InterfaceC1655 interfaceC16556 = interfaceC16555;
        int i14 = 0;
        while (!c06033.f1691 && interfaceC16556 != null) {
            numValueOf.getClass();
            int iIntValue = numValueOf.intValue();
            numValueOf3.getClass();
            C0245 c02452 = c0245;
            int i15 = i10 + iIntValue;
            int iMax = Math.max(i14, numValueOf3.intValue());
            int i16 = i7 - iIntValue;
            int i17 = i9 + 1;
            c05902.getClass();
            arrayList.add(interfaceC16556);
            c02462.m789(i9, ref$ObjectRef.element);
            interfaceC16556.mo3046();
            int i18 = i17 - i11;
            if (it.hasNext()) {
                try {
                    interfaceC16556 = (InterfaceC1655) it.next();
                } catch (IndexOutOfBoundsException unused2) {
                    interfaceC16556 = null;
                }
            } else {
                interfaceC16556 = null;
            }
            ref$ObjectRef.element = null;
            if (interfaceC16556 != null) {
                if (AbstractC0628.m1429(AbstractC0628.m1430(interfaceC16556)) == 0.0f) {
                    AbstractC0628.m1430(interfaceC16556);
                    ?? Mo30452 = interfaceC16556.mo3045(jM14182);
                    ref$ObjectRef.element = Mo30452;
                    j2 = jM14182;
                    jM853 = C0277.m853(Mo30452.mo3129(), Mo30452.mo3128());
                } else {
                    j2 = jM14182;
                    int iMo30492 = interfaceC16556.mo3049(Integer.MAX_VALUE);
                    jM853 = C0277.m853(iMo30492, interfaceC16556.mo3044(iMo30492));
                }
                c02772 = new C0277(jM853);
            } else {
                j2 = jM14182;
                c02772 = null;
            }
            Integer numValueOf4 = c02772 != null ? Integer.valueOf(((int) (c02772.f984 >> 32)) + i6) : null;
            numValueOf3 = c02772 != null ? Integer.valueOf((int) (c02772.f984 & 4294967295L)) : null;
            boolean zHasNext = it.hasNext();
            int i19 = i12;
            long jM8533 = C0277.m853(i16, iM13310);
            if (c02772 == null) {
                i3 = i16;
                c02773 = null;
            } else {
                numValueOf4.getClass();
                int iIntValue2 = numValueOf4.intValue();
                numValueOf3.getClass();
                i3 = i16;
                c02773 = new C0277(C0277.m853(iIntValue2, numValueOf3.intValue()));
            }
            C0603 c0603M13642 = c0602.m1364(zHasNext, i18, jM8533, c02773, i19, i13, iMax, false, false);
            int i20 = iMax;
            if (c0603M13642.f1692) {
                int iMin = Math.min(Math.max(i8, i15), iM13309);
                int i21 = i13 + i20;
                c06032 = c0603M13642;
                C0604 c0604M13652 = c0602.m1365(c06032, c02772 != null ? z : false, i19, i21, i3, i18);
                c02472.m794(i20);
                iM13310 = (iM13310 - i21) - iCeil2;
                c0247.m794(i17);
                Integer numValueOf5 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i6) : null;
                i12 = i19 + 1;
                i13 = i21 + iCeil2;
                c0604 = c0604M13652;
                numValueOf4 = numValueOf5;
                i8 = iMin;
                i3 = iM13309;
                i11 = i17;
                i20 = 0;
                i15 = 0;
            } else {
                c06032 = c0603M13642;
                i12 = i19;
            }
            i9 = i17;
            c06033 = c06032;
            i14 = i20;
            jM14182 = j2;
            i7 = i3;
            i10 = i15;
            c0245 = c02452;
            numValueOf = numValueOf4;
        }
        C0245 c02453 = c0245;
        if (c0604 != null) {
            long j3 = c0604.f1694;
            arrayList.add(c0604.f1696);
            c02462.m789(arrayList.size() - 1, c0604.f1695);
            int i22 = c0247.f985 - 1;
            if (c0604.f1693) {
                c02472.m791(i22, Math.max(c02472.m855(i22), (int) (j3 & 4294967295L)));
                c0247.m791(i22, c0247.m854() + 1);
            } else {
                c02472.m794((int) (j3 & 4294967295L));
                c0247.m794(c0247.m854() + 1);
            }
        }
        int size = arrayList.size();
        AbstractC1724[] abstractC1724Arr = new AbstractC1724[size];
        for (int i23 = 0; i23 < size; i23++) {
            abstractC1724Arr[i23] = c02462.m832(i23);
        }
        int i24 = c0247.f985;
        int[] iArr = new int[i24];
        int[] iArr2 = new int[i24];
        int[] iArr3 = c0247.f986;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i26 < i24) {
            int i28 = iArr3[i26];
            int iM855 = c02472.m855(i26);
            C0245 c02454 = c02453;
            if (c02454.m783(i26)) {
                c = 65535;
            } else {
                c = 65535;
                iM855 = C7897.m13310(jM13297) == Integer.MAX_VALUE ? Integer.MAX_VALUE : C7897.m13310(jM13297) - i27;
            }
            c02453 = c02454;
            int[] iArr4 = iArr3;
            int i29 = i8;
            ArrayList arrayList2 = arrayList;
            int i30 = i24;
            int[] iArr5 = iArr2;
            InterfaceC1657 interfaceC1657M1433 = AbstractC0628.m1433(c0585, i29, C7897.m13312(jM13297), C7897.m13309(jM13297), iM855, i6, interfaceC1653, arrayList2, abstractC1724Arr, i25, i28, iArr, i26);
            int iMo1463 = interfaceC1657M1433.mo1463();
            int iMo1464 = interfaceC1657M1433.mo1464();
            iArr5[i26] = iMo1464;
            i27 += iMo1464;
            int iMax2 = Math.max(i29, iMo1463);
            c1224.m2037(interfaceC1657M1433);
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
        C0585 c05853 = c0585;
        if (c1224.f3519 == 0) {
            i31 = 0;
            i2 = 0;
        } else {
            i2 = i27;
        }
        InterfaceC0650 interfaceC0650 = c05853.f1637;
        int iM142 = AbstractC0053.m142(c1224.f3519, z ? 1 : 0, interfaceC1653.mo1333(interfaceC0650.mo1445()), i2);
        int iM13312 = C7897.m13312(jM1412);
        int iM133102 = C7897.m13310(jM1412);
        if (iM142 < iM13312) {
            iM142 = iM13312;
        }
        if (iM142 <= iM133102) {
            iM133102 = iM142;
        }
        interfaceC0650.mo1410(iM133102, interfaceC1653, iArr6, iArr);
        int iM133132 = C7897.m13313(jM1412);
        int iM133092 = C7897.m13309(jM1412);
        if (i31 < iM133132) {
            i31 = iM133132;
        }
        if (i31 <= iM133092) {
            iM133092 = i31;
        }
        return interfaceC1653.mo1485(iM133092, iM133102, AbstractC4338.m8781(), new C1067(c1224, 2));
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
    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo1106(androidx.compose.ui.layout.InterfaceC1699 r35, java.util.List r36, int r37) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.C1726.mo1106(androidx.compose.ui.layout.飘花落叶言子楪哲兰苏世, java.util.List, int):int");
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayListM3348 = AbstractC1785.m3348(interfaceC1699);
        C0585 c0585 = (C0585) this.f5001;
        C0590 c0590 = c0585.f1633;
        List list2 = (List) AbstractC4343.m8831(1, arrayListM3348);
        InterfaceC1698 interfaceC1698 = list2 != null ? (InterfaceC1698) AbstractC4343.m8830(list2) : null;
        List list3 = (List) AbstractC4343.m8831(2, arrayListM3348);
        c0590.m1358(interfaceC1698, list3 != null ? (InterfaceC1698) AbstractC4343.m8830(list3) : null, AbstractC7896.m13296(0, i, 0, 0, 13));
        List list4 = (List) AbstractC4343.m8830(arrayListM3348);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return C0585.m1350(list4, i, interfaceC1699.mo1333(c0585.f1636), interfaceC1699.mo1333(c0585.f1634), c0585.f1633);
    }
}
