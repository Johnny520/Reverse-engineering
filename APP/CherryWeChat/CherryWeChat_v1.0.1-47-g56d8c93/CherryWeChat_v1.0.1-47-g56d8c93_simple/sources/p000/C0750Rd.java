package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: Rd */
/* JADX INFO: loaded from: classes.dex */
public class C0750Rd extends C2628vd {

    /* JADX INFO: renamed from: m */
    public int f2386m;

    public C0750Rd(AbstractC1449gF r1) {
        super(r1);
        if ((r1 instanceof C0757Rk) == false) goto L6;
        this.f9114e = 2;
        return;
    L6:
        this.f9114e = 3;
    }

    @Override // p000.C2628vd
    /* JADX INFO: renamed from: d */
    public final void mo1539d(int r2) {
        if (this.f9119j == true) goto L9;
        this.f9119j = true;
        this.f9116g = r2;
        Iterator r22 = this.f9120k.iterator();
    L7:
        if (r22.hasNext() == false) goto L11;
        InterfaceC2542td r0 = (InterfaceC2542td) r22.next();
        r0.mo1546a(r0);
        goto L7
    L11:
        return;
    }
}
