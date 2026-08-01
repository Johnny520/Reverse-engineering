.class public final synthetic Ls0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Ls0/o;

.field public final synthetic c:Li/t;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ls0/o;Li/t;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/n;->b:Ls0/o;

    iput-object p2, p0, Ls0/n;->c:Li/t;

    iput p3, p0, Ls0/n;->d:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 1
    sget-boolean p1, Lz0/i;->a:Z

    .line 2
    .line 3
    iget-object p1, p0, Ls0/n;->b:Ls0/o;

    .line 4
    .line 5
    const-string p2, "keys"

    .line 6
    .line 7
    iget-object p1, p1, Ls0/o;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {p1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v1, v0

    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_1

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-static {}, Lz0/g;->h()Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v1, 0x0

    .line 90
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/4 v3, 0x1

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Ljava/lang/String;

    .line 102
    .line 103
    invoke-interface {p2, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    move v1, v3

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    if-nez v1, :cond_5

    .line 112
    .line 113
    goto/16 :goto_5

    .line 114
    .line 115
    :cond_5
    invoke-static {}, Lz0/g;->g()Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, LF0/v;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {}, Lz0/g;->f()Ljava/util/Map;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1}, LF0/v;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_6

    .line 140
    .line 141
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, Ljava/lang/String;

    .line 146
    .line 147
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :catchall_0
    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_8

    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    check-cast v2, Ljava/lang/String;

    .line 166
    .line 167
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Ljava/lang/String;

    .line 172
    .line 173
    if-eqz v2, :cond_7

    .line 174
    .line 175
    sget-boolean v3, Lz0/i;->a:Z

    .line 176
    .line 177
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 178
    .line 179
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_8
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    sget-boolean v2, Lz0/i;->a:Z

    .line 195
    .line 196
    const-string v2, "hidden_self_sns_posts"

    .line 197
    .line 198
    invoke-interface {p1, v2, p2}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    new-instance p2, Lorg/json/JSONObject;

    .line 203
    .line 204
    invoke-direct {p2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    const-string v0, "hidden_self_sns_post_summaries"

    .line 212
    .line 213
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    new-instance p2, Lorg/json/JSONObject;

    .line 218
    .line 219
    invoke-direct {p2, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    const-string v0, "hidden_self_sns_post_images"

    .line 227
    .line 228
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-nez v3, :cond_9

    .line 237
    .line 238
    const-string p1, "removeHiddenSelfSnsPost fail"

    .line 239
    .line 240
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_9
    invoke-static {}, Lz0/g;->I()V

    .line 249
    .line 250
    .line 251
    :goto_5
    if-eqz v3, :cond_c

    .line 252
    .line 253
    iget-object p1, p0, Ls0/n;->c:Li/t;

    .line 254
    .line 255
    iget-object p2, p1, Li/t;->b:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p2, Ls0/g;

    .line 258
    .line 259
    const/4 v0, 0x0

    .line 260
    const-string v1, "listAdapter"

    .line 261
    .line 262
    if-eqz p2, :cond_b

    .line 263
    .line 264
    iget-object p2, p2, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 265
    .line 266
    iget v2, p0, Ls0/n;->d:I

    .line 267
    .line 268
    invoke-virtual {p2, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    iget-object p2, p1, Li/t;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast p2, Ls0/g;

    .line 274
    .line 275
    if-eqz p2, :cond_a

    .line 276
    .line 277
    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1}, Li/t;->n()V

    .line 281
    .line 282
    .line 283
    const-string p1, "\u5df2\u6062\u590d"

    .line 284
    .line 285
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_a
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :cond_b
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw v0

    .line 297
    :cond_c
    const-string p1, "\u6062\u590d\u5931\u8d25"

    .line 298
    .line 299
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    :goto_6
    return-void
.end method
