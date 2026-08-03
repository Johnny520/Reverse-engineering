package com.shooker;

import java.util.concurrent.atomic.AtomicInteger;
import p014o.C0211a;

/* JADX INFO: loaded from: classes.dex */
public class ReplaceCallback {

    /* JADX INFO: renamed from: a */
    private static C0015a[] f57a = new C0015a[500];

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f58b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static C0015a m67a() {
        C0015a c0015a;
        AtomicInteger atomicInteger = f58b;
        synchronized (atomicInteger) {
            int andIncrement = atomicInteger.getAndIncrement();
            c0015a = new C0015a();
            f57a[andIncrement] = c0015a;
            c0015a.f62c = andIncrement;
        }
        return c0015a;
    }

    public static Object doCall(int i2, Object obj, Object[] objArr) {
        C0211a c0211a = f57a[i2].f63d;
        return c0211a.f820c.mo21n(c0211a, obj, objArr);
    }
}
