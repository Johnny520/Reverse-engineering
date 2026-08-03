package p050c0;

import p001A0.AbstractC0040p;
import p056f0.C0830i;

/* JADX INFO: renamed from: c0.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0713z implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2245a;

    public /* synthetic */ RunnableC0713z(int i2) {
        this.f2245a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2245a) {
            case 0:
                C0588G c0588g = C0588G.f1768a;
                C0588G.m1417d(C0588G.f1784q);
                break;
            case 1:
                C0588G c0588g2 = C0588G.f1768a;
                C0588G.m1417d(C0588G.f1784q);
                break;
            case 2:
                Object obj = C0590G1.f1792a;
                C0590G1.m1465w();
                break;
            case 3:
                try {
                    Object obj2 = C0590G1.f1792a;
                    C0590G1.m1465w();
                } catch (Throwable th) {
                    AbstractC0040p.m116u(th);
                    return;
                }
                break;
            case 4:
                C0830i c0830i = C0830i.f3000a;
                C0830i.m2156f("post-1.2s");
                break;
            case 5:
                C0830i c0830i2 = C0830i.f3000a;
                C0830i.m2156f("post-3s");
                break;
            default:
                C0830i c0830i3 = C0830i.f3000a;
                C0830i.m2156f("post-6s");
                break;
        }
    }
}
