package p147jf;

import gf.C2792a;
import gf.C2794c;
import gf.EnumC2795d;
import gf.InterfaceC2796e;
import java.util.Iterator;
import java.util.List;
import p086ff.InterfaceC2436d;
import p086ff.InterfaceC2440h;

/* JADX INFO: renamed from: jf.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3859a implements InterfaceC3860b {

    /* JADX INFO: renamed from: c */
    public static String f11050c = "jf.a";

    /* JADX INFO: renamed from: a */
    public C2792a f11051a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2436d f11052b;

    /* JADX INFO: renamed from: jf.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11053a;

        static {
            int[] iArr = new int[EnumC2795d.values().length];
            f11053a = iArr;
            try {
                iArr[EnumC2795d.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11053a[EnumC2795d.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11053a[EnumC2795d.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11053a[EnumC2795d.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11053a[EnumC2795d.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C3859a(InterfaceC2436d interfaceC2436d, EnumC2795d enumC2795d) {
        this.f11052b = interfaceC2436d;
        this.f11051a = new C2792a(enumC2795d, interfaceC2436d);
    }

    @Override // p147jf.InterfaceC3860b
    /* JADX INFO: renamed from: a */
    public InterfaceC3860b mo15297a(InterfaceC2440h interfaceC2440h) {
        this.f11051a.m9953j(interfaceC2440h);
        return this;
    }

    @Override // p147jf.InterfaceC3860b
    /* JADX INFO: renamed from: b */
    public void mo15298b(String str) {
        this.f11051a.m9957n(str);
        m15302f(this.f11051a);
    }

    @Override // p147jf.InterfaceC3860b
    /* JADX INFO: renamed from: c */
    public InterfaceC3860b mo15299c(Throwable th) {
        this.f11051a.m9958o(th);
        return this;
    }

    @Override // p147jf.InterfaceC3860b
    /* JADX INFO: renamed from: d */
    public InterfaceC3860b mo15300d(Object obj) {
        this.f11051a.m9951h(obj);
        return this;
    }

    @Override // p147jf.InterfaceC3860b
    /* JADX INFO: renamed from: e */
    public InterfaceC3860b mo15301e(String str, Object obj) {
        this.f11051a.m9952i(str, obj);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m15302f(InterfaceC2796e interfaceC2796e) {
        if (interfaceC2796e.mo9946c() == null) {
            m15308l(f11050c);
        }
        m15303g(interfaceC2796e);
    }

    /* JADX INFO: renamed from: g */
    public final void m15303g(InterfaceC2796e interfaceC2796e) {
        Object[] objArrMo9947d = interfaceC2796e.mo9947d();
        int length = objArrMo9947d == null ? 0 : objArrMo9947d.length;
        Throwable thMo9950g = interfaceC2796e.mo9950g();
        Object[] objArr = new Object[(thMo9950g == null ? 0 : 1) + length];
        if (objArrMo9947d != null) {
            System.arraycopy(objArrMo9947d, 0, objArr, 0, length);
        }
        if (thMo9950g != null) {
            objArr[length] = thMo9950g;
        }
        String strM15306j = m15306j(interfaceC2796e);
        int i10 = a.f11053a[interfaceC2796e.mo9948e().ordinal()];
        if (i10 == 1) {
            this.f11052b.mo8828z(strM15306j, objArr);
            return;
        }
        if (i10 == 2) {
            this.f11052b.mo8821s(strM15306j, objArr);
            return;
        }
        if (i10 == 3) {
            this.f11052b.mo8798B(strM15306j, objArr);
        } else if (i10 == 4) {
            this.f11052b.mo8812j(strM15306j, objArr);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f11052b.mo8817o(strM15306j, objArr);
        }
    }

    /* JADX INFO: renamed from: h */
    public final StringBuilder m15304h(List list, StringBuilder sb2) {
        if (list != null && !list.isEmpty()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2794c c2794c = (C2794c) it.next();
                sb2.append(c2794c.f7287a);
                sb2.append('=');
                sb2.append(c2794c.f7288b);
                sb2.append(' ');
            }
        }
        return sb2;
    }

    /* JADX INFO: renamed from: i */
    public final StringBuilder m15305i(List list, StringBuilder sb2) {
        if (list != null && !list.isEmpty()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append((InterfaceC2440h) it.next());
                sb2.append(' ');
            }
        }
        return sb2;
    }

    /* JADX INFO: renamed from: j */
    public final String m15306j(InterfaceC2796e interfaceC2796e) {
        return m15307k(interfaceC2796e.mo9945b(), m15304h(interfaceC2796e.mo9944a(), m15305i(interfaceC2796e.mo9949f(), null)));
    }

    /* JADX INFO: renamed from: k */
    public final String m15307k(String str, StringBuilder sb2) {
        if (sb2 == null) {
            return str;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public void m15308l(String str) {
        this.f11051a.m9956m(str);
    }
}
