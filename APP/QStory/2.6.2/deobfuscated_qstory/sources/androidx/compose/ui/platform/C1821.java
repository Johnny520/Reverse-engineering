package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1821 implements InterfaceC1863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewConfiguration f5299;

    public C1821(ViewConfiguration viewConfiguration) {
        this.f5299 = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo3268() {
        return this.f5299.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float mo3444() {
        return this.f5299.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo3445() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f5299.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo3270() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo3271() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1863
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float mo3446() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f5299.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
