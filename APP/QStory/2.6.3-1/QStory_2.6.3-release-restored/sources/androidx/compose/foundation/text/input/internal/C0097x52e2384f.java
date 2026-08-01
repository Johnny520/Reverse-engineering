package androidx.compose.foundation.text.input.internal;

import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", m556f = "AndroidTextInputSession.android.kt", m557l = {87}, m558m = "platformSpecificTextInputSession", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class C0097x52e2384f extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public C0097x52e2384f(InterfaceC5189<? super C0097x52e2384f> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0097x52e2384f c0097x52e2384f = this;
        c0097x52e2384f.result = obj;
        c0097x52e2384f.label |= Integer.MIN_VALUE;
        if (c0097x52e2384f instanceof C0097x52e2384f) {
            int i = c0097x52e2384f.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0097x52e2384f.label = i - Integer.MIN_VALUE;
            } else {
                c0097x52e2384f = new C0097x52e2384f(c0097x52e2384f);
            }
        }
        Object obj2 = c0097x52e2384f.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0097x52e2384f.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            C0098x52e23850 c0098x52e23850 = new C0098x52e23850(null, null, null, null, null, null, null, null, null, null, null, null);
            c0097x52e2384f.label = 1;
            if (AbstractC6231.m11066(c0098x52e23850, c0097x52e2384f) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj2);
        }
        C5043.m9161();
        return null;
    }
}
