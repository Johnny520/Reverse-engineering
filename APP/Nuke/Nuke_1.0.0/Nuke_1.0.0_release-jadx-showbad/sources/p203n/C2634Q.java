package p203n;

import p095T.C1330O0;
import p095T.C1362g0;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p158f0.AbstractC2082n;

/* JADX INFO: renamed from: n.Q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2634Q implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8375d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2642Z f8376e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2634Q(C2642Z c2642z, int i5) {
        this.f8375d = i5;
        this.f8376e = c2642z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() {
        boolean z5;
        switch (this.f8375d) {
            case 0:
                C2642Z c2642z = this.f8376e;
                if (AbstractC1665j.m2981a(c2642z.f8404d.getValue(), c2642z.m4593c())) {
                    C1362g0 c1362g0 = c2642z.f8407g;
                    z5 = ((C1330O0) AbstractC2082n.m3844t(c1362g0.f4803e, c1362g0)).f4757c != Long.MIN_VALUE || ((Boolean) c2642z.f8408h.getValue()).booleanValue();
                }
                return Boolean.valueOf(z5);
            default:
                return Long.valueOf(this.f8376e.m4592b());
        }
    }
}
