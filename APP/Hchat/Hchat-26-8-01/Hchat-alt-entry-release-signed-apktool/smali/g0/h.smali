.class public final synthetic Lg0/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lg0/j;


# direct methods
.method public synthetic constructor <init>(Lg0/j;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg0/h;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lg0/h;->h:Lg0/j;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lg0/h;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, v0, Lg0/h;->h:Lg0/j;

    .line 17
    .line 18
    iget-object v3, v2, Lg0/j;->I:Lg0/i;

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v4, v2, Lg0/j;->E:Lfg/l;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v4, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v3, v2, Lg0/j;->I:Lg0/i;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    iput-boolean v1, v3, Lg0/i;->c:Z

    .line 36
    .line 37
    :cond_2
    invoke-static {v2}, Lx1/k;->n(Lx1/z1;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lx1/k;->m(Lx1/v;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, Lx1/k;->l(Lx1/m;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    return-object v1

    .line 52
    :pswitch_0
    move-object/from16 v3, p1

    .line 53
    .line 54
    check-cast v3, Li2/g;

    .line 55
    .line 56
    iget-object v1, v0, Lg0/h;->h:Lg0/j;

    .line 57
    .line 58
    iget-object v2, v1, Lg0/j;->I:Lg0/i;

    .line 59
    .line 60
    sget-object v10, Ltf/t;->g:Ltf/t;

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    iget-object v4, v2, Lg0/i;->b:Li2/g;

    .line 65
    .line 66
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    iput-object v3, v2, Lg0/i;->b:Li2/g;

    .line 74
    .line 75
    iget-object v2, v2, Lg0/i;->d:Lg0/d;

    .line 76
    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    iget-object v4, v1, Lg0/j;->v:Li2/n0;

    .line 80
    .line 81
    iget-object v5, v1, Lg0/j;->w:Lm2/d;

    .line 82
    .line 83
    iget v6, v1, Lg0/j;->y:I

    .line 84
    .line 85
    iget-boolean v7, v1, Lg0/j;->z:Z

    .line 86
    .line 87
    iget v8, v1, Lg0/j;->A:I

    .line 88
    .line 89
    iget v9, v1, Lg0/j;->B:I

    .line 90
    .line 91
    invoke-virtual/range {v2 .. v10}, Lg0/d;->g(Li2/g;Li2/n0;Lm2/d;IZIILjava/util/List;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    new-instance v11, Lg0/i;

    .line 96
    .line 97
    iget-object v2, v1, Lg0/j;->u:Li2/g;

    .line 98
    .line 99
    invoke-direct {v11, v2, v3}, Lg0/i;-><init>(Li2/g;Li2/g;)V

    .line 100
    .line 101
    .line 102
    new-instance v2, Lg0/d;

    .line 103
    .line 104
    iget-object v4, v1, Lg0/j;->v:Li2/n0;

    .line 105
    .line 106
    iget-object v5, v1, Lg0/j;->w:Lm2/d;

    .line 107
    .line 108
    iget v6, v1, Lg0/j;->y:I

    .line 109
    .line 110
    iget-boolean v7, v1, Lg0/j;->z:Z

    .line 111
    .line 112
    iget v8, v1, Lg0/j;->A:I

    .line 113
    .line 114
    iget v9, v1, Lg0/j;->B:I

    .line 115
    .line 116
    invoke-direct/range {v2 .. v10}, Lg0/d;-><init>(Li2/g;Li2/n0;Lm2/d;IZIILjava/util/List;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Lg0/j;->k1()Lg0/d;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget-object v3, v3, Lg0/d;->j:Lu2/c;

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Lg0/d;->d(Lu2/c;)V

    .line 126
    .line 127
    .line 128
    iput-object v2, v11, Lg0/i;->d:Lg0/d;

    .line 129
    .line 130
    iput-object v11, v1, Lg0/j;->I:Lg0/i;

    .line 131
    .line 132
    :cond_5
    :goto_1
    invoke-static {v1}, Lx1/k;->n(Lx1/z1;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v1}, Lx1/k;->m(Lx1/v;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v1}, Lx1/k;->l(Lx1/m;)V

    .line 139
    .line 140
    .line 141
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 142
    .line 143
    return-object v1

    .line 144
    :pswitch_1
    move-object/from16 v1, p1

    .line 145
    .line 146
    check-cast v1, Ljava/util/List;

    .line 147
    .line 148
    iget-object v2, v0, Lg0/h;->h:Lg0/j;

    .line 149
    .line 150
    invoke-virtual {v2}, Lg0/j;->k1()Lg0/d;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    iget-object v3, v3, Lg0/d;->n:Li2/k0;

    .line 155
    .line 156
    if-eqz v3, :cond_6

    .line 157
    .line 158
    iget-object v4, v3, Li2/k0;->a:Li2/j0;

    .line 159
    .line 160
    new-instance v5, Li2/j0;

    .line 161
    .line 162
    iget-object v6, v4, Li2/j0;->a:Li2/g;

    .line 163
    .line 164
    iget-object v7, v2, Lg0/j;->v:Li2/n0;

    .line 165
    .line 166
    sget-wide v8, Lf1/w;->g:J

    .line 167
    .line 168
    const-wide/16 v17, 0x0

    .line 169
    .line 170
    const v19, 0xfffffe

    .line 171
    .line 172
    .line 173
    const-wide/16 v10, 0x0

    .line 174
    .line 175
    const/4 v12, 0x0

    .line 176
    const/4 v13, 0x0

    .line 177
    const-wide/16 v14, 0x0

    .line 178
    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    invoke-static/range {v7 .. v19}, Li2/n0;->c(Li2/n0;JJLm2/k;Lm2/p;JIJI)Li2/n0;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    iget-object v8, v4, Li2/j0;->c:Ljava/util/List;

    .line 186
    .line 187
    iget v9, v4, Li2/j0;->d:I

    .line 188
    .line 189
    iget-boolean v10, v4, Li2/j0;->e:Z

    .line 190
    .line 191
    iget v11, v4, Li2/j0;->f:I

    .line 192
    .line 193
    iget-object v12, v4, Li2/j0;->g:Lu2/c;

    .line 194
    .line 195
    iget-object v13, v4, Li2/j0;->h:Lu2/m;

    .line 196
    .line 197
    iget-object v14, v4, Li2/j0;->i:Lm2/d;

    .line 198
    .line 199
    move-object/from16 p1, v5

    .line 200
    .line 201
    iget-wide v4, v4, Li2/j0;->j:J

    .line 202
    .line 203
    move-wide v15, v4

    .line 204
    move-object/from16 v5, p1

    .line 205
    .line 206
    invoke-direct/range {v5 .. v16}, Li2/j0;-><init>(Li2/g;Li2/n0;Ljava/util/List;IZILu2/c;Lu2/m;Lm2/d;J)V

    .line 207
    .line 208
    .line 209
    iget-wide v6, v3, Li2/k0;->c:J

    .line 210
    .line 211
    new-instance v2, Li2/k0;

    .line 212
    .line 213
    iget-object v3, v3, Li2/k0;->b:Li2/o;

    .line 214
    .line 215
    invoke-direct {v2, v5, v3, v6, v7}, Li2/k0;-><init>(Li2/j0;Li2/o;J)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_6
    const/4 v2, 0x0

    .line 223
    :goto_2
    if-eqz v2, :cond_7

    .line 224
    .line 225
    const/4 v1, 0x1

    .line 226
    goto :goto_3

    .line 227
    :cond_7
    const/4 v1, 0x0

    .line 228
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    return-object v1

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
