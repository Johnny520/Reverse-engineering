package p027E4;

/* JADX INFO: renamed from: E4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0322i implements InterfaceC0321h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1042d;

    /* JADX INFO: renamed from: e */
    public final C0324k f1043e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0322i(C0324k c0324k, int i5) {
        this.f1042d = i5;
        this.f1043e = c0324k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.InterfaceC0321h
    /* JADX INFO: renamed from: a */
    public final void mo32a(InterfaceC0318e interfaceC0318e, C0306U c0306u) {
        switch (this.f1042d) {
            case 0:
                boolean z5 = c0306u.f1017a.f5753s;
                C0324k c0324k = this.f1043e;
                if (!z5) {
                    c0324k.completeExceptionally(new C0330q(c0306u));
                } else {
                    c0324k.complete(c0306u.f1018b);
                }
                break;
            default:
                this.f1043e.complete(c0306u);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.InterfaceC0321h
    /* JADX INFO: renamed from: m */
    public final void mo44m(InterfaceC0318e interfaceC0318e, Throwable th) {
        switch (this.f1042d) {
            case 0:
                this.f1043e.completeExceptionally(th);
                break;
            default:
                this.f1043e.completeExceptionally(th);
                break;
        }
    }
}
