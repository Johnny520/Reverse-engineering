package p054c0;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.LinkedList;
import p059d0.InterfaceC0517b;
import p059d0.InterfaceC0518c;
import p086r0.C0934q1;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0511c implements InterfaceC0517b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static XC_MethodHook m1008o(XC_MethodHook xC_MethodHook) {
        if (!(xC_MethodHook instanceof XC_MethodReplacement)) {
            return new C0934q1(xC_MethodHook);
        }
        XC_MethodReplacement xC_MethodReplacement = (XC_MethodReplacement) xC_MethodHook;
        C0510b c0510b = new C0510b(xC_MethodReplacement.priority);
        c0510b.f1617a = xC_MethodReplacement;
        return c0510b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m1009p(Object... objArr) {
        int length = objArr.length - 1;
        Object obj = objArr[length];
        if (obj instanceof XC_MethodHook) {
            objArr[length] = m1008o((XC_MethodHook) obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: a */
    public final Method mo1010a(String str, ClassLoader classLoader, String str2, Object... objArr) {
        return XposedHelpers.findMethodExactIfExists(str, classLoader, str2, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: b */
    public final Method mo1011b(Class cls, String str, Object... objArr) {
        return XposedHelpers.findMethodExactIfExists(cls, str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: c */
    public final Object mo1012c(Object obj, String str, Object... objArr) {
        return XposedHelpers.callMethod(obj, str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0517b
    /* JADX INFO: renamed from: d */
    public final Method[] mo1013d(Class cls, InterfaceC0518c interfaceC0518c) {
        LinkedList linkedList = new LinkedList();
        if (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                if (interfaceC0518c.mo6a(method)) {
                    method.setAccessible(true);
                    linkedList.add(method);
                }
            }
        }
        return (Method[]) linkedList.toArray(new Method[linkedList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: e */
    public final XC_MethodHook.Unhook mo1014e(Member member, XC_MethodHook xC_MethodHook) {
        return XposedBridge.hookMethod(member, m1008o(xC_MethodHook));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: f */
    public final Object mo1015f(Object obj, String str) {
        return XposedHelpers.getObjectField(obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: g */
    public final Method[] mo1016g(Class cls, Class cls2, Class... clsArr) {
        return XposedHelpers.findMethodsByExactParameters(cls, cls2, clsArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: h */
    public final XC_MethodHook.Unhook mo1017h(Class cls, String str, Object... objArr) {
        m1009p(objArr);
        return XposedHelpers.findAndHookMethod(cls, str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0517b
    /* JADX INFO: renamed from: i */
    public final Field[] mo1018i(Class cls, InterfaceC0518c interfaceC0518c) {
        LinkedList linkedList = new LinkedList();
        for (Field field : cls.getDeclaredFields()) {
            if (interfaceC0518c.mo6a(field)) {
                field.setAccessible(true);
                linkedList.add(field);
            }
        }
        return (Field[]) linkedList.toArray(new Field[linkedList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: j */
    public final void mo1019j(String str) {
        XposedBridge.log(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: k */
    public final Field mo1020k(Class cls, Class cls2) {
        return XposedHelpers.findFirstFieldByExactType(cls, cls2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: l */
    public final Class mo1021l(ClassLoader classLoader, String str) {
        return XposedHelpers.findClassIfExists(str, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: m */
    public final void mo1022m(Object obj, Object obj2, String str) {
        XposedHelpers.setObjectField(obj, str, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0516a
    /* JADX INFO: renamed from: n */
    public final XC_MethodHook.Unhook mo1023n(String str, ClassLoader classLoader, String str2, Object... objArr) {
        m1009p(objArr);
        return XposedHelpers.findAndHookMethod(str, classLoader, str2, objArr);
    }
}
