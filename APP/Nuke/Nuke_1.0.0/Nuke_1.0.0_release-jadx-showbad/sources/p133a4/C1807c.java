package p133a4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1776g;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: a4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1807c {

    /* JADX INFO: renamed from: a */
    public final C1808d f6154a;

    /* JADX INFO: renamed from: b */
    public final String f6155b;

    /* JADX INFO: renamed from: c */
    public boolean f6156c;

    /* JADX INFO: renamed from: d */
    public AbstractC1805a f6157d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f6158e;

    /* JADX INFO: renamed from: f */
    public boolean f6159f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1807c(C1808d c1808d, String str) {
        AbstractC1665j.m2985e(str, "name");
        this.f6154a = c1808d;
        this.f6155b = str;
        this.f6158e = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m3275b(C1807c c1807c, String str, InterfaceC1599a interfaceC1599a) {
        c1807c.getClass();
        AbstractC1665j.m2985e(str, "name");
        AbstractC1665j.m2985e(interfaceC1599a, "block");
        c1807c.m3277c(new C1806b(str, interfaceC1599a), 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m3276a() {
        AbstractC1805a abstractC1805a = this.f6157d;
        if (abstractC1805a != null && abstractC1805a.f6149b) {
            this.f6159f = true;
        }
        ArrayList arrayList = this.f6158e;
        boolean z5 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC1805a) arrayList.get(size)).f6149b) {
                Logger logger = this.f6154a.f6163b;
                AbstractC1805a abstractC1805a2 = (AbstractC1805a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC2352g.m4191d(logger, abstractC1805a2, this, "canceled");
                }
                arrayList.remove(size);
                z5 = true;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3277c(AbstractC1805a abstractC1805a, long j5) {
        AbstractC1665j.m2985e(abstractC1805a, "task");
        synchronized (this.f6154a) {
            if (!this.f6156c) {
                if (m3278d(abstractC1805a, j5, false)) {
                    this.f6154a.m3282c(this);
                }
            } else if (abstractC1805a.f6149b) {
                Logger logger = this.f6154a.f6163b;
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC2352g.m4191d(logger, abstractC1805a, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f6154a.f6163b;
                if (logger2.isLoggable(Level.FINE)) {
                    AbstractC2352g.m4191d(logger2, abstractC1805a, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3278d(AbstractC1805a abstractC1805a, long j5, boolean z5) {
        Iterator it;
        int size;
        Logger logger = this.f6154a.f6163b;
        AbstractC1665j.m2985e(abstractC1805a, "task");
        C1807c c1807c = abstractC1805a.f6150c;
        if (c1807c != this) {
            if (c1807c != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            abstractC1805a.f6150c = this;
        }
        long jNanoTime = System.nanoTime();
        long j6 = jNanoTime + j5;
        ArrayList arrayList = this.f6158e;
        int iIndexOf = arrayList.indexOf(abstractC1805a);
        if (iIndexOf == -1) {
            abstractC1805a.f6151d = j6;
            if (logger.isLoggable(Level.FINE)) {
                AbstractC2352g.m4191d(logger, abstractC1805a, this, z5 ? "run again after ".concat(AbstractC2352g.m4204q(j6 - jNanoTime)) : "scheduled after ".concat(AbstractC2352g.m4204q(j6 - jNanoTime)));
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC1805a) it.next()).f6151d - jNanoTime > j5) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, abstractC1805a);
            if (size != 0) {
                return true;
            }
        } else if (abstractC1805a.f6151d > j6) {
            arrayList.remove(iIndexOf);
            abstractC1805a.f6151d = j6;
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
            arrayList.add(size, abstractC1805a);
            if (size != 0) {
            }
        } else if (logger.isLoggable(Level.FINE)) {
            AbstractC2352g.m4191d(logger, abstractC1805a, this, "already scheduled");
            return false;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m3279e() {
        C1808d c1808d = this.f6154a;
        TimeZone timeZone = AbstractC1776g.f6076a;
        synchronized (c1808d) {
            this.f6156c = true;
            if (m3276a()) {
                this.f6154a.m3282c(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f6155b;
    }
}
