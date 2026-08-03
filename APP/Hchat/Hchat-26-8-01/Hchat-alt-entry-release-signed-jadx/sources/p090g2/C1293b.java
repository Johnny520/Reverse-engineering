package p090g2;

import ac.C0058k;
import bsh.org.objectweb.asm.Opcodes;
import p015b0.RunnableC0133c;
import p041d1.C0655c0;
import p057e1.C0806a;
import p069f.C0933f0;
import p069f.C0965w;
import p071f1.AbstractC0996c0;
import p071f1.C1008i0;
import p085fg.InterfaceC1220a;
import p131j0.C2046b;
import p293u2.C4240j;
import p339x1.AbstractC5613i0;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p339x1.C5652v0;
import p339x1.InterfaceC5638q1;
import p357y1.C5916o1;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: g2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1293b {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f4314a;

    /* JADX INFO: renamed from: b */
    public final C0058k f4315b;

    /* JADX INFO: renamed from: c */
    public final C1296e f4316c;

    /* JADX INFO: renamed from: d */
    public final C0933f0 f4317d;

    /* JADX INFO: renamed from: e */
    public boolean f4318e;

    /* JADX INFO: renamed from: f */
    public boolean f4319f;

    /* JADX INFO: renamed from: g */
    public boolean f4320g;

    /* JADX INFO: renamed from: h */
    public RunnableC0133c f4321h;

    /* JADX INFO: renamed from: i */
    public long f4322i;

    /* JADX INFO: renamed from: j */
    public final C0655c0 f4323j;

    /* JADX INFO: renamed from: k */
    public final C0806a f4324k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1293b(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        this.f4314a = viewTreeObserverOnGlobalLayoutListenerC5934t;
        C0058k c0058k = new C0058k(2, (char) 0);
        c0058k.f177i = new long[Opcodes.CHECKCAST];
        c0058k.f178j = new long[Opcodes.CHECKCAST];
        this.f4315b = c0058k;
        this.f4316c = new C1296e();
        this.f4317d = new C0933f0();
        this.f4322i = -1L;
        this.f4323j = new C0655c0(this, 1);
        this.f4324k = new C0806a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m3431c(AbstractC5614i1 abstractC5614i1) {
        InterfaceC5638q1 interfaceC5638q1 = abstractC5614i1.f22866R;
        return (interfaceC5638q1 == null || AbstractC0996c0.m2518o(((C5916o1) interfaceC5638q1).m10624b())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static long m3432e(C5602f0 c5602f0) {
        C5587b1 c5587b1 = c5602f0.f22778L;
        AbstractC5614i1 abstractC5614i1 = c5587b1.f22717d;
        long jM8530d = 0;
        for (AbstractC5614i1 abstractC5614i12 = c5587b1.f22716c; abstractC5614i12 != null && abstractC5614i12 != abstractC5614i1; abstractC5614i12 = abstractC5614i12.f22870w) {
            if (m3431c(abstractC5614i12)) {
                return 9223372034707292159L;
            }
            jM8530d = C4240j.m8530d(jM8530d, abstractC5614i12.f22854F);
        }
        return jM8530d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m3433h(C5602f0 c5602f0) {
        if (!c5602f0.f22792i || m3431c(c5602f0.f22778L.f22717d)) {
            return;
        }
        c5602f0.f22792i = false;
        if (c5602f0.f22794k) {
            c5602f0.f22793j = m3432e(c5602f0);
            c5602f0.f22794k = false;
        }
        if (C4240j.m8528b(c5602f0.f22793j, 9223372034707292159L)) {
            return;
        }
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            m3433h((C5602f0) objArr[i10]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3434a() {
        boolean z9;
        long j3;
        C0058k c0058k;
        int i9;
        long j4;
        long j5;
        int i10;
        long[] jArr;
        long j10;
        long j11;
        RunnableC0133c runnableC0133c = this.f4321h;
        if (runnableC0133c != null) {
            this.f4314a.removeCallbacks(runnableC0133c);
            this.f4321h = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.f4318e;
        boolean z11 = z10 || this.f4319f;
        C0058k c0058k2 = this.f4315b;
        boolean z12 = true;
        C1296e c1296e = this.f4316c;
        if (z10) {
            this.f4318e = false;
            C0933f0 c0933f0 = this.f4317d;
            Object[] objArr = c0933f0.f2923a;
            int i11 = c0933f0.f2924b;
            for (int i12 = 0; i12 < i11; i12++) {
                ((InterfaceC1220a) objArr[i12]).invoke();
            }
            long[] jArr2 = (long[]) c0058k2.f177i;
            int i13 = c0058k2.f176h;
            int i14 = 0;
            while (i14 < jArr2.length - 2 && i14 < i13) {
                long j12 = jArr2[i14 + 2];
                boolean z13 = z12;
                int i15 = i13;
                if ((((int) (j12 >> 60)) & 1) != 0) {
                    long j13 = jArr2[i14];
                    long j14 = jArr2[i14 + 1];
                    C1295d c1295d = (C1295d) c1296e.f4340a.m2313b(((int) j12) & 33554431);
                    while (c1295d != null) {
                        C1295d c1295d2 = c1295d.f4335d;
                        boolean z14 = z11;
                        long j15 = c1295d.f4338g;
                        boolean z15 = (jCurrentTimeMillis - j15 >= 0 || j15 == Long.MIN_VALUE) ? z13 : false;
                        c1295d.f4336e = j13;
                        c1295d.f4337f = j14;
                        if (z15) {
                            c1295d.f4338g = jCurrentTimeMillis;
                            j10 = j13;
                            j11 = j14;
                            c1295d.m3440a(j10, j11, c1296e.f4343d, c1296e.f4344e, c1296e.f4346g);
                        } else {
                            j10 = j13;
                            j11 = j14;
                        }
                        c1295d = c1295d2;
                        j13 = j10;
                        j14 = j11;
                        z11 = z14;
                    }
                }
                i14 += 3;
                z12 = z13;
                i13 = i15;
                z11 = z11;
            }
            z9 = z11;
            j3 = 0;
            long[] jArr3 = (long[]) c0058k2.f177i;
            int i16 = c0058k2.f176h;
            for (int i17 = 0; i17 < jArr3.length - 2 && i17 < i16; i17 += 3) {
                int i18 = i17 + 2;
                jArr3[i18] = jArr3[i18] & (-1152921504606846977L);
            }
        } else {
            z9 = z11;
            j3 = 0;
        }
        if (this.f4319f) {
            this.f4319f = false;
            long j16 = c1296e.f4343d;
            long j17 = c1296e.f4344e;
            float[] fArr = c1296e.f4346g;
            C0965w c0965w = c1296e.f4340a;
            j4 = 128;
            Object[] objArr2 = c0965w.f2965c;
            long[] jArr4 = c0965w.f2963a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i19 = 0;
                int i20 = 8;
                j5 = 255;
                while (true) {
                    long j18 = j16;
                    long j19 = jArr4[i19];
                    int i21 = i20;
                    c0058k = c0058k2;
                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i22 = 8 - ((~(i19 - length)) >>> 31);
                        long j20 = j19;
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j20 & 255) < 128) {
                                C1295d c1295d3 = (C1295d) objArr2[(i19 << 3) + i23];
                                while (c1295d3 != null) {
                                    c1296e.m3442a(c1295d3, j18, j17, fArr, jCurrentTimeMillis);
                                    c1295d3 = c1295d3.f4335d;
                                    i21 = i21;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i24 = i21;
                            j20 >>= i24;
                            i23++;
                            j18 = j18;
                            i21 = i24;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i9 = i21;
                        j16 = j18;
                        if (i22 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i9 = i21;
                        j16 = j18;
                    }
                    if (i19 == length) {
                        break;
                    }
                    i19++;
                    i20 = i9;
                    c0058k2 = c0058k;
                    jArr4 = jArr;
                }
                if (z9) {
                    long j21 = c1296e.f4343d;
                    long j22 = c1296e.f4344e;
                    float[] fArr2 = c1296e.f4346g;
                    C1295d c1295d4 = c1296e.f4341b;
                    if (c1295d4 != null) {
                        while (c1295d4 != null) {
                            C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c1295d4.f4333b);
                            long jM3435b = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0M10167w)).getRectManager().m3435b(c5602f0M10167w);
                            c1295d4.f4336e = jM3435b;
                            C5652v0 c5652v0 = c5602f0M10167w.f22779M.f22891p;
                            c1295d4.f4337f = (((long) (c5652v0.f14593g + ((int) (jM3435b >> 32)))) << 32) | (((long) (c5652v0.f14594h + ((int) (jM3435b & 4294967295L)))) & 4294967295L);
                            c1296e.m3442a(c1295d4, j21, j22, fArr2, jCurrentTimeMillis);
                            c1295d4 = c1295d4.f4335d;
                        }
                    }
                }
                if (this.f4320g) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    this.f4320g = false;
                    C0058k c0058k3 = c0058k;
                    long[] jArr6 = (long[]) c0058k3.f177i;
                    int i25 = c0058k3.f176h;
                    long[] jArr7 = (long[]) c0058k3.f178j;
                    int i26 = 0;
                    for (int i27 = 0; i27 < jArr6.length - 2 && i26 < jArr7.length - 2 && i27 < i25; i27 += 3) {
                        int i28 = i27 + 2;
                        if (jArr6[i28] != AbstractC1292a.f4313c) {
                            jArr7[i26] = jArr6[i27];
                            jArr7[i26 + 1] = jArr6[i27 + 1];
                            jArr7[i26 + 2] = jArr6[i28];
                            i26 += 3;
                        }
                    }
                    c0058k3.f176h = i26;
                    c0058k3.f177i = jArr7;
                    c0058k3.f178j = jArr6;
                }
                if (c1296e.f4342c <= jCurrentTimeMillis) {
                    C0965w c0965w2 = c1296e.f4340a;
                    Object[] objArr3 = c0965w2.f2965c;
                    long[] jArr8 = c0965w2.f2963a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i29 = i10;
                        while (true) {
                            long j23 = jArr8[i29];
                            if ((((~j23) << 7) & j23 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                long j24 = j23;
                                for (int i31 = i10; i31 < i30; i31++) {
                                    if ((j24 & j5) < j4) {
                                        for (C1295d c1295d5 = (C1295d) objArr3[(i29 << 3) + i31]; c1295d5 != null; c1295d5 = c1295d5.f4335d) {
                                        }
                                    }
                                    j24 >>= i9;
                                }
                                if (i30 != i9) {
                                    break;
                                } else if (i29 == length2) {
                                    break;
                                } else {
                                    i29++;
                                }
                            }
                        }
                    }
                    C1295d c1295d6 = c1296e.f4341b;
                    if (c1295d6 != null) {
                        while (c1295d6 != null) {
                            c1295d6 = c1295d6.f4335d;
                        }
                    }
                    c1296e.f4342c = -1L;
                }
                if (c1296e.f4342c <= j3) {
                    m3439i();
                    return;
                }
                return;
            }
            c0058k = c0058k2;
            i9 = 8;
        } else {
            c0058k = c0058k2;
            i9 = 8;
            j4 = 128;
        }
        j5 = 255;
        if (z9) {
        }
        if (this.f4320g) {
        }
        if (c1296e.f4342c <= jCurrentTimeMillis) {
        }
        if (c1296e.f4342c <= j3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m3435b(C5602f0 c5602f0) {
        long j3;
        int i9 = c5602f0.f22791h & 33554431;
        C0058k c0058k = this.f4315b;
        long[] jArr = (long[]) c0058k.f177i;
        int i10 = c0058k.f176h;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & 33554431) == i9) {
                j3 = jArr[i11];
                break;
            }
        }
        j3 = Long.MAX_VALUE;
        if (j3 == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) (j3 >> 32))) << 32) | (((long) ((int) j3)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3436d(C5602f0 c5602f0) {
        boolean z9;
        boolean z10 = true;
        c5602f0.f22792i = true;
        C5587b1 c5587b1 = c5602f0.f22778L;
        AbstractC5614i1 abstractC5614i1 = c5587b1.f22717d;
        C5652v0 c5652v0 = c5602f0.f22779M.f22891p;
        int iMo8826w0 = c5652v0.mo8826w0();
        float fMo8825r0 = c5652v0.mo8825r0();
        C0806a c0806a = this.f4324k;
        c0806a.f2410a = 0.0f;
        c0806a.f2411b = 0.0f;
        c0806a.f2412c = iMo8826w0;
        c0806a.f2413d = fMo8825r0;
        while (true) {
            if (abstractC5614i1 == null) {
                break;
            }
            C5602f0 c5602f02 = abstractC5614i1.f22868u;
            if (abstractC5614i1 == c5602f02.f22778L.f22717d && !c5602f02.f22792i) {
                if (!C4240j.m8528b(m3435b(c5602f02), 9223372034707292159L)) {
                    c0806a.m2037c((((long) Float.floatToRawIntBits((int) (r9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (r9 & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            InterfaceC5638q1 interfaceC5638q1 = abstractC5614i1.f22866R;
            if (interfaceC5638q1 != null) {
                float[] fArrM10624b = ((C5916o1) interfaceC5638q1).m10624b();
                if (!AbstractC0996c0.m2518o(fArrM10624b)) {
                    C1008i0.m2595c(fArrM10624b, c0806a);
                }
            }
            long j3 = abstractC5614i1.f22854F;
            c0806a.m2037c((4294967295L & ((long) Float.floatToRawIntBits((int) (j3 & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32));
            abstractC5614i1 = abstractC5614i1.f22870w;
        }
        int i9 = (int) c0806a.f2410a;
        int i10 = (int) c0806a.f2411b;
        int i11 = (int) c0806a.f2412c;
        int i12 = (int) c0806a.f2413d;
        int i13 = c5602f0.f22791h;
        boolean z11 = c5602f0.f22796m;
        c5602f0.f22796m = true;
        C0058k c0058k = this.f4315b;
        if (z11) {
            int i14 = i13 & 33554431;
            long[] jArr = (long[]) c0058k.f177i;
            int i15 = c0058k.f176h;
            int i16 = 0;
            while (i16 < jArr.length - 2 && i16 < i15) {
                int i17 = i16 + 2;
                long j4 = jArr[i17];
                z9 = z10;
                if ((((int) j4) & 33554431) == i14) {
                    jArr[i16] = (((long) i9) << 32) | (((long) i10) & 4294967295L);
                    jArr[i16 + 1] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
                    jArr[i17] = (((j4 >> 63) & 1) << 60) | j4;
                    break;
                }
                i16 += 3;
                z10 = z9;
            }
            z9 = z10;
            C5602f0 c5602f0M10049u = c5602f0.m10049u();
            c0058k.m374z(i13, i9, i10, i11, i12, (Opcodes.ACC_INTERFACE & 32) != 0 ? -1 : c5602f0M10049u == null ? c5602f0M10049u.f22791h : -1, c5587b1.m9982d(1024), c5587b1.m9982d(16), this.f4316c.f4340a.m2312a(i13), -1);
        } else {
            z9 = z10;
            C5602f0 c5602f0M10049u2 = c5602f0.m10049u();
            c0058k.m374z(i13, i9, i10, i11, i12, (Opcodes.ACC_INTERFACE & 32) != 0 ? -1 : c5602f0M10049u2 == null ? c5602f0M10049u2.f22791h : -1, c5587b1.m9982d(1024), c5587b1.m9982d(16), this.f4316c.f4340a.m2312a(i13), -1);
        }
        c5602f0.f22795l = false;
        this.f4318e = z9;
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i18 = c2046bM10053y.f6893i;
        for (int i19 = 0; i19 < i18; i19++) {
            C5602f0 c5602f03 = (C5602f0) objArr[i19];
            if (c5602f03.m10011H()) {
                m3436d(c5602f03);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3437f(C5602f0 c5602f0) {
        long j3;
        boolean zM10011H = c5602f0.m10011H();
        C5587b1 c5587b1 = c5602f0.f22778L;
        if (zM10011H && c5602f0.f22795l) {
            C5602f0 c5602f0M10049u = c5602f0.m10049u();
            if (c5602f0M10049u == null || c5602f0M10049u.f22792i) {
                j3 = c5602f0M10049u == null ? 0L : 9223372034707292159L;
            } else {
                if (c5602f0M10049u.f22794k) {
                    c5602f0M10049u.f22794k = false;
                    c5602f0M10049u.f22793j = m3432e(c5602f0M10049u);
                }
                j3 = c5602f0M10049u.f22793j;
            }
            AbstractC5614i1 abstractC5614i1 = c5587b1.f22717d;
            if (C4240j.m8528b(j3, 9223372034707292159L) || m3431c(abstractC5614i1)) {
                m3436d(c5602f0);
            } else if (c5602f0.f22792i) {
                m3436d(c5602f0);
                m3433h(c5602f0);
            } else {
                long jM8530d = C4240j.m8530d(j3, abstractC5614i1.f22854F);
                C5652v0 c5652v0 = c5602f0.f22779M.f22891p;
                int iMo8826w0 = c5652v0.mo8826w0();
                int iMo8825r0 = c5652v0.mo8825r0();
                int i9 = c5602f0.f22791h;
                boolean z9 = c5602f0.f22796m;
                C0058k c0058k = this.f4315b;
                long j4 = 4294967295L;
                if (!z9) {
                    c5602f0.f22796m = true;
                    boolean zM9982d = c5587b1.m9982d(1024);
                    boolean zM9982d2 = c5587b1.m9982d(16);
                    boolean zM2312a = this.f4316c.f4340a.m2312a(i9);
                    if (c5602f0M10049u != null) {
                        int i10 = c5602f0M10049u.f22791h;
                        int i11 = (int) (jM8530d >> 32);
                        int i12 = (int) (jM8530d & 4294967295L);
                        int i13 = i9 & 33554431;
                        long[] jArr = (long[]) c0058k.f177i;
                        int i14 = c0058k.f176h - 3;
                        while (true) {
                            if (i14 < 0) {
                                break;
                            }
                            if ((((int) jArr[i14 + 2]) & 33554431) == i10) {
                                long j5 = jArr[i14];
                                int i15 = ((int) (j5 >> 32)) + i11;
                                int i16 = ((int) j5) + i12;
                                c0058k.m374z(i13, i15, i16, i15 + iMo8826w0, i16 + iMo8825r0, i10, zM9982d, zM9982d2, zM2312a, i14);
                                break;
                            }
                            i14 -= 3;
                        }
                    } else {
                        int i17 = (int) (jM8530d >> 32);
                        int i18 = (int) (jM8530d & 4294967295L);
                        c0058k.m374z(i9, i17, i18, i17 + iMo8826w0, i18 + iMo8825r0, (Opcodes.ACC_INTERFACE & 32) != 0 ? -1 : 0, zM9982d, zM9982d2, zM2312a, -1);
                    }
                } else if (c5602f0M10049u != null) {
                    int i19 = c5602f0M10049u.f22791h;
                    int i20 = (int) (jM8530d >> 32);
                    int i21 = (int) (jM8530d & 4294967295L);
                    int i22 = i9 & 33554431;
                    long[] jArr2 = (long[]) c0058k.f177i;
                    int i23 = c0058k.f176h;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= jArr2.length - 2 || i24 >= i23) {
                            break;
                        }
                        long j10 = j4;
                        if ((((int) jArr2[i24 + 2]) & 33554431) == i19) {
                            long j11 = jArr2[i24];
                            int i25 = ((int) (j11 >> 32)) + i20;
                            int i26 = ((int) j11) + i21;
                            int i27 = i25 + iMo8826w0;
                            int i28 = i26 + iMo8825r0;
                            i24 += 3;
                            while (i24 < jArr2.length - 2 && i24 < i23) {
                                int i29 = i24 + 2;
                                int i30 = i19;
                                int i31 = i20;
                                long j12 = jArr2[i29];
                                int i32 = i21;
                                if ((((int) j12) & 33554431) == i22) {
                                    long j13 = jArr2[i24];
                                    long[] jArr3 = jArr2;
                                    int i33 = i25 - ((int) (j13 >> 32));
                                    int i34 = i26 - ((int) j13);
                                    jArr3[i24] = (((long) i26) & j10) | (((long) i25) << 32);
                                    jArr3[i24 + 1] = (((long) i27) << 32) | (((long) i28) & j10);
                                    jArr3[i29] = j12 | (((j12 >> 63) & 1) << 60);
                                    if (i33 != 0 || i34 != 0) {
                                        c0058k.m349O(i33, i34, (j12 & AbstractC1292a.f4312b) | (((long) ((i24 + 3) & 33554431)) << 25));
                                    }
                                } else {
                                    i24 += 3;
                                    i19 = i30;
                                    i20 = i31;
                                    i21 = i32;
                                }
                            }
                        }
                        i24 += 3;
                        jArr2 = jArr2;
                        j4 = j10;
                        i19 = i19;
                        i20 = i20;
                        i21 = i21;
                    }
                } else {
                    int i35 = (int) (jM8530d >> 32);
                    int i36 = (int) (jM8530d & 4294967295L);
                    int i37 = iMo8826w0 + i35;
                    int i38 = i36 + iMo8825r0;
                    int i39 = i9 & 33554431;
                    long[] jArr4 = (long[]) c0058k.f177i;
                    int i40 = c0058k.f176h;
                    int i41 = 0;
                    while (true) {
                        if (i41 >= jArr4.length - 2 || i41 >= i40) {
                            break;
                        }
                        int i42 = i41 + 2;
                        long j14 = jArr4[i42];
                        if ((((int) j14) & 33554431) == i39) {
                            long j15 = jArr4[i41];
                            int i43 = i41;
                            jArr4[i43] = (((long) i35) << 32) | (((long) i36) & 4294967295L);
                            jArr4[i43 + 1] = (((long) i37) << 32) | (((long) i38) & 4294967295L);
                            jArr4[i42] = (((j14 >> 63) & 1) << 60) | j14;
                            int i44 = i35 - ((int) (j15 >> 32));
                            int i45 = i36 - ((int) j15);
                            if ((i44 != 0) | (i45 != 0)) {
                                c0058k.m349O(i44, i45, (AbstractC1292a.f4312b & j14) | (((long) ((i43 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i41 += 3;
                        }
                    }
                }
            }
            c5602f0.f22795l = false;
            this.f4318e = true;
            m3439i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3438g(C5602f0 c5602f0) {
        if (c5602f0.f22796m) {
            int i9 = c5602f0.f22791h & 33554431;
            C0058k c0058k = this.f4315b;
            long[] jArr = (long[]) c0058k.f177i;
            int i10 = c0058k.f176h;
            int i11 = 0;
            while (true) {
                if (i11 >= jArr.length - 2 || i11 >= i10) {
                    break;
                }
                int i12 = i11 + 2;
                if ((((int) jArr[i12]) & 33554431) == i9) {
                    jArr[i11] = -1;
                    jArr[i11 + 1] = -1;
                    jArr[i12] = AbstractC1292a.f4313c;
                    break;
                }
                i11 += 3;
            }
            c5602f0.f22796m = false;
            c5602f0.f22795l = true;
            this.f4318e = true;
            this.f4320g = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /* JADX INFO: renamed from: i */
    public final void m3439i() {
        RunnableC0133c runnableC0133c = this.f4321h;
        boolean z9 = runnableC0133c != null;
        long j3 = this.f4316c.f4342c;
        if (j3 >= 0 || !z9) {
            if (this.f4322i == j3 && z9) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f4314a;
            if (runnableC0133c != null) {
                viewTreeObserverOnGlobalLayoutListenerC5934t.removeCallbacks(runnableC0133c);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j3, ((long) 16) + jCurrentTimeMillis);
            this.f4322i = jMax;
            RunnableC0133c runnableC0133c2 = new RunnableC0133c(this.f4323j, 6);
            viewTreeObserverOnGlobalLayoutListenerC5934t.postDelayed(runnableC0133c2, jMax - jCurrentTimeMillis);
            this.f4321h = runnableC0133c2;
        }
    }
}
