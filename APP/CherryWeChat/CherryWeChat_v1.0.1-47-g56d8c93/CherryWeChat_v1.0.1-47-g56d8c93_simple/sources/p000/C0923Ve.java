package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: Ve */
/* JADX INFO: loaded from: classes.dex */
public final class C0923Ve implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity r9, Bundle r10) {
        Integer r0 = 0;
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 31) goto L51;
        int r2 = AbstractC1309d6.f4763a;
        Resources.Theme r3 = null;
        if (r1 < 33) goto L8;
    L38:
        TypedArray r02 = r9.obtainStyledAttributes(AbstractC0966We.f3008a);
        int r102 = r02.getResourceId(0, 0);
        r02.recycle();
        r9.getTheme().applyStyle(r102, true);
        Window r92 = r9.getWindow();
        if (r92 == null) goto L45;
        View r93 = r92.peekDecorView();
        if (r93 == null) goto L45;
        Context r94 = r93.getContext();
        if (r94 == null) goto L45;
        r3 = r94.getTheme();
    L45:
        if (r3 == null) goto L50;
        r3.applyStyle(r102, true);
        return;
    L50:
        return;
    L8:
        if (r1 < 32) goto L32;
        String r12 = Build.VERSION.CODENAME;
        if ("REL".equals(r12) == true) goto L32;
        Locale r22 = Locale.ROOT;
        if (r12.toUpperCase(r22).equals("BAKLAVA") == false) goto L15;
        Integer r4 = r0;
    L17:
        if ("Tiramisu".toUpperCase(r22).equals("BAKLAVA") == true) goto L20;
        r0 = null;
    L20:
        if (r4 == null) goto L25;
        if (r0 == null) goto L25;
        if (r4.intValue() < r0.intValue()) goto L32;
    L25:
        if (r4 != null) goto L30;
        if (r0 != null) goto L30;
        if (r12.toUpperCase(r22).compareTo("Tiramisu".toUpperCase(r22)) < 0) goto L32;
    L30:
        if (r4 == null) goto L32;
    L15:
        r4 = null;
    L32:
        Map r03 = AbstractC0966We.f3009b;
        String r13 = Build.MANUFACTURER;
        Locale r23 = Locale.ROOT;
        InterfaceC0880Ue r04 = (InterfaceC0880Ue) r03.get(r13.toLowerCase(r23));
        if (r04 != null) goto L35;
        r04 = (InterfaceC0880Ue) AbstractC0966We.f3010c.get(Build.BRAND.toLowerCase(r23));
    L35:
        if (r04 != null) goto L37;
        return;
    L37:
        if (r04.mo1608a() == true) goto L38;
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r1) {
    }
}
