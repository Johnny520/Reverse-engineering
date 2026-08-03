package p119i2;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import p069f.AbstractC0940j;
import p069f.C0964v;
import p136j8.C2104o;
import p204o2.AbstractC3042a;
import p227p4.C3315t;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: i2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1926g implements CharSequence {

    /* JADX INFO: renamed from: g */
    public final List f6528g;

    /* JADX INFO: renamed from: h */
    public final String f6529h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f6530i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f6531j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C3315t c3315t = AbstractC1921d0.f6477a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r1.m2369a(r3.f6505c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1926g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f6528g = list;
        this.f6529h = str;
        int i9 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                C1922e c1922e = (C1922e) list.get(i10);
                Object obj = c1922e.f6503a;
                if (obj instanceof C1925f0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c1922e);
                } else if (obj instanceof C1950u) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c1922e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f6530i = arrayList;
        this.f6531j = arrayList2;
        List listM8402K1 = arrayList2 != null ? AbstractC4166m.m8402K1(arrayList2, new C1924f(i9)) : null;
        if (listM8402K1 == null || listM8402K1.isEmpty()) {
            return;
        }
        int i11 = ((C1922e) AbstractC4166m.m8422t1(listM8402K1)).f6505c;
        C0964v c0964v = AbstractC0940j.f2960a;
        int i12 = 1;
        C0964v c0964v2 = new C0964v(1);
        c0964v2.m2369a(i11);
        int size2 = listM8402K1.size();
        while (i12 < size2) {
            C1922e c1922e2 = (C1922e) listM8402K1.get(i12);
            while (true) {
                int i13 = c0964v2.f3036b;
                if (i13 == 0) {
                    break;
                }
                if (i13 == 0) {
                    C2104o.m5287l("IntList is empty.");
                    throw null;
                }
                int i14 = c0964v2.f3035a[i13 - 1];
                int i15 = c1922e2.f6504b;
                int i16 = c1922e2.f6505c;
                if (i15 >= i14) {
                    c0964v2.m2372d(i13 - 1);
                } else if (i16 > i14) {
                    AbstractC3042a.m6486a("Paragraph overlap not allowed, end " + i16 + " should be less than or equal to " + i14);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final List m4794a(int i9) {
        List list = this.f6528g;
        if (list == null) {
            return C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            C1922e c1922e = (C1922e) obj;
            if ((c1922e.f6503a instanceof AbstractC1938m) && AbstractC1928h.m4798b(0, i9, c1922e.f6504b, c1922e.f6505c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: subSequence(II)Ljava/lang/CharSequence; */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1926g subSequence(int i9, int i10) {
        ArrayList arrayList;
        if (!(i9 <= i10)) {
            AbstractC3042a.m6486a("start (" + i9 + ") should be less or equal to end (" + i10 + ')');
        }
        String str = this.f6529h;
        if (i9 == 0 && i10 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i9, i10);
        C1926g c1926g = AbstractC1928h.f6536a;
        if (i9 > i10) {
            AbstractC3042a.m6486a("start (" + i9 + ") should be less than or equal to end (" + i10 + ')');
        }
        List list = this.f6528g;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                C1922e c1922e = (C1922e) list.get(i11);
                int i12 = c1922e.f6504b;
                int i13 = c1922e.f6505c;
                if (AbstractC1928h.m4798b(i9, i10, i12, i13)) {
                    arrayList.add(new C1922e(c1922e.f6506d, Math.max(i9, c1922e.f6504b) - i9, Math.min(i10, i13) - i9, c1922e.f6503a));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new C1926g(arrayList, strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        return this.f6529h.charAt(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1926g)) {
            return false;
        }
        C1926g c1926g = (C1926g) obj;
        return AbstractC1416l.m3825a(this.f6529h, c1926g.f6529h) && AbstractC1416l.m3825a(this.f6528g, c1926g.f6528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f6529h.hashCode() * 31;
        List list = this.f6528g;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6529h.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6529h;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:tf.t:0x0000: SGET  A[WRAPPED] (LINE:188) tf.t.g tf.t) A[MD:(java.lang.String, java.util.List):void (m)] (LINE:189) call: i2.g.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ C1926g(String str) {
        this(str, C4173t.f13710g);
    }

    public C1926g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
