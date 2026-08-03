.class public final synthetic Lwb/pf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/a;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/pf;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/pf;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/pf;->i:Lfg/a;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/pf;->j:Ljava/util/List;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/pf;->k:Lfg/a;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/pf;->g:I

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
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v2

    .line 24
    :goto_0
    and-int/2addr p2, v3

    .line 25
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_7

    .line 30
    .line 31
    iget-object p2, p0, Lwb/pf;->h:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const-string v0, "\u6682\u65e0\u6a21\u677f\uff0c\u8fdb\u5165\u540e\u6dfb\u52a0"

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const-string v1, " \u4e2a\u6a21\u677f"

    .line 47
    .line 48
    invoke-static {v0, v1}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :goto_1
    iget-object v1, p0, Lwb/pf;->i:Lfg/a;

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v6, Li0/l;->a:Li0/e;

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    if-ne v5, v6, :cond_3

    .line 67
    .line 68
    :cond_2
    new-instance v5, Lwb/kc;

    .line 69
    .line 70
    const/16 v4, 0xb

    .line 71
    .line 72
    invoke-direct {v5, v1, v4}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    check-cast v5, Lfg/a;

    .line 79
    .line 80
    const-string v1, "\u56de\u590d\u6a21\u677f\u7ba1\u7406"

    .line 81
    .line 82
    const/4 v4, 0x6

    .line 83
    invoke-static {v1, v0, v5, p1, v4}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-static {v0, p1, v2, v3}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    const-string p2, "\u5148\u65b0\u589e\u6a21\u677f\uff0c\u518d\u6279\u91cf\u7ed1\u5b9a\u76d1\u542c\u7fa4"

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    iget-object v0, p0, Lwb/pf;->j:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {v0, p2}, Lwb/ho;->H5(Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    :goto_2
    iget-object v0, p0, Lwb/pf;->k:Lfg/a;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v1, :cond_5

    .line 116
    .line 117
    if-ne v2, v6, :cond_6

    .line 118
    .line 119
    :cond_5
    new-instance v2, Lwb/kc;

    .line 120
    .line 121
    const/16 v1, 0xc

    .line 122
    .line 123
    invoke-direct {v2, v0, v1}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    check-cast v2, Lfg/a;

    .line 130
    .line 131
    const-string v0, "\u6279\u91cf\u5957\u7528\u6a21\u677f"

    .line 132
    .line 133
    invoke-static {v0, p2, v2, p1, v4}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_7
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 138
    .line 139
    .line 140
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 141
    .line 142
    return-object p1

    .line 143
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 144
    .line 145
    const/4 v1, 0x2

    .line 146
    const/4 v2, 0x0

    .line 147
    const/4 v3, 0x1

    .line 148
    if-eq v0, v1, :cond_8

    .line 149
    .line 150
    move v0, v3

    .line 151
    goto :goto_4

    .line 152
    :cond_8
    move v0, v2

    .line 153
    :goto_4
    and-int/2addr p2, v3

    .line 154
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-eqz p2, :cond_f

    .line 159
    .line 160
    iget-object p2, p0, Lwb/pf;->h:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_9

    .line 167
    .line 168
    const-string v0, "\u6682\u65e0\u6a21\u677f\uff0c\u8fdb\u5165\u540e\u6dfb\u52a0"

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    const-string v1, " \u4e2a\u6a21\u677f"

    .line 176
    .line 177
    invoke-static {v0, v1}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :goto_5
    iget-object v1, p0, Lwb/pf;->i:Lfg/a;

    .line 182
    .line 183
    invoke-virtual {p1, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    sget-object v6, Li0/l;->a:Li0/e;

    .line 192
    .line 193
    if-nez v4, :cond_a

    .line 194
    .line 195
    if-ne v5, v6, :cond_b

    .line 196
    .line 197
    :cond_a
    new-instance v5, Lwb/kc;

    .line 198
    .line 199
    const/4 v4, 0x7

    .line 200
    invoke-direct {v5, v1, v4}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_b
    check-cast v5, Lfg/a;

    .line 207
    .line 208
    const-string v1, "\u63d0\u9192\u6a21\u677f\u7ba1\u7406"

    .line 209
    .line 210
    const/4 v4, 0x6

    .line 211
    invoke-static {v1, v0, v5, p1, v4}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 212
    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    invoke-static {v0, p1, v2, v3}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 216
    .line 217
    .line 218
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_c

    .line 223
    .line 224
    const-string p2, "\u5148\u65b0\u589e\u6a21\u677f\uff0c\u518d\u6279\u91cf\u7ed1\u5b9a\u76d1\u542c\u7fa4"

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_c
    iget-object v0, p0, Lwb/pf;->j:Ljava/util/List;

    .line 228
    .line 229
    invoke-static {v0, p2}, Lwb/ho;->T5(Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    :goto_6
    iget-object v0, p0, Lwb/pf;->k:Lfg/a;

    .line 234
    .line 235
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    if-nez v1, :cond_d

    .line 244
    .line 245
    if-ne v2, v6, :cond_e

    .line 246
    .line 247
    :cond_d
    new-instance v2, Lwb/kc;

    .line 248
    .line 249
    const/16 v1, 0x8

    .line 250
    .line 251
    invoke-direct {v2, v0, v1}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_e
    check-cast v2, Lfg/a;

    .line 258
    .line 259
    const-string v0, "\u6279\u91cf\u5957\u7528\u6a21\u677f"

    .line 260
    .line 261
    invoke-static {v0, p2, v2, p1, v4}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 262
    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_f
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 266
    .line 267
    .line 268
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 269
    .line 270
    return-object p1

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
