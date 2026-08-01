package io.ktor.http.cio;

import io.ktor.utils.p007io.C5072;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$2", m556f = "Multipart.kt", m557l = {414, 414}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class MultipartKt$trySkipDelimiterSuspend$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ ByteBuffer $delimiter;
    final /* synthetic */ Ref$BooleanRef $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$trySkipDelimiterSuspend$2(ByteBuffer byteBuffer, Ref$BooleanRef ref$BooleanRef, InterfaceC5189<? super MultipartKt$trySkipDelimiterSuspend$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$delimiter = byteBuffer;
        this.$result = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MultipartKt$trySkipDelimiterSuspend$2 multipartKt$trySkipDelimiterSuspend$2 = new MultipartKt$trySkipDelimiterSuspend$2(this.$delimiter, this.$result, interfaceC5189);
        multipartKt$trySkipDelimiterSuspend$2.L$0 = obj;
        return multipartKt$trySkipDelimiterSuspend$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5072 c5072, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MultipartKt$trySkipDelimiterSuspend$2) create(c5072, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        C5072 c5072;
        C5072 c50722;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5072 c50723 = (C5072) this.L$0;
            int iRemaining = this.$delimiter.remaining();
            this.L$0 = c50723;
            this.label = 1;
            Object objM9213 = c50723.m9213(iRemaining, this);
            if (objM9213 != coroutineSingletons) {
                c5072 = c50723;
                obj = objM9213;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c50722 = (C5072) this.L$0;
            AbstractC6017.m10769(obj);
            if (((Boolean) obj).booleanValue()) {
                this.$result.element = false;
                return c6008;
            }
            c5072 = c50722;
            if (AbstractC4801.m8922(c5072, this.$delimiter) != this.$delimiter.remaining()) {
                return c6008;
            }
            C6755.m11866("Broken delimiter occurred");
            return null;
        }
        c5072 = (C5072) this.L$0;
        AbstractC6017.m10769(obj);
        if (!((Boolean) obj).booleanValue()) {
            this.L$0 = c5072;
            this.label = 2;
            obj = c5072.m9213(1, this);
            if (obj != coroutineSingletons) {
                c50722 = c5072;
                if (((Boolean) obj).booleanValue()) {
                }
            }
            return coroutineSingletons;
        }
        if (AbstractC4801.m8922(c5072, this.$delimiter) != this.$delimiter.remaining()) {
        }
    }
}
