package p031;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.RunnableC0909;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p025.AbstractC7012;
import p029.AbstractC7054;
import p029.AbstractC7059;
import p029.ThreadFactoryC7053;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏哲子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7063 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Logger f17519;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C7063 f17520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f17522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f17523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f17524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Logger f17525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6686 f17526;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f17527;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f17528;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f17529;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final RunnableC0909 f17530;

    static {
        Logger logger = Logger.getLogger(C7063.class.getName());
        logger.getClass();
        f17519 = logger;
        f17520 = new C7063(new C6686(new ThreadFactoryC7053(AbstractC0900.m711(new StringBuilder(), AbstractC7059.f17511, " TaskRunner"), true)));
    }

    public C7063(C6686 c6686) {
        Logger logger = f17519;
        logger.getClass();
        this.f17526 = c6686;
        this.f17525 = logger;
        this.f17524 = 10000;
        this.f17527 = new ArrayList();
        this.f17529 = new ArrayList();
        this.f17530 = new RunnableC0909(this, 14);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m12266(C7063 c7063, AbstractC7065 abstractC7065, long j, boolean z) {
        TimeZone timeZone = AbstractC7059.f17512;
        C7064 c7064 = abstractC7065.f17538;
        c7064.getClass();
        if (c7064.f17533 != abstractC7065) {
            C6755.m11870("Check failed.");
            return;
        }
        boolean z2 = c7064.f17531;
        c7064.f17531 = false;
        c7064.f17533 = null;
        c7063.f17527.remove(c7064);
        if (j != -1 && !z2 && !c7064.f17534) {
            c7064.m12273(abstractC7065, j, true);
        }
        if (c7064.f17532.isEmpty()) {
            return;
        }
        c7063.f17529.add(c7064);
        if (z) {
            return;
        }
        c7063.m12267();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12267() {
        TimeZone timeZone = AbstractC7059.f17512;
        int i = this.f17521;
        if (i > this.f17528) {
            return;
        }
        this.f17521 = i + 1;
        RunnableC0909 runnableC0909 = this.f17530;
        runnableC0909.getClass();
        ((ThreadPoolExecutor) this.f17526.f16359).execute(runnableC0909);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7064 m12268() {
        int i;
        synchronized (this) {
            i = this.f17524;
            this.f17524 = i + 1;
        }
        return new C7064(this, AbstractC7012.m12147(i, "Q"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12269(C7064 c7064) {
        c7064.getClass();
        TimeZone timeZone = AbstractC7059.f17512;
        if (c7064.f17533 == null) {
            boolean zIsEmpty = c7064.f17532.isEmpty();
            ArrayList arrayList = this.f17529;
            if (zIsEmpty) {
                arrayList.remove(c7064);
            } else {
                byte[] bArr = AbstractC7054.f17503;
                arrayList.getClass();
                if (!arrayList.contains(c7064)) {
                    arrayList.add(c7064);
                }
            }
        }
        if (this.f17523) {
            notify();
        } else {
            m12267();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7065 m12270() {
        boolean z;
        TimeZone timeZone = AbstractC7059.f17512;
        while (true) {
            ArrayList arrayList = this.f17529;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC7065 abstractC7065 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC7065 abstractC70652 = (AbstractC7065) ((C7064) it.next()).f17532.get(0);
                long jMax = Math.max(0L, abstractC70652.f17537 - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC7065 != null) {
                        z = true;
                        break;
                    }
                    abstractC7065 = abstractC70652;
                }
            }
            ArrayList arrayList2 = this.f17527;
            if (abstractC7065 != null) {
                TimeZone timeZone2 = AbstractC7059.f17512;
                abstractC7065.f17537 = -1L;
                C7064 c7064 = abstractC7065.f17538;
                c7064.getClass();
                c7064.f17532.remove(abstractC7065);
                arrayList.remove(c7064);
                c7064.f17533 = abstractC7065;
                arrayList2.add(c7064);
                if (z || (!this.f17523 && !arrayList.isEmpty())) {
                    m12267();
                }
                return abstractC7065;
            }
            if (!this.f17523) {
                this.f17523 = true;
                this.f17522 = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = AbstractC7059.f17512;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = AbstractC7059.f17512;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((C7064) arrayList2.get(size)).m12275();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            C7064 c70642 = (C7064) arrayList.get(size2);
                            c70642.m12275();
                            if (c70642.f17532.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f17523 = false;
                }
            } else if (jMin < this.f17522 - jNanoTime) {
                notify();
            }
        }
        return null;
    }
}
