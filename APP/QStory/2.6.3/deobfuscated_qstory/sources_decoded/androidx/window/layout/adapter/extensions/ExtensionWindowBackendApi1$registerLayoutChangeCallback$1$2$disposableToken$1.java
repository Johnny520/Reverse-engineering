package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(Object obj) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    public final void invoke(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((WindowLayoutInfo) obj);
        return C5176.f14739;
    }
}
