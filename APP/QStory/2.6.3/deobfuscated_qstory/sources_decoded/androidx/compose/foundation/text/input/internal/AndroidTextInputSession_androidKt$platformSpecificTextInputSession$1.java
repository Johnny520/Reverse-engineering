package androidx.compose.foundation.text.input.internal;

import kotlin.AbstractC5185;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {60}, m = "platformSpecificTextInputSession", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(InterfaceC4357<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj2);
        throw new KotlinNothingValueException();
    }
}
