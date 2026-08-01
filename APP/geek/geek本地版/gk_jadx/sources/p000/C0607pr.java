package p000;

/* JADX INFO: renamed from: pr */
/* JADX INFO: loaded from: classes.dex */
public class C0607pr extends pa0 {

    /* JADX INFO: renamed from: c */
    public final e40 f3923c = new e40();

    @Override // p000.pa0
    /* JADX INFO: renamed from: a */
    public final void mo113a() {
        e40 e40Var = this.f3923c;
        int i = e40Var.f1712c;
        if (i > 0) {
            e40Var.f1711b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = e40Var.f1711b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        e40Var.f1712c = 0;
    }
}
