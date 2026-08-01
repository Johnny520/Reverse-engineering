package io.ktor.network.sockets;

import androidx.compose.foundation.C1030;
import io.ktor.network.selector.C4002;
import io.ktor.network.selector.C4008;
import io.ktor.network.selector.InterfaceC4005;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4226;
import io.ktor.utils.io.C4229;
import io.ktor.utils.io.C4244;
import io.ktor.utils.io.C4247;
import io.ktor.utils.io.C4248;
import io.ktor.utils.io.C4252;
import io.ktor.utils.io.InterfaceC4237;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5186;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.C5459;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4023 extends C4008 implements InterfaceC4011, InterfaceC4012, InterfaceC4010, InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4005 f12277;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AtomicReference f12278;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5450 f12279;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AtomicBoolean f12280;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AtomicReference f12281;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4023(SocketChannel socketChannel, InterfaceC4005 interfaceC4005) {
        super(socketChannel);
        interfaceC4005.getClass();
        this.f12277 = interfaceC4005;
        this.f12280 = new AtomicBoolean();
        this.f12281 = new AtomicReference();
        this.f12278 = new AtomicReference();
        this.f12279 = AbstractC5398.m10484();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Throwable m8437(AtomicReference atomicReference) {
        CancellationException cancellationExceptionMo10559;
        InterfaceC4237 interfaceC4237 = (InterfaceC4237) atomicReference.get();
        if (interfaceC4237 != null) {
            C4244 c4244 = AbstractC4245.f12750;
            if (!interfaceC4237.mo8656().isCancelled()) {
                interfaceC4237 = null;
            }
            if (interfaceC4237 != null && (cancellationExceptionMo10559 = interfaceC4237.mo8656().mo10559()) != null) {
                return cancellationExceptionMo10559.getCause();
            }
        }
        return null;
    }

    @Override // io.ktor.network.selector.C4008, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12280.compareAndSet(false, true)) {
            C4229 c4229 = (C4229) this.f12281.get();
            if (c4229 != null) {
                AbstractC4243.m8676(c4229.f12729);
            }
            C4226 c4226 = (C4226) this.f12278.get();
            if (c4226 != null) {
                C4244 c4244 = AbstractC4245.f12750;
                ((C5459) c4226.mo8656()).mo10252(null);
            }
            m8439();
        }
    }

    @Override // io.ktor.network.selector.C4008, kotlinx.coroutines.InterfaceC5397
    public final void dispose() {
        close();
    }

    @Override // io.ktor.network.sockets.InterfaceC4011
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC5451 mo8433() {
        return this.f12279;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12279;
    }

    @Override // io.ktor.network.sockets.InterfaceC4012
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C4226 mo8434(C4248 c4248) {
        return (C4226) m8438("reading", c4248, this.f12278, new C4019(this, c4248, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4237 m8438(String str, C4248 c4248, AtomicReference atomicReference, InterfaceC6542 interfaceC6542) throws ClosedChannelException {
        AtomicBoolean atomicBoolean = this.f12280;
        if (atomicBoolean.get()) {
            ClosedChannelException closedChannelException = new ClosedChannelException();
            AbstractC4245.m8702(c4248, closedChannelException);
            throw closedChannelException;
        }
        InterfaceC4237 interfaceC4237 = (InterfaceC4237) interfaceC6542.invoke();
        while (!atomicReference.compareAndSet(null, interfaceC4237)) {
            if (atomicReference.get() != null) {
                IllegalStateException illegalStateException = new IllegalStateException(str.concat(" channel has already been set"));
                C4244 c4244 = AbstractC4245.f12750;
                interfaceC4237.getClass();
                interfaceC4237.mo8656().mo10252(null);
                throw illegalStateException;
            }
        }
        if (atomicBoolean.get()) {
            ClosedChannelException closedChannelException2 = new ClosedChannelException();
            C4244 c42442 = AbstractC4245.f12750;
            interfaceC4237.getClass();
            interfaceC4237.mo8656().mo10252(null);
            AbstractC4245.m8702(c4248, closedChannelException2);
            throw closedChannelException2;
        }
        interfaceC4237.getClass();
        InterfaceC5451 interfaceC5451Mo8656 = interfaceC4237.mo8656();
        interfaceC5451Mo8656.getClass();
        int i = 0;
        interfaceC5451Mo8656.mo10554(new C4252(c4248, i));
        C1030 c1030 = new C1030(this, 8);
        C4244 c42443 = AbstractC4245.f12750;
        interfaceC4237.mo8656().mo10554(new C4247(c1030, i));
        return interfaceC4237;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m8439() {
        Throwable th;
        if (this.f12280.get()) {
            AtomicReference atomicReference = this.f12281;
            InterfaceC4237 interfaceC4237 = (InterfaceC4237) atomicReference.get();
            if (interfaceC4237 != null) {
                C4244 c4244 = AbstractC4245.f12750;
                if (!interfaceC4237.mo8656().mo10560()) {
                    return;
                }
            }
            AtomicReference atomicReference2 = this.f12278;
            InterfaceC4237 interfaceC42372 = (InterfaceC4237) atomicReference2.get();
            if (interfaceC42372 != null) {
                C4244 c42442 = AbstractC4245.f12750;
                if (!interfaceC42372.mo8656().mo10560()) {
                    return;
                }
            }
            Throwable thM8437 = m8437(atomicReference);
            Throwable thM84372 = m8437(atomicReference2);
            InterfaceC4005 interfaceC4005 = this.f12277;
            try {
                ((C4016) this).f12271.close();
                super.close();
                ((C4002) interfaceC4005).m8414(this);
                th = null;
            } catch (Throwable th2) {
                ((C4002) interfaceC4005).m8414(this);
                th = th2;
            }
            if (thM8437 == null) {
                thM8437 = thM84372;
            } else if (thM84372 != null && thM8437 != thM84372) {
                AbstractC5186.m10212(thM8437, thM84372);
            }
            if (thM8437 != null) {
                if (th != null && thM8437 != th) {
                    AbstractC5186.m10212(thM8437, th);
                }
                th = thM8437;
            }
            C5450 c5450 = this.f12279;
            if (th == null) {
                c5450.m10551();
            } else {
                c5450.m10550(th);
            }
        }
    }

    @Override // io.ktor.network.sockets.InterfaceC4010
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C4229 mo8432(C4248 c4248) {
        return (C4229) m8438("writing", c4248, this.f12281, new C4019(this, c4248, 0));
    }
}
