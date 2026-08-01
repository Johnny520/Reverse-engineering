.class public final synthetic L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:J

.field public final synthetic 飘花落叶言子楪兰世苏哲:I

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲兰苏世:J

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰哲苏;Ljava/util/ArrayList;Ljava/lang/String;JIJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p3, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p4, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:J

    .line 9
    .line 10
    iput p6, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    iput-wide p7, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 11
    .line 12
    invoke-direct {v1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 13
    .line 14
    .line 15
    const-wide v2, -0x36a533a8051405a7L    # -2.390480878360255E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 30
    .line 31
    .line 32
    const-wide v2, -0x36a53324051405a7L    # -2.3906605474499894E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    const-wide v4, -0x36a53327051405a7L    # -2.3906564640615863E45

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    const-wide v4, -0x36a53323051405a7L    # -2.390661908579457E45

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    const-wide v4, -0x36a5339b051405a7L    # -2.390498573043335E45

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v1, v4, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    const-wide v4, -0x36a5338c051405a7L    # -2.3905189899853502E45

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v4, 0x1

    .line 90
    :try_start_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONObject;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v0, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v1, v2, v0, v4}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 111
    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    :goto_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONObject;->parseObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-wide v1, -0x36a53353051405a7L    # -2.3905965743650082E45

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_0

    .line 136
    .line 137
    iget v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 138
    .line 139
    iget-object v1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v0, v1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getContact(ILjava/lang/String;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v2, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    iget-wide v5, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:J

    .line 151
    .line 152
    invoke-static {v5, v6}, Llin/xposed/hook/util/qq/CreateElement;->createReplyElement(J)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    const-wide v5, -0x36a53e85051405a7L    # -2.3866955773106266E45

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-static {v5}, Llin/xposed/hook/util/qq/CreateElement;->createTextElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v2}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 176
    .line 177
    .line 178
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v4, v0}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getContact(ILjava/lang/String;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-instance v2, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    const-wide v5, -0x36a53e43051405a7L    # -2.3867854118554937E45

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    iget-wide v5, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:J

    .line 204
    .line 205
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-static {v0, p0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendText(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-wide/16 v2, 0x7d0

    .line 216
    .line 217
    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 218
    .line 219
    .line 220
    :catch_1
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-static {v1, p0, v4}, Llin/xposed/hook/util/qq/QQNTTroopTool;->kickMember(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 225
    .line 226
    .line 227
    :cond_0
    return-void
.end method
