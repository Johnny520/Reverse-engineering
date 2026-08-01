package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0555 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$BooleanRef f1595;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C0502 f1596;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f1597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0554 f1599;

    public /* synthetic */ C0555(C0554 c0554, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, C0502 c0502, Ref$BooleanRef ref$BooleanRef) {
        this.f1599 = c0554;
        this.f1597 = ref$ObjectRef;
        this.f1598 = ref$FloatRef;
        this.f1596 = c0502;
        this.f1595 = ref$BooleanRef;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        return Boolean.valueOf(MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend$lambda$0(this.f1599, this.f1597, this.f1598, this.f1596, this.f1595, ((Float) obj).floatValue()));
    }
}
