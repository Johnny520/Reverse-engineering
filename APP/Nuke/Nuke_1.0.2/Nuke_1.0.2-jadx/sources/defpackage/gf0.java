package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements a51 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final a51 g;
    public final Map h;
    public final ov1 i;
    public int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gf0(Object obj, a51 a51Var, int i, int i2, Map map, Class cls, Class cls2, ov1 ov1Var) {
        fg1.q("Argument must not be null", obj);
        this.b = obj;
        this.g = a51Var;
        this.c = i;
        this.d = i2;
        fg1.q("Argument must not be null", map);
        this.h = map;
        fg1.q("Resource class must not be null", cls);
        this.e = cls;
        fg1.q("Transcode class must not be null", cls2);
        this.f = cls2;
        fg1.q("Argument must not be null", ov1Var);
        this.i = ov1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final boolean equals(Object obj) {
        if (obj instanceof gf0) {
            gf0 gf0Var = (gf0) obj;
            if (this.b.equals(gf0Var.b) && this.g.equals(gf0Var.g) && this.d == gf0Var.d && this.c == gf0Var.c && this.h.equals(gf0Var.h) && this.e.equals(gf0Var.e) && this.f.equals(gf0Var.f) && this.i.equals(gf0Var.i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
