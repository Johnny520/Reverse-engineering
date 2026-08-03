package io.sentry.transport;

import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1929n;
import io.sentry.android.core.C1677U;
import io.sentry.util.C2029a;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.transport.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2021p implements Closeable {

    /* JADX INFO: renamed from: a */
    public final C2009d f7204a;

    /* JADX INFO: renamed from: b */
    public final C2046v2 f7205b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f7206c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f7207d;

    /* JADX INFO: renamed from: e */
    public Timer f7208e;

    /* JADX INFO: renamed from: f */
    public final C2029a f7209f;

    public C2021p(C2046v2 r2) {
        this.f7206c = new ConcurrentHashMap();
        this.f7207d = new CopyOnWriteArrayList();
        this.f7208e = null;
        this.f7209f = new C2029a();
        this.f7204a = C2009d.f7188a;
        this.f7205b = r2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r r0 = this.f7209f.m4173a();
        Timer r1 = this.f7208e;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.cancel();     // Catch: Throwable -> L7
        this.f7208e = null;     // Catch: Throwable -> L7
    L9:
        r0.close();
        this.f7207d.clear();
        return;
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    }

    /* JADX INFO: renamed from: d */
    public final void m4169d(EnumC1929n r4, Date r5) {
        ConcurrentHashMap r0 = this.f7206c;
        Date r1 = (Date) r0.get(r4);
        if (r1 != null) goto L5;
    L8:
        r0.put(r4, r5);
        Iterator r42 = this.f7207d.iterator();
    L10:
        if (r42.hasNext() == false) goto L12;
        ((InterfaceC2020o) r42.next()).mo3877m(this);
        goto L10
    L12:
        C1981r r43 = this.f7209f.m4173a();
    L16:
        th = move-exception;
        r43.close();     // Catch: Throwable -> L23
    L25:
        throw th;
    L23:
        th = move-exception;
        th.addSuppressed(th);
        goto L25
    L14:
        if (this.f7208e != null) goto L18;
        this.f7208e = new Timer(true);     // Catch: Throwable -> L16
    L18:
        this.f7208e.schedule(new C1677U(1, this), r5);     // Catch: Throwable -> L16
        r43.close();
        return;
    L5:
        if (r5.after(r1) == true) goto L8;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4170f(EnumC1929n r5) {
        this.f7204a.getClass();
        Date r0 = new Date(System.currentTimeMillis());
        EnumC1929n r1 = EnumC1929n.All;
        ConcurrentHashMap r2 = this.f7206c;
        Date r12 = (Date) r2.get(r1);
        if (r12 == null) goto L8;
        if (r0.after(r12) == true) goto L8;
        return true;
    L8:
        if (EnumC1929n.Unknown.equals(r5) == false) goto L11;
        return false;
    L11:
        if (((Date) r2.get(r5)) != null) goto L13;
        return false;
    L13:
        return !r0.after(r5);
    }
}
