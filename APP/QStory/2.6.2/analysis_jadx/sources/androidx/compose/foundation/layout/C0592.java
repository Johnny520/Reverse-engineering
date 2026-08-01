package androidx.compose.foundation.layout;

import androidx.appcompat.widget.C0194;
import androidx.compose.material3.AbstractC1195;
import androidx.compose.material3.AbstractC1197;
import androidx.compose.material3.AbstractC1213;
import androidx.compose.material3.C1192;
import androidx.compose.material3.C1210;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.C2125;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import p052.InterfaceC6553;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0592 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f1665;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1666;

    public /* synthetic */ C0592(C1242 c1242, int i) {
        this.f1666 = i;
        this.f1665 = c1242;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1666;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2329();
                } else {
                    this.f1665.invoke(C0587.f1647, c1324, 6);
                }
                break;
            default:
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC3056.m6668(-3937345641592915367L);
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2333(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    c13242.m2329();
                } else {
                    C1334 c1334 = AbstractC1197.f3451;
                    long j = ((C1192) c13242.m2373(c1334)).f3435;
                    C1358 c1358 = AbstractC1213.f3495;
                    c13242.m2382(89374938);
                    C1192 c1192 = (C1192) c13242.m2373(c1334);
                    long j2 = c1192.f3428;
                    long j3 = c1192.f3399;
                    long j4 = c1192.f3402;
                    long j5 = c1192.f3410;
                    long j6 = c1192.f3437;
                    if (C1599.m2939(j, j2)) {
                        j6 = c1192.f3427;
                    } else if (C1599.m2939(j, c1192.f3423)) {
                        j6 = c1192.f3442;
                    } else if (C1599.m2939(j, c1192.f3446)) {
                        j6 = c1192.f3443;
                    } else if (C1599.m2939(j, c1192.f3435)) {
                        j6 = c1192.f3439;
                    } else if (C1599.m2939(j, c1192.f3431)) {
                        j6 = c1192.f3432;
                    } else if (C1599.m2939(j, c1192.f3426)) {
                        j6 = c1192.f3425;
                    } else if (C1599.m2939(j, c1192.f3441)) {
                        j6 = c1192.f3445;
                    } else if (C1599.m2939(j, c1192.f3444)) {
                        j6 = c1192.f3436;
                    } else if (C1599.m2939(j, c1192.f3416)) {
                        j6 = c1192.f3415;
                    } else if (C1599.m2939(j, c1192.f3433)) {
                        j6 = c1192.f3434;
                    } else if (!C1599.m2939(j, c1192.f3440)) {
                        if (C1599.m2939(j, c1192.f3438)) {
                            j6 = c1192.f3430;
                        } else if (!C1599.m2939(j, c1192.f3411) && !C1599.m2939(j, c1192.f3421) && !C1599.m2939(j, c1192.f3420) && !C1599.m2939(j, c1192.f3419) && !C1599.m2939(j, c1192.f3418) && !C1599.m2939(j, c1192.f3417) && !C1599.m2939(j, c1192.f3422)) {
                            j6 = (C1599.m2939(j, c1192.f3408) || C1599.m2939(j, c1192.f3407)) ? j5 : (C1599.m2939(j, c1192.f3405) || C1599.m2939(j, c1192.f3406)) ? j4 : (C1599.m2939(j, c1192.f3404) || C1599.m2939(j, c1192.f3403)) ? j3 : C1599.f4696;
                        }
                    }
                    if (j6 == 16) {
                        j6 = ((C1599) c13242.m2373(AbstractC1195.f3448)).f4699;
                    }
                    c13242.m2367(false);
                    C1358 c13582 = AbstractC1213.f3495;
                    float f = ((C7892) c13242.m2373(c13582)).f21862 + 0.0f;
                    AbstractC1367.m2477(new C0194[]{AbstractC1195.f3448.mo2418(new C1599(j6)), c13582.mo2418(new C7892(f))}, AbstractC1254.m2179(421772006, new C1210(C2125.f6275, AbstractC1581.f4661, j, f, this.f1665), c13242), c13242, 56);
                }
                break;
        }
        return c5175;
    }
}
