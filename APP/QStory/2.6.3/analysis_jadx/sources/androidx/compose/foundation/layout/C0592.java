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
import kotlin.C5176;
import p052.InterfaceC6554;
import p205.C7893;
import p287.AbstractC8405;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0592 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f1666;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1667;

    public /* synthetic */ C0592(C1242 c1242, int i) {
        this.f1667 = i;
        this.f1666 = c1242;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1667;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2339();
                } else {
                    this.f1666.invoke(C0587.f1648, c1324, 6);
                }
                break;
            default:
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC8405.m13972(3215);
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2343(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    c13242.m2339();
                } else {
                    C1334 c1334 = AbstractC1197.f3452;
                    long j = ((C1192) c13242.m2383(c1334)).f3436;
                    C1358 c1358 = AbstractC1213.f3496;
                    c13242.m2392(89374938);
                    C1192 c1192 = (C1192) c13242.m2383(c1334);
                    long j2 = c1192.f3429;
                    long j3 = c1192.f3400;
                    long j4 = c1192.f3403;
                    long j5 = c1192.f3411;
                    long j6 = c1192.f3438;
                    if (C1599.m2949(j, j2)) {
                        j6 = c1192.f3428;
                    } else if (C1599.m2949(j, c1192.f3424)) {
                        j6 = c1192.f3443;
                    } else if (C1599.m2949(j, c1192.f3447)) {
                        j6 = c1192.f3444;
                    } else if (C1599.m2949(j, c1192.f3436)) {
                        j6 = c1192.f3440;
                    } else if (C1599.m2949(j, c1192.f3432)) {
                        j6 = c1192.f3433;
                    } else if (C1599.m2949(j, c1192.f3427)) {
                        j6 = c1192.f3426;
                    } else if (C1599.m2949(j, c1192.f3442)) {
                        j6 = c1192.f3446;
                    } else if (C1599.m2949(j, c1192.f3445)) {
                        j6 = c1192.f3437;
                    } else if (C1599.m2949(j, c1192.f3417)) {
                        j6 = c1192.f3416;
                    } else if (C1599.m2949(j, c1192.f3434)) {
                        j6 = c1192.f3435;
                    } else if (!C1599.m2949(j, c1192.f3441)) {
                        if (C1599.m2949(j, c1192.f3439)) {
                            j6 = c1192.f3431;
                        } else if (!C1599.m2949(j, c1192.f3412) && !C1599.m2949(j, c1192.f3422) && !C1599.m2949(j, c1192.f3421) && !C1599.m2949(j, c1192.f3420) && !C1599.m2949(j, c1192.f3419) && !C1599.m2949(j, c1192.f3418) && !C1599.m2949(j, c1192.f3423)) {
                            j6 = (C1599.m2949(j, c1192.f3409) || C1599.m2949(j, c1192.f3408)) ? j5 : (C1599.m2949(j, c1192.f3406) || C1599.m2949(j, c1192.f3407)) ? j4 : (C1599.m2949(j, c1192.f3405) || C1599.m2949(j, c1192.f3404)) ? j3 : C1599.f4697;
                        }
                    }
                    if (j6 == 16) {
                        j6 = ((C1599) c13242.m2383(AbstractC1195.f3449)).f4700;
                    }
                    c13242.m2377(false);
                    C1358 c13582 = AbstractC1213.f3496;
                    float f = ((C7893) c13242.m2383(c13582)).f21859 + 0.0f;
                    AbstractC1367.m2486(new C0194[]{AbstractC1195.f3449.mo2428(new C1599(j6)), c13582.mo2428(new C7893(f))}, AbstractC1254.m2189(421772006, new C1210(C2125.f6276, AbstractC1581.f4662, j, f, this.f1666), c13242), c13242, 56);
                }
                break;
        }
        return c5176;
    }
}
