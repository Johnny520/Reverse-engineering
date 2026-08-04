package yyds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᛱᛷᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0153 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f949 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0105 f950;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f951;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f952;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f953;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public AbstractC0677 f954;

    public C0153(C0105 c0105, String str) {
        this.f950 = c0105;
        this.f951 = str;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m694(C0153 c0153, String str, InterfaceC2266 interfaceC2266) {
        c0153.getClass();
        c0153.m697(new C0939(str, interfaceC2266), 0L);
    }

    public final String toString() {
        return this.f951;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m695() {
        C0105 c0105 = this.f950;
        TimeZone timeZone = AbstractC0795.f3653;
        synchronized (c0105) {
            this.f952 = true;
            if (m696()) {
                this.f950.m509(this);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m696() {
        AbstractC0677 abstractC0677 = this.f954;
        if (abstractC0677 != null && abstractC0677.f3224) {
            this.f953 = true;
        }
        ArrayList arrayList = this.f949;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC0677) arrayList.get(size)).f3224) {
                Logger logger = this.f950.f743;
                AbstractC0677 abstractC06772 = (AbstractC0677) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC2328.m4331(logger, abstractC06772, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m697(AbstractC0677 abstractC0677, long j) {
        synchronized (this.f950) {
            if (!this.f952) {
                if (m698(abstractC0677, j, false)) {
                    this.f950.m509(this);
                }
                return;
            }
            boolean z = abstractC0677.f3224;
            Logger logger = this.f950.f743;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC2328.m4331(logger, abstractC0677, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC2328.m4331(logger, abstractC0677, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m698(AbstractC0677 abstractC0677, long j, boolean z) {
        Iterator it;
        int size;
        Logger logger = this.f950.f743;
        C0153 c0153 = abstractC0677.f3225;
        if (c0153 != this) {
            if (c0153 != null) {
                C0188.m800("task is in multiple queues");
                return false;
            }
            abstractC0677.f3225 = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f949;
        int iIndexOf = arrayList.indexOf(abstractC0677);
        if (iIndexOf == -1) {
            abstractC0677.f3226 = j2;
            if (logger.isLoggable(Level.FINE)) {
                AbstractC2328.m4331(logger, abstractC0677, this, z ? "run again after ".concat(AbstractC2328.m4339(j2 - jNanoTime)) : "scheduled after ".concat(AbstractC2328.m4339(j2 - jNanoTime)));
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC0677) it.next()).f3226 - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, abstractC0677);
            if (size != 0) {
                return true;
            }
        } else if (abstractC0677.f3226 > j2) {
            arrayList.remove(iIndexOf);
            abstractC0677.f3226 = j2;
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
            arrayList.add(size, abstractC0677);
            if (size != 0) {
            }
        } else if (logger.isLoggable(Level.FINE)) {
            AbstractC2328.m4331(logger, abstractC0677, this, "already scheduled");
            return false;
        }
        return false;
    }
}
