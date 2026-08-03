package io.sentry.android.replay.video;

import java.io.File;
import p000.AbstractC0213Ey;

/* JADX INFO: renamed from: io.sentry.android.replay.video.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1811a {

    /* JADX INFO: renamed from: a */
    public final File f6555a;

    /* JADX INFO: renamed from: b */
    public final int f6556b;

    /* JADX INFO: renamed from: c */
    public final int f6557c;

    /* JADX INFO: renamed from: d */
    public final int f6558d;

    /* JADX INFO: renamed from: e */
    public final int f6559e;

    public C1811a(File r1, int r2, int r3, int r4, int r5) {
        this.f6555a = r1;
        this.f6556b = r2;
        this.f6557c = r3;
        this.f6558d = r4;
        this.f6559e = r5;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C1811a) == false) goto L25;
        C1811a r32 = (C1811a) r3;
        if (this.f6555a.equals(r32.f6555a) == true) goto L11;
        return false;
    L11:
        if (this.f6556b == r32.f6556b) goto L14;
        return false;
    L14:
        if (this.f6557c == r32.f6557c) goto L17;
        return false;
    L17:
        if (this.f6558d == r32.f6558d) goto L20;
        return false;
    L20:
        if (this.f6559e == r32.f6559e) goto L23;
        return false;
    L23:
        return true;
    L25:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f6555a.hashCode() * 31;
        int r02 = AbstractC0213Ey.m403a(this.f6556b, r0, 31);
        int r03 = AbstractC0213Ey.m403a(this.f6557c, r02, 31);
        int r04 = AbstractC0213Ey.m403a(this.f6558d, r03, 31);
        return ((Integer.hashCode(this.f6559e) + r04) * 31) + 1331836730;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("MuxerConfig(file=");
        r0.append(this.f6555a);
        r0.append(", recordingWidth=");
        r0.append(this.f6556b);
        r0.append(", recordingHeight=");
        r0.append(this.f6557c);
        r0.append(", frameRate=");
        r0.append(this.f6558d);
        r0.append(", bitRate=");
        return AbstractC0213Ey.m409g(r0, this.f6559e, ", mimeType=video/avc)");
    }
}
