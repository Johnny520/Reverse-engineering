package io.ktor.network.sockets;

import ec.AbstractC2108a2;
import ec.InterfaceC2208z;
import io.ktor.network.sockets.InterfaceC3439q;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;
import p339x6.AbstractC9456i;
import p339x6.EnumC9454g;
import p339x6.InterfaceC9457j;
import p376zd.C9987e;

/* JADX INFO: renamed from: io.ktor.network.sockets.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3440r extends AbstractC9456i implements InterfaceC3439q {

    /* JADX INFO: renamed from: t */
    public final ServerSocketChannel f9484t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC9457j f9485u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC2208z f9486v;

    /* JADX INFO: renamed from: io.ktor.network.sockets.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f9487q;

        /* JADX INFO: renamed from: s */
        public int f9489s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9487q = obj;
            this.f9489s |= Integer.MIN_VALUE;
            return C3440r.this.m12836l(this);
        }
    }

    public C3440r(ServerSocketChannel serverSocketChannel, InterfaceC9457j interfaceC9457j) {
        serverSocketChannel.getClass();
        interfaceC9457j.getClass();
        this.f9484t = serverSocketChannel;
        this.f9485u = interfaceC9457j;
        if (mo12830Z().isBlocking()) {
            C9987e.m38645a("Channel need to be configured as non-blocking.");
            throw null;
        }
        this.f9486v = AbstractC2108a2.m7602b(null, 1, null);
    }

    @Override // io.ktor.network.sockets.InterfaceC3425d
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public InterfaceC2208z mo12802z0() {
        return this.f9486v;
    }

    @Override // io.ktor.network.sockets.InterfaceC3428f
    /* JADX INFO: renamed from: M */
    public Object mo12806M(InterfaceC5976f interfaceC5976f) throws IOException {
        SocketChannel socketChannelAccept = mo12830Z().accept();
        return socketChannelAccept != null ? m12837n(socketChannelAccept) : m12836l(interfaceC5976f);
    }

    @Override // ec.InterfaceC2126e1
    /* JADX INFO: renamed from: a */
    public void mo7628a() {
        InterfaceC3439q.a.m12833a(this);
    }

    @Override // p339x6.AbstractC9456i, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                mo12830Z().close();
                this.f9485u.mo36806A(this);
                mo12802z0().mo7943r0();
            } catch (Throwable th) {
                this.f9485u.mo36806A(this);
                throw th;
            }
        } catch (Throwable th2) {
            mo12802z0().mo7942j(th2);
        }
    }

    @Override // io.ktor.network.sockets.InterfaceC3419a
    public AbstractC3442t getLocalAddress() {
        SocketAddress localAddress = AbstractC3437o.m12827b() ? mo12830Z().getLocalAddress() : mo12830Z().socket().getLocalSocketAddress();
        localAddress.getClass();
        return AbstractC3436n.m12825b(localAddress);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12836l(p228p8.InterfaceC5976f r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.network.sockets.C3440r.a
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.network.sockets.r$a r0 = (io.ktor.network.sockets.C3440r.a) r0
            int r1 = r0.f9489s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9489s = r1
            goto L18
        L13:
            io.ktor.network.sockets.r$a r0 = new io.ktor.network.sockets.r$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9487q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f9489s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p172l8.AbstractC4713t.m18808b(r5)
            goto L43
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L30:
            p172l8.AbstractC4713t.m18808b(r5)
        L33:
            x6.g r5 = p339x6.EnumC9454g.f32140x
            r4.mo36857m0(r5, r3)
            x6.j r2 = r4.f9485u
            r0.f9489s = r3
            java.lang.Object r5 = r2.mo36859G0(r4, r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.nio.channels.ServerSocketChannel r5 = r4.mo12830Z()
            java.nio.channels.SocketChannel r5 = r5.accept()
            if (r5 == 0) goto L33
            io.ktor.network.sockets.s r5 = r4.m12837n(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.C3440r.m12836l(p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC3441s m12837n(SocketChannel socketChannel) throws IOException {
        mo36857m0(EnumC9454g.f32140x, false);
        socketChannel.configureBlocking(false);
        if (getLocalAddress() instanceof C3435m) {
            if (AbstractC3437o.m12827b()) {
                socketChannel.setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.TRUE);
            } else {
                socketChannel.socket().setTcpNoDelay(true);
            }
        }
        return new C3446x(socketChannel, this.f9485u, null, 4, null);
    }

    @Override // p339x6.InterfaceC9455h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ServerSocketChannel mo12830Z() {
        return this.f9484t;
    }
}
