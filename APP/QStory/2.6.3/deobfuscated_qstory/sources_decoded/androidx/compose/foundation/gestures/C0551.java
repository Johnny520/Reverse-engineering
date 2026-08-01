package androidx.compose.foundation.gestures;

import java.io.Serializable;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6554;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0551 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Serializable f1586;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1587;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1588;

    public /* synthetic */ C0551(Serializable serializable, Object obj, int i) {
        this.f1588 = i;
        this.f1586 = serializable;
        this.f1587 = obj;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1588) {
            case 0:
                return ScrollExtensionsKt$animateScrollBy$2.invokeSuspend$lambda$0((Ref$FloatRef) this.f1586, (InterfaceC0507) this.f1587, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                return Scrollable2DKt$semanticsScrollBy$2.invokeSuspend$lambda$0((Ref$LongRef) this.f1586, (InterfaceC0557) this.f1587, (C7329) obj, (C7329) obj2);
        }
    }
}
