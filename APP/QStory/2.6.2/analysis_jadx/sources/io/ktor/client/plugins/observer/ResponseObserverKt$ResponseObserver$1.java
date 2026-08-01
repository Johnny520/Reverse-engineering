package io.ktor.client.plugins.observer;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResponseObserverKt$ResponseObserver$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public static final ResponseObserverKt$ResponseObserver$1 INSTANCE = new ResponseObserverKt$ResponseObserver$1();

    public ResponseObserverKt$ResponseObserver$1() {
        super(0, C3899.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3899 invoke() {
        C3899 c3899 = new C3899();
        new ResponseObserverConfig$responseHandler$1(null);
        return c3899;
    }
}
