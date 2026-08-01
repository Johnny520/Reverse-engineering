package p027E4;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: E4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0323j implements InterfaceC0320g {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1044d;

    /* JADX INFO: renamed from: e */
    public final Type f1045e;

    public /* synthetic */ C0323j(int i5, Type type) {
        this.f1044d = i5;
        this.f1045e = type;
    }

    @Override // p027E4.InterfaceC0320g
    /* JADX INFO: renamed from: g */
    public final Object mo38g(C0289C c0289c) {
        switch (this.f1044d) {
            case 0:
                C0324k c0324k = new C0324k(c0289c);
                c0289c.mo510c(new C0322i(c0324k, 0));
                return c0324k;
            default:
                C0324k c0324k2 = new C0324k(c0289c);
                c0289c.mo510c(new C0322i(c0324k2, 1));
                return c0324k2;
        }
    }

    @Override // p027E4.InterfaceC0320g
    /* JADX INFO: renamed from: n */
    public final Type mo45n() {
        switch (this.f1044d) {
        }
        return this.f1045e;
    }
}
