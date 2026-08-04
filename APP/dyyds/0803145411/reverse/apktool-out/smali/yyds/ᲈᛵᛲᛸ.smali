.class public final Lyyds/ᲈᛵᛲᛸ;
.super Lyyds/ᛱᛶᛶᲇ;


# static fields
.field public static final ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᲈᛵᛲᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x376d6e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᲈᛵᛲᛸ;

    .line 10
    .line 11
    invoke-direct {v0}, Lyyds/ᛱᛶᛶᲇ;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᲈᛵᛲᛸ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛵᛲᛸ;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lyyds/ᲈᛵᛲᛸ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final ᲇᲇᲇᛱ()V
    .locals 11

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 2
    .line 3
    const-wide v0, -0x24856e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, -0x24871e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lyyds/ᛳᲈᲁᲀ;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v0, v2}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v1

    .line 32
    :goto_0
    const-wide v2, -0x2487ae68a836eL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-wide v3, -0x24899e68a836eL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lyyds/ᛷᛶᲇᲁ;->ᛲᛴᛳᛲ(Ljava/lang/String;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lyyds/ᛳᲈᲁᲀ;

    .line 73
    .line 74
    sget-object v5, Lyyds/ᲈᛵᛲᛸ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛵᛲᛸ;

    .line 75
    .line 76
    :try_start_0
    invoke-virtual {v5}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v4, v5}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    goto :goto_2

    .line 85
    :catchall_0
    move-exception v5

    .line 86
    new-instance v6, Lyyds/ᲈᛵᛵᛴ;

    .line 87
    .line 88
    invoke-direct {v6, v5}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object v5, v6

    .line 92
    :goto_2
    invoke-static {v5}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    sget-object v7, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 99
    .line 100
    new-instance v8, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-wide v9, -0x37649e68a836eL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v7, v4, v6}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    :cond_2
    instance-of v4, v5, Lyyds/ᲈᛵᛵᛴ;

    .line 125
    .line 126
    if-eqz v4, :cond_3

    .line 127
    .line 128
    move-object v5, v1

    .line 129
    :cond_3
    check-cast v5, Ljava/lang/reflect/Method;

    .line 130
    .line 131
    if-eqz v5, :cond_1

    .line 132
    .line 133
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    new-instance v2, Ljava/util/HashSet;

    .line 138
    .line 139
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v4, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    :cond_5
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_6

    .line 156
    .line 157
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    move-object v6, v5

    .line 162
    check-cast v6, Ljava/lang/reflect/Method;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_5

    .line 173
    .line 174
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_7

    .line 187
    .line 188
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Ljava/lang/reflect/Method;

    .line 193
    .line 194
    sget-object v5, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 195
    .line 196
    sget-object v5, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 197
    .line 198
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-static {}, Lyyds/ᲈᛷᛵᛷ;->ᛱᛳᲇ()Lcom/ss/android/ugc/awemes/wrapper/ModuleMainWrapper;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-virtual {v5, v3}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    new-instance v5, Lyyds/ᲀᛷᲈᲀ;

    .line 210
    .line 211
    const/4 v6, 0x1

    .line 212
    invoke-direct {v5, v6}, Lyyds/ᲀᛷᲈᲀ;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v3, v5}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    const-wide v5, -0x37659e68a836eL

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    sget-object v5, Lyyds/ᛱᛷᲀᲈ;->ᛲᲈᲁ:Lyyds/ᛱᛷᲀᲈ;

    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {v3}, Lyyds/ᛱᛷᲀᲈ;->ᛲᲈᲁ(Lio/github/libxposed/api/XposedInterface$HookHandle;)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_7
    if-eqz v0, :cond_8

    .line 237
    .line 238
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-nez v2, :cond_8

    .line 243
    .line 244
    new-instance v2, Lyyds/ᛴᲁᛴᛱ;

    .line 245
    .line 246
    const/16 v3, 0xf

    .line 247
    .line 248
    invoke-direct {v2, v3}, Lyyds/ᛴᲁᛴᛱ;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v0, v1, v2}, Lyyds/ᛱᛶᛶᲇ;->ᛱᛳᲇ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 252
    .line 253
    .line 254
    :cond_8
    sget-object v0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 255
    .line 256
    const-wide v2, -0x248a2e68a836eL

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    const-wide v4, -0x248c4e68a836eL

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    invoke-static {v2, v3, v4, v5}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v0, Lyyds/ᛳᲈᲁᲀ;

    .line 271
    .line 272
    if-eqz v0, :cond_9

    .line 273
    .line 274
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-static {v0, v2}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    goto :goto_5

    .line 283
    :cond_9
    move-object v0, v1

    .line 284
    :goto_5
    new-instance v2, Lyyds/ᛴᲁᛴᛱ;

    .line 285
    .line 286
    const/16 v3, 0x10

    .line 287
    .line 288
    invoke-direct {v2, v3}, Lyyds/ᛴᲁᛴᛱ;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0, v0, v1, v2}, Lyyds/ᛱᛶᛶᲇ;->ᛱᛳᲇ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 292
    .line 293
    .line 294
    return-void
.end method
