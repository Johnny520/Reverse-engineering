package p303v;

import androidx.compose.foundation.lazy.layout.AbstractC0440z;
import androidx.compose.foundation.lazy.layout.C0407o0;
import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0498g2;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: v.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8708m0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0498g2 f28905a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0498g2 f28906b;

    /* JADX INFO: renamed from: c */
    public boolean f28907c;

    /* JADX INFO: renamed from: d */
    public Object f28908d;

    /* JADX INFO: renamed from: e */
    public final C0407o0 f28909e;

    public C8708m0(int i10, int i11) {
        this.f28905a = AbstractC0570q4.m2141a(i10);
        this.f28906b = AbstractC0570q4.m2141a(i11);
        this.f28909e = new C0407o0(i10, 30, 100);
    }

    /* JADX INFO: renamed from: a */
    public final int m33441a() {
        return this.f28905a.mo1686f();
    }

    /* JADX INFO: renamed from: b */
    public final C0407o0 m33442b() {
        return this.f28909e;
    }

    /* JADX INFO: renamed from: c */
    public final int m33443c() {
        return this.f28906b.mo1686f();
    }

    /* JADX INFO: renamed from: d */
    public final void m33444d(int i10, int i11) {
        m33447g(i10, i11);
        this.f28908d = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m33445e(int i10) {
        this.f28905a.mo1687j(i10);
    }

    /* JADX INFO: renamed from: f */
    public final void m33446f(int i10) {
        this.f28906b.mo1687j(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m33447g(int i10, int i11) {
        if (!(((float) i10) >= 0.0f)) {
            AbstractC6635e.m26318a("Index should be non-negative (" + i10 + ')');
        }
        m33445e(i10);
        this.f28909e.m1302k(i10);
        m33446f(i11);
    }

    /* JADX INFO: renamed from: h */
    public final void m33448h(C8692e0 c8692e0) {
        C8694f0 c8694f0M33403v = c8692e0.m33403v();
        this.f28908d = c8694f0M33403v != null ? c8694f0M33403v.getKey() : null;
        if (this.f28907c || c8692e0.mo33393i() > 0) {
            this.f28907c = true;
            int iM33404w = c8692e0.m33404w();
            if (!(((float) iM33404w) >= 0.0f)) {
                AbstractC6635e.m26320c("scrollOffset should be non-negative");
            }
            C8694f0 c8694f0M33403v2 = c8692e0.m33403v();
            m33447g(c8694f0M33403v2 != null ? c8694f0M33403v2.getIndex() : 0, iM33404w);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m33449i(int i10) {
        if (!(((float) i10) >= 0.0f)) {
            AbstractC6635e.m26320c("scrollOffset should be non-negative");
        }
        m33446f(i10);
    }

    /* JADX INFO: renamed from: j */
    public final int m33450j(InterfaceC8711o interfaceC8711o, int i10) {
        int iM1464a = AbstractC0440z.m1464a(interfaceC8711o, this.f28908d, i10);
        if (i10 != iM1464a) {
            m33445e(iM1464a);
            this.f28909e.m1302k(i10);
        }
        return iM1464a;
    }
}
