package p244u;

import p029F0.InterfaceC0379Q;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p153e1.EnumC2017m;
import p205n1.C2688b;
import p229r1.C3070c0;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3257a implements InterfaceC3276j0 {

    /* JADX INFO: renamed from: a */
    public final int f10074a;

    /* JADX INFO: renamed from: b */
    public final String f10075b;

    /* JADX INFO: renamed from: c */
    public final C1366i0 f10076c = AbstractC1385s.m2629s(C2688b.f8571e);

    /* JADX INFO: renamed from: d */
    public final C1366i0 f10077d = AbstractC1385s.m2629s(Boolean.TRUE);

    public C3257a(String str, int i5) {
        this.f10074a = i5;
        this.f10075b = str;
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: a */
    public final int mo5494a(InterfaceC0379Q interfaceC0379Q, EnumC2017m enumC2017m) {
        return m5505e().f8572a;
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: b */
    public final int mo5495b(InterfaceC0379Q interfaceC0379Q) {
        return m5505e().f8573b;
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: c */
    public final int mo5496c(InterfaceC0379Q interfaceC0379Q) {
        return m5505e().f8575d;
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: d */
    public final int mo5497d(InterfaceC0379Q interfaceC0379Q, EnumC2017m enumC2017m) {
        return m5505e().f8574c;
    }

    /* JADX INFO: renamed from: e */
    public final C2688b m5505e() {
        return (C2688b) this.f10076c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3257a) {
            return this.f10074a == ((C3257a) obj).f10074a;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m5506f(boolean z5) {
        this.f10077d.setValue(Boolean.valueOf(z5));
    }

    /* JADX INFO: renamed from: g */
    public final void m5507g(C3070c0 c3070c0, int i5) {
        int i6 = this.f10074a;
        if (i5 == 0 || (i5 & i6) != 0) {
            this.f10076c.setValue(c3070c0.f9782a.mo5367i(i6));
            m5506f(c3070c0.f9782a.mo5374u(i6));
        }
    }

    public final int hashCode() {
        return this.f10074a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10075b);
        sb.append('(');
        sb.append(m5505e().f8572a);
        sb.append(", ");
        sb.append(m5505e().f8573b);
        sb.append(", ");
        sb.append(m5505e().f8574c);
        sb.append(", ");
        return AbstractC3202a.m5466a(sb, m5505e().f8575d, ')');
    }
}
