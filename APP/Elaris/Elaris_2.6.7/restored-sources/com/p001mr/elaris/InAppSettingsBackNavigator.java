package com.p001mr.elaris;

import android.app.Activity;
import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC0000a;
import p000.AbstractC0198e7;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsBackNavigator {
    private static final int BACK_CALLBACK_PRIORITY = 1000000;
    private static final long BACK_DEBOUNCE_MS = 220;
    private Object backCallback;
    private String currentCategory;
    private long lastBackAt;
    private final List<String> pageStack = new ArrayList();
    private final InAppSettings settings;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsBackNavigator(InAppSettings inAppSettings) {
        this.settings = inAppSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void goBack(String str) {
        StringBuilder sbM1b = AbstractC0000a.m1b("settings back route reason=", str, " depth=");
        sbM1b.append(this.pageStack.size());
        sbM1b.append(" current=");
        sbM1b.append(String.valueOf(this.currentCategory));
        HookEntry.log(sbM1b.toString());
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastBackAt < BACK_DEBOUNCE_MS) {
            this.settings.refocusAfterBackDebounce();
            return;
        }
        this.lastBackAt = jCurrentTimeMillis;
        if (this.pageStack.isEmpty() && this.currentCategory != null) {
            this.currentCategory = null;
            this.settings.showHomeFromNavigation(-1);
            return;
        }
        if (this.pageStack.isEmpty()) {
            this.settings.restoreQQFromNavigation();
            return;
        }
        int size = this.pageStack.size();
        List<String> list = this.pageStack;
        if (size <= 1) {
            list.clear();
            this.currentCategory = null;
            this.settings.showHomeFromNavigation(-1);
            return;
        }
        list.remove(list.size() - 1);
        List<String> list2 = this.pageStack;
        String str2 = list2.get(list2.size() - 1);
        try {
            this.settings.showCategoryFromNavigation(str2, -1);
            this.currentCategory = str2;
        } catch (Throwable th) {
            HookEntry.log("back to category failed " + str2 + ": " + th);
            this.settings.showCategoryErrorFromNavigation(str2, th, -1);
            this.currentCategory = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object handleBackCallbackInvocation(Method method) {
        if ("onBackInvoked".equals(method.getName()) && !wasBackHandledRecently() && this.settings.isBackNavigationEligible()) {
            this.settings.handleBackInsideElarisFromNavigation("onBackInvoked");
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void keepCategoryBackTarget(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.currentCategory = str;
        boolean zIsEmpty = this.pageStack.isEmpty();
        List<String> list = this.pageStack;
        if (zIsEmpty) {
            list.add(str);
            return;
        }
        int size = list.size() - 1;
        if (str.equals(this.pageStack.get(size))) {
            return;
        }
        this.pageStack.set(size, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void recordBackHandled() {
        this.lastBackAt = System.currentTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void refreshCurrentPage() {
        this.settings.keepElarisPageFocused();
        String str = this.currentCategory;
        if (str == null || str.length() <= 0) {
            this.settings.showHomeFromNavigation(0);
        } else {
            this.settings.showCategoryFromNavigation(str, 0);
            this.currentCategory = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void registerBackCallback() {
        try {
            if (Build.VERSION.SDK_INT >= 33 && this.backCallback == null) {
                Class<?> cls = Class.forName("android.window.OnBackInvokedCallback");
                Object objNewProxyInstance = Proxy.newProxyInstance(InAppSettings.class.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.mr.elaris.InAppSettingsBackNavigator.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) {
                        return InAppSettingsBackNavigator.this.settings.handleBackCallbackInvocation(obj, method, objArr);
                    }
                });
                Object objInvoke = Activity.class.getMethod("getOnBackInvokedDispatcher", null).invoke(this.settings.activity, null);
                objInvoke.getClass().getMethod("registerOnBackInvokedCallback", Integer.TYPE, cls).invoke(objInvoke, Integer.valueOf(BACK_CALLBACK_PRIORITY), objNewProxyInstance);
                this.backCallback = objNewProxyInstance;
            }
        } catch (Throwable th) {
            AbstractC0198e7.m343a(Prefs.PREFS_NAME, "register-back-callback", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resetForAttach() {
        this.pageStack.clear();
        this.currentCategory = null;
        this.lastBackAt = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void showCategory(String str, boolean z) {
        if (z) {
            try {
                if (this.pageStack.isEmpty()) {
                    this.pageStack.add(str);
                } else {
                    List<String> list = this.pageStack;
                    if (!str.equals(list.get(list.size() - 1))) {
                        this.pageStack.add(str);
                    }
                }
            } catch (Throwable th) {
                HookEntry.log("open category failed " + str + ": " + th);
                this.settings.showCategoryErrorFromNavigation(str, th, 1);
                this.currentCategory = str;
                return;
            }
        }
        StringBuilder sbM1b = AbstractC0000a.m1b("settings category route category=", str, " depth=");
        sbM1b.append(this.pageStack.size());
        sbM1b.append(" add=");
        sbM1b.append(z);
        HookEntry.log(sbM1b.toString());
        this.settings.showCategoryFromNavigation(str, 1);
        this.currentCategory = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void unregisterBackCallback() {
        Throwable cause;
        Object obj = this.backCallback;
        this.backCallback = null;
        try {
            if (Build.VERSION.SDK_INT >= 33 && obj != null) {
                Class<?> cls = Class.forName("android.window.OnBackInvokedCallback");
                Object objInvoke = Activity.class.getMethod("getOnBackInvokedDispatcher", null).invoke(this.settings.activity, null);
                objInvoke.getClass().getMethod("unregisterOnBackInvokedCallback", cls).invoke(objInvoke, obj);
            }
        } catch (Throwable th) {
            boolean z = th instanceof InvocationTargetException;
            if (z) {
                InvocationTargetException invocationTargetException = th;
                cause = invocationTargetException.getCause() != null ? invocationTargetException.getCause() : th;
            }
            if ((cause instanceof IllegalArgumentException) || (cause instanceof IllegalStateException) || z) {
                return;
            }
            AbstractC0198e7.m343a(Prefs.PREFS_NAME, "unregister-back-callback", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean wasBackHandledRecently() {
        long j = this.lastBackAt;
        return j > 0 && System.currentTimeMillis() - j < BACK_DEBOUNCE_MS;
    }
}
