package p000;

/* JADX INFO: renamed from: tx */
/* JADX INFO: loaded from: classes.dex */
public final class C0761tx extends C0724sx {

    /* JADX INFO: renamed from: d */
    public final Object f4627d;

    public C0761tx() {
        super(12);
        this.f4627d = new Object();
    }

    @Override // p000.C0724sx
    /* JADX INFO: renamed from: a */
    public final Object mo2338a() {
        Object objMo2338a;
        synchronized (this.f4627d) {
            objMo2338a = super.mo2338a();
        }
        return objMo2338a;
    }

    @Override // p000.C0724sx
    /* JADX INFO: renamed from: c */
    public final boolean mo2340c(Object obj) {
        boolean zMo2340c;
        synchronized (this.f4627d) {
            zMo2340c = super.mo2340c(obj);
        }
        return zMo2340c;
    }
}
