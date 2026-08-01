package androidx.compose.ui.platform;

import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.node.C1762;
import androidx.compose.ui.text.input.C1997;
import androidx.compose.ui.text.input.C2014;
import androidx.compose.ui.text.input.C2017;
import androidx.compose.ui.text.input.InterfaceC2020;
import androidx.compose.ui.text.input.InterfaceInputConnectionC2018;
import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C1834 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(C1834 c1834, InterfaceC4357<? super AndroidPlatformTextInputSession$startInputMethod$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c1834;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, interfaceC4357);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C1910 c1910, InterfaceC4357<?> interfaceC4357) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(c1910, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            final C1910 c1910 = (C1910) this.L$0;
            final C1834 c1834 = this.this$0;
            this.L$0 = c1910;
            this.L$1 = c1834;
            this.label = 1;
            C5444 c5444 = new C5444(1, AbstractC2567.m5064(this));
            c5444.m10543();
            C2014 c2014 = c1834.f5329;
            InterfaceC2020 interfaceC2020 = c2014.f5949;
            interfaceC2020.mo1685();
            c2014.f5948.set(new C1997(c2014, interfaceC2020));
            c5444.m10541(new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    C2017 c2017;
                    InputConnection inputConnection;
                    C1910 c19102 = c1910;
                    synchronized (c19102.f5631) {
                        try {
                            c19102.f5629 = true;
                            C1224 c1224 = c19102.f5630;
                            Object[] objArr = c1224.f3521;
                            int i2 = c1224.f3520;
                            for (int i3 = 0; i3 < i2; i3++) {
                                InterfaceInputConnectionC2018 interfaceInputConnectionC2018 = (InterfaceInputConnectionC2018) ((C1762) objArr[i3]).get();
                                if (interfaceInputConnectionC2018 != null && (inputConnection = (c2017 = (C2017) interfaceInputConnectionC2018).f5954) != null) {
                                    inputConnection.closeConnection();
                                    c2017.f5954 = null;
                                }
                            }
                            c19102.f5630.m2052();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C2014 c20142 = c1834.f5329;
                    c20142.f5948.set(null);
                    c20142.f5949.mo1682();
                }

                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return C5176.f14739;
                }
            });
            if (c5444.m10540() == coroutineSingletons) {
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
