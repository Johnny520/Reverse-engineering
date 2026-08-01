package p244u;

import p029F0.InterfaceC0379Q;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p117X2.AbstractC1665j;
import p153e1.EnumC2017m;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: u.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3274i0 implements InterfaceC3276j0 {

    /* JADX INFO: renamed from: a */
    public final String f10115a;

    /* JADX INFO: renamed from: b */
    public final C1366i0 f10116b;

    public C3274i0(C3240I c3240i, String str) {
        this.f10115a = str;
        this.f10116b = AbstractC1385s.m2629s(c3240i);
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: a */
    public final int mo5494a(InterfaceC0379Q interfaceC0379Q, EnumC2017m enumC2017m) {
        return m5550e().f10035a;
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: b */
    public final int mo5495b(InterfaceC0379Q interfaceC0379Q) {
        return m5550e().f10036b;
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: c */
    public final int mo5496c(InterfaceC0379Q interfaceC0379Q) {
        return m5550e().f10038d;
    }

    @Override // p244u.InterfaceC3276j0
    /* JADX INFO: renamed from: d */
    public final int mo5497d(InterfaceC0379Q interfaceC0379Q, EnumC2017m enumC2017m) {
        return m5550e().f10037c;
    }

    /* JADX INFO: renamed from: e */
    public final C3240I m5550e() {
        return (C3240I) this.f10116b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3274i0) {
            return AbstractC1665j.m2981a(m5550e(), ((C3274i0) obj).m5550e());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m5551f(C3240I c3240i) {
        this.f10116b.setValue(c3240i);
    }

    public final int hashCode() {
        return this.f10115a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10115a);
        sb.append("(left=");
        sb.append(m5550e().f10035a);
        sb.append(", top=");
        sb.append(m5550e().f10036b);
        sb.append(", right=");
        sb.append(m5550e().f10037c);
        sb.append(", bottom=");
        return AbstractC3202a.m5466a(sb, m5550e().f10038d, ')');
    }
}
