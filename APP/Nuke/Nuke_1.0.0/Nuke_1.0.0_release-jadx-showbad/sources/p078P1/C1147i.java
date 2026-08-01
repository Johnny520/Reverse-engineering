package p078P1;

import java.security.MessageDigest;
import p195l2.C2499c;

/* JADX INFO: renamed from: P1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1147i implements InterfaceC1144f {

    /* JADX INFO: renamed from: b */
    public final C2499c f3785b = new C2499c(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        int i5 = 0;
        while (true) {
            C2499c c2499c = this.f3785b;
            if (i5 >= c2499c.f7820f) {
                return;
            }
            C1146h c1146h = (C1146h) c2499c.m4304f(i5);
            Object objM4308j = this.f3785b.m4308j(i5);
            InterfaceC1145g interfaceC1145g = c1146h.f3782b;
            if (c1146h.f3784d == null) {
                c1146h.f3784d = c1146h.f3783c.getBytes(InterfaceC1144f.f3779a);
            }
            interfaceC1145g.mo150a(c1146h.f3784d, objM4308j, messageDigest);
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m2201c(C1146h c1146h) {
        C2499c c2499c = this.f3785b;
        return c2499c.containsKey(c1146h) ? c2499c.get(c1146h) : c1146h.f3781a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        if (obj instanceof C1147i) {
            return this.f3785b.equals(((C1147i) obj).f3785b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return this.f3785b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Options{values=" + this.f3785b + '}';
    }
}
