package io.ktor.client.plugins;

import androidx.compose.foundation.lazy.C0753;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpRequestRetryKt$HttpRequestRetry$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public static final HttpRequestRetryKt$HttpRequestRetry$1 INSTANCE = new HttpRequestRetryKt$HttpRequestRetry$1();

    public HttpRequestRetryKt$HttpRequestRetry$1() {
        super(0, C3935.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p052.InterfaceC6543
    public final C3935 invoke() {
        C3935 c3935 = new C3935();
        new HttpRequestRetryConfig$delay$1(null);
        new C0753(new C0753(c3935, 6), 7);
        return c3935;
    }
}
