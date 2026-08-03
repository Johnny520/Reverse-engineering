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

    public C1762c(File file, int i, long j) {
        this.f6413a = file;
        this.f6414b = i;
        this.f6415c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1762c)) {
            return false;
        }
        C1762c c1762c = (C1762c) obj;
        return AbstractC0585Nj.m1134a(this.f6413a, c1762c.f6413a) && this.f6414b == c1762c.f6414b && this.f6415c == c1762c.f6415c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6415c) + AbstractC0213Ey.m403a(this.f6414b, this.f6413a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GeneratedVideo(video=" + this.f6413a + ", frameCount=" + this.f6414b + ", duration=" + this.f6415c + ')';
    }
}
