.class public final synthetic Lzj;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lck;Lva1;Lc40;Ljz0;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput p2, p0, Lzj;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzj;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lzj;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lzj;->g:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p4, p0, Lzj;->d:I

    iput-object p1, p0, Lzj;->e:Ljava/lang/Object;

    iput-object p2, p0, Lzj;->f:Ljava/lang/Object;

    iput-object p3, p0, Lzj;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Loh0;Ljava/util/ArrayList;Ljava/util/List;Z)V
    .locals 0

    .line 14
    const/4 p4, 0x3

    iput p4, p0, Lzj;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzj;->e:Ljava/lang/Object;

    iput-object p2, p0, Lzj;->f:Ljava/lang/Object;

    iput-object p3, p0, Lzj;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lwt0;Lhz0;Lwt0;Lvl;)V
    .locals 0

    .line 15
    const/4 p4, 0x1

    iput p4, p0, Lzj;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzj;->e:Ljava/lang/Object;

    iput-object p2, p0, Lzj;->f:Ljava/lang/Object;

    iput-object p3, p0, Lzj;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lzj;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Lna1;->a:Lna1;

    .line 6
    .line 7
    iget-object v4, p0, Lzj;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, Lzj;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Lzj;->e:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Lyw0;

    .line 17
    .line 18
    check-cast v4, Lcx0;

    .line 19
    .line 20
    check-cast p1, Loo;

    .line 21
    .line 22
    iget-object p1, p0, Lyw0;->e:Ljh0;

    .line 23
    .line 24
    invoke-virtual {p1, v5}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lyw0;->d:Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v5, v4}, Ljh0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lxw0;

    .line 39
    .line 40
    invoke-direct {v2, p0, v5, v4}, Lxw0;-><init>(Lyw0;Ljava/lang/Object;Lcx0;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const-string p0, "Key "

    .line 45
    .line 46
    const-string p1, " was used multiple times "

    .line 47
    .line 48
    invoke-static {p0, v5, p1}, Lxc;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-object v2

    .line 52
    :pswitch_0
    check-cast p0, Loh0;

    .line 53
    .line 54
    check-cast v5, Ljava/util/ArrayList;

    .line 55
    .line 56
    check-cast v4, Ljava/util/List;

    .line 57
    .line 58
    check-cast p1, Lwq0;

    .line 59
    .line 60
    iput-boolean v1, p1, Lwq0;->d:Z

    .line 61
    .line 62
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    move v2, v1

    .line 68
    :goto_1
    if-ge v2, v0, :cond_1

    .line 69
    .line 70
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, Lw80;

    .line 75
    .line 76
    invoke-virtual {v6, p1}, Lw80;->b(Lwq0;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    move v2, v1

    .line 87
    :goto_2
    if-ge v2, v0, :cond_2

    .line 88
    .line 89
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Lw80;

    .line 94
    .line 95
    invoke-virtual {v5, p1}, Lw80;->b(Lwq0;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v2, v2, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    iput-boolean v1, p1, Lwq0;->d:Z

    .line 102
    .line 103
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-object v3

    .line 107
    :pswitch_1
    check-cast p0, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    check-cast v4, Ljava/util/List;

    .line 110
    .line 111
    check-cast p1, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-static {p0, v5, v4, p1}, Lwy;->j(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/List;Z)Lna1;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :pswitch_2
    check-cast p0, Lwt0;

    .line 123
    .line 124
    check-cast v5, Lhz0;

    .line 125
    .line 126
    check-cast v4, Lwt0;

    .line 127
    .line 128
    check-cast p1, Lu7;

    .line 129
    .line 130
    iget-object v0, p1, Lu7;->e:Lgp0;

    .line 131
    .line 132
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iget v1, p0, Lwt0;->d:F

    .line 143
    .line 144
    sub-float/2addr v0, v1

    .line 145
    invoke-virtual {v5, v0}, Lhz0;->a(F)F

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    iget-object v2, p1, Lu7;->e:Lgp0;

    .line 150
    .line 151
    invoke-virtual {v2}, Lgp0;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    iput v2, p0, Lwt0;->d:F

    .line 162
    .line 163
    iget-object p0, p1, Lu7;->a:Lq91;

    .line 164
    .line 165
    iget-object p0, p0, Lq91;->b:Lsw;

    .line 166
    .line 167
    iget-object v2, p1, Lu7;->f:Lb8;

    .line 168
    .line 169
    invoke-interface {p0, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Ljava/lang/Number;

    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    iput p0, v4, Lwt0;->d:F

    .line 180
    .line 181
    sub-float/2addr v0, v1

    .line 182
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    const/high16 v0, 0x3f000000    # 0.5f

    .line 187
    .line 188
    cmpl-float p0, p0, v0

    .line 189
    .line 190
    if-lez p0, :cond_3

    .line 191
    .line 192
    invoke-virtual {p1}, Lu7;->a()V

    .line 193
    .line 194
    .line 195
    :cond_3
    return-object v3

    .line 196
    :pswitch_3
    check-cast p0, Lck;

    .line 197
    .line 198
    check-cast v5, Lc40;

    .line 199
    .line 200
    check-cast v4, Ljz0;

    .line 201
    .line 202
    check-cast p1, Ljava/lang/Float;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    iget-boolean v0, p0, Lck;->t:Z

    .line 209
    .line 210
    if-eqz v0, :cond_4

    .line 211
    .line 212
    const/high16 v0, 0x3f800000    # 1.0f

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_4
    const/high16 v0, -0x40800000    # -1.0f

    .line 216
    .line 217
    :goto_3
    mul-float v6, v0, p1

    .line 218
    .line 219
    iget-object p0, p0, Lck;->s:Llz0;

    .line 220
    .line 221
    invoke-virtual {p0, v6}, Llz0;->h(F)J

    .line 222
    .line 223
    .line 224
    move-result-wide v6

    .line 225
    invoke-virtual {p0, v6, v7}, Llz0;->e(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v6

    .line 229
    iget-object v4, v4, Ljz0;->a:Llz0;

    .line 230
    .line 231
    iget-object v8, v4, Llz0;->k:Lny0;

    .line 232
    .line 233
    invoke-virtual {v4, v8, v6, v7, v1}, Llz0;->c(Lny0;JI)J

    .line 234
    .line 235
    .line 236
    move-result-wide v6

    .line 237
    invoke-virtual {p0, v6, v7}, Llz0;->e(J)J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    invoke-virtual {p0, v6, v7}, Llz0;->g(J)F

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    mul-float/2addr p0, v0

    .line 246
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    cmpg-float v0, v0, v1

    .line 255
    .line 256
    if-gez v0, :cond_5

    .line 257
    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    const-string v1, "Scroll animation cancelled because scroll was not consumed ("

    .line 261
    .line 262
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string p0, " < "

    .line 269
    .line 270
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const/16 p0, 0x29

    .line 277
    .line 278
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 286
    .line 287
    invoke-direct {p1, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 291
    .line 292
    .line 293
    invoke-interface {v5, p1}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 294
    .line 295
    .line 296
    :cond_5
    return-object v3

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
