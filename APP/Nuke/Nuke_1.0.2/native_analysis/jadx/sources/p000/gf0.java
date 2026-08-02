package p000;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements a51 {

    /* JADX INFO: renamed from: b */
    public final Object f3475b;

    /* JADX INFO: renamed from: c */
    public final int f3476c;

    /* JADX INFO: renamed from: d */
    public final int f3477d;

    /* JADX INFO: renamed from: e */
    public final Class f3478e;

    /* JADX INFO: renamed from: f */
    public final Class f3479f;

    /* JADX INFO: renamed from: g */
    public final a51 f3480g;

    /* JADX INFO: renamed from: h */
    public final Map f3481h;

    /* JADX INFO: renamed from: i */
    public final ov1 f3482i;

    /* JADX INFO: renamed from: j */
    public int f3483j;

    public gf0(Object obj, a51 a51Var, int i, int i2, Map map, Class cls, Class cls2, ov1 ov1Var) {
        fg1.m1642q("Argument must not be null", obj);
        this.f3475b = obj;
        this.f3480g = a51Var;
        this.f3476c = i;
        this.f3477d = i2;
        fg1.m1642q("Argument must not be null", map);
        this.f3481h = map;
        fg1.m1642q("Resource class must not be null", cls);
        this.f3478e = cls;
        fg1.m1642q("Transcode class must not be null", cls2);
        this.f3479f = cls2;
        fg1.m1642q("Argument must not be null", ov1Var);
        this.f3482i = ov1Var;
    }

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        if (obj instanceof gf0) {
            gf0 gf0Var = (gf0) obj;
            if (this.f3475b.equals(gf0Var.f3475b) && this.f3480g.equals(gf0Var.f3480g) && this.f3477d == gf0Var.f3477d && this.f3476c == gf0Var.f3476c && this.f3481h.equals(gf0Var.f3481h) && this.f3478e.equals(gf0Var.f3478e) && this.f3479f.equals(gf0Var.f3479f) && this.f3482i.equals(gf0Var.f3482i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.a51
    public final int hashCode() {
        if (this.f3483j == 0) {
            int iHashCode = this.f3475b.hashCode();
            this.f3483j = iHashCode;
            int iHashCode2 = ((((this.f3480g.hashCode() + (iHashCode * 31)) * 31) + this.f3476c) * 31) + this.f3477d;
            this.f3483j = iHashCode2;
            int iHashCode3 = this.f3481h.hashCode() + (iHashCode2 * 31);
            this.f3483j = iHashCode3;
            int iHashCode4 = this.f3478e.hashCode() + (iHashCode3 * 31);
            this.f3483j = iHashCode4;
            int iHashCode5 = this.f3479f.hashCode() + (iHashCode4 * 31);
            this.f3483j = iHashCode5;
            this.f3483j = this.f3482i.f7858b.hashCode() + (iHashCode5 * 31);
        }
        return this.f3483j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f3475b + ", width=" + this.f3476c + ", height=" + this.f3477d + ", resourceClass=" + this.f3478e + ", transcodeClass=" + this.f3479f + ", signature=" + this.f3480g + ", hashCode=" + this.f3483j + ", transformations=" + this.f3481h + ", options=" + this.f3482i + '}';
    }
}
