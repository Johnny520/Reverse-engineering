package io.ktor.client.plugins;

import androidx.compose.foundation.lazy.C0753;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpRequestRetryKt$HttpRequestRetry$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public static final HttpRequestRetryKt$HttpRequestRetry$1 INSTANCE = new HttpRequestRetryKt$HttpRequestRetry$1();

    public HttpRequestRetryKt$HttpRequestRetry$1() {
        super(0, C3934.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3934 invoke() {
        C3934 c3934 = new C3934();
        new HttpRequestRetryConfig$delay$1(null);
        new C0753(new C0753(c3934, 6), 7);
        return c3934;
    }
}
