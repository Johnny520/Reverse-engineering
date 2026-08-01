package p230r2;

import java.io.IOException;
import p042H1.AbstractC0636d;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p213o2.EnumC2797z;
import p237s4.AbstractC3202a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3140p extends AbstractC2770B {

    /* JADX INFO: renamed from: b */
    public static final C3139o f9883b = new C3139o(0, new C3140p(EnumC2797z.f8821e));

    /* JADX INFO: renamed from: a */
    public final EnumC2797z f9884a;

    public C3140p(EnumC2797z enumC2797z) {
        this.f9884a = enumC2797z;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        int iM5630J = c3390a.m5630J();
        int iM1088a = AbstractC0636d.m1088a(iM5630J);
        if (iM1088a == 5 || iM1088a == 6) {
            return this.f9884a.mo4984a(c3390a);
        }
        if (iM1088a == 8) {
            c3390a.m5626F();
            return null;
        }
        throw new C2789r("Expecting number, got: " + AbstractC3202a.m5469d(iM5630J) + "; at path " + c3390a.m5646m(false));
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        c3391b.m5654D((Number) obj);
    }
}
