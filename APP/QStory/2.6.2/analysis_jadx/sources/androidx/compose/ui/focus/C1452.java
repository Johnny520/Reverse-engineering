package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.modifier.InterfaceC1733;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.node.InterfaceC1776;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.compose.ui.node.InterfaceC1791;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import io.ktor.util.C4210;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p111.C7322;
import p111.C7324;
import p111.InterfaceC7323;
import p112.C7327;
import p210.AbstractC7935;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1452 extends AbstractC2128 implements InterfaceC1783, InterfaceC1776, InterfaceC1791, InterfaceC1733, InterfaceC1787 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f4146;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int f4147;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f4148;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f4149;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC6553 f4150;

    public C1452(int i, InterfaceC6553 interfaceC6553, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        interfaceC6553 = (i2 & 4) != 0 ? null : interfaceC6553;
        this.f4146 = z;
        this.f4150 = interfaceC6553;
        this.f4147 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.InterfaceC1702 m2584() {
        /*
            r6 = this;
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r6.f6291
            boolean r0 = r0.f6278
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            p210.AbstractC7935.m13395(r0)
        Lb:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r6.f6291
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r0.f6283
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r6 = androidx.compose.ui.node.AbstractC1785.m3336(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto La0
            androidx.compose.ui.node.飘花落叶言子苏楪哲世兰 r2 = r6.f5093
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r2 = r2.f5282
            int r2 = r2.f6284
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L8f
        L22:
            if (r0 == 0) goto L8f
            int r2 = r0.f6290
            r4 = r2 & r3
            if (r4 == 0) goto L8c
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4d
            boolean r6 = r0 instanceof androidx.compose.foundation.lazy.layout.C0719
            if (r6 == 0) goto L34
            goto L48
        L34:
            boolean r6 = r0 instanceof androidx.compose.ui.node.AbstractC1788
            if (r6 == 0) goto L47
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r0 = (androidx.compose.ui.node.AbstractC1788) r0
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r6 = r0.f5225
            r0 = r1
        L3d:
            if (r6 == 0) goto L48
            boolean r2 = r6 instanceof androidx.compose.foundation.lazy.layout.C0719
            if (r2 == 0) goto L44
            r0 = r6
        L44:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r6 = r6.f6287
            goto L3d
        L47:
            r0 = r1
        L48:
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪哲苏兰世 r0 = (androidx.compose.foundation.lazy.layout.C0719) r0
            if (r0 == 0) goto La0
            return r0
        L4d:
            r2 = r2 & 32
            if (r2 == 0) goto L8c
            boolean r2 = r0 instanceof androidx.compose.ui.modifier.InterfaceC1733
            if (r2 == 0) goto L57
            r4 = r0
            goto L6c
        L57:
            boolean r2 = r0 instanceof androidx.compose.ui.node.AbstractC1788
            if (r2 == 0) goto L6b
            r2 = r0
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r2 = (androidx.compose.ui.node.AbstractC1788) r2
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r2 = r2.f5225
            r4 = r1
        L61:
            if (r2 == 0) goto L6c
            boolean r5 = r2 instanceof androidx.compose.ui.modifier.InterfaceC1733
            if (r5 == 0) goto L68
            r4 = r2
        L68:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r2 = r2.f6287
            goto L61
        L6b:
            r4 = r1
        L6c:
            androidx.compose.ui.modifier.飘花落叶言子楪世哲苏兰 r4 = (androidx.compose.ui.modifier.InterfaceC1733) r4
            if (r4 == 0) goto L8c
            androidx.compose.ui.modifier.飘花落叶言子楪世苏哲兰 r2 = r4.mo3134()
            androidx.compose.ui.modifier.飘花落叶言子楪世哲兰苏 r5 = androidx.compose.ui.layout.AbstractC1706.f4977
            boolean r2 = r2.m3136(r5)
            if (r2 != 0) goto L7d
            goto L8c
        L7d:
            androidx.compose.ui.modifier.飘花落叶言子楪世苏哲兰 r6 = r4.mo3134()
            r6.getClass()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = ""
            r6.<init>(r0)
            throw r6
        L8c:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r0 = r0.f6283
            goto L22
        L8f:
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r6 = r6.m3246()
            if (r6 == 0) goto L9d
            androidx.compose.ui.node.飘花落叶言子苏楪哲世兰 r0 = r6.f5093
            if (r0 == 0) goto L9d
            androidx.compose.ui.node.飘花落叶言子哲楪世兰苏 r0 = r0.f5283
            goto L13
        L9d:
            r0 = r1
            goto L13
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.C1452.m2584():androidx.compose.ui.layout.飘花落叶言子楪苏世兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final C7327 m2585(InterfaceC1695 interfaceC1695) {
        C7327 c7327 = m2590().f4183;
        return c7327 != C1479.f4194 ? interfaceC1695 == null ? c7327 : c7327.m12497(interfaceC1695.mo3075(AbstractC1785.m3339(this), 0L)) : interfaceC1695 != null ? interfaceC1695.mo3079(AbstractC1785.m3339(this), false) : AbstractC5061.m10034(0L, AbstractC8189.m13654(AbstractC1785.m3339(this).f4997));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final boolean m2586(final int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m2590().f4179 ? m2589(i) : AbstractC1459.m2615(this, i, new InterfaceC6557() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p052.InterfaceC6557
                public final Boolean invoke(C1452 c1452) {
                    return Boolean.valueOf(c1452.m2589(i));
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final FocusStateImpl m2587() {
        C1811 c1811;
        if (!this.f6278) {
            return FocusStateImpl.Inactive;
        }
        C1452 c1452M2633 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getFocusOwner()).m2633();
        if (c1452M2633 == null) {
            return FocusStateImpl.Inactive;
        }
        if (this == c1452M2633) {
            return FocusStateImpl.Active;
        }
        if (c1452M2633.f6278) {
            if (!c1452M2633.f6291.f6278) {
                AbstractC7935.m13395("visitAncestors called on an unattached node");
            }
            AbstractC2128 abstractC2128 = c1452M2633.f6291.f6283;
            C1748 c1748M3336 = AbstractC1785.m3336(c1452M2633);
            while (c1748M3336 != null) {
                if ((c1748M3336.f5093.f5282.f6284 & 1024) != 0) {
                    while (abstractC2128 != null) {
                        if ((abstractC2128.f6290 & 1024) != 0) {
                            AbstractC2128 abstractC2128M3329 = abstractC2128;
                            C1224 c1224 = null;
                            while (abstractC2128M3329 != null) {
                                if (abstractC2128M3329 instanceof C1452) {
                                    if (this == ((C1452) abstractC2128M3329)) {
                                        return FocusStateImpl.ActiveParent;
                                    }
                                } else if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                    int i = 0;
                                    for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                                        if ((abstractC21282.f6290 & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
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
        }
        return FocusStateImpl.Inactive;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m2588() {
        int i = AbstractC1453.f4151[m2587().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return;
            }
            C4210.m8621();
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC1785.m3334(this, new InterfaceC6542() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.ui.focus.飘花落叶言子楪哲兰苏世] */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2581invoke() {
                ref$ObjectRef.element = this.m2590();
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m2581invoke();
                return C5175.f14739;
            }
        });
        T t = ref$ObjectRef.element;
        if (t == 0) {
            AbstractC4394.m8918("focusProperties");
            throw null;
        }
        if (((InterfaceC1476) t).mo2626()) {
            return;
        }
        ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getFocusOwner()).m2631(8, true, true);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m2589(int i) {
        int i2 = AbstractC1453.f4152[AbstractC1459.m2608(this, i).ordinal()];
        if (i2 == 1) {
            return AbstractC1459.m2605(this);
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        C4210.m8621();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final C1477 m2590() {
        boolean z;
        C1811 c1811;
        C1477 c1477 = new C1477();
        c1477.f4179 = true;
        C1468 c1468 = C1468.f4168;
        c1477.f4178 = c1468;
        c1477.f4177 = c1468;
        c1477.f4176 = c1468;
        c1477.f4175 = c1468;
        c1477.f4174 = c1468;
        c1477.f4181 = c1468;
        c1477.f4180 = c1468;
        c1477.f4184 = c1468;
        c1477.f4185 = new InterfaceC6557() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1463) obj);
                return C5175.f14739;
            }

            public final void invoke(InterfaceC1463 interfaceC1463) {
            }
        };
        c1477.f4182 = new InterfaceC6557() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1463) obj);
                return C5175.f14739;
            }

            public final void invoke(InterfaceC1463 interfaceC1463) {
            }
        };
        c1477.f4183 = C1479.f4194;
        int i = this.f4147;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((C7324) ((AbstractC1347) ((C7322) ((InterfaceC7323) AbstractC1785.m3346(this, AbstractC1902.f5582))).f19530).getValue()).f19531 == 1);
        } else {
            if (i != 2) {
                C5919.m11250("Unknown Focusability");
                return null;
            }
            z = false;
        }
        c1477.f4179 = z;
        AbstractC2128 abstractC2128 = this.f6291;
        if (!abstractC2128.f6278) {
            AbstractC7935.m13395("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC21282 = this.f6291;
        C1748 c1748M3336 = AbstractC1785.m3336(this);
        loop0: while (c1748M3336 != null) {
            if ((c1748M3336.f5093.f5282.f6284 & 3072) != 0) {
                while (abstractC21282 != null) {
                    int i2 = abstractC21282.f6290;
                    if ((i2 & 3072) != 0) {
                        if (abstractC21282 != abstractC2128 && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? c1224 = 0;
                            ?? M3329 = abstractC21282;
                            while (M3329 != 0) {
                                if (M3329 instanceof InterfaceC1469) {
                                    ((InterfaceC1469) M3329).mo2623(c1477);
                                } else if ((M3329.f6290 & 2048) != 0 && (M3329 instanceof AbstractC1788)) {
                                    AbstractC2128 abstractC21283 = ((AbstractC1788) M3329).f5225;
                                    int i3 = 0;
                                    M3329 = M3329;
                                    c1224 = c1224;
                                    while (abstractC21283 != null) {
                                        if ((abstractC21283.f6290 & 2048) != 0) {
                                            i3++;
                                            c1224 = c1224;
                                            if (i3 == 1) {
                                                M3329 = abstractC21283;
                                            } else {
                                                if (c1224 == 0) {
                                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                                }
                                                if (M3329 != 0) {
                                                    c1224.m2037(M3329);
                                                    M3329 = 0;
                                                }
                                                c1224.m2037(abstractC21283);
                                            }
                                        }
                                        abstractC21283 = abstractC21283.f6287;
                                        M3329 = M3329;
                                        c1224 = c1224;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                M3329 = AbstractC1785.m3329(c1224);
                            }
                        }
                    }
                    abstractC21282 = abstractC21282.f6283;
                }
            }
            c1748M3336 = c1748M3336.m3246();
            abstractC21282 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
        }
        return c1477;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m2591(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        C1811 c1811;
        InterfaceC6553 interfaceC6553;
        C1478 c1478 = (C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getFocusOwner();
        C1452 c1452M2633 = c1478.m2633();
        if (!AbstractC4394.m8917(focusStateImpl, focusStateImpl2) && (interfaceC6553 = this.f4150) != null) {
            interfaceC6553.invoke(focusStateImpl, focusStateImpl2);
        }
        AbstractC2128 abstractC2128 = this.f6291;
        if (!abstractC2128.f6278) {
            AbstractC7935.m13395("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC21282 = this.f6291;
        C1748 c1748M3336 = AbstractC1785.m3336(this);
        while (c1748M3336 != null) {
            if ((c1748M3336.f5093.f5282.f6284 & 5120) != 0) {
                while (abstractC21282 != null) {
                    int i = abstractC21282.f6290;
                    if ((i & 5120) != 0) {
                        if (abstractC21282 != abstractC2128 && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M3329 = abstractC21282;
                            ?? c1224 = 0;
                            while (M3329 != 0) {
                                if (M3329 instanceof InterfaceC1462) {
                                    InterfaceC1462 interfaceC1462 = (InterfaceC1462) M3329;
                                    if (c1452M2633 == c1478.m2633()) {
                                        interfaceC1462.mo1638(focusStateImpl2);
                                    }
                                } else if ((M3329.f6290 & 4096) != 0 && (M3329 instanceof AbstractC1788)) {
                                    AbstractC2128 abstractC21283 = ((AbstractC1788) M3329).f5225;
                                    int i2 = 0;
                                    M3329 = M3329;
                                    c1224 = c1224;
                                    while (abstractC21283 != null) {
                                        if ((abstractC21283.f6290 & 4096) != 0) {
                                            i2++;
                                            c1224 = c1224;
                                            if (i2 == 1) {
                                                M3329 = abstractC21283;
                                            } else {
                                                if (c1224 == 0) {
                                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                                }
                                                if (M3329 != 0) {
                                                    c1224.m2037(M3329);
                                                    M3329 = 0;
                                                }
                                                c1224.m2037(abstractC21283);
                                            }
                                        }
                                        abstractC21283 = abstractC21283.f6287;
                                        M3329 = M3329;
                                        c1224 = c1224;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M3329 = AbstractC1785.m3329(c1224);
                            }
                        }
                    }
                    abstractC21282 = abstractC21282.f6283;
                }
            }
            c1748M3336 = c1748M3336.m3246();
            abstractC21282 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1118() {
        if (m2587().isFocused()) {
            ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getFocusOwner()).m2631(8, true, true);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        int i = AbstractC1453.f4151[m2587().ordinal()];
        if (i == 1 || i == 2) {
            C1478 c1478 = (C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getFocusOwner();
            c1478.m2631(8, true, false);
            if (this.f4146) {
                c1478.f4191.m3526();
            }
            c1478.f4188.m2639();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            C4210.m8621();
            return;
        }
        InterfaceC1483 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getFocusOwner();
        C1452 c1452M2597 = AbstractC1459.m2597(this);
        if (c1452M2597 == null || !c1452M2597.f4146) {
            return;
        }
        C1478 c14782 = (C1478) focusOwner;
        c14782.f4191.m3526();
        c14782.f4188.m2639();
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1126() {
        m2588();
    }

    @Override // androidx.compose.ui.node.InterfaceC1776
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo1566(InterfaceC1695 interfaceC1695) {
    }
}
