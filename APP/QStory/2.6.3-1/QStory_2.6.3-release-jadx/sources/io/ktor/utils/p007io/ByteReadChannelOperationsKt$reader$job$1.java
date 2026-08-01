package io.ktor.utils.p007io;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6271;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1", m556f = "ByteReadChannelOperations.kt", m557l = {291, 301, 302, 301, 302, 301, 302}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ByteReadChannelOperationsKt$reader$job$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ C5081 $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteReadChannelOperationsKt$reader$job$1(InterfaceC7383 interfaceC7383, C5081 c5081, InterfaceC5189<? super ByteReadChannelOperationsKt$reader$job$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$block = interfaceC7383;
        this.$channel = c5081;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ByteReadChannelOperationsKt$reader$job$1 byteReadChannelOperationsKt$reader$job$1 = new ByteReadChannelOperationsKt$reader$job$1(this.$block, this.$channel, interfaceC5189);
        byteReadChannelOperationsKt$reader$job$1.L$0 = obj;
        return byteReadChannelOperationsKt$reader$job$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ByteReadChannelOperationsKt$reader$job$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:32:0x0096, B:34:0x00a4), top: B:78:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.飘花落叶言子苏世楪兰哲] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Result.Failure failure;
        C5081 c5081;
        C5081 c50812;
        Throwable th;
        Throwable th2;
        InterfaceC6233 interfaceC6233;
        C6283 c6283;
        C5081 c50813;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        C6008 c6008 = C6008.f15084;
        try {
            try {
                try {
                } catch (Throwable th3) {
                    failure = new Result.Failure(th3);
                    Result.m9304constructorimpl(failure);
                    return c6008;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            failure = new Result.Failure(th5);
            Result.m9304constructorimpl(failure);
            return c6008;
        }
        switch (r1) {
            case 0:
                AbstractC6017.m10769(obj);
                interfaceC6233 = (InterfaceC6233) this.L$0;
                C6283 c62832 = new C6283(AbstractC6231.m11052(interfaceC6233.mo2990()));
                InterfaceC7383 interfaceC7383 = this.$block;
                C5061 c5061 = new C5061(this.$channel, interfaceC6233.mo2990().plus(c62832));
                this.L$0 = interfaceC6233;
                this.L$1 = c62832;
                this.label = 1;
                r1 = c62832;
                if (interfaceC7383.invoke(c5061, this) != coroutineSingletons) {
                    c6283 = (C6283) r1;
                    c6283.m11114();
                    try {
                        if (AbstractC6231.m11052(interfaceC6233.mo2990()).isCancelled()) {
                            this.$channel.mo9204(AbstractC6231.m11052(interfaceC6233.mo2990()).mo11122());
                        }
                        this.L$0 = interfaceC6233;
                        this.L$1 = null;
                        this.label = 2;
                        break;
                    } catch (Throwable th6) {
                        r1 = c6283;
                        th = th6;
                        try {
                            AbstractC6231.m11067("Exception thrown while reading from channel", th, r1);
                            AbstractC5078.m9251(this.$channel, th);
                            this.L$0 = interfaceC6233;
                            this.L$1 = null;
                            this.label = 4;
                            if (((C6292) r1).mo11123(this) != coroutineSingletons) {
                                c5081 = this.$channel;
                                this.L$0 = null;
                                this.label = 5;
                                if (c5081.m9263(this) == coroutineSingletons) {
                                }
                                Result.m9304constructorimpl(c6008);
                                return c6008;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            this.L$0 = interfaceC6233;
                            this.L$1 = th;
                            this.label = 6;
                            if (((C6292) r1).mo11123(this) != coroutineSingletons) {
                                c50812 = this.$channel;
                                try {
                                    this.L$0 = th;
                                    this.L$1 = null;
                                    this.label = 7;
                                    if (c50812.m9263(this) != coroutineSingletons) {
                                    }
                                } catch (Throwable th8) {
                                    Throwable th9 = th;
                                    th = th8;
                                    th2 = th9;
                                    Result.m9304constructorimpl(new Result.Failure(th));
                                    throw th2;
                                }
                            }
                        }
                    }
                    if (c6283.mo11123(this) != coroutineSingletons) {
                        c50813 = this.$channel;
                        this.L$0 = null;
                        this.label = 3;
                        if (c50813.m9263(this) == coroutineSingletons) {
                        }
                        Result.m9304constructorimpl(c6008);
                        return c6008;
                    }
                }
                return coroutineSingletons;
            case 1:
                InterfaceC6271 interfaceC6271 = (InterfaceC6271) this.L$1;
                interfaceC6233 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                r1 = interfaceC6271;
                c6283 = (C6283) r1;
                c6283.m11114();
                if (AbstractC6231.m11052(interfaceC6233.mo2990()).isCancelled()) {
                }
                this.L$0 = interfaceC6233;
                this.L$1 = null;
                this.label = 2;
                if (c6283.mo11123(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                AbstractC6017.m10769(obj);
                c50813 = this.$channel;
                this.L$0 = null;
                this.label = 3;
                if (c50813.m9263(this) == coroutineSingletons) {
                }
                Result.m9304constructorimpl(c6008);
                return c6008;
            case 3:
                AbstractC6017.m10769(obj);
                Result.m9304constructorimpl(c6008);
                return c6008;
            case 4:
                AbstractC6017.m10769(obj);
                c5081 = this.$channel;
                this.L$0 = null;
                this.label = 5;
                if (c5081.m9263(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Result.m9304constructorimpl(c6008);
                return c6008;
            case 5:
                AbstractC6017.m10769(obj);
                Result.m9304constructorimpl(c6008);
                return c6008;
            case 6:
                Throwable th10 = (Throwable) this.L$1;
                AbstractC6017.m10769(obj);
                th = th10;
                c50812 = this.$channel;
                this.L$0 = th;
                this.L$1 = null;
                this.label = 7;
                if (c50812.m9263(this) != coroutineSingletons) {
                    th2 = th;
                    Result.m9304constructorimpl(c6008);
                    throw th2;
                }
                return coroutineSingletons;
            case 7:
                th2 = (Throwable) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    Result.m9304constructorimpl(c6008);
                    throw th2;
                } catch (Throwable th11) {
                    th = th11;
                    Result.m9304constructorimpl(new Result.Failure(th));
                    throw th2;
                }
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
