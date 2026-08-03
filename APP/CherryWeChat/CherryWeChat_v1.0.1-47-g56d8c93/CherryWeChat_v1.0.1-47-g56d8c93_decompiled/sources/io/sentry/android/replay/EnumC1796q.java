package io.sentry.android.replay;

import p000.C2322og;
import p000.InterfaceC2279ng;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.sentry.android.replay.q */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1796q {
    private static final /* synthetic */ InterfaceC2279ng $ENTRIES;
    private static final /* synthetic */ EnumC1796q[] $VALUES;
    public static final EnumC1796q INITIAL = new EnumC1796q("INITIAL", 0);
    public static final EnumC1796q STARTED = new EnumC1796q("STARTED", 1);
    public static final EnumC1796q RESUMED = new EnumC1796q("RESUMED", 2);
    public static final EnumC1796q PAUSED = new EnumC1796q("PAUSED", 3);
    public static final EnumC1796q STOPPED = new EnumC1796q("STOPPED", 4);
    public static final EnumC1796q CLOSED = new EnumC1796q("CLOSED", 5);

    private static final /* synthetic */ EnumC1796q[] $values() {
        return new EnumC1796q[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        EnumC1796q[] enumC1796qArr$values = $values();
        $VALUES = enumC1796qArr$values;
        $ENTRIES = new C2322og(enumC1796qArr$values);
    }

    private EnumC1796q(String str, int i) {
    }

    public static InterfaceC2279ng getEntries() {
        return $ENTRIES;
    }

    public static EnumC1796q valueOf(String str) {
        return (EnumC1796q) Enum.valueOf(EnumC1796q.class, str);
    }

    public static EnumC1796q[] values() {
        return (EnumC1796q[]) $VALUES.clone();
    }
}
