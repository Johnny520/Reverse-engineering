package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.writer.data.InterfaceC0196d;

/* JADX INFO: renamed from: j.l */
/* JADX INFO: loaded from: classes.dex */
final class C0161l {

    /* JADX INFO: renamed from: a */
    private int f501a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0196d f502b;

    /* JADX INFO: renamed from: c */
    public final void m372c(int i2, InterfaceC0196d interfaceC0196d) {
        this.f501a = i2;
        this.f502b = interfaceC0196d;
    }

    /* JADX INFO: renamed from: d */
    public final C0162m m373d() {
        return new C0162m(this.f501a, this.f502b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0162m) {
            return C0162m.m374b((C0162m) obj, this.f501a, this.f502b);
        }
        return false;
    }

    public final int hashCode() {
        return C0162m.m375e(this.f501a, this.f502b);
    }
}
