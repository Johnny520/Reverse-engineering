package io.sentry.android.replay;

import p000.C0232Fa;

/* JADX INFO: renamed from: io.sentry.android.replay.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1795p {

    /* JADX INFO: renamed from: a */
    public volatile EnumC1796q f6517a;

    /* JADX INFO: renamed from: a */
    public final boolean m3974a(EnumC1796q r4) {
        EnumC1796q r0 = this.f6517a;
        switch(AbstractC1794o.f6516a[r0.ordinal()]) {
            case 1: goto L42;
            case 2: goto L33;
            case 3: goto L24;
            case 4: goto L15;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L5;
        };
    L6:
        return false;
    L5:
        throw new C0232Fa();
    L8:
        if (r4 != EnumC1796q.STARTED) goto L10;
    L13:
        return true;
    L10:
        if (r4 == EnumC1796q.CLOSED) goto L13;
        return false;
    L15:
        if (r4 != EnumC1796q.RESUMED) goto L17;
    L22:
        return true;
    L17:
        if (r4 == EnumC1796q.STOPPED) goto L22;
        if (r4 == EnumC1796q.CLOSED) goto L22;
        return false;
    L24:
        if (r4 != EnumC1796q.PAUSED) goto L26;
    L31:
        return true;
    L26:
        if (r4 == EnumC1796q.STOPPED) goto L31;
        if (r4 == EnumC1796q.CLOSED) goto L31;
        return false;
    L33:
        if (r4 != EnumC1796q.PAUSED) goto L35;
    L40:
        return true;
    L35:
        if (r4 == EnumC1796q.STOPPED) goto L40;
        if (r4 == EnumC1796q.CLOSED) goto L40;
        return false;
    L42:
        if (r4 != EnumC1796q.STARTED) goto L44;
    L47:
        return true;
    L44:
        if (r4 == EnumC1796q.CLOSED) goto L47;
        return false;
    }
}
