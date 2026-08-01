.class public abstract enum Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/ToStringMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ValueConsumer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum BOOLEAN:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum BYTE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum CHARACTER:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum CHARACTER_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum CHARACTER_SEQUENCE:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum DOUBLE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum FLOAT_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum INTEGER_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum LONG:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum LONG_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum NESTED_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum OBJECT:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum REFERENCE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum SHORT_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

.field public static final enum STRING:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;


# direct methods
.method static constructor <clinit>()V
    .locals 39

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$1;

    .line 2
    .line 3
    const-string v1, "BOOLEAN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->BOOLEAN:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$2;

    .line 12
    .line 13
    const-string v3, "CHARACTER"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->CHARACTER:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$3;

    .line 22
    .line 23
    const-string v5, "INTEGER"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->INTEGER:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 30
    .line 31
    new-instance v5, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$4;

    .line 32
    .line 33
    const-string v7, "LONG"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->LONG:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 40
    .line 41
    new-instance v7, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$5;

    .line 42
    .line 43
    const-string v9, "FLOAT"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$5;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->FLOAT:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 50
    .line 51
    new-instance v9, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$6;

    .line 52
    .line 53
    const-string v11, "DOUBLE"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$6;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->DOUBLE:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 60
    .line 61
    new-instance v11, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$7;

    .line 62
    .line 63
    const-string v13, "STRING"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v13, v14}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$7;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->STRING:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 70
    .line 71
    new-instance v13, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$8;

    .line 72
    .line 73
    const-string v15, "CHARACTER_SEQUENCE"

    .line 74
    .line 75
    move/from16 v16, v2

    .line 76
    .line 77
    const/4 v2, 0x7

    .line 78
    invoke-direct {v13, v15, v2}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$8;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    sput-object v13, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->CHARACTER_SEQUENCE:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 82
    .line 83
    new-instance v15, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$9;

    .line 84
    .line 85
    move/from16 v17, v2

    .line 86
    .line 87
    const-string v2, "OBJECT"

    .line 88
    .line 89
    move/from16 v18, v4

    .line 90
    .line 91
    const/16 v4, 0x8

    .line 92
    .line 93
    invoke-direct {v15, v2, v4}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$9;-><init>(Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    sput-object v15, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->OBJECT:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 97
    .line 98
    new-instance v2, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$10;

    .line 99
    .line 100
    move/from16 v19, v4

    .line 101
    .line 102
    const-string v4, "BOOLEAN_ARRAY"

    .line 103
    .line 104
    move/from16 v20, v6

    .line 105
    .line 106
    const/16 v6, 0x9

    .line 107
    .line 108
    invoke-direct {v2, v4, v6}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$10;-><init>(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    sput-object v2, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 112
    .line 113
    new-instance v4, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$11;

    .line 114
    .line 115
    move/from16 v21, v6

    .line 116
    .line 117
    const-string v6, "BYTE_ARRAY"

    .line 118
    .line 119
    move/from16 v22, v8

    .line 120
    .line 121
    const/16 v8, 0xa

    .line 122
    .line 123
    invoke-direct {v4, v6, v8}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$11;-><init>(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    sput-object v4, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->BYTE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 127
    .line 128
    new-instance v6, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$12;

    .line 129
    .line 130
    move/from16 v23, v8

    .line 131
    .line 132
    const-string v8, "SHORT_ARRAY"

    .line 133
    .line 134
    move/from16 v24, v10

    .line 135
    .line 136
    const/16 v10, 0xb

    .line 137
    .line 138
    invoke-direct {v6, v8, v10}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$12;-><init>(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    sput-object v6, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->SHORT_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 142
    .line 143
    new-instance v8, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$13;

    .line 144
    .line 145
    move/from16 v25, v10

    .line 146
    .line 147
    const-string v10, "CHARACTER_ARRAY"

    .line 148
    .line 149
    move/from16 v26, v12

    .line 150
    .line 151
    const/16 v12, 0xc

    .line 152
    .line 153
    invoke-direct {v8, v10, v12}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$13;-><init>(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    sput-object v8, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->CHARACTER_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 157
    .line 158
    new-instance v10, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$14;

    .line 159
    .line 160
    move/from16 v27, v12

    .line 161
    .line 162
    const-string v12, "INTEGER_ARRAY"

    .line 163
    .line 164
    move/from16 v28, v14

    .line 165
    .line 166
    const/16 v14, 0xd

    .line 167
    .line 168
    invoke-direct {v10, v12, v14}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$14;-><init>(Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    sput-object v10, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->INTEGER_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 172
    .line 173
    new-instance v12, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$15;

    .line 174
    .line 175
    move/from16 v29, v14

    .line 176
    .line 177
    const-string v14, "LONG_ARRAY"

    .line 178
    .line 179
    move-object/from16 v30, v0

    .line 180
    .line 181
    const/16 v0, 0xe

    .line 182
    .line 183
    invoke-direct {v12, v14, v0}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$15;-><init>(Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    sput-object v12, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->LONG_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 187
    .line 188
    new-instance v14, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$16;

    .line 189
    .line 190
    move/from16 v31, v0

    .line 191
    .line 192
    const-string v0, "FLOAT_ARRAY"

    .line 193
    .line 194
    move-object/from16 v32, v1

    .line 195
    .line 196
    const/16 v1, 0xf

    .line 197
    .line 198
    invoke-direct {v14, v0, v1}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$16;-><init>(Ljava/lang/String;I)V

    .line 199
    .line 200
    .line 201
    sput-object v14, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->FLOAT_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 202
    .line 203
    new-instance v0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$17;

    .line 204
    .line 205
    move/from16 v33, v1

    .line 206
    .line 207
    const-string v1, "DOUBLE_ARRAY"

    .line 208
    .line 209
    move-object/from16 v34, v2

    .line 210
    .line 211
    const/16 v2, 0x10

    .line 212
    .line 213
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$17;-><init>(Ljava/lang/String;I)V

    .line 214
    .line 215
    .line 216
    sput-object v0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->DOUBLE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 217
    .line 218
    new-instance v1, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$18;

    .line 219
    .line 220
    move/from16 v35, v2

    .line 221
    .line 222
    const-string v2, "REFERENCE_ARRAY"

    .line 223
    .line 224
    move-object/from16 v36, v0

    .line 225
    .line 226
    const/16 v0, 0x11

    .line 227
    .line 228
    invoke-direct {v1, v2, v0}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$18;-><init>(Ljava/lang/String;I)V

    .line 229
    .line 230
    .line 231
    sput-object v1, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->REFERENCE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 232
    .line 233
    new-instance v2, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$19;

    .line 234
    .line 235
    move/from16 v37, v0

    .line 236
    .line 237
    const-string v0, "NESTED_ARRAY"

    .line 238
    .line 239
    move-object/from16 v38, v1

    .line 240
    .line 241
    const/16 v1, 0x12

    .line 242
    .line 243
    invoke-direct {v2, v0, v1}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$19;-><init>(Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    sput-object v2, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->NESTED_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 247
    .line 248
    const/16 v0, 0x13

    .line 249
    .line 250
    new-array v0, v0, [Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 251
    .line 252
    aput-object v30, v0, v16

    .line 253
    .line 254
    aput-object v32, v0, v18

    .line 255
    .line 256
    aput-object v3, v0, v20

    .line 257
    .line 258
    aput-object v5, v0, v22

    .line 259
    .line 260
    aput-object v7, v0, v24

    .line 261
    .line 262
    aput-object v9, v0, v26

    .line 263
    .line 264
    aput-object v11, v0, v28

    .line 265
    .line 266
    aput-object v13, v0, v17

    .line 267
    .line 268
    aput-object v15, v0, v19

    .line 269
    .line 270
    aput-object v34, v0, v21

    .line 271
    .line 272
    aput-object v4, v0, v23

    .line 273
    .line 274
    aput-object v6, v0, v25

    .line 275
    .line 276
    aput-object v8, v0, v27

    .line 277
    .line 278
    aput-object v10, v0, v29

    .line 279
    .line 280
    aput-object v12, v0, v31

    .line 281
    .line 282
    aput-object v14, v0, v33

    .line 283
    .line 284
    aput-object v36, v0, v35

    .line 285
    .line 286
    aput-object v38, v0, v37

    .line 287
    .line 288
    aput-object v2, v0, v1

    .line 289
    .line 290
    sput-object v0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->$VALUES:[Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 291
    .line 292
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->BOOLEAN:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->CHARACTER:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_12

    .line 30
    .line 31
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_12

    .line 38
    .line 39
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_2
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->LONG:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_3
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->FLOAT:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_4
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->DOUBLE:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_5
    const-class v0, Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->STRING:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_6
    const-class v0, Ljava/lang/CharSequence;

    .line 94
    .line 95
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Ljava/lang/Class;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->CHARACTER_SEQUENCE:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_7
    const-class v0, [Z

    .line 105
    .line 106
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_8
    const-class v0, [B

    .line 116
    .line 117
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->BYTE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_9
    const-class v0, [S

    .line 127
    .line 128
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_a

    .line 133
    .line 134
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->SHORT_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_a
    const-class v0, [C

    .line 138
    .line 139
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_b

    .line 144
    .line 145
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->CHARACTER_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 146
    .line 147
    return-object p0

    .line 148
    :cond_b
    const-class v0, [I

    .line 149
    .line 150
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_c

    .line 155
    .line 156
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->INTEGER_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 157
    .line 158
    return-object p0

    .line 159
    :cond_c
    const-class v0, [J

    .line 160
    .line 161
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_d

    .line 166
    .line 167
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->LONG_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 168
    .line 169
    return-object p0

    .line 170
    :cond_d
    const-class v0, [F

    .line 171
    .line 172
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_e

    .line 177
    .line 178
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->FLOAT_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_e
    const-class v0, [D

    .line 182
    .line 183
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_f

    .line 188
    .line 189
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->DOUBLE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_f
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_11

    .line 197
    .line 198
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    if-eqz p0, :cond_10

    .line 207
    .line 208
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->NESTED_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 209
    .line 210
    return-object p0

    .line 211
    :cond_10
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->REFERENCE_ARRAY:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 212
    .line 213
    return-object p0

    .line 214
    :cond_11
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->OBJECT:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 215
    .line 216
    return-object p0

    .line 217
    :cond_12
    :goto_0
    sget-object p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->INTEGER:Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 218
    .line 219
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->$VALUES:[Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isValid()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
