package qa;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p280t5.C8130u;
import p376zd.C9987e;
import qa.AbstractC6344a;
import qa.AbstractC6354k;
import qa.AbstractC6369z;
import qa.C6352i;
import qa.InterfaceC6360q;

/* JADX INFO: renamed from: qa.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6353j extends AbstractC6344a implements Serializable {

    /* JADX INFO: renamed from: qa.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20001a;

        static {
            int[] iArr = new int[AbstractC6369z.c.values().length];
            f20001a = iArr;
            try {
                iArr[AbstractC6369z.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20001a[AbstractC6369z.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: qa.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class b extends AbstractC6344a.a {

        /* JADX INFO: renamed from: q */
        public AbstractC6348e f20002q = AbstractC6348e.f19966q;

        /* JADX INFO: renamed from: i */
        public final AbstractC6348e m25225i() {
            return this.f20002q;
        }

        /* JADX INFO: renamed from: j */
        public abstract b mo14019j(AbstractC6353j abstractC6353j);

        /* JADX INFO: renamed from: k */
        public final b m25226k(AbstractC6348e abstractC6348e) {
            this.f20002q = abstractC6348e;
            return this;
        }
    }

    /* JADX INFO: renamed from: qa.j$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class c extends b implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public C6352i f20003r = C6352i.m25188g();

        /* JADX INFO: renamed from: s */
        public boolean f20004s;

        /* JADX INFO: renamed from: m */
        public final C6352i m25228m() {
            this.f20003r.m25207q();
            this.f20004s = false;
            return this.f20003r;
        }

        /* JADX INFO: renamed from: n */
        public final void m25229n() {
            if (this.f20004s) {
                return;
            }
            this.f20003r = this.f20003r.clone();
            this.f20004s = true;
        }

        /* JADX INFO: renamed from: o */
        public final void m25230o(d dVar) {
            m25229n();
            this.f20003r.m25208r(dVar.f20005r);
        }
    }

    /* JADX INFO: renamed from: qa.j$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e implements C6352i.b {

        /* JADX INFO: renamed from: q */
        public final AbstractC6354k.b f20010q;

        /* JADX INFO: renamed from: r */
        public final int f20011r;

        /* JADX INFO: renamed from: s */
        public final AbstractC6369z.b f20012s;

        /* JADX INFO: renamed from: t */
        public final boolean f20013t;

        /* JADX INFO: renamed from: u */
        public final boolean f20014u;

        public e(AbstractC6354k.b bVar, int i10, AbstractC6369z.b bVar2, boolean z10, boolean z11) {
            this.f20010q = bVar;
            this.f20011r = i10;
            this.f20012s = bVar2;
            this.f20013t = z10;
            this.f20014u = z11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f20011r - eVar.f20011r;
        }

        @Override // qa.C6352i.b
        /* JADX INFO: renamed from: b */
        public int mo25211b() {
            return this.f20011r;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC6354k.b m25242c() {
            return this.f20010q;
        }

        @Override // qa.C6352i.b
        /* JADX INFO: renamed from: d */
        public InterfaceC6360q.a mo25212d(InterfaceC6360q.a aVar, InterfaceC6360q interfaceC6360q) {
            return ((b) aVar).mo14019j((AbstractC6353j) interfaceC6360q);
        }

        @Override // qa.C6352i.b
        /* JADX INFO: renamed from: e */
        public boolean mo25213e() {
            return this.f20013t;
        }

        @Override // qa.C6352i.b
        /* JADX INFO: renamed from: f */
        public AbstractC6369z.b mo25214f() {
            return this.f20012s;
        }

        @Override // qa.C6352i.b
        /* JADX INFO: renamed from: o */
        public AbstractC6369z.c mo25215o() {
            return this.f20012s.m25336a();
        }

        @Override // qa.C6352i.b
        /* JADX INFO: renamed from: q */
        public boolean mo25216q() {
            return this.f20014u;
        }
    }

    /* JADX INFO: renamed from: qa.j$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6360q f20015a;

        /* JADX INFO: renamed from: b */
        public final Object f20016b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC6360q f20017c;

        /* JADX INFO: renamed from: d */
        public final e f20018d;

        /* JADX INFO: renamed from: e */
        public final Class f20019e;

        /* JADX INFO: renamed from: f */
        public final Method f20020f;

        public f(InterfaceC6360q interfaceC6360q, Object obj, InterfaceC6360q interfaceC6360q2, e eVar, Class cls) {
            if (interfaceC6360q == null) {
                C9987e.m38645a("Null containingTypeDefaultInstance");
                throw null;
            }
            if (eVar.mo25214f() == AbstractC6369z.b.f20074C && interfaceC6360q2 == null) {
                C9987e.m38645a("Null messageDefaultInstance");
                throw null;
            }
            this.f20015a = interfaceC6360q;
            this.f20016b = obj;
            this.f20017c = interfaceC6360q2;
            this.f20018d = eVar;
            this.f20019e = cls;
            if (AbstractC6354k.a.class.isAssignableFrom(cls)) {
                this.f20020f = AbstractC6353j.m25218k(cls, "valueOf", Integer.TYPE);
            } else {
                this.f20020f = null;
            }
        }

        /* JADX INFO: renamed from: a */
        public Object m25243a(Object obj) {
            if (!this.f20018d.mo25213e()) {
                return m25247e(obj);
            }
            if (this.f20018d.mo25215o() != AbstractC6369z.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m25247e(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC6360q m25244b() {
            return this.f20015a;
        }

        /* JADX INFO: renamed from: c */
        public InterfaceC6360q m25245c() {
            return this.f20017c;
        }

        /* JADX INFO: renamed from: d */
        public int m25246d() {
            return this.f20018d.mo25211b();
        }

        /* JADX INFO: renamed from: e */
        public Object m25247e(Object obj) {
            return this.f20018d.mo25215o() == AbstractC6369z.c.ENUM ? AbstractC6353j.m25219l(this.f20020f, null, (Integer) obj) : obj;
        }

        /* JADX INFO: renamed from: f */
        public Object m25248f(Object obj) {
            return this.f20018d.mo25215o() == AbstractC6369z.c.ENUM ? Integer.valueOf(((AbstractC6354k.a) obj).mo14092b()) : obj;
        }
    }

    public AbstractC6353j() {
    }

    /* JADX INFO: renamed from: k */
    public static Method m25218k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public static Object m25219l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            C8130u.m31512a("Couldn't use Java reflection to implement protocol message reflection.", e10);
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C8130u.m31512a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static f m25220n(InterfaceC6360q interfaceC6360q, InterfaceC6360q interfaceC6360q2, AbstractC6354k.b bVar, int i10, AbstractC6369z.b bVar2, boolean z10, Class cls) {
        return new f(interfaceC6360q, Collections.EMPTY_LIST, interfaceC6360q2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    /* JADX INFO: renamed from: o */
    public static f m25221o(InterfaceC6360q interfaceC6360q, Object obj, InterfaceC6360q interfaceC6360q2, AbstractC6354k.b bVar, int i10, AbstractC6369z.b bVar2, Class cls) {
        return new f(interfaceC6360q, obj, interfaceC6360q2, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m25222q(qa.C6352i r5, qa.InterfaceC6360q r6, qa.C6349f r7, qa.C6350g r8, qa.C6351h r9, int r10) throws qa.C6355l {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.AbstractC6353j.m25222q(qa.i, qa.q, qa.f, qa.g, qa.h, int):boolean");
    }

    /* JADX INFO: renamed from: p */
    public boolean mo25224p(C6349f c6349f, C6350g c6350g, C6351h c6351h, int i10) {
        return c6349f.m25076O(i10, c6350g);
    }

    public AbstractC6353j(b bVar) {
    }

    /* JADX INFO: renamed from: qa.j$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class d extends AbstractC6353j implements InterfaceC6361r {

        /* JADX INFO: renamed from: r */
        public final C6352i f20005r;

        public d() {
            this.f20005r = C6352i.m25190t();
        }

        @Override // qa.AbstractC6353j
        /* JADX INFO: renamed from: m */
        public void mo25223m() {
            this.f20005r.m25207q();
        }

        @Override // qa.AbstractC6353j
        /* JADX INFO: renamed from: p */
        public boolean mo25224p(C6349f c6349f, C6350g c6350g, C6351h c6351h, int i10) {
            return AbstractC6353j.m25222q(this.f20005r, mo14181b(), c6349f, c6350g, c6351h, i10);
        }

        /* JADX INFO: renamed from: s */
        public boolean m25232s() {
            return this.f20005r.m25204n();
        }

        /* JADX INFO: renamed from: t */
        public int m25233t() {
            return this.f20005r.m25202k();
        }

        /* JADX INFO: renamed from: u */
        public final Object m25234u(f fVar) {
            m25239z(fVar);
            Object objM25199h = this.f20005r.m25199h(fVar.f20018d);
            return objM25199h == null ? fVar.f20016b : fVar.m25243a(objM25199h);
        }

        /* JADX INFO: renamed from: v */
        public final Object m25235v(f fVar, int i10) {
            m25239z(fVar);
            return fVar.m25247e(this.f20005r.m25200i(fVar.f20018d, i10));
        }

        /* JADX INFO: renamed from: w */
        public final int m25236w(f fVar) {
            m25239z(fVar);
            return this.f20005r.m25201j(fVar.f20018d);
        }

        /* JADX INFO: renamed from: x */
        public final boolean m25237x(f fVar) {
            m25239z(fVar);
            return this.f20005r.m25203m(fVar.f20018d);
        }

        /* JADX INFO: renamed from: y */
        public a m25238y() {
            return new a(this, false, null);
        }

        /* JADX INFO: renamed from: z */
        public final void m25239z(f fVar) {
            if (fVar.m25244b() == mo14181b()) {
                return;
            }
            C9987e.m38645a("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public d(c cVar) {
            this.f20005r = cVar.m25228m();
        }

        /* JADX INFO: renamed from: qa.j$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a {

            /* JADX INFO: renamed from: a */
            public final Iterator f20006a;

            /* JADX INFO: renamed from: b */
            public Map.Entry f20007b;

            /* JADX INFO: renamed from: c */
            public final boolean f20008c;

            public a(boolean z10) {
                Iterator itM25206p = d.this.f20005r.m25206p();
                this.f20006a = itM25206p;
                if (itM25206p.hasNext()) {
                    this.f20007b = (Map.Entry) itM25206p.next();
                }
                this.f20008c = z10;
            }

            /* JADX INFO: renamed from: a */
            public void m25240a(int i10, C6350g c6350g) {
                while (true) {
                    Map.Entry entry = this.f20007b;
                    if (entry == null || ((e) entry.getKey()).mo25211b() >= i10) {
                        return;
                    }
                    e eVar = (e) this.f20007b.getKey();
                    if (this.f20008c && eVar.mo25215o() == AbstractC6369z.c.MESSAGE && !eVar.mo25213e()) {
                        c6350g.m25160e0(eVar.mo25211b(), (InterfaceC6360q) this.f20007b.getValue());
                    } else {
                        C6352i.m25195z(eVar, this.f20007b.getValue(), c6350g);
                    }
                    if (this.f20006a.hasNext()) {
                        this.f20007b = (Map.Entry) this.f20006a.next();
                    } else {
                        this.f20007b = null;
                    }
                }
            }

            public /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo25223m() {
    }
}
