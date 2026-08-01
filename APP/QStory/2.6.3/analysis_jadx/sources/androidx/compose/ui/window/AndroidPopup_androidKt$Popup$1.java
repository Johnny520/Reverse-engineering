package androidx.compose.ui.window;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2118;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidPopup_androidKt$Popup$1 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2118 $alignment;
    final /* synthetic */ InterfaceC6554 $content;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC6543 $onDismissRequest;
    final /* synthetic */ C2090 $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$1(InterfaceC2118 interfaceC2118, long j, InterfaceC6543 interfaceC6543, C2090 c2090, InterfaceC6554 interfaceC6554, int i, int i2) {
        super(2);
        this.$alignment = interfaceC2118;
        this.$offset = j;
        this.$onDismissRequest = interfaceC6543;
        this.$properties = c2090;
        this.$content = interfaceC6554;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C2090 c2090;
        InterfaceC2118 interfaceC2118 = this.$alignment;
        long j = this.$offset;
        InterfaceC6543 interfaceC6543 = this.$onDismissRequest;
        C2090 c20902 = this.$properties;
        InterfaceC6554 interfaceC6554 = this.$content;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        int i3 = this.$$default;
        C1358 c1358 = AbstractC2091.f6198;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(71005054);
        int i4 = i3 & 1;
        if (i4 != 0) {
            i2 = iM2471 | 6;
        } else if ((iM2471 & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2118) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((iM2471 & 48) == 0) {
            i2 |= c1324.m2361(j) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((iM2471 & 384) == 0) {
            i2 |= c1324.m2378(interfaceC6543) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i2 |= 3072;
        } else if ((iM2471 & 3072) == 0) {
            i2 |= c1324.m2360(c20902) ? 2048 : 1024;
        }
        if ((iM2471 & 24576) == 0) {
            i2 |= c1324.m2378(interfaceC6554) ? 16384 : 8192;
        }
        if (c1324.m2343(i2 & 1, (i2 & 9363) != 9362)) {
            if (i4 != 0) {
                interfaceC2118 = C2119.f6272;
            }
            if (i5 != 0) {
                j = 0;
            }
            if (i6 != 0) {
                interfaceC6543 = null;
            }
            if (i7 != 0) {
                c20902 = new C2090(31);
            }
            boolean zM2360 = c1324.m2360(null) | c1324.m2362(c20902.f6191) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM2345 = c1324.m2345();
            if (zM2360 || objM2345 == C1369.f3974) {
                objM2345 = new C2096(interfaceC2118, j);
                c1324.m2386(objM2345);
            }
            int i8 = (i2 >> 3) & 8176;
            C2090 c20903 = c20902;
            AbstractC2091.m3835((C2096) objM2345, interfaceC6543, c20903, interfaceC6554, c1324, i8, 0);
            c2090 = c20903;
        } else {
            c1324.m2339();
            c2090 = c20902;
        }
        InterfaceC2118 interfaceC21182 = interfaceC2118;
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new AndroidPopup_androidKt$Popup$1(interfaceC21182, j, interfaceC6543, c2090, interfaceC6554, iM2471, i3);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
