package org.apache.commons.compress.archivers.zip;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.zip.ZipException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BEST_EFFORT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveEntry$ExtraFieldParsingMode implements InterfaceC5596 {
    private static final /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode[] $VALUES;
    public static final ZipArchiveEntry$ExtraFieldParsingMode BEST_EFFORT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode DRACONIC;
    public static final ZipArchiveEntry$ExtraFieldParsingMode ONLY_PARSEABLE_LENIENT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode ONLY_PARSEABLE_STRICT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode STRICT_FOR_KNOW_EXTRA_FIELDS;
    private final C5614 onUnparseableData;

    private static /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode[] $values() {
        return new ZipArchiveEntry$ExtraFieldParsingMode[]{BEST_EFFORT, STRICT_FOR_KNOW_EXTRA_FIELDS, ONLY_PARSEABLE_LENIENT, ONLY_PARSEABLE_STRICT, DRACONIC};
    }

    static {
        C5614 c5614 = C5614.f15466;
        BEST_EFFORT = new ZipArchiveEntry$ExtraFieldParsingMode("BEST_EFFORT", 0, c5614) { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode.1
            {
                AbstractC5586 abstractC5586 = null;
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.InterfaceC5596
            public InterfaceC5589 fill(InterfaceC5589 interfaceC5589, byte[] bArr, int i, int i2, boolean z) {
                return ZipArchiveEntry$ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(interfaceC5589, bArr, i, i2, z);
            }
        };
        STRICT_FOR_KNOW_EXTRA_FIELDS = new ZipArchiveEntry$ExtraFieldParsingMode("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, c5614);
        C5614 c56142 = C5614.f15468;
        ONLY_PARSEABLE_LENIENT = new ZipArchiveEntry$ExtraFieldParsingMode("ONLY_PARSEABLE_LENIENT", 2, c56142) { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode.2
            {
                AbstractC5586 abstractC5586 = null;
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.InterfaceC5596
            public InterfaceC5589 fill(InterfaceC5589 interfaceC5589, byte[] bArr, int i, int i2, boolean z) {
                return ZipArchiveEntry$ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(interfaceC5589, bArr, i, i2, z);
            }
        };
        ONLY_PARSEABLE_STRICT = new ZipArchiveEntry$ExtraFieldParsingMode("ONLY_PARSEABLE_STRICT", 3, c56142);
        DRACONIC = new ZipArchiveEntry$ExtraFieldParsingMode("DRACONIC", 4, C5614.f15467);
        $VALUES = $values();
    }

    private ZipArchiveEntry$ExtraFieldParsingMode(String str, int i, C5614 c5614) {
        this.onUnparseableData = c5614;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC5589 fillAndMakeUnrecognizedOnError(InterfaceC5589 interfaceC5589, byte[] bArr, int i, int i2, boolean z) {
        try {
            AbstractC5613.m10975(interfaceC5589, bArr, i, i2, z);
            return interfaceC5589;
        } catch (ZipException unused) {
            C5610 c5610 = new C5610();
            c5610.f15462 = interfaceC5589.getHeaderId();
            if (z) {
                c5610.f15460 = AbstractC5581.m10946(Arrays.copyOfRange(bArr, i, i2 + i));
            } else {
                c5610.f15461 = AbstractC5581.m10946(Arrays.copyOfRange(bArr, i, i2 + i));
            }
            return c5610;
        }
    }

    public static ZipArchiveEntry$ExtraFieldParsingMode valueOf(String str) {
        return (ZipArchiveEntry$ExtraFieldParsingMode) Enum.valueOf(ZipArchiveEntry$ExtraFieldParsingMode.class, str);
    }

    public static ZipArchiveEntry$ExtraFieldParsingMode[] values() {
        return (ZipArchiveEntry$ExtraFieldParsingMode[]) $VALUES.clone();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5596
    public InterfaceC5589 createExtraField(ZipShort zipShort) {
        Supplier supplier = (Supplier) AbstractC5613.f15465.get(zipShort);
        InterfaceC5589 interfaceC5589 = supplier != null ? (InterfaceC5589) supplier.get() : null;
        if (interfaceC5589 != null) {
            return interfaceC5589;
        }
        C5610 c5610 = new C5610();
        c5610.f15462 = zipShort;
        return c5610;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5596
    public InterfaceC5589 fill(InterfaceC5589 interfaceC5589, byte[] bArr, int i, int i2, boolean z) {
        AbstractC5613.m10975(interfaceC5589, bArr, i, i2, z);
        return interfaceC5589;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5612
    public InterfaceC5589 onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) {
        return this.onUnparseableData.onUnparseableExtraField(bArr, i, i2, z, i3);
    }

    public /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode(String str, int i, C5614 c5614, AbstractC5586 abstractC5586) {
        this(str, i, c5614);
    }
}
