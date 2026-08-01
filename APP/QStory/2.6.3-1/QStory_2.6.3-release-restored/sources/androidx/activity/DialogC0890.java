package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$Event;
import com.davemorrissey.labs.subscaleview.C0328R;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import p132.C8171;
import p146.C8331;
import p158.C8367;
import p158.C8368;
import p158.InterfaceC8366;
import p160.C8379;
import p160.C8381;
import p160.InterfaceC8378;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0890 extends Dialog implements InterfaceC3221, InterfaceC0865, InterfaceC8378, InterfaceC8366 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6016 f435;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8367 f436;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6016 f437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3219 f438;

    public DialogC0890(Context context, int i) {
        super(context, i);
        this.f436 = new C8367(new C8331(this, new C8171(this, 4)));
        this.f437 = AbstractC6019.m10773(new C0898(this, 0));
        this.f435 = AbstractC6019.m10773(new C0898(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m660(DialogC0890 dialogC0890) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m661();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC3221
    public final AbstractC3235 getLifecycle() {
        return m662();
    }

    @Override // p160.InterfaceC8378
    public final C8379 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m587().f405;
    }

    @Override // androidx.activity.InterfaceC0865
    public final C0870 getOnBackPressedDispatcher() {
        return (C0870) this.f435.getValue();
    }

    @Override // p158.InterfaceC8366
    public final C8368 getSavedStateRegistry() {
        return this.f436.f20763;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C8381) this.f437.getValue()).m13346();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C0870 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.m586(onBackInvokedDispatcher);
        }
        this.f436.m13317(bundle);
        m662().m5059(Lifecycle$Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f436.m13316(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m662().m5059(Lifecycle$Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m662().m5059(Lifecycle$Event.ON_DESTROY);
        this.f438 = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        m661();
        super.setContentView(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m661() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(C0328R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(C0328R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(C0328R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(C0328R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3219 m662() {
        C3219 c3219 = this.f438;
        if (c3219 != null) {
            return c3219;
        }
        C3219 c32192 = new C3219(this, true);
        this.f438 = c32192;
        return c32192;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m661();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m661();
        super.setContentView(view, layoutParams);
    }
}
