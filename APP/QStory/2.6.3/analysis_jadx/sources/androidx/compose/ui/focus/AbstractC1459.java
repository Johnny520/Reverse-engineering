package androidx.compose.ui.focus;

import androidx.compose.foundation.gestures.C0541;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.AbstractC0759;
import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.lazy.C0742;
import androidx.compose.foundation.lazy.C0749;
import androidx.compose.foundation.lazy.C0757;
import androidx.compose.foundation.lazy.layout.C0718;
import androidx.compose.foundation.lazy.layout.C0719;
import androidx.compose.foundation.lazy.layout.C0724;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.layout.InterfaceC1702;
import androidx.compose.ui.layout.InterfaceC1703;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import io.ktor.util.C4211;
import java.util.Arrays;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;
import p112.C7328;
import p210.AbstractC7936;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1459 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Boolean m2602(int i, C1452 c1452, InterfaceC6558 interfaceC6558, C7328 c7328) {
        FocusStateImpl focusStateImplM2597 = c1452.m2597();
        int[] iArr = AbstractC1457.f4156;
        int i2 = iArr[focusStateImplM2597.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m2625(c1452, i, interfaceC6558));
            }
            if (i2 == 4) {
                return c1452.m2600().f4180 ? (Boolean) interfaceC6558.invoke(c1452) : c7328 == null ? Boolean.valueOf(m2625(c1452, i, interfaceC6558)) : Boolean.valueOf(m2604(i, c1452, interfaceC6558, c7328));
            }
            C4211.m8611();
            return null;
        }
        C1452 c1452M2619 = m2619(c1452);
        if (c1452M2619 == null) {
            C5925.m11311("ActiveParent must have a focusedChild");
            return null;
        }
        int i3 = iArr[c1452M2619.m2597().ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                if (c7328 == null) {
                    c7328 = m2629(c1452M2619);
                }
                return Boolean.valueOf(m2628(i, c1452, interfaceC6558, c7328));
            }
            if (i3 != 4) {
                C4211.m8611();
                return null;
            }
            C5925.m11311("ActiveParent must have a focusedChild");
            return null;
        }
        Boolean boolM2602 = m2602(i, c1452M2619, interfaceC6558, c7328);
        if (!AbstractC4395.m8907(boolM2602, Boolean.FALSE)) {
            return boolM2602;
        }
        if (c7328 == null) {
            if (c1452M2619.m2597() != FocusStateImpl.ActiveParent) {
                C5925.m11311("Searching for active node in inactive hierarchy");
                return null;
            }
            C1452 c1452M2607 = m2607(c1452M2619);
            if (c1452M2607 == null) {
                C5925.m11311("ActiveParent must have a focusedChild");
                return null;
            }
            c7328 = m2629(c1452M2607);
        }
        return Boolean.valueOf(m2628(i, c1452, interfaceC6558, c7328));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m2603(androidx.compose.ui.focus.C1452 r12, androidx.compose.ui.focus.C1452 r13, int r14, p052.InterfaceC6558 r15) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2603(androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲, androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲, int, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final boolean m2604(int i, C1452 c1452, InterfaceC6558 interfaceC6558, C7328 c7328) {
        C1452 c1452M2626;
        C1224 c1224 = new C1224(0, new C1452[16]);
        if (!c1452.f6292.f6279) {
            AbstractC7936.m13423("visitChildren called on an unattached node");
        }
        C1224 c12242 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6292;
        AbstractC2128 abstractC21282 = abstractC2128.f6288;
        if (abstractC21282 == null) {
            AbstractC1785.m3342(c12242, abstractC2128);
        } else {
            c12242.m2047(abstractC21282);
        }
        while (true) {
            int i2 = c12242.f3520;
            if (i2 == 0) {
                break;
            }
            AbstractC2128 abstractC2128M3339 = (AbstractC2128) c12242.m2053(i2 - 1);
            if ((abstractC2128M3339.f6285 & 1024) == 0) {
                AbstractC1785.m3342(c12242, abstractC2128M3339);
            } else {
                while (true) {
                    if (abstractC2128M3339 == null) {
                        break;
                    }
                    if ((abstractC2128M3339.f6291 & 1024) != 0) {
                        C1224 c12243 = null;
                        while (abstractC2128M3339 != null) {
                            if (abstractC2128M3339 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3339;
                                if (c14522.f6279) {
                                    c1224.m2047(c14522);
                                }
                            } else if ((abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                int i3 = 0;
                                for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21283 != null; abstractC21283 = abstractC21283.f6288) {
                                    if ((abstractC21283.f6291 & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC2128M3339 = abstractC21283;
                                        } else {
                                            if (c12243 == null) {
                                                c12243 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3339 != null) {
                                                c12243.m2047(abstractC2128M3339);
                                                abstractC2128M3339 = null;
                                            }
                                            c12243.m2047(abstractC21283);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC2128M3339 = AbstractC1785.m3339(c12243);
                        }
                    } else {
                        abstractC2128M3339 = abstractC2128M3339.f6288;
                    }
                }
            }
        }
        while (c1224.f3520 != 0 && (c1452M2626 = m2626(c1224, c7328, i)) != null) {
            if (c1452M2626.m2600().f4180) {
                return ((Boolean) interfaceC6558.invoke(c1452M2626)).booleanValue();
            }
            if (m2628(i, c1452M2626, interfaceC6558, c7328)) {
                return true;
            }
            c1224.m2055(c1452M2626);
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
    public static final Object m2605(C1452 c1452, int i, InterfaceC6558 interfaceC6558) {
        int i2;
        int i3;
        Object objInvoke;
        AbstractC2128 abstractC2128M3339;
        InterfaceC1702 interfaceC1702M2594;
        int i4;
        C1811 c1811;
        if (!c1452.f6292.f6279) {
            AbstractC7936.m13423("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = c1452.f6292.f6284;
        C1748 c1748M3346 = AbstractC1785.m3346(c1452);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (c1748M3346 == null) {
                abstractC2128M3339 = null;
                break;
            }
            if ((c1748M3346.f5094.f5283.f6285 & 1024) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6291 & 1024) != 0) {
                        abstractC2128M3339 = abstractC2128;
                        C1224 c1224 = null;
                        while (abstractC2128M3339 != null) {
                            if (abstractC2128M3339 instanceof C1452) {
                                break loop0;
                            }
                            if ((abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                int i5 = 0;
                                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
                                    if ((abstractC21282.f6291 & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            abstractC2128M3339 = abstractC21282;
                                        } else {
                                            if (c1224 == null) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3339 != null) {
                                                c1224.m2047(abstractC2128M3339);
                                                abstractC2128M3339 = null;
                                            }
                                            c1224.m2047(abstractC21282);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC2128M3339 = AbstractC1785.m3339(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6284;
                }
            }
            c1748M3346 = c1748M3346.m3256();
            abstractC2128 = (c1748M3346 == null || (c1811 = c1748M3346.f5094) == null) ? null : c1811.f5284;
        }
        C1452 c14522 = (C1452) abstractC2128M3339;
        if ((c14522 == null || !AbstractC4395.m8907(c14522.m2594(), c1452.m2594())) && (interfaceC1702M2594 = c1452.m2594()) != null) {
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
                                C5925.m11311("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            C0719 c0719 = (C0719) interfaceC1702M2594;
            if (c0719.f2024.f2128.m1551().f2206 <= 0 || c0719.f2024.f2128.m1551().f2213.isEmpty() || !c0719.f6279) {
                return interfaceC6558.invoke(C0719.f2023);
            }
            boolean zM1515 = c0719.m1515(i6);
            C0742 c0742 = c0719.f2024;
            int iMin = zM1515 ? Math.min(c0742.f2128.m1551().f2206 - 1, ((C0749) AbstractC4344.m8808(c0742.f2128.m1551().f2213)).f2162) : Math.max(0, c0742.f2128.f2105.m1560());
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C0541 c0541 = c0719.f2026;
            c0541.getClass();
            ?? c0724 = new C0724(iMin, iMin);
            c0541.f1567.m2047(c0724);
            ref$ObjectRef.element = c0724;
            C0741 c0741 = c0719.f2024.f2128;
            if (c0741.m1551().f2213.isEmpty()) {
                i3 = 0;
            } else {
                C0757 c0757M1551 = c0741.m1551();
                int iM1566 = (int) (c0757M1551.f2209 == Orientation.Vertical ? c0757M1551.m1566() & 4294967295L : c0757M1551.m1566() >> 32);
                int iM1567 = AbstractC0759.m1567(c0741.m1551());
                if (iM1567 != 0 && (i4 = iM1566 / iM1567) >= 1) {
                    i3 = i4;
                }
            }
            int i7 = i3 * 2;
            int i8 = c0719.f2024.f2128.m1551().f2206;
            if (i7 > i8) {
                i7 = i8;
            }
            while (objInvoke == null && c0719.m1514((C0724) ref$ObjectRef.element, i6) && i2 < i7) {
                C0724 c07242 = (C0724) ref$ObjectRef.element;
                int i9 = c07242.f2035;
                int i10 = c07242.f2034;
                if (c0719.m1515(i6)) {
                    i10++;
                } else {
                    i9--;
                }
                C0541 c05412 = c0719.f2026;
                c05412.getClass();
                ?? c07243 = new C0724(i9, i10);
                c05412.f1567.m2047(c07243);
                c0719.f2026.f1567.m2055((C0724) ref$ObjectRef.element);
                ref$ObjectRef.element = c07243;
                i2++;
                AbstractC1785.m3346(c0719).m3265();
                objInvoke = interfaceC6558.invoke(new C0718(c0719, ref$ObjectRef, i6));
            }
            c0719.f2026.f1567.m2055((C0724) ref$ObjectRef.element);
            AbstractC1785.m3346(c0719).m3265();
            return objInvoke;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m2606(C1452 c1452, InterfaceC6558 interfaceC6558) {
        Object[] objArr = new C1452[16];
        if (!c1452.f6292.f6279) {
            AbstractC7936.m13423("visitChildren called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6292;
        AbstractC2128 abstractC21282 = abstractC2128.f6288;
        if (abstractC21282 == null) {
            AbstractC1785.m3342(c1224, abstractC2128);
        } else {
            c1224.m2047(abstractC21282);
        }
        int i = 0;
        while (true) {
            int i2 = c1224.f3520;
            if (i2 == 0) {
                break;
            }
            AbstractC2128 abstractC2128M3339 = (AbstractC2128) c1224.m2053(i2 - 1);
            if ((abstractC2128M3339.f6285 & 1024) == 0) {
                AbstractC1785.m3342(c1224, abstractC2128M3339);
            } else {
                while (true) {
                    if (abstractC2128M3339 == null) {
                        break;
                    }
                    if ((abstractC2128M3339.f6291 & 1024) != 0) {
                        C1224 c12242 = null;
                        while (abstractC2128M3339 != null) {
                            if (abstractC2128M3339 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3339;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c14522;
                                i = i3;
                            } else if ((abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                int i4 = 0;
                                for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21283 != null; abstractC21283 = abstractC21283.f6288) {
                                    if ((abstractC21283.f6291 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC2128M3339 = abstractC21283;
                                        } else {
                                            if (c12242 == null) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3339 != null) {
                                                c12242.m2047(abstractC2128M3339);
                                                abstractC2128M3339 = null;
                                            }
                                            c12242.m2047(abstractC21283);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2128M3339 = AbstractC1785.m3339(c12242);
                        }
                    } else {
                        abstractC2128M3339 = abstractC2128M3339.f6288;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, C1460.f4158);
        for (int i5 = 0; i5 < i; i5++) {
            C1452 c14523 = (C1452) objArr[i5];
            if (m2622(c14523) && m2627(c14523, interfaceC6558)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1452 m2607(C1452 c1452) {
        C1452 c1452M2643 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner()).m2643();
        if (c1452M2643 == null || !c1452M2643.f6279) {
            return null;
        }
        return c1452M2643;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m2608(C1452 c1452, C1224 c1224) {
        if (!c1452.f6292.f6279) {
            AbstractC7936.m13423("visitChildren called on an unattached node");
        }
        C1224 c12242 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6292;
        AbstractC2128 abstractC21282 = abstractC2128.f6288;
        if (abstractC21282 == null) {
            AbstractC1785.m3342(c12242, abstractC2128);
        } else {
            c12242.m2047(abstractC21282);
        }
        while (true) {
            int i = c12242.f3520;
            if (i == 0) {
                return;
            }
            AbstractC2128 abstractC2128M3339 = (AbstractC2128) c12242.m2053(i - 1);
            if ((abstractC2128M3339.f6285 & 1024) == 0) {
                AbstractC1785.m3342(c12242, abstractC2128M3339);
            } else {
                while (true) {
                    if (abstractC2128M3339 == null) {
                        break;
                    }
                    if ((abstractC2128M3339.f6291 & 1024) != 0) {
                        C1224 c12243 = null;
                        while (abstractC2128M3339 != null) {
                            if (abstractC2128M3339 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3339;
                                if (c14522.f6279 && !AbstractC1785.m3346(c14522).f5126) {
                                    if (c14522.m2600().f4180) {
                                        c1224.m2047(c14522);
                                    } else {
                                        m2608(c14522, c1224);
                                    }
                                }
                            } else if ((abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                int i2 = 0;
                                for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21283 != null; abstractC21283 = abstractC21283.f6288) {
                                    if ((abstractC21283.f6291 & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC2128M3339 = abstractC21283;
                                        } else {
                                            if (c12243 == null) {
                                                c12243 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3339 != null) {
                                                c12243.m2047(abstractC2128M3339);
                                                abstractC2128M3339 = null;
                                            }
                                            c12243.m2047(abstractC21283);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC2128M3339 = AbstractC1785.m3339(c12243);
                        }
                    } else {
                        abstractC2128M3339 = abstractC2128M3339.f6288;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m2609(C1452 c1452, boolean z) {
        int i = AbstractC1451.f4146[c1452.m2597().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return z;
            }
            if (i == 3) {
                C1452 c1452M2619 = m2619(c1452);
                if (!(c1452M2619 != null ? m2609(c1452M2619, z) : true)) {
                    return false;
                }
                c1452.m2601(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                return true;
            }
            if (i != 4) {
                C4211.m8611();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m2610(int i, C7328 c7328, C7328 c73282) {
        if (i == 3 || i == 4) {
            return c7328.f19537 > c73282.f19539 && c7328.f19539 < c73282.f19537;
        }
        if (i == 5 || i == 6) {
            return c7328.f19538 > c73282.f19540 && c7328.f19540 < c73282.f19538;
        }
        C5925.m11311("This function should only be used for 2-D focus search");
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
    
        r1 = r11 - r19.f19538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f19540 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f19537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f19539 - r8;
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
    
        top.suzhelan.qstory.hook.item.C5925.m11311("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        top.suzhelan.qstory.hook.item.C5925.m11311("This function should only be used for 2-D focus search");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m2611(p112.C7328 r18, p112.C7328 r19, p112.C7328 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = m2610(r3, r2, r0)
            float r5 = r2.f19539
            float r6 = r2.f19537
            float r7 = r2.f19540
            float r2 = r2.f19538
            float r8 = r0.f19537
            float r9 = r0.f19539
            float r10 = r0.f19538
            float r11 = r0.f19540
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = m2610(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f19538
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f19540
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f19537
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.f19539
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return r12
        L94:
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return r12
        L98:
            return r18
        L99:
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2611(飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m2612(androidx.compose.ui.focus.C1452 r9, p052.InterfaceC6558 r10) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r9.m2597()
            int[] r1 = androidx.compose.ui.focus.AbstractC1458.f4157
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == r6) goto L3f
            if (r0 == r5) goto L3a
            if (r0 == r3) goto L3a
            if (r0 != r2) goto L36
            boolean r0 = m2616(r9, r10)
            if (r0 != 0) goto L88
            androidx.compose.ui.focus.飘花落叶言子楪哲兰苏世 r0 = r9.m2600()
            boolean r0 = r0.f4180
            if (r0 == 0) goto L32
            java.lang.Object r9 = r10.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L33
        L32:
            r9 = r4
        L33:
            if (r9 == 0) goto L87
            goto L88
        L36:
            io.ktor.util.C4211.m8611()
            return r4
        L3a:
            boolean r9 = m2616(r9, r10)
            return r9
        L3f:
            androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲 r0 = m2619(r9)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L89
            androidx.compose.ui.focus.FocusStateImpl r8 = r0.m2597()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L66
            if (r1 == r5) goto L61
            if (r1 == r3) goto L61
            if (r1 == r2) goto L5d
            io.ktor.util.C4211.m8611()
            return r4
        L5d:
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r4
        L61:
            boolean r9 = m2620(r9, r0, r5, r10)
            return r9
        L66:
            boolean r1 = m2612(r0, r10)
            if (r1 != 0) goto L88
            boolean r9 = m2620(r9, r0, r5, r10)
            if (r9 != 0) goto L88
            androidx.compose.ui.focus.飘花落叶言子楪哲兰苏世 r9 = r0.m2600()
            boolean r9 = r9.f4180
            if (r9 == 0) goto L87
            java.lang.Object r9 = r10.invoke(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L87
            goto L88
        L87:
            return r4
        L88:
            return r6
        L89:
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2612(androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final CustomDestinationResult m2613(C1452 c1452, int i) {
        int i2 = AbstractC1451.f4146[c1452.m2597().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                C1452 c1452M2619 = m2619(c1452);
                if (c1452M2619 == null) {
                    C5925.m11310("ActiveParent with no focused child");
                    return null;
                }
                CustomDestinationResult customDestinationResultM2613 = m2613(c1452M2619, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
                CustomDestinationResult customDestinationResult2 = customDestinationResultM2613 != customDestinationResult ? customDestinationResultM2613 : null;
                if (customDestinationResult2 != null) {
                    return customDestinationResult2;
                }
                if (c1452.f4150) {
                    return customDestinationResult;
                }
                c1452.f4150 = true;
                try {
                    C1477 c1477M2600 = c1452.m2600();
                    C1467 c1467 = new C1467(i);
                    C1478 c1478 = (C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner();
                    C1452 c1452M2643 = c1478.m2643();
                    c1477M2600.f4183.invoke(c1467);
                    C1452 c1452M26432 = c1478.m2643();
                    if (!c1467.f4165) {
                        return (c1452M2643 == c1452M26432 || c1452M26432 == null) ? customDestinationResult : C1468.f4167 == C1468.f4168 ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                    }
                    C1468 c1468 = C1468.f4169;
                    return CustomDestinationResult.Cancelled;
                } finally {
                    c1452.f4150 = false;
                }
            }
            if (i2 != 4) {
                C4211.m8611();
                return null;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final InterfaceC2129 m2614(InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC6558) {
        return interfaceC2129.mo3866(new C1466(interfaceC6558));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m2615(final androidx.compose.ui.focus.C1452 r22) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2615(androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m2616(C1452 c1452, InterfaceC6558 interfaceC6558) {
        Object[] objArr = new C1452[16];
        if (!c1452.f6292.f6279) {
            AbstractC7936.m13423("visitChildren called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6292;
        AbstractC2128 abstractC21282 = abstractC2128.f6288;
        if (abstractC21282 == null) {
            AbstractC1785.m3342(c1224, abstractC2128);
        } else {
            c1224.m2047(abstractC21282);
        }
        int i = 0;
        while (true) {
            int i2 = c1224.f3520;
            if (i2 == 0) {
                break;
            }
            AbstractC2128 abstractC2128M3339 = (AbstractC2128) c1224.m2053(i2 - 1);
            if ((abstractC2128M3339.f6285 & 1024) == 0) {
                AbstractC1785.m3342(c1224, abstractC2128M3339);
            } else {
                while (true) {
                    if (abstractC2128M3339 == null) {
                        break;
                    }
                    if ((abstractC2128M3339.f6291 & 1024) != 0) {
                        C1224 c12242 = null;
                        while (abstractC2128M3339 != null) {
                            if (abstractC2128M3339 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3339;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c14522;
                                i = i3;
                            } else if ((abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                int i4 = 0;
                                for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21283 != null; abstractC21283 = abstractC21283.f6288) {
                                    if ((abstractC21283.f6291 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC2128M3339 = abstractC21283;
                                        } else {
                                            if (c12242 == null) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3339 != null) {
                                                c12242.m2047(abstractC2128M3339);
                                                abstractC2128M3339 = null;
                                            }
                                            c12242.m2047(abstractC21283);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2128M3339 = AbstractC1785.m3339(c12242);
                        }
                    } else {
                        abstractC2128M3339 = abstractC2128M3339.f6288;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, C1460.f4158);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                C1452 c14523 = (C1452) objArr[i5];
                if (m2622(c14523) && m2612(c14523, interfaceC6558)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final CustomDestinationResult m2617(C1452 c1452, int i) {
        if (!c1452.f4149) {
            c1452.f4149 = true;
            try {
                C1477 c1477M2600 = c1452.m2600();
                C1467 c1467 = new C1467(i);
                C1478 c1478 = (C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner();
                C1452 c1452M2643 = c1478.m2643();
                c1477M2600.f4186.invoke(c1467);
                C1452 c1452M26432 = c1478.m2643();
                if (c1467.f4165) {
                    C1468 c1468 = C1468.f4169;
                    return CustomDestinationResult.Cancelled;
                }
                if (c1452M2643 != c1452M26432 && c1452M26432 != null) {
                    return C1468.f4167 == C1468.f4168 ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                }
            } finally {
                c1452.f4149 = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final CustomDestinationResult m2618(C1452 c1452, int i) {
        AbstractC2128 abstractC2128M3339;
        C1811 c1811;
        int i2 = AbstractC1451.f4146[c1452.m2597().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            C1452 c1452M2619 = m2619(c1452);
            if (c1452M2619 != null) {
                return m2613(c1452M2619, i);
            }
            C5925.m11310("ActiveParent with no focused child");
            return null;
        }
        if (i2 != 4) {
            C4211.m8611();
            return null;
        }
        if (!c1452.f6292.f6279) {
            AbstractC7936.m13423("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = c1452.f6292.f6284;
        C1748 c1748M3346 = AbstractC1785.m3346(c1452);
        loop0: while (true) {
            if (c1748M3346 == null) {
                abstractC2128M3339 = null;
                break;
            }
            if ((c1748M3346.f5094.f5283.f6285 & 1024) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6291 & 1024) != 0) {
                        abstractC2128M3339 = abstractC2128;
                        C1224 c1224 = null;
                        while (abstractC2128M3339 != null) {
                            if (abstractC2128M3339 instanceof C1452) {
                                break loop0;
                            }
                            if ((abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                int i3 = 0;
                                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
                                    if ((abstractC21282.f6291 & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC2128M3339 = abstractC21282;
                                        } else {
                                            if (c1224 == null) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3339 != null) {
                                                c1224.m2047(abstractC2128M3339);
                                                abstractC2128M3339 = null;
                                            }
                                            c1224.m2047(abstractC21282);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC2128M3339 = AbstractC1785.m3339(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6284;
                }
            }
            c1748M3346 = c1748M3346.m3256();
            abstractC2128 = (c1748M3346 == null || (c1811 = c1748M3346.f5094) == null) ? null : c1811.f5284;
        }
        C1452 c14522 = (C1452) abstractC2128M3339;
        if (c14522 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = AbstractC1451.f4146[c14522.m2597().ordinal()];
        if (i4 == 1) {
            return m2617(c14522, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return m2618(c14522, i);
        }
        if (i4 != 4) {
            C4211.m8611();
            return null;
        }
        CustomDestinationResult customDestinationResultM2618 = m2618(c14522, i);
        CustomDestinationResult customDestinationResult = customDestinationResultM2618 != CustomDestinationResult.None ? customDestinationResultM2618 : null;
        return customDestinationResult == null ? m2617(c14522, i) : customDestinationResult;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.C1452 m2619(androidx.compose.ui.focus.C1452 r9) {
        /*
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r9.f6292
            boolean r0 = r0.f6279
            r1 = 0
            if (r0 != 0) goto L9
            goto Lb0
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            p210.AbstractC7936.m13423(r0)
        L10:
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r0 = new androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲
            r2 = 16
            androidx.compose.ui.飘花落叶言子楪哲苏世兰[] r3 = new androidx.compose.ui.AbstractC2128[r2]
            r4 = 0
            r0.<init>(r4, r3)
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r9 = r9.f6292
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r3 = r9.f6288
            if (r3 != 0) goto L24
            androidx.compose.ui.node.AbstractC1785.m3342(r0, r9)
            goto L27
        L24:
            r0.m2047(r3)
        L27:
            int r9 = r0.f3520
            if (r9 == 0) goto Lb0
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.m2053(r9)
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r9 = (androidx.compose.ui.AbstractC2128) r9
            int r3 = r9.f6285
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3d
            androidx.compose.ui.node.AbstractC1785.m3342(r0, r9)
            goto L27
        L3d:
            if (r9 == 0) goto L27
            int r3 = r9.f6291
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Lad
            r3 = r1
        L46:
            if (r9 == 0) goto L27
            boolean r5 = r9 instanceof androidx.compose.ui.focus.C1452
            r6 = 1
            if (r5 == 0) goto L72
            androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲 r9 = (androidx.compose.ui.focus.C1452) r9
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r5 = r9.f6292
            boolean r5 = r5.f6279
            if (r5 == 0) goto La8
            androidx.compose.ui.focus.FocusStateImpl r5 = r9.m2597()
            int[] r7 = androidx.compose.ui.focus.AbstractC1461.f4159
            int r5 = r5.ordinal()
            r5 = r7[r5]
            if (r5 == r6) goto L71
            r6 = 2
            if (r5 == r6) goto L71
            r6 = 3
            if (r5 == r6) goto L71
            r9 = 4
            if (r5 != r9) goto L6d
            goto La8
        L6d:
            io.ktor.util.C4211.m8611()
            return r1
        L71:
            return r9
        L72:
            int r5 = r9.f6291
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto La8
            boolean r5 = r9 instanceof androidx.compose.ui.node.AbstractC1788
            if (r5 == 0) goto La8
            r5 = r9
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r5 = (androidx.compose.ui.node.AbstractC1788) r5
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r5 = r5.f5226
            r7 = r4
        L82:
            if (r5 == 0) goto La5
            int r8 = r5.f6291
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto La2
            int r7 = r7 + 1
            if (r7 != r6) goto L90
            r9 = r5
            goto La2
        L90:
            if (r3 != 0) goto L99
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r3 = new androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲
            androidx.compose.ui.飘花落叶言子楪哲苏世兰[] r8 = new androidx.compose.ui.AbstractC2128[r2]
            r3.<init>(r4, r8)
        L99:
            if (r9 == 0) goto L9f
            r3.m2047(r9)
            r9 = r1
        L9f:
            r3.m2047(r5)
        La2:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r5 = r5.f6288
            goto L82
        La5:
            if (r7 != r6) goto La8
            goto L46
        La8:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r9 = androidx.compose.ui.node.AbstractC1785.m3339(r3)
            goto L46
        Lad:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r9 = r9.f6288
            goto L3d
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2619(androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲):androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m2620(final C1452 c1452, final C1452 c14522, final int i, final InterfaceC6558 interfaceC6558) {
        if (m2603(c1452, c14522, i, interfaceC6558)) {
            return true;
        }
        final C1452 c1452M2643 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner()).m2643();
        Boolean bool = (Boolean) m2605(c1452, i, new InterfaceC6558() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public final Boolean invoke(InterfaceC1703 interfaceC1703) {
                if (c1452M2643 != ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner()).m2643()) {
                    return Boolean.TRUE;
                }
                boolean zM2603 = AbstractC1459.m2603(c1452, c14522, i, interfaceC6558);
                Boolean boolValueOf = Boolean.valueOf(zM2603);
                if (zM2603 || !interfaceC1703.mo1513()) {
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
    public static final long m2621(int i, C7328 c7328, C7328 c73282) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = c7328.f19540;
            f2 = c73282.f19538;
        } else if (i == 4) {
            f = c73282.f19540;
            f2 = c7328.f19538;
        } else if (i == 5) {
            f = c7328.f19539;
            f2 = c73282.f19537;
        } else {
            if (i != 6) {
                C5925.m11311("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = c73282.f19539;
            f2 = c7328.f19537;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = c7328.f19539;
            f3 = ((c7328.f19537 - f7) / 2.0f) + f7;
            f4 = c73282.f19539;
            f5 = c73282.f19537;
        } else {
            if (i != 5 && i != 6) {
                C5925.m11311("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = c7328.f19540;
            f3 = ((c7328.f19538 - f8) / 2.0f) + f8;
            f4 = c73282.f19540;
            f5 = c73282.f19538;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean m2622(C1452 c1452) {
        C1748 c1748;
        AbstractC1794 abstractC1794;
        C1748 c17482;
        AbstractC1794 abstractC17942 = c1452.f6286;
        return (abstractC17942 == null || (c1748 = abstractC17942.f5259) == null || !c1748.m3242() || (abstractC1794 = c1452.f6286) == null || (c17482 = abstractC1794.f5259) == null || !c17482.m3243()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m2623(C7328 c7328, C7328 c73282, C7328 c73283, int i) {
        if (!m2624(i, c7328, c73283)) {
            return false;
        }
        if (m2624(i, c73282, c73283) && !m2611(c73283, c7328, c73282, i)) {
            return !m2611(c73283, c73282, c7328, i) && m2621(i, c73283, c7328) < m2621(i, c73283, c73282);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m2624(int i, C7328 c7328, C7328 c73282) {
        if (i == 3) {
            float f = c73282.f19538;
            float f2 = c73282.f19540;
            float f3 = c7328.f19538;
            return (f > f3 || f2 >= f3) && f2 > c7328.f19540;
        }
        if (i == 4) {
            float f4 = c73282.f19540;
            float f5 = c73282.f19538;
            float f6 = c7328.f19540;
            return (f4 < f6 || f5 <= f6) && f5 < c7328.f19538;
        }
        if (i == 5) {
            float f7 = c73282.f19537;
            float f8 = c73282.f19539;
            float f9 = c7328.f19537;
            return (f7 > f9 || f8 >= f9) && f8 > c7328.f19539;
        }
        if (i != 6) {
            C5925.m11311("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = c73282.f19539;
        float f11 = c73282.f19537;
        float f12 = c7328.f19539;
        return (f10 < f12 || f11 <= f12) && f11 < c7328.f19537;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m2625(C1452 c1452, int i, InterfaceC6558 interfaceC6558) {
        C7328 c7328;
        C1224 c1224 = new C1224(0, new C1452[16]);
        m2608(c1452, c1224);
        int i2 = c1224.f3520;
        if (i2 <= 1) {
            C1452 c14522 = (C1452) (i2 == 0 ? null : c1224.f3521[0]);
            if (c14522 != null) {
                return ((Boolean) interfaceC6558.invoke(c14522)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C7328 c7328M2629 = m2629(c1452);
                float f = c7328M2629.f19540;
                float f2 = c7328M2629.f19539;
                c7328 = new C7328(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C5925.m11311("This function should only be used for 2-D focus search");
                    return false;
                }
                C7328 c7328M26292 = m2629(c1452);
                float f3 = c7328M26292.f19538;
                float f4 = c7328M26292.f19537;
                c7328 = new C7328(f3, f4, f3, f4);
            }
            C1452 c1452M2626 = m2626(c1224, c7328, i);
            if (c1452M2626 != null) {
                return ((Boolean) interfaceC6558.invoke(c1452M2626)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1452 m2626(C1224 c1224, C7328 c7328, int i) {
        C7328 c7328M12522;
        C1452 c1452 = null;
        if (i == 3) {
            c7328M12522 = c7328.m12522((c7328.f19538 - c7328.f19540) + 1.0f, 0.0f);
        } else if (i == 4) {
            c7328M12522 = c7328.m12522(-((c7328.f19538 - c7328.f19540) + 1.0f), 0.0f);
        } else if (i == 5) {
            c7328M12522 = c7328.m12522(0.0f, (c7328.f19537 - c7328.f19539) + 1.0f);
        } else {
            if (i != 6) {
                C5925.m11311("This function should only be used for 2-D focus search");
                return null;
            }
            c7328M12522 = c7328.m12522(0.0f, -((c7328.f19537 - c7328.f19539) + 1.0f));
        }
        Object[] objArr = c1224.f3521;
        int i2 = c1224.f3520;
        for (int i3 = 0; i3 < i2; i3++) {
            C1452 c14522 = (C1452) objArr[i3];
            if (m2622(c14522)) {
                C7328 c7328M2629 = m2629(c14522);
                if (m2623(c7328M2629, c7328M12522, c7328, i)) {
                    c1452 = c14522;
                    c7328M12522 = c7328M2629;
                }
            }
        }
        return c1452;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m2627(C1452 c1452, InterfaceC6558 interfaceC6558) {
        int i = AbstractC1458.f4157[c1452.m2597().ordinal()];
        if (i == 1) {
            C1452 c1452M2619 = m2619(c1452);
            if (c1452M2619 != null) {
                return m2627(c1452M2619, interfaceC6558) || m2620(c1452, c1452M2619, 1, interfaceC6558);
            }
            C5925.m11311("ActiveParent must have a focusedChild");
            return false;
        }
        if (i == 2 || i == 3) {
            return m2606(c1452, interfaceC6558);
        }
        if (i == 4) {
            return c1452.m2600().f4180 ? ((Boolean) interfaceC6558.invoke(c1452)).booleanValue() : m2606(c1452, interfaceC6558);
        }
        C4211.m8611();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final boolean m2628(final int i, final C1452 c1452, final InterfaceC6558 interfaceC6558, final C7328 c7328) {
        if (m2604(i, c1452, interfaceC6558, c7328)) {
            return true;
        }
        final C1452 c1452M2643 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner()).m2643();
        Boolean bool = (Boolean) m2605(c1452, i, new InterfaceC6558() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public final Boolean invoke(InterfaceC1703 interfaceC1703) {
                if (c1452M2643 != ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner()).m2643()) {
                    return Boolean.TRUE;
                }
                boolean zM2604 = AbstractC1459.m2604(i, c1452, interfaceC6558, c7328);
                Boolean boolValueOf = Boolean.valueOf(zM2604);
                if (zM2604 || !interfaceC1703.mo1513()) {
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
    public static final C7328 m2629(C1452 c1452) {
        AbstractC1794 abstractC1794;
        if (c1452.f6279 && (abstractC1794 = c1452.f6286) != null) {
            InterfaceC1695 interfaceC1695M3113 = AbstractC1670.m3113(abstractC1794);
            if (!interfaceC1695M3113.mo3086()) {
                interfaceC1695M3113 = null;
            }
            if (interfaceC1695M3113 != null) {
                return c1452.m2595(interfaceC1695M3113);
            }
        }
        return C7328.f19536;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final InterfaceC2129 m2630(InterfaceC2129 interfaceC2129, C1468 c1468) {
        return interfaceC2129.mo3866(new C1472(c1468));
    }
}
