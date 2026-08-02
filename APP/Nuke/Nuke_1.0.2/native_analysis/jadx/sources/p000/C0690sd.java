package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: sd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0690sd implements CharSequence {

    /* JADX INFO: renamed from: h */
    public final List f10050h;

    /* JADX INFO: renamed from: i */
    public final String f10051i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f10052j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f10053k;

    static {
        dq1 dq1Var = bd2.f792a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r0.m6281a(r2.f9516c);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0690sd(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f10050h = list;
        this.f10051i = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                C0652rd c0652rd = (C0652rd) list.get(i);
                Object obj = c0652rd.f9514a;
                if (obj instanceof lt2) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0652rd);
                } else if (obj instanceof vw1) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0652rd);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f10052j = arrayList;
        this.f10053k = arrayList2;
        List listM1143A0 = arrayList2 != null ? AbstractC0142du.m1143A0(arrayList2, new sl0(5)) : null;
        if (listM1143A0 == null || listM1143A0.isEmpty()) {
            return;
        }
        int i2 = ((C0652rd) AbstractC0142du.m1159o0(listM1143A0)).f9516c;
        yj1 yj1Var = w01.f12239a;
        int i3 = 1;
        yj1 yj1Var2 = new yj1(1);
        yj1Var2.m6281a(i2);
        int size2 = listM1143A0.size();
        while (i3 < size2) {
            C0652rd c0652rd2 = (C0652rd) listM1143A0.get(i3);
            while (true) {
                int i4 = yj1Var2.f13491b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    um2.m5519i("IntList is empty.");
                    throw null;
                }
                int i5 = yj1Var2.f13490a[i4 - 1];
                int i6 = c0652rd2.f9515b;
                int i7 = c0652rd2.f9516c;
                if (i6 >= i5) {
                    yj1Var2.m6284d(i4 - 1);
                } else if (i7 > i5) {
                    lz0.m2988a("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0690sd subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            lz0.m2988a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f10051i;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        C0690sd c0690sd = AbstractC0730td.f10680a;
        if (i > i2) {
            lz0.m2988a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.f10050h;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0652rd c0652rd = (C0652rd) list.get(i3);
                int i4 = c0652rd.f9515b;
                int i5 = c0652rd.f9516c;
                if (AbstractC0730td.m5163b(i, i2, i4, i5)) {
                    arrayList.add(new C0652rd(Math.max(i, c0652rd.f9515b) - i, Math.min(i2, i5) - i, c0652rd.f9514a, c0652rd.f9517d));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new C0690sd(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f10051i.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0690sd)) {
            return false;
        }
        C0690sd c0690sd = (C0690sd) obj;
        return t11.m5086l(this.f10051i, c0690sd.f10051i) && t11.m5086l(this.f10050h, c0690sd.f10050h);
    }

    public final int hashCode() {
        int iHashCode = this.f10051i.hashCode() * 31;
        List list = this.f10050h;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f10051i.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f10051i;
    }

    public /* synthetic */ C0690sd(String str) {
        this(str, be0.f819h);
    }

    public C0690sd(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
