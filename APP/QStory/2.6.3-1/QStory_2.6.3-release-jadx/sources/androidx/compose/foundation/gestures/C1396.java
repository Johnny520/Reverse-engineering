package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1396 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$BooleanRef f1941;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1343 f1942;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f1943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1395 f1945;

    public /* synthetic */ C1396(C1395 c1395, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, C1343 c1343, Ref$BooleanRef ref$BooleanRef) {
        this.f1945 = c1395;
        this.f1943 = ref$ObjectRef;
        this.f1944 = ref$FloatRef;
        this.f1942 = c1343;
        this.f1941 = ref$BooleanRef;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        return Boolean.valueOf(MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend$lambda$0(this.f1945, this.f1943, this.f1944, this.f1942, this.f1941, ((Float) obj).floatValue()));
    }
}
