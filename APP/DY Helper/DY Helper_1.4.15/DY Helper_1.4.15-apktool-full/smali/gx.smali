.class public final synthetic Lgx;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:J

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgx;->ε:I

    .line 3
    .line 4
    sget v0, Lix;->α:I

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lgx;->η:Ljava/lang/Object;

    .line 10
    .line 11
    iput-wide p2, p0, Lgx;->ζ:J

    .line 12
    .line 13
    iput-object p4, p0, Lgx;->θ:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Lhb0;J)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lgx;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgx;->η:Ljava/lang/Object;

    iput-object p2, p0, Lgx;->θ:Ljava/lang/Object;

    iput-wide p3, p0, Lgx;->ζ:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lgx;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-wide v3, p0, Lgx;->ζ:J

    .line 7
    .line 8
    iget-object v5, p0, Lgx;->θ:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lgx;->η:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Ljava/lang/ClassLoader;

    .line 16
    .line 17
    check-cast v5, Lhb0;

    .line 18
    .line 19
    sget-object v0, Ljb0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    new-instance v0, Lgb0;

    .line 22
    .line 23
    invoke-direct {v0, v5, v3, v4}, Lgb0;-><init>(Lhb0;J)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lzb0;

    .line 27
    .line 28
    const/4 v4, 0x4

    .line 29
    invoke-direct {v3, v4}, Lzb0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0, v3}, Lx;->Γ(Ljava/lang/ClassLoader;Lp70;La80;)Lsb0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v6, v3, Lsb0;->β:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v0}, Lgb0;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_0

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_0
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "rb22c2f83ae9ef877"

    .line 57
    .line 58
    if-eqz v7, :cond_1

    .line 59
    .line 60
    invoke-static {v5}, Ljb0;->δ(Lhb0;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object v0, v3, Lsb0;->α:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p0, "\u68c0\u67e5\u5b8c\u6210\uff0c\u65e0\u5f85\u5ba1\u6838\u7533\u8bf7\uff0c\u7fa4="

    .line 79
    .line 80
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {v8, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    .line 96
    .line 97
    const/16 v7, 0xa

    .line 98
    .line 99
    invoke-static {v6, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_2

    .line 115
    .line 116
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    check-cast v9, Lic0;

    .line 121
    .line 122
    iget-wide v9, v9, Lic0;->α:J

    .line 123
    .line 124
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_2
    new-instance v7, Lzb0;

    .line 133
    .line 134
    const/4 v9, 0x3

    .line 135
    invoke-direct {v7, v9}, Lzb0;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-static {p0, v3, v0, v7}, Lx;->κ(Ljava/lang/ClassLoader;Ljava/util/ArrayList;Lp70;La80;)Leb0;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v0}, Lgb0;->invoke()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    check-cast v7, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-eqz v7, :cond_3

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_3
    new-instance v7, Lzb0;

    .line 156
    .line 157
    invoke-direct {v7, v4}, Lzb0;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-static {p0, v0, v7}, Lx;->Γ(Ljava/lang/ClassLoader;Lp70;La80;)Lsb0;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-static {v5}, Ljb0;->δ(Lhb0;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    iget-object v6, v3, Leb0;->β:Ljava/lang/Object;

    .line 173
    .line 174
    invoke-interface {v6}, Ljava/util/Set;->size()I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    iget-object v7, p0, Lsb0;->β:Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    iget-boolean v3, v3, Leb0;->γ:Z

    .line 185
    .line 186
    if-eqz v3, :cond_4

    .line 187
    .line 188
    iget-boolean p0, p0, Lsb0;->γ:Z

    .line 189
    .line 190
    if-eqz p0, :cond_4

    .line 191
    .line 192
    const/4 v2, 0x1

    .line 193
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v0, "\u5ba1\u6279\u5b8c\u6210\uff0c\u5f85\u5ba1="

    .line 202
    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v0, "\uff0c\u5bbf\u4e3b\u786e\u8ba4="

    .line 210
    .line 211
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v0, "\uff0c\u5269\u4f59="

    .line 218
    .line 219
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v0, "\uff0c\u5b8c\u6574="

    .line 226
    .line 227
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    const/4 v0, 0x0

    .line 238
    invoke-static {v8, p0, v0, v4, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :goto_1
    return-object v1

    .line 242
    :pswitch_0
    check-cast p0, Landroid/app/AlertDialog;

    .line 243
    .line 244
    sget v0, Lix;->α:I

    .line 245
    .line 246
    check-cast v5, Ljava/lang/String;

    .line 247
    .line 248
    sget-object v0, Lix;->μ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 249
    .line 250
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 254
    .line 255
    .line 256
    sget-object p0, Lix;->κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 257
    .line 258
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 259
    .line 260
    .line 261
    new-instance p0, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    const-string v0, "prewarm canceled by best-version warning, host="

    .line 264
    .line 265
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v0, "/"

    .line 272
    .line 273
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    const-string v0, ", best=390601"

    .line 280
    .line 281
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-static {p0}, Lix;->θ(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    return-object v1

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
