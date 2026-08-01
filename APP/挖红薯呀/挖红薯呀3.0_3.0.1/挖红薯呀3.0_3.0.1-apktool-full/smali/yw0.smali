.class public final Lyw0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww0;


# static fields
.field public static final h:Ld;


# instance fields
.field public final d:Ljava/util/Map;

.field public final e:Ljh0;

.field public f:Lzw0;

.field public final g:Lo;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ls8;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ls8;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lpg0;

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-direct {v1, v2}, Lpg0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ld;

    .line 15
    .line 16
    const/16 v3, 0x13

    .line 17
    .line 18
    invoke-direct {v2, v3, v0, v1}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Lyw0;->h:Ld;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyw0;->d:Ljava/util/Map;

    .line 5
    .line 6
    sget-object p1, Ldy0;->a:[J

    .line 7
    .line 8
    new-instance p1, Ljh0;

    .line 9
    .line 10
    invoke-direct {p1}, Ljh0;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lyw0;->e:Ljh0;

    .line 14
    .line 15
    new-instance p1, Lo;

    .line 16
    .line 17
    const/16 v0, 0x12

    .line 18
    .line 19
    invoke-direct {p1, v0, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lyw0;->g:Lo;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lmh;Lji;I)V
    .locals 8

    .line 1
    check-cast p3, Lpi;

    .line 2
    .line 3
    const v0, 0x1fcd8740

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v0}, Lpi;->X(I)Lpi;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p4, 0x6

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p3, p1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move v0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x2

    .line 23
    :goto_0
    or-int/2addr v0, p4

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p4

    .line 26
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 27
    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p3, p2}, Lpi;->h(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    const/16 v2, 0x20

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v2, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v2

    .line 42
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 43
    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    invoke-virtual {p3, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    const/16 v2, 0x100

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    const/16 v2, 0x80

    .line 56
    .line 57
    :goto_3
    or-int/2addr v0, v2

    .line 58
    :cond_5
    and-int/lit16 v2, v0, 0x93

    .line 59
    .line 60
    const/16 v3, 0x92

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    if-eq v2, v3, :cond_6

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    goto :goto_4

    .line 67
    :cond_6
    move v2, v4

    .line 68
    :goto_4
    and-int/lit8 v3, v0, 0x1

    .line 69
    .line 70
    invoke-virtual {p3, v3, v2}, Lpi;->O(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_c

    .line 75
    .line 76
    invoke-virtual {p3, p1}, Lpi;->Y(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3}, Lpi;->L()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sget-object v3, Lii;->a:Lr3;

    .line 84
    .line 85
    if-ne v2, v3, :cond_8

    .line 86
    .line 87
    iget-object v2, p0, Lyw0;->g:Lo;

    .line 88
    .line 89
    invoke-virtual {v2, p1}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_7

    .line 100
    .line 101
    new-instance v5, Lcx0;

    .line 102
    .line 103
    iget-object v6, p0, Lyw0;->d:Ljava/util/Map;

    .line 104
    .line 105
    invoke-interface {v6, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, Ljava/util/Map;

    .line 110
    .line 111
    sget-object v7, Lbx0;->a:Lg41;

    .line 112
    .line 113
    new-instance v7, Lax0;

    .line 114
    .line 115
    invoke-direct {v7, v6, v2}, Lax0;-><init>(Ljava/util/Map;Lsw;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v5, v7}, Lcx0;-><init>(Lax0;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v2, v5

    .line 125
    goto :goto_5

    .line 126
    :cond_7
    const-string p0, "Type of the key "

    .line 127
    .line 128
    const-string p2, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    .line 129
    .line 130
    invoke-static {p0, p1, p2}, Lxc;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_8
    :goto_5
    check-cast v2, Lcx0;

    .line 135
    .line 136
    sget-object v5, Lbx0;->a:Lg41;

    .line 137
    .line 138
    invoke-virtual {v5, v2}, Lg41;->a(Ljava/lang/Object;)Lct0;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    sget-object v6, Ldb0;->a:Lat0;

    .line 143
    .line 144
    invoke-virtual {v6, v2}, Lat0;->a(Ljava/lang/Object;)Lct0;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    filled-new-array {v5, v6}, [Lct0;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    and-int/lit8 v0, v0, 0x70

    .line 153
    .line 154
    const/16 v6, 0x8

    .line 155
    .line 156
    or-int/2addr v0, v6

    .line 157
    invoke-static {v5, p2, p3, v0}, Li4;->c([Lct0;Lww;Lji;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p3, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-virtual {p3, p1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    or-int/2addr v0, v5

    .line 169
    invoke-virtual {p3, v2}, Lpi;->h(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    or-int/2addr v0, v5

    .line 174
    invoke-virtual {p3}, Lpi;->L()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    if-nez v0, :cond_9

    .line 179
    .line 180
    if-ne v5, v3, :cond_a

    .line 181
    .line 182
    :cond_9
    new-instance v5, Lzj;

    .line 183
    .line 184
    invoke-direct {v5, p0, p1, v2, v1}, Lzj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    check-cast v5, Lsw;

    .line 191
    .line 192
    sget-object v0, Lna1;->a:Lna1;

    .line 193
    .line 194
    invoke-static {v0, v5, p3}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 195
    .line 196
    .line 197
    iget-boolean v0, p3, Lpi;->y:Z

    .line 198
    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    iget-object v0, p3, Lpi;->G:Lv11;

    .line 202
    .line 203
    iget v0, v0, Lv11;->i:I

    .line 204
    .line 205
    iget v1, p3, Lpi;->z:I

    .line 206
    .line 207
    if-ne v0, v1, :cond_b

    .line 208
    .line 209
    const/4 v0, -0x1

    .line 210
    iput v0, p3, Lpi;->z:I

    .line 211
    .line 212
    iput-boolean v4, p3, Lpi;->y:Z

    .line 213
    .line 214
    :cond_b
    invoke-virtual {p3, v4}, Lpi;->p(Z)V

    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_c
    invoke-virtual {p3}, Lpi;->R()V

    .line 219
    .line 220
    .line 221
    :goto_6
    invoke-virtual {p3}, Lpi;->r()Lht0;

    .line 222
    .line 223
    .line 224
    move-result-object p3

    .line 225
    if-eqz p3, :cond_d

    .line 226
    .line 227
    new-instance v0, Lkh;

    .line 228
    .line 229
    const/4 v5, 0x3

    .line 230
    move-object v1, p0

    .line 231
    move-object v2, p1

    .line 232
    move-object v3, p2

    .line 233
    move v4, p4

    .line 234
    invoke-direct/range {v0 .. v5}, Lkh;-><init>(Lww0;Ljava/lang/Object;Lmh;II)V

    .line 235
    .line 236
    .line 237
    iput-object v0, p3, Lht0;->d:Lww;

    .line 238
    .line 239
    :cond_d
    return-void
.end method
