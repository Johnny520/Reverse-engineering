package io.sentry.android.replay;

import java.io.File;
import p000.AbstractC0213Ey;
import p000.AbstractC0585Nj;

/* JADX INFO: renamed from: io.sentry.android.replay.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1762c {

    /* JADX INFO: renamed from: a */
    public final File f6413a;

    /* JADX INFO: renamed from: b */
    public final int f6414b;

    /* JADX INFO: renamed from: c */
    public final long f6415c;

    public C1762c(File r1, int r2, long r3) {
        this.f6413a = r1;
        this.f6414b = r2;
        this.f6415c = r3;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C1762c) == true) goto L8;
        return false;
    L8:
        C1762c r82 = (C1762c) r8;
        if (AbstractC0585Nj.m1134a(this.f6413a, r82.f6413a) == true) goto L12;
        return false;
    L12:
        if (this.f6414b == r82.f6414b) goto L15;
        return false;
    L15:
        if (this.f6415c == r82.f6415c) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f6413a.hashCode() * 31;
        int r02 = AbstractC0213Ey.m403a(this.f6414b, r0, 31);
        return Long.hashCode(this.f6415c) + r02;
    }

    public final String toString() {
        return "GeneratedVideo(video=" + this.f6413a + ", frameCount=" + this.f6414b + ", duration=" + this.f6415c + ')';
    }
}
