package p316w;

import androidx.compose.foundation.lazy.layout.AbstractC0440z;
import androidx.compose.foundation.lazy.layout.C0407o0;
import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0498g2;
import p185m8.AbstractC5106t;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: w.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8977s0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0498g2 f29762a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0498g2 f29763b;

    /* JADX INFO: renamed from: c */
    public boolean f29764c;

    /* JADX INFO: renamed from: d */
    public Object f29765d;

    /* JADX INFO: renamed from: e */
    public final C0407o0 f29766e;

    public C8977s0(int i10, int i11) {
        this.f29762a = AbstractC0570q4.m2141a(i10);
        this.f29763b = AbstractC0570q4.m2141a(i11);
        this.f29766e = new C0407o0(i10, 90, 200);
    }

    /* JADX INFO: renamed from: a */
    public final int m34444a() {
        return this.f29762a.mo1686f();
    }

    /* JADX INFO: renamed from: b */
    public final C0407o0 m34445b() {
        return this.f29766e;
    }

    /* JADX INFO: renamed from: c */
    public final int m34446c() {
        return this.f29763b.mo1686f();
    }

    /* JADX INFO: renamed from: d */
    public final void m34447d(int i10, int i11) {
        m34450g(i10, i11);
        this.f29765d = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m34448e(int i10) {
        this.f29762a.mo1687j(i10);
    }

    /* JADX INFO: renamed from: f */
    public final void m34449f(int i10) {
        this.f29763b.mo1687j(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m34450g(int i10, int i11) {
        if (!(((float) i10) >= 0.0f)) {
            AbstractC6635e.m26318a("Index should be non-negative");
        }
        m34448e(i10);
        this.f29766e.m1302k(i10);
        m34449f(i11);
    }

    /* JADX INFO: renamed from: h */
    public final void m34451h(C8956i0 c8956i0) {
        C8959j0[] c8959j0ArrM34422b;
        C8959j0 c8959j0;
        C8959j0[] c8959j0ArrM34422b2;
        C8959j0 c8959j02;
        C8963l0 c8963l0M34393u = c8956i0.m34393u();
        this.f29765d = (c8963l0M34393u == null || (c8959j0ArrM34422b2 = c8963l0M34393u.m34422b()) == null || (c8959j02 = (C8959j0) AbstractC5106t.m20720Z(c8959j0ArrM34422b2)) == null) ? null : c8959j02.getKey();
        if (this.f29764c || c8956i0.mo34312i() > 0) {
            this.f29764c = true;
            int iM34394v = c8956i0.m34394v();
            int index = 0;
            if (!(((float) iM34394v) >= 0.0f)) {
                AbstractC6635e.m26320c("scrollOffset should be non-negative (" + iM34394v + ')');
            }
            C8963l0 c8963l0M34393u2 = c8956i0.m34393u();
            if (c8963l0M34393u2 != null && (c8959j0ArrM34422b = c8963l0M34393u2.m34422b()) != null && (c8959j0 = (C8959j0) AbstractC5106t.m20720Z(c8959j0ArrM34422b)) != null) {
                index = c8959j0.getIndex();
            }
            m34450g(index, iM34394v);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m34452i(int i10) {
        if (!(((float) i10) >= 0.0f)) {
            AbstractC6635e.m26320c("scrollOffset should be non-negative");
        }
        m34449f(i10);
    }

    /* JADX INFO: renamed from: j */
    public final int m34453j(InterfaceC8966n interfaceC8966n, int i10) {
        int iM1464a = AbstractC0440z.m1464a(interfaceC8966n, this.f29765d, i10);
        if (i10 != iM1464a) {
            m34448e(iM1464a);
            this.f29766e.m1302k(i10);
        }
        return iM1464a;
    }
}
