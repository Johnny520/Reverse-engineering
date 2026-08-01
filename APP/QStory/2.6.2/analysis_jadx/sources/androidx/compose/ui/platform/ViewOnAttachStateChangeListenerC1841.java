package androidx.compose.ui.platform;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C1383;
import com.kongzue.dialogx.util.views.C3752;
import java.lang.ref.WeakReference;
import p136.C7526;
import p151.C7585;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1841 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f5343;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f5344;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5345;

    public ViewOnAttachStateChangeListenerC1841(C7526 c7526, Activity activity) {
        this.f5345 = 4;
        c7526.getClass();
        this.f5343 = c7526;
        this.f5344 = new WeakReference(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.f5345
            r1 = 0
            java.lang.Object r2 = r6.f5343
            java.lang.Object r3 = r6.f5344
            switch(r0) {
                case 0: goto Lac;
                case 1: goto L92;
                case 2: goto L91;
                case 3: goto L41;
                case 4: goto L15;
                default: goto La;
            }
        La:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            飘花落叶言子哲世兰楪苏.飘花落叶言子楪世哲兰苏 r3 = (p151.C7585) r3
            r2.addView(r3, r1)
            r7.removeOnAttachStateChangeListener(r6)
            return
        L15:
            r7.getClass()
            r7.removeOnAttachStateChangeListener(r6)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r6 = r3.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L34
            android.view.Window r7 = r6.getWindow()
            if (r7 == 0) goto L34
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
            if (r7 == 0) goto L34
            android.os.IBinder r7 = r7.token
            goto L35
        L34:
            r7 = 0
        L35:
            if (r6 != 0) goto L38
            goto L40
        L38:
            if (r7 != 0) goto L3b
            goto L40
        L3b:
            飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏哲兰世 r2 = (p136.C7526) r2
            r2.m12721(r7, r6)
        L40:
            return
        L41:
            r7.removeOnAttachStateChangeListener(r6)
            com.kongzue.dialogx.util.views.飘花落叶言子楪世兰哲苏 r3 = (com.kongzue.dialogx.util.views.C3752) r3
            int r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f11618
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L6b
            r0 = -1
            android.app.Application r4 = com.kongzue.dialogx.interfaces.AbstractC3737.m8055()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            if (r4 != 0) goto L56
            goto L69
        L56:
            android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            android.content.pm.ApplicationInfo r1 = r5.getApplicationInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            int r0 = r1.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            goto L69
        L65:
            r1 = move-exception
            r1.printStackTrace()
        L69:
            if (r0 >= r2) goto L8c
        L6b:
            android.view.ViewParent r0 = r7.getParent()
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.bottomappbar.飘花落叶言子楪世苏哲兰 r1 = r3.f11655
            if (r1 == 0) goto L78
            r0.removeOnLayoutChangeListener(r1)
        L78:
            com.google.android.material.bottomappbar.飘花落叶言子楪世苏哲兰 r1 = new com.google.android.material.bottomappbar.飘花落叶言子楪世苏哲兰
            r2 = 1
            r1.<init>(r6, r2)
            r3.f11655 = r1
            r0.addOnLayoutChangeListener(r1)
            androidx.compose.ui.platform.飘花落叶言子兰世楪苏哲 r1 = new androidx.compose.ui.platform.飘花落叶言子兰世楪苏哲
            r2 = 2
            r1.<init>(r6, r2, r0)
            r0.addOnAttachStateChangeListener(r1)
        L8c:
            java.util.WeakHashMap r6 = androidx.core.view.AbstractC2270.f6593
            r7.requestApplyInsets()
        L91:
            return
        L92:
            androidx.fragment.app.飘花落叶言子世兰哲苏楪 r2 = (androidx.fragment.app.C2304) r2
            androidx.fragment.app.飘花落叶言子楪兰苏哲世 r6 = r2.f6753
            r2.m4334()
            android.view.View r6 = r6.f6880
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            androidx.fragment.app.飘花落叶言子世楪兰苏哲 r3 = (androidx.fragment.app.LayoutInflaterFactory2C2316) r3
            androidx.fragment.app.飘花落叶言子世哲苏兰楪 r7 = r3.f6808
            androidx.fragment.app.飘花落叶言子楪苏哲世兰 r6 = androidx.fragment.app.C2349.m4457(r6, r7)
            r6.m4458()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841.onViewAttachedToWindow(android.view.View):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f5345;
        Object obj = this.f5344;
        Object obj2 = this.f5343;
        switch (i) {
            case 0:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((C1383) obj).m2516();
                break;
            case 1:
                break;
            case 2:
                ((View) obj2).removeOnLayoutChangeListener(((C3752) ((ViewOnAttachStateChangeListenerC1841) obj).f5344).f11655);
                break;
            case 3:
                break;
            case 4:
                view.getClass();
                break;
            default:
                ((ViewGroup) obj2).addView((C7585) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public /* synthetic */ ViewOnAttachStateChangeListenerC1841(Object obj, int i, Object obj2) {
        this.f5345 = i;
        this.f5344 = obj;
        this.f5343 = obj2;
    }

    public /* synthetic */ ViewOnAttachStateChangeListenerC1841(int i, View view, Object obj) {
        this.f5345 = i;
        this.f5343 = view;
        this.f5344 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m3464(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m3465(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m3466(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m3467(View view) {
    }
}
