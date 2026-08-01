package kotlin.reflect.jvm.internal.types;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class CapturedKType$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public static final CapturedKType$1 INSTANCE = new CapturedKType$1();

    public CapturedKType$1() {
        super(0, AbstractC4921.class, "javaTypeNotSupported", "javaTypeNotSupported()Ljava/lang/Void;", 1);
    }

    @Override // p052.InterfaceC6542
    public final Void invoke() {
        throw new KotlinReflectionInternalError("javaType for captured types is not supported");
    }
}
