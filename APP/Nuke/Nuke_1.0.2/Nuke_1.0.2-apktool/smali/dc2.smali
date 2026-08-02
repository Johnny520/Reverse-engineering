.class public final Ldc2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lcc2;


# static fields
.field public static final l:Ldq1;


# instance fields
.field public final h:Ljava/util/Map;

.field public final i:Lrk1;

.field public j:Lfc2;

.field public final k:Lv;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Leg1;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1}, Leg1;-><init>(BI)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Leq1;

    .line 10
    .line 11
    const/16 v2, 0x14

    .line 12
    .line 13
    invoke-direct {v1, v2}, Leq1;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ldq1;

    .line 17
    .line 18
    const/16 v3, 0xa

    .line 19
    .line 20
    invoke-direct {v2, v3, v0, v1}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Ldc2;->l:Ldq1;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldc2;->h:Ljava/util/Map;

    .line 5
    .line 6
    sget-object p1, Led2;->a:[J

    .line 7
    .line 8
    new-instance p1, Lrk1;

    .line 9
    .line 10
    invoke-direct {p1}, Lrk1;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldc2;->i:Lrk1;

    .line 14
    .line 15
    new-instance p1, Lv;

    .line 16
    .line 17
    const/16 v0, 0x19

    .line 18
    .line 19
    invoke-direct {p1, v0, p0}, Lv;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldc2;->k:Lv;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lkw;Lpx;I)V
    .locals 7

    .line 1
    check-cast p3, Lgo0;

    .line 2
    .line 3
    const v0, 0x1fcd8740

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p4, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int/2addr v0, p4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p4

    .line 25
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p3, p2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 42
    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    invoke-virtual {p3, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    const/16 v1, 0x100

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v1, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v1

    .line 57
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 58
    .line 59
    const/16 v2, 0x92

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    if-eq v1, v2, :cond_6

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    goto :goto_4

    .line 66
    :cond_6
    move v1, v3

    .line 67
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 68
    .line 69
    invoke-virtual {p3, v2, v1}, Lgo0;->O(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_c

    .line 74
    .line 75
    invoke-virtual {p3, p1}, Lgo0;->Y(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Lgo0;->L()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v2, Lnx;->a:Leb;

    .line 83
    .line 84
    if-ne v1, v2, :cond_8

    .line 85
    .line 86
    iget-object v1, p0, Ldc2;->k:Lv;

    .line 87
    .line 88
    invoke-virtual {v1, p1}, Lv;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_7

    .line 99
    .line 100
    new-instance v4, Lic2;

    .line 101
    .line 102
    iget-object v5, p0, Ldc2;->h:Ljava/util/Map;

    .line 103
    .line 104
    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, Ljava/util/Map;

    .line 109
    .line 110
    sget-object v6, Lhc2;->a:Ltu2;

    .line 111
    .line 112
    new-instance v6, Lgc2;

    .line 113
    .line 114
    invoke-direct {v6, v5, v1}, Lgc2;-><init>(Ljava/util/Map;Lin0;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v4, v6}, Lic2;-><init>(Lgc2;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    move-object v1, v4

    .line 124
    goto :goto_5

    .line 125
    :cond_7
    const-string p0, "Type of the key "

    .line 126
    .line 127
    const-string p2, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    .line 128
    .line 129
    invoke-static {p0, p1, p2}, Lc80;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_8
    :goto_5
    check-cast v1, Lic2;

    .line 134
    .line 135
    sget-object v4, Lhc2;->a:Ltu2;

    .line 136
    .line 137
    invoke-virtual {v4, v1}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    sget-object v5, Lfc1;->a:Le42;

    .line 142
    .line 143
    invoke-virtual {v5, v1}, Le42;->a(Ljava/lang/Object;)Lf42;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    filled-new-array {v4, v5}, [Lf42;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    and-int/lit8 v0, v0, 0x70

    .line 152
    .line 153
    const/16 v5, 0x8

    .line 154
    .line 155
    or-int/2addr v0, v5

    .line 156
    invoke-static {v4, p2, p3, v0}, Lci0;->b([Lf42;Lmn0;Lpx;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {p3, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    or-int/2addr v0, v4

    .line 168
    invoke-virtual {p3, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    or-int/2addr v0, v4

    .line 173
    invoke-virtual {p3}, Lgo0;->L()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    if-nez v0, :cond_9

    .line 178
    .line 179
    if-ne v4, v2, :cond_a

    .line 180
    .line 181
    :cond_9
    new-instance v4, Lm0;

    .line 182
    .line 183
    const/16 v0, 0xa

    .line 184
    .line 185
    invoke-direct {v4, p0, p1, v1, v0}, Lm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p3, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_a
    check-cast v4, Lin0;

    .line 192
    .line 193
    sget-object v0, La83;->a:La83;

    .line 194
    .line 195
    invoke-static {v0, v4, p3}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 196
    .line 197
    .line 198
    iget-boolean v0, p3, Lgo0;->y:Z

    .line 199
    .line 200
    if-eqz v0, :cond_b

    .line 201
    .line 202
    iget-object v0, p3, Lgo0;->G:Lpr2;

    .line 203
    .line 204
    iget v0, v0, Lpr2;->i:I

    .line 205
    .line 206
    iget v1, p3, Lgo0;->z:I

    .line 207
    .line 208
    if-ne v0, v1, :cond_b

    .line 209
    .line 210
    const/4 v0, -0x1

    .line 211
    iput v0, p3, Lgo0;->z:I

    .line 212
    .line 213
    iput-boolean v3, p3, Lgo0;->y:Z

    .line 214
    .line 215
    :cond_b
    invoke-virtual {p3, v3}, Lgo0;->p(Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_c
    invoke-virtual {p3}, Lgo0;->R()V

    .line 220
    .line 221
    .line 222
    :goto_6
    invoke-virtual {p3}, Lgo0;->r()Lb62;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    if-eqz p3, :cond_d

    .line 227
    .line 228
    new-instance v0, Lva;

    .line 229
    .line 230
    const/16 v5, 0xc

    .line 231
    .line 232
    move-object v1, p0

    .line 233
    move-object v2, p1

    .line 234
    move-object v3, p2

    .line 235
    move v4, p4

    .line 236
    invoke-direct/range {v0 .. v5}, Lva;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lun0;II)V

    .line 237
    .line 238
    .line 239
    iput-object v0, p3, Lb62;->d:Lmn0;

    .line 240
    .line 241
    :cond_d
    return-void
.end method
