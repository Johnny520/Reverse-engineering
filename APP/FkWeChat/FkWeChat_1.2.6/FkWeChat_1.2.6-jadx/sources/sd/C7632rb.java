package sd;

import android.app.Activity;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0189q;
import p053dd.C1951c;
import p057e1.AbstractC1984l;
import p172l8.C4700i0;
import p262rd.DialogC6599e;

/* JADX INFO: renamed from: sd.rb */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7632rb {

    /* JADX INFO: renamed from: a */
    public static final C7632rb f25257a = new C7632rb();

    /* JADX INFO: renamed from: c */
    public static void m29509c(final Activity activity, final C1951c c1951c) {
        try {
            DialogC6599e dialogC6599e = new DialogC6599e(activity);
            dialogC6599e.m26165e(AbstractC1984l.m7162b(1108500334, true, new InterfaceC0189q() { // from class: sd.pb
                @Override // p010a9.InterfaceC0189q
                /* JADX INFO: renamed from: e */
                public final Object mo236e(Object obj, Object obj2, Object obj3) {
                    return C7632rb.m29511e(c1951c, activity, (DialogC6599e) obj, (InterfaceC0572r) obj2, ((Integer) obj3).intValue());
                }
            }));
            dialogC6599e.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m29510d(final Activity activity, final C1951c c1951c) {
        activity.getClass();
        c1951c.getClass();
        activity.runOnUiThread(new Runnable() { // from class: sd.ob
            @Override // java.lang.Runnable
            public final void run() {
                C7632rb.m29509c(activity, c1951c);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final C4700i0 m29511e(C1951c c1951c, Activity activity, final DialogC6599e dialogC6599e, InterfaceC0572r interfaceC0572r, int i10) {
        dialogC6599e.getClass();
        if ((i10 & 6) == 0) {
            i10 |= (i10 & 8) == 0 ? interfaceC0572r.mo2162U(dialogC6599e) : interfaceC0572r.mo2175k(dialogC6599e) ? 4 : 2;
        }
        boolean z10 = true;
        if (interfaceC0572r.mo2144C((i10 & 19) != 18, i10 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1108500334, i10, -1, "me.yun.fkwechat.ui.dialog.MessageDetailsDialog.show.<anonymous>.<anonymous> (MessageDetailsDialog.kt:82)");
            }
            if ((i10 & 14) != 4 && ((i10 & 8) == 0 || !interfaceC0572r.mo2175k(dialogC6599e))) {
                z10 = false;
            }
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (z10 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new InterfaceC0173a() { // from class: sd.qb
                    @Override // p010a9.InterfaceC0173a
                    public final Object invoke() {
                        return C7632rb.m29512f(dialogC6599e);
                    }
                };
                interfaceC0572r.mo2153L(objMo2170f);
            }
            AbstractC7519lc.m29234y(c1951c, (InterfaceC0173a) objMo2170f, activity, interfaceC0572r, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572r.mo2190z();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static final C4700i0 m29512f(DialogC6599e dialogC6599e) {
        dialogC6599e.dismiss();
        return C4700i0.f13910a;
    }
}
