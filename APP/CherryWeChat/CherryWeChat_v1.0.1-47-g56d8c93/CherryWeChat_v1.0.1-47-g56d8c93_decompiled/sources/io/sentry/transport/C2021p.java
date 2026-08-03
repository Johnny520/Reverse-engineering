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

    /* JADX INFO: renamed from: b */
    public final C2046v2 f7205b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f7206c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f7207d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public Timer f7208e = null;

    /* JADX INFO: renamed from: f */
    public final C2029a f7209f = new C2029a();

    /* JADX INFO: renamed from: a */
    public final C2009d f7204a = C2009d.f7188a;

    public C2021p(C2046v2 c2046v2) {
        this.f7205b = c2046v2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r c1981rM4173a = this.f7209f.m4173a();
        try {
            Timer timer = this.f7208e;
            if (timer != null) {
                timer.cancel();
                this.f7208e = null;
            }
            c1981rM4173a.close();
            this.f7207d.clear();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4169d(EnumC1929n enumC1929n, Date date) {
        ConcurrentHashMap concurrentHashMap = this.f7206c;
        Date date2 = (Date) concurrentHashMap.get(enumC1929n);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(enumC1929n, date);
            Iterator it = this.f7207d.iterator();
            while (it.hasNext()) {
                ((InterfaceC2020o) it.next()).mo3877m(this);
            }
            C1981r c1981rM4173a = this.f7209f.m4173a();
            try {
                if (this.f7208e == null) {
                    this.f7208e = new Timer(true);
                }
                this.f7208e.schedule(new C1677U(1, this), date);
                c1981rM4173a.close();
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4170f(EnumC1929n enumC1929n) {
        Date date;
        this.f7204a.getClass();
        Date date2 = new Date(System.currentTimeMillis());
        EnumC1929n enumC1929n2 = EnumC1929n.All;
        ConcurrentHashMap concurrentHashMap = this.f7206c;
        Date date3 = (Date) concurrentHashMap.get(enumC1929n2);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC1929n.Unknown.equals(enumC1929n) || (date = (Date) concurrentHashMap.get(enumC1929n)) == null) {
            return false;
        }
        return !date2.after(date);
    }
}
