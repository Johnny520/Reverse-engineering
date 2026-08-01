package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: f8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0200f8 implements CharSequence {

    /* JADX INFO: renamed from: d */
    public final List f1624d;

    /* JADX INFO: renamed from: e */
    public final String f1625e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f1626f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f1627g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0111d c0111d = ux0.f6320a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r8.m4198a(r1.f1340c);
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0200f8(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f1624d = list;
        this.f1625e = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                C0163e8 c0163e8 = (C0163e8) list.get(i);
                Object obj = c0163e8.f1338a;
                if (obj instanceof j31) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0163e8);
                } else if (obj instanceof ap0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0163e8);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f1626f = arrayList;
        this.f1627g = arrayList2;
        List listM5250T = arrayList2 != null ? AbstractC0960ye.m5250T(arrayList2, new C0186ev(5)) : null;
        if (listM5250T == null || listM5250T.isEmpty()) {
            return;
        }
        int i2 = ((C0163e8) AbstractC0960ye.m5240J(listM5250T)).f1340c;
        tg0 tg0Var = t20.f5890a;
        int i3 = 1;
        tg0 tg0Var2 = new tg0(1);
        tg0Var2.m4198a(i2);
        int size2 = listM5250T.size();
        while (i3 < size2) {
            C0163e8 c0163e82 = (C0163e8) listM5250T.get(i3);
            while (true) {
                int i4 = tg0Var2.f6001b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                int i5 = tg0Var2.f6000a[i4 - 1];
                int i6 = c0163e82.f1339b;
                int i7 = c0163e82.f1340c;
                if (i6 >= i5) {
                    tg0Var2.m4200c(i4 - 1);
                } else if (i7 > i5) {
                    x10.m5082a("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1625e.charAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0200f8)) {
            return false;
        }
        C0200f8 c0200f8 = (C0200f8) obj;
        return p30.m3002l(this.f1625e, c0200f8.f1625e) && p30.m3002l(this.f1624d, c0200f8.f1624d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f1625e.hashCode() * 31;
        List list = this.f1624d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1625e.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            x10.m5082a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f1625e;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        int i3 = AbstractC0237g8.f1885a;
        if (i > i2) {
            x10.m5082a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.f1624d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0163e8 c0163e8 = (C0163e8) list.get(i4);
                int i5 = c0163e8.f1339b;
                int i6 = c0163e8.f1340c;
                if (AbstractC0237g8.m1232a(i, i2, i5, i6)) {
                    arrayList.add(new C0163e8(c0163e8.f1338a, Math.max(i, c0163e8.f1339b) - i, Math.min(i2, i6) - i, c0163e8.f1341d));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new C0200f8(arrayList, strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1625e;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:hs:0x0000: SGET  A[WRAPPED] (LINE:188) hs.d hs) A[MD:(java.lang.String, java.util.List):void (m)] (LINE:189) call: f8.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ C0200f8(String str) {
        this(str, C0294hs.f2354d);
    }

    public C0200f8(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
