package yyds;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛷᲁᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1641 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8355;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public long f8356;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f8357;

    public C1641(long j, List list) {
        this.f8355 = 3;
        AbstractC2328.m4341(-383368353710958L);
        this.f8356 = j;
        this.f8357 = list;
    }

    public String toString() {
        switch (this.f8355) {
            case 0:
                if (((C1641) this.f8357) == null) {
                    return Long.toBinaryString(this.f8356);
                }
                return ((C1641) this.f8357).toString() + "xx" + Long.toBinaryString(this.f8356);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public void m3347() {
        this.f8356 = 0L;
        C1641 c1641 = (C1641) this.f8357;
        if (c1641 != null) {
            c1641.m3347();
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public void m3348(int i) {
        if (i < 64) {
            this.f8356 |= 1 << i;
        } else {
            m3353();
            ((C1641) this.f8357).m3348(i - 64);
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m3349(int i, boolean z) {
        if (i >= 64) {
            m3353();
            ((C1641) this.f8357).m3349(i - 64, z);
            return;
        }
        long j = this.f8356;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f8356 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m3348(i);
        } else {
            m3350(i);
        }
        if (z2 || ((C1641) this.f8357) != null) {
            m3353();
            ((C1641) this.f8357).m3349(0, z2);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m3350(int i) {
        if (i < 64) {
            this.f8356 &= ~(1 << i);
            return;
        }
        C1641 c1641 = (C1641) this.f8357;
        if (c1641 != null) {
            c1641.m3350(i - 64);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int m3351(int i) {
        C1641 c1641 = (C1641) this.f8357;
        if (c1641 == null) {
            long j = this.f8356;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f8356);
        }
        return Long.bitCount(this.f8356) + c1641.m3351(i - 64);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean m3352(int i) {
        if (i >= 64) {
            m3353();
            return ((C1641) this.f8357).m3352(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f8356;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f8356 = j3;
        long j4 = j - 1;
        this.f8356 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C1641 c1641 = (C1641) this.f8357;
        if (c1641 != null) {
            if (c1641.m3355(0)) {
                m3348(63);
            }
            ((C1641) this.f8357).m3352(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m3353() {
        if (((C1641) this.f8357) == null) {
            this.f8357 = new C1641();
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C1605 m3354() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strM3921 = ((C2066) this.f8357).m3921(this.f8356);
            this.f8356 -= (long) strM3921.length();
            if (strM3921.length() == 0) {
                return new C1605((String[]) arrayList.toArray(new String[0]));
            }
            int iM1290 = AbstractC0473.m1290(strM3921, ':', 1, 4);
            if (iM1290 != -1) {
                String strSubstring = strM3921.substring(0, iM1290);
                String strSubstring2 = strM3921.substring(iM1290 + 1);
                arrayList.add(strSubstring);
                arrayList.add(AbstractC0473.m1314(strSubstring2).toString());
            } else if (strM3921.charAt(0) == ':') {
                String strSubstring3 = strM3921.substring(1);
                arrayList.add("");
                arrayList.add(AbstractC0473.m1314(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(AbstractC0473.m1314(strM3921).toString());
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean m3355(int i) {
        if (i < 64) {
            return ((1 << i) & this.f8356) != 0;
        }
        m3353();
        return ((C1641) this.f8357).m3355(i - 64);
    }

    public C1641(C2066 c2066) {
        this.f8355 = 2;
        this.f8357 = c2066;
        this.f8356 = 262144L;
    }

    public C1641(long j, String str) {
        this.f8355 = 1;
        AbstractC2328.m4341(-565118484775790L);
        this.f8356 = j;
        this.f8357 = str;
    }

    public C1641() {
        this.f8355 = 0;
        this.f8356 = 0L;
    }
}
