package p050c0;

import p001A0.AbstractC0040p;
import p056f0.C0830i;

/* JADX INFO: renamed from: c0.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0713z implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2245a;

    public /* synthetic */ RunnableC0713z(int r1) {
        this.f2245a = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f2245a) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L21;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        C0830i r02 = C0830i.f3000a;
        C0830i.m2156f("post-6s");
        return;
    L6:
        C0830i r03 = C0830i.f3000a;
        C0830i.m2156f("post-3s");
        return;
    L8:
        C0830i r04 = C0830i.f3000a;
        C0830i.m2156f("post-1.2s");
        return;
    L15:
        Object r05 = C0590G1.f1792a;
        C0590G1.m1465w();
        return;
    L17:
        C0588G r06 = C0588G.f1768a;
        C0588G.m1417d(C0588G.f1784q);
        return;
    L19:
        C0588G r07 = C0588G.f1768a;
        C0588G.m1417d(C0588G.f1784q);
        return;
    L21:
        Object r08 = C0590G1.f1792a;     // Catch: Throwable -> L12
        C0590G1.m1465w();     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
