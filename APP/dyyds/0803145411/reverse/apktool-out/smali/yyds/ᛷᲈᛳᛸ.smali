.class public final Lyyds/ᛷᲈᛳᛸ;
.super Lyyds/ᛱᛶᛶᲇ;


# static fields
.field public static final ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᛷᲈᛳᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛷᲈᛳᛸ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᛶᛶᲇ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛷᲈᛳᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲈᛳᛸ;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyyds/ᛷᲈᛳᛸ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final ᲇᲇᲇᛱ()V
    .locals 11

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 2
    .line 3
    const-wide v0, -0x245aee68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, -0x245cbe68a836eL

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
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    :cond_0
    const-wide v0, -0x245fee68a836eL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const-wide v2, -0x24621e68a836eL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lyyds/ᛳᲈᲁᲀ;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v0, v2}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v0, v1

    .line 57
    :goto_0
    const-wide v2, -0x245d4e68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-wide v3, -0x245f5e68a836eL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Lyyds/ᛷᛶᲇᲁ;->ᛲᛴᛳᛲ(Ljava/lang/String;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    new-instance v3, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Lyyds/ᛳᲈᲁᲀ;

    .line 98
    .line 99
    sget-object v5, Lyyds/ᛷᲈᛳᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲈᛳᛸ;

    .line 100
    .line 101
    :try_start_0
    invoke-virtual {v5}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-static {v4, v5}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    goto :goto_2

    .line 110
    :catchall_0
    move-exception v5

    .line 111
    new-instance v6, Lyyds/ᲈᛵᛵᛴ;

    .line 112
    .line 113
    invoke-direct {v6, v5}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    move-object v5, v6

    .line 117
    :goto_2
    invoke-static {v5}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    if-eqz v6, :cond_3

    .line 122
    .line 123
    sget-object v7, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 124
    .line 125
    new-instance v8, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-wide v9, -0x36666e68a836eL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v7, v4, v6}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :cond_3
    instance-of v4, v5, Lyyds/ᲈᛵᛵᛴ;

    .line 150
    .line 151
    if-eqz v4, :cond_4

    .line 152
    .line 153
    move-object v5, v1

    .line 154
    :cond_4
    check-cast v5, Ljava/lang/reflect/Method;

    .line 155
    .line 156
    if-eqz v5, :cond_2

    .line 157
    .line 158
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    new-instance v2, Ljava/util/HashSet;

    .line 163
    .line 164
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 165
    .line 166
    .line 167
    new-instance v4, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_7

    .line 181
    .line 182
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    move-object v6, v5

    .line 187
    check-cast v6, Ljava/lang/reflect/Method;

    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_6

    .line 198
    .line 199
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_8

    .line 212
    .line 213
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    check-cast v3, Ljava/lang/reflect/Method;

    .line 218
    .line 219
    sget-object v4, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 220
    .line 221
    sget-object v4, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 222
    .line 223
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Lyyds/ᲈᛷᛵᛷ;->ᛱᛳᲇ()Lcom/ss/android/ugc/awemes/wrapper/ModuleMainWrapper;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-virtual {v4, v3}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    new-instance v4, Lyyds/ᲀᛷᲈᲀ;

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    invoke-direct {v4, v5}, Lyyds/ᲀᛷᲈᲀ;-><init>(I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v3, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    const-wide v4, -0x36676e68a836eL

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    sget-object v4, Lyyds/ᛱᛷᲀᲈ;->ᛲᲈᲁ:Lyyds/ᛱᛷᲀᲈ;

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-static {v3}, Lyyds/ᛱᛷᲀᲈ;->ᛲᲈᲁ(Lio/github/libxposed/api/XposedInterface$HookHandle;)V

    .line 258
    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_8
    new-instance v2, Lyyds/ᛱᛱᛸᛷ;

    .line 262
    .line 263
    const/16 v3, 0x18

    .line 264
    .line 265
    invoke-direct {v2, v3}, Lyyds/ᛱᛱᛸᛷ;-><init>(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v0, v1, v2}, Lyyds/ᛱᛶᛶᲇ;->ᛱᛳᲇ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 269
    .line 270
    .line 271
    sget-object v0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 272
    .line 273
    const-wide v2, -0x2462ae68a836eL

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    const-wide v4, -0x2464de68a836eL

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    invoke-static {v2, v3, v4, v5}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Lyyds/ᛳᲈᲁᲀ;

    .line 288
    .line 289
    if-eqz v0, :cond_9

    .line 290
    .line 291
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-static {v0, v2}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    goto :goto_5

    .line 300
    :cond_9
    move-object v0, v1

    .line 301
    :goto_5
    new-instance v2, Lyyds/ᛱᛱᛸᛷ;

    .line 302
    .line 303
    const/16 v3, 0x19

    .line 304
    .line 305
    invoke-direct {v2, v3}, Lyyds/ᛱᛱᛸᛷ;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0, v0, v1, v2}, Lyyds/ᛱᛶᛶᲇ;->ᛱᛳᲇ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 309
    .line 310
    .line 311
    return-void
.end method
