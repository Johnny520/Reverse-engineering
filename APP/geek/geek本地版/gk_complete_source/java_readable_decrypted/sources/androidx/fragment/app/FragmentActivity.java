package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C0036a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import p000.AbstractC0346ip;
import p000.AbstractComponentCallbacksC0489ml;
import p000.C0004a3;
import p000.C0229fm;
import p000.C0431l0;
import p000.C0526nl;
import p000.C0607pr;
import p000.C0693s2;
import p000.C0705se;
import p000.C0730t2;
import p000.C0819vh;
import p000.C0934yl;
import p000.EnumC0347iq;
import p000.EnumC0383jq;
import p000.e40;
import p000.pa0;
import p000.ra0;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {

    /* JADX INFO: renamed from: u */
    public boolean f497u;

    /* JADX INFO: renamed from: v */
    public boolean f498v;

    /* JADX INFO: renamed from: s */
    public final C0431l0 f495s = new C0431l0(15, new C0526nl(this));

    /* JADX INFO: renamed from: t */
    public final C0036a f496t = new C0036a(this);

    /* JADX INFO: renamed from: w */
    public boolean f499w = true;

    public FragmentActivity() {
        ((C0004a3) this.f161e.f2143c).m9e("android:support:fragments", new C0693s2(this, 1));
        m121h(new C0730t2(this, 1));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m252k(C0934yl c0934yl) {
        boolean zM252k = false;
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : c0934yl.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                C0526nl c0526nl = abstractComponentCallbacksC0489ml.f3259s;
                if ((c0526nl == null ? null : c0526nl.f3431G) != null) {
                    zM252k |= m252k(abstractComponentCallbacksC0489ml.m1834g());
                }
                C0229fm c0229fm = abstractComponentCallbacksC0489ml.f3237M;
                EnumC0383jq enumC0383jq = EnumC0383jq.f2659d;
                if (c0229fm != null) {
                    c0229fm.m1234f();
                    if (c0229fm.f1982b.f518c.compareTo(enumC0383jq) >= 0) {
                        abstractComponentCallbacksC0489ml.f3237M.f1982b.m280g();
                        zM252k = true;
                    }
                }
                if (abstractComponentCallbacksC0489ml.f3236L.f518c.compareTo(enumC0383jq) >= 0) {
                    abstractComponentCallbacksC0489ml.f3236L.m280g();
                    zM252k = true;
                }
            }
        }
        return zM252k;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0607pr c0607pr;
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f497u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f498v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f499w);
        if (getApplication() != null) {
            ra0 ra0VarMo119d = mo119d();
            AbstractC0346ip.m1503o("store", ra0VarMo119d);
            C0705se c0705se = C0705se.f4429b;
            AbstractC0346ip.m1503o("defaultCreationExtras", c0705se);
            String canonicalName = C0607pr.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC0346ip.m1503o("key", strConcat);
            LinkedHashMap linkedHashMap = ra0VarMo119d.f4257a;
            pa0 pa0Var = (pa0) linkedHashMap.get(strConcat);
            if (C0607pr.class.isInstance(pa0Var)) {
                AbstractC0346ip.m1501m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", pa0Var);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0705se.f4565a);
                linkedHashMap2.put(C0819vh.f4857p, strConcat);
                try {
                    c0607pr = new C0607pr();
                } catch (AbstractMethodError unused) {
                    c0607pr = new C0607pr();
                }
                pa0Var = c0607pr;
                pa0 pa0Var2 = (pa0) linkedHashMap.put(strConcat, pa0Var);
                if (pa0Var2 != null) {
                    pa0Var2.mo113a();
                }
            }
            e40 e40Var = ((C0607pr) pa0Var).f3923c;
            if (e40Var.f1712c > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (e40Var.f1712c > 0) {
                    if (e40Var.f1711b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(e40Var.f1710a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0526nl) this.f495s.f2980b).f3430F.m2725q(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f495s.m1735v();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C0431l0 c0431l0 = this.f495s;
        c0431l0.m1735v();
        super.onConfigurationChanged(configuration);
        ((C0526nl) c0431l0.f2980b).f3430F.m2716h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f496t.m277d(EnumC0347iq.ON_CREATE);
        C0934yl c0934yl = ((C0526nl) this.f495s.f2980b).f3430F;
        c0934yl.f5376y = false;
        c0934yl.f5377z = false;
        c0934yl.f5350F.f156h = false;
        c0934yl.m2724p(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            super.onCreatePanelMenu(i, menu);
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        ((C0526nl) this.f495s.f2980b).f3430F.m2718j();
        return true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0526nl) this.f495s.f2980b).f3430F.f5357f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C0526nl) this.f495s.f2980b).f3430F.m2719k();
        this.f496t.m277d(EnumC0347iq.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : ((C0526nl) this.f495s.f2980b).f3430F.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                abstractComponentCallbacksC0489ml.m1845w();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0431l0 c0431l0 = this.f495s;
        if (i == 0) {
            return ((C0526nl) c0431l0.f2980b).f3430F.m2720l();
        }
        if (i != 6) {
            return false;
        }
        return ((C0526nl) c0431l0.f2980b).f3430F.m2717i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : ((C0526nl) this.f495s.f2980b).f3430F.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                abstractComponentCallbacksC0489ml.m1846x();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.f495s.m1735v();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            ((C0526nl) this.f495s.f2980b).f3430F.m2721m();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f498v = false;
        ((C0526nl) this.f495s.f2980b).f3430F.m2724p(5);
        this.f496t.m277d(EnumC0347iq.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        for (AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml : ((C0526nl) this.f495s.f2980b).f3430F.f5354c.m2237p()) {
            if (abstractComponentCallbacksC0489ml != null) {
                abstractComponentCallbacksC0489ml.m1847y();
            }
        }
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f496t.m277d(EnumC0347iq.ON_RESUME);
        C0934yl c0934yl = ((C0526nl) this.f495s.f2980b).f3430F;
        c0934yl.f5376y = false;
        c0934yl.f5377z = false;
        c0934yl.f5350F.f156h = false;
        c0934yl.m2724p(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            super.onPreparePanel(i, view, menu);
            return true;
        }
        super.onPreparePanel(0, view, menu);
        ((C0526nl) this.f495s.f2980b).f3430F.m2723o();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f495s.m1735v();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C0431l0 c0431l0 = this.f495s;
        c0431l0.m1735v();
        super.onResume();
        this.f498v = true;
        ((C0526nl) c0431l0.f2980b).f3430F.m2728t(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C0431l0 c0431l0 = this.f495s;
        c0431l0.m1735v();
        C0526nl c0526nl = (C0526nl) c0431l0.f2980b;
        super.onStart();
        this.f499w = false;
        if (!this.f497u) {
            this.f497u = true;
            C0934yl c0934yl = c0526nl.f3430F;
            c0934yl.f5376y = false;
            c0934yl.f5377z = false;
            c0934yl.f5350F.f156h = false;
            c0934yl.m2724p(4);
        }
        c0526nl.f3430F.m2728t(true);
        this.f496t.m277d(EnumC0347iq.ON_START);
        C0934yl c0934yl2 = c0526nl.f3430F;
        c0934yl2.f5376y = false;
        c0934yl2.f5377z = false;
        c0934yl2.f5350F.f156h = false;
        c0934yl2.m2724p(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f495s.m1735v();
    }

    @Override // android.app.Activity
    public void onStop() {
        C0431l0 c0431l0;
        super.onStop();
        this.f499w = true;
        do {
            c0431l0 = this.f495s;
        } while (m252k(((C0526nl) c0431l0.f2980b).f3430F));
        C0934yl c0934yl = ((C0526nl) c0431l0.f2980b).f3430F;
        c0934yl.f5377z = true;
        c0934yl.f5350F.f156h = true;
        c0934yl.m2724p(4);
        this.f496t.m277d(EnumC0347iq.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0526nl) this.f495s.f2980b).f3430F.f5357f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
