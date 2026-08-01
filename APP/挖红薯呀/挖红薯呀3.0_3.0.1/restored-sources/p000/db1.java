package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class db1 implements fd1 {

    /* JADX INFO: renamed from: a */
    public final String f1043a;

    /* JADX INFO: renamed from: b */
    public final gp0 f1044b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public db1(q20 q20Var, String str) {
        this.f1043a = str;
        this.f1044b = r60.m3419u(q20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: a */
    public final int mo675a(InterfaceC0968ym interfaceC0968ym) {
        return m679e().f5027d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: b */
    public final int mo676b(InterfaceC0968ym interfaceC0968ym) {
        return m679e().f5025b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: c */
    public final int mo677c(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        return m679e().f5026c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: d */
    public final int mo678d(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        return m679e().f5024a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final q20 m679e() {
        return (q20) this.f1044b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof db1) {
            return p30.m3002l(m679e(), ((db1) obj).m679e());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m680f(q20 q20Var) {
        this.f1044b.setValue(q20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1043a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f1043a + "(left=" + m679e().f5024a + ", top=" + m679e().f5025b + ", right=" + m679e().f5026c + ", bottom=" + m679e().f5027d + ')';
    }
}
