.class public final Lyyds/ᛳᛵᛳᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛲᲈᲁ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lyyds/ᛷᛴᛴᛲ;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Lyyds/ᛷᛴᛴᛲ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᛳᛵᛳᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lyyds/ᛳᛵᛳᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lyyds/ᛴᛲᲈᲁ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛲᲈᲁ:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lyyds/ᛳᛵᛳᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 25
    iput-object p2, p0, Lyyds/ᛳᛵᛳᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 22
    iput p2, p0, Lyyds/ᛳᛵᛳᛲ;->ᛲᲈᲁ:I

    iput-object p1, p0, Lyyds/ᛳᛵᛳᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛳᛵᛳᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;Lyyds/ᛴᛳᲀᲈ;)Z
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "android.resource"

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Landroid/net/Uri;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const-string v0, "content"

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "file"

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    :cond_0
    check-cast p0, Landroid/content/Context;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    const-string p1, "image/gif"

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    :cond_1
    const/4 v1, 0x0

    .line 60
    :cond_2
    return v1

    .line 61
    :pswitch_0
    check-cast p1, Ljava/io/InputStream;

    .line 62
    .line 63
    return v1

    .line 64
    :pswitch_1
    check-cast p1, Landroid/net/Uri;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0

    .line 75
    :pswitch_2
    check-cast p0, Lyyds/ᛴᛲᲈᲁ;

    .line 76
    .line 77
    invoke-interface {p0, p1, p2}, Lyyds/ᛴᛲᲈᲁ;->ᛲᲈᲁ(Ljava/lang/Object;Lyyds/ᛴᛳᲀᲈ;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    return p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;
    .locals 12

    .line 1
    move-object/from16 v4, p4

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛲᲈᲁ:I

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1, p1}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/ImageDecoder$Source;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v5, "UriBitmapDecoder"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v7, "decoding "

    .line 43
    .line 44
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, ", mimeType: "

    .line 51
    .line 52
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p1, ", ["

    .line 59
    .line 60
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p1, ", "

    .line 67
    .line 68
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, "]"

    .line 75
    .line 76
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {v5, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    :cond_0
    iget-object p0, p0, Lyyds/ᛳᛵᛳᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, Lyyds/ᛷᛴᛴᛲ;

    .line 89
    .line 90
    invoke-virtual {p0, v1, p2, p3, v4}, Lyyds/ᛷᛴᛴᛲ;->ᲀᛲᛳᲀ(Landroid/graphics/ImageDecoder$Source;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛳᛸᛵᲈ;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_0
    check-cast p1, Ljava/io/InputStream;

    .line 96
    .line 97
    instance-of v0, p1, Lyyds/ᛴᛴᛸᲈ;

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    check-cast p1, Lyyds/ᛴᛴᛸᲈ;

    .line 103
    .line 104
    move v7, v1

    .line 105
    goto :goto_0

    .line 106
    :cond_1
    new-instance v0, Lyyds/ᛴᛴᛸᲈ;

    .line 107
    .line 108
    iget-object v5, p0, Lyyds/ᛳᛵᛳᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Lyyds/ᲁᛶᲇᛱ;

    .line 111
    .line 112
    invoke-direct {v0, p1, v5}, Lyyds/ᛴᛴᛸᲈ;-><init>(Ljava/io/InputStream;Lyyds/ᲁᛶᲇᛱ;)V

    .line 113
    .line 114
    .line 115
    const/4 p1, 0x1

    .line 116
    move v7, p1

    .line 117
    move-object p1, v0

    .line 118
    :goto_0
    sget-object v8, Lyyds/ᛸᛲᛳᲈ;->ᛲᛴᛳᛲ:Ljava/util/ArrayDeque;

    .line 119
    .line 120
    monitor-enter v8

    .line 121
    :try_start_0
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Lyyds/ᛸᛲᛳᲈ;

    .line 126
    .line 127
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 128
    if-nez v0, :cond_2

    .line 129
    .line 130
    new-instance v0, Lyyds/ᛸᛲᛳᲈ;

    .line 131
    .line 132
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 133
    .line 134
    .line 135
    :cond_2
    move-object v9, v0

    .line 136
    iput-object p1, v9, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 137
    .line 138
    new-instance v0, Lyyds/ᲈᲀᲀᛱ;

    .line 139
    .line 140
    invoke-direct {v0, v9}, Lyyds/ᲈᲀᲀᛱ;-><init>(Lyyds/ᛸᛲᛳᲈ;)V

    .line 141
    .line 142
    .line 143
    new-instance v5, Lyyds/ᛱᛵᛱᛱ;

    .line 144
    .line 145
    const/16 v10, 0xc

    .line 146
    .line 147
    invoke-direct {v5, v10, p1, v9, v1}, Lyyds/ᛱᛵᛱᛱ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 148
    .line 149
    .line 150
    :try_start_1
    iget-object p0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, Lyyds/ᲈᛷᲀᲈ;

    .line 153
    .line 154
    new-instance v1, Lyyds/ᛳᛷᲀᛴ;

    .line 155
    .line 156
    iget-object v10, p0, Lyyds/ᲈᛷᲀᲈ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 157
    .line 158
    iget-object v11, p0, Lyyds/ᲈᛷᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲇᛱ;

    .line 159
    .line 160
    invoke-direct {v1, v0, v10, v11}, Lyyds/ᛳᛷᲀᛴ;-><init>(Lyyds/ᲈᲀᲀᛱ;Ljava/util/ArrayList;Lyyds/ᲁᛶᲇᛱ;)V

    .line 161
    .line 162
    .line 163
    move-object v0, p0

    .line 164
    move v2, p2

    .line 165
    move v3, p3

    .line 166
    invoke-virtual/range {v0 .. v5}, Lyyds/ᲈᛷᲀᲈ;->ᛲᲈᲁ(Lyyds/ᛳᛷᲀᛴ;IILyyds/ᛴᛳᲀᲈ;Lyyds/ᲈᛲᲈᛲ;)Lyyds/ᛳᛸᛵᲈ;

    .line 167
    .line 168
    .line 169
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    iput-object v6, v9, Lyyds/ᛸᛲᛳᲈ;->ᲇᲈᛵᛷ:Ljava/io/IOException;

    .line 171
    .line 172
    iput-object v6, v9, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 173
    .line 174
    monitor-enter v8

    .line 175
    :try_start_2
    invoke-virtual {v8, v9}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 179
    if-eqz v7, :cond_3

    .line 180
    .line 181
    invoke-virtual {p1}, Lyyds/ᛴᛴᛸᲈ;->ᲇᲇᲇᛱ()V

    .line 182
    .line 183
    .line 184
    :cond_3
    return-object p0

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    move-object p0, v0

    .line 187
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 188
    throw p0

    .line 189
    :catchall_1
    move-exception v0

    .line 190
    move-object p0, v0

    .line 191
    iput-object v6, v9, Lyyds/ᛸᛲᛳᲈ;->ᲇᲈᛵᛷ:Ljava/io/IOException;

    .line 192
    .line 193
    iput-object v6, v9, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 194
    .line 195
    sget-object v1, Lyyds/ᛸᛲᛳᲈ;->ᛲᛴᛳᛲ:Ljava/util/ArrayDeque;

    .line 196
    .line 197
    monitor-enter v1

    .line 198
    :try_start_4
    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 202
    if-eqz v7, :cond_4

    .line 203
    .line 204
    invoke-virtual {p1}, Lyyds/ᛴᛴᛸᲈ;->ᲇᲇᲇᛱ()V

    .line 205
    .line 206
    .line 207
    :cond_4
    throw p0

    .line 208
    :catchall_2
    move-exception v0

    .line 209
    move-object p0, v0

    .line 210
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 211
    throw p0

    .line 212
    :catchall_3
    move-exception v0

    .line 213
    move-object p0, v0

    .line 214
    :try_start_6
    monitor-exit v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 215
    throw p0

    .line 216
    :pswitch_1
    check-cast p1, Landroid/net/Uri;

    .line 217
    .line 218
    iget-object v0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Lyyds/ᛱᛱᲀ;

    .line 221
    .line 222
    invoke-virtual {v0, p1, v4}, Lyyds/ᛱᛱᲀ;->ᲀᛲᛳᲀ(Landroid/net/Uri;Lyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-nez p1, :cond_5

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_5
    check-cast p1, Lyyds/ᛴᲈᲇᛸ;

    .line 230
    .line 231
    invoke-virtual {p1}, Lyyds/ᛴᲈᲇᛸ;->get()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 236
    .line 237
    iget-object p0, p0, Lyyds/ᛳᛵᛳᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p0, Lyyds/ᲈᛱᛸᛴ;

    .line 240
    .line 241
    invoke-static {p0, p1, p2, p3}, Lyyds/ᛴᛲᛴᛲ;->ᛶᛷᛲᲁ(Lyyds/ᲈᛱᛸᛴ;Landroid/graphics/drawable/Drawable;II)Lyyds/ᛳᛸᛵᲈ;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    :goto_1
    return-object v6

    .line 246
    :pswitch_2
    iget-object v0, p0, Lyyds/ᛳᛵᛳᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Lyyds/ᛴᛲᲈᲁ;

    .line 249
    .line 250
    invoke-interface {v0, p1, p2, p3, v4}, Lyyds/ᛴᛲᲈᲁ;->ᛵᛸᛸᛷ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iget-object p0, p0, Lyyds/ᛳᛵᛳᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p0, Landroid/content/res/Resources;

    .line 257
    .line 258
    if-nez p1, :cond_6

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_6
    new-instance v6, Lyyds/ᛳᛸᛵᲈ;

    .line 262
    .line 263
    invoke-direct {v6, p0, p1}, Lyyds/ᛳᛸᛵᲈ;-><init>(Landroid/content/res/Resources;Lyyds/ᲁᛱᛸᛵ;)V

    .line 264
    .line 265
    .line 266
    :goto_2
    return-object v6

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
