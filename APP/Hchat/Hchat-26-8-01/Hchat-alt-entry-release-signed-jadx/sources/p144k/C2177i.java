package p144k;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p000a.AbstractC0000a;
import p015b0.C0136d0;
import p027c0.C0362g;
import p057e1.C0807b;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p077f8.AbstractC1089i;
import p117i0.C1823e;
import p117i0.C1845j1;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p174m.C2633n2;
import p174m.C2637o2;
import p222p.InterfaceC3268x0;
import p267s1.AbstractC3898h0;
import p267s1.C3903k;
import p267s1.C3906l0;
import p276sf.C3967n;
import p293u2.C4247q;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5615j;
import p339x1.InterfaceC5612i;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: k.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2177i implements InterfaceC2185k1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4233c f7237a;

    /* JADX INFO: renamed from: b */
    public long f7238b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public final C2172g0 f7239c;

    /* JADX INFO: renamed from: d */
    public final C1845j1 f7240d;

    /* JADX INFO: renamed from: e */
    public final boolean f7241e;

    /* JADX INFO: renamed from: f */
    public boolean f7242f;

    /* JADX INFO: renamed from: g */
    public long f7243g;

    /* JADX INFO: renamed from: h */
    public long f7244h;

    /* JADX INFO: renamed from: i */
    public final AbstractC5615j f7245i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2177i(Context context, InterfaceC4233c interfaceC4233c, long j3, InterfaceC3268x0 interfaceC3268x0) {
        this.f7237a = interfaceC4233c;
        C2172g0 c2172g0 = new C2172g0(context, AbstractC0996c0.m2526w(j3));
        this.f7239c = c2172g0;
        this.f7240d = new C1845j1(C3967n.f12976a, C1823e.f6049j);
        this.f7241e = true;
        this.f7243g = 0L;
        this.f7244h = -1L;
        C0362g c0362g = new C0362g(this, 5);
        C3903k c3903k = AbstractC3898h0.f12782a;
        C3906l0 c3906l0 = new C3906l0(null, null, null, c0362g);
        this.f7245i = Build.VERSION.SDK_INT >= 31 ? new C2193n0(c3906l0, this, c2172g0) : new C2193n0(c3906l0, this, c2172g0, interfaceC3268x0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // p144k.InterfaceC2185k1
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1615a(long j3, C2633n2 c2633n2, AbstractC6038c abstractC6038c) {
        C2174h c2174h;
        long jM8546d;
        if (abstractC6038c instanceof C2174h) {
            c2174h = (C2174h) abstractC6038c;
            int i9 = c2174h.f7234j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2174h.f7234j = i9 - Integer.MIN_VALUE;
            } else {
                c2174h = new C2174h(this, abstractC6038c);
            }
        }
        Object objInvokeSuspend = c2174h.f7232h;
        int i10 = c2174h.f7234j;
        C3967n c3967n = C3967n.f12976a;
        C2172g0 c2172g0 = this.f7239c;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objInvokeSuspend);
            boolean zM2056c = C0810e.m2056c(this.f7243g);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (zM2056c) {
                c2174h.f7234j = 1;
                c2633n2.getClass();
                C2633n2 c2633n22 = new C2633n2(c2633n2.f8570k, c2174h);
                c2633n22.f8569j = j3;
                if (c2633n22.invokeSuspend(c3967n) != enumC5799a) {
                    return c3967n;
                }
            } else {
                boolean zM5400g = C2172g0.m5400g(c2172g0.f7214f);
                InterfaceC4233c interfaceC4233c = this.f7237a;
                long jM59d = AbstractC0000a.m59d((!zM5400g || C4247q.m8544b(j3) >= 0.0f) ? (!C2172g0.m5400g(c2172g0.f7215g) || C4247q.m8544b(j3) <= 0.0f) ? 0.0f : -AbstractC2192n.m5428e(c2172g0.m5404d(), -C4247q.m8544b(j3), Float.intBitsToFloat((int) (this.f7243g >> 32)), interfaceC4233c) : AbstractC2192n.m5428e(c2172g0.m5403c(), C4247q.m8544b(j3), Float.intBitsToFloat((int) (this.f7243g >> 32)), interfaceC4233c), (!C2172g0.m5400g(c2172g0.f7212d) || C4247q.m8545c(j3) >= 0.0f) ? (!C2172g0.m5400g(c2172g0.f7213e) || C4247q.m8545c(j3) <= 0.0f) ? 0.0f : -AbstractC2192n.m5428e(c2172g0.m5402b(), -C4247q.m8545c(j3), Float.intBitsToFloat((int) (this.f7243g & 4294967295L)), interfaceC4233c) : AbstractC2192n.m5428e(c2172g0.m5405e(), C4247q.m8545c(j3), Float.intBitsToFloat((int) (this.f7243g & 4294967295L)), interfaceC4233c));
                if (jM59d != 0) {
                    m5410g();
                }
                jM8546d = C4247q.m8546d(j3, jM59d);
                c2174h.f7231g = jM8546d;
                c2174h.f7234j = 2;
                c2633n2.getClass();
                C2633n2 c2633n23 = new C2633n2(c2633n2.f8570k, c2174h);
                c2633n23.f8569j = jM8546d;
                objInvokeSuspend = c2633n23.invokeSuspend(c3967n);
            }
            return enumC5799a;
        }
        if (i10 == 1) {
            AbstractC1089i.m2732I0(objInvokeSuspend);
            return c3967n;
        }
        if (i10 != 2) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jM8546d = c2174h.f7231g;
        AbstractC1089i.m2732I0(objInvokeSuspend);
        long jM8546d2 = C4247q.m8546d(jM8546d, ((C4247q) objInvokeSuspend).f13927a);
        this.f7242f = false;
        if (C4247q.m8544b(jM8546d2) > 0.0f) {
            EdgeEffect edgeEffectM5403c = c2172g0.m5403c();
            int iM5018X = AbstractC2043a.m5018X(C4247q.m8544b(jM8546d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM5403c.isFinished()) {
                edgeEffectM5403c.onAbsorb(iM5018X);
            }
        } else if (C4247q.m8544b(jM8546d2) < 0.0f) {
            EdgeEffect edgeEffectM5404d = c2172g0.m5404d();
            int i11 = -AbstractC2043a.m5018X(C4247q.m8544b(jM8546d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM5404d.isFinished()) {
                edgeEffectM5404d.onAbsorb(i11);
            }
        }
        if (C4247q.m8545c(jM8546d2) > 0.0f) {
            EdgeEffect edgeEffectM5405e = c2172g0.m5405e();
            int iM5018X2 = AbstractC2043a.m5018X(C4247q.m8545c(jM8546d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM5405e.isFinished()) {
                edgeEffectM5405e.onAbsorb(iM5018X2);
            }
        } else if (C4247q.m8545c(jM8546d2) < 0.0f) {
            EdgeEffect edgeEffectM5402b = c2172g0.m5402b();
            int i12 = -AbstractC2043a.m5018X(C4247q.m8545c(jM8546d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM5402b.isFinished()) {
                edgeEffectM5402b.onAbsorb(i12);
            }
        }
        m5408e();
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131 A[PHI: r7
  0x0131: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x015f, B:62:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    @Override // p144k.InterfaceC2185k1
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1616b(long j3, int i9, C0136d0 c0136d0) {
        long j4;
        float fIntBitsToFloat;
        int i10;
        float fM5413j;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM2041d;
        boolean z9;
        boolean zM5399f;
        long j5;
        float f3;
        float f10;
        boolean z10;
        int i11;
        boolean z11;
        if (C0810e.m2056c(this.f7243g)) {
            C2637o2 c2637o2 = (C2637o2) c0136d0.f355h;
            return new C0807b(c2637o2.m6090c(c2637o2.f8598k, j3, c2637o2.f8597j)).f2414a;
        }
        boolean z12 = this.f7242f;
        boolean z13 = true;
        C2172g0 c2172g0 = this.f7239c;
        if (!z12) {
            if (C2172g0.m5400g(c2172g0.f7214f)) {
                m5412i(0L);
            }
            if (C2172g0.m5400g(c2172g0.f7215g)) {
                m5413j(0L);
            }
            if (C2172g0.m5400g(c2172g0.f7212d)) {
                m5414k(0L);
            }
            if (C2172g0.m5400g(c2172g0.f7213e)) {
                m5411h(0L);
            }
            this.f7242f = true;
        }
        int i12 = AbstractC2183k.f7261a;
        float f11 = i9 == 2 ? 4.0f : 1.0f;
        long jM2043f = C0807b.m2043f(j3, f11);
        int i13 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i13) != 0.0f) {
            if (!C2172g0.m5400g(c2172g0.f7212d) || Float.intBitsToFloat(i13) >= 0.0f) {
                j4 = 4294967295L;
                if (C2172g0.m5400g(c2172g0.f7213e) && Float.intBitsToFloat(i13) > 0.0f) {
                    float fM5411h = m5411h(jM2043f);
                    if (!C2172g0.m5400g(c2172g0.f7213e)) {
                        c2172g0.m5402b().finish();
                    }
                    fIntBitsToFloat = fM5411h == Float.intBitsToFloat((int) (jM2043f & 4294967295L)) ? Float.intBitsToFloat(i13) : fM5411h / f11;
                }
            } else {
                float fM5414k = m5414k(jM2043f);
                j4 = 4294967295L;
                if (!C2172g0.m5400g(c2172g0.f7212d)) {
                    c2172g0.m5405e().finish();
                }
                fIntBitsToFloat = fM5414k == Float.intBitsToFloat((int) (jM2043f & 4294967295L)) ? Float.intBitsToFloat(i13) : fM5414k / f11;
            }
            i10 = (int) (j3 >> 32);
            if (Float.intBitsToFloat(i10) != 0.0f) {
                if (C2172g0.m5400g(c2172g0.f7214f) && Float.intBitsToFloat(i10) < 0.0f) {
                    fM5413j = m5412i(jM2043f);
                    if (!C2172g0.m5400g(c2172g0.f7214f)) {
                        c2172g0.m5403c().finish();
                    }
                    if (fM5413j == Float.intBitsToFloat((int) (jM2043f >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i10);
                    }
                } else if (!C2172g0.m5400g(c2172g0.f7215g) || Float.intBitsToFloat(i10) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fM5413j = m5413j(jM2043f);
                    if (!C2172g0.m5400g(c2172g0.f7215g)) {
                        c2172g0.m5404d().finish();
                    }
                    fIntBitsToFloat2 = fM5413j == Float.intBitsToFloat((int) (jM2043f >> 32)) ? Float.intBitsToFloat(i10) : fM5413j / f11;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j4);
            if (!C0807b.m2039b(jFloatToRawIntBits, 0L)) {
                m5410g();
            }
            jM2041d = C0807b.m2041d(j3, jFloatToRawIntBits);
            C2637o2 c2637o22 = (C2637o2) c0136d0.f355h;
            long j10 = new C0807b(c2637o22.m6090c(c2637o22.f8598k, jM2041d, c2637o22.f8597j)).f2414a;
            long jM2041d2 = C0807b.m2041d(jM2041d, j10);
            if ((Float.intBitsToFloat((int) (jM2041d >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM2041d & j4)) != 0.0f) && ((Float.intBitsToFloat((int) (j10 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j10 & j4)) != 0.0f) && (C2172g0.m5400g(c2172g0.f7214f) || C2172g0.m5400g(c2172g0.f7212d) || C2172g0.m5400g(c2172g0.f7215g) || C2172g0.m5400g(c2172g0.f7213e)))) {
                m5408e();
            }
            if (i9 != 1) {
                int i14 = (int) (jM2041d2 >> 32);
                if (Float.intBitsToFloat(i14) > 0.5f) {
                    j5 = jM2041d2;
                    m5412i(j5);
                } else {
                    j5 = jM2041d2;
                    if (Float.intBitsToFloat(i14) < -0.5f) {
                        m5413j(j5);
                    } else {
                        f3 = 0.5f;
                        f10 = -0.5f;
                        z10 = false;
                        i11 = (int) (j5 & j4);
                        if (Float.intBitsToFloat(i11) <= f3) {
                            m5414k(j5);
                        } else if (Float.intBitsToFloat(i11) < f10) {
                            m5411h(j5);
                        } else {
                            z11 = false;
                            z9 = !z10 || z11;
                        }
                        z11 = true;
                        if (z10) {
                        }
                    }
                }
                z10 = true;
                f3 = 0.5f;
                f10 = -0.5f;
                i11 = (int) (j5 & j4);
                if (Float.intBitsToFloat(i11) <= f3) {
                }
                z11 = true;
                if (z10) {
                }
            }
            if (!C0807b.m2039b(jM2041d, 0L)) {
                if (!C2172g0.m5399f(c2172g0.f7214f) || Float.intBitsToFloat(i10) >= 0.0f) {
                    zM5399f = false;
                } else {
                    EdgeEffect edgeEffectM5403c = c2172g0.m5403c();
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                    if (edgeEffectM5403c instanceof C2190m0) {
                        C2190m0 c2190m0 = (C2190m0) edgeEffectM5403c;
                        float f12 = c2190m0.f7269b + fIntBitsToFloat3;
                        c2190m0.f7269b = f12;
                        if (Math.abs(f12) > c2190m0.f7268a) {
                            c2190m0.onRelease();
                        }
                    } else {
                        edgeEffectM5403c.onRelease();
                    }
                    zM5399f = C2172g0.m5399f(c2172g0.f7214f);
                }
                if (C2172g0.m5399f(c2172g0.f7215g) && Float.intBitsToFloat(i10) > 0.0f) {
                    EdgeEffect edgeEffectM5404d = c2172g0.m5404d();
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
                    if (edgeEffectM5404d instanceof C2190m0) {
                        C2190m0 c2190m02 = (C2190m0) edgeEffectM5404d;
                        float f13 = c2190m02.f7269b + fIntBitsToFloat4;
                        c2190m02.f7269b = f13;
                        if (Math.abs(f13) > c2190m02.f7268a) {
                            c2190m02.onRelease();
                        }
                    } else {
                        edgeEffectM5404d.onRelease();
                    }
                    zM5399f = zM5399f || C2172g0.m5399f(c2172g0.f7215g);
                }
                if (C2172g0.m5399f(c2172g0.f7212d) && Float.intBitsToFloat(i13) < 0.0f) {
                    EdgeEffect edgeEffectM5405e = c2172g0.m5405e();
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i13);
                    if (edgeEffectM5405e instanceof C2190m0) {
                        C2190m0 c2190m03 = (C2190m0) edgeEffectM5405e;
                        float f14 = c2190m03.f7269b + fIntBitsToFloat5;
                        c2190m03.f7269b = f14;
                        if (Math.abs(f14) > c2190m03.f7268a) {
                            c2190m03.onRelease();
                        }
                    } else {
                        edgeEffectM5405e.onRelease();
                    }
                    zM5399f = zM5399f || C2172g0.m5399f(c2172g0.f7212d);
                }
                if (C2172g0.m5399f(c2172g0.f7213e) && Float.intBitsToFloat(i13) > 0.0f) {
                    EdgeEffect edgeEffectM5402b = c2172g0.m5402b();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i13);
                    if (edgeEffectM5402b instanceof C2190m0) {
                        C2190m0 c2190m04 = (C2190m0) edgeEffectM5402b;
                        float f15 = c2190m04.f7269b + fIntBitsToFloat6;
                        c2190m04.f7269b = f15;
                        if (Math.abs(f15) > c2190m04.f7268a) {
                            c2190m04.onRelease();
                        }
                    } else {
                        edgeEffectM5402b.onRelease();
                    }
                    zM5399f = zM5399f || C2172g0.m5399f(c2172g0.f7213e);
                }
                if (!zM5399f && !z9) {
                    z13 = false;
                }
                z9 = z13;
            }
            if (z9) {
                m5410g();
            }
            return C0807b.m2042e(jFloatToRawIntBits, j10);
        }
        j4 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i10 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i10) != 0.0f) {
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j4);
        if (!C0807b.m2039b(jFloatToRawIntBits, 0L)) {
        }
        jM2041d = C0807b.m2041d(j3, jFloatToRawIntBits);
        C2637o2 c2637o222 = (C2637o2) c0136d0.f355h;
        long j102 = new C0807b(c2637o222.m6090c(c2637o222.f8598k, jM2041d, c2637o222.f8597j)).f2414a;
        long jM2041d22 = C0807b.m2041d(jM2041d, j102);
        if (Float.intBitsToFloat((int) (jM2041d >> 32)) == 0.0f) {
            m5408e();
        } else {
            m5408e();
        }
        if (i9 != 1) {
        }
        if (!C0807b.m2039b(jM2041d, 0L)) {
        }
        if (z9) {
        }
        return C0807b.m2042e(jFloatToRawIntBits, j102);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2185k1
    /* JADX INFO: renamed from: c */
    public final InterfaceC5612i mo1617c() {
        return this.f7245i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2185k1
    /* JADX INFO: renamed from: d */
    public final boolean mo1618d() {
        C2172g0 c2172g0 = this.f7239c;
        EdgeEffect edgeEffect = c2172g0.f7212d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC2186l.m5421b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c2172g0.f7213e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC2186l.m5421b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c2172g0.f7214f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC2186l.m5421b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c2172g0.f7215g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC2186l.m5421b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5408e() {
        boolean z9;
        C2172g0 c2172g0 = this.f7239c;
        EdgeEffect edgeEffect = c2172g0.f7212d;
        boolean z10 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z9 = !edgeEffect.isFinished();
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect2 = c2172g0.f7213e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z9 = !edgeEffect2.isFinished() || z9;
        }
        EdgeEffect edgeEffect3 = c2172g0.f7214f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z9 = !edgeEffect3.isFinished() || z9;
        }
        EdgeEffect edgeEffect4 = c2172g0.f7215g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z9) {
                z10 = false;
            }
            z9 = z10;
        }
        if (z9) {
            m5410g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final long m5409f() {
        long jM2718B = this.f7238b;
        if ((9223372034707292159L & jM2718B) == 9205357640488583168L) {
            jM2718B = AbstractC1089i.m2718B(this.f7243g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2718B >> 32)) / Float.intBitsToFloat((int) (this.f7243g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM2718B & 4294967295L)) / Float.intBitsToFloat((int) (this.f7243g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5410g() {
        if (this.f7241e) {
            this.f7240d.setValue(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final float m5411h(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5409f() >> 32));
        int i9 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i9) / Float.intBitsToFloat((int) (this.f7243g & 4294967295L));
        EdgeEffect edgeEffectM5402b = this.f7239c.m5402b();
        float fM5422c = -fIntBitsToFloat2;
        float f3 = 1 - fIntBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fM5422c = AbstractC2186l.m5422c(edgeEffectM5402b, fM5422c, f3);
        } else {
            edgeEffectM5402b.onPull(fM5422c, f3);
        }
        return (i10 >= 31 ? AbstractC2186l.m5421b(edgeEffectM5402b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f7243g)) * (-fM5422c) : Float.intBitsToFloat(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final float m5412i(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5409f() & 4294967295L));
        int i9 = (int) (j3 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i9) / Float.intBitsToFloat((int) (this.f7243g >> 32));
        EdgeEffect edgeEffectM5403c = this.f7239c.m5403c();
        float f3 = 1 - fIntBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fIntBitsToFloat2 = AbstractC2186l.m5422c(edgeEffectM5403c, fIntBitsToFloat2, f3);
        } else {
            edgeEffectM5403c.onPull(fIntBitsToFloat2, f3);
        }
        return (i10 >= 31 ? AbstractC2186l.m5421b(edgeEffectM5403c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f7243g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final float m5413j(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5409f() & 4294967295L));
        int i9 = (int) (j3 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i9) / Float.intBitsToFloat((int) (this.f7243g >> 32));
        EdgeEffect edgeEffectM5404d = this.f7239c.m5404d();
        float fM5422c = -fIntBitsToFloat2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fM5422c = AbstractC2186l.m5422c(edgeEffectM5404d, fM5422c, fIntBitsToFloat);
        } else {
            edgeEffectM5404d.onPull(fM5422c, fIntBitsToFloat);
        }
        return (i10 >= 31 ? AbstractC2186l.m5421b(edgeEffectM5404d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f7243g >> 32)) * (-fM5422c) : Float.intBitsToFloat(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final float m5414k(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5409f() >> 32));
        int i9 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i9) / Float.intBitsToFloat((int) (this.f7243g & 4294967295L));
        EdgeEffect edgeEffectM5405e = this.f7239c.m5405e();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fIntBitsToFloat2 = AbstractC2186l.m5422c(edgeEffectM5405e, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM5405e.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i10 >= 31 ? AbstractC2186l.m5421b(edgeEffectM5405e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f7243g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m5415l(long j3) {
        boolean zM2054a = C0810e.m2054a(this.f7243g, 0L);
        boolean zM2054a2 = C0810e.m2054a(j3, this.f7243g);
        this.f7243g = j3;
        if (!zM2054a2) {
            int iM5018X = AbstractC2043a.m5018X(Float.intBitsToFloat((int) (j3 >> 32)));
            long jM5018X = (((long) AbstractC2043a.m5018X(Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (((long) iM5018X) << 32);
            C2172g0 c2172g0 = this.f7239c;
            c2172g0.f7211c = jM5018X;
            EdgeEffect edgeEffect = c2172g0.f7212d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM5018X >> 32), (int) (jM5018X & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c2172g0.f7213e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM5018X >> 32), (int) (jM5018X & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c2172g0.f7214f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM5018X & 4294967295L), (int) (jM5018X >> 32));
            }
            EdgeEffect edgeEffect4 = c2172g0.f7215g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM5018X & 4294967295L), (int) (jM5018X >> 32));
            }
            EdgeEffect edgeEffect5 = c2172g0.f7216h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM5018X >> 32), (int) (jM5018X & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c2172g0.f7217i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM5018X >> 32), (int) (jM5018X & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c2172g0.f7218j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM5018X & 4294967295L), (int) (jM5018X >> 32));
            }
            EdgeEffect edgeEffect8 = c2172g0.f7219k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM5018X), (int) (jM5018X >> 32));
            }
        }
        if (zM2054a || zM2054a2) {
            return;
        }
        m5408e();
    }
}
