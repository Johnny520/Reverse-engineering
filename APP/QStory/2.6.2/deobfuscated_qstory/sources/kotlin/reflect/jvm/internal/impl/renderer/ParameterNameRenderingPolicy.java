package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ParameterNameRenderingPolicy {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ParameterNameRenderingPolicy[] $VALUES;
    public static final ParameterNameRenderingPolicy ALL = new ParameterNameRenderingPolicy("ALL", 0);
    public static final ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
    public static final ParameterNameRenderingPolicy NONE = new ParameterNameRenderingPolicy("NONE", 2);

    private static final /* synthetic */ ParameterNameRenderingPolicy[] $values() {
        return new ParameterNameRenderingPolicy[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    static {
        ParameterNameRenderingPolicy[] parameterNameRenderingPolicyArr$values = $values();
        $VALUES = parameterNameRenderingPolicyArr$values;
        $ENTRIES = AbstractC4363.m8876(parameterNameRenderingPolicyArr$values);
    }

    private ParameterNameRenderingPolicy(String str, int i) {
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) $VALUES.clone();
    }
}
