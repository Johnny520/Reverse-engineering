package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0622 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f1731;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ WindowInsetsAnimationController f1732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f1733;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1735;

    public /* synthetic */ C0622(int i, int i2, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z) {
        this.f1735 = i;
        this.f1733 = i2;
        this.f1734 = ref$FloatRef;
        this.f1732 = windowInsetsAnimationController;
        this.f1731 = z;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        return WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1.invokeSuspend$lambda$0(this.f1735, this.f1733, null, this.f1734, this.f1732, this.f1731, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }
}
