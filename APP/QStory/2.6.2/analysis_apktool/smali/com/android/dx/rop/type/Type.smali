.class public final Lcom/android/dx/rop/type/Type;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/rop/type/TypeBearer;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/dx/rop/type/TypeBearer;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/rop/type/Type;",
        ">;"
    }
.end annotation


# static fields
.field public static final ANNOTATION:Lcom/android/dx/rop/type/Type;

.field public static final BOOLEAN:Lcom/android/dx/rop/type/Type;

.field public static final BOOLEAN_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final BOOLEAN_CLASS:Lcom/android/dx/rop/type/Type;

.field public static final BT_ADDR:I = 0xa

.field public static final BT_BOOLEAN:I = 0x1

.field public static final BT_BYTE:I = 0x2

.field public static final BT_CHAR:I = 0x3

.field public static final BT_COUNT:I = 0xb

.field public static final BT_DOUBLE:I = 0x4

.field public static final BT_FLOAT:I = 0x5

.field public static final BT_INT:I = 0x6

.field public static final BT_LONG:I = 0x7

.field public static final BT_OBJECT:I = 0x9

.field public static final BT_SHORT:I = 0x8

.field public static final BT_VOID:I

.field public static final BYTE:Lcom/android/dx/rop/type/Type;

.field public static final BYTE_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final BYTE_CLASS:Lcom/android/dx/rop/type/Type;

.field public static final CHAR:Lcom/android/dx/rop/type/Type;

.field public static final CHARACTER_CLASS:Lcom/android/dx/rop/type/Type;

.field public static final CHAR_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final CLASS:Lcom/android/dx/rop/type/Type;

.field public static final CLONEABLE:Lcom/android/dx/rop/type/Type;

.field public static final DOUBLE:Lcom/android/dx/rop/type/Type;

.field public static final DOUBLE_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final DOUBLE_CLASS:Lcom/android/dx/rop/type/Type;

.field public static final FLOAT:Lcom/android/dx/rop/type/Type;

.field public static final FLOAT_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final FLOAT_CLASS:Lcom/android/dx/rop/type/Type;

.field public static final INT:Lcom/android/dx/rop/type/Type;

.field public static final INTEGER_CLASS:Lcom/android/dx/rop/type/Type;

.field public static final INT_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final KNOWN_NULL:Lcom/android/dx/rop/type/Type;

.field public static final LONG:Lcom/android/dx/rop/type/Type;

.field public static final LONG_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final LONG_CLASS:Lcom/android/dx/rop/type/Type;

.field public static final METHOD_HANDLE:Lcom/android/dx/rop/type/Type;

.field public static final METHOD_TYPE:Lcom/android/dx/rop/type/Type;

.field public static final OBJECT:Lcom/android/dx/rop/type/Type;

.field public static final OBJECT_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;

.field public static final SERIALIZABLE:Lcom/android/dx/rop/type/Type;

.field public static final SHORT:Lcom/android/dx/rop/type/Type;

.field public static final SHORT_ARRAY:Lcom/android/dx/rop/type/Type;

.field public static final SHORT_CLASS:Lcom/android/dx/rop/type/Type;

.field public static final STRING:Lcom/android/dx/rop/type/Type;

.field public static final THROWABLE:Lcom/android/dx/rop/type/Type;

.field public static final VAR_HANDLE:Lcom/android/dx/rop/type/Type;

.field public static final VOID:Lcom/android/dx/rop/type/Type;

.field public static final VOID_CLASS:Lcom/android/dx/rop/type/Type;

.field private static final internTable:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Lcom/android/dx/rop/type/Type;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private arrayType:Lcom/android/dx/rop/type/Type;

.field private final basicType:I

.field private className:Ljava/lang/String;

.field private componentType:Lcom/android/dx/rop/type/Type;

.field private final descriptor:Ljava/lang/String;

.field private initializedType:Lcom/android/dx/rop/type/Type;

.field private final newAt:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x2710

    .line 4
    .line 5
    const/high16 v2, 0x3f400000    # 0.75f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/android/dx/rop/type/Type;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 11
    .line 12
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 13
    .line 14
    const-string v1, "Z"

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, v2}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/android/dx/rop/type/Type;->BOOLEAN:Lcom/android/dx/rop/type/Type;

    .line 21
    .line 22
    new-instance v1, Lcom/android/dx/rop/type/Type;

    .line 23
    .line 24
    const-string v2, "B"

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-direct {v1, v2, v3}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    .line 31
    .line 32
    new-instance v2, Lcom/android/dx/rop/type/Type;

    .line 33
    .line 34
    const-string v3, "C"

    .line 35
    .line 36
    const/4 v4, 0x3

    .line 37
    invoke-direct {v2, v3, v4}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    sput-object v2, Lcom/android/dx/rop/type/Type;->CHAR:Lcom/android/dx/rop/type/Type;

    .line 41
    .line 42
    new-instance v3, Lcom/android/dx/rop/type/Type;

    .line 43
    .line 44
    const-string v4, "D"

    .line 45
    .line 46
    const/4 v5, 0x4

    .line 47
    invoke-direct {v3, v4, v5}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    sput-object v3, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 51
    .line 52
    new-instance v4, Lcom/android/dx/rop/type/Type;

    .line 53
    .line 54
    const-string v5, "F"

    .line 55
    .line 56
    const/4 v6, 0x5

    .line 57
    invoke-direct {v4, v5, v6}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    sput-object v4, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 61
    .line 62
    new-instance v5, Lcom/android/dx/rop/type/Type;

    .line 63
    .line 64
    const-string v6, "I"

    .line 65
    .line 66
    const/4 v7, 0x6

    .line 67
    invoke-direct {v5, v6, v7}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    sput-object v5, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 71
    .line 72
    new-instance v6, Lcom/android/dx/rop/type/Type;

    .line 73
    .line 74
    const-string v7, "J"

    .line 75
    .line 76
    const/4 v8, 0x7

    .line 77
    invoke-direct {v6, v7, v8}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    sput-object v6, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 81
    .line 82
    new-instance v7, Lcom/android/dx/rop/type/Type;

    .line 83
    .line 84
    const-string v8, "S"

    .line 85
    .line 86
    const/16 v9, 0x8

    .line 87
    .line 88
    invoke-direct {v7, v8, v9}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    sput-object v7, Lcom/android/dx/rop/type/Type;->SHORT:Lcom/android/dx/rop/type/Type;

    .line 92
    .line 93
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 94
    .line 95
    const-string v9, "V"

    .line 96
    .line 97
    const/4 v10, 0x0

    .line 98
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v8, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 102
    .line 103
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 104
    .line 105
    const-string v9, "<null>"

    .line 106
    .line 107
    const/16 v10, 0x9

    .line 108
    .line 109
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    sput-object v8, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 113
    .line 114
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 115
    .line 116
    const-string v9, "<addr>"

    .line 117
    .line 118
    const/16 v11, 0xa

    .line 119
    .line 120
    invoke-direct {v8, v9, v11}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    sput-object v8, Lcom/android/dx/rop/type/Type;->RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;

    .line 124
    .line 125
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 126
    .line 127
    const-string v9, "Ljava/lang/annotation/Annotation;"

    .line 128
    .line 129
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 130
    .line 131
    .line 132
    sput-object v8, Lcom/android/dx/rop/type/Type;->ANNOTATION:Lcom/android/dx/rop/type/Type;

    .line 133
    .line 134
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 135
    .line 136
    const-string v9, "Ljava/lang/Class;"

    .line 137
    .line 138
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    sput-object v8, Lcom/android/dx/rop/type/Type;->CLASS:Lcom/android/dx/rop/type/Type;

    .line 142
    .line 143
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 144
    .line 145
    const-string v9, "Ljava/lang/Cloneable;"

    .line 146
    .line 147
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 148
    .line 149
    .line 150
    sput-object v8, Lcom/android/dx/rop/type/Type;->CLONEABLE:Lcom/android/dx/rop/type/Type;

    .line 151
    .line 152
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 153
    .line 154
    const-string v9, "Ljava/lang/invoke/MethodHandle;"

    .line 155
    .line 156
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 157
    .line 158
    .line 159
    sput-object v8, Lcom/android/dx/rop/type/Type;->METHOD_HANDLE:Lcom/android/dx/rop/type/Type;

    .line 160
    .line 161
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 162
    .line 163
    const-string v9, "Ljava/lang/invoke/MethodType;"

    .line 164
    .line 165
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 166
    .line 167
    .line 168
    sput-object v8, Lcom/android/dx/rop/type/Type;->METHOD_TYPE:Lcom/android/dx/rop/type/Type;

    .line 169
    .line 170
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 171
    .line 172
    const-string v9, "Ljava/lang/invoke/VarHandle;"

    .line 173
    .line 174
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 175
    .line 176
    .line 177
    sput-object v8, Lcom/android/dx/rop/type/Type;->VAR_HANDLE:Lcom/android/dx/rop/type/Type;

    .line 178
    .line 179
    new-instance v8, Lcom/android/dx/rop/type/Type;

    .line 180
    .line 181
    const-string v9, "Ljava/lang/Object;"

    .line 182
    .line 183
    invoke-direct {v8, v9, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    sput-object v8, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 187
    .line 188
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 189
    .line 190
    const-string v11, "Ljava/io/Serializable;"

    .line 191
    .line 192
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 193
    .line 194
    .line 195
    sput-object v9, Lcom/android/dx/rop/type/Type;->SERIALIZABLE:Lcom/android/dx/rop/type/Type;

    .line 196
    .line 197
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 198
    .line 199
    const-string v11, "Ljava/lang/String;"

    .line 200
    .line 201
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 202
    .line 203
    .line 204
    sput-object v9, Lcom/android/dx/rop/type/Type;->STRING:Lcom/android/dx/rop/type/Type;

    .line 205
    .line 206
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 207
    .line 208
    const-string v11, "Ljava/lang/Throwable;"

    .line 209
    .line 210
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 211
    .line 212
    .line 213
    sput-object v9, Lcom/android/dx/rop/type/Type;->THROWABLE:Lcom/android/dx/rop/type/Type;

    .line 214
    .line 215
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 216
    .line 217
    const-string v11, "Ljava/lang/Boolean;"

    .line 218
    .line 219
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    sput-object v9, Lcom/android/dx/rop/type/Type;->BOOLEAN_CLASS:Lcom/android/dx/rop/type/Type;

    .line 223
    .line 224
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 225
    .line 226
    const-string v11, "Ljava/lang/Byte;"

    .line 227
    .line 228
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 229
    .line 230
    .line 231
    sput-object v9, Lcom/android/dx/rop/type/Type;->BYTE_CLASS:Lcom/android/dx/rop/type/Type;

    .line 232
    .line 233
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 234
    .line 235
    const-string v11, "Ljava/lang/Character;"

    .line 236
    .line 237
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    sput-object v9, Lcom/android/dx/rop/type/Type;->CHARACTER_CLASS:Lcom/android/dx/rop/type/Type;

    .line 241
    .line 242
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 243
    .line 244
    const-string v11, "Ljava/lang/Double;"

    .line 245
    .line 246
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 247
    .line 248
    .line 249
    sput-object v9, Lcom/android/dx/rop/type/Type;->DOUBLE_CLASS:Lcom/android/dx/rop/type/Type;

    .line 250
    .line 251
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 252
    .line 253
    const-string v11, "Ljava/lang/Float;"

    .line 254
    .line 255
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 256
    .line 257
    .line 258
    sput-object v9, Lcom/android/dx/rop/type/Type;->FLOAT_CLASS:Lcom/android/dx/rop/type/Type;

    .line 259
    .line 260
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 261
    .line 262
    const-string v11, "Ljava/lang/Integer;"

    .line 263
    .line 264
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 265
    .line 266
    .line 267
    sput-object v9, Lcom/android/dx/rop/type/Type;->INTEGER_CLASS:Lcom/android/dx/rop/type/Type;

    .line 268
    .line 269
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 270
    .line 271
    const-string v11, "Ljava/lang/Long;"

    .line 272
    .line 273
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 274
    .line 275
    .line 276
    sput-object v9, Lcom/android/dx/rop/type/Type;->LONG_CLASS:Lcom/android/dx/rop/type/Type;

    .line 277
    .line 278
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 279
    .line 280
    const-string v11, "Ljava/lang/Short;"

    .line 281
    .line 282
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 283
    .line 284
    .line 285
    sput-object v9, Lcom/android/dx/rop/type/Type;->SHORT_CLASS:Lcom/android/dx/rop/type/Type;

    .line 286
    .line 287
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 288
    .line 289
    const-string v11, "Ljava/lang/Void;"

    .line 290
    .line 291
    invoke-direct {v9, v11, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 292
    .line 293
    .line 294
    sput-object v9, Lcom/android/dx/rop/type/Type;->VOID_CLASS:Lcom/android/dx/rop/type/Type;

    .line 295
    .line 296
    new-instance v9, Lcom/android/dx/rop/type/Type;

    .line 297
    .line 298
    new-instance v11, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v12, "["

    .line 301
    .line 302
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iget-object v0, v0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-direct {v9, v0, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 315
    .line 316
    .line 317
    sput-object v9, Lcom/android/dx/rop/type/Type;->BOOLEAN_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 318
    .line 319
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 320
    .line 321
    new-instance v9, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    iget-object v1, v1, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 327
    .line 328
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-direct {v0, v1, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 336
    .line 337
    .line 338
    sput-object v0, Lcom/android/dx/rop/type/Type;->BYTE_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 339
    .line 340
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 341
    .line 342
    new-instance v1, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    iget-object v2, v2, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-direct {v0, v1, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 357
    .line 358
    .line 359
    sput-object v0, Lcom/android/dx/rop/type/Type;->CHAR_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 360
    .line 361
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 362
    .line 363
    new-instance v1, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    iget-object v2, v3, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-direct {v0, v1, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 378
    .line 379
    .line 380
    sput-object v0, Lcom/android/dx/rop/type/Type;->DOUBLE_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 381
    .line 382
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 383
    .line 384
    new-instance v1, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object v2, v4, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 390
    .line 391
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-direct {v0, v1, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 399
    .line 400
    .line 401
    sput-object v0, Lcom/android/dx/rop/type/Type;->FLOAT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 402
    .line 403
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 404
    .line 405
    new-instance v1, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    iget-object v2, v5, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 411
    .line 412
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-direct {v0, v1, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 420
    .line 421
    .line 422
    sput-object v0, Lcom/android/dx/rop/type/Type;->INT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 423
    .line 424
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 425
    .line 426
    new-instance v1, Ljava/lang/StringBuilder;

    .line 427
    .line 428
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    iget-object v2, v6, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 432
    .line 433
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-direct {v0, v1, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 441
    .line 442
    .line 443
    sput-object v0, Lcom/android/dx/rop/type/Type;->LONG_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 444
    .line 445
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 446
    .line 447
    new-instance v1, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    iget-object v2, v8, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-direct {v0, v1, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 462
    .line 463
    .line 464
    sput-object v0, Lcom/android/dx/rop/type/Type;->OBJECT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 465
    .line 466
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 467
    .line 468
    new-instance v1, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    iget-object v2, v7, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 474
    .line 475
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    invoke-direct {v0, v1, v10}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 483
    .line 484
    .line 485
    sput-object v0, Lcom/android/dx/rop/type/Type;->SHORT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 486
    .line 487
    invoke-static {}, Lcom/android/dx/rop/type/Type;->initInterns()V

    .line 488
    .line 489
    .line 490
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, -0x1

    .line 47
    invoke-direct {p0, p1, p2, v0}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-ltz p2, :cond_1

    .line 8
    .line 9
    const/16 v1, 0xb

    .line 10
    .line 11
    if-ge p2, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    if-lt p3, v1, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 17
    .line 18
    iput p2, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 19
    .line 20
    iput p3, p0, Lcom/android/dx/rop/type/Type;->newAt:I

    .line 21
    .line 22
    iput-object v0, p0, Lcom/android/dx/rop/type/Type;->arrayType:Lcom/android/dx/rop/type/Type;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/android/dx/rop/type/Type;->componentType:Lcom/android/dx/rop/type/Type;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/android/dx/rop/type/Type;->initializedType:Lcom/android/dx/rop/type/Type;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string p0, "newAt < -1"

    .line 30
    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    const-string p0, "bad basicType"

    .line 36
    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_2
    const-string p0, "descriptor == null"

    .line 42
    .line 43
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method

.method public static clearInternTable()V
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/type/Type;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/android/dx/rop/type/Type;->initInterns()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static initInterns()V
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/type/Type;->BOOLEAN:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/android/dx/rop/type/Type;->CHAR:Lcom/android/dx/rop/type/Type;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 34
    .line 35
    .line 36
    sget-object v0, Lcom/android/dx/rop/type/Type;->SHORT:Lcom/android/dx/rop/type/Type;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 39
    .line 40
    .line 41
    sget-object v0, Lcom/android/dx/rop/type/Type;->ANNOTATION:Lcom/android/dx/rop/type/Type;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 44
    .line 45
    .line 46
    sget-object v0, Lcom/android/dx/rop/type/Type;->CLASS:Lcom/android/dx/rop/type/Type;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 49
    .line 50
    .line 51
    sget-object v0, Lcom/android/dx/rop/type/Type;->CLONEABLE:Lcom/android/dx/rop/type/Type;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 54
    .line 55
    .line 56
    sget-object v0, Lcom/android/dx/rop/type/Type;->METHOD_HANDLE:Lcom/android/dx/rop/type/Type;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 59
    .line 60
    .line 61
    sget-object v0, Lcom/android/dx/rop/type/Type;->VAR_HANDLE:Lcom/android/dx/rop/type/Type;

    .line 62
    .line 63
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 64
    .line 65
    .line 66
    sget-object v0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 69
    .line 70
    .line 71
    sget-object v0, Lcom/android/dx/rop/type/Type;->SERIALIZABLE:Lcom/android/dx/rop/type/Type;

    .line 72
    .line 73
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 74
    .line 75
    .line 76
    sget-object v0, Lcom/android/dx/rop/type/Type;->STRING:Lcom/android/dx/rop/type/Type;

    .line 77
    .line 78
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 79
    .line 80
    .line 81
    sget-object v0, Lcom/android/dx/rop/type/Type;->THROWABLE:Lcom/android/dx/rop/type/Type;

    .line 82
    .line 83
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 84
    .line 85
    .line 86
    sget-object v0, Lcom/android/dx/rop/type/Type;->BOOLEAN_CLASS:Lcom/android/dx/rop/type/Type;

    .line 87
    .line 88
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 89
    .line 90
    .line 91
    sget-object v0, Lcom/android/dx/rop/type/Type;->BYTE_CLASS:Lcom/android/dx/rop/type/Type;

    .line 92
    .line 93
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 94
    .line 95
    .line 96
    sget-object v0, Lcom/android/dx/rop/type/Type;->CHARACTER_CLASS:Lcom/android/dx/rop/type/Type;

    .line 97
    .line 98
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 99
    .line 100
    .line 101
    sget-object v0, Lcom/android/dx/rop/type/Type;->DOUBLE_CLASS:Lcom/android/dx/rop/type/Type;

    .line 102
    .line 103
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 104
    .line 105
    .line 106
    sget-object v0, Lcom/android/dx/rop/type/Type;->FLOAT_CLASS:Lcom/android/dx/rop/type/Type;

    .line 107
    .line 108
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 109
    .line 110
    .line 111
    sget-object v0, Lcom/android/dx/rop/type/Type;->INTEGER_CLASS:Lcom/android/dx/rop/type/Type;

    .line 112
    .line 113
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 114
    .line 115
    .line 116
    sget-object v0, Lcom/android/dx/rop/type/Type;->LONG_CLASS:Lcom/android/dx/rop/type/Type;

    .line 117
    .line 118
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 119
    .line 120
    .line 121
    sget-object v0, Lcom/android/dx/rop/type/Type;->SHORT_CLASS:Lcom/android/dx/rop/type/Type;

    .line 122
    .line 123
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 124
    .line 125
    .line 126
    sget-object v0, Lcom/android/dx/rop/type/Type;->VOID_CLASS:Lcom/android/dx/rop/type/Type;

    .line 127
    .line 128
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 129
    .line 130
    .line 131
    sget-object v0, Lcom/android/dx/rop/type/Type;->BOOLEAN_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 132
    .line 133
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 134
    .line 135
    .line 136
    sget-object v0, Lcom/android/dx/rop/type/Type;->BYTE_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 137
    .line 138
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 139
    .line 140
    .line 141
    sget-object v0, Lcom/android/dx/rop/type/Type;->CHAR_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 142
    .line 143
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 144
    .line 145
    .line 146
    sget-object v0, Lcom/android/dx/rop/type/Type;->DOUBLE_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 147
    .line 148
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 149
    .line 150
    .line 151
    sget-object v0, Lcom/android/dx/rop/type/Type;->FLOAT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 152
    .line 153
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 154
    .line 155
    .line 156
    sget-object v0, Lcom/android/dx/rop/type/Type;->INT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 157
    .line 158
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 159
    .line 160
    .line 161
    sget-object v0, Lcom/android/dx/rop/type/Type;->LONG_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 162
    .line 163
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 164
    .line 165
    .line 166
    sget-object v0, Lcom/android/dx/rop/type/Type;->OBJECT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 167
    .line 168
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 169
    .line 170
    .line 171
    sget-object v0, Lcom/android/dx/rop/type/Type;->SHORT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 172
    .line 173
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public static intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;
    .locals 9

    .line 1
    sget-object v0, Lcom/android/dx/rop/type/Type;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    const/16 v2, 0x5b

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getArrayType()Lcom/android/dx/rop/type/Type;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/16 v5, 0x4c

    .line 41
    .line 42
    const-string v6, "bad descriptor: "

    .line 43
    .line 44
    if-ne v0, v5, :cond_6

    .line 45
    .line 46
    sub-int/2addr v4, v3

    .line 47
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/16 v5, 0x3b

    .line 52
    .line 53
    if-ne v0, v5, :cond_6

    .line 54
    .line 55
    move v0, v3

    .line 56
    :goto_0
    if-ge v0, v4, :cond_5

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/16 v8, 0x28

    .line 63
    .line 64
    if-eq v7, v8, :cond_4

    .line 65
    .line 66
    const/16 v8, 0x29

    .line 67
    .line 68
    if-eq v7, v8, :cond_4

    .line 69
    .line 70
    const/16 v8, 0x2e

    .line 71
    .line 72
    if-eq v7, v8, :cond_4

    .line 73
    .line 74
    const/16 v8, 0x2f

    .line 75
    .line 76
    if-eq v7, v8, :cond_2

    .line 77
    .line 78
    if-eq v7, v5, :cond_4

    .line 79
    .line 80
    if-eq v7, v2, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    if-eq v0, v3, :cond_3

    .line 84
    .line 85
    if-eq v0, v4, :cond_3

    .line 86
    .line 87
    add-int/lit8 v7, v0, -0x1

    .line 88
    .line 89
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eq v7, v8, :cond_3

    .line 94
    .line 95
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_4
    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_5
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 115
    .line 116
    const/16 v1, 0x9

    .line 117
    .line 118
    invoke-direct {v0, p0, v1}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_6
    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :catch_0
    const-string p0, "descriptor == null"

    .line 135
    .line 136
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v1

    .line 140
    :catch_1
    const-string p0, "descriptor is empty"

    .line 141
    .line 142
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v1
.end method

.method public static internClassName(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "["

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "L"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 p0, 0x3b

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    const-string p0, "name == null"

    .line 41
    .line 42
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public static internReturnType(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "V"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :catch_0
    const-string p0, "descriptor == null"

    .line 18
    .line 19
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method private static putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;
    .locals 2

    .line 1
    sget-object v0, Lcom/android/dx/rop/type/Type;->internTable:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/android/dx/rop/type/Type;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    return-object p0
.end method


# virtual methods
.method public asUninitialized(I)Lcom/android/dx/rop/type/Type;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_2

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isUninitialized()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "N"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lcom/android/dx/rop/type/Type;

    .line 40
    .line 41
    const/16 v2, 0x9

    .line 42
    .line 43
    invoke-direct {v1, v0, v2, p1}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;II)V

    .line 44
    .line 45
    .line 46
    iput-object p0, v1, Lcom/android/dx/rop/type/Type;->initializedType:Lcom/android/dx/rop/type/Type;

    .line 47
    .line 48
    invoke-static {v1}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_0
    const-string p1, "already uninitialized: "

    .line 54
    .line 55
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_1
    const-string p1, "not a reference type: "

    .line 62
    .line 63
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_2
    const-string p0, "newAt < 0"

    .line 70
    .line 71
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method

.method public compareTo(Lcom/android/dx/rop/type/Type;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/android/dx/rop/type/Type;

    invoke-virtual {p0, p1}, Lcom/android/dx/rop/type/Type;->compareTo(Lcom/android/dx/rop/type/Type;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 12
    .line 13
    check-cast p1, Lcom/android/dx/rop/type/Type;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public getArrayType()Lcom/android/dx/rop/type/Type;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/type/Type;->arrayType:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "["

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/16 v2, 0x9

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lcom/android/dx/rop/type/Type;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->putIntern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/android/dx/rop/type/Type;->arrayType:Lcom/android/dx/rop/type/Type;

    .line 33
    .line 34
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->arrayType:Lcom/android/dx/rop/type/Type;

    .line 35
    .line 36
    return-object p0
.end method

.method public getBasicFrameType()I
    .locals 2

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x6

    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    if-eq p0, v1, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    if-eq p0, v0, :cond_0

    .line 18
    .line 19
    return p0

    .line 20
    :cond_0
    return v1
.end method

.method public getBasicType()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    return p0
.end method

.method public getCategory()I
    .locals 1

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x2

    .line 12
    return p0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/type/Type;->className:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 19
    .line 20
    const/16 v2, 0x5b

    .line 21
    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    iput-object v1, p0, Lcom/android/dx/rop/type/Type;->className:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x1

    .line 28
    invoke-static {v0, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/android/dx/rop/type/Type;->className:Ljava/lang/String;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string p0, "not an object type: "

    .line 36
    .line 37
    invoke-static {p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_2
    :goto_0
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->className:Ljava/lang/String;

    .line 47
    .line 48
    return-object p0
.end method

.method public getComponentType()Lcom/android/dx/rop/type/Type;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/type/Type;->componentType:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 13
    .line 14
    const/16 v2, 0x5b

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/android/dx/rop/type/Type;->componentType:Lcom/android/dx/rop/type/Type;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "not an array type: "

    .line 31
    .line 32
    invoke-static {p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->componentType:Lcom/android/dx/rop/type/Type;

    .line 42
    .line 43
    return-object p0
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFrameType()Lcom/android/dx/rop/type/Type;
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 21
    .line 22
    return-object p0
.end method

.method public bridge synthetic getFrameType()Lcom/android/dx/rop/type/TypeBearer;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getFrameType()Lcom/android/dx/rop/type/Type;

    move-result-object p0

    return-object p0
.end method

.method public getInitializedType()Lcom/android/dx/rop/type/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/type/Type;->initializedType:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "initialized type: "

    .line 7
    .line 8
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public getNewAt()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->newAt:I

    .line 2
    .line 3
    return p0
.end method

.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isArray()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/16 v1, 0x5b

    .line 9
    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    return v0
.end method

.method public isArrayOrKnownNull()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/type/Type;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public isCategory1()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public isCategory2()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x1

    .line 12
    return p0
.end method

.method public isConstant()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isIntlike()Z
    .locals 2

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq p0, v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    if-eq p0, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    if-eq p0, v1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_0
    return v0
.end method

.method public isPrimitive()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :pswitch_0
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public isReference()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isUninitialized()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/type/Type;->newAt:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/rop/type/Type;->basicType:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, "[]"

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getClassName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v0, "/"

    .line 46
    .line 47
    const-string v1, "."

    .line 48
    .line 49
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_1
    const-string p0, "short"

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_2
    const-string p0, "long"

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_3
    const-string p0, "int"

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_4
    const-string p0, "float"

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_5
    const-string p0, "double"

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_6
    const-string p0, "char"

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_7
    const-string p0, "byte"

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_8
    const-string p0, "boolean"

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_9
    const-string p0, "void"

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/type/Type;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
