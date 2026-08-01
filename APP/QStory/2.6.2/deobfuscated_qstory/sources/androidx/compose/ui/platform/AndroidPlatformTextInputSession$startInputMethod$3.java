package androidx.compose.ui.platform;

import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.node.C1762;
import androidx.compose.ui.text.input.C1997;
import androidx.compose.ui.text.input.C2014;
import androidx.compose.ui.text.input.C2017;
import androidx.compose.ui.text.input.InterfaceC2020;
import androidx.compose.ui.text.input.InterfaceInputConnectionC2018;
import com.bumptech.glide.AbstractC3054;
import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5443;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C1834 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(C1834 c1834, InterfaceC4356<? super AndroidPlatformTextInputSession$startInputMethod$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c1834;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, interfaceC4356);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C1910 c1910, InterfaceC4356<?> interfaceC4356) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(c1910, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            final C1910 c1910 = (C1910) this.L$0;
            final C1834 c1834 = this.this$0;
            this.L$0 = c1910;
            this.L$1 = c1834;
            this.label = 1;
            C5443 c5443 = new C5443(1, AbstractC3054.m6602(this));
            c5443.m10539();
            C2014 c2014 = c1834.f5328;
            InterfaceC2020 interfaceC2020 = c2014.f5948;
            interfaceC2020.mo1675();
            c2014.f5947.set(new C1997(c2014, interfaceC2020));
            c5443.m10537(new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    C2017 c2017;
                    InputConnection inputConnection;
                    C1910 c19102 = c1910;
                    synchronized (c19102.f5630) {
                        try {
                            c19102.f5628 = true;
                            C1224 c1224 = c19102.f5629;
                            Object[] objArr = c1224.f3520;
                            int i2 = c1224.f3519;
                            for (int i3 = 0; i3 < i2; i3++) {
                                InterfaceInputConnectionC2018 interfaceInputConnectionC2018 = (InterfaceInputConnectionC2018) ((C1762) objArr[i3]).get();
                                if (interfaceInputConnectionC2018 != null && (inputConnection = (c2017 = (C2017) interfaceInputConnectionC2018).f5953) != null) {
                                    inputConnection.closeConnection();
                                    c2017.f5953 = null;
                                }
                            }
                            c19102.f5629.m2042();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C2014 c20142 = c1834.f5328;
                    c20142.f5947.set(null);
                    c20142.f5948.mo1672();
                }

                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return C5175.f14739;
                }
            });
            if (c5443.m10536() == coroutineSingletons) {
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
