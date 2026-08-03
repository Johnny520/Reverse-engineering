package p265s;

import gg.AbstractC1416l;
import p015b0.C0144j;
import p015b0.C0151q;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p085fg.InterfaceC1235p;
import p251r.C3626k;
import p266s0.C3874d;
import p307v0.InterfaceC4363c;

/* JADX INFO: renamed from: s.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3816b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4363c f12517a;

    /* JADX INFO: renamed from: b */
    public final C0144j f12518b;

    /* JADX INFO: renamed from: c */
    public final C0943k0 f12519c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3816b0(InterfaceC4363c interfaceC4363c, C0144j c0144j) {
        this.f12517a = interfaceC4363c;
        this.f12518b = c0144j;
        long[] jArr = AbstractC0957r0.f3015a;
        this.f12519c = new C0943k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC1235p m8004a(Object obj, int i9, Object obj2) {
        C0943k0 c0943k0 = this.f12519c;
        C3813a0 c3813a0 = (C3813a0) c0943k0.m2320g(obj);
        if (c3813a0 != null && c3813a0.f12506c == i9 && AbstractC1416l.m3825a(c3813a0.f12505b, obj2)) {
            C3874d c3874d = c3813a0.f12507d;
            if (c3874d != null) {
                return c3874d;
            }
            C3874d c3874d2 = new C3874d(818252804, new C0151q(c3813a0.f12508e, 10, c3813a0), true);
            c3813a0.f12507d = c3874d2;
            return c3874d2;
        }
        C3813a0 c3813a02 = new C3813a0(this, i9, obj, obj2);
        c0943k0.m2326m(obj, c3813a02);
        C3874d c3874d3 = c3813a02.f12507d;
        if (c3874d3 != null) {
            return c3874d3;
        }
        C3874d c3874d4 = new C3874d(818252804, new C0151q(this, 10, c3813a02), true);
        c3813a02.f12507d = c3874d4;
        return c3874d4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m8005b(Object obj) {
        if (obj == null) {
            return null;
        }
        C3813a0 c3813a0 = (C3813a0) this.f12519c.m2320g(obj);
        if (c3813a0 != null) {
            return c3813a0.f12505b;
        }
        C3626k c3626k = (C3626k) this.f12518b.invoke();
        int iM364o = c3626k.f11694d.m364o(obj);
        if (iM364o != -1) {
            return c3626k.m7606b(iM364o);
        }
        return null;
    }
}
