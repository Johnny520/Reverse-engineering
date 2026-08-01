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
import com.bumptech.glide.AbstractC3055;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;
import p088.AbstractC7176;
import p088.C7163;
import p287.AbstractC8405;
import p329.AbstractC8765;
import p329.C8766;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1048 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f3093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3094;

    public /* synthetic */ C1048(C0964 c0964, AbstractC1724 abstractC1724, int i) {
        this.f3094 = 1;
        this.f3091 = c0964;
        this.f3092 = abstractC1724;
        this.f3093 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        InterfaceC1371 interfaceC1371;
        InterfaceC1371 interfaceC13712;
        int i;
        boolean z;
        int i2 = this.f3094;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f3092;
        int i3 = this.f3093;
        Object obj3 = this.f3091;
        switch (i2) {
            case 0:
                C1046 c1046 = (C1046) obj3;
                AbstractC1724 abstractC1724 = (AbstractC1724) obj2;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                int iM1945 = c1046.f3087.m1945();
                if (iM1945 < 0) {
                    iM1945 = 0;
                }
                if (iM1945 <= i3) {
                    i3 = iM1945;
                }
                int i4 = -i3;
                boolean z2 = c1046.f3088;
                int i5 = z2 ? 0 : i4;
                if (!z2) {
                    i4 = 0;
                }
                abstractC1708.f4980 = true;
                AbstractC1708.m3133(abstractC1708, abstractC1724, i5, i4);
                abstractC1708.f4980 = false;
                break;
            case 1:
                C0964 c0964 = (C0964) obj3;
                AbstractC1724 abstractC17242 = (AbstractC1724) obj2;
                AbstractC1708 abstractC17082 = (AbstractC1708) obj;
                int i6 = c0964.f2747;
                C0998 c0998 = c0964.f2749;
                C2004 c2004 = c0964.f2748;
                C0963 c0963 = (C0963) c0964.f2746.invoke();
                c0998.m1918(Orientation.Vertical, AbstractC0983.m1907(abstractC17082, i6, c2004, c0963 != null ? c0963.f2745 : null, false, abstractC17242.f4999), i3, abstractC17242.f4997);
                AbstractC1708.m3132(abstractC17082, abstractC17242, 0, Math.round(-c0998.m1919()));
                break;
            case 2:
                C1389 c1389 = (C1389) obj3;
                C0252 c0252 = (C0252) obj2;
                InterfaceC1371 interfaceC13713 = (InterfaceC1371) obj;
                if (c1389.f4033 == i3 && AbstractC4395.m8907(c0252, c1389.f4032) && (interfaceC13713 instanceof C1363)) {
                    long[] jArr = c0252.f918;
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
                                        Object obj4 = c0252.f917[i11];
                                        boolean z3 = c0252.f916[i11] != i3;
                                        if (z3) {
                                            i = i8;
                                            C1363 c1363 = (C1363) interfaceC13713;
                                            interfaceC13712 = interfaceC13713;
                                            C0236 c0236 = c1363.f3963;
                                            AbstractC3055.m6642(c0236, obj4, c1389);
                                            z = z3;
                                            if (obj4 instanceof C1362) {
                                                C1362 c1362 = (C1362) obj4;
                                                if (!c0236.m752(c1362)) {
                                                    AbstractC3055.m6636(c1363.f3951, c1362);
                                                }
                                                C0236 c02362 = c1389.f4038;
                                                if (c02362 != null) {
                                                    c02362.m758(obj4);
                                                }
                                            }
                                        } else {
                                            interfaceC13712 = interfaceC13713;
                                            z = z3;
                                            i = i8;
                                        }
                                        if (z) {
                                            c0252.m802(i11);
                                        }
                                    } else {
                                        interfaceC13712 = interfaceC13713;
                                        i = i8;
                                    }
                                    j >>= i;
                                    i10++;
                                    i8 = i;
                                    interfaceC13713 = interfaceC13712;
                                }
                                interfaceC1371 = interfaceC13713;
                                if (i9 != i8) {
                                    break;
                                }
                            } else {
                                interfaceC1371 = interfaceC13713;
                            }
                            if (i7 != length) {
                                i7++;
                                interfaceC13713 = interfaceC1371;
                            }
                        }
                    }
                }
                break;
            default:
                Object obj5 = (AbstractC7176) obj3;
                C8766 c8766 = (C8766) obj;
                c8766.m14468(AbstractC8405.m13973("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜喵呜喵"), AbstractC2442.m4582(2295, c8766, "喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵呜喵")); /* decoded-inline: 2.0 */
                c8766.m14468(AbstractC8765.m14467(new C1281((String) obj2, i3, 2)), AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜")); /* decoded-inline: error */
                String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"); /* decoded-inline: id */
                if (obj5 == null) {
                    obj5 = C7163.INSTANCE;
                }
                c8766.m14468(obj5, strM13973);
                break;
        }
        return c5176;
    }

    public /* synthetic */ C1048(int i, int i2, Object obj, Object obj2) {
        this.f3094 = i2;
        this.f3091 = obj;
        this.f3093 = i;
        this.f3092 = obj2;
    }
}
