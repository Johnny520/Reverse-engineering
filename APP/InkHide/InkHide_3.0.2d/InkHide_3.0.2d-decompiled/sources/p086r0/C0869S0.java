package p086r0;

import android.view.ContextMenu;
import android.view.MenuItem;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0869S0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f2990a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0881Y0 f2991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f2992c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f2993d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Method f2994e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0869S0(boolean z2, C0881Y0 c0881y0, Class cls, Class cls2, Method method) {
        this.f2990a = z2;
        this.f2991b = c0881y0;
        this.f2992c = cls;
        this.f2993d = cls2;
        this.f2994e = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        AbstractC0223g.m418e(methodHookParam, "param");
        if (this.f2990a) {
            boolean z2 = AbstractC1126i.f3786a;
            if (C1124g.m2417H() || !C1124g.m2410A()) {
                return;
            }
            Object[] objArr = methodHookParam.args;
            AbstractC0223g.m417d(objArr, "args");
            int length = objArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (obj instanceof ContextMenu) {
                    break;
                } else {
                    i2++;
                }
            }
            ContextMenu contextMenu = obj instanceof ContextMenu ? (ContextMenu) obj : null;
            if (contextMenu == null) {
                return;
            }
            AbstractC0731a.m1387d("self sns native menu create hit", methodHookParam.thisObject.getClass().getName());
            if (contextMenu.findItem(87352625) != null) {
                return;
            }
            C0881Y0 c0881y0 = this.f2991b;
            C0864P0 c0864p0M1775a = C0881Y0.m1775a(c0881y0, methodHookParam, this.f2992c, this.f2993d);
            if (c0864p0M1775a == null) {
                AbstractC0731a.m1387d("self sns native menu context unresolved", methodHookParam.thisObject.getClass().getName());
                return;
            }
            Map map = c0881y0.f3045i;
            AbstractC0223g.m417d(map, "access$getSelfSnsDetailMenuContexts$p(...)");
            map.put(c0864p0M1775a.f2972a, c0864p0M1775a);
            contextMenu.add(0, 87352625, 0, "隐藏此条朋友圈");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objValueOf;
        Object obj;
        C0881Y0 c0881y0;
        C0864P0 c0864p0M1775a;
        AbstractC0223g.m418e(methodHookParam, "param");
        if (this.f2990a) {
            return;
        }
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2417H() || !C1124g.m2410A()) {
            return;
        }
        Object[] objArr = methodHookParam.args;
        AbstractC0223g.m417d(objArr, "args");
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            objValueOf = null;
            if (i2 >= length) {
                obj = null;
                break;
            }
            obj = objArr[i2];
            if (obj instanceof MenuItem) {
                break;
            } else {
                i2++;
            }
        }
        MenuItem menuItem = obj instanceof MenuItem ? (MenuItem) obj : null;
        if (menuItem == null || menuItem.getItemId() != 87352625 || (c0864p0M1775a = C0881Y0.m1775a((c0881y0 = this.f2991b), methodHookParam, this.f2992c, this.f2993d)) == null) {
            return;
        }
        c0881y0.m1796M(c0864p0M1775a);
        Class<?> returnType = this.f2994e.getReturnType();
        AbstractC0223g.m417d(returnType, "getReturnType(...)");
        if (!returnType.equals(Void.TYPE)) {
            if (returnType.equals(Boolean.TYPE) || returnType.equals(Boolean.class)) {
                objValueOf = Boolean.FALSE;
            } else if (returnType.equals(Byte.TYPE) || returnType.equals(Byte.class)) {
                objValueOf = (byte) 0;
            } else if (returnType.equals(Short.TYPE) || returnType.equals(Short.class)) {
                objValueOf = (short) 0;
            } else if (returnType.equals(Integer.TYPE) || returnType.equals(Integer.class)) {
                objValueOf = 0;
            } else if (returnType.equals(Long.TYPE) || returnType.equals(Long.class)) {
                objValueOf = 0L;
            } else if (returnType.equals(Float.TYPE) || returnType.equals(Float.class)) {
                objValueOf = Float.valueOf(0.0f);
            } else if (returnType.equals(Double.TYPE) || returnType.equals(Double.class)) {
                objValueOf = Double.valueOf(0.0d);
            } else if (returnType.equals(Character.TYPE) || returnType.equals(Character.class)) {
                objValueOf = (char) 0;
            }
        }
        methodHookParam.setResult(objValueOf);
    }
}
