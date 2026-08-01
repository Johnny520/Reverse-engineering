package kotlinx.coroutines;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, AbstractC5450.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C5176.f14739;
    }

    public final void invoke(Throwable th) {
        ((AbstractC5450) this.receiver).mo10468(th);
    }
}
