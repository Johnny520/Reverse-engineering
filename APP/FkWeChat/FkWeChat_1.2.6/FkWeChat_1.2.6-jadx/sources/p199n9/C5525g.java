package p199n9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5114x;
import p199n9.AbstractC5524f;
import p213oa.C5692c;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: n9.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5525g {

    /* JADX INFO: renamed from: c */
    public static final a f17278c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final C5525g f17279d = new C5525g(AbstractC5114x.m20803r(AbstractC5524f.a.f17274f, AbstractC5524f.d.f17277f, AbstractC5524f.b.f17275f, AbstractC5524f.c.f17276f));

    /* JADX INFO: renamed from: a */
    public final List f17280a;

    /* JADX INFO: renamed from: b */
    public final Map f17281b;

    /* JADX INFO: renamed from: n9.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final AbstractC5524f f17282a;

        /* JADX INFO: renamed from: b */
        public final int f17283b;

        public b(AbstractC5524f abstractC5524f, int i10) {
            abstractC5524f.getClass();
            this.f17282a = abstractC5524f;
            this.f17283b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC5524f m22521a() {
            return this.f17282a;
        }

        /* JADX INFO: renamed from: b */
        public final int m22522b() {
            return this.f17283b;
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC5524f m22523c() {
            return this.f17282a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1061t.m3842c(this.f17282a, bVar.f17282a) && this.f17283b == bVar.f17283b;
        }

        public int hashCode() {
            return (this.f17282a.hashCode() * 31) + Integer.hashCode(this.f17283b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f17282a + ", arity=" + this.f17283b + ')';
        }
    }

    public C5525g(List list) {
        list.getClass();
        this.f17280a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C5692c c5692cM22514b = ((AbstractC5524f) obj).m22514b();
            Object arrayList = linkedHashMap.get(c5692cM22514b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c5692cM22514b, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f17281b = linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5524f m22517b(C5692c c5692c, String str) {
        c5692c.getClass();
        str.getClass();
        b bVarM22518c = m22518c(c5692c, str);
        if (bVarM22518c != null) {
            return bVarM22518c.m22523c();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final b m22518c(C5692c c5692c, String str) {
        Integer numM22519d;
        c5692c.getClass();
        str.getClass();
        List<AbstractC5524f> list = (List) this.f17281b.get(c5692c);
        if (list == null) {
            return null;
        }
        for (AbstractC5524f abstractC5524f : list) {
            if (AbstractC8611a0.m33075T(str, abstractC5524f.m22513a(), false, 2, null) && (numM22519d = m22519d(str.substring(abstractC5524f.m22513a().length()))) != null) {
                return new b(abstractC5524f, numM22519d.intValue());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m22519d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + iCharAt;
        }
        return Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: n9.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5525g m22520a() {
            return C5525g.f17279d;
        }

        public a() {
        }
    }
}
