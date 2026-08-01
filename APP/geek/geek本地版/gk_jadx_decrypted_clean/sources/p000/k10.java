package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k10 extends n10 implements Iterator {

    /* JADX INFO: renamed from: a */
    public l10 f2687a;

    /* JADX INFO: renamed from: b */
    public l10 f2688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2689c;

    public k10(l10 l10Var, l10 l10Var2, int i) {
        this.f2689c = i;
        this.f2687a = l10Var2;
        this.f2688b = l10Var;
    }

    @Override // p000.n10
    /* JADX INFO: renamed from: a */
    public final void mo1616a(l10 l10Var) {
        l10 l10Var2;
        l10 l10VarM1617b = null;
        if (this.f2687a == l10Var && l10Var == this.f2688b) {
            this.f2688b = null;
            this.f2687a = null;
        }
        l10 l10Var3 = this.f2687a;
        if (l10Var3 == l10Var) {
            switch (this.f2689c) {
                case Base64.DEFAULT /* 0 */:
                    l10Var2 = l10Var3.f2991d;
                    break;
                default:
                    l10Var2 = l10Var3.f2990c;
                    break;
            }
            this.f2687a = l10Var2;
        }
        l10 l10Var4 = this.f2688b;
        if (l10Var4 == l10Var) {
            l10 l10Var5 = this.f2687a;
            if (l10Var4 != l10Var5 && l10Var5 != null) {
                l10VarM1617b = m1617b(l10Var4);
            }
            this.f2688b = l10VarM1617b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final l10 m1617b(l10 l10Var) {
        switch (this.f2689c) {
            case Base64.DEFAULT /* 0 */:
                return l10Var.f2990c;
            default:
                return l10Var.f2991d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2688b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        l10 l10Var = this.f2688b;
        l10 l10Var2 = this.f2687a;
        this.f2688b = (l10Var == l10Var2 || l10Var2 == null) ? null : m1617b(l10Var);
        return l10Var;
    }
}
