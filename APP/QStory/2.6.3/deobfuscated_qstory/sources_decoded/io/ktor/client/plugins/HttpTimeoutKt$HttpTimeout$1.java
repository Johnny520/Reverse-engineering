package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpTimeoutKt$HttpTimeout$1 extends AdaptedFunctionReference implements InterfaceC6543 {
    public static final HttpTimeoutKt$HttpTimeout$1 INSTANCE = new HttpTimeoutKt$HttpTimeout$1();

    public HttpTimeoutKt$HttpTimeout$1() {
        super(0, C3927.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
    }

    @Override // p052.InterfaceC6543
    public final C3927 invoke() {
        return new C3927();
    }
}
