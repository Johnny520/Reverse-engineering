package p018b3;

import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p319w2.C9058e;

/* JADX INFO: renamed from: b3.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0970p0 implements InterfaceC0955i {

    /* JADX INFO: renamed from: a */
    public final C9058e f2972a;

    /* JADX INFO: renamed from: b */
    public final int f2973b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0970p0(String str, int i10) {
        this(new C9058e(str, null, 2, 0 == true ? 1 : 0), i10);
    }

    @Override // p018b3.InterfaceC0955i
    /* JADX INFO: renamed from: a */
    public void mo3444a(C0963m c0963m) {
        if (c0963m.m3507l()) {
            int iM3501f = c0963m.m3501f();
            c0963m.m3508m(c0963m.m3501f(), c0963m.m3500e(), m3538c());
            if (m3538c().length() > 0) {
                c0963m.m3509n(iM3501f, m3538c().length() + iM3501f);
            }
        } else {
            int iM3506k = c0963m.m3506k();
            c0963m.m3508m(c0963m.m3506k(), c0963m.m3505j(), m3538c());
            if (m3538c().length() > 0) {
                c0963m.m3509n(iM3506k, m3538c().length() + iM3506k);
            }
        }
        int iM3502g = c0963m.m3502g();
        int i10 = this.f2973b;
        c0963m.m3510o(AbstractC2368o.m8586m(i10 > 0 ? (iM3502g + i10) - 1 : (iM3502g + i10) - m3538c().length(), 0, c0963m.m3503h()));
    }

    /* JADX INFO: renamed from: b */
    public final int m3537b() {
        return this.f2973b;
    }

    /* JADX INFO: renamed from: c */
    public final String m3538c() {
        return this.f2972a.m35156k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0970p0)) {
            return false;
        }
        C0970p0 c0970p0 = (C0970p0) obj;
        return AbstractC1061t.m3842c(m3538c(), c0970p0.m3538c()) && this.f2973b == c0970p0.f2973b;
    }

    public int hashCode() {
        return (m3538c().hashCode() * 31) + this.f2973b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + m3538c() + "', newCursorPosition=" + this.f2973b + ')';
    }

    public C0970p0(C9058e c9058e, int i10) {
        this.f2972a = c9058e;
        this.f2973b = i10;
    }
}
