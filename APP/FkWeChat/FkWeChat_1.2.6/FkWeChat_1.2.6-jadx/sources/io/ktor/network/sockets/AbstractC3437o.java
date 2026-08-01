package io.ktor.network.sockets;

import io.ktor.network.sockets.AbstractC3447y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/* JADX INFO: renamed from: io.ktor.network.sockets.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3437o {

    /* JADX INFO: renamed from: a */
    public static final boolean f9480a;

    static {
        boolean z10;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f9480a = z10;
    }

    /* JADX INFO: renamed from: a */
    public static final void m12826a(SelectableChannel selectableChannel, AbstractC3447y abstractC3447y) throws IllegalAccessException, IOException, InvocationTargetException {
        selectableChannel.getClass();
        abstractC3447y.getClass();
        if (selectableChannel instanceof SocketChannel) {
            if (!AbstractC3424c0.m12800c(abstractC3447y.m12850d(), AbstractC3424c0.f9426a.m12801a())) {
                if (f9480a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.IP_TOS, Integer.valueOf(abstractC3447y.m12850d() & 255));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTrafficClass(abstractC3447y.m12850d() & 255);
                }
            }
            if (abstractC3447y.m12848b()) {
                if (f9480a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((SocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (abstractC3447y.m12849c()) {
                C3448z.f9510a.m12860c((SocketChannel) selectableChannel);
            }
            if (abstractC3447y instanceof AbstractC3447y.d) {
                AbstractC3447y.d dVar = (AbstractC3447y.d) abstractC3447y;
                Integer numValueOf = Integer.valueOf(dVar.m12856h());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    if (f9480a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_RCVBUF, Integer.valueOf(iIntValue));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setReceiveBufferSize(iIntValue);
                    }
                }
                Integer numValueOf2 = Integer.valueOf(dVar.m12857i());
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    int iIntValue2 = numValueOf2.intValue();
                    if (f9480a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_SNDBUF, Integer.valueOf(iIntValue2));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSendBufferSize(iIntValue2);
                    }
                }
            }
        }
        if (selectableChannel instanceof ServerSocketChannel) {
            if (abstractC3447y.m12848b()) {
                if (f9480a) {
                    ((ServerSocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((ServerSocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (abstractC3447y.m12849c()) {
                C3448z.f9510a.m12859b((ServerSocketChannel) selectableChannel);
            }
        }
        if (selectableChannel instanceof DatagramChannel) {
            if (!AbstractC3424c0.m12800c(abstractC3447y.m12850d(), AbstractC3424c0.f9426a.m12801a())) {
                if (f9480a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.IP_TOS, Integer.valueOf(abstractC3447y.m12850d() & 255));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setTrafficClass(abstractC3447y.m12850d() & 255);
                }
            }
            if (abstractC3447y.m12848b()) {
                if (f9480a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((DatagramChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (abstractC3447y.m12849c()) {
                C3448z.f9510a.m12858a((DatagramChannel) selectableChannel);
            }
            if (abstractC3447y instanceof AbstractC3447y.d) {
                AbstractC3447y.d dVar2 = (AbstractC3447y.d) abstractC3447y;
                Integer numValueOf3 = Integer.valueOf(dVar2.m12856h());
                if (numValueOf3.intValue() <= 0) {
                    numValueOf3 = null;
                }
                if (numValueOf3 != null) {
                    int iIntValue3 = numValueOf3.intValue();
                    if (f9480a) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_RCVBUF, Integer.valueOf(iIntValue3));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setReceiveBufferSize(iIntValue3);
                    }
                }
                Integer numValueOf4 = Integer.valueOf(dVar2.m12857i());
                Integer num = numValueOf4.intValue() > 0 ? numValueOf4 : null;
                if (num != null) {
                    int iIntValue4 = num.intValue();
                    if (f9480a) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_SNDBUF, Integer.valueOf(iIntValue4));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setSendBufferSize(iIntValue4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12827b() {
        return f9480a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m12828c(SelectableChannel selectableChannel) throws IOException {
        selectableChannel.getClass();
        selectableChannel.configureBlocking(false);
    }
}
