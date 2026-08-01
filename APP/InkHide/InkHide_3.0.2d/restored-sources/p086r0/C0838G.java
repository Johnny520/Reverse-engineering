package p086r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import org.json.JSONException;
import p001A0.AbstractC0038k;
import p001A0.AbstractC0039l;
import p001A0.C0035h;
import p001A0.C0036i;
import p001A0.C0047t;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p059d0.InterfaceC0518c;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: r0.G */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0838G implements InterfaceC0518c, InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0894d0 f2804a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [r0.d0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.d0.m0(java.lang.Class, boolean):void] */
    public /* synthetic */ C0838G(C0894d0 c0894d0) {
        this.f2804a = c0894d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0518c
    /* JADX INFO: renamed from: a */
    public boolean mo6a(AccessibleObject accessibleObject) {
        Method method = (Method) accessibleObject;
        AbstractC0223g.m415b(method);
        this.f2804a.getClass();
        if (!Modifier.isAbstract(method.getModifiers()) && !Modifier.isAbstract(method.getDeclaringClass().getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length >= 2 && parameterTypes[0].getName().equals("androidx.recyclerview.widget.k3") && AbstractC0223g.m414a(parameterTypes[1], Integer.TYPE) && (AbstractC0223g.m414a(method.getName(), "onBindViewHolder") || (AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && (parameterTypes.length == 2 || (parameterTypes.length == 3 && List.class.isAssignableFrom(parameterTypes[2])))))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) throws JSONException {
        Object c0104d;
        Context context = (Context) obj;
        AbstractC0223g.m418e(context, "appContext");
        C0036i c0036i = null;
        c0036i = null;
        if (AbstractC0038k.m60a()) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String str = applicationInfo != null ? applicationInfo.sourceDir : null;
            if (str == null || AbstractC0307q.m534d0(str)) {
                AbstractC0731a.m1387d("contact dexkit apk path empty");
            } else {
                try {
                    c0104d = (C0036i) AbstractC0039l.m62B(str, new C0035h(context, 0));
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("contact dexkit resolve fail", thM246a);
                }
                c0036i = (C0036i) (c0104d instanceof C0104d ? null : c0104d);
            }
        }
        if (c0036i == null) {
            AbstractC0039l.m81s("contact_scan_status_v2", false);
            return new C0047t(false, "未找到可用 Hook 点", true);
        }
        this.f2804a.f3147z = c0036i;
        AbstractC0039l.m85w(context, c0036i);
        AbstractC0039l.m81s("contact_scan_status_v2", true);
        return new C0047t(true, c0036i.f236d + "/" + c0036i.f237e, true);
    }
}
