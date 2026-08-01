package androidx.fragment.app;

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
import androidx.activity.DialogC0043;
import androidx.lifecycle.AbstractC2375;
import androidx.lifecycle.C2374;
import androidx.lifecycle.C2376;
import com.davemorrissey.labs.subscaleview.R;
import p009.AbstractC6183;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2343 extends AbstractComponentCallbacksC2338 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f6927;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public Dialog f6928;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public boolean f6929;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public boolean f6934;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public Handler f6941;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final RunnableC2350 f6938 = new RunnableC2350(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final DialogInterfaceOnCancelListenerC2347 f6937 = new DialogInterfaceOnCancelListenerC2347(this);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC2348 f6940 = new DialogInterfaceOnDismissListenerC2348(this);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public int f6939 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public int f6935 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f6936 = true;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public boolean f6932 = true;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public int f6931 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final C2340 f6933 = new C2340(this);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public boolean f6930 = false;

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f6927) {
            return;
        }
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m4466(true, true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo4437(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo4437(layoutInflater, viewGroup, bundle);
        if (this.f6881 != null || this.f6928 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f6928.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo4438(Bundle bundle) {
        Bundle bundle2;
        this.f6879 = true;
        if (this.f6928 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f6928.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public Dialog mo4465() {
        if (AbstractC2313.m4362(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0043(m4435(), this.f6935);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m4466(boolean z, boolean z2) {
        if (this.f6929) {
            return;
        }
        this.f6929 = true;
        Dialog dialog = this.f6928;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f6928.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f6941.getLooper()) {
                    onDismiss(this.f6928);
                } else {
                    this.f6941.post(this.f6938);
                }
            }
        }
        this.f6927 = true;
        if (this.f6931 >= 0) {
            AbstractC2313 abstractC2313M4459 = m4459();
            int i = this.f6931;
            if (i < 0) {
                C5925.m11310(AbstractC6183.m11588(i, "Bad id: "));
                return;
            } else {
                abstractC2313M4459.m4392(new C2314(abstractC2313M4459, i), z);
                this.f6931 = -1;
                return;
            }
        }
        C2332 c2332 = new C2332(m4459());
        c2332.f6854 = true;
        c2332.m4432(this);
        if (z) {
            c2332.m4428(true);
        } else {
            c2332.m4428(false);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC8175 mo4445() {
        return new C2339(this, new C2341(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo4446() {
        this.f6879 = true;
        if (!this.f6929) {
            this.f6929 = true;
        }
        C2374 c2374 = this.f6914;
        c2374.getClass();
        AbstractC2375.m4492("removeObserver");
        C2376 c2376 = (C2376) c2374.f7003.mo13115(this.f6933);
        if (c2376 == null) {
            return;
        }
        c2376.m4495(false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo4447() {
        this.f6879 = true;
        Dialog dialog = this.f6928;
        if (dialog != null) {
            this.f6927 = true;
            dialog.setOnDismissListener(null);
            this.f6928.dismiss();
            if (!this.f6929) {
                onDismiss(this.f6928);
            }
            this.f6928 = null;
            this.f6930 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo4448() {
        this.f6879 = true;
        Dialog dialog = this.f6928;
        if (dialog != null) {
            this.f6927 = false;
            dialog.show();
            View decorView = this.f6928.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo4449() {
        this.f6879 = true;
        Dialog dialog = this.f6928;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater mo4450(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.mo4450(r8)
            boolean r0 = r7.f6932
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.f6934
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.f6930
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f6934 = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.mo4465()     // Catch: java.lang.Throwable -> L4c
            r7.f6928 = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f6932     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.f6939     // Catch: java.lang.Throwable -> L4c
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4c
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4c
        L3e:
            android.content.Context r4 = r7.m4441()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.f6928     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.f6928     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f6936     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f6928     // Catch: java.lang.Throwable -> L4c
            androidx.fragment.app.飘花落叶言子楪苏兰世哲 r5 = r7.f6937     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f6928     // Catch: java.lang.Throwable -> L4c
            androidx.fragment.app.飘花落叶言子楪苏兰哲世 r5 = r7.f6940     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.f6930 = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.f6928 = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.f6934 = r0
            goto L6f
        L6c:
            r7.f6934 = r0
            throw r8
        L6f:
            boolean r0 = androidx.fragment.app.AbstractC2313.m4362(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r7 = r7.f6928
            if (r7 == 0) goto Lc3
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r7 = r8.cloneInContext(r7)
            return r7
        L98:
            boolean r0 = androidx.fragment.app.AbstractC2313.m4362(r2)
            if (r0 == 0) goto Lc3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r7 = r7.f6932
            if (r7 != 0) goto Lba
            java.lang.String r7 = "mShowsDialog = false: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
            return r8
        Lba:
            java.lang.String r7 = "mCreatingDialog = true: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
        Lc3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC2343.mo4450(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo4451(Bundle bundle) {
        Dialog dialog = this.f6928;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f6939;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f6935;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f6936;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f6932;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f6931;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4452() {
        this.f6879 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo4454(Bundle bundle) {
        super.mo4454(bundle);
        this.f6941 = new Handler();
        this.f6932 = this.f6885 == 0;
        if (bundle != null) {
            this.f6939 = bundle.getInt("android:style", 0);
            this.f6935 = bundle.getInt("android:theme", 0);
            this.f6936 = bundle.getBoolean("android:cancelable", true);
            this.f6932 = bundle.getBoolean("android:showsDialog", this.f6932);
            this.f6931 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4457(Context context) {
        super.mo4457(context);
        this.f6914.m4493(this.f6933);
        this.f6929 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
