.class public final synthetic Lj8/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lj8/w;


# instance fields
.field public final synthetic a:Lj8/y;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lac/k;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lj8/y;Ljava/lang/String;Lac/k;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj8/t;->a:Lj8/y;

    .line 5
    .line 6
    iput-object p2, p0, Lj8/t;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lj8/t;->c:Lac/k;

    .line 9
    .line 10
    iput p4, p0, Lj8/t;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()Z
    .locals 13

    .line 1
    iget-object v0, p0, Lj8/t;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lj8/t;->d:I

    .line 4
    .line 5
    iget-object v2, p0, Lj8/t;->a:Lj8/y;

    .line 6
    .line 7
    iget-object v3, v2, Lj8/y;->a:Lh/Hchat/dexkit/DexFinder;

    .line 8
    .line 9
    const-string v4, "\u53d1\u9001\u8bed\u97f3\u5931\u8d25: \u521b\u5efa\u4e0a\u4f20\u8bf7\u6c42\u5931\u8d25 uploadClass="

    .line 10
    .line 11
    const-string v5, "\u53d1\u9001\u8bed\u97f3\u5931\u8d25: \u590d\u5236\u8bed\u97f3\u6587\u4ef6\u5931\u8d25 "

    .line 12
    .line 13
    iget-object v6, p0, Lj8/t;->c:Lac/k;

    .line 14
    .line 15
    iget-object v7, v6, Lac/k;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v7, Ljava/io/File;

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    :try_start_0
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    iget v6, v6, Lac/k;->h:I

    .line 25
    .line 26
    invoke-static {v6, v9}, Lj8/y;->x(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    iget-object v9, v3, Lh/Hchat/dexkit/DexFinder;->voiceStartRecordMethod:Ljava/lang/reflect/Method;

    .line 31
    .line 32
    filled-new-array {v0, v6}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-static {v9, v6, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_0

    .line 48
    .line 49
    const-string v0, "\u53d1\u9001\u8bed\u97f3\u5931\u8d25: \u521b\u5efavoiceinfo\u5931\u8d25"

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return v8

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_0
    const/4 v6, 0x1

    .line 59
    invoke-virtual {v2, v0, v6}, Lj8/y;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_1

    .line 68
    .line 69
    const-string v0, "\u53d1\u9001\u8bed\u97f3\u5931\u8d25: \u83b7\u53d6\u8bed\u97f3\u76ee\u6807\u8def\u5f84\u5931\u8d25"

    .line 70
    .line 71
    invoke-virtual {v2, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return v8

    .line 75
    :cond_1
    new-instance v10, Ljava/io/File;

    .line 76
    .line 77
    invoke-direct {v10, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v7, v10}, Lj8/y;->e(Ljava/io/File;Ljava/io/File;)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-nez v10, :cond_2

    .line 85
    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v2, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return v8

    .line 102
    :cond_2
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-virtual {v2, v1}, Lj8/y;->i(I)I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    invoke-virtual {v2, v5, v0}, Lj8/y;->j(ILjava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-nez v5, :cond_3

    .line 115
    .line 116
    const-string v0, "\u53d1\u9001\u8bed\u97f3\u5931\u8d25: \u5b8c\u6210voiceinfo\u5931\u8d25"

    .line 117
    .line 118
    invoke-virtual {v2, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return v8

    .line 122
    :cond_3
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->voiceUploadCdnCtor:Ljava/lang/reflect/Constructor;

    .line 123
    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    const v5, 0xea60

    .line 127
    .line 128
    .line 129
    if-gt v1, v5, :cond_4

    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/io/File;->length()J

    .line 132
    .line 133
    .line 134
    move-result-wide v9

    .line 135
    const-wide/32 v11, 0x704e0

    .line 136
    .line 137
    .line 138
    cmp-long v1, v9, v11

    .line 139
    .line 140
    if-gez v1, :cond_4

    .line 141
    .line 142
    iget-object v1, v3, Lh/Hchat/dexkit/DexFinder;->voiceUploadCtor:Ljava/lang/reflect/Constructor;

    .line 143
    .line 144
    if-nez v1, :cond_5

    .line 145
    .line 146
    :cond_4
    move v1, v6

    .line 147
    goto :goto_0

    .line 148
    :cond_5
    move v1, v8

    .line 149
    :goto_0
    invoke-virtual {v2, v0, v1}, Lj8/y;->n(Ljava/lang/String;Z)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-nez v0, :cond_7

    .line 154
    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v1, v3, Lh/Hchat/dexkit/DexFinder;->voiceUploadClass:Ljava/lang/Class;

    .line 161
    .line 162
    if-eqz v1, :cond_6

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    goto :goto_1

    .line 169
    :cond_6
    const-string v1, "null"

    .line 170
    .line 171
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v1, " ctors="

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Lj8/y;->y()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v2, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return v8

    .line 194
    :cond_7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-eqz v1, :cond_9

    .line 199
    .line 200
    iget-object v1, v1, Lm8/a;->a:Lm8/c;

    .line 201
    .line 202
    invoke-virtual {v1, v0}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_8

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_8
    return v6

    .line 210
    :cond_9
    :goto_2
    const-string v0, "\u53d1\u9001\u8bed\u97f3\u5931\u8d25: \u7f51\u7edc\u53d1\u5305\u5931\u8d25"

    .line 211
    .line 212
    invoke-virtual {v2, v0}, Lj8/y;->m(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    .line 214
    .line 215
    return v8

    .line 216
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v3, "\u53d1\u9001\u8bed\u97f3\u5f02\u5e38: "

    .line 219
    .line 220
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v2, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return v8
.end method
