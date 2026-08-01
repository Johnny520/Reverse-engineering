package androidx.compose.p001ui.platform;

import android.view.inputmethod.InputConnection;
import androidx.compose.p001ui.node.C2597;
import androidx.compose.p001ui.text.input.C2831;
import androidx.compose.p001ui.text.input.C2848;
import androidx.compose.p001ui.text.input.C2851;
import androidx.compose.p001ui.text.input.InterfaceC2854;
import androidx.compose.p001ui.text.input.InterfaceInputConnectionC2852;
import androidx.compose.runtime.collection.C2059;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", m556f = "AndroidPlatformTextInputSession.android.kt", m557l = {184}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;)Ljava/lang/Void;"}, m152k = 3, m153mv = {2, 1, 0})
final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C2669 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(C2669 c2669, InterfaceC5189<? super AndroidPlatformTextInputSession$startInputMethod$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c2669;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, interfaceC5189);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C2745 c2745, InterfaceC5189<?> interfaceC5189) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(c2745, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            final C2745 c2745 = (C2745) this.L$0;
            final C2669 c2669 = this.this$0;
            this.L$0 = c2745;
            this.L$1 = c2669;
            this.label = 1;
            C6276 c6276 = new C6276(1, AbstractC3400.m5624(this));
            c6276.m11102();
            C2848 c2848 = c2669.f5674;
            InterfaceC2854 interfaceC2854 = c2848.f6294;
            interfaceC2854.mo2245();
            c2848.f6293.set(new C2831(c2848, interfaceC2854));
            c6276.m11100(new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    C2851 c2851;
                    InputConnection inputConnection;
                    C2745 c27452 = c2745;
                    synchronized (c27452.f5976) {
                        try {
                            c27452.f5974 = true;
                            C2059 c2059 = c27452.f5975;
                            Object[] objArr = c2059.f3866;
                            int i2 = c2059.f3865;
                            for (int i3 = 0; i3 < i2; i3++) {
                                InterfaceInputConnectionC2852 interfaceInputConnectionC2852 = (InterfaceInputConnectionC2852) ((C2597) objArr[i3]).get();
                                if (interfaceInputConnectionC2852 != null && (inputConnection = (c2851 = (C2851) interfaceInputConnectionC2852).f6299) != null) {
                                    inputConnection.closeConnection();
                                    c2851.f6299 = null;
                                }
                            }
                            c27452.f5975.m2612();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C2848 c28482 = c2669.f5674;
                    c28482.f6293.set(null);
                    c28482.f6294.mo2242();
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return C6008.f15084;
                }
            });
            if (c6276.m11099() == coroutineSingletons) {
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
