package p031;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p027.C7037;
import p029.AbstractC7059;
import p068.InterfaceC7372;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f17531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f17532 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC7065 f17533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f17534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7063 f17536;

    public C7064(C7063 c7063, String str) {
        this.f17536 = c7063;
        this.f17535 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12271(C7064 c7064, String str, InterfaceC7372 interfaceC7372) {
        c7064.getClass();
        str.getClass();
        interfaceC7372.getClass();
        c7064.m12274(new C7037(str, interfaceC7372), 0L);
    }

    public final String toString() {
        return this.f17535;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12272() {
        C7063 c7063 = this.f17536;
        TimeZone timeZone = AbstractC7059.f17512;
        synchronized (c7063) {
            this.f17534 = true;
            if (m12275()) {
                this.f17536.m12269(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m12273(AbstractC7065 abstractC7065, long j, boolean z) {
        Iterator it;
        int size;
        Logger logger = this.f17536.f17525;
        abstractC7065.getClass();
        C7064 c7064 = abstractC7065.f17538;
        if (c7064 != this) {
            if (c7064 != null) {
                C6755.m11870("task is in multiple queues");
                return false;
            }
            abstractC7065.f17538 = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f17532;
        int iIndexOf = arrayList.indexOf(abstractC7065);
        if (iIndexOf == -1) {
            abstractC7065.f17537 = j2;
            if (logger.isLoggable(Level.FINE)) {
                AbstractC9004.m14189(logger, abstractC7065, this, z ? "run again after ".concat(AbstractC9004.m14202(j2 - jNanoTime)) : "scheduled after ".concat(AbstractC9004.m14202(j2 - jNanoTime)));
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC7065) it.next()).f17537 - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, abstractC7065);
            if (size != 0) {
                return true;
            }
        } else if (abstractC7065.f17537 > j2) {
            arrayList.remove(iIndexOf);
            abstractC7065.f17537 = j2;
            if (logger.isLoggable(Level.FINE)) {
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                }
                size++;
            }
            if (size == -1) {
            }
            arrayList.add(size, abstractC7065);
            if (size != 0) {
            }
        } else if (logger.isLoggable(Level.FINE)) {
            AbstractC9004.m14189(logger, abstractC7065, this, "already scheduled");
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12274(AbstractC7065 abstractC7065, long j) {
        abstractC7065.getClass();
        synchronized (this.f17536) {
            if (!this.f17534) {
                if (m12273(abstractC7065, j, false)) {
                    this.f17536.m12269(this);
                }
                return;
            }
            boolean z = abstractC7065.f17539;
            Logger logger = this.f17536.f17525;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC9004.m14189(logger, abstractC7065, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC9004.m14189(logger, abstractC7065, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12275() {
        AbstractC7065 abstractC7065 = this.f17533;
        if (abstractC7065 != null && abstractC7065.f17539) {
            this.f17531 = true;
        }
        ArrayList arrayList = this.f17532;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC7065) arrayList.get(size)).f17539) {
                Logger logger = this.f17536.f17525;
                AbstractC7065 abstractC70652 = (AbstractC7065) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC9004.m14189(logger, abstractC70652, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }
}
