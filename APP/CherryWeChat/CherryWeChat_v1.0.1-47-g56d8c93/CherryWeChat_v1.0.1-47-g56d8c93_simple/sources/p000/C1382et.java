package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: et */
/* JADX INFO: loaded from: classes.dex */
public final class C1382et implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final Object f4927b;

    public C1382et(Object r2) {
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        this.f4927b = r2;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r3) {
        r3.update(this.f4927b.toString().getBytes(InterfaceC0802Sm.f2524a));
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r2) {
        if ((r2 instanceof C1382et) == true) goto L5;
        return false;
    L5:
        return this.f4927b.equals(((C1382et) r2).f4927b);
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f4927b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4927b + '}';
    }
}
