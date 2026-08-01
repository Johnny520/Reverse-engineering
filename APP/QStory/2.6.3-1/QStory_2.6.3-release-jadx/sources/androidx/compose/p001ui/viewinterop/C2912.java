package androidx.compose.p001ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0923;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.node.C2606;
import androidx.compose.p001ui.window.C2936;
import androidx.core.view.AbstractC3112;
import androidx.core.view.C3058;
import androidx.core.view.C3107;
import java.util.List;
import p180.C8494;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2912 extends AbstractC3112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f6521;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f6522;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2912(int i, ViewGroup viewGroup) {
        super(1);
        this.f6522 = i;
        this.f6521 = viewGroup;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C3058 mo2025(C3058 c3058, List list) {
        int i = this.f6522;
        ViewGroup viewGroup = this.f6521;
        switch (i) {
            case 0:
                return ((AbstractC2909) viewGroup).m4382(c3058);
            default:
                C2936 c2936 = (C2936) viewGroup;
                if (c2936.f6575) {
                    return c3058;
                }
                View childAt = c2936.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c2936.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c2936.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? c3058 : c3058.f6866.mo4609(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final C0923 mo2027(C3107 c3107, C0923 c0923) {
        int i = this.f6522;
        int i2 = 12;
        ViewGroup viewGroup = this.f6521;
        switch (i) {
            case 0:
                C2606 c2606 = ((AbstractC2909) viewGroup).f6491.f5439.f5631;
                if (!c2606.f5548.f6624) {
                    return c0923;
                }
                long jM14240 = AbstractC9019.m14240(c2606.mo3636(0L));
                int i3 = (int) (jM14240 >> 32);
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = (int) (jM14240 & 4294967295L);
                if (i4 < 0) {
                    i4 = 0;
                }
                long jMo3648 = AbstractC2505.m3673(c2606).mo3648();
                int i5 = (int) (jMo3648 >> 32);
                int i6 = (int) (jMo3648 & 4294967295L);
                long j = c2606.f5343;
                long jM142402 = AbstractC9019.m14240(c2606.mo3636((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i7 = i5 - ((int) (jM142402 >> 32));
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = i6 - ((int) (jM142402 & 4294967295L));
                int i9 = i8 >= 0 ? i8 : 0;
                return (i3 == 0 && i4 == 0 && i7 == 0 && i9 == 0) ? c0923 : new C0923(AbstractC2909.m4379((C8494) c0923.f572, i3, i4, i7, i9), i2, AbstractC2909.m4379((C8494) c0923.f573, i3, i4, i7, i9));
            default:
                C2936 c2936 = (C2936) viewGroup;
                if (c2936.f6575) {
                    return c0923;
                }
                View childAt = c2936.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c2936.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c2936.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return c0923;
                }
                C8494 c8494M13498 = C8494.m13498(iMax, iMax2, iMax3, iMax4);
                int i10 = c8494M13498.f21155;
                C8494 c8494 = (C8494) c0923.f572;
                int i11 = c8494M13498.f21154;
                int i12 = c8494M13498.f21153;
                int i13 = c8494M13498.f21152;
                return new C0923(C3058.m4622(c8494, i10, i11, i12, i13), i2, C3058.m4622((C8494) c0923.f573, i10, i11, i12, i13));
        }
    }
}
