package p000;

import com.dokar.quickjs.binding.JsObject;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gg2 {

    /* JADX INFO: renamed from: a */
    public final hg2 f3509a;

    /* JADX INFO: renamed from: b */
    public final boolean f3510b;

    /* JADX INFO: renamed from: c */
    public final long f3511c;

    /* JADX INFO: renamed from: d */
    public final Long f3512d;

    public gg2(hg2 hg2Var, boolean z, long j, Long l) {
        hg2Var.getClass();
        this.f3509a = hg2Var;
        this.f3510b = z;
        this.f3511c = j;
        this.f3512d = l;
    }

    /* JADX INFO: renamed from: a */
    public final JsObject m1909a() {
        hg2 hg2Var = this.f3509a;
        String lowerCase = hg2Var.f4002a.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new JsObject(we1.m5876q0(new ow1("area", lowerCase), new ow1("path", hg2Var.f4003b), new ow1("kind", this.f3510b ? "directory" : "file"), new ow1("size", Long.valueOf(this.f3511c)), new ow1("modifiedAt", this.f3512d)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg2)) {
            return false;
        }
        gg2 gg2Var = (gg2) obj;
        return t11.m5086l(this.f3509a, gg2Var.f3509a) && this.f3510b == gg2Var.f3510b && this.f3511c == gg2Var.f3511c && t11.m5086l(this.f3512d, gg2Var.f3512d);
    }

    public final int hashCode() {
        int iM2204c = hk1.m2204c(hk1.m2205d(this.f3509a.hashCode() * 31, 31, this.f3510b), 31, this.f3511c);
        Long l = this.f3512d;
        return iM2204c + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "ScriptFileInfo(ref=" + this.f3509a + ", directory=" + this.f3510b + ", size=" + this.f3511c + ", modifiedAt=" + this.f3512d + ")";
    }
}
