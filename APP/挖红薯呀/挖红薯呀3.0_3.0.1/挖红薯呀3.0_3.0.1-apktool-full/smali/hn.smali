.class public final Lhn;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field private static A:Z = false

.field private static volatile B:Ljava/lang/String; = null

.field private static volatile C:Lorg/luckypray/dexkit/DexKitBridge; = null

.field public static final D:I

.field public static final a:Lhn;

.field private static final b:Lu60;

.field private static final c:Ljava/lang/String; = "xp1_dexkit_cache.json"

.field private static final d:Lu60;

.field private static final e:Lu60;

.field private static final f:Lu60;

.field private static final g:Lu60;

.field private static final h:Lu60;

.field private static final i:Lu60;

.field private static final j:Lu60;

.field private static final k:Lu60;

.field private static final l:Lu60;

.field private static final m:Lu60;

.field private static final n:Lu60;

.field private static final o:Lu60;

.field private static final p:Lu60;

.field private static final q:Lu60;

.field private static final r:Lu60;

.field private static final s:Ljava/lang/String; = "xp1_dexkit_salt_2024"

.field private static volatile t:Lrn$a;

.field private static u:I

.field private static v:J

.field private static w:Ljava/lang/String;

.field private static x:Ljava/lang/String;

.field private static volatile y:Z

.field private static volatile z:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lhn;

    .line 2
    .line 3
    invoke-direct {v0}, Lhn;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhn;->a:Lhn;

    .line 7
    .line 8
    new-instance v0, La2;

    .line 9
    .line 10
    const/16 v1, 0x1b

    .line 11
    .line 12
    invoke-direct {v0, v1}, La2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lx51;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lhn;->b:Lu60;

    .line 21
    .line 22
    :try_start_0
    const-string v0, "dexkit"

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    sget-object v1, Llb0;->a:Llb0;

    .line 30
    .line 31
    sget-object v2, Lhn;->a:Lhn;

    .line 32
    .line 33
    invoke-direct {v2}, Lhn;->P()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2, v0}, Llb0;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    new-instance v0, Lgn;

    .line 41
    .line 42
    const/16 v1, 0xa

    .line 43
    .line 44
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lx51;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lhn;->d:Lu60;

    .line 53
    .line 54
    new-instance v0, Lgn;

    .line 55
    .line 56
    const/16 v1, 0xb

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lx51;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 64
    .line 65
    .line 66
    sput-object v1, Lhn;->e:Lu60;

    .line 67
    .line 68
    new-instance v0, Lgn;

    .line 69
    .line 70
    const/16 v1, 0xc

    .line 71
    .line 72
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lx51;

    .line 76
    .line 77
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 78
    .line 79
    .line 80
    sput-object v1, Lhn;->f:Lu60;

    .line 81
    .line 82
    new-instance v0, La2;

    .line 83
    .line 84
    const/16 v1, 0x1c

    .line 85
    .line 86
    invoke-direct {v0, v1}, La2;-><init>(I)V

    .line 87
    .line 88
    .line 89
    new-instance v1, Lx51;

    .line 90
    .line 91
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 92
    .line 93
    .line 94
    sput-object v1, Lhn;->g:Lu60;

    .line 95
    .line 96
    new-instance v0, La2;

    .line 97
    .line 98
    const/16 v1, 0x1d

    .line 99
    .line 100
    invoke-direct {v0, v1}, La2;-><init>(I)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Lx51;

    .line 104
    .line 105
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 106
    .line 107
    .line 108
    sput-object v1, Lhn;->h:Lu60;

    .line 109
    .line 110
    new-instance v0, Lgn;

    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 114
    .line 115
    .line 116
    new-instance v1, Lx51;

    .line 117
    .line 118
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 119
    .line 120
    .line 121
    sput-object v1, Lhn;->i:Lu60;

    .line 122
    .line 123
    new-instance v0, Lgn;

    .line 124
    .line 125
    const/4 v1, 0x1

    .line 126
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 127
    .line 128
    .line 129
    new-instance v1, Lx51;

    .line 130
    .line 131
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 132
    .line 133
    .line 134
    sput-object v1, Lhn;->j:Lu60;

    .line 135
    .line 136
    new-instance v0, Lgn;

    .line 137
    .line 138
    const/4 v1, 0x2

    .line 139
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 140
    .line 141
    .line 142
    new-instance v1, Lx51;

    .line 143
    .line 144
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 145
    .line 146
    .line 147
    sput-object v1, Lhn;->k:Lu60;

    .line 148
    .line 149
    new-instance v0, Lgn;

    .line 150
    .line 151
    const/4 v1, 0x3

    .line 152
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Lx51;

    .line 156
    .line 157
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 158
    .line 159
    .line 160
    sput-object v1, Lhn;->l:Lu60;

    .line 161
    .line 162
    new-instance v0, Lgn;

    .line 163
    .line 164
    const/4 v1, 0x4

    .line 165
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Lx51;

    .line 169
    .line 170
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 171
    .line 172
    .line 173
    sput-object v1, Lhn;->m:Lu60;

    .line 174
    .line 175
    new-instance v0, Lgn;

    .line 176
    .line 177
    const/4 v1, 0x5

    .line 178
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 179
    .line 180
    .line 181
    new-instance v1, Lx51;

    .line 182
    .line 183
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 184
    .line 185
    .line 186
    sput-object v1, Lhn;->n:Lu60;

    .line 187
    .line 188
    new-instance v0, Lgn;

    .line 189
    .line 190
    const/4 v1, 0x6

    .line 191
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 192
    .line 193
    .line 194
    new-instance v1, Lx51;

    .line 195
    .line 196
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 197
    .line 198
    .line 199
    sput-object v1, Lhn;->o:Lu60;

    .line 200
    .line 201
    new-instance v0, Lgn;

    .line 202
    .line 203
    const/4 v1, 0x7

    .line 204
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 205
    .line 206
    .line 207
    new-instance v1, Lx51;

    .line 208
    .line 209
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 210
    .line 211
    .line 212
    sput-object v1, Lhn;->p:Lu60;

    .line 213
    .line 214
    new-instance v0, Lgn;

    .line 215
    .line 216
    const/16 v1, 0x8

    .line 217
    .line 218
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 219
    .line 220
    .line 221
    new-instance v1, Lx51;

    .line 222
    .line 223
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 224
    .line 225
    .line 226
    sput-object v1, Lhn;->q:Lu60;

    .line 227
    .line 228
    new-instance v0, Lgn;

    .line 229
    .line 230
    const/16 v1, 0x9

    .line 231
    .line 232
    invoke-direct {v0, v1}, Lgn;-><init>(I)V

    .line 233
    .line 234
    .line 235
    new-instance v1, Lx51;

    .line 236
    .line 237
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 238
    .line 239
    .line 240
    sput-object v1, Lhn;->r:Lu60;

    .line 241
    .line 242
    const/4 v0, -0x1

    .line 243
    sput v0, Lhn;->u:I

    .line 244
    .line 245
    const-wide/16 v0, -0x1

    .line 246
    .line 247
    sput-wide v0, Lhn;->v:J

    .line 248
    .line 249
    const-string v0, ""

    .line 250
    .line 251
    sput-object v0, Lhn;->w:Ljava/lang/String;

    .line 252
    .line 253
    sput-object v0, Lhn;->x:Ljava/lang/String;

    .line 254
    .line 255
    const/16 v0, 0x8

    .line 256
    .line 257
    sput v0, Lhn;->D:I

    .line 258
    .line 259
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final A()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x27
        0x17
        0x1e
        0x56
        0x1b
        0xa
        0x15
        0x42
        0x38
        0x3c
        0x19
        0x50
        0x27
        0x17
        0x17
    .end array-data
.end method

.method private static final B()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x26
        0x1d
        0x1e
        0x44
        0x9
        0xd
        0x19
        0x5d
        0x2f
        0x1d
        0x2
    .end array-data
.end method

.method private static final C()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x26
        0x17
        0x14
        0x44
        0x27
        0x1d
        0x2f
        0x47
        0x2e
        0xa
        0x3
        0x58
        0x24
        0x16
        0x2f
        0x52
        0x24
        0x1c
        0x15
    .end array-data
.end method

.method private static final D()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x25
        0x17
        0x4
        0x54
        0xf
        0x1d
        0x4
        0x50
        0x22
        0x14
        0x31
        0x52
        0x3f
        0x11
        0x6
        0x58
        0x3f
        0x1
    .end array-data
.end method

.method private static final E()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x5

    .line 5
    const/16 v3, 0x3b

    .line 6
    .line 7
    filled-new-array {v3, v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final F()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x3d
        0x11
        0x14
        0x54
        0x24
        0x36
        0x1f
        0x45
        0x2e
        0x3b
        0x1f
        0x5f
        0x3f
        0xa
        0x1f
        0x5d
        0x27
        0x1d
        0x2
    .end array-data
.end method

.method private final H(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lhn;->j0([B)[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v0, Lyd;->a:Ljava/nio/charset/Charset;

    .line 16
    .line 17
    invoke-direct {p1, p0, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method private final I(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lyd;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lhn;->j0([B)[B

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic N(Lhn;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;JLjava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lrn$a;
    .locals 10

    .line 1
    and-int/lit8 v0, p9, 0x40

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    move-object v9, v0

    .line 8
    :goto_0
    move-object v1, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v3, p2

    .line 11
    move-object v4, p3

    .line 12
    move-wide v5, p4

    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move/from16 v8, p7

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move-object/from16 v9, p8

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    invoke-virtual/range {v1 .. v9}, Lhn;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;JLjava/lang/String;ILjava/lang/String;)Lrn$a;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method private final P()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->b:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final Q()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->o:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final R()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->n:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final S()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->e:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final T()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->f:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final U()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->h:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final V()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->j:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final W()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->p:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final X()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->q:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final Y()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->r:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final Z()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->i:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->v()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final a0()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->l:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->x()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final b0()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->d:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final c0()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->g:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final d0()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->m:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->C()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final e0()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhn;->k:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->D()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic g()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :catch_0
    :cond_1
    :goto_0
    return-object p0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->w()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final h0(Ljava/io/File;JLjava/lang/String;ILjava/lang/String;Ljava/lang/ClassLoader;)Lrn$a;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    invoke-static/range {p1 .. p1}, Lpt;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-direct {v0, v4}, Lhn;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    new-instance v5, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Lhn;->b0()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-virtual {v5, v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    move/from16 v7, p5

    .line 39
    .line 40
    if-eq v4, v7, :cond_1

    .line 41
    .line 42
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->delete()Z

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_1
    invoke-direct {v0}, Lhn;->S()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const-wide/16 v7, 0x0

    .line 51
    .line 52
    invoke-virtual {v5, v4, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    cmp-long v4, v7, p2

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->delete()Z

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    :cond_2
    invoke-direct {v0}, Lhn;->T()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v5, v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    move-object/from16 v7, p4

    .line 73
    .line 74
    invoke-static {v4, v7}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_3

    .line 79
    .line 80
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->delete()Z

    .line 81
    .line 82
    .line 83
    return-object v3

    .line 84
    :cond_3
    invoke-direct {v0}, Lhn;->Q()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v5, v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-lez v7, :cond_4

    .line 100
    .line 101
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-lez v7, :cond_4

    .line 106
    .line 107
    move-object/from16 v7, p6

    .line 108
    .line 109
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_4

    .line 114
    .line 115
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->delete()Z

    .line 116
    .line 117
    .line 118
    return-object v3

    .line 119
    :cond_4
    invoke-direct {v0}, Lhn;->c0()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v5, v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-nez v7, :cond_5

    .line 132
    .line 133
    move-object v4, v3

    .line 134
    :cond_5
    invoke-direct {v0}, Lhn;->U()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-virtual {v5, v7, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-nez v8, :cond_6

    .line 147
    .line 148
    move-object v7, v3

    .line 149
    :cond_6
    invoke-direct {v0}, Lhn;->Z()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-virtual {v5, v8, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-nez v9, :cond_7

    .line 162
    .line 163
    move-object v8, v3

    .line 164
    :cond_7
    new-instance v9, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-direct {v0}, Lhn;->V()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    if-eqz v10, :cond_8

    .line 178
    .line 179
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    :goto_0
    if-ge v6, v11, :cond_8

    .line 184
    .line 185
    invoke-virtual {v10, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    add-int/lit8 v6, v6, 0x1

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_8
    invoke-direct {v0}, Lhn;->e0()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-virtual {v5, v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    if-nez v10, :cond_9

    .line 211
    .line 212
    move-object v6, v3

    .line 213
    :cond_9
    invoke-direct {v0}, Lhn;->a0()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    invoke-virtual {v5, v10, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    if-nez v11, :cond_a

    .line 226
    .line 227
    move-object v10, v3

    .line 228
    :cond_a
    invoke-direct {v0}, Lhn;->d0()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-virtual {v5, v11, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    if-nez v12, :cond_b

    .line 241
    .line 242
    move-object v11, v3

    .line 243
    :cond_b
    invoke-direct {v0}, Lhn;->R()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    invoke-virtual {v5, v12, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 252
    .line 253
    .line 254
    move-result v13

    .line 255
    if-nez v13, :cond_c

    .line 256
    .line 257
    move-object v12, v3

    .line 258
    :cond_c
    invoke-direct {v0}, Lhn;->X()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    invoke-virtual {v5, v13, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 267
    .line 268
    .line 269
    move-result v14

    .line 270
    if-nez v14, :cond_d

    .line 271
    .line 272
    move-object v13, v3

    .line 273
    :cond_d
    invoke-direct {v0}, Lhn;->Y()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    invoke-virtual {v5, v14, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-nez v5, :cond_e

    .line 286
    .line 287
    move-object/from16 v30, v3

    .line 288
    .line 289
    goto :goto_1

    .line 290
    :cond_e
    move-object/from16 v30, v2

    .line 291
    .line 292
    :goto_1
    invoke-direct {v0, v4, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    move-result-object v15

    .line 296
    new-instance v2, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    :cond_f
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    if-eqz v5, :cond_10

    .line 310
    .line 311
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    check-cast v5, Ljava/lang/String;

    .line 316
    .line 317
    sget-object v9, Lhn;->a:Lhn;

    .line 318
    .line 319
    invoke-direct {v9, v5, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    if-eqz v5, :cond_f

    .line 324
    .line 325
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    goto :goto_2

    .line 329
    :cond_10
    invoke-direct {v0, v8, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    move-result-object v17

    .line 333
    invoke-direct {v0, v7, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    move-result-object v18

    .line 337
    invoke-direct {v0, v6, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    move-result-object v19

    .line 341
    invoke-direct {v0, v10, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    move-result-object v20

    .line 345
    invoke-direct {v0, v11, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v21

    .line 349
    invoke-direct {v0, v12, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v22

    .line 353
    invoke-direct {v0, v13, v1}, Lhn;->g0(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    move-result-object v29

    .line 357
    new-instance v14, Lrn$a;

    .line 358
    .line 359
    const/16 v23, 0x0

    .line 360
    .line 361
    const/16 v24, 0x0

    .line 362
    .line 363
    const/16 v25, 0x0

    .line 364
    .line 365
    const/16 v26, 0x0

    .line 366
    .line 367
    const/16 v27, 0x0

    .line 368
    .line 369
    const/16 v28, 0x0

    .line 370
    .line 371
    const/16 v31, 0x0

    .line 372
    .line 373
    const/16 v32, 0x0

    .line 374
    .line 375
    const/16 v33, 0x0

    .line 376
    .line 377
    const/16 v34, 0x0

    .line 378
    .line 379
    const/16 v35, 0x0

    .line 380
    .line 381
    const/16 v36, 0x0

    .line 382
    .line 383
    const v37, 0x3f3f00

    .line 384
    .line 385
    .line 386
    const/16 v38, 0x0

    .line 387
    .line 388
    move-object/from16 v16, v2

    .line 389
    .line 390
    invoke-direct/range {v14 .. v38}, Lrn$a;-><init>(Ljava/lang/Class;Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;ILpl;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v14}, Lrn$a;->B()I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    invoke-virtual {v14}, Lrn$a;->U()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-ge v0, v1, :cond_11

    .line 402
    .line 403
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 404
    .line 405
    .line 406
    return-object v3

    .line 407
    :cond_11
    return-object v14

    .line 408
    :catch_0
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 409
    .line 410
    .line 411
    :catch_1
    :goto_3
    return-object v3
.end method

.method public static synthetic i()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->u()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final i0(Ljava/io/File;JLjava/lang/String;ILjava/lang/String;Lrn$a;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    .line 11
    .line 12
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p7}, Lrn$a;->F()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Class;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    .line 44
    .line 45
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 46
    .line 47
    .line 48
    sget-object v2, Lhn;->a:Lhn;

    .line 49
    .line 50
    invoke-direct {v2}, Lhn;->b0()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v1, v3, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    invoke-direct {v2}, Lhn;->S()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p5

    .line 61
    invoke-virtual {v1, p5, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    invoke-direct {v2}, Lhn;->T()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {v1, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p6}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-lez p2, :cond_2

    .line 76
    .line 77
    invoke-direct {v2}, Lhn;->Q()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {v1, p2, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-direct {v2}, Lhn;->c0()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p7}, Lrn$a;->K()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    const-string p4, ""

    .line 93
    .line 94
    if-eqz p3, :cond_3

    .line 95
    .line 96
    :try_start_1
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move-object p3, p4

    .line 102
    :goto_1
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    invoke-direct {v2}, Lhn;->U()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p7}, Lrn$a;->E()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    if-eqz p3, :cond_4

    .line 114
    .line 115
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    goto :goto_2

    .line 120
    :cond_4
    move-object p3, p4

    .line 121
    :goto_2
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    invoke-direct {v2}, Lhn;->Z()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p7}, Lrn$a;->I()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    if-eqz p3, :cond_5

    .line 133
    .line 134
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    goto :goto_3

    .line 139
    :cond_5
    move-object p3, p4

    .line 140
    :goto_3
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    invoke-direct {v2}, Lhn;->V()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    invoke-direct {v2}, Lhn;->e0()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-virtual {p7}, Lrn$a;->V()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    if-eqz p3, :cond_6

    .line 159
    .line 160
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    goto :goto_4

    .line 165
    :cond_6
    move-object p3, p4

    .line 166
    :goto_4
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    invoke-direct {v2}, Lhn;->a0()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p7}, Lrn$a;->J()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object p3

    .line 177
    if-eqz p3, :cond_7

    .line 178
    .line 179
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    goto :goto_5

    .line 184
    :cond_7
    move-object p3, p4

    .line 185
    :goto_5
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    invoke-direct {v2}, Lhn;->d0()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-virtual {p7}, Lrn$a;->M()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    if-eqz p3, :cond_8

    .line 197
    .line 198
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    goto :goto_6

    .line 203
    :cond_8
    move-object p3, p4

    .line 204
    :goto_6
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    invoke-direct {v2}, Lhn;->R()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {p7}, Lrn$a;->C()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object p3

    .line 215
    if-eqz p3, :cond_9

    .line 216
    .line 217
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    goto :goto_7

    .line 222
    :cond_9
    move-object p3, p4

    .line 223
    :goto_7
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 224
    .line 225
    .line 226
    invoke-direct {v2}, Lhn;->X()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    invoke-virtual {p7}, Lrn$a;->G()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object p3

    .line 234
    if-eqz p3, :cond_a

    .line 235
    .line 236
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p3

    .line 240
    goto :goto_8

    .line 241
    :cond_a
    move-object p3, p4

    .line 242
    :goto_8
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 243
    .line 244
    .line 245
    invoke-direct {v2}, Lhn;->Y()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    invoke-virtual {p7}, Lrn$a;->H()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p3

    .line 253
    if-nez p3, :cond_b

    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_b
    move-object p4, p3

    .line 257
    :goto_9
    invoke-virtual {v1, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-direct {p0, p2}, Lhn;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-static {p0, p1}, Lpt;->d0(Ljava/lang/String;Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 272
    .line 273
    .line 274
    :catch_0
    return-void
.end method

.method public static synthetic j()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->z()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final j0([B)[B
    .locals 5

    .line 1
    const-string p0, "xp1_dexkit_salt_2024"

    .line 2
    .line 3
    sget-object v0, Lyd;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v0, p1

    .line 13
    new-array v0, v0, [B

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    aget-byte v3, p1, v2

    .line 20
    .line 21
    array-length v4, p0

    .line 22
    rem-int v4, v2, v4

    .line 23
    .line 24
    aget-byte v4, p0, v4

    .line 25
    .line 26
    xor-int/2addr v3, v4

    .line 27
    int-to-byte v3, v3

    .line 28
    aput-byte v3, v0, v2

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0
.end method

.method public static synthetic k()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->y()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic l()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->B()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic m()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->F()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic n()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->A()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic o()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->s()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic p()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lhn;->t()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final q()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    const/16 v2, 0x33

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final r()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    new-array v1, v1, [I

    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :array_0
    .array-data 4
        0x2c
        0x15
        0x3
        0x50
        0x24
        0x14
    .end array-data
.end method

.method private static final s()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x23
        0x17
        0x1d
        0x54
        0x5
        0x19
        0x6
        0x58
        0x2c
        0x19
        0x4
        0x58
        0x24
        0x16
        0x26
        0x58
        0x2e
        0xf
    .end array-data
.end method

.method private static final t()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x23
        0x17
        0x3
        0x45
        0x14
        0xe
        0x15
        0x43
        0x38
        0x11
        0x1f
        0x5f
        0x14
        0x1b
        0x1f
        0x55
        0x2e
    .end array-data
.end method

.method private static final u()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x23
        0x17
        0x3
        0x45
        0x14
        0xe
        0x15
        0x43
        0x38
        0x11
        0x1f
        0x5f
        0x14
        0x16
        0x11
        0x5c
        0x2e
    .end array-data
.end method

.method private static final v()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x22
        0x15
        0x11
        0x56
        0x2e
        0x3a
        0x15
        0x50
        0x25
    .end array-data
.end method

.method private static final w()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x22
        0x15
        0x11
        0x56
        0x2e
        0x34
        0x1f
        0x5f
        0x2c
        0x3b
        0x1c
        0x58
        0x28
        0x13
        0x38
        0x50
        0x25
        0x1c
        0x1c
        0x54
        0x39
        0xb
    .end array-data
.end method

.method private static final x()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    new-array v1, v1, [I

    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :array_0
    .array-data 4
        0x35
        0x15
        0x5
        0x45
        0x33
        0x11
        0x17
    .end array-data
.end method

.method private static final y()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x27
        0x1d
        0x16
        0x45
        0xe
        0x16
        0x4
        0x43
        0x2a
        0x16
        0x13
        0x54
        0x8
        0x17
        0x1e
        0x57
        0x22
        0x1f
        0x33
        0x5d
        0x2a
        0xb
        0x3
    .end array-data
.end method

.method private static final z()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x27
        0x1d
        0x16
        0x45
        0xe
        0x16
        0x4
        0x43
        0x2a
        0x16
        0x13
        0x54
        0x8
        0x17
        0x1e
        0x57
        0x22
        0x1f
        0x3d
        0x54
        0x3f
        0x10
        0x1f
        0x55
    .end array-data
.end method


# virtual methods
.method public final G()V
    .locals 3

    .line 1
    const-string p0, "/files/xp1_scan_suppress"

    .line 2
    .line 3
    const-string v0, "/files/xp1_dexkit_cache.json"

    .line 4
    .line 5
    sget-object v1, Lhn;->B:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    :try_start_1
    new-instance v0, Ljava/io/File;

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 31
    .line 32
    .line 33
    :catch_1
    :cond_0
    return-void
.end method

.method public final J()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 0

    .line 1
    sget-object p0, Lhn;->C:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    return-object p0
.end method

.method public final K()Lrn$a;
    .locals 0

    .line 1
    sget-object p0, Lhn;->t:Lrn$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public final L()Z
    .locals 0

    .line 1
    sget-boolean p0, Lhn;->y:Z

    .line 2
    .line 3
    return p0
.end method

.method public final declared-synchronized M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;JLjava/lang/String;ILjava/lang/String;)Lrn$a;
    .locals 37

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v5, p6

    .line 4
    .line 5
    move/from16 v6, p7

    .line 6
    .line 7
    move-object/from16 v7, p8

    .line 8
    .line 9
    const-string v9, "scan "

    .line 10
    .line 11
    const-string v1, "/files/xp1_dexkit_cache.json"

    .line 12
    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v2, Lhn;->t:Lrn$a;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    sget v3, Lhn;->u:I

    .line 34
    .line 35
    if-ne v3, v6, :cond_0

    .line 36
    .line 37
    sget-wide v3, Lhn;->v:J

    .line 38
    .line 39
    cmp-long v3, v3, p4

    .line 40
    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    sget-object v3, Lhn;->w:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v3, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    sget-object v3, Lhn;->x:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v3, v7}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    return-object v2

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_0
    :try_start_1
    sput-object v0, Lhn;->B:Ljava/lang/String;

    .line 65
    .line 66
    sget-boolean v2, Lhn;->A:Z

    .line 67
    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    new-instance v10, Lrn$a;

    .line 71
    .line 72
    sget-object v12, Lhs;->d:Lhs;

    .line 73
    .line 74
    const/high16 v33, 0x3c0000

    .line 75
    .line 76
    const/16 v34, 0x0

    .line 77
    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x0

    .line 81
    const/4 v15, 0x0

    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v17, 0x0

    .line 85
    .line 86
    const/16 v18, 0x0

    .line 87
    .line 88
    const/16 v19, 0x0

    .line 89
    .line 90
    const/16 v20, 0x0

    .line 91
    .line 92
    const/16 v21, 0x0

    .line 93
    .line 94
    const/16 v22, 0x0

    .line 95
    .line 96
    const/16 v23, 0x0

    .line 97
    .line 98
    const/16 v24, 0x0

    .line 99
    .line 100
    const/16 v25, 0x0

    .line 101
    .line 102
    const/16 v26, 0x0

    .line 103
    .line 104
    const/16 v27, 0x0

    .line 105
    .line 106
    const/16 v28, 0x0

    .line 107
    .line 108
    const/16 v29, 0x0

    .line 109
    .line 110
    const/16 v30, 0x0

    .line 111
    .line 112
    const/16 v31, 0x0

    .line 113
    .line 114
    const/16 v32, 0x0

    .line 115
    .line 116
    invoke-direct/range {v10 .. v34}, Lrn$a;-><init>(Ljava/lang/Class;Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;ILpl;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    .line 119
    monitor-exit p0

    .line 120
    return-object v10

    .line 121
    :cond_1
    :try_start_2
    new-instance v2, Ljava/io/File;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    move-object/from16 v1, p0

    .line 131
    .line 132
    move-object/from16 v8, p3

    .line 133
    .line 134
    move-wide/from16 v3, p4

    .line 135
    .line 136
    invoke-direct/range {v1 .. v8}, Lhn;->h0(Ljava/io/File;JLjava/lang/String;ILjava/lang/String;Ljava/lang/ClassLoader;)Lrn$a;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const/4 v10, 0x0

    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    sput-object v0, Lhn;->t:Lrn$a;

    .line 144
    .line 145
    sput p7, Lhn;->u:I

    .line 146
    .line 147
    sput-wide p4, Lhn;->v:J

    .line 148
    .line 149
    sput-object p6, Lhn;->w:Ljava/lang/String;

    .line 150
    .line 151
    sput-object p8, Lhn;->x:Ljava/lang/String;

    .line 152
    .line 153
    sput-boolean v10, Lhn;->y:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    .line 155
    monitor-exit p0

    .line 156
    return-object v0

    .line 157
    :cond_2
    const/4 v11, 0x1

    .line 158
    :try_start_3
    sput-boolean v11, Lhn;->A:Z

    .line 159
    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 161
    .line 162
    .line 163
    move-result-wide v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 164
    :try_start_4
    sget-object v0, Lhn;->C:Lorg/luckypray/dexkit/DexKitBridge;

    .line 165
    .line 166
    if-nez v0, :cond_3

    .line 167
    .line 168
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 169
    .line 170
    move-object/from16 v1, p1

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    sput-object v0, Lhn;->C:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :catchall_1
    move-exception v0

    .line 180
    goto/16 :goto_2

    .line 181
    .line 182
    :cond_3
    :goto_0
    :try_start_5
    sget-object v1, Lrn;->a:Lrn;

    .line 183
    .line 184
    move-object/from16 v8, p3

    .line 185
    .line 186
    invoke-virtual {v1, v0, v8}, Lrn;->Y2(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Lrn$a;

    .line 187
    .line 188
    .line 189
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 190
    move-object v8, v0

    .line 191
    goto :goto_1

    .line 192
    :catchall_2
    move-exception v0

    .line 193
    :try_start_6
    sget-object v1, Llb0;->a:Llb0;

    .line 194
    .line 195
    invoke-direct/range {p0 .. p0}, Lhn;->P()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v1, v5, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    new-instance v12, Lrn$a;

    .line 215
    .line 216
    sget-object v14, Lhs;->d:Lhs;

    .line 217
    .line 218
    const/high16 v35, 0x3c0000

    .line 219
    .line 220
    const/16 v36, 0x0

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v15, 0x0

    .line 224
    const/16 v16, 0x0

    .line 225
    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    const/16 v18, 0x0

    .line 229
    .line 230
    const/16 v19, 0x0

    .line 231
    .line 232
    const/16 v20, 0x0

    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    const/16 v22, 0x0

    .line 237
    .line 238
    const/16 v23, 0x0

    .line 239
    .line 240
    const/16 v24, 0x0

    .line 241
    .line 242
    const/16 v25, 0x0

    .line 243
    .line 244
    const/16 v26, 0x0

    .line 245
    .line 246
    const/16 v27, 0x0

    .line 247
    .line 248
    const/16 v28, 0x0

    .line 249
    .line 250
    const/16 v29, 0x0

    .line 251
    .line 252
    const/16 v30, 0x0

    .line 253
    .line 254
    const/16 v31, 0x0

    .line 255
    .line 256
    const/16 v32, 0x0

    .line 257
    .line 258
    const/16 v33, 0x0

    .line 259
    .line 260
    const/16 v34, 0x0

    .line 261
    .line 262
    invoke-direct/range {v12 .. v36}, Lrn$a;-><init>(Ljava/lang/Class;Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;ILpl;)V

    .line 263
    .line 264
    .line 265
    move-object v8, v12

    .line 266
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 267
    .line 268
    .line 269
    move-result-wide v0

    .line 270
    sub-long/2addr v0, v3

    .line 271
    sput-wide v0, Lhn;->z:J

    .line 272
    .line 273
    move-object/from16 v1, p0

    .line 274
    .line 275
    move-wide/from16 v3, p4

    .line 276
    .line 277
    move-object/from16 v5, p6

    .line 278
    .line 279
    move/from16 v6, p7

    .line 280
    .line 281
    move-object/from16 v7, p8

    .line 282
    .line 283
    invoke-direct/range {v1 .. v8}, Lhn;->i0(Ljava/io/File;JLjava/lang/String;ILjava/lang/String;Lrn$a;)V

    .line 284
    .line 285
    .line 286
    sput-object v8, Lhn;->t:Lrn$a;

    .line 287
    .line 288
    sput p7, Lhn;->u:I

    .line 289
    .line 290
    sput-wide p4, Lhn;->v:J

    .line 291
    .line 292
    sput-object p6, Lhn;->w:Ljava/lang/String;

    .line 293
    .line 294
    sput-object p8, Lhn;->x:Ljava/lang/String;

    .line 295
    .line 296
    sput-boolean v11, Lhn;->y:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 297
    .line 298
    :try_start_7
    sput-boolean v10, Lhn;->A:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 299
    .line 300
    monitor-exit p0

    .line 301
    return-object v8

    .line 302
    :goto_2
    :try_start_8
    sput-boolean v10, Lhn;->A:Z

    .line 303
    .line 304
    throw v0

    .line 305
    :goto_3
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 306
    throw v0
.end method

.method public final O()J
    .locals 2

    .line 1
    sget-wide v0, Lhn;->z:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final f0()Z
    .locals 0

    .line 1
    sget-boolean p0, Lhn;->A:Z

    .line 2
    .line 3
    return p0
.end method
