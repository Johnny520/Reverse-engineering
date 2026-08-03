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
    public static final LuaLocks INSTANCE = new LuaLocks();
    private static final Map<Lua, ReentrantLock> locks = Collections.synchronizedMap(new WeakHashMap());

    private LuaLocks() {
    }

    public final <T> T withLock(Lua lua, InterfaceC0884Ui interfaceC0884Ui) {
        ReentrantLock reentrantLock;
        AbstractC0295Gu.m625r(-363371413108789L);
        AbstractC0295Gu.m625r(-363388592977973L);
        Map<Lua, ReentrantLock> map = locks;
        AbstractC0295Gu.m625r(-362864606967861L);
        synchronized (map) {
            try {
                AbstractC0295Gu.m625r(-362890376771637L);
                ReentrantLock reentrantLock2 = map.get(lua);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    map.put(lua, reentrantLock2);
                }
                reentrantLock = reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        reentrantLock.lock();
        try {
            return (T) interfaceC0884Ui.mo6a();
        } finally {
            reentrantLock.unlock();
        }
    }
}
