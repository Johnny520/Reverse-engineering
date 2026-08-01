package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.Handle;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import kotlin.C6008;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p128.C8158;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1775 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2998;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2999;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3000;

    public /* synthetic */ C1775(Object obj, int i, Object obj2) {
        this.f3000 = i;
        this.f2998 = obj;
        this.f2999 = obj2;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        long j;
        C1801 c1801M2425;
        C1781 c1781;
        C2902 c2902;
        int i = this.f3000;
        Object obj = this.f2999;
        Object obj2 = this.f2998;
        switch (i) {
            case 0:
                AbstractC6231.m11036((InterfaceC6233) obj2, null, CoroutineStart.UNDISPATCHED, new C0130x4bd70adf((InterfaceC7387) obj, null), 1);
                return C6008.f15084;
            default:
                C1720 c1720 = (C1720) obj2;
                long j2 = ((C8735) ((InterfaceC2230) obj).getValue()).f22224;
                C8158 c8158M2329 = c1720.m2329();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (c8158M2329 != null) {
                    long j3 = c8158M2329.f19886;
                    C2902 c2902M2320 = c1720.m2320();
                    if (c2902M2320 != null && c2902M2320.f6474.length() != 0) {
                        Handle handle = (Handle) ((AbstractC2182) c1720.f2845).getValue();
                        int i2 = handle == null ? -1 : AbstractC1770.f2987[handle.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2) {
                                long j4 = c1720.m2319().f6291;
                                int i3 = C2869.f6347;
                                j = j4 >> 32;
                            } else {
                                if (i2 != 3) {
                                    C5043.m9170();
                                    return null;
                                }
                                long j5 = c1720.m2319().f6291;
                                int i4 = C2869.f6347;
                                j = j5 & 4294967295L;
                            }
                            int i5 = (int) j;
                            C1781 c17812 = c1720.f2832;
                            if (c17812 != null && (c1801M2425 = c17812.m2425()) != null && (c1781 = c1720.f2832) != null && (c2902 = c1781.f3015.f3301) != null) {
                                c1720.f2834.mo2442(i5);
                                int iM5650 = AbstractC3400.m5650(i5, 0, c2902.f6474.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c1801M2425.m2436(j3) >> 32));
                                C2867 c2867 = c1801M2425.f3090;
                                C2896 c2896 = c2867.f6335;
                                int iM4348 = c2896.m4348(iM5650);
                                float fM4301 = c2867.m4301(iM4348);
                                float fM4300 = c2867.m4300(iM4348);
                                float fM5631 = AbstractC3400.m5631(fIntBitsToFloat, Math.min(fM4301, fM4300), Math.max(fM4301, fM4300));
                                if (C8735.m13916(j2, 0L) || Math.abs(fIntBitsToFloat - fM5631) <= ((int) (j2 >> 32)) / 2) {
                                    float fM4346 = c2896.m4346(iM4348);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM5631)) << 32) | (((long) Float.floatToRawIntBits(((c2896.m4350(iM4348) - fM4346) / 2.0f) + fM4346)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C8158(jFloatToRawIntBits);
        }
    }
}
