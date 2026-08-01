package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.AbstractC5159;
import kotlin.time.C5156;
import kotlin.time.DurationUnit;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6542;
import p305.C8631;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SSEKt$SSE$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public static final SSEKt$SSE$1 INSTANCE = new SSEKt$SSE$1();

    public SSEKt$SSE$1() {
        super(0, C3902.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3902 invoke() {
        C3902 c3902 = new C3902();
        C8631 c8631 = C5156.f14712;
        AbstractC5159.m10202(3000, DurationUnit.MILLISECONDS);
        return c3902;
    }
}
