package kotlinx.coroutines;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, AbstractC6282.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C6008.f15084;
    }

    public final void invoke(Throwable th) {
        ((AbstractC6282) this.receiver).mo11027(th);
    }
}
