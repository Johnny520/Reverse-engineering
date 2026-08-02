package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pq0 {
    public final rq0 a;
    public Outline f;
    public float j;
    public te k;
    public y9 l;
    public y9 m;
    public boolean n;
    public sp o;
    public q9 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public e70 b = pp0.c;
    public d61 c = d61.h;
    public in0 d = oq0.j;
    public final v5 e = new v5(12, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final os r = new os();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pq0(rq0 rq0Var) {
        this.a = rq0Var;
        rq0Var.t(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            rq0 rq0Var = this.a;
            if (z || rq0Var.F() > 0.0f) {
                y9 y9Var = this.l;
                if (y9Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = y9Var instanceof y9;
                    if (!z2) {
                        c80.t("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = y9Var.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                c80.t("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                c80.t("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = y9Var;
                    if (outline != null) {
                        outline.setAlpha(rq0Var.a());
                        outline2 = outline;
                    }
                    rq0Var.k(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        rq0Var.t(false);
                        rq0Var.p();
                    } else {
                        rq0Var.t(this.w);
                    }
                } else {
                    rq0Var.t(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jQ0 = s11.q0(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jQ0 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jQ0 >> 32);
                    int i5 = (int) (jQ0 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(rq0Var.a());
                    rq0Var.k(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                rq0Var.t(false);
                rq0Var.k(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        if (this.s && this.q == 0) {
            os osVar = this.r;
            pq0 pq0Var = (pq0) osVar.b;
            if (pq0Var != null) {
                pq0Var.q--;
                pq0Var.b();
                osVar.b = null;
            }
            sk1 sk1Var = (sk1) osVar.d;
            if (sk1Var != null) {
                Object[] objArr = sk1Var.b;
                long[] jArr = sk1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((pq0) objArr[(i << 3) + i3]).b();
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
                sk1Var.b();
            }
            this.a.p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(nc0 nc0Var) {
        os osVar = this.r;
        osVar.c = (pq0) osVar.b;
        sk1 sk1Var = (sk1) osVar.d;
        if (sk1Var != null && sk1Var.h()) {
            sk1 sk1Var2 = (sk1) osVar.e;
            if (sk1Var2 == null) {
                sk1 sk1Var3 = fd2.a;
                sk1Var2 = new sk1();
                osVar.e = sk1Var2;
            }
            sk1Var2.j(sk1Var);
            sk1Var.b();
        }
        osVar.a = true;
        this.d.j(nc0Var);
        osVar.a = false;
        pq0 pq0Var = (pq0) osVar.c;
        if (pq0Var != null) {
            pq0Var.q--;
            pq0Var.b();
        }
        sk1 sk1Var4 = (sk1) osVar.e;
        if (sk1Var4 == null || !sk1Var4.h()) {
            return;
        }
        Object[] objArr = sk1Var4.b;
        long[] jArr = sk1Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((pq0) objArr[(i << 3) + i3]).b();
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
        sk1Var4.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final te d() {
        te tv1Var;
        te teVar = this.k;
        y9 y9Var = this.l;
        if (teVar != null) {
            return teVar;
        }
        if (y9Var != null) {
            sv1 sv1Var = new sv1(y9Var);
            this.k = sv1Var;
            return sv1Var;
        }
        long jQ0 = s11.q0(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jQ0 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jQ0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jQ0 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            tv1Var = new uv1(p7.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            tv1Var = new tv1(new o62(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = tv1Var;
        return tv1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(long j, long j2, float f) {
        if (rs1.b(this.h, j) && gr2.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
