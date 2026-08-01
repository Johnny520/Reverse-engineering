package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.C2068;
import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import kotlin.C5176;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p112.C7329;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0937 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2654;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2655;

    public /* synthetic */ C0937(Object obj, int i, Object obj2) {
        this.f2655 = i;
        this.f2653 = obj;
        this.f2654 = obj2;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        long j;
        C0963 c0963M1865;
        C0943 c0943;
        C2068 c2068;
        int i = this.f2655;
        Object obj = this.f2654;
        Object obj2 = this.f2653;
        switch (i) {
            case 0:
                AbstractC5399.m10477((InterfaceC5401) obj2, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1((InterfaceC6558) obj, null), 1);
                return C5176.f14739;
            default:
                C0882 c0882 = (C0882) obj2;
                long j2 = ((C7906) ((InterfaceC1395) obj).getValue()).f21879;
                C7329 c7329M1769 = c0882.m1769();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (c7329M1769 != null) {
                    long j3 = c7329M1769.f19541;
                    C2068 c2068M1760 = c0882.m1760();
                    if (c2068M1760 != null && c2068M1760.f6129.length() != 0) {
                        Handle handle = (Handle) ((AbstractC1347) c0882.f2500).getValue();
                        int i2 = handle == null ? -1 : AbstractC0932.f2642[handle.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2) {
                                long j4 = c0882.m1759().f5946;
                                int i3 = C2035.f6002;
                                j = j4 >> 32;
                            } else {
                                if (i2 != 3) {
                                    C4211.m8611();
                                    return null;
                                }
                                long j5 = c0882.m1759().f5946;
                                int i4 = C2035.f6002;
                                j = j5 & 4294967295L;
                            }
                            int i5 = (int) j;
                            C0943 c09432 = c0882.f2487;
                            if (c09432 != null && (c0963M1865 = c09432.m1865()) != null && (c0943 = c0882.f2487) != null && (c2068 = c0943.f2670.f2956) != null) {
                                c0882.f2489.mo1882(i5);
                                int iM5090 = AbstractC2567.m5090(i5, 0, c2068.f6129.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0963M1865.m1876(j3) >> 32));
                                C2033 c2033 = c0963M1865.f2745;
                                C2062 c2062 = c2033.f5990;
                                int iM3788 = c2062.m3788(iM5090);
                                float fM3741 = c2033.m3741(iM3788);
                                float fM3740 = c2033.m3740(iM3788);
                                float fM5071 = AbstractC2567.m5071(fIntBitsToFloat, Math.min(fM3741, fM3740), Math.max(fM3741, fM3740));
                                if (C7906.m13357(j2, 0L) || Math.abs(fIntBitsToFloat - fM5071) <= ((int) (j2 >> 32)) / 2) {
                                    float fM3786 = c2062.m3786(iM3788);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM5071)) << 32) | (((long) Float.floatToRawIntBits(((c2062.m3790(iM3788) - fM3786) / 2.0f) + fM3786)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C7329(jFloatToRawIntBits);
        }
    }
}
