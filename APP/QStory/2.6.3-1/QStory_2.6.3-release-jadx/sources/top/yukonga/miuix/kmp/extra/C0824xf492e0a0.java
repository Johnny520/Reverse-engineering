package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.InterfaceC1204;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import androidx.compose.runtime.InterfaceC2233;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p221.C8722;
import p221.InterfaceC8725;
import p356.AbstractC9638;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1", m556f = "BottomSheetContentLayout.kt", m557l = {389, 395}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class C0824xf492e0a0 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $allowDismiss;
    final /* synthetic */ InterfaceC2168 $currentWindowHeight$delegate;
    final /* synthetic */ InterfaceC8725 $density;
    final /* synthetic */ InterfaceC2232 $dimAlpha;
    final /* synthetic */ C1177 $dragOffsetY;
    final /* synthetic */ InterfaceC2230 $isSettling;
    final /* synthetic */ InterfaceC7372 $onDismissRequest;
    final /* synthetic */ InterfaceC2233 $sheetHeightPx;
    final /* synthetic */ InterfaceC7387 $updateDimAlpha;
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
    public C0824xf492e0a0(C1177 c1177, InterfaceC8725 interfaceC8725, boolean z, float f, InterfaceC7372 interfaceC7372, InterfaceC2233 interfaceC2233, InterfaceC2232 interfaceC2232, InterfaceC2230 interfaceC2230, InterfaceC2168 interfaceC2168, InterfaceC7387 interfaceC7387, InterfaceC5189<? super C0824xf492e0a0> interfaceC5189) {
        super(2, interfaceC5189);
        this.$dragOffsetY = c1177;
        this.$density = interfaceC8725;
        this.$allowDismiss = z;
        this.$velocity = f;
        this.$onDismissRequest = interfaceC7372;
        this.$sheetHeightPx = interfaceC2233;
        this.$dimAlpha = interfaceC2232;
        this.$isSettling = interfaceC2230;
        this.$currentWindowHeight$delegate = interfaceC2168;
        this.$updateDimAlpha = interfaceC7387;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$3(C1177 c1177) {
        return ((Number) c1177.m1593()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$4(InterfaceC7387 interfaceC7387, C1177 c1177) {
        interfaceC7387.invoke(c1177.m1593());
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0824xf492e0a0 c0824xf492e0a0 = new C0824xf492e0a0(this.$dragOffsetY, this.$density, this.$allowDismiss, this.$velocity, this.$onDismissRequest, this.$sheetHeightPx, this.$dimAlpha, this.$isSettling, this.$currentWindowHeight$delegate, this.$updateDimAlpha, interfaceC5189);
        c0824xf492e0a0.L$0 = obj;
        return c0824xf492e0a0;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0824xf492e0a0) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        if (r11.m1592(new androidx.compose.animation.core.C1220(r15, r3, r17, r12, (androidx.compose.animation.core.AbstractC1189) r3.mo1622().invoke(r0)), r0, r4, r20) == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[Catch: all -> 0x0018, CancellationException -> 0x0137, TryCatch #2 {CancellationException -> 0x0137, all -> 0x0018, blocks: (B:6:0x0013, B:46:0x012e, B:13:0x0025, B:34:0x00c5, B:36:0x00cc, B:28:0x0076, B:30:0x007a, B:31:0x007f, B:39:0x00d4, B:43:0x00de, B:42:0x00dc), top: B:53:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6284 interfaceC6284M11036;
        InterfaceC7372 interfaceC7372;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                float fFloatValue = ((Number) this.$dragOffsetY.m1593()).floatValue();
                float fMo1904 = this.$density.mo1904(150.0f);
                float fMo19042 = this.$density.mo1904(800.0f);
                float fMo19043 = this.$density.mo1904(((C8722) this.$currentWindowHeight$delegate.getValue()).f22204);
                boolean z = this.$allowDismiss;
                int i2 = 0;
                if (z) {
                    float f = this.$velocity;
                    int i3 = (f > fMo19042 || (fFloatValue > fMo1904 && f > (-fMo19042))) ? 1 : 0;
                    if (i3 == 0) {
                        int i4 = i3;
                        float f2 = (z || this.$velocity <= 0.0f) ? this.$velocity : 0.0f;
                        C1177 c1177 = this.$dragOffsetY;
                        Float f3 = new Float(0.0f);
                        C1145 c1145M15041 = AbstractC9638.m15041(0.85f, 0.4f);
                        Float f4 = new Float(f2);
                        C6874 c6874 = new C6874(this.$updateDimAlpha, i2);
                        this.L$0 = null;
                        this.F$0 = fFloatValue;
                        this.F$1 = fMo1904;
                        this.F$2 = fMo19042;
                        this.F$3 = fMo19043;
                        this.I$0 = i4;
                        this.F$4 = f2;
                        this.label = 2;
                        Object objM1593 = c1177.m1593();
                        InterfaceC1204 interfaceC1204 = c1177.f1474;
                    } else if (fFloatValue >= fMo19043) {
                        InterfaceC7372 interfaceC73722 = this.$onDismissRequest;
                        if (interfaceC73722 != null) {
                            interfaceC73722.invoke();
                        }
                    } else {
                        float fM2992 = ((AbstractC2181) this.$sheetHeightPx).m2992();
                        int i5 = i3;
                        interfaceC6284M11036 = AbstractC6231.m11036(interfaceC6233, null, null, new C0825xfca3ec7b(this.$dragOffsetY, fMo19043, this.$velocity, this.$updateDimAlpha, null), 3);
                        final C1177 c11772 = this.$dragOffsetY;
                        C6116 c6116M3030 = AbstractC2202.m3030(new InterfaceC7372() { // from class: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世苏哲兰
                            @Override // p068.InterfaceC7372
                            public final Object invoke() {
                                return Float.valueOf(C0824xf492e0a0.invokeSuspend$lambda$3(c11772));
                            }
                        });
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fM2992, null);
                        this.L$0 = null;
                        this.L$1 = interfaceC6284M11036;
                        this.F$0 = fFloatValue;
                        this.F$1 = fMo1904;
                        this.F$2 = fMo19042;
                        this.F$3 = fMo19043;
                        this.I$0 = i5;
                        this.F$4 = fM2992;
                        this.label = 1;
                        if (AbstractC6154.m10898(c6116M3030, anonymousClass2, this) == coroutineSingletons) {
                        }
                        interfaceC6284M11036.mo10815(null);
                        interfaceC7372 = this.$onDismissRequest;
                        if (interfaceC7372 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                interfaceC6284M11036 = (InterfaceC6284) this.L$1;
                AbstractC6017.m10769(obj);
                interfaceC6284M11036.mo10815(null);
                interfaceC7372 = this.$onDismissRequest;
                if (interfaceC7372 != null) {
                    interfaceC7372.invoke();
                }
            } else {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                ((AbstractC2184) this.$dimAlpha).m2995(1.0f);
            }
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            this.$isSettling.setValue(Boolean.FALSE);
            throw th;
        }
        this.$isSettling.setValue(Boolean.FALSE);
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m151d2 = {"<anonymous>", "", "it", ""}, m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$2", m556f = "BottomSheetContentLayout.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ float $sheetHeight;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, InterfaceC5189<? super AnonymousClass2> interfaceC5189) {
            super(2, interfaceC5189);
            this.$sheetHeight = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$sheetHeight, interfaceC5189);
            anonymousClass2.F$0 = ((Number) obj).floatValue();
            return anonymousClass2;
        }

        public final Object invoke(float f, InterfaceC5189<? super Boolean> interfaceC5189) {
            return ((AnonymousClass2) create(Float.valueOf(f), interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            float f2 = this.$sheetHeight;
            return Boolean.valueOf(f2 > 0.0f && f >= f2);
        }

        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (InterfaceC5189<? super Boolean>) obj2);
        }
    }
}
