package io.sentry;

import io.sentry.config.AbstractC1856a;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1938p extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1977q f6829b;

    public /* synthetic */ C1938p(C1977q r1, int r2) {
        this.f6828a = r2;
        this.f6829b = r1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch(this.f6828a) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        long r0 = System.currentTimeMillis();
        C1977q r2 = this.f6829b;
        if ((r0 - r2.f7078i) <= 10) goto L15;
        r2.f7078i = r0;
        Date r1 = AbstractC1856a.m4067m();
        System.nanoTime();
        C1827b1 r02 = new C1827b1(r1.getTime() * 1000000);
        Iterator r12 = r2.f7073d.iterator();
    L9:
        if (r12.hasNext() == false) goto L11;
        ((InterfaceC1642W) r12.next()).mo3749a(r02);
        goto L9
    L11:
        Iterator r13 = r2.f7072c.values().iterator();
    L13:
        if (r13.hasNext() == false) goto L24;
        ((List) r13.next()).add(r02);
        goto L13
    L24:
        return;
    L15:
        return;
    L16:
        Iterator r03 = this.f6829b.f7073d.iterator();
    L18:
        if (r03.hasNext() == false) goto L20;
        ((InterfaceC1642W) r03.next()).mo3750b();
        goto L18
    }
}
