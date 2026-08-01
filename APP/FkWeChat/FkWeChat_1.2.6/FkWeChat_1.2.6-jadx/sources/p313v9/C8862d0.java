package p313v9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import p081fa.InterfaceC2395w;
import p081fa.InterfaceC2396x;

/* JADX INFO: renamed from: v9.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8862d0 extends AbstractC8887y implements InterfaceC2395w {

    /* JADX INFO: renamed from: a */
    public final Object f29428a;

    public C8862d0(Object obj) {
        obj.getClass();
        this.f29428a = obj;
    }

    @Override // p313v9.AbstractC8887y
    /* JADX INFO: renamed from: V */
    public Member mo34023V() throws IllegalAccessException, InvocationTargetException {
        Method methodM34003c = C8855a.f29409a.m34003c(this.f29428a);
        if (methodM34003c != null) {
            return methodM34003c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // p081fa.InterfaceC2395w
    /* JADX INFO: renamed from: a */
    public boolean mo8650a() {
        return false;
    }

    @Override // p081fa.InterfaceC2395w
    public InterfaceC2396x getType() throws IllegalAccessException, InvocationTargetException {
        Class clsM34004d = C8855a.f29409a.m34004d(this.f29428a);
        if (clsM34004d != null) {
            return new C8881s(clsM34004d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
