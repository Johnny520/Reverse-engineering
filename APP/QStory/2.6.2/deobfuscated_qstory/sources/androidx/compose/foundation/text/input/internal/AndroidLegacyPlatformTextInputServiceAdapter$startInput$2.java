package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.AbstractC0835;
import androidx.compose.ui.platform.InterfaceC1854;
import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲世兰苏楪;", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲世兰苏楪;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $initializeRequest;
    final /* synthetic */ InterfaceC0853 $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0860 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC1854 $$this$launchTextInputSession;
        final /* synthetic */ InterfaceC6557 $initializeRequest;
        final /* synthetic */ InterfaceC0853 $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C0860 this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend", v = 1)
        public static final class C08411 extends SuspendLambda implements InterfaceC6553 {
            final /* synthetic */ InterfaceC0863 $inputMethodManager;
            int label;
            final /* synthetic */ C0860 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08411(C0860 c0860, InterfaceC0863 interfaceC0863, InterfaceC4356<? super C08411> interfaceC4356) {
                super(2, interfaceC4356);
                this.this$0 = c0860;
                this.$inputMethodManager = interfaceC0863;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5175 invokeSuspend$lambda$0(long j) {
                return C5175.f14739;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                return new C08411(this.this$0, this.$inputMethodManager, interfaceC4356);
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
                return ((C08411) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
            
                if (kotlinx.coroutines.flow.C5286.m10311((kotlinx.coroutines.flow.C5286) r7, r1, r6) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r6.label
                    r2 = 0
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r5) goto L18
                    if (r1 == r4) goto L14
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    top.suzhelan.qstory.hook.item.C5919.m11250(r6)
                    return r2
                L14:
                    kotlin.AbstractC5184.m10206(r7)
                    goto L54
                L18:
                    kotlin.AbstractC5184.m10206(r7)
                    goto L3a
                L1c:
                    kotlin.AbstractC5184.m10206(r7)
                    androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏哲兰 r7 = new androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏哲兰
                    r7.<init>(r3)
                    r6.label = r5
                    kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r6.getContext()
                    androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r1 = androidx.compose.runtime.AbstractC1367.m2482(r1)
                    androidx.compose.runtime.飘花落叶言子世兰楪哲苏 r5 = new androidx.compose.runtime.飘花落叶言子世兰楪哲苏
                    r5.<init>(r7, r3)
                    java.lang.Object r7 = r1.mo2295(r5, r6)
                    if (r7 != r0) goto L3a
                    goto L53
                L3a:
                    androidx.compose.foundation.text.input.internal.飘花落叶言子楪世哲苏兰 r7 = r6.this$0
                    kotlinx.coroutines.flow.飘花落叶言子哲苏世兰楪 r7 = r7.m1680()
                    if (r7 == 0) goto L58
                    androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏兰哲 r1 = new androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏兰哲
                    androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰世哲苏 r5 = r6.$inputMethodManager
                    r1.<init>(r5, r3)
                    r6.label = r4
                    kotlinx.coroutines.flow.飘花落叶言子哲兰苏楪世 r7 = (kotlinx.coroutines.flow.C5286) r7
                    kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlinx.coroutines.flow.C5286.m10311(r7, r1, r6)
                    if (r6 != r0) goto L54
                L53:
                    return r0
                L54:
                    io.ktor.util.C4210.m8612()
                    return r2
                L58:
                    kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C08411.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1854 interfaceC1854, InterfaceC6557 interfaceC6557, C0860 c0860, InterfaceC0853 interfaceC0853, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$$this$launchTextInputSession = interfaceC1854;
            this.$initializeRequest = interfaceC6557;
            this.this$0 = c0860;
            this.$node = interfaceC0853;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<?> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
                    InterfaceC0863 interfaceC0863 = (InterfaceC0863) AbstractC0852.f2404.invoke(this.$$this$launchTextInputSession.mo3456());
                    C0851 c0851 = new C0851(this.$$this$launchTextInputSession.mo3456(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.$node), interfaceC0863);
                    if (AbstractC0835.f2369) {
                        AbstractC5398.m10473(interfaceC5400, null, null, new C08411(this.this$0, interfaceC0863, null), 3);
                    }
                    InterfaceC6557 interfaceC6557 = this.$initializeRequest;
                    if (interfaceC6557 != null) {
                        interfaceC6557.invoke(c0851);
                    }
                    this.this$0.f2413 = c0851;
                    InterfaceC1854 interfaceC1854 = this.$$this$launchTextInputSession;
                    this.label = 1;
                    if (interfaceC1854.mo3457(c0851, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f2413 = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(InterfaceC6557 interfaceC6557, C0860 c0860, InterfaceC0853 interfaceC0853, InterfaceC4356<? super AndroidLegacyPlatformTextInputServiceAdapter$startInput$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$initializeRequest = interfaceC6557;
        this.this$0 = c0860;
        this.$node = interfaceC0853;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.$initializeRequest, this.this$0, this.$node, interfaceC4356);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.L$0 = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1854 interfaceC1854, InterfaceC4356<?> interfaceC4356) {
        return ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create(interfaceC1854, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((InterfaceC1854) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            if (AbstractC5398.m10503(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C4210.m8612();
        return null;
    }
}
