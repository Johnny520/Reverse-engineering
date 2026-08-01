package io.ktor.client.engine.cio;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.AbstractC4748;
import io.ktor.client.plugins.C4759;
import io.ktor.network.sockets.C4858;
import io.ktor.network.sockets.C4861;
import io.ktor.network.sockets.InterfaceC4854;
import io.ktor.network.tls.AbstractC4869;
import io.ktor.utils.p007io.C5081;
import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC6233;
import p257.C8968;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4703 implements InterfaceC6233, Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12435 = AtomicIntegerFieldUpdater.newUpdater(C4703.class, "connections");
    private volatile /* synthetic */ int connections;
    volatile /* synthetic */ long lastActivity;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m8816(ContinuationImpl continuationImpl) throws FailToConnectException, ConnectTimeoutException {
        Endpoint$connect$1 endpoint$connect$1;
        C4861 c4861;
        C4703 c4703;
        InterfaceC4854 interfaceC4854;
        Object obj;
        InterfaceC4854 interfaceC48542;
        C4703 c47032;
        if (continuationImpl instanceof Endpoint$connect$1) {
            endpoint$connect$1 = (Endpoint$connect$1) continuationImpl;
            int i = endpoint$connect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                endpoint$connect$1.label = i - Integer.MIN_VALUE;
            } else {
                endpoint$connect$1 = new Endpoint$connect$1(this, continuationImpl);
            }
        }
        Object obj2 = endpoint$connect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = endpoint$connect$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12435;
        try {
            if (i2 == 1) {
                c4861 = (C4861) endpoint$connect$1.L$2;
                c4703 = (C4703) endpoint$connect$1.L$0;
                AbstractC6017.m10769(obj2);
                interfaceC4854 = (InterfaceC4854) obj2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        interfaceC48542 = (InterfaceC4854) endpoint$connect$1.L$3;
                        C4861 c48612 = (C4861) endpoint$connect$1.L$2;
                        C4703 c47033 = (C4703) endpoint$connect$1.L$0;
                        try {
                            AbstractC6017.m10769(obj2);
                            c47033.getClass();
                            endpoint$connect$1.L$0 = c47033;
                            endpoint$connect$1.L$1 = c48612;
                            endpoint$connect$1.L$2 = interfaceC48542;
                            endpoint$connect$1.L$3 = null;
                            endpoint$connect$1.L$4 = null;
                            endpoint$connect$1.label = 4;
                            new ArrayList();
                            int i3 = AbstractC4869.f12659;
                            throw null;
                        } catch (Throwable unused) {
                            c47032 = c47033;
                        }
                    } else {
                        if (i2 != 4) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        interfaceC48542 = (InterfaceC4854) endpoint$connect$1.L$2;
                        C4861 c48613 = (C4861) endpoint$connect$1.L$1;
                        c47032 = (C4703) endpoint$connect$1.L$0;
                        try {
                            AbstractC6017.m10769(obj2);
                            InterfaceC4854 interfaceC48543 = (InterfaceC4854) obj2;
                            interfaceC48543.getClass();
                            C5081 c5081 = new C5081(false);
                            interfaceC48543.mo8983(c5081);
                            C5081 c50812 = new C5081(false);
                            interfaceC48543.mo8981(c50812);
                            return new Pair(c48613, new C4858(interfaceC48543, c5081, c50812));
                        } catch (Throwable unused2) {
                        }
                    }
                    try {
                        interfaceC48542.close();
                    } catch (Throwable unused3) {
                    }
                    c47032.getClass();
                    throw null;
                }
                int i4 = endpoint$connect$1.I$1;
                int i5 = endpoint$connect$1.I$0;
                c4861 = (C4861) endpoint$connect$1.L$3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) endpoint$connect$1.L$2;
                C8968 c8968 = (C8968) endpoint$connect$1.L$1;
                c4703 = (C4703) endpoint$connect$1.L$0;
                AbstractC6017.m10769(obj2);
                interfaceC4854 = (InterfaceC4854) obj2;
                if (interfaceC4854 == null) {
                    ref$IntRef.element++;
                    if (i4 + 1 < i5) {
                        c4703.getClass();
                        throw null;
                    }
                    atomicIntegerFieldUpdater.decrementAndGet(c4703);
                    int i6 = ref$IntRef.element;
                    c4703.getClass();
                    if (i6 != i5) {
                        throw new FailToConnectException();
                    }
                    InterfaceC9970 interfaceC9970 = AbstractC4748.f12469;
                    c8968.getClass();
                    StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                    sb.append(c8968.f22799);
                    sb.append(", connect_timeout=");
                    C4759 c4759 = (C4759) c8968.m14151();
                    if (c4759 == null || (obj = c4759.f12485) == null) {
                        obj = "unknown";
                    }
                    sb.append(obj);
                    sb.append(" ms]");
                    throw new ConnectTimeoutException(sb.toString(), null);
                }
            }
            interfaceC4854.getClass();
            C5081 c50813 = new C5081(false);
            interfaceC4854.mo8983(c50813);
            C5081 c50814 = new C5081(false);
            interfaceC4854.mo8981(c50814);
            C4858 c4858 = new C4858(interfaceC4854, c50813, c50814);
            c4703.getClass();
            return new Pair(c4861, c4858);
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(endpoint$connect$1);
            throw th;
        }
    }
}
