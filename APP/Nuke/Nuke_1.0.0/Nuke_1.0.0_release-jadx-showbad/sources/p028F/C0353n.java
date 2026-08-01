package p028F;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import me.dartcv.nuke.BuildConfig;
import org.xmlpull.v1.XmlPullParserException;
import p018D.C0255d;
import p056K2.C0891q;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1604f;
import p211o0.C2762u;

/* JADX INFO: renamed from: F.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0353n implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1115d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1116e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0353n(int i5, Object obj) {
        this.f1115d = i5;
        this.f1116e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        switch (this.f1115d) {
            case 0:
                long j5 = ((C2762u) obj).f8764a;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1383r) interfaceC1373m).m2580e(j5) ? 4 : 2;
                }
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC0355p.m564b(((C0255d) this.f1116e).f843c, j5, c1383r, (iIntValue << 3) & 112);
                } else {
                    c1383r.m2563R();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                long j6 = ((C2762u) obj).f8764a;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C0361v.f1133a.m598a((Drawable) this.f1116e, c1383r2, 48);
                } else {
                    c1383r2.m2563R();
                }
                break;
            default:
                long j7 = ((C2762u) obj).f8764a;
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (c1383r3.m2560O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    C0361v.f1133a.m599b(((RemoteAction) this.f1116e).getIcon(), c1383r3, 48);
                } else {
                    c1383r3.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
