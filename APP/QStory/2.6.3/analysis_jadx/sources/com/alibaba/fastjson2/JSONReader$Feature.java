package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum JSONReader$Feature {
    FieldBased(1),
    IgnoreNoneSerializable(2),
    ErrorOnNoneSerializable(4),
    SupportArrayToBean(8),
    InitStringFieldAsEmpty(16),
    SupportAutoType(32),
    SupportSmartMatch(64),
    UseNativeObject(128),
    SupportClassForName(256),
    IgnoreSetNullValue(512),
    UseDefaultConstructorAsPossible(1024),
    UseBigDecimalForFloats(2048),
    UseBigDecimalForDoubles(4096),
    ErrorOnEnumNotMatch(8192),
    TrimString(16384),
    ErrorOnNotSupportAutoType(32768),
    DuplicateKeyValueAsArray(65536),
    AllowUnQuotedFieldNames(131072),
    NonStringKeyAsString(262144),
    Base64StringAsByteArray(524288),
    IgnoreCheckClose(1048576),
    ErrorOnNullForPrimitives(2097152),
    NullOnError(4194304),
    IgnoreAutoTypeNotMatch(8388608),
    NonZeroNumberCastToBooleanAsTrue(16777216),
    IgnoreNullPropertyValue(33554432),
    ErrorOnUnknownProperties(67108864),
    EmptyStringAsNull(134217728),
    NonErrorOnNumberOverflow(268435456),
    UseBigIntegerForInts(536870912),
    UseLongForInts(1073741824),
    DisableSingleQuote(2147483648L),
    UseDoubleForDecimals(4294967296L),
    DisableReferenceDetect(8589934592L),
    DisableStringArrayUnwrapping(17179869184L);

    public final long mask;

    JSONReader$Feature(long j) {
        this.mask = j;
    }

    public static long of(JSONReader$Feature[] jSONReader$FeatureArr) {
        long j = 0;
        if (jSONReader$FeatureArr == null) {
            return 0L;
        }
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
        }
        return j;
    }

    public boolean isEnabled(long j) {
        return (j & this.mask) != 0;
    }

    public static boolean isEnabled(long j, JSONReader$Feature jSONReader$Feature) {
        return (j & jSONReader$Feature.mask) != 0;
    }
}
