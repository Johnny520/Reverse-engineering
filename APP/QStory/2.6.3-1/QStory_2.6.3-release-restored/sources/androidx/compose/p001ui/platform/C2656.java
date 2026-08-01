package androidx.compose.p001ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2656 implements InterfaceC2698 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewConfiguration f5645;

    public C2656(ViewConfiguration viewConfiguration) {
        this.f5645 = viewConfiguration;
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2698
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo3838() {
        return this.f5645.getScaledTouchSlop();
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2698
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float mo4014() {
        return this.f5645.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2698
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo4015() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f5645.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo3840() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo3841() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float mo4016() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f5645.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
