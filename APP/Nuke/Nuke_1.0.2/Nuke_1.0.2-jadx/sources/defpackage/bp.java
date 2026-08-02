package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bp implements p41, Serializable {
    public transient p41 h;
    public final Object i;
    public final Class j;
    public final String k;
    public final String l;
    public final boolean m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bp(Object obj, Class cls, String str, String str2, boolean z) {
        this.i = obj;
        this.j = cls;
        this.k = str;
        this.l = str2;
        this.m = z;
    }

    public abstract p41 d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final rs f() {
        boolean z = this.m;
        Class cls = this.j;
        if (!z) {
            return d72.a(cls);
        }
        d72.a.getClass();
        return new fw1(cls);
    }
}
