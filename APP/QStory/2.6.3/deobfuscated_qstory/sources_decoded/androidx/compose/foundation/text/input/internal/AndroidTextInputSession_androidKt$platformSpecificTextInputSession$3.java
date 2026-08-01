package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.InterfaceC1854;
import androidx.compose.ui.platform.InterfaceC1858;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2025;
import io.ktor.util.C4211;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5294;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p120.AbstractC7384;
import p185.AbstractC7769;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {127}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0875 $composeImm;
    final /* synthetic */ C2025 $imeOptions;
    final /* synthetic */ AbstractC0855 $layoutState;
    final /* synthetic */ InterfaceC6558 $onImeAction;
    final /* synthetic */ AbstractC7769 $receiveContentConfiguration;
    final /* synthetic */ AbstractC0854 $state;
    final /* synthetic */ InterfaceC5294 $stylusHandwritingTrigger;
    final /* synthetic */ InterfaceC1854 $this_platformSpecificTextInputSession;
    final /* synthetic */ InterfaceC6543 $updateSelectionState;
    final /* synthetic */ InterfaceC6558 $updateTouchMode;
    final /* synthetic */ InterfaceC1863 $viewConfiguration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {89}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC0875 $composeImm;
        final /* synthetic */ AbstractC0854 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC0854 abstractC0854, InterfaceC0875 interfaceC0875, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$composeImm = interfaceC0875;
        }

        private static final void invokeSuspend$lambda$0(InterfaceC0875 interfaceC0875, AbstractC7384 abstractC7384, AbstractC7384 abstractC73842, boolean z) {
            abstractC7384.getClass();
            abstractC73842.getClass();
            if (z) {
                ((AbstractC0857) interfaceC0875).m1680().restartInput(null);
            } else {
                if (C2035.m3753(0L, 0L)) {
                    return;
                }
                ((AbstractC0857) interfaceC0875).m1680().updateSelection(null, C2035.m3757(0L), C2035.m3750(0L), -1, -1);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(null, this.$composeImm, interfaceC4357);
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
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5185.m10210(obj);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(InterfaceC5294 interfaceC5294, AbstractC0854 abstractC0854, AbstractC0855 abstractC0855, InterfaceC0875 interfaceC0875, InterfaceC1854 interfaceC1854, C2025 c2025, AbstractC7769 abstractC7769, InterfaceC6558 interfaceC6558, InterfaceC6543 interfaceC6543, InterfaceC1863 interfaceC1863, InterfaceC6558 interfaceC65582, InterfaceC4357<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.$stylusHandwritingTrigger = interfaceC5294;
        this.$composeImm = interfaceC0875;
        this.$this_platformSpecificTextInputSession = interfaceC1854;
        this.$imeOptions = c2025;
        this.$onImeAction = interfaceC6558;
        this.$updateSelectionState = interfaceC6543;
        this.$viewConfiguration = interfaceC1863;
        this.$updateTouchMode = interfaceC65582;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputConnection invokeSuspend$lambda$1(AbstractC0854 abstractC0854, C2025 c2025, AbstractC7769 abstractC7769, InterfaceC0875 interfaceC0875, InterfaceC6558 interfaceC6558, C0873 c0873, AbstractC0855 abstractC0855, InterfaceC6543 interfaceC6543, InterfaceC1863 interfaceC1863, InterfaceC6558 interfaceC65582, EditorInfo editorInfo) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.$stylusHandwritingTrigger, null, null, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, null, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, this.$updateTouchMode, interfaceC4357);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.L$0 = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<?> interfaceC4357) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
            AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(null, null, null), 1);
            InterfaceC5294 interfaceC5294 = this.$stylusHandwritingTrigger;
            if (interfaceC5294 != null) {
                AbstractC5399.m10477(interfaceC5401, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(interfaceC5294, null, null), 3);
            }
            final C0873 c0873 = new C0873();
            new CursorAnchorInfo.Builder();
            new Matrix();
            InterfaceC1854 interfaceC1854 = this.$this_platformSpecificTextInputSession;
            final C2025 c2025 = this.$imeOptions;
            final InterfaceC6558 interfaceC6558 = this.$onImeAction;
            final InterfaceC6543 interfaceC6543 = this.$updateSelectionState;
            final InterfaceC1863 interfaceC1863 = this.$viewConfiguration;
            final InterfaceC6558 interfaceC65582 = this.$updateTouchMode;
            final InterfaceC0875 interfaceC0875 = null;
            InterfaceC1858 interfaceC1858 = new InterfaceC1858(interfaceC0875, interfaceC6558, c0873, interfaceC6543, interfaceC1863, interfaceC65582) { // from class: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世哲兰苏

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6558 f2407;

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC1863 f2408;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6543 f2409;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
                public final /* synthetic */ C0873 f2410;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6558 f2411;

                {
                    this.f2411 = interfaceC6558;
                    this.f2410 = c0873;
                    this.f2409 = interfaceC6543;
                    this.f2408 = interfaceC1863;
                    this.f2407 = interfaceC65582;
                }

                @Override // androidx.compose.ui.platform.InterfaceC1858
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final InputConnection mo1666(EditorInfo editorInfo) {
                    return AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.invokeSuspend$lambda$1(null, this.f2412, null, null, this.f2411, this.f2410, null, this.f2409, this.f2408, this.f2407, editorInfo);
                }
            };
            this.label = 1;
            if (interfaceC1854.mo3467(interfaceC1858, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        C4211.m8602();
        return null;
    }
}
