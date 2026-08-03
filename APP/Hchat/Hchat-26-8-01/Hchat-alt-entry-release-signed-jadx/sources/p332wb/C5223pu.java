package p332wb;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.pu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5223pu implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20097g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f20098h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f20099i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1231l f20100j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f20101k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5223pu(InterfaceC1220a interfaceC1220a, Activity activity, InterfaceC1231l interfaceC1231l, int i9, int i10) {
        this.f20097g = i10;
        this.f20098h = interfaceC1220a;
        this.f20099i = activity;
        this.f20100j = interfaceC1231l;
        this.f20101k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        View decorView;
        View decorView2;
        switch (this.f20097g) {
            case 0:
                this.f20098h.invoke();
                C5440wg c5440wg = new C5440wg(this.f20101k, 8, this.f20100j);
                Activity activity = this.f20099i;
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.postOnAnimation(new RunnableC5421vu(activity, c5440wg));
                }
                break;
            default:
                this.f20098h.invoke();
                C5440wg c5440wg2 = new C5440wg(this.f20101k, 9, this.f20100j);
                Activity activity2 = this.f20099i;
                Window window2 = activity2.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
                    decorView2.postOnAnimation(new RunnableC5421vu(activity2, c5440wg2));
                }
                break;
        }
        return C3967n.f12976a;
    }
}
