package androidx.compose.material3;

import androidx.compose.animation.core.C0362;
import androidx.compose.runtime.InterfaceC1333;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p120.AbstractC7383;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1", f = "SearchBar.kt", l = {1442}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class SearchBarDefaults$InputField$9$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5401 $coroutineScope;
    final /* synthetic */ InterfaceC1333 $focused$delegate;
    final /* synthetic */ AbstractC1220 $searchBarState;
    final /* synthetic */ AbstractC7383 $textFieldState;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2", f = "SearchBar.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5401 $coroutineScope;
        final /* synthetic */ InterfaceC1333 $focused$delegate;
        final /* synthetic */ Ref$IntRef $prevLength;
        final /* synthetic */ AbstractC1220 $searchBarState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
        @InterfaceC6862(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2$1", f = "SearchBar.kt", l = {1438}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ AbstractC1220 $searchBarState;
            int label;

            public AnonymousClass1(AbstractC1220 abstractC1220, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
                super(2, interfaceC4357);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new AnonymousClass1(null, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    this.label = 1;
                    throw null;
                }
                if (i == 1) {
                    AbstractC5185.m10210(obj);
                    return C5176.f14739;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref$IntRef ref$IntRef, AbstractC1220 abstractC1220, InterfaceC5401 interfaceC5401, InterfaceC1333 interfaceC1333, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$prevLength = ref$IntRef;
            this.$coroutineScope = interfaceC5401;
            this.$focused$delegate = interfaceC1333;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$prevLength, null, this.$coroutineScope, this.$focused$delegate, interfaceC4357);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(CharSequence charSequence, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(charSequence, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            int length = ((CharSequence) this.L$0).length();
            if (length > this.$prevLength.element) {
                InterfaceC1333 interfaceC1333 = this.$focused$delegate;
                int i = AbstractC1217.f3500;
                if (((Boolean) interfaceC1333.getValue()).booleanValue()) {
                    C0362 c0362 = AbstractC1216.f3499;
                    throw null;
                }
            }
            this.$prevLength.element = length;
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$9$1(AbstractC1220 abstractC1220, AbstractC7383 abstractC7383, InterfaceC5401 interfaceC5401, InterfaceC1333 interfaceC1333, InterfaceC4357<? super SearchBarDefaults$InputField$9$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$coroutineScope = interfaceC5401;
        this.$focused$delegate = interfaceC1333;
    }

    private static final CharSequence invokeSuspend$lambda$0(AbstractC7383 abstractC7383) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new SearchBarDefaults$InputField$9$1(null, null, this.$coroutineScope, this.$focused$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SearchBarDefaults$InputField$9$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C0362 c0362 = AbstractC1216.f3499;
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
