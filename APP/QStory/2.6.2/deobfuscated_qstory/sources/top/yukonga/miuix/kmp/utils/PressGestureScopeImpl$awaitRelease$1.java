package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.gestures.GestureCancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.PressGestureScopeImpl", f = "Pressable.kt", l = {465}, m = "awaitRelease", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class PressGestureScopeImpl$awaitRelease$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6061 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$awaitRelease$1(C6061 c6061, InterfaceC4356<? super PressGestureScopeImpl$awaitRelease$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c6061;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C6061 c6061 = this.this$0;
        c6061.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new PressGestureScopeImpl$awaitRelease$1(c6061, this);
        }
        Object objMo1321 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(objMo1321);
            this.label = 1;
            objMo1321 = c6061.mo1321(this);
            if (objMo1321 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(objMo1321);
        }
        if (((Boolean) objMo1321).booleanValue()) {
            return C5175.f14739;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }
}
