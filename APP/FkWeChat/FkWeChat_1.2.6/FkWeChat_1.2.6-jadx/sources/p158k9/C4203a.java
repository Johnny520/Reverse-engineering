package p158k9;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1043k;
import p158k9.InterfaceC4210h;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;
import p215oc.C5706c;
import p215oc.C5725t;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p313v9.AbstractC8865f;

/* JADX INFO: renamed from: k9.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4203a implements InterfaceC4210h {

    /* JADX INFO: renamed from: a */
    public final Class f12336a;

    /* JADX INFO: renamed from: b */
    public final List f12337b;

    /* JADX INFO: renamed from: c */
    public final a f12338c;

    /* JADX INFO: renamed from: d */
    public final List f12339d;

    /* JADX INFO: renamed from: e */
    public final List f12340e;

    /* JADX INFO: renamed from: f */
    public final List f12341f;

    /* JADX INFO: renamed from: g */
    public final List f12342g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: k9.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f12343q = new a("CALL_BY_NAME", 0);

        /* JADX INFO: renamed from: r */
        public static final a f12344r = new a("POSITIONAL_CALL", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ a[] f12345s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f12346t;

        static {
            a[] aVarArrM16644a = m16644a();
            f12345s = aVarArrM16644a;
            f12346t = AbstractC7198b.m28437a(aVarArrM16644a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m16644a() {
            return new a[]{f12343q, f12344r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f12345s.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: k9.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: q */
        public static final b f12347q = new b("JAVA", 0);

        /* JADX INFO: renamed from: r */
        public static final b f12348r = new b("KOTLIN", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ b[] f12349s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f12350t;

        static {
            b[] bVarArrM16645a = m16645a();
            f12349s = bVarArrM16645a;
            f12350t = AbstractC7198b.m28437a(bVarArrM16645a);
        }

        public b(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ b[] m16645a() {
            return new b[]{f12347q, f12348r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f12349s.clone();
        }
    }

    public C4203a(Class cls, List list, a aVar, b bVar, List list2) {
        cls.getClass();
        list.getClass();
        aVar.getClass();
        bVar.getClass();
        list2.getClass();
        this.f12336a = cls;
        this.f12337b = list;
        this.f12338c = aVar;
        this.f12339d = list2;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f12340e = arrayList;
        List list3 = this.f12339d;
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> clsM34035k = AbstractC8865f.m34035k(returnType);
            if (clsM34035k != null) {
                returnType = clsM34035k;
            }
            arrayList2.add(returnType);
        }
        this.f12341f = arrayList2;
        List list4 = this.f12339d;
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f12342g = arrayList3;
        if (this.f12338c == a.f12344r && bVar == b.f12347q && !AbstractC5081g0.m20530B0(this.f12337b, "value").isEmpty()) {
            C5725t.m23179a("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: a */
    public List mo16637a() {
        return this.f12340e;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Member mo16638b() {
        return (Member) m16641e();
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: c */
    public boolean mo16639c() {
        return InterfaceC4210h.a.m16664b(this);
    }

    /* JADX INFO: renamed from: d */
    public void m16640d(Object[] objArr) {
        InterfaceC4210h.a.m16663a(this, objArr);
    }

    /* JADX INFO: renamed from: e */
    public Void m16641e() {
        return null;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: f */
    public Type mo16642f() {
        return this.f12336a;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: o */
    public Object mo16643o(Object[] objArr) {
        objArr.getClass();
        m16640d(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            int i12 = i11 + 1;
            Object objM16662q = (obj == null && this.f12338c == a.f12343q) ? this.f12342g.get(i11) : AbstractC4208f.m16662q(obj, (Class) this.f12341f.get(i11));
            if (objM16662q == null) {
                AbstractC4208f.m16661p(i11, (String) this.f12337b.get(i11), (Class) this.f12341f.get(i11));
                C5706c.m23089a();
                return null;
            }
            arrayList.add(objM16662q);
            i10++;
            i11 = i12;
        }
        return AbstractC4208f.m16652g(this.f12336a, AbstractC5109u0.m20778s(AbstractC5081g0.m20574h1(this.f12337b, arrayList)), this.f12339d);
    }

    public /* synthetic */ C4203a(Class cls, List list, a aVar, b bVar, List list2, int i10, AbstractC1043k abstractC1043k) {
        if ((i10 & 16) != 0) {
            list2 = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), null));
            }
        }
        this(cls, list, aVar, bVar, list2);
    }
}
