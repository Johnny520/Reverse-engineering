.class public final synthetic Lwb/cf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lfg/a;Lfg/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/cf;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/cf;->h:Lfg/a;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/cf;->i:Lfg/a;

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
    .locals 7

    .line 1
    iget v0, p0, Lwb/cf;->g:I

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
    if-eqz p2, :cond_5

    .line 30
    .line 31
    iget-object p2, p0, Lwb/cf;->h:Lfg/a;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sget-object v4, Li0/l;->a:Li0/e;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    if-ne v1, v4, :cond_2

    .line 46
    .line 47
    :cond_1
    new-instance v1, Lwb/kc;

    .line 48
    .line 49
    const/16 v0, 0x10

    .line 50
    .line 51
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    check-cast v1, Lfg/a;

    .line 58
    .line 59
    const-string p2, "\u6dfb\u52a0\u597d\u53cb/\u7fa4\u804a/\u516c\u4f17\u53f7"

    .line 60
    .line 61
    const-string v0, "\u6279\u91cf\u6dfb\u52a0\u540e\u53ef\u4e00\u6b21\u9009\u62e9\u6a21\u677f"

    .line 62
    .line 63
    const/16 v5, 0x36

    .line 64
    .line 65
    invoke-static {p2, v0, v1, p1, v5}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 66
    .line 67
    .line 68
    const/4 p2, 0x0

    .line 69
    invoke-static {p2, p1, v2, v3}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Lwb/cf;->i:Lfg/a;

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    if-ne v2, v4, :cond_4

    .line 85
    .line 86
    :cond_3
    new-instance v2, Lwb/kc;

    .line 87
    .line 88
    const/16 v1, 0x11

    .line 89
    .line 90
    invoke-direct {v2, p2, v1}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    check-cast v2, Lfg/a;

    .line 97
    .line 98
    const-string p2, "\u6dfb\u52a0\u7fa4\u6210\u5458"

    .line 99
    .line 100
    invoke-static {p2, v0, v2, p1, v5}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 105
    .line 106
    .line 107
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 111
    .line 112
    const/4 v1, 0x2

    .line 113
    const/4 v2, 0x1

    .line 114
    const/4 v3, 0x0

    .line 115
    if-eq v0, v1, :cond_6

    .line 116
    .line 117
    move v0, v2

    .line 118
    goto :goto_2

    .line 119
    :cond_6
    move v0, v3

    .line 120
    :goto_2
    and-int/2addr p2, v2

    .line 121
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_e

    .line 126
    .line 127
    iget-object p2, p0, Lwb/cf;->h:Lfg/a;

    .line 128
    .line 129
    const/16 v0, 0x36

    .line 130
    .line 131
    sget-object v1, Li0/l;->a:Li0/e;

    .line 132
    .line 133
    if-eqz p2, :cond_9

    .line 134
    .line 135
    const v4, 0x62ae1959

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v4}, Li0/h0;->a0(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    if-nez v4, :cond_7

    .line 150
    .line 151
    if-ne v5, v1, :cond_8

    .line 152
    .line 153
    :cond_7
    new-instance v5, Lwb/kc;

    .line 154
    .line 155
    const/16 v4, 0x13

    .line 156
    .line 157
    invoke-direct {v5, p2, v4}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    check-cast v5, Lfg/a;

    .line 164
    .line 165
    const-string v4, "\u7acb\u5373\u6267\u884c"

    .line 166
    .line 167
    const-string v6, "\u4fdd\u5b58\u5f53\u524d\u5185\u5bb9\u540e\u7acb\u523b\u53d1\u9001\u4e00\u6b21"

    .line 168
    .line 169
    invoke-static {v4, v6, v5, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_9
    const v4, 0x62b093c2

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v4}, Li0/h0;->a0(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 183
    .line 184
    .line 185
    :goto_3
    iget-object v4, p0, Lwb/cf;->i:Lfg/a;

    .line 186
    .line 187
    if-eqz p2, :cond_a

    .line 188
    .line 189
    if-eqz v4, :cond_a

    .line 190
    .line 191
    const p2, 0x62b1af5c

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 195
    .line 196
    .line 197
    const/4 p2, 0x0

    .line 198
    invoke-static {p2, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_a
    const p2, 0x62b2b622

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 212
    .line 213
    .line 214
    :goto_4
    if-eqz v4, :cond_d

    .line 215
    .line 216
    const p2, 0x62b37fa2

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    if-nez p2, :cond_b

    .line 231
    .line 232
    if-ne v2, v1, :cond_c

    .line 233
    .line 234
    :cond_b
    new-instance v2, Lwb/kc;

    .line 235
    .line 236
    const/16 p2, 0x14

    .line 237
    .line 238
    invoke-direct {v2, v4, p2}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_c
    check-cast v2, Lfg/a;

    .line 245
    .line 246
    const-string p2, "\u5220\u9664\u4efb\u52a1"

    .line 247
    .line 248
    const-string v1, "\u79fb\u9664\u5f53\u524d\u5b9a\u65f6\u4efb\u52a1"

    .line 249
    .line 250
    invoke-static {p2, v1, v2, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_d
    const p2, 0x62b5d842

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_e
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 268
    .line 269
    .line 270
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 271
    .line 272
    return-object p1

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
