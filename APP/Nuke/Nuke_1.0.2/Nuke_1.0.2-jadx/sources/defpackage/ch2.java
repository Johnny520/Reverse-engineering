package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ch2 {
    public final boolean a;
    public final boolean b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ch2(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        if (!z && !z2) {
            s.j("Filesystem permission must enable external or host.");
            throw null;
        }
        if (str != null && pv2.s0(str)) {
            s.j("Filesystem permission reason must not be blank.");
            throw null;
        }
        if (str == null || str.length() <= 512) {
            return;
        }
        s.j("Filesystem permission reason is too long.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2Var = (ch2) obj;
        return this.a == ch2Var.a && this.b == ch2Var.b && t11.l(this.c, ch2Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iD = hk1.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ScriptFilesystemPermission(external=");
        sb.append(this.a);
        sb.append(", host=");
        sb.append(this.b);
        sb.append(", reason=");
        return hk1.j(sb, this.c, ")");
    }
}
