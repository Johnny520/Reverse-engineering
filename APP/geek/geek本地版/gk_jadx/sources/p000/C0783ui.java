package p000;

/* JADX INFO: renamed from: ui */
/* JADX INFO: loaded from: classes.dex */
public final class C0783ui implements InterfaceC0826vo {

    /* JADX INFO: renamed from: a */
    public final boolean f4730a;

    public C0783ui(boolean z) {
        this.f4730a = z;
    }

    @Override // p000.InterfaceC0826vo
    /* JADX INFO: renamed from: a */
    public final boolean mo1875a() {
        return this.f4730a;
    }

    @Override // p000.InterfaceC0826vo
    /* JADX INFO: renamed from: d */
    public final C0500mw mo1876d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f4730a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
