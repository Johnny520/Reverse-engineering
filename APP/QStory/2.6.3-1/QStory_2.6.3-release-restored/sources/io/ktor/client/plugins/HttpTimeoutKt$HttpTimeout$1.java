package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class HttpTimeoutKt$HttpTimeout$1 extends AdaptedFunctionReference implements InterfaceC7372 {
    public static final HttpTimeoutKt$HttpTimeout$1 INSTANCE = new HttpTimeoutKt$HttpTimeout$1();

    public HttpTimeoutKt$HttpTimeout$1() {
        super(0, C4759.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4759 invoke() {
        return new C4759();
    }
}
