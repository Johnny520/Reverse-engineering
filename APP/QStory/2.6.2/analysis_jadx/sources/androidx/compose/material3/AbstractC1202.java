package androidx.compose.material3;

import androidx.activity.compose.C0011;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.InterfaceC1569;
import io.ktor.util.C4210;
import p181.AbstractC7754;
import p181.AbstractC7759;
import p181.C7755;
import p181.C7757;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1334 f3453 = new C1334(new C0011(18));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7755 m2021(AbstractC7759 abstractC7759) {
        C7757 c7757 = AbstractC1218.f3508;
        return AbstractC7759.m13086(abstractC7759, null, null, c7757, c7757, 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC1569 m2022(ShapeKeyTokens shapeKeyTokens, InterfaceC1373 interfaceC1373) {
        C1219 c1219 = (C1219) ((C1324) interfaceC1373).m2373(f3453);
        switch (AbstractC1203.f3454[shapeKeyTokens.ordinal()]) {
            case 1:
                return c1219.f3510;
            case 2:
                return c1219.f3516;
            case 3:
                return c1219.f3515;
            case 4:
                return m2021(c1219.f3510);
            case 5:
                return c1219.f3514;
            case 6:
                return m2021(c1219.f3514);
            case 7:
                return AbstractC7754.f21046;
            case 8:
                return c1219.f3511;
            case 9:
                return c1219.f3509;
            case 10:
                AbstractC7759 abstractC7759 = c1219.f3511;
                C7757 c7757 = AbstractC1218.f3508;
                return AbstractC7759.m13086(abstractC7759, c7757, null, null, c7757, 6);
            case 11:
                return m2021(c1219.f3511);
            case 12:
                return c1219.f3512;
            case 13:
                return AbstractC1581.f4661;
            case 14:
                return c1219.f3513;
            case 15:
                AbstractC7759 abstractC77592 = c1219.f3511;
                C7757 c77572 = AbstractC1218.f3508;
                return AbstractC7759.m13086(abstractC77592, null, c77572, c77572, null, 9);
            default:
                C4210.m8621();
                return null;
        }
    }
}
