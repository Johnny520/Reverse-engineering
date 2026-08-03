package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: et */
/* JADX INFO: loaded from: classes.dex */
public final class C1382et implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final Object f4927b;

    public C1382et(Object obj) {
        AbstractC0714Qj.m1488j("Argument must not be null", obj);
        this.f4927b = obj;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        messageDigest.update(this.f4927b.toString().getBytes(InterfaceC0802Sm.f2524a));
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        if (obj instanceof C1382et) {
            return this.f4927b.equals(((C1382et) obj).f4927b);
        }
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f4927b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4927b + '}';
    }
}
