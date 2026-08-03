package io.github.cherrywechat.lua;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p000.AbstractC0295Gu;
import p000.InterfaceC0884Ui;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class LuaLocks {
    public static final LuaLocks INSTANCE = null;
    private static final Map<Lua, ReentrantLock> locks = null;

    static {
        INSTANCE = new LuaLocks();
        locks = Collections.synchronizedMap(new WeakHashMap());
    }

    private LuaLocks() {
    }

    public final <T> T withLock(Lua r4, InterfaceC0884Ui r5) {
        AbstractC0295Gu.m625r(-363371413108789L);
        AbstractC0295Gu.m625r(-363388592977973L);
        Map<Lua, ReentrantLock> r0 = locks;
        AbstractC0295Gu.m625r(-362864606967861L);
        monitor-enter(r0);
        AbstractC0295Gu.m625r(-362890376771637L);     // Catch: Throwable -> L8
        ReentrantLock r1 = r0.get(r4);     // Catch: Throwable -> L8
        if (r1 != null) goto L10;
        r1 = new ReentrantLock();     // Catch: Throwable -> L8
        r0.put(r4, r1);     // Catch: Throwable -> L8
    L10:
        ReentrantLock r12 = r1;     // Catch: Throwable -> L8
        monitor-exit(r0);
        r12.lock();
        T r42 = (T) r5.mo6a();
        r12.unlock();
        return r42;
    L16:
        th = move-exception;
        r12.unlock();
        throw th;
    L8:
        th = move-exception;
        throw th;
    }
}
