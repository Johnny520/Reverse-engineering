package p198nb;

import gg.AbstractC1416l;
import gg.C1425u;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: nb.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2927b0 implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9571g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1425u f9572h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC2927b0(C1425u c1425u, int i9) {
        this.f9571g = i9;
        this.f9572h = c1425u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9571g) {
            case 0:
                Object obj = this.f9572h.f4738g;
                if (obj != null) {
                    ((InterfaceC1220a) obj).invoke();
                    return;
                } else {
                    AbstractC1416l.m3831g("startNext");
                    throw null;
                }
            default:
                Object obj2 = this.f9572h.f4738g;
                if (obj2 != null) {
                    ((InterfaceC1220a) obj2).invoke();
                    return;
                } else {
                    AbstractC1416l.m3831g("startNext");
                    throw null;
                }
        }
    }
}
