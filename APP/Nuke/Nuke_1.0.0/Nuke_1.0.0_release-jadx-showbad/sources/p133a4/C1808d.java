package p133a4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p011B4.AbstractC0231b;
import p047I0.RunnableC0766v;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p123Y3.AbstractC1774e;
import p123Y3.AbstractC1776g;
import p123Y3.ThreadFactoryC1775f;

/* JADX INFO: renamed from: a4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1808d {

    /* JADX INFO: renamed from: k */
    public static final Logger f6160k;

    /* JADX INFO: renamed from: l */
    public static final C1808d f6161l;

    /* JADX INFO: renamed from: a */
    public final C1753n f6162a;

    /* JADX INFO: renamed from: b */
    public final Logger f6163b;

    /* JADX INFO: renamed from: c */
    public int f6164c;

    /* JADX INFO: renamed from: d */
    public boolean f6165d;

    /* JADX INFO: renamed from: e */
    public long f6166e;

    /* JADX INFO: renamed from: f */
    public int f6167f;

    /* JADX INFO: renamed from: g */
    public int f6168g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f6169h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f6170i;

    /* JADX INFO: renamed from: j */
    public final RunnableC0766v f6171j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Logger logger = Logger.getLogger(C1808d.class.getName());
        AbstractC1665j.m2984d(logger, "getLogger(...)");
        f6160k = logger;
        String str = AbstractC1776g.f6077b + " TaskRunner";
        AbstractC1665j.m2985e(str, "name");
        f6161l = new C1808d(new C1753n(new ThreadFactoryC1775f(str, true)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1808d(C1753n c1753n) {
        Logger logger = f6160k;
        AbstractC1665j.m2985e(logger, "logger");
        this.f6162a = c1753n;
        this.f6163b = logger;
        this.f6164c = 10000;
        this.f6169h = new ArrayList();
        this.f6170i = new ArrayList();
        this.f6171j = new RunnableC0766v(3, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3280a(C1808d c1808d, AbstractC1805a abstractC1805a, long j5, boolean z5) {
        TimeZone timeZone = AbstractC1776g.f6076a;
        C1807c c1807c = abstractC1805a.f6150c;
        AbstractC1665j.m2982b(c1807c);
        if (c1807c.f6157d != abstractC1805a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z6 = c1807c.f6159f;
        c1807c.f6159f = false;
        c1807c.f6157d = null;
        c1808d.f6169h.remove(c1807c);
        if (j5 != -1 && !z6 && !c1807c.f6156c) {
            c1807c.m3278d(abstractC1805a, j5, true);
        }
        if (c1807c.f6158e.isEmpty()) {
            return;
        }
        c1808d.f6170i.add(c1807c);
        if (z5) {
            return;
        }
        c1808d.m3284e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC1805a m3281b() {
        boolean z5;
        TimeZone timeZone = AbstractC1776g.f6076a;
        while (true) {
            ArrayList arrayList = this.f6170i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC1805a abstractC1805a = null;
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                AbstractC1805a abstractC1805a2 = (AbstractC1805a) ((C1807c) it.next()).f6158e.get(0);
                long jMax = Math.max(0L, abstractC1805a2.f6151d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC1805a != null) {
                        z5 = true;
                        break;
                    }
                    abstractC1805a = abstractC1805a2;
                }
            }
            ArrayList arrayList2 = this.f6169h;
            if (abstractC1805a != null) {
                TimeZone timeZone2 = AbstractC1776g.f6076a;
                abstractC1805a.f6151d = -1L;
                C1807c c1807c = abstractC1805a.f6150c;
                AbstractC1665j.m2982b(c1807c);
                c1807c.f6158e.remove(abstractC1805a);
                arrayList.remove(c1807c);
                c1807c.f6157d = abstractC1805a;
                arrayList2.add(c1807c);
                if (z5 || (!this.f6165d && !arrayList.isEmpty())) {
                    m3284e();
                }
                return abstractC1805a;
            }
            if (!this.f6165d) {
                this.f6165d = true;
                this.f6166e = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = AbstractC1776g.f6076a;
                        if (jMin > 0) {
                            long j5 = jMin / 1000000;
                            long j6 = jMin - (1000000 * j5);
                            if (j5 > 0 || jMin > 0) {
                                wait(j5, (int) j6);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = AbstractC1776g.f6076a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((C1807c) arrayList2.get(size)).m3276a();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            C1807c c1807c2 = (C1807c) arrayList.get(size2);
                            c1807c2.m3276a();
                            if (c1807c2.f6158e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f6165d = false;
                }
            } else if (jMin < this.f6166e - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3282c(C1807c c1807c) {
        AbstractC1665j.m2985e(c1807c, "taskQueue");
        TimeZone timeZone = AbstractC1776g.f6076a;
        if (c1807c.f6157d == null) {
            boolean zIsEmpty = c1807c.f6158e.isEmpty();
            ArrayList arrayList = this.f6170i;
            if (zIsEmpty) {
                arrayList.remove(c1807c);
            } else {
                byte[] bArr = AbstractC1774e.f6072a;
                AbstractC1665j.m2985e(arrayList, "<this>");
                if (!arrayList.contains(c1807c)) {
                    arrayList.add(c1807c);
                }
            }
        }
        if (this.f6165d) {
            notify();
        } else {
            m3284e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C1807c m3283d() {
        int i5;
        synchronized (this) {
            i5 = this.f6164c;
            this.f6164c = i5 + 1;
        }
        return new C1807c(this, AbstractC0231b.m398i("Q", i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m3284e() {
        TimeZone timeZone = AbstractC1776g.f6076a;
        int i5 = this.f6167f;
        if (i5 > this.f6168g) {
            return;
        }
        this.f6167f = i5 + 1;
        RunnableC0766v runnableC0766v = this.f6171j;
        AbstractC1665j.m2985e(runnableC0766v, "runnable");
        ((ThreadPoolExecutor) this.f6162a.f6028e).execute(runnableC0766v);
    }
}
