package p126ia;

import android.app.Activity;
import p020b5.C0184c;
import p085fg.InterfaceC1231l;
import p230p8.C3360l;
import p276sf.C3967n;
import tf.C4173t;

/* JADX INFO: renamed from: ia.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2019m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6818g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3360l f6819h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2023q f6820i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Activity f6821j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2019m(int i9, Activity activity, C2023q c2023q, C3360l c3360l) {
        this.f6818g = i9;
        this.f6819h = c3360l;
        this.f6820i = c2023q;
        this.f6821j = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C3360l c3360l;
        String str;
        C3360l c3360l2;
        String str2;
        switch (this.f6818g) {
            case 0:
                if (((Boolean) obj).booleanValue() && (str = (c3360l = this.f6819h).f10844a) != null) {
                    C2023q c2023q = this.f6820i;
                    C2009c c2009cM815l = c2023q.f6841a.m815l(str);
                    c2023q.f6841a.m802T(str, C4173t.f13710g);
                    C2007a0 c2007a0 = c2023q.f6842b;
                    Activity activity = this.f6821j;
                    c2007a0.m4947a(activity, c3360l, c2009cM815l);
                    C2023q.m4975j(activity, "已恢复真实点赞");
                }
                break;
            default:
                C2023q c2023q2 = this.f6820i;
                C0184c c0184c = c2023q2.f6841a;
                if (((Boolean) obj).booleanValue() && (str2 = (c3360l2 = this.f6819h).f10844a) != null) {
                    C2009c c2009cM815l2 = c0184c.m815l(str2);
                    c0184c.m799Q(str2, C4173t.f13710g);
                    C2007a0 c2007a02 = c2023q2.f6842b;
                    Activity activity2 = this.f6821j;
                    c2007a02.m4947a(activity2, c3360l2, c2009cM815l2);
                    C2023q.m4975j(activity2, "已恢复真实评论");
                }
                break;
        }
        return C3967n.f12976a;
    }
}
