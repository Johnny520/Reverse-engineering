.class public abstract Li4/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:[I

.field public static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    sput-object v1, Li4/h;->a:[I

    .line 6
    .line 7
    new-array v0, v0, [Ljava/lang/String;

    .line 8
    .line 9
    sput-object v0, Li4/h;->b:[Ljava/lang/String;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    const/16 v2, 0x9c2

    .line 14
    .line 15
    if-ge v1, v2, :cond_15

    .line 16
    .line 17
    const-string v2, "00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;"

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0x10

    .line 24
    .line 25
    invoke-static {v3, v4}, Ljava/lang/Character;->digit(CI)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v5, 0x4

    .line 30
    shl-int/2addr v3, v5

    .line 31
    add-int/lit8 v6, v1, 0x1

    .line 32
    .line 33
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-static {v6, v4}, Ljava/lang/Character;->digit(CI)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    or-int/2addr v3, v6

    .line 42
    add-int/lit8 v6, v1, 0x3

    .line 43
    .line 44
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const/16 v7, 0x2d

    .line 49
    .line 50
    const/16 v8, 0x6d

    .line 51
    .line 52
    const/16 v9, 0x63

    .line 53
    .line 54
    const/16 v10, 0x49

    .line 55
    .line 56
    const/4 v11, 0x1

    .line 57
    if-eq v6, v7, :cond_a

    .line 58
    .line 59
    if-eq v6, v10, :cond_9

    .line 60
    .line 61
    const/16 v7, 0x57

    .line 62
    .line 63
    if-eq v6, v7, :cond_8

    .line 64
    .line 65
    const/16 v7, 0x70

    .line 66
    .line 67
    if-eq v6, v7, :cond_7

    .line 68
    .line 69
    const/16 v7, 0x79

    .line 70
    .line 71
    if-eq v6, v7, :cond_6

    .line 72
    .line 73
    const/16 v7, 0x4c

    .line 74
    .line 75
    if-eq v6, v7, :cond_5

    .line 76
    .line 77
    const/16 v7, 0x4d

    .line 78
    .line 79
    if-eq v6, v7, :cond_4

    .line 80
    .line 81
    const/16 v7, 0x62

    .line 82
    .line 83
    if-eq v6, v7, :cond_3

    .line 84
    .line 85
    if-eq v6, v9, :cond_2

    .line 86
    .line 87
    const/16 v7, 0x6c

    .line 88
    .line 89
    if-eq v6, v7, :cond_1

    .line 90
    .line 91
    if-eq v6, v8, :cond_0

    .line 92
    .line 93
    packed-switch v6, :pswitch_data_0

    .line 94
    .line 95
    .line 96
    packed-switch v6, :pswitch_data_1

    .line 97
    .line 98
    .line 99
    move v4, v0

    .line 100
    goto :goto_1

    .line 101
    :pswitch_0
    const/16 v4, 0x11

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_1
    const/16 v4, 0xf

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_2
    const/4 v4, 0x6

    .line 108
    goto :goto_1

    .line 109
    :pswitch_3
    const/4 v4, 0x5

    .line 110
    goto :goto_1

    .line 111
    :pswitch_4
    move v4, v5

    .line 112
    goto :goto_1

    .line 113
    :pswitch_5
    const/4 v4, 0x3

    .line 114
    goto :goto_1

    .line 115
    :pswitch_6
    const/4 v4, 0x2

    .line 116
    goto :goto_1

    .line 117
    :cond_0
    const/16 v4, 0xb

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    const/16 v4, 0xa

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    const/16 v4, 0x8

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    const/4 v4, 0x7

    .line 127
    goto :goto_1

    .line 128
    :cond_4
    const/16 v4, 0x12

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    const/16 v4, 0xe

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    const/16 v4, 0xc

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_7
    const/16 v4, 0x9

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_8
    const/16 v4, 0x13

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_9
    const/16 v4, 0xd

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_a
    move v4, v11

    .line 147
    :goto_1
    :pswitch_7
    add-int/lit8 v5, v1, 0x5

    .line 148
    .line 149
    add-int/lit8 v1, v1, 0x4

    .line 150
    .line 151
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    const/16 v6, 0x3a

    .line 156
    .line 157
    if-ne v1, v6, :cond_14

    .line 158
    .line 159
    :goto_2
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    const/16 v6, 0x44

    .line 164
    .line 165
    if-eq v1, v6, :cond_13

    .line 166
    .line 167
    const/16 v6, 0x46

    .line 168
    .line 169
    if-eq v1, v6, :cond_12

    .line 170
    .line 171
    if-eq v1, v9, :cond_11

    .line 172
    .line 173
    const/16 v6, 0x66

    .line 174
    .line 175
    if-eq v1, v6, :cond_10

    .line 176
    .line 177
    const/16 v6, 0x69

    .line 178
    .line 179
    if-eq v1, v6, :cond_f

    .line 180
    .line 181
    if-eq v1, v8, :cond_e

    .line 182
    .line 183
    const/16 v6, 0x73

    .line 184
    .line 185
    if-eq v1, v6, :cond_d

    .line 186
    .line 187
    if-eq v1, v10, :cond_c

    .line 188
    .line 189
    const/16 v6, 0x4a

    .line 190
    .line 191
    if-eq v1, v6, :cond_b

    .line 192
    .line 193
    add-int/lit8 v5, v5, 0x1

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_b
    or-int/lit16 v1, v4, 0x80

    .line 197
    .line 198
    :goto_3
    move v4, v1

    .line 199
    goto :goto_4

    .line 200
    :cond_c
    or-int/lit8 v1, v4, 0x20

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_d
    or-int/lit16 v1, v4, 0x400

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_e
    or-int/lit16 v1, v4, 0x1000

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_f
    or-int/lit16 v1, v4, 0x2000

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_10
    or-int/lit16 v1, v4, 0x800

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_11
    or-int/lit16 v1, v4, 0x200

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_12
    or-int/lit8 v1, v4, 0x40

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_13
    or-int/lit16 v1, v4, 0x100

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_14
    :goto_5
    const/16 v1, 0x3b

    .line 228
    .line 229
    invoke-virtual {v2, v1, v5}, Ljava/lang/String;->indexOf(II)I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    sget-object v6, Li4/h;->a:[I

    .line 234
    .line 235
    aput v4, v6, v3

    .line 236
    .line 237
    sget-object v4, Li4/h;->b:[Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v2, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    aput-object v2, v4, v3

    .line 244
    .line 245
    add-int/2addr v1, v11

    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_15
    return-void

    .line 249
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    :pswitch_data_1
    .packed-switch 0x53
        :pswitch_1
        :pswitch_7
        :pswitch_0
    .end packed-switch
.end method

.method public static a(I)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Li4/h;->b:[Ljava/lang/String;

    .line 2
    .line 3
    aget-object v1, v0, p0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, La/a;->W0(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "unused_"

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    aput-object v1, v0, p0

    .line 18
    .line 19
    :cond_0
    return-object v1
.end method
