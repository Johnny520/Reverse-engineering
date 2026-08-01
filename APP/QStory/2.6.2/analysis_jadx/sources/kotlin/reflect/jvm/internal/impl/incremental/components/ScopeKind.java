package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ScopeKind {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ScopeKind[] $VALUES;
    public static final ScopeKind PACKAGE = new ScopeKind("PACKAGE", 0);
    public static final ScopeKind CLASSIFIER = new ScopeKind("CLASSIFIER", 1);

    private static final /* synthetic */ ScopeKind[] $values() {
        return new ScopeKind[]{PACKAGE, CLASSIFIER};
    }

    static {
        ScopeKind[] scopeKindArr$values = $values();
        $VALUES = scopeKindArr$values;
        $ENTRIES = AbstractC4363.m8876(scopeKindArr$values);
    }

    private ScopeKind(String str, int i) {
    }

    public static ScopeKind valueOf(String str) {
        return (ScopeKind) Enum.valueOf(ScopeKind.class, str);
    }

    public static ScopeKind[] values() {
        return (ScopeKind[]) $VALUES.clone();
    }
}
