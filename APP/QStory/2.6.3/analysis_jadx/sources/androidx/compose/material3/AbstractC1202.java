package androidx.compose.material3;

import androidx.activity.compose.C0011;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.InterfaceC1569;
import io.ktor.util.C4211;
import p181.AbstractC7755;
import p181.AbstractC7760;
import p181.C7756;
import p181.C7758;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1334 f3454 = new C1334(new C0011(18));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7756 m2031(AbstractC7760 abstractC7760) {
        C7758 c7758 = AbstractC1218.f3509;
        return AbstractC7760.m13114(abstractC7760, null, null, c7758, c7758, 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC1569 m2032(ShapeKeyTokens shapeKeyTokens, InterfaceC1373 interfaceC1373) {
        C1219 c1219 = (C1219) ((C1324) interfaceC1373).m2383(f3454);
        switch (AbstractC1203.f3455[shapeKeyTokens.ordinal()]) {
            case 1:
                return c1219.f3511;
            case 2:
                return c1219.f3517;
            case 3:
                return c1219.f3516;
            case 4:
                return m2031(c1219.f3511);
            case 5:
                return c1219.f3515;
            case 6:
                return m2031(c1219.f3515);
            case 7:
                return AbstractC7755.f21043;
            case 8:
                return c1219.f3512;
            case 9:
                return c1219.f3510;
            case 10:
                AbstractC7760 abstractC7760 = c1219.f3512;
                C7758 c7758 = AbstractC1218.f3509;
                return AbstractC7760.m13114(abstractC7760, c7758, null, null, c7758, 6);
            case 11:
                return m2031(c1219.f3512);
            case 12:
                return c1219.f3513;
            case 13:
                return AbstractC1581.f4662;
            case 14:
                return c1219.f3514;
            case 15:
                AbstractC7760 abstractC77602 = c1219.f3512;
                C7758 c77582 = AbstractC1218.f3509;
                return AbstractC7760.m13114(abstractC77602, null, c77582, c77582, null, 9);
            default:
                C4211.m8611();
                return null;
        }
    }
}
