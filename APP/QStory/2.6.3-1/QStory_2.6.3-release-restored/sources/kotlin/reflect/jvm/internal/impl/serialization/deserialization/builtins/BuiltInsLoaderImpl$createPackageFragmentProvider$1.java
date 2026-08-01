package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(Object obj) {
        super(1, obj, C5609.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
    }

    @Override // p068.InterfaceC7387
    public final InputStream invoke(String str) {
        str.getClass();
        ((C5609) this.receiver).getClass();
        return C5609.m10067(str);
    }
}
