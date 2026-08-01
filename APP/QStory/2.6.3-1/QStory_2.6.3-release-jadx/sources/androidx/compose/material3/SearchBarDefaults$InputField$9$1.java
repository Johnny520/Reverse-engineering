package androidx.compose.material3;

import androidx.compose.animation.core.C1208;
import androidx.compose.runtime.InterfaceC2168;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p136.AbstractC8212;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1", m556f = "SearchBar.kt", m557l = {1442}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SearchBarDefaults$InputField$9$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6233 $coroutineScope;
    final /* synthetic */ InterfaceC2168 $focused$delegate;
    final /* synthetic */ AbstractC2055 $searchBarState;
    final /* synthetic */ AbstractC8212 $textFieldState;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/lang/CharSequence;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2", m556f = "SearchBar.kt", m557l = {}, m558m = "invokeSuspend")
    public static final class C01492 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $coroutineScope;
        final /* synthetic */ InterfaceC2168 $focused$delegate;
        final /* synthetic */ Ref$IntRef $prevLength;
        final /* synthetic */ AbstractC2055 $searchBarState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
        @InterfaceC7691(m555c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2$1", m556f = "SearchBar.kt", m557l = {1438}, m558m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ AbstractC2055 $searchBarState;
            int label;

            public AnonymousClass1(AbstractC2055 abstractC2055, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(null, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    this.label = 1;
                    throw null;
                }
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01492(Ref$IntRef ref$IntRef, AbstractC2055 abstractC2055, InterfaceC6233 interfaceC6233, InterfaceC2168 interfaceC2168, InterfaceC5189<? super C01492> interfaceC5189) {
            super(2, interfaceC5189);
            this.$prevLength = ref$IntRef;
            this.$coroutineScope = interfaceC6233;
            this.$focused$delegate = interfaceC2168;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01492 c01492 = new C01492(this.$prevLength, null, this.$coroutineScope, this.$focused$delegate, interfaceC5189);
            c01492.L$0 = obj;
            return c01492;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(CharSequence charSequence, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01492) create(charSequence, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            int length = ((CharSequence) this.L$0).length();
            if (length > this.$prevLength.element) {
                InterfaceC2168 interfaceC2168 = this.$focused$delegate;
                int i = AbstractC2052.f3845;
                if (((Boolean) interfaceC2168.getValue()).booleanValue()) {
                    C1208 c1208 = AbstractC2051.f3844;
                    throw null;
                }
            }
            this.$prevLength.element = length;
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$9$1(AbstractC2055 abstractC2055, AbstractC8212 abstractC8212, InterfaceC6233 interfaceC6233, InterfaceC2168 interfaceC2168, InterfaceC5189<? super SearchBarDefaults$InputField$9$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$coroutineScope = interfaceC6233;
        this.$focused$delegate = interfaceC2168;
    }

    private static final CharSequence invokeSuspend$lambda$0(AbstractC8212 abstractC8212) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SearchBarDefaults$InputField$9$1(null, null, this.$coroutineScope, this.$focused$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SearchBarDefaults$InputField$9$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1208 c1208 = AbstractC2051.f3844;
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
