.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->installProxyCaptureHook(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $interfaceMethod:Ljava/lang/reflect/Method;

.field final synthetic $this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lk01;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->access$getSelfInvoking$p()Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$selfInvoking$1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    move-object/from16 v1, p1

    .line 25
    .line 26
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_1
    array-length v2, v1

    .line 33
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    array-length v3, v3

    .line 40
    if-eq v2, v3, :cond_2

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_2
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 45
    .line 46
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->access$getReplyListParamNames$p()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v2, v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveParamNames(Ljava/lang/reflect/Method;Ljava/util/List;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const-string v3, "comment_id"

    .line 57
    .line 58
    invoke-interface {v8, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const-string v4, "item_id"

    .line 63
    .line 64
    invoke-interface {v8, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    const-string v5, "insert_ids"

    .line 69
    .line 70
    invoke-interface {v8, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const-string v6, "top_ids"

    .line 75
    .line 76
    invoke-interface {v8, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v6, "channel_id"

    .line 81
    .line 82
    invoke-interface {v8, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v6, "service_id"

    .line 87
    .line 88
    invoke-interface {v8, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v6, "comment_scene"

    .line 93
    .line 94
    invoke-interface {v8, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    invoke-static {v3, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    instance-of v6, v3, Ljava/lang/String;

    .line 103
    .line 104
    const/4 v15, 0x0

    .line 105
    if-eqz v6, :cond_3

    .line 106
    .line 107
    check-cast v3, Ljava/lang/String;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    move-object v3, v15

    .line 111
    :goto_0
    invoke-static {v4, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    instance-of v6, v4, Ljava/lang/String;

    .line 116
    .line 117
    if-eqz v6, :cond_4

    .line 118
    .line 119
    check-cast v4, Ljava/lang/String;

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    move-object v4, v15

    .line 123
    :goto_1
    invoke-static {v5, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    instance-of v6, v5, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v6, :cond_5

    .line 130
    .line 131
    check-cast v5, Ljava/lang/String;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    move-object v5, v15

    .line 135
    :goto_2
    if-eqz v3, :cond_7

    .line 136
    .line 137
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_6

    .line 142
    .line 143
    goto/16 :goto_3

    .line 144
    .line 145
    :cond_6
    move-object v6, v5

    .line 146
    new-instance v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

    .line 147
    .line 148
    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 149
    .line 150
    invoke-virtual {v2, v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v1}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 159
    .line 160
    .line 161
    move-result-wide v9

    .line 162
    move-object/from16 v16, v6

    .line 163
    .line 164
    move-object v6, v2

    .line 165
    move-object/from16 v2, v16

    .line 166
    .line 167
    invoke-direct/range {v5 .. v10}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V

    .line 168
    .line 169
    .line 170
    invoke-static {v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->access$setCapturedProfile$p(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->access$getLastCaptureLogAt$p()J

    .line 178
    .line 179
    .line 180
    move-result-wide v7

    .line 181
    sub-long v7, v5, v7

    .line 182
    .line 183
    const-wide/16 v9, 0x7530

    .line 184
    .line 185
    cmp-long v7, v7, v9

    .line 186
    .line 187
    if-lez v7, :cond_7

    .line 188
    .line 189
    invoke-static {v5, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->access$setLastCaptureLogAt$p(J)V

    .line 190
    .line 191
    .line 192
    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 193
    .line 194
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    iget-object v0, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v11, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-static {v12, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-static {v13, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-static {v14, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const-string v9, "#"

    .line 225
    .line 226
    const-string v10, ", commentId="

    .line 227
    .line 228
    const-string v11, "captured host reply list request, method="

    .line 229
    .line 230
    invoke-static {v11, v5, v9, v0, v10}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const-string v5, ", itemId="

    .line 235
    .line 236
    const-string v9, ", insertIds="

    .line 237
    .line 238
    invoke-static {v0, v3, v5, v4, v9}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v2, ", topIds="

    .line 245
    .line 246
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v2, ", channelId="

    .line 253
    .line 254
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v2, ", serviceId="

    .line 261
    .line 262
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string v2, ", scene="

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const/4 v1, 0x4

    .line 281
    const-string v2, "r70ac498a2ca77555"

    .line 282
    .line 283
    invoke-static {v2, v0, v15, v1, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_7
    :goto_3
    return-void
.end method
