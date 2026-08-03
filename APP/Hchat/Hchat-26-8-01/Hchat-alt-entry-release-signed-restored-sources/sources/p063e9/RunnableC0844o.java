package p063e9;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import gg.AbstractC1416l;
import java.util.concurrent.atomic.AtomicBoolean;
import lb.C2547i;
import okhttp3.HttpUrl;
import p080fb.AbstractC1184v0;
import p099h.Hchat.utils.KavaReflector;
import p198nb.AbstractC2943l;
import p198nb.C2945n;
import p198nb.C2954w;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p281t3.C4104a;
import p366ya.AbstractC6019i;

/* JADX INFO: renamed from: e9.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0844o implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2576g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2577h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2578i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2579j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0844o(C4104a c4104a, int i9, Object obj) {
        this.f2576g = 3;
        this.f2578i = c4104a;
        this.f2577h = i9;
        this.f2579j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        Bundle bundle;
        Object objInvokeMethod;
        int i9 = this.f2576g;
        int i10 = 1;
        view = null;
        view = null;
        View view = null;
        Object obj = this.f2579j;
        int i11 = this.f2577h;
        Object obj2 = this.f2578i;
        switch (i9) {
            case 0:
                Context context = (Context) obj2;
                String str = (String) obj;
                if (AbstractC6019i.m10785f(context, str, true)) {
                    AtomicBoolean atomicBoolean = C0846q.f2580a;
                    Object systemService = context.getSystemService("notification");
                    NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                    if (notificationManager != null) {
                        try {
                            notificationManager.cancel(i11);
                            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                            activeNotifications.getClass();
                            for (StatusBarNotification statusBarNotification : activeNotifications) {
                                Notification notification = statusBarNotification.getNotification();
                                if (notification != null && (bundle = notification.extras) != null && bundle.getBoolean("hchat_custom_notification", false) && AbstractC1416l.m3825a(bundle.getString("hchat_custom_notification_talker"), str)) {
                                    if (statusBarNotification.getTag() == null) {
                                        notificationManager.cancel(statusBarNotification.getId());
                                    } else {
                                        notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                                    }
                                }
                            }
                            c3959f = C3967n.f12976a;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:CustomNotification] 清理会话通知失败: ".concat(str), thM8182b);
                        }
                    }
                }
                break;
            case 1:
                C2547i c2547i = (C2547i) obj2;
                View view2 = (View) obj;
                Object field = KavaReflector.readField(view2, "m");
                if (field != null && (objInvokeMethod = KavaReflector.invokeMethod(field, "j", new Object[0])) != null) {
                    View view3 = objInvokeMethod instanceof View ? (View) objInvokeMethod : null;
                    if (view3 != null) {
                        view = view3;
                    }
                }
                if (view != null) {
                    view.setFocusable(true);
                    view.setFocusableInTouchMode(true);
                    view.requestFocusFromTouch();
                    view.requestFocus();
                    if (view instanceof EditText) {
                        EditText editText = (EditText) view;
                        Editable text = editText.getText();
                        editText.setSelection(text != null ? text.length() : 0);
                    }
                    view.performClick();
                    InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(view, 1);
                    }
                    if (i11 < 2 && !view.hasFocus()) {
                        view2.postDelayed(new RunnableC0844o(c2547i, view2, i11 + 1, i10), 120L);
                        break;
                    }
                }
                break;
            case 2:
                C2954w c2954w = (C2954w) obj2;
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!c2954w.f9691r && str2.length() != 0 && str2.equals(c2954w.f9689p)) {
                    AbstractC2943l abstractC2943l = c2954w.f9688o;
                    C2945n c2945n = abstractC2943l instanceof C2945n ? (C2945n) abstractC2943l : null;
                    if (c2945n != null) {
                        c2945n.f9660b = AbstractC3754e0.m7909r(c2954w.f9690q + i11, 0, c2945n.f9659a.length());
                    }
                    break;
                }
                break;
            default:
                ((C4104a) obj2).f13576b.mo5871c(i11, obj);
                break;
        }
    }

    public /* synthetic */ RunnableC0844o(Object obj, Object obj2, int i9, int i10) {
        this.f2576g = i10;
        this.f2578i = obj;
        this.f2579j = obj2;
        this.f2577h = i9;
    }
}
