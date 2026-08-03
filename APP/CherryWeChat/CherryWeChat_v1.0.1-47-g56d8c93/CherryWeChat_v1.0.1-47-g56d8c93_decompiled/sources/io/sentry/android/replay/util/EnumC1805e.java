package io.sentry.android.replay.util;

import p000.C2322og;
import p000.InterfaceC2279ng;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.sentry.android.replay.util.e */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1805e {
    private static final /* synthetic */ InterfaceC2279ng $ENTRIES;
    private static final /* synthetic */ EnumC1805e[] $VALUES;
    public static final EnumC1805e SOC_MODEL = new EnumC1805e("SOC_MODEL", 0);
    public static final EnumC1805e SOC_MANUFACTURER = new EnumC1805e("SOC_MANUFACTURER", 1);

    private static final /* synthetic */ EnumC1805e[] $values() {
        return new EnumC1805e[]{SOC_MODEL, SOC_MANUFACTURER};
    }

    static {
        EnumC1805e[] enumC1805eArr$values = $values();
        $VALUES = enumC1805eArr$values;
        $ENTRIES = new C2322og(enumC1805eArr$values);
    }

    private EnumC1805e(String str, int i) {
    }

    public static InterfaceC2279ng getEntries() {
        return $ENTRIES;
    }

    public static EnumC1805e valueOf(String str) {
        return (EnumC1805e) Enum.valueOf(EnumC1805e.class, str);
    }

    public static EnumC1805e[] values() {
        return (EnumC1805e[]) $VALUES.clone();
    }
}
