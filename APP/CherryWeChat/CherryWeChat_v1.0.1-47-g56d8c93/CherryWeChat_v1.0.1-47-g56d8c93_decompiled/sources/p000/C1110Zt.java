package p000;

/* JADX INFO: renamed from: Zt */
/* JADX INFO: loaded from: classes.dex */
public final class C1110Zt extends C1067Yt {

    /* JADX INFO: renamed from: c */
    public final Object f3506c;

    public C1110Zt(int i) {
        super(i);
        this.f3506c = new Object();
    }

    @Override // p000.C1067Yt, p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: a */
    public final boolean mo1934a(Object obj) {
        boolean zMo1934a;
        synchronized (this.f3506c) {
            zMo1934a = super.mo1934a(obj);
        }
        return zMo1934a;
    }

    @Override // p000.C1067Yt, p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: c */
    public final Object mo1935c() {
        Object objMo1935c;
        synchronized (this.f3506c) {
            objMo1935c = super.mo1935c();
        }
        return objMo1935c;
    }
}
