package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.L1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1604L1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5784a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5785b;

    public /* synthetic */ CallableC1604L1(int i, Object obj) {
        this.f5784a = i;
        this.f5785b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5784a) {
            case 0:
                return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
            case 1:
                return ((C1901c) this.f5785b).m4103l();
            case 2:
                return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
            case 3:
                return ((C1901c) this.f5785b).m4103l();
            case 4:
                return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
            case 5:
                return ((C1901c) this.f5785b).m4103l();
            case 6:
                return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
            case 7:
                return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return ((C1901c) this.f5785b).m4103l();
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
            case 10:
                return ((C1901c) this.f5785b).m4103l();
            case 11:
                return ((C1901c) this.f5785b).m4103l();
            case 12:
                return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
            case 13:
                return ((C1901c) this.f5785b).m4103l();
            case 14:
                return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
            case 15:
                return ((C1901c) this.f5785b).m4103l();
            default:
                C1598K c1598k = (C1598K) this.f5785b;
                try {
                    c1598k.f5770e.getClass();
                    c1598k.f5767b = InetAddress.getLocalHost().getCanonicalHostName();
                    c1598k.f5768c = System.currentTimeMillis() + c1598k.f5766a;
                    c1598k.f5769d.set(false);
                    return null;
                } catch (Throwable th) {
                    c1598k.f5769d.set(false);
                    throw th;
                }
        }
    }
}
