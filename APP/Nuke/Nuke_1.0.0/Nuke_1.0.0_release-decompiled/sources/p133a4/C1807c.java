package p133a4;

import java.util.ArrayList;
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

    public C1807c(C1808d c1808d, String str) {
        AbstractC1665j.m2985e(str, "name");
        this.f6154a = c1808d;
        this.f6155b = str;
        this.f6158e = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static void m3275b(C1807c c1807c, String str, InterfaceC1599a interfaceC1599a) {
        c1807c.getClass();
        AbstractC1665j.m2985e(str, "name");
        AbstractC1665j.m2985e(interfaceC1599a, "block");
        c1807c.m3277c(new C1806b(str, interfaceC1599a), 0L);
    }

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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3278d(p133a4.AbstractC1805a r12, long r13, boolean r15) {
        /*
            r11 = this;
            a4.d r0 = r11.f6154a
            java.util.logging.Logger r0 = r0.f6163b
            java.lang.String r1 = "task"
            p117X2.AbstractC1665j.m2985e(r12, r1)
            a4.c r1 = r12.f6150c
            if (r1 != r11) goto Le
            goto L12
        Le:
            if (r1 != 0) goto L8a
            r12.f6150c = r11
        L12:
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.f6158e
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L39
            long r9 = r12.f6151d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L36
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L89
            java.lang.String r13 = "already scheduled"
            p179i4.AbstractC2352g.m4191d(r0, r12, r11, r13)
            return r7
        L36:
            r5.remove(r6)
        L39:
            r12.f6151d = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5f
            if (r15 == 0) goto L51
            long r3 = r3 - r1
            java.lang.String r15 = p179i4.AbstractC2352g.m4204q(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L5c
        L51:
            long r3 = r3 - r1
            java.lang.String r15 = p179i4.AbstractC2352g.m4204q(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L5c:
            p179i4.AbstractC2352g.m4191d(r0, r12, r11, r15)
        L5f:
            java.util.Iterator r15 = r5.iterator()
            r0 = r7
        L64:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r15.next()
            a4.a r3 = (p133a4.AbstractC1805a) r3
            long r3 = r3.f6151d
            long r3 = r3 - r1
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L78
            goto L7c
        L78:
            int r0 = r0 + 1
            goto L64
        L7b:
            r0 = r8
        L7c:
            if (r0 != r8) goto L82
            int r0 = r5.size()
        L82:
            r5.add(r0, r12)
            if (r0 != 0) goto L89
            r12 = 1
            return r12
        L89:
            return r7
        L8a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p133a4.C1807c.m3278d(a4.a, long, boolean):boolean");
    }

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

    public final String toString() {
        return this.f6155b;
    }
}
