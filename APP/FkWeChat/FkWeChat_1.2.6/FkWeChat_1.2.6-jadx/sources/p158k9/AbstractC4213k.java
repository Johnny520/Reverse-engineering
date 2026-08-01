package p158k9;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p024b9.AbstractC1043k;
import p158k9.AbstractC4211i;
import p158k9.InterfaceC4210h;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: k9.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4213k implements InterfaceC4210h {

    /* JADX INFO: renamed from: a */
    public final Method f12375a;

    /* JADX INFO: renamed from: b */
    public final List f12376b;

    /* JADX INFO: renamed from: c */
    public final Type f12377c;

    /* JADX INFO: renamed from: k9.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC4213k implements InterfaceC4209g {

        /* JADX INFO: renamed from: d */
        public final Object f12378d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, AbstractC5114x.m20800o(), null);
            method.getClass();
            this.f12378d = obj;
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) {
            objArr.getClass();
            m16675e(objArr);
            return m16674d(this.f12378d, objArr);
        }
    }

    /* JADX INFO: renamed from: k9.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC4213k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, AbstractC5112w.m20789e(method.getDeclaringClass()), null);
            method.getClass();
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) {
            objArr.getClass();
            m16675e(objArr);
            Object obj = objArr[0];
            AbstractC4211i.d dVar = AbstractC4211i.f12360e;
            return m16674d(obj, objArr.length <= 1 ? new Object[0] : AbstractC5102r.m20668t(objArr, 1, objArr.length));
        }
    }

    public AbstractC4213k(Method method, List list) {
        this.f12375a = method;
        this.f12376b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.f12377c = returnType;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: a */
    public final List mo16637a() {
        return this.f12376b;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: c */
    public boolean mo16639c() {
        return InterfaceC4210h.a.m16664b(this);
    }

    /* JADX INFO: renamed from: d */
    public final Object m16674d(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.f12375a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: e */
    public void m16675e(Object[] objArr) {
        InterfaceC4210h.a.m16663a(this, objArr);
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: f */
    public final Type mo16642f() {
        return this.f12377c;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Method mo16638b() {
        return null;
    }

    public /* synthetic */ AbstractC4213k(Method method, List list, AbstractC1043k abstractC1043k) {
        this(method, list);
    }
}
