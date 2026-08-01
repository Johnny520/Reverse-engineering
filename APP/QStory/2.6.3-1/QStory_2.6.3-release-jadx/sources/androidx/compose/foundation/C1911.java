package androidx.compose.foundation;

import androidx.activity.compose.C0851;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2411;
import androidx.compose.p001ui.graphics.C2420;
import androidx.compose.p001ui.graphics.C2421;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.C2345;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2616;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.unit.LayoutDirection;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import p128.C8155;
import p128.C8156;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1911 extends AbstractC2961 implements InterfaceC2616, InterfaceC2626, InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public AbstractC2416 f3528;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC2404 f3529;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f3530;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractC2416 f3531;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public LayoutDirection f3532;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public long f3533;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC2404 f3534;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f3535;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC2433 f3536;

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        AbstractC2781.m4204(interfaceC2779, this.f3534);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo2534() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        this.f3533 = 9205357640488583168L;
        this.f3532 = null;
        this.f3531 = null;
        this.f3529 = null;
        AbstractC2620.m3911(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        AbstractC2416 abstractC2416;
        char c;
        AbstractC2433 abstractC2433;
        AbstractC2433 abstractC24332;
        C2449 c2449;
        if (this.f3534 == AbstractC2416.f5007) {
            if (!C2434.m3509(this.f3530, C2434.f5042)) {
                InterfaceC2339.m3256(interfaceC2341, this.f3530, 0L, 0.0f, null, 126);
            }
            AbstractC2433 abstractC24333 = this.f3536;
            if (abstractC24333 != null) {
                InterfaceC2339.m3261((C2593) interfaceC2341, abstractC24333, 0L, 0L, this.f3535, null, 118);
            }
        } else {
            C2593 c2593 = (C2593) interfaceC2341;
            C2342 c2342 = c2593.f5521;
            if (C8155.m13074(c2342.mo3265(), this.f3533) && c2593.getLayoutDirection() == this.f3532 && AbstractC5227.m9466(this.f3529, this.f3534)) {
                abstractC2416 = this.f3531;
                abstractC2416.getClass();
            } else {
                AbstractC2620.m3904(this, new C0851(this, 1, c2593));
                abstractC2416 = this.f3528;
                this.f3528 = null;
            }
            AbstractC2416 abstractC24162 = abstractC2416;
            this.f3531 = abstractC24162;
            this.f3533 = c2342.mo3265();
            this.f3532 = c2593.getLayoutDirection();
            this.f3529 = this.f3534;
            abstractC24162.getClass();
            boolean zM3509 = C2434.m3509(this.f3530, C2434.f5042);
            C2345 c2345 = C2345.f4640;
            if (zM3509) {
                c = ' ';
                abstractC2433 = this.f3536;
                if (abstractC2433 != null) {
                }
            } else {
                long j = this.f3530;
                if (abstractC24162 instanceof C2420) {
                    C8157 c8157 = ((C2420) abstractC24162).f5017;
                    float f = c8157.f19885;
                    c2593.mo3269(j, (((long) Float.floatToRawIntBits(c8157.f19884)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), AbstractC2416.m3450(c8157), 1.0f, c2345, 3);
                    c = ' ';
                    c2345 = c2345;
                } else if (abstractC24162 instanceof C2411) {
                    C2411 c2411 = (C2411) abstractC24162;
                    C2449 c24492 = c2411.f5002;
                    if (c24492 != null) {
                        c2593.m3869(c24492, j, c2345);
                        c = ' ';
                    } else {
                        C8156 c8156 = c2411.f5001;
                        float f2 = c8156.f19877;
                        float f3 = c8156.f19878;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c8156.f19879 >> 32));
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(c8156.f19876 - f3)) << 32) | (((long) Float.floatToRawIntBits(c8156.f19875 - f2)) & 4294967295L);
                        c = ' ';
                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                        InterfaceC2436 interfaceC2436 = c2342.f4631.f4633;
                        int i = (int) (jFloatToRawIntBits >> 32);
                        int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                        interfaceC2436.mo3243(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)), C2342.m3271(c2342, j, c2345, 1.0f, 3));
                        c2593 = c2593;
                    }
                } else {
                    c = ' ';
                    if (!(abstractC24162 instanceof C2421)) {
                        C5043.m9170();
                        return;
                    } else {
                        c2593 = c2593;
                        c2593.m3869(((C2421) abstractC24162).f5018, j, c2345);
                    }
                }
                abstractC2433 = this.f3536;
                if (abstractC2433 != null) {
                    float f4 = this.f3535;
                    if (abstractC24162 instanceof C2420) {
                        C8157 c81572 = ((C2420) abstractC24162).f5017;
                        float f5 = c81572.f19885;
                        c2593.m3868(abstractC2433, (((long) Float.floatToRawIntBits(c81572.f19884)) & 4294967295L) | (Float.floatToRawIntBits(f5) << c), AbstractC2416.m3450(c81572), f4, c2345);
                    } else {
                        if (abstractC24162 instanceof C2411) {
                            C2411 c24112 = (C2411) abstractC24162;
                            abstractC24332 = abstractC2433;
                            c2449 = c24112.f5002;
                            if (c2449 == null) {
                                C8156 c81562 = c24112.f5001;
                                float f6 = c81562.f19877;
                                float f7 = c81562.f19878;
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c81562.f19879 >> c));
                                c2593.m3867(abstractC24332, (((long) Float.floatToRawIntBits(f7)) << c) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(c81562.f19876 - f7)) << c) | (((long) Float.floatToRawIntBits(c81562.f19875 - f6)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), f4, c2345);
                            }
                        } else if (!(abstractC24162 instanceof C2421)) {
                            C5043.m9170();
                            return;
                        } else {
                            abstractC24332 = abstractC2433;
                            c2449 = ((C2421) abstractC24162).f5018;
                        }
                        c2593.mo3263(c2449, abstractC24332, f4, c2345, 3);
                    }
                }
            }
        }
        ((C2593) interfaceC2341).m3871();
    }
}
