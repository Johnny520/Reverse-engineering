package p181;

import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1576;
import androidx.compose.ui.graphics.C1585;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p112.C7325;
import p112.C7326;
import p112.C7327;
import p176.AbstractC7740;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7759 implements InterfaceC1569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7758 f21049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7758 f21050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7758 f21051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7758 f21052;

    public AbstractC7759(InterfaceC7758 interfaceC7758, InterfaceC7758 interfaceC77582, InterfaceC7758 interfaceC77583, InterfaceC7758 interfaceC77584) {
        this.f21052 = interfaceC7758;
        this.f21051 = interfaceC77582;
        this.f21050 = interfaceC77583;
        this.f21049 = interfaceC77584;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7755 m13086(AbstractC7759 abstractC7759, InterfaceC7758 interfaceC7758, InterfaceC7758 interfaceC77582, InterfaceC7758 interfaceC77583, InterfaceC7758 interfaceC77584, int i) {
        if ((i & 1) != 0) {
            interfaceC7758 = abstractC7759.f21052;
        }
        if ((i & 2) != 0) {
            interfaceC77582 = abstractC7759.f21051;
        }
        if ((i & 4) != 0) {
            interfaceC77583 = abstractC7759.f21050;
        }
        if ((i & 8) != 0) {
            interfaceC77584 = abstractC7759.f21049;
        }
        ((C7755) abstractC7759).getClass();
        return new C7755(interfaceC7758, interfaceC77582, interfaceC77583, interfaceC77584);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1569
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC1581 mo1912(long j, LayoutDirection layoutDirection, InterfaceC7895 interfaceC7895) {
        float fMo13085 = this.f21052.mo13085(j, interfaceC7895);
        float fMo130852 = this.f21051.mo13085(j, interfaceC7895);
        float fMo130853 = this.f21050.mo13085(j, interfaceC7895);
        float fMo130854 = this.f21049.mo13085(j, interfaceC7895);
        float fM12487 = C7325.m12487(j);
        float f = fMo13085 + fMo130854;
        if (f > fM12487) {
            float f2 = fM12487 / f;
            fMo13085 *= f2;
            fMo130854 *= f2;
        }
        float f3 = fMo130852 + fMo130853;
        if (f3 > fM12487) {
            float f4 = fM12487 / f3;
            fMo130852 *= f4;
            fMo130853 *= f4;
        }
        if (fMo13085 < 0.0f || fMo130852 < 0.0f || fMo130853 < 0.0f || fMo130854 < 0.0f) {
            AbstractC7740.m13069("Corner size in Px can't be negative(topStart = " + fMo13085 + ", topEnd = " + fMo130852 + ", bottomEnd = " + fMo130853 + ", bottomStart = " + fMo130854 + ")!");
        }
        if (fMo13085 + fMo130852 + fMo130853 + fMo130854 == 0.0f) {
            return new C1585(AbstractC5061.m10034(0L, j));
        }
        C7327 c7327M10034 = AbstractC5061.m10034(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? fMo13085 : fMo130852;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (layoutDirection == layoutDirection2) {
            fMo13085 = fMo130852;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo13085)) << 32) | (((long) Float.floatToRawIntBits(fMo13085)) & 4294967295L);
        float f6 = layoutDirection == layoutDirection2 ? fMo130853 : fMo130854;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (layoutDirection != layoutDirection2) {
            fMo130854 = fMo130853;
        }
        return new C1576(new C7326(c7327M10034.f19545, c7327M10034.f19544, c7327M10034.f19543, c7327M10034.f19542, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo130854)) << 32) | (((long) Float.floatToRawIntBits(fMo130854)) & 4294967295L)));
    }
}
