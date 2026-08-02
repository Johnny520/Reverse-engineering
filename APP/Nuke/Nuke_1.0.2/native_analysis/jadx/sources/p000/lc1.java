package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lc1 {

    /* JADX INFO: renamed from: a */
    public final mc1 f6061a;

    static {
        new LocaleList(new Locale[0]);
    }

    public lc1(mc1 mc1Var) {
        this.f6061a = mc1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lc1) {
            return this.f6061a.equals(((lc1) obj).f6061a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6061a.f6561a.hashCode();
    }

    public final String toString() {
        return this.f6061a.f6561a.toString();
    }
}
