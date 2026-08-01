package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p205.InterfaceC7896;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1", f = "BottomSheetContentLayout.kt", l = {389, 395}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $allowDismiss;
    final /* synthetic */ InterfaceC1333 $currentWindowHeight$delegate;
    final /* synthetic */ InterfaceC7896 $density;
    final /* synthetic */ InterfaceC1397 $dimAlpha;
    final /* synthetic */ C0331 $dragOffsetY;
    final /* synthetic */ InterfaceC1395 $isSettling;
    final /* synthetic */ InterfaceC6543 $onDismissRequest;
    final /* synthetic */ InterfaceC1398 $sheetHeightPx;
    final /* synthetic */ InterfaceC6558 $updateDimAlpha;
    final /* synthetic */ float $velocity;
    float F$0;
    float F$1;
    float F$2;
    float F$3;
    float F$4;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1(C0331 c0331, InterfaceC7896 interfaceC7896, boolean z, float f, InterfaceC6543 interfaceC6543, InterfaceC1398 interfaceC1398, InterfaceC1397 interfaceC1397, InterfaceC1395 interfaceC1395, InterfaceC1333 interfaceC1333, InterfaceC6558 interfaceC6558, InterfaceC4357<? super BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$dragOffsetY = c0331;
        this.$density = interfaceC7896;
        this.$allowDismiss = z;
        this.$velocity = f;
        this.$onDismissRequest = interfaceC6543;
        this.$sheetHeightPx = interfaceC1398;
        this.$dimAlpha = interfaceC1397;
        this.$isSettling = interfaceC1395;
        this.$currentWindowHeight$delegate = interfaceC1333;
        this.$updateDimAlpha = interfaceC6558;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$3(C0331 c0331) {
        return ((Number) c0331.m1033()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$4(InterfaceC6558 interfaceC6558, C0331 c0331) {
        interfaceC6558.invoke(c0331.m1033());
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1 bottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1 = new BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1(this.$dragOffsetY, this.$density, this.$allowDismiss, this.$velocity, this.$onDismissRequest, this.$sheetHeightPx, this.$dimAlpha, this.$isSettling, this.$currentWindowHeight$delegate, this.$updateDimAlpha, interfaceC4357);
        bottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1.L$0 = obj;
        return bottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        if (r11.m1032(new androidx.compose.animation.core.C0374(r15, r3, r17, r12, (androidx.compose.animation.core.AbstractC0343) r3.mo1062().invoke(r0)), r0, r4, r20) == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[Catch: all -> 0x0018, CancellationException -> 0x0137, TryCatch #2 {CancellationException -> 0x0137, all -> 0x0018, blocks: (B:6:0x0013, B:46:0x012e, B:13:0x0025, B:34:0x00c5, B:36:0x00cc, B:28:0x0076, B:30:0x007a, B:31:0x007f, B:39:0x00d4, B:43:0x00de, B:42:0x00dc), top: B:53:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$2", f = "BottomSheetContentLayout.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ float $sheetHeight;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$sheetHeight = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$sheetHeight, interfaceC4357);
            anonymousClass2.F$0 = ((Number) obj).floatValue();
            return anonymousClass2;
        }

        public final Object invoke(float f, InterfaceC4357<? super Boolean> interfaceC4357) {
            return ((AnonymousClass2) create(Float.valueOf(f), interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            float f2 = this.$sheetHeight;
            return Boolean.valueOf(f2 > 0.0f && f >= f2);
        }

        @Override // p052.InterfaceC6554
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (InterfaceC4357<? super Boolean>) obj2);
        }
    }
}
