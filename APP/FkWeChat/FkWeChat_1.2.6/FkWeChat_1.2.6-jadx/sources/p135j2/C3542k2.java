package p135j2;

/* JADX INFO: renamed from: j2.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3542k2 implements InterfaceC3538j2 {

    /* JADX INFO: renamed from: b */
    public final String f9857b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3553n1 f9858c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3553n1 f9859d;

    public C3542k2(String str) {
        this.f9857b = str;
        this.f9858c = AbstractC3559p1.m13330a(str);
        this.f9859d = AbstractC3559p1.m13330a(str + " maximum");
    }

    @Override // p135j2.InterfaceC3538j2
    /* JADX INFO: renamed from: a */
    public InterfaceC3553n1 mo13223a() {
        return this.f9858c;
    }

    @Override // p135j2.InterfaceC3538j2
    /* JADX INFO: renamed from: b */
    public InterfaceC3553n1 mo13224b() {
        return this.f9859d;
    }

    public String toString() {
        return this.f9857b;
    }
}
