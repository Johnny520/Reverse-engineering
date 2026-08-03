package p050c0;

import android.view.View;
import android.view.ViewGroup;
import de.robv.android.xposed.AbstractC0762d;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p031Q0.AbstractC0307g;
import p031Q0.C0312l;

/* JADX INFO: renamed from: c0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0594I {

    /* JADX INFO: renamed from: a */
    public static final C0594I f1812a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1813b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1814c = null;

    /* JADX INFO: renamed from: d */
    public static final Set f1815d = null;

    /* JADX INFO: renamed from: e */
    public static final Set f1816e = null;

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f1817f = null;

    static {
        f1812a = new C0594I();
        f1813b = new AtomicBoolean(false);
        f1814c = new AtomicBoolean(false);
        Set r02 = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(r02, "newSetFromMap(...)");
        f1815d = r02;
        Set r03 = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(r03, "newSetFromMap(...)");
        f1816e = r03;
        f1817f = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1469a(ViewGroup r3) {
        if (C0710y.m1809d() == false) goto L19;
        Set r02 = f1815d;
        monitor-enter(r02);
        if (r02.add(r3) == true) goto L11;
        monitor-exit(r02);
        return;
    L11:
        monitor-exit(r02);
        r3.post(new RunnableC0579D(r3, 3));
        r3.postDelayed(new RunnableC0579D(r3, 4), 400);
        return;
    L14:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static void m1470b(ViewGroup r7) {
        if (C0710y.m1809d() == true) goto L5;
        return;
    L5:
        AtomicBoolean r2 = f1814c;
        if (r2.compareAndSet(false, true) == true) goto L25;
        return;
    L25:
        C0312l r4 = new C0312l();     // Catch: Throwable -> L14
        m1471c(r7, new C0591H(0, r4));     // Catch: Throwable -> L14
        int r72 = f1817f.incrementAndGet();     // Catch: Throwable -> L14
        int r42 = r4.f594a;     // Catch: Throwable -> L14
        if (r42 > 0) goto L11;
    L16:
        r2.set(false);
        return;
    L11:
        if (r72 > 3) goto L16;
        m1472d("hideTitles count=" + r42 + " (#" + r72 + ")");     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        m1472d("hideTitles error: " + th.getClass().getSimpleName() + ": " + th.getMessage());     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        r2.set(false);
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public static void m1471c(View r4, C0591H r5) {
        r5.invoke(r4);
        if ((r4 instanceof ViewGroup) == false) goto L7;
        ViewGroup r42 = (ViewGroup) r4;
        int r02 = r42.getChildCount();
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L9;
        View r2 = r42.getChildAt(r1);
        AbstractC0307g.m702d(r2, "getChildAt(...)");
        m1471c(r2, r5);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    /* JADX INFO: renamed from: d */
    public static void m1472d(String r2) {
        AbstractC0762d.m1954d("[OKK-BottomTab] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
