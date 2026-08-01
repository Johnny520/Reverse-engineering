package io.ktor.util.debug.plugins;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"io/ktor/util/debug/plugins/PluginTraceElement$PluginEvent", "", "Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "STARTED", "FINISHED", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PluginTraceElement$PluginEvent {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ PluginTraceElement$PluginEvent[] $VALUES;
    public static final PluginTraceElement$PluginEvent STARTED = new PluginTraceElement$PluginEvent("STARTED", 0);
    public static final PluginTraceElement$PluginEvent FINISHED = new PluginTraceElement$PluginEvent("FINISHED", 1);

    private static final /* synthetic */ PluginTraceElement$PluginEvent[] $values() {
        return new PluginTraceElement$PluginEvent[]{STARTED, FINISHED};
    }

    static {
        PluginTraceElement$PluginEvent[] pluginTraceElement$PluginEventArr$values = $values();
        $VALUES = pluginTraceElement$PluginEventArr$values;
        $ENTRIES = AbstractC4364.m8866(pluginTraceElement$PluginEventArr$values);
    }

    private PluginTraceElement$PluginEvent(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static PluginTraceElement$PluginEvent valueOf(String str) {
        return (PluginTraceElement$PluginEvent) Enum.valueOf(PluginTraceElement$PluginEvent.class, str);
    }

    public static PluginTraceElement$PluginEvent[] values() {
        return (PluginTraceElement$PluginEvent[]) $VALUES.clone();
    }
}
