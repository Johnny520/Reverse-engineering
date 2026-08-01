package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class b70 extends te0 {

    /* JADX INFO: renamed from: a */
    public final f70 f440a;

    /* JADX INFO: renamed from: b */
    public final C0166eb f441b;

    /* JADX INFO: renamed from: c */
    public final um0 f442c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b70(f70 f70Var, C0166eb c0166eb, um0 um0Var) {
        this.f440a = f70Var;
        this.f441b = c0166eb;
        this.f442c = um0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        e70 e70Var = new e70();
        e70Var.f1319r = this.f440a;
        e70Var.f1320s = this.f441b;
        e70Var.f1321t = this.f442c;
        return e70Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj;
        return p30.m3002l(this.f440a, b70Var.f440a) && p30.m3002l(this.f441b, b70Var.f441b) && this.f442c == b70Var.f442c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        e70 e70Var = (e70) oe0Var;
        e70Var.f1319r = this.f440a;
        e70Var.f1320s = this.f441b;
        e70Var.f1321t = this.f442c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f442c.hashCode() + AbstractC0748t1.m4145c((this.f441b.hashCode() + (this.f440a.hashCode() * 31)) * 31, 31, false);
    }
}
