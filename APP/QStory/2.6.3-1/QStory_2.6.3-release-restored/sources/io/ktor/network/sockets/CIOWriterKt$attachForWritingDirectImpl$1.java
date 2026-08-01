package io.ktor.network.sockets;

import io.ktor.network.selector.C4835;
import io.ktor.network.selector.InterfaceC4838;
import io.ktor.network.selector.InterfaceC4840;
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.util.AbstractC4879;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5061;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", m556f = "CIOWriter.kt", m557l = {33, 79, 50}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CIOWriterKt$attachForWritingDirectImpl$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C5081 $channel;
    final /* synthetic */ WritableByteChannel $nioChannel;
    final /* synthetic */ InterfaceC4840 $selectable;
    final /* synthetic */ InterfaceC4838 $selector;
    final /* synthetic */ AbstractC4850 $socketOptions;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOWriterKt$attachForWritingDirectImpl$1(InterfaceC4840 interfaceC4840, AbstractC4850 abstractC4850, C5081 c5081, InterfaceC4838 interfaceC4838, WritableByteChannel writableByteChannel, InterfaceC5189<? super CIOWriterKt$attachForWritingDirectImpl$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$selectable = interfaceC4840;
        this.$channel = c5081;
        this.$selector = interfaceC4838;
        this.$nioChannel = writableByteChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$1(AbstractC4879 abstractC4879, Ref$IntRef ref$IntRef, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            do {
                ref$IntRef.element = writableByteChannel.write(byteBuffer);
                if (byteBuffer.hasRemaining()) {
                }
            } while (ref$IntRef.element > 0);
        }
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CIOWriterKt$attachForWritingDirectImpl$1 cIOWriterKt$attachForWritingDirectImpl$1 = new CIOWriterKt$attachForWritingDirectImpl$1(this.$selectable, null, this.$channel, this.$selector, this.$nioChannel, interfaceC5189);
        cIOWriterKt$attachForWritingDirectImpl$1.L$0 = obj;
        return cIOWriterKt$attachForWritingDirectImpl$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5061 c5061, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CIOWriterKt$attachForWritingDirectImpl$1) create(c5061, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Path cross not found for [B:47:0x00eb, B:78:?], limit reached: 77 */
    /* JADX WARN: Path cross not found for [B:78:?, B:47:0x00eb], limit reached: 77 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x0019, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0015, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:27:0x0073, B:29:0x0087, B:31:0x008d, B:45:0x00e7, B:47:0x00eb, B:32:0x0095, B:36:0x00a9, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:44:0x00e0, B:15:0x0034), top: B:73:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x0019, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0015, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:27:0x0073, B:29:0x0087, B:31:0x008d, B:45:0x00e7, B:47:0x00eb, B:32:0x0095, B:36:0x00a9, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:44:0x00e0, B:15:0x0034), top: B:73:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0015, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:27:0x0073, B:29:0x0087, B:31:0x008d, B:45:0x00e7, B:47:0x00eb, B:32:0x0095, B:36:0x00a9, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:44:0x00e0, B:15:0x0034), top: B:73:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e9 -> B:20:0x004f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0106 -> B:20:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        WritableByteChannel writableByteChannel;
        final AbstractC4879 abstractC4879;
        final Ref$IntRef ref$IntRef;
        InterfaceC5084 interfaceC5084;
        InterfaceC7387 interfaceC7387;
        int i;
        boolean z;
        AbstractC4879 abstractC48792;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    abstractC48792 = (AbstractC4879) this.L$0;
                } else if (i2 == 2) {
                    i = this.I$0;
                    interfaceC7387 = (InterfaceC7387) this.L$3;
                    interfaceC5084 = (InterfaceC5084) this.L$2;
                    ref$IntRef = (Ref$IntRef) this.L$1;
                    abstractC4879 = (AbstractC4879) this.L$0;
                    AbstractC6017.m10769(obj);
                    if (interfaceC5084.mo9200() && i > 0) {
                        throw new EOFException("Not enough bytes available: required " + i + " but " + AbstractC5076.m9242(interfaceC5084) + " available");
                    }
                    if (AbstractC5076.m9242(interfaceC5084) > 0) {
                        AbstractC7684.m12637(interfaceC5084.mo9202(), interfaceC7387);
                    }
                    if (ref$IntRef.element == 0) {
                        InterfaceC4840 interfaceC4840 = this.$selectable;
                        SelectInterest selectInterest = SelectInterest.WRITE;
                        interfaceC4840.mo8973(selectInterest, true);
                        InterfaceC4838 interfaceC4838 = this.$selector;
                        InterfaceC4840 interfaceC48402 = this.$selectable;
                        this.L$0 = abstractC4879;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        if (((C4835) interfaceC4838).m8962(interfaceC48402, selectInterest, this) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    abstractC48792 = (AbstractC4879) this.L$0;
                }
                AbstractC6017.m10769(obj);
                abstractC4879 = abstractC48792;
            } else {
                AbstractC6017.m10769(obj);
                this.$selectable.mo8973(SelectInterest.WRITE, false);
                abstractC4879 = null;
            }
            while (!this.$channel.mo9200()) {
                if (AbstractC5076.m9242(this.$channel) == 0) {
                    C5081 c5081 = this.$channel;
                    this.L$0 = abstractC4879;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                    if (c5081.mo9201(1, this) == coroutineSingletons) {
                    }
                } else {
                    ref$IntRef = new Ref$IntRef();
                    interfaceC5084 = this.$channel;
                    final WritableByteChannel writableByteChannel2 = this.$nioChannel;
                    interfaceC7387 = new InterfaceC7387(abstractC4879, ref$IntRef, writableByteChannel2) { // from class: io.ktor.network.sockets.飘花落叶言子楪苏世哲兰

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                        public final /* synthetic */ WritableByteChannel f12638;

                        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                        public final /* synthetic */ Ref$IntRef f12639;

                        {
                            this.f12639 = ref$IntRef;
                            this.f12638 = writableByteChannel2;
                        }

                        @Override // p068.InterfaceC7387
                        public final Object invoke(Object obj2) {
                            return CIOWriterKt$attachForWritingDirectImpl$1.invokeSuspend$lambda$1(null, this.f12639, this.f12638, (ByteBuffer) obj2);
                        }
                    };
                    if (AbstractC5076.m9242(interfaceC5084) <= 0 || AbstractC5076.m9242(interfaceC5084) < 1) {
                        this.L$0 = abstractC4879;
                        this.L$1 = ref$IntRef;
                        this.L$2 = interfaceC5084;
                        this.L$3 = interfaceC7387;
                        this.I$0 = 1;
                        this.label = 2;
                        if (interfaceC5084.mo9201(1, this) != coroutineSingletons) {
                            i = 1;
                            if (interfaceC5084.mo9200()) {
                                throw new EOFException("Not enough bytes available: required " + i + " but " + AbstractC5076.m9242(interfaceC5084) + " available");
                            }
                            if (AbstractC5076.m9242(interfaceC5084) > 0) {
                            }
                            if (ref$IntRef.element == 0) {
                            }
                            while (!this.$channel.mo9200()) {
                            }
                        }
                    } else {
                        AbstractC7684.m12637(interfaceC5084.mo9202(), interfaceC7387);
                        if (ref$IntRef.element == 0) {
                        }
                        while (!this.$channel.mo9200()) {
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (z) {
                try {
                    if (AbstractC4853.f12625) {
                        ((SocketChannel) writableByteChannel).shutdownOutput();
                    } else {
                        ((SocketChannel) writableByteChannel).socket().shutdownOutput();
                    }
                } catch (ClosedChannelException unused) {
                }
            }
            return C6008.f15084;
        } finally {
            this.$selectable.mo8973(SelectInterest.WRITE, false);
            writableByteChannel = this.$nioChannel;
            if (writableByteChannel instanceof SocketChannel) {
                try {
                    if (AbstractC4853.f12625) {
                        ((SocketChannel) writableByteChannel).shutdownOutput();
                    } else {
                        ((SocketChannel) writableByteChannel).socket().shutdownOutput();
                    }
                } catch (ClosedChannelException unused2) {
                }
            }
        }
    }
}
