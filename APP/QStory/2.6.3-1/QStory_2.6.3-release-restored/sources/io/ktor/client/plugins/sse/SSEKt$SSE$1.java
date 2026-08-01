package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.AbstractC5992;
import kotlin.time.C5989;
import kotlin.time.DurationUnit;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7372;
import p321.C9452;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class SSEKt$SSE$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public static final SSEKt$SSE$1 INSTANCE = new SSEKt$SSE$1();

    public SSEKt$SSE$1() {
        super(0, C4735.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4735 invoke() {
        C4735 c4735 = new C4735();
        C9452 c9452 = C5989.f15057;
        AbstractC5992.m10765(3000, DurationUnit.MILLISECONDS);
        return c4735;
    }
}
