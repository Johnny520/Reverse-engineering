package androidx.compose.p001ui;

import androidx.compose.p001ui.platform.AbstractC2744;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5220;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2953 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2950 f6619 = new C2950(-1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2950 f6618 = new C2950(1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m4420(AtomicReference atomicReference, InterfaceC7387 interfaceC7387, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        return AbstractC6231.m11066(new SessionMutex$withSessionCancellingPrevious$2(interfaceC7387, atomicReference, interfaceC7383, null), continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2962 m4421(InterfaceC2208 interfaceC2208, InterfaceC2962 interfaceC2962) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2952(439770924);
        InterfaceC2962 interfaceC2962M4422 = m4422(c2159, interfaceC2962);
        c2159.m2937(false);
        return interfaceC2962M4422;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2962 m4422(InterfaceC2208 interfaceC2208, InterfaceC2962 interfaceC2962) {
        if (interfaceC2962.mo4425(new InterfaceC7387() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // p068.InterfaceC7387
            public final Boolean invoke(InterfaceC2957 interfaceC2957) {
                return Boolean.valueOf(!(interfaceC2957 instanceof C2967));
            }
        })) {
            return interfaceC2962;
        }
        final C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2902(1219399079, 0, null, null);
        InterfaceC2962 interfaceC29622 = (InterfaceC2962) interfaceC2962.mo4424(C2958.f6621, new InterfaceC7383() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // p068.InterfaceC7383
            public final InterfaceC2962 invoke(InterfaceC2962 interfaceC29623, InterfaceC2957 interfaceC2957) {
                boolean z = interfaceC2957 instanceof C2967;
                InterfaceC2962 interfaceC2962M4422 = interfaceC2957;
                if (z) {
                    InterfaceC7380 interfaceC7380 = ((C2967) interfaceC2957).f6644;
                    AbstractC5220.m9447(3, interfaceC7380);
                    interfaceC2962M4422 = AbstractC2953.m4422(c2159, (InterfaceC2962) interfaceC7380.invoke(C2958.f6621, c2159, 0));
                }
                return interfaceC29623.mo4426(interfaceC2962M4422);
            }
        });
        c2159.m2937(false);
        return interfaceC29622;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC2962 m4423(InterfaceC2962 interfaceC2962, InterfaceC7380 interfaceC7380) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C2967(interfaceC7380));
    }
}
