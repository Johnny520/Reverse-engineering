package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6554;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0550 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1585 = 1;

    public /* synthetic */ C0550(C0517 c0517) {
        this.f1584 = c0517;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1585;
        Object obj3 = this.f1584;
        switch (i) {
            case 0:
                return ScrollExtensionsKt$animateScrollBy$4.invokeSuspend$lambda$0((Ref$LongRef) obj3, null, (C7329) obj, (C7329) obj2);
            default:
                C0517 c0517 = (C0517) obj3;
                AbstractC5399.m10477(c0517.m3867(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(c0517, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ C0550(Ref$LongRef ref$LongRef, InterfaceC0549 interfaceC0549) {
        this.f1584 = ref$LongRef;
    }
}
