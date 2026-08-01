package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m10 extends n10 implements Iterator {

    /* JADX INFO: renamed from: a */
    public l10 f3122a;

    /* JADX INFO: renamed from: b */
    public boolean f3123b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o10 f3124c;

    public m10(o10 o10Var) {
        this.f3124c = o10Var;
    }

    @Override // p000.n10
    /* JADX INFO: renamed from: a */
    public final void mo1616a(l10 l10Var) {
        l10 l10Var2 = this.f3122a;
        if (l10Var == l10Var2) {
            l10 l10Var3 = l10Var2.f2991d;
            this.f3122a = l10Var3;
            this.f3123b = l10Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3123b) {
            return this.f3124c.f3471a != null;
        }
        l10 l10Var = this.f3122a;
        return (l10Var == null || l10Var.f2990c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3123b) {
            this.f3123b = false;
            this.f3122a = this.f3124c.f3471a;
        } else {
            l10 l10Var = this.f3122a;
            this.f3122a = l10Var != null ? l10Var.f2990c : null;
        }
        return this.f3122a;
    }
}
