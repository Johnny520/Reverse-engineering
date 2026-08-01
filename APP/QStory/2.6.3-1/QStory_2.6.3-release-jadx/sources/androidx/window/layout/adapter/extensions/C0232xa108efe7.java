package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class C0232xa108efe7 extends FunctionReferenceImpl implements InterfaceC7387 {
    public C0232xa108efe7(Object obj) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    public final void invoke(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((WindowLayoutInfo) obj);
        return C6008.f15084;
    }
}
