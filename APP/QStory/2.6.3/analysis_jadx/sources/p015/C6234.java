package p015;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.RunnableC0062;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p009.AbstractC6183;
import p013.AbstractC6225;
import p013.AbstractC6230;
import p013.ThreadFactoryC6224;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏哲子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6234 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Logger f17174;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C6234 f17175;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17176;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f17177;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f17178;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f17179;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Logger f17180;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5856 f17181;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f17182;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f17183;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f17184;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final RunnableC0062 f17185;

    static {
        Logger logger = Logger.getLogger(C6234.class.getName());
        logger.getClass();
        f17174 = logger;
        f17175 = new C6234(new C5856(new ThreadFactoryC6224(AbstractC0053.m151(new StringBuilder(), AbstractC6230.f17166, " TaskRunner"), true)));
    }

    public C6234(C5856 c5856) {
        Logger logger = f17174;
        logger.getClass();
        this.f17181 = c5856;
        this.f17180 = logger;
        this.f17179 = 10000;
        this.f17182 = new ArrayList();
        this.f17184 = new ArrayList();
        this.f17185 = new RunnableC0062(this, 14);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11707(C6234 c6234, AbstractC6236 abstractC6236, long j, boolean z) {
        TimeZone timeZone = AbstractC6230.f17167;
        C6235 c6235 = abstractC6236.f17193;
        c6235.getClass();
        if (c6235.f17188 != abstractC6236) {
            C5925.m11311("Check failed.");
            return;
        }
        boolean z2 = c6235.f17186;
        c6235.f17186 = false;
        c6235.f17188 = null;
        c6234.f17182.remove(c6235);
        if (j != -1 && !z2 && !c6235.f17189) {
            c6235.m11714(abstractC6236, j, true);
        }
        if (c6235.f17187.isEmpty()) {
            return;
        }
        c6234.f17184.add(c6235);
        if (z) {
            return;
        }
        c6234.m11708();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11708() {
        TimeZone timeZone = AbstractC6230.f17167;
        int i = this.f17176;
        if (i > this.f17183) {
            return;
        }
        this.f17176 = i + 1;
        RunnableC0062 runnableC0062 = this.f17185;
        runnableC0062.getClass();
        ((ThreadPoolExecutor) this.f17181.f16014).execute(runnableC0062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6235 m11709() {
        int i;
        synchronized (this) {
            i = this.f17179;
            this.f17179 = i + 1;
        }
        return new C6235(this, AbstractC6183.m11588(i, "Q"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11710(C6235 c6235) {
        c6235.getClass();
        TimeZone timeZone = AbstractC6230.f17167;
        if (c6235.f17188 == null) {
            boolean zIsEmpty = c6235.f17187.isEmpty();
            ArrayList arrayList = this.f17184;
            if (zIsEmpty) {
                arrayList.remove(c6235);
            } else {
                byte[] bArr = AbstractC6225.f17158;
                arrayList.getClass();
                if (!arrayList.contains(c6235)) {
                    arrayList.add(c6235);
                }
            }
        }
        if (this.f17178) {
            notify();
        } else {
            m11708();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC6236 m11711() {
        boolean z;
        TimeZone timeZone = AbstractC6230.f17167;
        while (true) {
            ArrayList arrayList = this.f17184;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC6236 abstractC6236 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC6236 abstractC62362 = (AbstractC6236) ((C6235) it.next()).f17187.get(0);
                long jMax = Math.max(0L, abstractC62362.f17192 - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC6236 != null) {
                        z = true;
                        break;
                    }
                    abstractC6236 = abstractC62362;
                }
            }
            ArrayList arrayList2 = this.f17182;
            if (abstractC6236 != null) {
                TimeZone timeZone2 = AbstractC6230.f17167;
                abstractC6236.f17192 = -1L;
                C6235 c6235 = abstractC6236.f17193;
                c6235.getClass();
                c6235.f17187.remove(abstractC6236);
                arrayList.remove(c6235);
                c6235.f17188 = abstractC6236;
                arrayList2.add(c6235);
                if (z || (!this.f17178 && !arrayList.isEmpty())) {
                    m11708();
                }
                return abstractC6236;
            }
            if (!this.f17178) {
                this.f17178 = true;
                this.f17177 = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = AbstractC6230.f17167;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = AbstractC6230.f17167;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((C6235) arrayList2.get(size)).m11716();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            C6235 c62352 = (C6235) arrayList.get(size2);
                            c62352.m11716();
                            if (c62352.f17187.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f17178 = false;
                }
            } else if (jMin < this.f17177 - jNanoTime) {
                notify();
            }
        }
        return null;
    }
}
