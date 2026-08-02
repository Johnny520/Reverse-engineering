package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gg2 {
    public final hg2 a;
    public final boolean b;
    public final long c;
    public final Long d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gg2(hg2 hg2Var, boolean z, long j, Long l) {
        hg2Var.getClass();
        this.a = hg2Var;
        this.b = z;
        this.c = j;
        this.d = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JsObject a() {
        hg2 hg2Var = this.a;
        String lowerCase = hg2Var.a.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new JsObject(we1.q0(new ow1("area", lowerCase), new ow1("path", hg2Var.b), new ow1("kind", this.b ? "directory" : "file"), new ow1("size", Long.valueOf(this.c)), new ow1("modifiedAt", this.d)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg2)) {
            return false;
        }
        gg2 gg2Var = (gg2) obj;
        return t11.l(this.a, gg2Var.a) && this.b == gg2Var.b && this.c == gg2Var.c && t11.l(this.d, gg2Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iC = hk1.c(hk1.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return iC + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptFileInfo(ref=" + this.a + ", directory=" + this.b + ", size=" + this.c + ", modifiedAt=" + this.d + ")";
    }
}
