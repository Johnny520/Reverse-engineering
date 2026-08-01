.class public abstract Lo30;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final A:Lmf;

.field public static final B:Lz01;

.field public static final C:F

.field public static final D:F

.field public static final E:Lmf;

.field public static final F:F

.field public static final G:F

.field public static final H:F

.field public static final I:Lz01;

.field public static final J:F

.field public static final K:Lmf;

.field public static final L:Lmf;

.field public static final M:F

.field public static final N:Lmf;

.field public static final O:Lmf;

.field public static final P:Ljo0;

.field public static final a:Lzr;

.field public static final b:[I

.field public static final c:[J

.field public static final d:[Ljava/lang/Object;

.field public static final e:F

.field public static final f:Lmf;

.field public static final g:Lmf;

.field public static final h:F

.field public static final i:F

.field public static final j:F

.field public static final k:Lh6;

.field public static final l:Lzr;

.field public static final m:[Ljava/lang/StackTraceElement;

.field public static final n:Ld;

.field public static final o:[J

.field public static final p:Lmf;

.field public static final q:F

.field public static final r:Lmf;

.field public static final s:F

.field public static final t:Lmf;

.field public static final u:F

.field public static final v:Lmf;

.field public static final w:F

.field public static final x:Lmf;

.field public static final y:F

.field public static final z:Lmf;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lzr;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lzr;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lo30;->a:Lzr;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v1, v0, [I

    .line 13
    .line 14
    sput-object v1, Lo30;->b:[I

    .line 15
    .line 16
    new-array v1, v0, [J

    .line 17
    .line 18
    sput-object v1, Lo30;->c:[J

    .line 19
    .line 20
    new-array v1, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    sput-object v1, Lo30;->d:[Ljava/lang/Object;

    .line 23
    .line 24
    const/high16 v1, 0x3f800000    # 1.0f

    .line 25
    .line 26
    sput v1, Lo30;->e:F

    .line 27
    .line 28
    sget-object v3, Lmf;->q:Lmf;

    .line 29
    .line 30
    sput-object v3, Lo30;->f:Lmf;

    .line 31
    .line 32
    sget-object v4, Lmf;->r:Lmf;

    .line 33
    .line 34
    sput-object v4, Lo30;->g:Lmf;

    .line 35
    .line 36
    const v4, 0x3ec28f5c    # 0.38f

    .line 37
    .line 38
    .line 39
    sput v4, Lo30;->h:F

    .line 40
    .line 41
    const/high16 v5, 0x40c00000    # 6.0f

    .line 42
    .line 43
    sput v5, Lo30;->i:F

    .line 44
    .line 45
    sput v1, Lo30;->j:F

    .line 46
    .line 47
    new-instance v5, Lh6;

    .line 48
    .line 49
    const/4 v6, 0x5

    .line 50
    invoke-direct {v5, v6}, Lh6;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object v5, Lo30;->k:Lh6;

    .line 54
    .line 55
    new-instance v5, Lzr;

    .line 56
    .line 57
    const-string v7, "NULL"

    .line 58
    .line 59
    invoke-direct {v5, v7, v2}, Lzr;-><init>(Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    sput-object v5, Lo30;->l:Lzr;

    .line 63
    .line 64
    new-array v2, v0, [Ljava/lang/StackTraceElement;

    .line 65
    .line 66
    sput-object v2, Lo30;->m:[Ljava/lang/StackTraceElement;

    .line 67
    .line 68
    new-instance v2, Ls8;

    .line 69
    .line 70
    const/16 v5, 0x12

    .line 71
    .line 72
    invoke-direct {v2, v5}, Ls8;-><init>(I)V

    .line 73
    .line 74
    .line 75
    new-instance v5, Lpg0;

    .line 76
    .line 77
    invoke-direct {v5, v6}, Lpg0;-><init>(I)V

    .line 78
    .line 79
    .line 80
    new-instance v6, Ld;

    .line 81
    .line 82
    const/16 v7, 0x13

    .line 83
    .line 84
    invoke-direct {v6, v7, v2, v5}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sput-object v6, Lo30;->n:Ld;

    .line 88
    .line 89
    new-array v0, v0, [J

    .line 90
    .line 91
    sput-object v0, Lo30;->o:[J

    .line 92
    .line 93
    sget-object v0, Lmf;->n:Lmf;

    .line 94
    .line 95
    sput-object v0, Lo30;->p:Lmf;

    .line 96
    .line 97
    sput v1, Lo30;->q:F

    .line 98
    .line 99
    sget-object v0, Lmf;->g:Lmf;

    .line 100
    .line 101
    sput-object v0, Lo30;->r:Lmf;

    .line 102
    .line 103
    sput v4, Lo30;->s:F

    .line 104
    .line 105
    sput-object v0, Lo30;->t:Lmf;

    .line 106
    .line 107
    const v1, 0x3df5c28f    # 0.12f

    .line 108
    .line 109
    .line 110
    sput v1, Lo30;->u:F

    .line 111
    .line 112
    sput-object v0, Lo30;->v:Lmf;

    .line 113
    .line 114
    sput v4, Lo30;->w:F

    .line 115
    .line 116
    sput-object v3, Lo30;->x:Lmf;

    .line 117
    .line 118
    sput v4, Lo30;->y:F

    .line 119
    .line 120
    sput-object v3, Lo30;->z:Lmf;

    .line 121
    .line 122
    sput-object v0, Lo30;->A:Lmf;

    .line 123
    .line 124
    sget-object v0, Lz01;->e:Lz01;

    .line 125
    .line 126
    sput-object v0, Lo30;->B:Lz01;

    .line 127
    .line 128
    const/high16 v1, 0x41e00000    # 28.0f

    .line 129
    .line 130
    sput v1, Lo30;->C:F

    .line 131
    .line 132
    const/high16 v1, 0x41c00000    # 24.0f

    .line 133
    .line 134
    sput v1, Lo30;->D:F

    .line 135
    .line 136
    sget-object v1, Lmf;->e:Lmf;

    .line 137
    .line 138
    sput-object v1, Lo30;->E:Lmf;

    .line 139
    .line 140
    const/high16 v1, 0x42200000    # 40.0f

    .line 141
    .line 142
    sput v1, Lo30;->F:F

    .line 143
    .line 144
    const/high16 v1, 0x42000000    # 32.0f

    .line 145
    .line 146
    sput v1, Lo30;->G:F

    .line 147
    .line 148
    const/high16 v1, 0x40000000    # 2.0f

    .line 149
    .line 150
    sput v1, Lo30;->H:F

    .line 151
    .line 152
    sput-object v0, Lo30;->I:Lz01;

    .line 153
    .line 154
    const/high16 v0, 0x42500000    # 52.0f

    .line 155
    .line 156
    sput v0, Lo30;->J:F

    .line 157
    .line 158
    sget-object v0, Lmf;->i:Lmf;

    .line 159
    .line 160
    sput-object v0, Lo30;->K:Lmf;

    .line 161
    .line 162
    sput-object v0, Lo30;->L:Lmf;

    .line 163
    .line 164
    const/high16 v0, 0x41800000    # 16.0f

    .line 165
    .line 166
    sput v0, Lo30;->M:F

    .line 167
    .line 168
    sput-object v3, Lo30;->N:Lmf;

    .line 169
    .line 170
    sput-object v3, Lo30;->O:Lmf;

    .line 171
    .line 172
    new-instance v0, Ljo0;

    .line 173
    .line 174
    const/16 v1, 0x1b

    .line 175
    .line 176
    invoke-direct {v0, v1}, Ljo0;-><init>(I)V

    .line 177
    .line 178
    .line 179
    sput-object v0, Lo30;->P:Ljo0;

    .line 180
    .line 181
    return-void
.end method

.method public static A()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 2
    .line 3
    const-string v1, "Index overflow has happened."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static final B(I)Landroid/graphics/BlendMode;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Landroid/graphics/BlendMode;->CLEAR:Landroid/graphics/BlendMode;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    sget-object p0, Landroid/graphics/BlendMode;->SRC:Landroid/graphics/BlendMode;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x2

    .line 13
    if-ne p0, v0, :cond_2

    .line 14
    .line 15
    sget-object p0, Landroid/graphics/BlendMode;->DST:Landroid/graphics/BlendMode;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    const/4 v0, 0x3

    .line 19
    if-ne p0, v0, :cond_3

    .line 20
    .line 21
    sget-object p0, Landroid/graphics/BlendMode;->SRC_OVER:Landroid/graphics/BlendMode;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_3
    const/4 v0, 0x4

    .line 25
    if-ne p0, v0, :cond_4

    .line 26
    .line 27
    sget-object p0, Landroid/graphics/BlendMode;->DST_OVER:Landroid/graphics/BlendMode;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_4
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_5

    .line 32
    .line 33
    sget-object p0, Landroid/graphics/BlendMode;->SRC_IN:Landroid/graphics/BlendMode;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_5
    const/4 v0, 0x6

    .line 37
    if-ne p0, v0, :cond_6

    .line 38
    .line 39
    sget-object p0, Landroid/graphics/BlendMode;->DST_IN:Landroid/graphics/BlendMode;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_6
    const/4 v0, 0x7

    .line 43
    if-ne p0, v0, :cond_7

    .line 44
    .line 45
    sget-object p0, Landroid/graphics/BlendMode;->SRC_OUT:Landroid/graphics/BlendMode;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_7
    const/16 v0, 0x8

    .line 49
    .line 50
    if-ne p0, v0, :cond_8

    .line 51
    .line 52
    sget-object p0, Landroid/graphics/BlendMode;->DST_OUT:Landroid/graphics/BlendMode;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_8
    const/16 v0, 0x9

    .line 56
    .line 57
    if-ne p0, v0, :cond_9

    .line 58
    .line 59
    sget-object p0, Landroid/graphics/BlendMode;->SRC_ATOP:Landroid/graphics/BlendMode;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_9
    const/16 v0, 0xa

    .line 63
    .line 64
    if-ne p0, v0, :cond_a

    .line 65
    .line 66
    sget-object p0, Landroid/graphics/BlendMode;->DST_ATOP:Landroid/graphics/BlendMode;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_a
    const/16 v0, 0xb

    .line 70
    .line 71
    if-ne p0, v0, :cond_b

    .line 72
    .line 73
    sget-object p0, Landroid/graphics/BlendMode;->XOR:Landroid/graphics/BlendMode;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_b
    const/16 v0, 0xc

    .line 77
    .line 78
    if-ne p0, v0, :cond_c

    .line 79
    .line 80
    sget-object p0, Landroid/graphics/BlendMode;->PLUS:Landroid/graphics/BlendMode;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_c
    const/16 v0, 0xd

    .line 84
    .line 85
    if-ne p0, v0, :cond_d

    .line 86
    .line 87
    sget-object p0, Landroid/graphics/BlendMode;->MODULATE:Landroid/graphics/BlendMode;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_d
    const/16 v0, 0xe

    .line 91
    .line 92
    if-ne p0, v0, :cond_e

    .line 93
    .line 94
    sget-object p0, Landroid/graphics/BlendMode;->SCREEN:Landroid/graphics/BlendMode;

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_e
    const/16 v0, 0xf

    .line 98
    .line 99
    if-ne p0, v0, :cond_f

    .line 100
    .line 101
    sget-object p0, Landroid/graphics/BlendMode;->OVERLAY:Landroid/graphics/BlendMode;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_f
    const/16 v0, 0x10

    .line 105
    .line 106
    if-ne p0, v0, :cond_10

    .line 107
    .line 108
    sget-object p0, Landroid/graphics/BlendMode;->DARKEN:Landroid/graphics/BlendMode;

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_10
    const/16 v0, 0x11

    .line 112
    .line 113
    if-ne p0, v0, :cond_11

    .line 114
    .line 115
    sget-object p0, Landroid/graphics/BlendMode;->LIGHTEN:Landroid/graphics/BlendMode;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_11
    const/16 v0, 0x12

    .line 119
    .line 120
    if-ne p0, v0, :cond_12

    .line 121
    .line 122
    sget-object p0, Landroid/graphics/BlendMode;->COLOR_DODGE:Landroid/graphics/BlendMode;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_12
    const/16 v0, 0x13

    .line 126
    .line 127
    if-ne p0, v0, :cond_13

    .line 128
    .line 129
    sget-object p0, Landroid/graphics/BlendMode;->COLOR_BURN:Landroid/graphics/BlendMode;

    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_13
    const/16 v0, 0x14

    .line 133
    .line 134
    if-ne p0, v0, :cond_14

    .line 135
    .line 136
    sget-object p0, Landroid/graphics/BlendMode;->HARD_LIGHT:Landroid/graphics/BlendMode;

    .line 137
    .line 138
    return-object p0

    .line 139
    :cond_14
    const/16 v0, 0x15

    .line 140
    .line 141
    if-ne p0, v0, :cond_15

    .line 142
    .line 143
    sget-object p0, Landroid/graphics/BlendMode;->SOFT_LIGHT:Landroid/graphics/BlendMode;

    .line 144
    .line 145
    return-object p0

    .line 146
    :cond_15
    const/16 v0, 0x16

    .line 147
    .line 148
    if-ne p0, v0, :cond_16

    .line 149
    .line 150
    sget-object p0, Landroid/graphics/BlendMode;->DIFFERENCE:Landroid/graphics/BlendMode;

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_16
    const/16 v0, 0x17

    .line 154
    .line 155
    if-ne p0, v0, :cond_17

    .line 156
    .line 157
    sget-object p0, Landroid/graphics/BlendMode;->EXCLUSION:Landroid/graphics/BlendMode;

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_17
    const/16 v0, 0x18

    .line 161
    .line 162
    if-ne p0, v0, :cond_18

    .line 163
    .line 164
    sget-object p0, Landroid/graphics/BlendMode;->MULTIPLY:Landroid/graphics/BlendMode;

    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_18
    const/16 v0, 0x19

    .line 168
    .line 169
    if-ne p0, v0, :cond_19

    .line 170
    .line 171
    sget-object p0, Landroid/graphics/BlendMode;->HUE:Landroid/graphics/BlendMode;

    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_19
    const/16 v0, 0x1a

    .line 175
    .line 176
    if-ne p0, v0, :cond_1a

    .line 177
    .line 178
    sget-object p0, Landroid/graphics/BlendMode;->SATURATION:Landroid/graphics/BlendMode;

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_1a
    const/16 v0, 0x1b

    .line 182
    .line 183
    if-ne p0, v0, :cond_1b

    .line 184
    .line 185
    sget-object p0, Landroid/graphics/BlendMode;->COLOR:Landroid/graphics/BlendMode;

    .line 186
    .line 187
    return-object p0

    .line 188
    :cond_1b
    const/16 v0, 0x1c

    .line 189
    .line 190
    if-ne p0, v0, :cond_1c

    .line 191
    .line 192
    sget-object p0, Landroid/graphics/BlendMode;->LUMINOSITY:Landroid/graphics/BlendMode;

    .line 193
    .line 194
    return-object p0

    .line 195
    :cond_1c
    sget-object p0, Landroid/graphics/BlendMode;->SRC_OVER:Landroid/graphics/BlendMode;

    .line 196
    .line 197
    return-object p0
.end method

.method public static final C(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    int-to-float v1, v1

    .line 7
    const-wide v2, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr p0, v2

    .line 13
    long-to-int p0, p0

    .line 14
    int-to-float p0, p0

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-long v4, p1

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-long p0, p0

    .line 25
    shl-long v0, v4, v0

    .line 26
    .line 27
    and-long/2addr p0, v2

    .line 28
    or-long/2addr p0, v0

    .line 29
    return-wide p0
.end method

.method public static D(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "Clear"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    const-string p0, "Src"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x2

    .line 13
    if-ne p0, v0, :cond_2

    .line 14
    .line 15
    const-string p0, "Dst"

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    const/4 v0, 0x3

    .line 19
    if-ne p0, v0, :cond_3

    .line 20
    .line 21
    const-string p0, "SrcOver"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_3
    const/4 v0, 0x4

    .line 25
    if-ne p0, v0, :cond_4

    .line 26
    .line 27
    const-string p0, "DstOver"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_4
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_5

    .line 32
    .line 33
    const-string p0, "SrcIn"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_5
    const/4 v0, 0x6

    .line 37
    if-ne p0, v0, :cond_6

    .line 38
    .line 39
    const-string p0, "DstIn"

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_6
    const/4 v0, 0x7

    .line 43
    if-ne p0, v0, :cond_7

    .line 44
    .line 45
    const-string p0, "SrcOut"

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_7
    const/16 v0, 0x8

    .line 49
    .line 50
    if-ne p0, v0, :cond_8

    .line 51
    .line 52
    const-string p0, "DstOut"

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_8
    const/16 v0, 0x9

    .line 56
    .line 57
    if-ne p0, v0, :cond_9

    .line 58
    .line 59
    const-string p0, "SrcAtop"

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_9
    const/16 v0, 0xa

    .line 63
    .line 64
    if-ne p0, v0, :cond_a

    .line 65
    .line 66
    const-string p0, "DstAtop"

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_a
    const/16 v0, 0xb

    .line 70
    .line 71
    if-ne p0, v0, :cond_b

    .line 72
    .line 73
    const-string p0, "Xor"

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_b
    const/16 v0, 0xc

    .line 77
    .line 78
    if-ne p0, v0, :cond_c

    .line 79
    .line 80
    const-string p0, "Plus"

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_c
    const/16 v0, 0xd

    .line 84
    .line 85
    if-ne p0, v0, :cond_d

    .line 86
    .line 87
    const-string p0, "Modulate"

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_d
    const/16 v0, 0xe

    .line 91
    .line 92
    if-ne p0, v0, :cond_e

    .line 93
    .line 94
    const-string p0, "Screen"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_e
    const/16 v0, 0xf

    .line 98
    .line 99
    if-ne p0, v0, :cond_f

    .line 100
    .line 101
    const-string p0, "Overlay"

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_f
    const/16 v0, 0x10

    .line 105
    .line 106
    if-ne p0, v0, :cond_10

    .line 107
    .line 108
    const-string p0, "Darken"

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_10
    const/16 v0, 0x11

    .line 112
    .line 113
    if-ne p0, v0, :cond_11

    .line 114
    .line 115
    const-string p0, "Lighten"

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_11
    const/16 v0, 0x12

    .line 119
    .line 120
    if-ne p0, v0, :cond_12

    .line 121
    .line 122
    const-string p0, "ColorDodge"

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_12
    const/16 v0, 0x13

    .line 126
    .line 127
    if-ne p0, v0, :cond_13

    .line 128
    .line 129
    const-string p0, "ColorBurn"

    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_13
    const/16 v0, 0x14

    .line 133
    .line 134
    if-ne p0, v0, :cond_14

    .line 135
    .line 136
    const-string p0, "HardLight"

    .line 137
    .line 138
    return-object p0

    .line 139
    :cond_14
    const/16 v0, 0x15

    .line 140
    .line 141
    if-ne p0, v0, :cond_15

    .line 142
    .line 143
    const-string p0, "Softlight"

    .line 144
    .line 145
    return-object p0

    .line 146
    :cond_15
    const/16 v0, 0x16

    .line 147
    .line 148
    if-ne p0, v0, :cond_16

    .line 149
    .line 150
    const-string p0, "Difference"

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_16
    const/16 v0, 0x17

    .line 154
    .line 155
    if-ne p0, v0, :cond_17

    .line 156
    .line 157
    const-string p0, "Exclusion"

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_17
    const/16 v0, 0x18

    .line 161
    .line 162
    if-ne p0, v0, :cond_18

    .line 163
    .line 164
    const-string p0, "Multiply"

    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_18
    const/16 v0, 0x19

    .line 168
    .line 169
    if-ne p0, v0, :cond_19

    .line 170
    .line 171
    const-string p0, "Hue"

    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_19
    const/16 v0, 0x1a

    .line 175
    .line 176
    if-ne p0, v0, :cond_1a

    .line 177
    .line 178
    const-string p0, "Saturation"

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_1a
    const/16 v0, 0x1b

    .line 182
    .line 183
    if-ne p0, v0, :cond_1b

    .line 184
    .line 185
    const-string p0, "Color"

    .line 186
    .line 187
    return-object p0

    .line 188
    :cond_1b
    const/16 v0, 0x1c

    .line 189
    .line 190
    if-ne p0, v0, :cond_1c

    .line 191
    .line 192
    const-string p0, "Luminosity"

    .line 193
    .line 194
    return-object p0

    .line 195
    :cond_1c
    const-string p0, "Unknown"

    .line 196
    .line 197
    return-object p0
.end method

.method public static final a(Lb91;Lsw;Lpe0;Lvs;Ljt;Lww;Lxw;Lji;I)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move/from16 v8, p8

    .line 16
    .line 17
    iget-object v0, v1, Lb91;->d:Lgp0;

    .line 18
    .line 19
    move-object/from16 v9, p7

    .line 20
    .line 21
    check-cast v9, Lpi;

    .line 22
    .line 23
    const v10, 0x72039c2f

    .line 24
    .line 25
    .line 26
    invoke-virtual {v9, v10}, Lpi;->X(I)Lpi;

    .line 27
    .line 28
    .line 29
    and-int/lit8 v10, v8, 0x6

    .line 30
    .line 31
    const/4 v11, 0x4

    .line 32
    if-nez v10, :cond_1

    .line 33
    .line 34
    invoke-virtual {v9, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    if-eqz v10, :cond_0

    .line 39
    .line 40
    move v10, v11

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v10, 0x2

    .line 43
    :goto_0
    or-int/2addr v10, v8

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v10, v8

    .line 46
    :goto_1
    and-int/lit8 v12, v8, 0x30

    .line 47
    .line 48
    if-nez v12, :cond_3

    .line 49
    .line 50
    invoke-virtual {v9, v2}, Lpi;->h(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-eqz v12, :cond_2

    .line 55
    .line 56
    const/16 v12, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v12, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v10, v12

    .line 62
    :cond_3
    and-int/lit16 v12, v8, 0x180

    .line 63
    .line 64
    if-nez v12, :cond_5

    .line 65
    .line 66
    invoke-virtual {v9, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    if-eqz v12, :cond_4

    .line 71
    .line 72
    const/16 v12, 0x100

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    const/16 v12, 0x80

    .line 76
    .line 77
    :goto_3
    or-int/2addr v10, v12

    .line 78
    :cond_5
    and-int/lit16 v12, v8, 0xc00

    .line 79
    .line 80
    if-nez v12, :cond_7

    .line 81
    .line 82
    invoke-virtual {v9, v4}, Lpi;->f(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    if-eqz v12, :cond_6

    .line 87
    .line 88
    const/16 v12, 0x800

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_6
    const/16 v12, 0x400

    .line 92
    .line 93
    :goto_4
    or-int/2addr v10, v12

    .line 94
    :cond_7
    and-int/lit16 v12, v8, 0x6000

    .line 95
    .line 96
    if-nez v12, :cond_9

    .line 97
    .line 98
    invoke-virtual {v9, v5}, Lpi;->f(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    if-eqz v12, :cond_8

    .line 103
    .line 104
    const/16 v12, 0x4000

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_8
    const/16 v12, 0x2000

    .line 108
    .line 109
    :goto_5
    or-int/2addr v10, v12

    .line 110
    :cond_9
    const/high16 v12, 0x30000

    .line 111
    .line 112
    and-int/2addr v12, v8

    .line 113
    if-nez v12, :cond_b

    .line 114
    .line 115
    invoke-virtual {v9, v6}, Lpi;->h(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    if-eqz v12, :cond_a

    .line 120
    .line 121
    const/high16 v12, 0x20000

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_a
    const/high16 v12, 0x10000

    .line 125
    .line 126
    :goto_6
    or-int/2addr v10, v12

    .line 127
    :cond_b
    const/high16 v12, 0x180000

    .line 128
    .line 129
    or-int/2addr v10, v12

    .line 130
    const/high16 v12, 0xc00000

    .line 131
    .line 132
    and-int/2addr v12, v8

    .line 133
    if-nez v12, :cond_d

    .line 134
    .line 135
    invoke-virtual {v9, v7}, Lpi;->h(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    if-eqz v12, :cond_c

    .line 140
    .line 141
    const/high16 v12, 0x800000

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_c
    const/high16 v12, 0x400000

    .line 145
    .line 146
    :goto_7
    or-int/2addr v10, v12

    .line 147
    :cond_d
    const v12, 0x492493

    .line 148
    .line 149
    .line 150
    and-int/2addr v12, v10

    .line 151
    const v14, 0x492492

    .line 152
    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    if-eq v12, v14, :cond_e

    .line 156
    .line 157
    const/4 v12, 0x1

    .line 158
    goto :goto_8

    .line 159
    :cond_e
    move v12, v13

    .line 160
    :goto_8
    and-int/lit8 v14, v10, 0x1

    .line 161
    .line 162
    invoke-virtual {v9, v14, v12}, Lpi;->O(IZ)Z

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    if-eqz v12, :cond_47

    .line 167
    .line 168
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    invoke-interface {v2, v12}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    check-cast v12, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    const v14, -0x103b79ed

    .line 183
    .line 184
    .line 185
    if-nez v12, :cond_10

    .line 186
    .line 187
    invoke-virtual {v1}, Lb91;->c()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    invoke-interface {v2, v12}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    check-cast v12, Ljava/lang/Boolean;

    .line 196
    .line 197
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-nez v12, :cond_10

    .line 202
    .line 203
    invoke-virtual {v1}, Lb91;->g()Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-nez v12, :cond_10

    .line 208
    .line 209
    invoke-virtual {v1}, Lb91;->d()Z

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    if-eqz v12, :cond_f

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_f
    invoke-virtual {v9, v14}, Lpi;->W(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v9, v13}, Lpi;->p(Z)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_1f

    .line 223
    .line 224
    :cond_10
    :goto_9
    const v12, -0xdda5963

    .line 225
    .line 226
    .line 227
    invoke-virtual {v9, v12}, Lpi;->W(I)V

    .line 228
    .line 229
    .line 230
    and-int/lit8 v12, v10, 0xe

    .line 231
    .line 232
    or-int/lit8 v16, v12, 0x30

    .line 233
    .line 234
    and-int/lit8 v14, v16, 0xe

    .line 235
    .line 236
    xor-int/lit8 v15, v14, 0x6

    .line 237
    .line 238
    if-le v15, v11, :cond_11

    .line 239
    .line 240
    invoke-virtual {v9, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    if-nez v15, :cond_12

    .line 245
    .line 246
    :cond_11
    and-int/lit8 v15, v16, 0x6

    .line 247
    .line 248
    if-ne v15, v11, :cond_13

    .line 249
    .line 250
    :cond_12
    const/4 v15, 0x1

    .line 251
    goto :goto_a

    .line 252
    :cond_13
    move v15, v13

    .line 253
    :goto_a
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    sget-object v13, Lii;->a:Lr3;

    .line 258
    .line 259
    if-nez v15, :cond_14

    .line 260
    .line 261
    if-ne v11, v13, :cond_15

    .line 262
    .line 263
    :cond_14
    invoke-virtual {v1}, Lb91;->c()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-virtual {v9, v11}, Lpi;->g0(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    :cond_15
    invoke-virtual {v1}, Lb91;->g()Z

    .line 271
    .line 272
    .line 273
    move-result v15

    .line 274
    if-eqz v15, :cond_16

    .line 275
    .line 276
    invoke-virtual {v1}, Lb91;->c()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    :cond_16
    const v15, 0x6defb3b0

    .line 281
    .line 282
    .line 283
    invoke-virtual {v9, v15}, Lpi;->W(I)V

    .line 284
    .line 285
    .line 286
    invoke-static {v1, v2, v11, v9}, Lo30;->z(Lb91;Lsw;Ljava/lang/Object;Lji;)Lms;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    const/4 v15, 0x0

    .line 291
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    const v15, 0x6defb3b0

    .line 299
    .line 300
    .line 301
    invoke-virtual {v9, v15}, Lpi;->W(I)V

    .line 302
    .line 303
    .line 304
    invoke-static {v1, v2, v0, v9}, Lo30;->z(Lb91;Lsw;Ljava/lang/Object;Lji;)Lms;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    const/4 v15, 0x0

    .line 309
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 310
    .line 311
    .line 312
    or-int/lit16 v14, v14, 0xc00

    .line 313
    .line 314
    sget v15, Ld91;->a:I

    .line 315
    .line 316
    and-int/lit8 v15, v14, 0xe

    .line 317
    .line 318
    xor-int/lit8 v15, v15, 0x6

    .line 319
    .line 320
    const/4 v2, 0x4

    .line 321
    if-le v15, v2, :cond_17

    .line 322
    .line 323
    invoke-virtual {v9, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v16

    .line 327
    if-nez v16, :cond_18

    .line 328
    .line 329
    :cond_17
    and-int/lit8 v8, v14, 0x6

    .line 330
    .line 331
    if-ne v8, v2, :cond_19

    .line 332
    .line 333
    :cond_18
    const/4 v2, 0x1

    .line 334
    goto :goto_b

    .line 335
    :cond_19
    const/4 v2, 0x0

    .line 336
    :goto_b
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    if-nez v2, :cond_1b

    .line 341
    .line 342
    if-ne v8, v13, :cond_1a

    .line 343
    .line 344
    goto :goto_c

    .line 345
    :cond_1a
    move/from16 v19, v10

    .line 346
    .line 347
    move/from16 v20, v14

    .line 348
    .line 349
    goto :goto_d

    .line 350
    :cond_1b
    :goto_c
    new-instance v8, Lb91;

    .line 351
    .line 352
    new-instance v2, Ld;

    .line 353
    .line 354
    invoke-direct {v2, v11}, Ld;-><init>(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    move/from16 v19, v10

    .line 358
    .line 359
    iget-object v10, v1, Lb91;->c:Ljava/lang/String;

    .line 360
    .line 361
    move/from16 v20, v14

    .line 362
    .line 363
    const-string v14, " > EnterExitTransition"

    .line 364
    .line 365
    invoke-virtual {v10, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    invoke-direct {v8, v2, v1, v10}, Lb91;-><init>(Ld;Lb91;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v9, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :goto_d
    check-cast v8, Lb91;

    .line 376
    .line 377
    const/4 v2, 0x4

    .line 378
    if-le v15, v2, :cond_1c

    .line 379
    .line 380
    invoke-virtual {v9, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    if-nez v10, :cond_1d

    .line 385
    .line 386
    :cond_1c
    and-int/lit8 v10, v20, 0x6

    .line 387
    .line 388
    if-ne v10, v2, :cond_1e

    .line 389
    .line 390
    :cond_1d
    const/4 v2, 0x1

    .line 391
    goto :goto_e

    .line 392
    :cond_1e
    const/4 v2, 0x0

    .line 393
    :goto_e
    invoke-virtual {v9, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    or-int/2addr v2, v10

    .line 398
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    if-nez v2, :cond_1f

    .line 403
    .line 404
    if-ne v10, v13, :cond_20

    .line 405
    .line 406
    :cond_1f
    new-instance v10, Lc;

    .line 407
    .line 408
    const/16 v2, 0x15

    .line 409
    .line 410
    invoke-direct {v10, v2, v1, v8}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v9, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    :cond_20
    check-cast v10, Lsw;

    .line 417
    .line 418
    invoke-static {v8, v10, v9}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1}, Lb91;->g()Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_21

    .line 426
    .line 427
    invoke-virtual {v8, v11, v0}, Lb91;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    goto :goto_f

    .line 431
    :cond_21
    invoke-virtual {v8, v0}, Lb91;->k(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    iget-object v0, v8, Lb91;->k:Lgp0;

    .line 435
    .line 436
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 437
    .line 438
    invoke-virtual {v0, v2}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :goto_f
    invoke-static {v6, v9}, Lr60;->z(Ljava/lang/Object;Lji;)Loh0;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v8}, Lb91;->c()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    iget-object v10, v8, Lb91;->d:Lgp0;

    .line 450
    .line 451
    invoke-virtual {v10}, Lgp0;->getValue()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v11

    .line 455
    invoke-interface {v6, v2, v11}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-virtual {v9, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v11

    .line 463
    invoke-virtual {v9, v0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v14

    .line 467
    or-int/2addr v11, v14

    .line 468
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v14

    .line 472
    const/4 v15, 0x0

    .line 473
    if-nez v11, :cond_22

    .line 474
    .line 475
    if-ne v14, v13, :cond_23

    .line 476
    .line 477
    :cond_22
    new-instance v14, Li;

    .line 478
    .line 479
    const/4 v11, 0x1

    .line 480
    invoke-direct {v14, v8, v0, v15, v11}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v9, v14}, Lpi;->g0(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    :cond_23
    check-cast v14, Lww;

    .line 487
    .line 488
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    if-ne v0, v13, :cond_24

    .line 493
    .line 494
    invoke-static {v2}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v9, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    :cond_24
    check-cast v0, Loh0;

    .line 502
    .line 503
    invoke-virtual {v9, v14}, Lpi;->h(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v11

    .line 511
    if-nez v2, :cond_25

    .line 512
    .line 513
    if-ne v11, v13, :cond_26

    .line 514
    .line 515
    :cond_25
    new-instance v11, Li;

    .line 516
    .line 517
    const/16 v2, 0xb

    .line 518
    .line 519
    invoke-direct {v11, v14, v0, v15, v2}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v9, v11}, Lpi;->g0(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    :cond_26
    check-cast v11, Lww;

    .line 526
    .line 527
    sget-object v2, Lna1;->a:Lna1;

    .line 528
    .line 529
    invoke-static {v9, v11, v2}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v8}, Lb91;->c()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    sget-object v11, Lms;->f:Lms;

    .line 537
    .line 538
    if-ne v2, v11, :cond_28

    .line 539
    .line 540
    invoke-virtual {v10}, Lgp0;->getValue()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    if-ne v2, v11, :cond_28

    .line 545
    .line 546
    invoke-interface {v0}, Lw31;->getValue()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    check-cast v0, Ljava/lang/Boolean;

    .line 551
    .line 552
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-nez v0, :cond_27

    .line 557
    .line 558
    goto :goto_11

    .line 559
    :cond_27
    const v0, -0x103b79ed

    .line 560
    .line 561
    .line 562
    invoke-virtual {v9, v0}, Lpi;->W(I)V

    .line 563
    .line 564
    .line 565
    :goto_10
    const/4 v15, 0x0

    .line 566
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 567
    .line 568
    .line 569
    goto/16 :goto_1e

    .line 570
    .line 571
    :cond_28
    :goto_11
    const v0, -0xdcaa1ed

    .line 572
    .line 573
    .line 574
    invoke-virtual {v9, v0}, Lpi;->W(I)V

    .line 575
    .line 576
    .line 577
    const/4 v2, 0x4

    .line 578
    if-ne v12, v2, :cond_29

    .line 579
    .line 580
    const/4 v0, 0x1

    .line 581
    goto :goto_12

    .line 582
    :cond_29
    const/4 v0, 0x0

    .line 583
    :goto_12
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    if-nez v0, :cond_2a

    .line 588
    .line 589
    if-ne v2, v13, :cond_2b

    .line 590
    .line 591
    :cond_2a
    new-instance v2, Lp7;

    .line 592
    .line 593
    invoke-direct {v2}, Lp7;-><init>()V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v9, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    :cond_2b
    check-cast v2, Lp7;

    .line 600
    .line 601
    sget-object v0, Lrs;->a:Lo31;

    .line 602
    .line 603
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    if-ne v0, v13, :cond_2c

    .line 608
    .line 609
    sget-object v0, Lcj;->g:Lcj;

    .line 610
    .line 611
    invoke-virtual {v9, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    :cond_2c
    check-cast v0, Lhw;

    .line 615
    .line 616
    invoke-virtual {v9, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v11

    .line 620
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v12

    .line 624
    if-nez v11, :cond_2d

    .line 625
    .line 626
    if-ne v12, v13, :cond_2e

    .line 627
    .line 628
    :cond_2d
    invoke-static {v4}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 629
    .line 630
    .line 631
    move-result-object v12

    .line 632
    invoke-virtual {v9, v12}, Lpi;->g0(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    :cond_2e
    check-cast v12, Loh0;

    .line 636
    .line 637
    invoke-virtual {v8}, Lb91;->c()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v11

    .line 641
    invoke-virtual {v10}, Lgp0;->getValue()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v14

    .line 645
    sget-object v15, Lms;->e:Lms;

    .line 646
    .line 647
    if-ne v11, v14, :cond_31

    .line 648
    .line 649
    invoke-virtual {v8}, Lb91;->c()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v11

    .line 653
    if-ne v11, v15, :cond_31

    .line 654
    .line 655
    invoke-virtual {v8}, Lb91;->g()Z

    .line 656
    .line 657
    .line 658
    move-result v11

    .line 659
    if-eqz v11, :cond_30

    .line 660
    .line 661
    invoke-interface {v12, v4}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    :cond_2f
    :goto_13
    move-object/from16 v17, v10

    .line 665
    .line 666
    goto :goto_14

    .line 667
    :cond_30
    sget-object v11, Lvs;->b:Lvs;

    .line 668
    .line 669
    invoke-interface {v12, v11}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    goto :goto_13

    .line 673
    :cond_31
    invoke-virtual {v10}, Lgp0;->getValue()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v11

    .line 677
    if-ne v11, v15, :cond_2f

    .line 678
    .line 679
    invoke-interface {v12}, Lw31;->getValue()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v11

    .line 683
    check-cast v11, Lvs;

    .line 684
    .line 685
    iget-object v11, v11, Lvs;->a:Lc91;

    .line 686
    .line 687
    new-instance v14, Lvs;

    .line 688
    .line 689
    new-instance v1, Lc91;

    .line 690
    .line 691
    iget-object v6, v4, Lvs;->a:Lc91;

    .line 692
    .line 693
    iget-object v4, v6, Lc91;->a:Lkd;

    .line 694
    .line 695
    if-nez v4, :cond_32

    .line 696
    .line 697
    iget-object v4, v11, Lc91;->a:Lkd;

    .line 698
    .line 699
    :cond_32
    iget-object v11, v11, Lc91;->c:Ljava/util/Map;

    .line 700
    .line 701
    iget-object v6, v6, Lc91;->c:Ljava/util/Map;

    .line 702
    .line 703
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    move-object/from16 v17, v10

    .line 710
    .line 711
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 712
    .line 713
    invoke-direct {v10, v11}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v10, v6}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 717
    .line 718
    .line 719
    const/16 v6, 0x20

    .line 720
    .line 721
    const/4 v11, 0x0

    .line 722
    invoke-direct {v1, v11, v4, v10, v6}, Lc91;-><init>(Lo30;Lkd;Ljava/util/LinkedHashMap;I)V

    .line 723
    .line 724
    .line 725
    invoke-direct {v14, v1}, Lvs;-><init>(Lc91;)V

    .line 726
    .line 727
    .line 728
    invoke-interface {v12, v14}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    :goto_14
    invoke-interface {v12}, Lw31;->getValue()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    check-cast v1, Lvs;

    .line 736
    .line 737
    invoke-virtual {v9, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    move-result v4

    .line 741
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v6

    .line 745
    if-nez v4, :cond_33

    .line 746
    .line 747
    if-ne v6, v13, :cond_34

    .line 748
    .line 749
    :cond_33
    invoke-static {v5}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 750
    .line 751
    .line 752
    move-result-object v6

    .line 753
    invoke-virtual {v9, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    :cond_34
    check-cast v6, Loh0;

    .line 757
    .line 758
    invoke-virtual {v8}, Lb91;->c()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    invoke-virtual/range {v17 .. v17}, Lgp0;->getValue()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v10

    .line 766
    if-ne v4, v10, :cond_36

    .line 767
    .line 768
    invoke-virtual {v8}, Lb91;->c()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v4

    .line 772
    if-ne v4, v15, :cond_36

    .line 773
    .line 774
    invoke-virtual {v8}, Lb91;->g()Z

    .line 775
    .line 776
    .line 777
    move-result v4

    .line 778
    if-eqz v4, :cond_35

    .line 779
    .line 780
    invoke-interface {v6, v5}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    goto :goto_17

    .line 784
    :cond_35
    sget-object v4, Ljt;->b:Ljt;

    .line 785
    .line 786
    invoke-interface {v6, v4}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    goto :goto_17

    .line 790
    :cond_36
    invoke-virtual/range {v17 .. v17}, Lgp0;->getValue()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    if-eq v4, v15, :cond_3a

    .line 795
    .line 796
    invoke-interface {v6}, Lw31;->getValue()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v4

    .line 800
    check-cast v4, Ljt;

    .line 801
    .line 802
    iget-object v4, v4, Ljt;->a:Lc91;

    .line 803
    .line 804
    new-instance v10, Ljt;

    .line 805
    .line 806
    new-instance v11, Lc91;

    .line 807
    .line 808
    iget-object v12, v5, Ljt;->a:Lc91;

    .line 809
    .line 810
    iget-object v14, v12, Lc91;->a:Lkd;

    .line 811
    .line 812
    if-nez v14, :cond_37

    .line 813
    .line 814
    iget-object v14, v4, Lc91;->a:Lkd;

    .line 815
    .line 816
    :cond_37
    iget-boolean v15, v12, Lc91;->b:Z

    .line 817
    .line 818
    if-nez v15, :cond_39

    .line 819
    .line 820
    iget-boolean v15, v4, Lc91;->b:Z

    .line 821
    .line 822
    if-eqz v15, :cond_38

    .line 823
    .line 824
    goto :goto_15

    .line 825
    :cond_38
    const/4 v15, 0x0

    .line 826
    goto :goto_16

    .line 827
    :cond_39
    :goto_15
    const/4 v15, 0x1

    .line 828
    :goto_16
    iget-object v4, v4, Lc91;->c:Ljava/util/Map;

    .line 829
    .line 830
    iget-object v12, v12, Lc91;->c:Ljava/util/Map;

    .line 831
    .line 832
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 839
    .line 840
    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v5, v12}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 844
    .line 845
    .line 846
    const/4 v4, 0x0

    .line 847
    invoke-direct {v11, v4, v14, v15, v5}, Lc91;-><init>(Lo30;Lkd;ZLjava/util/Map;)V

    .line 848
    .line 849
    .line 850
    invoke-direct {v10, v11}, Ljt;-><init>(Lc91;)V

    .line 851
    .line 852
    .line 853
    invoke-interface {v6, v10}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    :cond_3a
    :goto_17
    invoke-interface {v6}, Lw31;->getValue()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v4

    .line 860
    check-cast v4, Ljt;

    .line 861
    .line 862
    iget-object v5, v1, Lvs;->a:Lc91;

    .line 863
    .line 864
    iget-object v6, v4, Ljt;->a:Lc91;

    .line 865
    .line 866
    iget-object v5, v5, Lc91;->a:Lkd;

    .line 867
    .line 868
    if-nez v5, :cond_3c

    .line 869
    .line 870
    iget-object v5, v6, Lc91;->a:Lkd;

    .line 871
    .line 872
    if-eqz v5, :cond_3b

    .line 873
    .line 874
    goto :goto_18

    .line 875
    :cond_3b
    const/4 v5, 0x0

    .line 876
    goto :goto_19

    .line 877
    :cond_3c
    :goto_18
    const/4 v5, 0x1

    .line 878
    :goto_19
    const v6, 0x7fb20d0

    .line 879
    .line 880
    .line 881
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 882
    .line 883
    .line 884
    const/4 v15, 0x0

    .line 885
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 886
    .line 887
    .line 888
    if-eqz v5, :cond_3e

    .line 889
    .line 890
    const v6, 0x7fc875f

    .line 891
    .line 892
    .line 893
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 894
    .line 895
    .line 896
    sget-object v6, Lkl;->E:Lq91;

    .line 897
    .line 898
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v10

    .line 902
    if-ne v10, v13, :cond_3d

    .line 903
    .line 904
    const-string v10, "Built-in shrink/expand"

    .line 905
    .line 906
    invoke-virtual {v9, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    :cond_3d
    check-cast v10, Ljava/lang/String;

    .line 910
    .line 911
    invoke-static {v8, v6, v10, v9}, Ld91;->a(Lb91;Lq91;Ljava/lang/String;Lji;)Lw81;

    .line 912
    .line 913
    .line 914
    move-result-object v11

    .line 915
    const/4 v15, 0x0

    .line 916
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 917
    .line 918
    .line 919
    move-object/from16 v23, v11

    .line 920
    .line 921
    goto :goto_1a

    .line 922
    :cond_3e
    const/4 v15, 0x0

    .line 923
    const v6, 0x7fe3847

    .line 924
    .line 925
    .line 926
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 930
    .line 931
    .line 932
    const/16 v23, 0x0

    .line 933
    .line 934
    :goto_1a
    if-eqz v5, :cond_40

    .line 935
    .line 936
    const v6, 0x7ff57e1

    .line 937
    .line 938
    .line 939
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 940
    .line 941
    .line 942
    sget-object v6, Lkl;->D:Lq91;

    .line 943
    .line 944
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v10

    .line 948
    if-ne v10, v13, :cond_3f

    .line 949
    .line 950
    const-string v10, "Built-in InterruptionHandlingOffset"

    .line 951
    .line 952
    invoke-virtual {v9, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    :cond_3f
    check-cast v10, Ljava/lang/String;

    .line 956
    .line 957
    invoke-static {v8, v6, v10, v9}, Ld91;->a(Lb91;Lq91;Ljava/lang/String;Lji;)Lw81;

    .line 958
    .line 959
    .line 960
    move-result-object v11

    .line 961
    const/4 v15, 0x0

    .line 962
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 963
    .line 964
    .line 965
    move-object/from16 v24, v11

    .line 966
    .line 967
    :goto_1b
    const/16 v18, 0x1

    .line 968
    .line 969
    goto :goto_1c

    .line 970
    :cond_40
    const/4 v15, 0x0

    .line 971
    const v6, 0x801f187

    .line 972
    .line 973
    .line 974
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 978
    .line 979
    .line 980
    const/16 v24, 0x0

    .line 981
    .line 982
    goto :goto_1b

    .line 983
    :goto_1c
    xor-int/lit8 v5, v5, 0x1

    .line 984
    .line 985
    sget-object v6, Lrf;->a:[F

    .line 986
    .line 987
    const v6, 0x80e3b8c

    .line 988
    .line 989
    .line 990
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 994
    .line 995
    .line 996
    const v6, -0x29f1c318

    .line 997
    .line 998
    .line 999
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 1003
    .line 1004
    .line 1005
    const v6, -0x29ee24f8

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 1012
    .line 1013
    .line 1014
    const v6, -0x29ea5478

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v9, v6}, Lpi;->W(I)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 1021
    .line 1022
    .line 1023
    const/4 v11, 0x0

    .line 1024
    invoke-virtual {v9, v11}, Lpi;->h(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v6

    .line 1028
    invoke-virtual {v9, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v10

    .line 1032
    or-int/2addr v6, v10

    .line 1033
    invoke-virtual {v9, v4}, Lpi;->f(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v10

    .line 1037
    or-int/2addr v6, v10

    .line 1038
    invoke-virtual {v9, v11}, Lpi;->h(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v10

    .line 1042
    or-int/2addr v6, v10

    .line 1043
    invoke-virtual {v9, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v10

    .line 1047
    or-int/2addr v6, v10

    .line 1048
    invoke-virtual {v9, v11}, Lpi;->h(Ljava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v10

    .line 1052
    or-int/2addr v6, v10

    .line 1053
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v10

    .line 1057
    if-nez v6, :cond_41

    .line 1058
    .line 1059
    if-ne v10, v13, :cond_42

    .line 1060
    .line 1061
    :cond_41
    new-instance v10, Los;

    .line 1062
    .line 1063
    invoke-direct {v10, v11, v8, v1, v4}, Los;-><init>(Lw81;Lb91;Lvs;Ljt;)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v9, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 1067
    .line 1068
    .line 1069
    :cond_42
    move-object/from16 v28, v10

    .line 1070
    .line 1071
    check-cast v28, Los;

    .line 1072
    .line 1073
    invoke-virtual {v9, v5}, Lpi;->g(Z)Z

    .line 1074
    .line 1075
    .line 1076
    move-result v6

    .line 1077
    invoke-virtual {v9, v0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v10

    .line 1081
    or-int/2addr v6, v10

    .line 1082
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v10

    .line 1086
    if-nez v6, :cond_43

    .line 1087
    .line 1088
    if-ne v10, v13, :cond_44

    .line 1089
    .line 1090
    :cond_43
    new-instance v10, Lqs;

    .line 1091
    .line 1092
    invoke-direct {v10, v5, v0}, Lqs;-><init>(ZLhw;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v9, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    :cond_44
    check-cast v10, Lsw;

    .line 1099
    .line 1100
    sget-object v5, Lme0;->a:Lme0;

    .line 1101
    .line 1102
    invoke-static {v5, v10}, Lp30;->H(Lpe0;Lsw;)Lpe0;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v6

    .line 1106
    new-instance v21, Lns;

    .line 1107
    .line 1108
    move-object/from16 v27, v0

    .line 1109
    .line 1110
    move-object/from16 v25, v1

    .line 1111
    .line 1112
    move-object/from16 v26, v4

    .line 1113
    .line 1114
    move-object/from16 v22, v8

    .line 1115
    .line 1116
    invoke-direct/range {v21 .. v28}, Lns;-><init>(Lb91;Lw81;Lw81;Lvs;Ljt;Lhw;Los;)V

    .line 1117
    .line 1118
    .line 1119
    move-object/from16 v0, v21

    .line 1120
    .line 1121
    invoke-interface {v6, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    invoke-interface {v0, v5}, Lpe0;->c(Lpe0;)Lpe0;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v0

    .line 1129
    const v1, -0x7169e9

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v9, v1}, Lpi;->W(I)V

    .line 1133
    .line 1134
    .line 1135
    const/4 v15, 0x0

    .line 1136
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {v0, v5}, Lpe0;->c(Lpe0;)Lpe0;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-interface {v3, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    if-ne v1, v13, :cond_45

    .line 1152
    .line 1153
    new-instance v1, Lg7;

    .line 1154
    .line 1155
    invoke-direct {v1, v2}, Lg7;-><init>(Lp7;)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v9, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    :cond_45
    check-cast v1, Lg7;

    .line 1162
    .line 1163
    iget-wide v4, v9, Lpi;->T:J

    .line 1164
    .line 1165
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 1166
    .line 1167
    .line 1168
    move-result v4

    .line 1169
    invoke-virtual {v9}, Lpi;->l()Lfq0;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v5

    .line 1173
    invoke-static {v9, v0}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    sget-object v6, Lfi;->b:Lei;

    .line 1178
    .line 1179
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    sget-object v6, Lei;->b:Lcj;

    .line 1183
    .line 1184
    invoke-virtual {v9}, Lpi;->Z()V

    .line 1185
    .line 1186
    .line 1187
    iget-boolean v8, v9, Lpi;->S:Z

    .line 1188
    .line 1189
    if-eqz v8, :cond_46

    .line 1190
    .line 1191
    invoke-virtual {v9, v6}, Lpi;->k(Lhw;)V

    .line 1192
    .line 1193
    .line 1194
    goto :goto_1d

    .line 1195
    :cond_46
    invoke-virtual {v9}, Lpi;->j0()V

    .line 1196
    .line 1197
    .line 1198
    :goto_1d
    sget-object v6, Lei;->e:Lm7;

    .line 1199
    .line 1200
    invoke-static {v9, v6, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1201
    .line 1202
    .line 1203
    sget-object v1, Lei;->d:Lm7;

    .line 1204
    .line 1205
    invoke-static {v9, v1, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1206
    .line 1207
    .line 1208
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v1

    .line 1212
    sget-object v4, Lei;->f:Lm7;

    .line 1213
    .line 1214
    invoke-static {v9, v1, v4}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 1215
    .line 1216
    .line 1217
    sget-object v1, Lei;->g:Lp3;

    .line 1218
    .line 1219
    invoke-static {v9, v1}, Lw60;->G(Lji;Lsw;)V

    .line 1220
    .line 1221
    .line 1222
    sget-object v1, Lei;->c:Lm7;

    .line 1223
    .line 1224
    invoke-static {v9, v1, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    shr-int/lit8 v0, v19, 0x12

    .line 1228
    .line 1229
    and-int/lit8 v0, v0, 0x70

    .line 1230
    .line 1231
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    invoke-interface {v7, v2, v9, v0}, Lxw;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    const/4 v11, 0x1

    .line 1239
    invoke-virtual {v9, v11}, Lpi;->p(Z)V

    .line 1240
    .line 1241
    .line 1242
    goto/16 :goto_10

    .line 1243
    .line 1244
    :goto_1e
    invoke-virtual {v9, v15}, Lpi;->p(Z)V

    .line 1245
    .line 1246
    .line 1247
    goto :goto_1f

    .line 1248
    :cond_47
    invoke-virtual {v9}, Lpi;->R()V

    .line 1249
    .line 1250
    .line 1251
    :goto_1f
    invoke-virtual {v9}, Lpi;->r()Lht0;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v9

    .line 1255
    if-eqz v9, :cond_48

    .line 1256
    .line 1257
    new-instance v0, Lh7;

    .line 1258
    .line 1259
    move-object/from16 v1, p0

    .line 1260
    .line 1261
    move-object/from16 v2, p1

    .line 1262
    .line 1263
    move-object/from16 v4, p3

    .line 1264
    .line 1265
    move-object/from16 v5, p4

    .line 1266
    .line 1267
    move-object/from16 v6, p5

    .line 1268
    .line 1269
    move/from16 v8, p8

    .line 1270
    .line 1271
    invoke-direct/range {v0 .. v8}, Lh7;-><init>(Lb91;Lsw;Lpe0;Lvs;Ljt;Lww;Lxw;I)V

    .line 1272
    .line 1273
    .line 1274
    iput-object v0, v9, Lht0;->d:Lww;

    .line 1275
    .line 1276
    :cond_48
    return-void
.end method

.method public static final b(Lwf;ZLpe0;Lvs;Ljt;Ljava/lang/String;Lxw;Lji;I)V
    .locals 15

    .line 1
    move-object/from16 v5, p7

    .line 2
    .line 3
    check-cast v5, Lpi;

    .line 4
    .line 5
    const v0, 0x6b47faab

    .line 6
    .line 7
    .line 8
    invoke-virtual {v5, v0}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    move/from16 v8, p1

    .line 12
    .line 13
    invoke-virtual {v5, v8}, Lpi;->g(Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x20

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v0, 0x10

    .line 23
    .line 24
    :goto_0
    or-int v0, p8, v0

    .line 25
    .line 26
    const v1, 0x30180

    .line 27
    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    const v1, 0x92491

    .line 31
    .line 32
    .line 33
    and-int/2addr v1, v0

    .line 34
    const v2, 0x92490

    .line 35
    .line 36
    .line 37
    if-eq v1, v2, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 43
    .line 44
    invoke-virtual {v5, v2, v1}, Lpi;->O(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    shr-int/lit8 v0, v0, 0x3

    .line 55
    .line 56
    and-int/lit8 v0, v0, 0xe

    .line 57
    .line 58
    const/16 v2, 0x30

    .line 59
    .line 60
    or-int/2addr v0, v2

    .line 61
    sget v3, Ld91;->a:I

    .line 62
    .line 63
    invoke-virtual {v5}, Lpi;->L()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v7, "AnimatedVisibility"

    .line 68
    .line 69
    sget-object v4, Lii;->a:Lr3;

    .line 70
    .line 71
    if-ne v3, v4, :cond_2

    .line 72
    .line 73
    new-instance v3, Lb91;

    .line 74
    .line 75
    new-instance v6, Ld;

    .line 76
    .line 77
    invoke-direct {v6, v1}, Ld;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 v9, 0x0

    .line 81
    invoke-direct {v3, v6, v9, v7}, Lb91;-><init>(Ld;Lb91;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    check-cast v3, Lb91;

    .line 88
    .line 89
    and-int/lit8 v0, v0, 0xe

    .line 90
    .line 91
    or-int/2addr v0, v2

    .line 92
    invoke-virtual {v3, v1, v5, v0}, Lb91;->a(Ljava/lang/Boolean;Lji;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5}, Lpi;->L()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v4, :cond_3

    .line 100
    .line 101
    new-instance v0, Lo;

    .line 102
    .line 103
    const/16 v1, 0x19

    .line 104
    .line 105
    invoke-direct {v0, v1, v3}, Lo;-><init>(ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    check-cast v0, Lsw;

    .line 112
    .line 113
    invoke-static {v3, v0, v5}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Lpi;->L()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-ne v0, v4, :cond_4

    .line 121
    .line 122
    sget-object v0, Lp3;->i:Lp3;

    .line 123
    .line 124
    invoke-virtual {v5, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_4
    move-object v1, v0

    .line 128
    check-cast v1, Lsw;

    .line 129
    .line 130
    const v6, 0x36db0

    .line 131
    .line 132
    .line 133
    move-object/from16 v2, p3

    .line 134
    .line 135
    move-object/from16 v4, p6

    .line 136
    .line 137
    move-object v0, v3

    .line 138
    move-object/from16 v3, p4

    .line 139
    .line 140
    invoke-static/range {v0 .. v6}, Lo30;->c(Lb91;Lsw;Lvs;Ljt;Lxw;Lji;I)V

    .line 141
    .line 142
    .line 143
    sget-object v0, Lme0;->a:Lme0;

    .line 144
    .line 145
    move-object v9, v0

    .line 146
    move-object v12, v7

    .line 147
    goto :goto_2

    .line 148
    :cond_5
    invoke-virtual {v5}, Lpi;->R()V

    .line 149
    .line 150
    .line 151
    move-object/from16 v9, p2

    .line 152
    .line 153
    move-object/from16 v12, p5

    .line 154
    .line 155
    :goto_2
    invoke-virtual {v5}, Lpi;->r()Lht0;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_6

    .line 160
    .line 161
    new-instance v6, Lk7;

    .line 162
    .line 163
    move-object v7, p0

    .line 164
    move-object/from16 v10, p3

    .line 165
    .line 166
    move-object/from16 v11, p4

    .line 167
    .line 168
    move-object/from16 v13, p6

    .line 169
    .line 170
    move/from16 v14, p8

    .line 171
    .line 172
    invoke-direct/range {v6 .. v14}, Lk7;-><init>(Lwf;ZLpe0;Lvs;Ljt;Ljava/lang/String;Lxw;I)V

    .line 173
    .line 174
    .line 175
    iput-object v6, v0, Lht0;->d:Lww;

    .line 176
    .line 177
    :cond_6
    return-void
.end method

.method public static final c(Lb91;Lsw;Lvs;Ljt;Lxw;Lji;I)V
    .locals 9

    .line 1
    move-object v7, p5

    .line 2
    check-cast v7, Lpi;

    .line 3
    .line 4
    const p5, 0x65b46798

    .line 5
    .line 6
    .line 7
    invoke-virtual {v7, p5}, Lpi;->X(I)Lpi;

    .line 8
    .line 9
    .line 10
    and-int/lit8 p5, p6, 0x6

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-nez p5, :cond_1

    .line 14
    .line 15
    invoke-virtual {v7, p0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p5

    .line 19
    if-eqz p5, :cond_0

    .line 20
    .line 21
    move p5, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p5, 0x2

    .line 24
    :goto_0
    or-int/2addr p5, p6

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move p5, p6

    .line 27
    :goto_1
    and-int/lit8 v1, p6, 0x30

    .line 28
    .line 29
    const/16 v2, 0x20

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v7, p1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    move v1, v2

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v1, 0x10

    .line 42
    .line 43
    :goto_2
    or-int/2addr p5, v1

    .line 44
    :cond_3
    and-int/lit16 v1, p6, 0x180

    .line 45
    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    sget-object v1, Lme0;->a:Lme0;

    .line 49
    .line 50
    invoke-virtual {v7, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    const/16 v1, 0x100

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const/16 v1, 0x80

    .line 60
    .line 61
    :goto_3
    or-int/2addr p5, v1

    .line 62
    :cond_5
    and-int/lit16 v1, p6, 0xc00

    .line 63
    .line 64
    if-nez v1, :cond_7

    .line 65
    .line 66
    invoke-virtual {v7, p2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    const/16 v1, 0x800

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_6
    const/16 v1, 0x400

    .line 76
    .line 77
    :goto_4
    or-int/2addr p5, v1

    .line 78
    :cond_7
    and-int/lit16 v1, p6, 0x6000

    .line 79
    .line 80
    if-nez v1, :cond_9

    .line 81
    .line 82
    invoke-virtual {v7, p3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_8

    .line 87
    .line 88
    const/16 v1, 0x4000

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_8
    const/16 v1, 0x2000

    .line 92
    .line 93
    :goto_5
    or-int/2addr p5, v1

    .line 94
    :cond_9
    const/high16 v1, 0x30000

    .line 95
    .line 96
    and-int v3, p6, v1

    .line 97
    .line 98
    if-nez v3, :cond_b

    .line 99
    .line 100
    invoke-virtual {v7, p4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_a

    .line 105
    .line 106
    const/high16 v3, 0x20000

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_a
    const/high16 v3, 0x10000

    .line 110
    .line 111
    :goto_6
    or-int/2addr p5, v3

    .line 112
    :cond_b
    const v3, 0x12493

    .line 113
    .line 114
    .line 115
    and-int/2addr v3, p5

    .line 116
    const v4, 0x12492

    .line 117
    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    const/4 v6, 0x1

    .line 121
    if-eq v3, v4, :cond_c

    .line 122
    .line 123
    move v3, v6

    .line 124
    goto :goto_7

    .line 125
    :cond_c
    move v3, v5

    .line 126
    :goto_7
    and-int/lit8 v4, p5, 0x1

    .line 127
    .line 128
    invoke-virtual {v7, v4, v3}, Lpi;->O(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_12

    .line 133
    .line 134
    and-int/lit8 v3, p5, 0x70

    .line 135
    .line 136
    if-ne v3, v2, :cond_d

    .line 137
    .line 138
    move v2, v6

    .line 139
    goto :goto_8

    .line 140
    :cond_d
    move v2, v5

    .line 141
    :goto_8
    and-int/lit8 v4, p5, 0xe

    .line 142
    .line 143
    if-ne v4, v0, :cond_e

    .line 144
    .line 145
    move v5, v6

    .line 146
    :cond_e
    or-int v0, v2, v5

    .line 147
    .line 148
    invoke-virtual {v7}, Lpi;->L()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    sget-object v5, Lii;->a:Lr3;

    .line 153
    .line 154
    if-nez v0, :cond_f

    .line 155
    .line 156
    if-ne v2, v5, :cond_10

    .line 157
    .line 158
    :cond_f
    new-instance v2, Ll7;

    .line 159
    .line 160
    invoke-direct {v2, p1, p0}, Ll7;-><init>(Lsw;Lb91;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_10
    check-cast v2, Lxw;

    .line 167
    .line 168
    invoke-static {v2}, Li4;->x(Lxw;)Lpe0;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v7}, Lpi;->L()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v0, v5, :cond_11

    .line 177
    .line 178
    sget-object v0, Lm7;->e:Lm7;

    .line 179
    .line 180
    invoke-virtual {v7, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_11
    move-object v5, v0

    .line 184
    check-cast v5, Lww;

    .line 185
    .line 186
    or-int v0, v4, v1

    .line 187
    .line 188
    or-int/2addr v0, v3

    .line 189
    and-int/lit16 v1, p5, 0x1c00

    .line 190
    .line 191
    or-int/2addr v0, v1

    .line 192
    const v1, 0xe000

    .line 193
    .line 194
    .line 195
    and-int/2addr v1, p5

    .line 196
    or-int/2addr v0, v1

    .line 197
    const/high16 v1, 0x1c00000

    .line 198
    .line 199
    shl-int/lit8 p5, p5, 0x6

    .line 200
    .line 201
    and-int/2addr p5, v1

    .line 202
    or-int v8, v0, p5

    .line 203
    .line 204
    move-object v0, p0

    .line 205
    move-object v1, p1

    .line 206
    move-object v3, p2

    .line 207
    move-object v4, p3

    .line 208
    move-object v6, p4

    .line 209
    invoke-static/range {v0 .. v8}, Lo30;->a(Lb91;Lsw;Lpe0;Lvs;Ljt;Lww;Lxw;Lji;I)V

    .line 210
    .line 211
    .line 212
    move-object p1, v0

    .line 213
    move-object p2, v1

    .line 214
    move-object p3, v3

    .line 215
    move-object p4, v4

    .line 216
    move-object p5, v6

    .line 217
    goto :goto_9

    .line 218
    :cond_12
    move-object p5, p4

    .line 219
    move-object p4, p3

    .line 220
    move-object p3, p2

    .line 221
    move-object p2, p1

    .line 222
    move-object p1, p0

    .line 223
    invoke-virtual {v7}, Lpi;->R()V

    .line 224
    .line 225
    .line 226
    :goto_9
    invoke-virtual {v7}, Lpi;->r()Lht0;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-eqz v0, :cond_13

    .line 231
    .line 232
    new-instance p0, Ln7;

    .line 233
    .line 234
    invoke-direct/range {p0 .. p6}, Ln7;-><init>(Lb91;Lsw;Lvs;Ljt;Lxw;I)V

    .line 235
    .line 236
    .line 237
    iput-object p0, v0, Lht0;->d:Lww;

    .line 238
    .line 239
    :cond_13
    return-void
.end method

.method public static final d(Lhw;Lpe0;ZLx01;Lcc;Lgc;Ljn0;Lxw;Lji;II)V
    .locals 29

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    .line 1
    move-object/from16 v0, p8

    check-cast v0, Lpi;

    const v1, -0x4e1540b0

    invoke-virtual {v0, v1}, Lpi;->X(I)Lpi;

    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v4, v9

    :goto_1
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v10, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v4, v4, 0x180

    :cond_4
    move/from16 v11, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v11, v9, 0x180

    if-nez v11, :cond_4

    move/from16 v11, p2

    invoke-virtual {v0, v11}, Lpi;->g(Z)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x100

    goto :goto_3

    :cond_6
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v4, v12

    :goto_4
    and-int/lit16 v12, v9, 0xc00

    move-object/from16 v13, p3

    if-nez v12, :cond_8

    invoke-virtual {v0, v13}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x800

    goto :goto_5

    :cond_7
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v4, v12

    :cond_8
    and-int/lit16 v12, v9, 0x6000

    if-nez v12, :cond_a

    invoke-virtual {v0, v5}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x4000

    goto :goto_6

    :cond_9
    const/16 v12, 0x2000

    :goto_6
    or-int/2addr v4, v12

    :cond_a
    const/high16 v12, 0x30000

    and-int/2addr v12, v9

    if-nez v12, :cond_d

    and-int/lit8 v12, v10, 0x20

    if-nez v12, :cond_b

    move-object/from16 v12, p5

    invoke-virtual {v0, v12}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    const/high16 v14, 0x20000

    goto :goto_7

    :cond_b
    move-object/from16 v12, p5

    :cond_c
    const/high16 v14, 0x10000

    :goto_7
    or-int/2addr v4, v14

    goto :goto_8

    :cond_d
    move-object/from16 v12, p5

    :goto_8
    and-int/lit8 v14, v10, 0x40

    const/4 v15, 0x0

    const/high16 v16, 0x180000

    if-eqz v14, :cond_e

    or-int v4, v4, v16

    goto :goto_a

    :cond_e
    and-int v14, v9, v16

    if-nez v14, :cond_10

    invoke-virtual {v0, v15}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x100000

    goto :goto_9

    :cond_f
    const/high16 v14, 0x80000

    :goto_9
    or-int/2addr v4, v14

    :cond_10
    :goto_a
    and-int/lit16 v14, v10, 0x80

    const/high16 v16, 0xc00000

    if-eqz v14, :cond_11

    or-int v4, v4, v16

    move-object/from16 v7, p6

    goto :goto_c

    :cond_11
    and-int v16, v9, v16

    move-object/from16 v7, p6

    if-nez v16, :cond_13

    invoke-virtual {v0, v7}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x800000

    goto :goto_b

    :cond_12
    const/high16 v16, 0x400000

    :goto_b
    or-int v4, v4, v16

    :cond_13
    :goto_c
    and-int/lit16 v3, v10, 0x100

    const/high16 v17, 0x6000000

    if-eqz v3, :cond_14

    or-int v4, v4, v17

    goto :goto_e

    :cond_14
    and-int v3, v9, v17

    if-nez v3, :cond_16

    invoke-virtual {v0, v15}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    const/high16 v3, 0x4000000

    goto :goto_d

    :cond_15
    const/high16 v3, 0x2000000

    :goto_d
    or-int/2addr v4, v3

    :cond_16
    :goto_e
    const/high16 v3, 0x30000000

    and-int/2addr v3, v9

    if-nez v3, :cond_18

    invoke-virtual {v0, v8}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_17

    const/high16 v3, 0x20000000

    goto :goto_f

    :cond_17
    const/high16 v3, 0x10000000

    :goto_f
    or-int/2addr v4, v3

    :cond_18
    const v3, 0x12492493

    and-int/2addr v3, v4

    const v15, 0x12492492

    const/4 v1, 0x0

    const/16 v18, 0x1

    if-eq v3, v15, :cond_19

    move/from16 v3, v18

    goto :goto_10

    :cond_19
    move v3, v1

    :goto_10
    and-int/lit8 v15, v4, 0x1

    invoke-virtual {v0, v15, v3}, Lpi;->O(IZ)Z

    move-result v3

    if-eqz v3, :cond_37

    invoke-virtual {v0}, Lpi;->T()V

    and-int/lit8 v3, v9, 0x1

    const v15, -0x70001

    if-eqz v3, :cond_1b

    invoke-virtual {v0}, Lpi;->y()Z

    move-result v3

    if-eqz v3, :cond_1a

    goto :goto_11

    .line 2
    :cond_1a
    invoke-virtual {v0}, Lpi;->R()V

    and-int/lit8 v3, v10, 0x20

    if-eqz v3, :cond_1f

    and-int/2addr v4, v15

    goto :goto_13

    :cond_1b
    :goto_11
    if-eqz v6, :cond_1c

    move/from16 v11, v18

    :cond_1c
    and-int/lit8 v3, v10, 0x20

    if-eqz v3, :cond_1d

    .line 3
    sget-object v3, Ldc;->a:Lln0;

    .line 4
    sget v3, Lkl;->p:F

    .line 5
    new-instance v6, Lgc;

    invoke-direct {v6, v3}, Lgc;-><init>(F)V

    and-int/2addr v4, v15

    goto :goto_12

    :cond_1d
    move-object v6, v12

    :goto_12
    if-eqz v14, :cond_1e

    .line 6
    sget-object v3, Ldc;->a:Lln0;

    move-object v7, v3

    :cond_1e
    move-object v12, v6

    .line 7
    :cond_1f
    :goto_13
    invoke-virtual {v0}, Lpi;->q()V

    const v3, 0x64d5e04b

    .line 8
    invoke-virtual {v0, v3}, Lpi;->W(I)V

    .line 9
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    move-result-object v3

    .line 10
    sget-object v6, Lii;->a:Lr3;

    if-ne v3, v6, :cond_20

    .line 11
    new-instance v3, Lxg0;

    invoke-direct {v3}, Lxg0;-><init>()V

    .line 12
    invoke-virtual {v0, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 13
    :cond_20
    check-cast v3, Lxg0;

    .line 14
    invoke-virtual {v0, v1}, Lpi;->p(Z)V

    if-eqz v11, :cond_21

    .line 15
    iget-wide v14, v5, Lcc;->a:J

    goto :goto_14

    :cond_21
    iget-wide v14, v5, Lcc;->c:J

    :goto_14
    if-eqz v11, :cond_22

    .line 16
    iget-wide v1, v5, Lcc;->b:J

    :goto_15
    move/from16 p2, v4

    goto :goto_16

    :cond_22
    iget-wide v1, v5, Lcc;->d:J

    goto :goto_15

    :goto_16
    const/16 v26, 0x0

    if-nez v12, :cond_23

    const v4, 0x64d8ada6

    .line 17
    invoke-virtual {v0, v4}, Lpi;->W(I)V

    const/4 v4, 0x0

    .line 18
    invoke-virtual {v0, v4}, Lpi;->p(Z)V

    move-object/from16 p2, v3

    move/from16 v22, v11

    move-object/from16 v23, v12

    move-wide/from16 v27, v14

    const/4 v15, 0x0

    goto/16 :goto_1e

    :cond_23
    const v4, -0x1dc77645

    .line 19
    invoke-virtual {v0, v4}, Lpi;->W(I)V

    shr-int/lit8 v4, p2, 0x6

    and-int/lit8 v4, v4, 0xe

    move/from16 p6, v4

    shr-int/lit8 v4, p2, 0x9

    and-int/lit16 v4, v4, 0x380

    or-int v4, p6, v4

    .line 20
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_24

    .line 21
    new-instance v5, Lc31;

    invoke-direct {v5}, Lc31;-><init>()V

    .line 22
    invoke-virtual {v0, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 23
    :cond_24
    check-cast v5, Lc31;

    .line 24
    invoke-virtual {v0, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v19

    .line 25
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    move-result-object v9

    if-nez v19, :cond_25

    if-ne v9, v6, :cond_26

    .line 26
    :cond_25
    new-instance v9, Le;

    const/4 v10, 0x3

    const/4 v13, 0x0

    invoke-direct {v9, v3, v5, v13, v10}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 27
    invoke-virtual {v0, v9}, Lpi;->g0(Ljava/lang/Object;)V

    .line 28
    :cond_26
    check-cast v9, Lww;

    invoke-static {v0, v9, v3}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 29
    invoke-static {v5}, Lye;->Q(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf30;

    if-nez v11, :cond_28

    :cond_27
    :goto_17
    move/from16 v9, v26

    goto :goto_18

    .line 30
    :cond_28
    instance-of v9, v5, Ljs0;

    if-eqz v9, :cond_29

    goto :goto_17

    .line 31
    :cond_29
    instance-of v9, v5, Lgz;

    if-eqz v9, :cond_27

    iget v9, v12, Lgc;->a:F

    .line 32
    :goto_18
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v6, :cond_2a

    .line 33
    new-instance v10, Lb7;

    .line 34
    new-instance v13, Lnp;

    invoke-direct {v13, v9}, Lnp;-><init>(F)V

    move-object/from16 p2, v3

    .line 35
    sget-object v3, Lkl;->z:Lq91;

    move-wide/from16 v27, v14

    const/16 v14, 0xc

    const/4 v15, 0x0

    invoke-direct {v10, v13, v3, v15, v14}, Lb7;-><init>(Ljava/lang/Object;Lq91;Ljava/lang/Float;I)V

    .line 36
    invoke-virtual {v0, v10}, Lpi;->g0(Ljava/lang/Object;)V

    goto :goto_19

    :cond_2a
    move-object/from16 p2, v3

    move-wide/from16 v27, v14

    .line 37
    :goto_19
    check-cast v10, Lb7;

    .line 38
    new-instance v3, Lnp;

    invoke-direct {v3, v9}, Lnp;-><init>(F)V

    .line 39
    invoke-virtual {v0, v10}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v0, v9}, Lpi;->c(F)Z

    move-result v14

    or-int/2addr v13, v14

    and-int/lit8 v14, v4, 0xe

    xor-int/lit8 v14, v14, 0x6

    const/4 v15, 0x4

    if-le v14, v15, :cond_2b

    invoke-virtual {v0, v11}, Lpi;->g(Z)Z

    move-result v14

    if-nez v14, :cond_2c

    :cond_2b
    and-int/lit8 v14, v4, 0x6

    if-ne v14, v15, :cond_2d

    :cond_2c
    move/from16 v14, v18

    goto :goto_1a

    :cond_2d
    const/4 v14, 0x0

    :goto_1a
    or-int/2addr v13, v14

    and-int/lit16 v14, v4, 0x380

    xor-int/lit16 v14, v14, 0x180

    const/16 v15, 0x100

    if-le v14, v15, :cond_2e

    invoke-virtual {v0, v12}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_30

    :cond_2e
    and-int/lit16 v4, v4, 0x180

    if-ne v4, v15, :cond_2f

    goto :goto_1b

    :cond_2f
    const/16 v18, 0x0

    :cond_30
    :goto_1b
    or-int v4, v13, v18

    invoke-virtual {v0, v5}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v4, v13

    .line 40
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_32

    if-ne v13, v6, :cond_31

    goto :goto_1c

    :cond_31
    move/from16 v22, v11

    move-object/from16 v23, v12

    goto :goto_1d

    .line 41
    :cond_32
    :goto_1c
    new-instance v19, Lfc;

    const/16 v25, 0x0

    move-object/from16 v24, v5

    move/from16 v21, v9

    move-object/from16 v20, v10

    move/from16 v22, v11

    move-object/from16 v23, v12

    invoke-direct/range {v19 .. v25}, Lfc;-><init>(Lb7;FZLgc;Lf30;Lik;)V

    move-object/from16 v13, v19

    .line 42
    invoke-virtual {v0, v13}, Lpi;->g0(Ljava/lang/Object;)V

    .line 43
    :goto_1d
    check-cast v13, Lww;

    invoke-static {v0, v13, v3}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 44
    iget-object v15, v10, Lb7;->c:Lw7;

    const/4 v4, 0x0

    .line 45
    invoke-virtual {v0, v4}, Lpi;->p(Z)V

    :goto_1e
    if-eqz v15, :cond_33

    .line 46
    iget-object v3, v15, Lw7;->e:Lgp0;

    .line 47
    invoke-virtual {v3}, Lgp0;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 48
    check-cast v3, Lnp;

    .line 49
    iget v3, v3, Lnp;->d:F

    move/from16 v20, v3

    goto :goto_1f

    :cond_33
    move/from16 v20, v26

    .line 50
    :goto_1f
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_34

    .line 51
    new-instance v3, Lw9;

    const/4 v10, 0x3

    invoke-direct {v3, v10}, Lw9;-><init>(I)V

    .line 52
    invoke-virtual {v0, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 53
    :cond_34
    check-cast v3, Lsw;

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Luz0;->a(Lpe0;Lsw;)Lpe0;

    move-result-object v12

    .line 54
    new-instance v3, Lkc;

    invoke-direct {v3, v1, v2, v7, v8}, Lkc;-><init>(JLjn0;Lxw;)V

    const v5, -0x1fed37a5

    invoke-static {v5, v3, v0}, Lkl;->w(ILex;Lji;)Lmh;

    move-result-object v21

    .line 55
    sget-object v3, Lh51;->a:Lej;

    if-nez p2, :cond_36

    const v3, -0x6563c494

    .line 56
    invoke-virtual {v0, v3}, Lpi;->W(I)V

    .line 57
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_35

    .line 58
    new-instance v3, Lxg0;

    invoke-direct {v3}, Lxg0;-><init>()V

    .line 59
    invoke-virtual {v0, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 60
    :cond_35
    check-cast v3, Lxg0;

    const/4 v5, 0x0

    .line 61
    invoke-virtual {v0, v5}, Lpi;->p(Z)V

    move-object/from16 v17, v3

    goto :goto_20

    :cond_36
    const/4 v5, 0x0

    const v3, 0x7899accb

    .line 62
    invoke-virtual {v0, v3}, Lpi;->W(I)V

    .line 63
    invoke-virtual {v0, v5}, Lpi;->p(Z)V

    move-object/from16 v17, p2

    .line 64
    :goto_20
    sget-object v3, Lh51;->a:Lej;

    .line 65
    invoke-virtual {v0, v3}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnp;

    .line 66
    iget v5, v5, Lnp;->d:F

    add-float v5, v5, v26

    .line 67
    sget-object v6, Lxj;->a:Lej;

    .line 68
    new-instance v9, Lff;

    invoke-direct {v9, v1, v2}, Lff;-><init>(J)V

    .line 69
    invoke-virtual {v6, v9}, Lej;->a(Ljava/lang/Object;)Lct0;

    move-result-object v1

    .line 70
    new-instance v2, Lnp;

    invoke-direct {v2, v5}, Lnp;-><init>(F)V

    .line 71
    invoke-virtual {v3, v2}, Lej;->a(Ljava/lang/Object;)Lct0;

    move-result-object v2

    .line 72
    filled-new-array {v1, v2}, [Lct0;

    move-result-object v1

    .line 73
    new-instance v11, Lg51;

    move-object/from16 v19, p0

    move-object/from16 v13, p3

    move/from16 v16, v5

    move/from16 v18, v22

    move-wide/from16 v14, v27

    invoke-direct/range {v11 .. v21}, Lg51;-><init>(Lpe0;Lx01;JFLxg0;ZLhw;FLmh;)V

    const v2, 0x329de4cf

    invoke-static {v2, v11, v0}, Lkl;->w(ILex;Lji;)Lmh;

    move-result-object v2

    const/16 v3, 0x38

    .line 74
    invoke-static {v1, v2, v0, v3}, Li4;->c([Lct0;Lww;Lji;I)V

    move/from16 v3, v22

    move-object/from16 v6, v23

    goto :goto_21

    :cond_37
    move-object v4, v2

    .line 75
    invoke-virtual {v0}, Lpi;->R()V

    move v3, v11

    move-object v6, v12

    .line 76
    :goto_21
    invoke-virtual {v0}, Lpi;->r()Lht0;

    move-result-object v11

    if-eqz v11, :cond_38

    new-instance v0, Lhc;

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v9, p9

    move/from16 v10, p10

    move-object v2, v4

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v10}, Lhc;-><init>(Lhw;Lpe0;ZLx01;Lcc;Lgc;Ljn0;Lxw;II)V

    .line 77
    iput-object v0, v11, Lht0;->d:Lww;

    :cond_38
    return-void
.end method

.method public static e(IILtb;)Lvb;
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    sget-object v0, Ltb;->d:Ltb;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    move-object p2, v0

    .line 8
    :cond_0
    const/4 p1, -0x2

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p0, p1, :cond_7

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    if-eq p0, p1, :cond_5

    .line 14
    .line 15
    if-eqz p0, :cond_3

    .line 16
    .line 17
    const p1, 0x7fffffff

    .line 18
    .line 19
    .line 20
    if-eq p0, p1, :cond_2

    .line 21
    .line 22
    if-ne p2, v0, :cond_1

    .line 23
    .line 24
    new-instance p1, Lvb;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lvb;-><init>(I)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    new-instance p1, Ljj;

    .line 31
    .line 32
    invoke-direct {p1, p0, p2}, Ljj;-><init>(ILtb;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    new-instance p0, Lvb;

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lvb;-><init>(I)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_3
    if-ne p2, v0, :cond_4

    .line 43
    .line 44
    new-instance p0, Lvb;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-direct {p0, p1}, Lvb;-><init>(I)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_4
    new-instance p0, Ljj;

    .line 52
    .line 53
    invoke-direct {p0, v1, p2}, Ljj;-><init>(ILtb;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_5
    if-ne p2, v0, :cond_6

    .line 58
    .line 59
    new-instance p0, Ljj;

    .line 60
    .line 61
    sget-object p1, Ltb;->e:Ltb;

    .line 62
    .line 63
    invoke-direct {p0, v1, p1}, Ljj;-><init>(ILtb;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_6
    const-string p0, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    .line 68
    .line 69
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    return-object p0

    .line 74
    :cond_7
    if-ne p2, v0, :cond_8

    .line 75
    .line 76
    new-instance p0, Lvb;

    .line 77
    .line 78
    sget-object p1, Lmd;->a:Lld;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    sget p1, Lld;->b:I

    .line 84
    .line 85
    invoke-direct {p0, p1}, Lvb;-><init>(I)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_8
    new-instance p0, Ljj;

    .line 90
    .line 91
    invoke-direct {p0, v1, p2}, Ljj;-><init>(ILtb;)V

    .line 92
    .line 93
    .line 94
    return-object p0
.end method

.method public static final f(Lro0;Lpe0;Lha;Lr3;Lji;I)V
    .locals 11

    .line 1
    move-object v0, p4

    .line 2
    check-cast v0, Lpi;

    .line 3
    .line 4
    const v1, 0x441d0e20

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lpi;->X(I)Lpi;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x2

    .line 19
    :goto_0
    or-int v1, p5, v1

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    const/16 v2, 0x800

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 v2, 0x400

    .line 31
    .line 32
    :goto_1
    or-int/2addr v1, v2

    .line 33
    invoke-virtual {v0, p3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    const/16 v2, 0x4000

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/16 v2, 0x2000

    .line 43
    .line 44
    :goto_2
    or-int/2addr v1, v2

    .line 45
    const/high16 v2, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lpi;->c(F)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    const/high16 v2, 0x20000

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    const/high16 v2, 0x10000

    .line 57
    .line 58
    :goto_3
    or-int/2addr v1, v2

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v0, v2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    const/high16 v6, 0x100000

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_4
    const/high16 v6, 0x80000

    .line 70
    .line 71
    :goto_4
    or-int/2addr v1, v6

    .line 72
    const v6, 0x92493

    .line 73
    .line 74
    .line 75
    and-int/2addr v6, v1

    .line 76
    const v7, 0x92492

    .line 77
    .line 78
    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v9, 0x1

    .line 81
    if-eq v6, v7, :cond_5

    .line 82
    .line 83
    move v6, v9

    .line 84
    goto :goto_5

    .line 85
    :cond_5
    move v6, v8

    .line 86
    :goto_5
    and-int/2addr v1, v9

    .line 87
    invoke-virtual {v0, v1, v6}, Lpi;->O(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_9

    .line 92
    .line 93
    const v1, 0x7133d784

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lpi;->W(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    sget-object v10, Lii;->a:Lr3;

    .line 104
    .line 105
    if-ne v1, v10, :cond_6

    .line 106
    .line 107
    new-instance v1, Lpn;

    .line 108
    .line 109
    const/16 v6, 0x18

    .line 110
    .line 111
    invoke-direct {v1, v6}, Lpn;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    check-cast v1, Lsw;

    .line 118
    .line 119
    sget-object v6, Lme0;->a:Lme0;

    .line 120
    .line 121
    invoke-static {v6, v1}, Luz0;->a(Lpe0;Lsw;)Lpe0;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v0, v8}, Lpi;->p(Z)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, v1}, Lpe0;->c(Lpe0;)Lpe0;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const v6, 0x7efff

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v2, v6}, Lp30;->J(Lpe0;Lx01;I)Lpe0;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    const/4 v7, 0x2

    .line 140
    const/4 v6, 0x0

    .line 141
    move-object v3, p0

    .line 142
    move-object v4, p2

    .line 143
    move-object v5, p3

    .line 144
    invoke-static/range {v2 .. v7}, Ls91;->J(Lpe0;Lro0;Lha;Lr3;Lja;I)Lpe0;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-ne v2, v10, :cond_7

    .line 153
    .line 154
    sget-object v2, Lb5;->f:Lb5;

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    check-cast v2, Lxd0;

    .line 160
    .line 161
    iget-wide v3, v0, Lpi;->T:J

    .line 162
    .line 163
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-static {v0, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v0}, Lpi;->l()Lfq0;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    sget-object v5, Lfi;->b:Lei;

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    sget-object v5, Lei;->b:Lcj;

    .line 181
    .line 182
    invoke-virtual {v0}, Lpi;->Z()V

    .line 183
    .line 184
    .line 185
    iget-boolean v6, v0, Lpi;->S:Z

    .line 186
    .line 187
    if-eqz v6, :cond_8

    .line 188
    .line 189
    invoke-virtual {v0, v5}, Lpi;->k(Lhw;)V

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_8
    invoke-virtual {v0}, Lpi;->j0()V

    .line 194
    .line 195
    .line 196
    :goto_6
    sget-object v5, Lei;->e:Lm7;

    .line 197
    .line 198
    invoke-static {v0, v5, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object v2, Lei;->d:Lm7;

    .line 202
    .line 203
    invoke-static {v0, v2, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    sget-object v2, Lei;->g:Lp3;

    .line 207
    .line 208
    invoke-static {v0, v2}, Lw60;->G(Lji;Lsw;)V

    .line 209
    .line 210
    .line 211
    sget-object v2, Lei;->c:Lm7;

    .line 212
    .line 213
    invoke-static {v0, v2, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    sget-object v2, Lei;->f:Lm7;

    .line 221
    .line 222
    invoke-static {v0, v1, v2}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v9}, Lpi;->p(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_9
    invoke-virtual {v0}, Lpi;->R()V

    .line 230
    .line 231
    .line 232
    :goto_7
    invoke-virtual {v0}, Lpi;->r()Lht0;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-eqz v0, :cond_a

    .line 237
    .line 238
    new-instance v2, Ln00;

    .line 239
    .line 240
    const/4 v8, 0x0

    .line 241
    move-object v3, p0

    .line 242
    move-object v4, p1

    .line 243
    move-object v5, p2

    .line 244
    move-object v6, p3

    .line 245
    move/from16 v7, p5

    .line 246
    .line 247
    invoke-direct/range {v2 .. v8}, Ln00;-><init>(Ljava/lang/Object;Lpe0;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 248
    .line 249
    .line 250
    iput-object v2, v0, Lht0;->d:Lww;

    .line 251
    .line 252
    :cond_a
    return-void
.end method

.method public static final g()Lw5;
    .locals 3

    .line 1
    new-instance v0, Lw5;

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lw5;-><init>(Landroid/graphics/Paint;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final h(Lhw;Lpe0;ZLx01;Lcc;Ljn0;Lxw;Lji;I)V
    .locals 20

    .line 1
    move-object/from16 v8, p7

    .line 2
    .line 3
    check-cast v8, Lpi;

    .line 4
    .line 5
    const v0, -0x3f43489d

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p8, 0x6

    .line 12
    .line 13
    move-object/from16 v10, p0

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v8, v10}, Lpi;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int v0, p8, v0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move/from16 v0, p8

    .line 30
    .line 31
    :goto_1
    const v1, 0x6db25b0

    .line 32
    .line 33
    .line 34
    or-int/2addr v0, v1

    .line 35
    const v1, 0x12492493

    .line 36
    .line 37
    .line 38
    and-int/2addr v1, v0

    .line 39
    const v2, 0x12492492

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    if-eq v1, v2, :cond_2

    .line 44
    .line 45
    move v1, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/4 v1, 0x0

    .line 48
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 49
    .line 50
    invoke-virtual {v8, v2, v1}, Lpi;->O(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_6

    .line 55
    .line 56
    invoke-virtual {v8}, Lpi;->T()V

    .line 57
    .line 58
    .line 59
    and-int/lit8 v1, p8, 0x1

    .line 60
    .line 61
    const v2, -0xfc01

    .line 62
    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {v8}, Lpi;->y()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {v8}, Lpi;->R()V

    .line 74
    .line 75
    .line 76
    and-int/2addr v0, v2

    .line 77
    move-object/from16 v1, p1

    .line 78
    .line 79
    move/from16 v2, p2

    .line 80
    .line 81
    move-object/from16 v3, p3

    .line 82
    .line 83
    move-object/from16 v4, p4

    .line 84
    .line 85
    move-object/from16 v6, p5

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_4
    :goto_3
    sget-object v1, Ldc;->a:Lln0;

    .line 89
    .line 90
    sget-object v1, Lkl;->i:Lz01;

    .line 91
    .line 92
    invoke-static {v1, v8}, Lc11;->a(Lz01;Lji;)Lx01;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    sget-object v4, Lnf;->a:Lg41;

    .line 97
    .line 98
    invoke-virtual {v8, v4}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Llf;

    .line 103
    .line 104
    iget-object v5, v4, Llf;->X:Lcc;

    .line 105
    .line 106
    if-nez v5, :cond_5

    .line 107
    .line 108
    new-instance v11, Lcc;

    .line 109
    .line 110
    sget-wide v12, Lff;->f:J

    .line 111
    .line 112
    sget-object v5, Lmf;->k:Lmf;

    .line 113
    .line 114
    invoke-static {v4, v5}, Lnf;->c(Llf;Lmf;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v14

    .line 118
    sget-object v5, Lrd0;->o:Lmf;

    .line 119
    .line 120
    invoke-static {v4, v5}, Lnf;->c(Llf;Lmf;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    sget v7, Lrd0;->p:F

    .line 125
    .line 126
    invoke-static {v7, v5, v6}, Lff;->b(FJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v18

    .line 130
    move-wide/from16 v16, v12

    .line 131
    .line 132
    invoke-direct/range {v11 .. v19}, Lcc;-><init>(JJJJ)V

    .line 133
    .line 134
    .line 135
    iput-object v11, v4, Llf;->X:Lcc;

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_5
    move-object v11, v5

    .line 139
    :goto_4
    and-int/2addr v0, v2

    .line 140
    sget-object v2, Ldc;->b:Lln0;

    .line 141
    .line 142
    sget-object v4, Lme0;->a:Lme0;

    .line 143
    .line 144
    move-object v6, v2

    .line 145
    move v2, v3

    .line 146
    move-object v3, v1

    .line 147
    move-object v1, v4

    .line 148
    move-object v4, v11

    .line 149
    :goto_5
    invoke-virtual {v8}, Lpi;->q()V

    .line 150
    .line 151
    .line 152
    const v5, 0x7ffffffe

    .line 153
    .line 154
    .line 155
    and-int v9, v0, v5

    .line 156
    .line 157
    const/4 v10, 0x0

    .line 158
    const/4 v5, 0x0

    .line 159
    move-object/from16 v0, p0

    .line 160
    .line 161
    move-object/from16 v7, p6

    .line 162
    .line 163
    invoke-static/range {v0 .. v10}, Lo30;->d(Lhw;Lpe0;ZLx01;Lcc;Lgc;Ljn0;Lxw;Lji;II)V

    .line 164
    .line 165
    .line 166
    move-object v11, v1

    .line 167
    move v12, v2

    .line 168
    move-object v13, v3

    .line 169
    move-object v14, v4

    .line 170
    move-object v15, v6

    .line 171
    goto :goto_6

    .line 172
    :cond_6
    invoke-virtual {v8}, Lpi;->R()V

    .line 173
    .line 174
    .line 175
    move-object/from16 v11, p1

    .line 176
    .line 177
    move/from16 v12, p2

    .line 178
    .line 179
    move-object/from16 v13, p3

    .line 180
    .line 181
    move-object/from16 v14, p4

    .line 182
    .line 183
    move-object/from16 v15, p5

    .line 184
    .line 185
    :goto_6
    invoke-virtual {v8}, Lpi;->r()Lht0;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_7

    .line 190
    .line 191
    new-instance v9, Lic;

    .line 192
    .line 193
    move-object/from16 v10, p0

    .line 194
    .line 195
    move-object/from16 v16, p6

    .line 196
    .line 197
    move/from16 v17, p8

    .line 198
    .line 199
    invoke-direct/range {v9 .. v17}, Lic;-><init>(Lhw;Lpe0;ZLx01;Lcc;Ljn0;Lxw;I)V

    .line 200
    .line 201
    .line 202
    iput-object v9, v0, Lht0;->d:Lww;

    .line 203
    .line 204
    :cond_7
    return-void
.end method

.method public static varargs i([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, Lw8;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, Lw8;-><init>([Ljava/lang/Object;Z)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final j([III)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    add-int/lit8 p1, p1, -0x1

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    if-gt v0, p1, :cond_2

    .line 8
    .line 9
    add-int v1, v0, p1

    .line 10
    .line 11
    ushr-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    aget v2, p0, v1

    .line 14
    .line 15
    if-ge v2, p2, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-le v2, p2, :cond_1

    .line 21
    .line 22
    add-int/lit8 p1, v1, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v1

    .line 26
    :cond_2
    not-int p0, v0

    .line 27
    return p0
.end method

.method public static final k([JIJ)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    add-int/lit8 p1, p1, -0x1

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    if-gt v0, p1, :cond_2

    .line 8
    .line 9
    add-int v1, v0, p1

    .line 10
    .line 11
    ushr-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    aget-wide v2, p0, v1

    .line 14
    .line 15
    cmp-long v2, v2, p2

    .line 16
    .line 17
    if-gez v2, :cond_0

    .line 18
    .line 19
    add-int/lit8 v0, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-lez v2, :cond_1

    .line 23
    .line 24
    add-int/lit8 p1, v1, -0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    not-int p0, v0

    .line 29
    return p0
.end method

.method public static l(Lwa0;)Lwa0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwa0;->f()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lwa0;->f:Z

    .line 6
    .line 7
    iget v0, p0, Lwa0;->e:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lwa0;->g:Lwa0;

    .line 13
    .line 14
    return-object p0
.end method

.method public static m(Ljava/lang/Class;)Lqc1;
    .locals 4

    .line 1
    const-string v0, "Cannot create an instance of "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2

    .line 8
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v2, Lqc1;
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    return-object v2

    .line 28
    :catch_0
    move-exception v2

    .line 29
    goto :goto_0

    .line 30
    :catch_1
    move-exception v2

    .line 31
    goto :goto_1

    .line 32
    :goto_0
    invoke-static {v0, p0, v2}, Lxc;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :goto_1
    invoke-static {v0, p0, v2}, Lxc;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :catch_2
    move-exception v2

    .line 59
    invoke-static {v0, p0, v2}, Lxc;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method public static n(IIII)J
    .locals 4

    .line 1
    const v0, 0x3fffe

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const v1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    if-ne p3, v1, :cond_0

    .line 12
    .line 13
    move p3, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    :goto_0
    if-ne p3, v1, :cond_1

    .line 20
    .line 21
    move v2, p2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, p3

    .line 24
    :goto_1
    const/16 v3, 0x1fff

    .line 25
    .line 26
    if-ge v2, v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const/16 v0, 0x7fff

    .line 30
    .line 31
    if-ge v2, v0, :cond_3

    .line 32
    .line 33
    const v0, 0xfffe

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    const v0, 0xffff

    .line 38
    .line 39
    .line 40
    if-ge v2, v0, :cond_4

    .line 41
    .line 42
    const/16 v0, 0x7ffe

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const v0, 0x3ffff

    .line 46
    .line 47
    .line 48
    if-ge v2, v0, :cond_6

    .line 49
    .line 50
    const/16 v0, 0x1ffe

    .line 51
    .line 52
    :goto_2
    if-ne p1, v1, :cond_5

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_5
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :goto_3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {p0, v1, p2, p3}, Lqj;->a(IIII)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    return-wide p0

    .line 68
    :cond_6
    invoke-static {v2}, Lqj;->j(I)Ljava/lang/Void;

    .line 69
    .line 70
    .line 71
    new-instance p0, Lsg;

    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p0
.end method

.method public static o(IIII)J
    .locals 4

    .line 1
    const v0, 0x3fffe

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const v1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    move p1, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    :goto_0
    if-ne p1, v1, :cond_1

    .line 20
    .line 21
    move v2, p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, p1

    .line 24
    :goto_1
    const/16 v3, 0x1fff

    .line 25
    .line 26
    if-ge v2, v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const/16 v0, 0x7fff

    .line 30
    .line 31
    if-ge v2, v0, :cond_3

    .line 32
    .line 33
    const v0, 0xfffe

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    const v0, 0xffff

    .line 38
    .line 39
    .line 40
    if-ge v2, v0, :cond_4

    .line 41
    .line 42
    const/16 v0, 0x7ffe

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const v0, 0x3ffff

    .line 46
    .line 47
    .line 48
    if-ge v2, v0, :cond_6

    .line 49
    .line 50
    const/16 v0, 0x1ffe

    .line 51
    .line 52
    :goto_2
    if-ne p3, v1, :cond_5

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_5
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :goto_3
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {p0, p1, p2, v1}, Lqj;->a(IIII)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    return-wide p0

    .line 68
    :cond_6
    invoke-static {v2}, Lqj;->j(I)Ljava/lang/Void;

    .line 69
    .line 70
    .line 71
    new-instance p0, Lsg;

    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p0
.end method

.method public static final p(Lji;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lpi;

    .line 5
    .line 6
    iget-wide v0, p0, Lpi;->T:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public static q(Ljava/util/Collection;)Lz20;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz20;

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr p0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v2, p0, v1}, Lx20;-><init>(III)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static r(Ljava/util/List;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    add-int/lit8 p0, p0, -0x1

    .line 9
    .line 10
    return p0
.end method

.method public static s(Landroid/view/Display;I)Lcw0;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_3

    .line 7
    .line 8
    invoke-static {p0, p1}, Lf3;->i(Landroid/view/Display;I)Landroid/view/RoundedCorner;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    new-instance p1, Lcw0;

    .line 15
    .line 16
    invoke-static {p0}, Lf3;->c(Landroid/view/RoundedCorner;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "Invalid position: "

    .line 33
    .line 34
    invoke-static {p0, v0}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    :cond_2
    :goto_0
    invoke-static {p0}, Lf3;->A(Landroid/view/RoundedCorner;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p0}, Lf3;->d(Landroid/view/RoundedCorner;)Landroid/graphics/Point;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p1, v1, v0, p0}, Lcw0;-><init>(IILandroid/graphics/Point;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_3
    return-object v2
.end method

.method public static final t(Lpk;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Ln2;->x:Ln2;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lpk;->l(Lok;)Lnk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsk;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p0, p1}, Lsk;->n(Lpk;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p0, p1}, Lkl;->q(Lpk;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1}, Lkl;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, v1

    .line 35
    :goto_1
    invoke-static {p0, p1}, Lkl;->q(Lpk;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final u(Le9;Ljava/lang/Object;I)I
    .locals 4

    .line 1
    iget v0, p0, Le9;->f:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    :try_start_0
    iget-object v1, p0, Le9;->d:[I

    .line 8
    .line 9
    invoke-static {v1, v0, p2}, Lo30;->j([III)I

    .line 10
    .line 11
    .line 12
    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    if-gez v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v2, p0, Le9;->e:[Ljava/lang/Object;

    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    invoke-static {p1, v2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    :goto_0
    return v1

    .line 27
    :cond_2
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    :goto_1
    if-ge v2, v0, :cond_4

    .line 30
    .line 31
    iget-object v3, p0, Le9;->d:[I

    .line 32
    .line 33
    aget v3, v3, v2

    .line 34
    .line 35
    if-ne v3, p2, :cond_4

    .line 36
    .line 37
    iget-object v3, p0, Le9;->e:[Ljava/lang/Object;

    .line 38
    .line 39
    aget-object v3, v3, v2

    .line 40
    .line 41
    invoke-static {p1, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    return v2

    .line 48
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    :goto_2
    if-ltz v1, :cond_6

    .line 54
    .line 55
    iget-object v0, p0, Le9;->d:[I

    .line 56
    .line 57
    aget v0, v0, v1

    .line 58
    .line 59
    if-ne v0, p2, :cond_6

    .line 60
    .line 61
    iget-object v0, p0, Le9;->e:[Ljava/lang/Object;

    .line 62
    .line 63
    aget-object v0, v0, v1

    .line 64
    .line 65
    invoke-static {p1, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    return v1

    .line 72
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_6
    not-int p0, v2

    .line 76
    return p0

    .line 77
    :catch_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw p0
.end method

.method public static v(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static varargs w([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lhs;->d:Lhs;

    .line 13
    .line 14
    return-object p0
.end method

.method public static x(Landroid/content/res/Resources;I)Ljava/util/List;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_3

    .line 24
    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getType(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-ne v3, v4, :cond_4

    .line 36
    .line 37
    move p1, v2

    .line 38
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge p1, v3, :cond_6

    .line 43
    .line 44
    invoke-virtual {v0, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    array-length v5, v3

    .line 60
    move v6, v2

    .line 61
    :goto_1
    if-ge v6, v5, :cond_2

    .line 62
    .line 63
    aget-object v7, v3, v6

    .line 64
    .line 65
    invoke-static {v7, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    array-length v3, p0

    .line 91
    move v4, v2

    .line 92
    :goto_2
    if-ge v4, v3, :cond_5

    .line 93
    .line 94
    aget-object v5, p0, v4

    .line 95
    .line 96
    invoke-static {v5, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :goto_3
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 114
    .line 115
    .line 116
    throw p0
.end method

.method public static final y(Lji;)Lni;
    .locals 8

    .line 1
    move-object v1, p0

    .line 2
    check-cast v1, Lpi;

    .line 3
    .line 4
    const/16 p0, 0xce

    .line 5
    .line 6
    sget-object v0, Lqi;->e:Lil0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, Lpi;->U(ILil0;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p0, v1, Lpi;->S:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, v1, Lpi;->I:Lz11;

    .line 16
    .line 17
    invoke-static {p0}, Lz11;->z(Lz11;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v1}, Lpi;->D()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    instance-of v0, p0, Lku0;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p0, Lku0;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    :goto_0
    if-nez p0, :cond_2

    .line 33
    .line 34
    new-instance p0, Lhv0;

    .line 35
    .line 36
    new-instance v7, Lmi;

    .line 37
    .line 38
    new-instance v0, Lni;

    .line 39
    .line 40
    iget-wide v2, v1, Lpi;->T:J

    .line 41
    .line 42
    iget-boolean v4, v1, Lpi;->q:Z

    .line 43
    .line 44
    iget-boolean v5, v1, Lpi;->C:Z

    .line 45
    .line 46
    iget-object v6, v1, Lpi;->h:Lyi;

    .line 47
    .line 48
    iget-object v6, v6, Lyi;->w:Lx1;

    .line 49
    .line 50
    invoke-direct/range {v0 .. v6}, Lni;-><init>(Lpi;JZZLx1;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v7, v0}, Lmi;-><init>(Lni;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, -0x1

    .line 57
    invoke-direct {p0, v7, v0}, Lku0;-><init>(Lju0;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p0}, Lpi;->h0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-object p0, p0, Lku0;->a:Lju0;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    check-cast p0, Lmi;

    .line 69
    .line 70
    iget-object p0, p0, Lmi;->d:Lni;

    .line 71
    .line 72
    invoke-virtual {v1}, Lpi;->l()Lfq0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v2, p0, Lni;->f:Lgp0;

    .line 77
    .line 78
    invoke-virtual {v2, v0}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-virtual {v1, v0}, Lpi;->p(Z)V

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method public static final z(Lb91;Lsw;Ljava/lang/Object;Lji;)Lms;
    .locals 6

    .line 1
    check-cast p3, Lpi;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const v1, -0x192ea2d9

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p3, v1, v2, p0, v0}, Lpi;->S(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lb91;->g()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v1, Lms;->d:Lms;

    .line 16
    .line 17
    sget-object v3, Lms;->f:Lms;

    .line 18
    .line 19
    sget-object v4, Lms;->e:Lms;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const v0, -0xca56761

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, v0}, Lpi;->W(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, v2}, Lpi;->p(Z)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, p2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    move-object v1, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {p0}, Lb91;->c()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_6

    .line 61
    .line 62
    move-object v1, v3

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const v0, -0xca1388c

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3, v0}, Lpi;->W(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Lpi;->L()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v5, Lii;->a:Lr3;

    .line 75
    .line 76
    if-ne v0, v5, :cond_2

    .line 77
    .line 78
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p3, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    check-cast v0, Loh0;

    .line 88
    .line 89
    invoke-virtual {p0}, Lb91;->c()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_3

    .line 104
    .line 105
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-interface {v0, p0}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-interface {p1, p2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_4

    .line 121
    .line 122
    move-object v1, v4

    .line 123
    goto :goto_0

    .line 124
    :cond_4
    invoke-interface {v0}, Lw31;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_5

    .line 135
    .line 136
    move-object v1, v3

    .line 137
    :cond_5
    :goto_0
    invoke-virtual {p3, v2}, Lpi;->p(Z)V

    .line 138
    .line 139
    .line 140
    :cond_6
    :goto_1
    invoke-virtual {p3, v2}, Lpi;->p(Z)V

    .line 141
    .line 142
    .line 143
    return-object v1
.end method
