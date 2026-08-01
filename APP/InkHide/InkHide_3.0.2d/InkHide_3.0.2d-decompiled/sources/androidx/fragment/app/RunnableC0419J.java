package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.J */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0419J implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0420K f1272b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0431i f1273c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0419J(C0431i c0431i, C0420K c0420k, int i2) {
        this.f1271a = i2;
        this.f1273c = c0431i;
        this.f1272b = c0420k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1271a) {
            case 0:
                ArrayList arrayList = this.f1273c.f1331b;
                C0420K c0420k = this.f1272b;
                if (arrayList.contains(c0420k)) {
                    AbstractC0421L.m813a(c0420k.f1276c.f1353F, c0420k.f1274a);
                }
                break;
            default:
                C0431i c0431i = this.f1273c;
                ArrayList arrayList2 = c0431i.f1331b;
                C0420K c0420k2 = this.f1272b;
                arrayList2.remove(c0420k2);
                c0431i.f1332c.remove(c0420k2);
                break;
        }
    }
}
