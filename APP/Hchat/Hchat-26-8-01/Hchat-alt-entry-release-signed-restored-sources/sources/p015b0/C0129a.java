package p015b0;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: b0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0129a implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f341g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0142h f342h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0129a(C0142h c0142h, int i9) {
        this.f341g = i9;
        this.f342h = c0142h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f341g) {
            case 0:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj;
                View view = this.f342h.f367a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1220a.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0133c(interfaceC1220a, 0));
                    }
                }
                return C3967n.f12976a;
            case 1:
                ActionMode actionMode = this.f342h.f374h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return C3967n.f12976a;
            case 2:
                ActionMode actionMode2 = this.f342h.f374h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return C3967n.f12976a;
            default:
                C0142h c0142h = this.f342h;
                c0142h.f371e.m9163d();
                return new C0147m(c0142h, 0);
        }
    }
}
