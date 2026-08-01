package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, AbstractC5189.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public final C5201 invoke(long j, C5201 c5201) {
        C5201 c52012 = AbstractC5189.f14752;
        C5190 c5190 = c5201.f14789;
        c5190.getClass();
        return new C5201(j, c5201, c5190, 0);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (C5201) obj2);
    }
}
