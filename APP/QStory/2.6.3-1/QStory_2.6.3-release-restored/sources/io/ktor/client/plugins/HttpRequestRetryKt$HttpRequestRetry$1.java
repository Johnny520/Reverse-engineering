package io.ktor.client.plugins;

import androidx.compose.foundation.lazy.C1594;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class HttpRequestRetryKt$HttpRequestRetry$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public static final HttpRequestRetryKt$HttpRequestRetry$1 INSTANCE = new HttpRequestRetryKt$HttpRequestRetry$1();

    public HttpRequestRetryKt$HttpRequestRetry$1() {
        super(0, C4767.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4767 invoke() {
        C4767 c4767 = new C4767();
        new HttpRequestRetryConfig$delay$1(null);
        new C1594(new C1594(c4767, 6), 7);
        return c4767;
    }
}
