package p012;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.RunnableC0062;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p007.AbstractC6136;
import p017.AbstractC6233;
import p017.AbstractC6238;
import p017.ThreadFactoryC6232;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6164 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Logger f16792;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C6164 f16793;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f16794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f16795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f16796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f16797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Logger f16798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5851 f16799;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f16800;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f16801;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f16802;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final RunnableC0062 f16803;

    static {
        Logger logger = Logger.getLogger(C6164.class.getName());
        logger.getClass();
        f16792 = logger;
        f16793 = new C6164(new C5851(new ThreadFactoryC6232(AbstractC0053.m146(new StringBuilder(), AbstractC6238.f17189, " TaskRunner"), true)));
    }

    public C6164(C5851 c5851) {
        Logger logger = f16792;
        logger.getClass();
        this.f16799 = c5851;
        this.f16798 = logger;
        this.f16797 = 10000;
        this.f16800 = new ArrayList();
        this.f16802 = new ArrayList();
        this.f16803 = new RunnableC0062(this, 14);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11585(C6164 c6164, AbstractC6167 abstractC6167, long j, boolean z) {
        TimeZone timeZone = AbstractC6238.f17190;
        C6165 c6165 = abstractC6167.f16813;
        c6165.getClass();
        if (c6165.f16806 != abstractC6167) {
            C5919.m11250("Check failed.");
            return;
        }
        boolean z2 = c6165.f16804;
        c6165.f16804 = false;
        c6165.f16806 = null;
        c6164.f16800.remove(c6165);
        if (j != -1 && !z2 && !c6165.f16807) {
            c6165.m11592(abstractC6167, j, true);
        }
        if (c6165.f16805.isEmpty()) {
            return;
        }
        c6164.f16802.add(c6165);
        if (z) {
            return;
        }
        c6164.m11586();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11586() {
        TimeZone timeZone = AbstractC6238.f17190;
        int i = this.f16794;
        if (i > this.f16801) {
            return;
        }
        this.f16794 = i + 1;
        RunnableC0062 runnableC0062 = this.f16803;
        runnableC0062.getClass();
        ((ThreadPoolExecutor) this.f16799.f16007).execute(runnableC0062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6165 m11587() {
        int i;
        synchronized (this) {
            i = this.f16797;
            this.f16797 = i + 1;
        }
        return new C6165(this, AbstractC6136.m11556(i, "Q"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11588(C6165 c6165) {
        c6165.getClass();
        TimeZone timeZone = AbstractC6238.f17190;
        if (c6165.f16806 == null) {
            boolean zIsEmpty = c6165.f16805.isEmpty();
            ArrayList arrayList = this.f16802;
            if (zIsEmpty) {
                arrayList.remove(c6165);
            } else {
                byte[] bArr = AbstractC6233.f17181;
                arrayList.getClass();
                if (!arrayList.contains(c6165)) {
                    arrayList.add(c6165);
                }
            }
        }
        if (this.f16796) {
            notify();
        } else {
            m11586();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC6167 m11589() {
        boolean z;
        TimeZone timeZone = AbstractC6238.f17190;
        while (true) {
            ArrayList arrayList = this.f16802;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC6167 abstractC6167 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC6167 abstractC61672 = (AbstractC6167) ((C6165) it.next()).f16805.get(0);
                long jMax = Math.max(0L, abstractC61672.f16812 - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC6167 != null) {
                        z = true;
                        break;
                    }
                    abstractC6167 = abstractC61672;
                }
            }
            ArrayList arrayList2 = this.f16800;
            if (abstractC6167 != null) {
                TimeZone timeZone2 = AbstractC6238.f17190;
                abstractC6167.f16812 = -1L;
                C6165 c6165 = abstractC6167.f16813;
                c6165.getClass();
                c6165.f16805.remove(abstractC6167);
                arrayList.remove(c6165);
                c6165.f16806 = abstractC6167;
                arrayList2.add(c6165);
                if (z || (!this.f16796 && !arrayList.isEmpty())) {
                    m11586();
                }
                return abstractC6167;
            }
            if (!this.f16796) {
                this.f16796 = true;
                this.f16795 = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = AbstractC6238.f17190;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = AbstractC6238.f17190;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((C6165) arrayList2.get(size)).m11594();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            C6165 c61652 = (C6165) arrayList.get(size2);
                            c61652.m11594();
                            if (c61652.f16805.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f16796 = false;
                }
            } else if (jMin < this.f16795 - jNanoTime) {
                notify();
            }
        }
        return null;
    }
}
