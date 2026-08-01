package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m151d2 = {"kotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess", "", "Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;", "member", "", "accept", "(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;)Z", "DECLARED", "INHERITED", "kotlin-reflection"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
final class KClassImpl$MemberBelonginess {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ KClassImpl$MemberBelonginess[] $VALUES;
    public static final KClassImpl$MemberBelonginess DECLARED = new KClassImpl$MemberBelonginess("DECLARED", 0);
    public static final KClassImpl$MemberBelonginess INHERITED = new KClassImpl$MemberBelonginess("INHERITED", 1);

    private static final /* synthetic */ KClassImpl$MemberBelonginess[] $values() {
        return new KClassImpl$MemberBelonginess[]{DECLARED, INHERITED};
    }

    static {
        KClassImpl$MemberBelonginess[] kClassImpl$MemberBelonginessArr$values = $values();
        $VALUES = kClassImpl$MemberBelonginessArr$values;
        $ENTRIES = AbstractC5196.m9425(kClassImpl$MemberBelonginessArr$values);
    }

    private KClassImpl$MemberBelonginess(String str, int i) {
    }

    public static KClassImpl$MemberBelonginess valueOf(String str) {
        return (KClassImpl$MemberBelonginess) Enum.valueOf(KClassImpl$MemberBelonginess.class, str);
    }

    public static KClassImpl$MemberBelonginess[] values() {
        return (KClassImpl$MemberBelonginess[]) $VALUES.clone();
    }

    public final boolean accept(InterfaceC5312 member) {
        member.getClass();
        return member.getKind().isReal() == (this == DECLARED);
    }
}
