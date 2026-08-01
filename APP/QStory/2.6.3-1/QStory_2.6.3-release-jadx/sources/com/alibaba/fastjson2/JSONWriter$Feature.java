package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum JSONWriter$Feature {
    FieldBased(1),
    IgnoreNoneSerializable(2),
    ErrorOnNoneSerializable(4),
    BeanToArray(8),
    WriteNulls(16),
    WriteMapNullValue(16),
    BrowserCompatible(32),
    NullAsDefaultValue(64),
    WriteBooleanAsNumber(128),
    WriteNonStringValueAsString(256),
    WriteClassName(512),
    NotWriteRootClassName(1024),
    NotWriteHashMapArrayListClassName(2048),
    NotWriteDefaultValue(4096),
    WriteEnumsUsingName(8192),
    WriteEnumUsingToString(16384),
    IgnoreErrorGetter(32768),
    PrettyFormat(65536),
    ReferenceDetection(131072),
    WriteNameAsSymbol(262144),
    WriteBigDecimalAsPlain(524288),
    UseSingleQuotes(1048576),
    MapSortField(2097152),
    WriteNullListAsEmpty(4194304),
    WriteNullStringAsEmpty(8388608),
    WriteNullNumberAsZero(16777216),
    WriteNullBooleanAsFalse(33554432),
    NotWriteEmptyArray(67108864),
    IgnoreEmpty(67108864),
    WriteNonStringKeyAsString(134217728),
    WritePairAsJavaBean(268435456),
    OptimizedForAscii(536870912),
    EscapeNoneAscii(1073741824),
    WriteByteArrayAsBase64(2147483648L),
    IgnoreNonFieldGetter(4294967296L),
    LargeObject(8589934592L),
    WriteLongAsString(17179869184L),
    BrowserSecure(34359738368L),
    WriteEnumUsingOrdinal(68719476736L),
    WriteThrowableClassName(137438953472L),
    UnquoteFieldName(274877906944L),
    NotWriteSetClassName(549755813888L),
    NotWriteNumberClassName(1099511627776L),
    SortMapEntriesByKeys(2199023255552L),
    PrettyFormatWith2Space(4398046511104L),
    PrettyFormatWith4Space(8796093022208L),
    WriterUtilDateAsMillis(17592186044416L);

    public final long mask;

    JSONWriter$Feature(long j) {
        this.mask = j;
    }

    public boolean isEnabled(long j) {
        return (j & this.mask) != 0;
    }
}
