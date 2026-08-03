package p322w0;

import ca.C0524k;
import gg.AbstractC1416l;
import okio.C3193a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p202o0.AbstractC3031c;
import p202o0.C3034f;
import p266s0.AbstractC3879i;

/* JADX INFO: renamed from: w0.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4666q {

    /* JADX INFO: renamed from: a */
    public static final Object f15522a = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m9145a(int i9, int i10) {
        if (i9 < 0 || i9 >= i10) {
            throw new IndexOutOfBoundsException("index (" + i9 + ") is out of bound of [0, " + i10 + ')');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m9146b(C4669t c4669t, int i9, AbstractC3031c abstractC3031c, boolean z9) {
        boolean z10;
        synchronized (f15522a) {
            try {
                int i10 = c4669t.f15547d;
                if (i10 == i9) {
                    c4669t.f15546c = abstractC3031c;
                    z10 = true;
                    if (z9) {
                        c4669t.f15548e++;
                    }
                    c4669t.f15547d = i10 + 1;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m9147c(long j3, long[] jArr) {
        int length = jArr.length - 1;
        int i9 = 0;
        while (i9 <= length) {
            int i10 = (i9 + length) >>> 1;
            long j4 = jArr[i10];
            if (j3 > j4) {
                i9 = i10 + 1;
            } else {
                if (j3 >= j4) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static AbstractC4655f m9148e() {
        return (AbstractC4655f) AbstractC4662m.f15511b.m818o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final C4669t m9149f(C4665p c4665p) {
        C4669t c4669t = c4665p.f15521g;
        c4669t.getClass();
        return (C4669t) AbstractC4662m.m9139t(c4669t, c4665p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m9150g(C4665p c4665p) {
        C4669t c4669t = c4665p.f15521g;
        c4669t.getClass();
        return ((C4669t) AbstractC4662m.m9127h(c4669t)).f15548e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static AbstractC4655f m9151h(AbstractC4655f abstractC4655f) {
        if (abstractC4655f instanceof C4674y) {
            C4674y c4674y = (C4674y) abstractC4655f;
            if (c4674y.f15561t == AbstractC3879i.m8069c()) {
                c4674y.f15559r = null;
                return abstractC4655f;
            }
        }
        if (abstractC4655f instanceof C4675z) {
            C4675z c4675z = (C4675z) abstractC4655f;
            if (c4675z.f15566i == AbstractC3879i.m8069c()) {
                c4675z.f15565h = null;
                return abstractC4655f;
            }
        }
        AbstractC4655f abstractC4655fM9126g = AbstractC4662m.m9126g(abstractC4655f, null, false);
        abstractC4655fM9126g.m9110j();
        return abstractC4655fM9126g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m9152i(C4665p c4665p, InterfaceC1231l interfaceC1231l) {
        int i9;
        AbstractC3031c abstractC3031c;
        Object objInvoke;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        do {
            synchronized (f15522a) {
                C4669t c4669t = c4665p.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i9 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            C3034f c3034fMo6437e = abstractC3031c.mo6437e();
            objInvoke = interfaceC1231l.invoke(c3034fMo6437e);
            AbstractC3031c abstractC3031cM6459d = c3034fMo6437e.m6459d();
            if (AbstractC1416l.m3825a(abstractC3031cM6459d, abstractC3031c)) {
                break;
            }
            C4669t c4669t3 = c4665p.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, c4665p, abstractC4655fM9129j), i9, abstractC3031cM6459d, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, c4665p);
        } while (!zM9146b);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Object m9153j(C0524k c0524k, InterfaceC1220a interfaceC1220a) {
        AbstractC4655f c4674y;
        AbstractC4655f abstractC4655f = (AbstractC4655f) AbstractC4662m.f15511b.m818o();
        if (abstractC4655f instanceof C4674y) {
            C4674y c4674y2 = (C4674y) abstractC4655f;
            if (c4674y2.f15561t == AbstractC3879i.m8069c()) {
                InterfaceC1231l interfaceC1231l = c4674y2.f15559r;
                InterfaceC1231l interfaceC1231l2 = c4674y2.f15560s;
                try {
                    ((C4674y) abstractC4655f).f15559r = AbstractC4662m.m9130k(c0524k, interfaceC1231l, true);
                    ((C4674y) abstractC4655f).f15560s = interfaceC1231l2;
                    return interfaceC1220a.invoke();
                } finally {
                    c4674y2.f15559r = interfaceC1231l;
                    c4674y2.f15560s = interfaceC1231l2;
                }
            }
        }
        if (abstractC4655f == null || (abstractC4655f instanceof C4651b)) {
            c4674y = new C4674y(abstractC4655f instanceof C4651b ? (C4651b) abstractC4655f : null, c0524k, null, true, false);
        } else {
            c4674y = abstractC4655f.mo9090u(c0524k);
        }
        try {
            AbstractC4655f abstractC4655fM9110j = c4674y.m9110j();
            try {
                Object objInvoke = interfaceC1220a.invoke();
                AbstractC4655f.m9106q(abstractC4655fM9110j);
                c4674y.mo9086c();
                return objInvoke;
            } catch (Throwable th2) {
                AbstractC4655f.m9106q(abstractC4655fM9110j);
                throw th2;
            }
        } catch (Throwable th3) {
            c4674y.mo9086c();
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m9154k(AbstractC4655f abstractC4655f, AbstractC4655f abstractC4655f2, InterfaceC1231l interfaceC1231l) {
        if (abstractC4655f != abstractC4655f2) {
            abstractC4655f2.getClass();
            AbstractC4655f.m9106q(abstractC4655f);
            abstractC4655f2.mo9086c();
        } else if (abstractC4655f instanceof C4674y) {
            ((C4674y) abstractC4655f).f15559r = interfaceC1231l;
        } else if (abstractC4655f instanceof C4675z) {
            ((C4675z) abstractC4655f).f15565h = interfaceC1231l;
        } else {
            C3193a.m6826p(abstractC4655f, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final void m9155l() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo9114d();
}
