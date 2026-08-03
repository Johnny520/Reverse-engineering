package p036c9;

import android.app.Activity;
import android.os.Handler;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: c9.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0450j implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1316g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f1317h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0450j(Activity activity, int i9) {
        this.f1316g = i9;
        this.f1317h = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f1316g;
        C3967n c3967n = C3967n.f12976a;
        Activity activity = this.f1317h;
        C0502y c0502y = (C0502y) obj;
        switch (i9) {
            case 0:
                c0502y.getClass();
                Handler handler = C0419b0.f1202a;
                C0419b0.m1411i(activity, c0502y);
                break;
            default:
                c0502y.getClass();
                Handler handler2 = C0419b0.f1202a;
                C0419b0.m1411i(activity, c0502y);
                break;
        }
        return c3967n;
    }
}
