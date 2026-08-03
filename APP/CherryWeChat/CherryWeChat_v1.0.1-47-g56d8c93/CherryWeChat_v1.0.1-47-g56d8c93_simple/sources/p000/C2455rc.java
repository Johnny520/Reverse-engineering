package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: rc */
/* JADX INFO: loaded from: classes.dex */
public final class C2455rc implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0802Sm f8648b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0802Sm f8649c;

    public C2455rc(InterfaceC0802Sm r1, InterfaceC0802Sm r2) {
        this.f8648b = r1;
        this.f8649c = r2;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r2) {
        this.f8648b.mo172b(r2);
        this.f8649c.mo172b(r2);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r4) {
        if ((r4 instanceof C2455rc) == false) goto L10;
        C2455rc r42 = (C2455rc) r4;
        if (this.f8648b.equals(r42.f8648b) == false) goto L10;
        if (this.f8649c.equals(r42.f8649c) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        int r0 = this.f8648b.hashCode() * 31;
        return this.f8649c.hashCode() + r0;
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f8648b + ", signature=" + this.f8649c + '}';
    }
}
