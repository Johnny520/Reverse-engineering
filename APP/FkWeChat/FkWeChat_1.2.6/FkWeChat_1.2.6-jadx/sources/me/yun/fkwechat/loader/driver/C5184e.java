package me.yun.fkwechat.loader.driver;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import md.InterfaceC5154i;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4713t;
import p172l8.C4712s;

/* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.e */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5184e implements InterfaceC5154i {

    /* JADX INFO: renamed from: a */
    public final Object f15809a;

    /* JADX INFO: renamed from: b */
    public final Object f15810b;

    /* JADX INFO: renamed from: c */
    public final Object[] f15811c;

    /* JADX INFO: renamed from: d */
    public final Object[] f15812d;

    /* JADX INFO: renamed from: e */
    public Object f15813e;

    /* JADX INFO: renamed from: f */
    public boolean f15814f;

    /* JADX INFO: renamed from: g */
    public Throwable f15815g;

    static {
        FkwLoader.registerNativesForClass(33, C5184e.class);
        Hidden0.special_clinit_33_110(C5184e.class);
    }

    public C5184e(Object obj) {
        Object objM18798b;
        Object objM18798b2;
        Method method;
        Object[] array;
        Method method2;
        obj.getClass();
        this.f15809a = obj;
        try {
            C4712s.a aVar = C4712s.f13928r;
            Method[] methods = obj.getClass().getMethods();
            methods.getClass();
            int length = methods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i10];
                if (AbstractC1061t.m3842c(method2.getName(), "getReceiver") || AbstractC1061t.m3842c(method2.getName(), "getThisObject")) {
                    break;
                } else {
                    i10++;
                }
            }
            objM18798b = C4712s.m18798b(method2 != null ? method2.invoke(this.f15809a, null) : null);
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        this.f15810b = C4712s.m18803g(objM18798b) ? null : objM18798b;
        try {
            Method[] methods2 = this.f15809a.getClass().getMethods();
            methods2.getClass();
            int length2 = methods2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    method = null;
                    break;
                }
                method = methods2[i11];
                if (AbstractC1061t.m3842c(method.getName(), "getArgs")) {
                    break;
                } else {
                    i11++;
                }
            }
            Object objInvoke = method != null ? method.invoke(this.f15809a, null) : null;
            if (objInvoke instanceof List) {
                array = ((Collection) objInvoke).toArray(new Object[0]);
            } else {
                Object[] objArr = objInvoke instanceof Object[] ? (Object[]) objInvoke : null;
                array = objArr == null ? new Object[0] : objArr;
            }
            objM18798b2 = C4712s.m18798b(array);
        } catch (Throwable th2) {
            C4712s.a aVar3 = C4712s.f13928r;
            objM18798b2 = C4712s.m18798b(AbstractC4713t.m18807a(th2));
        }
        this.f15811c = (Object[]) (C4712s.m18803g(objM18798b2) ? new Object[0] : objM18798b2);
        this.f15812d = (Object[]) getArgs().clone();
    }

    /* JADX INFO: renamed from: a */
    public native Throwable m21254a();

    @Override // md.InterfaceC5154i
    public native /* bridge */ Object arg(int i10);

    /* JADX INFO: renamed from: b */
    public final native boolean m21255b();

    /* JADX INFO: renamed from: c */
    public final native void m21256c(Object obj);

    /* JADX INFO: renamed from: d */
    public native void m21257d(Throwable th);

    @Override // md.InterfaceC5154i
    public native Object[] getArgs();

    @Override // md.InterfaceC5154i
    public native Object getResult();

    @Override // md.InterfaceC5154i
    public native Object getThisObject();

    @Override // md.InterfaceC5154i
    public native /* bridge */ void setArg(int i10, Object obj);

    @Override // md.InterfaceC5154i
    public native void setResult(Object obj);
}
