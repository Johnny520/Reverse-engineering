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
import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5293;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p120.AbstractC7383;
import p185.AbstractC7768;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {127}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0875 $composeImm;
    final /* synthetic */ C2025 $imeOptions;
    final /* synthetic */ AbstractC0855 $layoutState;
    final /* synthetic */ InterfaceC6557 $onImeAction;
    final /* synthetic */ AbstractC7768 $receiveContentConfiguration;
    final /* synthetic */ AbstractC0854 $state;
    final /* synthetic */ InterfaceC5293 $stylusHandwritingTrigger;
    final /* synthetic */ InterfaceC1854 $this_platformSpecificTextInputSession;
    final /* synthetic */ InterfaceC6542 $updateSelectionState;
    final /* synthetic */ InterfaceC6557 $updateTouchMode;
    final /* synthetic */ InterfaceC1863 $viewConfiguration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {89}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC0875 $composeImm;
        final /* synthetic */ AbstractC0854 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC0854 abstractC0854, InterfaceC0875 interfaceC0875, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$composeImm = interfaceC0875;
        }

        private static final void invokeSuspend$lambda$0(InterfaceC0875 interfaceC0875, AbstractC7383 abstractC7383, AbstractC7383 abstractC73832, boolean z) {
            abstractC7383.getClass();
            abstractC73832.getClass();
            if (z) {
                ((AbstractC0857) interfaceC0875).m1670().restartInput(null);
            } else {
                if (C2035.m3743(0L, 0L)) {
                    return;
                }
                ((AbstractC0857) interfaceC0875).m1670().updateSelection(null, C2035.m3747(0L), C2035.m3740(0L), -1, -1);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(null, this.$composeImm, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                this.label = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5184.m10206(obj);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(InterfaceC5293 interfaceC5293, AbstractC0854 abstractC0854, AbstractC0855 abstractC0855, InterfaceC0875 interfaceC0875, InterfaceC1854 interfaceC1854, C2025 c2025, AbstractC7768 abstractC7768, InterfaceC6557 interfaceC6557, InterfaceC6542 interfaceC6542, InterfaceC1863 interfaceC1863, InterfaceC6557 interfaceC65572, InterfaceC4356<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$stylusHandwritingTrigger = interfaceC5293;
        this.$composeImm = interfaceC0875;
        this.$this_platformSpecificTextInputSession = interfaceC1854;
        this.$imeOptions = c2025;
        this.$onImeAction = interfaceC6557;
        this.$updateSelectionState = interfaceC6542;
        this.$viewConfiguration = interfaceC1863;
        this.$updateTouchMode = interfaceC65572;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputConnection invokeSuspend$lambda$1(AbstractC0854 abstractC0854, C2025 c2025, AbstractC7768 abstractC7768, InterfaceC0875 interfaceC0875, InterfaceC6557 interfaceC6557, C0873 c0873, AbstractC0855 abstractC0855, InterfaceC6542 interfaceC6542, InterfaceC1863 interfaceC1863, InterfaceC6557 interfaceC65572, EditorInfo editorInfo) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.$stylusHandwritingTrigger, null, null, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, null, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, this.$updateTouchMode, interfaceC4356);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.L$0 = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<?> interfaceC4356) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            AbstractC5398.m10473(interfaceC5400, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(null, null, null), 1);
            InterfaceC5293 interfaceC5293 = this.$stylusHandwritingTrigger;
            if (interfaceC5293 != null) {
                AbstractC5398.m10473(interfaceC5400, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(interfaceC5293, null, null), 3);
            }
            final C0873 c0873 = new C0873();
            new CursorAnchorInfo.Builder();
            new Matrix();
            InterfaceC1854 interfaceC1854 = this.$this_platformSpecificTextInputSession;
            final C2025 c2025 = this.$imeOptions;
            final InterfaceC6557 interfaceC6557 = this.$onImeAction;
            final InterfaceC6542 interfaceC6542 = this.$updateSelectionState;
            final InterfaceC1863 interfaceC1863 = this.$viewConfiguration;
            final InterfaceC6557 interfaceC65572 = this.$updateTouchMode;
            final InterfaceC0875 interfaceC0875 = null;
            InterfaceC1858 interfaceC1858 = new InterfaceC1858(interfaceC0875, interfaceC6557, c0873, interfaceC6542, interfaceC1863, interfaceC65572) { // from class: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世哲兰苏

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6557 f2406;

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC1863 f2407;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6542 f2408;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
                public final /* synthetic */ C0873 f2409;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6557 f2410;

                {
                    this.f2410 = interfaceC6557;
                    this.f2409 = c0873;
                    this.f2408 = interfaceC6542;
                    this.f2407 = interfaceC1863;
                    this.f2406 = interfaceC65572;
                }

                @Override // androidx.compose.ui.platform.InterfaceC1858
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final InputConnection mo1656(EditorInfo editorInfo) {
                    return AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.invokeSuspend$lambda$1(null, this.f2411, null, null, this.f2410, this.f2409, null, this.f2408, this.f2407, this.f2406, editorInfo);
                }
            };
            this.label = 1;
            if (interfaceC1854.mo3457(interfaceC1858, this) == coroutineSingletons) {
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
