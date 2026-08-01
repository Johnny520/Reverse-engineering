package p037cb;

import p024b9.AbstractC1061t;
import p213oa.C5691b;

/* JADX INFO: renamed from: cb.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1508y {

    /* JADX INFO: renamed from: a */
    public final Object f4461a;

    /* JADX INFO: renamed from: b */
    public final Object f4462b;

    /* JADX INFO: renamed from: c */
    public final Object f4463c;

    /* JADX INFO: renamed from: d */
    public final Object f4464d;

    /* JADX INFO: renamed from: e */
    public final String f4465e;

    /* JADX INFO: renamed from: f */
    public final C5691b f4466f;

    public C1508y(Object obj, Object obj2, Object obj3, Object obj4, String str, C5691b c5691b) {
        str.getClass();
        c5691b.getClass();
        this.f4461a = obj;
        this.f4462b = obj2;
        this.f4463c = obj3;
        this.f4464d = obj4;
        this.f4465e = str;
        this.f4466f = c5691b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1508y)) {
            return false;
        }
        C1508y c1508y = (C1508y) obj;
        return AbstractC1061t.m3842c(this.f4461a, c1508y.f4461a) && AbstractC1061t.m3842c(this.f4462b, c1508y.f4462b) && AbstractC1061t.m3842c(this.f4463c, c1508y.f4463c) && AbstractC1061t.m3842c(this.f4464d, c1508y.f4464d) && AbstractC1061t.m3842c(this.f4465e, c1508y.f4465e) && AbstractC1061t.m3842c(this.f4466f, c1508y.f4466f);
    }

    public int hashCode() {
        Object obj = this.f4461a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4462b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f4463c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f4464d;
        return ((((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f4465e.hashCode()) * 31) + this.f4466f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f4461a + ", compilerVersion=" + this.f4462b + ", languageVersion=" + this.f4463c + ", expectedVersion=" + this.f4464d + ", filePath=" + this.f4465e + ", classId=" + this.f4466f + ')';
    }
}
