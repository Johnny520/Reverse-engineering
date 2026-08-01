package androidx.compose.foundation;

import androidx.collection.C1083;
import androidx.collection.C1099;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.C1802;
import androidx.compose.foundation.text.C1836;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.text.input.C2838;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.C2198;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2206;
import androidx.compose.runtime.snapshots.C2116;
import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.AbstractC3887;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p104.AbstractC8005;
import p104.C7992;
import p345.AbstractC9594;
import p345.C9595;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1886 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3436;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f3438;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3439;

    public /* synthetic */ C1886(C1802 c1802, AbstractC2559 abstractC2559, int i) {
        this.f3439 = 1;
        this.f3436 = c1802;
        this.f3437 = abstractC2559;
        this.f3438 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        InterfaceC2206 interfaceC2206;
        InterfaceC2206 interfaceC22062;
        int i;
        boolean z;
        int i2 = this.f3439;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f3437;
        int i3 = this.f3438;
        Object obj3 = this.f3436;
        switch (i2) {
            case 0:
                C1884 c1884 = (C1884) obj3;
                AbstractC2559 abstractC2559 = (AbstractC2559) obj2;
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                int iM2505 = c1884.f3432.m2505();
                if (iM2505 < 0) {
                    iM2505 = 0;
                }
                if (iM2505 <= i3) {
                    i3 = iM2505;
                }
                int i4 = -i3;
                boolean z2 = c1884.f3433;
                int i5 = z2 ? 0 : i4;
                if (!z2) {
                    i4 = 0;
                }
                abstractC2543.f5325 = true;
                AbstractC2543.m3693(abstractC2543, abstractC2559, i5, i4);
                abstractC2543.f5325 = false;
                break;
            case 1:
                C1802 c1802 = (C1802) obj3;
                AbstractC2559 abstractC25592 = (AbstractC2559) obj2;
                AbstractC2543 abstractC25432 = (AbstractC2543) obj;
                int i6 = c1802.f3092;
                C1836 c1836 = c1802.f3094;
                C2838 c2838 = c1802.f3093;
                C1801 c1801 = (C1801) c1802.f3091.invoke();
                c1836.m2478(Orientation.Vertical, AbstractC1821.m2467(abstractC25432, i6, c2838, c1801 != null ? c1801.f3090 : null, false, abstractC25592.f5344), i3, abstractC25592.f5342);
                AbstractC2543.m3692(abstractC25432, abstractC25592, 0, Math.round(-c1836.m2479()));
                break;
            case 2:
                C2224 c2224 = (C2224) obj3;
                C1099 c1099 = (C1099) obj2;
                InterfaceC2206 interfaceC22063 = (InterfaceC2206) obj;
                if (c2224.f4378 == i3 && AbstractC5227.m9466(c1099, c2224.f4377) && (interfaceC22063 instanceof C2198)) {
                    long[] jArr = c1099.f1263;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((255 & j) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        Object obj4 = c1099.f1262[i11];
                                        boolean z3 = c1099.f1261[i11] != i3;
                                        if (z3) {
                                            i = i8;
                                            C2198 c2198 = (C2198) interfaceC22063;
                                            interfaceC22062 = interfaceC22063;
                                            C1083 c1083 = c2198.f4308;
                                            AbstractC3887.m7202(c1083, obj4, c2224);
                                            z = z3;
                                            if (obj4 instanceof C2197) {
                                                C2197 c2197 = (C2197) obj4;
                                                if (!c1083.m1312(c2197)) {
                                                    AbstractC3887.m7196(c2198.f4296, c2197);
                                                }
                                                C1083 c10832 = c2224.f4383;
                                                if (c10832 != null) {
                                                    c10832.m1318(obj4);
                                                }
                                            }
                                        } else {
                                            interfaceC22062 = interfaceC22063;
                                            z = z3;
                                            i = i8;
                                        }
                                        if (z) {
                                            c1099.m1362(i11);
                                        }
                                    } else {
                                        interfaceC22062 = interfaceC22063;
                                        i = i8;
                                    }
                                    j >>= i;
                                    i10++;
                                    i8 = i;
                                    interfaceC22063 = interfaceC22062;
                                }
                                interfaceC2206 = interfaceC22063;
                                if (i9 != i8) {
                                    break;
                                }
                            } else {
                                interfaceC2206 = interfaceC22063;
                            }
                            if (i7 != length) {
                                i7++;
                                interfaceC22063 = interfaceC2206;
                            }
                        }
                    }
                }
                break;
            default:
                Object obj5 = (AbstractC8005) obj3;
                C9595 c9595 = (C9595) obj;
                c9595.m15027("2.0", AbstractC3275.m5142(2295, c9595, "jsonrpc"));
                c9595.m15027(AbstractC9594.m15026(new C2116((String) obj2, i3, 2)), "error");
                String strM14532 = "id";
                if (obj5 == null) {
                    obj5 = C7992.INSTANCE;
                }
                c9595.m15027(obj5, strM14532);
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1886(int i, int i2, Object obj, Object obj2) {
        this.f3439 = i2;
        this.f3436 = obj;
        this.f3438 = i;
        this.f3437 = obj2;
    }
}
