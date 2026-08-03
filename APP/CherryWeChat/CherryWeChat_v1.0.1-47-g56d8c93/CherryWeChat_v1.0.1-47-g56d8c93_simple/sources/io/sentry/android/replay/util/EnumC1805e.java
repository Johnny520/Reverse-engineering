package io.sentry.android.replay.util;

import p000.C2322og;
import p000.InterfaceC2279ng;

/* JADX INFO: renamed from: io.sentry.android.replay.util.e */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1805e extends Enum {
    private static final /* synthetic */ InterfaceC2279ng $ENTRIES = null;
    private static final /* synthetic */ EnumC1805e[] $VALUES = null;
    public static final EnumC1805e SOC_MANUFACTURER = null;
    public static final EnumC1805e SOC_MODEL = null;

    private static final /* synthetic */ EnumC1805e[] $values() {
        return new EnumC1805e[]{SOC_MODEL, SOC_MANUFACTURER};
    }

    static {
        SOC_MODEL = new EnumC1805e("SOC_MODEL", 0);
        SOC_MANUFACTURER = new EnumC1805e("SOC_MANUFACTURER", 1);
        EnumC1805e[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = new C2322og(r0);
    }

    EnumC1805e(String r1, int r2) {
    }

    public static InterfaceC2279ng getEntries() {
        return $ENTRIES;
    }

    public static EnumC1805e valueOf(String r1) {
        return (EnumC1805e) Enum.valueOf(EnumC1805e.class, r1);
    }

    public static EnumC1805e[] values() {
        return (EnumC1805e[]) $VALUES.clone();
    }
}
