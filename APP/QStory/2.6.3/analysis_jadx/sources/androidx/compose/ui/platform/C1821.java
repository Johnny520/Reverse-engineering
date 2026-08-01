package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1821 implements InterfaceC1863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewConfiguration f5300;

    public C1821(ViewConfiguration viewConfiguration) {
        this.f5300 = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo3278() {
        return this.f5300.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float mo3454() {
        return this.f5300.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo3455() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f5300.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo3280() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo3281() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float mo3456() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f5300.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
