package androidx.compose.material3;

import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.text.C1833;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.AbstractC2414;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2450;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.input.pointer.AbstractC2457;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p221.C8722;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2045 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C2077 f3835;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ float f3836;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2404 f3837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f3838;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2962 f3839;

    public C2045(InterfaceC2962 interfaceC2962, InterfaceC2404 interfaceC2404, long j, float f, C2077 c2077) {
        this.f3839 = interfaceC2962;
        this.f3837 = interfaceC2404;
        this.f3838 = j;
        this.f3836 = f;
        this.f3835 = c2077;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2962 interfaceC2962M3452;
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
        int iIntValue = ((Number) obj2).intValue();
        C2159 c2159 = (C2159) interfaceC2208;
        boolean zM2903 = c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2);
        C6008 c6008 = C6008.f15084;
        if (!zM2903) {
            c2159.m2899();
            return c6008;
        }
        C2027 c2027 = (C2027) c2159.m2943(AbstractC2032.f3797);
        boolean zBooleanValue = ((Boolean) c2159.m2943(AbstractC2032.f3796)).booleanValue();
        long jM3459 = c2027.f3786;
        long j = this.f3838;
        if (C2434.m3509(j, jM3459) && zBooleanValue) {
            if (!C8722.m13877(this.f3836, 0.0f)) {
                jM3459 = AbstractC2416.m3459(C2434.m3510(((((float) Math.log(r4 + 1.0f)) * 4.5f) + 2.0f) / 100.0f, c2027.f3775), jM3459);
            }
        } else {
            jM3459 = j;
        }
        float fMo1904 = ((InterfaceC8725) c2159.m2943(AbstractC2737.f5933)).mo1904(0.0f);
        C2958 c2958 = C2958.f6621;
        InterfaceC2404 interfaceC2404 = this.f3837;
        if (fMo1904 > 0.0f) {
            long j2 = C2450.f5072;
            long j3 = AbstractC2414.f5003;
            interfaceC2962M3452 = AbstractC2416.m3452(c2958, 1.0f, fMo1904, j2, interfaceC2404, false, j3, j3);
        } else {
            interfaceC2962M3452 = c2958;
        }
        InterfaceC2962 interfaceC2962M3147 = AbstractC2280.m3147(AbstractC1910.m2540(this.f3839.mo4426(interfaceC2962M3452).mo4426(c2958), jM3459, interfaceC2404), interfaceC2404);
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (objM2905 == c2188) {
            objM2905 = new C1833(9);
            c2159.m2946(objM2905);
        }
        InterfaceC2962 interfaceC2962M4209 = AbstractC2783.m4209(interfaceC2962M3147, false, (InterfaceC7387) objM2905);
        Object objM29052 = c2159.m2905();
        if (objM29052 == c2188) {
            objM29052 = C2046.f3840;
            c2159.m2946(objM29052);
        }
        InterfaceC2962 interfaceC2962M3562 = AbstractC2457.m3562(interfaceC2962M4209, c6008, (PointerInputEventHandler) objM29052);
        InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, true);
        int iM3048 = AbstractC2202.m3048(c2159);
        C2088 c2088M2941 = c2159.m2941();
        InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M3562);
        InterfaceC2619.f5567.getClass();
        InterfaceC7372 interfaceC7372 = C2600.f5530;
        c2159.m2956();
        if (c2159.f4183) {
            c2159.m2940(interfaceC7372);
        } else {
            c2159.m2950();
        }
        AbstractC2202.m3032(c2159, interfaceC2493M2011, C2600.f5526);
        AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
        InterfaceC7383 interfaceC7383 = C2600.f5533;
        if (c2159.f4183 || !AbstractC5227.m9466(c2159.m2905(), Integer.valueOf(iM3048))) {
            c2159.m2946(Integer.valueOf(iM3048));
            c2159.m2924(Integer.valueOf(iM3048), interfaceC7383);
        }
        AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
        this.f3835.invoke(c2159, 0);
        c2159.m2937(true);
        return c6008;
    }
}
