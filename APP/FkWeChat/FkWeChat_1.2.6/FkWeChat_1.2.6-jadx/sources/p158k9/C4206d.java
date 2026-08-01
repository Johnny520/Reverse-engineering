package p158k9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import p172l8.InterfaceC4705l;

/* JADX INFO: renamed from: k9.d */
/* JADX INFO: loaded from: classes2.dex */
public class C4206d implements InvocationHandler {

    /* JADX INFO: renamed from: q */
    public final Class f12354q;

    /* JADX INFO: renamed from: r */
    public final Map f12355r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC4705l f12356s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC4705l f12357t;

    /* JADX INFO: renamed from: u */
    public final List f12358u;

    public C4206d(Class cls, Map map, InterfaceC4705l interfaceC4705l, InterfaceC4705l interfaceC4705l2, List list) {
        this.f12354q = cls;
        this.f12355r = map;
        this.f12356s = interfaceC4705l;
        this.f12357t = interfaceC4705l2;
        this.f12358u = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return AbstractC4208f.m16660o(this.f12354q, this.f12355r, this.f12356s, this.f12357t, this.f12358u, obj, method, objArr);
    }
}
