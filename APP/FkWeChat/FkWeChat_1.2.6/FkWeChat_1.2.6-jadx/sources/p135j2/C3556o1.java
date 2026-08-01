package p135j2;

/* JADX INFO: renamed from: j2.o1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3556o1 implements InterfaceC3553n1 {

    /* JADX INFO: renamed from: b */
    public final String f9893b;

    /* JADX INFO: renamed from: c */
    public C3530h2 f9894c = new C3530h2();

    /* JADX INFO: renamed from: d */
    public C3551n f9895d = new C3551n();

    /* JADX INFO: renamed from: e */
    public C3530h2 f9896e = new C3530h2();

    /* JADX INFO: renamed from: f */
    public C3551n f9897f = new C3551n();

    public C3556o1(String str) {
        this.f9893b = str;
    }

    @Override // p135j2.InterfaceC3553n1
    /* JADX INFO: renamed from: a */
    public C3530h2 mo13323a() {
        return this.f9894c;
    }

    @Override // p135j2.InterfaceC3553n1
    /* JADX INFO: renamed from: b */
    public C3530h2 mo13324b() {
        return this.f9896e;
    }

    @Override // p135j2.InterfaceC3553n1
    /* JADX INFO: renamed from: c */
    public C3551n mo13325c() {
        return this.f9897f;
    }

    @Override // p135j2.InterfaceC3553n1
    /* JADX INFO: renamed from: d */
    public C3551n mo13326d() {
        return this.f9895d;
    }

    public String toString() {
        if (this.f9893b == null) {
            return super.toString();
        }
        return "RectRulers(" + this.f9893b + ')';
    }
}
