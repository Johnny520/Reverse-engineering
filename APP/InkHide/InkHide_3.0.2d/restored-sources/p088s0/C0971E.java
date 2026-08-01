package p088s0;

import p009E0.C0109i;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p086r0.RunnableC0910i1;
import p102z0.C1119b;

/* JADX INFO: renamed from: s0.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0971E implements InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0976J f3474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f3475b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0971E(C0976J c0976j, boolean z2) {
        this.f3474a = c0976j;
        this.f3475b = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public final Object mo8c(Object obj) {
        C1119b c1119b = (C1119b) obj;
        AbstractC0223g.m418e(c1119b, "result");
        boolean z2 = this.f3475b;
        C0976J c0976j = this.f3474a;
        c0976j.post(new RunnableC0910i1(z2, c0976j, c1119b));
        return C0109i.f404a;
    }
}
