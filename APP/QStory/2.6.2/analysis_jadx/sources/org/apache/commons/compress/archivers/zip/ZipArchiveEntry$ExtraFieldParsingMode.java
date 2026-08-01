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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveEntry$ExtraFieldParsingMode implements InterfaceC5595 {
    private static final /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode[] $VALUES;
    public static final ZipArchiveEntry$ExtraFieldParsingMode BEST_EFFORT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode DRACONIC;
    public static final ZipArchiveEntry$ExtraFieldParsingMode ONLY_PARSEABLE_LENIENT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode ONLY_PARSEABLE_STRICT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode STRICT_FOR_KNOW_EXTRA_FIELDS;
    private final C5613 onUnparseableData;

    private static /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode[] $values() {
        return new ZipArchiveEntry$ExtraFieldParsingMode[]{BEST_EFFORT, STRICT_FOR_KNOW_EXTRA_FIELDS, ONLY_PARSEABLE_LENIENT, ONLY_PARSEABLE_STRICT, DRACONIC};
    }

    static {
        C5613 c5613 = C5613.f15466;
        BEST_EFFORT = new ZipArchiveEntry$ExtraFieldParsingMode("BEST_EFFORT", 0, c5613) { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode.1
            {
                AbstractC5585 abstractC5585 = null;
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.InterfaceC5595
            public InterfaceC5588 fill(InterfaceC5588 interfaceC5588, byte[] bArr, int i, int i2, boolean z) {
                return ZipArchiveEntry$ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(interfaceC5588, bArr, i, i2, z);
            }
        };
        STRICT_FOR_KNOW_EXTRA_FIELDS = new ZipArchiveEntry$ExtraFieldParsingMode("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, c5613);
        C5613 c56132 = C5613.f15468;
        ONLY_PARSEABLE_LENIENT = new ZipArchiveEntry$ExtraFieldParsingMode("ONLY_PARSEABLE_LENIENT", 2, c56132) { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode.2
            {
                AbstractC5585 abstractC5585 = null;
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.InterfaceC5595
            public InterfaceC5588 fill(InterfaceC5588 interfaceC5588, byte[] bArr, int i, int i2, boolean z) {
                return ZipArchiveEntry$ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(interfaceC5588, bArr, i, i2, z);
            }
        };
        ONLY_PARSEABLE_STRICT = new ZipArchiveEntry$ExtraFieldParsingMode("ONLY_PARSEABLE_STRICT", 3, c56132);
        DRACONIC = new ZipArchiveEntry$ExtraFieldParsingMode("DRACONIC", 4, C5613.f15467);
        $VALUES = $values();
    }

    private ZipArchiveEntry$ExtraFieldParsingMode(String str, int i, C5613 c5613) {
        this.onUnparseableData = c5613;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC5588 fillAndMakeUnrecognizedOnError(InterfaceC5588 interfaceC5588, byte[] bArr, int i, int i2, boolean z) {
        try {
            AbstractC5612.m10918(interfaceC5588, bArr, i, i2, z);
            return interfaceC5588;
        } catch (ZipException unused) {
            C5609 c5609 = new C5609();
            c5609.f15462 = interfaceC5588.getHeaderId();
            if (z) {
                c5609.f15460 = AbstractC5580.m10889(Arrays.copyOfRange(bArr, i, i2 + i));
            } else {
                c5609.f15461 = AbstractC5580.m10889(Arrays.copyOfRange(bArr, i, i2 + i));
            }
            return c5609;
        }
    }

    public static ZipArchiveEntry$ExtraFieldParsingMode valueOf(String str) {
        return (ZipArchiveEntry$ExtraFieldParsingMode) Enum.valueOf(ZipArchiveEntry$ExtraFieldParsingMode.class, str);
    }

    public static ZipArchiveEntry$ExtraFieldParsingMode[] values() {
        return (ZipArchiveEntry$ExtraFieldParsingMode[]) $VALUES.clone();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5595
    public InterfaceC5588 createExtraField(ZipShort zipShort) {
        Supplier supplier = (Supplier) AbstractC5612.f15465.get(zipShort);
        InterfaceC5588 interfaceC5588 = supplier != null ? (InterfaceC5588) supplier.get() : null;
        if (interfaceC5588 != null) {
            return interfaceC5588;
        }
        C5609 c5609 = new C5609();
        c5609.f15462 = zipShort;
        return c5609;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5595
    public InterfaceC5588 fill(InterfaceC5588 interfaceC5588, byte[] bArr, int i, int i2, boolean z) {
        AbstractC5612.m10918(interfaceC5588, bArr, i, i2, z);
        return interfaceC5588;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5611
    public InterfaceC5588 onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) {
        return this.onUnparseableData.onUnparseableExtraField(bArr, i, i2, z, i3);
    }

    public /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode(String str, int i, C5613 c5613, AbstractC5585 abstractC5585) {
        this(str, i, c5613);
    }
}
