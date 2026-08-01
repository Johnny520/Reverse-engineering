package androidx.compose.ui;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.platform.AbstractC1909;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4388;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2120 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2117 f6274 = new C2117(-1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2117 f6273 = new C2117(1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m3860(AtomicReference atomicReference, InterfaceC6558 interfaceC6558, InterfaceC6554 interfaceC6554, ContinuationImpl continuationImpl) {
        return AbstractC5399.m10507(new SessionMutex$withSessionCancellingPrevious$2(interfaceC6558, atomicReference, interfaceC6554, null), continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m3861(InterfaceC1373 interfaceC1373, InterfaceC2129 interfaceC2129) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2392(439770924);
        InterfaceC2129 interfaceC2129M3862 = m3862(c1324, interfaceC2129);
        c1324.m2377(false);
        return interfaceC2129M3862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2129 m3862(InterfaceC1373 interfaceC1373, InterfaceC2129 interfaceC2129) {
        if (interfaceC2129.mo3865(new InterfaceC6558() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // p052.InterfaceC6558
            public final Boolean invoke(InterfaceC2124 interfaceC2124) {
                return Boolean.valueOf(!(interfaceC2124 instanceof C2134));
            }
        })) {
            return interfaceC2129;
        }
        final C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2342(1219399079, 0, null, null);
        InterfaceC2129 interfaceC21292 = (InterfaceC2129) interfaceC2129.mo3864(C2125.f6276, new InterfaceC6554() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // p052.InterfaceC6554
            public final InterfaceC2129 invoke(InterfaceC2129 interfaceC21293, InterfaceC2124 interfaceC2124) {
                boolean z = interfaceC2124 instanceof C2134;
                InterfaceC2129 interfaceC2129M3862 = interfaceC2124;
                if (z) {
                    InterfaceC6551 interfaceC6551 = ((C2134) interfaceC2124).f6299;
                    AbstractC4388.m8888(3, interfaceC6551);
                    interfaceC2129M3862 = AbstractC2120.m3862(c1324, (InterfaceC2129) interfaceC6551.invoke(C2125.f6276, c1324, 0));
                }
                return interfaceC21293.mo3866(interfaceC2129M3862);
            }
        });
        c1324.m2377(false);
        return interfaceC21292;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC2129 m3863(InterfaceC2129 interfaceC2129, InterfaceC6551 interfaceC6551) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C2134(interfaceC6551));
    }
}
