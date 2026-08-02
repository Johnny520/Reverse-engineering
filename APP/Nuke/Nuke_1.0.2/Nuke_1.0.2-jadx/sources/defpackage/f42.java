package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f42 {
    public final e42 a;
    public final boolean b;
    public final ks2 c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f42(e42 e42Var, Object obj, boolean z, ks2 ks2Var, boolean z2) {
        this.a = e42Var;
        this.b = z;
        this.c = ks2Var;
        this.d = z2;
        this.e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        tx.b("Unexpected form of a provided value");
        s.b();
        return null;
    }
}
