package p084Q2;

import p074O2.InterfaceC1046d;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p117X2.C1677v;
import p117X2.InterfaceC1662g;

/* JADX INFO: renamed from: Q2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1184i extends AbstractC1178c implements InterfaceC1662g {

    /* JADX INFO: renamed from: g */
    public final int f3871g;

    public AbstractC1184i(int i5, InterfaceC1046d interfaceC1046d) {
        super(interfaceC1046d);
        this.f3871g = i5;
    }

    @Override // p117X2.InterfaceC1662g
    /* JADX INFO: renamed from: b */
    public final int mo2234b() {
        return this.f3871g;
    }

    @Override // p084Q2.AbstractC1176a
    public final String toString() {
        if (this.f3864d != null) {
            return super.toString();
        }
        AbstractC1676u.f5711a.getClass();
        String strM2996a = C1677v.m2996a(this);
        AbstractC1665j.m2984d(strM2996a, "renderLambdaToString(...)");
        return strM2996a;
    }
}
