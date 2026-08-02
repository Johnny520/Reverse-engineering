package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ch2 {

    /* JADX INFO: renamed from: a */
    public final boolean f1542a;

    /* JADX INFO: renamed from: b */
    public final boolean f1543b;

    /* JADX INFO: renamed from: c */
    public final String f1544c;

    public ch2(String str, boolean z, boolean z2) {
        this.f1542a = z;
        this.f1543b = z2;
        this.f1544c = str;
        if (!z && !z2) {
            C0676s.m4651j("Filesystem permission must enable external or host.");
            throw null;
        }
        if (str != null && pv2.m4006s0(str)) {
            C0676s.m4651j("Filesystem permission reason must not be blank.");
            throw null;
        }
        if (str == null || str.length() <= 512) {
            return;
        }
        C0676s.m4651j("Filesystem permission reason is too long.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2Var = (ch2) obj;
        return this.f1542a == ch2Var.f1542a && this.f1543b == ch2Var.f1543b && t11.m5086l(this.f1544c, ch2Var.f1544c);
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d(Boolean.hashCode(this.f1542a) * 31, 31, this.f1543b);
        String str = this.f1544c;
        return iM2205d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScriptFilesystemPermission(external=");
        sb.append(this.f1542a);
        sb.append(", host=");
        sb.append(this.f1543b);
        sb.append(", reason=");
        return hk1.m2211j(sb, this.f1544c, ")");
    }
}
