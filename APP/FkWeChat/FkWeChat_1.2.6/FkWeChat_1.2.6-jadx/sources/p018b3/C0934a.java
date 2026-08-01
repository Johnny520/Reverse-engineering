package p018b3;

import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p319w2.C9058e;

/* JADX INFO: renamed from: b3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0934a implements InterfaceC0955i {

    /* JADX INFO: renamed from: a */
    public final C9058e f2900a;

    /* JADX INFO: renamed from: b */
    public final int f2901b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0934a(String str, int i10) {
        this(new C9058e(str, null, 2, 0 == true ? 1 : 0), i10);
    }

    @Override // p018b3.InterfaceC0955i
    /* JADX INFO: renamed from: a */
    public void mo3444a(C0963m c0963m) {
        if (c0963m.m3507l()) {
            c0963m.m3508m(c0963m.m3501f(), c0963m.m3500e(), m3446c());
        } else {
            c0963m.m3508m(c0963m.m3506k(), c0963m.m3505j(), m3446c());
        }
        int iM3502g = c0963m.m3502g();
        int i10 = this.f2901b;
        c0963m.m3510o(AbstractC2368o.m8586m(i10 > 0 ? (iM3502g + i10) - 1 : (iM3502g + i10) - m3446c().length(), 0, c0963m.m3503h()));
    }

    /* JADX INFO: renamed from: b */
    public final int m3445b() {
        return this.f2901b;
    }

    /* JADX INFO: renamed from: c */
    public final String m3446c() {
        return this.f2900a.m35156k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0934a)) {
            return false;
        }
        C0934a c0934a = (C0934a) obj;
        return AbstractC1061t.m3842c(m3446c(), c0934a.m3446c()) && this.f2901b == c0934a.f2901b;
    }

    public int hashCode() {
        return (m3446c().hashCode() * 31) + this.f2901b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + m3446c() + "', newCursorPosition=" + this.f2901b + ')';
    }

    public C0934a(C9058e c9058e, int i10) {
        this.f2900a = c9058e;
        this.f2901b = i10;
    }
}
