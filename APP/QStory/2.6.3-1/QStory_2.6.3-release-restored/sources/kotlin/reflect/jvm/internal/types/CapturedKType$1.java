package kotlin.reflect.jvm.internal.types;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class CapturedKType$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public static final CapturedKType$1 INSTANCE = new CapturedKType$1();

    public CapturedKType$1() {
        super(0, AbstractC5754.class, "javaTypeNotSupported", "javaTypeNotSupported()Ljava/lang/Void;", 1);
    }

    @Override // p068.InterfaceC7372
    public final Void invoke() {
        throw new KotlinReflectionInternalError("javaType for captured types is not supported");
    }
}
