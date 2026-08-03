.class public final enum Lcom/alibaba/fastjson2/JSONReader$Feature;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Feature"
.end annotation

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
.method static constructor <clinit>()V
    .locals 39

    .line 1
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const-string v4, "FieldBased"

    .line 7
    .line 8
    invoke-direct {v1, v4, v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 12
    .line 13
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    const-wide/16 v3, 0x2

    .line 17
    .line 18
    const-string v5, "IgnoreNoneSerializable"

    .line 19
    .line 20
    invoke-direct {v2, v5, v0, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 24
    .line 25
    new-instance v3, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    const-wide/16 v4, 0x4

    .line 29
    .line 30
    const-string v6, "ErrorOnNoneSerializable"

    .line 31
    .line 32
    invoke-direct {v3, v6, v0, v4, v5}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    sput-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 36
    .line 37
    new-instance v4, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    const-wide/16 v5, 0x8

    .line 41
    .line 42
    const-string v7, "SupportArrayToBean"

    .line 43
    .line 44
    invoke-direct {v4, v7, v0, v5, v6}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 48
    .line 49
    new-instance v5, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 50
    .line 51
    const/4 v0, 0x4

    .line 52
    const-wide/16 v6, 0x10

    .line 53
    .line 54
    const-string v8, "InitStringFieldAsEmpty"

    .line 55
    .line 56
    invoke-direct {v5, v8, v0, v6, v7}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 60
    .line 61
    new-instance v6, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 62
    .line 63
    const/4 v0, 0x5

    .line 64
    const-wide/16 v7, 0x20

    .line 65
    .line 66
    const-string v9, "SupportAutoType"

    .line 67
    .line 68
    invoke-direct {v6, v9, v0, v7, v8}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 69
    .line 70
    .line 71
    sput-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 72
    .line 73
    new-instance v7, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 74
    .line 75
    const/4 v0, 0x6

    .line 76
    const-wide/16 v8, 0x40

    .line 77
    .line 78
    const-string v10, "SupportSmartMatch"

    .line 79
    .line 80
    invoke-direct {v7, v10, v0, v8, v9}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 81
    .line 82
    .line 83
    sput-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 84
    .line 85
    new-instance v8, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 86
    .line 87
    const/4 v0, 0x7

    .line 88
    const-wide/16 v9, 0x80

    .line 89
    .line 90
    const-string v11, "UseNativeObject"

    .line 91
    .line 92
    invoke-direct {v8, v11, v0, v9, v10}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 93
    .line 94
    .line 95
    sput-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 96
    .line 97
    new-instance v9, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 98
    .line 99
    const/16 v0, 0x8

    .line 100
    .line 101
    const-wide/16 v10, 0x100

    .line 102
    .line 103
    const-string v12, "SupportClassForName"

    .line 104
    .line 105
    invoke-direct {v9, v12, v0, v10, v11}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 106
    .line 107
    .line 108
    sput-object v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportClassForName:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 109
    .line 110
    new-instance v10, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 111
    .line 112
    const/16 v0, 0x9

    .line 113
    .line 114
    const-wide/16 v11, 0x200

    .line 115
    .line 116
    const-string v13, "IgnoreSetNullValue"

    .line 117
    .line 118
    invoke-direct {v10, v13, v0, v11, v12}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 119
    .line 120
    .line 121
    sput-object v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 122
    .line 123
    new-instance v11, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 124
    .line 125
    const/16 v0, 0xa

    .line 126
    .line 127
    const-wide/16 v12, 0x400

    .line 128
    .line 129
    const-string v14, "UseDefaultConstructorAsPossible"

    .line 130
    .line 131
    invoke-direct {v11, v14, v0, v12, v13}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 132
    .line 133
    .line 134
    sput-object v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDefaultConstructorAsPossible:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 135
    .line 136
    new-instance v12, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 137
    .line 138
    const/16 v0, 0xb

    .line 139
    .line 140
    const-wide/16 v13, 0x800

    .line 141
    .line 142
    const-string v15, "UseBigDecimalForFloats"

    .line 143
    .line 144
    invoke-direct {v12, v15, v0, v13, v14}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 145
    .line 146
    .line 147
    sput-object v12, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForFloats:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 148
    .line 149
    new-instance v13, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 150
    .line 151
    const/16 v0, 0xc

    .line 152
    .line 153
    const-wide/16 v14, 0x1000

    .line 154
    .line 155
    move-object/from16 v16, v1

    .line 156
    .line 157
    const-string v1, "UseBigDecimalForDoubles"

    .line 158
    .line 159
    invoke-direct {v13, v1, v0, v14, v15}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 160
    .line 161
    .line 162
    sput-object v13, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForDoubles:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 163
    .line 164
    new-instance v14, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 165
    .line 166
    const/16 v0, 0xd

    .line 167
    .line 168
    move-object v15, v2

    .line 169
    const-wide/16 v1, 0x2000

    .line 170
    .line 171
    move-object/from16 v17, v3

    .line 172
    .line 173
    const-string v3, "ErrorOnEnumNotMatch"

    .line 174
    .line 175
    invoke-direct {v14, v3, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 176
    .line 177
    .line 178
    sput-object v14, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 179
    .line 180
    move-object v2, v15

    .line 181
    new-instance v15, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 182
    .line 183
    const/16 v0, 0xe

    .line 184
    .line 185
    move-object v3, v2

    .line 186
    const-wide/16 v1, 0x4000

    .line 187
    .line 188
    move-object/from16 v18, v3

    .line 189
    .line 190
    const-string v3, "TrimString"

    .line 191
    .line 192
    invoke-direct {v15, v3, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 193
    .line 194
    .line 195
    sput-object v15, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 196
    .line 197
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 198
    .line 199
    const/16 v1, 0xf

    .line 200
    .line 201
    const-wide/32 v2, 0x8000

    .line 202
    .line 203
    .line 204
    move-object/from16 v19, v4

    .line 205
    .line 206
    const-string v4, "ErrorOnNotSupportAutoType"

    .line 207
    .line 208
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 209
    .line 210
    .line 211
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 212
    .line 213
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 214
    .line 215
    const/16 v2, 0x10

    .line 216
    .line 217
    const-wide/32 v3, 0x10000

    .line 218
    .line 219
    .line 220
    move-object/from16 v20, v0

    .line 221
    .line 222
    const-string v0, "DuplicateKeyValueAsArray"

    .line 223
    .line 224
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 225
    .line 226
    .line 227
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 228
    .line 229
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 230
    .line 231
    const/16 v2, 0x11

    .line 232
    .line 233
    const-wide/32 v3, 0x20000

    .line 234
    .line 235
    .line 236
    move-object/from16 v21, v1

    .line 237
    .line 238
    const-string v1, "AllowUnQuotedFieldNames"

    .line 239
    .line 240
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 241
    .line 242
    .line 243
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 244
    .line 245
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 246
    .line 247
    const/16 v2, 0x12

    .line 248
    .line 249
    const-wide/32 v3, 0x40000

    .line 250
    .line 251
    .line 252
    move-object/from16 v22, v0

    .line 253
    .line 254
    const-string v0, "NonStringKeyAsString"

    .line 255
    .line 256
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 257
    .line 258
    .line 259
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonStringKeyAsString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 260
    .line 261
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 262
    .line 263
    const/16 v2, 0x13

    .line 264
    .line 265
    const-wide/32 v3, 0x80000

    .line 266
    .line 267
    .line 268
    move-object/from16 v23, v1

    .line 269
    .line 270
    const-string v1, "Base64StringAsByteArray"

    .line 271
    .line 272
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 273
    .line 274
    .line 275
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 276
    .line 277
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 278
    .line 279
    const/16 v2, 0x14

    .line 280
    .line 281
    const-wide/32 v3, 0x100000

    .line 282
    .line 283
    .line 284
    move-object/from16 v24, v0

    .line 285
    .line 286
    const-string v0, "IgnoreCheckClose"

    .line 287
    .line 288
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 289
    .line 290
    .line 291
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 292
    .line 293
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 294
    .line 295
    const/16 v2, 0x15

    .line 296
    .line 297
    const-wide/32 v3, 0x200000

    .line 298
    .line 299
    .line 300
    move-object/from16 v25, v1

    .line 301
    .line 302
    const-string v1, "ErrorOnNullForPrimitives"

    .line 303
    .line 304
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 305
    .line 306
    .line 307
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 308
    .line 309
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 310
    .line 311
    const/16 v2, 0x16

    .line 312
    .line 313
    const-wide/32 v3, 0x400000

    .line 314
    .line 315
    .line 316
    move-object/from16 v26, v0

    .line 317
    .line 318
    const-string v0, "NullOnError"

    .line 319
    .line 320
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 321
    .line 322
    .line 323
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 324
    .line 325
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 326
    .line 327
    const/16 v2, 0x17

    .line 328
    .line 329
    const-wide/32 v3, 0x800000

    .line 330
    .line 331
    .line 332
    move-object/from16 v27, v1

    .line 333
    .line 334
    const-string v1, "IgnoreAutoTypeNotMatch"

    .line 335
    .line 336
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 337
    .line 338
    .line 339
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreAutoTypeNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 340
    .line 341
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 342
    .line 343
    const/16 v2, 0x18

    .line 344
    .line 345
    const-wide/32 v3, 0x1000000

    .line 346
    .line 347
    .line 348
    move-object/from16 v28, v0

    .line 349
    .line 350
    const-string v0, "NonZeroNumberCastToBooleanAsTrue"

    .line 351
    .line 352
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 353
    .line 354
    .line 355
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 356
    .line 357
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 358
    .line 359
    const/16 v2, 0x19

    .line 360
    .line 361
    const-wide/32 v3, 0x2000000

    .line 362
    .line 363
    .line 364
    move-object/from16 v29, v1

    .line 365
    .line 366
    const-string v1, "IgnoreNullPropertyValue"

    .line 367
    .line 368
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 369
    .line 370
    .line 371
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 372
    .line 373
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 374
    .line 375
    const/16 v2, 0x1a

    .line 376
    .line 377
    const-wide/32 v3, 0x4000000

    .line 378
    .line 379
    .line 380
    move-object/from16 v30, v0

    .line 381
    .line 382
    const-string v0, "ErrorOnUnknownProperties"

    .line 383
    .line 384
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 385
    .line 386
    .line 387
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnUnknownProperties:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 388
    .line 389
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 390
    .line 391
    const/16 v2, 0x1b

    .line 392
    .line 393
    const-wide/32 v3, 0x8000000

    .line 394
    .line 395
    .line 396
    move-object/from16 v31, v1

    .line 397
    .line 398
    const-string v1, "EmptyStringAsNull"

    .line 399
    .line 400
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 401
    .line 402
    .line 403
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 404
    .line 405
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 406
    .line 407
    const/16 v2, 0x1c

    .line 408
    .line 409
    const-wide/32 v3, 0x10000000

    .line 410
    .line 411
    .line 412
    move-object/from16 v32, v0

    .line 413
    .line 414
    const-string v0, "NonErrorOnNumberOverflow"

    .line 415
    .line 416
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 417
    .line 418
    .line 419
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 420
    .line 421
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 422
    .line 423
    const/16 v2, 0x1d

    .line 424
    .line 425
    const-wide/32 v3, 0x20000000

    .line 426
    .line 427
    .line 428
    move-object/from16 v33, v1

    .line 429
    .line 430
    const-string v1, "UseBigIntegerForInts"

    .line 431
    .line 432
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 433
    .line 434
    .line 435
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 436
    .line 437
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 438
    .line 439
    const/16 v2, 0x1e

    .line 440
    .line 441
    const-wide/32 v3, 0x40000000

    .line 442
    .line 443
    .line 444
    move-object/from16 v34, v0

    .line 445
    .line 446
    const-string v0, "UseLongForInts"

    .line 447
    .line 448
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 449
    .line 450
    .line 451
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseLongForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 452
    .line 453
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 454
    .line 455
    const/16 v2, 0x1f

    .line 456
    .line 457
    const-wide v3, 0x80000000L

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    move-object/from16 v35, v1

    .line 463
    .line 464
    const-string v1, "DisableSingleQuote"

    .line 465
    .line 466
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 467
    .line 468
    .line 469
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 470
    .line 471
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 472
    .line 473
    const/16 v2, 0x20

    .line 474
    .line 475
    const-wide v3, 0x100000000L

    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    move-object/from16 v36, v0

    .line 481
    .line 482
    const-string v0, "UseDoubleForDecimals"

    .line 483
    .line 484
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 485
    .line 486
    .line 487
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDoubleForDecimals:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 488
    .line 489
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 490
    .line 491
    const/16 v2, 0x21

    .line 492
    .line 493
    const-wide v3, 0x200000000L

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    move-object/from16 v37, v1

    .line 499
    .line 500
    const-string v1, "DisableReferenceDetect"

    .line 501
    .line 502
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 503
    .line 504
    .line 505
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableReferenceDetect:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 506
    .line 507
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 508
    .line 509
    const/16 v2, 0x22

    .line 510
    .line 511
    const-wide v3, 0x400000000L

    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    move-object/from16 v38, v0

    .line 517
    .line 518
    const-string v0, "DisableStringArrayUnwrapping"

    .line 519
    .line 520
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 521
    .line 522
    .line 523
    sput-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 524
    .line 525
    move-object/from16 v3, v17

    .line 526
    .line 527
    move-object/from16 v2, v18

    .line 528
    .line 529
    move-object/from16 v4, v19

    .line 530
    .line 531
    move-object/from16 v17, v21

    .line 532
    .line 533
    move-object/from16 v18, v22

    .line 534
    .line 535
    move-object/from16 v19, v23

    .line 536
    .line 537
    move-object/from16 v21, v25

    .line 538
    .line 539
    move-object/from16 v22, v26

    .line 540
    .line 541
    move-object/from16 v23, v27

    .line 542
    .line 543
    move-object/from16 v25, v29

    .line 544
    .line 545
    move-object/from16 v26, v30

    .line 546
    .line 547
    move-object/from16 v27, v31

    .line 548
    .line 549
    move-object/from16 v29, v33

    .line 550
    .line 551
    move-object/from16 v30, v34

    .line 552
    .line 553
    move-object/from16 v31, v35

    .line 554
    .line 555
    move-object/from16 v33, v37

    .line 556
    .line 557
    move-object/from16 v34, v38

    .line 558
    .line 559
    move-object/from16 v35, v1

    .line 560
    .line 561
    move-object/from16 v1, v16

    .line 562
    .line 563
    move-object/from16 v16, v20

    .line 564
    .line 565
    move-object/from16 v20, v24

    .line 566
    .line 567
    move-object/from16 v24, v28

    .line 568
    .line 569
    move-object/from16 v28, v32

    .line 570
    .line 571
    move-object/from16 v32, v36

    .line 572
    .line 573
    filled-new-array/range {v1 .. v35}, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->$VALUES:[Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 578
    .line 579
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

    .line 14
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
    .locals 5

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
    const/4 v2, 0x0

    .line 7
    :goto_0
    array-length v3, p0

    .line 8
    if-ge v2, v3, :cond_1

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 13
    .line 14
    or-long/2addr v0, v3

    .line 15
    add-int/lit8 v2, v2, 0x1

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
    and-long/2addr p1, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p1, p1, v0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method
