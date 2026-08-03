package p018J0;

import p014H0.InterfaceC0202a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0314n;
import p031Q0.C0315o;
import p031Q0.InterfaceC0305e;

/* JADX INFO: renamed from: J0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0237g extends AbstractC0236f implements InterfaceC0305e {

    /* JADX INFO: renamed from: b */
    public final int f479b;

    public AbstractC0237g(InterfaceC0202a r1) {
        super(r1);
        this.f479b = 2;
    }

    @Override // p031Q0.InterfaceC0305e
    public final int getArity() {
        return this.f479b;
    }

    @Override // p018J0.AbstractC0231a
    public final String toString() {
        if (this.f471a != null) goto L6;
        AbstractC0314n.f596a.getClass();
        String r02 = C0315o.m708a(this);
        AbstractC0307g.m702d(r02, "renderLambdaToString(...)");
        return r02;
    L6:
        return super.toString();
    }
}
