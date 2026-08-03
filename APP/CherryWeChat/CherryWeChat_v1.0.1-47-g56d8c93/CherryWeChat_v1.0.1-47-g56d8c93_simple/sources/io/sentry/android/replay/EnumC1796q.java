package io.sentry.android.replay;

import p000.C2322og;
import p000.InterfaceC2279ng;

/* JADX INFO: renamed from: io.sentry.android.replay.q */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1796q extends Enum {
    private static final /* synthetic */ InterfaceC2279ng $ENTRIES = null;
    private static final /* synthetic */ EnumC1796q[] $VALUES = null;
    public static final EnumC1796q CLOSED = null;
    public static final EnumC1796q INITIAL = null;
    public static final EnumC1796q PAUSED = null;
    public static final EnumC1796q RESUMED = null;
    public static final EnumC1796q STARTED = null;
    public static final EnumC1796q STOPPED = null;

    private static final /* synthetic */ EnumC1796q[] $values() {
        return new EnumC1796q[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        INITIAL = new EnumC1796q("INITIAL", 0);
        STARTED = new EnumC1796q("STARTED", 1);
        RESUMED = new EnumC1796q("RESUMED", 2);
        PAUSED = new EnumC1796q("PAUSED", 3);
        STOPPED = new EnumC1796q("STOPPED", 4);
        CLOSED = new EnumC1796q("CLOSED", 5);
        EnumC1796q[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = new C2322og(r0);
    }

    EnumC1796q(String r1, int r2) {
    }

    public static InterfaceC2279ng getEntries() {
        return $ENTRIES;
    }

    public static EnumC1796q valueOf(String r1) {
        return (EnumC1796q) Enum.valueOf(EnumC1796q.class, r1);
    }

    public static EnumC1796q[] values() {
        return (EnumC1796q[]) $VALUES.clone();
    }
}
