package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.appcompat.widget.C0137;
import androidx.collection.C0244;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1738;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.node.InterfaceC1806;
import androidx.compose.ui.platform.C1911;
import androidx.compose.ui.platform.RunnableC1892;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlin.C5176;
import p052.InterfaceC6543;
import p112.C7330;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5819;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0244 f5821;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1966 f5822;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0137 f5823;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5824;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public RunnableC1892 f5825;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f5826;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7330 f5827;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f5828;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6543 f5829;

    public C1961(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5824 = viewTreeObserverOnGlobalLayoutListenerC1884;
        C0137 c0137 = new C0137(3, (char) 0);
        c0137.f595 = new long[192];
        c0137.f594 = new long[192];
        this.f5823 = c0137;
        this.f5822 = new C1966();
        this.f5821 = new C0244();
        this.f5828 = -1L;
        this.f5829 = new InterfaceC6543() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3682invoke() {
                C1961 c1961 = this.this$0;
                c1961.f5825 = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c1961.m3689();
                } finally {
                    Trace.endSection();
                }
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3682invoke();
                return C5176.f14739;
            }
        };
        this.f5827 = new C7330();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long m3683(C1748 c1748) {
        C1811 c1811 = c1748.f5094;
        AbstractC1794 abstractC1794 = c1811.f5285;
        long jM13362 = 0;
        for (AbstractC1794 abstractC17942 = c1811.f5286; abstractC17942 != null && abstractC17942 != abstractC1794; abstractC17942 = abstractC17942.f5256) {
            if (m3684(abstractC17942)) {
                return 9223372034707292159L;
            }
            jM13362 = C7908.m13362(jM13362, abstractC17942.f5245);
        }
        return jM13362;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m3684(AbstractC1794 abstractC1794) {
        InterfaceC1806 interfaceC1806 = abstractC1794.f5260;
        return (interfaceC1806 == null || AbstractC1581.m2886(((C1911) interfaceC1806).m3611())) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m3685(C1748 c1748) {
        if (!c1748.f5124 || m3684(c1748.f5094.f5285)) {
            return;
        }
        c1748.f5124 = false;
        if (c1748.f5117) {
            c1748.f5118 = m3683(c1748);
            c1748.f5117 = false;
        }
        if (C7908.m13364(c1748.f5118, 9223372034707292159L)) {
            return;
        }
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            m3685((C1748) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3686(C1748 c1748) {
        long j;
        boolean zM3242 = c1748.m3242();
        C1811 c1811 = c1748.f5094;
        if (zM3242 && c1748.f5121) {
            C1748 c1748M3256 = c1748.m3256();
            if (c1748M3256 == null || c1748M3256.f5124) {
                j = c1748M3256 == null ? 0L : 9223372034707292159L;
            } else {
                if (c1748M3256.f5117) {
                    c1748M3256.f5117 = false;
                    c1748M3256.f5118 = m3683(c1748M3256);
                }
                j = c1748M3256.f5118;
            }
            AbstractC1794 abstractC1794 = c1811.f5285;
            if (C7908.m13364(j, 9223372034707292159L) || m3684(abstractC1794)) {
                m3687(c1748);
            } else if (c1748.f5124) {
                m3687(c1748);
                m3685(c1748);
            } else {
                long jM13362 = C7908.m13362(j, abstractC1794.f5245);
                C1738 c1738 = c1748.f5132.f5167;
                int iMo3139 = c1738.mo3139();
                int iMo3138 = c1738.mo3138();
                int i = c1748.f5123;
                boolean z = c1748.f5122;
                C0137 c0137 = this.f5823;
                long j2 = 4294967295L;
                if (!z) {
                    c1748.f5122 = true;
                    boolean zM3428 = c1811.m3428(1024);
                    boolean zM34282 = c1811.m3428(16);
                    boolean zM834 = this.f5822.f5841.m834(i);
                    if (c1748M3256 != null) {
                        int i2 = c1748M3256.f5123;
                        int i3 = (int) (jM13362 >> 32);
                        int i4 = (int) (jM13362 & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) c0137.f595;
                        int i6 = c0137.f596 - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                c0137.m576(i5, i7, i8, i7 + iMo3139, i8 + iMo3138, i2, zM3428, zM34282, zM834, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (jM13362 >> 32);
                        int i10 = (int) (jM13362 & 4294967295L);
                        c0137.m576(i, i9, i10, i9 + iMo3139, i10 + iMo3138, (544 & 32) != 0 ? -1 : 0, zM3428, zM34282, zM834, -1);
                    }
                } else if (c1748M3256 != null) {
                    int i11 = c1748M3256.f5123;
                    int i12 = (int) (jM13362 >> 32);
                    int i13 = (int) (jM13362 & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = (long[]) c0137.f595;
                    int i15 = c0137.f596;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= jArr2.length - 2 || i16 >= i15) {
                            break;
                        }
                        long j4 = j2;
                        if ((((int) jArr2[i16 + 2]) & 33554431) == i11) {
                            long j5 = jArr2[i16];
                            int i17 = ((int) (j5 >> 32)) + i12;
                            int i18 = ((int) j5) + i13;
                            int i19 = i17 + iMo3139;
                            int i20 = i18 + iMo3138;
                            i16 += 3;
                            while (i16 < jArr2.length - 2 && i16 < i15) {
                                int i21 = i16 + 2;
                                int i22 = i11;
                                int i23 = i12;
                                long j6 = jArr2[i21];
                                int i24 = i13;
                                if ((((int) j6) & 33554431) == i14) {
                                    long j7 = jArr2[i16];
                                    long[] jArr3 = jArr2;
                                    int i25 = i17 - ((int) (j7 >> 32));
                                    int i26 = i18 - ((int) j7);
                                    jArr3[i16] = (((long) i18) & j4) | (((long) i17) << 32);
                                    jArr3[i16 + 1] = (((long) i19) << 32) | (((long) i20) & j4);
                                    jArr3[i21] = j6 | (((j6 >> 63) & 1) << 60);
                                    if (i25 != 0 || i26 != 0) {
                                        int i27 = AbstractC1962.f5830;
                                        c0137.m564(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
                                    }
                                } else {
                                    i16 += 3;
                                    i11 = i22;
                                    i12 = i23;
                                    i13 = i24;
                                }
                            }
                        }
                        i16 += 3;
                        jArr2 = jArr2;
                        j2 = j4;
                        i11 = i11;
                        i12 = i12;
                        i13 = i13;
                    }
                } else {
                    int i28 = (int) (jM13362 >> 32);
                    int i29 = (int) (jM13362 & 4294967295L);
                    int i30 = iMo3139 + i28;
                    int i31 = i29 + iMo3138;
                    int i32 = i & 33554431;
                    long[] jArr4 = (long[]) c0137.f595;
                    int i33 = c0137.f596;
                    int i34 = 0;
                    while (true) {
                        if (i34 >= jArr4.length - 2 || i34 >= i33) {
                            break;
                        }
                        int i35 = i34 + 2;
                        long j8 = jArr4[i35];
                        if ((((int) j8) & 33554431) == i32) {
                            long j9 = jArr4[i34];
                            int i36 = i34;
                            jArr4[i36] = (((long) i28) << 32) | (((long) i29) & 4294967295L);
                            jArr4[i36 + 1] = (((long) i30) << 32) | (((long) i31) & 4294967295L);
                            jArr4[i35] = (((j8 >> 63) & 1) << 60) | j8;
                            int i37 = i28 - ((int) (j9 >> 32));
                            int i38 = i29 - ((int) j9);
                            if ((i37 != 0) | (i38 != 0)) {
                                int i39 = AbstractC1962.f5830;
                                c0137.m564(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i34 += 3;
                        }
                    }
                }
            }
            c1748.f5121 = false;
            this.f5820 = true;
            m3691();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3687(androidx.compose.ui.node.C1748 r23) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.C1961.m3687(androidx.compose.ui.node.飘花落叶言子世楪兰哲苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m3688(C1748 c1748) {
        long j;
        int i = c1748.f5123 & 33554431;
        C0137 c0137 = this.f5823;
        long[] jArr = (long[]) c0137.f595;
        int i2 = c0137.f596;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) j)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3689() {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.C1961.m3689():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3690(C1748 c1748) {
        if (c1748.f5122) {
            int i = c1748.f5123 & 33554431;
            C0137 c0137 = this.f5823;
            long[] jArr = (long[]) c0137.f595;
            int i2 = c0137.f596;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = AbstractC1962.f5831;
                    break;
                }
                i3 += 3;
            }
            c1748.f5122 = false;
            c1748.f5121 = true;
            this.f5820 = true;
            this.f5826 = true;
        }
    }

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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3691() {
        RunnableC1892 runnableC1892 = this.f5825;
        boolean z = runnableC1892 != null;
        long j = this.f5822.f5839;
        if (j >= 0 || !z) {
            if (this.f5828 == j && z) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5824;
            if (runnableC1892 != null) {
                viewTreeObserverOnGlobalLayoutListenerC1884.removeCallbacks(runnableC1892);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f5828 = jMax;
            RunnableC1892 runnableC18922 = new RunnableC1892(this.f5829, 1);
            viewTreeObserverOnGlobalLayoutListenerC1884.postDelayed(runnableC18922, jMax - jCurrentTimeMillis);
            this.f5825 = runnableC18922;
        }
    }
}
