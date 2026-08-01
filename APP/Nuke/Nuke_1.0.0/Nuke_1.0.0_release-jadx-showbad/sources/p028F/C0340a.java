package p028F;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import me.dartcv.nuke.BuildConfig;
import p000A.C0028O;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0340a implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1071d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0348i f1072e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0340a(C0348i c0348i, int i5) {
        this.f1071d = i5;
        this.f1072e = c0348i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f1071d) {
            case 0:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) obj;
                View view = this.f1072e.f1092a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1599a.mo6a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0342c(interfaceC1599a, 0));
                    }
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                ActionMode actionMode = this.f1072e.f1099h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return C0891q.f2780a;
            case 2:
                ActionMode actionMode2 = this.f1072e.f1099h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return C0891q.f2780a;
            default:
                C0348i c0348i = this.f1072e;
                c0348i.f1096e.m3868d();
                return new C0028O(2, c0348i);
        }
    }
}
