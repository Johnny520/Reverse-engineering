package p000a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0979c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1119h;
import androidx.savedstate.C1224a;
import androidx.savedstate.C1225b;

/* JADX INFO: renamed from: a.E3 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0078E3 extends Dialog implements InterfaceC0935y9, InterfaceC0445Yb, InterfaceC0214Ld {

    /* JADX INFO: renamed from: a */
    public C1119h f257a;

    /* JADX INFO: renamed from: b */
    public final C0196Kd f258b;

    /* JADX INFO: renamed from: c */
    public final OnBackPressedDispatcher f259c;

    public DialogC0078E3(Context context, int i) {
        super(context, i);
        this.f258b = new C0196Kd(this);
        this.f259c = new OnBackPressedDispatcher(new RunnableC0221M2(4, this));
    }

    /* JADX INFO: renamed from: a */
    public static void m206a(DialogC0078E3 dialogC0078E3) {
        C0631i9.m1482e(dialogC0078E3, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C0631i9.m1482e(view, "view");
        m207b();
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m207b() {
        Window window = getWindow();
        C0631i9.m1479b(window);
        View decorView = window.getDecorView();
        C0631i9.m1481d(decorView, "window!!.decorView");
        C0235Mg.m628a(decorView, this);
        Window window2 = getWindow();
        C0631i9.m1479b(window2);
        View decorView2 = window2.getDecorView();
        C0631i9.m1481d(decorView2, "window!!.decorView");
        C0979c.m2290a(decorView2, this);
        Window window3 = getWindow();
        C0631i9.m1479b(window3);
        View decorView3 = window3.getDecorView();
        C0631i9.m1481d(decorView3, "window!!.decorView");
        C1225b.m3011a(decorView3, this);
    }

    @Override // p000a.InterfaceC0935y9
    public final AbstractC1116e getLifecycle() {
        C1119h c1119h = this.f257a;
        if (c1119h != null) {
            return c1119h;
        }
        C1119h c1119h2 = new C1119h(this);
        this.f257a = c1119h2;
        return c1119h2;
    }

    @Override // p000a.InterfaceC0445Yb
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f259c;
    }

    @Override // p000a.InterfaceC0214Ld
    public final C1224a getSavedStateRegistry() {
        return this.f258b.f663b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f259c.m2283b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C0631i9.m1481d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.f259c;
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.f3613e = onBackInvokedDispatcher;
            onBackPressedDispatcher.m2284c(onBackPressedDispatcher.f3615g);
        }
        this.f258b.m546b(bundle);
        C1119h c1119h = this.f257a;
        if (c1119h == null) {
            c1119h = new C1119h(this);
            this.f257a = c1119h;
        }
        c1119h.m2598f(AbstractC1116e.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C0631i9.m1481d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f258b.m547c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C1119h c1119h = this.f257a;
        if (c1119h == null) {
            c1119h = new C1119h(this);
            this.f257a = c1119h;
        }
        c1119h.m2598f(AbstractC1116e.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1119h c1119h = this.f257a;
        if (c1119h == null) {
            c1119h = new C1119h(this);
            this.f257a = c1119h;
        }
        c1119h.m2598f(AbstractC1116e.a.ON_DESTROY);
        this.f257a = null;
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void setContentView(int i) {
        m207b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C0631i9.m1482e(view, "view");
        m207b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C0631i9.m1482e(view, "view");
        m207b();
        super.setContentView(view, layoutParams);
    }
}
