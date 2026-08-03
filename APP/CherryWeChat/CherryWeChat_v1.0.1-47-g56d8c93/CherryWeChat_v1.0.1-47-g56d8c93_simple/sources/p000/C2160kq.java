package p000;

/* JADX INFO: renamed from: kq */
/* JADX INFO: loaded from: classes.dex */
public final class C2160kq implements InterfaceC0421Jr {

    /* JADX INFO: renamed from: a */
    public InterfaceC0421Jr[] f7538a;

    @Override // p000.InterfaceC0421Jr
    /* JADX INFO: renamed from: a */
    public final C1236bv mo879a(Class r6) {
        InterfaceC0421Jr[] r0 = this.f7538a;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        InterfaceC0421Jr r3 = r0[r2];
        if (r3.mo880b(r6) == true) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return r3.mo879a(r6);
    L10:
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(r6.getName()));
    }

    @Override // p000.InterfaceC0421Jr
    /* JADX INFO: renamed from: b */
    public final boolean mo880b(Class r6) {
        InterfaceC0421Jr[] r0 = this.f7538a;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (r0[r3].mo880b(r6) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }
}
