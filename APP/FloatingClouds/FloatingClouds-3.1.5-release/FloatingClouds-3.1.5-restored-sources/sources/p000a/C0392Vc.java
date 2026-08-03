package p000a;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;
import p000a.C0251Ne;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.Vc */
/* JADX INFO: loaded from: classes.dex */
public final class C0392Vc implements InterfaceC0269Oe {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    @Override // p000a.InterfaceC0269Oe
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0251Ne.a mo750a(Activity activity, View view, Class<?> cls) {
        Object objM2206a;
        Integer num;
        C0251Ne.a aVar = C0251Ne.a.f861c;
        if (cls == null || !cls.isInstance(activity)) {
            return aVar;
        }
        try {
            Method methodM15d = C0002A1.m15d(cls, "getCurrentTabIndex", new Object[0]);
            C0251Ne.a aVar2 = C0251Ne.a.f860b;
            C0251Ne.a aVar3 = C0251Ne.a.f859a;
            if (methodM15d != null) {
                Object objInvoke = methodM15d.invoke(null, null);
                num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
                objM2206a = (num != null && num.intValue() == 0) ? aVar3 : (num == null || num.intValue() <= 0) ? aVar : aVar2;
            } else if (C0002A1.m15d(cls, "getCurrentTab", new Object[0]) != null) {
                Object objM12a = C0002A1.m12a(activity, "getCurrentTab", new Object[0]);
                num = objM12a instanceof Integer ? (Integer) objM12a : null;
                if (num != null && num.intValue() == 0) {
                }
                if (num != null) {
                    objM2206a = aVar2;
                    if (num.intValue() <= 0) {
                    }
                }
            }
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Object obj = aVar;
        if (!(objM2206a instanceof C0901wd.a)) {
            obj = objM2206a;
        }
        return (C0251Ne.a) obj;
    }

    @Override // p000a.InterfaceC0269Oe
    /* JADX INFO: renamed from: b */
    public final String mo751b() {
        return "reflection";
    }
}
