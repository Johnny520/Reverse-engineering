package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r10 extends u10 implements Iterator {

    /* JADX INFO: renamed from: a */
    public s10 f3996a;

    /* JADX INFO: renamed from: b */
    public s10 f3997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3998c;

    public r10(s10 s10Var, s10 s10Var2, int i) {
        this.f3998c = i;
        this.f3996a = s10Var2;
        this.f3997b = s10Var;
    }

    @Override // p000.u10
    /* JADX INFO: renamed from: a */
    public final void mo2195a(s10 s10Var) {
        s10 s10Var2;
        s10 s10VarM2196b = null;
        if (this.f3996a == s10Var && s10Var == this.f3997b) {
            this.f3997b = null;
            this.f3996a = null;
        }
        s10 s10Var3 = this.f3996a;
        if (s10Var3 == s10Var) {
            switch (this.f3998c) {
                case Base64.DEFAULT /* 0 */:
                    s10Var2 = s10Var3.f4190d;
                    break;
                default:
                    s10Var2 = s10Var3.f4189c;
                    break;
            }
            this.f3996a = s10Var2;
        }
        s10 s10Var4 = this.f3997b;
        if (s10Var4 == s10Var) {
            s10 s10Var5 = this.f3996a;
            if (s10Var4 != s10Var5 && s10Var5 != null) {
                s10VarM2196b = m2196b(s10Var4);
            }
            this.f3997b = s10VarM2196b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final s10 m2196b(s10 s10Var) {
        switch (this.f3998c) {
            case Base64.DEFAULT /* 0 */:
                return s10Var.f4189c;
            default:
                return s10Var.f4190d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3997b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        s10 s10Var = this.f3997b;
        s10 s10Var2 = this.f3996a;
        this.f3997b = (s10Var == s10Var2 || s10Var2 == null) ? null : m2196b(s10Var);
        return s10Var;
    }
}
