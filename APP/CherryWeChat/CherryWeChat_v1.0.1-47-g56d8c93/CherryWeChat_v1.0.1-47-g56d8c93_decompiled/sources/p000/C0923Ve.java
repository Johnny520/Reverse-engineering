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
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        View viewPeekDecorView;
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return;
        }
        int i2 = AbstractC1309d6.f4763a;
        Resources.Theme theme = null;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                if ("REL".equals(str)) {
                    Map map = AbstractC0966We.f3009b;
                    String str2 = Build.MANUFACTURER;
                    Locale locale = Locale.ROOT;
                    InterfaceC0880Ue interfaceC0880Ue = (InterfaceC0880Ue) map.get(str2.toLowerCase(locale));
                    if (interfaceC0880Ue == null) {
                        interfaceC0880Ue = (InterfaceC0880Ue) AbstractC0966We.f3010c.get(Build.BRAND.toLowerCase(locale));
                    }
                    if (interfaceC0880Ue == null || !interfaceC0880Ue.mo1608a()) {
                        return;
                    }
                } else {
                    Locale locale2 = Locale.ROOT;
                    Integer num = str.toUpperCase(locale2).equals("BAKLAVA") ? num : null;
                    num = "Tiramisu".toUpperCase(locale2).equals("BAKLAVA") ? 0 : null;
                    if (num == null || num == null ? num != null || num != null ? num == null : str.toUpperCase(locale2).compareTo("Tiramisu".toUpperCase(locale2)) < 0 : num.intValue() < num.intValue()) {
                    }
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(AbstractC0966We.f3008a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        activity.getTheme().applyStyle(resourceId, true);
        Window window = activity.getWindow();
        if (window != null && (viewPeekDecorView = window.peekDecorView()) != null && (context = viewPeekDecorView.getContext()) != null) {
            theme = context.getTheme();
        }
        if (theme != null) {
            theme.applyStyle(resourceId, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
