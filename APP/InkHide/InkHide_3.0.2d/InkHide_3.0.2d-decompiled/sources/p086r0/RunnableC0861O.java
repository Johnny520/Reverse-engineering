package p086r0;

import p062e0.InterfaceC0551a;

/* JADX INFO: renamed from: r0.O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0861O implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2966a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f2967b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0551a f2968c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0861O(InterfaceC0551a interfaceC0551a, long j2, int i2) {
        this.f2966a = i2;
        this.f2968c = interfaceC0551a;
        this.f2967b = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2966a) {
            case 0:
                C0894d0 c0894d0 = (C0894d0) this.f2968c;
                if (c0894d0.f3115N == this.f2967b && !c0894d0.f3116O) {
                    c0894d0.f3113L = null;
                    c0894d0.f3114M = null;
                    c0894d0.f3115N = 0L;
                    c0894d0.f3116O = false;
                    c0894d0.f3117P = null;
                    c0894d0.f3110I.clear();
                    break;
                }
                break;
            default:
                C0842H0 c0842h0 = (C0842H0) this.f2968c;
                if (c0842h0.f2841R == this.f2967b && !c0842h0.f2842S) {
                    c0842h0.f2839P = null;
                    c0842h0.f2840Q = null;
                    c0842h0.f2841R = 0L;
                    c0842h0.f2842S = false;
                    c0842h0.f2843T = null;
                    c0842h0.f2844U = null;
                    c0842h0.f2845V.clear();
                    break;
                }
                break;
        }
    }
}
