package io.ktor.network.sockets;

import ec.InterfaceC2126e1;
import ec.InterfaceC2198w1;
import java.io.Closeable;

/* JADX INFO: renamed from: io.ktor.network.sockets.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3425d extends Closeable, InterfaceC2126e1 {

    /* JADX INFO: renamed from: io.ktor.network.sockets.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m12803a(InterfaceC3425d interfaceC3425d) {
            try {
                interfaceC3425d.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    InterfaceC2198w1 mo12802z0();
}
