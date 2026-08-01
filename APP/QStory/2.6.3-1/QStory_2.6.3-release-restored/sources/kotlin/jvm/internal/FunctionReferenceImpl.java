package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, InterfaceC5923 interfaceC5923, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((InterfaceC5219) interfaceC5923).mo9438(), str, str2, !(interfaceC5923 instanceof InterfaceC5925) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
