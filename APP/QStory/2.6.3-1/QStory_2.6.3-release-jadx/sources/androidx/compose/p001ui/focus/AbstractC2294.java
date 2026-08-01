package androidx.compose.p001ui.focus;

import androidx.compose.foundation.gestures.C1382;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.AbstractC1600;
import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.lazy.C1583;
import androidx.compose.foundation.lazy.C1590;
import androidx.compose.foundation.lazy.C1598;
import androidx.compose.foundation.lazy.layout.C1559;
import androidx.compose.foundation.lazy.layout.C1560;
import androidx.compose.foundation.lazy.layout.C1565;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.layout.InterfaceC2537;
import androidx.compose.p001ui.layout.InterfaceC2538;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.util.Arrays;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p064.C7348;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p128.C8157;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2294 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Boolean m3162(int i, C2287 c2287, InterfaceC7387 interfaceC7387, C8157 c8157) {
        FocusStateImpl focusStateImplM3157 = c2287.m3157();
        int[] iArr = AbstractC2292.f4501;
        int i2 = iArr[focusStateImplM3157.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m3185(c2287, i, interfaceC7387));
            }
            if (i2 == 4) {
                return c2287.m3160().f4525 ? (Boolean) interfaceC7387.invoke(c2287) : c8157 == null ? Boolean.valueOf(m3185(c2287, i, interfaceC7387)) : Boolean.valueOf(m3164(i, c2287, interfaceC7387, c8157));
            }
            C5043.m9170();
            return null;
        }
        C2287 c2287M3179 = m3179(c2287);
        if (c2287M3179 == null) {
            C6755.m11870("ActiveParent must have a focusedChild");
            return null;
        }
        int i3 = iArr[c2287M3179.m3157().ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                if (c8157 == null) {
                    c8157 = m3189(c2287M3179);
                }
                return Boolean.valueOf(m3188(i, c2287, interfaceC7387, c8157));
            }
            if (i3 != 4) {
                C5043.m9170();
                return null;
            }
            C6755.m11870("ActiveParent must have a focusedChild");
            return null;
        }
        Boolean boolM3162 = m3162(i, c2287M3179, interfaceC7387, c8157);
        if (!AbstractC5227.m9466(boolM3162, Boolean.FALSE)) {
            return boolM3162;
        }
        if (c8157 == null) {
            if (c2287M3179.m3157() != FocusStateImpl.ActiveParent) {
                C6755.m11870("Searching for active node in inactive hierarchy");
                return null;
            }
            C2287 c2287M3167 = m3167(c2287M3179);
            if (c2287M3167 == null) {
                C6755.m11870("ActiveParent must have a focusedChild");
                return null;
            }
            c8157 = m3189(c2287M3167);
        }
        return Boolean.valueOf(m3188(i, c2287, interfaceC7387, c8157));
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m3163(C2287 c2287, C2287 c22872, int i, InterfaceC7387 interfaceC7387) {
        AbstractC2961 abstractC2961;
        C2583 c2583M3906;
        C2646 c2646;
        if (c2287.m3157() != FocusStateImpl.ActiveParent) {
            C6755.m11870("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new C2287[16];
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitChildren called on an unattached node");
        }
        C2059 c2059 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC29612 = c2287.f6637;
        AbstractC2961 abstractC29613 = abstractC29612.f6633;
        if (abstractC29613 == null) {
            AbstractC2620.m3902(c2059, abstractC29612);
        } else {
            c2059.m2607(abstractC29613);
        }
        int i2 = 0;
        while (true) {
            int i3 = c2059.f3865;
            abstractC2961 = null;
            if (i3 == 0) {
                break;
            }
            AbstractC2961 abstractC2961M3899 = (AbstractC2961) c2059.m2613(i3 - 1);
            if ((abstractC2961M3899.f6630 & 1024) == 0) {
                AbstractC2620.m3902(c2059, abstractC2961M3899);
            } else {
                while (true) {
                    if (abstractC2961M3899 == null) {
                        break;
                    }
                    if ((abstractC2961M3899.f6636 & 1024) != 0) {
                        C2059 c20592 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof C2287) {
                                C2287 c22873 = (C2287) abstractC2961M3899;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = c22873;
                                i2 = i4;
                            } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i5 = 0;
                                for (AbstractC2961 abstractC29614 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29614 != null; abstractC29614 = abstractC29614.f6633) {
                                    if ((abstractC29614.f6636 & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            abstractC2961M3899 = abstractC29614;
                                        } else {
                                            if (c20592 == null) {
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c20592.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c20592.m2607(abstractC29614);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c20592);
                        }
                    } else {
                        abstractC2961M3899 = abstractC2961M3899.f6633;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i2, C2295.f4503);
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("This function should only be used for 1-D focus search");
                return false;
            }
            C7348 c7348M5627 = AbstractC3400.m5627(0, i2);
            int i6 = c7348M5627.f18163;
            int i7 = c7348M5627.f18161;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        C2287 c22874 = (C2287) objArr[i7];
                        if (m3182(c22874) && m3172(c22874, interfaceC7387)) {
                            break;
                        }
                    }
                    if (AbstractC5227.m9466(objArr[i7], c22872)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!c2287.f6637.f6624) {
                }
                AbstractC2961 abstractC29615 = c2287.f6637.f6629;
                c2583M3906 = AbstractC2620.m3906(c2287);
                loop5: while (true) {
                    if (c2583M3906 == null) {
                    }
                }
                if (abstractC2961 != null) {
                }
            }
            return false;
        }
        C7348 c7348M56272 = AbstractC3400.m5627(0, i2);
        int i8 = c7348M56272.f18163;
        int i9 = c7348M56272.f18161;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    C2287 c22875 = (C2287) objArr[i8];
                    if (m3182(c22875) && m3187(c22875, interfaceC7387)) {
                        break;
                    }
                }
                if (AbstractC5227.m9466(objArr[i8], c22872)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && c2287.m3160().f4525) {
            if (!c2287.f6637.f6624) {
                AbstractC8765.m13982("visitAncestors called on an unattached node");
            }
            AbstractC2961 abstractC296152 = c2287.f6637.f6629;
            c2583M3906 = AbstractC2620.m3906(c2287);
            loop5: while (true) {
                if (c2583M3906 == null) {
                    break;
                }
                if ((c2583M3906.f5439.f5628.f6630 & 1024) != 0) {
                    while (abstractC296152 != null) {
                        if ((abstractC296152.f6636 & 1024) != 0) {
                            AbstractC2961 abstractC2961M38992 = abstractC296152;
                            C2059 c20593 = null;
                            while (abstractC2961M38992 != null) {
                                if (abstractC2961M38992 instanceof C2287) {
                                    abstractC2961 = abstractC2961M38992;
                                    break loop5;
                                }
                                if ((abstractC2961M38992.f6636 & 1024) != 0 && (abstractC2961M38992 instanceof AbstractC2623)) {
                                    int i10 = 0;
                                    for (AbstractC2961 abstractC29616 = ((AbstractC2623) abstractC2961M38992).f5571; abstractC29616 != null; abstractC29616 = abstractC29616.f6633) {
                                        if ((abstractC29616.f6636 & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC2961M38992 = abstractC29616;
                                            } else {
                                                if (c20593 == null) {
                                                    c20593 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (abstractC2961M38992 != null) {
                                                    c20593.m2607(abstractC2961M38992);
                                                    abstractC2961M38992 = null;
                                                }
                                                c20593.m2607(abstractC29616);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC2961M38992 = AbstractC2620.m3899(c20593);
                            }
                        }
                        abstractC296152 = abstractC296152.f6629;
                    }
                }
                c2583M3906 = c2583M3906.m3816();
                abstractC296152 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
            }
            if (abstractC2961 != null) {
                return ((Boolean) interfaceC7387.invoke(c2287)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final boolean m3164(int i, C2287 c2287, InterfaceC7387 interfaceC7387, C8157 c8157) {
        C2287 c2287M3186;
        C2059 c2059 = new C2059(0, new C2287[16]);
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitChildren called on an unattached node");
        }
        C2059 c20592 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC2961 = c2287.f6637;
        AbstractC2961 abstractC29612 = abstractC2961.f6633;
        if (abstractC29612 == null) {
            AbstractC2620.m3902(c20592, abstractC2961);
        } else {
            c20592.m2607(abstractC29612);
        }
        while (true) {
            int i2 = c20592.f3865;
            if (i2 == 0) {
                break;
            }
            AbstractC2961 abstractC2961M3899 = (AbstractC2961) c20592.m2613(i2 - 1);
            if ((abstractC2961M3899.f6630 & 1024) == 0) {
                AbstractC2620.m3902(c20592, abstractC2961M3899);
            } else {
                while (true) {
                    if (abstractC2961M3899 == null) {
                        break;
                    }
                    if ((abstractC2961M3899.f6636 & 1024) != 0) {
                        C2059 c20593 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof C2287) {
                                C2287 c22872 = (C2287) abstractC2961M3899;
                                if (c22872.f6624) {
                                    c2059.m2607(c22872);
                                }
                            } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i3 = 0;
                                for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                    if ((abstractC29613.f6636 & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC2961M3899 = abstractC29613;
                                        } else {
                                            if (c20593 == null) {
                                                c20593 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c20593.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c20593.m2607(abstractC29613);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c20593);
                        }
                    } else {
                        abstractC2961M3899 = abstractC2961M3899.f6633;
                    }
                }
            }
        }
        while (c2059.f3865 != 0 && (c2287M3186 = m3186(c2059, c8157, i)) != null) {
            if (c2287M3186.m3160().f4525) {
                return ((Boolean) interfaceC7387.invoke(c2287M3186)).booleanValue();
            }
            if (m3188(i, c2287M3186, interfaceC7387, c8157)) {
                return true;
            }
            c2059.m2615(c2287M3186);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [T, androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏哲世兰, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏哲世兰, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final Object m3165(C2287 c2287, int i, InterfaceC7387 interfaceC7387) {
        int i2;
        int i3;
        Object objInvoke;
        AbstractC2961 abstractC2961M3899;
        InterfaceC2537 interfaceC2537M3154;
        int i4;
        C2646 c2646;
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC2961 = c2287.f6637.f6629;
        C2583 c2583M3906 = AbstractC2620.m3906(c2287);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (c2583M3906 == null) {
                abstractC2961M3899 = null;
                break;
            }
            if ((c2583M3906.f5439.f5628.f6630 & 1024) != 0) {
                while (abstractC2961 != null) {
                    if ((abstractC2961.f6636 & 1024) != 0) {
                        abstractC2961M3899 = abstractC2961;
                        C2059 c2059 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof C2287) {
                                break loop0;
                            }
                            if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i5 = 0;
                                for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                    if ((abstractC29612.f6636 & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            abstractC2961M3899 = abstractC29612;
                                        } else {
                                            if (c2059 == null) {
                                                c2059 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c2059.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c2059.m2607(abstractC29612);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c2059);
                        }
                    }
                    abstractC2961 = abstractC2961.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
        C2287 c22872 = (C2287) abstractC2961M3899;
        if ((c22872 == null || !AbstractC5227.m9466(c22872.m3154(), c2287.m3154())) && (interfaceC2537M3154 = c2287.m3154()) != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i6 = 2;
                            } else if (i == 2) {
                                i6 = 1;
                            } else {
                                C6755.m11870("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            C1560 c1560 = (C1560) interfaceC2537M3154;
            if (c1560.f2369.f2473.m2111().f2551 <= 0 || c1560.f2369.f2473.m2111().f2558.isEmpty() || !c1560.f6624) {
                return interfaceC7387.invoke(C1560.f2368);
            }
            boolean zM2075 = c1560.m2075(i6);
            C1583 c1583 = c1560.f2369;
            int iMin = zM2075 ? Math.min(c1583.f2473.m2111().f2551 - 1, ((C1590) AbstractC5176.m9367(c1583.f2473.m2111().f2558)).f2507) : Math.max(0, c1583.f2473.f2450.m2120());
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C1382 c1382 = c1560.f2371;
            c1382.getClass();
            ?? c1565 = new C1565(iMin, iMin);
            c1382.f1912.m2607(c1565);
            ref$ObjectRef.element = c1565;
            C1582 c1582 = c1560.f2369.f2473;
            if (c1582.m2111().f2558.isEmpty()) {
                i3 = 0;
            } else {
                C1598 c1598M2111 = c1582.m2111();
                int iM2126 = (int) (c1598M2111.f2554 == Orientation.Vertical ? c1598M2111.m2126() & 4294967295L : c1598M2111.m2126() >> 32);
                int iM2127 = AbstractC1600.m2127(c1582.m2111());
                if (iM2127 != 0 && (i4 = iM2126 / iM2127) >= 1) {
                    i3 = i4;
                }
            }
            int i7 = i3 * 2;
            int i8 = c1560.f2369.f2473.m2111().f2551;
            if (i7 > i8) {
                i7 = i8;
            }
            while (objInvoke == null && c1560.m2074((C1565) ref$ObjectRef.element, i6) && i2 < i7) {
                C1565 c15652 = (C1565) ref$ObjectRef.element;
                int i9 = c15652.f2380;
                int i10 = c15652.f2379;
                if (c1560.m2075(i6)) {
                    i10++;
                } else {
                    i9--;
                }
                C1382 c13822 = c1560.f2371;
                c13822.getClass();
                ?? c15653 = new C1565(i9, i10);
                c13822.f1912.m2607(c15653);
                c1560.f2371.f1912.m2615((C1565) ref$ObjectRef.element);
                ref$ObjectRef.element = c15653;
                i2++;
                AbstractC2620.m3906(c1560).m3825();
                objInvoke = interfaceC7387.invoke(new C1559(c1560, ref$ObjectRef, i6));
            }
            c1560.f2371.f1912.m2615((C1565) ref$ObjectRef.element);
            AbstractC2620.m3906(c1560).m3825();
            return objInvoke;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m3166(C2287 c2287, InterfaceC7387 interfaceC7387) {
        Object[] objArr = new C2287[16];
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitChildren called on an unattached node");
        }
        C2059 c2059 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC2961 = c2287.f6637;
        AbstractC2961 abstractC29612 = abstractC2961.f6633;
        if (abstractC29612 == null) {
            AbstractC2620.m3902(c2059, abstractC2961);
        } else {
            c2059.m2607(abstractC29612);
        }
        int i = 0;
        while (true) {
            int i2 = c2059.f3865;
            if (i2 == 0) {
                break;
            }
            AbstractC2961 abstractC2961M3899 = (AbstractC2961) c2059.m2613(i2 - 1);
            if ((abstractC2961M3899.f6630 & 1024) == 0) {
                AbstractC2620.m3902(c2059, abstractC2961M3899);
            } else {
                while (true) {
                    if (abstractC2961M3899 == null) {
                        break;
                    }
                    if ((abstractC2961M3899.f6636 & 1024) != 0) {
                        C2059 c20592 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof C2287) {
                                C2287 c22872 = (C2287) abstractC2961M3899;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c22872;
                                i = i3;
                            } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i4 = 0;
                                for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                    if ((abstractC29613.f6636 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC2961M3899 = abstractC29613;
                                        } else {
                                            if (c20592 == null) {
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c20592.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c20592.m2607(abstractC29613);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c20592);
                        }
                    } else {
                        abstractC2961M3899 = abstractC2961M3899.f6633;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, C2295.f4503);
        for (int i5 = 0; i5 < i; i5++) {
            C2287 c22873 = (C2287) objArr[i5];
            if (m3182(c22873) && m3187(c22873, interfaceC7387)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2287 m3167(C2287 c2287) {
        C2287 c2287M3203 = ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).m3203();
        if (c2287M3203 == null || !c2287M3203.f6624) {
            return null;
        }
        return c2287M3203;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m3168(C2287 c2287, C2059 c2059) {
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitChildren called on an unattached node");
        }
        C2059 c20592 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC2961 = c2287.f6637;
        AbstractC2961 abstractC29612 = abstractC2961.f6633;
        if (abstractC29612 == null) {
            AbstractC2620.m3902(c20592, abstractC2961);
        } else {
            c20592.m2607(abstractC29612);
        }
        while (true) {
            int i = c20592.f3865;
            if (i == 0) {
                return;
            }
            AbstractC2961 abstractC2961M3899 = (AbstractC2961) c20592.m2613(i - 1);
            if ((abstractC2961M3899.f6630 & 1024) == 0) {
                AbstractC2620.m3902(c20592, abstractC2961M3899);
            } else {
                while (true) {
                    if (abstractC2961M3899 == null) {
                        break;
                    }
                    if ((abstractC2961M3899.f6636 & 1024) != 0) {
                        C2059 c20593 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof C2287) {
                                C2287 c22872 = (C2287) abstractC2961M3899;
                                if (c22872.f6624 && !AbstractC2620.m3906(c22872).f5471) {
                                    if (c22872.m3160().f4525) {
                                        c2059.m2607(c22872);
                                    } else {
                                        m3168(c22872, c2059);
                                    }
                                }
                            } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i2 = 0;
                                for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                    if ((abstractC29613.f6636 & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC2961M3899 = abstractC29613;
                                        } else {
                                            if (c20593 == null) {
                                                c20593 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c20593.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c20593.m2607(abstractC29613);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c20593);
                        }
                    } else {
                        abstractC2961M3899 = abstractC2961M3899.f6633;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m3169(C2287 c2287, boolean z) {
        int i = AbstractC2286.f4491[c2287.m3157().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return z;
            }
            if (i == 3) {
                C2287 c2287M3179 = m3179(c2287);
                if (!(c2287M3179 != null ? m3169(c2287M3179, z) : true)) {
                    return false;
                }
                c2287.m3161(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                return true;
            }
            if (i != 4) {
                C5043.m9170();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m3170(int i, C8157 c8157, C8157 c81572) {
        if (i == 3 || i == 4) {
            return c8157.f19882 > c81572.f19884 && c8157.f19884 < c81572.f19882;
        }
        if (i == 5 || i == 6) {
            return c8157.f19883 > c81572.f19885 && c8157.f19885 < c81572.f19883;
        }
        C6755.m11870("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f19883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f19885 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f19882;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f19884 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        top.suzhelan.qstory.hook.item.C6755.m11870("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        top.suzhelan.qstory.hook.item.C6755.m11870("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m3171(C8157 c8157, C8157 c81572, C8157 c81573, int i) {
        boolean zM3170 = m3170(i, c81573, c8157);
        float f = c81573.f19884;
        float f2 = c81573.f19882;
        float f3 = c81573.f19885;
        float f4 = c81573.f19883;
        float f5 = c8157.f19882;
        float f6 = c8157.f19884;
        float f7 = c8157.f19883;
        float f8 = c8157.f19885;
        if (!zM3170 && m3170(i, c81572, c8157)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            C6755.m11870("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m3172(C2287 c2287, InterfaceC7387 interfaceC7387) {
        FocusStateImpl focusStateImplM3157 = c2287.m3157();
        int[] iArr = AbstractC2293.f4502;
        int i = iArr[focusStateImplM3157.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return m3176(c2287, interfaceC7387);
            }
            if (i != 4) {
                C5043.m9170();
                return false;
            }
            if (!m3176(c2287, interfaceC7387)) {
                if (!(c2287.m3160().f4525 ? ((Boolean) interfaceC7387.invoke(c2287)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        C2287 c2287M3179 = m3179(c2287);
        if (c2287M3179 == null) {
            C6755.m11870("ActiveParent must have a focusedChild");
            return false;
        }
        int i2 = iArr[c2287M3179.m3157().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return m3180(c2287, c2287M3179, 2, interfaceC7387);
            }
            if (i2 != 4) {
                C5043.m9170();
                return false;
            }
            C6755.m11870("ActiveParent must have a focusedChild");
            return false;
        }
        if (m3172(c2287M3179, interfaceC7387) || m3180(c2287, c2287M3179, 2, interfaceC7387) || (c2287M3179.m3160().f4525 && ((Boolean) interfaceC7387.invoke(c2287M3179)).booleanValue())) {
            return true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final CustomDestinationResult m3173(C2287 c2287, int i) {
        int i2 = AbstractC2286.f4491[c2287.m3157().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                C2287 c2287M3179 = m3179(c2287);
                if (c2287M3179 == null) {
                    C6755.m11869("ActiveParent with no focused child");
                    return null;
                }
                CustomDestinationResult customDestinationResultM3173 = m3173(c2287M3179, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
                CustomDestinationResult customDestinationResult2 = customDestinationResultM3173 != customDestinationResult ? customDestinationResultM3173 : null;
                if (customDestinationResult2 != null) {
                    return customDestinationResult2;
                }
                if (c2287.f4495) {
                    return customDestinationResult;
                }
                c2287.f4495 = true;
                try {
                    C2312 c2312M3160 = c2287.m3160();
                    C2302 c2302 = new C2302(i);
                    C2313 c2313 = (C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner();
                    C2287 c2287M3203 = c2313.m3203();
                    c2312M3160.f4528.invoke(c2302);
                    C2287 c2287M32032 = c2313.m3203();
                    if (!c2302.f4510) {
                        return (c2287M3203 == c2287M32032 || c2287M32032 == null) ? customDestinationResult : C2303.f4512 == C2303.f4513 ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                    }
                    C2303 c2303 = C2303.f4514;
                    return CustomDestinationResult.Cancelled;
                } finally {
                    c2287.f4495 = false;
                }
            }
            if (i2 != 4) {
                C5043.m9170();
                return null;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final InterfaceC2962 m3174(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        return interfaceC2962.mo4426(new C2301(interfaceC7387));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01b7 A[PHI: r16
  0x01b7: PHI (r16v2 androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲) = 
  (r16v1 androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲)
  (r16v1 androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲)
  (r16v1 androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲)
  (r16v4 androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲)
 binds: [B:95:0x0166, B:97:0x016c, B:99:0x0170, B:116:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0261 A[ADDED_TO_REGION, LOOP:9: B:159:0x0261->B:166:0x0275, LOOP_START, PHI: r14
  0x0261: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:158:0x025f, B:166:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0285  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m3175(final C2287 c2287) {
        C2059 c2059;
        int i;
        C2646 c2646;
        C2313 c2313;
        boolean z;
        int i2;
        C2059 c20592;
        int i3;
        int i4;
        C2646 c26462;
        C2313 c23132 = (C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner();
        C2287 c2287M3203 = c23132.m3203();
        FocusStateImpl focusStateImplM3157 = c2287.m3157();
        if (c2287M3203 == c2287) {
            c2287.m3161(focusStateImplM3157, focusStateImplM3157);
            return true;
        }
        if ((c2287M3203 == null || c2287M3203.f4492) && !c2287.f4492 && !((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).f4537.m4096()) {
            return false;
        }
        if (c2287M3203 != null) {
            c2059 = new C2059(0, new C2287[16]);
            if (!c2287M3203.f6637.f6624) {
                AbstractC8765.m13982("visitAncestors called on an unattached node");
            }
            AbstractC2961 abstractC2961 = c2287M3203.f6637.f6629;
            C2583 c2583M3906 = AbstractC2620.m3906(c2287M3203);
            while (c2583M3906 != null) {
                if ((c2583M3906.f5439.f5628.f6630 & 1024) != 0) {
                    while (abstractC2961 != null) {
                        if ((abstractC2961.f6636 & 1024) != 0) {
                            AbstractC2961 abstractC2961M3899 = abstractC2961;
                            C2059 c20593 = null;
                            while (abstractC2961M3899 != null) {
                                if (abstractC2961M3899 instanceof C2287) {
                                    c2059.m2607((C2287) abstractC2961M3899);
                                } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                    int i5 = 0;
                                    for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                        if ((abstractC29612.f6636 & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                abstractC2961M3899 = abstractC29612;
                                            } else {
                                                if (c20593 == null) {
                                                    c20593 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (abstractC2961M3899 != null) {
                                                    c20593.m2607(abstractC2961M3899);
                                                    abstractC2961M3899 = null;
                                                }
                                                c20593.m2607(abstractC29612);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2961M3899 = AbstractC2620.m3899(c20593);
                            }
                        }
                        abstractC2961 = abstractC2961.f6629;
                    }
                }
                c2583M3906 = c2583M3906.m3816();
                abstractC2961 = (c2583M3906 == null || (c26462 = c2583M3906.f5439) == null) ? null : c26462.f5629;
            }
        } else {
            c2059 = null;
        }
        Object[] objArr = new C2287[16];
        Object[] objArr2 = new C2287[16];
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC29613 = c2287.f6637.f6629;
        C2583 c2583M39062 = AbstractC2620.m3906(c2287);
        boolean z2 = true;
        int i6 = 0;
        int i7 = 0;
        while (c2583M39062 != null) {
            if ((c2583M39062.f5439.f5628.f6630 & 1024) != 0) {
                while (abstractC29613 != null) {
                    if ((abstractC29613.f6636 & 1024) != 0) {
                        AbstractC2961 abstractC2961M38992 = abstractC29613;
                        C2059 c20594 = null;
                        while (abstractC2961M38992 != null) {
                            if (abstractC2961M38992 instanceof C2287) {
                                C2287 c22872 = (C2287) abstractC2961M38992;
                                if (AbstractC5227.m9466(c2059 != null ? Boolean.valueOf(c2059.m2615(c22872)) : null, Boolean.TRUE)) {
                                    int i8 = i6 + 1;
                                    if (objArr.length < i8) {
                                        int length = objArr.length;
                                        c2313 = c23132;
                                        Object[] objArr3 = new Object[Math.max(i8, length * 2)];
                                        i4 = i8;
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    } else {
                                        c2313 = c23132;
                                        i4 = i8;
                                    }
                                    objArr[i6] = c22872;
                                    i6 = i4;
                                } else {
                                    c2313 = c23132;
                                    int i9 = i7 + 1;
                                    if (objArr2.length < i9) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i9, length2 * 2)];
                                        i3 = i9;
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    } else {
                                        i3 = i9;
                                    }
                                    objArr2[i7] = c22872;
                                    i7 = i3;
                                }
                                if (c22872 == c2287M3203) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                c2313 = c23132;
                                z = true;
                            }
                            if (z && (abstractC2961M38992.f6636 & 1024) != 0 && (abstractC2961M38992 instanceof AbstractC2623)) {
                                int i10 = 0;
                                for (AbstractC2961 abstractC29614 = ((AbstractC2623) abstractC2961M38992).f5571; abstractC29614 != null; abstractC29614 = abstractC29614.f6633) {
                                    if ((abstractC29614.f6636 & 1024) != 0) {
                                        int i11 = i10 + 1;
                                        if (i11 == 1) {
                                            abstractC2961M38992 = abstractC29614;
                                            i2 = i11;
                                        } else {
                                            if (c20594 == null) {
                                                i2 = i11;
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            } else {
                                                i2 = i11;
                                                c20592 = c20594;
                                            }
                                            if (abstractC2961M38992 != null) {
                                                c20592.m2607(abstractC2961M38992);
                                                abstractC2961M38992 = null;
                                            }
                                            c20592.m2607(abstractC29614);
                                            c20594 = c20592;
                                        }
                                        i10 = i2;
                                    }
                                }
                                if (i10 == 1) {
                                    c23132 = c2313;
                                }
                            } else {
                                abstractC2961M38992 = AbstractC2620.m3899(c20594);
                                c23132 = c2313;
                            }
                        }
                    }
                    abstractC29613 = abstractC29613.f6629;
                    c23132 = c23132;
                }
            }
            C2313 c23133 = c23132;
            c2583M39062 = c2583M39062.m3816();
            abstractC29613 = (c2583M39062 == null || (c2646 = c2583M39062.f5439) == null) ? null : c2646.f5629;
            c23132 = c23133;
        }
        C2313 c23134 = c23132;
        if (!z2 || c2287M3203 == null || m3169(c2287M3203, false)) {
            AbstractC2620.m3904(c2287, new InterfaceC7372() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
                {
                    super(0);
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3152invoke();
                    return C6008.f15084;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3152invoke() {
                    c2287.m3160();
                }
            });
            int i12 = AbstractC2286.f4491[c2287.m3157().ordinal()];
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3 && i12 != 4) {
                    C5043.m9170();
                    return false;
                }
                ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).m3205(c2287);
            }
            if (z2 && c2287M3203 != null) {
                c2287M3203.m3161(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
            if (c2059 != null) {
                int i13 = c2059.f3865 - 1;
                Object[] objArr5 = c2059.f3866;
                if (i13 < objArr5.length) {
                    while (i13 >= 0) {
                        C2287 c22873 = (C2287) objArr5[i13];
                        if (c23134.m3203() != c2287) {
                            break;
                        }
                        c22873.m3161(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                        i13--;
                    }
                    i = i7 - 1;
                    if (i >= objArr2.length) {
                        while (i >= 0) {
                            C2287 c22874 = (C2287) objArr2[i];
                            if (c23134.m3203() != c2287) {
                                break;
                            }
                            c22874.m3161(c22874 == c2287M3203 ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                            i--;
                        }
                        if (c23134.m3203() == c2287) {
                            c2287.m3161(focusStateImplM3157, FocusStateImpl.Active);
                            if (c23134.m3203() != c2287) {
                                break;
                            }
                            return true;
                        }
                    } else if (c23134.m3203() == c2287) {
                    }
                } else {
                    i = i7 - 1;
                    if (i >= objArr2.length) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m3176(C2287 c2287, InterfaceC7387 interfaceC7387) {
        Object[] objArr = new C2287[16];
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitChildren called on an unattached node");
        }
        C2059 c2059 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC2961 = c2287.f6637;
        AbstractC2961 abstractC29612 = abstractC2961.f6633;
        if (abstractC29612 == null) {
            AbstractC2620.m3902(c2059, abstractC2961);
        } else {
            c2059.m2607(abstractC29612);
        }
        int i = 0;
        while (true) {
            int i2 = c2059.f3865;
            if (i2 == 0) {
                break;
            }
            AbstractC2961 abstractC2961M3899 = (AbstractC2961) c2059.m2613(i2 - 1);
            if ((abstractC2961M3899.f6630 & 1024) == 0) {
                AbstractC2620.m3902(c2059, abstractC2961M3899);
            } else {
                while (true) {
                    if (abstractC2961M3899 == null) {
                        break;
                    }
                    if ((abstractC2961M3899.f6636 & 1024) != 0) {
                        C2059 c20592 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof C2287) {
                                C2287 c22872 = (C2287) abstractC2961M3899;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c22872;
                                i = i3;
                            } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i4 = 0;
                                for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                    if ((abstractC29613.f6636 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC2961M3899 = abstractC29613;
                                        } else {
                                            if (c20592 == null) {
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c20592.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c20592.m2607(abstractC29613);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c20592);
                        }
                    } else {
                        abstractC2961M3899 = abstractC2961M3899.f6633;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, C2295.f4503);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                C2287 c22873 = (C2287) objArr[i5];
                if (m3182(c22873) && m3172(c22873, interfaceC7387)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final CustomDestinationResult m3177(C2287 c2287, int i) {
        if (!c2287.f4494) {
            c2287.f4494 = true;
            try {
                C2312 c2312M3160 = c2287.m3160();
                C2302 c2302 = new C2302(i);
                C2313 c2313 = (C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner();
                C2287 c2287M3203 = c2313.m3203();
                c2312M3160.f4531.invoke(c2302);
                C2287 c2287M32032 = c2313.m3203();
                if (c2302.f4510) {
                    C2303 c2303 = C2303.f4514;
                    return CustomDestinationResult.Cancelled;
                }
                if (c2287M3203 != c2287M32032 && c2287M32032 != null) {
                    return C2303.f4512 == C2303.f4513 ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                }
            } finally {
                c2287.f4494 = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final CustomDestinationResult m3178(C2287 c2287, int i) {
        AbstractC2961 abstractC2961M3899;
        C2646 c2646;
        int i2 = AbstractC2286.f4491[c2287.m3157().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            C2287 c2287M3179 = m3179(c2287);
            if (c2287M3179 != null) {
                return m3173(c2287M3179, i);
            }
            C6755.m11869("ActiveParent with no focused child");
            return null;
        }
        if (i2 != 4) {
            C5043.m9170();
            return null;
        }
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC2961 = c2287.f6637.f6629;
        C2583 c2583M3906 = AbstractC2620.m3906(c2287);
        loop0: while (true) {
            if (c2583M3906 == null) {
                abstractC2961M3899 = null;
                break;
            }
            if ((c2583M3906.f5439.f5628.f6630 & 1024) != 0) {
                while (abstractC2961 != null) {
                    if ((abstractC2961.f6636 & 1024) != 0) {
                        abstractC2961M3899 = abstractC2961;
                        C2059 c2059 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof C2287) {
                                break loop0;
                            }
                            if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i3 = 0;
                                for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                    if ((abstractC29612.f6636 & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC2961M3899 = abstractC29612;
                                        } else {
                                            if (c2059 == null) {
                                                c2059 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c2059.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c2059.m2607(abstractC29612);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c2059);
                        }
                    }
                    abstractC2961 = abstractC2961.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
        C2287 c22872 = (C2287) abstractC2961M3899;
        if (c22872 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = AbstractC2286.f4491[c22872.m3157().ordinal()];
        if (i4 == 1) {
            return m3177(c22872, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return m3178(c22872, i);
        }
        if (i4 != 4) {
            C5043.m9170();
            return null;
        }
        CustomDestinationResult customDestinationResultM3178 = m3178(c22872, i);
        CustomDestinationResult customDestinationResult = customDestinationResultM3178 != CustomDestinationResult.None ? customDestinationResultM3178 : null;
        return customDestinationResult == null ? m3177(c22872, i) : customDestinationResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0027, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2287 m3179(C2287 c2287) {
        boolean z = c2287.f6637.f6624;
        if (z) {
            if (!z) {
                AbstractC8765.m13982("visitChildren called on an unattached node");
            }
            C2059 c2059 = new C2059(0, new AbstractC2961[16]);
            AbstractC2961 abstractC2961 = c2287.f6637;
            AbstractC2961 abstractC29612 = abstractC2961.f6633;
            if (abstractC29612 == null) {
                AbstractC2620.m3902(c2059, abstractC2961);
            } else {
                c2059.m2607(abstractC29612);
            }
            loop0: while (true) {
                int i = c2059.f3865;
                if (i == 0) {
                    break;
                }
                AbstractC2961 abstractC2961M3899 = (AbstractC2961) c2059.m2613(i - 1);
                if ((abstractC2961M3899.f6630 & 1024) == 0) {
                    AbstractC2620.m3902(c2059, abstractC2961M3899);
                } else {
                    while (true) {
                        if (abstractC2961M3899 == null) {
                            break;
                        }
                        if ((abstractC2961M3899.f6636 & 1024) != 0) {
                            C2059 c20592 = null;
                            while (abstractC2961M3899 != null) {
                                if (abstractC2961M3899 instanceof C2287) {
                                    C2287 c22872 = (C2287) abstractC2961M3899;
                                    if (c22872.f6637.f6624) {
                                        int i2 = AbstractC2296.f4504[c22872.m3157().ordinal()];
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            break loop0;
                                        }
                                        if (i2 != 4) {
                                            C5043.m9170();
                                            return null;
                                        }
                                    }
                                } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                    int i3 = 0;
                                    for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                        if ((abstractC29613.f6636 & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                abstractC2961M3899 = abstractC29613;
                                            } else {
                                                if (c20592 == null) {
                                                    c20592 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (abstractC2961M3899 != null) {
                                                    c20592.m2607(abstractC2961M3899);
                                                    abstractC2961M3899 = null;
                                                }
                                                c20592.m2607(abstractC29613);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC2961M3899 = AbstractC2620.m3899(c20592);
                            }
                        } else {
                            abstractC2961M3899 = abstractC2961M3899.f6633;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m3180(final C2287 c2287, final C2287 c22872, final int i, final InterfaceC7387 interfaceC7387) {
        if (m3163(c2287, c22872, i, interfaceC7387)) {
            return true;
        }
        final C2287 c2287M3203 = ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).m3203();
        Boolean bool = (Boolean) m3165(c2287, i, new InterfaceC7387() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final Boolean invoke(InterfaceC2538 interfaceC2538) {
                if (c2287M3203 != ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).m3203()) {
                    return Boolean.TRUE;
                }
                boolean zM3163 = AbstractC2294.m3163(c2287, c22872, i, interfaceC7387);
                Boolean boolValueOf = Boolean.valueOf(zM3163);
                if (zM3163 || !interfaceC2538.mo2073()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final long m3181(int i, C8157 c8157, C8157 c81572) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = c8157.f19885;
            f2 = c81572.f19883;
        } else if (i == 4) {
            f = c81572.f19885;
            f2 = c8157.f19883;
        } else if (i == 5) {
            f = c8157.f19884;
            f2 = c81572.f19882;
        } else {
            if (i != 6) {
                C6755.m11870("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = c81572.f19884;
            f2 = c8157.f19882;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = c8157.f19884;
            f3 = ((c8157.f19882 - f7) / 2.0f) + f7;
            f4 = c81572.f19884;
            f5 = c81572.f19882;
        } else {
            if (i != 5 && i != 6) {
                C6755.m11870("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = c8157.f19885;
            f3 = ((c8157.f19883 - f8) / 2.0f) + f8;
            f4 = c81572.f19885;
            f5 = c81572.f19883;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean m3182(C2287 c2287) {
        C2583 c2583;
        AbstractC2629 abstractC2629;
        C2583 c25832;
        AbstractC2629 abstractC26292 = c2287.f6631;
        return (abstractC26292 == null || (c2583 = abstractC26292.f5604) == null || !c2583.m3802() || (abstractC2629 = c2287.f6631) == null || (c25832 = abstractC2629.f5604) == null || !c25832.m3803()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m3183(C8157 c8157, C8157 c81572, C8157 c81573, int i) {
        if (!m3184(i, c8157, c81573)) {
            return false;
        }
        if (m3184(i, c81572, c81573) && !m3171(c81573, c8157, c81572, i)) {
            return !m3171(c81573, c81572, c8157, i) && m3181(i, c81573, c8157) < m3181(i, c81573, c81572);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m3184(int i, C8157 c8157, C8157 c81572) {
        if (i == 3) {
            float f = c81572.f19883;
            float f2 = c81572.f19885;
            float f3 = c8157.f19883;
            return (f > f3 || f2 >= f3) && f2 > c8157.f19885;
        }
        if (i == 4) {
            float f4 = c81572.f19885;
            float f5 = c81572.f19883;
            float f6 = c8157.f19885;
            return (f4 < f6 || f5 <= f6) && f5 < c8157.f19883;
        }
        if (i == 5) {
            float f7 = c81572.f19882;
            float f8 = c81572.f19884;
            float f9 = c8157.f19882;
            return (f7 > f9 || f8 >= f9) && f8 > c8157.f19884;
        }
        if (i != 6) {
            C6755.m11870("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = c81572.f19884;
        float f11 = c81572.f19882;
        float f12 = c8157.f19884;
        return (f10 < f12 || f11 <= f12) && f11 < c8157.f19882;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m3185(C2287 c2287, int i, InterfaceC7387 interfaceC7387) {
        C8157 c8157;
        C2059 c2059 = new C2059(0, new C2287[16]);
        m3168(c2287, c2059);
        int i2 = c2059.f3865;
        if (i2 <= 1) {
            C2287 c22872 = (C2287) (i2 == 0 ? null : c2059.f3866[0]);
            if (c22872 != null) {
                return ((Boolean) interfaceC7387.invoke(c22872)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C8157 c8157M3189 = m3189(c2287);
                float f = c8157M3189.f19885;
                float f2 = c8157M3189.f19884;
                c8157 = new C8157(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C6755.m11870("This function should only be used for 2-D focus search");
                    return false;
                }
                C8157 c8157M31892 = m3189(c2287);
                float f3 = c8157M31892.f19883;
                float f4 = c8157M31892.f19882;
                c8157 = new C8157(f3, f4, f3, f4);
            }
            C2287 c2287M3186 = m3186(c2059, c8157, i);
            if (c2287M3186 != null) {
                return ((Boolean) interfaceC7387.invoke(c2287M3186)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2287 m3186(C2059 c2059, C8157 c8157, int i) {
        C8157 c8157M13081;
        C2287 c2287 = null;
        if (i == 3) {
            c8157M13081 = c8157.m13081((c8157.f19883 - c8157.f19885) + 1.0f, 0.0f);
        } else if (i == 4) {
            c8157M13081 = c8157.m13081(-((c8157.f19883 - c8157.f19885) + 1.0f), 0.0f);
        } else if (i == 5) {
            c8157M13081 = c8157.m13081(0.0f, (c8157.f19882 - c8157.f19884) + 1.0f);
        } else {
            if (i != 6) {
                C6755.m11870("This function should only be used for 2-D focus search");
                return null;
            }
            c8157M13081 = c8157.m13081(0.0f, -((c8157.f19882 - c8157.f19884) + 1.0f));
        }
        Object[] objArr = c2059.f3866;
        int i2 = c2059.f3865;
        for (int i3 = 0; i3 < i2; i3++) {
            C2287 c22872 = (C2287) objArr[i3];
            if (m3182(c22872)) {
                C8157 c8157M3189 = m3189(c22872);
                if (m3183(c8157M3189, c8157M13081, c8157, i)) {
                    c2287 = c22872;
                    c8157M13081 = c8157M3189;
                }
            }
        }
        return c2287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m3187(C2287 c2287, InterfaceC7387 interfaceC7387) {
        int i = AbstractC2293.f4502[c2287.m3157().ordinal()];
        if (i == 1) {
            C2287 c2287M3179 = m3179(c2287);
            if (c2287M3179 != null) {
                return m3187(c2287M3179, interfaceC7387) || m3180(c2287, c2287M3179, 1, interfaceC7387);
            }
            C6755.m11870("ActiveParent must have a focusedChild");
            return false;
        }
        if (i == 2 || i == 3) {
            return m3166(c2287, interfaceC7387);
        }
        if (i == 4) {
            return c2287.m3160().f4525 ? ((Boolean) interfaceC7387.invoke(c2287)).booleanValue() : m3166(c2287, interfaceC7387);
        }
        C5043.m9170();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final boolean m3188(final int i, final C2287 c2287, final InterfaceC7387 interfaceC7387, final C8157 c8157) {
        if (m3164(i, c2287, interfaceC7387, c8157)) {
            return true;
        }
        final C2287 c2287M3203 = ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).m3203();
        Boolean bool = (Boolean) m3165(c2287, i, new InterfaceC7387() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final Boolean invoke(InterfaceC2538 interfaceC2538) {
                if (c2287M3203 != ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).m3203()) {
                    return Boolean.TRUE;
                }
                boolean zM3164 = AbstractC2294.m3164(i, c2287, interfaceC7387, c8157);
                Boolean boolValueOf = Boolean.valueOf(zM3164);
                if (zM3164 || !interfaceC2538.mo2073()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8157 m3189(C2287 c2287) {
        AbstractC2629 abstractC2629;
        if (c2287.f6624 && (abstractC2629 = c2287.f6631) != null) {
            InterfaceC2530 interfaceC2530M3673 = AbstractC2505.m3673(abstractC2629);
            if (!interfaceC2530M3673.mo3646()) {
                interfaceC2530M3673 = null;
            }
            if (interfaceC2530M3673 != null) {
                return c2287.m3155(interfaceC2530M3673);
            }
        }
        return C8157.f19881;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final InterfaceC2962 m3190(InterfaceC2962 interfaceC2962, C2303 c2303) {
        return interfaceC2962.mo4426(new C2307(c2303));
    }
}
