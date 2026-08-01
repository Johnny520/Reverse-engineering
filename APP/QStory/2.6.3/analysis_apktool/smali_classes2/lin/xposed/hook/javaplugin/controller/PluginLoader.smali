.class public Llin/xposed/hook/javaplugin/controller/PluginLoader;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
    .locals 8

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const/16 v0, 0x27e

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lbsh/BshMethod;

    .line 28
    .line 29
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lbsh/BshMethod;

    .line 52
    .line 53
    const/16 v0, 0x27f

    .line 54
    .line 55
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 78
    .line 79
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    filled-new-array {v1, v1, v5}, [Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v3, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 97
    .line 98
    .line 99
    new-instance p0, Lbsh/BshMethod;

    .line 100
    .line 101
    const/16 v0, 0x280

    .line 102
    .line 103
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-direct {p0, v6, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 119
    .line 120
    .line 121
    new-instance p0, Lbsh/BshMethod;

    .line 122
    .line 123
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v3, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 139
    .line 140
    .line 141
    new-instance p0, Lbsh/BshMethod;

    .line 142
    .line 143
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 144
    .line 145
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 161
    .line 162
    .line 163
    new-instance p0, Lbsh/BshMethod;

    .line 164
    .line 165
    const/16 v0, 0x281

    .line 166
    .line 167
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 183
    .line 184
    .line 185
    new-instance p0, Lbsh/BshMethod;

    .line 186
    .line 187
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 188
    .line 189
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    filled-new-array {v1, v1, v5}, [Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 205
    .line 206
    .line 207
    new-instance p0, Lbsh/BshMethod;

    .line 208
    .line 209
    const/16 v0, 0x282

    .line 210
    .line 211
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 216
    .line 217
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    const/16 v0, 0x283

    .line 234
    .line 235
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 240
    .line 241
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 253
    .line 254
    .line 255
    new-instance p0, Lbsh/BshMethod;

    .line 256
    .line 257
    const/16 v0, 0x284

    .line 258
    .line 259
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 275
    .line 276
    .line 277
    new-instance p0, Lbsh/BshMethod;

    .line 278
    .line 279
    const/16 v0, 0x285

    .line 280
    .line 281
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    return-void
.end method

.method private registerFileMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 4

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const/16 v0, 0x29c

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lbsh/BshMethod;

    .line 28
    .line 29
    const/16 v0, 0x29d

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lbsh/BshMethod;

    .line 50
    .line 51
    const/16 v0, 0x29e

    .line 52
    .line 53
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, Lbsh/BshMethod;

    .line 72
    .line 73
    const/16 v0, 0x29f

    .line 74
    .line 75
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 91
    .line 92
    .line 93
    new-instance p0, Lbsh/BshMethod;

    .line 94
    .line 95
    const/16 v0, 0x2a0

    .line 96
    .line 97
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-class v2, [B

    .line 102
    .line 103
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method private static registerGetInfoMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BshMethod;

    .line 2
    .line 3
    const/16 v1, 0x265

    .line 4
    .line 5
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-class v2, Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-class v4, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lbsh/BshMethod;

    .line 28
    .line 29
    const/16 v1, 0x266

    .line 30
    .line 31
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lbsh/BshMethod;

    .line 50
    .line 51
    const/16 v1, 0x267

    .line 52
    .line 53
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lbsh/BshMethod;

    .line 69
    .line 70
    const/16 v1, 0x268

    .line 71
    .line 72
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Lbsh/BshMethod;

    .line 91
    .line 92
    const/16 v1, 0x269

    .line 93
    .line 94
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, Lbsh/BshMethod;

    .line 113
    .line 114
    const/16 v1, 0x26a

    .line 115
    .line 116
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 132
    .line 133
    .line 134
    new-instance v0, Lbsh/BshMethod;

    .line 135
    .line 136
    const/16 v1, 0x1ff

    .line 137
    .line 138
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    const/16 v1, 0x26b

    .line 155
    .line 156
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 168
    .line 169
    .line 170
    new-instance v0, Lbsh/BshMethod;

    .line 171
    .line 172
    const/16 v1, 0x26c

    .line 173
    .line 174
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 186
    .line 187
    .line 188
    new-instance v0, Lbsh/BshMethod;

    .line 189
    .line 190
    const/16 v1, 0x26d

    .line 191
    .line 192
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 204
    .line 205
    .line 206
    new-instance v0, Lbsh/BshMethod;

    .line 207
    .line 208
    const/16 v1, 0x26e

    .line 209
    .line 210
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 226
    .line 227
    .line 228
    new-instance v0, Lbsh/BshMethod;

    .line 229
    .line 230
    const/16 v1, 0x26f

    .line 231
    .line 232
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 248
    .line 249
    .line 250
    new-instance v0, Lbsh/BshMethod;

    .line 251
    .line 252
    const/16 v1, 0x270

    .line 253
    .line 254
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Lbsh/BshMethod;

    .line 269
    .line 270
    const/16 v1, 0x271

    .line 271
    .line 272
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 277
    .line 278
    filled-new-array {v2, v2, v3}, [Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v4, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-direct {v0, v1, p1}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 290
    .line 291
    .line 292
    return-void
.end method

.method private registerHttpMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 6

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-class v2, Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-class v4, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {p0, v1, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lbsh/BshMethod;

    .line 28
    .line 29
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-class v1, Ljava/util/Map;

    .line 34
    .line 35
    filled-new-array {v2, v1}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v4, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lbsh/BshMethod;

    .line 50
    .line 51
    const/16 v0, 0x28c

    .line 52
    .line 53
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    filled-new-array {v2, v1}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v4, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-direct {p0, v3, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, Lbsh/BshMethod;

    .line 72
    .line 73
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    filled-new-array {v2, v1, v1}, [Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v4, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 89
    .line 90
    .line 91
    new-instance p0, Lbsh/BshMethod;

    .line 92
    .line 93
    const/16 v0, 0x28d

    .line 94
    .line 95
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-direct {p0, v3, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, Lbsh/BshMethod;

    .line 114
    .line 115
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    filled-new-array {v2, v1, v2}, [Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v4, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 131
    .line 132
    .line 133
    new-instance p0, Lbsh/BshMethod;

    .line 134
    .line 135
    const/16 v0, 0x28e

    .line 136
    .line 137
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-virtual {v4, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-direct {p0, v3, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

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
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    filled-new-array {v2, v2, v1}, [Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method private registerMenuMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 5

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-class v2, Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-class v4, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {p0, v1, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lbsh/BshMethod;

    .line 28
    .line 29
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    filled-new-array {v2, v2, v2}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Lbsh/BshMethod;

    .line 48
    .line 49
    const/16 v0, 0x27a

    .line 50
    .line 51
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Lbsh/BshMethod;

    .line 70
    .line 71
    const/16 v0, 0x27b

    .line 72
    .line 73
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v4, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {p0, v1, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 89
    .line 90
    .line 91
    new-instance p0, Lbsh/BshMethod;

    .line 92
    .line 93
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    const/16 v0, 0x27c

    .line 114
    .line 115
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 131
    .line 132
    .line 133
    new-instance p0, Lbsh/BshMethod;

    .line 134
    .line 135
    const/16 v0, 0x27d

    .line 136
    .line 137
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    return-void
.end method

.method private registerOcrMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 4

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const/16 v0, 0x2a1

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lbsh/BshMethod;

    .line 28
    .line 29
    const/16 v0, 0x2a2

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private registerOtherMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 5

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/Object;

    .line 10
    .line 11
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lbsh/BshMethod;

    .line 28
    .line 29
    const/16 v0, 0x52

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 49
    .line 50
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-class v2, Ljava/lang/String;

    .line 55
    .line 56
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 68
    .line 69
    .line 70
    new-instance p0, Lbsh/BshMethod;

    .line 71
    .line 72
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c"

    .line 73
    .line 74
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 90
    .line 91
    .line 92
    new-instance p0, Lbsh/BshMethod;

    .line 93
    .line 94
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c"

    .line 95
    .line 96
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 112
    .line 113
    .line 114
    new-instance p0, Lbsh/BshMethod;

    .line 115
    .line 116
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c"

    .line 117
    .line 118
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 139
    .line 140
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 156
    .line 157
    .line 158
    new-instance p0, Lbsh/BshMethod;

    .line 159
    .line 160
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c"

    .line 161
    .line 162
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const-class v2, Ljava/lang/Throwable;

    .line 167
    .line 168
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 180
    .line 181
    .line 182
    new-instance p0, Lbsh/BshMethod;

    .line 183
    .line 184
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c"

    .line 185
    .line 186
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    return-void
.end method

.method private registerPluginImports()V
    .locals 1

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
    const/16 v0, 0x2a3

    .line 12
    .line 13
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
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
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 12
    .line 13
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x275

    .line 23
    .line 24
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 29
    .line 30
    invoke-virtual {v2}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginID()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v1, v2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 38
    .line 39
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0, v1, v2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 53
    .line 54
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 59
    .line 60
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getPluginLocalPath()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v0, v1, p0}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const-string p0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c"

    .line 68
    .line 69
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, p0, v1}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private registerSKeyMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 5

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const/16 v0, 0x286

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 20
    .line 21
    .line 22
    new-instance p0, Lbsh/BshMethod;

    .line 23
    .line 24
    const/16 v0, 0x287

    .line 25
    .line 26
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lbsh/BshMethod;

    .line 41
    .line 42
    const/16 v0, 0x288

    .line 43
    .line 44
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 56
    .line 57
    .line 58
    new-instance p0, Lbsh/BshMethod;

    .line 59
    .line 60
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 61
    .line 62
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 74
    .line 75
    .line 76
    new-instance p0, Lbsh/BshMethod;

    .line 77
    .line 78
    const/16 v0, 0x289

    .line 79
    .line 80
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-class v3, Ljava/lang/String;

    .line 85
    .line 86
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v1, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

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
    const/16 v0, 0x28a

    .line 103
    .line 104
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Lbsh/BshMethod;

    .line 119
    .line 120
    const/16 v0, 0x28b

    .line 121
    .line 122
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 138
    .line 139
    .line 140
    new-instance p0, Lbsh/BshMethod;

    .line 141
    .line 142
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 143
    .line 144
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 160
    .line 161
    .line 162
    new-instance p0, Lbsh/BshMethod;

    .line 163
    .line 164
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c"

    .line 165
    .line 166
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method private registerSendMsgMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 7

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lbsh/BshMethod;

    .line 28
    .line 29
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lbsh/BshMethod;

    .line 50
    .line 51
    const/16 v0, 0x28f

    .line 52
    .line 53
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    filled-new-array {v1, v1, v1, v1}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, Lbsh/BshMethod;

    .line 72
    .line 73
    const/16 v0, 0x290

    .line 74
    .line 75
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 91
    .line 92
    .line 93
    new-instance p0, Lbsh/BshMethod;

    .line 94
    .line 95
    const/16 v0, 0x291

    .line 96
    .line 97
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    const/16 v0, 0x292

    .line 118
    .line 119
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v3, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-direct {p0, v2, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 135
    .line 136
    .line 137
    new-instance p0, Lbsh/BshMethod;

    .line 138
    .line 139
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 144
    .line 145
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 157
    .line 158
    .line 159
    new-instance p0, Lbsh/BshMethod;

    .line 160
    .line 161
    const/16 v0, 0x293

    .line 162
    .line 163
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const-class v4, Ljava/lang/Object;

    .line 168
    .line 169
    filled-new-array {v1, v4, v1}, [Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 181
    .line 182
    .line 183
    new-instance p0, Lbsh/BshMethod;

    .line 184
    .line 185
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 186
    .line 187
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 203
    .line 204
    .line 205
    new-instance p0, Lbsh/BshMethod;

    .line 206
    .line 207
    const/16 v0, 0x294

    .line 208
    .line 209
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    filled-new-array {v4, v1}, [Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-direct {p0, v5, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 225
    .line 226
    .line 227
    new-instance p0, Lbsh/BshMethod;

    .line 228
    .line 229
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    filled-new-array {v4, v2, v1}, [Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 245
    .line 246
    .line 247
    new-instance p0, Lbsh/BshMethod;

    .line 248
    .line 249
    const/16 v0, 0x295

    .line 250
    .line 251
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 267
    .line 268
    .line 269
    new-instance p0, Lbsh/BshMethod;

    .line 270
    .line 271
    const/16 v0, 0x296

    .line 272
    .line 273
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    filled-new-array {v1, v1, v4}, [Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 289
    .line 290
    .line 291
    new-instance p0, Lbsh/BshMethod;

    .line 292
    .line 293
    const/16 v0, 0x297

    .line 294
    .line 295
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 311
    .line 312
    .line 313
    new-instance p0, Lbsh/BshMethod;

    .line 314
    .line 315
    const/16 v0, 0x298

    .line 316
    .line 317
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    new-instance p0, Lbsh/BshMethod;

    .line 336
    .line 337
    const/16 v0, 0x299

    .line 338
    .line 339
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 355
    .line 356
    .line 357
    new-instance p0, Lbsh/BshMethod;

    .line 358
    .line 359
    const/16 v0, 0x29a

    .line 360
    .line 361
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 377
    .line 378
    .line 379
    new-instance p0, Lbsh/BshMethod;

    .line 380
    .line 381
    const/16 v0, 0x29b

    .line 382
    .line 383
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 399
    .line 400
    .line 401
    new-instance p0, Lbsh/BshMethod;

    .line 402
    .line 403
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 404
    .line 405
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    filled-new-array {v4, v1}, [Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 421
    .line 422
    .line 423
    return-void
.end method

.method private registerTroopMethod(Lbsh/NameSpace;Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;)V
    .locals 5

    .line 1
    new-instance p0, Lbsh/BshMethod;

    .line 2
    .line 3
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-class v3, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 16
    .line 17
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lbsh/BshMethod;

    .line 28
    .line 29
    const/16 v0, 0x276

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lbsh/BshMethod;

    .line 50
    .line 51
    const/16 v0, 0x277

    .line 52
    .line 53
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-class v2, Ljava/lang/Object;

    .line 58
    .line 59
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 71
    .line 72
    .line 73
    new-instance p0, Lbsh/BshMethod;

    .line 74
    .line 75
    const/16 v0, 0x278

    .line 76
    .line 77
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 93
    .line 94
    .line 95
    new-instance p0, Lbsh/BshMethod;

    .line 96
    .line 97
    const/16 v0, 0x279

    .line 98
    .line 99
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 117
    .line 118
    .line 119
    new-instance p0, Lbsh/BshMethod;

    .line 120
    .line 121
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 122
    .line 123
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 128
    .line 129
    filled-new-array {v1, v1, v2}, [Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-direct {p0, v0, p2}, Lbsh/BshMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 141
    .line 142
    .line 143
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
    invoke-static {v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

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
    .locals 2

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
    const/16 v1, 0x272

    .line 16
    .line 17
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/io/File;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerPluginVariables()V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerPluginInterfaces()V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->registerPluginImports()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->loadPluginByPath(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;->onLoad()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    const/16 p0, 0x273

    .line 56
    .line 57
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public declared-synchronized loadPluginByPath(Ljava/lang/String;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏哲兰楪(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

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
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public stopPlugin()V
    .locals 2

    .line 1
    const/16 v0, 0x274

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeToPluginMethod(Llin/xposed/hook/javaplugin/controller/PluginLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 14
    .line 15
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getInterpreter()Lbsh/Interpreter;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lbsh/NameSpace;->clear()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2a4

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->pluginInfo:Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x2a5

    .line 21
    .line 22
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Llin/xposed/hook/javaplugin/controller/PluginLoader;->dialogItemMap:Ljava/util/Map;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 p0, 0x7d

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
