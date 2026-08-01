package p262rd;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.C0513i3;
import androidx.compose.runtime.InterfaceC0572r;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.AbstractC0679p0;
import androidx.lifecycle.C0680q;
import androidx.lifecycle.InterfaceC0676o;
import me.yun.fkwechat.core.config.AppConfig;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p057e1.AbstractC1984l;
import p172l8.C4700i0;
import p179m2.AbstractC4854i0;
import p179m2.C4865k1;
import p179m2.InterfaceC4842f3;
import p181m4.AbstractC4977n;
import p181m4.C4970g;
import p181m4.C4972i;
import p181m4.InterfaceC4973j;
import p189n.AbstractC5263p0;
import p301ud.AbstractC8675c;
import p336x3.AbstractC9434x;
import p336x3.C9415o1;

/* JADX INFO: renamed from: rd.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC6599e extends Dialog implements InterfaceC0676o, InterfaceC4973j {

    /* JADX INFO: renamed from: q */
    public final Activity f20670q;

    /* JADX INFO: renamed from: r */
    public final C0680q f20671r;

    /* JADX INFO: renamed from: s */
    public final C4972i f20672s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6599e(Activity activity) {
        super(activity, R.style.Theme.DeviceDefault.NoActionBar);
        activity.getClass();
        this.f20670q = activity;
        C0680q c0680q = new C0680q(this);
        this.f20671r = c0680q;
        C4972i c4972iM20078b = C4972i.f15109c.m20078b(this);
        this.f20672s = c4972iM20078b;
        c4972iM20078b.m20075d(null);
        c0680q.m2672m(AbstractC0668k.b.f1970s);
    }

    /* JADX INFO: renamed from: f */
    public static final C4700i0 m26161f(Context context, final DialogC6599e dialogC6599e, final InterfaceC0189q interfaceC0189q, InterfaceC0572r interfaceC0572r, int i10) {
        if (interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1530333228, i10, -1, "me.yun.fkwechat.ui.components.BaseDialog.setComposeContent.<anonymous>.<anonymous> (BaseDialog.kt:60)");
            }
            AbstractC0506h3 abstractC0506h3M19379d = AbstractC4854i0.m19379d();
            context.getClass();
            AbstractC0552o0.m1975c(abstractC0506h3M19379d.m1696d(context), AbstractC1984l.m7164d(-2138829588, true, new InterfaceC0188p() { // from class: rd.b
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return DialogC6599e.m26162g(this.f20656q, interfaceC0189q, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            }, interfaceC0572r, 54), interfaceC0572r, C0513i3.f1416i | 48);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572r.mo2190z();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: g */
    public static final C4700i0 m26162g(final DialogC6599e dialogC6599e, final InterfaceC0189q interfaceC0189q, InterfaceC0572r interfaceC0572r, int i10) {
        if (interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-2138829588, i10, -1, "me.yun.fkwechat.ui.components.BaseDialog.setComposeContent.<anonymous>.<anonymous>.<anonymous> (BaseDialog.kt:61)");
            }
            AbstractC8675c.m33317b(false, false, AbstractC1984l.m7164d(-455833016, true, new InterfaceC0188p() { // from class: rd.c
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return DialogC6599e.m26163h(this.f20660q, interfaceC0189q, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            }, interfaceC0572r, 54), interfaceC0572r, 384, 3);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572r.mo2190z();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: h */
    public static final C4700i0 m26163h(final DialogC6599e dialogC6599e, InterfaceC0189q interfaceC0189q, InterfaceC0572r interfaceC0572r, int i10) {
        if (interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-455833016, i10, -1, "me.yun.fkwechat.ui.components.BaseDialog.setComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseDialog.kt:62)");
            }
            final boolean zM21513a = AbstractC5263p0.m21513a(interfaceC0572r, 0);
            boolean zMo2175k = interfaceC0572r.mo2175k(dialogC6599e) | interfaceC0572r.mo2167c(zM21513a);
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (zMo2175k || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new InterfaceC0173a() { // from class: rd.d
                    @Override // p010a9.InterfaceC0173a
                    public final Object invoke() {
                        return DialogC6599e.m26164i(this.f20666q, zM21513a);
                    }
                };
                interfaceC0572r.mo2153L(objMo2170f);
            }
            AbstractC0497g1.m1683g((InterfaceC0173a) objMo2170f, interfaceC0572r, 0);
            interfaceC0189q.mo236e(dialogC6599e, interfaceC0572r, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572r.mo2190z();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: i */
    public static final C4700i0 m26164i(DialogC6599e dialogC6599e, boolean z10) {
        Window window = dialogC6599e.getWindow();
        if (window != null) {
            C9415o1 c9415o1 = new C9415o1(window, window.getDecorView());
            c9415o1.m36632b(!z10);
            c9415o1.m36631a(!z10);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: e */
    public final void m26165e(final InterfaceC0189q interfaceC0189q) {
        final Context contextCreatePackageContext;
        interfaceC0189q.getClass();
        try {
            contextCreatePackageContext = this.f20670q.createPackageContext(AppConfig.MODULE_PACKAGE, 3);
        } catch (Exception unused) {
            contextCreatePackageContext = this.f20670q;
        }
        Context context = getContext();
        context.getClass();
        C4865k1 c4865k1 = new C4865k1(context, null, 0, 6, null);
        AbstractC0679p0.m2662b(c4865k1, this);
        AbstractC4977n.m20087b(c4865k1, this);
        c4865k1.setViewCompositionStrategy(InterfaceC4842f3.b.f14396b);
        c4865k1.setContent(AbstractC1984l.m7162b(1530333228, true, new InterfaceC0188p() { // from class: rd.a
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return DialogC6599e.m26161f(contextCreatePackageContext, this, interfaceC0189q, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
            }
        }));
        setContentView(c4865k1);
    }

    @Override // androidx.lifecycle.InterfaceC0676o
    public AbstractC0668k getLifecycle() {
        return this.f20671r;
    }

    @Override // p181m4.InterfaceC4973j
    public C4970g getSavedStateRegistry() {
        return this.f20672s.m20073b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        AbstractC9434x.m36705a(window, false);
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setLayout(-1, -1);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f20671r.m2672m(AbstractC0668k.b.f1972u);
    }

    @Override // android.app.Dialog
    public void onStop() {
        this.f20671r.m2672m(AbstractC0668k.b.f1968q);
        super.onStop();
    }
}
