package com.shooker;

import fun.box001.internal.hookbackend.HookRecord;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ReplaceCallback {

    /* JADX INFO: renamed from: a */
    private static HookReplacementRecord[] f57a;

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f58b = null;

    static {
        f57a = new HookReplacementRecord[500];
        f58b = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static HookReplacementRecord m67a() {
        AtomicInteger r0 = f58b;
        monitor-enter(r0);
        int r1 = r0.getAndIncrement();     // Catch: Throwable -> L7
        HookReplacementRecord r2 = new HookReplacementRecord();     // Catch: Throwable -> L7
        f57a[r1] = r2;     // Catch: Throwable -> L7
        r2.f62c = r1;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r2;
    L7:
        th = move-exception;
        throw th;
    }

    public static Object doCall(int r1, Object r2, Object[] r3) {
        HookRecord r12 = f57a[r1].f63d;
        return r12.f820c.mo21n(r12, r2, r3);
    }
}
