package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 implements fd1 {

    /* JADX INFO: renamed from: a */
    public final ma1 f1360a;

    /* JADX INFO: renamed from: b */
    public final int f1361b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ea0(ma1 ma1Var, int i) {
        this.f1360a = ma1Var;
        this.f1361b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: a */
    public final int mo675a(InterfaceC0968ym interfaceC0968ym) {
        if ((this.f1361b & 32) != 0) {
            return this.f1360a.mo675a(interfaceC0968ym);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: b */
    public final int mo676b(InterfaceC0968ym interfaceC0968ym) {
        if ((this.f1361b & 16) != 0) {
            return this.f1360a.mo676b(interfaceC0968ym);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: c */
    public final int mo677c(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        if (((k50Var == k50.f3015d ? 4 : 1) & this.f1361b) != 0) {
            return this.f1360a.mo677c(interfaceC0968ym, k50Var);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: d */
    public final int mo678d(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        if (((k50Var == k50.f3015d ? 8 : 2) & this.f1361b) != 0) {
            return this.f1360a.mo678d(interfaceC0968ym, k50Var);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0Var = (ea0) obj;
        return this.f1360a.equals(ea0Var.f1360a) && this.f1361b == ea0Var.f1361b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f1361b) + (this.f1360a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f1360a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.f1361b;
        int i2 = j50.f2730a;
        if ((i & i2) == i2) {
            j50.m1650B(sb3, "Start");
        }
        int i3 = j50.f2732c;
        if ((i & i3) == i3) {
            j50.m1650B(sb3, "Left");
        }
        if ((i & 16) == 16) {
            j50.m1650B(sb3, "Top");
        }
        int i4 = j50.f2731b;
        if ((i & i4) == i4) {
            j50.m1650B(sb3, "End");
        }
        int i5 = j50.f2733d;
        if ((i & i5) == i5) {
            j50.m1650B(sb3, "Right");
        }
        if ((i & 32) == 32) {
            j50.m1650B(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
