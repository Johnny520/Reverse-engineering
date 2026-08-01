package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1463 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2077;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ WindowInsetsAnimationController f2078;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2079;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f2080;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2081;

    public /* synthetic */ C1463(int i, int i2, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z) {
        this.f2081 = i;
        this.f2079 = i2;
        this.f2080 = ref$FloatRef;
        this.f2078 = windowInsetsAnimationController;
        this.f2077 = z;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        return WindowInsetsNestedScrollConnection$fling$2.C00521.invokeSuspend$lambda$0(this.f2081, this.f2079, null, this.f2080, this.f2078, this.f2077, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }
}
