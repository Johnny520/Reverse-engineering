.class public final synthetic Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lorg/apache/commons/io/monitor/FileEntry;

    .line 14
    .line 15
    check-cast v4, Ljava/io/File;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-static {p0, v4}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->飘花落叶言子楪世哲兰苏(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-static {p0, v4, p1}, Llin/xposed/hook/util/qq/QQMsgService;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Long;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    check-cast p0, [Ljava/lang/Enum;

    .line 34
    .line 35
    move-object v8, v4

    .line 36
    check-cast v8, [Ljava/lang/String;

    .line 37
    .line 38
    check-cast p1, Ljava/lang/reflect/Field;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move v9, v2

    .line 45
    :goto_1
    array-length v1, p0

    .line 46
    if-ge v9, v1, :cond_5

    .line 47
    .line 48
    aget-object v1, p0, v9

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    array-length p1, p0

    .line 65
    :goto_2
    if-ge v2, p1, :cond_5

    .line 66
    .line 67
    aget-object v6, p0, v2

    .line 68
    .line 69
    invoke-interface {v6}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v3, "\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u4e16\u5170\u82cf\u54f2.\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf"

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_2

    .line 84
    .line 85
    const-string v3, "com.alibaba.fastjson.annotation.JSONField"

    .line 86
    .line 87
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_1
    const-string v3, "com.fasterxml.jackson.annotation.JsonProperty"

    .line 95
    .line 96
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    new-instance v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;

    .line 103
    .line 104
    const/4 v10, 0x1

    .line 105
    invoke-direct/range {v5 .. v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/annotation/Annotation;Ljava/lang/String;[Ljava/lang/String;II)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_2
    :goto_3
    new-instance v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;

    .line 113
    .line 114
    const/4 v10, 0x0

    .line 115
    invoke-direct/range {v5 .. v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/annotation/Annotation;Ljava/lang/String;[Ljava/lang/String;II)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    return-void

    .line 128
    :pswitch_2
    check-cast p0, Ljava/lang/annotation/Annotation;

    .line 129
    .line 130
    check-cast v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 131
    .line 132
    check-cast p1, Ljava/lang/reflect/Method;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :try_start_0
    const-string v2, "unwrapped"

    .line 139
    .line 140
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_6

    .line 145
    .line 146
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-eqz p0, :cond_6

    .line 157
    .line 158
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    .line 161
    :catchall_0
    :cond_6
    return-void

    .line 162
    :pswitch_3
    check-cast p0, Ljava/lang/String;

    .line 163
    .line 164
    check-cast v4, [Ljava/lang/reflect/Field;

    .line 165
    .line 166
    check-cast p1, Ljava/lang/reflect/Field;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-eqz p0, :cond_7

    .line 177
    .line 178
    aput-object p1, v4, v2

    .line 179
    .line 180
    :cond_7
    return-void

    .line 181
    :pswitch_4
    check-cast p0, Ljava/lang/annotation/Annotation;

    .line 182
    .line 183
    check-cast v4, [Ljava/lang/String;

    .line 184
    .line 185
    check-cast p1, Ljava/lang/reflect/Method;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :try_start_1
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    const v1, -0x4169f1a6

    .line 200
    .line 201
    .line 202
    if-eq p1, v1, :cond_a

    .line 203
    .line 204
    const v1, -0x2f271470

    .line 205
    .line 206
    .line 207
    if-eq p1, v1, :cond_9

    .line 208
    .line 209
    const v1, 0x6854fa1

    .line 210
    .line 211
    .line 212
    if-eq p1, v1, :cond_8

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_8
    const-string p1, "shape"

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_b

    .line 222
    .line 223
    check-cast p0, Ljava/lang/Enum;

    .line 224
    .line 225
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    aput-object p0, v4, v3

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_9
    const-string p1, "pattern"

    .line 233
    .line 234
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-eqz p1, :cond_b

    .line 239
    .line 240
    check-cast p0, Ljava/lang/String;

    .line 241
    .line 242
    aput-object p0, v4, v2

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_a
    const-string p1, "locale"

    .line 246
    .line 247
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_b

    .line 252
    .line 253
    check-cast p0, Ljava/lang/String;

    .line 254
    .line 255
    const/4 p1, 0x2

    .line 256
    aput-object p0, v4, p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 257
    .line 258
    :catchall_1
    :cond_b
    :goto_5
    return-void

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
