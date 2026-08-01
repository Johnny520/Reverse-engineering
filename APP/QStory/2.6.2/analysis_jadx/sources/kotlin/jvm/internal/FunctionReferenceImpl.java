package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5092;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, InterfaceC5090 interfaceC5090, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((InterfaceC4386) interfaceC5090).mo8889(), str, str2, !(interfaceC5090 instanceof InterfaceC5092) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
