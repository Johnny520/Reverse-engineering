package androidx.compose.ui;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.platform.AbstractC1909;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4387;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2120 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2117 f6273 = new C2117(-1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2117 f6272 = new C2117(1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m3850(AtomicReference atomicReference, InterfaceC6557 interfaceC6557, InterfaceC6553 interfaceC6553, ContinuationImpl continuationImpl) {
        return AbstractC5398.m10503(new SessionMutex$withSessionCancellingPrevious$2(interfaceC6557, atomicReference, interfaceC6553, null), continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m3851(InterfaceC1373 interfaceC1373, InterfaceC2129 interfaceC2129) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2382(439770924);
        InterfaceC2129 interfaceC2129M3852 = m3852(c1324, interfaceC2129);
        c1324.m2367(false);
        return interfaceC2129M3852;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2129 m3852(InterfaceC1373 interfaceC1373, InterfaceC2129 interfaceC2129) {
        if (interfaceC2129.mo3855(new InterfaceC6557() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // p052.InterfaceC6557
            public final Boolean invoke(InterfaceC2124 interfaceC2124) {
                return Boolean.valueOf(!(interfaceC2124 instanceof C2134));
            }
        })) {
            return interfaceC2129;
        }
        final C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2332(1219399079, 0, null, null);
        InterfaceC2129 interfaceC21292 = (InterfaceC2129) interfaceC2129.mo3854(C2125.f6275, new InterfaceC6553() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // p052.InterfaceC6553
            public final InterfaceC2129 invoke(InterfaceC2129 interfaceC21293, InterfaceC2124 interfaceC2124) {
                boolean z = interfaceC2124 instanceof C2134;
                InterfaceC2129 interfaceC2129M3852 = interfaceC2124;
                if (z) {
                    InterfaceC6550 interfaceC6550 = ((C2134) interfaceC2124).f6298;
                    AbstractC4387.m8898(3, interfaceC6550);
                    interfaceC2129M3852 = AbstractC2120.m3852(c1324, (InterfaceC2129) interfaceC6550.invoke(C2125.f6275, c1324, 0));
                }
                return interfaceC21293.mo3856(interfaceC2129M3852);
            }
        });
        c1324.m2367(false);
        return interfaceC21292;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC2129 m3853(InterfaceC2129 interfaceC2129, InterfaceC6550 interfaceC6550) {
        int i = AbstractC1909.f5627;
        return interfaceC2129.mo3856(new C2134(interfaceC6550));
    }
}
