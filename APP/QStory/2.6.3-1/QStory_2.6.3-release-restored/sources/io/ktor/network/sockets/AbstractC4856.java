package io.ktor.network.sockets;

import androidx.compose.foundation.C1868;
import io.ktor.network.selector.C4835;
import io.ktor.network.selector.C4841;
import io.ktor.network.selector.InterfaceC4838;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5059;
import io.ktor.utils.p007io.C5062;
import io.ktor.utils.p007io.C5077;
import io.ktor.utils.p007io.C5080;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.C5085;
import io.ktor.utils.p007io.InterfaceC5070;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6019;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4856 extends C4841 implements InterfaceC4844, InterfaceC4845, InterfaceC4843, InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4838 f12626;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AtomicReference f12627;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6283 f12628;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AtomicBoolean f12629;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AtomicReference f12630;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4856(SocketChannel socketChannel, InterfaceC4838 interfaceC4838) {
        super(socketChannel);
        interfaceC4838.getClass();
        this.f12626 = interfaceC4838;
        this.f12629 = new AtomicBoolean();
        this.f12630 = new AtomicReference();
        this.f12627 = new AtomicReference();
        this.f12628 = AbstractC6231.m11047();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Throwable m8986(AtomicReference atomicReference) {
        CancellationException cancellationExceptionMo11122;
        InterfaceC5070 interfaceC5070 = (InterfaceC5070) atomicReference.get();
        if (interfaceC5070 != null) {
            C5077 c5077 = AbstractC5078.f13099;
            if (!interfaceC5070.mo9205().isCancelled()) {
                interfaceC5070 = null;
            }
            if (interfaceC5070 != null && (cancellationExceptionMo11122 = interfaceC5070.mo9205().mo11122()) != null) {
                return cancellationExceptionMo11122.getCause();
            }
        }
        return null;
    }

    @Override // io.ktor.network.selector.C4841, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12629.compareAndSet(false, true)) {
            C5062 c5062 = (C5062) this.f12630.get();
            if (c5062 != null) {
                AbstractC5076.m9225(c5062.f13078);
            }
            C5059 c5059 = (C5059) this.f12627.get();
            if (c5059 != null) {
                C5077 c5077 = AbstractC5078.f13099;
                ((C6292) c5059.mo9205()).mo10815(null);
            }
            m8987();
        }
    }

    @Override // io.ktor.network.selector.C4841, kotlinx.coroutines.InterfaceC6230
    public final void dispose() {
        close();
    }

    @Override // io.ktor.network.sockets.InterfaceC4844
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final InterfaceC6284 mo8982() {
        return this.f12628;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12628;
    }

    @Override // io.ktor.network.sockets.InterfaceC4845
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C5059 mo8983(C5081 c5081) {
        return (C5059) m8988("reading", c5081, this.f12627, new C4852(this, c5081, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m8987() {
        Throwable th;
        if (this.f12629.get()) {
            AtomicReference atomicReference = this.f12630;
            InterfaceC5070 interfaceC5070 = (InterfaceC5070) atomicReference.get();
            if (interfaceC5070 != null) {
                C5077 c5077 = AbstractC5078.f13099;
                if (!interfaceC5070.mo9205().mo11117()) {
                    return;
                }
            }
            AtomicReference atomicReference2 = this.f12627;
            InterfaceC5070 interfaceC50702 = (InterfaceC5070) atomicReference2.get();
            if (interfaceC50702 != null) {
                C5077 c50772 = AbstractC5078.f13099;
                if (!interfaceC50702.mo9205().mo11117()) {
                    return;
                }
            }
            Throwable thM8986 = m8986(atomicReference);
            Throwable thM89862 = m8986(atomicReference2);
            InterfaceC4838 interfaceC4838 = this.f12626;
            try {
                ((C4849) this).f12620.close();
                super.close();
                ((C4835) interfaceC4838).m8963(this);
                th = null;
            } catch (Throwable th2) {
                ((C4835) interfaceC4838).m8963(this);
                th = th2;
            }
            if (thM8986 == null) {
                thM8986 = thM89862;
            } else if (thM89862 != null && thM8986 != thM89862) {
                AbstractC6019.m10775(thM8986, thM89862);
            }
            if (thM8986 != null) {
                if (th != null && thM8986 != th) {
                    AbstractC6019.m10775(thM8986, th);
                }
                th = thM8986;
            }
            C6283 c6283 = this.f12628;
            if (th == null) {
                c6283.m11114();
            } else {
                c6283.m11113(th);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5070 m8988(String str, C5081 c5081, AtomicReference atomicReference, InterfaceC7372 interfaceC7372) throws ClosedChannelException {
        AtomicBoolean atomicBoolean = this.f12629;
        if (atomicBoolean.get()) {
            ClosedChannelException closedChannelException = new ClosedChannelException();
            AbstractC5078.m9251(c5081, closedChannelException);
            throw closedChannelException;
        }
        InterfaceC5070 interfaceC5070 = (InterfaceC5070) interfaceC7372.invoke();
        while (!atomicReference.compareAndSet(null, interfaceC5070)) {
            if (atomicReference.get() != null) {
                IllegalStateException illegalStateException = new IllegalStateException(str.concat(" channel has already been set"));
                C5077 c5077 = AbstractC5078.f13099;
                interfaceC5070.getClass();
                interfaceC5070.mo9205().mo10815(null);
                throw illegalStateException;
            }
        }
        if (atomicBoolean.get()) {
            ClosedChannelException closedChannelException2 = new ClosedChannelException();
            C5077 c50772 = AbstractC5078.f13099;
            interfaceC5070.getClass();
            interfaceC5070.mo9205().mo10815(null);
            AbstractC5078.m9251(c5081, closedChannelException2);
            throw closedChannelException2;
        }
        interfaceC5070.getClass();
        InterfaceC6284 interfaceC6284Mo9205 = interfaceC5070.mo9205();
        interfaceC6284Mo9205.getClass();
        int i = 0;
        interfaceC6284Mo9205.mo11118(new C5085(c5081, i));
        C1868 c1868 = new C1868(this, 8);
        C5077 c50773 = AbstractC5078.f13099;
        interfaceC5070.mo9205().mo11118(new C5080(c1868, i));
        return interfaceC5070;
    }

    @Override // io.ktor.network.sockets.InterfaceC4843
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C5062 mo8981(C5081 c5081) {
        return (C5062) m8988("writing", c5081, this.f12630, new C4852(this, c5081, 0));
    }
}
