package androidx.compose.material3;

import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.AbstractC1182;
import androidx.compose.animation.core.C1149;
import androidx.compose.animation.core.C1158;
import androidx.compose.animation.core.C1161;
import androidx.compose.animation.core.C1162;
import androidx.compose.animation.core.C1187;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.C1915;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.text.C1833;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.drawscope.C2344;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p134.AbstractC8183;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1979 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1187 f3629 = AbstractC8183.f19926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2579(InterfaceC2339 interfaceC2339, float f, float f2, long j, C2344 c2344) {
        float f3 = c2344.f4639 / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2339.mo3265() >> 32)) - (2.0f * f3);
        interfaceC2339.mo3267(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), c2344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2580(final InterfaceC2962 interfaceC2962, final long j, final float f, long j2, int i, float f2, InterfaceC2208 interfaceC2208, final int i2) {
        final long j3;
        final int i3;
        final float f3;
        long j4;
        int i4;
        final float f4;
        int i5;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(333154241);
        int i6 = i2 | (c2159.m2920(interfaceC2962) ? 4 : 2) | (c2159.m2921(j) ? 32 : 16) | 222208;
        if (c2159.m2903(i6 & 1, (74899 & i6) != 74898)) {
            c2159.m2901();
            if ((i2 & 1) == 0 || c2159.m2913()) {
                j4 = C2434.f5043;
                i4 = i6 & (-7169);
                f4 = 4.0f;
                i5 = 1;
            } else {
                c2159.m2899();
                i4 = i6 & (-7169);
                j4 = j2;
                i5 = i;
                f4 = f2;
            }
            c2159.m2934();
            final C2344 c2344 = new C2344(((InterfaceC8725) c2159.m2943(AbstractC2737.f5933)).mo1904(f), 0.0f, i5, 0, null, 26);
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (objM2905 == c2188) {
                objM2905 = new C1161();
                c2159.m2946(objM2905);
            }
            C1161 c1161 = (C1161) objM2905;
            c1161.m1499(c2159, 0);
            final long j5 = j4;
            final C1162 c1162M1587 = AbstractC1176.m1587(c1161, 0.0f, 1080.0f, AbstractC1176.m1579(AbstractC1176.m1573(6000, 2, AbstractC1182.f1486), null, 0L, 6), c2159);
            C1833 c1833 = new C1833(8);
            C1158 c1158 = new C1158();
            c1833.invoke(c1158);
            final C1162 c1162M15872 = AbstractC1176.m1587(c1161, 0.0f, 360.0f, AbstractC1176.m1579(new C1149(c1158), null, 0L, 6), c2159);
            C1158 c11582 = new C1158();
            c11582.f1395 = 6000;
            c11582.m1498(Float.valueOf(0.87f), 3000).f1396 = f3629;
            c11582.m1498(Float.valueOf(0.1f), 6000);
            final C1162 c1162M15873 = AbstractC1176.m1587(c1161, 0.1f, 0.87f, AbstractC1176.m1579(new C1149(c11582), null, 0L, 6), c2159);
            InterfaceC2962 interfaceC2962M1939 = AbstractC1460.m1939(AbstractC2783.m4209(interfaceC2962, true, new C1915(4)), 40.0f);
            boolean zM2920 = c2159.m2920(c1162M15873) | c2159.m2920(c1162M1587) | c2159.m2920(c1162M15872) | c2159.m2921(j5) | c2159.m2938(c2344) | ((((i4 & 112) ^ 48) > 32 && c2159.m2921(j)) || (i4 & 48) == 32);
            Object objM29052 = c2159.m2905();
            if (zM2920 || objM29052 == c2188) {
                final int i7 = i5;
                InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.material3.飘花落叶言子世哲苏楪兰
                    @Override // p068.InterfaceC7387
                    public final Object invoke(Object obj) {
                        long j6 = j5;
                        C2344 c23442 = c2344;
                        long j7 = j;
                        InterfaceC2339 interfaceC2339 = (InterfaceC2339) obj;
                        float fFloatValue = ((Number) c1162M15873.getValue()).floatValue() * 360.0f;
                        int i8 = i7;
                        float f5 = f4;
                        if (i8 != 0 && Float.intBitsToFloat((int) (interfaceC2339.mo3265() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC2339.mo3265() >> 32))) {
                            f5 += f;
                        }
                        float fMo1892 = (f5 / ((float) (((double) interfaceC2339.mo1892(Float.intBitsToFloat((int) (interfaceC2339.mo3265() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) c1162M15872.getValue()).floatValue() + ((Number) c1162M1587.getValue()).floatValue();
                        long jMo3268 = interfaceC2339.mo3268();
                        C0955 c0955Mo3266 = interfaceC2339.mo3266();
                        long jM928 = c0955Mo3266.m928();
                        c0955Mo3266.m946().mo3237();
                        try {
                            ((C0960) c0955Mo3266.f664).m994(fFloatValue2, jMo3268);
                            AbstractC1979.m2579(interfaceC2339, Math.min(fFloatValue, fMo1892) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo1892) * 2.0f), j6, c23442);
                            AbstractC1979.m2579(interfaceC2339, 0.0f, fFloatValue, j7, c23442);
                            c0955Mo3266.m946().mo3249();
                            c0955Mo3266.m921(jM928);
                            return C6008.f15084;
                        } catch (Throwable th) {
                            c0955Mo3266.m946().mo3249();
                            c0955Mo3266.m921(jM928);
                            throw th;
                        }
                    }
                };
                c2159.m2946(interfaceC7387);
                objM29052 = interfaceC7387;
            }
            AbstractC1910.m2544(interfaceC2962M1939, (InterfaceC7387) objM29052, c2159, 0);
            f3 = f4;
            j3 = j5;
            i3 = i5;
        } else {
            c2159.m2899();
            j3 = j2;
            i3 = i;
            f3 = f2;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383(j, f, j3, i3, f3, i2) { // from class: androidx.compose.material3.飘花落叶言子世哲苏兰楪

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ int f3638;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ long f3639;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
                public final /* synthetic */ float f3640;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ long f3641;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ float f3642;

                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3031 = AbstractC2202.m3031(385);
                    AbstractC1979.m2580(this.f3643, this.f3641, this.f3642, this.f3639, this.f3638, this.f3640, (InterfaceC2208) obj, iM3031);
                    return C6008.f15084;
                }
            };
        }
    }
}
