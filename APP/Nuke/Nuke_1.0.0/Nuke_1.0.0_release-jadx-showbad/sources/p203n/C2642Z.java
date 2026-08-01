package p203n;

import p000A.C0010F;
import p095T.AbstractC1385s;
import p095T.C1330O0;
import p095T.C1357e;
import p095T.C1362g0;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.C1399z;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p158f0.AbstractC2082n;
import p158f0.C2085q;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: n.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C2642Z {

    /* JADX INFO: renamed from: a */
    public final C2620C f8401a;

    /* JADX INFO: renamed from: b */
    public final C2642Z f8402b;

    /* JADX INFO: renamed from: c */
    public final String f8403c;

    /* JADX INFO: renamed from: d */
    public final C1366i0 f8404d = AbstractC1385s.m2629s(m4593c());

    /* JADX INFO: renamed from: e */
    public final C1366i0 f8405e = AbstractC1385s.m2629s(new C2638V(m4593c(), m4593c()));

    /* JADX INFO: renamed from: f */
    public final C1362g0 f8406f = new C1362g0(0);

    /* JADX INFO: renamed from: g */
    public final C1362g0 f8407g = new C1362g0(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h */
    public final C1366i0 f8408h;

    /* JADX INFO: renamed from: i */
    public final C2085q f8409i;

    /* JADX INFO: renamed from: j */
    public final C2085q f8410j;

    /* JADX INFO: renamed from: k */
    public final C1366i0 f8411k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2642Z(C2620C c2620c, C2642Z c2642z, String str) {
        this.f8401a = c2620c;
        this.f8402b = c2642z;
        this.f8403c = str;
        Boolean bool = Boolean.FALSE;
        this.f8408h = AbstractC1385s.m2629s(bool);
        this.f8409i = new C2085q();
        this.f8410j = new C2085q();
        this.f8411k = AbstractC1385s.m2629s(bool);
        AbstractC1385s.m2624n(new C2634Q(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4591a(Object obj, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1493585151);
        if ((i5 & 6) == 0) {
            i6 = ((i5 & 8) == 0 ? c1383r.m2582f(obj) : c1383r.m2586h(obj) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(this) ? 32 : 16;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            if (m4597g()) {
                c1383r.m2568W(416369985);
            } else {
                c1383r.m2568W(466062241);
                m4601k(obj);
                int i7 = i6 & 112;
                boolean z5 = i7 == 32;
                Object objM2558L = c1383r.m2558L();
                C1357e c1357e = C1371l.f4833a;
                if (z5 || objM2558L == c1357e) {
                    objM2558L = AbstractC1385s.m2624n(new C2634Q(this, 0));
                    c1383r.m2585g0(objM2558L);
                }
                if (((Boolean) ((InterfaceC1339T0) objM2558L).getValue()).booleanValue()) {
                    c1383r.m2568W(466470356);
                    Object objM2558L2 = c1383r.m2558L();
                    if (objM2558L2 == c1357e) {
                        objM2558L2 = AbstractC1385s.m2622l(c1383r);
                        c1383r.m2585g0(objM2558L2);
                    }
                    InterfaceC2160t interfaceC2160t = (InterfaceC2160t) objM2558L2;
                    boolean zM2586h = c1383r.m2586h(interfaceC2160t) | (i7 == 32);
                    Object objM2558L3 = c1383r.m2558L();
                    if (zM2586h || objM2558L3 == c1357e) {
                        objM2558L3 = new C0010F(11, interfaceC2160t, this);
                        c1383r.m2585g0(objM2558L3);
                    }
                    AbstractC1385s.m2614d(interfaceC2160t, this, (InterfaceC1601c) objM2558L3, c1383r);
                } else {
                    c1383r.m2568W(416369985);
                }
                c1383r.m2597p(false);
            }
            c1383r.m2597p(false);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C1399z(i5, 4, this, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m4592b() {
        C2085q c2085q = this.f8409i;
        int size = c2085q.size();
        long jMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C1362g0 c1362g0 = ((C2639W) c2085q.get(i5)).f8395m;
            jMax = Math.max(jMax, ((C1330O0) AbstractC2082n.m3844t(c1362g0.f4803e, c1362g0)).f4757c);
        }
        C2085q c2085q2 = this.f8410j;
        int size2 = c2085q2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            jMax = Math.max(jMax, ((C2642Z) c2085q2.get(i6)).m4592b());
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m4593c() {
        return this.f8401a.f8329b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m4594d() {
        C2085q c2085q = this.f8409i;
        int size = c2085q.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((C2639W) c2085q.get(i5)).getClass();
        }
        C2085q c2085q2 = this.f8410j;
        int size2 = c2085q2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (((C2642Z) c2085q2.get(i6)).m4594d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m4595e() {
        C2642Z c2642z = this.f8402b;
        if (c2642z != null) {
            return c2642z.m4595e();
        }
        C1362g0 c1362g0 = this.f8406f;
        return ((C1330O0) AbstractC2082n.m3844t(c1362g0.f4803e, c1362g0)).f4757c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final InterfaceC2637U m4596f() {
        return (InterfaceC2637U) this.f8405e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4597g() {
        return ((Boolean) this.f8411k.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4598h(long j5, boolean z5) {
        C2620C c2620c = this.f8401a;
        C1366i0 c1366i0 = c2620c.f8328a;
        C1362g0 c1362g0 = this.f8407g;
        if (((C1330O0) AbstractC2082n.m3844t(c1362g0.f4803e, c1362g0)).f4757c == Long.MIN_VALUE) {
            c1362g0.m2511g(j5);
            c2620c.f8328a.setValue(Boolean.TRUE);
        } else if (!((Boolean) c1366i0.getValue()).booleanValue()) {
            c1366i0.setValue(Boolean.TRUE);
        }
        this.f8408h.setValue(Boolean.FALSE);
        C2085q c2085q = this.f8409i;
        int size = c2085q.size();
        boolean z6 = true;
        for (int i5 = 0; i5 < size; i5++) {
            C2639W c2639w = (C2639W) c2085q.get(i5);
            C1366i0 c1366i02 = c2639w.f8390h;
            C1366i0 c1366i03 = c2639w.f8390h;
            if (!((Boolean) c1366i02.getValue()).booleanValue()) {
                long jMo4579c = z5 ? c2639w.m4586a().mo4579c() : j5;
                c2639w.f8393k.setValue(c2639w.m4586a().mo4578b(jMo4579c));
                c2639w.f8394l = c2639w.m4586a().mo4582f(jMo4579c);
                if (c2639w.m4586a().m4623g(jMo4579c)) {
                    c1366i03.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c1366i03.getValue()).booleanValue()) {
                z6 = false;
            }
        }
        C2085q c2085q2 = this.f8410j;
        int size2 = c2085q2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C2642Z c2642z = (C2642Z) c2085q2.get(i6);
            if (!AbstractC1665j.m2981a(c2642z.f8404d.getValue(), c2642z.m4593c())) {
                c2642z.m4598h(j5, z5);
            }
            if (!AbstractC1665j.m2981a(c2642z.f8404d.getValue(), c2642z.m4593c())) {
                z6 = false;
            }
        }
        if (z6) {
            m4599i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4599i() {
        this.f8407g.m2511g(Long.MIN_VALUE);
        Object value = this.f8404d.getValue();
        C2620C c2620c = this.f8401a;
        c2620c.f8329b.setValue(value);
        if (this.f8402b == null) {
            this.f8406f.m2511g(0L);
        }
        c2620c.f8328a.setValue(Boolean.FALSE);
        C2085q c2085q = this.f8410j;
        int size = c2085q.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((C2642Z) c2085q.get(i5)).m4599i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4600j(Object obj, Object obj2) {
        this.f8407g.m2511g(Long.MIN_VALUE);
        C2620C c2620c = this.f8401a;
        c2620c.f8328a.setValue(Boolean.FALSE);
        boolean zM4597g = m4597g();
        C1366i0 c1366i0 = this.f8404d;
        if (!zM4597g || !AbstractC1665j.m2981a(m4593c(), obj) || !AbstractC1665j.m2981a(c1366i0.getValue(), obj2)) {
            if (!AbstractC1665j.m2981a(m4593c(), obj)) {
                c2620c.f8329b.setValue(obj);
            }
            c1366i0.setValue(obj2);
            this.f8411k.setValue(Boolean.TRUE);
            this.f8405e.setValue(new C2638V(obj, obj2));
        }
        C2085q c2085q = this.f8410j;
        int size = c2085q.size();
        for (int i5 = 0; i5 < size; i5++) {
            C2642Z c2642z = (C2642Z) c2085q.get(i5);
            AbstractC1665j.m2983c(c2642z, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (c2642z.m4597g()) {
                c2642z.m4600j(c2642z.m4593c(), c2642z.f8404d.getValue());
            }
        }
        C2085q c2085q2 = this.f8409i;
        int size2 = c2085q2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ((C2639W) c2085q2.get(i6)).m4588c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4601k(Object obj) {
        C1366i0 c1366i0 = this.f8404d;
        if (AbstractC1665j.m2981a(c1366i0.getValue(), obj)) {
            return;
        }
        this.f8405e.setValue(new C2638V(c1366i0.getValue(), obj));
        if (!AbstractC1665j.m2981a(m4593c(), c1366i0.getValue())) {
            this.f8401a.f8329b.setValue(c1366i0.getValue());
        }
        c1366i0.setValue(obj);
        C1362g0 c1362g0 = this.f8407g;
        if (((C1330O0) AbstractC2082n.m3844t(c1362g0.f4803e, c1362g0)).f4757c == Long.MIN_VALUE) {
            this.f8408h.setValue(Boolean.TRUE);
        }
        C2085q c2085q = this.f8409i;
        int size = c2085q.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((C2639W) c2085q.get(i5)).f8391i.m2508h(-2.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C2085q c2085q = this.f8409i;
        int size = c2085q.size();
        String str = "Transition animation values: ";
        for (int i5 = 0; i5 < size; i5++) {
            str = str + ((C2639W) c2085q.get(i5)) + ", ";
        }
        return str;
    }
}
