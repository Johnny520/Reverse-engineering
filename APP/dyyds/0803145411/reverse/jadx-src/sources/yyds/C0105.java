package yyds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᛱᛴᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0105 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final Logger f737 = Logger.getLogger(C0105.class.getName());

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final C0105 f738 = new C0105(new C2014(new ThreadFactoryC1763(AbstractC2104.m4015(new StringBuilder(), AbstractC0795.f3654, " TaskRunner"), true)));

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public long f741;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2014 f742;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f744;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f747;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f748;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Logger f743 = f737;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f746 = 10000;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final ArrayList f739 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ArrayList f740 = new ArrayList();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final RunnableC0871 f745 = new RunnableC0871(16, this);

    public C0105(C2014 c2014) {
        this.f742 = c2014;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m506() {
        TimeZone timeZone = AbstractC0795.f3653;
        int i = this.f747;
        if (i > this.f744) {
            return;
        }
        this.f747 = i + 1;
        ((ThreadPoolExecutor) this.f742.f10074).execute(this.f745);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m507(AbstractC0677 abstractC0677, long j, boolean z) {
        TimeZone timeZone = AbstractC0795.f3653;
        C0153 c0153 = abstractC0677.f3225;
        if (c0153.f954 != abstractC0677) {
            C0188.m800("Check failed.");
            return;
        }
        boolean z2 = c0153.f953;
        c0153.f953 = false;
        c0153.f954 = null;
        this.f739.remove(c0153);
        if (j != -1 && !z2 && !c0153.f952) {
            c0153.m698(abstractC0677, j, true);
        }
        if (c0153.f949.isEmpty()) {
            return;
        }
        this.f740.add(c0153);
        if (z) {
            return;
        }
        m506();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final AbstractC0677 m508() {
        boolean z;
        TimeZone timeZone = AbstractC0795.f3653;
        while (true) {
            ArrayList arrayList = this.f740;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC0677 abstractC0677 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC0677 abstractC06772 = (AbstractC0677) ((C0153) it.next()).f949.get(0);
                long jMax = Math.max(0L, abstractC06772.f3226 - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC0677 != null) {
                        z = true;
                        break;
                    }
                    abstractC0677 = abstractC06772;
                }
            }
            ArrayList arrayList2 = this.f739;
            if (abstractC0677 != null) {
                TimeZone timeZone2 = AbstractC0795.f3653;
                abstractC0677.f3226 = -1L;
                C0153 c0153 = abstractC0677.f3225;
                c0153.f949.remove(abstractC0677);
                arrayList.remove(c0153);
                c0153.f954 = abstractC0677;
                arrayList2.add(c0153);
                if (z || (!this.f748 && !arrayList.isEmpty())) {
                    m506();
                }
                return abstractC0677;
            }
            if (!this.f748) {
                this.f748 = true;
                this.f741 = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = AbstractC0795.f3653;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = AbstractC0795.f3653;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((C0153) arrayList2.get(size)).m696();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            C0153 c01532 = (C0153) arrayList.get(size2);
                            c01532.m696();
                            if (c01532.f949.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f748 = false;
                }
            } else if (jMin < this.f741 - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m509(C0153 c0153) {
        TimeZone timeZone = AbstractC0795.f3653;
        if (c0153.f954 == null) {
            boolean zIsEmpty = c0153.f949.isEmpty();
            ArrayList arrayList = this.f740;
            if (zIsEmpty) {
                arrayList.remove(c0153);
            } else {
                byte[] bArr = AbstractC1429.f6782;
                if (!arrayList.contains(c0153)) {
                    arrayList.add(c0153);
                }
            }
        }
        if (this.f748) {
            notify();
        } else {
            m506();
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0153 m510() {
        int i;
        synchronized (this) {
            i = this.f746;
            this.f746 = i + 1;
        }
        return new C0153(this, AbstractC0897.m1989(i, "Q"));
    }
}
