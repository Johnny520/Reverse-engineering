.class public final synthetic Lwb/u9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p8, p0, Lwb/u9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/u9;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/u9;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/u9;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/u9;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/u9;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/u9;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/u9;->n:Li0/a1;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/u9;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance v2, Lwb/td;

    .line 37
    .line 38
    const/4 v10, 0x3

    .line 39
    iget-object v3, p0, Lwb/u9;->h:Li0/a1;

    .line 40
    .line 41
    iget-object v4, p0, Lwb/u9;->i:Li0/a1;

    .line 42
    .line 43
    iget-object v5, p0, Lwb/u9;->j:Li0/a1;

    .line 44
    .line 45
    iget-object v6, p0, Lwb/u9;->k:Li0/a1;

    .line 46
    .line 47
    iget-object v7, p0, Lwb/u9;->l:Li0/a1;

    .line 48
    .line 49
    iget-object v8, p0, Lwb/u9;->m:Li0/a1;

    .line 50
    .line 51
    iget-object v9, p0, Lwb/u9;->n:Li0/a1;

    .line 52
    .line 53
    invoke-direct/range {v2 .. v10}, Lwb/td;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 54
    .line 55
    .line 56
    const p1, -0x221e22a8

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const/16 p3, 0x30

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_0
    const/16 v0, 0x10

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    if-eq p1, v0, :cond_2

    .line 80
    .line 81
    move p1, v1

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    const/4 p1, 0x0

    .line 84
    :goto_2
    and-int/2addr p3, v1

    .line 85
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    new-instance v2, Lwb/td;

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    iget-object v3, p0, Lwb/u9;->h:Li0/a1;

    .line 95
    .line 96
    iget-object v4, p0, Lwb/u9;->i:Li0/a1;

    .line 97
    .line 98
    iget-object v5, p0, Lwb/u9;->j:Li0/a1;

    .line 99
    .line 100
    iget-object v6, p0, Lwb/u9;->k:Li0/a1;

    .line 101
    .line 102
    iget-object v7, p0, Lwb/u9;->l:Li0/a1;

    .line 103
    .line 104
    iget-object v8, p0, Lwb/u9;->m:Li0/a1;

    .line 105
    .line 106
    iget-object v9, p0, Lwb/u9;->n:Li0/a1;

    .line 107
    .line 108
    invoke-direct/range {v2 .. v10}, Lwb/td;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 109
    .line 110
    .line 111
    const p1, 0x27ff5949

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const/16 p3, 0x30

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 126
    .line 127
    .line 128
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 129
    .line 130
    return-object p1

    .line 131
    :pswitch_1
    const/16 v0, 0x10

    .line 132
    .line 133
    const/4 v1, 0x1

    .line 134
    if-eq p1, v0, :cond_4

    .line 135
    .line 136
    move p1, v1

    .line 137
    goto :goto_4

    .line 138
    :cond_4
    const/4 p1, 0x0

    .line 139
    :goto_4
    and-int/2addr p3, v1

    .line 140
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_5

    .line 145
    .line 146
    new-instance v2, Lwb/td;

    .line 147
    .line 148
    const/4 v10, 0x2

    .line 149
    iget-object v3, p0, Lwb/u9;->h:Li0/a1;

    .line 150
    .line 151
    iget-object v4, p0, Lwb/u9;->i:Li0/a1;

    .line 152
    .line 153
    iget-object v5, p0, Lwb/u9;->j:Li0/a1;

    .line 154
    .line 155
    iget-object v6, p0, Lwb/u9;->k:Li0/a1;

    .line 156
    .line 157
    iget-object v7, p0, Lwb/u9;->l:Li0/a1;

    .line 158
    .line 159
    iget-object v8, p0, Lwb/u9;->m:Li0/a1;

    .line 160
    .line 161
    iget-object v9, p0, Lwb/u9;->n:Li0/a1;

    .line 162
    .line 163
    invoke-direct/range {v2 .. v10}, Lwb/td;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 164
    .line 165
    .line 166
    const p1, 0x6e479fae

    .line 167
    .line 168
    .line 169
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    const/16 p3, 0x30

    .line 174
    .line 175
    const/4 v0, 0x0

    .line 176
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 181
    .line 182
    .line 183
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 184
    .line 185
    return-object p1

    .line 186
    :pswitch_2
    const/16 v0, 0x10

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    if-eq p1, v0, :cond_6

    .line 190
    .line 191
    move p1, v1

    .line 192
    goto :goto_6

    .line 193
    :cond_6
    const/4 p1, 0x0

    .line 194
    :goto_6
    and-int/2addr p3, v1

    .line 195
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_7

    .line 200
    .line 201
    new-instance v2, Lwb/td;

    .line 202
    .line 203
    const/4 v10, 0x1

    .line 204
    iget-object v3, p0, Lwb/u9;->h:Li0/a1;

    .line 205
    .line 206
    iget-object v4, p0, Lwb/u9;->i:Li0/a1;

    .line 207
    .line 208
    iget-object v5, p0, Lwb/u9;->j:Li0/a1;

    .line 209
    .line 210
    iget-object v6, p0, Lwb/u9;->k:Li0/a1;

    .line 211
    .line 212
    iget-object v7, p0, Lwb/u9;->l:Li0/a1;

    .line 213
    .line 214
    iget-object v8, p0, Lwb/u9;->m:Li0/a1;

    .line 215
    .line 216
    iget-object v9, p0, Lwb/u9;->n:Li0/a1;

    .line 217
    .line 218
    invoke-direct/range {v2 .. v10}, Lwb/td;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 219
    .line 220
    .line 221
    const p1, -0x1fec1896

    .line 222
    .line 223
    .line 224
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    const/16 p3, 0x30

    .line 229
    .line 230
    const/4 v0, 0x0

    .line 231
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 232
    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 236
    .line 237
    .line 238
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 239
    .line 240
    return-object p1

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
