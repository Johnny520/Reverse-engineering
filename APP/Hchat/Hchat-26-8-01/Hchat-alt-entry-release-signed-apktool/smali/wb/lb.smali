.class public final synthetic Lwb/lb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/lb;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/lb;->h:Lsh/x;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/lb;->i:Lr/z;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/lb;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/lb;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/lb;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/lb;->g:I

    .line 2
    .line 3
    check-cast p1, Lp/x0;

    .line 4
    .line 5
    move-object v9, p2

    .line 6
    check-cast v9, Li0/h0;

    .line 7
    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    and-int/lit8 p3, p2, 0x6

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    const/4 p3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p3, 0x2

    .line 33
    :goto_0
    or-int/2addr p2, p3

    .line 34
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 35
    .line 36
    const/16 v0, 0x12

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    if-eq p3, v0, :cond_2

    .line 40
    .line 41
    move p3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 p3, 0x0

    .line 44
    :goto_1
    and-int/2addr p2, v1

    .line 45
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_4

    .line 50
    .line 51
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 52
    .line 53
    iget-object p3, p0, Lwb/lb;->h:Lsh/x;

    .line 54
    .line 55
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {p1}, Lp/x0;->c()F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/16 p3, 0x8

    .line 67
    .line 68
    int-to-float p3, p3

    .line 69
    add-float/2addr p2, p3

    .line 70
    invoke-interface {p1}, Lp/x0;->a()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    const/16 p3, 0x54

    .line 75
    .line 76
    int-to-float p3, p3

    .line 77
    add-float/2addr p1, p3

    .line 78
    const/4 p3, 0x5

    .line 79
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object p2, Li0/l;->a:Li0/e;

    .line 88
    .line 89
    if-ne p1, p2, :cond_3

    .line 90
    .line 91
    new-instance p1, Lwb/ad;

    .line 92
    .line 93
    const/4 p2, 0x7

    .line 94
    iget-object p3, p0, Lwb/lb;->j:Li0/a1;

    .line 95
    .line 96
    iget-object v1, p0, Lwb/lb;->k:Li0/a1;

    .line 97
    .line 98
    iget-object v3, p0, Lwb/lb;->l:Li0/a1;

    .line 99
    .line 100
    invoke-direct {p1, p3, v1, v3, p2}, Lwb/ad;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    move-object v8, p1

    .line 107
    check-cast v8, Lfg/l;

    .line 108
    .line 109
    const/high16 v10, 0x30000000

    .line 110
    .line 111
    const/16 v11, 0x1f8

    .line 112
    .line 113
    iget-object v1, p0, Lwb/lb;->i:Lr/z;

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    const/4 v4, 0x0

    .line 117
    const/4 v5, 0x0

    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v7, 0x0

    .line 120
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 125
    .line 126
    .line 127
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 128
    .line 129
    return-object p1

    .line 130
    :pswitch_0
    if-nez p3, :cond_6

    .line 131
    .line 132
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    if-eqz p3, :cond_5

    .line 137
    .line 138
    const/4 p3, 0x4

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    const/4 p3, 0x2

    .line 141
    :goto_3
    or-int/2addr p2, p3

    .line 142
    :cond_6
    and-int/lit8 p3, p2, 0x13

    .line 143
    .line 144
    const/16 v0, 0x12

    .line 145
    .line 146
    const/4 v1, 0x1

    .line 147
    if-eq p3, v0, :cond_7

    .line 148
    .line 149
    move p3, v1

    .line 150
    goto :goto_4

    .line 151
    :cond_7
    const/4 p3, 0x0

    .line 152
    :goto_4
    and-int/2addr p2, v1

    .line 153
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-eqz p2, :cond_9

    .line 158
    .line 159
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 160
    .line 161
    iget-object p3, p0, Lwb/lb;->h:Lsh/x;

    .line 162
    .line 163
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-interface {p1}, Lp/x0;->c()F

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    const/16 p3, 0x8

    .line 175
    .line 176
    int-to-float p3, p3

    .line 177
    add-float/2addr p2, p3

    .line 178
    invoke-interface {p1}, Lp/x0;->a()F

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    const/16 p3, 0x54

    .line 183
    .line 184
    int-to-float p3, p3

    .line 185
    add-float/2addr p1, p3

    .line 186
    const/4 p3, 0x5

    .line 187
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    sget-object p2, Li0/l;->a:Li0/e;

    .line 196
    .line 197
    if-ne p1, p2, :cond_8

    .line 198
    .line 199
    new-instance p1, Lwb/ad;

    .line 200
    .line 201
    const/4 p2, 0x0

    .line 202
    iget-object p3, p0, Lwb/lb;->j:Li0/a1;

    .line 203
    .line 204
    iget-object v1, p0, Lwb/lb;->k:Li0/a1;

    .line 205
    .line 206
    iget-object v3, p0, Lwb/lb;->l:Li0/a1;

    .line 207
    .line 208
    invoke-direct {p1, p3, v1, v3, p2}, Lwb/ad;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_8
    move-object v8, p1

    .line 215
    check-cast v8, Lfg/l;

    .line 216
    .line 217
    const/high16 v10, 0x30000000

    .line 218
    .line 219
    const/16 v11, 0x1f8

    .line 220
    .line 221
    iget-object v1, p0, Lwb/lb;->i:Lr/z;

    .line 222
    .line 223
    const/4 v3, 0x0

    .line 224
    const/4 v4, 0x0

    .line 225
    const/4 v5, 0x0

    .line 226
    const/4 v6, 0x0

    .line 227
    const/4 v7, 0x0

    .line 228
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_9
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 233
    .line 234
    .line 235
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 236
    .line 237
    return-object p1

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
