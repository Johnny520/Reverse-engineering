package androidx.compose.p001ui.window;

import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class AndroidPopup_androidKt$Popup$1 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2951 $alignment;
    final /* synthetic */ InterfaceC7383 $content;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC7372 $onDismissRequest;
    final /* synthetic */ C2923 $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$1(InterfaceC2951 interfaceC2951, long j, InterfaceC7372 interfaceC7372, C2923 c2923, InterfaceC7383 interfaceC7383, int i, int i2) {
        super(2);
        this.$alignment = interfaceC2951;
        this.$offset = j;
        this.$onDismissRequest = interfaceC7372;
        this.$properties = c2923;
        this.$content = interfaceC7383;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2923 c2923;
        InterfaceC2951 interfaceC2951 = this.$alignment;
        long j = this.$offset;
        InterfaceC7372 interfaceC7372 = this.$onDismissRequest;
        C2923 c29232 = this.$properties;
        InterfaceC7383 interfaceC7383 = this.$content;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i3 = this.$$default;
        C2193 c2193 = AbstractC2924.f6543;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(71005054);
        int i4 = i3 & 1;
        if (i4 != 0) {
            i2 = iM3031 | 6;
        } else if ((iM3031 & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2951) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((iM3031 & 48) == 0) {
            i2 |= c2159.m2921(j) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((iM3031 & 384) == 0) {
            i2 |= c2159.m2938(interfaceC7372) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i2 |= 3072;
        } else if ((iM3031 & 3072) == 0) {
            i2 |= c2159.m2920(c29232) ? 2048 : 1024;
        }
        if ((iM3031 & 24576) == 0) {
            i2 |= c2159.m2938(interfaceC7383) ? 16384 : 8192;
        }
        if (c2159.m2903(i2 & 1, (i2 & 9363) != 9362)) {
            if (i4 != 0) {
                interfaceC2951 = C2952.f6617;
            }
            if (i5 != 0) {
                j = 0;
            }
            if (i6 != 0) {
                interfaceC7372 = null;
            }
            if (i7 != 0) {
                c29232 = new C2923(31);
            }
            boolean zM2920 = c2159.m2920(null) | c2159.m2922(c29232.f6536) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM2905 = c2159.m2905();
            if (zM2920 || objM2905 == C2204.f4319) {
                objM2905 = new C2929(interfaceC2951, j);
                c2159.m2946(objM2905);
            }
            int i8 = (i2 >> 3) & 8176;
            C2923 c29233 = c29232;
            AbstractC2924.m4395((C2929) objM2905, interfaceC7372, c29233, interfaceC7383, c2159, i8, 0);
            c2923 = c29233;
        } else {
            c2159.m2899();
            c2923 = c29232;
        }
        InterfaceC2951 interfaceC29512 = interfaceC2951;
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new AndroidPopup_androidKt$Popup$1(interfaceC29512, j, interfaceC7372, c2923, interfaceC7383, iM3031, i3);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
