package io.modelcontextprotocol.kotlin.sdk;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p056.C6631;
import p056.C6808;
import p087.C7109;
import p089.InterfaceC7181;
import p089.InterfaceC7184;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/modelcontextprotocol/kotlin/sdk/LoggingLevel;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Companion", "飘花落叶言世子楪兰苏哲/飘花落叶言楪子世苏哲兰", "debug", "info", "notice", "warning", "error", "critical", "alert", "emergency", "kotlin-sdk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoggingLevel {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ LoggingLevel[] $VALUES;
    private static final InterfaceC5184 $cachedSerializer$delegate;
    public static final C6808 Companion;
    public static final LoggingLevel debug = new LoggingLevel("debug", 0);
    public static final LoggingLevel info = new LoggingLevel("info", 1);
    public static final LoggingLevel notice = new LoggingLevel("notice", 2);
    public static final LoggingLevel warning = new LoggingLevel("warning", 3);
    public static final LoggingLevel error = new LoggingLevel("error", 4);
    public static final LoggingLevel critical = new LoggingLevel("critical", 5);
    public static final LoggingLevel alert = new LoggingLevel("alert", 6);
    public static final LoggingLevel emergency = new LoggingLevel("emergency", 7);

    private static final /* synthetic */ LoggingLevel[] $values() {
        return new LoggingLevel[]{debug, info, notice, warning, error, critical, alert, emergency};
    }

    static {
        LoggingLevel[] loggingLevelArr$values = $values();
        $VALUES = loggingLevelArr$values;
        $ENTRIES = AbstractC4364.m8866(loggingLevelArr$values);
        Companion = new C6808();
        $cachedSerializer$delegate = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(14));
    }

    private LoggingLevel(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7184 _init_$_anonymous_() {
        LoggingLevel[] loggingLevelArrValues = values();
        loggingLevelArrValues.getClass();
        return new C7109("io.modelcontextprotocol.kotlin.sdk.LoggingLevel", loggingLevelArrValues);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static LoggingLevel valueOf(String str) {
        return (LoggingLevel) Enum.valueOf(LoggingLevel.class, str);
    }

    public static LoggingLevel[] values() {
        return (LoggingLevel[]) $VALUES.clone();
    }
}
