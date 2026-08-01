package androidx.compose.animation.core;

import androidx.compose.runtime.InterfaceC2230;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1178 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1480;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1481;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1482;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1483;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1484;

    public /* synthetic */ C1178(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1484 = i;
        this.f1482 = obj;
        this.f1483 = obj2;
        this.f1481 = obj3;
        this.f1480 = obj4;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f1484;
        Object obj2 = this.f1480;
        Object obj3 = this.f1481;
        Object obj4 = this.f1483;
        Object obj5 = this.f1482;
        switch (i) {
            case 0:
                return Animatable$runAnimation$2.invokeSuspend$lambda$0((C1177) obj5, (C1196) obj4, (InterfaceC7387) obj3, (Ref$BooleanRef) obj2, (C1191) obj);
            default:
                return InfiniteTransition$run$1$1.invokeSuspend$lambda$0((InterfaceC2230) obj5, (C1161) obj4, (Ref$FloatRef) obj3, (InterfaceC6233) obj2, ((Long) obj).longValue());
        }
    }
}
