package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: rc */
/* JADX INFO: loaded from: classes.dex */
public final class C2455rc implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0802Sm f8648b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0802Sm f8649c;

    public C2455rc(InterfaceC0802Sm interfaceC0802Sm, InterfaceC0802Sm interfaceC0802Sm2) {
        this.f8648b = interfaceC0802Sm;
        this.f8649c = interfaceC0802Sm2;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        this.f8648b.mo172b(messageDigest);
        this.f8649c.mo172b(messageDigest);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        if (obj instanceof C2455rc) {
            C2455rc c2455rc = (C2455rc) obj;
            if (this.f8648b.equals(c2455rc.f8648b) && this.f8649c.equals(c2455rc.f8649c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f8649c.hashCode() + (this.f8648b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f8648b + ", signature=" + this.f8649c + '}';
    }
}
