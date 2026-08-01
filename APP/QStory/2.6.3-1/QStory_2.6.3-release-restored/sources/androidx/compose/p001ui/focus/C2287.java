package androidx.compose.p001ui.focus;

import android.os.Trace;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.layout.C1560;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2541;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.layout.InterfaceC2537;
import androidx.compose.p001ui.modifier.InterfaceC2568;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.node.InterfaceC2611;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.collection.C2059;
import io.ktor.util.C5043;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p127.C8152;
import p127.C8154;
import p127.InterfaceC8153;
import p128.C8157;
import p191.AbstractC8568;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2287 extends AbstractC2961 implements InterfaceC2618, InterfaceC2611, InterfaceC2626, InterfaceC2568, InterfaceC2622 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f4492;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int f4493;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f4494;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f4495;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC7383 f4496;

    public C2287(int i, InterfaceC7383 interfaceC7383, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        interfaceC7383 = (i2 & 4) != 0 ? null : interfaceC7383;
        this.f4492 = z;
        this.f4496 = interfaceC7383;
        this.f4493 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2537 m3154() {
        C2646 c2646;
        Object obj;
        if (!this.f6637.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC2961 = this.f6637.f6629;
        C2583 c2583M3906 = AbstractC2620.m3906(this);
        while (true) {
            if (c2583M3906 == null) {
                break;
            }
            if ((c2583M3906.f5439.f5628.f6630 & 8388640) != 0) {
                while (abstractC2961 != null) {
                    int i = abstractC2961.f6636;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(abstractC2961 instanceof C1560)) {
                                if (abstractC2961 instanceof AbstractC2623) {
                                    abstractC2961 = null;
                                    for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                        if (abstractC29612 instanceof C1560) {
                                            abstractC2961 = abstractC29612;
                                        }
                                    }
                                } else {
                                    abstractC2961 = null;
                                }
                            }
                            C1560 c1560 = (C1560) abstractC2961;
                            if (c1560 != null) {
                                return c1560;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (abstractC2961 instanceof InterfaceC2568) {
                                obj = abstractC2961;
                            } else if (abstractC2961 instanceof AbstractC2623) {
                                obj = null;
                                for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                    if (abstractC29613 instanceof InterfaceC2568) {
                                        obj = abstractC29613;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            InterfaceC2568 interfaceC2568 = (InterfaceC2568) obj;
                            if (interfaceC2568 != null && interfaceC2568.mo3704().m3706(AbstractC2541.f5323)) {
                                interfaceC2568.mo3704().getClass();
                                throw new IllegalStateException("");
                            }
                        }
                    }
                    abstractC2961 = abstractC2961.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final C8157 m3155(InterfaceC2530 interfaceC2530) {
        C8157 c8157 = m3160().f4529;
        return c8157 != C2314.f4540 ? interfaceC2530 == null ? c8157 : c8157.m13083(interfaceC2530.mo3645(AbstractC2620.m3909(this), 0L)) : interfaceC2530 != null ? interfaceC2530.mo3649(AbstractC2620.m3909(this), false) : AbstractC8568.m13629(0L, AbstractC1298.m1700(AbstractC2620.m3909(this).f5343));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final boolean m3156(final int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m3160().f4525 ? m3159(i) : AbstractC2294.m3185(this, i, new InterfaceC7387() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public final Boolean invoke(C2287 c2287) {
                    return Boolean.valueOf(c2287.m3159(i));
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final FocusStateImpl m3157() {
        C2646 c2646;
        if (!this.f6624) {
            return FocusStateImpl.Inactive;
        }
        C2287 c2287M3203 = ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getFocusOwner()).m3203();
        if (c2287M3203 == null) {
            return FocusStateImpl.Inactive;
        }
        if (this == c2287M3203) {
            return FocusStateImpl.Active;
        }
        if (c2287M3203.f6624) {
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
                            C2059 c2059 = null;
                            while (abstractC2961M3899 != null) {
                                if (abstractC2961M3899 instanceof C2287) {
                                    if (this == ((C2287) abstractC2961M3899)) {
                                        return FocusStateImpl.ActiveParent;
                                    }
                                } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                    int i = 0;
                                    for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                        if ((abstractC29612.f6636 & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
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
        }
        return FocusStateImpl.Inactive;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m3158() {
        int i = AbstractC2288.f4497[m3157().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return;
            }
            C5043.m9170();
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC2620.m3904(this, new InterfaceC7372() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.ui.focus.飘花落叶言子楪哲兰苏世] */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3151invoke() {
                ref$ObjectRef.element = this.m3160();
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m3151invoke();
                return C6008.f15084;
            }
        });
        T t = ref$ObjectRef.element;
        if (t == 0) {
            AbstractC5227.m9467("focusProperties");
            throw null;
        }
        if (((InterfaceC2311) t).mo3196()) {
            return;
        }
        ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getFocusOwner()).m3201(8, true, true);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m3159(int i) {
        int i2 = AbstractC2288.f4498[AbstractC2294.m3178(this, i).ordinal()];
        if (i2 == 1) {
            return AbstractC2294.m3175(this);
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        C5043.m9170();
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
    public final C2312 m3160() {
        boolean z;
        C2646 c2646;
        C2312 c2312 = new C2312();
        c2312.f4525 = true;
        C2303 c2303 = C2303.f4514;
        c2312.f4524 = c2303;
        c2312.f4523 = c2303;
        c2312.f4522 = c2303;
        c2312.f4521 = c2303;
        c2312.f4520 = c2303;
        c2312.f4527 = c2303;
        c2312.f4526 = c2303;
        c2312.f4530 = c2303;
        c2312.f4531 = new InterfaceC7387() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2298) obj);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2298 interfaceC2298) {
            }
        };
        c2312.f4528 = new InterfaceC7387() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2298) obj);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2298 interfaceC2298) {
            }
        };
        c2312.f4529 = C2314.f4540;
        int i = this.f4493;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((C8154) ((AbstractC2182) ((C8152) ((InterfaceC8153) AbstractC2620.m3916(this, AbstractC2737.f5928))).f19870).getValue()).f19871 == 1);
        } else {
            if (i != 2) {
                C6755.m11870("Unknown Focusability");
                return null;
            }
            z = false;
        }
        c2312.f4525 = z;
        AbstractC2961 abstractC2961 = this.f6637;
        if (!abstractC2961.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC29612 = this.f6637;
        C2583 c2583M3906 = AbstractC2620.m3906(this);
        loop0: while (c2583M3906 != null) {
            if ((c2583M3906.f5439.f5628.f6630 & 3072) != 0) {
                while (abstractC29612 != null) {
                    int i2 = abstractC29612.f6636;
                    if ((i2 & 3072) != 0) {
                        if (abstractC29612 != abstractC2961 && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? c2059 = 0;
                            ?? M3899 = abstractC29612;
                            while (M3899 != 0) {
                                if (M3899 instanceof InterfaceC2304) {
                                    ((InterfaceC2304) M3899).mo3193(c2312);
                                } else if ((M3899.f6636 & 2048) != 0 && (M3899 instanceof AbstractC2623)) {
                                    AbstractC2961 abstractC29613 = ((AbstractC2623) M3899).f5571;
                                    int i3 = 0;
                                    M3899 = M3899;
                                    c2059 = c2059;
                                    while (abstractC29613 != null) {
                                        if ((abstractC29613.f6636 & 2048) != 0) {
                                            i3++;
                                            c2059 = c2059;
                                            if (i3 == 1) {
                                                M3899 = abstractC29613;
                                            } else {
                                                if (c2059 == 0) {
                                                    c2059 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (M3899 != 0) {
                                                    c2059.m2607(M3899);
                                                    M3899 = 0;
                                                }
                                                c2059.m2607(abstractC29613);
                                            }
                                        }
                                        abstractC29613 = abstractC29613.f6633;
                                        M3899 = M3899;
                                        c2059 = c2059;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                M3899 = AbstractC2620.m3899(c2059);
                            }
                        }
                    }
                    abstractC29612 = abstractC29612.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC29612 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
        return c2312;
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
    public final void m3161(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        C2646 c2646;
        InterfaceC7383 interfaceC7383;
        C2313 c2313 = (C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getFocusOwner();
        C2287 c2287M3203 = c2313.m3203();
        if (!AbstractC5227.m9466(focusStateImpl, focusStateImpl2) && (interfaceC7383 = this.f4496) != null) {
            interfaceC7383.invoke(focusStateImpl, focusStateImpl2);
        }
        AbstractC2961 abstractC2961 = this.f6637;
        if (!abstractC2961.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC29612 = this.f6637;
        C2583 c2583M3906 = AbstractC2620.m3906(this);
        while (c2583M3906 != null) {
            if ((c2583M3906.f5439.f5628.f6630 & 5120) != 0) {
                while (abstractC29612 != null) {
                    int i = abstractC29612.f6636;
                    if ((i & 5120) != 0) {
                        if (abstractC29612 != abstractC2961 && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M3899 = abstractC29612;
                            ?? c2059 = 0;
                            while (M3899 != 0) {
                                if (M3899 instanceof InterfaceC2297) {
                                    InterfaceC2297 interfaceC2297 = (InterfaceC2297) M3899;
                                    if (c2287M3203 == c2313.m3203()) {
                                        interfaceC2297.mo2208(focusStateImpl2);
                                    }
                                } else if ((M3899.f6636 & 4096) != 0 && (M3899 instanceof AbstractC2623)) {
                                    AbstractC2961 abstractC29613 = ((AbstractC2623) M3899).f5571;
                                    int i2 = 0;
                                    M3899 = M3899;
                                    c2059 = c2059;
                                    while (abstractC29613 != null) {
                                        if ((abstractC29613.f6636 & 4096) != 0) {
                                            i2++;
                                            c2059 = c2059;
                                            if (i2 == 1) {
                                                M3899 = abstractC29613;
                                            } else {
                                                if (c2059 == 0) {
                                                    c2059 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (M3899 != 0) {
                                                    c2059.m2607(M3899);
                                                    M3899 = 0;
                                                }
                                                c2059.m2607(abstractC29613);
                                            }
                                        }
                                        abstractC29613 = abstractC29613.f6633;
                                        M3899 = M3899;
                                        c2059 = c2059;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M3899 = AbstractC2620.m3899(c2059);
                            }
                        }
                    }
                    abstractC29612 = abstractC29612.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC29612 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1679() {
        if (m3157().isFocused()) {
            ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getFocusOwner()).m3201(8, true, true);
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        int i = AbstractC2288.f4497[m3157().ordinal()];
        if (i == 1 || i == 2) {
            C2313 c2313 = (C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getFocusOwner();
            c2313.m3201(8, true, false);
            if (this.f4492) {
                c2313.f4537.m4096();
            }
            c2313.f4534.m3209();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            C5043.m9170();
            return;
        }
        InterfaceC2318 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getFocusOwner();
        C2287 c2287M3167 = AbstractC2294.m3167(this);
        if (c2287M3167 == null || !c2287M3167.f4492) {
            return;
        }
        C2313 c23132 = (C2313) focusOwner;
        c23132.f4537.m4096();
        c23132.f4534.m3209();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        m3158();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2611
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo2136(InterfaceC2530 interfaceC2530) {
    }
}
