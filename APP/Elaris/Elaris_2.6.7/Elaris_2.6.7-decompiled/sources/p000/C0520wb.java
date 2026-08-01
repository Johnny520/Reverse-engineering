package p000;

import android.view.View;

/* JADX INFO: renamed from: wb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0520wb implements InterfaceC0251hc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0527x2 f1017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f1019c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0520wb(C0527x2 c0527x2, View view, View view2) {
        this.f1017a = c0527x2;
        this.f1018b = view;
        this.f1019c = view2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0251hc
    public final void run() {
        C0527x2 c0527x2 = this.f1017a;
        AbstractC0486u9.m1048a(c0527x2);
        View view = this.f1018b;
        try {
            view.invalidate();
        } catch (Throwable unused) {
        }
        try {
            view.requestLayout();
        } catch (Throwable unused2) {
        }
        try {
            view.forceLayout();
        } catch (Throwable unused3) {
        }
        View view2 = this.f1019c;
        if (view2 != null) {
            try {
                view2.invalidate();
            } catch (Throwable unused4) {
            }
            try {
                view2.requestLayout();
            } catch (Throwable unused5) {
            }
            try {
                view2.forceLayout();
            } catch (Throwable unused6) {
            }
        }
        AbstractC0486u9.m1048a(c0527x2);
    }
}
