package androidx.compose.ui.node;

import androidx.appcompat.widget.C0191;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.AbstractC1720;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.C1664;
import androidx.compose.ui.layout.C1679;
import androidx.compose.ui.layout.C1685;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import java.util.Map;
import kotlin.C5176;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1754 extends AbstractC1724 implements InterfaceC1737, InterfaceC1653 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final InterfaceC6558 f5143 = new InterfaceC6558() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(androidx.compose.ui.node.C1800 r15) {
            /*
                r14 = this;
                boolean r14 = r15.mo3255()
                if (r14 == 0) goto L6f
                androidx.compose.ui.node.飘花落叶言子世苏兰哲楪 r0 = r15.f5267
                boolean r14 = r0.f5147
                if (r14 == 0) goto Ld
                goto L6f
            Ld:
                androidx.compose.ui.layout.飘花落叶言子世兰苏哲楪 r14 = r15.f5268
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r14 = r14.mo1470()
                androidx.collection.飘花落叶言子世兰楪苏哲 r1 = r0.f5144
                if (r14 != 0) goto L62
                if (r1 == 0) goto L6f
                java.lang.Object[] r14 = r1.f879
                long[] r15 = r1.f881
                int r2 = r15.length
                int r2 = r2 + (-2)
                if (r2 < 0) goto L5e
                r3 = 0
                r4 = r3
            L24:
                r5 = r15[r4]
                long r7 = ~r5
                r9 = 7
                long r7 = r7 << r9
                long r7 = r7 & r5
                r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r7 = r7 & r9
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 == 0) goto L59
                int r7 = r4 - r2
                int r7 = ~r7
                int r7 = r7 >>> 31
                r8 = 8
                int r7 = 8 - r7
                r9 = r3
            L3e:
                if (r9 >= r7) goto L57
                r10 = 255(0xff, double:1.26E-321)
                long r10 = r10 & r5
                r12 = 128(0x80, double:6.3E-322)
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 >= 0) goto L53
                int r10 = r4 << 3
                int r10 = r10 + r9
                r10 = r14[r10]
                androidx.collection.飘花落叶言子世兰楪哲苏 r10 = (androidx.collection.C0235) r10
                r0.m3289(r10)
            L53:
                long r5 = r5 >> r8
                int r9 = r9 + 1
                goto L3e
            L57:
                if (r7 != r8) goto L5e
            L59:
                if (r4 == r2) goto L5e
                int r4 = r4 + 1
                goto L24
            L5e:
                r1.m754()
                return
            L62:
                r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
                r4 = 0
                r1 = r15
                r0.m3294(r1, r2, r4)
                r0.f5152 = r14
            L6f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.invoke(androidx.compose.ui.node.飘花落叶言子苏兰楪哲世):void");
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1800) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C0236 f5144;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C0191 f5145;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C1664 f5146 = new C1664(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f5147;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f5148;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C1800 f5149;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f5150;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C1755 f5151;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC6558 f5152;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public static void m3288(AbstractC1794 abstractC1794) {
        C1759 c1759;
        AbstractC1794 abstractC17942 = abstractC1794.f5257;
        C1748 c1748 = abstractC1794.f5259;
        if (!AbstractC4395.m8907(abstractC17942 != null ? abstractC17942.f5259 : null, c1748)) {
            c1748.f5132.f5167.f5020.m3324();
            return;
        }
        InterfaceC1769 interfaceC1769Mo3175 = c1748.f5132.f5167.mo3175();
        if (interfaceC1769Mo3175 == null || (c1759 = ((C1738) interfaceC1769Mo3175).f5020) == null) {
            return;
        }
        c1759.m3324();
    }

    @Override // androidx.compose.ui.node.InterfaceC1737
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo3164(boolean z) {
        AbstractC1754 abstractC1754Mo3200 = mo3200();
        C1748 c1748Mo3204 = abstractC1754Mo3200 != null ? abstractC1754Mo3200.mo3204() : null;
        if (AbstractC4395.m8907(c1748Mo3204, mo3204())) {
            this.f5150 = z;
            return;
        }
        if ((c1748Mo3204 != null ? c1748Mo3204.f5132.f5159 : null) != LayoutNode$LayoutState.LayingOut) {
            if ((c1748Mo3204 != null ? c1748Mo3204.f5132.f5159 : null) != LayoutNode$LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        this.f5150 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void m3289(C0235 c0235) {
        C1748 c1748;
        Object[] objArr = c0235.f1000;
        long[] jArr = c0235.f1001;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (c1748 = (C1748) ((C1762) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo1497()) {
                            c1748.m3228(false);
                        } else {
                            c1748.m3225(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public abstract AbstractC1754 mo3200();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public abstract InterfaceC1657 mo3201();

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final C1755 m3290() {
        C1755 c1755 = this.f5151;
        if (c1755 != null) {
            return c1755;
        }
        C1755 c17552 = new C1755(this);
        this.f5151 = c17552;
        return c17552;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public abstract long mo3202();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public abstract AbstractC1754 mo3203();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final int m3291(AbstractC1689 abstractC1689) {
        int iMo3286;
        if (!mo3206() || (iMo3286 = mo3286(abstractC1689)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = abstractC1689 instanceof C1679;
        long j = this.f4995;
        return iMo3286 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public abstract C1748 mo3204();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public abstract InterfaceC1695 mo3205();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public abstract boolean mo3206();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract void mo3211();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3292(androidx.compose.ui.node.C1748 r32, androidx.compose.ui.layout.AbstractC1720 r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AbstractC1754.m3292(androidx.compose.ui.node.飘花落叶言子世楪兰哲苏, androidx.compose.ui.layout.飘花落叶言子苏哲世兰楪):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3293(androidx.compose.ui.layout.InterfaceC1657 r15) {
        /*
            r14 = this;
            androidx.collection.飘花落叶言子世兰楪苏哲 r0 = r14.f5144
            boolean r1 = r14.f5147
            if (r1 == 0) goto L8
            goto Lbd
        L8:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r1 = r15.mo1470()
            r2 = 0
            if (r1 != 0) goto L59
            if (r0 == 0) goto Lbd
            java.lang.Object[] r15 = r0.f879
            long[] r1 = r0.f881
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L55
            r4 = r2
        L1b:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L50
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L35:
            if (r9 >= r7) goto L4e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            androidx.collection.飘花落叶言子世兰楪哲苏 r10 = (androidx.collection.C0235) r10
            r14.m3289(r10)
        L4a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4e:
            if (r7 != r8) goto L55
        L50:
            if (r4 == r3) goto L55
            int r4 = r4 + 1
            goto L1b
        L55:
            r0.m754()
            return
        L59:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r0 = r14.f5152
            r3 = 1
            if (r0 == r1) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r2
        L61:
            r4 = 0
            if (r0 != 0) goto L9a
            androidx.compose.ui.node.飘花落叶言子世苏兰楪哲 r1 = r14.m3290()
            boolean r1 = r1.f5156
            if (r1 == 0) goto L9a
            androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世 r0 = r14.mo3205()
            long r4 = r0.mo3084(r4)
            long r4 = p253.AbstractC8190.m13681(r4)
            long r0 = r0.mo3088()
            androidx.compose.ui.node.飘花落叶言子世苏兰楪哲 r6 = r14.m3290()
            long r6 = r6.f5154
            boolean r6 = p205.C7908.m13364(r4, r6)
            if (r6 == 0) goto L95
            androidx.compose.ui.node.飘花落叶言子世苏兰楪哲 r6 = r14.m3290()
            long r6 = r6.f5155
            boolean r6 = p205.C7906.m13357(r0, r6)
            if (r6 != 0) goto L96
        L95:
            r2 = r3
        L96:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La1
        L9a:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La1:
            if (r0 == 0) goto Lbd
            androidx.compose.ui.node.飘花落叶言子苏兰楪哲世 r0 = r14.f5149
            if (r0 == 0) goto Lac
            r0.f5268 = r15
        La9:
            r1 = r14
            r2 = r0
            goto Lb4
        Lac:
            androidx.compose.ui.node.飘花落叶言子苏兰楪哲世 r0 = new androidx.compose.ui.node.飘花落叶言子苏兰楪哲世
            r0.<init>(r15, r14)
            r14.f5149 = r0
            goto La9
        Lb4:
            r1.m3294(r2, r3, r5)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r14 = r15.mo1470()
            r1.f5152 = r14
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AbstractC1754.m3293(androidx.compose.ui.layout.飘花落叶言子世兰苏哲楪):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m3294(final C1800 c1800, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        C1748 c1748;
        boolean z2;
        int i;
        char c2;
        long j6;
        C1803 snapshotObserver;
        C0236 c0236 = this.f5144;
        C0191 c0191 = this.f5145;
        if (c0191 == null) {
            c0191 = new C0191();
            this.f5145 = c0191;
        }
        C0191 c01912 = c0191;
        InterfaceC1801 interfaceC1801 = mo3204().f5105;
        if (interfaceC1801 != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).getSnapshotObserver()) != null) {
            snapshotObserver.f5274.m2246(c1800, f5143, new InterfaceC6543() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3152invoke() {
                    AbstractC1754 abstractC1754 = this.this$0;
                    InterfaceC6558 interfaceC6558 = AbstractC1754.f5143;
                    abstractC1754.m3290().f5156 = false;
                    this.this$0.m3290().f5154 = j;
                    this.this$0.m3290().f5155 = j2;
                    InterfaceC6558 interfaceC6558Mo1470 = c1800.f5268.mo1470();
                    if (interfaceC6558Mo1470 != null) {
                        interfaceC6558Mo1470.invoke(this.this$0.m3290());
                    }
                }

                @Override // p052.InterfaceC6543
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3152invoke();
                    return C5176.f14739;
                }
            });
        }
        boolean zMo1497 = mo1497();
        C0235 c0235 = (C0235) c01912.f746;
        C0235 c02352 = (C0235) c01912.f752;
        int i2 = c01912.f750;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) c01912.f747)[i3];
            if (b == 3) {
                AbstractC1720 abstractC1720 = ((AbstractC1720[]) c01912.f749)[i3];
                abstractC1720.getClass();
                c02352.m745(abstractC1720);
            } else if (b != 0 && c0236 != null) {
                AbstractC1720 abstractC17202 = ((AbstractC1720[]) c01912.f749)[i3];
                abstractC17202.getClass();
                C0235 c02353 = (C0235) c0236.m758(abstractC17202);
                if (c02353 != null) {
                    c0235.m748(c02353);
                }
            }
        }
        int i4 = c01912.f750;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) c01912.f747;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                AbstractC1720[] abstractC1720Arr = (AbstractC1720[]) c01912.f749;
                abstractC1720Arr[i6 - i5] = abstractC1720Arr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = c01912.f750;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((AbstractC1720[]) c01912.f749)[i8] = null;
        }
        c01912.f750 -= i5;
        AbstractC1754 abstractC1754Mo3200 = mo3200();
        Object[] objArr = c02352.f1000;
        long[] jArr = c02352.f1001;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            AbstractC1720 abstractC17203 = (AbstractC1720) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            AbstractC1754 abstractC1754 = abstractC1754Mo3200 == null ? this : abstractC1754Mo3200;
                            i = i9;
                            AbstractC1754 abstractC17542 = abstractC1754;
                            while (true) {
                                C0191 c01913 = abstractC17542.f5145;
                                if (c01913 != null) {
                                    z2 = zMo1497;
                                    if (!AbstractC4347.m8837(abstractC17203, (AbstractC1720[]) c01913.f749)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z2 = zMo1497;
                                AbstractC1754 abstractC1754Mo32002 = abstractC17542.mo3200();
                                if (abstractC1754Mo32002 == null) {
                                    break;
                                }
                                abstractC17542 = abstractC1754Mo32002;
                                zMo1497 = z2;
                            }
                            C0236 c02362 = abstractC17542.f5144;
                            C0235 c02354 = c02362 != null ? (C0235) c02362.m758(abstractC17203) : null;
                            if (c02354 != null) {
                                abstractC1754.m3289(c02354);
                            }
                        } else {
                            z2 = zMo1497;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zMo1497 = z2;
                    }
                    z = zMo1497;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zMo1497;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zMo1497 = z;
                i9 = 8;
            }
        } else {
            z = zMo1497;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        c02352.m740();
        Object[] objArr2 = c0235.f1000;
        long[] jArr2 = c0235.f1001;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (c1748 = (C1748) ((C1762) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                c1748.m3228(false);
                            } else {
                                c1748.m3225(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        c0235.m740();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public abstract int mo3286(AbstractC1689 abstractC1689);

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC1657 mo1496(int i, int i2, Map map, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC7936.m13423("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1685(i, i2, map, interfaceC6558, interfaceC65582, this, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public boolean mo1497() {
        return false;
    }
}
