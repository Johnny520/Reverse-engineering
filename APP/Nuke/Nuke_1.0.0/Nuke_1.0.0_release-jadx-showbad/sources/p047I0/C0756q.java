package p047I0;

import android.content.Context;
import me.dartcv.nuke.BuildConfig;
import p077P0.AbstractC1132s;
import p077P0.C1125l;
import p077P0.C1128o;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: I0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0756q extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: f */
    public static final C0756q f2346f;

    /* JADX INFO: renamed from: g */
    public static final C0756q f2347g;

    /* JADX INFO: renamed from: h */
    public static final C0756q f2348h;

    /* JADX INFO: renamed from: i */
    public static final C0756q f2349i;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2350e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 1;
        f2346f = new C0756q(i5, 0);
        f2347g = new C0756q(i5, 1);
        f2348h = new C0756q(i5, 2);
        f2349i = new C0756q(i5, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0756q(int i5, int i6) {
        super(i5);
        this.f2350e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f2350e) {
            case 0:
                return Boolean.TRUE;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1125l c1125lM2173k = ((C1128o) obj).m2173k();
                return Boolean.valueOf(c1125lM2173k.f3702d.m4268c(AbstractC1132s.f3722A));
            case 2:
                InterfaceC1378o0 interfaceC1378o0 = (InterfaceC1378o0) obj;
                C1305C c1305c = AbstractC0691Q.f2210a;
                interfaceC1378o0.getClass();
                AbstractC1385s.m2630t(interfaceC1378o0, c1305c);
                return ((Context) AbstractC1385s.m2630t(interfaceC1378o0, AbstractC0691Q.f2211b)).getResources();
            default:
                return Boolean.valueOf(AbstractC0681L.m1183e(obj));
        }
    }
}
