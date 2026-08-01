package androidx.activity;

import android.content.res.Resources;
import androidx.compose.animation.core.C1185;
import androidx.compose.animation.core.C1193;
import androidx.compose.animation.core.C1194;
import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.lazy.C1598;
import androidx.compose.foundation.lazy.grid.AbstractC1516;
import androidx.compose.foundation.lazy.grid.C1517;
import androidx.compose.foundation.lazy.grid.C1518;
import androidx.compose.foundation.lazy.staggeredgrid.C1577;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.AbstractC1828;
import androidx.compose.foundation.text.selection.C1726;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2841;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.EmptyList;
import p068.InterfaceC7387;
import p128.C8155;
import p128.C8157;
import p128.C8158;
import p183.C8542;
import p221.C8722;
import p221.C8733;
import p221.C8735;
import p221.C8737;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0863 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f383;

    public /* synthetic */ C0863(int i, C1598 c1598) {
        this.f383 = 22;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        int i = this.f383;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                return c6008;
            case 2:
                return new C1193(((Float) obj).floatValue());
            case 3:
                return new C1193(((Integer) obj).intValue());
            case 4:
                return Integer.valueOf((int) ((C1193) obj).f1538);
            case 5:
                return new C1193(((C8722) obj).f22204);
            case 6:
                return new C8722(((C1193) obj).f1538);
            case 7:
                C8733 c8733 = (C8733) obj;
                return new C1194(Float.intBitsToFloat((int) (c8733.f22218 >> 32)), Float.intBitsToFloat((int) (c8733.f22218 & 4294967295L)));
            case 8:
                C1194 c1194 = (C1194) obj;
                return new C8733((((long) Float.floatToRawIntBits(c1194.f1539)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1194.f1540)) << 32));
            case 9:
                C8155 c8155 = (C8155) obj;
                return new C1194(Float.intBitsToFloat((int) (c8155.f19872 >> 32)), Float.intBitsToFloat((int) (c8155.f19872 & 4294967295L)));
            case 10:
                C1194 c11942 = (C1194) obj;
                return new C8155((((long) Float.floatToRawIntBits(c11942.f1539)) & 4294967295L) | (((long) Float.floatToRawIntBits(c11942.f1540)) << 32));
            case 11:
                C8158 c8158 = (C8158) obj;
                return new C1194(Float.intBitsToFloat((int) (c8158.f19886 >> 32)), Float.intBitsToFloat((int) (c8158.f19886 & 4294967295L)));
            case 12:
                C1194 c11943 = (C1194) obj;
                return new C8158((((long) Float.floatToRawIntBits(c11943.f1539)) & 4294967295L) | (((long) Float.floatToRawIntBits(c11943.f1540)) << 32));
            case 13:
                long j = ((C8737) obj).f22225;
                return new C1194((int) (j >> 32), (int) (j & 4294967295L));
            case 14:
                C1194 c11944 = (C1194) obj;
                return new C8737((((long) Math.round(c11944.f1539)) & 4294967295L) | (((long) Math.round(c11944.f1540)) << 32));
            case 15:
                long j2 = ((C8735) obj).f22224;
                return new C1194((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 16:
                C1194 c11945 = (C1194) obj;
                int iRound = Math.round(c11945.f1540);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c11945.f1539);
                return new C8735((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 17:
                C8157 c8157 = (C8157) obj;
                return new C1185(c8157.f19885, c8157.f19884, c8157.f19883, c8157.f19882);
            case 18:
                C1185 c1185 = (C1185) obj;
                return new C8157(c1185.f1491, c1185.f1490, c1185.f1489, c1185.f1488);
            case 19:
                return Float.valueOf(((C1193) obj).f1538);
            case 20:
                ((Integer) obj).getClass();
                return null;
            case 21:
                List list = (List) obj;
                return new C1582(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 22:
                return c6008;
            case 23:
                List list2 = (List) obj;
                return new C1517(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 24:
                ((Integer) obj).intValue();
                return EmptyList.INSTANCE;
            case 25:
                ((Integer) obj).getClass();
                C1518 c1518 = AbstractC1516.f2220;
                return -1;
            case 26:
                List list3 = (List) obj;
                return new C1577((int[]) list3.get(0), (int[]) list3.get(1));
            case 27:
                int i2 = AbstractC1828.f3232;
                return c6008;
            case 28:
                return c6008;
            default:
                C1726 c1726 = (C1726) obj;
                String str = c1726.f2870.f6474;
                long j3 = c1726.f2863;
                int i3 = C2869.f6347;
                int i4 = (int) (j3 & 4294967295L);
                if (i4 > 0) {
                    C8542 c8542M2455 = AbstractC1821.m2455();
                    if (c8542M2455 == null) {
                        iOffsetByCodePoints = i4 <= 0 ? -1 : Character.offsetByCodePoints(str, i4, -1);
                    } else {
                        int iM13573 = c8542M2455.m13573(i4 - 1, str);
                        if (iM13573 >= 0) {
                            iOffsetByCodePoints = iM13573;
                        } else if (i4 > 0) {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i4, -1);
                        }
                    }
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new C2841(((int) (c1726.f2863 & 4294967295L)) - iOffsetByCodePoints, 0);
        }
    }

    public /* synthetic */ C0863(int i) {
        this.f383 = i;
    }
}
