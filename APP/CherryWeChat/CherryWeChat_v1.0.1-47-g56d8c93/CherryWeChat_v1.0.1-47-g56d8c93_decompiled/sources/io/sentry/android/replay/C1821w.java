package io.sentry.android.replay;

import p000.AbstractC0213Ey;

/* JADX INFO: renamed from: io.sentry.android.replay.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1821w {

    /* JADX INFO: renamed from: a */
    public final int f6589a;

    /* JADX INFO: renamed from: b */
    public final int f6590b;

    /* JADX INFO: renamed from: c */
    public final float f6591c;

    /* JADX INFO: renamed from: d */
    public final float f6592d;

    /* JADX INFO: renamed from: e */
    public final int f6593e;

    /* JADX INFO: renamed from: f */
    public final int f6594f;

    public C1821w(int i, int i2, float f, float f2, int i3, int i4) {
        this.f6589a = i;
        this.f6590b = i2;
        this.f6591c = f;
        this.f6592d = f2;
        this.f6593e = i3;
        this.f6594f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1821w)) {
            return false;
        }
        C1821w c1821w = (C1821w) obj;
        return this.f6589a == c1821w.f6589a && this.f6590b == c1821w.f6590b && Float.compare(this.f6591c, c1821w.f6591c) == 0 && Float.compare(this.f6592d, c1821w.f6592d) == 0 && this.f6593e == c1821w.f6593e && this.f6594f == c1821w.f6594f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6594f) + AbstractC0213Ey.m403a(this.f6593e, (Float.hashCode(this.f6592d) + ((Float.hashCode(this.f6591c) + AbstractC0213Ey.m403a(this.f6590b, Integer.hashCode(this.f6589a) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.f6589a);
        sb.append(", recordingHeight=");
        sb.append(this.f6590b);
        sb.append(", scaleFactorX=");
        sb.append(this.f6591c);
        sb.append(", scaleFactorY=");
        sb.append(this.f6592d);
        sb.append(", frameRate=");
        sb.append(this.f6593e);
        sb.append(", bitRate=");
        return AbstractC0213Ey.m408f(sb, this.f6594f, ')');
    }
}
