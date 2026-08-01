package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5093;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, InterfaceC5091 interfaceC5091, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((InterfaceC4387) interfaceC5091).mo8879(), str, str2, !(interfaceC5091 instanceof InterfaceC5093) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
