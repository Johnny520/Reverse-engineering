package p000;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: renamed from: kg */
/* JADX INFO: loaded from: classes.dex */
public final class C2146kg implements InterfaceC0802Sm {

    /* JADX INFO: renamed from: b */
    public final Object f7502b;

    /* JADX INFO: renamed from: c */
    public final int f7503c;

    /* JADX INFO: renamed from: d */
    public final int f7504d;

    /* JADX INFO: renamed from: e */
    public final Class f7505e;

    /* JADX INFO: renamed from: f */
    public final Class f7506f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0802Sm f7507g;

    /* JADX INFO: renamed from: h */
    public final Map f7508h;

    /* JADX INFO: renamed from: i */
    public final C2644vt f7509i;

    /* JADX INFO: renamed from: j */
    public int f7510j;

    public C2146kg(Object r2, InterfaceC0802Sm r3, int r4, int r5, Map r6, Class r7, Class r8, C2644vt r9) {
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        this.f7502b = r2;
        this.f7507g = r3;
        this.f7503c = r4;
        this.f7504d = r5;
        AbstractC0714Qj.m1488j("Argument must not be null", r6);
        this.f7508h = r6;
        AbstractC0714Qj.m1488j("Resource class must not be null", r7);
        this.f7505e = r7;
        AbstractC0714Qj.m1488j("Transcode class must not be null", r8);
        this.f7506f = r8;
        AbstractC0714Qj.m1488j("Argument must not be null", r9);
        this.f7509i = r9;
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r1) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r4) {
        if ((r4 instanceof C2146kg) == false) goto L22;
        C2146kg r42 = (C2146kg) r4;
        if (this.f7502b.equals(r42.f7502b) == false) goto L22;
        if (this.f7507g.equals(r42.f7507g) == false) goto L22;
        if (this.f7504d != r42.f7504d) goto L22;
        if (this.f7503c != r42.f7503c) goto L22;
        if (this.f7508h.equals(r42.f7508h) == false) goto L22;
        if (this.f7505e.equals(r42.f7505e) == false) goto L22;
        if (this.f7506f.equals(r42.f7506f) == false) goto L22;
        if (this.f7509i.equals(r42.f7509i) == false) goto L22;
        return true;
    L22:
        return false;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        if (this.f7510j != 0) goto L6;
        int r0 = this.f7502b.hashCode();
        this.f7510j = r0;
        int r1 = this.f7507g.hashCode();
        int r12 = ((((r1 + (r0 * 31)) * 31) + this.f7503c) * 31) + this.f7504d;
        this.f7510j = r12;
        int r02 = this.f7508h.hashCode();
        int r03 = r02 + (r12 * 31);
        this.f7510j = r03;
        int r13 = this.f7505e.hashCode();
        int r14 = r13 + (r03 * 31);
        this.f7510j = r14;
        int r04 = this.f7506f.hashCode();
        int r05 = r04 + (r14 * 31);
        this.f7510j = r05;
        int r15 = this.f7509i.f9156b.hashCode();
        this.f7510j = r15 + (r05 * 31);
    L6:
        return this.f7510j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f7502b + ", width=" + this.f7503c + ", height=" + this.f7504d + ", resourceClass=" + this.f7505e + ", transcodeClass=" + this.f7506f + ", signature=" + this.f7507g + ", hashCode=" + this.f7510j + ", transformations=" + this.f7508h + ", options=" + this.f7509i + '}';
    }
}
