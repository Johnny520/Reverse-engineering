.class public final synthetic Lwb/b7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Ljava/util/ArrayList;

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Lwb/t5;

.field public final synthetic k:Lfg/a;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Z

.field public final synthetic o:Ljava/util/Set;

.field public final synthetic p:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Li0/a1;Lfg/l;Lwb/t5;Lfg/a;Li0/a1;Li0/a1;ZLjava/util/Set;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/b7;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/b7;->h:Li0/a1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/b7;->i:Lfg/l;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/b7;->j:Lwb/t5;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/b7;->k:Lfg/a;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/b7;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/b7;->m:Li0/a1;

    .line 17
    .line 18
    iput-boolean p8, p0, Lwb/b7;->n:Z

    .line 19
    .line 20
    iput-object p9, p0, Lwb/b7;->o:Ljava/util/Set;

    .line 21
    .line 22
    iput-boolean p10, p0, Lwb/b7;->p:Z

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Lth/a;

    .line 2
    .line 3
    move-object v6, p2

    .line 4
    check-cast v6, Li0/h0;

    .line 5
    .line 6
    move-object/from16 v0, p3

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    and-int/lit8 p1, v0, 0x11

    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eq p1, v1, :cond_0

    .line 24
    .line 25
    move p1, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p1, v3

    .line 28
    :goto_0
    and-int/2addr v0, v2

    .line 29
    invoke-virtual {v6, v0, p1}, Li0/h0;->S(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_b

    .line 34
    .line 35
    iget-object p1, p0, Lwb/b7;->g:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v6, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lwb/b7;->h:Li0/a1;

    .line 42
    .line 43
    invoke-virtual {v6, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    or-int/2addr v0, v2

    .line 48
    iget-object v2, p0, Lwb/b7;->i:Lfg/l;

    .line 49
    .line 50
    invoke-virtual {v6, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    or-int/2addr v0, v4

    .line 55
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v5, Li0/l;->a:Li0/e;

    .line 60
    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    if-ne v4, v5, :cond_2

    .line 64
    .line 65
    :cond_1
    new-instance v4, Lab/e;

    .line 66
    .line 67
    const/16 v0, 0x10

    .line 68
    .line 69
    invoke-direct {v4, p1, v2, v1, v0}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    check-cast v4, Lfg/a;

    .line 76
    .line 77
    iget-object v8, p0, Lwb/b7;->j:Lwb/t5;

    .line 78
    .line 79
    if-nez v8, :cond_3

    .line 80
    .line 81
    const-string p1, "\u8fd4\u56de"

    .line 82
    .line 83
    :goto_1
    move-object v2, p1

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const-string p1, "\u8fd4\u56de\u6807\u7b7e"

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_2
    invoke-virtual {v6, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iget-object v9, p0, Lwb/b7;->k:Lfg/a;

    .line 93
    .line 94
    invoke-virtual {v6, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    or-int/2addr p1, v0

    .line 99
    iget-object v10, p0, Lwb/b7;->l:Li0/a1;

    .line 100
    .line 101
    invoke-virtual {v6, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    or-int/2addr p1, v0

    .line 106
    iget-object v11, p0, Lwb/b7;->m:Li0/a1;

    .line 107
    .line 108
    invoke-virtual {v6, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    or-int/2addr p1, v0

    .line 113
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-nez p1, :cond_4

    .line 118
    .line 119
    if-ne v0, v5, :cond_5

    .line 120
    .line 121
    :cond_4
    new-instance v7, Lc9/n0;

    .line 122
    .line 123
    const/16 v12, 0xb

    .line 124
    .line 125
    invoke-direct/range {v7 .. v12}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    move-object v0, v7

    .line 132
    :cond_5
    check-cast v0, Lfg/a;

    .line 133
    .line 134
    iget-boolean p1, p0, Lwb/b7;->n:Z

    .line 135
    .line 136
    iget-object v7, p0, Lwb/b7;->o:Ljava/util/Set;

    .line 137
    .line 138
    iget-boolean v8, p0, Lwb/b7;->p:Z

    .line 139
    .line 140
    const/4 v9, 0x0

    .line 141
    if-nez p1, :cond_7

    .line 142
    .line 143
    move-object v10, v7

    .line 144
    check-cast v10, Ljava/util/Collection;

    .line 145
    .line 146
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-nez v10, :cond_7

    .line 151
    .line 152
    if-eqz v8, :cond_6

    .line 153
    .line 154
    const-string v10, "\u53d6\u6d88\u5168\u9009"

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    const-string v10, "\u5168\u9009"

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    move-object v10, v9

    .line 161
    :goto_3
    if-nez p1, :cond_a

    .line 162
    .line 163
    move-object p1, v7

    .line 164
    check-cast p1, Ljava/util/Collection;

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-nez p1, :cond_a

    .line 171
    .line 172
    const p1, -0x10965aa1

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-virtual {v6, v8}, Li0/h0;->g(Z)Z

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    or-int/2addr p1, v9

    .line 187
    invoke-virtual {v6, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    or-int/2addr p1, v9

    .line 192
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    if-nez p1, :cond_8

    .line 197
    .line 198
    if-ne v9, v5, :cond_9

    .line 199
    .line 200
    :cond_8
    new-instance v9, Lwb/p1;

    .line 201
    .line 202
    const/4 p1, 0x3

    .line 203
    invoke-direct {v9, v8, v7, v1, p1}, Lwb/p1;-><init>(ZLjava/util/Set;Li0/a1;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v6, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_9
    check-cast v9, Lfg/a;

    .line 210
    .line 211
    invoke-virtual {v6, v3}, Li0/h0;->p(Z)V

    .line 212
    .line 213
    .line 214
    :goto_4
    move-object v5, v9

    .line 215
    goto :goto_5

    .line 216
    :cond_a
    const p1, -0x10917dc9

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6, v3}, Li0/h0;->p(Z)V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :goto_5
    const/4 v7, 0x6

    .line 227
    const/4 v8, 0x0

    .line 228
    move-object v3, v0

    .line 229
    const-string v0, "\u4fdd\u5b58\u9009\u62e9"

    .line 230
    .line 231
    move-object v1, v4

    .line 232
    move-object v4, v10

    .line 233
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_b
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 238
    .line 239
    .line 240
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 241
    .line 242
    return-object p1
.end method
