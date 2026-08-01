.class public Llin/xposed/hook/javaplugin/controller/PluginLoader;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llin/xposed/hook/javaplugin/controller/PluginLoader$FixClassLoader;
    }
.end annotation


# instance fields
.field public final dialogItemMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final methodCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbsh/BshMethod;",
            ">;"
        }
    .end annotation
.end field

.field public final msgMenuItemMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

.field public final temporaryItemMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->methodCache:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->temporaryItemMap:Ljava/util/Map;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->msgMenuItemMap:Ljava/util/Map;

    .line 31
    .line 32
    iput-object p1, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 33
    .line 34
    new-instance p0, Lbsh/Interpreter;

    .line 35
    .line 36
    invoke-direct {p0}, Lbsh/Interpreter;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v0, Llin/xposed/hook/javaplugin/controller/PluginLoader$FixClassLoader;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader$FixClassLoader;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lbsh/Interpreter;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setInterpreter(Lbsh/Interpreter;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private registerDataStorageMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 9

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a53858051405a7L    # -2.3888475229990346E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lbsh/BshMethod;

    .line 31
    .line 32
    const-wide v4, -0x36a53842051405a7L    # -2.3888774678473236E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, Lbsh/BshMethod;

    .line 58
    .line 59
    const-wide v4, -0x36a53849051405a7L    # -2.38886793994105E45

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Lbsh/BshMethod;

    .line 85
    .line 86
    const-wide v5, -0x36a5383c051405a7L    # -2.3888856346241297E45

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    filled-new-array {v1, v1, v5}, [Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v3, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 109
    .line 110
    .line 111
    new-instance p0, Lbsh/BshMethod;

    .line 112
    .line 113
    const-wide v6, -0x36a53824051405a7L    # -2.388918301731354E45

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    invoke-virtual {v3, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 134
    .line 135
    .line 136
    new-instance p0, Lbsh/BshMethod;

    .line 137
    .line 138
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v3, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 154
    .line 155
    .line 156
    new-instance p0, Lbsh/BshMethod;

    .line 157
    .line 158
    const-wide v6, -0x36a5382e051405a7L    # -2.3889046904366773E45

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 179
    .line 180
    .line 181
    new-instance p0, Lbsh/BshMethod;

    .line 182
    .line 183
    const-wide v6, -0x36a53815051405a7L    # -2.3889387186733694E45

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 204
    .line 205
    .line 206
    new-instance p0, Lbsh/BshMethod;

    .line 207
    .line 208
    const-wide v6, -0x36a53818051405a7L    # -2.3889346352849664E45

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    filled-new-array {v1, v1, v5}, [Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 229
    .line 230
    .line 231
    new-instance p0, Lbsh/BshMethod;

    .line 232
    .line 233
    const-wide v4, -0x36a53800051405a7L    # -2.3889673023921908E45

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 243
    .line 244
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 256
    .line 257
    .line 258
    new-instance p0, Lbsh/BshMethod;

    .line 259
    .line 260
    const-wide v4, -0x36a53809051405a7L    # -2.3889550522269816E45

    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 270
    .line 271
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 283
    .line 284
    .line 285
    new-instance p0, Lbsh/BshMethod;

    .line 286
    .line 287
    const-wide v5, -0x36a547f3051405a7L    # -2.383409810775638E45

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 308
    .line 309
    .line 310
    new-instance p0, Lbsh/BshMethod;

    .line 311
    .line 312
    const-wide v5, -0x36a547e4051405a7L    # -2.3834302277176533E45

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 333
    .line 334
    .line 335
    return-void
.end method

.method private registerFileMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 6

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a54684051405a7L    # -2.383909345290278E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lbsh/BshMethod;

    .line 31
    .line 32
    const-wide v4, -0x36a54689051405a7L    # -2.3839025396429395E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 53
    .line 54
    .line 55
    new-instance p0, Lbsh/BshMethod;

    .line 56
    .line 57
    const-wide v4, -0x36a54679051405a7L    # -2.3839243177144225E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 78
    .line 79
    .line 80
    new-instance p0, Lbsh/BshMethod;

    .line 81
    .line 82
    const-wide v4, -0x36a54657051405a7L    # -2.3839705961163237E45

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 103
    .line 104
    .line 105
    new-instance p0, Lbsh/BshMethod;

    .line 106
    .line 107
    const-wide v4, -0x36a54645051405a7L    # -2.383995096446742E45

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-class v2, [B

    .line 117
    .line 118
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method private static registerGetInfoMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 7

    .line 1
    new-instance v0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v1, -0x36a539e8051405a7L    # -2.388303071211961E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-class v4, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lbsh/BshMethod;

    .line 31
    .line 32
    const-wide v5, -0x36a539de051405a7L    # -2.388316682506638E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lbsh/BshMethod;

    .line 56
    .line 57
    const-wide v5, -0x36a539c3051405a7L    # -2.3883534330022654E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Lbsh/BshMethod;

    .line 78
    .line 79
    const-wide v5, -0x36a539b0051405a7L    # -2.3883792944621514E45

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lbsh/BshMethod;

    .line 103
    .line 104
    const-wide v5, -0x36a539a6051405a7L    # -2.3883929057568282E45

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 125
    .line 126
    .line 127
    new-instance v0, Lbsh/BshMethod;

    .line 128
    .line 129
    const-wide v5, -0x36a53991051405a7L    # -2.3884214894756496E45

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 150
    .line 151
    .line 152
    new-instance v0, Lbsh/BshMethod;

    .line 153
    .line 154
    const-wide v5, -0x36a532b1051405a7L    # -2.390817077338773E45

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 171
    .line 172
    .line 173
    new-instance v0, Lbsh/BshMethod;

    .line 174
    .line 175
    const-wide v5, -0x36a53982051405a7L    # -2.3884419064176648E45

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 192
    .line 193
    .line 194
    new-instance v0, Lbsh/BshMethod;

    .line 195
    .line 196
    const-wide v5, -0x36a5397e051405a7L    # -2.3884473509355356E45

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 213
    .line 214
    .line 215
    new-instance v0, Lbsh/BshMethod;

    .line 216
    .line 217
    const-wide v5, -0x36a53969051405a7L    # -2.388475934654357E45

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 234
    .line 235
    .line 236
    new-instance v0, Lbsh/BshMethod;

    .line 237
    .line 238
    const-wide v5, -0x36a5395f051405a7L    # -2.3884895459490338E45

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 259
    .line 260
    .line 261
    new-instance v0, Lbsh/BshMethod;

    .line 262
    .line 263
    const-wide v5, -0x36a53940051405a7L    # -2.388531740962532E45

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 284
    .line 285
    .line 286
    new-instance v0, Lbsh/BshMethod;

    .line 287
    .line 288
    const-wide v5, -0x36a53931051405a7L    # -2.3885521579045472E45

    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 305
    .line 306
    .line 307
    new-instance v0, Lbsh/BshMethod;

    .line 308
    .line 309
    const-wide v5, -0x36a53922051405a7L    # -2.3885725748465625E45

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 319
    .line 320
    filled-new-array {v2, v2, v3}, [Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v4, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 332
    .line 333
    .line 334
    return-void
.end method

.method private registerHttpMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 8

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a5478c051405a7L    # -2.3835500071108094E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-class v5, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v5, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {p0, v2, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lbsh/BshMethod;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-class v1, Ljava/util/Map;

    .line 37
    .line 38
    filled-new-array {v3, v1}, [Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v5, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, Lbsh/BshMethod;

    .line 53
    .line 54
    const-wide v6, -0x36a54774051405a7L    # -2.3835826742180338E45

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    filled-new-array {v3, v1}, [Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v5, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 75
    .line 76
    .line 77
    new-instance p0, Lbsh/BshMethod;

    .line 78
    .line 79
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    filled-new-array {v3, v1, v1}, [Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v5, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 95
    .line 96
    .line 97
    new-instance p0, Lbsh/BshMethod;

    .line 98
    .line 99
    const-wide v6, -0x36a5477d051405a7L    # -2.3835704240528247E45

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    filled-new-array {v3, v3}, [Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v5, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 120
    .line 121
    .line 122
    new-instance p0, Lbsh/BshMethod;

    .line 123
    .line 124
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    filled-new-array {v3, v1, v3}, [Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v5, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 140
    .line 141
    .line 142
    new-instance p0, Lbsh/BshMethod;

    .line 143
    .line 144
    const-wide v6, -0x36a54762051405a7L    # -2.383607174548452E45

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    filled-new-array {v3, v3}, [Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v5, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 165
    .line 166
    .line 167
    new-instance p0, Lbsh/BshMethod;

    .line 168
    .line 169
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    filled-new-array {v3, v3, v1}, [Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method private registerMenuMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 6

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a5389f051405a7L    # -2.388750882806829E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v3, v3}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-class v5, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v5, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {p0, v2, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lbsh/BshMethod;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    filled-new-array {v3, v3, v3}, [Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 48
    .line 49
    .line 50
    new-instance p0, Lbsh/BshMethod;

    .line 51
    .line 52
    const-wide v0, -0x36a53887051405a7L    # -2.3887835499140535E45

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    filled-new-array {v3, v3}, [Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 73
    .line 74
    .line 75
    new-instance p0, Lbsh/BshMethod;

    .line 76
    .line 77
    const-wide v0, -0x36a53870051405a7L    # -2.3888148558918102E45

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    filled-new-array {v3, v3}, [Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v5, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {p0, v2, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 98
    .line 99
    .line 100
    new-instance p0, Lbsh/BshMethod;

    .line 101
    .line 102
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 118
    .line 119
    .line 120
    new-instance p0, Lbsh/BshMethod;

    .line 121
    .line 122
    const-wide v0, -0x36a5387b051405a7L    # -2.3887998834676657E45

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 143
    .line 144
    .line 145
    new-instance p0, Lbsh/BshMethod;

    .line 146
    .line 147
    const-wide v0, -0x36a53854051405a7L    # -2.3888529675169053E45

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    filled-new-array {v3, v3}, [Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method private registerOcrMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 6

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a54636051405a7L    # -2.3840155133887573E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lbsh/BshMethod;

    .line 31
    .line 32
    const-wide v4, -0x36a54624051405a7L    # -2.3840400137191756E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private registerOtherMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 6

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a546ca051405a7L    # -2.38381406622754E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Ljava/lang/Object;

    .line 13
    .line 14
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lbsh/BshMethod;

    .line 31
    .line 32
    const-wide v4, -0x36a50fe1051405a7L    # -2.4029474631547706E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, Lbsh/BshMethod;

    .line 53
    .line 54
    const-wide v4, -0x36a546b0051405a7L    # -2.3838494555937E45

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-class v2, Ljava/lang/String;

    .line 64
    .line 65
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 77
    .line 78
    .line 79
    new-instance p0, Lbsh/BshMethod;

    .line 80
    .line 81
    const-wide v4, -0x36a546bd051405a7L    # -2.38383176091062E45

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 102
    .line 103
    .line 104
    new-instance p0, Lbsh/BshMethod;

    .line 105
    .line 106
    const-wide v4, -0x36a546a5051405a7L    # -2.3838644280178444E45

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 127
    .line 128
    .line 129
    new-instance p0, Lbsh/BshMethod;

    .line 130
    .line 131
    const-wide v4, -0x36a546ad051405a7L    # -2.383853538982103E45

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 152
    .line 153
    .line 154
    new-instance p0, Lbsh/BshMethod;

    .line 155
    .line 156
    const-wide v4, -0x36a54695051405a7L    # -2.3838862060893273E45

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 177
    .line 178
    .line 179
    new-instance p0, Lbsh/BshMethod;

    .line 180
    .line 181
    const-wide v4, -0x36a54692051405a7L    # -2.3838902894777304E45

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const-class v2, Ljava/lang/Throwable;

    .line 191
    .line 192
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 204
    .line 205
    .line 206
    new-instance p0, Lbsh/BshMethod;

    .line 207
    .line 208
    const-wide v4, -0x36a54698051405a7L    # -2.3838821227009243E45

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method private registerPluginImports()V
    .locals 2

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-wide v0, -0x36a54610051405a7L    # -2.3840672363085293E45

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private registerPluginInterfaces()V
    .locals 2

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;-><init>(Llin/xposed/hook/javaplugin/controller/PluginLoader;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerGetInfoMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerSendMsgMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerSKeyMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerTroopMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerMenuMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerDataStorageMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerHttpMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerOtherMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerFileMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerOcrMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private registerPluginVariables()V
    .locals 3

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-wide v1, -0x36a538e5051405a7L    # -2.3886556037440912E45

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const-wide v1, -0x36a538ed051405a7L    # -2.3886447147083497E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 35
    .line 36
    invoke-virtual {v2}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v1, v2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const-wide v1, -0x36a538d6051405a7L    # -2.3886760206861064E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v1, v2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const-wide v1, -0x36a538dd051405a7L    # -2.3886664927798327E45

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 71
    .line 72
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginLocalPath()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v0, v1, p0}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const-wide v1, -0x36a538c5051405a7L    # -2.388699159887057E45

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0, p0, v1}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method private registerSKeyMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 6

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a547ee051405a7L    # -2.3834166164229764E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Lbsh/BshMethod;

    .line 26
    .line 27
    const-wide v3, -0x36a547d3051405a7L    # -2.383453366918604E45

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Lbsh/BshMethod;

    .line 47
    .line 48
    const-wide v3, -0x36a547c1051405a7L    # -2.3834778672490222E45

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, Lbsh/BshMethod;

    .line 68
    .line 69
    const-wide v3, -0x36a547b5051405a7L    # -2.3834942008026344E45

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 86
    .line 87
    .line 88
    new-instance p0, Lbsh/BshMethod;

    .line 89
    .line 90
    const-wide v3, -0x36a547bd051405a7L    # -2.383483311766893E45

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-class v3, Ljava/lang/String;

    .line 100
    .line 101
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v1, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 113
    .line 114
    .line 115
    new-instance p0, Lbsh/BshMethod;

    .line 116
    .line 117
    const-wide v4, -0x36a547a6051405a7L    # -2.3835146177446496E45

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 134
    .line 135
    .line 136
    new-instance p0, Lbsh/BshMethod;

    .line 137
    .line 138
    const-wide v4, -0x36a547aa051405a7L    # -2.383509173226779E45

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 159
    .line 160
    .line 161
    new-instance p0, Lbsh/BshMethod;

    .line 162
    .line 163
    const-wide v4, -0x36a5479e051405a7L    # -2.383525506780391E45

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 184
    .line 185
    .line 186
    new-instance p0, Lbsh/BshMethod;

    .line 187
    .line 188
    const-wide v4, -0x36a54785051405a7L    # -2.3835595350170832E45

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method private registerSendMsgMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 8

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a517f4051405a7L    # -2.4001340085450683E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lbsh/BshMethod;

    .line 31
    .line 32
    const-wide v4, -0x36a54757051405a7L    # -2.3836221469725967E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 53
    .line 54
    .line 55
    new-instance p0, Lbsh/BshMethod;

    .line 56
    .line 57
    const-wide v4, -0x36a5475f051405a7L    # -2.3836112579368552E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    filled-new-array {v1, v1, v1, v1}, [Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 78
    .line 79
    .line 80
    new-instance p0, Lbsh/BshMethod;

    .line 81
    .line 82
    const-wide v4, -0x36a54743051405a7L    # -2.3836493695619503E45

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 103
    .line 104
    .line 105
    new-instance p0, Lbsh/BshMethod;

    .line 106
    .line 107
    const-wide v4, -0x36a54734051405a7L    # -2.3836697865039656E45

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 128
    .line 129
    .line 130
    new-instance p0, Lbsh/BshMethod;

    .line 131
    .line 132
    const-wide v4, -0x36a5473d051405a7L    # -2.3836575363387564E45

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 153
    .line 154
    .line 155
    new-instance p0, Lbsh/BshMethod;

    .line 156
    .line 157
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 162
    .line 163
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 175
    .line 176
    .line 177
    new-instance p0, Lbsh/BshMethod;

    .line 178
    .line 179
    const-wide v4, -0x36a54726051405a7L    # -2.3836888423165132E45

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    const-class v4, Ljava/lang/Object;

    .line 189
    .line 190
    filled-new-array {v1, v4, v1}, [Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 202
    .line 203
    .line 204
    new-instance p0, Lbsh/BshMethod;

    .line 205
    .line 206
    const-wide v5, -0x36a54728051405a7L    # -2.3836861200575778E45

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 227
    .line 228
    .line 229
    new-instance p0, Lbsh/BshMethod;

    .line 230
    .line 231
    const-wide v5, -0x36a54710051405a7L    # -2.3837187871648022E45

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    filled-new-array {v4, v1}, [Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-virtual {v3, v0, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 252
    .line 253
    .line 254
    new-instance p0, Lbsh/BshMethod;

    .line 255
    .line 256
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    filled-new-array {v4, v2, v1}, [Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 272
    .line 273
    .line 274
    new-instance p0, Lbsh/BshMethod;

    .line 275
    .line 276
    const-wide v5, -0x36a5471b051405a7L    # -2.3837038147406577E45

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 297
    .line 298
    .line 299
    new-instance p0, Lbsh/BshMethod;

    .line 300
    .line 301
    const-wide v5, -0x36a5470d051405a7L    # -2.3837228705532053E45

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 322
    .line 323
    .line 324
    new-instance p0, Lbsh/BshMethod;

    .line 325
    .line 326
    const-wide v5, -0x36a546f0051405a7L    # -2.383762343307768E45

    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 347
    .line 348
    .line 349
    new-instance p0, Lbsh/BshMethod;

    .line 350
    .line 351
    const-wide v5, -0x36a546fb051405a7L    # -2.3837473708836236E45

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 372
    .line 373
    .line 374
    new-instance p0, Lbsh/BshMethod;

    .line 375
    .line 376
    const-wide v5, -0x36a546ed051405a7L    # -2.383766426696171E45

    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 397
    .line 398
    .line 399
    new-instance p0, Lbsh/BshMethod;

    .line 400
    .line 401
    const-wide v5, -0x36a546d6051405a7L    # -2.383797732673928E45

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 422
    .line 423
    .line 424
    new-instance p0, Lbsh/BshMethod;

    .line 425
    .line 426
    const-wide v5, -0x36a546d8051405a7L    # -2.3837950104149925E45

    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 447
    .line 448
    .line 449
    new-instance p0, Lbsh/BshMethod;

    .line 450
    .line 451
    const-wide v5, -0x36a546c2051405a7L    # -2.3838249552632815E45

    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    filled-new-array {v4, v1}, [Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 472
    .line 473
    .line 474
    return-void
.end method

.method private registerTroopMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 6

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-wide v0, -0x36a538c3051405a7L    # -2.3887018821459924E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lbsh/BshMethod;

    .line 31
    .line 32
    const-wide v4, -0x36a538cb051405a7L    # -2.388690993110251E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 53
    .line 54
    .line 55
    new-instance p0, Lbsh/BshMethod;

    .line 56
    .line 57
    const-wide v4, -0x36a538bc051405a7L    # -2.3887114100522662E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-class v2, Ljava/lang/Object;

    .line 67
    .line 68
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 80
    .line 81
    .line 82
    new-instance p0, Lbsh/BshMethod;

    .line 83
    .line 84
    const-wide v4, -0x36a538a6051405a7L    # -2.3887413549005553E45

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 105
    .line 106
    .line 107
    new-instance p0, Lbsh/BshMethod;

    .line 108
    .line 109
    const-wide v4, -0x36a538a8051405a7L    # -2.38873863264162E45

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 119
    .line 120
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 132
    .line 133
    .line 134
    new-instance p0, Lbsh/BshMethod;

    .line 135
    .line 136
    const-wide v4, -0x36a53892051405a7L    # -2.388768577489909E45

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 146
    .line 147
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 159
    .line 160
    .line 161
    return-void
.end method


# virtual methods
.method public declared-synchronized addClassLoader(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 3
    .line 4
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Lbsh/Interpreter;->addClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw p1
.end method

.method public declared-synchronized eval(Ljava/lang/String;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 3
    .line 4
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Llin/xposed/hook/javaplugin/PluginOutput;

    .line 22
    .line 23
    iget-object v1, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/PluginOutput;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :catchall_1
    move-exception p1

    .line 38
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    throw p1
.end method

.method public getJavaPluginInfo()Llin/xposed/hook/javaplugin/bean/PluginInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public loadPlugin()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 7
    .line 8
    invoke-virtual {v1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginLocalPath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-wide v1, -0x36a53911051405a7L    # -2.388595714047513E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/io/File;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerPluginVariables()V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerPluginInterfaces()V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerPluginImports()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->loadPluginByPath(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->onLoad()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    const-wide v0, -0x36a53904051405a7L    # -2.388613408730593E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public declared-synchronized loadPluginByPath(Ljava/lang/String;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iget-object v0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 7
    .line 8
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    :try_start_1
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Llin/xposed/hook/javaplugin/PluginOutput;

    .line 26
    .line 27
    iget-object v1, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/PluginOutput;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Llin/xposed/hook/javaplugin/PluginOutput;->e(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/RuntimeException;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :catchall_1
    move-exception p1

    .line 42
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    throw p1
.end method

.method public onLoad()V
    .locals 2

    .line 1
    const-wide v0, -0x36a538f5051405a7L    # -2.3886338256726082E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public stopPlugin()V
    .locals 2

    .line 1
    const-wide v0, -0x36a538fc051405a7L    # -2.3886242977663345E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 17
    .line 18
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lbsh/NameSpace;->clear()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a545f0051405a7L    # -2.384110792451495E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-wide v1, -0x36a545e9051405a7L    # -2.384120320357769E45

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 p0, 0x7d

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
