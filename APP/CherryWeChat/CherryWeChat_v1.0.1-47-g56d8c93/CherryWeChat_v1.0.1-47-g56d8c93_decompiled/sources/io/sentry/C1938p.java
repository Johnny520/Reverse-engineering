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

    public /* synthetic */ C1938p(C1977q c1977q, int i) {
        this.f6828a = i;
        this.f6829b = c1977q;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f6828a) {
            case 0:
                Iterator it = this.f6829b.f7073d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1642W) it.next()).mo3750b();
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1977q c1977q = this.f6829b;
                if (jCurrentTimeMillis - c1977q.f7078i > 10) {
                    c1977q.f7078i = jCurrentTimeMillis;
                    Date dateM4067m = AbstractC1856a.m4067m();
                    System.nanoTime();
                    C1827b1 c1827b1 = new C1827b1(dateM4067m.getTime() * 1000000);
                    Iterator it2 = c1977q.f7073d.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1642W) it2.next()).mo3749a(c1827b1);
                    }
                    Iterator it3 = c1977q.f7072c.values().iterator();
                    while (it3.hasNext()) {
                        ((List) it3.next()).add(c1827b1);
                    }
                    break;
                }
                break;
        }
    }
}
