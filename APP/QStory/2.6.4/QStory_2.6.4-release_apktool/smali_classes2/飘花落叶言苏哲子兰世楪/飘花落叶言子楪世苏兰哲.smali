.class public final synthetic L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v1, 0x49b

    .line 4
    .line 5
    const/16 v2, 0x4a0

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v3, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v3, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    move v5, v4

    .line 60
    :goto_1
    const/4 v6, 0x5

    .line 61
    if-ge v4, v6, :cond_1

    .line 62
    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    const/4 v7, 0x1

    .line 66
    :try_start_0
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-static {v3, v8}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    move v5, v7

    .line 74
    goto :goto_1

    .line 75
    :catch_0
    move-exception v8

    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    if-ge v4, v6, :cond_2

    .line 79
    .line 80
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 81
    .line 82
    int-to-double v8, v4

    .line 83
    :try_start_1
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 84
    .line 85
    .line 86
    move-result-wide v6

    .line 87
    const-wide v8, 0x408f400000000000L    # 1000.0

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    mul-double/2addr v6, v8

    .line 93
    double-to-long v6, v6

    .line 94
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    const/16 v6, 0x499

    .line 107
    .line 108
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    new-instance v9, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const/16 v10, 0x49e

    .line 118
    .line 119
    invoke-static {v9, v3, v10}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-static {v6, v9, v8, v7}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    new-instance v2, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v2, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_2
    return-void

    .line 140
    :pswitch_0
    sget v0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:I

    .line 141
    .line 142
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUinWait()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object p0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 147
    .line 148
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {p0, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_4

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_4
    new-instance v3, Ljava/util/HashSet;

    .line 164
    .line 165
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {p0, v4}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 174
    .line 175
    .line 176
    new-instance v4, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_6

    .line 190
    .line 191
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    check-cast v5, Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-nez v6, :cond_5

    .line 202
    .line 203
    invoke-static {v5, v0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_6
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p0, v4, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :goto_4
    return-void

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
