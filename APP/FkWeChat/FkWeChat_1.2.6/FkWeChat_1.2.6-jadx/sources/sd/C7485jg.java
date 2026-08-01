package sd;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: sd.jg */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7485jg {

    /* JADX INFO: renamed from: a */
    public final boolean f24847a;

    /* JADX INFO: renamed from: b */
    public final boolean f24848b;

    /* JADX INFO: renamed from: c */
    public final int f24849c;

    /* JADX INFO: renamed from: d */
    public final String f24850d;

    /* JADX INFO: renamed from: e */
    public final String f24851e;

    /* JADX INFO: renamed from: f */
    public final String f24852f;

    /* JADX INFO: renamed from: g */
    public final String f24853g;

    /* JADX INFO: renamed from: h */
    public final String f24854h;

    /* JADX INFO: renamed from: i */
    public final String f24855i;

    /* JADX INFO: renamed from: j */
    public final String f24856j;

    /* JADX INFO: renamed from: k */
    public final boolean f24857k;

    /* JADX INFO: renamed from: l */
    public final String f24858l;

    public C7485jg(boolean z10, boolean z11, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z12, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.f24847a = z10;
        this.f24848b = z11;
        this.f24849c = i10;
        this.f24850d = str;
        this.f24851e = str2;
        this.f24852f = str3;
        this.f24853g = str4;
        this.f24854h = str5;
        this.f24855i = str6;
        this.f24856j = str7;
        this.f24857k = z12;
        this.f24858l = str8;
    }

    /* JADX INFO: renamed from: a */
    public final String m29184a() {
        return this.f24858l;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29185b() {
        return this.f24848b;
    }

    /* JADX INFO: renamed from: c */
    public final String m29186c() {
        return this.f24855i;
    }

    /* JADX INFO: renamed from: d */
    public final String m29187d() {
        return this.f24851e;
    }

    /* JADX INFO: renamed from: e */
    public final String m29188e() {
        return this.f24853g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7485jg)) {
            return false;
        }
        C7485jg c7485jg = (C7485jg) obj;
        return this.f24847a == c7485jg.f24847a && this.f24848b == c7485jg.f24848b && this.f24849c == c7485jg.f24849c && AbstractC1061t.m3842c(this.f24850d, c7485jg.f24850d) && AbstractC1061t.m3842c(this.f24851e, c7485jg.f24851e) && AbstractC1061t.m3842c(this.f24852f, c7485jg.f24852f) && AbstractC1061t.m3842c(this.f24853g, c7485jg.f24853g) && AbstractC1061t.m3842c(this.f24854h, c7485jg.f24854h) && AbstractC1061t.m3842c(this.f24855i, c7485jg.f24855i) && AbstractC1061t.m3842c(this.f24856j, c7485jg.f24856j) && this.f24857k == c7485jg.f24857k && AbstractC1061t.m3842c(this.f24858l, c7485jg.f24858l);
    }

    /* JADX INFO: renamed from: f */
    public final String m29189f() {
        return this.f24852f;
    }

    /* JADX INFO: renamed from: g */
    public final int m29190g() {
        return this.f24849c;
    }

    /* JADX INFO: renamed from: h */
    public final String m29191h() {
        return this.f24850d;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.f24847a) * 31) + Boolean.hashCode(this.f24848b)) * 31) + Integer.hashCode(this.f24849c)) * 31) + this.f24850d.hashCode()) * 31) + this.f24851e.hashCode()) * 31) + this.f24852f.hashCode()) * 31) + this.f24853g.hashCode()) * 31) + this.f24854h.hashCode()) * 31) + this.f24855i.hashCode()) * 31) + this.f24856j.hashCode()) * 31) + Boolean.hashCode(this.f24857k)) * 31) + this.f24858l.hashCode();
    }

    public String toString() {
        return "UpdateInfo(hasUpdate=" + this.f24847a + ", noIgnorable=" + this.f24848b + ", versionCode=" + this.f24849c + ", versionName=" + this.f24850d + ", updateLog=" + this.f24851e + ", updateUrl=" + this.f24852f + ", updateSize=" + this.f24853g + ", minVersion=" + this.f24854h + ", publishTime=" + this.f24855i + ", packageName=" + this.f24856j + ", auto=" + this.f24857k + ", crc32=" + this.f24858l + ")";
    }
}
