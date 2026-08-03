package p000;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Cp */
/* JADX INFO: loaded from: classes.dex */
public class C0118Cp {

    /* JADX INFO: renamed from: a */
    public final long f287a;

    /* JADX INFO: renamed from: b */
    public long f288b;

    /* JADX INFO: renamed from: c */
    public final Object f289c;

    public C0118Cp(long r5) {
        this.f289c = new LinkedHashMap(100, 0.75f, true);
        this.f287a = r5;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Object m186a(Object r2) {
        monitor-enter(this);
        C0075Bp r22 = (C0075Bp) ((LinkedHashMap) this.f289c).get(r2);     // Catch: Throwable -> L7
        if (r22 == null) goto L9;
        Object r23 = r22.f175a;     // Catch: Throwable -> L7
    L10:
        monitor-exit(this);
        return r23;
    L9:
        r23 = null;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public int mo187b(Object r1) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo188c(Object r1, Object r2) {
    }

    /* JADX INFO: renamed from: d */
    public synchronized Object m189d(Object r8, Object r9) {
        monitor-enter(this);
        int r0 = mo187b(r9);     // Catch: Throwable -> L8
        long r1 = r0;
        Object r4 = null;
        if (r1 < this.f287a) goto L10;
        mo188c(r8, r9);     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    L10:
        if (r9 == null) goto L12;
        this.f288b += r1;
    L12:
        LinkedHashMap r12 = (LinkedHashMap) this.f289c;     // Catch: Throwable -> L8
        if (r9 != null) goto L15;
        C0075Bp r2 = null;
    L16:
        C0075Bp r02 = (C0075Bp) r12.put(r8, r2);     // Catch: Throwable -> L8
        if (r02 == null) goto L21;
        this.f288b -= (long) r02.f176b;
        if (r02.f175a.equals(r9) == true) goto L21;
        mo188c(r8, r02.f175a);     // Catch: Throwable -> L8
    L21:
        m190e(this.f287a);     // Catch: Throwable -> L8
        if (r02 == null) goto L24;
        r4 = r02.f175a;     // Catch: Throwable -> L8
    L24:
        monitor-exit(this);
        return r4;
    L15:
        r2 = new C0075Bp(r0, r9);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m190e(long r8) {
        monitor-enter(this);
    L13:
        if (this.f288b <= r8) goto L9;
        Iterator r0 = ((LinkedHashMap) this.f289c).entrySet().iterator();     // Catch: Throwable -> L7
        Map.Entry r1 = (Map.Entry) r0.next();     // Catch: Throwable -> L7
        C0075Bp r2 = (C0075Bp) r1.getValue();     // Catch: Throwable -> L7
        this.f288b -= (long) r2.f176b;
        Object r12 = r1.getKey();     // Catch: Throwable -> L7
        r0.remove();     // Catch: Throwable -> L7
        mo188c(r12, r2.f175a);     // Catch: Throwable -> L7
        goto L13
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public C0118Cp(long r1, long r3, Date r5) {
        this.f287a = r1;
        this.f288b = r3;
        this.f289c = r5;
    }
}
