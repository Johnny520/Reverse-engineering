package kotlin.io.encoding;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"kotlin/io/encoding/Base64$PaddingOption", "", "Lkotlin/io/encoding/Base64$PaddingOption;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Base64$PaddingOption {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Base64$PaddingOption[] $VALUES;
    public static final Base64$PaddingOption PRESENT = new Base64$PaddingOption("PRESENT", 0);
    public static final Base64$PaddingOption ABSENT = new Base64$PaddingOption("ABSENT", 1);
    public static final Base64$PaddingOption PRESENT_OPTIONAL = new Base64$PaddingOption("PRESENT_OPTIONAL", 2);
    public static final Base64$PaddingOption ABSENT_OPTIONAL = new Base64$PaddingOption("ABSENT_OPTIONAL", 3);

    private static final /* synthetic */ Base64$PaddingOption[] $values() {
        return new Base64$PaddingOption[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
    }

    static {
        Base64$PaddingOption[] base64$PaddingOptionArr$values = $values();
        $VALUES = base64$PaddingOptionArr$values;
        $ENTRIES = AbstractC4364.m8866(base64$PaddingOptionArr$values);
    }

    private Base64$PaddingOption(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static Base64$PaddingOption valueOf(String str) {
        return (Base64$PaddingOption) Enum.valueOf(Base64$PaddingOption.class, str);
    }

    public static Base64$PaddingOption[] values() {
        return (Base64$PaddingOption[]) $VALUES.clone();
    }
}
