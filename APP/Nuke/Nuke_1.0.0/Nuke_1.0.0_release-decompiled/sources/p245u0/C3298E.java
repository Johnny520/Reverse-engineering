package p245u0;

import p095T.AbstractC1385s;
import p095T.C1366i0;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p204n0.C2686e;
import p211o0.C2753l;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: u0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C3298E extends AbstractC3296C {

    /* JADX INFO: renamed from: b */
    public final C3306c f10186b;

    /* JADX INFO: renamed from: c */
    public String f10187c;

    /* JADX INFO: renamed from: d */
    public boolean f10188d;

    /* JADX INFO: renamed from: e */
    public final C3304a f10189e;

    /* JADX INFO: renamed from: f */
    public AbstractC1666k f10190f;

    /* JADX INFO: renamed from: g */
    public final C1366i0 f10191g;

    /* JADX INFO: renamed from: h */
    public C2753l f10192h;

    /* JADX INFO: renamed from: i */
    public final C1366i0 f10193i;

    /* JADX INFO: renamed from: j */
    public long f10194j;

    /* JADX INFO: renamed from: k */
    public float f10195k;

    /* JADX INFO: renamed from: l */
    public float f10196l;

    /* JADX INFO: renamed from: m */
    public final C3297D f10197m;

    public C3298E(C3306c c3306c) {
        this.f10186b = c3306c;
        c3306c.f10243i = new C3297D(this, 0);
        this.f10187c = "";
        this.f10188d = true;
        this.f10189e = new C3304a();
        this.f10190f = C3310g.f10288g;
        this.f10191g = AbstractC1385s.m2629s(null);
        this.f10193i = AbstractC1385s.m2629s(new C2686e(0L));
        this.f10194j = 9205357640488583168L;
        this.f10195k = 1.0f;
        this.f10196l = 1.0f;
        this.f10197m = new C3297D(this, 1);
    }

    @Override // p245u0.AbstractC3296C
    /* JADX INFO: renamed from: a */
    public final void mo5565a(InterfaceC2903d interfaceC2903d) {
        m5569e(interfaceC2903d, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5569e(p222q0.InterfaceC2903d r32, float r33, p211o0.C2753l r34) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p245u0.C3298E.m5569e(q0.d, float, o0.l):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f10187c);
        sb.append("\n\tviewportWidth: ");
        C1366i0 c1366i0 = this.f10193i;
        sb.append(Float.intBitsToFloat((int) (((C2686e) c1366i0.getValue()).f8570a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C2686e) c1366i0.getValue()).f8570a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }
}
