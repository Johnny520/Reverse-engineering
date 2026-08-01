package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.material3.InterfaceC2000;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.input.pointer.PointerEventTimeoutCancellationException;
import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6099;
import kotlinx.coroutines.flow.InterfaceC6129;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", m556f = "BasicTooltip.kt", m557l = {Opcodes.ADD_DOUBLE_2ADDR}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class BasicTooltipKt$handleGestures$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2000 $state;
    final /* synthetic */ InterfaceC2470 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$1$1(InterfaceC2470 interfaceC2470, InterfaceC2000 interfaceC2000, InterfaceC5189<? super BasicTooltipKt$handleGestures$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_pointerInput = interfaceC2470;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        BasicTooltipKt$handleGestures$1$1 basicTooltipKt$handleGestures$1$1 = new BasicTooltipKt$handleGestures$1$1(this.$this_pointerInput, null, interfaceC5189);
        basicTooltipKt$handleGestures$1$1.L$0 = obj;
        return basicTooltipKt$handleGestures$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BasicTooltipKt$handleGestures$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            InterfaceC2470 interfaceC2470 = this.$this_pointerInput;
            C01611 c01611 = new C01611(interfaceC6233, null, null);
            this.label = 1;
            if (AbstractC1362.m1871(interfaceC2470, c01611, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", m556f = "BasicTooltip.kt", m557l = {Opcodes.MUL_INT_LIT16, Opcodes.ADD_INT_LIT8, 238}, m558m = "invokeSuspend")
    public static final class C01611 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        final /* synthetic */ InterfaceC2000 $state;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;"}, m152k = 3, m153mv = {2, 0, 0})
        @InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", m556f = "BasicTooltip.kt", m557l = {Opcodes.RSUB_INT_LIT8}, m558m = "invokeSuspend")
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC7383 {
            final /* synthetic */ PointerEventPass $pass;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerEventPass pointerEventPass, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
                this.$pass = pointerEventPass;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pass, interfaceC5189);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C2478> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC6017.m10769(obj);
                        return obj;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
                PointerEventPass pointerEventPass = this.$pass;
                this.label = 1;
                Object objM1839 = AbstractC1344.m1839(interfaceC2468, pointerEventPass, this);
                return objM1839 == coroutineSingletons ? coroutineSingletons : objM1839;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01611(InterfaceC6233 interfaceC6233, InterfaceC2000 interfaceC2000, InterfaceC5189<? super C01611> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$coroutineScope = interfaceC6233;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01611 c01611 = new C01611(this.$$this$coroutineScope, null, interfaceC5189);
            c01611.L$0 = obj;
            return c01611;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01611) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:45:0x00cf, B:47:0x00d3), top: B:59:0x0014 }] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v14 */
        /* JADX WARN: Type inference failed for: r13v17, types: [kotlinx.coroutines.flow.飘花落叶言子哲苏兰楪世] */
        /* JADX WARN: Type inference failed for: r13v18 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlinx.coroutines.flow.飘花落叶言子哲苏兰楪世] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? r13;
            long j;
            InterfaceC2468 interfaceC2468;
            PointerEventPass pointerEventPass;
            AnonymousClass1 anonymousClass1;
            ?? r2;
            ?? r1;
            ?? r12;
            C2478 c2478;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r14 = this.label;
            try {
                if (r14 == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$0;
                    C6099 c6099M10891 = AbstractC6154.m10891(Boolean.FALSE);
                    C2456 c2456 = (C2456) interfaceC24682;
                    long jMo3840 = c2456.m3557().mo3840();
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = c2456;
                    this.L$1 = c6099M10891;
                    this.L$2 = pointerEventPass2;
                    this.J$0 = jMo3840;
                    this.label = 1;
                    Object objM1835 = AbstractC1344.m1835(c2456, pointerEventPass2, this, 1);
                    if (objM1835 != coroutineSingletons) {
                        j = jMo3840;
                        interfaceC2468 = c2456;
                        obj = objM1835;
                        r14 = c6099M10891;
                        pointerEventPass = pointerEventPass2;
                    }
                    return coroutineSingletons;
                }
                if (r14 != 1) {
                    if (r14 != 2) {
                        if (r14 != 3) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r13 = (InterfaceC6129) this.L$0;
                        try {
                            AbstractC6017.m10769(obj);
                            r12 = r14;
                            r13 = r13;
                            c2478 = (C2478) obj;
                            if (c2478 != null) {
                                c2478.m3584();
                            }
                            Boolean bool = Boolean.FALSE;
                            C6099 c6099 = (C6099) r13;
                            c6099.getClass();
                            c6099.m10870(null, bool);
                            r14 = r12;
                            return C6008.f15084;
                        } catch (Throwable th) {
                            th = th;
                            Boolean bool2 = Boolean.FALSE;
                            C6099 c60992 = (C6099) r13;
                            c60992.getClass();
                            c60992.m10870(null, bool2);
                            throw th;
                        }
                    }
                    PointerEventPass pointerEventPass3 = (PointerEventPass) this.L$2;
                    InterfaceC6129 interfaceC6129 = (InterfaceC6129) this.L$1;
                    interfaceC2468 = (InterfaceC2468) this.L$0;
                    try {
                        AbstractC6017.m10769(obj);
                        r1 = pointerEventPass3;
                        r2 = interfaceC6129;
                        Boolean bool3 = Boolean.FALSE;
                        C6099 c60993 = (C6099) r2;
                        c60993.getClass();
                        c60993.m10870(null, bool3);
                        r14 = r1;
                    } catch (PointerEventTimeoutCancellationException unused) {
                        pointerEventPass = pointerEventPass3;
                        r14 = interfaceC6129;
                        AbstractC6231.m11036(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(r14, null, null), 1);
                        this.L$0 = r14;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        obj = AbstractC1344.m1839(interfaceC2468, pointerEventPass, this);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = interfaceC6129;
                        Boolean bool22 = Boolean.FALSE;
                        C6099 c609922 = (C6099) r13;
                        c609922.getClass();
                        c609922.m10870(null, bool22);
                        throw th;
                    }
                    return C6008.f15084;
                }
                long j2 = this.J$0;
                PointerEventPass pointerEventPass4 = (PointerEventPass) this.L$2;
                InterfaceC6129 interfaceC61292 = (InterfaceC6129) this.L$1;
                InterfaceC2468 interfaceC24683 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                pointerEventPass = pointerEventPass4;
                r14 = interfaceC61292;
                j = j2;
                interfaceC2468 = interfaceC24683;
                long j3 = j;
                int i = ((C2478) obj).f5164;
                if (i == 1 || i == 3) {
                    try {
                        anonymousClass1 = new AnonymousClass1(pointerEventPass, null);
                        this.L$0 = interfaceC2468;
                        this.L$1 = r14;
                        this.L$2 = pointerEventPass;
                        this.label = 2;
                    } catch (PointerEventTimeoutCancellationException unused2) {
                        AbstractC6231.m11036(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(r14, null, null), 1);
                        this.L$0 = r14;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        obj = AbstractC1344.m1839(interfaceC2468, pointerEventPass, this);
                        if (obj != coroutineSingletons) {
                            r13 = r14;
                            r12 = r14;
                            c2478 = (C2478) obj;
                            if (c2478 != null) {
                            }
                            Boolean bool4 = Boolean.FALSE;
                            C6099 c60994 = (C6099) r13;
                            c60994.getClass();
                            c60994.m10870(null, bool4);
                            r14 = r12;
                            return C6008.f15084;
                        }
                    }
                    try {
                        if (((C2456) interfaceC2468).m3561(j3, anonymousClass1, this) != coroutineSingletons) {
                            r2 = r14;
                            r1 = r14;
                            Boolean bool32 = Boolean.FALSE;
                            C6099 c609932 = (C6099) r2;
                            c609932.getClass();
                            c609932.m10870(null, bool32);
                            r14 = r1;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        r13 = r14;
                        Boolean bool222 = Boolean.FALSE;
                        C6099 c6099222 = (C6099) r13;
                        c6099222.getClass();
                        c6099222.m10870(null, bool222);
                        throw th;
                    }
                }
                return C6008.f15084;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
        @InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", m556f = "BasicTooltip.kt", m557l = {Opcodes.SHL_INT_LIT8, 227, 227}, m558m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ InterfaceC6129 $isLongPressedFlow;
            final /* synthetic */ InterfaceC2000 $state;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(InterfaceC6129 interfaceC6129, InterfaceC2000 interfaceC2000, InterfaceC5189<? super AnonymousClass3> interfaceC5189) {
                super(2, interfaceC5189);
                this.$isLongPressedFlow = interfaceC6129;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass3(this.$isLongPressedFlow, null, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    ((C6099) this.$isLongPressedFlow).m10872(Boolean.TRUE);
                    MutatePriority mutatePriority = MutatePriority.Default;
                    this.label = 1;
                    throw null;
                }
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    throw null;
                }
                if (i == 2) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                throw th;
            }

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"", "isLongPressed", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Z)V"}, m152k = 3, m153mv = {2, 0, 0})
            @InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", m556f = "BasicTooltip.kt", m557l = {}, m558m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
                final /* synthetic */ InterfaceC2000 $state;
                /* synthetic */ boolean Z$0;
                int label;

                public AnonymousClass1(InterfaceC2000 interfaceC2000, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                    super(2, interfaceC5189);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, interfaceC5189);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                public final Object invoke(boolean z, InterfaceC5189<? super C6008> interfaceC5189) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), interfaceC5189)).invokeSuspend(C6008.f15084);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                    if (this.Z$0) {
                        return C6008.f15084;
                    }
                    throw null;
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (InterfaceC5189<? super C6008>) obj2);
                }
            }
        }
    }
}
