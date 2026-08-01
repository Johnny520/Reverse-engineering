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
import kotlin.C5175;
import p052.InterfaceC6542;
import p112.C7329;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5818;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5819;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0244 f5820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1966 f5821;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0137 f5822;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5823;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public RunnableC1892 f5824;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f5825;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7329 f5826;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f5827;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6542 f5828;

    public C1961(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5823 = viewTreeObserverOnGlobalLayoutListenerC1884;
        C0137 c0137 = new C0137(3, (char) 0);
        c0137.f595 = new long[192];
        c0137.f594 = new long[192];
        this.f5822 = c0137;
        this.f5821 = new C1966();
        this.f5820 = new C0244();
        this.f5827 = -1L;
        this.f5828 = new InterfaceC6542() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3672invoke() {
                C1961 c1961 = this.this$0;
                c1961.f5824 = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c1961.m3679();
                } finally {
                    Trace.endSection();
                }
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3672invoke();
                return C5175.f14739;
            }
        };
        this.f5826 = new C7329();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long m3673(C1748 c1748) {
        C1811 c1811 = c1748.f5093;
        AbstractC1794 abstractC1794 = c1811.f5284;
        long jM13334 = 0;
        for (AbstractC1794 abstractC17942 = c1811.f5285; abstractC17942 != null && abstractC17942 != abstractC1794; abstractC17942 = abstractC17942.f5255) {
            if (m3674(abstractC17942)) {
                return 9223372034707292159L;
            }
            jM13334 = C7907.m13334(jM13334, abstractC17942.f5244);
        }
        return jM13334;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m3674(AbstractC1794 abstractC1794) {
        InterfaceC1806 interfaceC1806 = abstractC1794.f5259;
        return (interfaceC1806 == null || AbstractC1581.m2876(((C1911) interfaceC1806).m3601())) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m3675(C1748 c1748) {
        if (!c1748.f5123 || m3674(c1748.f5093.f5284)) {
            return;
        }
        c1748.f5123 = false;
        if (c1748.f5116) {
            c1748.f5117 = m3673(c1748);
            c1748.f5116 = false;
        }
        if (C7907.m13336(c1748.f5117, 9223372034707292159L)) {
            return;
        }
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            m3675((C1748) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3676(C1748 c1748) {
        long j;
        boolean zM3232 = c1748.m3232();
        C1811 c1811 = c1748.f5093;
        if (zM3232 && c1748.f5120) {
            C1748 c1748M3246 = c1748.m3246();
            if (c1748M3246 == null || c1748M3246.f5123) {
                j = c1748M3246 == null ? 0L : 9223372034707292159L;
            } else {
                if (c1748M3246.f5116) {
                    c1748M3246.f5116 = false;
                    c1748M3246.f5117 = m3673(c1748M3246);
                }
                j = c1748M3246.f5117;
            }
            AbstractC1794 abstractC1794 = c1811.f5284;
            if (C7907.m13336(j, 9223372034707292159L) || m3674(abstractC1794)) {
                m3677(c1748);
            } else if (c1748.f5123) {
                m3677(c1748);
                m3675(c1748);
            } else {
                long jM13334 = C7907.m13334(j, abstractC1794.f5244);
                C1738 c1738 = c1748.f5131.f5166;
                int iMo3129 = c1738.mo3129();
                int iMo3128 = c1738.mo3128();
                int i = c1748.f5122;
                boolean z = c1748.f5121;
                C0137 c0137 = this.f5822;
                long j2 = 4294967295L;
                if (!z) {
                    c1748.f5121 = true;
                    boolean zM3418 = c1811.m3418(1024);
                    boolean zM34182 = c1811.m3418(16);
                    boolean zM833 = this.f5821.f5840.m833(i);
                    if (c1748M3246 != null) {
                        int i2 = c1748M3246.f5122;
                        int i3 = (int) (jM13334 >> 32);
                        int i4 = (int) (jM13334 & 4294967295L);
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
                                c0137.m575(i5, i7, i8, i7 + iMo3129, i8 + iMo3128, i2, zM3418, zM34182, zM833, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (jM13334 >> 32);
                        int i10 = (int) (jM13334 & 4294967295L);
                        c0137.m575(i, i9, i10, i9 + iMo3129, i10 + iMo3128, (544 & 32) != 0 ? -1 : 0, zM3418, zM34182, zM833, -1);
                    }
                } else if (c1748M3246 != null) {
                    int i11 = c1748M3246.f5122;
                    int i12 = (int) (jM13334 >> 32);
                    int i13 = (int) (jM13334 & 4294967295L);
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
                            int i19 = i17 + iMo3129;
                            int i20 = i18 + iMo3128;
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
                                        int i27 = AbstractC1962.f5829;
                                        c0137.m563(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
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
                    int i28 = (int) (jM13334 >> 32);
                    int i29 = (int) (jM13334 & 4294967295L);
                    int i30 = iMo3129 + i28;
                    int i31 = i29 + iMo3128;
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
                                int i39 = AbstractC1962.f5829;
                                c0137.m563(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i34 += 3;
                        }
                    }
                }
            }
            c1748.f5120 = false;
            this.f5819 = true;
            m3681();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3677(androidx.compose.ui.node.C1748 r23) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.C1961.m3677(androidx.compose.ui.node.飘花落叶言子世楪兰哲苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m3678(C1748 c1748) {
        long j;
        int i = c1748.f5122 & 33554431;
        C0137 c0137 = this.f5822;
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
    public final void m3679() {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.C1961.m3679():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3680(C1748 c1748) {
        if (c1748.f5121) {
            int i = c1748.f5122 & 33554431;
            C0137 c0137 = this.f5822;
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
                    jArr[i4] = AbstractC1962.f5830;
                    break;
                }
                i3 += 3;
            }
            c1748.f5121 = false;
            c1748.f5120 = true;
            this.f5819 = true;
            this.f5825 = true;
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
    public final void m3681() {
        RunnableC1892 runnableC1892 = this.f5824;
        boolean z = runnableC1892 != null;
        long j = this.f5821.f5838;
        if (j >= 0 || !z) {
            if (this.f5827 == j && z) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5823;
            if (runnableC1892 != null) {
                viewTreeObserverOnGlobalLayoutListenerC1884.removeCallbacks(runnableC1892);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f5827 = jMax;
            RunnableC1892 runnableC18922 = new RunnableC1892(this.f5828, 1);
            viewTreeObserverOnGlobalLayoutListenerC1884.postDelayed(runnableC18922, jMax - jCurrentTimeMillis);
            this.f5824 = runnableC18922;
        }
    }
}
