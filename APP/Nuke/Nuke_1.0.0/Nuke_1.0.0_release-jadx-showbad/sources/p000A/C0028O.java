package p000A;

import android.view.ActionMode;
import me.dartcv.nuke.BuildConfig;
import p002A1.AbstractC0116E;
import p028F.C0348i;
import p040H.C0544b;
import p040H.C0545c;
import p047I0.C0763t0;
import p058L.C0920W;
import p068N1.C1013c;
import p095T.InterfaceC1315H;
import p095T.InterfaceC1347Y;
import p135b.C1836x;
import p158f0.C2088t;
import p176i1.C2310z;
import p176i1.DialogC2308x;
import p232s.C3164k;
import p260x.C3395A;
import p260x.C3399E;
import p260x.C3437t;

/* JADX INFO: renamed from: A.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0028O implements InterfaceC1315H {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f140b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0028O(int i5, Object obj) {
        this.f139a = i5;
        this.f140b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1315H
    /* JADX INFO: renamed from: a */
    public final void mo17a() {
        switch (this.f139a) {
            case 0:
                ((C0920W) this.f140b).m1940o();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f140b;
                if (((C3164k) interfaceC1347Y.getValue()) != null) {
                    interfaceC1347Y.setValue(null);
                }
                break;
            case 2:
                C0348i c0348i = (C0348i) this.f140b;
                C2088t c2088t = c0348i.f1096e;
                C1836x c1836x = c2088t.f7003h;
                if (c1836x != null) {
                    c1836x.m3299a();
                }
                c2088t.m3865a();
                ActionMode actionMode = c0348i.f1099h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c0348i.f1099h = null;
                break;
            case 3:
                C0544b c0544b = (C0544b) ((C0545c) this.f140b).f1660c.getValue();
                if (c0544b != null) {
                    c0544b.close();
                }
                break;
            case 4:
                ((C0763t0) this.f140b).f2384e.mo6a();
                break;
            case 5:
                DialogC2308x dialogC2308x = (DialogC2308x) this.f140b;
                dialogC2308x.dismiss();
                dialogC2308x.f7519k.m1212d();
                break;
            case 6:
                C2310z c2310z = (C2310z) this.f140b;
                c2310z.m1212d();
                c2310z.getClass();
                AbstractC0116E.m165g(c2310z, null);
                c2310z.f7537r.removeViewImmediate(c2310z);
                break;
            case 7:
                ((C3437t) this.f140b).f10738d = null;
                break;
            case 8:
                C3399E c3399e = (C3399E) this.f140b;
                C1013c c1013c = c3399e.f10629c;
                if (c1013c != null) {
                    c1013c.f3128a = false;
                }
                c3399e.f10629c = null;
                break;
            default:
                ((C3395A) this.f140b).f10624f = true;
                break;
        }
    }
}
