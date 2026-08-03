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

    public C1780d(C1821w r1, C1789j r2, Date r3, int r4, long r5, EnumC2055w2 r7, String r8, List r9) {
        this.f6471a = r1;
        this.f6472b = r2;
        this.f6473c = r3;
        this.f6474d = r4;
        this.f6475e = r5;
        this.f6476f = r7;
        this.f6477g = r8;
        this.f6478h = r9;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C1780d) == true) goto L8;
        return false;
    L8:
        C1780d r82 = (C1780d) r8;
        if (AbstractC0585Nj.m1134a(this.f6471a, r82.f6471a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f6472b, r82.f6472b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f6473c, r82.f6473c) == true) goto L18;
        return false;
    L18:
        if (this.f6474d == r82.f6474d) goto L21;
        return false;
    L21:
        if (this.f6475e == r82.f6475e) goto L24;
        return false;
    L24:
        if (this.f6476f == r82.f6476f) goto L27;
        return false;
    L27:
        if (AbstractC0585Nj.m1134a(this.f6477g, r82.f6477g) == true) goto L30;
        return false;
    L30:
        if (AbstractC0585Nj.m1134a(this.f6478h, r82.f6478h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f6471a.hashCode() * 31;
        int r2 = (this.f6472b.hashCode() + r0) * 31;
        int r02 = (this.f6473c.hashCode() + r2) * 31;
        int r03 = AbstractC0213Ey.m403a(this.f6474d, r02, 31);
        int r22 = (Long.hashCode(this.f6475e) + r03) * 31;
        int r04 = (this.f6476f.hashCode() + r22) * 31;
        String r23 = this.f6477g;
        if (r23 != null) goto L5;
        int r24 = 0;
    L6:
        int r1 = this.f6478h.hashCode();
        return r1 + ((r04 + r24) * 31);
    L5:
        r24 = r23.hashCode();
        goto L6
    }

    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.f6471a + ", cache=" + this.f6472b + ", timestamp=" + this.f6473c + ", id=" + this.f6474d + ", duration=" + this.f6475e + ", replayType=" + this.f6476f + ", screenAtStart=" + this.f6477g + ", events=" + this.f6478h + ')';
    }
}
