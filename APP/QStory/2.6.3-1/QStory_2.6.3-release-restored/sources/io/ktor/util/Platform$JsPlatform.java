package io.ktor.util;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m151d2 = {"io/ktor/util/Platform$JsPlatform", "", "Lio/ktor/util/Platform$JsPlatform;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Browser", "Node", "ktor-utils"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class Platform$JsPlatform {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ Platform$JsPlatform[] $VALUES;
    public static final Platform$JsPlatform Browser = new Platform$JsPlatform("Browser", 0);
    public static final Platform$JsPlatform Node = new Platform$JsPlatform("Node", 1);

    private static final /* synthetic */ Platform$JsPlatform[] $values() {
        return new Platform$JsPlatform[]{Browser, Node};
    }

    static {
        Platform$JsPlatform[] platform$JsPlatformArr$values = $values();
        $VALUES = platform$JsPlatformArr$values;
        $ENTRIES = AbstractC5196.m9425(platform$JsPlatformArr$values);
    }

    private Platform$JsPlatform(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static Platform$JsPlatform valueOf(String str) {
        return (Platform$JsPlatform) Enum.valueOf(Platform$JsPlatform.class, str);
    }

    public static Platform$JsPlatform[] values() {
        return (Platform$JsPlatform[]) $VALUES.clone();
    }
}
