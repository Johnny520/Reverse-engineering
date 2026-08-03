package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: vt */
/* JADX INFO: loaded from: classes.dex */
public final class C2644vt implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final C0007A6 f9156b = new C0007A6(0);

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0007A6 c0007a6 = this.f9156b;
            if (i >= c0007a6.f8818c) {
                return;
            }
            C2601ut c2601ut = (C2601ut) c0007a6.m5002f(i);
            Object objM5003j = this.f9156b.m5003j(i);
            InterfaceC2558tt interfaceC2558tt = c2601ut.f8988b;
            if (c2601ut.f8990d == null) {
                c2601ut.f8990d = c2601ut.f8989c.getBytes(InterfaceC0802Sm.f2524a);
            }
            interfaceC2558tt.mo1334a(c2601ut.f8990d, objM5003j, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m5177c(C2601ut c2601ut) {
        C0007A6 c0007a6 = this.f9156b;
        return c0007a6.containsKey(c2601ut) ? c0007a6.get(c2601ut) : c2601ut.f8987a;
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        if (obj instanceof C2644vt) {
            return this.f9156b.equals(((C2644vt) obj).f9156b);
        }
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return this.f9156b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f9156b + '}';
    }
}
