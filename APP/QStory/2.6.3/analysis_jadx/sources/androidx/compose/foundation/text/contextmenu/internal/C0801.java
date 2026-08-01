package androidx.compose.foundation.text.contextmenu.internal;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.C1599;
import java.io.IOException;
import kotlin.C5176;
import org.xmlpull.v1.XmlPullParserException;
import p052.InterfaceC6551;
import p121.C7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0801 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2291;

    public /* synthetic */ C0801(Object obj, int i) {
        this.f2291 = i;
        this.f2290 = obj;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        int i = this.f2291;
        C0787 c0787 = C0787.f2258;
        C5176 c5176 = C5176.f14739;
        Object obj4 = this.f2290;
        switch (i) {
            case 0:
                long j = ((C1599) obj).f4700;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2361(j) ? 4 : 2;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c1324.m2339();
                } else {
                    AbstractC0802.m1629(((C7387) obj4).f20031, j, c1324, (iIntValue << 3) & 112);
                }
                break;
            case 1:
                long j2 = ((C1599) obj).f4700;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2343(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c13242.m2339();
                } else {
                    c0787.m1594((Drawable) obj4, c13242, 48);
                }
                break;
            default:
                long j3 = ((C1599) obj).f4700;
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                C1324 c13243 = (C1324) interfaceC13733;
                if (!c13243.m2343(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c13243.m2339();
                } else {
                    c0787.m1593(((RemoteAction) obj4).getIcon(), c13243, 48);
                }
                break;
        }
        return c5176;
    }
}
