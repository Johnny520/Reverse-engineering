package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.reflect.jvm.internal.impl.p009km.internal.C5344;
import p086.AbstractC7728;
import p086.C7730;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class MemberKind {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ MemberKind[] $VALUES;
    private final C5344 flag;
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
        $ENTRIES = AbstractC5196.m9425(memberKindArr$values);
    }

    private MemberKind(String str, int i, int i2) {
        C7730 c7730 = AbstractC7728.f18738;
        c7730.getClass();
        this.flag = new C5344(c7730, i2);
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static MemberKind valueOf(String str) {
        return (MemberKind) Enum.valueOf(MemberKind.class, str);
    }

    public static MemberKind[] values() {
        return (MemberKind[]) $VALUES.clone();
    }

    public final C5344 getFlag$kotlin_metadata() {
        return this.flag;
    }
}
