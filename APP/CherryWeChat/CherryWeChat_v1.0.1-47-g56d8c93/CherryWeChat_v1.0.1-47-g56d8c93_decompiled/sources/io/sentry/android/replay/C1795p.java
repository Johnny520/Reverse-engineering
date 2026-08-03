package io.sentry.android.replay;

import p000.C0232Fa;

/* JADX INFO: renamed from: io.sentry.android.replay.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1795p {

    /* JADX INFO: renamed from: a */
    public volatile EnumC1796q f6517a;

    /* JADX INFO: renamed from: a */
    public final boolean m3974a(EnumC1796q enumC1796q) {
        switch (AbstractC1794o.f6516a[this.f6517a.ordinal()]) {
            case 1:
                return enumC1796q == EnumC1796q.STARTED || enumC1796q == EnumC1796q.CLOSED;
            case 2:
                return enumC1796q == EnumC1796q.PAUSED || enumC1796q == EnumC1796q.STOPPED || enumC1796q == EnumC1796q.CLOSED;
            case 3:
                return enumC1796q == EnumC1796q.PAUSED || enumC1796q == EnumC1796q.STOPPED || enumC1796q == EnumC1796q.CLOSED;
            case 4:
                return enumC1796q == EnumC1796q.RESUMED || enumC1796q == EnumC1796q.STOPPED || enumC1796q == EnumC1796q.CLOSED;
            case 5:
                return enumC1796q == EnumC1796q.STARTED || enumC1796q == EnumC1796q.CLOSED;
            case 6:
                return false;
            default:
                throw new C0232Fa();
        }
    }
}
