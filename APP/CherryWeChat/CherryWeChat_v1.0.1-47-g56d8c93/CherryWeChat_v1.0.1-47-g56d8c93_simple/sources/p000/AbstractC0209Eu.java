package p000;

/* JADX INFO: renamed from: Eu */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0209Eu extends AbstractC0222F6 implements InterfaceC0674Pm {

    /* JADX INFO: renamed from: g */
    public final boolean f615g;

    public AbstractC0209Eu(int r9, Class r10, Object r11, String r12, String r13) {
        if ((r9 & 1) != 1) goto L6;
        boolean r7 = true;
    L7:
        super(r11, r10, r12, r13, r7);
        this.f615g = false;
        return;
    L6:
        r7 = false;
        goto L7
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof AbstractC0209Eu) == false) goto L17;
        AbstractC0209Eu r32 = (AbstractC0209Eu) r3;
        if (m437e().equals(r32.m437e()) == true) goto L9;
        return false;
    L9:
        if (this.f654d.equals(r32.f654d) == true) goto L11;
        return false;
    L11:
        if (this.f655e.equals(r32.f655e) == true) goto L13;
        return false;
    L13:
        if (AbstractC0585Nj.m1134a(this.f652b, r32.f652b) == false) goto L25;
        return true;
    L25:
        return false;
    L17:
        if ((r3 instanceof InterfaceC0674Pm) == true) goto L19;
        return false;
    L19:
        return r3.equals(m402f());
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0459Km m402f() {
        if (this.f615g == false) goto L5;
        return this;
    L5:
        InterfaceC0459Km r0 = this.f651a;
        if (r0 != null) goto L9;
        InterfaceC0459Km r02 = mo436c();
        this.f651a = r02;
        return r02;
    L9:
        return r0;
    }

    public final int hashCode() {
        int r0 = m437e().hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f654d, r0, 31);
        return this.f655e.hashCode() + r02;
    }

    public final String toString() {
        InterfaceC0459Km r0 = m402f();
        if (r0 == this) goto L7;
        return r0.toString();
    L7:
        return AbstractC0213Ey.m410h(new StringBuilder("property "), this.f654d, " (Kotlin reflection is not available)");
    }
}
