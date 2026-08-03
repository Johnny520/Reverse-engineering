package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: yj */
/* JADX INFO: loaded from: classes.dex */
public final class C2763yj implements InterfaceC2777yx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0884Ui f9399a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1416fj f9400b;

    public C2763yj(InterfaceC0884Ui r1, InterfaceC1416fj r2) {
        this.f9399a = r1;
        this.f9400b = r2;
    }

    @Override // p000.InterfaceC2777yx
    public final Iterator iterator() {
        return new C2720xj(this);
    }
}
