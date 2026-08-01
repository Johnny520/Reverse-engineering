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
import io.ktor.util.C4210;
import java.util.Arrays;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;
import p112.C7327;
import p210.AbstractC7935;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1459 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Boolean m2592(int i, C1452 c1452, InterfaceC6557 interfaceC6557, C7327 c7327) {
        FocusStateImpl focusStateImplM2587 = c1452.m2587();
        int[] iArr = AbstractC1457.f4155;
        int i2 = iArr[focusStateImplM2587.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m2615(c1452, i, interfaceC6557));
            }
            if (i2 == 4) {
                return c1452.m2590().f4179 ? (Boolean) interfaceC6557.invoke(c1452) : c7327 == null ? Boolean.valueOf(m2615(c1452, i, interfaceC6557)) : Boolean.valueOf(m2594(i, c1452, interfaceC6557, c7327));
            }
            C4210.m8621();
            return null;
        }
        C1452 c1452M2609 = m2609(c1452);
        if (c1452M2609 == null) {
            C5919.m11250("ActiveParent must have a focusedChild");
            return null;
        }
        int i3 = iArr[c1452M2609.m2587().ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                if (c7327 == null) {
                    c7327 = m2619(c1452M2609);
                }
                return Boolean.valueOf(m2618(i, c1452, interfaceC6557, c7327));
            }
            if (i3 != 4) {
                C4210.m8621();
                return null;
            }
            C5919.m11250("ActiveParent must have a focusedChild");
            return null;
        }
        Boolean boolM2592 = m2592(i, c1452M2609, interfaceC6557, c7327);
        if (!AbstractC4394.m8917(boolM2592, Boolean.FALSE)) {
            return boolM2592;
        }
        if (c7327 == null) {
            if (c1452M2609.m2587() != FocusStateImpl.ActiveParent) {
                C5919.m11250("Searching for active node in inactive hierarchy");
                return null;
            }
            C1452 c1452M2597 = m2597(c1452M2609);
            if (c1452M2597 == null) {
                C5919.m11250("ActiveParent must have a focusedChild");
                return null;
            }
            c7327 = m2619(c1452M2597);
        }
        return Boolean.valueOf(m2618(i, c1452, interfaceC6557, c7327));
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
    public static final boolean m2593(androidx.compose.ui.focus.C1452 r12, androidx.compose.ui.focus.C1452 r13, int r14, p052.InterfaceC6557 r15) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2593(androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲, androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲, int, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final boolean m2594(int i, C1452 c1452, InterfaceC6557 interfaceC6557, C7327 c7327) {
        C1452 c1452M2616;
        C1224 c1224 = new C1224(0, new C1452[16]);
        if (!c1452.f6291.f6278) {
            AbstractC7935.m13395("visitChildren called on an unattached node");
        }
        C1224 c12242 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6291;
        AbstractC2128 abstractC21282 = abstractC2128.f6287;
        if (abstractC21282 == null) {
            AbstractC1785.m3332(c12242, abstractC2128);
        } else {
            c12242.m2037(abstractC21282);
        }
        while (true) {
            int i2 = c12242.f3519;
            if (i2 == 0) {
                break;
            }
            AbstractC2128 abstractC2128M3329 = (AbstractC2128) c12242.m2043(i2 - 1);
            if ((abstractC2128M3329.f6284 & 1024) == 0) {
                AbstractC1785.m3332(c12242, abstractC2128M3329);
            } else {
                while (true) {
                    if (abstractC2128M3329 == null) {
                        break;
                    }
                    if ((abstractC2128M3329.f6290 & 1024) != 0) {
                        C1224 c12243 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3329;
                                if (c14522.f6278) {
                                    c1224.m2037(c14522);
                                }
                            } else if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i3 = 0;
                                for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21283 != null; abstractC21283 = abstractC21283.f6287) {
                                    if ((abstractC21283.f6290 & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC2128M3329 = abstractC21283;
                                        } else {
                                            if (c12243 == null) {
                                                c12243 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3329 != null) {
                                                c12243.m2037(abstractC2128M3329);
                                                abstractC2128M3329 = null;
                                            }
                                            c12243.m2037(abstractC21283);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC2128M3329 = AbstractC1785.m3329(c12243);
                        }
                    } else {
                        abstractC2128M3329 = abstractC2128M3329.f6287;
                    }
                }
            }
        }
        while (c1224.f3519 != 0 && (c1452M2616 = m2616(c1224, c7327, i)) != null) {
            if (c1452M2616.m2590().f4179) {
                return ((Boolean) interfaceC6557.invoke(c1452M2616)).booleanValue();
            }
            if (m2618(i, c1452M2616, interfaceC6557, c7327)) {
                return true;
            }
            c1224.m2045(c1452M2616);
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
    public static final Object m2595(C1452 c1452, int i, InterfaceC6557 interfaceC6557) {
        int i2;
        int i3;
        Object objInvoke;
        AbstractC2128 abstractC2128M3329;
        InterfaceC1702 interfaceC1702M2584;
        int i4;
        C1811 c1811;
        if (!c1452.f6291.f6278) {
            AbstractC7935.m13395("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = c1452.f6291.f6283;
        C1748 c1748M3336 = AbstractC1785.m3336(c1452);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (c1748M3336 == null) {
                abstractC2128M3329 = null;
                break;
            }
            if ((c1748M3336.f5093.f5282.f6284 & 1024) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6290 & 1024) != 0) {
                        abstractC2128M3329 = abstractC2128;
                        C1224 c1224 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof C1452) {
                                break loop0;
                            }
                            if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i5 = 0;
                                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                                    if ((abstractC21282.f6290 & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            abstractC2128M3329 = abstractC21282;
                                        } else {
                                            if (c1224 == null) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3329 != null) {
                                                c1224.m2037(abstractC2128M3329);
                                                abstractC2128M3329 = null;
                                            }
                                            c1224.m2037(abstractC21282);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC2128M3329 = AbstractC1785.m3329(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6283;
                }
            }
            c1748M3336 = c1748M3336.m3246();
            abstractC2128 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
        }
        C1452 c14522 = (C1452) abstractC2128M3329;
        if ((c14522 == null || !AbstractC4394.m8917(c14522.m2584(), c1452.m2584())) && (interfaceC1702M2584 = c1452.m2584()) != null) {
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
                                C5919.m11250("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            C0719 c0719 = (C0719) interfaceC1702M2584;
            if (c0719.f2023.f2127.m1541().f2205 <= 0 || c0719.f2023.f2127.m1541().f2212.isEmpty() || !c0719.f6278) {
                return interfaceC6557.invoke(C0719.f2022);
            }
            boolean zM1505 = c0719.m1505(i6);
            C0742 c0742 = c0719.f2023;
            int iMin = zM1505 ? Math.min(c0742.f2127.m1541().f2205 - 1, ((C0749) AbstractC4343.m8811(c0742.f2127.m1541().f2212)).f2161) : Math.max(0, c0742.f2127.f2104.m1550());
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C0541 c0541 = c0719.f2025;
            c0541.getClass();
            ?? c0724 = new C0724(iMin, iMin);
            c0541.f1566.m2037(c0724);
            ref$ObjectRef.element = c0724;
            C0741 c0741 = c0719.f2023.f2127;
            if (c0741.m1541().f2212.isEmpty()) {
                i3 = 0;
            } else {
                C0757 c0757M1541 = c0741.m1541();
                int iM1556 = (int) (c0757M1541.f2208 == Orientation.Vertical ? c0757M1541.m1556() & 4294967295L : c0757M1541.m1556() >> 32);
                int iM1557 = AbstractC0759.m1557(c0741.m1541());
                if (iM1557 != 0 && (i4 = iM1556 / iM1557) >= 1) {
                    i3 = i4;
                }
            }
            int i7 = i3 * 2;
            int i8 = c0719.f2023.f2127.m1541().f2205;
            if (i7 > i8) {
                i7 = i8;
            }
            while (objInvoke == null && c0719.m1504((C0724) ref$ObjectRef.element, i6) && i2 < i7) {
                C0724 c07242 = (C0724) ref$ObjectRef.element;
                int i9 = c07242.f2034;
                int i10 = c07242.f2033;
                if (c0719.m1505(i6)) {
                    i10++;
                } else {
                    i9--;
                }
                C0541 c05412 = c0719.f2025;
                c05412.getClass();
                ?? c07243 = new C0724(i9, i10);
                c05412.f1566.m2037(c07243);
                c0719.f2025.f1566.m2045((C0724) ref$ObjectRef.element);
                ref$ObjectRef.element = c07243;
                i2++;
                AbstractC1785.m3336(c0719).m3255();
                objInvoke = interfaceC6557.invoke(new C0718(c0719, ref$ObjectRef, i6));
            }
            c0719.f2025.f1566.m2045((C0724) ref$ObjectRef.element);
            AbstractC1785.m3336(c0719).m3255();
            return objInvoke;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m2596(C1452 c1452, InterfaceC6557 interfaceC6557) {
        Object[] objArr = new C1452[16];
        if (!c1452.f6291.f6278) {
            AbstractC7935.m13395("visitChildren called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6291;
        AbstractC2128 abstractC21282 = abstractC2128.f6287;
        if (abstractC21282 == null) {
            AbstractC1785.m3332(c1224, abstractC2128);
        } else {
            c1224.m2037(abstractC21282);
        }
        int i = 0;
        while (true) {
            int i2 = c1224.f3519;
            if (i2 == 0) {
                break;
            }
            AbstractC2128 abstractC2128M3329 = (AbstractC2128) c1224.m2043(i2 - 1);
            if ((abstractC2128M3329.f6284 & 1024) == 0) {
                AbstractC1785.m3332(c1224, abstractC2128M3329);
            } else {
                while (true) {
                    if (abstractC2128M3329 == null) {
                        break;
                    }
                    if ((abstractC2128M3329.f6290 & 1024) != 0) {
                        C1224 c12242 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3329;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c14522;
                                i = i3;
                            } else if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i4 = 0;
                                for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21283 != null; abstractC21283 = abstractC21283.f6287) {
                                    if ((abstractC21283.f6290 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC2128M3329 = abstractC21283;
                                        } else {
                                            if (c12242 == null) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3329 != null) {
                                                c12242.m2037(abstractC2128M3329);
                                                abstractC2128M3329 = null;
                                            }
                                            c12242.m2037(abstractC21283);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2128M3329 = AbstractC1785.m3329(c12242);
                        }
                    } else {
                        abstractC2128M3329 = abstractC2128M3329.f6287;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, C1460.f4157);
        for (int i5 = 0; i5 < i; i5++) {
            C1452 c14523 = (C1452) objArr[i5];
            if (m2612(c14523) && m2617(c14523, interfaceC6557)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1452 m2597(C1452 c1452) {
        C1452 c1452M2633 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner()).m2633();
        if (c1452M2633 == null || !c1452M2633.f6278) {
            return null;
        }
        return c1452M2633;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m2598(C1452 c1452, C1224 c1224) {
        if (!c1452.f6291.f6278) {
            AbstractC7935.m13395("visitChildren called on an unattached node");
        }
        C1224 c12242 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6291;
        AbstractC2128 abstractC21282 = abstractC2128.f6287;
        if (abstractC21282 == null) {
            AbstractC1785.m3332(c12242, abstractC2128);
        } else {
            c12242.m2037(abstractC21282);
        }
        while (true) {
            int i = c12242.f3519;
            if (i == 0) {
                return;
            }
            AbstractC2128 abstractC2128M3329 = (AbstractC2128) c12242.m2043(i - 1);
            if ((abstractC2128M3329.f6284 & 1024) == 0) {
                AbstractC1785.m3332(c12242, abstractC2128M3329);
            } else {
                while (true) {
                    if (abstractC2128M3329 == null) {
                        break;
                    }
                    if ((abstractC2128M3329.f6290 & 1024) != 0) {
                        C1224 c12243 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3329;
                                if (c14522.f6278 && !AbstractC1785.m3336(c14522).f5125) {
                                    if (c14522.m2590().f4179) {
                                        c1224.m2037(c14522);
                                    } else {
                                        m2598(c14522, c1224);
                                    }
                                }
                            } else if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i2 = 0;
                                for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21283 != null; abstractC21283 = abstractC21283.f6287) {
                                    if ((abstractC21283.f6290 & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC2128M3329 = abstractC21283;
                                        } else {
                                            if (c12243 == null) {
                                                c12243 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3329 != null) {
                                                c12243.m2037(abstractC2128M3329);
                                                abstractC2128M3329 = null;
                                            }
                                            c12243.m2037(abstractC21283);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC2128M3329 = AbstractC1785.m3329(c12243);
                        }
                    } else {
                        abstractC2128M3329 = abstractC2128M3329.f6287;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m2599(C1452 c1452, boolean z) {
        int i = AbstractC1451.f4145[c1452.m2587().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return z;
            }
            if (i == 3) {
                C1452 c1452M2609 = m2609(c1452);
                if (!(c1452M2609 != null ? m2599(c1452M2609, z) : true)) {
                    return false;
                }
                c1452.m2591(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                return true;
            }
            if (i != 4) {
                C4210.m8621();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m2600(int i, C7327 c7327, C7327 c73272) {
        if (i == 3 || i == 4) {
            return c7327.f19542 > c73272.f19544 && c7327.f19544 < c73272.f19542;
        }
        if (i == 5 || i == 6) {
            return c7327.f19543 > c73272.f19545 && c7327.f19545 < c73272.f19543;
        }
        C5919.m11250("This function should only be used for 2-D focus search");
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
    
        r1 = r11 - r19.f19543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f19545 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f19542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f19544 - r8;
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
    
        top.suzhelan.qstory.hook.item.C5919.m11250("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        top.suzhelan.qstory.hook.item.C5919.m11250("This function should only be used for 2-D focus search");
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
    public static final boolean m2601(p112.C7327 r18, p112.C7327 r19, p112.C7327 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = m2600(r3, r2, r0)
            float r5 = r2.f19544
            float r6 = r2.f19542
            float r7 = r2.f19545
            float r2 = r2.f19543
            float r8 = r0.f19542
            float r9 = r0.f19544
            float r10 = r0.f19543
            float r11 = r0.f19545
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = m2600(r3, r1, r0)
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
            float r1 = r1.f19543
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f19545
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f19542
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.f19544
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
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            return r12
        L94:
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            return r12
        L98:
            return r18
        L99:
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2601(飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m2602(androidx.compose.ui.focus.C1452 r9, p052.InterfaceC6557 r10) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r9.m2587()
            int[] r1 = androidx.compose.ui.focus.AbstractC1458.f4156
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
            boolean r0 = m2606(r9, r10)
            if (r0 != 0) goto L88
            androidx.compose.ui.focus.飘花落叶言子楪哲兰苏世 r0 = r9.m2590()
            boolean r0 = r0.f4179
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
            io.ktor.util.C4210.m8621()
            return r4
        L3a:
            boolean r9 = m2606(r9, r10)
            return r9
        L3f:
            androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲 r0 = m2609(r9)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L89
            androidx.compose.ui.focus.FocusStateImpl r8 = r0.m2587()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L66
            if (r1 == r5) goto L61
            if (r1 == r3) goto L61
            if (r1 == r2) goto L5d
            io.ktor.util.C4210.m8621()
            return r4
        L5d:
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r4
        L61:
            boolean r9 = m2610(r9, r0, r5, r10)
            return r9
        L66:
            boolean r1 = m2602(r0, r10)
            if (r1 != 0) goto L88
            boolean r9 = m2610(r9, r0, r5, r10)
            if (r9 != 0) goto L88
            androidx.compose.ui.focus.飘花落叶言子楪哲兰苏世 r9 = r0.m2590()
            boolean r9 = r9.f4179
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
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2602(androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final CustomDestinationResult m2603(C1452 c1452, int i) {
        int i2 = AbstractC1451.f4145[c1452.m2587().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                C1452 c1452M2609 = m2609(c1452);
                if (c1452M2609 == null) {
                    C5919.m11249("ActiveParent with no focused child");
                    return null;
                }
                CustomDestinationResult customDestinationResultM2603 = m2603(c1452M2609, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
                CustomDestinationResult customDestinationResult2 = customDestinationResultM2603 != customDestinationResult ? customDestinationResultM2603 : null;
                if (customDestinationResult2 != null) {
                    return customDestinationResult2;
                }
                if (c1452.f4149) {
                    return customDestinationResult;
                }
                c1452.f4149 = true;
                try {
                    C1477 c1477M2590 = c1452.m2590();
                    C1467 c1467 = new C1467(i);
                    C1478 c1478 = (C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner();
                    C1452 c1452M2633 = c1478.m2633();
                    c1477M2590.f4182.invoke(c1467);
                    C1452 c1452M26332 = c1478.m2633();
                    if (!c1467.f4164) {
                        return (c1452M2633 == c1452M26332 || c1452M26332 == null) ? customDestinationResult : C1468.f4166 == C1468.f4167 ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                    }
                    C1468 c1468 = C1468.f4168;
                    return CustomDestinationResult.Cancelled;
                } finally {
                    c1452.f4149 = false;
                }
            }
            if (i2 != 4) {
                C4210.m8621();
                return null;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final InterfaceC2129 m2604(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        return interfaceC2129.mo3856(new C1466(interfaceC6557));
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
    public static final boolean m2605(final androidx.compose.ui.focus.C1452 r22) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2605(androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m2606(C1452 c1452, InterfaceC6557 interfaceC6557) {
        Object[] objArr = new C1452[16];
        if (!c1452.f6291.f6278) {
            AbstractC7935.m13395("visitChildren called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6291;
        AbstractC2128 abstractC21282 = abstractC2128.f6287;
        if (abstractC21282 == null) {
            AbstractC1785.m3332(c1224, abstractC2128);
        } else {
            c1224.m2037(abstractC21282);
        }
        int i = 0;
        while (true) {
            int i2 = c1224.f3519;
            if (i2 == 0) {
                break;
            }
            AbstractC2128 abstractC2128M3329 = (AbstractC2128) c1224.m2043(i2 - 1);
            if ((abstractC2128M3329.f6284 & 1024) == 0) {
                AbstractC1785.m3332(c1224, abstractC2128M3329);
            } else {
                while (true) {
                    if (abstractC2128M3329 == null) {
                        break;
                    }
                    if ((abstractC2128M3329.f6290 & 1024) != 0) {
                        C1224 c12242 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3329;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c14522;
                                i = i3;
                            } else if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i4 = 0;
                                for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21283 != null; abstractC21283 = abstractC21283.f6287) {
                                    if ((abstractC21283.f6290 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC2128M3329 = abstractC21283;
                                        } else {
                                            if (c12242 == null) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3329 != null) {
                                                c12242.m2037(abstractC2128M3329);
                                                abstractC2128M3329 = null;
                                            }
                                            c12242.m2037(abstractC21283);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2128M3329 = AbstractC1785.m3329(c12242);
                        }
                    } else {
                        abstractC2128M3329 = abstractC2128M3329.f6287;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, C1460.f4157);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                C1452 c14523 = (C1452) objArr[i5];
                if (m2612(c14523) && m2602(c14523, interfaceC6557)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final CustomDestinationResult m2607(C1452 c1452, int i) {
        if (!c1452.f4148) {
            c1452.f4148 = true;
            try {
                C1477 c1477M2590 = c1452.m2590();
                C1467 c1467 = new C1467(i);
                C1478 c1478 = (C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner();
                C1452 c1452M2633 = c1478.m2633();
                c1477M2590.f4185.invoke(c1467);
                C1452 c1452M26332 = c1478.m2633();
                if (c1467.f4164) {
                    C1468 c1468 = C1468.f4168;
                    return CustomDestinationResult.Cancelled;
                }
                if (c1452M2633 != c1452M26332 && c1452M26332 != null) {
                    return C1468.f4166 == C1468.f4167 ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                }
            } finally {
                c1452.f4148 = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final CustomDestinationResult m2608(C1452 c1452, int i) {
        AbstractC2128 abstractC2128M3329;
        C1811 c1811;
        int i2 = AbstractC1451.f4145[c1452.m2587().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            C1452 c1452M2609 = m2609(c1452);
            if (c1452M2609 != null) {
                return m2603(c1452M2609, i);
            }
            C5919.m11249("ActiveParent with no focused child");
            return null;
        }
        if (i2 != 4) {
            C4210.m8621();
            return null;
        }
        if (!c1452.f6291.f6278) {
            AbstractC7935.m13395("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = c1452.f6291.f6283;
        C1748 c1748M3336 = AbstractC1785.m3336(c1452);
        loop0: while (true) {
            if (c1748M3336 == null) {
                abstractC2128M3329 = null;
                break;
            }
            if ((c1748M3336.f5093.f5282.f6284 & 1024) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6290 & 1024) != 0) {
                        abstractC2128M3329 = abstractC2128;
                        C1224 c1224 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof C1452) {
                                break loop0;
                            }
                            if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i3 = 0;
                                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                                    if ((abstractC21282.f6290 & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC2128M3329 = abstractC21282;
                                        } else {
                                            if (c1224 == null) {
                                                c1224 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3329 != null) {
                                                c1224.m2037(abstractC2128M3329);
                                                abstractC2128M3329 = null;
                                            }
                                            c1224.m2037(abstractC21282);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC2128M3329 = AbstractC1785.m3329(c1224);
                        }
                    }
                    abstractC2128 = abstractC2128.f6283;
                }
            }
            c1748M3336 = c1748M3336.m3246();
            abstractC2128 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
        }
        C1452 c14522 = (C1452) abstractC2128M3329;
        if (c14522 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = AbstractC1451.f4145[c14522.m2587().ordinal()];
        if (i4 == 1) {
            return m2607(c14522, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return m2608(c14522, i);
        }
        if (i4 != 4) {
            C4210.m8621();
            return null;
        }
        CustomDestinationResult customDestinationResultM2608 = m2608(c14522, i);
        CustomDestinationResult customDestinationResult = customDestinationResultM2608 != CustomDestinationResult.None ? customDestinationResultM2608 : null;
        return customDestinationResult == null ? m2607(c14522, i) : customDestinationResult;
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
    public static final androidx.compose.ui.focus.C1452 m2609(androidx.compose.ui.focus.C1452 r9) {
        /*
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r9.f6291
            boolean r0 = r0.f6278
            r1 = 0
            if (r0 != 0) goto L9
            goto Lb0
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            p210.AbstractC7935.m13395(r0)
        L10:
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r0 = new androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲
            r2 = 16
            androidx.compose.ui.飘花落叶言子楪哲苏世兰[] r3 = new androidx.compose.ui.AbstractC2128[r2]
            r4 = 0
            r0.<init>(r4, r3)
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r9 = r9.f6291
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r3 = r9.f6287
            if (r3 != 0) goto L24
            androidx.compose.ui.node.AbstractC1785.m3332(r0, r9)
            goto L27
        L24:
            r0.m2037(r3)
        L27:
            int r9 = r0.f3519
            if (r9 == 0) goto Lb0
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.m2043(r9)
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r9 = (androidx.compose.ui.AbstractC2128) r9
            int r3 = r9.f6284
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3d
            androidx.compose.ui.node.AbstractC1785.m3332(r0, r9)
            goto L27
        L3d:
            if (r9 == 0) goto L27
            int r3 = r9.f6290
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Lad
            r3 = r1
        L46:
            if (r9 == 0) goto L27
            boolean r5 = r9 instanceof androidx.compose.ui.focus.C1452
            r6 = 1
            if (r5 == 0) goto L72
            androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲 r9 = (androidx.compose.ui.focus.C1452) r9
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r5 = r9.f6291
            boolean r5 = r5.f6278
            if (r5 == 0) goto La8
            androidx.compose.ui.focus.FocusStateImpl r5 = r9.m2587()
            int[] r7 = androidx.compose.ui.focus.AbstractC1461.f4158
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
            io.ktor.util.C4210.m8621()
            return r1
        L71:
            return r9
        L72:
            int r5 = r9.f6290
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto La8
            boolean r5 = r9 instanceof androidx.compose.ui.node.AbstractC1788
            if (r5 == 0) goto La8
            r5 = r9
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r5 = (androidx.compose.ui.node.AbstractC1788) r5
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r5 = r5.f5225
            r7 = r4
        L82:
            if (r5 == 0) goto La5
            int r8 = r5.f6290
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
            r3.m2037(r9)
            r9 = r1
        L9f:
            r3.m2037(r5)
        La2:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r5 = r5.f6287
            goto L82
        La5:
            if (r7 != r6) goto La8
            goto L46
        La8:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r9 = androidx.compose.ui.node.AbstractC1785.m3329(r3)
            goto L46
        Lad:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r9 = r9.f6287
            goto L3d
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.AbstractC1459.m2609(androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲):androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m2610(final C1452 c1452, final C1452 c14522, final int i, final InterfaceC6557 interfaceC6557) {
        if (m2593(c1452, c14522, i, interfaceC6557)) {
            return true;
        }
        final C1452 c1452M2633 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner()).m2633();
        Boolean bool = (Boolean) m2595(c1452, i, new InterfaceC6557() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public final Boolean invoke(InterfaceC1703 interfaceC1703) {
                if (c1452M2633 != ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner()).m2633()) {
                    return Boolean.TRUE;
                }
                boolean zM2593 = AbstractC1459.m2593(c1452, c14522, i, interfaceC6557);
                Boolean boolValueOf = Boolean.valueOf(zM2593);
                if (zM2593 || !interfaceC1703.mo1503()) {
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
    public static final long m2611(int i, C7327 c7327, C7327 c73272) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = c7327.f19545;
            f2 = c73272.f19543;
        } else if (i == 4) {
            f = c73272.f19545;
            f2 = c7327.f19543;
        } else if (i == 5) {
            f = c7327.f19544;
            f2 = c73272.f19542;
        } else {
            if (i != 6) {
                C5919.m11250("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = c73272.f19544;
            f2 = c7327.f19542;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = c7327.f19544;
            f3 = ((c7327.f19542 - f7) / 2.0f) + f7;
            f4 = c73272.f19544;
            f5 = c73272.f19542;
        } else {
            if (i != 5 && i != 6) {
                C5919.m11250("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = c7327.f19545;
            f3 = ((c7327.f19543 - f8) / 2.0f) + f8;
            f4 = c73272.f19545;
            f5 = c73272.f19543;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean m2612(C1452 c1452) {
        C1748 c1748;
        AbstractC1794 abstractC1794;
        C1748 c17482;
        AbstractC1794 abstractC17942 = c1452.f6285;
        return (abstractC17942 == null || (c1748 = abstractC17942.f5258) == null || !c1748.m3232() || (abstractC1794 = c1452.f6285) == null || (c17482 = abstractC1794.f5258) == null || !c17482.m3233()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m2613(C7327 c7327, C7327 c73272, C7327 c73273, int i) {
        if (!m2614(i, c7327, c73273)) {
            return false;
        }
        if (m2614(i, c73272, c73273) && !m2601(c73273, c7327, c73272, i)) {
            return !m2601(c73273, c73272, c7327, i) && m2611(i, c73273, c7327) < m2611(i, c73273, c73272);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m2614(int i, C7327 c7327, C7327 c73272) {
        if (i == 3) {
            float f = c73272.f19543;
            float f2 = c73272.f19545;
            float f3 = c7327.f19543;
            return (f > f3 || f2 >= f3) && f2 > c7327.f19545;
        }
        if (i == 4) {
            float f4 = c73272.f19545;
            float f5 = c73272.f19543;
            float f6 = c7327.f19545;
            return (f4 < f6 || f5 <= f6) && f5 < c7327.f19543;
        }
        if (i == 5) {
            float f7 = c73272.f19542;
            float f8 = c73272.f19544;
            float f9 = c7327.f19542;
            return (f7 > f9 || f8 >= f9) && f8 > c7327.f19544;
        }
        if (i != 6) {
            C5919.m11250("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = c73272.f19544;
        float f11 = c73272.f19542;
        float f12 = c7327.f19544;
        return (f10 < f12 || f11 <= f12) && f11 < c7327.f19542;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m2615(C1452 c1452, int i, InterfaceC6557 interfaceC6557) {
        C7327 c7327;
        C1224 c1224 = new C1224(0, new C1452[16]);
        m2598(c1452, c1224);
        int i2 = c1224.f3519;
        if (i2 <= 1) {
            C1452 c14522 = (C1452) (i2 == 0 ? null : c1224.f3520[0]);
            if (c14522 != null) {
                return ((Boolean) interfaceC6557.invoke(c14522)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C7327 c7327M2619 = m2619(c1452);
                float f = c7327M2619.f19545;
                float f2 = c7327M2619.f19544;
                c7327 = new C7327(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C5919.m11250("This function should only be used for 2-D focus search");
                    return false;
                }
                C7327 c7327M26192 = m2619(c1452);
                float f3 = c7327M26192.f19543;
                float f4 = c7327M26192.f19542;
                c7327 = new C7327(f3, f4, f3, f4);
            }
            C1452 c1452M2616 = m2616(c1224, c7327, i);
            if (c1452M2616 != null) {
                return ((Boolean) interfaceC6557.invoke(c1452M2616)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1452 m2616(C1224 c1224, C7327 c7327, int i) {
        C7327 c7327M12495;
        C1452 c1452 = null;
        if (i == 3) {
            c7327M12495 = c7327.m12495((c7327.f19543 - c7327.f19545) + 1.0f, 0.0f);
        } else if (i == 4) {
            c7327M12495 = c7327.m12495(-((c7327.f19543 - c7327.f19545) + 1.0f), 0.0f);
        } else if (i == 5) {
            c7327M12495 = c7327.m12495(0.0f, (c7327.f19542 - c7327.f19544) + 1.0f);
        } else {
            if (i != 6) {
                C5919.m11250("This function should only be used for 2-D focus search");
                return null;
            }
            c7327M12495 = c7327.m12495(0.0f, -((c7327.f19542 - c7327.f19544) + 1.0f));
        }
        Object[] objArr = c1224.f3520;
        int i2 = c1224.f3519;
        for (int i3 = 0; i3 < i2; i3++) {
            C1452 c14522 = (C1452) objArr[i3];
            if (m2612(c14522)) {
                C7327 c7327M2619 = m2619(c14522);
                if (m2613(c7327M2619, c7327M12495, c7327, i)) {
                    c1452 = c14522;
                    c7327M12495 = c7327M2619;
                }
            }
        }
        return c1452;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m2617(C1452 c1452, InterfaceC6557 interfaceC6557) {
        int i = AbstractC1458.f4156[c1452.m2587().ordinal()];
        if (i == 1) {
            C1452 c1452M2609 = m2609(c1452);
            if (c1452M2609 != null) {
                return m2617(c1452M2609, interfaceC6557) || m2610(c1452, c1452M2609, 1, interfaceC6557);
            }
            C5919.m11250("ActiveParent must have a focusedChild");
            return false;
        }
        if (i == 2 || i == 3) {
            return m2596(c1452, interfaceC6557);
        }
        if (i == 4) {
            return c1452.m2590().f4179 ? ((Boolean) interfaceC6557.invoke(c1452)).booleanValue() : m2596(c1452, interfaceC6557);
        }
        C4210.m8621();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final boolean m2618(final int i, final C1452 c1452, final InterfaceC6557 interfaceC6557, final C7327 c7327) {
        if (m2594(i, c1452, interfaceC6557, c7327)) {
            return true;
        }
        final C1452 c1452M2633 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner()).m2633();
        Boolean bool = (Boolean) m2595(c1452, i, new InterfaceC6557() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public final Boolean invoke(InterfaceC1703 interfaceC1703) {
                if (c1452M2633 != ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner()).m2633()) {
                    return Boolean.TRUE;
                }
                boolean zM2594 = AbstractC1459.m2594(i, c1452, interfaceC6557, c7327);
                Boolean boolValueOf = Boolean.valueOf(zM2594);
                if (zM2594 || !interfaceC1703.mo1503()) {
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
    public static final C7327 m2619(C1452 c1452) {
        AbstractC1794 abstractC1794;
        if (c1452.f6278 && (abstractC1794 = c1452.f6285) != null) {
            InterfaceC1695 interfaceC1695M3103 = AbstractC1670.m3103(abstractC1794);
            if (!interfaceC1695M3103.mo3076()) {
                interfaceC1695M3103 = null;
            }
            if (interfaceC1695M3103 != null) {
                return c1452.m2585(interfaceC1695M3103);
            }
        }
        return C7327.f19541;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final InterfaceC2129 m2620(InterfaceC2129 interfaceC2129, C1468 c1468) {
        return interfaceC2129.mo3856(new C1472(c1468));
    }
}
