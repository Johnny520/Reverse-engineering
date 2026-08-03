package p001;

import android.app.Activity;

/* JADX INFO: renamed from: ۟.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0263j2 extends AbstractC0335o4 implements InterfaceC0222g3, InterfaceC0208f3 {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0235h2 f868;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Activity f869;

    public /* synthetic */ C0263j2(C0235h2 c0235h2, Activity activity) {
        this.f868 = c0235h2;
        this.f869 = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public Object mo7() {
        C0338o7 c0338o7 = C0338o7.f1010;
        String strM915 = C0341oa.m915(new byte[]{-125, -69, 40, -126, 45, -122, -87, -65, 37, -109}, new byte[]{-10, -53, 76, -29, 89, -29});
        Boolean bool = Boolean.TRUE;
        C0338o7.m1181(strM915, bool);
        int i = C0330o.f1000;
        C0330o.m1173(1, C0341oa.m915(new byte[]{-50, -61, 95, -18, -11, 10, -50, -11, 84, -17, -15, 62, -52, -39, 78, -20, -62, 23, -52, -41, 99, -20, -27, 38, -50, -18, 78, -20, -42, 51, -51, -27, 105, 116, -94, 59, -89, -106, 86, -91, -87, 60, -114, -106, 81, -70, -85, 47, -118, -106, 68, -99, -91, 41, -107, -108, 100, -92, -92, 0, -90, -107, 79, -70, -88, 59, -85, -106, 73, -91, 51}, new byte[]{43, 115, -39, 10, 77, -121}));
        C0235h2 c0235h2 = this.f868;
        Activity activity = this.f869;
        c0235h2.getClass();
        C0235h2.m1087(activity);
        return bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Object mo984(Object obj) throws InterruptedException {
        C0336o5 c0336o5 = (C0336o5) obj;
        if (c0336o5 == null) {
            Thread.sleep(1000L);
            C0235h2.m1084(this.f868, this.f869);
        } else {
            Activity activity = this.f869;
            activity.runOnUiThread(new RunnableC0154b5(c0336o5, this.f868, activity, 2));
        }
        return C0433vb.f1163;
    }
}
