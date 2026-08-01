package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.sync.C6212;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2", m556f = "Pressable.kt", m557l = {370}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class AbstractPressableNode$clickPointerInput$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7380 $onPress;
    final /* synthetic */ InterfaceC2470 $this_clickPointerInput;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC6892 this$0;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1", m556f = "Pressable.kt", m557l = {371, 374}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08451 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        final /* synthetic */ InterfaceC7380 $onPress;
        final /* synthetic */ C6896 $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AbstractC6892 this$0;

        /* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
        @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$1", m556f = "Pressable.kt", m557l = {373}, m558m = "invokeSuspend", m559v = 2)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ C2478 $down;
            final /* synthetic */ InterfaceC7380 $onPress;
            final /* synthetic */ C6896 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC7380 interfaceC7380, C6896 c6896, C2478 c2478, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
                this.$onPress = interfaceC7380;
                this.$pressScope = c6896;
                this.$down = c2478;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(this.$onPress, this.$pressScope, this.$down, interfaceC5189);
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
                    InterfaceC7380 interfaceC7380 = this.$onPress;
                    C6896 c6896 = this.$pressScope;
                    C8158 c8158 = new C8158(this.$down.f5152);
                    this.label = 1;
                    if (interfaceC7380.invoke(c6896, c8158, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
        @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$2", m556f = "Pressable.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ C6896 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C6896 c6896, InterfaceC5189<? super AnonymousClass2> interfaceC5189) {
                super(2, interfaceC5189);
                this.$pressScope = c6896;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass2(this.$pressScope, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                C6896 c6896 = this.$pressScope;
                c6896.f16931 = true;
                C6212 c6212 = c6896.f16929;
                if (c6212.m10987()) {
                    c6212.m10991(null);
                }
                return C6008.f15084;
            }
        }

        /* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
        @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$3", m556f = "Pressable.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ C6896 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C6896 c6896, InterfaceC5189<? super AnonymousClass3> interfaceC5189) {
                super(2, interfaceC5189);
                this.$pressScope = c6896;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass3(this.$pressScope, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                C6896 c6896 = this.$pressScope;
                c6896.f16930 = true;
                C6212 c6212 = c6896.f16929;
                if (c6212.m10987()) {
                    c6212.m10991(null);
                }
                return C6008.f15084;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08451(InterfaceC6233 interfaceC6233, AbstractC6892 abstractC6892, C6896 c6896, InterfaceC7380 interfaceC7380, InterfaceC5189<? super C08451> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$coroutineScope = interfaceC6233;
            this.this$0 = abstractC6892;
            this.$pressScope = c6896;
            this.$onPress = interfaceC7380;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C08451 c08451 = new C08451(this.$$this$coroutineScope, this.this$0, this.$pressScope, this.$onPress, interfaceC5189);
            c08451.L$0 = obj;
            return c08451;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08451) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC6284 interfaceC6284;
            C2478 c2478;
            InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                this.L$0 = interfaceC2468;
                this.label = 1;
                obj = AbstractC1344.m1835(interfaceC2468, null, this, 2);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC6284 = (InterfaceC6284) this.L$2;
                AbstractC6017.m10769(obj);
                c2478 = (C2478) obj;
                AbstractC6892 abstractC6892 = this.this$0;
                InterfaceC6233 interfaceC6233 = this.$$this$coroutineScope;
                if (c2478 != null) {
                    AbstractC6892.m11975(abstractC6892, interfaceC6233, interfaceC6284, new AnonymousClass2(this.$pressScope, null));
                } else {
                    AbstractC6892.m11975(abstractC6892, interfaceC6233, interfaceC6284, new AnonymousClass3(this.$pressScope, null));
                }
                return C6008.f15084;
            }
            AbstractC6017.m10769(obj);
            C6249 c6249M11036 = AbstractC6231.m11036(this.$$this$coroutineScope, null, null, new AbstractPressableNode$clickPointerInput$2$1$resetJob$1(this.$pressScope, null), 3);
            AbstractC6892.m11975(this.this$0, this.$$this$coroutineScope, c6249M11036, new AnonymousClass1(this.$onPress, this.$pressScope, (C2478) obj, null));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = c6249M11036;
            this.label = 2;
            InterfaceC7380 interfaceC7380 = AbstractC1344.f1845;
            obj = AbstractC1344.m1839(interfaceC2468, PointerEventPass.Main, this);
            if (obj != coroutineSingletons) {
                interfaceC6284 = c6249M11036;
                c2478 = (C2478) obj;
                AbstractC6892 abstractC68922 = this.this$0;
                InterfaceC6233 interfaceC62332 = this.$$this$coroutineScope;
                if (c2478 != null) {
                }
                return C6008.f15084;
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$clickPointerInput$2(InterfaceC2470 interfaceC2470, AbstractC6892 abstractC6892, InterfaceC7380 interfaceC7380, InterfaceC5189<? super AbstractPressableNode$clickPointerInput$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_clickPointerInput = interfaceC2470;
        this.this$0 = abstractC6892;
        this.$onPress = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AbstractPressableNode$clickPointerInput$2 abstractPressableNode$clickPointerInput$2 = new AbstractPressableNode$clickPointerInput$2(this.$this_clickPointerInput, this.this$0, this.$onPress, interfaceC5189);
        abstractPressableNode$clickPointerInput$2.L$0 = obj;
        return abstractPressableNode$clickPointerInput$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AbstractPressableNode$clickPointerInput$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6896 c6896 = new C6896(this.$this_clickPointerInput);
            InterfaceC2470 interfaceC2470 = this.$this_clickPointerInput;
            C08451 c08451 = new C08451(interfaceC6233, this.this$0, c6896, this.$onPress, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC1362.m1871(interfaceC2470, c08451, this) == coroutineSingletons) {
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
