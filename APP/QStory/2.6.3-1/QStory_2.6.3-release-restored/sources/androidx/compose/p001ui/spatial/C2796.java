package androidx.compose.p001ui.spatial;

import android.os.Trace;
import androidx.appcompat.widget.C0984;
import androidx.collection.C1091;
import androidx.collection.C1093;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.node.AbstractC2592;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2573;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.node.InterfaceC2641;
import androidx.compose.p001ui.platform.C2746;
import androidx.compose.p001ui.platform.RunnableC2727;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import kotlin.C6008;
import p068.InterfaceC7372;
import p128.C8159;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f6164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f6165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1091 f6166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2801 f6167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0984 f6168;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f6169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public RunnableC2727 f6170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C8159 f6172;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f6173;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC7372 f6174;

    public C2796(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        this.f6169 = viewTreeObserverOnGlobalLayoutListenerC2719;
        C0984 c0984 = new C0984(3, (char) 0);
        c0984.f940 = new long[192];
        c0984.f939 = new long[192];
        this.f6168 = c0984;
        this.f6167 = new C2801();
        this.f6166 = new C1091();
        this.f6173 = -1L;
        this.f6174 = new InterfaceC7372() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4242invoke() {
                C2796 c2796 = this.this$0;
                c2796.f6170 = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c2796.m4249();
                } finally {
                    Trace.endSection();
                }
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4242invoke();
                return C6008.f15084;
            }
        };
        this.f6172 = new C8159();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long m4243(C2583 c2583) {
        C2646 c2646 = c2583.f5439;
        AbstractC2629 abstractC2629 = c2646.f5630;
        long jM13921 = 0;
        for (AbstractC2629 abstractC26292 = c2646.f5631; abstractC26292 != null && abstractC26292 != abstractC2629; abstractC26292 = abstractC26292.f5601) {
            if (m4244(abstractC26292)) {
                return 9223372034707292159L;
            }
            jM13921 = C8737.m13921(jM13921, abstractC26292.f5590);
        }
        return jM13921;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m4244(AbstractC2629 abstractC2629) {
        InterfaceC2641 interfaceC2641 = abstractC2629.f5605;
        return (interfaceC2641 == null || AbstractC2416.m3446(((C2746) interfaceC2641).m4171())) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m4245(C2583 c2583) {
        if (!c2583.f5469 || m4244(c2583.f5439.f5630)) {
            return;
        }
        c2583.f5469 = false;
        if (c2583.f5462) {
            c2583.f5463 = m4243(c2583);
            c2583.f5462 = false;
        }
        if (C8737.m13923(c2583.f5463, 9223372034707292159L)) {
            return;
        }
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            m4245((C2583) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4246(C2583 c2583) {
        long j;
        boolean zM3802 = c2583.m3802();
        C2646 c2646 = c2583.f5439;
        if (zM3802 && c2583.f5466) {
            C2583 c2583M3816 = c2583.m3816();
            if (c2583M3816 == null || c2583M3816.f5469) {
                j = c2583M3816 == null ? 0L : 9223372034707292159L;
            } else {
                if (c2583M3816.f5462) {
                    c2583M3816.f5462 = false;
                    c2583M3816.f5463 = m4243(c2583M3816);
                }
                j = c2583M3816.f5463;
            }
            AbstractC2629 abstractC2629 = c2646.f5630;
            if (C8737.m13923(j, 9223372034707292159L) || m4244(abstractC2629)) {
                m4247(c2583);
            } else if (c2583.f5469) {
                m4247(c2583);
                m4245(c2583);
            } else {
                long jM13921 = C8737.m13921(j, abstractC2629.f5590);
                C2573 c2573 = c2583.f5477.f5512;
                int iMo3699 = c2573.mo3699();
                int iMo3698 = c2573.mo3698();
                int i = c2583.f5468;
                boolean z = c2583.f5467;
                C0984 c0984 = this.f6168;
                long j2 = 4294967295L;
                if (!z) {
                    c2583.f5467 = true;
                    boolean zM3988 = c2646.m3988(1024);
                    boolean zM39882 = c2646.m3988(16);
                    boolean zM1394 = this.f6167.f6186.m1394(i);
                    if (c2583M3816 != null) {
                        int i2 = c2583M3816.f5468;
                        int i3 = (int) (jM13921 >> 32);
                        int i4 = (int) (jM13921 & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) c0984.f940;
                        int i6 = c0984.f941 - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                c0984.m1136(i5, i7, i8, i7 + iMo3699, i8 + iMo3698, i2, zM3988, zM39882, zM1394, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (jM13921 >> 32);
                        int i10 = (int) (jM13921 & 4294967295L);
                        c0984.m1136(i, i9, i10, i9 + iMo3699, i10 + iMo3698, (544 & 32) != 0 ? -1 : 0, zM3988, zM39882, zM1394, -1);
                    }
                } else if (c2583M3816 != null) {
                    int i11 = c2583M3816.f5468;
                    int i12 = (int) (jM13921 >> 32);
                    int i13 = (int) (jM13921 & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = (long[]) c0984.f940;
                    int i15 = c0984.f941;
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
                            int i19 = i17 + iMo3699;
                            int i20 = i18 + iMo3698;
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
                                        int i27 = AbstractC2797.f6175;
                                        c0984.m1124(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
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
                    int i28 = (int) (jM13921 >> 32);
                    int i29 = (int) (jM13921 & 4294967295L);
                    int i30 = iMo3699 + i28;
                    int i31 = i29 + iMo3698;
                    int i32 = i & 33554431;
                    long[] jArr4 = (long[]) c0984.f940;
                    int i33 = c0984.f941;
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
                                int i39 = AbstractC2797.f6175;
                                c0984.m1124(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i34 += 3;
                        }
                    }
                }
            }
            c2583.f5466 = false;
            this.f6165 = true;
            m4251();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4247(C2583 c2583) {
        boolean z;
        boolean z2 = true;
        c2583.f5469 = true;
        C2646 c2646 = c2583.f5439;
        AbstractC2629 abstractC2629 = c2646.f5630;
        C2573 c2573 = c2583.f5477.f5512;
        int iMo3699 = c2573.mo3699();
        float fMo3698 = c2573.mo3698();
        C8159 c8159 = this.f6172;
        c8159.f19890 = 0.0f;
        c8159.f19889 = 0.0f;
        c8159.f19888 = iMo3699;
        c8159.f19887 = fMo3698;
        while (true) {
            if (abstractC2629 == null) {
                break;
            }
            C2583 c25832 = abstractC2629.f5604;
            if (abstractC2629 == c25832.f5439.f5630 && !c25832.f5469) {
                if (!C8737.m13923(m4248(c25832), 9223372034707292159L)) {
                    c8159.m13092((((long) Float.floatToRawIntBits((int) (r9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (r9 & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            InterfaceC2641 interfaceC2641 = abstractC2629.f5605;
            if (interfaceC2641 != null) {
                float[] fArrM4171 = ((C2746) interfaceC2641).m4171();
                if (!AbstractC2416.m3446(fArrM4171)) {
                    C2422.m3465(fArrM4171, c8159);
                }
            }
            long j = abstractC2629.f5590;
            c8159.m13092((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            abstractC2629 = abstractC2629.f5601;
        }
        int i = (int) c8159.f19890;
        int i2 = (int) c8159.f19889;
        int i3 = (int) c8159.f19888;
        int i4 = (int) c8159.f19887;
        int i5 = c2583.f5468;
        boolean z3 = c2583.f5467;
        c2583.f5467 = true;
        C0984 c0984 = this.f6168;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) c0984.f940;
            int i7 = c0984.f941;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (((long) i) << 32) | (((long) i2) & 4294967295L);
                    jArr[i8 + 1] = (((long) i3) << 32) | (((long) i4) & 4294967295L);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i8 += 3;
                z2 = z;
            }
            z = z2;
            C2583 c2583M3816 = c2583.m3816();
            c0984.m1136(i5, i, i2, i3, i4, (544 & 32) != 0 ? -1 : c2583M3816 == null ? c2583M3816.f5468 : -1, c2646.m3988(1024), c2646.m3988(16), this.f6167.f6186.m1394(i5), -1);
        } else {
            z = z2;
            C2583 c2583M38162 = c2583.m3816();
            c0984.m1136(i5, i, i2, i3, i4, (544 & 32) != 0 ? -1 : c2583M38162 == null ? c2583M38162.f5468 : -1, c2646.m3988(1024), c2646.m3988(16), this.f6167.f6186.m1394(i5), -1);
        }
        c2583.f5466 = false;
        this.f6165 = z;
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i10 = c2059M3799.f3865;
        for (int i11 = 0; i11 < i10; i11++) {
            C2583 c25833 = (C2583) objArr[i11];
            if (c25833.m3802()) {
                m4247(c25833);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m4248(C2583 c2583) {
        long j;
        int i = c2583.f5468 & 33554431;
        C0984 c0984 = this.f6168;
        long[] jArr = (long[]) c0984.f940;
        int i2 = c0984.f941;
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
    */
    public final void m4249() {
        boolean z;
        long j;
        C0984 c0984;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        RunnableC2727 runnableC2727 = this.f6170;
        if (runnableC2727 != null) {
            this.f6169.removeCallbacks(runnableC2727);
            this.f6170 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f6165;
        boolean z3 = z2 || this.f6164;
        C0984 c09842 = this.f6168;
        boolean z4 = true;
        C2801 c2801 = this.f6167;
        if (z2) {
            this.f6165 = false;
            C1091 c1091 = this.f6166;
            Object[] objArr = c1091.f1350;
            int i3 = c1091.f1349;
            for (int i4 = 0; i4 < i3; i4++) {
                ((InterfaceC7372) objArr[i4]).invoke();
            }
            long[] jArr2 = (long[]) c09842.f940;
            int i5 = c09842.f941;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    C2802 c2802 = (C2802) c2801.f6186.m1393(((int) j6) & 33554431);
                    while (c2802 != null) {
                        C2802 c28022 = c2802.f6190;
                        boolean z6 = z3;
                        long j9 = c2802.f6195;
                        boolean z7 = (jCurrentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        c2802.f6189 = j7;
                        c2802.f6188 = j8;
                        if (z7) {
                            c2802.f6195 = jCurrentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            c2802.m4255(j4, j5, c2801.f6183, c2801.f6182, c2801.f6187);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        c2802 = c28022;
                        j7 = j4;
                        j8 = j5;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) c09842.f940;
            int i8 = c09842.f941;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f6164) {
            this.f6164 = false;
            long j10 = c2801.f6183;
            long j11 = c2801.f6182;
            float[] fArr = c2801.f6187;
            C1093 c1093 = c2801.f6186;
            j2 = 128;
            Object[] objArr2 = c1093.f1317;
            long[] jArr4 = c1093.f1319;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    c0984 = c09842;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                C2802 c28023 = (C2802) objArr2[(i11 << 3) + i15];
                                while (c28023 != null) {
                                    c2801.m4253(c28023, j12, j11, fArr, jCurrentTimeMillis);
                                    c28023 = c28023.f6190;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    c09842 = c0984;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = c2801.f6183;
                    long j16 = c2801.f6182;
                    float[] fArr2 = c2801.f6187;
                    C2802 c28024 = c2801.f6185;
                    if (c28024 != null) {
                        while (c28024 != null) {
                            C2583 c2583M3906 = AbstractC2620.m3906(c28024.f6192);
                            long jM4248 = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583M3906)).getRectManager().m4248(c2583M3906);
                            c28024.f6189 = jM4248;
                            C2573 c2573 = c2583M3906.f5477.f5512;
                            c28024.f6188 = (((long) (c2573.f5344 + ((int) (jM4248 >> 32)))) << 32) | (((long) (c2573.f5342 + ((int) (jM4248 & 4294967295L)))) & 4294967295L);
                            c2801.m4253(c28024, j15, j16, fArr2, jCurrentTimeMillis);
                            c28024 = c28024.f6190;
                        }
                    }
                }
                if (this.f6171) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.f6171 = false;
                    C0984 c09843 = c0984;
                    long[] jArr6 = (long[]) c09843.f940;
                    int i17 = c09843.f941;
                    long[] jArr7 = (long[]) c09843.f939;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != AbstractC2797.f6176) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    c09843.f941 = i18;
                    c09843.f940 = jArr7;
                    c09843.f939 = jArr6;
                }
                if (c2801.f6184 <= jCurrentTimeMillis) {
                    C1093 c10932 = c2801.f6186;
                    Object[] objArr3 = c10932.f1317;
                    long[] jArr8 = c10932.f1319;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (C2802 c28025 = (C2802) objArr3[(i21 << 3) + i23]; c28025 != null; c28025 = c28025.f6190) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                } else if (i21 == length2) {
                                    break;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    C2802 c28026 = c2801.f6185;
                    if (c28026 != null) {
                        while (c28026 != null) {
                            c28026 = c28026.f6190;
                        }
                    }
                    c2801.f6184 = -1L;
                }
                if (c2801.f6184 <= j) {
                    m4251();
                    return;
                }
                return;
            }
            c0984 = c09842;
            i = 8;
        } else {
            c0984 = c09842;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.f6171) {
        }
        if (c2801.f6184 <= jCurrentTimeMillis) {
        }
        if (c2801.f6184 <= j) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4250(C2583 c2583) {
        if (c2583.f5467) {
            int i = c2583.f5468 & 33554431;
            C0984 c0984 = this.f6168;
            long[] jArr = (long[]) c0984.f940;
            int i2 = c0984.f941;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = AbstractC2797.f6176;
                    break;
                }
                i3 += 3;
            }
            c2583.f5467 = false;
            c2583.f5466 = true;
            this.f6165 = true;
            this.f6171 = true;
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
    public final void m4251() {
        RunnableC2727 runnableC2727 = this.f6170;
        boolean z = runnableC2727 != null;
        long j = this.f6167.f6184;
        if (j >= 0 || !z) {
            if (this.f6173 == j && z) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f6169;
            if (runnableC2727 != null) {
                viewTreeObserverOnGlobalLayoutListenerC2719.removeCallbacks(runnableC2727);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f6173 = jMax;
            RunnableC2727 runnableC27272 = new RunnableC2727(this.f6174, 1);
            viewTreeObserverOnGlobalLayoutListenerC2719.postDelayed(runnableC27272, jMax - jCurrentTimeMillis);
            this.f6170 = runnableC27272;
        }
    }
}
