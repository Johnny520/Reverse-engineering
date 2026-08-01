package androidx.compose.foundation.text.contextmenu.internal;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import java.io.IOException;
import kotlin.C6008;
import org.xmlpull.v1.XmlPullParserException;
import p068.InterfaceC7380;
import p137.C8216;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1641 implements InterfaceC7380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2635;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2636;

    public /* synthetic */ C1641(Object obj, int i) {
        this.f2636 = i;
        this.f2635 = obj;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        int i = this.f2636;
        C1627 c1627 = C1627.f2603;
        C6008 c6008 = C6008.f15084;
        Object obj4 = this.f2635;
        switch (i) {
            case 0:
                long j = ((C2434) obj).f5045;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C2159) interfaceC2208).m2921(j) ? 4 : 2;
                }
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c2159.m2899();
                } else {
                    AbstractC1642.m2189(((C8216) obj4).f20376, j, c2159, (iIntValue << 3) & 112);
                }
                break;
            case 1:
                long j2 = ((C2434) obj).f5045;
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C2159 c21592 = (C2159) interfaceC22082;
                if (!c21592.m2903(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c21592.m2899();
                } else {
                    c1627.m2154((Drawable) obj4, c21592, 48);
                }
                break;
            default:
                long j3 = ((C2434) obj).f5045;
                InterfaceC2208 interfaceC22083 = (InterfaceC2208) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                C2159 c21593 = (C2159) interfaceC22083;
                if (!c21593.m2903(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c21593.m2899();
                } else {
                    c1627.m2153(((RemoteAction) obj4).getIcon(), c21593, 48);
                }
                break;
        }
        return c6008;
    }
}
