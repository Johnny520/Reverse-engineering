package io.ktor.util;

import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5084;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p050.AbstractC7176;
import p068.InterfaceC7383;
import p073.AbstractC7683;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.ByteChannelsKt$split$1", m556f = "ByteChannels.kt", m557l = {27, 32}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ByteChannelsKt$split$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C5081 $first;
    final /* synthetic */ C5081 $second;
    final /* synthetic */ InterfaceC5084 $this_split;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: io.ktor.util.ByteChannelsKt$split$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.util.ByteChannelsKt$split$1$1", m556f = "ByteChannels.kt", m557l = {30}, m558m = "invokeSuspend")
    public static final class C03731 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ byte[] $buffer;
        final /* synthetic */ C5081 $first;
        final /* synthetic */ int $read;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03731(C5081 c5081, byte[] bArr, int i, InterfaceC5189<? super C03731> interfaceC5189) {
            super(2, interfaceC5189);
            this.$first = c5081;
            this.$buffer = bArr;
            this.$read = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C03731(this.$first, this.$buffer, this.$read, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03731) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C5081 c5081 = this.$first;
                byte[] bArr = this.$buffer;
                int i2 = this.$read;
                this.label = 1;
                if (AbstractC5078.m9248(c5081, bArr, 0, i2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.ByteChannelsKt$split$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.util.ByteChannelsKt$split$1$2", m556f = "ByteChannels.kt", m557l = {31}, m558m = "invokeSuspend")
    public static final class C03742 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ byte[] $buffer;
        final /* synthetic */ int $read;
        final /* synthetic */ C5081 $second;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03742(C5081 c5081, byte[] bArr, int i, InterfaceC5189<? super C03742> interfaceC5189) {
            super(2, interfaceC5189);
            this.$second = c5081;
            this.$buffer = bArr;
            this.$read = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C03742(this.$second, this.$buffer, this.$read, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03742) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C5081 c5081 = this.$second;
                byte[] bArr = this.$buffer;
                int i2 = this.$read;
                this.label = 1;
                if (AbstractC5078.m9248(c5081, bArr, 0, i2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelsKt$split$1(InterfaceC5084 interfaceC5084, C5081 c5081, C5081 c50812, InterfaceC5189<? super ByteChannelsKt$split$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_split = interfaceC5084;
        this.$first = c5081;
        this.$second = c50812;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ByteChannelsKt$split$1 byteChannelsKt$split$1 = new ByteChannelsKt$split$1(this.$this_split, this.$first, this.$second, interfaceC5189);
        byteChannelsKt$split$1.L$0 = obj;
        return byteChannelsKt$split$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ByteChannelsKt$split$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11064(r12, r11) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #1 {all -> 0x001a, blocks: (B:7:0x0015, B:17:0x003e, B:20:0x0048, B:24:0x0059, B:26:0x0061, B:30:0x0092, B:34:0x00a8, B:14:0x002b), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:7:0x0015, B:17:0x003e, B:20:0x0048, B:24:0x0059, B:26:0x0061, B:30:0x0092, B:34:0x00a8, B:14:0x002b), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #1 {all -> 0x001a, blocks: (B:7:0x0015, B:17:0x003e, B:20:0x0048, B:24:0x0059, B:26:0x0061, B:30:0x0092, B:34:0x00a8, B:14:0x002b), top: B:44:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005f -> B:29:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008d -> B:29:0x0090). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233;
        InterfaceC6233 interfaceC62332;
        byte[] bArr;
        int iIntValue;
        boolean zMo9200;
        ?? r1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = this.label;
        try {
        } catch (Throwable th) {
            try {
                this.$this_split.mo9204(th);
                this.$first.mo9204(th);
                this.$second.mo9204(th);
                AbstractC7683.f18640.mo8893(obj2);
            } catch (Throwable th2) {
                AbstractC7683.f18640.mo8893(obj2);
                this.$first.m9257();
                this.$second.m9257();
                throw th2;
            }
        }
        if (obj2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6233 = (InterfaceC6233) this.L$0;
            obj2 = (byte[]) AbstractC7683.f18640.mo8894();
            zMo9200 = this.$this_split.mo9200();
            InterfaceC5084 interfaceC5084 = this.$this_split;
            if (zMo9200) {
            }
            this.$first.m9257();
            this.$second.m9257();
            return C6008.f15084;
        }
        if (obj2 == 1) {
            byte[] bArr2 = (byte[]) this.L$1;
            interfaceC62332 = (InterfaceC6233) this.L$0;
            AbstractC6017.m10769(obj);
            bArr = bArr2;
            iIntValue = ((Number) obj).intValue();
            r1 = bArr;
            if (iIntValue > 0) {
            }
            interfaceC6233 = interfaceC62332;
            obj2 = r1;
            zMo9200 = this.$this_split.mo9200();
            InterfaceC5084 interfaceC50842 = this.$this_split;
            if (zMo9200) {
            }
            this.$first.m9257();
            this.$second.m9257();
            return C6008.f15084;
        }
        if (obj2 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        byte[] bArr3 = (byte[]) this.L$1;
        interfaceC62332 = (InterfaceC6233) this.L$0;
        AbstractC6017.m10769(obj);
        r1 = bArr3;
        interfaceC6233 = interfaceC62332;
        obj2 = r1;
        zMo9200 = this.$this_split.mo9200();
        InterfaceC5084 interfaceC508422 = this.$this_split;
        if (zMo9200) {
            this.L$0 = interfaceC6233;
            this.L$1 = obj2;
            this.label = 1;
            Object objM9234 = AbstractC5076.m9234(interfaceC508422, obj2, obj2.length, this);
            if (objM9234 == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC62332 = interfaceC6233;
            obj = objM9234;
            bArr = obj2;
            iIntValue = ((Number) obj).intValue();
            r1 = bArr;
            if (iIntValue > 0) {
                List listM12490 = AbstractC7176.m12490(AbstractC6231.m11045(interfaceC62332, null, new C03731(this.$first, bArr, iIntValue, null), 3), AbstractC6231.m11045(interfaceC62332, null, new C03742(this.$second, bArr, iIntValue, null), 3));
                this.L$0 = interfaceC62332;
                this.L$1 = bArr;
                this.label = 2;
                r1 = bArr;
            }
            interfaceC6233 = interfaceC62332;
            obj2 = r1;
            zMo9200 = this.$this_split.mo9200();
            InterfaceC5084 interfaceC5084222 = this.$this_split;
            if (zMo9200) {
                Throwable thMo9203 = interfaceC5084222.mo9203();
                if (thMo9203 != null) {
                    throw thMo9203;
                }
                AbstractC7683.f18640.mo8893(obj2);
            }
        }
        this.$first.m9257();
        this.$second.m9257();
        return C6008.f15084;
    }
}
