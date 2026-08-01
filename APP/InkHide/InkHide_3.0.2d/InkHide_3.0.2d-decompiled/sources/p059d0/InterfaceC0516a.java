package p059d0;

import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: d0.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0516a {
    /* JADX INFO: renamed from: a */
    Method mo1010a(String str, ClassLoader classLoader, String str2, Object... objArr);

    /* JADX INFO: renamed from: b */
    Method mo1011b(Class cls, String str, Object... objArr);

    /* JADX INFO: renamed from: c */
    Object mo1012c(Object obj, String str, Object... objArr);

    /* JADX INFO: renamed from: e */
    XC_MethodHook.Unhook mo1014e(Member member, XC_MethodHook xC_MethodHook);

    /* JADX INFO: renamed from: f */
    Object mo1015f(Object obj, String str);

    /* JADX INFO: renamed from: g */
    Method[] mo1016g(Class cls, Class cls2, Class... clsArr);

    /* JADX INFO: renamed from: h */
    XC_MethodHook.Unhook mo1017h(Class cls, String str, Object... objArr);

    /* JADX INFO: renamed from: j */
    void mo1019j(String str);

    /* JADX INFO: renamed from: k */
    Field mo1020k(Class cls, Class cls2);

    /* JADX INFO: renamed from: l */
    Class mo1021l(ClassLoader classLoader, String str);

    /* JADX INFO: renamed from: m */
    void mo1022m(Object obj, Object obj2, String str);

    /* JADX INFO: renamed from: n */
    XC_MethodHook.Unhook mo1023n(String str, ClassLoader classLoader, String str2, Object... objArr);
}
