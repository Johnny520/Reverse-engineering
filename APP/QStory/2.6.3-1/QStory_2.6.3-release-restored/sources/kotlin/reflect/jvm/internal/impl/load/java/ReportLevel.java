package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ReportLevel {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ReportLevel[] $VALUES;
    public static final C5436 Companion;
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
        $ENTRIES = AbstractC5196.m9425(reportLevelArr$values);
        Companion = new C5436();
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
