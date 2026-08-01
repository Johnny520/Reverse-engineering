package io.ktor.client.plugins.observer;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class ResponseObserverKt$ResponseObserver$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public static final ResponseObserverKt$ResponseObserver$1 INSTANCE = new ResponseObserverKt$ResponseObserver$1();

    public ResponseObserverKt$ResponseObserver$1() {
        super(0, C4732.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4732 invoke() {
        C4732 c4732 = new C4732();
        new ResponseObserverConfig$responseHandler$1(null);
        return c4732;
    }
}
