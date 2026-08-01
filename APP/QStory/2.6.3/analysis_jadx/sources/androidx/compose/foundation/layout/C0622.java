package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0622 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f1732;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ WindowInsetsAnimationController f1733;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f1734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1735;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1736;

    public /* synthetic */ C0622(int i, int i2, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z) {
        this.f1736 = i;
        this.f1734 = i2;
        this.f1735 = ref$FloatRef;
        this.f1733 = windowInsetsAnimationController;
        this.f1732 = z;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        return WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1.invokeSuspend$lambda$0(this.f1736, this.f1734, null, this.f1735, this.f1733, this.f1732, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }
}
