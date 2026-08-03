package io.sentry.android.replay;

import io.sentry.EnumC2055w2;
import java.util.Date;
import java.util.List;
import p000.AbstractC0213Ey;
import p000.AbstractC0585Nj;

/* JADX INFO: renamed from: io.sentry.android.replay.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1780d {

    /* JADX INFO: renamed from: a */
    public final C1821w f6471a;

    /* JADX INFO: renamed from: b */
    public final C1789j f6472b;

    /* JADX INFO: renamed from: c */
    public final Date f6473c;

    /* JADX INFO: renamed from: d */
    public final int f6474d;

    /* JADX INFO: renamed from: e */
    public final long f6475e;

    /* JADX INFO: renamed from: f */
    public final EnumC2055w2 f6476f;

    /* JADX INFO: renamed from: g */
    public final String f6477g;

    /* JADX INFO: renamed from: h */
    public final List f6478h;

    public C1780d(C1821w c1821w, C1789j c1789j, Date date, int i, long j, EnumC2055w2 enumC2055w2, String str, List list) {
        this.f6471a = c1821w;
        this.f6472b = c1789j;
        this.f6473c = date;
        this.f6474d = i;
        this.f6475e = j;
        this.f6476f = enumC2055w2;
        this.f6477g = str;
        this.f6478h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780d)) {
            return false;
        }
        C1780d c1780d = (C1780d) obj;
        return AbstractC0585Nj.m1134a(this.f6471a, c1780d.f6471a) && AbstractC0585Nj.m1134a(this.f6472b, c1780d.f6472b) && AbstractC0585Nj.m1134a(this.f6473c, c1780d.f6473c) && this.f6474d == c1780d.f6474d && this.f6475e == c1780d.f6475e && this.f6476f == c1780d.f6476f && AbstractC0585Nj.m1134a(this.f6477g, c1780d.f6477g) && AbstractC0585Nj.m1134a(this.f6478h, c1780d.f6478h);
    }

    public final int hashCode() {
        int iHashCode = (this.f6476f.hashCode() + ((Long.hashCode(this.f6475e) + AbstractC0213Ey.m403a(this.f6474d, (this.f6473c.hashCode() + ((this.f6472b.hashCode() + (this.f6471a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31;
        String str = this.f6477g;
        return this.f6478h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.f6471a + ", cache=" + this.f6472b + ", timestamp=" + this.f6473c + ", id=" + this.f6474d + ", duration=" + this.f6475e + ", replayType=" + this.f6476f + ", screenAtStart=" + this.f6477g + ", events=" + this.f6478h + ')';
    }
}
