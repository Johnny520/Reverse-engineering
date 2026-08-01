package p000;

/* JADX INFO: renamed from: kd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0388kd {

    /* JADX INFO: renamed from: a */
    public final C0276ha f3079a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0742sw f3080b;

    /* JADX INFO: renamed from: c */
    public final o31 f3081c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0388kd(C0276ha c0276ha, InterfaceC0742sw interfaceC0742sw, o31 o31Var) {
        this.f3079a = c0276ha;
        this.f3080b = interfaceC0742sw;
        this.f3081c = o31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0388kd)) {
            return false;
        }
        C0388kd c0388kd = (C0388kd) obj;
        return this.f3079a.equals(c0388kd.f3079a) && this.f3080b.equals(c0388kd.f3080b) && this.f3081c.equals(c0388kd.f3081c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f3081c.hashCode() + ((this.f3080b.hashCode() + (this.f3079a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ChangeSize(alignment=" + this.f3079a + ", size=" + this.f3080b + ", animationSpec=" + this.f3081c + ", clip=true)";
    }
}
