package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6553;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0550 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1583;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1584 = 1;

    public /* synthetic */ C0550(C0517 c0517) {
        this.f1583 = c0517;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1584;
        Object obj3 = this.f1583;
        switch (i) {
            case 0:
                return ScrollExtensionsKt$animateScrollBy$4.invokeSuspend$lambda$0((Ref$LongRef) obj3, null, (C7328) obj, (C7328) obj2);
            default:
                C0517 c0517 = (C0517) obj3;
                AbstractC5398.m10473(c0517.m3857(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(c0517, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ C0550(Ref$LongRef ref$LongRef, InterfaceC0549 interfaceC0549) {
        this.f1583 = ref$LongRef;
    }
}
