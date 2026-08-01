package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import p116.C7342;
import p130.C7502;
import p142.C7538;
import p142.C7539;
import p142.InterfaceC7537;
import p144.C7550;
import p144.C7552;
import p144.InterfaceC7549;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0043 extends Dialog implements InterfaceC2388, InterfaceC0018, InterfaceC7549, InterfaceC7537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5184 f90;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7538 f91;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5184 f92;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2386 f93;

    public DialogC0043(Context context, int i) {
        super(context, i);
        this.f91 = new C7538(new C7502(this, new C7342(this, 4)));
        this.f92 = AbstractC5187.m10214(new C0051(this, 0));
        this.f90 = AbstractC5187.m10214(new C0051(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m100(DialogC0043 dialogC0043) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m101();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return m102();
    }

    @Override // p144.InterfaceC7549
    public final C7550 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m27().f60;
    }

    @Override // androidx.activity.InterfaceC0018
    public final C0023 getOnBackPressedDispatcher() {
        return (C0023) this.f90.getValue();
    }

    @Override // p142.InterfaceC7537
    public final C7539 getSavedStateRegistry() {
        return this.f91.f20418;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C7552) this.f92.getValue()).m12787();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C0023 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.m26(onBackInvokedDispatcher);
        }
        this.f91.m12758(bundle);
        m102().m4499(Lifecycle$Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f91.m12757(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m102().m4499(Lifecycle$Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m102().m4499(Lifecycle$Event.ON_DESTROY);
        this.f93 = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        m101();
        super.setContentView(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m101() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2386 m102() {
        C2386 c2386 = this.f93;
        if (c2386 != null) {
            return c2386;
        }
        C2386 c23862 = new C2386(this, true);
        this.f93 = c23862;
        return c23862;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m101();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m101();
        super.setContentView(view, layoutParams);
    }
}
