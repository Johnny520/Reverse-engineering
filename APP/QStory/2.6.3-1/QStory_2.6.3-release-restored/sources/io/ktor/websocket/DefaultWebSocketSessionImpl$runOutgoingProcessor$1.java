package io.ktor.websocket;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.cio.ChannelIOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", m556f = "DefaultWebSocketSession.kt", m557l = {246, 257, 257, 257, Opcodes.INVOKE_POLYMORPHIC, 257, 257, Opcodes.CONST_METHOD_HANDLE, 257, 257}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultWebSocketSessionImpl$runOutgoingProcessor$1 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    int label;
    final /* synthetic */ C5093 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$runOutgoingProcessor$1(C5093 c5093, InterfaceC5189<? super DefaultWebSocketSessionImpl$runOutgoingProcessor$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c5093;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultWebSocketSessionImpl$runOutgoingProcessor$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r5 != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (io.ktor.websocket.AbstractC5089.m9273(r6, new io.ktor.websocket.C5095(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (io.ktor.websocket.AbstractC5089.m9273(r6, new io.ktor.websocket.C5095(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        if (io.ktor.websocket.AbstractC5089.m9273(r6, new io.ktor.websocket.C5095(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        if (io.ktor.websocket.AbstractC5089.m9273(r6, new io.ktor.websocket.C5095(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        if (io.ktor.websocket.AbstractC5089.m9273(r6, new io.ktor.websocket.C5095(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) != r0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
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
        ?? r5;
        ?? r52;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            try {
                try {
                } catch (CancellationException unused) {
                    C5093 c5093 = this.this$0;
                    C5095 c5095 = new C5095(CloseReason$Codes.NORMAL, "");
                    this.label = 5;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5093.f13132;
                    Object objM9276 = c5093.m9276(c5095, null, this);
                    r5 = this;
                    if (objM9276 != obj2) {
                        r5.this$0.f13135.mo10815(null);
                        InterfaceC5090 interfaceC5090 = r5.this$0.f13140;
                        r5.label = 6;
                    }
                } catch (ClosedSendChannelException unused2) {
                    this.this$0.f13135.mo10815(null);
                    InterfaceC5090 interfaceC50902 = this.this$0.f13140;
                    this.label = 3;
                }
            } catch (ChannelIOException unused3) {
                this.this$0.f13135.mo10815(null);
                InterfaceC5090 interfaceC50903 = this.this$0.f13140;
                this.label = 7;
            } catch (ClosedReceiveChannelException unused4) {
                this.this$0.f13135.mo10815(null);
                InterfaceC5090 interfaceC50904 = this.this$0.f13140;
                this.label = 4;
            } catch (Throwable th) {
                this.this$0.f13135.m10801(AbstractC6231.m11050("Failed to send frame", th), true);
                InterfaceC5090 interfaceC50905 = this.this$0.f13140;
                this.label = 8;
                Object objM9271 = AbstractC5089.m9271(interfaceC50905, th, this);
                r52 = this;
                if (objM9271 != obj2) {
                }
                return obj2;
            }
        } catch (Throwable th2) {
            this.this$0.f13135.mo10815(null);
            InterfaceC5090 interfaceC50906 = this.this$0.f13140;
            this.L$0 = th2;
            this.label = 10;
            if (AbstractC5089.m9273(interfaceC50906, new C5095(CloseReason$Codes.NORMAL, ""), this) != obj2) {
                throw th2;
            }
        }
        switch (this.label) {
            case 0:
                AbstractC6017.m10769(obj);
                C5093 c50932 = this.this$0;
                this.label = 1;
                if (C5093.m9274(c50932, this) != obj2) {
                    this.this$0.f13135.mo10815(null);
                    InterfaceC5090 interfaceC50907 = this.this$0.f13140;
                    this.label = 2;
                    this = AbstractC5089.m9273(interfaceC50907, new C5095(CloseReason$Codes.NORMAL, ""), this);
                    break;
                }
                return obj2;
            case 1:
                AbstractC6017.m10769(obj);
                this.this$0.f13135.mo10815(null);
                InterfaceC5090 interfaceC509072 = this.this$0.f13140;
                this.label = 2;
                this = AbstractC5089.m9273(interfaceC509072, new C5095(CloseReason$Codes.NORMAL, ""), this);
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 9:
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            case 5:
                AbstractC6017.m10769(obj);
                this = this;
                r5.this$0.f13135.mo10815(null);
                InterfaceC5090 interfaceC50908 = r5.this$0.f13140;
                r5.label = 6;
                break;
            case 8:
                AbstractC6017.m10769(obj);
                this = this;
                r52.this$0.f13135.mo10815(null);
                InterfaceC5090 interfaceC50909 = r52.this$0.f13140;
                r52.label = 9;
                break;
            case 10:
                Throwable th3 = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                throw th3;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
