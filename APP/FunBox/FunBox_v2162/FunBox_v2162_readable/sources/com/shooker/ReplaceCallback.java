package com.shooker;

import fun.box001.internal.hookbackend.HookRecord;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ReplaceCallback {

    /* JADX INFO: renamed from: a */
    private static HookReplacementRecord[] f57a = new HookReplacementRecord[500];

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f58b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static HookReplacementRecord m67a() {
        HookReplacementRecord hookReplacementRecord;
        AtomicInteger atomicInteger = f58b;
        synchronized (atomicInteger) {
            int andIncrement = atomicInteger.getAndIncrement();
            hookReplacementRecord = new HookReplacementRecord();
            f57a[andIncrement] = hookReplacementRecord;
            hookReplacementRecord.f62c = andIncrement;
        }
        return hookReplacementRecord;
    }

    public static Object doCall(int i2, Object obj, Object[] objArr) {
        HookRecord hookRecord = f57a[i2].f63d;
        return hookRecord.f820c.mo21n(hookRecord, obj, objArr);
    }
}
