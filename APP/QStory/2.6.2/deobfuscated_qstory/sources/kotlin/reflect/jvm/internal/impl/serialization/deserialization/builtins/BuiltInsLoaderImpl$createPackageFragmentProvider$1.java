package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(Object obj) {
        super(1, obj, C4776.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
    }

    @Override // p052.InterfaceC6557
    public final InputStream invoke(String str) {
        str.getClass();
        ((C4776) this.receiver).getClass();
        return C4776.m9518(str);
    }
}
