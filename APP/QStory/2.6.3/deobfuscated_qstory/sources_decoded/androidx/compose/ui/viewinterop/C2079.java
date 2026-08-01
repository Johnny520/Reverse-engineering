package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0076;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.node.C1771;
import androidx.compose.ui.window.C2103;
import androidx.core.view.AbstractC2279;
import androidx.core.view.C2225;
import androidx.core.view.C2274;
import java.util.List;
import p164.C7665;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2079 extends AbstractC2279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f6176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f6177;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2079(int i, ViewGroup viewGroup) {
        super(1);
        this.f6177 = i;
        this.f6176 = viewGroup;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C2225 mo1465(C2225 c2225, List list) {
        int i = this.f6177;
        ViewGroup viewGroup = this.f6176;
        switch (i) {
            case 0:
                return ((AbstractC2076) viewGroup).m3822(c2225);
            default:
                C2103 c2103 = (C2103) viewGroup;
                if (c2103.f6230) {
                    return c2225;
                }
                View childAt = c2103.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c2103.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c2103.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? c2225 : c2225.f6521.mo4049(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final C0076 mo1467(C2274 c2274, C0076 c0076) {
        int i = this.f6177;
        int i2 = 12;
        ViewGroup viewGroup = this.f6176;
        switch (i) {
            case 0:
                C1771 c1771 = ((AbstractC2076) viewGroup).f6146.f5094.f5286;
                if (!c1771.f5203.f6279) {
                    return c0076;
                }
                long jM13681 = AbstractC8190.m13681(c1771.mo3076(0L));
                int i3 = (int) (jM13681 >> 32);
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = (int) (jM13681 & 4294967295L);
                if (i4 < 0) {
                    i4 = 0;
                }
                long jMo3088 = AbstractC1670.m3113(c1771).mo3088();
                int i5 = (int) (jMo3088 >> 32);
                int i6 = (int) (jMo3088 & 4294967295L);
                long j = c1771.f4998;
                long jM136812 = AbstractC8190.m13681(c1771.mo3076((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i7 = i5 - ((int) (jM136812 >> 32));
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = i6 - ((int) (jM136812 & 4294967295L));
                int i9 = i8 >= 0 ? i8 : 0;
                return (i3 == 0 && i4 == 0 && i7 == 0 && i9 == 0) ? c0076 : new C0076(AbstractC2076.m3819((C7665) c0076.f227, i3, i4, i7, i9), i2, AbstractC2076.m3819((C7665) c0076.f228, i3, i4, i7, i9));
            default:
                C2103 c2103 = (C2103) viewGroup;
                if (c2103.f6230) {
                    return c0076;
                }
                View childAt = c2103.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c2103.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c2103.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return c0076;
                }
                C7665 c7665M12939 = C7665.m12939(iMax, iMax2, iMax3, iMax4);
                int i10 = c7665M12939.f20810;
                C7665 c7665 = (C7665) c0076.f227;
                int i11 = c7665M12939.f20809;
                int i12 = c7665M12939.f20808;
                int i13 = c7665M12939.f20807;
                return new C0076(C2225.m4062(c7665, i10, i11, i12, i13), i2, C2225.m4062((C7665) c0076.f228, i10, i11, i12, i13));
        }
    }
}
