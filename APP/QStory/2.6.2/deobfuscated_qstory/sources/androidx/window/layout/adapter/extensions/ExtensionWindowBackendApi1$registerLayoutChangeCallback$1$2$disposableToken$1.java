package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(Object obj) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    public final void invoke(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((WindowLayoutInfo) obj);
        return C5175.f14739;
    }
}
