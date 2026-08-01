package androidx.activity;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {176}, m = "reportWhenComplete", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FullyDrawnReporterKt$reportWhenComplete$1(InterfaceC4356<? super FullyDrawnReporterKt$reportWhenComplete$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new FullyDrawnReporterKt$reportWhenComplete$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj2);
            throw null;
        }
        if (i2 != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C0024 c0024 = (C0024) this.L$0;
        try {
            AbstractC5184.m10206(obj2);
            c0024.m29();
            return C5175.f14739;
        } catch (Throwable th) {
            c0024.m29();
            throw th;
        }
    }
}
