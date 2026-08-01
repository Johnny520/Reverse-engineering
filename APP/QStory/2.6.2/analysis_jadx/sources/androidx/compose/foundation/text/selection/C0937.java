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
import io.ktor.util.C4210;
import kotlin.C5175;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import p000.AbstractC6087;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p112.C7328;
import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0937 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2652;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2654;

    public /* synthetic */ C0937(Object obj, int i, Object obj2) {
        this.f2654 = i;
        this.f2652 = obj;
        this.f2653 = obj2;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        long j;
        C0963 c0963M1855;
        C0943 c0943;
        C2068 c2068;
        int i = this.f2654;
        Object obj = this.f2653;
        Object obj2 = this.f2652;
        switch (i) {
            case 0:
                AbstractC5398.m10473((InterfaceC5400) obj2, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1((InterfaceC6557) obj, null), 1);
                return C5175.f14739;
            default:
                C0882 c0882 = (C0882) obj2;
                long j2 = ((C7905) ((InterfaceC1395) obj).getValue()).f21882;
                C7328 c7328M1759 = c0882.m1759();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (c7328M1759 != null) {
                    long j3 = c7328M1759.f19546;
                    C2068 c2068M1750 = c0882.m1750();
                    if (c2068M1750 != null && c2068M1750.f6128.length() != 0) {
                        Handle handle = (Handle) ((AbstractC1347) c0882.f2499).getValue();
                        int i2 = handle == null ? -1 : AbstractC0932.f2641[handle.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2) {
                                long j4 = c0882.m1749().f5945;
                                int i3 = C2035.f6001;
                                j = j4 >> 32;
                            } else {
                                if (i2 != 3) {
                                    C4210.m8621();
                                    return null;
                                }
                                long j5 = c0882.m1749().f5945;
                                int i4 = C2035.f6001;
                                j = j5 & 4294967295L;
                            }
                            int i5 = (int) j;
                            C0943 c09432 = c0882.f2486;
                            if (c09432 != null && (c0963M1855 = c09432.m1855()) != null && (c0943 = c0882.f2486) != null && (c2068 = c0943.f2669.f2955) != null) {
                                c0882.f2488.mo1872(i5);
                                int iM11420 = AbstractC6087.m11420(i5, 0, c2068.f6128.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0963M1855.m1866(j3) >> 32));
                                C2033 c2033 = c0963M1855.f2744;
                                C2062 c2062 = c2033.f5989;
                                int iM3778 = c2062.m3778(iM11420);
                                float fM3731 = c2033.m3731(iM3778);
                                float fM3730 = c2033.m3730(iM3778);
                                float fM11419 = AbstractC6087.m11419(fIntBitsToFloat, Math.min(fM3731, fM3730), Math.max(fM3731, fM3730));
                                if (C7905.m13329(j2, 0L) || Math.abs(fIntBitsToFloat - fM11419) <= ((int) (j2 >> 32)) / 2) {
                                    float fM3776 = c2062.m3776(iM3778);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM11419)) << 32) | (((long) Float.floatToRawIntBits(((c2062.m3780(iM3778) - fM3776) / 2.0f) + fM3776)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C7328(jFloatToRawIntBits);
        }
    }
}
