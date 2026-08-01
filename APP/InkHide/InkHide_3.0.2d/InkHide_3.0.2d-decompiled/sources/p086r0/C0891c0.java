package p086r0;

import android.view.ContextMenu;
import android.view.MenuItem;
import de.robv.android.xposed.XC_MethodHook;
import p009E0.C0103c;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0891c0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0894d0 f3075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3076c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0891c0(C0894d0 c0894d0, String str, int i2) {
        this.f3074a = i2;
        this.f3075b = c0894d0;
        this.f3076c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0103c c0103cM1845g;
        switch (this.f3074a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                    Object objM1828S = null;
                    ContextMenu contextMenu = objM258f0 instanceof ContextMenu ? (ContextMenu) objM258f0 : null;
                    if (contextMenu != null) {
                        Object obj = methodHookParam.thisObject;
                        C0894d0 c0894d0 = this.f3075b;
                        if (obj == null) {
                            c0894d0.getClass();
                        } else {
                            c0894d0.getClass();
                            objM1828S = C0894d0.m1828S(obj, "d");
                            if (objM1828S == null) {
                                objM1828S = c0894d0.m1910v(obj);
                            }
                        }
                        if (objM1828S != null && (c0103cM1845g = C0894d0.m1845g(c0894d0, objM1828S)) != null) {
                            Object obj2 = c0103cM1845g.f394a;
                            String str = (String) c0103cM1845g.f395b;
                            C0894d0.m1834a(c0894d0, contextMenu, (String) obj2, str);
                            if (str == null) {
                                str = "";
                            }
                            AbstractC0731a.m1384a("contact quick add dynamic address menu create", this.f3076c, obj2, str);
                        }
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objM1828S;
        C0103c c0103cM1845g;
        switch (this.f3074a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                    MenuItem menuItem = objM258f0 instanceof MenuItem ? (MenuItem) objM258f0 : null;
                    if (menuItem != null) {
                        C0894d0 c0894d0 = this.f3075b;
                        c0894d0.getClass();
                        if (C0894d0.m1858s0(menuItem)) {
                            Object obj = methodHookParam.thisObject;
                            if (obj == null) {
                                objM1828S = null;
                            } else {
                                objM1828S = C0894d0.m1828S(obj, "d");
                                if (objM1828S == null) {
                                    objM1828S = c0894d0.m1910v(obj);
                                }
                            }
                            if (objM1828S != null && (c0103cM1845g = C0894d0.m1845g(c0894d0, objM1828S)) != null) {
                                Object obj2 = c0103cM1845g.f394a;
                                String str = (String) c0103cM1845g.f395b;
                                c0894d0.m1900k((String) obj2, str);
                                if (str == null) {
                                    str = "";
                                }
                                AbstractC0731a.m1384a("contact quick add dynamic address menu click", this.f3076c, obj2, str);
                                methodHookParam.setResult((Object) null);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
