package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ReportLevel {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ReportLevel[] $VALUES;
    public static final C4603 Companion;
    private final String description;
    public static final ReportLevel IGNORE = new ReportLevel("IGNORE", 0, "ignore");
    public static final ReportLevel WARN = new ReportLevel("WARN", 1, "warn");
    public static final ReportLevel STRICT = new ReportLevel("STRICT", 2, "strict");

    private static final /* synthetic */ ReportLevel[] $values() {
        return new ReportLevel[]{IGNORE, WARN, STRICT};
    }

    static {
        ReportLevel[] reportLevelArr$values = $values();
        $VALUES = reportLevelArr$values;
        $ENTRIES = AbstractC4363.m8876(reportLevelArr$values);
        Companion = new C4603();
    }

    private ReportLevel(String str, int i, String str2) {
        this.description = str2;
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
