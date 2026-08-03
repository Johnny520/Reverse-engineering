package p071n;

import java.util.HashSet;
import java.util.Iterator;
import p034S.AbstractC0324d;
import p069m.AbstractC0988h;
import p069m.C0989i;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0998c {

    /* JADX INFO: renamed from: b */
    public final C0999d f3578b;

    /* JADX INFO: renamed from: c */
    public final int f3579c;

    /* JADX INFO: renamed from: d */
    public C0998c f3580d;

    /* JADX INFO: renamed from: g */
    public C0989i f3583g;

    /* JADX INFO: renamed from: a */
    public HashSet f3577a = null;

    /* JADX INFO: renamed from: e */
    public int f3581e = 0;

    /* JADX INFO: renamed from: f */
    public int f3582f = -1;

    public C0998c(C0999d c0999d, int i2) {
        this.f3578b = c0999d;
        this.f3579c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2388a(C0998c c0998c, int i2) {
        m2389b(c0998c, i2, -1, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2389b(C0998c c0998c, int i2, int i3, boolean z2) {
        if (c0998c == null) {
            m2395h();
            return true;
        }
        if (!z2 && !m2394g(c0998c)) {
            return false;
        }
        this.f3580d = c0998c;
        if (c0998c.f3577a == null) {
            c0998c.f3577a = new HashSet();
        }
        this.f3580d.f3577a.add(this);
        if (i2 > 0) {
            this.f3581e = i2;
        } else {
            this.f3581e = 0;
        }
        this.f3582f = i3;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m2390c() {
        C0998c c0998c;
        if (this.f3578b.f3605V == 8) {
            return 0;
        }
        int i2 = this.f3582f;
        return (i2 <= -1 || (c0998c = this.f3580d) == null || c0998c.f3578b.f3605V != 8) ? this.f3581e : i2;
    }

    /* JADX INFO: renamed from: d */
    public final C0998c m2391d() {
        int i2 = this.f3579c;
        int iM2372a = AbstractC0988h.m2372a(i2);
        C0999d c0999d = this.f3578b;
        switch (iM2372a) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0999d.f3638z;
            case 2:
                return c0999d.f3584A;
            case 3:
                return c0999d.f3636x;
            case 4:
                return c0999d.f3637y;
            default:
                throw new AssertionError(AbstractC0324d.m727j(i2));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2392e() {
        HashSet hashSet = this.f3577a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0998c) it.next()).m2391d().m2393f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2393f() {
        return this.f3580d != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2394g(C0998c c0998c) {
        if (c0998c == null) {
            return false;
        }
        int i2 = this.f3579c;
        C0999d c0999d = c0998c.f3578b;
        int i3 = c0998c.f3579c;
        if (i3 == i2) {
            return i2 != 6 || (c0999d.f3635w && this.f3578b.f3635w);
        }
        switch (AbstractC0988h.m2372a(i2)) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i3 == 2 || i3 == 4;
                if (c0999d instanceof C1003h) {
                    return z2 || i3 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i3 == 3 || i3 == 5;
                if (c0999d instanceof C1003h) {
                    return z3 || i3 == 9;
                }
                return z3;
            case 6:
                return (i3 == 6 || i3 == 8 || i3 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC0324d.m727j(i2));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2395h() {
        HashSet hashSet;
        C0998c c0998c = this.f3580d;
        if (c0998c != null && (hashSet = c0998c.f3577a) != null) {
            hashSet.remove(this);
        }
        this.f3580d = null;
        this.f3581e = 0;
        this.f3582f = -1;
    }

    /* JADX INFO: renamed from: i */
    public final void m2396i() {
        C0989i c0989i = this.f3583g;
        if (c0989i == null) {
            this.f3583g = new C0989i(1);
        } else {
            c0989i.m2375c();
        }
    }

    public final String toString() {
        return this.f3578b.f3606W + ":" + AbstractC0324d.m727j(this.f3579c);
    }
}
