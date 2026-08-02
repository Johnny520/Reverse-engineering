package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b73 {
    public static final a73 Companion = new a73();
    public static final j71[] c = {null, p7.B(i91.h, new y63(0))};
    public final String a;
    public final List b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b73(int i, String str, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = be0.h;
        } else {
            this.b = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b73)) {
            return false;
        }
        b73 b73Var = (b73) obj;
        return t11.l(this.a, b73Var.a) && t11.l(this.b, b73Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ThemeConfig(accentColorHex=" + this.a + ", recentAccentColorHexes=" + this.b + ")";
    }

    public b73(String str, List list) {
        this.a = str;
        this.b = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (null java.lang.String), (wrap:be0:0x0001: SGET  A[WRAPPED] (LINE:26) be0.h be0) A[MD:(java.lang.String, java.util.List):void (m)] (LINE:27) call: b73.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ b73() {
        this(null, be0.h);
    }
}
