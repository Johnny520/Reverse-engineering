package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.DialogC0890;
import androidx.lifecycle.AbstractC3208;
import androidx.lifecycle.C3207;
import androidx.lifecycle.C3209;
import com.davemorrissey.labs.subscaleview.C0328R;
import p025.AbstractC7012;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC3176 extends AbstractComponentCallbacksC3171 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f7272;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public Dialog f7273;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public boolean f7274;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public boolean f7279;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public Handler f7286;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final RunnableC3183 f7283 = new RunnableC3183(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final DialogInterfaceOnCancelListenerC3180 f7282 = new DialogInterfaceOnCancelListenerC3180(this);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC3181 f7285 = new DialogInterfaceOnDismissListenerC3181(this);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public int f7284 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public int f7280 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f7281 = true;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public boolean f7277 = true;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public int f7276 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final C3173 f7278 = new C3173(this);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public boolean f7275 = false;

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f7272) {
            return;
        }
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m5026(true, true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo4997(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo4997(layoutInflater, viewGroup, bundle);
        if (this.f7226 != null || this.f7273 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f7273.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo4998(Bundle bundle) {
        Bundle bundle2;
        this.f7224 = true;
        if (this.f7273 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f7273.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public Dialog mo5025() {
        if (AbstractC3146.m4922(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0890(m4995(), this.f7280);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m5026(boolean z, boolean z2) {
        if (this.f7274) {
            return;
        }
        this.f7274 = true;
        Dialog dialog = this.f7273;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f7273.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f7286.getLooper()) {
                    onDismiss(this.f7273);
                } else {
                    this.f7286.post(this.f7283);
                }
            }
        }
        this.f7272 = true;
        if (this.f7276 >= 0) {
            AbstractC3146 abstractC3146M5019 = m5019();
            int i = this.f7276;
            if (i < 0) {
                C6755.m11869(AbstractC7012.m12147(i, "Bad id: "));
                return;
            } else {
                abstractC3146M5019.m4952(new C3147(abstractC3146M5019, i), z);
                this.f7276 = -1;
                return;
            }
        }
        C3165 c3165 = new C3165(m5019());
        c3165.f7199 = true;
        c3165.m4992(this);
        if (z) {
            c3165.m4988(true);
        } else {
            c3165.m4988(false);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC9004 mo5005() {
        return new C3172(this, new C3174(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo5006() {
        this.f7224 = true;
        if (!this.f7274) {
            this.f7274 = true;
        }
        C3207 c3207 = this.f7259;
        c3207.getClass();
        AbstractC3208.m5052("removeObserver");
        C3209 c3209 = (C3209) c3207.f7348.mo13674(this.f7278);
        if (c3209 == null) {
            return;
        }
        c3209.m5055(false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo5007() {
        this.f7224 = true;
        Dialog dialog = this.f7273;
        if (dialog != null) {
            this.f7272 = true;
            dialog.setOnDismissListener(null);
            this.f7273.dismiss();
            if (!this.f7274) {
                onDismiss(this.f7273);
            }
            this.f7273 = null;
            this.f7275 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo5008() {
        this.f7224 = true;
        Dialog dialog = this.f7273;
        if (dialog != null) {
            this.f7272 = false;
            dialog.show();
            View decorView = this.f7273.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(C0328R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(C0328R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(C0328R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo5009() {
        this.f7224 = true;
        Dialog dialog = this.f7273;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater mo5010(Bundle bundle) {
        Context contextM5001;
        LayoutInflater layoutInflaterMo5010 = super.mo5010(bundle);
        boolean z = this.f7277;
        if (z && !this.f7279) {
            if (z && !this.f7275) {
                try {
                    this.f7279 = true;
                    Dialog dialogMo5025 = mo5025();
                    this.f7273 = dialogMo5025;
                    if (this.f7277) {
                        int i = this.f7284;
                        if (i == 1 || i == 2) {
                            dialogMo5025.requestWindowFeature(1);
                            contextM5001 = m5001();
                            if (contextM5001 != null) {
                                this.f7273.setOwnerActivity((Activity) contextM5001);
                            }
                            this.f7273.setCancelable(this.f7281);
                            this.f7273.setOnCancelListener(this.f7282);
                            this.f7273.setOnDismissListener(this.f7285);
                            this.f7275 = true;
                        } else if (i == 3) {
                            Window window = dialogMo5025.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo5025.requestWindowFeature(1);
                            contextM5001 = m5001();
                            if (contextM5001 != null) {
                            }
                            this.f7273.setCancelable(this.f7281);
                            this.f7273.setOnCancelListener(this.f7282);
                            this.f7273.setOnDismissListener(this.f7285);
                            this.f7275 = true;
                        } else {
                            contextM5001 = m5001();
                            if (contextM5001 != null) {
                            }
                            this.f7273.setCancelable(this.f7281);
                            this.f7273.setOnCancelListener(this.f7282);
                            this.f7273.setOnDismissListener(this.f7285);
                            this.f7275 = true;
                        }
                    } else {
                        this.f7273 = null;
                    }
                    this.f7279 = false;
                } catch (Throwable th) {
                    this.f7279 = false;
                    throw th;
                }
            }
            if (AbstractC3146.m4922(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f7273;
            if (dialog != null) {
                return layoutInflaterMo5010.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC3146.m4922(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f7277) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterMo5010;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterMo5010;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo5011(Bundle bundle) {
        Dialog dialog = this.f7273;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f7284;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f7280;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f7281;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f7277;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f7276;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo5012() {
        this.f7224 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo5014(Bundle bundle) {
        super.mo5014(bundle);
        this.f7286 = new Handler();
        this.f7277 = this.f7230 == 0;
        if (bundle != null) {
            this.f7284 = bundle.getInt("android:style", 0);
            this.f7280 = bundle.getInt("android:theme", 0);
            this.f7281 = bundle.getBoolean("android:cancelable", true);
            this.f7277 = bundle.getBoolean("android:showsDialog", this.f7277);
            this.f7276 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo5017(Context context) {
        super.mo5017(context);
        this.f7259.m5053(this.f7278);
        this.f7274 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
