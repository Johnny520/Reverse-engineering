package sd;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: sd.wa */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7726wa {

    /* JADX INFO: renamed from: a */
    public final long f25796a;

    /* JADX INFO: renamed from: b */
    public final int f25797b;

    /* JADX INFO: renamed from: c */
    public final int f25798c;

    /* JADX INFO: renamed from: d */
    public final int f25799d;

    /* JADX INFO: renamed from: e */
    public final int f25800e;

    /* JADX INFO: renamed from: f */
    public final int f25801f;

    /* JADX INFO: renamed from: g */
    public final int f25802g;

    /* JADX INFO: renamed from: h */
    public final String f25803h;

    /* JADX INFO: renamed from: i */
    public final List f25804i;

    /* JADX INFO: renamed from: j */
    public final List f25805j;

    /* JADX INFO: renamed from: k */
    public final int[] f25806k;

    /* JADX INFO: renamed from: l */
    public final Map f25807l;

    /* JADX INFO: renamed from: m */
    public final C7597pe f25808m;

    /* JADX INFO: renamed from: n */
    public final C7635re f25809n;

    /* JADX INFO: renamed from: o */
    public final C7790zh f25810o;

    /* JADX INFO: renamed from: p */
    public final C7745xa f25811p;

    public C7726wa(long j10, int i10, int i11, int i12, int i13, int i14, int i15, String str, List list, List list2, int[] iArr, Map map, C7597pe c7597pe, C7635re c7635re, C7790zh c7790zh, C7745xa c7745xa) {
        str.getClass();
        list.getClass();
        list2.getClass();
        iArr.getClass();
        map.getClass();
        c7635re.getClass();
        c7790zh.getClass();
        c7745xa.getClass();
        this.f25796a = j10;
        this.f25797b = i10;
        this.f25798c = i11;
        this.f25799d = i12;
        this.f25800e = i13;
        this.f25801f = i14;
        this.f25802g = i15;
        this.f25803h = str;
        this.f25804i = list;
        this.f25805j = list2;
        this.f25806k = iArr;
        this.f25807l = map;
        this.f25808m = c7597pe;
        this.f25809n = c7635re;
        this.f25810o = c7790zh;
        this.f25811p = c7745xa;
    }

    /* JADX INFO: renamed from: a */
    public final List m30048a() {
        return this.f25804i;
    }

    /* JADX INFO: renamed from: b */
    public final String m30049b() {
        return this.f25803h;
    }

    /* JADX INFO: renamed from: c */
    public final int[] m30050c() {
        return this.f25806k;
    }

    /* JADX INFO: renamed from: d */
    public final C7745xa m30051d() {
        return this.f25811p;
    }

    /* JADX INFO: renamed from: e */
    public final Map m30052e() {
        return this.f25807l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7726wa)) {
            return false;
        }
        C7726wa c7726wa = (C7726wa) obj;
        return this.f25796a == c7726wa.f25796a && this.f25797b == c7726wa.f25797b && this.f25798c == c7726wa.f25798c && this.f25799d == c7726wa.f25799d && this.f25800e == c7726wa.f25800e && this.f25801f == c7726wa.f25801f && this.f25802g == c7726wa.f25802g && AbstractC1061t.m3842c(this.f25803h, c7726wa.f25803h) && AbstractC1061t.m3842c(this.f25804i, c7726wa.f25804i) && AbstractC1061t.m3842c(this.f25805j, c7726wa.f25805j) && AbstractC1061t.m3842c(this.f25806k, c7726wa.f25806k) && AbstractC1061t.m3842c(this.f25807l, c7726wa.f25807l) && AbstractC1061t.m3842c(this.f25808m, c7726wa.f25808m) && AbstractC1061t.m3842c(this.f25809n, c7726wa.f25809n) && AbstractC1061t.m3842c(this.f25810o, c7726wa.f25810o) && AbstractC1061t.m3842c(this.f25811p, c7726wa.f25811p);
    }

    /* JADX INFO: renamed from: f */
    public final List m30053f() {
        return this.f25805j;
    }

    /* JADX INFO: renamed from: g */
    public final C7597pe m30054g() {
        return this.f25808m;
    }

    /* JADX INFO: renamed from: h */
    public final C7635re m30055h() {
        return this.f25809n;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((Long.hashCode(this.f25796a) * 31) + Integer.hashCode(this.f25797b)) * 31) + Integer.hashCode(this.f25798c)) * 31) + Integer.hashCode(this.f25799d)) * 31) + Integer.hashCode(this.f25800e)) * 31) + Integer.hashCode(this.f25801f)) * 31) + Integer.hashCode(this.f25802g)) * 31) + this.f25803h.hashCode()) * 31) + this.f25804i.hashCode()) * 31) + this.f25805j.hashCode()) * 31) + Arrays.hashCode(this.f25806k)) * 31) + this.f25807l.hashCode()) * 31;
        C7597pe c7597pe = this.f25808m;
        return ((((((iHashCode + (c7597pe == null ? 0 : c7597pe.hashCode())) * 31) + this.f25809n.hashCode()) * 31) + this.f25810o.hashCode()) * 31) + this.f25811p.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m30056i() {
        return this.f25797b;
    }

    /* JADX INFO: renamed from: j */
    public final int m30057j() {
        return this.f25799d;
    }

    /* JADX INFO: renamed from: k */
    public final int m30058k() {
        return this.f25798c;
    }

    /* JADX INFO: renamed from: l */
    public final long m30059l() {
        return this.f25796a;
    }

    /* JADX INFO: renamed from: m */
    public final C7790zh m30060m() {
        return this.f25810o;
    }

    public String toString() {
        return "EnhancedStats(totalHistoryCount=" + this.f25796a + ", sampleSize=" + this.f25797b + ", todayCount=" + this.f25798c + ", todayActiveUsers=" + this.f25799d + ", atMeCount=" + this.f25800e + ", luckyMoneyCount=" + this.f25801f + ", transferCount=" + this.f25802g + ", dateRange=" + this.f25803h + ", cloudWords=" + this.f25804i + ", radarData=" + this.f25805j + ", hourMap=" + Arrays.toString(this.f25806k) + ", msgTypeStats=" + this.f25807l + ", rankData=" + this.f25808m + ", routineStats=" + this.f25809n + ", vibeStats=" + this.f25810o + ", lengthStats=" + this.f25811p + ")";
    }
}
