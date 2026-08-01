package androidx.compose.foundation.gestures;

import java.io.Serializable;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7383;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1392 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Serializable f1931;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1933;

    public /* synthetic */ C1392(Serializable serializable, Object obj, int i) {
        this.f1933 = i;
        this.f1931 = serializable;
        this.f1932 = obj;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1933) {
            case 0:
                return ScrollExtensionsKt$animateScrollBy$2.invokeSuspend$lambda$0((Ref$FloatRef) this.f1931, (InterfaceC1348) this.f1932, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                return Scrollable2DKt$semanticsScrollBy$2.invokeSuspend$lambda$0((Ref$LongRef) this.f1931, (InterfaceC1398) this.f1932, (C8158) obj, (C8158) obj2);
        }
    }
}
