.class public final synthetic Lik2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lxk1;

.field public final synthetic i:Lxk1;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lj20;

.field public final synthetic q:Landroid/content/Context;

.field public final synthetic r:Lxk1;

.field public final synthetic s:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxk1;Lxk1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj20;Landroid/content/Context;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lik2;->h:Lxk1;

    .line 5
    .line 6
    iput-object p2, p0, Lik2;->i:Lxk1;

    .line 7
    .line 8
    iput-object p3, p0, Lik2;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lik2;->k:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lik2;->l:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lik2;->m:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lik2;->n:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lik2;->o:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lik2;->p:Lj20;

    .line 21
    .line 22
    iput-object p10, p0, Lik2;->q:Landroid/content/Context;

    .line 23
    .line 24
    iput-object p11, p0, Lik2;->r:Lxk1;

    .line 25
    .line 26
    iput-object p12, p0, Lik2;->s:Lxk1;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    and-int/2addr p2, v2

    .line 19
    move-object v10, p1

    .line 20
    check-cast v10, Lgo0;

    .line 21
    .line 22
    invoke-virtual {v10, p2, v0}, Lgo0;->O(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_8

    .line 27
    .line 28
    iget-object p1, p0, Lik2;->h:Lxk1;

    .line 29
    .line 30
    invoke-interface {p1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ltq1;

    .line 35
    .line 36
    iget-object p1, p1, Ltq1;->a:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_9

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    move-object v1, p2

    .line 53
    check-cast v1, Lcq1;

    .line 54
    .line 55
    iget-object p2, v1, Lcq1;->b:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v2, v1, Lcq1;->i:Ljava/util/List;

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object v3, v1, Lcq1;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v3, " \u00b7 "

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v3, v1, Lcq1;->c:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    iget-object v8, p0, Lik2;->k:Ljava/lang/String;

    .line 84
    .line 85
    const-string v9, "\n"

    .line 86
    .line 87
    if-nez v3, :cond_1

    .line 88
    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v4, p0, Lik2;->j:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const/4 v6, 0x0

    .line 110
    const/16 v7, 0x3e

    .line 111
    .line 112
    iget-object v3, p0, Lik2;->l:Ljava/lang/String;

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    invoke-static/range {v2 .. v7}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    :cond_1
    iget-object v2, v1, Lcq1;->j:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_3

    .line 130
    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v3, p0, Lik2;->m:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-boolean v2, v1, Lcq1;->k:Z

    .line 152
    .line 153
    if-eqz v2, :cond_2

    .line 154
    .line 155
    iget-object v2, p0, Lik2;->n:Ljava/lang/String;

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_2
    iget-object v2, p0, Lik2;->o:Ljava/lang/String;

    .line 159
    .line 160
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    :cond_3
    iget-object v2, v1, Lcq1;->g:Ljava/lang/String;

    .line 164
    .line 165
    if-eqz v2, :cond_4

    .line 166
    .line 167
    invoke-virtual {v9, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    :cond_4
    iget-object v2, v1, Lcq1;->h:Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v2, :cond_5

    .line 177
    .line 178
    invoke-virtual {v9, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    new-instance v0, Lze;

    .line 190
    .line 191
    iget-object v2, p0, Lik2;->p:Lj20;

    .line 192
    .line 193
    iget-object v3, p0, Lik2;->q:Landroid/content/Context;

    .line 194
    .line 195
    iget-object v4, p0, Lik2;->r:Lxk1;

    .line 196
    .line 197
    iget-object v5, p0, Lik2;->s:Lxk1;

    .line 198
    .line 199
    invoke-direct/range {v0 .. v5}, Lze;-><init>(Lcq1;Lj20;Landroid/content/Context;Lxk1;Lxk1;)V

    .line 200
    .line 201
    .line 202
    const v2, -0x3fa721c

    .line 203
    .line 204
    .line 205
    invoke-static {v2, v0, v10}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    iget-object v0, p0, Lik2;->i:Lxk1;

    .line 210
    .line 211
    invoke-virtual {v10, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-virtual {v10, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    or-int/2addr v2, v3

    .line 220
    invoke-virtual {v10}, Lgo0;->L()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    if-nez v2, :cond_6

    .line 225
    .line 226
    sget-object v2, Lnx;->a:Leb;

    .line 227
    .line 228
    if-ne v3, v2, :cond_7

    .line 229
    .line 230
    :cond_6
    new-instance v3, Lr1;

    .line 231
    .line 232
    const/16 v2, 0x1c

    .line 233
    .line 234
    invoke-direct {v3, v2, v1, v0}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v10, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_7
    move-object v8, v3

    .line 241
    check-cast v8, Lxm0;

    .line 242
    .line 243
    const/16 v11, 0x6000

    .line 244
    .line 245
    const/16 v12, 0x16a

    .line 246
    .line 247
    const/4 v2, 0x0

    .line 248
    const/4 v4, 0x0

    .line 249
    move-object v3, v6

    .line 250
    const/4 v6, 0x0

    .line 251
    const/4 v7, 0x0

    .line 252
    const/4 v9, 0x0

    .line 253
    move-object v1, p2

    .line 254
    invoke-static/range {v1 .. v12}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    :cond_8
    invoke-virtual {v10}, Lgo0;->R()V

    .line 260
    .line 261
    .line 262
    :cond_9
    sget-object p0, La83;->a:La83;

    .line 263
    .line 264
    return-object p0
.end method
