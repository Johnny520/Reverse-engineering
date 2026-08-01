package io.ktor.network.sockets;

import com.alibaba.fastjson2.JSONB;
import p024b9.AbstractC1043k;
import p172l8.C4718y;

/* JADX INFO: renamed from: io.ktor.network.sockets.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3424c0 {

    /* JADX INFO: renamed from: a */
    public static final a f9426a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final byte f9427b = m12799b((byte) 0);

    /* JADX INFO: renamed from: c */
    public static final byte f9428c = m12799b((byte) 2);

    /* JADX INFO: renamed from: d */
    public static final byte f9429d = m12799b((byte) 4);

    /* JADX INFO: renamed from: e */
    public static final byte f9430e = m12799b((byte) 8);

    /* JADX INFO: renamed from: f */
    public static final byte f9431f = m12799b(JSONB.Constants.BC_INT32_NUM_16);

    /* JADX INFO: renamed from: c */
    public static final boolean m12800c(byte b10, byte b11) {
        return C4718y.m18819h(b10, b11);
    }

    /* JADX INFO: renamed from: io.ktor.network.sockets.c0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final byte m12801a() {
            return AbstractC3424c0.f9427b;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte m12799b(byte b10) {
        return b10;
    }
}
