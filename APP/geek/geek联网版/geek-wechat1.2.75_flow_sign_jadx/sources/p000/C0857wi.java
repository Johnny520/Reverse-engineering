package p000;

/* JADX INFO: renamed from: wi */
/* JADX INFO: loaded from: classes.dex */
public final class C0857wi implements InterfaceC0974zo {

    /* JADX INFO: renamed from: a */
    public final boolean f5099a;

    public C0857wi(boolean z) {
        this.f5099a = z;
    }

    @Override // p000.InterfaceC0974zo
    /* JADX INFO: renamed from: a */
    public final boolean mo2497a() {
        return this.f5099a;
    }

    @Override // p000.InterfaceC0974zo
    /* JADX INFO: renamed from: d */
    public final C0796uw mo2498d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f5099a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
