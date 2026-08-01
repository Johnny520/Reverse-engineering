package p086r0;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p081o0.C0781b;
import p084q0.C0801a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0938s extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0801a f3343b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0938s(C0801a c0801a, int i2) {
        this.f3342a = i2;
        this.f3343b = c0801a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0801a c0801a = this.f3343b;
        switch (this.f3342a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                c0801a.f2669b = (Bundle) AbstractC0514f.f1622b.mo1012c(methodHookParam.thisObject, "getArguments", new Object[0]);
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                c0801a.f2669b = null;
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2411B()) {
                    C0801a.m1468a(c0801a, methodHookParam);
                    if (C0801a.m1469b(c0801a, methodHookParam.thisObject)) {
                        Object obj = methodHookParam.args[0];
                        AbstractC0223g.m416c(obj, "null cannot be cast to non-null type android.view.LayoutInflater");
                        Object obj2 = methodHookParam.args[1];
                        AbstractC0223g.m416c(obj2, "null cannot be cast to non-null type android.view.ViewGroup");
                        Integer num = (Integer) AbstractC0514f.f1622b.mo1012c(methodHookParam.thisObject, "getLayoutId", new Object[0]);
                        AbstractC0223g.m415b(num);
                        methodHookParam.setResult(((LayoutInflater) obj).inflate(num.intValue(), (ViewGroup) obj2, false));
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        Activity activity;
        boolean zContains;
        boolean zContains2 = false;
        C0801a c0801a = this.f3343b;
        switch (this.f3342a) {
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                AbstractC0223g.m416c(obj, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) obj;
                Bundle bundle = (Bundle) c0801a.f2669b;
                if (bundle != null) {
                    String string = bundle.getString("Chat_User");
                    C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
                    boolean z2 = AbstractC1126i.f3786a;
                    if (C1124g.m2443s()) {
                        if (string == null || AbstractC0307q.m534d0(string)) {
                            AbstractC0731a.m1387d("chatUser is null or blank");
                        } else {
                            zContains2 = c0808h.f2685b.contains(string);
                        }
                    }
                    if (zContains2) {
                        activity2.finish();
                    }
                    Set<String> setKeySet = bundle.keySet();
                    StringBuilder sb = new StringBuilder();
                    for (String str : setKeySet) {
                        sb.append(str + ": " + bundle.get(str) + ", ");
                    }
                    AbstractC0731a.m1384a("ImageQueryMainUI onCreate", sb.toString());
                    break;
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z3 = AbstractC1126i.f3786a;
                if (C1124g.m2411B()) {
                    C0801a.m1468a(c0801a, methodHookParam);
                    if (C0801a.m1469b(c0801a, methodHookParam.thisObject)) {
                        Object obj2 = methodHookParam.args[0];
                        AbstractC0223g.m416c(obj2, "null cannot be cast to non-null type java.util.ArrayList<*>");
                        ((ArrayList) obj2).clear();
                    }
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z4 = AbstractC1126i.f3786a;
                if (C1124g.m2411B()) {
                    C0801a.m1468a(c0801a, methodHookParam);
                    if (C0801a.m1469b(c0801a, methodHookParam.thisObject)) {
                        Object obj3 = methodHookParam.args[0];
                        AbstractC0223g.m416c(obj3, "null cannot be cast to non-null type java.util.ArrayList<*>");
                        ((ArrayList) obj3).clear();
                    }
                    break;
                }
                break;
            case 6:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z5 = AbstractC1126i.f3786a;
                if (C1124g.m2411B()) {
                    Field[] fieldArrMo1018i = AbstractC0514f.f1622b.mo1018i(methodHookParam.thisObject.getClass(), new C0781b(methodHookParam, c0801a, 2));
                    AbstractC0223g.m415b(fieldArrMo1018i);
                    if (fieldArrMo1018i.length == 0) {
                        activity = null;
                    } else {
                        Object obj4 = fieldArrMo1018i[0].get(methodHookParam.thisObject);
                        AbstractC0223g.m416c(obj4, "null cannot be cast to non-null type android.app.Activity");
                        activity = (Activity) obj4;
                    }
                    if (activity == null) {
                        AbstractC0731a.m1387d("can not find DetailHistoryUIForGallery8044");
                    } else {
                        String stringExtra = activity.getIntent().getStringExtra("kintent_talker");
                        if (stringExtra == null || AbstractC0307q.m534d0(stringExtra)) {
                            AbstractC0731a.m1387d("MediaHistoryListUI‘s user is empty", stringExtra);
                        } else {
                            C0808h c0808h2 = (C0808h) AbstractC0503h.m988u(C0808h.class);
                            if (!C1124g.m2443s()) {
                                zContains = false;
                            } else if (AbstractC0307q.m534d0(stringExtra)) {
                                AbstractC0731a.m1387d("chatUser is null or blank");
                                zContains = false;
                            } else {
                                zContains = c0808h2.f2685b.contains(stringExtra);
                            }
                            if (zContains) {
                                methodHookParam.args[1] = 0;
                                AbstractC0731a.m1386c("empty MediaHistoryGalleryUI data");
                                methodHookParam.args[0] = Boolean.FALSE;
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}
