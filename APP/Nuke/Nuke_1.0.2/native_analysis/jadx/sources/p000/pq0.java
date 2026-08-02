package p000;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pq0 {

    /* JADX INFO: renamed from: a */
    public final rq0 f8454a;

    /* JADX INFO: renamed from: f */
    public Outline f8459f;

    /* JADX INFO: renamed from: j */
    public float f8463j;

    /* JADX INFO: renamed from: k */
    public AbstractC0731te f8464k;

    /* JADX INFO: renamed from: l */
    public C0915y9 f8465l;

    /* JADX INFO: renamed from: m */
    public C0915y9 f8466m;

    /* JADX INFO: renamed from: n */
    public boolean f8467n;

    /* JADX INFO: renamed from: o */
    public C0702sp f8468o;

    /* JADX INFO: renamed from: p */
    public C0611q9 f8469p;

    /* JADX INFO: renamed from: q */
    public int f8470q;

    /* JADX INFO: renamed from: s */
    public boolean f8472s;

    /* JADX INFO: renamed from: t */
    public long f8473t;

    /* JADX INFO: renamed from: u */
    public long f8474u;

    /* JADX INFO: renamed from: v */
    public long f8475v;

    /* JADX INFO: renamed from: w */
    public boolean f8476w;

    /* JADX INFO: renamed from: x */
    public RectF f8477x;

    /* JADX INFO: renamed from: b */
    public e70 f8455b = pp0.f8434c;

    /* JADX INFO: renamed from: c */
    public d61 f8456c = d61.f1885h;

    /* JADX INFO: renamed from: d */
    public in0 f8457d = oq0.f7772j;

    /* JADX INFO: renamed from: e */
    public final C0798v5 f8458e = new C0798v5(12, this);

    /* JADX INFO: renamed from: g */
    public boolean f8460g = true;

    /* JADX INFO: renamed from: h */
    public long f8461h = 0;

    /* JADX INFO: renamed from: i */
    public long f8462i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final C0554os f8471r = new C0554os();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public pq0(rq0 rq0Var) {
        this.f8454a = rq0Var;
        rq0Var.mo4601t(false);
        this.f8473t = 0L;
        this.f8474u = 0L;
        this.f8475v = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: a */
    public final void m3943a() {
        Outline outline;
        if (this.f8460g) {
            boolean z = this.f8476w;
            Outline outline2 = null;
            rq0 rq0Var = this.f8454a;
            if (z || rq0Var.mo4574F() > 0.0f) {
                C0915y9 c0915y9 = this.f8465l;
                if (c0915y9 != null) {
                    RectF rectF = this.f8477x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f8477x = rectF;
                    }
                    boolean z2 = c0915y9 instanceof C0915y9;
                    if (!z2) {
                        c80.m676t("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = c0915y9.f13365a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f8459f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f8459f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                c80.m676t("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                c80.m676t("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.f8467n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f8459f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f8467n = true;
                        outline = null;
                    }
                    this.f8465l = c0915y9;
                    if (outline != null) {
                        outline.setAlpha(rq0Var.mo4582a());
                        outline2 = outline;
                    }
                    rq0Var.mo4592k(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f8467n && this.f8476w) {
                        rq0Var.mo4601t(false);
                        rq0Var.mo4597p();
                    } else {
                        rq0Var.mo4601t(this.f8476w);
                    }
                } else {
                    rq0Var.mo4601t(this.f8476w);
                    Outline outline4 = this.f8459f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f8459f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM4715q0 = s11.m4715q0(this.f8474u);
                    long j = this.f8461h;
                    long j2 = this.f8462i;
                    if (j2 != 9205357640488583168L) {
                        jM4715q0 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jM4715q0 >> 32);
                    int i5 = (int) (jM4715q0 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.f8463j);
                    outline5.setAlpha(rq0Var.mo4582a());
                    rq0Var.mo4592k(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                rq0Var.mo4601t(false);
                rq0Var.mo4592k(null, 0L);
            }
        }
        this.f8460g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3944b() {
        if (this.f8472s && this.f8470q == 0) {
            C0554os c0554os = this.f8471r;
            pq0 pq0Var = (pq0) c0554os.f7821b;
            if (pq0Var != null) {
                pq0Var.f8470q--;
                pq0Var.m3944b();
                c0554os.f7821b = null;
            }
            sk1 sk1Var = (sk1) c0554os.f7823d;
            if (sk1Var != null) {
                Object[] objArr = sk1Var.f10175b;
                long[] jArr = sk1Var.f10174a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.f8470q--;
                                    ((pq0) objArr[(i << 3) + i3]).m3944b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                sk1Var.m4883b();
            }
            this.f8454a.mo4597p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3945c(nc0 nc0Var) {
        C0554os c0554os = this.f8471r;
        c0554os.f7822c = (pq0) c0554os.f7821b;
        sk1 sk1Var = (sk1) c0554os.f7823d;
        if (sk1Var != null && sk1Var.m4889h()) {
            sk1 sk1Var2 = (sk1) c0554os.f7824e;
            if (sk1Var2 == null) {
                sk1 sk1Var3 = fd2.f2911a;
                sk1Var2 = new sk1();
                c0554os.f7824e = sk1Var2;
            }
            sk1Var2.m4891j(sk1Var);
            sk1Var.m4883b();
        }
        c0554os.f7820a = true;
        this.f8457d.mo5j(nc0Var);
        c0554os.f7820a = false;
        pq0 pq0Var = (pq0) c0554os.f7822c;
        if (pq0Var != null) {
            pq0Var.f8470q--;
            pq0Var.m3944b();
        }
        sk1 sk1Var4 = (sk1) c0554os.f7824e;
        if (sk1Var4 == null || !sk1Var4.m4889h()) {
            return;
        }
        Object[] objArr = sk1Var4.f10175b;
        long[] jArr = sk1Var4.f10174a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.f8470q--;
                            ((pq0) objArr[(i << 3) + i3]).m3944b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        sk1Var4.m4883b();
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0731te m3946d() {
        AbstractC0731te tv1Var;
        AbstractC0731te abstractC0731te = this.f8464k;
        C0915y9 c0915y9 = this.f8465l;
        if (abstractC0731te != null) {
            return abstractC0731te;
        }
        if (c0915y9 != null) {
            sv1 sv1Var = new sv1(c0915y9);
            this.f8464k = sv1Var;
            return sv1Var;
        }
        long jM4715q0 = s11.m4715q0(this.f8474u);
        long j = this.f8461h;
        long j2 = this.f8462i;
        if (j2 != 9205357640488583168L) {
            jM4715q0 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM4715q0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM4715q0 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f8463j;
        if (f > 0.0f) {
            tv1Var = new uv1(AbstractC0570p7.m3770f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            tv1Var = new tv1(new o62(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f8464k = tv1Var;
        return tv1Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m3947e(long j, long j2, float f) {
        if (rs1.m4609b(this.f8461h, j) && gr2.m2019a(this.f8462i, j2) && this.f8463j == f && this.f8465l == null) {
            return;
        }
        this.f8464k = null;
        this.f8465l = null;
        this.f8460g = true;
        this.f8467n = false;
        this.f8461h = j;
        this.f8462i = j2;
        this.f8463j = f;
        m3943a();
    }
}
