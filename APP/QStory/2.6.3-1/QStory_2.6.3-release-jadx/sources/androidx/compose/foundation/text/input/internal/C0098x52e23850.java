package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p001ui.platform.InterfaceC2689;
import androidx.compose.p001ui.platform.InterfaceC2693;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2859;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6126;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p136.AbstractC8213;
import p201.AbstractC8598;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", m556f = "AndroidTextInputSession.android.kt", m557l = {127}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Void;"}, m152k = 3, m153mv = {2, 1, 0})
final class C0098x52e23850 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1713 $composeImm;
    final /* synthetic */ C2859 $imeOptions;
    final /* synthetic */ AbstractC1693 $layoutState;
    final /* synthetic */ InterfaceC7387 $onImeAction;
    final /* synthetic */ AbstractC8598 $receiveContentConfiguration;
    final /* synthetic */ AbstractC1692 $state;
    final /* synthetic */ InterfaceC6126 $stylusHandwritingTrigger;
    final /* synthetic */ InterfaceC2689 $this_platformSpecificTextInputSession;
    final /* synthetic */ InterfaceC7372 $updateSelectionState;
    final /* synthetic */ InterfaceC7387 $updateTouchMode;
    final /* synthetic */ InterfaceC2698 $viewConfiguration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", m556f = "AndroidTextInputSession.android.kt", m557l = {89}, m558m = "invokeSuspend", m559v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC1713 $composeImm;
        final /* synthetic */ AbstractC1692 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC1692 abstractC1692, InterfaceC1713 interfaceC1713, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
            super(2, interfaceC5189);
            this.$composeImm = interfaceC1713;
        }

        private static final void invokeSuspend$lambda$0(InterfaceC1713 interfaceC1713, AbstractC8213 abstractC8213, AbstractC8213 abstractC82132, boolean z) {
            abstractC8213.getClass();
            abstractC82132.getClass();
            if (z) {
                ((AbstractC1695) interfaceC1713).m2240().restartInput(null);
            } else {
                if (C2869.m4313(0L, 0L)) {
                    return;
                }
                ((AbstractC1695) interfaceC1713).m2240().updateSelection(null, C2869.m4317(0L), C2869.m4310(0L), -1, -1);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new AnonymousClass1(null, this.$composeImm, interfaceC5189);
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
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098x52e23850(InterfaceC6126 interfaceC6126, AbstractC1692 abstractC1692, AbstractC1693 abstractC1693, InterfaceC1713 interfaceC1713, InterfaceC2689 interfaceC2689, C2859 c2859, AbstractC8598 abstractC8598, InterfaceC7387 interfaceC7387, InterfaceC7372 interfaceC7372, InterfaceC2698 interfaceC2698, InterfaceC7387 interfaceC73872, InterfaceC5189<? super C0098x52e23850> interfaceC5189) {
        super(2, interfaceC5189);
        this.$stylusHandwritingTrigger = interfaceC6126;
        this.$composeImm = interfaceC1713;
        this.$this_platformSpecificTextInputSession = interfaceC2689;
        this.$imeOptions = c2859;
        this.$onImeAction = interfaceC7387;
        this.$updateSelectionState = interfaceC7372;
        this.$viewConfiguration = interfaceC2698;
        this.$updateTouchMode = interfaceC73872;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputConnection invokeSuspend$lambda$1(AbstractC1692 abstractC1692, C2859 c2859, AbstractC8598 abstractC8598, InterfaceC1713 interfaceC1713, InterfaceC7387 interfaceC7387, C1711 c1711, AbstractC1693 abstractC1693, InterfaceC7372 interfaceC7372, InterfaceC2698 interfaceC2698, InterfaceC7387 interfaceC73872, EditorInfo editorInfo) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0098x52e23850 c0098x52e23850 = new C0098x52e23850(this.$stylusHandwritingTrigger, null, null, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, null, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, this.$updateTouchMode, interfaceC5189);
        c0098x52e23850.L$0 = obj;
        return c0098x52e23850;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<?> interfaceC5189) {
        return ((C0098x52e23850) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(null, null, null), 1);
            InterfaceC6126 interfaceC6126 = this.$stylusHandwritingTrigger;
            if (interfaceC6126 != null) {
                AbstractC6231.m11036(interfaceC6233, null, null, new C0099x2b7eadeb(interfaceC6126, null, null), 3);
            }
            final C1711 c1711 = new C1711();
            new CursorAnchorInfo.Builder();
            new Matrix();
            InterfaceC2689 interfaceC2689 = this.$this_platformSpecificTextInputSession;
            final C2859 c2859 = this.$imeOptions;
            final InterfaceC7387 interfaceC7387 = this.$onImeAction;
            final InterfaceC7372 interfaceC7372 = this.$updateSelectionState;
            final InterfaceC2698 interfaceC2698 = this.$viewConfiguration;
            final InterfaceC7387 interfaceC73872 = this.$updateTouchMode;
            final InterfaceC1713 interfaceC1713 = null;
            InterfaceC2693 interfaceC2693 = new InterfaceC2693(interfaceC1713, interfaceC7387, c1711, interfaceC7372, interfaceC2698, interfaceC73872) { // from class: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世哲兰苏

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC7387 f2752;

                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2698 f2753;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC7372 f2754;

                /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
                public final /* synthetic */ C1711 f2755;

                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC7387 f2756;

                {
                    this.f2756 = interfaceC7387;
                    this.f2755 = c1711;
                    this.f2754 = interfaceC7372;
                    this.f2753 = interfaceC2698;
                    this.f2752 = interfaceC73872;
                }

                @Override // androidx.compose.p001ui.platform.InterfaceC2693
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final InputConnection mo2226(EditorInfo editorInfo) {
                    return C0098x52e23850.invokeSuspend$lambda$1(null, this.f2757, null, null, this.f2756, this.f2755, null, this.f2754, this.f2753, this.f2752, editorInfo);
                }
            };
            this.label = 1;
            if (interfaceC2689.mo4027(interfaceC2693, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }
}
