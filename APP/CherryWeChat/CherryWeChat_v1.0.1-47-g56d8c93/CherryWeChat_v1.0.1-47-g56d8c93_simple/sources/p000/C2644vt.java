package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: vt */
/* JADX INFO: loaded from: classes.dex */
public final class C2644vt implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final C0007A6 f9156b;

    public C2644vt() {
        this.f9156b = new C0007A6(0);
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r7) {
        int r0 = 0;
    L3:
        C0007A6 r1 = this.f9156b;
        if (r0 >= r1.f8818c) goto L9;
        C2601ut r12 = (C2601ut) r1.m5002f(r0);
        Object r2 = this.f9156b.m5003j(r0);
        InterfaceC2558tt r3 = r12.f8988b;
        if (r12.f8990d != null) goto L8;
        r12.f8990d = r12.f8989c.getBytes(InterfaceC0802Sm.f2524a);
    L8:
        r3.mo1334a(r12.f8990d, r2, r7);
        r0 = r0 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: c */
    public final Object m5177c(C2601ut r3) {
        C0007A6 r0 = this.f9156b;
        if (r0.containsKey(r3) == false) goto L7;
        return r0.get(r3);
    L7:
        return r3.f8987a;
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r2) {
        if ((r2 instanceof C2644vt) == true) goto L5;
        return false;
    L5:
        return this.f9156b.equals(((C2644vt) r2).f9156b);
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f9156b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f9156b + '}';
    }
}
