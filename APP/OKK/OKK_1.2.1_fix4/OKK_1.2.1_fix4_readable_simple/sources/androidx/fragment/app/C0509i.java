package androidx.fragment.app;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.RunnableC0019E;
import p031Q0.C0316p;
import p089x0.C1121e;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0509i {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1435a;

    /* JADX INFO: renamed from: b */
    public final C0316p f1436b;

    /* JADX INFO: renamed from: c */
    public ArrayList f1437c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f1438d;

    /* JADX INFO: renamed from: e */
    public final int f1439e;

    public C0509i() {
        this.f1435a = new ArrayList();
        this.f1436b = new C0316p();
        new C1121e(this, 26);
        this.f1438d = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new C1121e(this, 25);
        new CopyOnWriteArrayList();
        final int r1 = 0;
        new C0506f(this, r1);
        final int r12 = 1;
        new C0506f(this, r12);
        final int r13 = 2;
        new C0506f(this, r13);
        final int r14 = 3;
        new C0506f(this, r14);
        this.f1439e = -1;
        new ArrayDeque();
        new RunnableC0019E(7, this);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1236g(AbstractComponentCallbacksC0505e r2) {
        if (r2 != null) goto L6;
        return true;
    L6:
        if (r2.f1427d == false) goto L8;
        r2.getClass();
        return true;
    L8:
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m1237a(boolean r4) {
        Iterator r02 = this.f1436b.m711c().iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        AbstractComponentCallbacksC0505e r1 = (AbstractComponentCallbacksC0505e) r02.next();
        if (r1 == null) goto L4;
        r1.getClass();
        if (r4 == false) goto L4;
        r1.f1426c.m1237a(true);
        goto L4
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1238b() {
        int r1 = 0;
        if (this.f1439e >= 1) goto L5;
        return false;
    L5:
        Iterator r02 = this.f1436b.m711c().iterator();
        ArrayList r3 = null;
        boolean r4 = false;
    L7:
        if (r02.hasNext() == false) goto L18;
        AbstractComponentCallbacksC0505e r5 = (AbstractComponentCallbacksC0505e) r02.next();
        if (r5 == null) goto L7;
        if (m1236g(r5) == false) goto L7;
        r5.getClass();
        if (r5.f1426c.m1238b() == false) goto L7;
        if (r3 != null) goto L16;
        r3 = new ArrayList();
    L16:
        r3.add(r5);
        r4 = true;
        goto L7
    L18:
        if (this.f1437c != null) goto L20;
    L27:
        this.f1437c = r3;
        return r4;
    L20:
        if (r1 >= this.f1437c.size()) goto L27;
        AbstractComponentCallbacksC0505e r03 = (AbstractComponentCallbacksC0505e) this.f1437c.get(r1);
        if (r3 != null) goto L24;
    L25:
        r03.getClass();
    L26:
        r1 = r1 + 1;
        goto L20
    L24:
        if (r3.contains(r03) == true) goto L26;
        goto L25
    }

    /* JADX INFO: renamed from: c */
    public final void m1239c(boolean r4) {
        Iterator r02 = this.f1436b.m711c().iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        AbstractComponentCallbacksC0505e r1 = (AbstractComponentCallbacksC0505e) r02.next();
        if (r1 == null) goto L4;
        r1.getClass();
        if (r4 == false) goto L4;
        r1.f1426c.m1239c(true);
        goto L4
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1240d() {
        if (this.f1439e >= 1) goto L5;
        return false;
    L5:
        Iterator r02 = this.f1436b.m711c().iterator();
    L7:
        if (r02.hasNext() == false) goto L13;
        AbstractComponentCallbacksC0505e r3 = (AbstractComponentCallbacksC0505e) r02.next();
        if (r3 == null) goto L7;
        r3.getClass();
        if (r3.f1426c.m1240d() == false) goto L7;
        return true;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1241e() {
        boolean r1 = false;
        if (this.f1439e >= 1) goto L5;
        return false;
    L5:
        Iterator r02 = this.f1436b.m711c().iterator();
    L7:
        if (r02.hasNext() == false) goto L15;
        AbstractComponentCallbacksC0505e r3 = (AbstractComponentCallbacksC0505e) r02.next();
        if (r3 == null) goto L7;
        if (m1236g(r3) == false) goto L7;
        r3.getClass();
        if (r3.f1426c.m1241e() == false) goto L7;
        r1 = true;
        goto L7
    L15:
        return r1;
    }

    /* JADX INFO: renamed from: f */
    public final void m1242f() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder(128);
        r02.append("FragmentManager{");
        r02.append(Integer.toHexString(System.identityHashCode(this)));
        r02.append(" in ");
        r02.append("null");
        r02.append("}}");
        return r02.toString();
    }
}
