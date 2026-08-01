package p254r5;

import bsh.C1259t2;
import p309v5.AbstractC8824f;

/* JADX INFO: renamed from: r5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6493d extends AbstractC6487a {

    /* JADX INFO: renamed from: q */
    public final a f20380q;

    /* JADX INFO: renamed from: r5.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC8824f implements Comparable {
        public a(int i10) {
            super(i10);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int size = size();
            int size2 = aVar.size();
            int i10 = size < size2 ? size : size2;
            for (int i11 = 0; i11 < i10; i11++) {
                int iCompareTo = ((AbstractC6487a) m33887w(i11)).compareTo((AbstractC6487a) aVar.m33887w(i11));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (size < size2) {
                return -1;
            }
            return size > size2 ? 1 : 0;
        }

        /* JADX INFO: renamed from: F */
        public void m25748F(int i10, AbstractC6487a abstractC6487a) {
            m33889y(i10, abstractC6487a);
        }

        public AbstractC6487a get(int i10) {
            return (AbstractC6487a) m33887w(i10);
        }
    }

    public C6493d(a aVar) {
        if (aVar == null) {
            C1259t2.m5095a("list == null");
            throw null;
        }
        aVar.m33930v();
        this.f20380q = aVar;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        return this.f20380q.compareTo(((C6493d) abstractC6487a).f20380q);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6493d) {
            return this.f20380q.equals(((C6493d) obj).f20380q);
        }
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f20380q.m33884B("{", ", ", "}");
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    public int hashCode() {
        return this.f20380q.hashCode();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "array";
    }

    /* JADX INFO: renamed from: k */
    public a m25746k() {
        return this.f20380q;
    }

    public String toString() {
        return this.f20380q.m33885C("array{", ", ", "}");
    }
}
