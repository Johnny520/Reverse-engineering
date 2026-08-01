.class public final enum Lcom/alibaba/fastjson2/JSONReader$Feature;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/fastjson2/JSONReader$Feature;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum DisableReferenceDetect:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum ErrorOnUnknownProperties:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum IgnoreAutoTypeNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum NonStringKeyAsString:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum SupportClassForName:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum UseBigDecimalForDoubles:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum UseBigDecimalForFloats:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum UseDefaultConstructorAsPossible:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum UseDoubleForDecimals:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum UseLongForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

.field public static final enum UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;


# instance fields
.field public final mask:J


# direct methods
.method private static synthetic $values()[Lcom/alibaba/fastjson2/JSONReader$Feature;
    .locals 36

    .line 1
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 4
    .line 5
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 8
    .line 9
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 10
    .line 11
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 12
    .line 13
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 14
    .line 15
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 16
    .line 17
    sget-object v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportClassForName:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 18
    .line 19
    sget-object v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 20
    .line 21
    sget-object v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDefaultConstructorAsPossible:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 22
    .line 23
    sget-object v12, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForFloats:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 24
    .line 25
    sget-object v13, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForDoubles:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 26
    .line 27
    sget-object v14, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 28
    .line 29
    sget-object v15, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 30
    .line 31
    sget-object v16, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 32
    .line 33
    sget-object v17, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 34
    .line 35
    sget-object v18, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 36
    .line 37
    sget-object v19, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonStringKeyAsString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 38
    .line 39
    sget-object v20, Lcom/alibaba/fastjson2/JSONReader$Feature;->Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 40
    .line 41
    sget-object v21, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 42
    .line 43
    sget-object v22, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 44
    .line 45
    sget-object v23, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 46
    .line 47
    sget-object v24, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreAutoTypeNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 48
    .line 49
    sget-object v25, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 50
    .line 51
    sget-object v26, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 52
    .line 53
    sget-object v27, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnUnknownProperties:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 54
    .line 55
    sget-object v28, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 56
    .line 57
    sget-object v29, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 58
    .line 59
    sget-object v30, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 60
    .line 61
    sget-object v31, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseLongForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 62
    .line 63
    sget-object v32, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 64
    .line 65
    sget-object v33, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDoubleForDecimals:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 66
    .line 67
    sget-object v34, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableReferenceDetect:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 68
    .line 69
    sget-object v35, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 70
    .line 71
    filled-new-array/range {v1 .. v35}, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const-string v4, "FieldBased"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 12
    .line 13
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-wide/16 v2, 0x2

    .line 17
    .line 18
    const-string v4, "IgnoreNoneSerializable"

    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 24
    .line 25
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-wide/16 v2, 0x4

    .line 29
    .line 30
    const-string v4, "ErrorOnNoneSerializable"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 36
    .line 37
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-wide/16 v2, 0x8

    .line 41
    .line 42
    const-string v4, "SupportArrayToBean"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 48
    .line 49
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-wide/16 v2, 0x10

    .line 53
    .line 54
    const-string v4, "InitStringFieldAsEmpty"

    .line 55
    .line 56
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 60
    .line 61
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-wide/16 v2, 0x20

    .line 65
    .line 66
    const-string v4, "SupportAutoType"

    .line 67
    .line 68
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 72
    .line 73
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-wide/16 v2, 0x40

    .line 77
    .line 78
    const-string v4, "SupportSmartMatch"

    .line 79
    .line 80
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 84
    .line 85
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    const-wide/16 v2, 0x80

    .line 89
    .line 90
    const-string v4, "UseNativeObject"

    .line 91
    .line 92
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 96
    .line 97
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 98
    .line 99
    const/16 v1, 0x8

    .line 100
    .line 101
    const-wide/16 v2, 0x100

    .line 102
    .line 103
    const-string v4, "SupportClassForName"

    .line 104
    .line 105
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportClassForName:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 109
    .line 110
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 111
    .line 112
    const/16 v1, 0x9

    .line 113
    .line 114
    const-wide/16 v2, 0x200

    .line 115
    .line 116
    const-string v4, "IgnoreSetNullValue"

    .line 117
    .line 118
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 119
    .line 120
    .line 121
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 122
    .line 123
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 124
    .line 125
    const/16 v1, 0xa

    .line 126
    .line 127
    const-wide/16 v2, 0x400

    .line 128
    .line 129
    const-string v4, "UseDefaultConstructorAsPossible"

    .line 130
    .line 131
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDefaultConstructorAsPossible:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 135
    .line 136
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 137
    .line 138
    const/16 v1, 0xb

    .line 139
    .line 140
    const-wide/16 v2, 0x800

    .line 141
    .line 142
    const-string v4, "UseBigDecimalForFloats"

    .line 143
    .line 144
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForFloats:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 148
    .line 149
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 150
    .line 151
    const/16 v1, 0xc

    .line 152
    .line 153
    const-wide/16 v2, 0x1000

    .line 154
    .line 155
    const-string v4, "UseBigDecimalForDoubles"

    .line 156
    .line 157
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 158
    .line 159
    .line 160
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForDoubles:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 161
    .line 162
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 163
    .line 164
    const/16 v1, 0xd

    .line 165
    .line 166
    const-wide/16 v2, 0x2000

    .line 167
    .line 168
    const-string v4, "ErrorOnEnumNotMatch"

    .line 169
    .line 170
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 171
    .line 172
    .line 173
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 174
    .line 175
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 176
    .line 177
    const/16 v1, 0xe

    .line 178
    .line 179
    const-wide/16 v2, 0x4000

    .line 180
    .line 181
    const-string v4, "TrimString"

    .line 182
    .line 183
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 184
    .line 185
    .line 186
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 187
    .line 188
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 189
    .line 190
    const/16 v1, 0xf

    .line 191
    .line 192
    const-wide/32 v2, 0x8000

    .line 193
    .line 194
    .line 195
    const-string v4, "ErrorOnNotSupportAutoType"

    .line 196
    .line 197
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 198
    .line 199
    .line 200
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 201
    .line 202
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 203
    .line 204
    const/16 v1, 0x10

    .line 205
    .line 206
    const-wide/32 v2, 0x10000

    .line 207
    .line 208
    .line 209
    const-string v4, "DuplicateKeyValueAsArray"

    .line 210
    .line 211
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 212
    .line 213
    .line 214
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 215
    .line 216
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 217
    .line 218
    const/16 v1, 0x11

    .line 219
    .line 220
    const-wide/32 v2, 0x20000

    .line 221
    .line 222
    .line 223
    const-string v4, "AllowUnQuotedFieldNames"

    .line 224
    .line 225
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 226
    .line 227
    .line 228
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 229
    .line 230
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 231
    .line 232
    const/16 v1, 0x12

    .line 233
    .line 234
    const-wide/32 v2, 0x40000

    .line 235
    .line 236
    .line 237
    const-string v4, "NonStringKeyAsString"

    .line 238
    .line 239
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 240
    .line 241
    .line 242
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonStringKeyAsString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 243
    .line 244
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 245
    .line 246
    const/16 v1, 0x13

    .line 247
    .line 248
    const-wide/32 v2, 0x80000

    .line 249
    .line 250
    .line 251
    const-string v4, "Base64StringAsByteArray"

    .line 252
    .line 253
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 254
    .line 255
    .line 256
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 257
    .line 258
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 259
    .line 260
    const/16 v1, 0x14

    .line 261
    .line 262
    const-wide/32 v2, 0x100000

    .line 263
    .line 264
    .line 265
    const-string v4, "IgnoreCheckClose"

    .line 266
    .line 267
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 268
    .line 269
    .line 270
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 271
    .line 272
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 273
    .line 274
    const/16 v1, 0x15

    .line 275
    .line 276
    const-wide/32 v2, 0x200000

    .line 277
    .line 278
    .line 279
    const-string v4, "ErrorOnNullForPrimitives"

    .line 280
    .line 281
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 282
    .line 283
    .line 284
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 285
    .line 286
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 287
    .line 288
    const/16 v1, 0x16

    .line 289
    .line 290
    const-wide/32 v2, 0x400000

    .line 291
    .line 292
    .line 293
    const-string v4, "NullOnError"

    .line 294
    .line 295
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 296
    .line 297
    .line 298
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 299
    .line 300
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 301
    .line 302
    const/16 v1, 0x17

    .line 303
    .line 304
    const-wide/32 v2, 0x800000

    .line 305
    .line 306
    .line 307
    const-string v4, "IgnoreAutoTypeNotMatch"

    .line 308
    .line 309
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 310
    .line 311
    .line 312
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreAutoTypeNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 313
    .line 314
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 315
    .line 316
    const/16 v1, 0x18

    .line 317
    .line 318
    const-wide/32 v2, 0x1000000

    .line 319
    .line 320
    .line 321
    const-string v4, "NonZeroNumberCastToBooleanAsTrue"

    .line 322
    .line 323
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 324
    .line 325
    .line 326
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 327
    .line 328
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 329
    .line 330
    const/16 v1, 0x19

    .line 331
    .line 332
    const-wide/32 v2, 0x2000000

    .line 333
    .line 334
    .line 335
    const-string v4, "IgnoreNullPropertyValue"

    .line 336
    .line 337
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 338
    .line 339
    .line 340
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 341
    .line 342
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 343
    .line 344
    const/16 v1, 0x1a

    .line 345
    .line 346
    const-wide/32 v2, 0x4000000

    .line 347
    .line 348
    .line 349
    const-string v4, "ErrorOnUnknownProperties"

    .line 350
    .line 351
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 352
    .line 353
    .line 354
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnUnknownProperties:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 355
    .line 356
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 357
    .line 358
    const/16 v1, 0x1b

    .line 359
    .line 360
    const-wide/32 v2, 0x8000000

    .line 361
    .line 362
    .line 363
    const-string v4, "EmptyStringAsNull"

    .line 364
    .line 365
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 366
    .line 367
    .line 368
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 369
    .line 370
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 371
    .line 372
    const/16 v1, 0x1c

    .line 373
    .line 374
    const-wide/32 v2, 0x10000000

    .line 375
    .line 376
    .line 377
    const-string v4, "NonErrorOnNumberOverflow"

    .line 378
    .line 379
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 380
    .line 381
    .line 382
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 383
    .line 384
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 385
    .line 386
    const/16 v1, 0x1d

    .line 387
    .line 388
    const-wide/32 v2, 0x20000000

    .line 389
    .line 390
    .line 391
    const-string v4, "UseBigIntegerForInts"

    .line 392
    .line 393
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 394
    .line 395
    .line 396
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 397
    .line 398
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 399
    .line 400
    const/16 v1, 0x1e

    .line 401
    .line 402
    const-wide/32 v2, 0x40000000

    .line 403
    .line 404
    .line 405
    const-string v4, "UseLongForInts"

    .line 406
    .line 407
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 408
    .line 409
    .line 410
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseLongForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 411
    .line 412
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 413
    .line 414
    const/16 v1, 0x1f

    .line 415
    .line 416
    const-wide v2, 0x80000000L

    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    const-string v4, "DisableSingleQuote"

    .line 422
    .line 423
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 424
    .line 425
    .line 426
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 427
    .line 428
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 429
    .line 430
    const/16 v1, 0x20

    .line 431
    .line 432
    const-wide v2, 0x100000000L

    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    const-string v4, "UseDoubleForDecimals"

    .line 438
    .line 439
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 440
    .line 441
    .line 442
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDoubleForDecimals:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 443
    .line 444
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 445
    .line 446
    const/16 v1, 0x21

    .line 447
    .line 448
    const-wide v2, 0x200000000L

    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    const-string v4, "DisableReferenceDetect"

    .line 454
    .line 455
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 456
    .line 457
    .line 458
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableReferenceDetect:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 459
    .line 460
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 461
    .line 462
    const/16 v1, 0x22

    .line 463
    .line 464
    const-wide v2, 0x400000000L

    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    const-string v4, "DisableStringArrayUnwrapping"

    .line 470
    .line 471
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 472
    .line 473
    .line 474
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 475
    .line 476
    invoke-static {}, Lcom/alibaba/fastjson2/JSONReader$Feature;->$values()[Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->$VALUES:[Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 481
    .line 482
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 5
    .line 6
    return-void
.end method

.method public static isEnabled(JLcom/alibaba/fastjson2/JSONReader$Feature;)Z
    .locals 2

    .line 15
    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static of([Lcom/alibaba/fastjson2/JSONReader$Feature;)J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    array-length v2, p0

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v2, :cond_1

    .line 9
    .line 10
    aget-object v4, p0, v3

    .line 11
    .line 12
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 13
    .line 14
    or-long/2addr v0, v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return-wide v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader$Feature;
    .locals 1

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/alibaba/fastjson2/JSONReader$Feature;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->$VALUES:[Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/alibaba/fastjson2/JSONReader$Feature;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isEnabled(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 2
    .line 3
    and-long p0, p1, v0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long p0, p0, v0

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method
