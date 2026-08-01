package p158f0;

import p000A.C0056d0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p114X.AbstractC1614c;
import p114X.C1618g;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;

/* JADX INFO: renamed from: f0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2086r {

    /* JADX INFO: renamed from: a */
    public static final Object f6982a = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m3850a(int i5, int i6) {
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException("index (" + i5 + ") is out of bound of [0, " + i6 + ')');
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3851b(C2089u c2089u, int i5, AbstractC1614c abstractC1614c, boolean z5) {
        boolean z6;
        synchronized (f6982a) {
            try {
                int i6 = c2089u.f7007d;
                if (i6 == i5) {
                    c2089u.f7006c = abstractC1614c;
                    z6 = true;
                    if (z5) {
                        c2089u.f7008e++;
                    }
                    c2089u.f7007d = i6 + 1;
                } else {
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: c */
    public static final int m3852c(long j5, long[] jArr) {
        int length = jArr.length - 1;
        int i5 = 0;
        while (i5 <= length) {
            int i6 = (i5 + length) >>> 1;
            long j6 = jArr[i6];
            if (j5 > j6) {
                i5 = i6 + 1;
            } else {
                if (j5 >= j6) {
                    return i6;
                }
                length = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC2074f m3853e() {
        return (AbstractC2074f) AbstractC2082n.f6971b.m105i();
    }

    /* JADX INFO: renamed from: f */
    public static final C2089u m3854f(C2085q c2085q) {
        C2089u c2089u = c2085q.f6981d;
        AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (C2089u) AbstractC2082n.m3844t(c2089u, c2085q);
    }

    /* JADX INFO: renamed from: g */
    public static final int m3855g(C2085q c2085q) {
        C2089u c2089u = c2085q.f6981d;
        AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((C2089u) AbstractC2082n.m3832h(c2089u)).f7008e;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC2074f m3856h(AbstractC2074f abstractC2074f) {
        if (abstractC2074f instanceof C2094z) {
            C2094z c2094z = (C2094z) abstractC2074f;
            if (c2094z.f7021t == AbstractC1848j.m3313b()) {
                c2094z.f7019r = null;
                return abstractC2074f;
            }
        }
        if (abstractC2074f instanceof C2068A) {
            C2068A c2068a = (C2068A) abstractC2074f;
            if (c2068a.f6928i == AbstractC1848j.m3313b()) {
                c2068a.f6927h = null;
                return abstractC2074f;
            }
        }
        AbstractC2074f abstractC2074fM3831g = AbstractC2082n.m3831g(abstractC2074f, null, false);
        abstractC2074fM3831g.m3813j();
        return abstractC2074fM3831g;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m3857i(C2085q c2085q, InterfaceC1601c interfaceC1601c) {
        int i5;
        AbstractC1614c abstractC1614c;
        Object objMo1h;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        do {
            synchronized (f6982a) {
                C2089u c2089u = c2085q.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i5 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            C1618g c1618gMo2880e = abstractC1614c.mo2880e();
            objMo1h = interfaceC1601c.mo1h(c1618gMo2880e);
            AbstractC1614c abstractC1614cM2899c = c1618gMo2880e.m2899c();
            if (AbstractC1665j.m2981a(abstractC1614cM2899c, abstractC1614c)) {
                break;
            }
            C2089u c2089u3 = c2085q.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, c2085q, abstractC2074fM3834j), i5, abstractC1614cM2899c, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, c2085q);
        } while (!zM3851b);
        return ((Boolean) objMo1h).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public static Object m3858j(C0056d0 c0056d0, InterfaceC1599a interfaceC1599a) {
        AbstractC2074f c2094z;
        AbstractC2074f abstractC2074f = (AbstractC2074f) AbstractC2082n.f6971b.m105i();
        if (abstractC2074f instanceof C2094z) {
            C2094z c2094z2 = (C2094z) abstractC2074f;
            if (c2094z2.f7021t == AbstractC1848j.m3313b()) {
                InterfaceC1601c interfaceC1601c = c2094z2.f7019r;
                InterfaceC1601c interfaceC1601c2 = c2094z2.f7020s;
                try {
                    ((C2094z) abstractC2074f).f7019r = AbstractC2082n.m3835k(c0056d0, interfaceC1601c, true);
                    ((C2094z) abstractC2074f).f7020s = interfaceC1601c2;
                    return interfaceC1599a.mo6a();
                } finally {
                    c2094z2.f7019r = interfaceC1601c;
                    c2094z2.f7020s = interfaceC1601c2;
                }
            }
        }
        if (abstractC2074f == null || (abstractC2074f instanceof C2070b)) {
            c2094z = new C2094z(abstractC2074f instanceof C2070b ? (C2070b) abstractC2074f : null, c0056d0, null, true, false);
        } else {
            c2094z = abstractC2074f.mo3797u(c0056d0);
        }
        try {
            AbstractC2074f abstractC2074fM3813j = c2094z.m3813j();
            try {
                Object objMo6a = interfaceC1599a.mo6a();
                AbstractC2074f.m3811q(abstractC2074fM3813j);
                c2094z.mo3787c();
                return objMo6a;
            } catch (Throwable th) {
                AbstractC2074f.m3811q(abstractC2074fM3813j);
                throw th;
            }
        } catch (Throwable th2) {
            c2094z.mo3787c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m3859k(AbstractC2074f abstractC2074f, AbstractC2074f abstractC2074f2, InterfaceC1601c interfaceC1601c) {
        if (abstractC2074f != abstractC2074f2) {
            abstractC2074f2.getClass();
            AbstractC2074f.m3811q(abstractC2074f);
            abstractC2074f2.mo3787c();
        } else if (abstractC2074f instanceof C2094z) {
            ((C2094z) abstractC2074f).f7019r = interfaceC1601c;
        } else if (abstractC2074f instanceof C2068A) {
            ((C2068A) abstractC2074f).f6927h = interfaceC1601c;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC2074f).toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m3860l() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3817d();
}
