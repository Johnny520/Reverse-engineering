.class public final synthetic Lcom/ss/android/ugc/awemes/ᛲᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ss/android/ugc/awemes/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 5
    .line 6
    iput p2, p0, Lcom/ss/android/ugc/awemes/ᛲᲈᲁ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 2
    .line 3
    iget p0, p0, Lcom/ss/android/ugc/awemes/ᛲᲈᲁ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    sget-object v1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛳᲁᲁᲇ()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_9

    .line 20
    .line 21
    iget v2, v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᲀᛲᲀ:I

    .line 22
    .line 23
    if-eq p0, v2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    move-object v4, v3

    .line 47
    check-cast v4, Lcom/ss/android/ugc/awemes/MainActivity$ᛲᲈᲁ;

    .line 48
    .line 49
    invoke-virtual {v4}, Lcom/ss/android/ugc/awemes/MainActivity$ᛲᲈᲁ;->ᛲᲈᲁ()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v5}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_1

    .line 58
    .line 59
    invoke-virtual {v4}, Lcom/ss/android/ugc/awemes/MainActivity$ᛲᲈᲁ;->ᛵᛸᛸᛷ()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v1

    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    move-object v4, v3

    .line 96
    check-cast v4, Lcom/ss/android/ugc/awemes/MainActivity$ᛲᲈᲁ;

    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/ss/android/ugc/awemes/MainActivity$ᛲᲈᲁ;->ᛲᲈᲁ()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-nez v5, :cond_3

    .line 107
    .line 108
    new-instance v5, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_3
    check-cast v5, Ljava/util/List;

    .line 117
    .line 118
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-static {v3}, Lyyds/ᲁᲈᛶᛴ;->ᛳᛸᛴᛶ(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_6

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    move-object v4, v3

    .line 154
    check-cast v4, Ljava/util/Map$Entry;

    .line 155
    .line 156
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v3, Ljava/util/Map$Entry;

    .line 161
    .line 162
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Ljava/lang/Iterable;

    .line 167
    .line 168
    new-instance v5, Ljava/util/ArrayList;

    .line 169
    .line 170
    const/16 v6, 0xa

    .line 171
    .line 172
    invoke-static {v3, v6}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_5

    .line 188
    .line 189
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    check-cast v6, Lcom/ss/android/ugc/awemes/MainActivity$ᛲᲈᲁ;

    .line 194
    .line 195
    invoke-virtual {v6}, Lcom/ss/android/ugc/awemes/MainActivity$ᛲᲈᲁ;->ᛵᛸᛸᛷ()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_5
    invoke-static {v5}, Lyyds/ᛷᛷᛶᲇ;->ᛵᲀᛵᛸ(Ljava/util/AbstractList;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-static {v3}, Lyyds/ᛷᛷᛶᲇ;->ᛲᲀᛲᛲ(Ljava/util/Collection;)Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_6
    invoke-virtual {v0, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᛶᛲᲀ(Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {v3}, Ljava/lang/Thread;->isInterrupted()Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-nez v3, :cond_9

    .line 228
    .line 229
    iget v3, v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᲀᛲᲀ:I

    .line 230
    .line 231
    if-eq p0, v3, :cond_7

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_7
    new-instance v3, Lyyds/ᲇᲇᛸᛵ;

    .line 235
    .line 236
    invoke-direct {v3, p0, v0, v1, v2}, Lyyds/ᲇᲇᛸᛵ;-><init>(ILcom/ss/android/ugc/awemes/MainActivity;Ljava/util/List;Ljava/util/LinkedHashMap;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :goto_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-nez v2, :cond_9

    .line 252
    .line 253
    iget v2, v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᲀᛲᲀ:I

    .line 254
    .line 255
    if-eq p0, v2, :cond_8

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_8
    const-wide v2, -0xf84ce68a836eL

    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    const-wide v3, -0xee9be68a836eL

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    const-wide v3, -0xeea3e68a836eL

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-static {v3, v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 285
    .line 286
    .line 287
    new-instance v2, Lyyds/ᛷᲇᲇᛲ;

    .line 288
    .line 289
    invoke-direct {v2, p0, v0, v1}, Lyyds/ᛷᲇᲇᛲ;-><init>(ILcom/ss/android/ugc/awemes/MainActivity;Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 293
    .line 294
    .line 295
    :cond_9
    :goto_5
    return-void
.end method
