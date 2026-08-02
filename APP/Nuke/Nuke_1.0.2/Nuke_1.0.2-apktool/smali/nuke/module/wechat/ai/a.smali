.class public final Lnuke/module/wechat/ai/a;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public static final a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Lnuke/module/wechat/ai/b;->e:Lvf1;

    .line 2
    .line 3
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x2000

    .line 9
    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, -0x1

    .line 19
    if-eq v4, v5, :cond_1

    .line 20
    .line 21
    add-int/2addr v3, v4

    .line 22
    const/high16 v5, 0x100000

    .line 23
    .line 24
    if-gt v3, v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 33
    .line 34
    const-string v1, "OpenAI-compatible response is too large"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    sget-object v1, Lwq;->a:Ljava/nio/charset/Charset;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    :catchall_1
    move-exception v1

    .line 59
    invoke-static {p0, v0}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw v1
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lnuke/module/wechat/ai/b;->f:Lir0;

    .line 3
    .line 4
    const-class v2, Le41;

    .line 5
    .line 6
    invoke-virtual {v1, p0, v2}, Lir0;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Le41;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const-string v1, "error"

    .line 15
    .line 16
    iget-object p0, p0, Le41;->h:Lmb1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lmb1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Le41;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const-string v1, "message"

    .line 27
    .line 28
    iget-object p0, p0, Le41;->h:Lmb1;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lmb1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lk31;

    .line 35
    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Lk31;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    invoke-static {p0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object p0, v0

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    new-instance v1, Lx92;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object p0, v1

    .line 60
    :goto_0
    nop

    .line 61
    instance-of v1, p0, Lx92;

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move-object v0, p0

    .line 67
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lj1;
    .locals 7

    .line 1
    :try_start_0
    sget-object v0, Lnuke/module/wechat/ai/b;->f:Lir0;

    .line 2
    .line 3
    const-class v1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, Lir0;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    move-object p0, v0

    .line 14
    new-instance v0, Lx92;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v2, La1;->k:La1;

    .line 25
    .line 26
    if-nez v0, :cond_8

    .line 27
    .line 28
    check-cast p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    new-instance p0, Lh1;

    .line 33
    .line 34
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 35
    .line 36
    const/4 v5, 0x4

    .line 37
    const/4 v6, 0x0

    .line 38
    const-string v3, "Model list response is empty"

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct/range {v1 .. v6}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v1}, Lh1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_0
    invoke-virtual {p0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelsResponse;->getData()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelInfo;

    .line 72
    .line 73
    invoke-virtual {v1}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelInfo;->getId()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const/4 v3, 0x0

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-static {v2}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-lez v4, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    move-object v2, v3

    .line 98
    :goto_2
    if-eqz v2, :cond_4

    .line 99
    .line 100
    invoke-virtual {v1}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIModelInfo;->getOwnedBy()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-eqz v1, :cond_3

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-lez v4, :cond_3

    .line 121
    .line 122
    move-object v3, v1

    .line 123
    :cond_3
    new-instance v1, Lnuke/module/wechat/ai/AIModelInfo;

    .line 124
    .line 125
    invoke-direct {v1, v2, v3}, Lnuke/module/wechat/ai/AIModelInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    move-object v3, v1

    .line 129
    :cond_4
    if-eqz v3, :cond_1

    .line 130
    .line 131
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    new-instance p0, Ljava/util/HashSet;

    .line 136
    .line 137
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance v1, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_7

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    move-object v3, v2

    .line 160
    check-cast v3, Lnuke/module/wechat/ai/AIModelInfo;

    .line 161
    .line 162
    invoke-virtual {v3}, Lnuke/module/wechat/ai/AIModelInfo;->getId()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_6

    .line 171
    .line 172
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_7
    new-instance p0, Lsl0;

    .line 177
    .line 178
    const/16 v0, 0x10

    .line 179
    .line 180
    invoke-direct {p0, v0}, Lsl0;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v1, p0}, Ldu;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    new-instance v0, Li1;

    .line 188
    .line 189
    invoke-direct {v0, p0}, Li1;-><init>(Ljava/util/List;)V

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :cond_8
    new-instance p0, Lh1;

    .line 194
    .line 195
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-nez v0, :cond_9

    .line 202
    .line 203
    const-string v0, "Model list is not valid JSON"

    .line 204
    .line 205
    :cond_9
    move-object v3, v0

    .line 206
    const/4 v5, 0x4

    .line 207
    const/4 v6, 0x0

    .line 208
    const/4 v4, 0x0

    .line 209
    invoke-direct/range {v1 .. v6}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 210
    .line 211
    .line 212
    invoke-direct {p0, v1}, Lh1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 213
    .line 214
    .line 215
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Lf1;
    .locals 10

    .line 1
    :try_start_0
    sget-object v0, Lnuke/module/wechat/ai/b;->f:Lir0;

    .line 2
    .line 3
    const-class v1, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, Lir0;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    move-object p0, v0

    .line 14
    new-instance v0, Lx92;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v2, La1;->k:La1;

    .line 25
    .line 26
    if-nez v0, :cond_8

    .line 27
    .line 28
    check-cast p0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    new-instance p0, Ld1;

    .line 33
    .line 34
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 35
    .line 36
    const/4 v5, 0x4

    .line 37
    const/4 v6, 0x0

    .line 38
    const-string v3, "Response body is empty"

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct/range {v1 .. v6}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v1}, Ld1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_0
    invoke-virtual {p0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->getChoices()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    new-instance p0, Ld1;

    .line 61
    .line 62
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 63
    .line 64
    const/4 v5, 0x4

    .line 65
    const/4 v6, 0x0

    .line 66
    const-string v3, "Response does not contain a completion choice"

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct/range {v1 .. v6}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, v1}, Ld1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_1
    invoke-virtual {v0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->getMessage()Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/4 v2, 0x0

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponseMessage;->getContent()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    move-object v1, v2

    .line 99
    :goto_1
    if-nez v1, :cond_3

    .line 100
    .line 101
    const-string v1, ""

    .line 102
    .line 103
    :cond_3
    move-object v4, v1

    .line 104
    invoke-static {v4}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    new-instance p0, Ld1;

    .line 111
    .line 112
    new-instance v0, Lnuke/module/wechat/ai/AIChatError;

    .line 113
    .line 114
    const/4 v4, 0x4

    .line 115
    const/4 v5, 0x0

    .line 116
    sget-object v1, La1;->l:La1;

    .line 117
    .line 118
    const-string v2, "Model returned an empty response"

    .line 119
    .line 120
    const/4 v3, 0x0

    .line 121
    invoke-direct/range {v0 .. v5}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p0, v0}, Ld1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 125
    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_4
    new-instance v1, Le1;

    .line 129
    .line 130
    new-instance v3, Lnuke/module/wechat/ai/AIChatResponse;

    .line 131
    .line 132
    invoke-virtual {p0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->getModel()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIChoice;->getFinishReason()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-virtual {p0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->getUsage()Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    invoke-virtual {v0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;->getPromptTokens()Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    move-object v7, v0

    .line 151
    goto :goto_2

    .line 152
    :cond_5
    move-object v7, v2

    .line 153
    :goto_2
    invoke-virtual {p0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->getUsage()Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    invoke-virtual {v0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;->getCompletionTokens()Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    move-object v8, v0

    .line 164
    goto :goto_3

    .line 165
    :cond_6
    move-object v8, v2

    .line 166
    :goto_3
    invoke-virtual {p0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIResponse;->getUsage()Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-eqz p0, :cond_7

    .line 171
    .line 172
    invoke-virtual {p0}, Lnuke/module/wechat/ai/OpenAIChatModel$OpenAIUsage;->getTotalTokens()Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    :cond_7
    move-object v9, v2

    .line 177
    invoke-direct/range {v3 .. v9}, Lnuke/module/wechat/ai/AIChatResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 178
    .line 179
    .line 180
    invoke-direct {v1, v3}, Le1;-><init>(Lnuke/module/wechat/ai/AIChatResponse;)V

    .line 181
    .line 182
    .line 183
    return-object v1

    .line 184
    :cond_8
    new-instance p0, Ld1;

    .line 185
    .line 186
    new-instance v1, Lnuke/module/wechat/ai/AIChatError;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-nez v0, :cond_9

    .line 193
    .line 194
    const-string v0, "Response is not valid JSON"

    .line 195
    .line 196
    :cond_9
    move-object v3, v0

    .line 197
    const/4 v5, 0x4

    .line 198
    const/4 v6, 0x0

    .line 199
    const/4 v4, 0x0

    .line 200
    invoke-direct/range {v1 .. v6}, Lnuke/module/wechat/ai/AIChatError;-><init>(La1;Ljava/lang/String;Ljava/lang/Integer;ILc50;)V

    .line 201
    .line 202
    .line 203
    invoke-direct {p0, v1}, Ld1;-><init>(Lnuke/module/wechat/ai/AIChatError;)V

    .line 204
    .line 205
    .line 206
    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Lyw0;
    .locals 6

    .line 1
    invoke-static {p0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    new-array v1, v0, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/16 v3, 0x2f

    .line 14
    .line 15
    aput-char v3, v1, v2

    .line 16
    .line 17
    invoke-static {p0, v1}, Lpv2;->J0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :try_start_0
    new-instance v4, Lxw0;

    .line 26
    .line 27
    invoke-direct {v4}, Lxw0;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v1, p0}, Lxw0;->e(Lyw0;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Lxw0;->b()Lyw0;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-object p0, v1

    .line 39
    :goto_0
    if-nez p0, :cond_0

    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_0
    iget-object v4, p0, Lyw0;->a:Ljava/lang/String;

    .line 44
    .line 45
    const-string v5, "https"

    .line 46
    .line 47
    invoke-static {v4, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_6

    .line 52
    .line 53
    iget-object v4, p0, Lyw0;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v4}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    invoke-virtual {p0}, Lyw0;->b()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    new-array v5, v0, [C

    .line 67
    .line 68
    aput-char v3, v5, v2

    .line 69
    .line 70
    invoke-static {v4, v5}, Lpv2;->J0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v5, "/chat/completions"

    .line 75
    .line 76
    invoke-static {v4, v5, v0}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    const/16 v0, 0x11

    .line 83
    .line 84
    invoke-static {v4, v0}, Lpv2;->k0(Ljava/lang/String;I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    const-string v5, "/models"

    .line 90
    .line 91
    invoke-static {v4, v5, v0}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    const/4 v0, 0x7

    .line 98
    invoke-static {v4, v0}, Lpv2;->k0(Ljava/lang/String;I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    :cond_3
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-static {v4}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_4

    .line 112
    .line 113
    const-string v4, ""

    .line 114
    .line 115
    :cond_4
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p0}, Lyw0;->f()Lxw0;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const-string v0, "/"

    .line 133
    .line 134
    invoke-static {p1, v0, v2}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-virtual {p0, p1, v2, v0}, Lxw0;->f(Ljava/lang/String;II)V

    .line 145
    .line 146
    .line 147
    iput-object v1, p0, Lxw0;->g:Ljava/util/ArrayList;

    .line 148
    .line 149
    iput-object v1, p0, Lxw0;->h:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {p0}, Lxw0;->b()Lyw0;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :cond_5
    const-string p0, "unexpected encodedPath: "

    .line 157
    .line 158
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    :goto_2
    return-object v1
.end method
