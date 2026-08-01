package p299ub;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p080f9.C2363j;
import p185m8.AbstractC5066b;
import p185m8.AbstractC5078f;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p299ub.C8628j;
import p299ub.InterfaceC8626i;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: ub.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8628j implements InterfaceC8626i {

    /* JADX INFO: renamed from: a */
    public final Matcher f28692a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f28693b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8624h f28694c;

    /* JADX INFO: renamed from: d */
    public List f28695d;

    /* JADX INFO: renamed from: ub.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5078f {
        public a() {
        }

        @Override // p185m8.AbstractC5066b
        /* JADX INFO: renamed from: c */
        public int mo31c() {
            return C8628j.this.m33201f().groupCount() + 1;
        }

        @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return m33202e((String) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public /* bridge */ boolean m33202e(String str) {
            return super.contains(str);
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return m33204o((String) obj);
            }
            return -1;
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = C8628j.this.m33201f().group(i10);
            return strGroup == null ? _UrlKt.FRAGMENT_ENCODE_SET : strGroup;
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m33205p((String) obj);
            }
            return -1;
        }

        /* JADX INFO: renamed from: o */
        public /* bridge */ int m33204o(String str) {
            return super.indexOf(str);
        }

        /* JADX INFO: renamed from: p */
        public /* bridge */ int m33205p(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* JADX INFO: renamed from: ub.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5066b implements InterfaceC8624h {
        public b() {
        }

        /* JADX INFO: renamed from: e */
        public static C8622g m33206e(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // p185m8.AbstractC5066b
        /* JADX INFO: renamed from: c */
        public int mo31c() {
            return C8628j.this.m33201f().groupCount() + 1;
        }

        @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C8622g) {
                return m33207l((C8622g) obj);
            }
            return false;
        }

        @Override // p299ub.InterfaceC8624h
        public C8622g get(int i10) {
            C2363j c2363jM33231h = AbstractC8633o.m33231h(C8628j.this.m33201f(), i10);
            if (c2363jM33231h.m8568v().intValue() < 0) {
                return null;
            }
            String strGroup = C8628j.this.m33201f().group(i10);
            strGroup.getClass();
            return new C8622g(strGroup, c2363jM33231h);
        }

        @Override // p185m8.AbstractC5066b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC7294t.m28901I(AbstractC5081g0.m20555Y(AbstractC5114x.m20801p(this)), new InterfaceC0184l() { // from class: ub.k
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C8628j.b.m33206e(this.f28698q, ((Integer) obj).intValue());
                }
            }).iterator();
        }

        /* JADX INFO: renamed from: l */
        public /* bridge */ boolean m33207l(C8622g c8622g) {
            return super.contains(c8622g);
        }
    }

    public C8628j(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.f28692a = matcher;
        this.f28693b = charSequence;
        this.f28694c = new b();
    }

    @Override // p299ub.InterfaceC8626i
    /* JADX INFO: renamed from: a */
    public /* bridge */ InterfaceC8626i.b mo33181a() {
        return InterfaceC8626i.a.m33185a(this);
    }

    @Override // p299ub.InterfaceC8626i
    /* JADX INFO: renamed from: b */
    public List mo33182b() {
        if (this.f28695d == null) {
            this.f28695d = new a();
        }
        List list = this.f28695d;
        list.getClass();
        return list;
    }

    @Override // p299ub.InterfaceC8626i
    /* JADX INFO: renamed from: c */
    public InterfaceC8624h mo33183c() {
        return this.f28694c;
    }

    @Override // p299ub.InterfaceC8626i
    /* JADX INFO: renamed from: d */
    public C2363j mo33184d() {
        return AbstractC8633o.m33230g(m33201f());
    }

    /* JADX INFO: renamed from: f */
    public final MatchResult m33201f() {
        return this.f28692a;
    }

    @Override // p299ub.InterfaceC8626i
    public String getValue() {
        String strGroup = m33201f().group();
        strGroup.getClass();
        return strGroup;
    }

    @Override // p299ub.InterfaceC8626i
    public InterfaceC8626i next() {
        int iEnd = m33201f().end() + (m33201f().end() == m33201f().start() ? 1 : 0);
        if (iEnd > this.f28693b.length()) {
            return null;
        }
        Matcher matcher = this.f28692a.pattern().matcher(this.f28693b);
        matcher.getClass();
        return AbstractC8633o.m33228e(matcher, iEnd, this.f28693b);
    }
}
