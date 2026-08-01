package p000;

/* JADX INFO: renamed from: tr */
/* JADX INFO: loaded from: classes.dex */
public class C0754tr extends ua0 {

    /* JADX INFO: renamed from: c */
    public final l40 f4573c = new l40();

    @Override // p000.ua0
    /* JADX INFO: renamed from: a */
    public final void mo651a() {
        l40 l40Var = this.f4573c;
        int i = l40Var.f2919c;
        if (i > 0) {
            l40Var.f2918b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = l40Var.f2918b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        l40Var.f2919c = 0;
    }
}
