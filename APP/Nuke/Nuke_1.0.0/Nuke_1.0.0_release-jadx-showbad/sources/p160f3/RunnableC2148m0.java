package p160f3;

import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p190k3.C2469q;

/* JADX INFO: renamed from: f3.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2148m0 extends C2469q implements Runnable {

    /* JADX INFO: renamed from: h */
    public final long f7090h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC2148m0(long j5, C2150n0 c2150n0) {
        InterfaceC1051i interfaceC1051i = c2150n0.f3866e;
        AbstractC1665j.m2982b(interfaceC1051i);
        super(c2150n0, interfaceC1051i);
        this.f7090h = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: S */
    public final String mo3936S() {
        return super.mo3936S() + "(timeMillis=" + this.f7090h + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2162v.m3986h(this.f7064f);
        m3945y(new C2146l0("Timed out waiting for " + this.f7090h + " ms", this));
    }
}
