package androidx.compose.foundation;

import androidx.collection.C0236;
import androidx.collection.C0252;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.C0964;
import androidx.compose.foundation.text.C0998;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.C1363;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1371;
import androidx.compose.runtime.snapshots.C1281;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.text.input.C2004;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;
import p088.AbstractC7175;
import p088.C7162;
import p325.AbstractC8757;
import p325.C8758;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1048 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3090;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f3092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3093;

    public /* synthetic */ C1048(C0964 c0964, AbstractC1724 abstractC1724, int i) {
        this.f3093 = 1;
        this.f3090 = c0964;
        this.f3091 = abstractC1724;
        this.f3092 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        InterfaceC1371 interfaceC1371;
        InterfaceC1371 interfaceC13712;
        int i;
        boolean z;
        int i2 = this.f3093;
        int i3 = 2;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f3091;
        int i4 = this.f3092;
        Object obj3 = this.f3090;
        switch (i2) {
            case 0:
                C1046 c1046 = (C1046) obj3;
                AbstractC1724 abstractC1724 = (AbstractC1724) obj2;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                int iM1935 = c1046.f3086.m1935();
                if (iM1935 < 0) {
                    iM1935 = 0;
                }
                if (iM1935 <= i4) {
                    i4 = iM1935;
                }
                int i5 = -i4;
                boolean z2 = c1046.f3087;
                int i6 = z2 ? 0 : i5;
                if (!z2) {
                    i5 = 0;
                }
                abstractC1708.f4979 = true;
                AbstractC1708.m3123(abstractC1708, abstractC1724, i6, i5);
                abstractC1708.f4979 = false;
                break;
            case 1:
                C0964 c0964 = (C0964) obj3;
                AbstractC1724 abstractC17242 = (AbstractC1724) obj2;
                AbstractC1708 abstractC17082 = (AbstractC1708) obj;
                int i7 = c0964.f2746;
                C0998 c0998 = c0964.f2748;
                C2004 c2004 = c0964.f2747;
                C0963 c0963 = (C0963) c0964.f2745.invoke();
                c0998.m1908(Orientation.Vertical, AbstractC0983.m1897(abstractC17082, i7, c2004, c0963 != null ? c0963.f2744 : null, false, abstractC17242.f4998), i4, abstractC17242.f4996);
                AbstractC1708.m3122(abstractC17082, abstractC17242, 0, Math.round(-c0998.m1909()));
                break;
            case 2:
                C1389 c1389 = (C1389) obj3;
                C0252 c0252 = (C0252) obj2;
                InterfaceC1371 interfaceC13713 = (InterfaceC1371) obj;
                if (c1389.f4032 == i4 && AbstractC4394.m8917(c0252, c1389.f4031) && (interfaceC13713 instanceof C1363)) {
                    long[] jArr = c0252.f918;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        int i12 = (i8 << 3) + i11;
                                        Object obj4 = c0252.f917[i12];
                                        boolean z3 = c0252.f916[i12] != i4;
                                        if (z3) {
                                            i = i9;
                                            C1363 c1363 = (C1363) interfaceC13713;
                                            interfaceC13712 = interfaceC13713;
                                            C0236 c0236 = c1363.f3962;
                                            AbstractC3054.m6587(c0236, obj4, c1389);
                                            z = z3;
                                            if (obj4 instanceof C1362) {
                                                C1362 c1362 = (C1362) obj4;
                                                if (!c0236.m751(c1362)) {
                                                    AbstractC3054.m6586(c1363.f3950, c1362);
                                                }
                                                C0236 c02362 = c1389.f4037;
                                                if (c02362 != null) {
                                                    c02362.m757(obj4);
                                                }
                                            }
                                        } else {
                                            interfaceC13712 = interfaceC13713;
                                            z = z3;
                                            i = i9;
                                        }
                                        if (z) {
                                            c0252.m801(i12);
                                        }
                                    } else {
                                        interfaceC13712 = interfaceC13713;
                                        i = i9;
                                    }
                                    j >>= i;
                                    i11++;
                                    i9 = i;
                                    interfaceC13713 = interfaceC13712;
                                }
                                interfaceC1371 = interfaceC13713;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                interfaceC1371 = interfaceC13713;
                            }
                            if (i8 != length) {
                                i8++;
                                interfaceC13713 = interfaceC1371;
                            }
                        }
                    }
                }
                break;
            default:
                Object obj5 = (AbstractC7175) obj3;
                C8758 c8758 = (C8758) obj;
                c8758.m14434(AbstractC3056.m6668(-3937791330349221287L), AbstractC2442.m4573(-3937791360413992359L, c8758, -3937791295989482919L));
                c8758.m14434(AbstractC8757.m14433(new C1281((String) obj2, i4, i3)), AbstractC3056.m6668(-3937631042169734567L));
                String strM6668 = AbstractC3056.m6668(-3937592030981784999L);
                if (obj5 == null) {
                    obj5 = C7162.INSTANCE;
                }
                c8758.m14434(obj5, strM6668);
                break;
        }
        return c5175;
    }

    public /* synthetic */ C1048(int i, int i2, Object obj, Object obj2) {
        this.f3093 = i2;
        this.f3090 = obj;
        this.f3092 = i;
        this.f3091 = obj2;
    }
}
