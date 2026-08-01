package io.ktor.client.plugins.observer;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResponseObserverKt$ResponseObserver$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public static final ResponseObserverKt$ResponseObserver$1 INSTANCE = new ResponseObserverKt$ResponseObserver$1();

    public ResponseObserverKt$ResponseObserver$1() {
        super(0, C3900.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p052.InterfaceC6543
    public final C3900 invoke() {
        C3900 c3900 = new C3900();
        new ResponseObserverConfig$responseHandler$1(null);
        return c3900;
    }
}
