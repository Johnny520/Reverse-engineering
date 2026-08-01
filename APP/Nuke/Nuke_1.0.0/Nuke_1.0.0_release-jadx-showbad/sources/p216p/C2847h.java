package p216p;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.bumptech.glide.AbstractC1924f;
import p000A.C0032Q;
import p007B0.AbstractC0181N;
import p007B0.C0186T;
import p007B0.C0200n;
import p041H0.AbstractC0599j;
import p056K2.C0891q;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p095T.C1357e;
import p095T.C1366i0;
import p127Z2.AbstractC1784a;
import p153e1.C2021q;
import p153e1.InterfaceC2007c;
import p179i4.AbstractC2352g;
import p204n0.C2686e;
import p211o0.AbstractC2767z;
import p227r.C3027z0;
import p244u.C3251U;

/* JADX INFO: renamed from: p.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2847h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2007c f8942a;

    /* JADX INFO: renamed from: b */
    public long f8943b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public final C2809B f8944c;

    /* JADX INFO: renamed from: d */
    public final C1366i0 f8945d;

    /* JADX INFO: renamed from: e */
    public final boolean f8946e;

    /* JADX INFO: renamed from: f */
    public boolean f8947f;

    /* JADX INFO: renamed from: g */
    public long f8948g;

    /* JADX INFO: renamed from: h */
    public long f8949h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0599j f8950i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2847h(Context context, InterfaceC2007c interfaceC2007c, long j5, C3251U c3251u) {
        this.f8942a = interfaceC2007c;
        C2809B c2809b = new C2809B(context, AbstractC2767z.m4952w(j5));
        this.f8944c = c2809b;
        this.f8945d = new C1366i0(C0891q.f2780a, C1357e.f4795g);
        this.f8946e = true;
        this.f8948g = 0L;
        this.f8949h = -1L;
        C0032Q c0032q = new C0032Q(6, this);
        C0200n c0200n = AbstractC0181N.f628a;
        C0186T c0186t = new C0186T(null, null, null, c0032q);
        this.f8950i = Build.VERSION.SDK_INT >= 31 ? new C2814G(c0186t, this, c2809b) : new C2814G(c0186t, this, c2809b, c3251u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5032a() {
        boolean z5;
        C2809B c2809b = this.f8944c;
        EdgeEffect edgeEffect = c2809b.f8844d;
        boolean z6 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = !edgeEffect.isFinished();
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = c2809b.f8845e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 = !edgeEffect2.isFinished() || z5;
        }
        EdgeEffect edgeEffect3 = c2809b.f8846f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 = !edgeEffect3.isFinished() || z5;
        }
        EdgeEffect edgeEffect4 = c2809b.f8847g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z5) {
                z6 = false;
            }
            z5 = z6;
        }
        if (z5) {
            m5035d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5033b(long j5, C3027z0 c3027z0, AbstractC1178c abstractC1178c) {
        C2845g c2845g;
        long jM3716d;
        if (abstractC1178c instanceof C2845g) {
            c2845g = (C2845g) abstractC1178c;
            int i5 = c2845g.f8939j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2845g.f8939j = i5 - Integer.MIN_VALUE;
            } else {
                c2845g = new C2845g(this, abstractC1178c);
            }
        }
        Object objMo8p = c2845g.f8937h;
        int i6 = c2845g.f8939j;
        C0891q c0891q = C0891q.f2780a;
        C2809B c2809b = this.f8944c;
        if (i6 == 0) {
            AbstractC1784a.m3205S(objMo8p);
            boolean zM4663c = C2686e.m4663c(this.f8948g);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (zM4663c) {
                c2845g.f8939j = 1;
                c3027z0.getClass();
                C3027z0 c3027z02 = new C3027z0(c3027z0.f9603k, c2845g);
                c3027z02.f9602j = j5;
                if (c3027z02.mo8p(c0891q) != enumC1152a) {
                    return c0891q;
                }
            } else {
                boolean zM5008g = C2809B.m5008g(c2809b.f8846f);
                InterfaceC2007c interfaceC2007c = this.f8942a;
                long jM4190c = AbstractC2352g.m4190c((!zM5008g || C2021q.m3714b(j5) >= 0.0f) ? (!C2809B.m5008g(c2809b.f8847g) || C2021q.m3714b(j5) <= 0.0f) ? 0.0f : -AbstractC2856m.m5048b(c2809b.m5012d(), -C2021q.m3714b(j5), Float.intBitsToFloat((int) (this.f8948g >> 32)), interfaceC2007c) : AbstractC2856m.m5048b(c2809b.m5011c(), C2021q.m3714b(j5), Float.intBitsToFloat((int) (this.f8948g >> 32)), interfaceC2007c), (!C2809B.m5008g(c2809b.f8844d) || C2021q.m3715c(j5) >= 0.0f) ? (!C2809B.m5008g(c2809b.f8845e) || C2021q.m3715c(j5) <= 0.0f) ? 0.0f : -AbstractC2856m.m5048b(c2809b.m5010b(), -C2021q.m3715c(j5), Float.intBitsToFloat((int) (this.f8948g & 4294967295L)), interfaceC2007c) : AbstractC2856m.m5048b(c2809b.m5013e(), C2021q.m3715c(j5), Float.intBitsToFloat((int) (this.f8948g & 4294967295L)), interfaceC2007c));
                if (jM4190c != 0) {
                    m5035d();
                }
                jM3716d = C2021q.m3716d(j5, jM4190c);
                c2845g.f8936g = jM3716d;
                c2845g.f8939j = 2;
                c3027z0.getClass();
                C3027z0 c3027z03 = new C3027z0(c3027z0.f9603k, c2845g);
                c3027z03.f9602j = jM3716d;
                objMo8p = c3027z03.mo8p(c0891q);
            }
            return enumC1152a;
        }
        if (i6 == 1) {
            AbstractC1784a.m3205S(objMo8p);
            return c0891q;
        }
        if (i6 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jM3716d = c2845g.f8936g;
        AbstractC1784a.m3205S(objMo8p);
        long jM3716d2 = C2021q.m3716d(jM3716d, ((C2021q) objMo8p).f6750a);
        this.f8947f = false;
        if (C2021q.m3714b(jM3716d2) > 0.0f) {
            EdgeEffect edgeEffectM5011c = c2809b.m5011c();
            int iM3200N = AbstractC1784a.m3200N(C2021q.m3714b(jM3716d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM5011c.isFinished()) {
                edgeEffectM5011c.onAbsorb(iM3200N);
            }
        } else if (C2021q.m3714b(jM3716d2) < 0.0f) {
            EdgeEffect edgeEffectM5012d = c2809b.m5012d();
            int i7 = -AbstractC1784a.m3200N(C2021q.m3714b(jM3716d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM5012d.isFinished()) {
                edgeEffectM5012d.onAbsorb(i7);
            }
        }
        if (C2021q.m3715c(jM3716d2) > 0.0f) {
            EdgeEffect edgeEffectM5013e = c2809b.m5013e();
            int iM3200N2 = AbstractC1784a.m3200N(C2021q.m3715c(jM3716d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM5013e.isFinished()) {
                edgeEffectM5013e.onAbsorb(iM3200N2);
            }
        } else if (C2021q.m3715c(jM3716d2) < 0.0f) {
            EdgeEffect edgeEffectM5010b = c2809b.m5010b();
            int i8 = -AbstractC1784a.m3200N(C2021q.m3715c(jM3716d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM5010b.isFinished()) {
                edgeEffectM5010b.onAbsorb(i8);
            }
        }
        m5032a();
        return c0891q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m5034c() {
        long jM3500l = this.f8943b;
        if ((9223372034707292159L & jM3500l) == 9205357640488583168L) {
            jM3500l = AbstractC1924f.m3500l(this.f8948g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3500l >> 32)) / Float.intBitsToFloat((int) (this.f8948g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM3500l & 4294967295L)) / Float.intBitsToFloat((int) (this.f8948g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5035d() {
        if (this.f8946e) {
            this.f8945d.setValue(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final float m5036e(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5034c() >> 32));
        int i5 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i5) / Float.intBitsToFloat((int) (this.f8948g & 4294967295L));
        EdgeEffect edgeEffectM5010b = this.f8944c.m5010b();
        float fM5046c = -fIntBitsToFloat2;
        float f2 = 1 - fIntBitsToFloat;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            fM5046c = AbstractC2853k.m5046c(edgeEffectM5010b, fM5046c, f2);
        } else {
            edgeEffectM5010b.onPull(fM5046c, f2);
        }
        return (i6 >= 31 ? AbstractC2853k.m5045b(edgeEffectM5010b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f8948g)) * (-fM5046c) : Float.intBitsToFloat(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final float m5037f(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5034c() & 4294967295L));
        int i5 = (int) (j5 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i5) / Float.intBitsToFloat((int) (this.f8948g >> 32));
        EdgeEffect edgeEffectM5011c = this.f8944c.m5011c();
        float f2 = 1 - fIntBitsToFloat;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            fIntBitsToFloat2 = AbstractC2853k.m5046c(edgeEffectM5011c, fIntBitsToFloat2, f2);
        } else {
            edgeEffectM5011c.onPull(fIntBitsToFloat2, f2);
        }
        return (i6 >= 31 ? AbstractC2853k.m5045b(edgeEffectM5011c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f8948g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final float m5038g(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5034c() & 4294967295L));
        int i5 = (int) (j5 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i5) / Float.intBitsToFloat((int) (this.f8948g >> 32));
        EdgeEffect edgeEffectM5012d = this.f8944c.m5012d();
        float fM5046c = -fIntBitsToFloat2;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            fM5046c = AbstractC2853k.m5046c(edgeEffectM5012d, fM5046c, fIntBitsToFloat);
        } else {
            edgeEffectM5012d.onPull(fM5046c, fIntBitsToFloat);
        }
        return (i6 >= 31 ? AbstractC2853k.m5045b(edgeEffectM5012d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f8948g >> 32)) * (-fM5046c) : Float.intBitsToFloat(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final float m5039h(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5034c() >> 32));
        int i5 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i5) / Float.intBitsToFloat((int) (this.f8948g & 4294967295L));
        EdgeEffect edgeEffectM5013e = this.f8944c.m5013e();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            fIntBitsToFloat2 = AbstractC2853k.m5046c(edgeEffectM5013e, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM5013e.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i6 >= 31 ? AbstractC2853k.m5045b(edgeEffectM5013e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f8948g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m5040i(long j5) {
        boolean zM4661a = C2686e.m4661a(this.f8948g, 0L);
        boolean zM4661a2 = C2686e.m4661a(j5, this.f8948g);
        this.f8948g = j5;
        if (!zM4661a2) {
            int iM3200N = AbstractC1784a.m3200N(Float.intBitsToFloat((int) (j5 >> 32)));
            long jM3200N = (((long) AbstractC1784a.m3200N(Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (((long) iM3200N) << 32);
            C2809B c2809b = this.f8944c;
            c2809b.f8843c = jM3200N;
            EdgeEffect edgeEffect = c2809b.f8844d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM3200N >> 32), (int) (jM3200N & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c2809b.f8845e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM3200N >> 32), (int) (jM3200N & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c2809b.f8846f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM3200N & 4294967295L), (int) (jM3200N >> 32));
            }
            EdgeEffect edgeEffect4 = c2809b.f8847g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM3200N & 4294967295L), (int) (jM3200N >> 32));
            }
            EdgeEffect edgeEffect5 = c2809b.f8848h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM3200N >> 32), (int) (jM3200N & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c2809b.f8849i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM3200N >> 32), (int) (jM3200N & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c2809b.f8850j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM3200N & 4294967295L), (int) (jM3200N >> 32));
            }
            EdgeEffect edgeEffect8 = c2809b.f8851k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM3200N), (int) (jM3200N >> 32));
            }
        }
        if (zM4661a || zM4661a2) {
            return;
        }
        m5032a();
    }
}
