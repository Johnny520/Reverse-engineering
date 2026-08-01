package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(Object obj) {
        super(1, obj, C4777.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
    }

    @Override // p052.InterfaceC6558
    public final InputStream invoke(String str) {
        str.getClass();
        ((C4777) this.receiver).getClass();
        return C4777.m9508(str);
    }
}
