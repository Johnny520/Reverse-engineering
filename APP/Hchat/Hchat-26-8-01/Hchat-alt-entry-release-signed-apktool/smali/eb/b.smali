.class public final synthetic Leb/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk8/n;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Leb/b;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lk8/o;)V
    .locals 7

    .line 1
    iget v0, p0, Leb/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Leb/k;->a:Leb/k;

    .line 7
    .line 8
    new-instance v0, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;-><init>(Lk8/o;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Leb/k;->i(Lh/Hchat/hooks/items/script/ScriptMessageBean;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    sget-object v0, Leb/d;->a:Leb/d;

    .line 18
    .line 19
    new-instance v0, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;-><init>(Lk8/o;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isSystem()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_f

    .line 29
    .line 30
    invoke-virtual {v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isGroupChat()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_1
    invoke-virtual {v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getXml()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getContent()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_3

    .line 85
    .line 86
    const/16 v3, 0xa

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const/4 v4, 0x0

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    goto/16 :goto_1

    .line 106
    .line 107
    :cond_4
    sget-object v3, Leb/d;->f:Ljava/util/List;

    .line 108
    .line 109
    if-eqz v3, :cond_5

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :cond_5
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_c

    .line 128
    .line 129
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Ljava/lang/String;

    .line 134
    .line 135
    const/4 v6, 0x1

    .line 136
    invoke-static {v2, v5, v6}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_6

    .line 141
    .line 142
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_7

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_7
    sget-object v3, Leb/d;->g:Ljava/util/List;

    .line 150
    .line 151
    if-eqz v3, :cond_8

    .line 152
    .line 153
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_8

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_8
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_a

    .line 169
    .line 170
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    check-cast v5, Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v2, v5, v6}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_9

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_a
    :goto_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 184
    .line 185
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-static {v1, v2}, Leb/d;->c(Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v0, v2}, Leb/d;->c(Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    check-cast v0, Ljava/lang/Iterable;

    .line 202
    .line 203
    new-instance v1, Ldg/n;

    .line 204
    .line 205
    const/4 v2, 0x6

    .line 206
    invoke-direct {v1, v0, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 207
    .line 208
    .line 209
    new-instance v0, Le9/h;

    .line 210
    .line 211
    invoke-direct {v0, v2}, Le9/h;-><init>(I)V

    .line 212
    .line 213
    .line 214
    invoke-static {v1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    new-instance v1, Lca/s;

    .line 219
    .line 220
    invoke-direct {v1, p1, v6}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 221
    .line 222
    .line 223
    new-instance v2, Lng/i;

    .line 224
    .line 225
    invoke-direct {v2, v0, v6, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v2}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_b

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_b
    new-instance v4, Leb/c;

    .line 240
    .line 241
    invoke-direct {v4, p1, v0}, Leb/c;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 242
    .line 243
    .line 244
    :cond_c
    :goto_1
    if-eqz v4, :cond_f

    .line 245
    .line 246
    iget-object v0, v4, Leb/c;->b:Ljava/util/List;

    .line 247
    .line 248
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_f

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, Lsf/e;

    .line 263
    .line 264
    iget-object v2, v1, Lsf/e;->g:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v2, Ljava/lang/String;

    .line 267
    .line 268
    iget-object v1, v1, Lsf/e;->h:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v1, Ljava/lang/String;

    .line 271
    .line 272
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_d

    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_d
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-nez v3, :cond_e

    .line 284
    .line 285
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    if-nez v3, :cond_e

    .line 290
    .line 291
    sget-object v3, Leb/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 292
    .line 293
    invoke-static {p1, v2}, Leb/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-virtual {v3, v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    :cond_e
    invoke-static {p1, v2}, Leb/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    const-string v3, "join"

    .line 305
    .line 306
    invoke-static {v3, p1, v2, v1}, Leb/d;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_2

    .line 310
    :cond_f
    :goto_3
    return-void

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
