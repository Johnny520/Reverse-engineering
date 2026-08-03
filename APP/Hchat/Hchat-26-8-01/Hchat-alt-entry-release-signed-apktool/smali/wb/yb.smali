.class public final synthetic Lwb/yb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/yb;->g:I

    .line 2
    .line 3
    iput p1, p0, Lwb/yb;->h:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/yb;->g:I

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
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq p1, v0, :cond_0

    .line 26
    .line 27
    move p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p1, v1

    .line 30
    :goto_0
    and-int/2addr p3, v2

    .line 31
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget p1, p0, Lwb/yb;->h:I

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    int-to-float p3, v1

    .line 42
    :goto_1
    move v5, p3

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const/16 p3, 0xa

    .line 45
    .line 46
    int-to-float p3, p3

    .line 47
    goto :goto_1

    .line 48
    :goto_2
    const/4 v7, 0x0

    .line 49
    const/16 v8, 0xd

    .line 50
    .line 51
    sget-object v3, Ly0/l;->a:Ly0/l;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    invoke-static/range {v3 .. v8}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    add-int/2addr p1, v2

    .line 60
    const-string v0, "\u7b2c "

    .line 61
    .line 62
    const-string v2, " \u6761"

    .line 63
    .line 64
    invoke-static {p1, v0, v2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const/16 v0, 0xc

    .line 69
    .line 70
    invoke-static {p1, p3, p2, v1, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 75
    .line 76
    .line 77
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 78
    .line 79
    return-object p1

    .line 80
    :pswitch_0
    const/16 v0, 0x10

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    const/4 v2, 0x1

    .line 84
    if-eq p1, v0, :cond_3

    .line 85
    .line 86
    move p1, v2

    .line 87
    goto :goto_4

    .line 88
    :cond_3
    move p1, v1

    .line 89
    :goto_4
    and-int/2addr p3, v2

    .line 90
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    iget p1, p0, Lwb/yb;->h:I

    .line 97
    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    int-to-float p3, v1

    .line 101
    :goto_5
    move v5, p3

    .line 102
    goto :goto_6

    .line 103
    :cond_4
    const/16 p3, 0xa

    .line 104
    .line 105
    int-to-float p3, p3

    .line 106
    goto :goto_5

    .line 107
    :goto_6
    const/4 v7, 0x0

    .line 108
    const/16 v8, 0xd

    .line 109
    .line 110
    sget-object v3, Ly0/l;->a:Ly0/l;

    .line 111
    .line 112
    const/4 v4, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    invoke-static/range {v3 .. v8}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    add-int/2addr p1, v2

    .line 119
    const-string v0, "\u7b2c "

    .line 120
    .line 121
    const-string v2, " \u6761"

    .line 122
    .line 123
    invoke-static {p1, v0, v2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const/16 v0, 0xc

    .line 128
    .line 129
    invoke-static {p1, p3, p2, v1, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 130
    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 134
    .line 135
    .line 136
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 137
    .line 138
    return-object p1

    .line 139
    :pswitch_1
    const/16 v0, 0x10

    .line 140
    .line 141
    const/4 v1, 0x0

    .line 142
    const/4 v2, 0x1

    .line 143
    if-eq p1, v0, :cond_6

    .line 144
    .line 145
    move p1, v2

    .line 146
    goto :goto_8

    .line 147
    :cond_6
    move p1, v1

    .line 148
    :goto_8
    and-int/2addr p3, v2

    .line 149
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_8

    .line 154
    .line 155
    iget p1, p0, Lwb/yb;->h:I

    .line 156
    .line 157
    if-nez p1, :cond_7

    .line 158
    .line 159
    const/16 p3, 0xa

    .line 160
    .line 161
    :goto_9
    int-to-float p3, p3

    .line 162
    move v5, p3

    .line 163
    goto :goto_a

    .line 164
    :cond_7
    const/16 p3, 0x12

    .line 165
    .line 166
    goto :goto_9

    .line 167
    :goto_a
    const/4 v7, 0x0

    .line 168
    const/16 v8, 0xd

    .line 169
    .line 170
    sget-object v3, Ly0/l;->a:Ly0/l;

    .line 171
    .line 172
    const/4 v4, 0x0

    .line 173
    const/4 v6, 0x0

    .line 174
    invoke-static/range {v3 .. v8}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    add-int/2addr p1, v2

    .line 179
    const-string v0, "\u89c4\u5219 "

    .line 180
    .line 181
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    const/16 v0, 0xc

    .line 186
    .line 187
    invoke-static {p1, p3, p2, v1, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 188
    .line 189
    .line 190
    goto :goto_b

    .line 191
    :cond_8
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 192
    .line 193
    .line 194
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 195
    .line 196
    return-object p1

    .line 197
    :pswitch_2
    const/16 v0, 0x10

    .line 198
    .line 199
    const/4 v1, 0x0

    .line 200
    const/4 v2, 0x1

    .line 201
    if-eq p1, v0, :cond_9

    .line 202
    .line 203
    move p1, v2

    .line 204
    goto :goto_c

    .line 205
    :cond_9
    move p1, v1

    .line 206
    :goto_c
    and-int/2addr p3, v2

    .line 207
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-eqz p1, :cond_b

    .line 212
    .line 213
    iget p1, p0, Lwb/yb;->h:I

    .line 214
    .line 215
    if-nez p1, :cond_a

    .line 216
    .line 217
    const/16 p3, 0xa

    .line 218
    .line 219
    :goto_d
    int-to-float p3, p3

    .line 220
    move v5, p3

    .line 221
    goto :goto_e

    .line 222
    :cond_a
    const/16 p3, 0x12

    .line 223
    .line 224
    goto :goto_d

    .line 225
    :goto_e
    const/4 v7, 0x0

    .line 226
    const/16 v8, 0xd

    .line 227
    .line 228
    sget-object v3, Ly0/l;->a:Ly0/l;

    .line 229
    .line 230
    const/4 v4, 0x0

    .line 231
    const/4 v6, 0x0

    .line 232
    invoke-static/range {v3 .. v8}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 233
    .line 234
    .line 235
    move-result-object p3

    .line 236
    add-int/2addr p1, v2

    .line 237
    const-string v0, "\u89c4\u5219 "

    .line 238
    .line 239
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    const/16 v0, 0xc

    .line 244
    .line 245
    invoke-static {p1, p3, p2, v1, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 246
    .line 247
    .line 248
    goto :goto_f

    .line 249
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 250
    .line 251
    .line 252
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 253
    .line 254
    return-object p1

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
