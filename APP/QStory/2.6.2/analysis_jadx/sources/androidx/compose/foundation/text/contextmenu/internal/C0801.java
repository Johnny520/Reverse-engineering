package androidx.compose.foundation.text.contextmenu.internal;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.C1599;
import java.io.IOException;
import kotlin.C5175;
import org.xmlpull.v1.XmlPullParserException;
import p052.InterfaceC6550;
import p121.C7386;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0801 implements InterfaceC6550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2289;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2290;

    public /* synthetic */ C0801(Object obj, int i) {
        this.f2290 = i;
        this.f2289 = obj;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        int i = this.f2290;
        C0787 c0787 = C0787.f2257;
        C5175 c5175 = C5175.f14739;
        Object obj4 = this.f2289;
        switch (i) {
            case 0:
                long j = ((C1599) obj).f4699;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2351(j) ? 4 : 2;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c1324.m2329();
                } else {
                    AbstractC0802.m1619(((C7386) obj4).f20036, j, c1324, (iIntValue << 3) & 112);
                }
                break;
            case 1:
                long j2 = ((C1599) obj).f4699;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2333(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c13242.m2329();
                } else {
                    c0787.m1584((Drawable) obj4, c13242, 48);
                }
                break;
            default:
                long j3 = ((C1599) obj).f4699;
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                C1324 c13243 = (C1324) interfaceC13733;
                if (!c13243.m2333(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c13243.m2329();
                } else {
                    c0787.m1583(((RemoteAction) obj4).getIcon(), c13243, 48);
                }
                break;
        }
        return c5175;
    }
}
