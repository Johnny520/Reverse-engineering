package androidx.compose.animation.core;

import androidx.compose.runtime.InterfaceC1395;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0332 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1135;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1139;

    public /* synthetic */ C0332(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1139 = i;
        this.f1137 = obj;
        this.f1138 = obj2;
        this.f1136 = obj3;
        this.f1135 = obj4;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1139;
        Object obj2 = this.f1135;
        Object obj3 = this.f1136;
        Object obj4 = this.f1138;
        Object obj5 = this.f1137;
        switch (i) {
            case 0:
                return Animatable$runAnimation$2.invokeSuspend$lambda$0((C0331) obj5, (C0350) obj4, (InterfaceC6558) obj3, (Ref$BooleanRef) obj2, (C0345) obj);
            default:
                return InfiniteTransition$run$1$1.invokeSuspend$lambda$0((InterfaceC1395) obj5, (C0315) obj4, (Ref$FloatRef) obj3, (InterfaceC5401) obj2, ((Long) obj).longValue());
        }
    }
}
