package io.ktor.network.sockets;

import androidx.compose.foundation.C1030;
import io.ktor.network.selector.C4003;
import io.ktor.network.selector.C4009;
import io.ktor.network.selector.InterfaceC4006;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.AbstractC4246;
import io.ktor.utils.io.C4227;
import io.ktor.utils.io.C4230;
import io.ktor.utils.io.C4245;
import io.ktor.utils.io.C4248;
import io.ktor.utils.io.C4249;
import io.ktor.utils.io.C4253;
import io.ktor.utils.io.InterfaceC4238;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5187;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.C5460;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4024 extends C4009 implements InterfaceC4012, InterfaceC4013, InterfaceC4011, InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4006 f12281;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AtomicReference f12282;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5451 f12283;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AtomicBoolean f12284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AtomicReference f12285;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4024(SocketChannel socketChannel, InterfaceC4006 interfaceC4006) {
        super(socketChannel);
        interfaceC4006.getClass();
        this.f12281 = interfaceC4006;
        this.f12284 = new AtomicBoolean();
        this.f12285 = new AtomicReference();
        this.f12282 = new AtomicReference();
        this.f12283 = AbstractC5399.m10488();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Throwable m8427(AtomicReference atomicReference) {
        CancellationException cancellationExceptionMo10563;
        InterfaceC4238 interfaceC4238 = (InterfaceC4238) atomicReference.get();
        if (interfaceC4238 != null) {
            C4245 c4245 = AbstractC4246.f12754;
            if (!interfaceC4238.mo8646().isCancelled()) {
                interfaceC4238 = null;
            }
            if (interfaceC4238 != null && (cancellationExceptionMo10563 = interfaceC4238.mo8646().mo10563()) != null) {
                return cancellationExceptionMo10563.getCause();
            }
        }
        return null;
    }

    @Override // io.ktor.network.selector.C4009, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12284.compareAndSet(false, true)) {
            C4230 c4230 = (C4230) this.f12285.get();
            if (c4230 != null) {
                AbstractC4244.m8666(c4230.f12733);
            }
            C4227 c4227 = (C4227) this.f12282.get();
            if (c4227 != null) {
                C4245 c4245 = AbstractC4246.f12754;
                ((C5460) c4227.mo8646()).mo10256(null);
            }
            m8428();
        }
    }

    @Override // io.ktor.network.selector.C4009, kotlinx.coroutines.InterfaceC5398
    public final void dispose() {
        close();
    }

    @Override // io.ktor.network.sockets.InterfaceC4012
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final InterfaceC5452 mo8423() {
        return this.f12283;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12283;
    }

    @Override // io.ktor.network.sockets.InterfaceC4013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C4227 mo8424(C4249 c4249) {
        return (C4227) m8429("reading", c4249, this.f12282, new C4020(this, c4249, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m8428() {
        Throwable th;
        if (this.f12284.get()) {
            AtomicReference atomicReference = this.f12285;
            InterfaceC4238 interfaceC4238 = (InterfaceC4238) atomicReference.get();
            if (interfaceC4238 != null) {
                C4245 c4245 = AbstractC4246.f12754;
                if (!interfaceC4238.mo8646().mo10558()) {
                    return;
                }
            }
            AtomicReference atomicReference2 = this.f12282;
            InterfaceC4238 interfaceC42382 = (InterfaceC4238) atomicReference2.get();
            if (interfaceC42382 != null) {
                C4245 c42452 = AbstractC4246.f12754;
                if (!interfaceC42382.mo8646().mo10558()) {
                    return;
                }
            }
            Throwable thM8427 = m8427(atomicReference);
            Throwable thM84272 = m8427(atomicReference2);
            InterfaceC4006 interfaceC4006 = this.f12281;
            try {
                ((C4017) this).f12275.close();
                super.close();
                ((C4003) interfaceC4006).m8404(this);
                th = null;
            } catch (Throwable th2) {
                ((C4003) interfaceC4006).m8404(this);
                th = th2;
            }
            if (thM8427 == null) {
                thM8427 = thM84272;
            } else if (thM84272 != null && thM8427 != thM84272) {
                AbstractC5187.m10216(thM8427, thM84272);
            }
            if (thM8427 != null) {
                if (th != null && thM8427 != th) {
                    AbstractC5187.m10216(thM8427, th);
                }
                th = thM8427;
            }
            C5451 c5451 = this.f12283;
            if (th == null) {
                c5451.m10555();
            } else {
                c5451.m10554(th);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4238 m8429(String str, C4249 c4249, AtomicReference atomicReference, InterfaceC6543 interfaceC6543) throws ClosedChannelException {
        AtomicBoolean atomicBoolean = this.f12284;
        if (atomicBoolean.get()) {
            ClosedChannelException closedChannelException = new ClosedChannelException();
            AbstractC4246.m8692(c4249, closedChannelException);
            throw closedChannelException;
        }
        InterfaceC4238 interfaceC4238 = (InterfaceC4238) interfaceC6543.invoke();
        while (!atomicReference.compareAndSet(null, interfaceC4238)) {
            if (atomicReference.get() != null) {
                IllegalStateException illegalStateException = new IllegalStateException(str.concat(" channel has already been set"));
                C4245 c4245 = AbstractC4246.f12754;
                interfaceC4238.getClass();
                interfaceC4238.mo8646().mo10256(null);
                throw illegalStateException;
            }
        }
        if (atomicBoolean.get()) {
            ClosedChannelException closedChannelException2 = new ClosedChannelException();
            C4245 c42452 = AbstractC4246.f12754;
            interfaceC4238.getClass();
            interfaceC4238.mo8646().mo10256(null);
            AbstractC4246.m8692(c4249, closedChannelException2);
            throw closedChannelException2;
        }
        interfaceC4238.getClass();
        InterfaceC5452 interfaceC5452Mo8646 = interfaceC4238.mo8646();
        interfaceC5452Mo8646.getClass();
        int i = 0;
        interfaceC5452Mo8646.mo10559(new C4253(c4249, i));
        C1030 c1030 = new C1030(this, 8);
        C4245 c42453 = AbstractC4246.f12754;
        interfaceC4238.mo8646().mo10559(new C4248(c1030, i));
        return interfaceC4238;
    }

    @Override // io.ktor.network.sockets.InterfaceC4011
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C4230 mo8422(C4249 c4249) {
        return (C4230) m8429("writing", c4249, this.f12285, new C4020(this, c4249, 0));
    }
}
