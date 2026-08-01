package p092S0;

import java.util.ArrayList;
import java.util.List;
import p000A.C0038T0;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;
import p186k.AbstractC2427i;
import p186k.C2438t;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: S0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1269g implements CharSequence {

    /* JADX INFO: renamed from: d */
    public final List f4562d;

    /* JADX INFO: renamed from: e */
    public final String f4563e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4564f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4565g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0038T0 c0038t0 = AbstractC1250C.f4463a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r1.m4334a(r3.f4559c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1269g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f4562d = list;
        this.f4563e = str;
        int i5 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i6 = 0; i6 < size; i6++) {
                C1267e c1267e = (C1267e) list.get(i6);
                Object obj = c1267e.f4557a;
                if (obj instanceof C1252E) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c1267e);
                } else if (obj instanceof C1282t) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c1267e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f4564f = arrayList;
        this.f4565g = arrayList2;
        List listM2021b0 = arrayList2 != null ? AbstractC0973m.m2021b0(arrayList2, new C1268f(i5)) : null;
        if (listM2021b0 == null || listM2021b0.isEmpty()) {
            return;
        }
        int i7 = ((C1267e) AbstractC0973m.m2012S(listM2021b0)).f4559c;
        C2438t c2438t = AbstractC2427i.f7844a;
        int i8 = 1;
        C2438t c2438t2 = new C2438t(1);
        c2438t2.m4334a(i7);
        int size2 = listM2021b0.size();
        while (i8 < size2) {
            C1267e c1267e2 = (C1267e) listM2021b0.get(i8);
            while (true) {
                int i9 = c2438t2.f7878b;
                if (i9 == 0) {
                    break;
                }
                if (i9 == 0) {
                    AbstractC2477a.m4424e("IntList is empty.");
                    throw null;
                }
                int i10 = c2438t2.f7877a[i9 - 1];
                int i11 = c1267e2.f4558b;
                int i12 = c1267e2.f4559c;
                if (i11 >= i10) {
                    c2438t2.m4337d(i9 - 1);
                } else if (i12 > i10) {
                    AbstractC1732a.m3085a("Paragraph overlap not allowed, end " + i12 + " should be less than or equal to " + i10);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: subSequence(II)Ljava/lang/CharSequence; */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1269g subSequence(int i5, int i6) {
        ArrayList arrayList;
        if (!(i5 <= i6)) {
            AbstractC1732a.m3085a("start (" + i5 + ") should be less or equal to end (" + i6 + ')');
        }
        String str = this.f4563e;
        if (i5 == 0 && i6 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i5, i6);
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        C1269g c1269g = AbstractC1270h.f4566a;
        if (i5 > i6) {
            AbstractC1732a.m3085a("start (" + i5 + ") should be less than or equal to end (" + i6 + ')');
        }
        List list = this.f4562d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1267e c1267e = (C1267e) list.get(i7);
                int i8 = c1267e.f4558b;
                int i9 = c1267e.f4559c;
                if (AbstractC1270h.m2357b(i5, i6, i8, i9)) {
                    arrayList.add(new C1267e(c1267e.f4557a, Math.max(i5, c1267e.f4558b) - i5, Math.min(i6, i9) - i5, c1267e.f4560d));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new C1269g(arrayList, strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.f4563e.charAt(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1269g)) {
            return false;
        }
        C1269g c1269g = (C1269g) obj;
        return AbstractC1665j.m2981a(this.f4563e, c1269g.f4563e) && AbstractC1665j.m2981a(this.f4562d, c1269g.f4562d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f4563e.hashCode() * 31;
        List list = this.f4562d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4563e.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4563e;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:L2.u:0x0000: SGET  A[WRAPPED] (LINE:36) L2.u.d L2.u) A[MD:(java.lang.String, java.util.List):void (m)] (LINE:37) call: S0.g.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ C1269g(String str) {
        this(str, C0981u.f3047d);
    }

    public C1269g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
