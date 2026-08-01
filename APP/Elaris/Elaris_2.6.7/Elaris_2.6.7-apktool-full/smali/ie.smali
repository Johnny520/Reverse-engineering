.class public final Lie;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;

.field public final synthetic b:Lec;

.field public final synthetic c:Ljava/lang/reflect/Field;

.field public final synthetic d:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Lec;Ljava/lang/reflect/Field;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lie;->a:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iput-object p2, p0, Lie;->b:Lec;

    .line 4
    .line 5
    iput-object p3, p0, Lie;->c:Ljava/lang/reflect/Field;

    .line 6
    .line 7
    iput-object p4, p0, Lie;->d:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    const/16 p1, 0x30

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 10

    .line 1
    const-string v0, "voice_message_actions"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    instance-of v2, v1, Ljava/util/List;

    .line 21
    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :cond_2
    :try_start_0
    iget-object v2, p0, Lie;->a:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    iget-object v3, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    invoke-static {v6}, Lcom/mr/elaris/w;->B0(Ljava/lang/Object;)Llb;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_3
    :try_start_1
    move-object v7, v1

    .line 43
    check-cast v7, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-nez v5, :cond_4

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_4
    iget-object v4, p0, Lie;->b:Lec;

    .line 54
    .line 55
    iget-object v8, p0, Lie;->c:Ljava/lang/reflect/Field;

    .line 56
    .line 57
    const-string v9, "\u4fdd\u5b58\u8bed\u97f3"

    .line 58
    .line 59
    invoke-static/range {v4 .. v9}, Lcom/mr/elaris/w;->a(Lec;Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v4, p0, Lie;->b:Lec;

    .line 64
    .line 65
    iget-object v8, p0, Lie;->c:Ljava/lang/reflect/Field;

    .line 66
    .line 67
    const-string v9, "\u8f6c\u53d1\u8bed\u97f3"

    .line 68
    .line 69
    invoke-static/range {v4 .. v9}, Lcom/mr/elaris/w;->a(Lec;Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v0, :cond_c

    .line 74
    .line 75
    if-nez v1, :cond_5

    .line 76
    .line 77
    goto/16 :goto_6

    .line 78
    .line 79
    :cond_5
    sget-object v2, Lcom/mr/elaris/w;->b:Ljava/util/Map;

    .line 80
    .line 81
    new-instance v3, Lv9;

    .line 82
    .line 83
    const/4 v4, 0x1

    .line 84
    invoke-direct {v3, v4, v6}, Lv9;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    new-instance v3, Lv9;

    .line 91
    .line 92
    const/4 v5, 0x2

    .line 93
    invoke-direct {v3, v5, v6}, Lv9;-><init>(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v3, p0, Lie;->d:Ljava/lang/ClassLoader;

    .line 104
    .line 105
    invoke-static {v3, v2}, Lcom/mr/elaris/w;->N(Ljava/lang/ClassLoader;Ljava/lang/Class;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    iget-object p0, p0, Lie;->d:Ljava/lang/ClassLoader;

    .line 113
    .line 114
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->N(Ljava/lang/ClassLoader;Ljava/lang/Class;)Z

    .line 115
    .line 116
    .line 117
    new-instance p0, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    add-int/2addr v2, v5

    .line 124
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    move v1, v0

    .line 135
    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-ge v1, v2, :cond_b

    .line 140
    .line 141
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-static {v2}, Lcom/mr/elaris/w;->p0(Ljava/lang/Object;)Lv9;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    if-eqz v3, :cond_6

    .line 150
    .line 151
    move v3, v4

    .line 152
    goto :goto_2

    .line 153
    :cond_6
    move v3, v0

    .line 154
    :goto_2
    if-nez v3, :cond_a

    .line 155
    .line 156
    invoke-static {v0, v2}, Lcom/mr/elaris/w;->x0(ILjava/lang/Object;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const-string v5, "\u4fdd\u5b58\u8bed\u97f3"

    .line 161
    .line 162
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-nez v5, :cond_8

    .line 167
    .line 168
    const-string v5, "\u8f6c\u53d1\u8bed\u97f3"

    .line 169
    .line 170
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_7

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_7
    move v3, v0

    .line 178
    goto :goto_4

    .line 179
    :cond_8
    :goto_3
    move v3, v4

    .line 180
    :goto_4
    if-eqz v3, :cond_9

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_9
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_a
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_b
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    sget-boolean p0, Lcom/mr/elaris/w;->l:Z

    .line 193
    .line 194
    if-nez p0, :cond_c

    .line 195
    .line 196
    sput-boolean v4, Lcom/mr/elaris/w;->l:Z

    .line 197
    .line 198
    const-string p0, "voice menu add success"

    .line 199
    .line 200
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    .line 202
    .line 203
    :cond_c
    :goto_6
    return-void

    .line 204
    :catchall_0
    move-exception v0

    .line 205
    move-object p0, v0

    .line 206
    new-instance p1, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v0, "voice menu add failed reason="

    .line 209
    .line 210
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v0, ": "

    .line 225
    .line 226
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :catchall_1
    move-exception v0

    .line 249
    move-object p0, v0

    .line 250
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    const-string p1, "voice menu skipped reason=message getter "

    .line 259
    .line 260
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-void
.end method
