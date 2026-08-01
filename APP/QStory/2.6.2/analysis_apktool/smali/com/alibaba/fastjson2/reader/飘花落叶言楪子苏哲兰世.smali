.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪子哲世苏兰/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪兰世哲苏:Ljava/util/function/Consumer;

.field public static final 飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

.field public static 飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;

.field public static final 飘花落叶言子楪哲兰世苏:Ljava/lang/ClassLoader;

.field public static final 飘花落叶言子楪哲兰苏世:Z


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪哲世兰苏:Z

.field public final 飘花落叶言子楪哲世苏兰:Z

.field public final 飘花落叶言子楪哲苏世兰:[J

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/function/Consumer;

.field public final 飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪苏兰世哲:Z

.field public final 飘花落叶言子楪苏兰哲世:Z

.field public final 飘花落叶言子楪苏哲世兰:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final 飘花落叶言子楪苏哲兰世:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    const-string v0, "fastjson2.parser.deny"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Properties;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    const-string v0, ","

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-lez v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    :cond_1
    const-string v1, "fastjson2.autoTypeAccept"

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Properties;

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :cond_2
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-lez v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v0, 0x0

    .line 66
    new-array v0, v0, [Ljava/lang/String;

    .line 67
    .line 68
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 69
    .line 70
    :goto_0
    const-string v0, "fastjson2.autoTypeBeforeHandler"

    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    :cond_4
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Properties;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :cond_5
    if-eqz v1, :cond_6

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    :cond_6
    if-eqz v1, :cond_8

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_8

    .line 103
    .line 104
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-nez v0, :cond_7

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_7
    new-instance v0, Ljava/lang/ClassCastException;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 120
    .line 121
    .line 122
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :catch_0
    :cond_8
    :goto_1
    const-string v0, "fastjson2.autoTypeHandler"

    .line 124
    .line 125
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_9

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_a

    .line 136
    .line 137
    :cond_9
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Properties;

    .line 138
    .line 139
    invoke-virtual {v1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :cond_a
    if-eqz v1, :cond_b

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :cond_b
    if-eqz v1, :cond_c

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_c

    .line 156
    .line 157
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_c

    .line 162
    .line 163
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Ljava/util/function/Consumer;

    .line 168
    .line 169
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/Consumer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 170
    .line 171
    :catch_1
    :cond_c
    const-string v0, "fastjson.parser.safeMode"

    .line 172
    .line 173
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    if-eqz v1, :cond_d

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_e

    .line 184
    .line 185
    :cond_d
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Properties;

    .line 186
    .line 187
    invoke-virtual {v1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    :cond_e
    const-string v0, "fastjson2.parser.safeMode"

    .line 192
    .line 193
    if-eqz v1, :cond_f

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_10

    .line 200
    .line 201
    :cond_f
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    :cond_10
    if-eqz v1, :cond_11

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_12

    .line 212
    .line 213
    :cond_11
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Properties;

    .line 214
    .line 215
    invoke-virtual {v1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    :cond_12
    if-eqz v1, :cond_13

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    :cond_13
    const-string v0, "true"

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    sput-boolean v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲兰苏世:Z

    .line 232
    .line 233
    return-void
.end method

.method public constructor <init>()V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 42
    .line 43
    const/16 v2, 0x400

    .line 44
    .line 45
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 49
    .line 50
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 56
    .line 57
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 63
    .line 64
    sget-boolean v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Z

    .line 65
    .line 66
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲兰世:Z

    .line 67
    .line 68
    sget-boolean v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Z

    .line 69
    .line 70
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲:Z

    .line 71
    .line 72
    sget-boolean v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Z

    .line 73
    .line 74
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰哲世:Z

    .line 75
    .line 76
    sget-boolean v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Z

    .line 77
    .line 78
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世苏兰:Z

    .line 79
    .line 80
    sget-boolean v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世:Z

    .line 81
    .line 82
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏:Z

    .line 83
    .line 84
    sget-object v1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/Consumer;

    .line 85
    .line 86
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/function/Consumer;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    const/4 v2, 0x1

    .line 90
    sget-object v3, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 91
    .line 92
    if-nez v3, :cond_0

    .line 93
    .line 94
    new-array v3, v2, [J

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_0
    array-length v4, v3

    .line 98
    add-int/2addr v4, v2

    .line 99
    new-array v4, v4, [J

    .line 100
    .line 101
    move v5, v1

    .line 102
    :goto_0
    array-length v6, v3

    .line 103
    if-ge v5, v6, :cond_1

    .line 104
    .line 105
    aget-object v6, v3, v5

    .line 106
    .line 107
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    aput-wide v6, v4, v5

    .line 112
    .line 113
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    move-object v3, v4

    .line 117
    :goto_1
    array-length v4, v3

    .line 118
    sub-int/2addr v4, v2

    .line 119
    const-wide v5, -0x575556d6bb90031cL    # -8.660931078614971E-113

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    aput-wide v5, v3, v4

    .line 125
    .line 126
    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    .line 127
    .line 128
    .line 129
    iput-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲苏世兰:[J

    .line 130
    .line 131
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 132
    .line 133
    sget-wide v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:J

    .line 134
    .line 135
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    sget-object v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;

    .line 140
    .line 141
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 145
    .line 146
    const-wide v4, -0x4318000b8f6218c8L    # -2.6645156755451724E-15

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    sget-object v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    .line 156
    .line 157
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 161
    .line 162
    const-class v4, Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v4

    .line 172
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    sget-object v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;

    .line 177
    .line 178
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    sget-object v3, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    const v5, -0x422aac39

    .line 188
    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    if-eq v4, v5, :cond_4

    .line 192
    .line 193
    const v5, 0x17a7b

    .line 194
    .line 195
    .line 196
    if-eq v4, v5, :cond_3

    .line 197
    .line 198
    const v5, 0x40afd6bd

    .line 199
    .line 200
    .line 201
    if-eq v4, v5, :cond_2

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_2
    const-string v4, "reflect"

    .line 205
    .line 206
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-eqz v3, :cond_5

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_3
    const-string v4, "asm"

    .line 214
    .line 215
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    goto :goto_3

    .line 220
    :cond_4
    const-string v4, "lambda"

    .line 221
    .line 222
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_5

    .line 227
    .line 228
    :goto_2
    sget-object v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_5
    :goto_3
    :try_start_0
    sget-boolean v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 232
    .line 233
    if-nez v3, :cond_6

    .line 234
    .line 235
    sget-boolean v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏:Z

    .line 236
    .line 237
    if-nez v3, :cond_6

    .line 238
    .line 239
    sget-object v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世兰苏;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :catchall_0
    :cond_6
    move-object v3, v6

    .line 243
    :goto_4
    if-nez v3, :cond_7

    .line 244
    .line 245
    sget-object v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    .line 246
    .line 247
    :cond_7
    :goto_5
    iput-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    .line 248
    .line 249
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 250
    .line 251
    new-instance v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;

    .line 252
    .line 253
    invoke-direct {v4, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    const/4 v3, 0x0

    .line 260
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 265
    .line 266
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    if-eqz v5, :cond_1a

    .line 275
    .line 276
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    check-cast v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;

    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    const-wide/16 v7, 0x0

    .line 286
    .line 287
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    const-wide/16 v7, 0x0

    .line 292
    .line 293
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    new-instance v8, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 298
    .line 299
    const/16 v9, 0xe

    .line 300
    .line 301
    invoke-direct {v8, v9}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 302
    .line 303
    .line 304
    const-class v10, Ljava/lang/Character;

    .line 305
    .line 306
    sget-object v11, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 307
    .line 308
    invoke-virtual {v0, v10, v11, v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 309
    .line 310
    .line 311
    const-class v22, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 312
    .line 313
    const-class v23, Ljava/util/concurrent/atomic/AtomicLong;

    .line 314
    .line 315
    const-class v12, Ljava/lang/Boolean;

    .line 316
    .line 317
    const-class v13, Ljava/lang/Byte;

    .line 318
    .line 319
    const-class v14, Ljava/lang/Short;

    .line 320
    .line 321
    const-class v15, Ljava/lang/Integer;

    .line 322
    .line 323
    const-class v16, Ljava/lang/Long;

    .line 324
    .line 325
    const-class v17, Ljava/lang/Number;

    .line 326
    .line 327
    const-class v18, Ljava/lang/Float;

    .line 328
    .line 329
    const-class v19, Ljava/lang/Double;

    .line 330
    .line 331
    const-class v20, Ljava/math/BigInteger;

    .line 332
    .line 333
    const-class v21, Ljava/math/BigDecimal;

    .line 334
    .line 335
    filled-new-array/range {v12 .. v23}, [Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    new-instance v12, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 340
    .line 341
    invoke-direct {v12, v6, v2}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 342
    .line 343
    .line 344
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 349
    .line 350
    .line 351
    move-result-object v14

    .line 352
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    :goto_7
    const-class v9, Ljava/lang/Boolean;

    .line 357
    .line 358
    const/16 v6, 0xc

    .line 359
    .line 360
    if-ge v1, v6, :cond_8

    .line 361
    .line 362
    aget-object v6, v8, v1

    .line 363
    .line 364
    invoke-virtual {v0, v6, v9, v12}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 365
    .line 366
    .line 367
    add-int/lit8 v1, v1, 0x1

    .line 368
    .line 369
    const/4 v6, 0x0

    .line 370
    goto :goto_7

    .line 371
    :cond_8
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 372
    .line 373
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 374
    .line 375
    invoke-direct {v1, v12, v2}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 376
    .line 377
    .line 378
    const/4 v12, 0x0

    .line 379
    :goto_8
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 380
    .line 381
    if-ge v12, v6, :cond_9

    .line 382
    .line 383
    aget-object v6, v8, v12

    .line 384
    .line 385
    invoke-virtual {v0, v6, v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 386
    .line 387
    .line 388
    add-int/lit8 v12, v12, 0x1

    .line 389
    .line 390
    const/16 v6, 0xc

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_9
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 394
    .line 395
    const/16 v6, 0x9

    .line 396
    .line 397
    invoke-direct {v1, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 398
    .line 399
    .line 400
    const/4 v6, 0x0

    .line 401
    :goto_9
    const-class v12, Ljava/lang/String;

    .line 402
    .line 403
    move-object/from16 v21, v4

    .line 404
    .line 405
    const/16 v4, 0xc

    .line 406
    .line 407
    if-ge v6, v4, :cond_a

    .line 408
    .line 409
    aget-object v4, v8, v6

    .line 410
    .line 411
    invoke-virtual {v0, v4, v12, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 412
    .line 413
    .line 414
    add-int/lit8 v6, v6, 0x1

    .line 415
    .line 416
    move-object/from16 v4, v21

    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_a
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 420
    .line 421
    const/4 v4, 0x6

    .line 422
    invoke-direct {v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 423
    .line 424
    .line 425
    const/4 v6, 0x0

    .line 426
    :goto_a
    const-class v4, Ljava/math/BigDecimal;

    .line 427
    .line 428
    move-object/from16 v23, v8

    .line 429
    .line 430
    const/16 v8, 0xc

    .line 431
    .line 432
    if-ge v6, v8, :cond_b

    .line 433
    .line 434
    aget-object v8, v23, v6

    .line 435
    .line 436
    invoke-virtual {v0, v8, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 437
    .line 438
    .line 439
    add-int/lit8 v6, v6, 0x1

    .line 440
    .line 441
    move-object/from16 v8, v23

    .line 442
    .line 443
    goto :goto_a

    .line 444
    :cond_b
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 445
    .line 446
    const/4 v6, 0x7

    .line 447
    invoke-direct {v1, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 448
    .line 449
    .line 450
    const/4 v8, 0x0

    .line 451
    :goto_b
    const-class v6, Ljava/math/BigInteger;

    .line 452
    .line 453
    move-object/from16 v25, v4

    .line 454
    .line 455
    const/16 v4, 0xc

    .line 456
    .line 457
    if-ge v8, v4, :cond_c

    .line 458
    .line 459
    aget-object v4, v23, v8

    .line 460
    .line 461
    invoke-virtual {v0, v4, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 462
    .line 463
    .line 464
    add-int/lit8 v8, v8, 0x1

    .line 465
    .line 466
    move-object/from16 v4, v25

    .line 467
    .line 468
    goto :goto_b

    .line 469
    :cond_c
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 470
    .line 471
    const/4 v4, 0x2

    .line 472
    const/4 v8, 0x0

    .line 473
    invoke-direct {v1, v8, v4}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 474
    .line 475
    .line 476
    const/4 v8, 0x0

    .line 477
    :goto_c
    const-class v4, Ljava/lang/Byte;

    .line 478
    .line 479
    move-object/from16 v27, v6

    .line 480
    .line 481
    const/16 v6, 0xc

    .line 482
    .line 483
    if-ge v8, v6, :cond_d

    .line 484
    .line 485
    aget-object v6, v23, v8

    .line 486
    .line 487
    invoke-virtual {v0, v6, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 488
    .line 489
    .line 490
    add-int/lit8 v8, v8, 0x1

    .line 491
    .line 492
    move-object/from16 v6, v27

    .line 493
    .line 494
    goto :goto_c

    .line 495
    :cond_d
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 496
    .line 497
    const/4 v6, 0x2

    .line 498
    invoke-direct {v1, v15, v6}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 499
    .line 500
    .line 501
    const/4 v6, 0x0

    .line 502
    :goto_d
    sget-object v8, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 503
    .line 504
    move-object/from16 v26, v4

    .line 505
    .line 506
    const/16 v4, 0xc

    .line 507
    .line 508
    if-ge v6, v4, :cond_e

    .line 509
    .line 510
    aget-object v4, v23, v6

    .line 511
    .line 512
    invoke-virtual {v0, v4, v8, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 513
    .line 514
    .line 515
    add-int/lit8 v6, v6, 0x1

    .line 516
    .line 517
    move-object/from16 v4, v26

    .line 518
    .line 519
    goto :goto_d

    .line 520
    :cond_e
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 521
    .line 522
    const/4 v4, 0x7

    .line 523
    const/4 v6, 0x0

    .line 524
    invoke-direct {v1, v6, v4}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 525
    .line 526
    .line 527
    const/4 v6, 0x0

    .line 528
    :goto_e
    const-class v4, Ljava/lang/Short;

    .line 529
    .line 530
    move-object/from16 v28, v9

    .line 531
    .line 532
    const/16 v9, 0xc

    .line 533
    .line 534
    if-ge v6, v9, :cond_f

    .line 535
    .line 536
    aget-object v9, v23, v6

    .line 537
    .line 538
    invoke-virtual {v0, v9, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 539
    .line 540
    .line 541
    add-int/lit8 v6, v6, 0x1

    .line 542
    .line 543
    move-object/from16 v9, v28

    .line 544
    .line 545
    goto :goto_e

    .line 546
    :cond_f
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 547
    .line 548
    const/4 v6, 0x7

    .line 549
    invoke-direct {v1, v14, v6}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 550
    .line 551
    .line 552
    const/4 v6, 0x0

    .line 553
    :goto_f
    sget-object v9, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 554
    .line 555
    move-object/from16 v24, v4

    .line 556
    .line 557
    const/16 v4, 0xc

    .line 558
    .line 559
    if-ge v6, v4, :cond_10

    .line 560
    .line 561
    aget-object v4, v23, v6

    .line 562
    .line 563
    invoke-virtual {v0, v4, v9, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 564
    .line 565
    .line 566
    add-int/lit8 v6, v6, 0x1

    .line 567
    .line 568
    move-object/from16 v4, v24

    .line 569
    .line 570
    goto :goto_f

    .line 571
    :cond_10
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 572
    .line 573
    const/4 v4, 0x5

    .line 574
    const/4 v6, 0x0

    .line 575
    invoke-direct {v1, v6, v4}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 576
    .line 577
    .line 578
    const/4 v6, 0x0

    .line 579
    :goto_10
    const-class v4, Ljava/lang/Integer;

    .line 580
    .line 581
    move-object/from16 v30, v10

    .line 582
    .line 583
    const/16 v10, 0xc

    .line 584
    .line 585
    if-ge v6, v10, :cond_11

    .line 586
    .line 587
    aget-object v10, v23, v6

    .line 588
    .line 589
    invoke-virtual {v0, v10, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 590
    .line 591
    .line 592
    add-int/lit8 v6, v6, 0x1

    .line 593
    .line 594
    move-object/from16 v10, v30

    .line 595
    .line 596
    goto :goto_10

    .line 597
    :cond_11
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 598
    .line 599
    const/4 v6, 0x5

    .line 600
    invoke-direct {v1, v13, v6}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 601
    .line 602
    .line 603
    const/4 v6, 0x0

    .line 604
    :goto_11
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 605
    .line 606
    move-object/from16 v29, v4

    .line 607
    .line 608
    const/16 v4, 0xc

    .line 609
    .line 610
    if-ge v6, v4, :cond_12

    .line 611
    .line 612
    aget-object v4, v23, v6

    .line 613
    .line 614
    invoke-virtual {v0, v4, v10, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 615
    .line 616
    .line 617
    add-int/lit8 v6, v6, 0x1

    .line 618
    .line 619
    move-object/from16 v4, v29

    .line 620
    .line 621
    goto :goto_11

    .line 622
    :cond_12
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 623
    .line 624
    const/4 v4, 0x6

    .line 625
    const/4 v6, 0x0

    .line 626
    invoke-direct {v1, v6, v4}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 627
    .line 628
    .line 629
    const/4 v6, 0x0

    .line 630
    :goto_12
    const-class v4, Ljava/lang/Long;

    .line 631
    .line 632
    move-object/from16 v31, v10

    .line 633
    .line 634
    const/16 v10, 0xc

    .line 635
    .line 636
    if-ge v6, v10, :cond_13

    .line 637
    .line 638
    aget-object v10, v23, v6

    .line 639
    .line 640
    invoke-virtual {v0, v10, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 641
    .line 642
    .line 643
    add-int/lit8 v6, v6, 0x1

    .line 644
    .line 645
    move-object/from16 v10, v31

    .line 646
    .line 647
    goto :goto_12

    .line 648
    :cond_13
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 649
    .line 650
    const/4 v6, 0x6

    .line 651
    invoke-direct {v1, v5, v6}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 652
    .line 653
    .line 654
    const/4 v6, 0x0

    .line 655
    :goto_13
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 656
    .line 657
    move-object/from16 v22, v4

    .line 658
    .line 659
    const/16 v4, 0xc

    .line 660
    .line 661
    if-ge v6, v4, :cond_14

    .line 662
    .line 663
    aget-object v4, v23, v6

    .line 664
    .line 665
    invoke-virtual {v0, v4, v10, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 666
    .line 667
    .line 668
    add-int/lit8 v6, v6, 0x1

    .line 669
    .line 670
    move-object/from16 v4, v22

    .line 671
    .line 672
    goto :goto_13

    .line 673
    :cond_14
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 674
    .line 675
    const/4 v4, 0x4

    .line 676
    const/4 v6, 0x0

    .line 677
    invoke-direct {v1, v6, v4}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 678
    .line 679
    .line 680
    const/4 v6, 0x0

    .line 681
    :goto_14
    const-class v4, Ljava/lang/Float;

    .line 682
    .line 683
    move-object/from16 v33, v5

    .line 684
    .line 685
    const/16 v5, 0xc

    .line 686
    .line 687
    if-ge v6, v5, :cond_15

    .line 688
    .line 689
    aget-object v5, v23, v6

    .line 690
    .line 691
    invoke-virtual {v0, v5, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 692
    .line 693
    .line 694
    add-int/lit8 v6, v6, 0x1

    .line 695
    .line 696
    move-object/from16 v5, v33

    .line 697
    .line 698
    goto :goto_14

    .line 699
    :cond_15
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 700
    .line 701
    const/4 v5, 0x4

    .line 702
    invoke-direct {v1, v3, v5}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 703
    .line 704
    .line 705
    const/4 v5, 0x0

    .line 706
    :goto_15
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 707
    .line 708
    move-object/from16 v32, v4

    .line 709
    .line 710
    const/16 v4, 0xc

    .line 711
    .line 712
    if-ge v5, v4, :cond_16

    .line 713
    .line 714
    aget-object v4, v23, v5

    .line 715
    .line 716
    invoke-virtual {v0, v4, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 717
    .line 718
    .line 719
    add-int/lit8 v5, v5, 0x1

    .line 720
    .line 721
    move-object/from16 v4, v32

    .line 722
    .line 723
    goto :goto_15

    .line 724
    :cond_16
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 725
    .line 726
    const/4 v4, 0x3

    .line 727
    const/4 v5, 0x0

    .line 728
    invoke-direct {v1, v5, v4}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 729
    .line 730
    .line 731
    const/4 v5, 0x0

    .line 732
    :goto_16
    const-class v4, Ljava/lang/Double;

    .line 733
    .line 734
    move-object/from16 v35, v10

    .line 735
    .line 736
    const/16 v10, 0xc

    .line 737
    .line 738
    if-ge v5, v10, :cond_17

    .line 739
    .line 740
    aget-object v10, v23, v5

    .line 741
    .line 742
    invoke-virtual {v0, v10, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 743
    .line 744
    .line 745
    add-int/lit8 v5, v5, 0x1

    .line 746
    .line 747
    move-object/from16 v10, v35

    .line 748
    .line 749
    goto :goto_16

    .line 750
    :cond_17
    new-instance v1, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;

    .line 751
    .line 752
    const/4 v5, 0x3

    .line 753
    invoke-direct {v1, v7, v5}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 754
    .line 755
    .line 756
    const/4 v5, 0x0

    .line 757
    :goto_17
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 758
    .line 759
    move-object/from16 v34, v4

    .line 760
    .line 761
    const/16 v4, 0xc

    .line 762
    .line 763
    if-ge v5, v4, :cond_18

    .line 764
    .line 765
    aget-object v4, v23, v5

    .line 766
    .line 767
    invoke-virtual {v0, v4, v10, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 768
    .line 769
    .line 770
    add-int/lit8 v5, v5, 0x1

    .line 771
    .line 772
    move-object/from16 v4, v34

    .line 773
    .line 774
    goto :goto_17

    .line 775
    :cond_18
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 776
    .line 777
    const/16 v4, 0x8

    .line 778
    .line 779
    invoke-direct {v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 780
    .line 781
    .line 782
    const/4 v4, 0x0

    .line 783
    :goto_18
    const-class v5, Ljava/lang/Number;

    .line 784
    .line 785
    move-object/from16 v36, v13

    .line 786
    .line 787
    const/16 v13, 0xc

    .line 788
    .line 789
    if-ge v4, v13, :cond_19

    .line 790
    .line 791
    aget-object v13, v23, v4

    .line 792
    .line 793
    invoke-virtual {v0, v13, v5, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 794
    .line 795
    .line 796
    add-int/lit8 v4, v4, 0x1

    .line 797
    .line 798
    move-object/from16 v13, v36

    .line 799
    .line 800
    goto :goto_18

    .line 801
    :cond_19
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 802
    .line 803
    const/16 v4, 0x30

    .line 804
    .line 805
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 806
    .line 807
    .line 808
    move-result-object v4

    .line 809
    invoke-direct {v1, v11, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v0, v12, v11, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 813
    .line 814
    .line 815
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 816
    .line 817
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 818
    .line 819
    invoke-direct {v1, v2, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0, v12, v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 823
    .line 824
    .line 825
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 826
    .line 827
    invoke-direct {v1, v6, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0, v12, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 831
    .line 832
    .line 833
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 834
    .line 835
    invoke-direct {v1, v10, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v0, v12, v10, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 839
    .line 840
    .line 841
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 842
    .line 843
    invoke-direct {v1, v8, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0, v12, v8, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 847
    .line 848
    .line 849
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 850
    .line 851
    invoke-direct {v1, v9, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v0, v12, v9, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 855
    .line 856
    .line 857
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 858
    .line 859
    move-object/from16 v6, v31

    .line 860
    .line 861
    move-object/from16 v4, v36

    .line 862
    .line 863
    invoke-direct {v1, v6, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v0, v12, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 867
    .line 868
    .line 869
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 870
    .line 871
    move-object/from16 v4, v33

    .line 872
    .line 873
    move-object/from16 v6, v35

    .line 874
    .line 875
    invoke-direct {v1, v6, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v0, v12, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 879
    .line 880
    .line 881
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 882
    .line 883
    move-object/from16 v4, v30

    .line 884
    .line 885
    const/4 v6, 0x0

    .line 886
    invoke-direct {v1, v4, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v0, v12, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 890
    .line 891
    .line 892
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 893
    .line 894
    move-object/from16 v4, v28

    .line 895
    .line 896
    invoke-direct {v1, v4, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v0, v12, v4, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 900
    .line 901
    .line 902
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 903
    .line 904
    move-object/from16 v7, v34

    .line 905
    .line 906
    invoke-direct {v1, v7, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v0, v12, v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 910
    .line 911
    .line 912
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 913
    .line 914
    move-object/from16 v7, v32

    .line 915
    .line 916
    invoke-direct {v1, v7, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    invoke-virtual {v0, v12, v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 920
    .line 921
    .line 922
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 923
    .line 924
    move-object/from16 v7, v26

    .line 925
    .line 926
    invoke-direct {v1, v7, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v0, v12, v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 930
    .line 931
    .line 932
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 933
    .line 934
    move-object/from16 v7, v24

    .line 935
    .line 936
    invoke-direct {v1, v7, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v0, v12, v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 940
    .line 941
    .line 942
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 943
    .line 944
    move-object/from16 v7, v29

    .line 945
    .line 946
    invoke-direct {v1, v7, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v0, v12, v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 950
    .line 951
    .line 952
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 953
    .line 954
    move-object/from16 v7, v22

    .line 955
    .line 956
    invoke-direct {v1, v7, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v0, v12, v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 960
    .line 961
    .line 962
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 963
    .line 964
    move-object/from16 v8, v25

    .line 965
    .line 966
    invoke-direct {v1, v8, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v0, v12, v8, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 970
    .line 971
    .line 972
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 973
    .line 974
    move-object/from16 v9, v27

    .line 975
    .line 976
    invoke-direct {v1, v9, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v0, v12, v9, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 980
    .line 981
    .line 982
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 983
    .line 984
    invoke-direct {v1, v8, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v0, v12, v5, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 988
    .line 989
    .line 990
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 991
    .line 992
    const-class v5, Ljava/util/Collection;

    .line 993
    .line 994
    invoke-direct {v1, v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v0, v12, v5, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 998
    .line 999
    .line 1000
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 1001
    .line 1002
    const-class v5, Ljava/util/List;

    .line 1003
    .line 1004
    invoke-direct {v1, v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v0, v12, v5, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 1008
    .line 1009
    .line 1010
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;

    .line 1011
    .line 1012
    const-class v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 1013
    .line 1014
    invoke-direct {v1, v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0, v12, v5, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 1018
    .line 1019
    .line 1020
    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 1021
    .line 1022
    const/16 v5, 0xe

    .line 1023
    .line 1024
    invoke-direct {v1, v5}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v0, v4, v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 1028
    .line 1029
    .line 1030
    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 1031
    .line 1032
    const/16 v2, 0x19

    .line 1033
    .line 1034
    invoke-direct {v1, v2}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 1035
    .line 1036
    .line 1037
    const-class v2, Ljava/time/LocalDateTime;

    .line 1038
    .line 1039
    invoke-virtual {v0, v7, v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 1040
    .line 1041
    .line 1042
    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 1043
    .line 1044
    const/16 v2, 0x1c

    .line 1045
    .line 1046
    invoke-direct {v1, v2}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 1047
    .line 1048
    .line 1049
    const-class v2, Ljava/util/UUID;

    .line 1050
    .line 1051
    invoke-virtual {v0, v12, v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 1052
    .line 1053
    .line 1054
    move-object/from16 v4, v21

    .line 1055
    .line 1056
    const/4 v1, 0x0

    .line 1057
    const/4 v2, 0x1

    .line 1058
    goto/16 :goto_6

    .line 1059
    .line 1060
    :cond_1a
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 17
    .line 18
    invoke-virtual {v1, p1, p2, p3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲苏楪兰(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, p1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 25
    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    iget-object p0, p1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p3, "set"

    .line 37
    .line 38
    invoke-virtual {p0, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_1

    .line 43
    .line 44
    const/4 p3, 0x3

    .line 45
    invoke-virtual {p0, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p2, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    filled-new-array {p0}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iput-object p0, p1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;Ljava/lang/Class;Ljava/lang/reflect/Field;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 17
    .line 18
    invoke-virtual {v1, p1, p2, p3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲楪兰苏(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;Ljava/lang/Class;Ljava/lang/reflect/Constructor;ILjava/lang/reflect/Parameter;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_5

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object v3, v1, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;

    .line 24
    .line 25
    iget-object v3, v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 26
    .line 27
    iget-object v3, v3, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {v3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/Class;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    if-eq v3, p2, :cond_0

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    .line 46
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_1

    .line 48
    :catch_0
    move-object v3, v2

    .line 49
    :goto_1
    if-eqz v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/reflect/Executable;->getParameters()[Ljava/lang/reflect/Parameter;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    aget-object v3, v3, p4

    .line 56
    .line 57
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/AnnotatedElement;)[Ljava/lang/annotation/Annotation;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v1, p1, v3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;[Ljava/lang/annotation/Annotation;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Ljava/lang/Class;->getModifiers()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    :try_start_1
    invoke-static {p5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/AnnotatedElement;)[Ljava/lang/annotation/Annotation;

    .line 79
    .line 80
    .line 81
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    goto :goto_3

    .line 83
    :cond_1
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    array-length v4, v3

    .line 88
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-ne v4, v5, :cond_2

    .line 93
    .line 94
    move v4, p4

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    add-int/lit8 v4, p4, -0x1

    .line 97
    .line 98
    :goto_2
    if-ltz v4, :cond_3

    .line 99
    .line 100
    array-length v5, v3

    .line 101
    if-ge v4, v5, :cond_3

    .line 102
    .line 103
    aget-object v2, v3, v4

    .line 104
    .line 105
    :catch_1
    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    .line 106
    .line 107
    array-length v3, v2

    .line 108
    if-lez v3, :cond_4

    .line 109
    .line 110
    invoke-virtual {v1, p1, v2}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;[Ljava/lang/annotation/Annotation;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v3, p3

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    if-eqz v6, :cond_1

    .line 17
    .line 18
    :cond_0
    :goto_0
    move-object/from16 v16, v5

    .line 19
    .line 20
    goto/16 :goto_7

    .line 21
    .line 22
    :cond_1
    sget-boolean v6, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲兰苏世:Z

    .line 23
    .line 24
    if-eqz v6, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    const/16 v7, 0xc0

    .line 32
    .line 33
    const-string v8, "autoType is not support. "

    .line 34
    .line 35
    if-ge v6, v7, :cond_1a

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    const/16 v10, 0x5b

    .line 43
    .line 44
    const/4 v11, 0x1

    .line 45
    if-ne v9, v10, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual {v0, v9, v5, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    :cond_3
    if-eqz v2, :cond_4

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_4

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v2

    .line 70
    :cond_4
    sget-object v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 71
    .line 72
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 73
    .line 74
    and-long/2addr v9, v3

    .line 75
    const-wide/16 v12, 0x0

    .line 76
    .line 77
    cmp-long v9, v9, v12

    .line 78
    .line 79
    if-eqz v9, :cond_5

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    move v11, v7

    .line 83
    :goto_1
    iget-object v9, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲苏世兰:[J

    .line 84
    .line 85
    move-object/from16 v16, v5

    .line 86
    .line 87
    const/16 v5, 0x24

    .line 88
    .line 89
    const-wide v17, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    const-string v7, " -> "

    .line 95
    .line 96
    const-string v10, "type not match. "

    .line 97
    .line 98
    move-wide/from16 v19, v12

    .line 99
    .line 100
    if-eqz v11, :cond_a

    .line 101
    .line 102
    move-wide/from16 v21, v17

    .line 103
    .line 104
    const/4 v12, 0x0

    .line 105
    :goto_2
    if-ge v12, v6, :cond_a

    .line 106
    .line 107
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    if-ne v13, v5, :cond_6

    .line 112
    .line 113
    const/16 v13, 0x2e

    .line 114
    .line 115
    :cond_6
    const-wide v23, 0x100000001b3L

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    int-to-long v14, v13

    .line 121
    xor-long v13, v21, v14

    .line 122
    .line 123
    mul-long v13, v13, v23

    .line 124
    .line 125
    invoke-static {v9, v13, v14}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    if-ltz v15, :cond_9

    .line 130
    .line 131
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    if-eqz v15, :cond_9

    .line 136
    .line 137
    if-eqz v2, :cond_8

    .line 138
    .line 139
    invoke-virtual {v2, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_7

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    invoke-static {v10, v1, v7}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v2, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-object v16

    .line 158
    :cond_8
    :goto_3
    invoke-virtual {v0, v15, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v15

    .line 162
    :cond_9
    add-int/lit8 v12, v12, 0x1

    .line 163
    .line 164
    move-wide/from16 v21, v13

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_a
    const-wide v23, 0x100000001b3L

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    if-nez v11, :cond_f

    .line 173
    .line 174
    const/4 v12, 0x0

    .line 175
    :goto_4
    if-ge v12, v6, :cond_f

    .line 176
    .line 177
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    if-ne v13, v5, :cond_b

    .line 182
    .line 183
    const/16 v13, 0x2e

    .line 184
    .line 185
    :cond_b
    int-to-long v13, v13

    .line 186
    xor-long v13, v17, v13

    .line 187
    .line 188
    mul-long v13, v13, v23

    .line 189
    .line 190
    invoke-static {v9, v13, v14}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    if-ltz v15, :cond_e

    .line 195
    .line 196
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    if-eqz v3, :cond_d

    .line 201
    .line 202
    if-eqz v2, :cond_d

    .line 203
    .line 204
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_c

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_c
    invoke-static {v10, v1, v7}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v2, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-object v16

    .line 223
    :cond_d
    :goto_5
    invoke-virtual {v0, v3, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-object v3

    .line 227
    :cond_e
    add-int/lit8 v12, v12, 0x1

    .line 228
    .line 229
    move-wide/from16 v17, v13

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_f
    if-nez v11, :cond_10

    .line 233
    .line 234
    goto/16 :goto_7

    .line 235
    .line 236
    :cond_10
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲楪苏兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 237
    .line 238
    invoke-virtual {v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    check-cast v5, Ljava/lang/Class;

    .line 243
    .line 244
    if-eqz v5, :cond_13

    .line 245
    .line 246
    if-eqz v2, :cond_12

    .line 247
    .line 248
    const-class v3, Ljava/lang/Object;

    .line 249
    .line 250
    if-eq v2, v3, :cond_12

    .line 251
    .line 252
    const-class v3, Ljava/util/HashMap;

    .line 253
    .line 254
    if-eq v5, v3, :cond_12

    .line 255
    .line 256
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_11

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_11
    invoke-static {v10, v1, v7}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v2, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return-object v16

    .line 275
    :cond_12
    :goto_6
    invoke-virtual {v0, v5, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-object v5

    .line 279
    :cond_13
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    if-eqz v5, :cond_19

    .line 284
    .line 285
    const-class v6, Ljava/lang/ClassLoader;

    .line 286
    .line 287
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    if-nez v6, :cond_18

    .line 292
    .line 293
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏兰世哲:Ljava/lang/Class;

    .line 294
    .line 295
    if-eqz v6, :cond_14

    .line 296
    .line 297
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    if-nez v6, :cond_18

    .line 302
    .line 303
    :cond_14
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏兰哲世:Ljava/lang/Class;

    .line 304
    .line 305
    if-eqz v6, :cond_15

    .line 306
    .line 307
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    if-nez v6, :cond_18

    .line 312
    .line 313
    :cond_15
    if-eqz v2, :cond_19

    .line 314
    .line 315
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-eqz v6, :cond_16

    .line 320
    .line 321
    invoke-virtual {v0, v5, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    return-object v5

    .line 325
    :cond_16
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreAutoTypeNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 326
    .line 327
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 328
    .line 329
    and-long/2addr v3, v5

    .line 330
    cmp-long v0, v3, v19

    .line 331
    .line 332
    if-eqz v0, :cond_17

    .line 333
    .line 334
    return-object v2

    .line 335
    :cond_17
    invoke-static {v10, v1, v7}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-static {v2, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    return-object v16

    .line 347
    :cond_18
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-object v16

    .line 355
    :cond_19
    invoke-virtual {v0, v5, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    return-object v5

    .line 359
    :cond_1a
    move-object/from16 v16, v5

    .line 360
    .line 361
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    :goto_7
    return-object v16
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/function/Consumer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 9
    .line 10
    monitor-enter p1

    .line 11
    :try_start_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 12
    .line 13
    new-instance v0, Ljava/util/Date;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p2, v0}, Ljava/util/HashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    monitor-exit p1

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Class;

    .line 8
    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    move-object v0, p0

    .line 24
    check-cast v0, Ljava/util/Map;

    .line 25
    .line 26
    :cond_0
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/util/function/Function;

    .line 31
    .line 32
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(JLcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-class v1, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v1, v0

    .line 58
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v1, v0, p3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 10
    .line 11
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 12
    .line 13
    and-long/2addr p3, v1

    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    cmp-long p3, p3, v1

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const/4 p3, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p3, 0x0

    .line 23
    :goto_0
    invoke-virtual {p0, v0, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    if-eq v0, p2, :cond_2

    .line 28
    .line 29
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世苏兰(JLcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-object p3
.end method

.method public final 飘花落叶言子楪苏世哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 4

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-wide v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;->飘花落叶言子楪世苏哲兰:J

    .line 7
    .line 8
    cmp-long v2, v2, p1

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    iget-object p0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;->飘花落叶言子楪世哲苏兰:I

    .line 16
    .line 17
    add-int/lit8 v3, v2, 0x1

    .line 18
    .line 19
    iput v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;->飘花落叶言子楪世哲苏兰:I

    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    if-le v2, v0, :cond_1

    .line 24
    .line 25
    sput-object v1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;

    .line 26
    .line 27
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    sget-object v3, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/ClassLoader;

    .line 42
    .line 43
    if-eq v2, v3, :cond_2

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 68
    .line 69
    :cond_2
    if-nez v1, :cond_3

    .line 70
    .line 71
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    move-object v1, p0

    .line 78
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 79
    .line 80
    :cond_3
    if-eqz v1, :cond_4

    .line 81
    .line 82
    sget-object p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;

    .line 83
    .line 84
    if-nez p0, :cond_4

    .line 85
    .line 86
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;

    .line 87
    .line 88
    invoke-direct {p0, p1, p2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;-><init>(JLcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)V

    .line 89
    .line 90
    .line 91
    sput-object p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲世兰;

    .line 92
    .line 93
    :cond_4
    return-object v1
.end method

.method public final 飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Map;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/util/function/Function;

    .line 18
    .line 19
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)V
    .locals 2

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 11

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move-object p1, v0

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 24
    .line 25
    :goto_0
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-nez v3, :cond_3

    .line 28
    .line 29
    instance-of v6, p1, Ljava/lang/reflect/WildcardType;

    .line 30
    .line 31
    if-eqz v6, :cond_3

    .line 32
    .line 33
    move-object v6, p1

    .line 34
    check-cast v6, Ljava/lang/reflect/WildcardType;

    .line 35
    .line 36
    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    array-length v7, v6

    .line 41
    if-ne v7, v5, :cond_3

    .line 42
    .line 43
    aget-object v3, v6, v4

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :goto_1
    check-cast v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    .line 60
    .line 61
    return-object v3

    .line 62
    :cond_4
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const/4 v6, 0x0

    .line 69
    move-object v7, v6

    .line 70
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-eqz v8, :cond_8

    .line 75
    .line 76
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;

    .line 81
    .line 82
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    if-eqz v7, :cond_5

    .line 90
    .line 91
    if-eqz p2, :cond_6

    .line 92
    .line 93
    invoke-virtual {v2, p1, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    invoke-virtual {v1, p1, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 105
    .line 106
    :goto_3
    if-eqz p0, :cond_7

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_7
    return-object v7

    .line 110
    :cond_8
    instance-of v1, p1, Ljava/lang/reflect/TypeVariable;

    .line 111
    .line 112
    if-eqz v1, :cond_a

    .line 113
    .line 114
    move-object v1, p1

    .line 115
    check-cast v1, Ljava/lang/reflect/TypeVariable;

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    array-length v2, v1

    .line 122
    if-lez v2, :cond_a

    .line 123
    .line 124
    aget-object v1, v1, v4

    .line 125
    .line 126
    instance-of v2, v1, Ljava/lang/Class;

    .line 127
    .line 128
    if-eqz v2, :cond_a

    .line 129
    .line 130
    invoke-virtual {p0, v1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-eqz v1, :cond_a

    .line 135
    .line 136
    invoke-virtual {p0, p2, p1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲兰世(ZLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-eqz p0, :cond_9

    .line 141
    .line 142
    return-object p0

    .line 143
    :cond_9
    return-object v1

    .line 144
    :cond_a
    instance-of v1, p1, Ljava/lang/reflect/ParameterizedType;

    .line 145
    .line 146
    const-wide/16 v2, 0x0

    .line 147
    .line 148
    if-eqz v1, :cond_11

    .line 149
    .line 150
    move-object v1, p1

    .line 151
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    instance-of v9, v8, Ljava/lang/Class;

    .line 162
    .line 163
    if-eqz v9, :cond_11

    .line 164
    .line 165
    check-cast v8, Ljava/lang/Class;

    .line 166
    .line 167
    move-object v9, v8

    .line 168
    :goto_4
    if-eq v9, v0, :cond_c

    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    array-length v10, v10

    .line 175
    if-lez v10, :cond_b

    .line 176
    .line 177
    move v4, v5

    .line 178
    goto :goto_5

    .line 179
    :cond_b
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    goto :goto_4

    .line 184
    :cond_c
    :goto_5
    array-length v0, v1

    .line 185
    if-eqz v0, :cond_d

    .line 186
    .line 187
    if-nez v4, :cond_f

    .line 188
    .line 189
    :cond_d
    invoke-virtual {p0, v8, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-eqz v0, :cond_f

    .line 194
    .line 195
    invoke-virtual {p0, p2, p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲兰世(ZLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-eqz p0, :cond_e

    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_e
    return-object v0

    .line 203
    :cond_f
    array-length v0, v1

    .line 204
    if-ne v0, v5, :cond_10

    .line 205
    .line 206
    const-class v0, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_10

    .line 213
    .line 214
    invoke-static {v8, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :cond_10
    array-length v0, v1

    .line 220
    const/4 v1, 0x2

    .line 221
    if-ne v0, v1, :cond_11

    .line 222
    .line 223
    const-class v0, Ljava/util/Map;

    .line 224
    .line 225
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_11

    .line 230
    .line 231
    invoke-static {p1, v8, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0

    .line 236
    :cond_11
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    if-nez p2, :cond_12

    .line 245
    .line 246
    const-string v4, "com.google.common.collect.ArrayListMultimap"

    .line 247
    .line 248
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_12

    .line 253
    .line 254
    invoke-static {v6, v0, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    :cond_12
    if-nez v7, :cond_14

    .line 259
    .line 260
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/ThreadLocal;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    .line 267
    .line 268
    if-eqz v1, :cond_13

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_13
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    .line 272
    .line 273
    :goto_6
    invoke-virtual {v1, v0, p1, p2, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;ZLcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    :cond_14
    invoke-virtual {p0, p2, p1, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲兰世(ZLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    if-eqz p0, :cond_15

    .line 282
    .line 283
    return-object p0

    .line 284
    :cond_15
    return-object v7
.end method

.method public final 飘花落叶言子楪苏哲兰世(ZLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {p0, p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 19
    .line 20
    return-object p0
.end method
