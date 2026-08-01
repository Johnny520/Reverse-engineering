package androidx.compose.ui.window;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2118;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidPopup_androidKt$Popup$1 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2118 $alignment;
    final /* synthetic */ InterfaceC6553 $content;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC6542 $onDismissRequest;
    final /* synthetic */ C2090 $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$1(InterfaceC2118 interfaceC2118, long j, InterfaceC6542 interfaceC6542, C2090 c2090, InterfaceC6553 interfaceC6553, int i, int i2) {
        super(2);
        this.$alignment = interfaceC2118;
        this.$offset = j;
        this.$onDismissRequest = interfaceC6542;
        this.$properties = c2090;
        this.$content = interfaceC6553;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C2090 c2090;
        InterfaceC2118 interfaceC2118 = this.$alignment;
        long j = this.$offset;
        InterfaceC6542 interfaceC6542 = this.$onDismissRequest;
        C2090 c20902 = this.$properties;
        InterfaceC6553 interfaceC6553 = this.$content;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        int i3 = this.$$default;
        C1358 c1358 = AbstractC2091.f6197;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(71005054);
        int i4 = i3 & 1;
        if (i4 != 0) {
            i2 = iM2460 | 6;
        } else if ((iM2460 & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2118) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((iM2460 & 48) == 0) {
            i2 |= c1324.m2351(j) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((iM2460 & 384) == 0) {
            i2 |= c1324.m2368(interfaceC6542) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i2 |= 3072;
        } else if ((iM2460 & 3072) == 0) {
            i2 |= c1324.m2350(c20902) ? 2048 : 1024;
        }
        if ((iM2460 & 24576) == 0) {
            i2 |= c1324.m2368(interfaceC6553) ? 16384 : 8192;
        }
        if (c1324.m2333(i2 & 1, (i2 & 9363) != 9362)) {
            if (i4 != 0) {
                interfaceC2118 = C2119.f6271;
            }
            if (i5 != 0) {
                j = 0;
            }
            if (i6 != 0) {
                interfaceC6542 = null;
            }
            if (i7 != 0) {
                c20902 = new C2090(31);
            }
            boolean zM2350 = c1324.m2350(null) | c1324.m2352(c20902.f6190) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM2335 = c1324.m2335();
            if (zM2350 || objM2335 == C1369.f3973) {
                objM2335 = new C2096(interfaceC2118, j);
                c1324.m2376(objM2335);
            }
            int i8 = (i2 >> 3) & 8176;
            C2090 c20903 = c20902;
            AbstractC2091.m3825((C2096) objM2335, interfaceC6542, c20903, interfaceC6553, c1324, i8, 0);
            c2090 = c20903;
        } else {
            c1324.m2329();
            c2090 = c20902;
        }
        InterfaceC2118 interfaceC21182 = interfaceC2118;
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new AndroidPopup_androidKt$Popup$1(interfaceC21182, j, interfaceC6542, c2090, interfaceC6553, iM2460, i3);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
