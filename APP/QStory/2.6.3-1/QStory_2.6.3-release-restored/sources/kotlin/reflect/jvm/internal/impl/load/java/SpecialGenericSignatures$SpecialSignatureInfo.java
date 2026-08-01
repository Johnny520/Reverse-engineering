package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class SpecialGenericSignatures$SpecialSignatureInfo {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ SpecialGenericSignatures$SpecialSignatureInfo[] $VALUES;
    private final boolean isObjectReplacedWithTypeParameter;
    private final String valueParametersSignature;
    public static final SpecialGenericSignatures$SpecialSignatureInfo ONE_COLLECTION_PARAMETER = new SpecialGenericSignatures$SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
    public static final SpecialGenericSignatures$SpecialSignatureInfo OBJECT_PARAMETER_NON_GENERIC = new SpecialGenericSignatures$SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
    public static final SpecialGenericSignatures$SpecialSignatureInfo OBJECT_PARAMETER_GENERIC = new SpecialGenericSignatures$SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, true);

    private static final /* synthetic */ SpecialGenericSignatures$SpecialSignatureInfo[] $values() {
        return new SpecialGenericSignatures$SpecialSignatureInfo[]{ONE_COLLECTION_PARAMETER, OBJECT_PARAMETER_NON_GENERIC, OBJECT_PARAMETER_GENERIC};
    }

    static {
        SpecialGenericSignatures$SpecialSignatureInfo[] specialGenericSignatures$SpecialSignatureInfoArr$values = $values();
        $VALUES = specialGenericSignatures$SpecialSignatureInfoArr$values;
        $ENTRIES = AbstractC5196.m9425(specialGenericSignatures$SpecialSignatureInfoArr$values);
    }

    private SpecialGenericSignatures$SpecialSignatureInfo(String str, int i, String str2, boolean z) {
        this.valueParametersSignature = str2;
        this.isObjectReplacedWithTypeParameter = z;
    }

    public static SpecialGenericSignatures$SpecialSignatureInfo valueOf(String str) {
        return (SpecialGenericSignatures$SpecialSignatureInfo) Enum.valueOf(SpecialGenericSignatures$SpecialSignatureInfo.class, str);
    }

    public static SpecialGenericSignatures$SpecialSignatureInfo[] values() {
        return (SpecialGenericSignatures$SpecialSignatureInfo[]) $VALUES.clone();
    }
}
