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

    public C1811a(File file, int i, int i2, int i3, int i4) {
        this.f6555a = file;
        this.f6556b = i;
        this.f6557c = i2;
        this.f6558d = i3;
        this.f6559e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811a)) {
            return false;
        }
        C1811a c1811a = (C1811a) obj;
        return this.f6555a.equals(c1811a.f6555a) && this.f6556b == c1811a.f6556b && this.f6557c == c1811a.f6557c && this.f6558d == c1811a.f6558d && this.f6559e == c1811a.f6559e;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.f6559e) + AbstractC0213Ey.m403a(this.f6558d, AbstractC0213Ey.m403a(this.f6557c, AbstractC0213Ey.m403a(this.f6556b, this.f6555a.hashCode() * 31, 31), 31), 31)) * 31) + 1331836730;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MuxerConfig(file=");
        sb.append(this.f6555a);
        sb.append(", recordingWidth=");
        sb.append(this.f6556b);
        sb.append(", recordingHeight=");
        sb.append(this.f6557c);
        sb.append(", frameRate=");
        sb.append(this.f6558d);
        sb.append(", bitRate=");
        return AbstractC0213Ey.m409g(sb, this.f6559e, ", mimeType=video/avc)");
    }
}
