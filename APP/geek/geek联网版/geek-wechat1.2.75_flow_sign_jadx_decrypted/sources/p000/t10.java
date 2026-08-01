package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t10 extends u10 implements Iterator {

    /* JADX INFO: renamed from: a */
    public s10 f4386a;

    /* JADX INFO: renamed from: b */
    public boolean f4387b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v10 f4388c;

    public t10(v10 v10Var) {
        this.f4388c = v10Var;
    }

    @Override // p000.u10
    /* JADX INFO: renamed from: a */
    public final void mo2195a(s10 s10Var) {
        s10 s10Var2 = this.f4386a;
        if (s10Var == s10Var2) {
            s10 s10Var3 = s10Var2.f4190d;
            this.f4386a = s10Var3;
            this.f4387b = s10Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4387b) {
            return this.f4388c.f4872a != null;
        }
        s10 s10Var = this.f4386a;
        return (s10Var == null || s10Var.f4189c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4387b) {
            this.f4387b = false;
            this.f4386a = this.f4388c.f4872a;
        } else {
            s10 s10Var = this.f4386a;
            this.f4386a = s10Var != null ? s10Var.f4189c : null;
        }
        return this.f4386a;
    }
}
