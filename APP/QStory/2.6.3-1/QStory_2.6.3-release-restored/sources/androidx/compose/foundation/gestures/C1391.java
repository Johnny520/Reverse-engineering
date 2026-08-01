package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1391 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1929;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1930 = 1;

    public /* synthetic */ C1391(C1358 c1358) {
        this.f1929 = c1358;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1930;
        Object obj3 = this.f1929;
        switch (i) {
            case 0:
                return ScrollExtensionsKt$animateScrollBy$4.invokeSuspend$lambda$0((Ref$LongRef) obj3, null, (C8158) obj, (C8158) obj2);
            default:
                C1358 c1358 = (C1358) obj3;
                AbstractC6231.m11036(c1358.m4427(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(c1358, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ C1391(Ref$LongRef ref$LongRef, InterfaceC1390 interfaceC1390) {
        this.f1929 = ref$LongRef;
    }
}
