package io.ktor.client.engine.cio;

import io.ktor.client.plugins.AbstractC4748;
import io.ktor.client.plugins.C4759;
import io.ktor.network.sockets.C4858;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p079.InterfaceC7691;
import p257.C8966;
import p257.C8968;
import p259.C8976;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.Endpoint", m556f = "Endpoint.kt", m557l = {101, 130, 132, 133}, m558m = "makeDedicatedRequest")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class Endpoint$makeDedicatedRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4703 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$makeDedicatedRequest$1(C4703 c4703, InterfaceC5189<? super Endpoint$makeDedicatedRequest$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4703;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0 A[LOOP:0: B:54:0x00e0->B:58:0x00ea, LOOP_START, PHI: r0
  0x00e0: PHI (r0v7 java.lang.Throwable) = (r0v4 java.lang.Throwable), (r0v8 java.lang.Throwable) binds: [B:53:0x00de, B:58:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? endpoint$makeDedicatedRequest$1;
        Throwable th;
        C8968 c8968;
        Throwable cause;
        Throwable cause2;
        Object obj2;
        Object obj3;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4703 c4703 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C4703.f12435;
        c4703.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            this = this;
        } else {
            endpoint$makeDedicatedRequest$1 = new Endpoint$makeDedicatedRequest$1(c4703, this);
        }
        Object objM8816 = endpoint$makeDedicatedRequest$1.result;
        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = endpoint$makeDedicatedRequest$1.label;
        Throwable th2 = null;
        try {
        } catch (Throwable th3) {
            th = th3;
            c8968 = endpoint$makeDedicatedRequest$1;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC6017.m10769(objM8816);
                    return (C8966) objM8816;
                }
                if (i2 == 3) {
                    C8976 c8976 = (C8976) endpoint$makeDedicatedRequest$1.L$4;
                    InterfaceC5079 interfaceC5079 = (InterfaceC5079) endpoint$makeDedicatedRequest$1.L$3;
                    InterfaceC5084 interfaceC5084 = (InterfaceC5084) endpoint$makeDedicatedRequest$1.L$2;
                    InterfaceC5192 interfaceC5192 = (InterfaceC5192) endpoint$makeDedicatedRequest$1.L$1;
                    C8968 c89682 = (C8968) endpoint$makeDedicatedRequest$1.L$0;
                    try {
                        AbstractC6017.m10769(objM8816);
                        endpoint$makeDedicatedRequest$1.L$0 = c89682;
                        endpoint$makeDedicatedRequest$1.L$1 = null;
                        endpoint$makeDedicatedRequest$1.L$2 = null;
                        endpoint$makeDedicatedRequest$1.L$3 = null;
                        endpoint$makeDedicatedRequest$1.L$4 = null;
                        endpoint$makeDedicatedRequest$1.label = 4;
                        try {
                            objM8816 = AbstractC6231.m11029(interfaceC5192, new UtilsKt$readResponse$2(interfaceC5084, interfaceC5079, interfaceC5192, c8976, c89682, null), endpoint$makeDedicatedRequest$1);
                            if (objM8816 != obj4) {
                            }
                            return obj4;
                        } catch (Throwable th4) {
                            th = th4;
                            c8968 = c89682;
                            c8968.getClass();
                            cause = th.getCause();
                            if (cause != null) {
                            }
                            if (th2 instanceof SocketTimeoutException) {
                            }
                            if (cause2 != null) {
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    if (i2 != 4) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(objM8816);
                }
                return (C8966) objM8816;
            }
            C8968 c89683 = (C8968) endpoint$makeDedicatedRequest$1.L$1;
            Object obj5 = (C4703) endpoint$makeDedicatedRequest$1.L$0;
            try {
                AbstractC6017.m10769(objM8816);
                obj3 = obj5;
                Pair pair = (Pair) objM8816;
                C5081 c5081 = ((C4858) pair.component2()).f12636;
                obj3.getClass();
                throw null;
            } catch (Throwable th6) {
                th = th6;
                c8968 = c89683;
            }
            c8968.getClass();
            cause = th.getCause();
            if (cause != null) {
                while (true) {
                    if ((cause != null ? cause.getCause() : null) == null) {
                        break;
                    }
                    cause = cause.getCause();
                }
                th2 = cause;
            }
            if (th2 instanceof SocketTimeoutException) {
                cause2 = th.getCause();
            } else {
                Throwable cause3 = th.getCause();
                InterfaceC9970 interfaceC9970 = AbstractC4748.f12469;
                StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
                sb.append(c8968.f22799);
                sb.append(", socket_timeout=");
                C4759 c4759 = (C4759) c8968.m14151();
                if (c4759 == null || (obj2 = c4759.f12484) == null) {
                    obj2 = "unknown";
                }
                sb.append(obj2);
                sb.append("] ms");
                cause2 = new SocketTimeoutException(sb.toString());
                cause2.initCause(cause3);
            }
            if (cause2 != null) {
                throw th;
            }
            throw cause2;
        }
        AbstractC6017.m10769(objM8816);
        try {
            endpoint$makeDedicatedRequest$1.L$0 = c4703;
            endpoint$makeDedicatedRequest$1.L$1 = null;
            endpoint$makeDedicatedRequest$1.L$2 = null;
            endpoint$makeDedicatedRequest$1.label = 1;
            objM8816 = c4703.m8816(endpoint$makeDedicatedRequest$1);
            if (objM8816 != obj4) {
                obj3 = c4703;
                Pair pair2 = (Pair) objM8816;
                C5081 c50812 = ((C4858) pair2.component2()).f12636;
                obj3.getClass();
                throw null;
            }
            return obj4;
        } catch (Throwable th7) {
            th = th7;
            c8968 = 0;
        }
    }
}
