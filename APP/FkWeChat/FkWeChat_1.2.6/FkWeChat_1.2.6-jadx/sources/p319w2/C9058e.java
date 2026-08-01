package p319w2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p030c3.AbstractC1314a;
import p102h1.InterfaceC2843x;
import p117i.AbstractC3073n;
import p117i.C3055g0;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p211o8.AbstractC5661b;

/* JADX INFO: renamed from: w2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9058e implements CharSequence {

    /* JADX INFO: renamed from: u */
    public static final c f31057u = new c(null);

    /* JADX INFO: renamed from: v */
    public static final InterfaceC2843x f31058v = AbstractC9136t2.m35479l0();

    /* JADX INFO: renamed from: q */
    public final List f31059q;

    /* JADX INFO: renamed from: r */
    public final String f31060r;

    /* JADX INFO: renamed from: s */
    public final List f31061s;

    /* JADX INFO: renamed from: t */
    public final List f31062t;

    /* JADX INFO: renamed from: w2.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
    }

    /* JADX INFO: renamed from: w2.e$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC5661b.m22869d(Integer.valueOf(((d) obj).m35193h()), Integer.valueOf(((d) obj2).m35193h()));
        }
    }

    public C9058e(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f31059q = list;
        this.f31060r = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) list.get(i10);
                if (dVar.m35192g() instanceof C9067f3) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(dVar);
                } else if (dVar.m35192g() instanceof C9044b0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(dVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f31061s = arrayList;
        this.f31062t = arrayList2;
        List listM20542N0 = arrayList2 != null ? AbstractC5081g0.m20542N0(arrayList2, new e()) : null;
        if (listM20542N0 == null || listM20542N0.isEmpty()) {
            return;
        }
        C3055g0 c3055g0M11434d = AbstractC3073n.m11434d(((d) AbstractC5081g0.m20576j0(listM20542N0)).m35191f());
        int size2 = listM20542N0.size();
        for (int i11 = 1; i11 < size2; i11++) {
            d dVar2 = (d) listM20542N0.get(i11);
            while (true) {
                if (c3055g0M11434d.f8151b == 0) {
                    break;
                }
                int iM11419h = c3055g0M11434d.m11419h();
                if (dVar2.m35193h() >= iM11419h) {
                    c3055g0M11434d.m11307n(c3055g0M11434d.f8151b - 1);
                } else if (!(dVar2.m35191f() <= iM11419h)) {
                    AbstractC1314a.m5291a("Paragraph overlap not allowed, end " + dVar2.m35191f() + " should be less than or equal to " + iM11419h);
                }
            }
            c3055g0M11434d.m11303j(dVar2.m35191f());
        }
    }

    /* JADX INFO: renamed from: a */
    public final C9058e m35146a(InterfaceC0184l interfaceC0184l) {
        b bVar = new b(this);
        bVar.m35173h(interfaceC0184l);
        return bVar.m35181p();
    }

    /* JADX INFO: renamed from: b */
    public char m35147b(int i10) {
        return this.f31060r.charAt(i10);
    }

    /* JADX INFO: renamed from: c */
    public final List m35148c() {
        return this.f31059q;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return m35147b(i10);
    }

    /* JADX INFO: renamed from: d */
    public int m35149d() {
        return this.f31060r.length();
    }

    /* JADX INFO: renamed from: e */
    public final List m35150e(int i10, int i11) {
        List listM20800o;
        List list = this.f31059q;
        if (list != null) {
            listM20800o = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                d dVar = (d) obj;
                if ((dVar.m35192g() instanceof AbstractC9083j) && AbstractC9068g.m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                    listM20800o.add(obj);
                }
            }
        } else {
            listM20800o = AbstractC5114x.m20800o();
        }
        listM20800o.getClass();
        return listM20800o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9058e)) {
            return false;
        }
        C9058e c9058e = (C9058e) obj;
        return AbstractC1061t.m3842c(this.f31060r, c9058e.f31060r) && AbstractC1061t.m3842c(this.f31059q, c9058e.f31059q);
    }

    /* JADX INFO: renamed from: f */
    public final List m35151f() {
        return this.f31062t;
    }

    /* JADX INFO: renamed from: g */
    public final List m35152g() {
        List list = this.f31061s;
        return list == null ? AbstractC5114x.m20800o() : list;
    }

    /* JADX INFO: renamed from: h */
    public final List m35153h() {
        return this.f31061s;
    }

    public int hashCode() {
        int iHashCode = this.f31060r.hashCode() * 31;
        List list = this.f31059q;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List m35154i(int i10, int i11) {
        List list = this.f31059q;
        if (list == null) {
            return AbstractC5114x.m20800o();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) list.get(i12);
            if ((dVar.m35192g() instanceof C9082i3) && AbstractC9068g.m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                arrayList.add(AbstractC9087j3.m35307a(dVar));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final List m35155j(String str, int i10, int i11) {
        List list = this.f31059q;
        if (list == null) {
            return AbstractC5114x.m20800o();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) list.get(i12);
            if ((dVar.m35192g() instanceof C9082i3) && AbstractC1061t.m3842c(str, dVar.m35194i()) && AbstractC9068g.m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                arrayList.add(AbstractC9087j3.m35307a(dVar));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final String m35156k() {
        return this.f31060r;
    }

    /* JADX INFO: renamed from: l */
    public final List m35157l(int i10, int i11) {
        List listM20800o;
        List list = this.f31059q;
        if (list != null) {
            listM20800o = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                d dVar = (d) obj;
                if ((dVar.m35192g() instanceof AbstractC9157x3) && AbstractC9068g.m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                    listM20800o.add(obj);
                }
            }
        } else {
            listM20800o = AbstractC5114x.m20800o();
        }
        listM20800o.getClass();
        return listM20800o;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return m35149d();
    }

    /* JADX INFO: renamed from: m */
    public final List m35158m(int i10, int i11) {
        List listM20800o;
        List list = this.f31059q;
        if (list != null) {
            listM20800o = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                d dVar = (d) obj;
                if ((dVar.m35192g() instanceof C9162y3) && AbstractC9068g.m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                    listM20800o.add(obj);
                }
            }
        } else {
            listM20800o = AbstractC5114x.m20800o();
        }
        listM20800o.getClass();
        return listM20800o;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m35159n(C9058e c9058e) {
        return AbstractC1061t.m3842c(this.f31059q, c9058e.f31059q);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m35160o(int i10, int i11) {
        List list = this.f31059q;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = (d) list.get(i12);
                if ((dVar.m35192g() instanceof AbstractC9083j) && AbstractC9068g.m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m35161p(String str, int i10, int i11) {
        List list = this.f31059q;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = (d) list.get(i12);
                if ((dVar.m35192g() instanceof C9082i3) && AbstractC1061t.m3842c(str, dVar.m35194i()) && AbstractC9068g.m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final C9058e m35162q(InterfaceC0184l interfaceC0184l) {
        b bVar = new b(this);
        bVar.m35175j(interfaceC0184l);
        return bVar.m35181p();
    }

    /* JADX INFO: renamed from: r */
    public final C9058e m35163r(C9058e c9058e) {
        b bVar = new b(this);
        bVar.m35171f(c9058e);
        return bVar.m35181p();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C9058e subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            AbstractC1314a.m5291a("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        if (i10 == 0 && i11 == this.f31060r.length()) {
            return this;
        }
        return new C9058e(AbstractC9068g.m35263g(this.f31059q, i10, i11), this.f31060r.substring(i10, i11));
    }

    /* JADX INFO: renamed from: t */
    public final C9058e m35165t(long j10) {
        return subSequence(C9137t3.m35521l(j10), C9137t3.m35520k(j10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f31060r;
    }

    /* JADX INFO: renamed from: w2.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements Appendable {

        /* JADX INFO: renamed from: q */
        public final StringBuilder f31063q;

        /* JADX INFO: renamed from: r */
        public final List f31064r;

        /* JADX INFO: renamed from: s */
        public final List f31065s;

        /* JADX INFO: renamed from: t */
        public final a f31066t;

        /* JADX INFO: renamed from: w2.e$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final b f31067a;

            /* JADX INFO: renamed from: b */
            public final List f31068b = new ArrayList();

            public a(b bVar) {
                this.f31067a = bVar;
            }
        }

        public b(int i10) {
            this.f31063q = new StringBuilder(i10);
            this.f31064r = new ArrayList();
            this.f31065s = new ArrayList();
            this.f31066t = new a(this);
        }

        /* JADX INFO: renamed from: a */
        public final void m35166a(C9067f3 c9067f3, int i10, int i11) {
            this.f31065s.add(new C10250b(c9067f3, i10, i11, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b append(char c10) {
            this.f31063q.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b append(CharSequence charSequence) {
            if (charSequence instanceof C9058e) {
                m35171f((C9058e) charSequence);
                return this;
            }
            this.f31063q.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b append(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof C9058e) {
                m35172g((C9058e) charSequence, i10, i11);
                return this;
            }
            this.f31063q.append(charSequence, i10, i11);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m35170e(String str) {
            this.f31063q.append(str);
        }

        /* JADX INFO: renamed from: f */
        public final void m35171f(C9058e c9058e) {
            int length = this.f31063q.length();
            this.f31063q.append(c9058e.m35156k());
            List listM35148c = c9058e.m35148c();
            if (listM35148c != null) {
                int size = listM35148c.size();
                for (int i10 = 0; i10 < size; i10++) {
                    d dVar = (d) listM35148c.get(i10);
                    this.f31065s.add(new C10250b(dVar.m35192g(), dVar.m35193h() + length, dVar.m35191f() + length, dVar.m35194i()));
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m35172g(C9058e c9058e, int i10, int i11) {
            int length = this.f31063q.length();
            this.f31063q.append((CharSequence) c9058e.m35156k(), i10, i11);
            List listM35265i = AbstractC9068g.m35265i(c9058e, i10, i11, null, 4, null);
            if (listM35265i != null) {
                int size = listM35265i.size();
                for (int i12 = 0; i12 < size; i12++) {
                    d dVar = (d) listM35265i.get(i12);
                    this.f31065s.add(new C10250b(dVar.m35192g(), dVar.m35193h() + length, dVar.m35191f() + length, dVar.m35194i()));
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m35173h(InterfaceC0184l interfaceC0184l) {
            List list = this.f31065s;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list2 = (List) interfaceC0184l.mo27m(C10250b.m35182c((C10250b) list.get(i10), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(C10250b.f31069e.m35185a((d) list2.get(i11)));
                }
                AbstractC5070c0.m20492E(arrayList, arrayList2);
            }
            this.f31065s.clear();
            this.f31065s.addAll(arrayList);
        }

        /* JADX INFO: renamed from: i */
        public final int m35174i() {
            return this.f31063q.length();
        }

        /* JADX INFO: renamed from: j */
        public final void m35175j(InterfaceC0184l interfaceC0184l) {
            int size = this.f31065s.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f31065s.set(i10, C10250b.f31069e.m35185a((d) interfaceC0184l.mo27m(C10250b.m35182c((C10250b) this.f31065s.get(i10), 0, 1, null))));
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m35176k() {
            if (this.f31064r.isEmpty()) {
                AbstractC1314a.m5293c("Nothing to pop.");
            }
            ((C10250b) this.f31064r.remove(r0.size() - 1)).m35183a(this.f31063q.length());
        }

        /* JADX INFO: renamed from: l */
        public final void m35177l(int i10) {
            if (!(i10 < this.f31064r.size())) {
                AbstractC1314a.m5293c(i10 + " should be less than " + this.f31064r.size());
            }
            while (this.f31064r.size() - 1 >= i10) {
                m35176k();
            }
        }

        /* JADX INFO: renamed from: m */
        public final int m35178m(AbstractC9083j abstractC9083j) {
            C10250b c10250b = new C10250b(abstractC9083j, this.f31063q.length(), 0, null, 12, null);
            this.f31064r.add(c10250b);
            this.f31065s.add(c10250b);
            return this.f31064r.size() - 1;
        }

        /* JADX INFO: renamed from: n */
        public final int m35179n(String str, String str2) {
            C10250b c10250b = new C10250b(C9082i3.m35297a(C9082i3.m35298b(str2)), this.f31063q.length(), 0, str, 4, null);
            this.f31064r.add(c10250b);
            this.f31065s.add(c10250b);
            return this.f31064r.size() - 1;
        }

        /* JADX INFO: renamed from: o */
        public final int m35180o(C9067f3 c9067f3) {
            C10250b c10250b = new C10250b(c9067f3, this.f31063q.length(), 0, null, 12, null);
            this.f31064r.add(c10250b);
            this.f31065s.add(c10250b);
            return this.f31064r.size() - 1;
        }

        /* JADX INFO: renamed from: p */
        public final C9058e m35181p() {
            String string = this.f31063q.toString();
            List list = this.f31065s;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((C10250b) list.get(i10)).m35184b(this.f31063q.length()));
            }
            return new C9058e(string, arrayList);
        }

        /* JADX INFO: renamed from: w2.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10250b {

            /* JADX INFO: renamed from: e */
            public static final a f31069e = new a(null);

            /* JADX INFO: renamed from: a */
            public final Object f31070a;

            /* JADX INFO: renamed from: b */
            public final int f31071b;

            /* JADX INFO: renamed from: c */
            public int f31072c;

            /* JADX INFO: renamed from: d */
            public final String f31073d;

            public /* synthetic */ C10250b(Object obj, int i10, int i11, String str, int i12, AbstractC1043k abstractC1043k) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str);
            }

            /* JADX INFO: renamed from: c */
            public static /* synthetic */ d m35182c(C10250b c10250b, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return c10250b.m35184b(i10);
            }

            /* JADX INFO: renamed from: a */
            public final void m35183a(int i10) {
                this.f31072c = i10;
            }

            /* JADX INFO: renamed from: b */
            public final d m35184b(int i10) {
                int i11 = this.f31072c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (!(i10 != Integer.MIN_VALUE)) {
                    AbstractC1314a.m5293c("Item.end should be set first");
                }
                return new d(this.f31070a, this.f31071b, i10, this.f31073d);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10250b)) {
                    return false;
                }
                C10250b c10250b = (C10250b) obj;
                return AbstractC1061t.m3842c(this.f31070a, c10250b.f31070a) && this.f31071b == c10250b.f31071b && this.f31072c == c10250b.f31072c && AbstractC1061t.m3842c(this.f31073d, c10250b.f31073d);
            }

            public int hashCode() {
                Object obj = this.f31070a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f31071b)) * 31) + Integer.hashCode(this.f31072c)) * 31) + this.f31073d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f31070a + ", start=" + this.f31071b + ", end=" + this.f31072c + ", tag=" + this.f31073d + ')';
            }

            /* JADX INFO: renamed from: w2.e$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class a {
                public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                    this();
                }

                /* JADX INFO: renamed from: a */
                public final C10250b m35185a(d dVar) {
                    return new C10250b(dVar.m35192g(), dVar.m35193h(), dVar.m35191f(), dVar.m35194i());
                }

                public a() {
                }
            }

            public C10250b(Object obj, int i10, int i11, String str) {
                this.f31070a = obj;
                this.f31071b = i10;
                this.f31072c = i11;
                this.f31073d = str;
            }
        }

        public /* synthetic */ b(int i10, int i11, AbstractC1043k abstractC1043k) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public b(C9058e c9058e) {
            this(0, 1, null);
            m35171f(c9058e);
        }
    }

    /* JADX INFO: renamed from: w2.e$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {
        public /* synthetic */ c(AbstractC1043k abstractC1043k) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: w2.e$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final Object f31074a;

        /* JADX INFO: renamed from: b */
        public final int f31075b;

        /* JADX INFO: renamed from: c */
        public final int f31076c;

        /* JADX INFO: renamed from: d */
        public final String f31077d;

        public d(Object obj, int i10, int i11, String str) {
            this.f31074a = obj;
            this.f31075b = i10;
            this.f31076c = i11;
            this.f31077d = str;
            if (i10 <= i11) {
                return;
            }
            AbstractC1314a.m5291a("Reversed range is not supported");
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ d m35186e(d dVar, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = dVar.f31074a;
            }
            if ((i12 & 2) != 0) {
                i10 = dVar.f31075b;
            }
            if ((i12 & 4) != 0) {
                i11 = dVar.f31076c;
            }
            if ((i12 & 8) != 0) {
                str = dVar.f31077d;
            }
            return dVar.m35190d(obj, i10, i11, str);
        }

        /* JADX INFO: renamed from: a */
        public final Object m35187a() {
            return this.f31074a;
        }

        /* JADX INFO: renamed from: b */
        public final int m35188b() {
            return this.f31075b;
        }

        /* JADX INFO: renamed from: c */
        public final int m35189c() {
            return this.f31076c;
        }

        /* JADX INFO: renamed from: d */
        public final d m35190d(Object obj, int i10, int i11, String str) {
            return new d(obj, i10, i11, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC1061t.m3842c(this.f31074a, dVar.f31074a) && this.f31075b == dVar.f31075b && this.f31076c == dVar.f31076c && AbstractC1061t.m3842c(this.f31077d, dVar.f31077d);
        }

        /* JADX INFO: renamed from: f */
        public final int m35191f() {
            return this.f31076c;
        }

        /* JADX INFO: renamed from: g */
        public final Object m35192g() {
            return this.f31074a;
        }

        /* JADX INFO: renamed from: h */
        public final int m35193h() {
            return this.f31075b;
        }

        public int hashCode() {
            Object obj = this.f31074a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f31075b)) * 31) + Integer.hashCode(this.f31076c)) * 31) + this.f31077d.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final String m35194i() {
            return this.f31077d;
        }

        public String toString() {
            return "Range(item=" + this.f31074a + ", start=" + this.f31075b + ", end=" + this.f31076c + ", tag=" + this.f31077d + ')';
        }

        public d(Object obj, int i10, int i11) {
            this(obj, i10, i11, _UrlKt.FRAGMENT_ENCODE_SET);
        }
    }

    public /* synthetic */ C9058e(String str, List list, List list2, int i10, AbstractC1043k abstractC1043k) {
        this(str, (i10 & 2) != 0 ? AbstractC5114x.m20800o() : list, (i10 & 4) != 0 ? AbstractC5114x.m20800o() : list2);
    }

    public C9058e(String str, List list, List list2) {
        this(AbstractC9068g.m35261e(list, list2), str);
    }

    public /* synthetic */ C9058e(String str, List list, int i10, AbstractC1043k abstractC1043k) {
        this(str, (i10 & 2) != 0 ? AbstractC5114x.m20800o() : list);
    }

    public C9058e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
