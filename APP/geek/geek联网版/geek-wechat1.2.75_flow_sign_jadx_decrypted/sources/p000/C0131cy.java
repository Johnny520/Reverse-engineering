package p000;

/* JADX INFO: renamed from: cy */
/* JADX INFO: loaded from: classes.dex */
public final class C0131cy extends C0048ay {

    /* JADX INFO: renamed from: d */
    public final Object f1271d;

    public C0131cy() {
        super(12);
        this.f1271d = new Object();
    }

    @Override // p000.C0048ay
    /* JADX INFO: renamed from: a */
    public final Object mo475a() {
        Object objMo475a;
        synchronized (this.f1271d) {
            objMo475a = super.mo475a();
        }
        return objMo475a;
    }

    @Override // p000.C0048ay
    /* JADX INFO: renamed from: c */
    public final boolean mo477c(Object obj) {
        boolean zMo477c;
        synchronized (this.f1271d) {
            zMo477c = super.mo477c(obj);
        }
        return zMo477c;
    }
}
