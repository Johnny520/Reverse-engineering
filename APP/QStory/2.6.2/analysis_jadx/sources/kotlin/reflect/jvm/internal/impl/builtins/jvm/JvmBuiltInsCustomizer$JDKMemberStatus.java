package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final class JvmBuiltInsCustomizer$JDKMemberStatus {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ JvmBuiltInsCustomizer$JDKMemberStatus[] $VALUES;
    public static final JvmBuiltInsCustomizer$JDKMemberStatus HIDDEN = new JvmBuiltInsCustomizer$JDKMemberStatus("HIDDEN", 0);
    public static final JvmBuiltInsCustomizer$JDKMemberStatus VISIBLE = new JvmBuiltInsCustomizer$JDKMemberStatus("VISIBLE", 1);
    public static final JvmBuiltInsCustomizer$JDKMemberStatus DEPRECATED_LIST_METHODS = new JvmBuiltInsCustomizer$JDKMemberStatus("DEPRECATED_LIST_METHODS", 2);
    public static final JvmBuiltInsCustomizer$JDKMemberStatus NOT_CONSIDERED = new JvmBuiltInsCustomizer$JDKMemberStatus("NOT_CONSIDERED", 3);
    public static final JvmBuiltInsCustomizer$JDKMemberStatus DROP = new JvmBuiltInsCustomizer$JDKMemberStatus("DROP", 4);

    private static final /* synthetic */ JvmBuiltInsCustomizer$JDKMemberStatus[] $values() {
        return new JvmBuiltInsCustomizer$JDKMemberStatus[]{HIDDEN, VISIBLE, DEPRECATED_LIST_METHODS, NOT_CONSIDERED, DROP};
    }

    static {
        JvmBuiltInsCustomizer$JDKMemberStatus[] jvmBuiltInsCustomizer$JDKMemberStatusArr$values = $values();
        $VALUES = jvmBuiltInsCustomizer$JDKMemberStatusArr$values;
        $ENTRIES = AbstractC4363.m8876(jvmBuiltInsCustomizer$JDKMemberStatusArr$values);
    }

    private JvmBuiltInsCustomizer$JDKMemberStatus(String str, int i) {
    }

    public static JvmBuiltInsCustomizer$JDKMemberStatus valueOf(String str) {
        return (JvmBuiltInsCustomizer$JDKMemberStatus) Enum.valueOf(JvmBuiltInsCustomizer$JDKMemberStatus.class, str);
    }

    public static JvmBuiltInsCustomizer$JDKMemberStatus[] values() {
        return (JvmBuiltInsCustomizer$JDKMemberStatus[]) $VALUES.clone();
    }
}
