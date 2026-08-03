package fun.box001.internal.hookbackend.xposed;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.hookbackend.HookRecord;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
final class C0213b extends RuntimeDexGenerator {
    @Override // fun.box001.internal.dexbridge.RuntimeDexGenerator
    /* JADX INFO: renamed from: n */
    public final Object mo21n(HookRecord hookRecord, Object obj, Object[] objArr) {
        return SHookerHookBackend.m543a(hookRecord, obj, objArr);
    }
}
