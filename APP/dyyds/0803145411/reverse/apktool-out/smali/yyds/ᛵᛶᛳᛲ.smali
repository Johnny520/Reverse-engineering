.class public final Lyyds/ᛵᛶᛳᛲ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛳᛶᲁ:I

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᛲᲈᛱ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᲇᲀ:Ljava/lang/Object;

.field public final synthetic ᛷᲈᲈᲁ:Ljava/lang/Object;


# direct methods
.method public native constructor <init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;ILyyds/ᛶᛲᛴᛷ;Lyyds/ᛲᛱᛶᛸ;)V
.end method

.method public constructor <init>(Lyyds/ᲁᲇᲈᲁ;Ljava/io/File;Lyyds/ᛱᛶᛵᛲ;ILyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛵᛶᛳᛲ;->ᛶᛷᛲᲁ:I

    .line 17
    iput-object p1, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    iput p4, p0, Lyyds/ᛵᛶᛳᛲ;->ᛲᛳᛶᲁ:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lyyds/ᛵᛶᛳᛲ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Lyyds/ᛵᛶᛳᛲ;->ᛲᛳᛶᲁ:I

    .line 7
    .line 8
    iget-object v4, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object v6, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object v8, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v8, Lyyds/ᛶᛲᛴᛷ;

    .line 22
    .line 23
    iget v0, p0, Lyyds/ᛵᛶᛳᛲ;->ᛱᲈᲁ:I

    .line 24
    .line 25
    const/16 v10, 0xa

    .line 26
    .line 27
    const/4 v11, 0x3

    .line 28
    const/4 v12, 0x2

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    if-eq v0, v7, :cond_2

    .line 32
    .line 33
    if-eq v0, v12, :cond_1

    .line 34
    .line 35
    if-ne v0, v11, :cond_0

    .line 36
    .line 37
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_0
    const-wide p0, -0x5479fe68a836eL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object v1, v9

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    :try_start_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :catch_0
    move-exception p1

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :try_start_1
    check-cast v5, Lyyds/ᲀᲈᛶᲈ;

    .line 72
    .line 73
    iget-object p1, v5, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lyyds/ᛲᛶᲀᛱ;

    .line 76
    .line 77
    check-cast v4, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v4}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput v7, p0, Lyyds/ᛵᛶᛳᛲ;->ᛱᲈᲁ:I

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const-wide v4, -0x4f59ee68a836eL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iget-object p1, p1, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 102
    .line 103
    new-instance v5, Lyyds/ᛶᛳᲇᲈ;

    .line 104
    .line 105
    invoke-direct {v5, v4, v3, v0}, Lyyds/ᛶᛳᲇᲈ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1, p0, v5, v7, v2}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v6, :cond_4

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 116
    .line 117
    new-instance v0, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-static {p1, v10}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_5

    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Lyyds/ᲁᛳᲇᛸ;

    .line 141
    .line 142
    new-instance v3, Lyyds/ᲁᛵᛶ;

    .line 143
    .line 144
    iget-object v4, v2, Lyyds/ᲁᛳᲇᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 145
    .line 146
    iget v2, v2, Lyyds/ᲁᛳᲇᛸ;->ᛵᛸᛸᛷ:I

    .line 147
    .line 148
    invoke-direct {v3, v4, v2}, Lyyds/ᲁᛵᛶ;-><init>(Ljava/lang/String;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    sget-object p1, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 156
    .line 157
    sget-object p1, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 158
    .line 159
    new-instance v2, Lyyds/ᲇᲈᲈᛶ;

    .line 160
    .line 161
    const/16 v3, 0xe

    .line 162
    .line 163
    invoke-direct {v2, v8, v0, v9, v3}, Lyyds/ᲇᲈᲈᛶ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 164
    .line 165
    .line 166
    iput v12, p0, Lyyds/ᛵᛶᛳᛲ;->ᛱᲈᲁ:I

    .line 167
    .line 168
    invoke-static {p1, v2, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 172
    if-ne p0, v6, :cond_6

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :goto_2
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 176
    .line 177
    const-wide v2, -0x5479ae68a836eL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v0, v2, p1}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    sget-object p1, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 190
    .line 191
    sget-object p1, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 192
    .line 193
    new-instance v0, Lyyds/ᛴᛵᛵᛸ;

    .line 194
    .line 195
    invoke-direct {v0, v8, v9, v10}, Lyyds/ᛴᛵᛵᛸ;-><init>(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 196
    .line 197
    .line 198
    iput v11, p0, Lyyds/ᛵᛶᛳᛲ;->ᛱᲈᲁ:I

    .line 199
    .line 200
    invoke-static {p1, v0, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    if-ne p0, v6, :cond_6

    .line 205
    .line 206
    :goto_3
    move-object v1, v6

    .line 207
    :cond_6
    :goto_4
    return-object v1

    .line 208
    :pswitch_0
    check-cast v8, Lyyds/ᛱᛶᛵᛲ;

    .line 209
    .line 210
    check-cast v4, Ljava/io/File;

    .line 211
    .line 212
    check-cast v5, Lyyds/ᲁᲇᲈᲁ;

    .line 213
    .line 214
    iget v0, p0, Lyyds/ᛵᛶᛳᛲ;->ᛱᲈᲁ:I

    .line 215
    .line 216
    if-eqz v0, :cond_8

    .line 217
    .line 218
    if-ne v0, v7, :cond_7

    .line 219
    .line 220
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_7
    const-wide p0, -0xad1ae68a836eL

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    move-object v1, v9

    .line 237
    goto :goto_6

    .line 238
    :cond_8
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    sget-object p1, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 242
    .line 243
    sget-object p1, Lyyds/ᲇᛷᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;

    .line 244
    .line 245
    new-instance v0, Lyyds/ᲇᲈᲈᛶ;

    .line 246
    .line 247
    invoke-direct {v0, v5, v4, v9, v2}, Lyyds/ᲇᲈᲈᛶ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 248
    .line 249
    .line 250
    iput v7, p0, Lyyds/ᛵᛶᛳᛲ;->ᛱᲈᲁ:I

    .line 251
    .line 252
    invoke-static {p1, v0, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-ne p1, v6, :cond_9

    .line 257
    .line 258
    move-object v1, v6

    .line 259
    goto :goto_6

    .line 260
    :cond_9
    :goto_5
    check-cast p1, Ljava/lang/String;

    .line 261
    .line 262
    iget-object p0, v5, Lyyds/ᲁᲇᲈᲁ;->ᛲᛳᛶᲁ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v8}, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ()I

    .line 272
    .line 273
    .line 274
    move-result p0

    .line 275
    if-ne p0, v3, :cond_a

    .line 276
    .line 277
    iget-object p0, v8, Lyyds/ᛱᛶᛵᛲ;->ᛵᲀᲈᛴ:Landroid/widget/TextView;

    .line 278
    .line 279
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    .line 281
    .line 282
    :cond_a
    :goto_6
    return-object v1

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 10

    .line 1
    iget p1, p0, Lyyds/ᛵᛶᛳᛲ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, Lyyds/ᛵᛶᛳᛲ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v3, Lyyds/ᛵᛶᛳᛲ;

    .line 13
    .line 14
    move-object v4, v2

    .line 15
    check-cast v4, Lyyds/ᲀᲈᛶᲈ;

    .line 16
    .line 17
    move-object v5, v1

    .line 18
    check-cast v5, Ljava/lang/String;

    .line 19
    .line 20
    iget v6, p0, Lyyds/ᛵᛶᛳᛲ;->ᛲᛳᛶᲁ:I

    .line 21
    .line 22
    move-object v7, v0

    .line 23
    check-cast v7, Lyyds/ᛶᛲᛴᛷ;

    .line 24
    .line 25
    move-object v8, p2

    .line 26
    invoke-direct/range {v3 .. v8}, Lyyds/ᛵᛶᛳᛲ;-><init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;ILyyds/ᛶᛲᛴᛷ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_0
    move-object v8, p2

    .line 31
    new-instance v4, Lyyds/ᛵᛶᛳᛲ;

    .line 32
    .line 33
    move-object v5, v2

    .line 34
    check-cast v5, Lyyds/ᲁᲇᲈᲁ;

    .line 35
    .line 36
    move-object v6, v1

    .line 37
    check-cast v6, Ljava/io/File;

    .line 38
    .line 39
    move-object v7, v0

    .line 40
    check-cast v7, Lyyds/ᛱᛶᛵᛲ;

    .line 41
    .line 42
    iget p0, p0, Lyyds/ᛵᛶᛳᛲ;->ᛲᛳᛶᲁ:I

    .line 43
    .line 44
    move-object v9, v8

    .line 45
    move v8, p0

    .line 46
    invoke-direct/range {v4 .. v9}, Lyyds/ᛵᛶᛳᛲ;-><init>(Lyyds/ᲁᲇᲈᲁ;Ljava/io/File;Lyyds/ᛱᛶᛵᛲ;ILyyds/ᛲᛱᛶᛸ;)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛵᛶᛳᛲ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 6
    .line 7
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛶᛳᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛵᛶᛳᛲ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛵᛶᛳᛲ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛶᛳᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᛵᛶᛳᛲ;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᛵᛶᛳᛲ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
