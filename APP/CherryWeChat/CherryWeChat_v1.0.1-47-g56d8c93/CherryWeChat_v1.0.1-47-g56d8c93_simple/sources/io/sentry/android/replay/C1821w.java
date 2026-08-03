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

    public C1821w(int r1, int r2, float r3, float r4, int r5, int r6) {
        this.f6589a = r1;
        this.f6590b = r2;
        this.f6591c = r3;
        this.f6592d = r4;
        this.f6593e = r5;
        this.f6594f = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1821w) == true) goto L8;
        return false;
    L8:
        C1821w r52 = (C1821w) r5;
        if (this.f6589a == r52.f6589a) goto L12;
        return false;
    L12:
        if (this.f6590b == r52.f6590b) goto L15;
        return false;
    L15:
        if (Float.compare(this.f6591c, r52.f6591c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.f6592d, r52.f6592d) == 0) goto L21;
        return false;
    L21:
        if (this.f6593e == r52.f6593e) goto L24;
        return false;
    L24:
        if (this.f6594f == r52.f6594f) goto L26;
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.f6589a) * 31;
        int r02 = AbstractC0213Ey.m403a(this.f6590b, r0, 31);
        int r2 = (Float.hashCode(this.f6591c) + r02) * 31;
        int r03 = (Float.hashCode(this.f6592d) + r2) * 31;
        int r04 = AbstractC0213Ey.m403a(this.f6593e, r03, 31);
        return Integer.hashCode(this.f6594f) + r04;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        r0.append(this.f6589a);
        r0.append(", recordingHeight=");
        r0.append(this.f6590b);
        r0.append(", scaleFactorX=");
        r0.append(this.f6591c);
        r0.append(", scaleFactorY=");
        r0.append(this.f6592d);
        r0.append(", frameRate=");
        r0.append(this.f6593e);
        r0.append(", bitRate=");
        return AbstractC0213Ey.m408f(r0, this.f6594f, ')');
    }
}
