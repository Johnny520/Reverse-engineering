package p000a;

import androidx.lifecycle.C1133q;

/* JADX INFO: renamed from: a.W8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0406W8 implements C1133q.b {

    /* JADX INFO: renamed from: a */
    public final C0091Eg<?>[] f1549a;

    public C0406W8(C0091Eg<?>... c0091EgArr) {
        C0631i9.m1482e(c0091EgArr, "initializers");
        this.f1549a = c0091EgArr;
    }

    @Override // androidx.lifecycle.C1133q.b
    /* JADX INFO: renamed from: b */
    public final AbstractC0073Dg mo1051b(Class cls, C0012Ab c0012Ab) {
        C0160Id c0160Id = null;
        for (C0091Eg<?> c0091Eg : this.f1549a) {
            if (c0091Eg.f297a.equals(cls)) {
                c0160Id = new C0160Id();
            }
        }
        if (c0160Id != null) {
            return c0160Id;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
