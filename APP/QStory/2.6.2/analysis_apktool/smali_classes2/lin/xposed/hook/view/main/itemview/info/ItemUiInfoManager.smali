.class public Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final isInit:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final rootContainer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->rootContainer:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->isInit:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static addDirUiInfo(Ljava/lang/String;Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;)V
    .locals 3

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->rootContainer:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v2, v1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 22
    .line 23
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getGroupName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->addDirectoryUIInfo(Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public static findInfoIndex(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    sget-object v2, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->rootContainer:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v1, v3, :cond_2

    .line 10
    .line 11
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    instance-of v3, v2, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    check-cast v2, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 20
    .line 21
    invoke-virtual {v2}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getGroupName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    move v3, v0

    .line 32
    :goto_1
    invoke-virtual {v2}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-ge v3, v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v2}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    instance-of v5, v4, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 51
    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    check-cast v4, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 55
    .line 56
    invoke-virtual {v4}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->getItemName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    filled-new-array {v1, v3}, [I

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public static init()V
    .locals 9

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->isInit:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_d

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 39
    .line 40
    instance-of v3, v2, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    move-object v3, v2

    .line 46
    check-cast v3, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 47
    .line 48
    new-instance v5, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    invoke-direct {v5}, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 51
    .line 52
    .line 53
    const-wide v6, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    iput-object v6, v5, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 63
    .line 64
    const-wide v6, -0x36a58b7b051405a7L    # -2.3598786045383213E45

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    iput-object v8, v5, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    iput-object v8, v5, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    iput-object v6, v5, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 86
    .line 87
    new-instance v6, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 88
    .line 89
    invoke-direct {v6}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 90
    .line 91
    .line 92
    const-wide v7, -0x36a58b71051405a7L    # -2.359892215832998E45

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    const-class v8, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 102
    .line 103
    invoke-virtual {v6, v8, v7}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 108
    .line 109
    if-nez v6, :cond_2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move-object v5, v6

    .line 113
    :goto_1
    invoke-virtual {v3, v5}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_3

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    invoke-virtual {v2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const-wide v5, -0x36a56370051405a7L    # -2.3738315427115474E45

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_4
    invoke-virtual {v2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    const-wide v5, -0x36a507a5051405a7L    # -2.405816724072648E45

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    new-instance v5, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    .line 158
    .line 159
    invoke-direct {v5, v3}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;-><init>([Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iput-object v2, v5, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;->item:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 163
    .line 164
    array-length v2, v3

    .line 165
    const/4 v6, 0x3

    .line 166
    if-eq v2, v6, :cond_a

    .line 167
    .line 168
    const/4 v6, 0x4

    .line 169
    if-eq v2, v6, :cond_5

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_5
    sget-object v2, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->rootContainer:Ljava/util/List;

    .line 174
    .line 175
    aget-object v6, v3, v4

    .line 176
    .line 177
    invoke-static {v2, v6}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->isContainsGroup(Ljava/util/List;Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-nez v6, :cond_6

    .line 182
    .line 183
    new-instance v6, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 184
    .line 185
    invoke-direct {v6}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;-><init>()V

    .line 186
    .line 187
    .line 188
    aget-object v7, v3, v4

    .line 189
    .line 190
    invoke-virtual {v6, v7}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->setGroupName(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    :cond_6
    aget-object v6, v3, v4

    .line 197
    .line 198
    aget-object v7, v3, v1

    .line 199
    .line 200
    invoke-static {v6, v7}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->isContainsDir(Ljava/lang/String;Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-nez v6, :cond_7

    .line 205
    .line 206
    new-instance v6, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 207
    .line 208
    invoke-direct {v6, v3}, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;-><init>([Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    aget-object v7, v3, v4

    .line 212
    .line 213
    invoke-static {v7, v6}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->addDirUiInfo(Ljava/lang/String;Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;)V

    .line 214
    .line 215
    .line 216
    :cond_7
    aget-object v6, v3, v4

    .line 217
    .line 218
    aget-object v7, v3, v1

    .line 219
    .line 220
    invoke-static {v6, v7}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->findInfoIndex(Ljava/lang/String;Ljava/lang/String;)[I

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    if-eqz v6, :cond_1

    .line 225
    .line 226
    aget v4, v6, v4

    .line 227
    .line 228
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 233
    .line 234
    invoke-virtual {v2}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    aget v4, v6, v1

    .line 239
    .line 240
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 245
    .line 246
    iget-object v4, v2, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->groupWrapperList:Ljava/util/List;

    .line 247
    .line 248
    const/4 v6, 0x2

    .line 249
    aget-object v7, v3, v6

    .line 250
    .line 251
    invoke-static {v4, v7}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->isContainsGroup(Ljava/util/List;Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-nez v7, :cond_8

    .line 256
    .line 257
    new-instance v7, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 258
    .line 259
    invoke-direct {v7}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;-><init>()V

    .line 260
    .line 261
    .line 262
    aget-object v8, v3, v6

    .line 263
    .line 264
    invoke-virtual {v7, v8}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->setGroupName(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v7}, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->addGroupWrapper(Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;)V

    .line 268
    .line 269
    .line 270
    :cond_8
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    :cond_9
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eqz v4, :cond_1

    .line 279
    .line 280
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    check-cast v4, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 285
    .line 286
    invoke-virtual {v4}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getGroupName()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    aget-object v8, v3, v6

    .line 291
    .line 292
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    if-eqz v7, :cond_9

    .line 297
    .line 298
    invoke-virtual {v4}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_a
    sget-object v2, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->rootContainer:Ljava/util/List;

    .line 307
    .line 308
    aget-object v6, v3, v4

    .line 309
    .line 310
    invoke-static {v2, v6}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->isContainsGroup(Ljava/util/List;Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    if-nez v6, :cond_b

    .line 315
    .line 316
    new-instance v6, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 317
    .line 318
    invoke-direct {v6}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;-><init>()V

    .line 319
    .line 320
    .line 321
    aget-object v7, v3, v4

    .line 322
    .line 323
    invoke-virtual {v6, v7}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->setGroupName(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    :cond_b
    aget-object v6, v3, v4

    .line 330
    .line 331
    aget-object v7, v3, v1

    .line 332
    .line 333
    invoke-static {v6, v7}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->isContainsDir(Ljava/lang/String;Ljava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-nez v6, :cond_c

    .line 338
    .line 339
    new-instance v6, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 340
    .line 341
    invoke-direct {v6, v3}, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;-><init>([Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    aget-object v7, v3, v4

    .line 345
    .line 346
    invoke-static {v7, v6}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->addDirUiInfo(Ljava/lang/String;Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;)V

    .line 347
    .line 348
    .line 349
    :cond_c
    aget-object v6, v3, v4

    .line 350
    .line 351
    aget-object v3, v3, v1

    .line 352
    .line 353
    invoke-static {v6, v3}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->findInfoIndex(Ljava/lang/String;Ljava/lang/String;)[I

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    if-eqz v3, :cond_1

    .line 358
    .line 359
    aget v4, v3, v4

    .line 360
    .line 361
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    check-cast v2, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 366
    .line 367
    invoke-virtual {v2}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    aget v3, v3, v1

    .line 372
    .line 373
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    check-cast v2, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 378
    .line 379
    invoke-virtual {v2, v5}, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;->addItemUiInfo(Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_0

    .line 383
    .line 384
    :cond_d
    :goto_3
    return-void
.end method

.method private static isContainsDir(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->rootContainer:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v2, v1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 22
    .line 23
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getGroupName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getDirectoryUIInfoList()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;

    .line 52
    .line 53
    instance-of v3, v2, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 54
    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    check-cast v2, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 58
    .line 59
    invoke-virtual {v2}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->getItemName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    return p0

    .line 71
    :cond_2
    const/4 p0, 0x0

    .line 72
    return p0
.end method

.method private static isContainsGroup(Ljava/util/List;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 20
    .line 21
    invoke-virtual {v0}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;->getGroupName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method
