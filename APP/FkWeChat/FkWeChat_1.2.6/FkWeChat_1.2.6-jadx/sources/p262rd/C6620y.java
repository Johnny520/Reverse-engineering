package p262rd;

import android.app.Activity;
import android.view.Window;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0537m;
import androidx.compose.runtime.AbstractC0603u5;
import androidx.compose.runtime.InterfaceC0559p0;
import androidx.compose.runtime.InterfaceC0572r;
import java.lang.ref.WeakReference;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1061t;
import p057e1.AbstractC1984l;
import p135j2.InterfaceC3555o0;
import p165l1.AbstractC4505k;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4541g;
import p172l8.C4700i0;
import p274t.AbstractC7833f3;
import p274t.AbstractC7869n;
import p274t.C7899t;
import p315vd.AbstractC8921a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: rd.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6620y {

    /* JADX INFO: renamed from: b */
    public static WeakReference f20732b;

    /* JADX INFO: renamed from: a */
    public static final C6620y f20731a = new C6620y();

    /* JADX INFO: renamed from: c */
    public static final int f20733c = 8;

    /* JADX INFO: renamed from: c */
    public static void m26217c(Activity activity, final String str, final boolean z10) throws Exception {
        DialogC6599e dialogC6599e;
        try {
            WeakReference weakReference = f20732b;
            if (weakReference != null && (dialogC6599e = (DialogC6599e) weakReference.get()) != null && dialogC6599e.isShowing()) {
                dialogC6599e.dismiss();
            }
            f20732b = null;
            DialogC6599e dialogC6599e2 = new DialogC6599e(activity);
            f20732b = new WeakReference(dialogC6599e2);
            Window window = dialogC6599e2.getWindow();
            if (window != null) {
                window.clearFlags(2);
                window.addFlags(8);
                window.addFlags(16);
                window.setGravity(49);
                window.setLayout(-1, -1);
            }
            dialogC6599e2.m26165e(AbstractC1984l.m7162b(476014207, true, new InterfaceC0189q() { // from class: rd.w
                @Override // p010a9.InterfaceC0189q
                /* JADX INFO: renamed from: e */
                public final Object mo236e(Object obj, Object obj2, Object obj3) {
                    return C6620y.m26219e(str, z10, (DialogC6599e) obj, (InterfaceC0572r) obj2, ((Integer) obj3).intValue());
                }
            }));
            dialogC6599e2.show();
        } catch (Exception e10) {
            f20732b = null;
            throw e10;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m26218d(final String str, final boolean z10) {
        str.getClass();
        final Activity activityM34259a = AbstractC8921a.m34259a();
        if (activityM34259a != null) {
            activityM34259a.runOnUiThread(new Runnable() { // from class: rd.v
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    C6620y.m26217c(activityM34259a, str, z10);
                }
            });
        } else {
            C10010p0.m38820a("No active Activity found for ToastComponent");
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C4700i0 m26219e(String str, boolean z10, final DialogC6599e dialogC6599e, InterfaceC0572r interfaceC0572r, int i10) {
        dialogC6599e.getClass();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(476014207, i10, -1, "me.yun.fkwechat.ui.components.ToastComponent.show.<anonymous>.<anonymous> (ToastComponent.kt:58)");
        }
        InterfaceC4507m interfaceC4507mM30324f = AbstractC7833f3.m30324f(InterfaceC4507m.f13080a, 0.0f, 1, null);
        InterfaceC3555o0 interfaceC3555o0M30428h = AbstractC7869n.m30428h(InterfaceC4499e.f13028a.m17424m(), false);
        int iHashCode = Long.hashCode(AbstractC0537m.m1915b(interfaceC0572r, 0));
        InterfaceC0559p0 interfaceC0559p0Mo2147F = interfaceC0572r.mo2147F();
        InterfaceC4507m interfaceC4507mM17439e = AbstractC4505k.m17439e(interfaceC0572r, interfaceC4507mM30324f);
        InterfaceC4541g.a aVar = InterfaceC4541g.f13305j;
        InterfaceC0173a interfaceC0173aM17772b = aVar.m17772b();
        if (interfaceC0572r.mo2186v() == null) {
            AbstractC0537m.m1917d();
        }
        interfaceC0572r.mo2183s();
        if (interfaceC0572r.mo2177m()) {
            interfaceC0572r.mo2160S(interfaceC0173aM17772b);
        } else {
            interfaceC0572r.mo2149H();
        }
        InterfaceC0572r interfaceC0572rM2231b = AbstractC0603u5.m2231b(interfaceC0572r);
        AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC3555o0M30428h, aVar.m17774d());
        AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC0559p0Mo2147F, aVar.m17776f());
        InterfaceC0188p interfaceC0188pM17773c = aVar.m17773c();
        if (interfaceC0572rM2231b.mo2177m() || !AbstractC1061t.m3842c(interfaceC0572rM2231b.mo2170f(), Integer.valueOf(iHashCode))) {
            interfaceC0572rM2231b.mo2153L(Integer.valueOf(iHashCode));
            interfaceC0572rM2231b.mo2151J(Integer.valueOf(iHashCode), interfaceC0188pM17773c);
        }
        AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC4507mM17439e, aVar.m17775e());
        C7899t c7899t = C7899t.f26336a;
        boolean zMo2175k = interfaceC0572r.mo2175k(dialogC6599e);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2175k || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new InterfaceC0173a() { // from class: rd.x
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C6620y.m26220f(dialogC6599e);
                }
            };
            interfaceC0572r.mo2153L(objMo2170f);
        }
        AbstractC6600e0.m26171f(str, z10, (InterfaceC0173a) objMo2170f, interfaceC0572r, 0);
        interfaceC0572r.mo2159R();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static final C4700i0 m26220f(DialogC6599e dialogC6599e) {
        dialogC6599e.dismiss();
        WeakReference weakReference = f20732b;
        if (AbstractC1061t.m3842c(weakReference != null ? (DialogC6599e) weakReference.get() : null, dialogC6599e)) {
            f20732b = null;
        }
        return C4700i0.f13910a;
    }
}
