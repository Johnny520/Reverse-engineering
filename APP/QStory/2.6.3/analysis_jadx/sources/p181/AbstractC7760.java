package p181;

import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1576;
import androidx.compose.ui.graphics.C1585;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.unit.LayoutDirection;
import p112.C7326;
import p112.C7327;
import p112.C7328;
import p175.AbstractC7739;
import p176.AbstractC7741;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7760 implements InterfaceC1569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7759 f21046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7759 f21047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7759 f21048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7759 f21049;

    public AbstractC7760(InterfaceC7759 interfaceC7759, InterfaceC7759 interfaceC77592, InterfaceC7759 interfaceC77593, InterfaceC7759 interfaceC77594) {
        this.f21049 = interfaceC7759;
        this.f21048 = interfaceC77592;
        this.f21047 = interfaceC77593;
        this.f21046 = interfaceC77594;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7756 m13114(AbstractC7760 abstractC7760, InterfaceC7759 interfaceC7759, InterfaceC7759 interfaceC77592, InterfaceC7759 interfaceC77593, InterfaceC7759 interfaceC77594, int i) {
        if ((i & 1) != 0) {
            interfaceC7759 = abstractC7760.f21049;
        }
        if ((i & 2) != 0) {
            interfaceC77592 = abstractC7760.f21048;
        }
        if ((i & 4) != 0) {
            interfaceC77593 = abstractC7760.f21047;
        }
        if ((i & 8) != 0) {
            interfaceC77594 = abstractC7760.f21046;
        }
        ((C7756) abstractC7760).getClass();
        return new C7756(interfaceC7759, interfaceC77592, interfaceC77593, interfaceC77594);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1569
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC1581 mo1922(long j, LayoutDirection layoutDirection, InterfaceC7896 interfaceC7896) {
        float fMo13113 = this.f21049.mo13113(j, interfaceC7896);
        float fMo131132 = this.f21048.mo13113(j, interfaceC7896);
        float fMo131133 = this.f21047.mo13113(j, interfaceC7896);
        float fMo131134 = this.f21046.mo13113(j, interfaceC7896);
        float fM12514 = C7326.m12514(j);
        float f = fMo13113 + fMo131134;
        if (f > fM12514) {
            float f2 = fM12514 / f;
            fMo13113 *= f2;
            fMo131134 *= f2;
        }
        float f3 = fMo131132 + fMo131133;
        if (f3 > fM12514) {
            float f4 = fM12514 / f3;
            fMo131132 *= f4;
            fMo131133 *= f4;
        }
        if (fMo13113 < 0.0f || fMo131132 < 0.0f || fMo131133 < 0.0f || fMo131134 < 0.0f) {
            AbstractC7741.m13097("Corner size in Px can't be negative(topStart = " + fMo13113 + ", topEnd = " + fMo131132 + ", bottomEnd = " + fMo131133 + ", bottomStart = " + fMo131134 + ")!");
        }
        if (fMo13113 + fMo131132 + fMo131133 + fMo131134 == 0.0f) {
            return new C1585(AbstractC7739.m13070(0L, j));
        }
        C7328 c7328M13070 = AbstractC7739.m13070(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? fMo13113 : fMo131132;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (layoutDirection == layoutDirection2) {
            fMo13113 = fMo131132;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo13113)) << 32) | (((long) Float.floatToRawIntBits(fMo13113)) & 4294967295L);
        float f6 = layoutDirection == layoutDirection2 ? fMo131133 : fMo131134;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (layoutDirection != layoutDirection2) {
            fMo131134 = fMo131133;
        }
        return new C1576(new C7327(c7328M13070.f19540, c7328M13070.f19539, c7328M13070.f19538, c7328M13070.f19537, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo131134)) << 32) | (((long) Float.floatToRawIntBits(fMo131134)) & 4294967295L)));
    }
}
