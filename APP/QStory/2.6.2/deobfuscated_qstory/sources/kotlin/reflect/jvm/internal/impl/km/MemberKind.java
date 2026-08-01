package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.reflect.jvm.internal.impl.km.internal.C4511;
import p070.AbstractC6898;
import p070.C6900;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class MemberKind {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ MemberKind[] $VALUES;
    private final C4511 flag;
    public static final MemberKind DECLARATION = new MemberKind("DECLARATION", 0, 0);
    public static final MemberKind FAKE_OVERRIDE = new MemberKind("FAKE_OVERRIDE", 1, 1);
    public static final MemberKind DELEGATION = new MemberKind("DELEGATION", 2, 2);
    public static final MemberKind SYNTHESIZED = new MemberKind("SYNTHESIZED", 3, 3);

    private static final /* synthetic */ MemberKind[] $values() {
        return new MemberKind[]{DECLARATION, FAKE_OVERRIDE, DELEGATION, SYNTHESIZED};
    }

    static {
        MemberKind[] memberKindArr$values = $values();
        $VALUES = memberKindArr$values;
        $ENTRIES = AbstractC4363.m8876(memberKindArr$values);
    }

    private MemberKind(String str, int i, int i2) {
        C6900 c6900 = AbstractC6898.f18398;
        c6900.getClass();
        this.flag = new C4511(c6900, i2);
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static MemberKind valueOf(String str) {
        return (MemberKind) Enum.valueOf(MemberKind.class, str);
    }

    public static MemberKind[] values() {
        return (MemberKind[]) $VALUES.clone();
    }

    public final C4511 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
