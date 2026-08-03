.class public final L۟/z7$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/z7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_d

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eq v0, v1, :cond_6

    .line 11
    .line 12
    const/16 v1, 0xd

    .line 13
    .line 14
    if-ne v0, v1, :cond_5

    .line 15
    .line 16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    move v1, v2

    .line 25
    :goto_0
    if-ge v1, v0, :cond_f

    .line 26
    .line 27
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, L۟/f;

    .line 32
    .line 33
    iget-object v5, v4, L۟/f;->ۥ:L۟/z7;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget v6, v4, L۟/f;->ۥ۟ۡ:I

    .line 39
    .line 40
    and-int/2addr v6, v3

    .line 41
    if-nez v6, :cond_0

    .line 42
    .line 43
    move v6, v3

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    move v6, v2

    .line 46
    :goto_1
    if-eqz v6, :cond_2

    .line 47
    .line 48
    iget-object v6, v4, L۟/f;->ۥ۟ۥ:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v7, v5, L۟/z7;->ۥ۟ۡ:L۟/e0;

    .line 51
    .line 52
    check-cast v7, L۟/h5;

    .line 53
    .line 54
    invoke-virtual {v7, v6}, L۟/h5;->ۥ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-object v7, v5, L۟/z7;->ۥ۟ۢ:L۟/fa;

    .line 59
    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    iget-object v7, v7, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 63
    .line 64
    invoke-virtual {v7, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    iget-object v7, v7, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 69
    .line 70
    invoke-virtual {v7, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    const/4 v6, 0x0

    .line 75
    :goto_2
    if-eqz v6, :cond_3

    .line 76
    .line 77
    sget-object v7, L۟/z7$e;->ۥ۟:L۟/z7$e;

    .line 78
    .line 79
    invoke-virtual {v5, v6, v7, v4}, L۟/z7;->ۥ۟(Landroid/graphics/Bitmap;L۟/z7$e;L۟/f;)V

    .line 80
    .line 81
    .line 82
    iget-boolean v5, v5, L۟/z7;->ۥ۟ۨ:Z

    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    iget-object v4, v4, L۟/f;->ۥ۟:L۟/w8;

    .line 87
    .line 88
    invoke-virtual {v4}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    invoke-virtual {v5, v4}, L۟/z7;->ۥ۟۟(L۟/f;)V

    .line 96
    .line 97
    .line 98
    iget-boolean v5, v5, L۟/z7;->ۥ۟ۨ:Z

    .line 99
    .line 100
    if-eqz v5, :cond_4

    .line 101
    .line 102
    iget-object v4, v4, L۟/f;->ۥ۟:L۟/w8;

    .line 103
    .line 104
    invoke-virtual {v4}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    :goto_3
    sget-object v4, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 108
    .line 109
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    new-instance v0, Ljava/lang/AssertionError;

    .line 113
    .line 114
    const-string v1, "Unknown handler message received: "

    .line 115
    .line 116
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget p1, p1, Landroid/os/Message;->what:I

    .line 121
    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    move v1, v2

    .line 142
    :goto_4
    if-ge v1, v0, :cond_f

    .line 143
    .line 144
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, L۟/c0;

    .line 149
    .line 150
    iget-object v5, v4, L۟/c0;->ۥ۟:L۟/z7;

    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v6, v4, L۟/c0;->ۥ۟ۧ:L۟/f;

    .line 156
    .line 157
    iget-object v7, v4, L۟/c0;->ۥ۟ۨ:Ljava/util/ArrayList;

    .line 158
    .line 159
    if-eqz v7, :cond_7

    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-nez v8, :cond_7

    .line 166
    .line 167
    move v8, v3

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    move v8, v2

    .line 170
    :goto_5
    if-nez v6, :cond_9

    .line 171
    .line 172
    if-eqz v8, :cond_8

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_8
    move v9, v2

    .line 176
    goto :goto_7

    .line 177
    :cond_9
    :goto_6
    move v9, v3

    .line 178
    :goto_7
    if-nez v9, :cond_a

    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_a
    iget-object v9, v4, L۟/c0;->ۥۣ۟:L۟/w8;

    .line 182
    .line 183
    iget-object v9, v9, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 184
    .line 185
    iget-object v9, v4, L۟/c0;->ۥ۠ۡ:Ljava/lang/Exception;

    .line 186
    .line 187
    iget-object v9, v4, L۟/c0;->ۥ۠:Landroid/graphics/Bitmap;

    .line 188
    .line 189
    iget-object v4, v4, L۟/c0;->ۥ۠۠:L۟/z7$e;

    .line 190
    .line 191
    if-eqz v6, :cond_b

    .line 192
    .line 193
    invoke-virtual {v5, v9, v4, v6}, L۟/z7;->ۥ۟(Landroid/graphics/Bitmap;L۟/z7$e;L۟/f;)V

    .line 194
    .line 195
    .line 196
    :cond_b
    if-eqz v8, :cond_c

    .line 197
    .line 198
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    move v8, v2

    .line 203
    :goto_8
    if-ge v8, v6, :cond_c

    .line 204
    .line 205
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    check-cast v10, L۟/f;

    .line 210
    .line 211
    invoke-virtual {v5, v9, v4, v10}, L۟/z7;->ۥ۟(Landroid/graphics/Bitmap;L۟/z7$e;L۟/f;)V

    .line 212
    .line 213
    .line 214
    add-int/lit8 v8, v8, 0x1

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_c
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    :goto_9
    add-int/lit8 v1, v1, 0x1

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p1, L۟/f;

    .line 226
    .line 227
    iget-object v0, p1, L۟/f;->ۥ:L۟/z7;

    .line 228
    .line 229
    iget-boolean v0, v0, L۟/z7;->ۥ۟ۨ:Z

    .line 230
    .line 231
    if-eqz v0, :cond_e

    .line 232
    .line 233
    iget-object v0, p1, L۟/f;->ۥ۟:L۟/w8;

    .line 234
    .line 235
    invoke-virtual {v0}, L۟/w8;->ۥ۟()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    sget-object v0, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 239
    .line 240
    :cond_e
    iget-object v0, p1, L۟/f;->ۥ:L۟/z7;

    .line 241
    .line 242
    invoke-virtual {p1}, L۟/f;->ۥ۟۠()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-virtual {v0, p1}, L۟/z7;->ۥ(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_f
    return-void
.end method
