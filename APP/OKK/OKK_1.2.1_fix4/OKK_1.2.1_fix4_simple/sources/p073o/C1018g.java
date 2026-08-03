package p073o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.g */
/* JADX INFO: loaded from: classes.dex */
public class C1018g extends C1017f {

    /* JADX INFO: renamed from: m */
    public int f3756m;

    public C1018g(AbstractC1024m r1) {
        super(r1);
        if ((r1 instanceof C1021j) == false) goto L5;
        this.f3748e = 2;
        return;
    L5:
        this.f3748e = 3;
    }

    @Override // p073o.C1017f
    /* JADX INFO: renamed from: d */
    public final void mo2462d(int r2) {
        if (this.f3753j == false) goto L5;
        return;
    L5:
        this.f3753j = true;
        this.f3750g = r2;
        Iterator r22 = this.f3754k.iterator();
    L7:
        if (r22.hasNext() == false) goto L9;
        InterfaceC1015d r02 = (InterfaceC1015d) r22.next();
        r02.mo2445a(r02);
        goto L7
    }
}
