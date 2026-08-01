package p000;

import android.graphics.Typeface;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: kv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0408kv implements InterfaceC0369jv {

    /* JADX INFO: renamed from: a */
    public final C0675r3 f3272a;

    /* JADX INFO: renamed from: b */
    public final C0603p5 f3273b;

    /* JADX INFO: renamed from: c */
    public final C0111d f3274c;

    /* JADX INFO: renamed from: d */
    public final C0592ov f3275d;

    /* JADX INFO: renamed from: e */
    public final C0910x1 f3276e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0408kv(C0675r3 c0675r3, C0603p5 c0603p5) {
        C0111d c0111d = AbstractC0445lv.f3603a;
        C0592ov c0592ov = new C0592ov();
        C0527nv c0527nv = C0592ov.f4662a;
        C0300hy c0300hy = AbstractC0290ho.f2329a;
        c0527nv.getClass();
        p30.m2995e(pf1.m3034J(c0527nv, c0300hy).mo63h(C0220fs.f1799d).mo63h(new d51(null)));
        C0910x1 c0910x1 = new C0910x1(18);
        this.f3272a = c0675r3;
        this.f3273b = c0603p5;
        this.f3274c = c0111d;
        this.f3275d = c0592ov;
        this.f3276e = c0910x1;
        new C0532o(5, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: Exception -> 0x0099, TRY_ENTER, TryCatch #1 {Exception -> 0x0099, blocks: (B:25:0x0041, B:27:0x0053, B:30:0x0058, B:32:0x005c, B:34:0x0069, B:50:0x0091, B:51:0x0098, B:33:0x0065), top: B:59:0x0041 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ba1 m1957a(aa1 aa1Var) {
        Typeface typefaceM1730n;
        Object objRemove;
        C0111d c0111d = this.f3274c;
        synchronized (((jo0) c0111d.f919e)) {
            try {
                ba1 ba1Var = (ba1) ((fc0) c0111d.f920f).m1078a(aa1Var);
                if (ba1Var != null) {
                    if (ba1Var.f483e) {
                        return ba1Var;
                    }
                    fc0 fc0Var = (fc0) c0111d.f920f;
                    synchronized (fc0Var.f1673c) {
                        C0910x1 c0910x1 = fc0Var.f1672b;
                        c0910x1.getClass();
                        objRemove = ((LinkedHashMap) c0910x1.f7232e).remove(aa1Var);
                        if (objRemove != null) {
                            fc0Var.f1674d--;
                        }
                    }
                }
                try {
                    this.f3275d.getClass();
                    z51 z51Var = aa1Var.f77a;
                    Object obj = this.f3276e.f7232e;
                    int i = aa1Var.f79c;
                    C1018zv c1018zv = aa1Var.f78b;
                    ba1 ba1Var2 = null;
                    if (z51Var != null && !(z51Var instanceof C0893wl)) {
                        if (z51Var instanceof C0490mx) {
                            typefaceM1730n = jo0.m1730n(((C0490mx) z51Var).f4058d, c1018zv, i);
                        }
                        if (ba1Var2 != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((jo0) c0111d.f919e)) {
                            if (((fc0) c0111d.f920f).m1078a(aa1Var) == null && ba1Var2.f483e) {
                                ((fc0) c0111d.f920f).m1079b(aa1Var, ba1Var2);
                            }
                        }
                        return ba1Var2;
                    }
                    typefaceM1730n = jo0.m1730n(null, c1018zv, i);
                    ba1Var2 = new ba1(typefaceM1730n);
                    if (ba1Var2 != null) {
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final ba1 m1958b(z51 z51Var, C1018zv c1018zv, int i, int i2) {
        C0603p5 c0603p5 = this.f3273b;
        c0603p5.getClass();
        int i3 = c0603p5.f4752d;
        C1018zv c1018zv2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? c1018zv : new C1018zv(w60.m4907n(c1018zv.f8009d + i3, 1, 1000));
        this.f3272a.getClass();
        return m1957a(new aa1(z51Var, c1018zv2, i, i2, null));
    }
}
