package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpTimeoutKt$HttpTimeout$1 extends AdaptedFunctionReference implements InterfaceC6542 {
    public static final HttpTimeoutKt$HttpTimeout$1 INSTANCE = new HttpTimeoutKt$HttpTimeout$1();

    public HttpTimeoutKt$HttpTimeout$1() {
        super(0, C3926.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3926 invoke() {
        return new C3926();
    }
}
