package p366ya;

import android.app.Activity;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p068eh.AbstractC0921a;
import p099h.Hchat.utils.KavaReflector;
import p258r8.AbstractC3736a;
import p258r8.C3742g;
import p258r8.C3744i;
import p274s8.C3944d;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.C5513yo;
import p365y9.C6006b;

/* JADX INFO: renamed from: ya.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6018h extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "quick_mark_read";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("quick_mark_read", "快捷已读", "拖拽未读角标或加号菜单一键已读", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        Object c3959f;
        Method methodFindDeclaredMethod;
        c3742g.getClass();
        AbstractC6019i.m10780a(c3742g);
        ClassLoader classLoader = c3742g.f12145c;
        C6017g c6017g = new C6017g(classLoader, new C6006b(2, this, AbstractC0921a.m2246i(C6018h.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 1));
        if (c6017g.f24446b) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.LauncherUI", classLoader); clsLoadClass != null && Activity.class.isAssignableFrom(clsLoadClass); clsLoadClass = clsLoadClass.getSuperclass()) {
            Method methodFindDeclaredMethod2 = KavaReflector.findDeclaredMethod(clsLoadClass, "dispatchTouchEvent", MotionEvent.class);
            if (methodFindDeclaredMethod2 != null) {
                linkedHashSet.add(methodFindDeclaredMethod2);
            }
            if (clsLoadClass.equals(Activity.class)) {
                break;
            }
        }
        if (linkedHashSet.isEmpty() && (methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(Activity.class, "dispatchTouchEvent", MotionEvent.class)) != null) {
            linkedHashSet.add(methodFindDeclaredMethod);
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        C5513yo c5513yo = new C5513yo(c6017g, 3);
        Iterator it = linkedHashSet.iterator();
        Throwable th2 = null;
        int i9 = 0;
        while (it.hasNext()) {
            try {
                C3744i.f12154b.m7763b((Method) it.next(), c5513yo);
                int i10 = i9 + 1;
                try {
                    c3959f = Integer.valueOf(i9);
                    i9 = i10;
                } catch (Throwable th3) {
                    th = th3;
                    i9 = i10;
                    c3959f = new C3959f(th);
                }
            } catch (Throwable th4) {
                th = th4;
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                th2 = thM8182b;
            }
        }
        c6017g.f24446b = i9 > 0;
        if (c6017g.f24446b) {
            return;
        }
        c6017g.f24445a.invoke("快捷已读拖拽Hook安装失败", th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "快捷已读";
    }
}
