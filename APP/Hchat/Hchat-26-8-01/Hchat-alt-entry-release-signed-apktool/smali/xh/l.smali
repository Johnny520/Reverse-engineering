.class public final synthetic Lxh/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Ls0/d;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Ls0/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxh/l;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lxh/l;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lxh/l;->i:Ls0/d;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxh/l;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    sget-object p2, Lbi/g;->a:Li0/m2;

    .line 31
    .line 32
    iget-object v0, p0, Lxh/l;->h:Li0/a1;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    sget-object v1, Li0/l;->a:Li0/e;

    .line 45
    .line 46
    if-ne v2, v1, :cond_2

    .line 47
    .line 48
    :cond_1
    new-instance v2, Lwb/ht;

    .line 49
    .line 50
    const/16 v1, 0x9

    .line 51
    .line 52
    invoke-direct {v2, v0, v1}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    check-cast v2, Lfg/a;

    .line 59
    .line 60
    invoke-virtual {p2, v2}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-instance v0, Lbi/i;

    .line 65
    .line 66
    const/4 v1, 0x7

    .line 67
    iget-object v2, p0, Lxh/l;->i:Ls0/d;

    .line 68
    .line 69
    invoke-direct {v0, v2, v1}, Lbi/i;-><init>(Ls0/d;I)V

    .line 70
    .line 71
    .line 72
    const v1, -0x6265bb40

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v0, p1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const/16 v1, 0x38

    .line 80
    .line 81
    invoke-static {p2, v0, p1, v1}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 92
    .line 93
    const/4 v1, 0x2

    .line 94
    const/4 v2, 0x1

    .line 95
    if-eq v0, v1, :cond_4

    .line 96
    .line 97
    move v0, v2

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    const/4 v0, 0x0

    .line 100
    :goto_2
    and-int/2addr p2, v2

    .line 101
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_7

    .line 106
    .line 107
    sget-object p2, Lbi/g;->a:Li0/m2;

    .line 108
    .line 109
    iget-object v0, p0, Lxh/l;->h:Li0/a1;

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-nez v1, :cond_5

    .line 120
    .line 121
    sget-object v1, Li0/l;->a:Li0/e;

    .line 122
    .line 123
    if-ne v2, v1, :cond_6

    .line 124
    .line 125
    :cond_5
    new-instance v2, Lwb/ht;

    .line 126
    .line 127
    const/4 v1, 0x5

    .line 128
    invoke-direct {v2, v0, v1}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_6
    check-cast v2, Lfg/a;

    .line 135
    .line 136
    invoke-virtual {p2, v2}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    new-instance v0, Lbi/i;

    .line 141
    .line 142
    const/4 v1, 0x6

    .line 143
    iget-object v2, p0, Lxh/l;->i:Ls0/d;

    .line 144
    .line 145
    invoke-direct {v0, v2, v1}, Lbi/i;-><init>(Ls0/d;I)V

    .line 146
    .line 147
    .line 148
    const v1, 0x48a49e8c    # 337140.38f

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v0, p1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const/16 v1, 0x38

    .line 156
    .line 157
    invoke-static {p2, v0, p1, v1}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 162
    .line 163
    .line 164
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 165
    .line 166
    return-object p1

    .line 167
    :pswitch_1
    and-int/lit8 v0, p2, 0x3

    .line 168
    .line 169
    const/4 v1, 0x2

    .line 170
    const/4 v2, 0x1

    .line 171
    if-eq v0, v1, :cond_8

    .line 172
    .line 173
    move v0, v2

    .line 174
    goto :goto_4

    .line 175
    :cond_8
    const/4 v0, 0x0

    .line 176
    :goto_4
    and-int/2addr p2, v2

    .line 177
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_b

    .line 182
    .line 183
    sget-object p2, Lbi/g;->a:Li0/m2;

    .line 184
    .line 185
    iget-object v0, p0, Lxh/l;->h:Li0/a1;

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-nez v1, :cond_9

    .line 196
    .line 197
    sget-object v1, Li0/l;->a:Li0/e;

    .line 198
    .line 199
    if-ne v2, v1, :cond_a

    .line 200
    .line 201
    :cond_9
    new-instance v2, Lwb/ht;

    .line 202
    .line 203
    const/4 v1, 0x2

    .line 204
    invoke-direct {v2, v0, v1}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_a
    check-cast v2, Lfg/a;

    .line 211
    .line 212
    invoke-virtual {p2, v2}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    new-instance v0, Lbi/i;

    .line 217
    .line 218
    const/4 v1, 0x5

    .line 219
    iget-object v2, p0, Lxh/l;->i:Ls0/d;

    .line 220
    .line 221
    invoke-direct {v0, v2, v1}, Lbi/i;-><init>(Ls0/d;I)V

    .line 222
    .line 223
    .line 224
    const v1, 0x164657dc

    .line 225
    .line 226
    .line 227
    invoke-static {v1, v0, p1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const/16 v1, 0x38

    .line 232
    .line 233
    invoke-static {p2, v0, p1, v1}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 234
    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_b
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 238
    .line 239
    .line 240
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 241
    .line 242
    return-object p1

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
