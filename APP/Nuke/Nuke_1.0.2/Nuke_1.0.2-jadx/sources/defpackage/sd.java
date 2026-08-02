package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sd implements CharSequence {
    public final List h;
    public final String i;
    public final ArrayList j;
    public final ArrayList k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        dq1 dq1Var = bd2.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r0.a(r2.c);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sd(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.h = list;
        this.i = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                rd rdVar = (rd) list.get(i);
                Object obj = rdVar.a;
                if (obj instanceof lt2) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(rdVar);
                } else if (obj instanceof vw1) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(rdVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.j = arrayList;
        this.k = arrayList2;
        List listA0 = arrayList2 != null ? du.A0(arrayList2, new sl0(5)) : null;
        if (listA0 == null || listA0.isEmpty()) {
            return;
        }
        int i2 = ((rd) du.o0(listA0)).c;
        yj1 yj1Var = w01.a;
        int i3 = 1;
        yj1 yj1Var2 = new yj1(1);
        yj1Var2.a(i2);
        int size2 = listA0.size();
        while (i3 < size2) {
            rd rdVar2 = (rd) listA0.get(i3);
            while (true) {
                int i4 = yj1Var2.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    um2.i("IntList is empty.");
                    throw null;
                }
                int i5 = yj1Var2.a[i4 - 1];
                int i6 = rdVar2.b;
                int i7 = rdVar2.c;
                if (i6 >= i5) {
                    yj1Var2.d(i4 - 1);
                } else if (i7 > i5) {
                    lz0.a("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: subSequence(II)Ljava/lang/CharSequence; */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sd subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            lz0.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.i;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        sd sdVar = td.a;
        if (i > i2) {
            lz0.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.h;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                rd rdVar = (rd) list.get(i3);
                int i4 = rdVar.b;
                int i5 = rdVar.c;
                if (td.b(i, i2, i4, i5)) {
                    arrayList.add(new rd(Math.max(i, rdVar.b) - i, Math.min(i2, i5) - i, rdVar.a, rdVar.d));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new sd(arrayList, strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.i.charAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj;
        return t11.l(this.i, sdVar.i) && t11.l(this.h, sdVar.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        List list = this.h;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.i.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return this.i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:be0:0x0000: SGET  A[WRAPPED] (LINE:188) be0.h be0) A[MD:(java.lang.String, java.util.List):void (m)] (LINE:189) call: sd.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ sd(String str) {
        this(str, be0.h);
    }

    public sd(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
