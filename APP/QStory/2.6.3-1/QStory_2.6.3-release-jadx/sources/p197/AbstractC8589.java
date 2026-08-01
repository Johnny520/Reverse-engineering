package p197;

import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2411;
import androidx.compose.p001ui.graphics.C2420;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.unit.LayoutDirection;
import p128.C8155;
import p128.C8156;
import p128.C8157;
import p191.AbstractC8568;
import p192.AbstractC8570;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8589 implements InterfaceC2404 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC8588 f21391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8588 f21392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8588 f21393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8588 f21394;

    public AbstractC8589(InterfaceC8588 interfaceC8588, InterfaceC8588 interfaceC85882, InterfaceC8588 interfaceC85883, InterfaceC8588 interfaceC85884) {
        this.f21394 = interfaceC8588;
        this.f21393 = interfaceC85882;
        this.f21392 = interfaceC85883;
        this.f21391 = interfaceC85884;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8585 m13673(AbstractC8589 abstractC8589, InterfaceC8588 interfaceC8588, InterfaceC8588 interfaceC85882, InterfaceC8588 interfaceC85883, InterfaceC8588 interfaceC85884, int i) {
        if ((i & 1) != 0) {
            interfaceC8588 = abstractC8589.f21394;
        }
        if ((i & 2) != 0) {
            interfaceC85882 = abstractC8589.f21393;
        }
        if ((i & 4) != 0) {
            interfaceC85883 = abstractC8589.f21392;
        }
        if ((i & 8) != 0) {
            interfaceC85884 = abstractC8589.f21391;
        }
        ((C8585) abstractC8589).getClass();
        return new C8585(interfaceC8588, interfaceC85882, interfaceC85883, interfaceC85884);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2404
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2416 mo2482(long j, LayoutDirection layoutDirection, InterfaceC8725 interfaceC8725) {
        float fMo13672 = this.f21394.mo13672(j, interfaceC8725);
        float fMo136722 = this.f21393.mo13672(j, interfaceC8725);
        float fMo136723 = this.f21392.mo13672(j, interfaceC8725);
        float fMo136724 = this.f21391.mo13672(j, interfaceC8725);
        float fM13073 = C8155.m13073(j);
        float f = fMo13672 + fMo136724;
        if (f > fM13073) {
            float f2 = fM13073 / f;
            fMo13672 *= f2;
            fMo136724 *= f2;
        }
        float f3 = fMo136722 + fMo136723;
        if (f3 > fM13073) {
            float f4 = fM13073 / f3;
            fMo136722 *= f4;
            fMo136723 *= f4;
        }
        if (fMo13672 < 0.0f || fMo136722 < 0.0f || fMo136723 < 0.0f || fMo136724 < 0.0f) {
            AbstractC8570.m13656("Corner size in Px can't be negative(topStart = " + fMo13672 + ", topEnd = " + fMo136722 + ", bottomEnd = " + fMo136723 + ", bottomStart = " + fMo136724 + ")!");
        }
        if (fMo13672 + fMo136722 + fMo136723 + fMo136724 == 0.0f) {
            return new C2420(AbstractC8568.m13629(0L, j));
        }
        C8157 c8157M13629 = AbstractC8568.m13629(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? fMo13672 : fMo136722;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (layoutDirection == layoutDirection2) {
            fMo13672 = fMo136722;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo13672)) << 32) | (((long) Float.floatToRawIntBits(fMo13672)) & 4294967295L);
        float f6 = layoutDirection == layoutDirection2 ? fMo136723 : fMo136724;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (layoutDirection != layoutDirection2) {
            fMo136724 = fMo136723;
        }
        return new C2411(new C8156(c8157M13629.f19885, c8157M13629.f19884, c8157M13629.f19883, c8157M13629.f19882, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo136724)) << 32) | (((long) Float.floatToRawIntBits(fMo136724)) & 4294967295L)));
    }
}
