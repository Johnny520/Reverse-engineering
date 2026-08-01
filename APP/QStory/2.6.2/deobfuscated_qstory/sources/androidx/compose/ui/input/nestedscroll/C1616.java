package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.node.InterfaceC1764;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6557;
import p112.C7328;
import p210.AbstractC7935;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1616 extends AbstractC2128 implements InterfaceC1764, InterfaceC1620 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC1620 f4728;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final String f4729;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1616 f4730;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1619 f4731;

    public C1616(InterfaceC1620 interfaceC1620, C1619 c1619) {
        this.f4728 = interfaceC1620;
        this.f4731 = c1619 == null ? new C1619() : c1619;
        this.f4729 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long mo2976(int i, long j) {
        C1616 c1616M2978 = this.f6278 ? m2978() : null;
        long jMo2976 = c1616M2978 != null ? c1616M2978.mo2976(i, j) : 0L;
        return C7328.m12498(jMo2976, this.f4728.mo2976(i, C7328.m12499(j, jMo2976)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final InterfaceC5400 m2977() {
        C1616 c1616M2978 = m2978();
        InterfaceC5400 interfaceC5400M2977 = c1616M2978 != null ? c1616M2978.m2977() : null;
        if (interfaceC5400M2977 != null && AbstractC5398.m10491(interfaceC5400M2977)) {
            return interfaceC5400M2977;
        }
        InterfaceC5400 interfaceC5400 = this.f4731.f4734;
        if (interfaceC5400 != null) {
            return interfaceC5400;
        }
        C5919.m11250("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final C1616 m2978() {
        C1811 c1811;
        InterfaceC1764 interfaceC1764 = null;
        if (!this.f6278) {
            return null;
        }
        if (!this.f6291.f6278) {
            AbstractC7935.m13395("visitAncestors called on an unattached node");
        }
        AbstractC2128 abstractC2128 = this.f6291.f6283;
        C1748 c1748M3336 = AbstractC1785.m3336(this);
        loop0: while (true) {
            if (c1748M3336 == null) {
                break;
            }
            if ((c1748M3336.f5093.f5282.f6284 & 262144) != 0) {
                while (abstractC2128 != null) {
                    if ((abstractC2128.f6290 & 262144) != 0) {
                        AbstractC2128 abstractC2128M3329 = abstractC2128;
                        C1224 c1224 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof InterfaceC1764) {
                                InterfaceC1764 interfaceC17642 = (InterfaceC1764) abstractC2128M3329;
                                if (AbstractC4394.m8917(this.f4729, interfaceC17642.mo1349()) && C1616.class == interfaceC17642.getClass()) {
                                    interfaceC1764 = interfaceC17642;
                                    break loop0;
                                }
                            }
                            if ((abstractC2128M3329.f6290 & 262144) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i = 0;
                                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                                    if ((abstractC21282.f6290 & 262144) != 0) {
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
        return (C1616) interfaceC1764;
    }

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final long mo1244(long j, long j2, int i) {
        long jMo1244 = this.f4728.mo1244(j, j2, i);
        C1616 c1616M2978 = this.f6278 ? m2978() : null;
        return C7328.m12498(jMo1244, c1616M2978 != null ? c1616M2978.mo1244(C7328.m12498(j, jMo1244), C7328.m12499(j2, jMo1244), i) : 0L);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC1785.m3325(this, new InterfaceC6557() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p052.InterfaceC6557
            public final Boolean invoke(InterfaceC1764 interfaceC1764) {
                boolean z;
                if (((AbstractC2128) interfaceC1764).f6291.f6278) {
                    ref$ObjectRef.element = interfaceC1764;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        C1616 c1616 = (C1616) ((InterfaceC1764) ref$ObjectRef.element);
        this.f4730 = c1616;
        C1619 c1619 = this.f4731;
        c1619.f4736 = c1616;
        if (c1619.f4737 == this) {
            c1619.f4737 = null;
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        C1619 c1619 = this.f4731;
        c1619.f4737 = this;
        c1619.f4736 = null;
        this.f4730 = null;
        c1619.f4735 = new NestedScrollNode$updateDispatcherFields$1(this);
        this.f4731.f4734 = m3857();
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1349() {
        return this.f4729;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2979(long r7, kotlin.coroutines.InterfaceC4356 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            long r6 = r0.J$0
            kotlin.AbstractC5184.m10206(r9)
            goto L6a
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L33:
            long r7 = r0.J$0
            kotlin.AbstractC5184.m10206(r9)
            goto L51
        L39:
            kotlin.AbstractC5184.m10206(r9)
            boolean r9 = r6.f6278
            if (r9 == 0) goto L44
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r3 = r6.m2978()
        L44:
            if (r3 == 0) goto L56
            r0.J$0 = r7
            r0.label = r5
            java.lang.Object r9 = r3.mo2979(r7, r0)
            if (r9 != r1) goto L51
            goto L68
        L51:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r9 = (p205.C7901) r9
            long r2 = r9.f21874
            goto L58
        L56:
            r2 = 0
        L58:
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏哲兰 r6 = r6.f4728
            long r7 = p205.C7901.m13321(r7, r2)
            r0.J$0 = r2
            r0.label = r4
            java.lang.Object r9 = r6.mo2979(r7, r0)
            if (r9 != r1) goto L69
        L68:
            return r1
        L69:
            r6 = r2
        L6a:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r9 = (p205.C7901) r9
            long r8 = r9.f21874
            long r6 = p205.C7901.m13320(r6, r8)
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r8 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.C1616.mo2979(long, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1245(long r13, long r15, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r1 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r7.label
            r8 = 0
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 == r3) goto L37
            if (r2 != r9) goto L31
            long r12 = r7.J$0
            kotlin.AbstractC5184.m10206(r0)
            goto L83
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r12)
            return r8
        L37:
            long r13 = r7.J$1
            long r2 = r7.J$0
            kotlin.AbstractC5184.m10206(r0)
            r10 = r2
            r2 = r13
            r13 = r10
            goto L57
        L42:
            kotlin.AbstractC5184.m10206(r0)
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏哲兰 r2 = r12.f4728
            r7.J$0 = r13
            r5 = r15
            r7.J$1 = r5
            r7.label = r3
            r3 = r13
            java.lang.Object r0 = r2.mo1245(r3, r5, r7)
            if (r0 != r1) goto L56
            goto L81
        L56:
            r2 = r15
        L57:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7901) r0
            long r4 = r0.f21874
            boolean r0 = r12.f6278
            if (r0 == 0) goto L67
            if (r0 == 0) goto L65
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r8 = r12.m2978()
        L65:
            r12 = r8
            goto L6a
        L67:
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r8 = r12.f4730
            goto L65
        L6a:
            if (r12 == 0) goto L89
            long r13 = p205.C7901.m13320(r13, r4)
            long r2 = p205.C7901.m13321(r2, r4)
            r7.J$0 = r4
            r7.label = r9
            r15 = r2
            r17 = r7
            java.lang.Object r0 = r12.mo1245(r13, r15, r17)
            if (r0 != r1) goto L82
        L81:
            return r1
        L82:
            r12 = r4
        L83:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7901) r0
            long r0 = r0.f21874
            r4 = r12
            goto L8b
        L89:
            r0 = 0
        L8b:
            long r12 = p205.C7901.m13320(r4, r0)
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r14 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.C1616.mo1245(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
