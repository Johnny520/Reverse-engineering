package androidx.compose.material3;

import androidx.activity.compose.C0858;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.InterfaceC2208;
import io.ktor.util.C5043;
import p197.AbstractC8584;
import p197.AbstractC8589;
import p197.C8585;
import p197.C8587;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2037 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2169 f3799 = new C2169(new C0858(18));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8585 m2591(AbstractC8589 abstractC8589) {
        C8587 c8587 = AbstractC2053.f3854;
        return AbstractC8589.m13673(abstractC8589, null, null, c8587, c8587, 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2404 m2592(ShapeKeyTokens shapeKeyTokens, InterfaceC2208 interfaceC2208) {
        C2054 c2054 = (C2054) ((C2159) interfaceC2208).m2943(f3799);
        switch (AbstractC2038.f3800[shapeKeyTokens.ordinal()]) {
            case 1:
                return c2054.f3856;
            case 2:
                return c2054.f3862;
            case 3:
                return c2054.f3861;
            case 4:
                return m2591(c2054.f3856);
            case 5:
                return c2054.f3860;
            case 6:
                return m2591(c2054.f3860);
            case 7:
                return AbstractC8584.f21388;
            case 8:
                return c2054.f3857;
            case 9:
                return c2054.f3855;
            case 10:
                AbstractC8589 abstractC8589 = c2054.f3857;
                C8587 c8587 = AbstractC2053.f3854;
                return AbstractC8589.m13673(abstractC8589, c8587, null, null, c8587, 6);
            case 11:
                return m2591(c2054.f3857);
            case 12:
                return c2054.f3858;
            case 13:
                return AbstractC2416.f5007;
            case 14:
                return c2054.f3859;
            case 15:
                AbstractC8589 abstractC85892 = c2054.f3857;
                C8587 c85872 = AbstractC2053.f3854;
                return AbstractC8589.m13673(abstractC85892, null, c85872, c85872, null, 9);
            default:
                C5043.m9170();
                return null;
        }
    }
}
