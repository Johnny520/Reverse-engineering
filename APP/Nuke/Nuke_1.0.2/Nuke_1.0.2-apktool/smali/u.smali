.class public final synthetic Lu;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:J

.field public final synthetic i:Lnuke/module/wechat/ai/AIChatConfig;

.field public final synthetic j:Lby0;

.field public final synthetic k:La0;

.field public final synthetic l:Lnuke/module/wechat/ai/AIChatMessage;

.field public final synthetic m:Lnuke/module/wechat/ai/AIChatResponse;


# direct methods
.method public synthetic constructor <init>(JLnuke/module/wechat/ai/AIChatConfig;Lby0;La0;Lnuke/module/wechat/ai/AIChatMessage;Lnuke/module/wechat/ai/AIChatResponse;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lu;->h:J

    .line 5
    .line 6
    iput-object p3, p0, Lu;->i:Lnuke/module/wechat/ai/AIChatConfig;

    .line 7
    .line 8
    iput-object p4, p0, Lu;->j:Lby0;

    .line 9
    .line 10
    iput-object p5, p0, Lu;->k:La0;

    .line 11
    .line 12
    iput-object p6, p0, Lu;->l:Lnuke/module/wechat/ai/AIChatMessage;

    .line 13
    .line 14
    iput-object p7, p0, Lu;->m:Lnuke/module/wechat/ai/AIChatResponse;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-wide v0, p0, Lu;->h:J

    .line 2
    .line 3
    iget-object v2, p0, Lu;->i:Lnuke/module/wechat/ai/AIChatConfig;

    .line 4
    .line 5
    iget-object v3, p0, Lu;->j:Lby0;

    .line 6
    .line 7
    iget-object v4, p0, Lu;->k:La0;

    .line 8
    .line 9
    iget-object v5, p0, Lu;->l:Lnuke/module/wechat/ai/AIChatMessage;

    .line 10
    .line 11
    iget-object p0, p0, Lu;->m:Lnuke/module/wechat/ai/AIChatResponse;

    .line 12
    .line 13
    check-cast p1, Lmo2;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object p1, Lb0;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    cmp-long p1, v0, v6

    .line 25
    .line 26
    if-nez p1, :cond_5

    .line 27
    .line 28
    sget-object p1, Lb0;->d:Lb0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lb0;->q()Lnuke/module/wechat/ai/AIChatConfig;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, v2}, Lnuke/module/wechat/ai/AIChatConfig;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    iget-object p1, v3, Lby0;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v2}, Lnuke/module/wechat/ai/AIChatConfig;->getContextRounds()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    new-instance v1, Lnuke/module/wechat/ai/AIChatMessage;

    .line 50
    .line 51
    sget-object v6, Lg1;->k:Lg1;

    .line 52
    .line 53
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatResponse;->getContent()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-direct {v1, v6, v7}, Lnuke/module/wechat/ai/AIChatMessage;-><init>(Lg1;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object v6, Lb0;->m:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter v6

    .line 63
    :try_start_0
    sget-object v7, Lb0;->o:La0;

    .line 64
    .line 65
    invoke-static {v7, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sget-object v7, Lb0;->n:Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-virtual {v7}, Ljava/util/HashMap;->clear()V

    .line 75
    .line 76
    .line 77
    sput-object v4, Lb0;->o:La0;

    .line 78
    .line 79
    :goto_0
    if-gtz v0, :cond_1

    .line 80
    .line 81
    sget-object v0, Lb0;->n:Ljava/util/HashMap;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    goto :goto_2

    .line 89
    :cond_1
    const/16 v4, 0x14

    .line 90
    .line 91
    if-le v0, v4, :cond_2

    .line 92
    .line 93
    move v0, v4

    .line 94
    :cond_2
    mul-int/lit8 v0, v0, 0x2

    .line 95
    .line 96
    sget-object v4, Lb0;->n:Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-nez v7, :cond_3

    .line 103
    .line 104
    new-instance v7, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, p1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    :cond_3
    check-cast v7, Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v7, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-le p1, v0, :cond_4

    .line 125
    .line 126
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    sub-int/2addr p1, v0

    .line 131
    const/4 v0, 0x0

    .line 132
    invoke-interface {v7, v0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {p1}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    :cond_4
    :goto_1
    monitor-exit v6

    .line 140
    goto :goto_3

    .line 141
    :goto_2
    monitor-exit v6

    .line 142
    throw p0

    .line 143
    :cond_5
    :goto_3
    sget-object p1, Lb0;->d:Lb0;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    sget-object p1, Lb0;->h:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v0, v3, Lby0;->a:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatResponse;->getModel()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    if-nez v1, :cond_6

    .line 157
    .line 158
    invoke-virtual {v2}, Lnuke/module/wechat/ai/AIChatConfig;->getModel()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    :cond_6
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatResponse;->getContent()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatResponse;->getFinishReason()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatResponse;->getTotalTokens()Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const-string v4, "AI reply sent: talker="

    .line 179
    .line 180
    const-string v5, ", model="

    .line 181
    .line 182
    const-string v6, ", replyLength="

    .line 183
    .line 184
    invoke-static {v4, v0, v5, v1, v6}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v1, ", finishReason="

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v1, ", totalTokens="

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-static {p1, p0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    sget-object p0, La83;->a:La83;

    .line 215
    .line 216
    return-object p0
.end method
