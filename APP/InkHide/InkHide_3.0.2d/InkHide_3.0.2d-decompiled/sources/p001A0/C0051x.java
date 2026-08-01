package p001A0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p055lu.wxmask.bean.DBItem;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p005C0.C0069c;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p084q0.C0808h;
import p086r0.C0925n1;
import p086r0.ViewOnLongClickListenerC0862O0;
import p090t0.AbstractC1008c;
import p102z0.AbstractC1117C;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: A0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0051x extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f290a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.y.c(android.content.Context, A0.u):void, r0.d0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void] */
    public /* synthetic */ C0051x(int i2) {
        this.f290a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Throwable thM246a;
        String string;
        int i2 = 1;
        switch (this.f290a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                 = obj instanceof Activity ? (Activity) obj : 0;
                if ( == 0) {
                    return;
                }
                Context applicationContext = getApplicationContext();
                ?? r7 = applicationContext;
                if (applicationContext == null) {
                    r7 = ;
                }
                if (C0052y.f294d.get()) {
                    return;
                }
                C0052y.m96a(, r7, "launcher-resume");
                return;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                Object objM258f0 = objArr != null ? AbstractC0120h.m258f0(0, objArr) : null;
                String str = objM258f0 instanceof String ? (String) objM258f0 : null;
                String str2 = str != null ? str : "";
                C0069c.f318c = str2;
                C0069c.f319d = AbstractC0307q.m534d0(str2) ? null : new WeakReference(methodHookParam.thisObject);
                CopyOnWriteArrayList copyOnWriteArrayList = C0069c.f317b;
                C0069c c0069c = C0069c.f316a;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    try {
                        WeakReference weakReference = C0069c.f319d;
                        if (weakReference != null) {
                            weakReference.get();
                        }
                        throw null;
                    } finally {
                        if (thM246a == null) {
                        }
                    }
                }
                return;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.args[1];
                String str3 = obj2 != null ? new String((byte[]) obj2, AbstractC0291a.f663a) : null;
                Object obj3 = methodHookParam.args[0];
                if (obj3 == null || (string = obj3.toString()) == null) {
                    string = "";
                }
                AbstractC0731a.m1384a("hook db", string, str3, methodHookParam.getResult());
                if (string.equals("")) {
                    return;
                }
                HashMap map = AbstractC1117C.f3759a;
                AbstractC1117C.f3759a.put(string, new DBItem(string, str3, methodHookParam.getResult()));
                return;
            case 3:
            case 4:
            case 5:
            default:
                return;
            case 6:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj4 = methodHookParam.thisObject;
                if (obj4 == null) {
                    return;
                }
                AbstractC0731a.m1384a("hide contact ctor adapter", obj4.getClass().getName());
                return;
            case 7:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj5 = methodHookParam.thisObject;
                AbstractC0223g.m416c(obj5, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) obj5;
                Iterator it2 = AbstractC0503h.m987s((ViewGroup) activity.findViewById(R.id.content), new C0925n1(4)).iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).setOnLongClickListener(new ViewOnLongClickListenerC0862O0(i2, activity));
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean zContains;
        boolean zContains2;
        Activity activity;
        switch (this.f290a) {
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2443s() && C1124g.m2435k().getDisableWechatHotUpdate()) {
                    methodHookParam.setResult(Boolean.FALSE);
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z3 = AbstractC1126i.f3786a;
                if (C1124g.m2411B()) {
                    Object obj = methodHookParam.thisObject;
                    AbstractC0223g.m416c(obj, "null cannot be cast to non-null type android.app.Activity");
                    String stringExtra = ((Activity) obj).getIntent().getStringExtra("kintent_talker");
                    if (stringExtra == null || AbstractC0307q.m534d0(stringExtra)) {
                        AbstractC0731a.m1387d("MediaHistoryListUI‘s user is empty", stringExtra);
                    } else {
                        C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
                        if (!C1124g.m2443s()) {
                            zContains = false;
                        } else if (AbstractC0307q.m534d0(stringExtra)) {
                            AbstractC0731a.m1387d("chatUser is null or blank");
                            zContains = false;
                        } else {
                            zContains = c0808h.f2685b.contains(stringExtra);
                        }
                        if (zContains) {
                            methodHookParam.args[1] = 0;
                            AbstractC0731a.m1386c("empty MediaHistoryGalleryUI data");
                        }
                    }
                    break;
                }
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z4 = AbstractC1126i.f3786a;
                if (C1124g.m2411B()) {
                    Object obj2 = methodHookParam.thisObject;
                    AbstractC0223g.m416c(obj2, "null cannot be cast to non-null type android.app.Activity");
                    String stringExtra2 = ((Activity) obj2).getIntent().getStringExtra("kintent_talker");
                    if (stringExtra2 == null || AbstractC0307q.m534d0(stringExtra2)) {
                        AbstractC0731a.m1387d("MediaHistoryListUI‘s user is empty", stringExtra2);
                    } else {
                        C0808h c0808h2 = (C0808h) AbstractC0503h.m988u(C0808h.class);
                        if (!C1124g.m2443s()) {
                            zContains2 = false;
                        } else if (AbstractC0307q.m534d0(stringExtra2)) {
                            AbstractC0731a.m1387d("chatUser is null or blank");
                            zContains2 = false;
                        } else {
                            zContains2 = c0808h2.f2685b.contains(stringExtra2);
                        }
                        if (zContains2) {
                            methodHookParam.args[1] = 0;
                            AbstractC0731a.m1386c("empty MediaHistoryListUI data");
                        }
                    }
                    break;
                }
                break;
            case 8:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                Integer num = objM258f0 instanceof Integer ? (Integer) objM258f0 : null;
                if (num != null && num.intValue() == 4) {
                    Object obj3 = methodHookParam.thisObject;
                    activity = obj3 instanceof Activity ? (Activity) obj3 : null;
                    if (activity != null) {
                        int i2 = AbstractC1008c.f3601g;
                        if (AbstractC0503h.m984p(activity)) {
                            AbstractC0731a.m1384a("AttachUI back intercepted onKeyDown", activity.getClass().getName());
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                    }
                }
                break;
            case 9:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr2 = methodHookParam.args;
                AbstractC0223g.m417d(objArr2, "args");
                Object objM258f02 = AbstractC0120h.m258f0(0, objArr2);
                KeyEvent keyEvent = objM258f02 instanceof KeyEvent ? (KeyEvent) objM258f02 : null;
                if (keyEvent != null && keyEvent.getKeyCode() == 4) {
                    Object obj4 = methodHookParam.thisObject;
                    activity = obj4 instanceof Activity ? (Activity) obj4 : null;
                    if (activity != null) {
                        int i3 = AbstractC1008c.f3601g;
                        if (AbstractC0503h.m968D(activity)) {
                            if (keyEvent.getAction() == 0) {
                                methodHookParam.setResult(Boolean.TRUE);
                                break;
                            } else if (keyEvent.getAction() == 1 && AbstractC0503h.m984p(activity)) {
                                AbstractC0731a.m1384a("AttachUI back intercepted", activity.getClass().getName());
                                methodHookParam.setResult(Boolean.TRUE);
                                break;
                            }
                        }
                    }
                }
                break;
            case 10:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr3 = methodHookParam.args;
                AbstractC0223g.m417d(objArr3, "args");
                Object objM258f03 = AbstractC0120h.m258f0(0, objArr3);
                KeyEvent keyEvent2 = objM258f03 instanceof KeyEvent ? (KeyEvent) objM258f03 : null;
                if (keyEvent2 != null && keyEvent2.getKeyCode() == 4) {
                    Object obj5 = methodHookParam.thisObject;
                    activity = obj5 instanceof Activity ? (Activity) obj5 : null;
                    if (activity != null) {
                        int i4 = AbstractC1008c.f3601g;
                        if (AbstractC0503h.m968D(activity)) {
                            if (keyEvent2.getAction() == 0) {
                                AbstractC0731a.m1384a("AttachUI launcher back down intercepted", activity.getClass().getName());
                                methodHookParam.setResult(Boolean.TRUE);
                                break;
                            } else if (keyEvent2.getAction() == 1 && AbstractC0503h.m984p(activity)) {
                                AbstractC0731a.m1384a("AttachUI launcher back up intercepted", activity.getClass().getName());
                                methodHookParam.setResult(Boolean.TRUE);
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr4 = methodHookParam.args;
                AbstractC0223g.m417d(objArr4, "args");
                Object objM258f04 = AbstractC0120h.m258f0(0, objArr4);
                Integer num2 = objM258f04 instanceof Integer ? (Integer) objM258f04 : null;
                if (num2 != null && num2.intValue() == 4) {
                    Object obj6 = methodHookParam.thisObject;
                    activity = obj6 instanceof Activity ? (Activity) obj6 : null;
                    if (activity != null) {
                        int i5 = AbstractC1008c.f3601g;
                        if (AbstractC0503h.m984p(activity)) {
                            AbstractC0731a.m1384a("AttachUI launcher onKeyDown intercepted", activity.getClass().getName());
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                    }
                }
                break;
            case 12:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj7 = methodHookParam.thisObject;
                Activity activity2 = obj7 instanceof Activity ? (Activity) obj7 : null;
                if (activity2 != null) {
                    int i6 = AbstractC1008c.f3601g;
                    if (AbstractC0503h.m984p(activity2)) {
                        AbstractC0731a.m1384a("AttachUI launcher onBackPressed intercepted", activity2.getClass().getName());
                        methodHookParam.setResult((Object) null);
                    }
                    break;
                }
                break;
        }
    }
}
