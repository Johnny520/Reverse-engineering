package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Rf */
/* JADX INFO: loaded from: classes.dex */
public final class C0752Rf {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2389a;

    public C0752Rf(int r1) {
        switch(r1) {
            case 1: goto L9;
            case 2: goto L7;
            case 3: goto L5;
            default: goto L3;
        };
    L3:
        this.f2389a = new ArrayList();
        return;
    L5:
        this.f2389a = new ArrayList();
        return;
    L7:
        this.f2389a = new ArrayList();
        return;
    L9:
        this.f2389a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC2647vw m1540a(Class r5) {
        monitor-enter(this);
        int r0 = this.f2389a.size();     // Catch: Throwable -> L10
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L13;
        C2690ww r2 = (C2690ww) this.f2389a.get(r1);     // Catch: Throwable -> L10
        if (r2.f9259a.isAssignableFrom(r5) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        InterfaceC2647vw r52 = r2.f9260b;     // Catch: Throwable -> L10
        monitor-exit(this);
        return r52;
    L13:
        monitor-exit(this);
        return null;
    L10:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public synchronized ArrayList m1541b(Class r5, Class r6) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L8
        if (r6.isAssignableFrom(r5) == false) goto L10;
        r0.add(r6);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r0;
    L10:
        Iterator r1 = this.f2389a.iterator();     // Catch: Throwable -> L8
    L12:
        if (r1.hasNext() == false) goto L24;
        C0055BB r2 = (C0055BB) r1.next();     // Catch: Throwable -> L8
        if (r2.f127a.isAssignableFrom(r5) == true) goto L16;
    L18:
        boolean r3 = false;
    L19:
        if (r3 == false) goto L12;
        if (r0.contains(r2.f128b) == true) goto L12;
        r0.add(r2.f128b);     // Catch: Throwable -> L8
        goto L12
    L16:
        if (r6.isAssignableFrom(r2.f128b) == false) goto L18;
        r3 = true;
        goto L19
    L24:
        monitor-exit(this);
        return r0;
    L8:
        th = move-exception;
        throw th;
    }
}
