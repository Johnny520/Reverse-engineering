package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.AbstractC5160;
import kotlin.time.C5157;
import kotlin.time.DurationUnit;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6543;
import p305.C8623;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SSEKt$SSE$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public static final SSEKt$SSE$1 INSTANCE = new SSEKt$SSE$1();

    public SSEKt$SSE$1() {
        super(0, C3903.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p052.InterfaceC6543
    public final C3903 invoke() {
        C3903 c3903 = new C3903();
        C8623 c8623 = C5157.f14712;
        AbstractC5160.m10206(3000, DurationUnit.MILLISECONDS);
        return c3903;
    }
}
