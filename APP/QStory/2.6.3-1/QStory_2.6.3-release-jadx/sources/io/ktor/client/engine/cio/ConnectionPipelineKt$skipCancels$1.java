package io.ktor.client.engine.cio;

import io.ktor.client.utils.AbstractC4780;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p073.InterfaceC7680;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.ConnectionPipelineKt$skipCancels$1", m556f = "ConnectionPipeline.kt", m557l = {162, 167, 170, 178, 178}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ConnectionPipelineKt$skipCancels$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5084 $input;
    final /* synthetic */ InterfaceC5079 $output;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipelineKt$skipCancels$1(InterfaceC5079 interfaceC5079, InterfaceC5084 interfaceC5084, InterfaceC5189<? super ConnectionPipelineKt$skipCancels$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$output = interfaceC5079;
        this.$input = interfaceC5084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ConnectionPipelineKt$skipCancels$1(this.$output, this.$input, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ConnectionPipelineKt$skipCancels$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5076.m9216(r10, r0, r16) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5076.m9240(r11, Long.MAX_VALUE, r16) != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r0).m9263(r16) == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:31:0x00a6, B:33:0x00ae, B:37:0x00c4, B:22:0x0073, B:34:0x00b1, B:19:0x0057), top: B:59:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[Catch: all -> 0x00f9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00f9, blocks: (B:40:0x00dc, B:50:0x00fd, B:51:0x0100, B:25:0x007c), top: B:65:0x007c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c1 -> B:20:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d9 -> B:20:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC7680 interfaceC7680;
        Object obj2;
        InterfaceC5084 interfaceC5084;
        InterfaceC5079 interfaceC5079;
        Object objMo8894;
        ByteBuffer byteBuffer;
        InterfaceC5084 interfaceC50842;
        InterfaceC5079 interfaceC50792;
        ByteBuffer byteBuffer2;
        Object objM9235;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    byteBuffer2 = (ByteBuffer) this.L$4;
                    obj2 = this.L$3;
                    interfaceC50792 = (InterfaceC5079) this.L$2;
                    interfaceC50842 = (InterfaceC5084) this.L$1;
                    interfaceC7680 = (InterfaceC7680) this.L$0;
                    AbstractC6017.m10769(obj);
                    objM9235 = obj;
                    if (((Number) objM9235).intValue() < 0) {
                    }
                    return coroutineSingletons;
                }
                if (i == 2) {
                    byteBuffer2 = (ByteBuffer) this.L$4;
                    obj2 = this.L$3;
                    interfaceC50792 = (InterfaceC5079) this.L$2;
                    interfaceC50842 = (InterfaceC5084) this.L$1;
                    interfaceC7680 = (InterfaceC7680) this.L$0;
                    try {
                        AbstractC6017.m10769(obj);
                    } catch (Throwable unused) {
                        this.L$0 = interfaceC7680;
                        this.L$1 = interfaceC50842;
                        this.L$2 = interfaceC50792;
                        this.L$3 = obj2;
                        this.L$4 = byteBuffer2;
                        this.label = 3;
                    }
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            AbstractC6017.m10769(obj);
                            return C6008.f15084;
                        }
                        if (i != 5) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) this.L$0;
                        AbstractC6017.m10769(obj);
                        throw th;
                    }
                    byteBuffer2 = (ByteBuffer) this.L$4;
                    obj2 = this.L$3;
                    interfaceC50792 = (InterfaceC5079) this.L$2;
                    interfaceC50842 = (InterfaceC5084) this.L$1;
                    interfaceC7680 = (InterfaceC7680) this.L$0;
                    AbstractC6017.m10769(obj);
                }
                InterfaceC5084 interfaceC50843 = interfaceC50842;
                byteBuffer = byteBuffer2;
                interfaceC5084 = interfaceC50843;
                InterfaceC5079 interfaceC50793 = interfaceC50792;
                objMo8894 = obj2;
                interfaceC5079 = interfaceC50793;
                byteBuffer.clear();
                this.L$0 = interfaceC7680;
                this.L$1 = interfaceC5084;
                this.L$2 = interfaceC5079;
                this.L$3 = objMo8894;
                this.L$4 = byteBuffer;
                this.label = 1;
                objM9235 = AbstractC5076.m9235(interfaceC5084, byteBuffer, this);
                if (objM9235 != coroutineSingletons) {
                    ByteBuffer byteBuffer3 = byteBuffer;
                    interfaceC50842 = interfaceC5084;
                    byteBuffer2 = byteBuffer3;
                    Object obj3 = objMo8894;
                    interfaceC50792 = interfaceC5079;
                    obj2 = obj3;
                    if (((Number) objM9235).intValue() < 0) {
                        byteBuffer2.flip();
                        this.L$0 = interfaceC7680;
                        this.L$1 = interfaceC50842;
                        this.L$2 = interfaceC50792;
                        this.L$3 = obj2;
                        this.L$4 = byteBuffer2;
                        this.label = 2;
                    } else {
                        interfaceC7680.mo8893(obj2);
                        InterfaceC5079 interfaceC50794 = this.$output;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                    }
                }
                return coroutineSingletons;
            }
            AbstractC6017.m10769(obj);
            try {
                interfaceC7680 = AbstractC4780.f12505;
                interfaceC5084 = this.$input;
                interfaceC5079 = this.$output;
                objMo8894 = interfaceC7680.mo8894();
                try {
                    byteBuffer = (ByteBuffer) objMo8894;
                    byteBuffer.clear();
                    this.L$0 = interfaceC7680;
                    this.L$1 = interfaceC5084;
                    this.L$2 = interfaceC5079;
                    this.L$3 = objMo8894;
                    this.L$4 = byteBuffer;
                    this.label = 1;
                    objM9235 = AbstractC5076.m9235(interfaceC5084, byteBuffer, this);
                    if (objM9235 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = objMo8894;
                }
            } catch (Throwable th3) {
                try {
                    AbstractC5078.m9251(this.$output, th3);
                    throw th3;
                } catch (Throwable th4) {
                    InterfaceC5079 interfaceC50795 = this.$output;
                    this.L$0 = th4;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                    if (((C5081) interfaceC50795).m9263(this) != coroutineSingletons) {
                        throw th4;
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
        interfaceC7680.mo8893(obj2);
        throw th;
    }
}
