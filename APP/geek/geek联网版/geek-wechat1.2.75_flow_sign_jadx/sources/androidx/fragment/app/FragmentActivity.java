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
import p000.AbstractC0493mp;
import p000.AbstractComponentCallbacksC0563ol;
import p000.C0004a3;
import p000.C0023am;
import p000.C0303hm;
import p000.C0431l0;
import p000.C0600pl;
import p000.C0692s2;
import p000.C0729t2;
import p000.C0741te;
import p000.C0754tr;
import p000.C0893xh;
import p000.EnumC0494mq;
import p000.EnumC0531nq;
import p000.l40;
import p000.ua0;
import p000.wa0;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {

    /* JADX INFO: renamed from: u */
    public boolean f460u;

    /* JADX INFO: renamed from: v */
    public boolean f461v;

    /* JADX INFO: renamed from: s */
    public final C0431l0 f458s = new C0431l0(15, new C0600pl(this));

    /* JADX INFO: renamed from: t */
    public final C0036a f459t = new C0036a(this);

    /* JADX INFO: renamed from: w */
    public boolean f462w = true;

    public FragmentActivity() {
        ((C0004a3) this.f124e.f2555c).m22e("android:support:fragments", new C0692s2(this, 1));
        m106h(new C0729t2(this, 1));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m237k(C0023am c0023am) {
        boolean zM237k = false;
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : c0023am.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                C0600pl c0600pl = abstractComponentCallbacksC0563ol.f3504s;
                if ((c0600pl == null ? null : c0600pl.f3726C) != null) {
                    zM237k |= m237k(abstractComponentCallbacksC0563ol.m2036g());
                }
                C0303hm c0303hm = abstractComponentCallbacksC0563ol.f3482M;
                EnumC0531nq enumC0531nq = EnumC0531nq.f3332d;
                if (c0303hm != null) {
                    c0303hm.m1407f();
                    if (c0303hm.f2241b.f481c.compareTo(enumC0531nq) >= 0) {
                        abstractComponentCallbacksC0563ol.f3482M.f2241b.m265g();
                        zM237k = true;
                    }
                }
                if (abstractComponentCallbacksC0563ol.f3481L.f481c.compareTo(enumC0531nq) >= 0) {
                    abstractComponentCallbacksC0563ol.f3481L.m265g();
                    zM237k = true;
                }
            }
        }
        return zM237k;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0754tr c0754tr;
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f460u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f461v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f462w);
        if (getApplication() != null) {
            wa0 wa0VarMo104d = mo104d();
            AbstractC0493mp.m1857g("store", wa0VarMo104d);
            C0741te c0741te = C0741te.f4503b;
            AbstractC0493mp.m1857g("defaultCreationExtras", c0741te);
            String canonicalName = C0754tr.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC0493mp.m1857g("key", strConcat);
            LinkedHashMap linkedHashMap = wa0VarMo104d.f5077a;
            ua0 ua0Var = (ua0) linkedHashMap.get(strConcat);
            if (C0754tr.class.isInstance(ua0Var)) {
                AbstractC0493mp.m1855e("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", ua0Var);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0741te.f4820a);
                linkedHashMap2.put(C0893xh.f5260p, strConcat);
                try {
                    c0754tr = new C0754tr();
                } catch (AbstractMethodError unused) {
                    c0754tr = new C0754tr();
                }
                ua0Var = c0754tr;
                ua0 ua0Var2 = (ua0) linkedHashMap.put(strConcat, ua0Var);
                if (ua0Var2 != null) {
                    ua0Var2.mo651a();
                }
            }
            l40 l40Var = ((C0754tr) ua0Var).f4573c;
            if (l40Var.f2919c > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (l40Var.f2919c > 0) {
                    if (l40Var.f2918b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(l40Var.f2917a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0600pl) this.f458s.f2886b).f3725B.m91q(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f458s.m1725v();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C0431l0 c0431l0 = this.f458s;
        c0431l0.m1725v();
        super.onConfigurationChanged(configuration);
        ((C0600pl) c0431l0.f2886b).f3725B.m82h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f459t.m262d(EnumC0494mq.ON_CREATE);
        C0023am c0023am = ((C0600pl) this.f458s.f2886b).f3725B;
        c0023am.f118y = false;
        c0023am.f119z = false;
        c0023am.f92F.f909h = false;
        c0023am.m90p(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            super.onCreatePanelMenu(i, menu);
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        ((C0600pl) this.f458s.f2886b).f3725B.m84j();
        return true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0600pl) this.f458s.f2886b).f3725B.f99f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C0600pl) this.f458s.f2886b).f3725B.m85k();
        this.f459t.m262d(EnumC0494mq.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : ((C0600pl) this.f458s.f2886b).f3725B.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                abstractComponentCallbacksC0563ol.m2047w();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0431l0 c0431l0 = this.f458s;
        if (i == 0) {
            return ((C0600pl) c0431l0.f2886b).f3725B.m86l();
        }
        if (i != 6) {
            return false;
        }
        return ((C0600pl) c0431l0.f2886b).f3725B.m83i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : ((C0600pl) this.f458s.f2886b).f3725B.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                abstractComponentCallbacksC0563ol.m2048x();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.f458s.m1725v();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            ((C0600pl) this.f458s.f2886b).f3725B.m87m();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f461v = false;
        ((C0600pl) this.f458s.f2886b).f3725B.m90p(5);
        this.f459t.m262d(EnumC0494mq.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        for (AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol : ((C0600pl) this.f458s.f2886b).f3725B.f96c.m2244p()) {
            if (abstractComponentCallbacksC0563ol != null) {
                abstractComponentCallbacksC0563ol.m2049y();
            }
        }
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f459t.m262d(EnumC0494mq.ON_RESUME);
        C0023am c0023am = ((C0600pl) this.f458s.f2886b).f3725B;
        c0023am.f118y = false;
        c0023am.f119z = false;
        c0023am.f92F.f909h = false;
        c0023am.m90p(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            super.onPreparePanel(i, view, menu);
            return true;
        }
        super.onPreparePanel(0, view, menu);
        ((C0600pl) this.f458s.f2886b).f3725B.m89o();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f458s.m1725v();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C0431l0 c0431l0 = this.f458s;
        c0431l0.m1725v();
        super.onResume();
        this.f461v = true;
        ((C0600pl) c0431l0.f2886b).f3725B.m94t(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C0431l0 c0431l0 = this.f458s;
        c0431l0.m1725v();
        C0600pl c0600pl = (C0600pl) c0431l0.f2886b;
        super.onStart();
        this.f462w = false;
        if (!this.f460u) {
            this.f460u = true;
            C0023am c0023am = c0600pl.f3725B;
            c0023am.f118y = false;
            c0023am.f119z = false;
            c0023am.f92F.f909h = false;
            c0023am.m90p(4);
        }
        c0600pl.f3725B.m94t(true);
        this.f459t.m262d(EnumC0494mq.ON_START);
        C0023am c0023am2 = c0600pl.f3725B;
        c0023am2.f118y = false;
        c0023am2.f119z = false;
        c0023am2.f92F.f909h = false;
        c0023am2.m90p(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f458s.m1725v();
    }

    @Override // android.app.Activity
    public void onStop() {
        C0431l0 c0431l0;
        super.onStop();
        this.f462w = true;
        do {
            c0431l0 = this.f458s;
        } while (m237k(((C0600pl) c0431l0.f2886b).f3725B));
        C0023am c0023am = ((C0600pl) c0431l0.f2886b).f3725B;
        c0023am.f119z = true;
        c0023am.f92F.f909h = true;
        c0023am.m90p(4);
        this.f459t.m262d(EnumC0494mq.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0600pl) this.f458s.f2886b).f3725B.f99f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
