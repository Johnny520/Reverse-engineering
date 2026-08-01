package ga;

import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: ga.b */
/* JADX INFO: loaded from: classes2.dex */
public class C2572b implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public final C2619q1 f6843q;

    /* JADX INFO: renamed from: r */
    public final C2590h[] f6844r;

    public C2572b(C2619q1 c2619q1, C2590h[] c2590hArr) {
        this.f6843q = c2619q1;
        this.f6844r = c2590hArr;
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return AbstractC2578d.m9108e(this.f6843q, this.f6844r, ((Number) obj).intValue());
    }
}
