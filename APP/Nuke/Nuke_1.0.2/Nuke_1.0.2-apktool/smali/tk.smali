.class public final Ltk;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg92;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 22
    iput p1, p0, Ltk;->a:I

    iput-object p2, p0, Ltk;->b:Ljava/lang/Object;

    iput-object p3, p0, Ltk;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ltk;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lwk;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Lwk;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ltk;->c:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Ltk;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lg92;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltk;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ltk;->c:Ljava/lang/Object;

    .line 25
    iput-object p2, p0, Ltk;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILov1;)Ld92;
    .locals 11

    .line 1
    iget v0, p0, Ltk;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v0, p0, Ltk;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, p1}, Lr83;->a(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/ImageDecoder$Source;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "UriBitmapDecoder"

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "decoding "

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p1, ", mimeType: "

    .line 49
    .line 50
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, ", ["

    .line 57
    .line 58
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p1, ", "

    .line 65
    .line 66
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p1, "]"

    .line 73
    .line 74
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    :cond_0
    iget-object p0, p0, Ltk;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Lwk;

    .line 87
    .line 88
    invoke-virtual {p0, v1, p2, p3, p4}, Lwk;->c(Landroid/graphics/ImageDecoder$Source;IILov1;)Lal;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_0
    check-cast p1, Ljava/io/InputStream;

    .line 94
    .line 95
    instance-of v0, p1, Lr62;

    .line 96
    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    check-cast p1, Lr62;

    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    move v2, v0

    .line 103
    goto :goto_0

    .line 104
    :cond_1
    new-instance v0, Lr62;

    .line 105
    .line 106
    iget-object v2, p0, Ltk;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ltd1;

    .line 109
    .line 110
    invoke-direct {v0, p1, v2}, Lr62;-><init>(Ljava/io/InputStream;Ltd1;)V

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    move v2, p1

    .line 115
    move-object p1, v0

    .line 116
    :goto_0
    sget-object v3, Lrg0;->j:Ljava/util/ArrayDeque;

    .line 117
    .line 118
    monitor-enter v3

    .line 119
    :try_start_0
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lrg0;

    .line 124
    .line 125
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 126
    if-nez v0, :cond_2

    .line 127
    .line 128
    new-instance v0, Lrg0;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 131
    .line 132
    .line 133
    :cond_2
    move-object v4, v0

    .line 134
    iput-object p1, v4, Lrg0;->h:Lr62;

    .line 135
    .line 136
    new-instance v0, Lye1;

    .line 137
    .line 138
    invoke-direct {v0, v4}, Lye1;-><init>(Lrg0;)V

    .line 139
    .line 140
    .line 141
    new-instance v10, Ldq1;

    .line 142
    .line 143
    const/16 v5, 0xf

    .line 144
    .line 145
    invoke-direct {v10, v5, p1, v4}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :try_start_1
    iget-object p0, p0, Ltk;->b:Ljava/lang/Object;

    .line 149
    .line 150
    move-object v5, p0

    .line 151
    check-cast v5, Lxa0;

    .line 152
    .line 153
    new-instance v6, Lb5;

    .line 154
    .line 155
    iget-object p0, v5, Lxa0;->d:Ljava/util/ArrayList;

    .line 156
    .line 157
    iget-object v7, v5, Lxa0;->c:Ltd1;

    .line 158
    .line 159
    invoke-direct {v6, v0, p0, v7}, Lb5;-><init>(Lye1;Ljava/util/ArrayList;Ltd1;)V

    .line 160
    .line 161
    .line 162
    move v7, p2

    .line 163
    move v8, p3

    .line 164
    move-object v9, p4

    .line 165
    invoke-virtual/range {v5 .. v10}, Lxa0;->a(Lb5;IILov1;Lwa0;)Lal;

    .line 166
    .line 167
    .line 168
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 169
    iput-object v1, v4, Lrg0;->i:Ljava/io/IOException;

    .line 170
    .line 171
    iput-object v1, v4, Lrg0;->h:Lr62;

    .line 172
    .line 173
    monitor-enter v3

    .line 174
    :try_start_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 178
    if-eqz v2, :cond_3

    .line 179
    .line 180
    invoke-virtual {p1}, Lr62;->c()V

    .line 181
    .line 182
    .line 183
    :cond_3
    return-object p0

    .line 184
    :catchall_0
    move-exception v0

    .line 185
    move-object p0, v0

    .line 186
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 187
    throw p0

    .line 188
    :catchall_1
    move-exception v0

    .line 189
    move-object p0, v0

    .line 190
    iput-object v1, v4, Lrg0;->i:Ljava/io/IOException;

    .line 191
    .line 192
    iput-object v1, v4, Lrg0;->h:Lr62;

    .line 193
    .line 194
    sget-object p2, Lrg0;->j:Ljava/util/ArrayDeque;

    .line 195
    .line 196
    monitor-enter p2

    .line 197
    :try_start_4
    invoke-virtual {p2, v4}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 201
    if-eqz v2, :cond_4

    .line 202
    .line 203
    invoke-virtual {p1}, Lr62;->c()V

    .line 204
    .line 205
    .line 206
    :cond_4
    throw p0

    .line 207
    :catchall_2
    move-exception v0

    .line 208
    move-object p0, v0

    .line 209
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 210
    throw p0

    .line 211
    :catchall_3
    move-exception v0

    .line 212
    move-object p0, v0

    .line 213
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 214
    throw p0

    .line 215
    :pswitch_1
    move v7, p2

    .line 216
    move v8, p3

    .line 217
    move-object v9, p4

    .line 218
    check-cast p1, Landroid/net/Uri;

    .line 219
    .line 220
    iget-object p2, p0, Ltk;->b:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p2, Li92;

    .line 223
    .line 224
    invoke-virtual {p2, p1, v9}, Li92;->c(Landroid/net/Uri;Lov1;)Ld92;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    if-nez p1, :cond_5

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_5
    check-cast p1, Lzo0;

    .line 232
    .line 233
    invoke-virtual {p1}, Lzo0;->get()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 238
    .line 239
    iget-object p0, p0, Ltk;->c:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p0, Lzk;

    .line 242
    .line 243
    invoke-static {p0, p1, v7, v8}, Lrp0;->W(Lzk;Landroid/graphics/drawable/Drawable;II)Lal;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    :goto_1
    return-object v1

    .line 248
    :pswitch_2
    move v7, p2

    .line 249
    move v8, p3

    .line 250
    move-object v9, p4

    .line 251
    iget-object p2, p0, Ltk;->b:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p2, Lg92;

    .line 254
    .line 255
    invoke-interface {p2, p1, v7, v8, v9}, Lg92;->a(Ljava/lang/Object;IILov1;)Ld92;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    iget-object p0, p0, Ltk;->c:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p0, Landroid/content/res/Resources;

    .line 262
    .line 263
    if-nez p1, :cond_6

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_6
    new-instance v1, Lal;

    .line 267
    .line 268
    invoke-direct {v1, p0, p1}, Lal;-><init>(Landroid/content/res/Resources;Ld92;)V

    .line 269
    .line 270
    .line 271
    :goto_2
    return-object v1

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;Lov1;)Z
    .locals 3

    .line 1
    iget v0, p0, Ltk;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Ltk;->b:Ljava/lang/Object;

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
    check-cast p0, Lg92;

    .line 76
    .line 77
    invoke-interface {p0, p1, p2}, Lg92;->b(Ljava/lang/Object;Lov1;)Z

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
