package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.writer.data.InterfaceC0196d;

/* JADX INFO: renamed from: j.l */
/* JADX INFO: loaded from: classes.dex */
final class C0161l {

    /* JADX INFO: renamed from: a */
    private int f501a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0196d f502b;

    /* JADX INFO: renamed from: a */
    static /* bridge */ /* synthetic */ int m370a(C0161l r0) {
        return r0.f501a;
    }

    /* JADX INFO: renamed from: b */
    static /* bridge */ /* synthetic */ InterfaceC0196d m371b(C0161l r0) {
        return r0.f502b;
    }

    /* JADX INFO: renamed from: c */
    public final void m372c(int r1, InterfaceC0196d r2) {
        this.f501a = r1;
        this.f502b = r2;
    }

    /* JADX INFO: renamed from: d */
    public final C0162m m373d() {
        return new C0162m(this.f501a, this.f502b);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0162m) == true) goto L7;
        return false;
    L7:
        return C0162m.m374b((C0162m) r3, this.f501a, this.f502b);
    }

    public final int hashCode() {
        return C0162m.m375e(this.f501a, this.f502b);
    }
}
