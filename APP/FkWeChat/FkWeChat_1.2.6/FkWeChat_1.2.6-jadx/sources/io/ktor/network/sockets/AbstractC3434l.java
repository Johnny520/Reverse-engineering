package io.ktor.network.sockets;

import io.ktor.network.sockets.AbstractC3447y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;
import p215oc.C5729x;
import p228p8.InterfaceC5976f;
import p339x6.InterfaceC9457j;

/* JADX INFO: renamed from: io.ktor.network.sockets.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3434l {
    /* JADX INFO: renamed from: a */
    public static final ServerSocketChannel m12820a(SelectorProvider selectorProvider, AbstractC3442t abstractC3442t) throws IllegalAccessException, InvocationTargetException {
        selectorProvider.getClass();
        if (abstractC3442t == null) {
            return selectorProvider.openServerSocketChannel();
        }
        if (abstractC3442t instanceof C3435m) {
            return selectorProvider.openServerSocketChannel();
        }
        if (!(abstractC3442t instanceof C3426d0)) {
            C5729x.m23182a();
            return null;
        }
        Object objInvoke = SelectorProvider.class.getMethod("openServerSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        objInvoke.getClass();
        return (ServerSocketChannel) objInvoke;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m12821b(InterfaceC9457j interfaceC9457j, AbstractC3442t abstractC3442t, AbstractC3447y.a aVar, InterfaceC5976f interfaceC5976f) throws IllegalAccessException, IOException, InvocationTargetException {
        ServerSocketChannel serverSocketChannelM12820a = m12820a(interfaceC9457j.getProvider(), abstractC3442t);
        try {
            if (abstractC3442t instanceof C3435m) {
                serverSocketChannelM12820a.getClass();
                AbstractC3437o.m12826a(serverSocketChannelM12820a, aVar);
            }
            serverSocketChannelM12820a.getClass();
            AbstractC3437o.m12828c(serverSocketChannelM12820a);
            C3440r c3440r = new C3440r(serverSocketChannelM12820a, interfaceC9457j);
            if (AbstractC3437o.m12827b()) {
                c3440r.mo12830Z().bind(abstractC3442t != null ? AbstractC3436n.m12824a(abstractC3442t) : null, aVar.m12854h());
                return c3440r;
            }
            c3440r.mo12830Z().socket().bind(abstractC3442t != null ? AbstractC3436n.m12824a(abstractC3442t) : null, aVar.m12854h());
            return c3440r;
        } catch (Throwable th) {
            serverSocketChannelM12820a.close();
            throw th;
        }
    }
}
