package p260x;

import me.dartcv.nuke.BuildConfig;
import p095T.C1360f0;
import p112W2.InterfaceC1599a;
import p227r.EnumC2983d0;
import p255w.C3385p;

/* JADX INFO: renamed from: x.J */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3404J implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10641d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3406L f10642e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3404J(C3406L c3406l, int i5) {
        this.f10641d = i5;
        this.f10642e = c3406l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f10641d) {
            case 0:
                C3385p c3385p = this.f10642e.f10647s.f10488b;
                return Float.valueOf((((C1360f0) c3385p.f10563e.f741b).m2509g() * 500) + ((C1360f0) c3385p.f10563e.f742c).m2509g());
            case BuildConfig.VERSION_CODE /* 1 */:
                C3385p c3385p2 = this.f10642e.f10647s.f10488b;
                int iM2509g = ((C1360f0) c3385p2.f10563e.f741b).m2509g();
                int iM2509g2 = ((C1360f0) c3385p2.f10563e.f742c).m2509g();
                return Float.valueOf(c3385p2.mo13d() ? (iM2509g * 500) + iM2509g2 + 100 : (iM2509g * 500) + iM2509g2);
            default:
                C3406L c3406l = this.f10642e;
                C3385p c3385p3 = c3406l.f10647s.f10488b;
                int iM5615g = (int) (c3385p3.m5620g().f10532o == EnumC2983d0.f9447d ? c3385p3.m5620g().m5615g() & 4294967295L : c3385p3.m5620g().m5615g() >> 32);
                C3385p c3385p4 = c3406l.f10647s.f10488b;
                return Float.valueOf(iM5615g - ((-c3385p4.m5620g().f10529l) + c3385p4.m5620g().f10533p));
        }
    }
}
