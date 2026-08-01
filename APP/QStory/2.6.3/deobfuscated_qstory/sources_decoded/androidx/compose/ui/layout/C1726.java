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
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;
import p205.AbstractC7897;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1726 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1727 f5002;

    public C1726(C0585 c0585) {
        this.f5002 = c0585;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1726) && AbstractC4395.m8907(this.f5002, ((C1726) obj).f5002);
    }

    public final int hashCode() {
        return this.f5002.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f5002 + ')';
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayListM3358 = AbstractC1785.m3358(interfaceC1699);
        C0585 c0585 = (C0585) this.f5002;
        C0590 c0590 = c0585.f1634;
        List list2 = (List) AbstractC4344.m8818(1, arrayListM3358);
        InterfaceC1698 interfaceC1698 = list2 != null ? (InterfaceC1698) AbstractC4344.m8815(list2) : null;
        List list3 = (List) AbstractC4344.m8818(2, arrayListM3358);
        c0590.m1368(interfaceC1698, list3 != null ? (InterfaceC1698) AbstractC4344.m8815(list3) : null, AbstractC7897.m13324(0, i, 0, 0, 13));
        List list4 = (List) AbstractC4344.m8815(arrayListM3358);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return C0585.m1360(list4, i, interfaceC1699.mo1343(c0585.f1637), interfaceC1699.mo1343(c0585.f1635), c0585.f1634);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1105(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayListM3358 = AbstractC1785.m3358(interfaceC1699);
        C0585 c0585 = (C0585) this.f5002;
        C0590 c0590 = c0585.f1634;
        List list2 = (List) AbstractC4344.m8818(1, arrayListM3358);
        InterfaceC1698 interfaceC1698 = list2 != null ? (InterfaceC1698) AbstractC4344.m8815(list2) : null;
        List list3 = (List) AbstractC4344.m8818(2, arrayListM3358);
        c0590.m1368(interfaceC1698, list3 != null ? (InterfaceC1698) AbstractC4344.m8815(list3) : null, AbstractC7897.m13324(0, 0, 0, i, 7));
        List list4 = (List) AbstractC4344.m8815(arrayListM3358);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        int iMo1343 = interfaceC1699.mo1343(c0585.f1637);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iMo3058 = ((InterfaceC1698) list4.get(i2)).mo3058(i) + iMo1343;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iMo3058) - iMo1343);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iMo3058;
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
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        InterfaceC1655 interfaceC1655;
        boolean z;
        InterfaceC1655 interfaceC16552;
        C0585 c0585;
        int i;
        C0277 c0277;
        C0603 c0603;
        C0604 c0604M1375;
        int i2;
        char c;
        long j2;
        C0277 c02772;
        int i3;
        C0277 c02773;
        C0603 c06032;
        long jM854;
        long jM8542;
        ArrayList arrayListM3358 = AbstractC1785.m3358(interfaceC1653);
        final C0585 c05852 = (C0585) this.f5002;
        final C0590 c0590 = c05852.f1634;
        final int i4 = 0;
        if (arrayListM3358.isEmpty() || (C7898.m13338(j) == 0 && c0590.f1657 != FlowLayoutOverflow$OverflowType.Visible)) {
            return interfaceC1653.mo1495(0, 0, AbstractC4339.m8776(), new C1077(2));
        }
        List list2 = (List) AbstractC4344.m8820(arrayListM3358);
        if (list2.isEmpty()) {
            return interfaceC1653.mo1495(0, 0, AbstractC4339.m8776(), new C1077(2));
        }
        final int i5 = 1;
        List list3 = (List) AbstractC4344.m8818(1, arrayListM3358);
        InterfaceC1655 interfaceC16553 = list3 != null ? (InterfaceC1655) AbstractC4344.m8815(list3) : null;
        List list4 = (List) AbstractC4344.m8818(2, arrayListM3358);
        InterfaceC1655 interfaceC16554 = list4 != null ? (InterfaceC1655) AbstractC4344.m8815(list4) : null;
        list2.size();
        c0590.getClass();
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        long jM1428 = AbstractC0628.m1428(AbstractC0628.m1421(10, AbstractC0628.m1422(j, layoutOrientation)), layoutOrientation);
        if (interfaceC16553 != null) {
            AbstractC0628.m1444(interfaceC16553, c05852, jM1428, new InterfaceC6558() { // from class: androidx.compose.foundation.layout.飘花落叶言子世哲苏兰楪
                @Override // p052.InterfaceC6558
                public final Object invoke(Object obj) {
                    int iMo3138;
                    int iMo31382;
                    int i6 = i4;
                    C5176 c5176 = C5176.f14739;
                    int iMo3139 = 0;
                    C0585 c05853 = c05852;
                    C0590 c05902 = c0590;
                    AbstractC1724 abstractC1724 = (AbstractC1724) obj;
                    switch (i6) {
                        case 0:
                            if (abstractC1724 != null) {
                                c05853.getClass();
                                iMo3139 = abstractC1724.mo3139();
                                iMo3138 = abstractC1724.mo3138();
                            } else {
                                iMo3138 = 0;
                            }
                            c05902.f1652 = new C0277(C0277.m854(iMo3139, iMo3138));
                            c05902.f1655 = abstractC1724;
                            break;
                        default:
                            if (abstractC1724 != null) {
                                c05853.getClass();
                                iMo3139 = abstractC1724.mo3139();
                                iMo31382 = abstractC1724.mo3138();
                            } else {
                                iMo31382 = 0;
                            }
                            c05902.f1658 = new C0277(C0277.m854(iMo3139, iMo31382));
                            c05902.f1653 = abstractC1724;
                            break;
                    }
                    return c5176;
                }
            });
            c0590.f1656 = interfaceC16553;
        }
        if (interfaceC16554 != null) {
            AbstractC0628.m1444(interfaceC16554, c05852, jM1428, new InterfaceC6558() { // from class: androidx.compose.foundation.layout.飘花落叶言子世哲苏兰楪
                @Override // p052.InterfaceC6558
                public final Object invoke(Object obj) {
                    int iMo3138;
                    int iMo31382;
                    int i6 = i5;
                    C5176 c5176 = C5176.f14739;
                    int iMo3139 = 0;
                    C0585 c05853 = c05852;
                    C0590 c05902 = c0590;
                    AbstractC1724 abstractC1724 = (AbstractC1724) obj;
                    switch (i6) {
                        case 0:
                            if (abstractC1724 != null) {
                                c05853.getClass();
                                iMo3139 = abstractC1724.mo3139();
                                iMo3138 = abstractC1724.mo3138();
                            } else {
                                iMo3138 = 0;
                            }
                            c05902.f1652 = new C0277(C0277.m854(iMo3139, iMo3138));
                            c05902.f1655 = abstractC1724;
                            break;
                        default:
                            if (abstractC1724 != null) {
                                c05853.getClass();
                                iMo3139 = abstractC1724.mo3139();
                                iMo31382 = abstractC1724.mo3138();
                            } else {
                                iMo31382 = 0;
                            }
                            c05902.f1658 = new C0277(C0277.m854(iMo3139, iMo31382));
                            c05902.f1653 = abstractC1724;
                            break;
                    }
                    return c5176;
                }
            });
            c0590.f1654 = interfaceC16554;
        }
        Iterator it = list2.iterator();
        float f = c05852.f1637;
        float f2 = c05852.f1635;
        long jM1422 = AbstractC0628.m1422(j, layoutOrientation);
        C0590 c05902 = c05852.f1634;
        C1224 c1224 = new C1224(0, new InterfaceC1657[16]);
        int iM13337 = C7898.m13337(jM1422);
        int iM13341 = C7898.m13341(jM1422);
        int iM13338 = C7898.m13338(jM1422);
        C0246 c0246 = AbstractC0273.f978;
        C0246 c02462 = new C0246();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(interfaceC1653.mo1344(f));
        int iCeil2 = (int) Math.ceil(interfaceC1653.mo1344(f2));
        long jM13325 = AbstractC7897.m13325(0, iM13337, 0, iM13338);
        long jM14282 = AbstractC0628.m1428(AbstractC0628.m1421(14, jM13325), layoutOrientation);
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
            if (AbstractC0628.m1439(AbstractC0628.m1440(interfaceC16552)) == 0.0f) {
                AbstractC0628.m1440(interfaceC16552);
                ?? Mo3055 = interfaceC16552.mo3055(jM14282);
                ref$ObjectRef.element = Mo3055;
                c0585 = c05852;
                jM8542 = C0277.m854(Mo3055.mo3139(), Mo3055.mo3138());
            } else {
                c0585 = c05852;
                int iMo3059 = interfaceC16552.mo3059(Integer.MAX_VALUE);
                jM8542 = C0277.m854(iMo3059, interfaceC16552.mo3054(iMo3059));
            }
            i = iCeil;
            c0277 = new C0277(jM8542);
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
        C0602 c0602 = new C0602(c05902, jM1422, i, iCeil2);
        int i6 = i;
        C0277 c02774 = c0277;
        C0603 c0603M1374 = c0602.m1374(it.hasNext(), 0, C0277.m854(iM13337, iM13338), c02774, 0, 0, 0, false, false);
        if (c0603M1374.f1692) {
            c0603 = c0603M1374;
            c0604M1375 = c0602.m1375(c0603, c02774 != null ? z : false, -1, 0, iM13337, 0);
        } else {
            c0603 = c0603M1374;
            c0604M1375 = null;
        }
        C0604 c0604 = c0604M1375;
        int i7 = iM13337;
        int i8 = iM13341;
        C0603 c06033 = c0603;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        InterfaceC1655 interfaceC16556 = interfaceC16555;
        int i14 = 0;
        while (!c06033.f1692 && interfaceC16556 != null) {
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
            c02462.m790(i9, ref$ObjectRef.element);
            interfaceC16556.mo3056();
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
                if (AbstractC0628.m1439(AbstractC0628.m1440(interfaceC16556)) == 0.0f) {
                    AbstractC0628.m1440(interfaceC16556);
                    ?? Mo30552 = interfaceC16556.mo3055(jM14282);
                    ref$ObjectRef.element = Mo30552;
                    j2 = jM14282;
                    jM854 = C0277.m854(Mo30552.mo3139(), Mo30552.mo3138());
                } else {
                    j2 = jM14282;
                    int iMo30592 = interfaceC16556.mo3059(Integer.MAX_VALUE);
                    jM854 = C0277.m854(iMo30592, interfaceC16556.mo3054(iMo30592));
                }
                c02772 = new C0277(jM854);
            } else {
                j2 = jM14282;
                c02772 = null;
            }
            Integer numValueOf4 = c02772 != null ? Integer.valueOf(((int) (c02772.f984 >> 32)) + i6) : null;
            numValueOf3 = c02772 != null ? Integer.valueOf((int) (c02772.f984 & 4294967295L)) : null;
            boolean zHasNext = it.hasNext();
            int i19 = i12;
            long jM8543 = C0277.m854(i16, iM13338);
            if (c02772 == null) {
                i3 = i16;
                c02773 = null;
            } else {
                numValueOf4.getClass();
                int iIntValue2 = numValueOf4.intValue();
                numValueOf3.getClass();
                i3 = i16;
                c02773 = new C0277(C0277.m854(iIntValue2, numValueOf3.intValue()));
            }
            C0603 c0603M13742 = c0602.m1374(zHasNext, i18, jM8543, c02773, i19, i13, iMax, false, false);
            int i20 = iMax;
            if (c0603M13742.f1693) {
                int iMin = Math.min(Math.max(i8, i15), iM13337);
                int i21 = i13 + i20;
                c06032 = c0603M13742;
                C0604 c0604M13752 = c0602.m1375(c06032, c02772 != null ? z : false, i19, i21, i3, i18);
                c02472.m795(i20);
                iM13338 = (iM13338 - i21) - iCeil2;
                c0247.m795(i17);
                Integer numValueOf5 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i6) : null;
                i12 = i19 + 1;
                i13 = i21 + iCeil2;
                c0604 = c0604M13752;
                numValueOf4 = numValueOf5;
                i8 = iMin;
                i3 = iM13337;
                i11 = i17;
                i20 = 0;
                i15 = 0;
            } else {
                c06032 = c0603M13742;
                i12 = i19;
            }
            i9 = i17;
            c06033 = c06032;
            i14 = i20;
            jM14282 = j2;
            i7 = i3;
            i10 = i15;
            c0245 = c02452;
            numValueOf = numValueOf4;
        }
        C0245 c02453 = c0245;
        if (c0604 != null) {
            long j3 = c0604.f1695;
            arrayList.add(c0604.f1697);
            c02462.m790(arrayList.size() - 1, c0604.f1696);
            int i22 = c0247.f985 - 1;
            if (c0604.f1694) {
                c02472.m792(i22, Math.max(c02472.m856(i22), (int) (j3 & 4294967295L)));
                c0247.m792(i22, c0247.m855() + 1);
            } else {
                c02472.m795((int) (j3 & 4294967295L));
                c0247.m795(c0247.m855() + 1);
            }
        }
        int size = arrayList.size();
        AbstractC1724[] abstractC1724Arr = new AbstractC1724[size];
        for (int i23 = 0; i23 < size; i23++) {
            abstractC1724Arr[i23] = c02462.m833(i23);
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
            int iM856 = c02472.m856(i26);
            C0245 c02454 = c02453;
            if (c02454.m784(i26)) {
                c = 65535;
            } else {
                c = 65535;
                iM856 = C7898.m13338(jM13325) == Integer.MAX_VALUE ? Integer.MAX_VALUE : C7898.m13338(jM13325) - i27;
            }
            c02453 = c02454;
            int[] iArr4 = iArr3;
            int i29 = i8;
            ArrayList arrayList2 = arrayList;
            int i30 = i24;
            int[] iArr5 = iArr2;
            InterfaceC1657 interfaceC1657M1443 = AbstractC0628.m1443(c0585, i29, C7898.m13340(jM13325), C7898.m13337(jM13325), iM856, i6, interfaceC1653, arrayList2, abstractC1724Arr, i25, i28, iArr, i26);
            int iMo1473 = interfaceC1657M1443.mo1473();
            int iMo1474 = interfaceC1657M1443.mo1474();
            iArr5[i26] = iMo1474;
            i27 += iMo1474;
            int iMax2 = Math.max(i29, iMo1473);
            c1224.m2047(interfaceC1657M1443);
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
        if (c1224.f3520 == 0) {
            i31 = 0;
            i2 = 0;
        } else {
            i2 = i27;
        }
        InterfaceC0650 interfaceC0650 = c05853.f1638;
        int iM143 = AbstractC0053.m143(c1224.f3520, z ? 1 : 0, interfaceC1653.mo1343(interfaceC0650.mo1455()), i2);
        int iM13340 = C7898.m13340(jM1422);
        int iM133382 = C7898.m13338(jM1422);
        if (iM143 < iM13340) {
            iM143 = iM13340;
        }
        if (iM143 <= iM133382) {
            iM133382 = iM143;
        }
        interfaceC0650.mo1420(iM133382, interfaceC1653, iArr6, iArr);
        int iM133412 = C7898.m13341(jM1422);
        int iM133372 = C7898.m13337(jM1422);
        if (i31 < iM133412) {
            i31 = iM133412;
        }
        if (i31 <= iM133372) {
            iM133372 = i31;
        }
        return interfaceC1653.mo1495(iM133372, iM133382, AbstractC4339.m8776(), new C1067(c1224, 2));
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
    public final int mo1107(androidx.compose.ui.layout.InterfaceC1699 r35, java.util.List r36, int r37) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.C1726.mo1107(androidx.compose.ui.layout.飘花落叶言子楪哲兰苏世, java.util.List, int):int");
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1108(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayListM3358 = AbstractC1785.m3358(interfaceC1699);
        C0585 c0585 = (C0585) this.f5002;
        C0590 c0590 = c0585.f1634;
        List list2 = (List) AbstractC4344.m8818(1, arrayListM3358);
        InterfaceC1698 interfaceC1698 = list2 != null ? (InterfaceC1698) AbstractC4344.m8815(list2) : null;
        List list3 = (List) AbstractC4344.m8818(2, arrayListM3358);
        c0590.m1368(interfaceC1698, list3 != null ? (InterfaceC1698) AbstractC4344.m8815(list3) : null, AbstractC7897.m13324(0, i, 0, 0, 13));
        List list4 = (List) AbstractC4344.m8815(arrayListM3358);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return C0585.m1360(list4, i, interfaceC1699.mo1343(c0585.f1637), interfaceC1699.mo1343(c0585.f1635), c0585.f1634);
    }
}
