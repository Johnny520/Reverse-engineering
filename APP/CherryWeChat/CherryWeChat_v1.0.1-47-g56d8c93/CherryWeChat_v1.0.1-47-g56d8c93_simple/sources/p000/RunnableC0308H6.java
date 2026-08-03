package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: H6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0308H6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1022a;

    /* JADX INFO: renamed from: b */
    public final int f1023b;

    /* JADX INFO: renamed from: c */
    public final Object f1024c;

    public /* synthetic */ RunnableC0308H6(int r1, int r2, Object r3) {
        this.f1022a = r2;
        this.f1024c = r3;
        this.f1023b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f1022a) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((C0549Mq) this.f1024c).f1780a0.smoothScrollToPosition(this.f1023b);
        return;
    L6:
        ArrayList r0 = (ArrayList) this.f1024c;
        int r1 = r0.size();
        int r4 = 0;
        if (this.f1023b == 1) goto L10;
    L8:
        if (r4 >= r1) goto L12;
        ((AbstractC2278nf) r0.get(r4)).mo295a();
        r4 = r4 + 1;
        goto L8
    L12:
        return;
    L10:
        if (r4 >= r1) goto L19;
        ((AbstractC2278nf) r0.get(r4)).mo296b();
        r4 = r4 + 1;
        goto L10
    L19:
        return;
    L13:
        AbstractC0585Nj r02 = (AbstractC0585Nj) ((C1017Xm) this.f1024c).f3226b;
        if (r02 == null) goto L20;
        r02.mo1159I(this.f1023b);
        return;
    }

    public RunnableC0308H6(List r1, int r2, Throwable r3) {
        this.f1022a = 1;
        AbstractC1293cr.m2548g("initCallbacks cannot be null", r1);
        this.f1024c = new ArrayList(r1);
        this.f1023b = r2;
    }
}
