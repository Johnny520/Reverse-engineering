.class public final Lh0/a1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:J

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh0/p;Ljava/lang/String;JLi2/m0;Lh0/d1;Lb5/k;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh0/a1;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lh0/a1;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lh0/a1;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, Lh0/a1;->j:J

    .line 9
    .line 10
    iput-object p5, p0, Lh0/a1;->m:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p6, p0, Lh0/a1;->n:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p7, p0, Lh0/a1;->o:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p8}, Lyf/i;-><init>(ILwf/c;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lm/g3;Lm/k;Lm/f;JLqg/r0;Lwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/a1;->h:I

    .line 21
    iput-object p1, p0, Lh0/a1;->l:Ljava/lang/Object;

    iput-object p2, p0, Lh0/a1;->m:Ljava/lang/Object;

    iput-object p3, p0, Lh0/a1;->n:Ljava/lang/Object;

    iput-wide p4, p0, Lh0/a1;->j:J

    iput-object p6, p0, Lh0/a1;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 11

    .line 1
    iget v0, p0, Lh0/a1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lh0/a1;

    .line 7
    .line 8
    iget-object v0, p0, Lh0/a1;->l:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Lm/g3;

    .line 12
    .line 13
    iget-object v0, p0, Lh0/a1;->m:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Lm/k;

    .line 17
    .line 18
    iget-object v0, p0, Lh0/a1;->n:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Lm/f;

    .line 22
    .line 23
    iget-object v0, p0, Lh0/a1;->o:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, v0

    .line 26
    check-cast v7, Lqg/r0;

    .line 27
    .line 28
    iget-wide v5, p0, Lh0/a1;->j:J

    .line 29
    .line 30
    move-object v8, p2

    .line 31
    invoke-direct/range {v1 .. v8}, Lh0/a1;-><init>(Lm/g3;Lm/k;Lm/f;JLqg/r0;Lwf/c;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v1, Lh0/a1;->k:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_0
    move-object v8, p2

    .line 38
    new-instance v2, Lh0/a1;

    .line 39
    .line 40
    iget-object p1, p0, Lh0/a1;->k:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v3, p1

    .line 43
    check-cast v3, Lh0/p;

    .line 44
    .line 45
    iget-object p1, p0, Lh0/a1;->l:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v4, p1

    .line 48
    check-cast v4, Ljava/lang/String;

    .line 49
    .line 50
    iget-object p1, p0, Lh0/a1;->m:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v7, p1

    .line 53
    check-cast v7, Li2/m0;

    .line 54
    .line 55
    iget-object p1, p0, Lh0/a1;->n:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lh0/d1;

    .line 58
    .line 59
    iget-object p2, p0, Lh0/a1;->o:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v9, p2

    .line 62
    check-cast v9, Lb5/k;

    .line 63
    .line 64
    iget-wide v5, p0, Lh0/a1;->j:J

    .line 65
    .line 66
    move-object v10, v8

    .line 67
    move-object v8, p1

    .line 68
    invoke-direct/range {v2 .. v10}, Lh0/a1;-><init>(Lh0/p;Ljava/lang/String;JLi2/m0;Lh0/d1;Lb5/k;Lwf/c;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh0/a1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lm/m2;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lh0/a1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lh0/a1;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lh0/a1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lqg/t;

    .line 24
    .line 25
    check-cast p2, Lwf/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lh0/a1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lh0/a1;

    .line 32
    .line 33
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lh0/a1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lh0/a1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh0/a1;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm/f;

    .line 9
    .line 10
    iget-object v1, p0, Lh0/a1;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lm/k;

    .line 13
    .line 14
    iget-object v2, p0, Lh0/a1;->l:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lm/g3;

    .line 17
    .line 18
    iget v3, p0, Lh0/a1;->i:I

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    if-ne v3, v4, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lh0/a1;->k:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lm/m2;

    .line 42
    .line 43
    iget-wide v5, p0, Lh0/a1;->j:J

    .line 44
    .line 45
    invoke-static {v1, v0, v5, v6}, Lm/k;->k1(Lm/k;Lm/f;J)F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iput v3, v2, Lm/g3;->e:F

    .line 50
    .line 51
    iget-object v3, p0, Lh0/a1;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Lqg/r0;

    .line 54
    .line 55
    new-instance v5, Lb0/s;

    .line 56
    .line 57
    invoke-direct {v5, v1, v2, v3, p1}, Lb0/s;-><init>(Lm/k;Lm/g3;Lqg/r0;Lm/m2;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lab/e;

    .line 61
    .line 62
    const/16 v3, 0x9

    .line 63
    .line 64
    invoke-direct {p1, v1, v2, v0, v3}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    iput v4, p0, Lh0/a1;->i:I

    .line 68
    .line 69
    invoke-virtual {v2, v5, p1, p0}, Lm/g3;->a(Lb0/s;Lab/e;Lyf/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 74
    .line 75
    if-ne p1, v0, :cond_2

    .line 76
    .line 77
    move-object p1, v0

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    :goto_1
    return-object p1

    .line 82
    :pswitch_0
    iget-object v0, p0, Lh0/a1;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lb5/k;

    .line 85
    .line 86
    iget-object v1, p0, Lh0/a1;->l:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v3, v1

    .line 89
    check-cast v3, Ljava/lang/String;

    .line 90
    .line 91
    iget-object v1, p0, Lh0/a1;->n:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Lh0/d1;

    .line 94
    .line 95
    iget v2, p0, Lh0/a1;->i:I

    .line 96
    .line 97
    const/4 v4, 0x1

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    if-ne v2, v4, :cond_3

    .line 101
    .line 102
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 107
    .line 108
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lh0/a1;->k:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v6, p1

    .line 120
    check-cast v6, Lh0/p;

    .line 121
    .line 122
    iput v4, p0, Lh0/a1;->i:I

    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    const/4 v8, 0x0

    .line 132
    if-nez p1, :cond_5

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    iget-wide v4, p0, Lh0/a1;->j:J

    .line 136
    .line 137
    invoke-static {v4, v5}, Li2/m0;->c(J)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    :goto_2
    move-object p1, v8

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    new-instance v2, Lh0/o;

    .line 146
    .line 147
    const/4 v7, 0x0

    .line 148
    invoke-direct/range {v2 .. v7}, Lh0/o;-><init>(Ljava/lang/CharSequence;JLh0/p;Lwf/c;)V

    .line 149
    .line 150
    .line 151
    iget-object p1, v6, Lh0/p;->a:Lwf/g;

    .line 152
    .line 153
    new-instance v4, Lci/e;

    .line 154
    .line 155
    invoke-direct {v4, v6, v2, v8}, Lci/e;-><init>(Lh0/p;Lfg/p;Lwf/c;)V

    .line 156
    .line 157
    .line 158
    invoke-static {p1, v4, p0}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    :goto_3
    sget-object v2, Lxf/a;->g:Lxf/a;

    .line 163
    .line 164
    if-ne p1, v2, :cond_8

    .line 165
    .line 166
    :cond_7
    :goto_4
    move-object p1, v2

    .line 167
    goto :goto_6

    .line 168
    :cond_8
    :goto_5
    check-cast p1, Li2/m0;

    .line 169
    .line 170
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 171
    .line 172
    if-eqz p1, :cond_7

    .line 173
    .line 174
    iget-wide v4, p1, Li2/m0;->a:J

    .line 175
    .line 176
    const/16 p1, 0x20

    .line 177
    .line 178
    shr-long v6, v4, p1

    .line 179
    .line 180
    long-to-int p1, v6

    .line 181
    invoke-virtual {v0, p1}, Lb5/k;->n(I)I

    .line 182
    .line 183
    .line 184
    const-wide v6, 0xffffffffL

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    and-long/2addr v4, v6

    .line 190
    long-to-int v4, v4

    .line 191
    invoke-virtual {v0, v4}, Lb5/k;->n(I)I

    .line 192
    .line 193
    .line 194
    invoke-static {p1, v4}, Li2/e0;->b(II)J

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    iget-object p1, p0, Lh0/a1;->m:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p1, Li2/m0;

    .line 201
    .line 202
    invoke-static {p1, v4, v5}, Li2/m0;->a(Ljava/lang/Object;J)Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-nez p1, :cond_7

    .line 207
    .line 208
    invoke-virtual {v1}, Lh0/d1;->n()Ln2/s;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iget-object p1, p1, Ln2/s;->a:Li2/g;

    .line 213
    .line 214
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {p1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_7

    .line 221
    .line 222
    iget-object p1, v1, Lh0/d1;->b:Lb5/k;

    .line 223
    .line 224
    if-ne v0, p1, :cond_7

    .line 225
    .line 226
    iget-object p1, v1, Lh0/d1;->c:Lfg/l;

    .line 227
    .line 228
    invoke-virtual {v1}, Lh0/d1;->n()Ln2/s;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget-object v0, v0, Ln2/s;->a:Li2/g;

    .line 233
    .line 234
    invoke-static {v0, v4, v5}, Lh0/d1;->e(Li2/g;J)Ln2/s;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    new-instance p1, Li2/m0;

    .line 242
    .line 243
    invoke-direct {p1, v4, v5}, Li2/m0;-><init>(J)V

    .line 244
    .line 245
    .line 246
    iput-object p1, v1, Lh0/d1;->v:Li2/m0;

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :goto_6
    return-object p1

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
