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
public class ZipArchiveEntry$ExtraFieldParsingMode implements InterfaceC6426 {
    private static final /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode[] $VALUES;
    public static final ZipArchiveEntry$ExtraFieldParsingMode BEST_EFFORT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode DRACONIC;
    public static final ZipArchiveEntry$ExtraFieldParsingMode ONLY_PARSEABLE_LENIENT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode ONLY_PARSEABLE_STRICT;
    public static final ZipArchiveEntry$ExtraFieldParsingMode STRICT_FOR_KNOW_EXTRA_FIELDS;
    private final C6444 onUnparseableData;

    private static /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode[] $values() {
        return new ZipArchiveEntry$ExtraFieldParsingMode[]{BEST_EFFORT, STRICT_FOR_KNOW_EXTRA_FIELDS, ONLY_PARSEABLE_LENIENT, ONLY_PARSEABLE_STRICT, DRACONIC};
    }

    static {
        C6444 c6444 = C6444.f15811;
        BEST_EFFORT = new ZipArchiveEntry$ExtraFieldParsingMode("BEST_EFFORT", 0, c6444) { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode.1
            {
                AbstractC6416 abstractC6416 = null;
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.InterfaceC6426
            public InterfaceC6419 fill(InterfaceC6419 interfaceC6419, byte[] bArr, int i, int i2, boolean z) {
                return ZipArchiveEntry$ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(interfaceC6419, bArr, i, i2, z);
            }
        };
        STRICT_FOR_KNOW_EXTRA_FIELDS = new ZipArchiveEntry$ExtraFieldParsingMode("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, c6444);
        C6444 c64442 = C6444.f15813;
        ONLY_PARSEABLE_LENIENT = new ZipArchiveEntry$ExtraFieldParsingMode("ONLY_PARSEABLE_LENIENT", 2, c64442) { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode.2
            {
                AbstractC6416 abstractC6416 = null;
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.InterfaceC6426
            public InterfaceC6419 fill(InterfaceC6419 interfaceC6419, byte[] bArr, int i, int i2, boolean z) {
                return ZipArchiveEntry$ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(interfaceC6419, bArr, i, i2, z);
            }
        };
        ONLY_PARSEABLE_STRICT = new ZipArchiveEntry$ExtraFieldParsingMode("ONLY_PARSEABLE_STRICT", 3, c64442);
        DRACONIC = new ZipArchiveEntry$ExtraFieldParsingMode("DRACONIC", 4, C6444.f15812);
        $VALUES = $values();
    }

    private ZipArchiveEntry$ExtraFieldParsingMode(String str, int i, C6444 c6444) {
        this.onUnparseableData = c6444;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC6419 fillAndMakeUnrecognizedOnError(InterfaceC6419 interfaceC6419, byte[] bArr, int i, int i2, boolean z) {
        try {
            AbstractC6443.m11534(interfaceC6419, bArr, i, i2, z);
            return interfaceC6419;
        } catch (ZipException unused) {
            C6440 c6440 = new C6440();
            c6440.f15807 = interfaceC6419.getHeaderId();
            if (z) {
                c6440.f15805 = AbstractC6411.m11505(Arrays.copyOfRange(bArr, i, i2 + i));
            } else {
                c6440.f15806 = AbstractC6411.m11505(Arrays.copyOfRange(bArr, i, i2 + i));
            }
            return c6440;
        }
    }

    public static ZipArchiveEntry$ExtraFieldParsingMode valueOf(String str) {
        return (ZipArchiveEntry$ExtraFieldParsingMode) Enum.valueOf(ZipArchiveEntry$ExtraFieldParsingMode.class, str);
    }

    public static ZipArchiveEntry$ExtraFieldParsingMode[] values() {
        return (ZipArchiveEntry$ExtraFieldParsingMode[]) $VALUES.clone();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6426
    public InterfaceC6419 createExtraField(ZipShort zipShort) {
        Supplier supplier = (Supplier) AbstractC6443.f15810.get(zipShort);
        InterfaceC6419 interfaceC6419 = supplier != null ? (InterfaceC6419) supplier.get() : null;
        if (interfaceC6419 != null) {
            return interfaceC6419;
        }
        C6440 c6440 = new C6440();
        c6440.f15807 = zipShort;
        return c6440;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6426
    public InterfaceC6419 fill(InterfaceC6419 interfaceC6419, byte[] bArr, int i, int i2, boolean z) {
        AbstractC6443.m11534(interfaceC6419, bArr, i, i2, z);
        return interfaceC6419;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6442
    public InterfaceC6419 onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) {
        return this.onUnparseableData.onUnparseableExtraField(bArr, i, i2, z, i3);
    }

    public /* synthetic */ ZipArchiveEntry$ExtraFieldParsingMode(String str, int i, C6444 c6444, AbstractC6416 abstractC6416) {
        this(str, i, c6444);
    }
}
