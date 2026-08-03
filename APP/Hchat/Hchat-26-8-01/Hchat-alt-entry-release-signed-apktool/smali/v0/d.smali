.class public final Lv0/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv0/c;


# static fields
.field public static final k:Lp4/t;


# instance fields
.field public final g:Ljava/util/Map;

.field public final h:Lf/k0;

.field public i:Lv0/f;

.field public final j:Lnb/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Li2/y;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lr9/p;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lr9/p;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lp4/t;

    .line 16
    .line 17
    const/16 v3, 0xc

    .line 18
    .line 19
    invoke-direct {v2, v0, v3, v1}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lv0/d;->k:Lp4/t;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/d;->g:Ljava/util/Map;

    .line 5
    .line 6
    sget-object p1, Lf/r0;->a:[J

    .line 7
    .line 8
    new-instance p1, Lf/k0;

    .line 9
    .line 10
    invoke-direct {p1}, Lf/k0;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lv0/d;->h:Lf/k0;

    .line 14
    .line 15
    new-instance p1, Lnb/a;

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    invoke-direct {p1, p0, v0}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lv0/d;->j:Lnb/a;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ls0/d;Li0/h0;I)V
    .locals 7

    .line 1
    const v0, 0x1fcd8740

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p4

    .line 23
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p3, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const/16 v1, 0x100

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    const/16 v1, 0x80

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 56
    .line 57
    const/16 v2, 0x92

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    if-eq v1, v2, :cond_6

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    goto :goto_4

    .line 64
    :cond_6
    move v1, v3

    .line 65
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 66
    .line 67
    invoke-virtual {p3, v2, v1}, Li0/h0;->S(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_c

    .line 72
    .line 73
    invoke-virtual {p3, p1}, Li0/h0;->c0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v2, Li0/l;->a:Li0/e;

    .line 81
    .line 82
    if-ne v1, v2, :cond_8

    .line 83
    .line 84
    iget-object v1, p0, Lv0/d;->j:Lnb/a;

    .line 85
    .line 86
    invoke-virtual {v1, p1}, Lnb/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_7

    .line 97
    .line 98
    new-instance v4, Lv0/i;

    .line 99
    .line 100
    iget-object v5, p0, Lv0/d;->g:Ljava/util/Map;

    .line 101
    .line 102
    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Ljava/util/Map;

    .line 107
    .line 108
    sget-object v6, Lv0/h;->a:Li0/m2;

    .line 109
    .line 110
    new-instance v6, Lv0/g;

    .line 111
    .line 112
    invoke-direct {v6, v5, v1}, Lv0/g;-><init>(Ljava/util/Map;Lfg/l;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v4, v6}, Lv0/i;-><init>(Lv0/g;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object v1, v4

    .line 122
    goto :goto_5

    .line 123
    :cond_7
    const-string p2, "Type of the key "

    .line 124
    .line 125
    const-string p3, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    .line 126
    .line 127
    invoke-static {p1, p2, p3}, Lokio/a;->h(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_8
    :goto_5
    check-cast v1, Lv0/i;

    .line 132
    .line 133
    sget-object v4, Lv0/h;->a:Li0/m2;

    .line 134
    .line 135
    invoke-virtual {v4, v1}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    sget-object v5, Lv3/a;->a:Li0/p1;

    .line 140
    .line 141
    invoke-virtual {v5, v1}, Li0/p1;->a(Ljava/lang/Object;)Li0/q1;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    filled-new-array {v4, v5}, [Li0/q1;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    and-int/lit8 v0, v0, 0x70

    .line 150
    .line 151
    const/16 v5, 0x8

    .line 152
    .line 153
    or-int/2addr v0, v5

    .line 154
    invoke-static {v4, p2, p3, v0}, Li0/r;->b([Li0/q1;Lfg/p;Li0/h0;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p3, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-virtual {p3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    or-int/2addr v0, v4

    .line 166
    invoke-virtual {p3, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    or-int/2addr v0, v4

    .line 171
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-nez v0, :cond_9

    .line 176
    .line 177
    if-ne v4, v2, :cond_a

    .line 178
    .line 179
    :cond_9
    new-instance v4, Lb0/s;

    .line 180
    .line 181
    const/16 v0, 0x13

    .line 182
    .line 183
    invoke-direct {v4, p0, p1, v1, v0}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_a
    check-cast v4, Lfg/l;

    .line 190
    .line 191
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 192
    .line 193
    invoke-static {v0, v4, p3}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 194
    .line 195
    .line 196
    iget-boolean v0, p3, Li0/h0;->y:Z

    .line 197
    .line 198
    if-eqz v0, :cond_b

    .line 199
    .line 200
    iget-object v0, p3, Li0/h0;->G:Ll0/g;

    .line 201
    .line 202
    iget v0, v0, Ll0/g;->i:I

    .line 203
    .line 204
    iget v1, p3, Li0/h0;->z:I

    .line 205
    .line 206
    if-ne v0, v1, :cond_b

    .line 207
    .line 208
    const/4 v0, -0x1

    .line 209
    iput v0, p3, Li0/h0;->z:I

    .line 210
    .line 211
    iput-boolean v3, p3, Li0/h0;->y:Z

    .line 212
    .line 213
    :cond_b
    invoke-virtual {p3, v3}, Li0/h0;->p(Z)V

    .line 214
    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_c
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 218
    .line 219
    .line 220
    :goto_6
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 221
    .line 222
    .line 223
    move-result-object p3

    .line 224
    if-eqz p3, :cond_d

    .line 225
    .line 226
    new-instance v0, Lb0/r;

    .line 227
    .line 228
    const/16 v5, 0x9

    .line 229
    .line 230
    move-object v1, p0

    .line 231
    move-object v2, p1

    .line 232
    move-object v3, p2

    .line 233
    move v4, p4

    .line 234
    invoke-direct/range {v0 .. v5}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 235
    .line 236
    .line 237
    iput-object v0, p3, Li0/r1;->d:Lfg/p;

    .line 238
    .line 239
    :cond_d
    return-void
.end method
