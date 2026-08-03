.class public final enum Lcom/alibaba/fastjson2/JSONWriter$Feature;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Feature"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/fastjson2/JSONWriter$Feature;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum IgnoreEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum IgnoreErrorGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum IgnoreNonFieldGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum LargeObject:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum MapSortField:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum NotWriteNumberClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum NotWriteSetClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum OptimizedForAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum PrettyFormat:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum PrettyFormatWith2Space:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum PrettyFormatWith4Space:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum SortMapEntriesByKeys:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum UnquoteFieldName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum UseSingleQuotes:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteBigDecimalAsPlain:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteBooleanAsNumber:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteByteArrayAsBase64:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteEnumUsingOrdinal:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteEnumsUsingName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteLongAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteMapNullValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteNameAsSymbol:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteNonStringKeyAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteNullBooleanAsFalse:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteNullNumberAsZero:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WritePairAsJavaBean:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriteThrowableClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

.field public static final enum WriterUtilDateAsMillis:Lcom/alibaba/fastjson2/JSONWriter$Feature;


# instance fields
.field public final mask:J


# direct methods
.method static constructor <clinit>()V
    .locals 51

    .line 1
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

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
    invoke-direct {v1, v4, v0, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    new-instance v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;

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
    invoke-direct {v2, v5, v0, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 24
    .line 25
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;

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
    invoke-direct {v3, v6, v0, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    sput-object v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 36
    .line 37
    new-instance v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    const-wide/16 v5, 0x8

    .line 41
    .line 42
    const-string v7, "BeanToArray"

    .line 43
    .line 44
    invoke-direct {v4, v7, v0, v5, v6}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 48
    .line 49
    new-instance v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 50
    .line 51
    const-string v0, "WriteNulls"

    .line 52
    .line 53
    const/4 v6, 0x4

    .line 54
    const-wide/16 v7, 0x10

    .line 55
    .line 56
    invoke-direct {v5, v0, v6, v7, v8}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 60
    .line 61
    new-instance v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 62
    .line 63
    const-string v0, "WriteMapNullValue"

    .line 64
    .line 65
    const/4 v9, 0x5

    .line 66
    invoke-direct {v6, v0, v9, v7, v8}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 67
    .line 68
    .line 69
    sput-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteMapNullValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 70
    .line 71
    new-instance v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 72
    .line 73
    const/4 v0, 0x6

    .line 74
    const-wide/16 v8, 0x20

    .line 75
    .line 76
    const-string v10, "BrowserCompatible"

    .line 77
    .line 78
    invoke-direct {v7, v10, v0, v8, v9}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 79
    .line 80
    .line 81
    sput-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 82
    .line 83
    new-instance v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 84
    .line 85
    const/4 v0, 0x7

    .line 86
    const-wide/16 v9, 0x40

    .line 87
    .line 88
    const-string v11, "NullAsDefaultValue"

    .line 89
    .line 90
    invoke-direct {v8, v11, v0, v9, v10}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 91
    .line 92
    .line 93
    sput-object v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 94
    .line 95
    new-instance v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 96
    .line 97
    const/16 v0, 0x8

    .line 98
    .line 99
    const-wide/16 v10, 0x80

    .line 100
    .line 101
    const-string v12, "WriteBooleanAsNumber"

    .line 102
    .line 103
    invoke-direct {v9, v12, v0, v10, v11}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 104
    .line 105
    .line 106
    sput-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBooleanAsNumber:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 107
    .line 108
    new-instance v10, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 109
    .line 110
    const/16 v0, 0x9

    .line 111
    .line 112
    const-wide/16 v11, 0x100

    .line 113
    .line 114
    const-string v13, "WriteNonStringValueAsString"

    .line 115
    .line 116
    invoke-direct {v10, v13, v0, v11, v12}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 117
    .line 118
    .line 119
    sput-object v10, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 120
    .line 121
    new-instance v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 122
    .line 123
    const/16 v0, 0xa

    .line 124
    .line 125
    const-wide/16 v12, 0x200

    .line 126
    .line 127
    const-string v14, "WriteClassName"

    .line 128
    .line 129
    invoke-direct {v11, v14, v0, v12, v13}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 130
    .line 131
    .line 132
    sput-object v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 133
    .line 134
    new-instance v12, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 135
    .line 136
    const/16 v0, 0xb

    .line 137
    .line 138
    const-wide/16 v13, 0x400

    .line 139
    .line 140
    const-string v15, "NotWriteRootClassName"

    .line 141
    .line 142
    invoke-direct {v12, v15, v0, v13, v14}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 143
    .line 144
    .line 145
    sput-object v12, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 146
    .line 147
    new-instance v13, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 148
    .line 149
    const/16 v0, 0xc

    .line 150
    .line 151
    const-wide/16 v14, 0x800

    .line 152
    .line 153
    move-object/from16 v16, v1

    .line 154
    .line 155
    const-string v1, "NotWriteHashMapArrayListClassName"

    .line 156
    .line 157
    invoke-direct {v13, v1, v0, v14, v15}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 158
    .line 159
    .line 160
    sput-object v13, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 161
    .line 162
    new-instance v14, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 163
    .line 164
    const/16 v0, 0xd

    .line 165
    .line 166
    move-object v15, v2

    .line 167
    const-wide/16 v1, 0x1000

    .line 168
    .line 169
    move-object/from16 v17, v3

    .line 170
    .line 171
    const-string v3, "NotWriteDefaultValue"

    .line 172
    .line 173
    invoke-direct {v14, v3, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 174
    .line 175
    .line 176
    sput-object v14, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 177
    .line 178
    move-object v2, v15

    .line 179
    new-instance v15, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 180
    .line 181
    const/16 v0, 0xe

    .line 182
    .line 183
    move-object v3, v2

    .line 184
    const-wide/16 v1, 0x2000

    .line 185
    .line 186
    move-object/from16 v18, v3

    .line 187
    .line 188
    const-string v3, "WriteEnumsUsingName"

    .line 189
    .line 190
    invoke-direct {v15, v3, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 191
    .line 192
    .line 193
    sput-object v15, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumsUsingName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 194
    .line 195
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 196
    .line 197
    const/16 v1, 0xf

    .line 198
    .line 199
    const-wide/16 v2, 0x4000

    .line 200
    .line 201
    move-object/from16 v19, v4

    .line 202
    .line 203
    const-string v4, "WriteEnumUsingToString"

    .line 204
    .line 205
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 206
    .line 207
    .line 208
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 209
    .line 210
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 211
    .line 212
    const/16 v2, 0x10

    .line 213
    .line 214
    const-wide/32 v3, 0x8000

    .line 215
    .line 216
    .line 217
    move-object/from16 v20, v0

    .line 218
    .line 219
    const-string v0, "IgnoreErrorGetter"

    .line 220
    .line 221
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 222
    .line 223
    .line 224
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreErrorGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 225
    .line 226
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 227
    .line 228
    const/16 v2, 0x11

    .line 229
    .line 230
    const-wide/32 v3, 0x10000

    .line 231
    .line 232
    .line 233
    move-object/from16 v21, v1

    .line 234
    .line 235
    const-string v1, "PrettyFormat"

    .line 236
    .line 237
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 238
    .line 239
    .line 240
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormat:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 241
    .line 242
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 243
    .line 244
    const/16 v2, 0x12

    .line 245
    .line 246
    const-wide/32 v3, 0x20000

    .line 247
    .line 248
    .line 249
    move-object/from16 v22, v0

    .line 250
    .line 251
    const-string v0, "ReferenceDetection"

    .line 252
    .line 253
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 254
    .line 255
    .line 256
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 257
    .line 258
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 259
    .line 260
    const/16 v2, 0x13

    .line 261
    .line 262
    const-wide/32 v3, 0x40000

    .line 263
    .line 264
    .line 265
    move-object/from16 v23, v1

    .line 266
    .line 267
    const-string v1, "WriteNameAsSymbol"

    .line 268
    .line 269
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 270
    .line 271
    .line 272
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNameAsSymbol:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 273
    .line 274
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 275
    .line 276
    const/16 v2, 0x14

    .line 277
    .line 278
    const-wide/32 v3, 0x80000

    .line 279
    .line 280
    .line 281
    move-object/from16 v24, v0

    .line 282
    .line 283
    const-string v0, "WriteBigDecimalAsPlain"

    .line 284
    .line 285
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 286
    .line 287
    .line 288
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBigDecimalAsPlain:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 289
    .line 290
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 291
    .line 292
    const/16 v2, 0x15

    .line 293
    .line 294
    const-wide/32 v3, 0x100000

    .line 295
    .line 296
    .line 297
    move-object/from16 v25, v1

    .line 298
    .line 299
    const-string v1, "UseSingleQuotes"

    .line 300
    .line 301
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 302
    .line 303
    .line 304
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->UseSingleQuotes:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 305
    .line 306
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 307
    .line 308
    const/16 v2, 0x16

    .line 309
    .line 310
    const-wide/32 v3, 0x200000

    .line 311
    .line 312
    .line 313
    move-object/from16 v26, v0

    .line 314
    .line 315
    const-string v0, "MapSortField"

    .line 316
    .line 317
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 318
    .line 319
    .line 320
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->MapSortField:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 321
    .line 322
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 323
    .line 324
    const/16 v2, 0x17

    .line 325
    .line 326
    const-wide/32 v3, 0x400000

    .line 327
    .line 328
    .line 329
    move-object/from16 v27, v1

    .line 330
    .line 331
    const-string v1, "WriteNullListAsEmpty"

    .line 332
    .line 333
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 334
    .line 335
    .line 336
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 337
    .line 338
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 339
    .line 340
    const/16 v2, 0x18

    .line 341
    .line 342
    const-wide/32 v3, 0x800000

    .line 343
    .line 344
    .line 345
    move-object/from16 v28, v0

    .line 346
    .line 347
    const-string v0, "WriteNullStringAsEmpty"

    .line 348
    .line 349
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 350
    .line 351
    .line 352
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 353
    .line 354
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 355
    .line 356
    const/16 v2, 0x19

    .line 357
    .line 358
    const-wide/32 v3, 0x1000000

    .line 359
    .line 360
    .line 361
    move-object/from16 v29, v1

    .line 362
    .line 363
    const-string v1, "WriteNullNumberAsZero"

    .line 364
    .line 365
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 366
    .line 367
    .line 368
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 369
    .line 370
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 371
    .line 372
    const/16 v2, 0x1a

    .line 373
    .line 374
    const-wide/32 v3, 0x2000000

    .line 375
    .line 376
    .line 377
    move-object/from16 v30, v0

    .line 378
    .line 379
    const-string v0, "WriteNullBooleanAsFalse"

    .line 380
    .line 381
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 382
    .line 383
    .line 384
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 385
    .line 386
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 387
    .line 388
    const-string v2, "NotWriteEmptyArray"

    .line 389
    .line 390
    const/16 v3, 0x1b

    .line 391
    .line 392
    move-object/from16 v31, v5

    .line 393
    .line 394
    const-wide/32 v4, 0x4000000

    .line 395
    .line 396
    .line 397
    invoke-direct {v0, v2, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 398
    .line 399
    .line 400
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 401
    .line 402
    new-instance v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 403
    .line 404
    const-string v3, "IgnoreEmpty"

    .line 405
    .line 406
    move-object/from16 v32, v0

    .line 407
    .line 408
    const/16 v0, 0x1c

    .line 409
    .line 410
    invoke-direct {v2, v3, v0, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 411
    .line 412
    .line 413
    sput-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 414
    .line 415
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 416
    .line 417
    const/16 v3, 0x1d

    .line 418
    .line 419
    const-wide/32 v4, 0x8000000

    .line 420
    .line 421
    .line 422
    move-object/from16 v33, v1

    .line 423
    .line 424
    const-string v1, "WriteNonStringKeyAsString"

    .line 425
    .line 426
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 427
    .line 428
    .line 429
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringKeyAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 430
    .line 431
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 432
    .line 433
    const/16 v3, 0x1e

    .line 434
    .line 435
    const-wide/32 v4, 0x10000000

    .line 436
    .line 437
    .line 438
    move-object/from16 v34, v0

    .line 439
    .line 440
    const-string v0, "WritePairAsJavaBean"

    .line 441
    .line 442
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 443
    .line 444
    .line 445
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WritePairAsJavaBean:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 446
    .line 447
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 448
    .line 449
    const/16 v3, 0x1f

    .line 450
    .line 451
    const-wide/32 v4, 0x20000000

    .line 452
    .line 453
    .line 454
    move-object/from16 v35, v1

    .line 455
    .line 456
    const-string v1, "OptimizedForAscii"

    .line 457
    .line 458
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 459
    .line 460
    .line 461
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->OptimizedForAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 462
    .line 463
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 464
    .line 465
    const/16 v3, 0x20

    .line 466
    .line 467
    const-wide/32 v4, 0x40000000

    .line 468
    .line 469
    .line 470
    move-object/from16 v36, v0

    .line 471
    .line 472
    const-string v0, "EscapeNoneAscii"

    .line 473
    .line 474
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 475
    .line 476
    .line 477
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 478
    .line 479
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 480
    .line 481
    const/16 v3, 0x21

    .line 482
    .line 483
    const-wide v4, 0x80000000L

    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    move-object/from16 v37, v1

    .line 489
    .line 490
    const-string v1, "WriteByteArrayAsBase64"

    .line 491
    .line 492
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 493
    .line 494
    .line 495
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteByteArrayAsBase64:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 496
    .line 497
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 498
    .line 499
    const/16 v3, 0x22

    .line 500
    .line 501
    const-wide v4, 0x100000000L

    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    move-object/from16 v38, v0

    .line 507
    .line 508
    const-string v0, "IgnoreNonFieldGetter"

    .line 509
    .line 510
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 511
    .line 512
    .line 513
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNonFieldGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 514
    .line 515
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 516
    .line 517
    const/16 v3, 0x23

    .line 518
    .line 519
    const-wide v4, 0x200000000L

    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    move-object/from16 v39, v1

    .line 525
    .line 526
    const-string v1, "LargeObject"

    .line 527
    .line 528
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 529
    .line 530
    .line 531
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->LargeObject:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 532
    .line 533
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 534
    .line 535
    const/16 v3, 0x24

    .line 536
    .line 537
    const-wide v4, 0x400000000L

    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    move-object/from16 v40, v0

    .line 543
    .line 544
    const-string v0, "WriteLongAsString"

    .line 545
    .line 546
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 547
    .line 548
    .line 549
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteLongAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 550
    .line 551
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 552
    .line 553
    const/16 v3, 0x25

    .line 554
    .line 555
    const-wide v4, 0x800000000L

    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    move-object/from16 v41, v1

    .line 561
    .line 562
    const-string v1, "BrowserSecure"

    .line 563
    .line 564
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 565
    .line 566
    .line 567
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 568
    .line 569
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 570
    .line 571
    const/16 v3, 0x26

    .line 572
    .line 573
    const-wide v4, 0x1000000000L

    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    move-object/from16 v42, v0

    .line 579
    .line 580
    const-string v0, "WriteEnumUsingOrdinal"

    .line 581
    .line 582
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 583
    .line 584
    .line 585
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingOrdinal:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 586
    .line 587
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 588
    .line 589
    const/16 v3, 0x27

    .line 590
    .line 591
    const-wide v4, 0x2000000000L

    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    move-object/from16 v43, v1

    .line 597
    .line 598
    const-string v1, "WriteThrowableClassName"

    .line 599
    .line 600
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 601
    .line 602
    .line 603
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteThrowableClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 604
    .line 605
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 606
    .line 607
    const/16 v3, 0x28

    .line 608
    .line 609
    const-wide v4, 0x4000000000L

    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    move-object/from16 v44, v0

    .line 615
    .line 616
    const-string v0, "UnquoteFieldName"

    .line 617
    .line 618
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 619
    .line 620
    .line 621
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->UnquoteFieldName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 622
    .line 623
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 624
    .line 625
    const/16 v3, 0x29

    .line 626
    .line 627
    const-wide v4, 0x8000000000L

    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    move-object/from16 v45, v1

    .line 633
    .line 634
    const-string v1, "NotWriteSetClassName"

    .line 635
    .line 636
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 637
    .line 638
    .line 639
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteSetClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 640
    .line 641
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 642
    .line 643
    const/16 v3, 0x2a

    .line 644
    .line 645
    const-wide v4, 0x10000000000L

    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    move-object/from16 v46, v0

    .line 651
    .line 652
    const-string v0, "NotWriteNumberClassName"

    .line 653
    .line 654
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 655
    .line 656
    .line 657
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteNumberClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 658
    .line 659
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 660
    .line 661
    const/16 v3, 0x2b

    .line 662
    .line 663
    const-wide v4, 0x20000000000L

    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    move-object/from16 v47, v1

    .line 669
    .line 670
    const-string v1, "SortMapEntriesByKeys"

    .line 671
    .line 672
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 673
    .line 674
    .line 675
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->SortMapEntriesByKeys:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 676
    .line 677
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 678
    .line 679
    const/16 v3, 0x2c

    .line 680
    .line 681
    const-wide v4, 0x40000000000L

    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    move-object/from16 v48, v0

    .line 687
    .line 688
    const-string v0, "PrettyFormatWith2Space"

    .line 689
    .line 690
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 691
    .line 692
    .line 693
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormatWith2Space:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 694
    .line 695
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 696
    .line 697
    const/16 v3, 0x2d

    .line 698
    .line 699
    const-wide v4, 0x80000000000L

    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    move-object/from16 v49, v1

    .line 705
    .line 706
    const-string v1, "PrettyFormatWith4Space"

    .line 707
    .line 708
    invoke-direct {v0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 709
    .line 710
    .line 711
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormatWith4Space:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 712
    .line 713
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 714
    .line 715
    const/16 v3, 0x2e

    .line 716
    .line 717
    const-wide v4, 0x100000000000L

    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    move-object/from16 v50, v0

    .line 723
    .line 724
    const-string v0, "WriterUtilDateAsMillis"

    .line 725
    .line 726
    invoke-direct {v1, v0, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 727
    .line 728
    .line 729
    sput-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriterUtilDateAsMillis:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 730
    .line 731
    move-object/from16 v3, v17

    .line 732
    .line 733
    move-object/from16 v4, v19

    .line 734
    .line 735
    move-object/from16 v17, v21

    .line 736
    .line 737
    move-object/from16 v19, v23

    .line 738
    .line 739
    move-object/from16 v21, v25

    .line 740
    .line 741
    move-object/from16 v23, v27

    .line 742
    .line 743
    move-object/from16 v25, v29

    .line 744
    .line 745
    move-object/from16 v5, v31

    .line 746
    .line 747
    move-object/from16 v27, v33

    .line 748
    .line 749
    move-object/from16 v31, v35

    .line 750
    .line 751
    move-object/from16 v33, v37

    .line 752
    .line 753
    move-object/from16 v35, v39

    .line 754
    .line 755
    move-object/from16 v37, v41

    .line 756
    .line 757
    move-object/from16 v39, v43

    .line 758
    .line 759
    move-object/from16 v41, v45

    .line 760
    .line 761
    move-object/from16 v43, v47

    .line 762
    .line 763
    move-object/from16 v45, v49

    .line 764
    .line 765
    move-object/from16 v47, v1

    .line 766
    .line 767
    move-object/from16 v29, v2

    .line 768
    .line 769
    move-object/from16 v1, v16

    .line 770
    .line 771
    move-object/from16 v2, v18

    .line 772
    .line 773
    move-object/from16 v16, v20

    .line 774
    .line 775
    move-object/from16 v18, v22

    .line 776
    .line 777
    move-object/from16 v20, v24

    .line 778
    .line 779
    move-object/from16 v22, v26

    .line 780
    .line 781
    move-object/from16 v24, v28

    .line 782
    .line 783
    move-object/from16 v26, v30

    .line 784
    .line 785
    move-object/from16 v28, v32

    .line 786
    .line 787
    move-object/from16 v30, v34

    .line 788
    .line 789
    move-object/from16 v32, v36

    .line 790
    .line 791
    move-object/from16 v34, v38

    .line 792
    .line 793
    move-object/from16 v36, v40

    .line 794
    .line 795
    move-object/from16 v38, v42

    .line 796
    .line 797
    move-object/from16 v40, v44

    .line 798
    .line 799
    move-object/from16 v42, v46

    .line 800
    .line 801
    move-object/from16 v44, v48

    .line 802
    .line 803
    move-object/from16 v46, v50

    .line 804
    .line 805
    filled-new-array/range {v1 .. v47}, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    sput-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->$VALUES:[Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 810
    .line 811
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
    iput-wide p3, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONWriter$Feature;
    .locals 1

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/alibaba/fastjson2/JSONWriter$Feature;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->$VALUES:[Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/alibaba/fastjson2/JSONWriter$Feature;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isEnabled(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

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
