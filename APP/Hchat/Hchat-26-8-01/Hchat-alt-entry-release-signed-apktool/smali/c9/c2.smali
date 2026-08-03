.class public final Lc9/c2;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 15
    iput p1, p0, Lc9/c2;->a:I

    iput-object p2, p0, Lc9/c2;->c:Ljava/lang/Object;

    iput-object p3, p0, Lc9/c2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfg/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lc9/c2;->a:I

    .line 3
    .line 4
    sget-object v0, Lh9/d;->a:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 5
    .line 6
    iput-object p1, p0, Lc9/c2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, p0, Lc9/c2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Lc9/c2;->a:I

    iput-object p1, p0, Lc9/c2;->b:Ljava/lang/Object;

    iput-object p3, p0, Lc9/c2;->c:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private final a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lc9/c2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz8/f;

    .line 4
    .line 5
    iget-object v1, p0, Lc9/c2;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz8/g;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/4 v4, 0x3

    .line 18
    invoke-static {v4, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v2, v3

    .line 24
    :goto_0
    instance-of v4, v2, Ljava/lang/Boolean;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Boolean;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object v2, v3

    .line 32
    :goto_1
    if-eqz v2, :cond_7

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget-object v4, v1, Lz8/g;->c:Landroid/content/SharedPreferences;

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    const-string v2, "call_block_outgoing_ringtone"

    .line 44
    .line 45
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const-string v2, "call_block_incoming_ringtone"

    .line 51
    .line 52
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :goto_2
    if-nez v2, :cond_3

    .line 57
    .line 58
    goto :goto_6

    .line 59
    :cond_3
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 60
    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    invoke-static {v5, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move-object v2, v3

    .line 69
    :goto_3
    instance-of v4, v2, Ljava/lang/Long;

    .line 70
    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    check-cast v2, Ljava/lang/Long;

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_5
    move-object v2, v3

    .line 77
    :goto_4
    if-eqz v2, :cond_7

    .line 78
    .line 79
    :try_start_0
    iget-object v4, v0, Lz8/f;->b:Ljava/lang/reflect/Method;

    .line 80
    .line 81
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 82
    .line 83
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v4, v5, v2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    goto :goto_5

    .line 92
    :catchall_0
    move-exception v2

    .line 93
    new-instance v4, Lsf/f;

    .line 94
    .line 95
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object v2, v4

    .line 99
    :goto_5
    nop

    .line 100
    instance-of v4, v2, Lsf/f;

    .line 101
    .line 102
    if-nez v4, :cond_6

    .line 103
    .line 104
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eqz p1, :cond_7

    .line 112
    .line 113
    iget-object v0, v0, Lz8/f;->a:Ljava/lang/reflect/Method;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v2, v1, Lz8/g;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 120
    .line 121
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_7

    .line 126
    .line 127
    iget-object v1, v1, Lz8/g;->b:Ly9/b;

    .line 128
    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v3, "CoreV2 \u901a\u8bdd\u94c3\u58f0\u786e\u8ba4\u56de\u8c03\u5931\u8d25: "

    .line 132
    .line 133
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v1, v0, p1}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_7
    :goto_6
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10

    .line 1
    iget v0, p0, Lc9/c2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lc9/c2;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lc9/c2;->b:Ljava/lang/Object;

    .line 6
    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :sswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v2, Lz8/d;

    .line 18
    .line 19
    iget-object v0, v2, Lz8/d;->d:Ljava/lang/ThreadLocal;

    .line 20
    .line 21
    iget-object v3, v2, Lz8/d;->b:Ly9/b;

    .line 22
    .line 23
    iget-object v4, v2, Lz8/d;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Integer;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v0, v5

    .line 40
    :goto_0
    const/4 v6, 0x1

    .line 41
    if-lez v0, :cond_1

    .line 42
    .line 43
    move v0, v6

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v0, v5

    .line 46
    :goto_1
    if-eqz v0, :cond_8

    .line 47
    .line 48
    iget-object v0, v2, Lz8/d;->a:Lr8/g;

    .line 49
    .line 50
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 51
    .line 52
    const-string v7, "Hchat_call_media_limit_config"

    .line 53
    .line 54
    invoke-static {v0, v7}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v7, "call_media_limit_enable"

    .line 59
    .line 60
    invoke-interface {v0, v7, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lz8/b;

    .line 71
    .line 72
    iget-object v0, v1, Lz8/b;->b:Ljava/lang/reflect/Field;

    .line 73
    .line 74
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/4 v0, 0x0

    .line 79
    if-eqz p1, :cond_7

    .line 80
    .line 81
    iget-object v1, v2, Lz8/d;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    new-instance v8, Lnb/a;

    .line 88
    .line 89
    const/16 v9, 0x1d

    .line 90
    .line 91
    invoke-direct {v8, v2, v9}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 92
    .line 93
    .line 94
    new-instance v2, Lbc/j;

    .line 95
    .line 96
    const/16 v9, 0x10

    .line 97
    .line 98
    invoke-direct {v2, v8, v9}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v7, v2}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    check-cast v1, Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_3

    .line 115
    .line 116
    const-string p1, "fields"

    .line 117
    .line 118
    invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_8

    .line 123
    .line 124
    const-string p1, "\u5fae\u4fe1\u901a\u8bdd\u72b6\u6001\u4e8b\u4ef6\u672a\u627e\u5230\u5e03\u5c14\u7ed3\u679c\u5b57\u6bb5"

    .line 125
    .line 126
    invoke-virtual {v3, p1, v0}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :cond_4
    move v2, v5

    .line 135
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-eqz v7, :cond_6

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    check-cast v7, Ljava/lang/reflect/Field;

    .line 146
    .line 147
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-static {v7, p1, v8}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-nez v7, :cond_5

    .line 154
    .line 155
    if-eqz v2, :cond_4

    .line 156
    .line 157
    :cond_5
    move v2, v6

    .line 158
    goto :goto_2

    .line 159
    :cond_6
    if-nez v2, :cond_8

    .line 160
    .line 161
    const-string p1, "write"

    .line 162
    .line 163
    invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_8

    .line 168
    .line 169
    const-string p1, "\u5fae\u4fe1\u901a\u8bdd\u72b6\u6001\u4e8b\u4ef6\u7ed3\u679c\u6539\u5199\u5931\u8d25"

    .line 170
    .line 171
    invoke-virtual {v3, p1, v0}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_7
    const-string p1, "result"

    .line 176
    .line 177
    invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_8

    .line 182
    .line 183
    const-string p1, "\u5fae\u4fe1\u901a\u8bdd\u72b6\u6001\u4e8b\u4ef6\u7ed3\u679c\u4e3a\u7a7a"

    .line 184
    .line 185
    invoke-virtual {v3, p1, v0}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_3
    return-void

    .line 189
    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    check-cast v2, Lqa/f;

    .line 193
    .line 194
    invoke-static {v2}, Lqa/f;->c(Lqa/f;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :sswitch_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 199
    .line 200
    instance-of v0, p1, Landroid/app/Activity;

    .line 201
    .line 202
    if-eqz v0, :cond_a

    .line 203
    .line 204
    check-cast v1, Lq8/q;

    .line 205
    .line 206
    new-instance v0, Lb5/c;

    .line 207
    .line 208
    check-cast v2, Ljava/lang/String;

    .line 209
    .line 210
    check-cast p1, Landroid/app/Activity;

    .line 211
    .line 212
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 213
    .line 214
    .line 215
    iput-object v2, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object p1, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 218
    .line 219
    if-eqz p1, :cond_9

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    goto :goto_4

    .line 230
    :cond_9
    const-string p1, ""

    .line 231
    .line 232
    :goto_4
    iput-object p1, v0, Lb5/c;->c:Ljava/lang/Object;

    .line 233
    .line 234
    iget-object p1, v1, Lq8/q;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_a

    .line 245
    .line 246
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Lq8/p;

    .line 251
    .line 252
    :try_start_0
    invoke-interface {v2, v0}, Lq8/p;->a(Lb5/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    .line 254
    .line 255
    goto :goto_5

    .line 256
    :catchall_0
    move-exception v2

    .line 257
    new-instance v3, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v4, "\u751f\u547d\u5468\u671f\u56de\u8c03\u5931\u8d25: "

    .line 260
    .line 261
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v1, v2}, Lq8/q;->b(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_a
    return-void

    .line 280
    :sswitch_3
    check-cast v1, Lr8/g;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    :try_start_1
    check-cast v2, Ljava/lang/String;

    .line 286
    .line 287
    const-string v0, "onResume"

    .line 288
    .line 289
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_b

    .line 294
    .line 295
    iget-object v0, v1, Lr8/g;->a:Landroid/content/Context;

    .line 296
    .line 297
    invoke-static {v0}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 298
    .line 299
    .line 300
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 301
    .line 302
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 303
    .line 304
    invoke-static {v0}, Lc9/d2;->B(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 308
    .line 309
    iget-object v0, v1, Lr8/g;->a:Landroid/content/Context;

    .line 310
    .line 311
    invoke-static {p1, v0}, Lc9/d2;->A(Ljava/lang/Object;Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 312
    .line 313
    .line 314
    goto :goto_6

    .line 315
    :catchall_1
    move-exception p1

    .line 316
    goto :goto_7

    .line 317
    :cond_b
    :goto_6
    sget-object p1, Lc9/d2;->k:Ljava/lang/ThreadLocal;

    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :goto_7
    sget-object v0, Lc9/d2;->k:Ljava/lang/ThreadLocal;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 326
    .line 327
    .line 328
    throw p1

    .line 329
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0xc -> :sswitch_2
        0xd -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lc9/c2;->a:I

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    const-string v6, "\u65e0\u6cd5\u9000\u51fa\u591a\u9009\u72b6\u6001\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lc9/c2;->a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lxa/m;

    .line 32
    .line 33
    iget-object v3, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-virtual {v0}, Lxa/m;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_0
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 45
    .line 46
    if-eqz v4, :cond_7

    .line 47
    .line 48
    array-length v5, v4

    .line 49
    :goto_0
    if-ge v9, v5, :cond_3

    .line 50
    .line 51
    aget-object v6, v4, v9

    .line 52
    .line 53
    instance-of v10, v6, Landroid/view/MenuItem;

    .line 54
    .line 55
    if-eqz v10, :cond_1

    .line 56
    .line 57
    check-cast v6, Landroid/view/MenuItem;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object v6, v8

    .line 61
    :goto_1
    if-eqz v6, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    move-object v6, v8

    .line 68
    :goto_2
    if-eqz v6, :cond_7

    .line 69
    .line 70
    invoke-interface {v6}, Landroid/view/MenuItem;->getItemId()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    const v5, 0x48435253    # 200009.3f

    .line 75
    .line 76
    .line 77
    if-eq v4, v5, :cond_4

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_4
    iget-object v4, v0, Lxa/m;->g:Ljava/util/Map;

    .line 81
    .line 82
    invoke-interface {v4, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Lxa/i;

    .line 87
    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    iget-object v4, v0, Lxa/m;->h:Lxa/i;

    .line 92
    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    :goto_3
    iput-object v8, v0, Lxa/m;->h:Lxa/i;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 110
    .line 111
    :cond_6
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object v2, v0, Lxa/m;->d:Landroid/os/Handler;

    .line 115
    .line 116
    new-instance v3, Lxa/d;

    .line 117
    .line 118
    invoke-direct {v3, v0, v4, v7}, Lxa/d;-><init>(Lxa/m;Lxa/i;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 122
    .line 123
    .line 124
    :cond_7
    :goto_4
    return-void

    .line 125
    :pswitch_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v11, v0

    .line 131
    check-cast v11, Lqb/k;

    .line 132
    .line 133
    iget-object v0, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Ljava/lang/reflect/Method;

    .line 136
    .line 137
    invoke-virtual {v11}, Lqb/k;->p()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_8

    .line 142
    .line 143
    goto/16 :goto_e

    .line 144
    .line 145
    :cond_8
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 146
    .line 147
    if-eqz v3, :cond_1b

    .line 148
    .line 149
    invoke-static {v9, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    instance-of v4, v3, Landroid/view/MenuItem;

    .line 154
    .line 155
    if-eqz v4, :cond_9

    .line 156
    .line 157
    check-cast v3, Landroid/view/MenuItem;

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_9
    move-object v3, v8

    .line 161
    :goto_5
    if-eqz v3, :cond_1b

    .line 162
    .line 163
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    const v5, 0x4843564d    # 200025.2f

    .line 168
    .line 169
    .line 170
    if-ne v4, v5, :cond_a

    .line 171
    .line 172
    move v4, v7

    .line 173
    goto :goto_6

    .line 174
    :cond_a
    move v4, v9

    .line 175
    :goto_6
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    const v5, 0x4843564e    # 200025.22f

    .line 180
    .line 181
    .line 182
    if-ne v3, v5, :cond_b

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_b
    move v7, v9

    .line 186
    :goto_7
    if-nez v4, :cond_c

    .line 187
    .line 188
    if-nez v7, :cond_c

    .line 189
    .line 190
    goto/16 :goto_e

    .line 191
    .line 192
    :cond_c
    if-eqz v4, :cond_d

    .line 193
    .line 194
    const-string v3, "voice_forward_chat_multi_forward_enable"

    .line 195
    .line 196
    invoke-virtual {v11, v3}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-nez v3, :cond_d

    .line 201
    .line 202
    goto/16 :goto_e

    .line 203
    .line 204
    :cond_d
    if-eqz v7, :cond_e

    .line 205
    .line 206
    iget-object v3, v11, Lqb/k;->c:Landroid/content/SharedPreferences;

    .line 207
    .line 208
    const-string v5, "voice_forward_chat_multi_merge_enable"

    .line 209
    .line 210
    invoke-interface {v3, v5, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-nez v3, :cond_e

    .line 215
    .line 216
    goto/16 :goto_e

    .line 217
    .line 218
    :cond_e
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    if-eqz v3, :cond_f

    .line 223
    .line 224
    invoke-virtual {v3}, Lq8/o;->a()Landroid/app/Activity;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    goto :goto_8

    .line 229
    :cond_f
    move-object v3, v8

    .line 230
    :goto_8
    if-eqz v3, :cond_10

    .line 231
    .line 232
    move-object v12, v3

    .line 233
    goto :goto_9

    .line 234
    :cond_10
    move-object v12, v8

    .line 235
    :goto_9
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 236
    .line 237
    invoke-static {v3}, Lk8/b;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    if-nez v5, :cond_1a

    .line 246
    .line 247
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-eqz v5, :cond_11

    .line 252
    .line 253
    goto :goto_a

    .line 254
    :cond_11
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    :cond_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    if-eqz v7, :cond_13

    .line 263
    .line 264
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-static {v7}, Lqb/k;->u(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-nez v7, :cond_12

    .line 273
    .line 274
    goto/16 :goto_d

    .line 275
    .line 276
    :cond_13
    :goto_a
    new-instance v13, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    :cond_14
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-eqz v7, :cond_15

    .line 290
    .line 291
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-virtual {v11, v7}, Lqb/k;->D(Ljava/lang/Object;)Lqb/i;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    if-eqz v7, :cond_14

    .line 300
    .line 301
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto :goto_b

    .line 305
    :cond_15
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-eq v5, v3, :cond_16

    .line 314
    .line 315
    const-string v0, "\u90e8\u5206\u8bed\u97f3\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 316
    .line 317
    invoke-static {v12, v0}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_16
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 325
    .line 326
    iget-object v5, v11, Lqb/k;->b:Lia/t;

    .line 327
    .line 328
    invoke-static {v3, v0, v5}, Lbe/h;->X(Ljava/lang/Object;Ljava/lang/reflect/Method;Lfg/p;)Lb/e;

    .line 329
    .line 330
    .line 331
    move-result-object v14

    .line 332
    if-nez v14, :cond_17

    .line 333
    .line 334
    invoke-static {v12, v6}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    goto :goto_e

    .line 341
    :cond_17
    if-nez v12, :cond_18

    .line 342
    .line 343
    const-string v0, "\u5f53\u524d\u9875\u9762\u4e0d\u53ef\u7528"

    .line 344
    .line 345
    invoke-static {v8, v0}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    goto :goto_c

    .line 349
    :cond_18
    if-eqz v4, :cond_19

    .line 350
    .line 351
    invoke-virtual {v11, v12, v13, v14, v8}, Lqb/k;->I(Landroid/app/Activity;Ljava/util/ArrayList;Lb/e;Lqb/b;)V

    .line 352
    .line 353
    .line 354
    goto :goto_c

    .line 355
    :cond_19
    new-instance v0, Lsf/e;

    .line 356
    .line 357
    const-string v3, "\u8f6c\u53d1"

    .line 358
    .line 359
    const-string v4, "\u9009\u62e9\u597d\u53cb\u6216\u7fa4\u804a\u53d1\u9001\u5408\u5e76\u8bed\u97f3"

    .line 360
    .line 361
    invoke-direct {v0, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    new-instance v3, Lsf/e;

    .line 365
    .line 366
    const-string v4, "\u4fdd\u5b58"

    .line 367
    .line 368
    const-string v5, "\u4fdd\u5b58\u5408\u5e76\u540e\u7684 MP3 \u6587\u4ef6"

    .line 369
    .line 370
    invoke-direct {v3, v4, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    filled-new-array {v0, v3}, [Lsf/e;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    new-instance v16, Lqb/b;

    .line 382
    .line 383
    const/4 v15, 0x1

    .line 384
    move-object/from16 v10, v16

    .line 385
    .line 386
    invoke-direct/range {v10 .. v15}, Lqb/b;-><init>(Lqb/k;Landroid/app/Activity;Ljava/util/ArrayList;Lb/e;I)V

    .line 387
    .line 388
    .line 389
    new-instance v3, Lk/s1;

    .line 390
    .line 391
    const/4 v4, 0x7

    .line 392
    invoke-direct {v3, v4}, Lk/s1;-><init>(I)V

    .line 393
    .line 394
    .line 395
    sget-object v18, Lwb/lv;->j:Lwb/lv;

    .line 396
    .line 397
    const-string v13, "\u5408\u5e76\u8bed\u97f3"

    .line 398
    .line 399
    const-string v14, "\u8bf7\u9009\u62e9\u5408\u5e76\u8bed\u97f3\u7684\u64cd\u4f5c"

    .line 400
    .line 401
    move-object v15, v0

    .line 402
    move-object/from16 v17, v3

    .line 403
    .line 404
    invoke-static/range {v12 .. v18}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 405
    .line 406
    .line 407
    :goto_c
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    goto :goto_e

    .line 411
    :cond_1a
    :goto_d
    const-string v0, "\u672a\u627e\u5230\u9009\u4e2d\u7684\u8bed\u97f3\u6d88\u606f"

    .line 412
    .line 413
    invoke-static {v12, v0}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    :cond_1b
    :goto_e
    return-void

    .line 420
    :pswitch_4
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v0, Lqa/f;

    .line 423
    .line 424
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 428
    .line 429
    if-eqz v3, :cond_1c

    .line 430
    .line 431
    invoke-static {v9, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    goto :goto_f

    .line 436
    :cond_1c
    move-object v3, v8

    .line 437
    :goto_f
    instance-of v4, v3, Ljava/lang/String;

    .line 438
    .line 439
    if-eqz v4, :cond_1d

    .line 440
    .line 441
    check-cast v3, Ljava/lang/String;

    .line 442
    .line 443
    goto :goto_10

    .line 444
    :cond_1d
    move-object v3, v8

    .line 445
    :goto_10
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 446
    .line 447
    instance-of v6, v4, Landroid/view/View;

    .line 448
    .line 449
    if-eqz v6, :cond_1e

    .line 450
    .line 451
    move-object v8, v4

    .line 452
    check-cast v8, Landroid/view/View;

    .line 453
    .line 454
    :cond_1e
    invoke-static {v0, v8, v3}, Lqa/f;->b(Lqa/f;Landroid/view/View;Ljava/lang/String;)Z

    .line 455
    .line 456
    .line 457
    move-result v4

    .line 458
    if-eqz v4, :cond_1f

    .line 459
    .line 460
    goto/16 :goto_13

    .line 461
    .line 462
    :cond_1f
    if-eqz v3, :cond_26

    .line 463
    .line 464
    move v4, v9

    .line 465
    :goto_11
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 466
    .line 467
    .line 468
    move-result v6

    .line 469
    if-ge v4, v6, :cond_26

    .line 470
    .line 471
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    invoke-static {v6}, Ljava/lang/Character;->isDigit(C)Z

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    if-eqz v6, :cond_25

    .line 480
    .line 481
    if-eqz v8, :cond_26

    .line 482
    .line 483
    invoke-static {v0, v8}, Lqa/f;->i(Lqa/f;Landroid/view/View;)Lqa/b;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    if-eqz v4, :cond_20

    .line 488
    .line 489
    goto :goto_12

    .line 490
    :cond_20
    sget-object v4, Lqa/b;->g:Lqa/b;

    .line 491
    .line 492
    :goto_12
    invoke-static {v0, v4}, Lqa/f;->h(Lqa/f;Lqa/b;)Z

    .line 493
    .line 494
    .line 495
    move-result v6

    .line 496
    if-eqz v6, :cond_21

    .line 497
    .line 498
    iget-object v6, v0, Lqa/f;->d:Ljava/util/WeakHashMap;

    .line 499
    .line 500
    invoke-virtual {v6, v8}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v6

    .line 504
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 505
    .line 506
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v6

    .line 510
    if-nez v6, :cond_21

    .line 511
    .line 512
    goto :goto_13

    .line 513
    :cond_21
    invoke-static {v0, v4}, Lqa/f;->d(Lqa/f;Lqa/b;)Z

    .line 514
    .line 515
    .line 516
    move-result v6

    .line 517
    if-nez v6, :cond_22

    .line 518
    .line 519
    goto :goto_13

    .line 520
    :cond_22
    invoke-static {v0, v8, v4, v3}, Lqa/f;->f(Lqa/f;Landroid/view/View;Lqa/b;Ljava/lang/String;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    invoke-static {v0, v4, v3}, Lqa/f;->a(Lqa/f;Lqa/b;Ljava/lang/String;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v6

    .line 528
    invoke-static {v8}, Lqa/f;->s(Landroid/view/View;)Landroid/animation/ValueAnimator;

    .line 529
    .line 530
    .line 531
    move-result-object v10

    .line 532
    if-eqz v10, :cond_23

    .line 533
    .line 534
    invoke-virtual {v10}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 535
    .line 536
    .line 537
    move-result v11

    .line 538
    if-eqz v11, :cond_23

    .line 539
    .line 540
    invoke-virtual {v10}, Landroid/animation/ValueAnimator;->end()V

    .line 541
    .line 542
    .line 543
    :cond_23
    invoke-static {v3, v6}, Lqa/f;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    invoke-static {v0, v8, v4, v6}, Lqa/f;->g(Lqa/f;Landroid/view/View;Lqa/b;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-static {v0, v4, v3}, Lqa/f;->e(Lqa/f;Lqa/b;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 554
    .line 555
    if-eqz v0, :cond_24

    .line 556
    .line 557
    aput-object v6, v0, v9

    .line 558
    .line 559
    :cond_24
    iget-object v0, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v0, Ljava/lang/reflect/Method;

    .line 562
    .line 563
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    array-length v0, v0

    .line 568
    if-ne v0, v5, :cond_26

    .line 569
    .line 570
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 571
    .line 572
    if-eqz v0, :cond_26

    .line 573
    .line 574
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 575
    .line 576
    aput-object v2, v0, v7

    .line 577
    .line 578
    goto :goto_13

    .line 579
    :cond_25
    add-int/lit8 v4, v4, 0x1

    .line 580
    .line 581
    goto :goto_11

    .line 582
    :cond_26
    :goto_13
    return-void

    .line 583
    :pswitch_5
    iget-object v0, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 584
    .line 585
    move-object v3, v0

    .line 586
    check-cast v3, Lq8/i;

    .line 587
    .line 588
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 589
    .line 590
    if-nez v0, :cond_27

    .line 591
    .line 592
    goto :goto_15

    .line 593
    :cond_27
    array-length v2, v0

    .line 594
    :goto_14
    if-ge v9, v2, :cond_29

    .line 595
    .line 596
    aget-object v4, v0, v9

    .line 597
    .line 598
    instance-of v5, v4, Landroid/content/Intent;

    .line 599
    .line 600
    if-eqz v5, :cond_28

    .line 601
    .line 602
    move-object v8, v4

    .line 603
    check-cast v8, Landroid/content/Intent;

    .line 604
    .line 605
    goto :goto_15

    .line 606
    :cond_28
    add-int/lit8 v9, v9, 0x1

    .line 607
    .line 608
    goto :goto_14

    .line 609
    :cond_29
    :goto_15
    if-eqz v8, :cond_2b

    .line 610
    .line 611
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 612
    .line 613
    move-object v2, v0

    .line 614
    check-cast v2, Ljava/lang/reflect/Method;

    .line 615
    .line 616
    iget-object v0, v3, Lq8/i;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 617
    .line 618
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    :cond_2a
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    if-eqz v0, :cond_2b

    .line 627
    .line 628
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    check-cast v0, Lq8/j;

    .line 633
    .line 634
    :try_start_0
    invoke-virtual {v0, v8, v2}, Lq8/j;->a(Landroid/content/Intent;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 635
    .line 636
    .line 637
    goto :goto_16

    .line 638
    :catchall_0
    move-exception v0

    .line 639
    new-instance v5, Ljava/lang/StringBuilder;

    .line 640
    .line 641
    const-string v6, "Activity\u542f\u52a8\u76d1\u542c\u56de\u8c03\u5931\u8d25: "

    .line 642
    .line 643
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    iget-object v5, v3, Lq8/i;->a:Li8/f;

    .line 658
    .line 659
    if-eqz v5, :cond_2a

    .line 660
    .line 661
    const-string v5, "[WeChatActivityStartApi] "

    .line 662
    .line 663
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    goto :goto_16

    .line 671
    :cond_2b
    return-void

    .line 672
    :pswitch_6
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 673
    .line 674
    if-nez v0, :cond_2c

    .line 675
    .line 676
    goto/16 :goto_24

    .line 677
    .line 678
    :cond_2c
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v0, Ljava/util/ArrayList;

    .line 681
    .line 682
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    :cond_2d
    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    if-eqz v0, :cond_3e

    .line 691
    .line 692
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    check-cast v0, Ljava/lang/Integer;

    .line 697
    .line 698
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    if-ltz v0, :cond_2d

    .line 703
    .line 704
    iget-object v5, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 705
    .line 706
    array-length v6, v5

    .line 707
    if-ge v0, v6, :cond_2d

    .line 708
    .line 709
    aget-object v0, v5, v0

    .line 710
    .line 711
    if-eqz v0, :cond_2d

    .line 712
    .line 713
    iget-object v5, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v5, Loa/a;

    .line 716
    .line 717
    const-string v6, "nativeurl"

    .line 718
    .line 719
    const-string v7, ":\n"

    .line 720
    .line 721
    iget-object v10, v5, Loa/a;->a:Ll3/l;

    .line 722
    .line 723
    const-string v11, "hb_auto_enable"

    .line 724
    .line 725
    :try_start_1
    invoke-virtual {v10}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 726
    .line 727
    .line 728
    move-result-object v10

    .line 729
    invoke-interface {v10, v11, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 730
    .line 731
    .line 732
    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 733
    goto :goto_18

    .line 734
    :catchall_1
    move v10, v9

    .line 735
    :goto_18
    if-nez v10, :cond_2e

    .line 736
    .line 737
    goto :goto_17

    .line 738
    :cond_2e
    :try_start_2
    const-string v10, "h"

    .line 739
    .line 740
    const-string v11, "i"

    .line 741
    .line 742
    const-string v12, "m"

    .line 743
    .line 744
    filled-new-array {v10, v11, v12}, [Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 748
    move v12, v9

    .line 749
    :goto_19
    const-string v13, "<wcpayinfo>"

    .line 750
    .line 751
    if-ge v12, v4, :cond_30

    .line 752
    .line 753
    :try_start_3
    aget-object v14, v11, v12

    .line 754
    .line 755
    invoke-static {v0, v14}, Lx6/d;->c0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v14

    .line 759
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 760
    .line 761
    .line 762
    move-result v15

    .line 763
    if-nez v15, :cond_2f

    .line 764
    .line 765
    invoke-virtual {v14, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 766
    .line 767
    .line 768
    move-result v15

    .line 769
    if-eqz v15, :cond_2f

    .line 770
    .line 771
    goto :goto_1a

    .line 772
    :cond_2f
    add-int/lit8 v12, v12, 0x1

    .line 773
    .line 774
    goto :goto_19

    .line 775
    :cond_30
    invoke-static {v0, v10}, Lx6/d;->c0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v14

    .line 779
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 780
    .line 781
    .line 782
    move-result v10

    .line 783
    if-nez v10, :cond_31

    .line 784
    .line 785
    const-string v10, "^-?\\d+$"

    .line 786
    .line 787
    invoke-virtual {v14, v10}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 788
    .line 789
    .line 790
    move-result v10

    .line 791
    if-nez v10, :cond_31

    .line 792
    .line 793
    goto :goto_1a

    .line 794
    :cond_31
    move-object v14, v8

    .line 795
    :goto_1a
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 796
    .line 797
    .line 798
    move-result v10

    .line 799
    if-nez v10, :cond_2d

    .line 800
    .line 801
    invoke-virtual {v14, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 802
    .line 803
    .line 804
    move-result v10

    .line 805
    if-nez v10, :cond_32

    .line 806
    .line 807
    goto :goto_17

    .line 808
    :cond_32
    invoke-virtual {v14, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 809
    .line 810
    .line 811
    move-result v10

    .line 812
    if-lez v10, :cond_33

    .line 813
    .line 814
    const-string v11, "<"

    .line 815
    .line 816
    invoke-virtual {v14, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 817
    .line 818
    .line 819
    move-result v11

    .line 820
    if-le v11, v10, :cond_33

    .line 821
    .line 822
    add-int/lit8 v10, v10, 0x2

    .line 823
    .line 824
    invoke-virtual {v14, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v10

    .line 828
    goto :goto_1b

    .line 829
    :catchall_2
    move-exception v0

    .line 830
    goto/16 :goto_23

    .line 831
    .line 832
    :cond_33
    move-object v10, v14

    .line 833
    :goto_1b
    invoke-static {v10, v6}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v11

    .line 837
    new-instance v12, Ljava/lang/StringBuilder;

    .line 838
    .line 839
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 840
    .line 841
    .line 842
    const-string v13, "AddMsg wcpayinfo nativeurl="

    .line 843
    .line 844
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 848
    .line 849
    .line 850
    move-result v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 851
    const/16 v15, 0x32

    .line 852
    .line 853
    const-string v16, "EMPTY"

    .line 854
    .line 855
    if-eqz v13, :cond_34

    .line 856
    .line 857
    move-object/from16 v13, v16

    .line 858
    .line 859
    goto :goto_1c

    .line 860
    :cond_34
    :try_start_4
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 861
    .line 862
    .line 863
    move-result v13

    .line 864
    invoke-static {v15, v13}, Ljava/lang/Math;->min(II)I

    .line 865
    .line 866
    .line 867
    move-result v13

    .line 868
    invoke-virtual {v11, v9, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v13

    .line 872
    :goto_1c
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v12

    .line 879
    invoke-virtual {v5, v12}, Loa/a;->c(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 883
    .line 884
    .line 885
    move-result v12

    .line 886
    if-eqz v12, :cond_36

    .line 887
    .line 888
    invoke-static {v14, v6}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v6

    .line 892
    new-instance v12, Ljava/lang/StringBuilder;

    .line 893
    .line 894
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 895
    .line 896
    .line 897
    const-string v13, "  \u539f\u59cbcontent\u4e2dnativeurl="

    .line 898
    .line 899
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 900
    .line 901
    .line 902
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 903
    .line 904
    .line 905
    move-result v13

    .line 906
    if-eqz v13, :cond_35

    .line 907
    .line 908
    :goto_1d
    move-object/from16 v13, v16

    .line 909
    .line 910
    goto :goto_1e

    .line 911
    :cond_35
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 912
    .line 913
    .line 914
    move-result v13

    .line 915
    invoke-static {v15, v13}, Ljava/lang/Math;->min(II)I

    .line 916
    .line 917
    .line 918
    move-result v13

    .line 919
    invoke-virtual {v6, v9, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v16

    .line 923
    goto :goto_1d

    .line 924
    :goto_1e
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 925
    .line 926
    .line 927
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v12

    .line 931
    invoke-virtual {v5, v12}, Loa/a;->c(Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 935
    .line 936
    .line 937
    move-result v12

    .line 938
    if-nez v12, :cond_36

    .line 939
    .line 940
    move-object v15, v6

    .line 941
    move-object v12, v14

    .line 942
    goto :goto_1f

    .line 943
    :cond_36
    move-object v12, v10

    .line 944
    move-object v15, v11

    .line 945
    :goto_1f
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 946
    .line 947
    .line 948
    move-result v6

    .line 949
    if-eqz v6, :cond_37

    .line 950
    .line 951
    const-string v0, "  \u653e\u5f03: \u65e0\u6cd5\u63d0\u53d6nativeurl"

    .line 952
    .line 953
    invoke-virtual {v5, v0}, Loa/a;->c(Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    goto/16 :goto_17

    .line 957
    .line 958
    :cond_37
    const-string v6, "e"

    .line 959
    .line 960
    invoke-static {v0, v6}, Lx6/d;->c0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v6

    .line 964
    const-string v10, "f"

    .line 965
    .line 966
    invoke-static {v0, v10}, Lx6/d;->c0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    iget-object v10, v5, Loa/a;->d:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v10, Lna/b;

    .line 973
    .line 974
    iget-object v10, v10, Lna/b;->h:Lna/e;

    .line 975
    .line 976
    invoke-virtual {v10}, Lna/e;->a()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v10

    .line 980
    invoke-static {v0}, Loa/b;->f(Ljava/lang/String;)Z

    .line 981
    .line 982
    .line 983
    move-result v11

    .line 984
    if-eqz v11, :cond_38

    .line 985
    .line 986
    goto :goto_20

    .line 987
    :cond_38
    invoke-static {v6}, Loa/b;->f(Ljava/lang/String;)Z

    .line 988
    .line 989
    .line 990
    move-result v11

    .line 991
    if-eqz v11, :cond_39

    .line 992
    .line 993
    goto :goto_21

    .line 994
    :cond_39
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 995
    .line 996
    .line 997
    move-result v11

    .line 998
    if-nez v11, :cond_3a

    .line 999
    .line 1000
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v10

    .line 1004
    if-eqz v10, :cond_3a

    .line 1005
    .line 1006
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v10

    .line 1010
    if-nez v10, :cond_3a

    .line 1011
    .line 1012
    :goto_20
    move-object v10, v0

    .line 1013
    goto :goto_22

    .line 1014
    :cond_3a
    :goto_21
    move-object v10, v6

    .line 1015
    :goto_22
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1016
    .line 1017
    .line 1018
    move-result v11

    .line 1019
    if-eqz v11, :cond_3b

    .line 1020
    .line 1021
    move-object v10, v0

    .line 1022
    :cond_3b
    const-string v11, "fromusername"

    .line 1023
    .line 1024
    invoke-static {v12, v11}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v11

    .line 1028
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v13

    .line 1032
    if-eqz v13, :cond_3c

    .line 1033
    .line 1034
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v13

    .line 1038
    if-nez v13, :cond_3c

    .line 1039
    .line 1040
    invoke-virtual {v14, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 1041
    .line 1042
    .line 1043
    move-result v7

    .line 1044
    if-lez v7, :cond_3c

    .line 1045
    .line 1046
    invoke-virtual {v14, v9, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v11

    .line 1050
    :cond_3c
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v7

    .line 1054
    if-eqz v7, :cond_3d

    .line 1055
    .line 1056
    move-object v11, v6

    .line 1057
    :cond_3d
    invoke-static {v11}, Loa/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v13

    .line 1061
    invoke-static {v10}, Loa/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v14

    .line 1065
    const-string v7, "exclusive_recv_username"

    .line 1066
    .line 1067
    invoke-static {v12, v7}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v16

    .line 1071
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1072
    .line 1073
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1074
    .line 1075
    .line 1076
    const-string v10, "  from="

    .line 1077
    .line 1078
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1082
    .line 1083
    .line 1084
    const-string v6, " to="

    .line 1085
    .line 1086
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1090
    .line 1091
    .line 1092
    const-string v0, " talker="

    .line 1093
    .line 1094
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    .line 1100
    const-string v0, " sender="

    .line 1101
    .line 1102
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    invoke-virtual {v5, v0}, Loa/a;->c(Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    iget-object v0, v5, Loa/a;->e:Ljava/lang/Object;

    .line 1116
    .line 1117
    check-cast v0, Lna/b;

    .line 1118
    .line 1119
    const-string v11, "AddMsg"

    .line 1120
    .line 1121
    iget-object v10, v0, Lna/b;->h:Lna/e;

    .line 1122
    .line 1123
    invoke-virtual/range {v10 .. v16}, Lna/e;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1124
    .line 1125
    .line 1126
    goto/16 :goto_17

    .line 1127
    .line 1128
    :goto_23
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1129
    .line 1130
    const-string v7, "ERROR handleAddMsg: "

    .line 1131
    .line 1132
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    invoke-virtual {v5, v0}, Loa/a;->c(Ljava/lang/String;)V

    .line 1147
    .line 1148
    .line 1149
    goto/16 :goto_17

    .line 1150
    .line 1151
    :cond_3e
    :goto_24
    return-void

    .line 1152
    :pswitch_7
    sget-object v0, Lm9/c;->i:Lm9/c;

    .line 1153
    .line 1154
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    iget-object v5, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 1158
    .line 1159
    move-object v12, v5

    .line 1160
    check-cast v12, Lm9/e;

    .line 1161
    .line 1162
    iget-object v5, v12, Lm9/e;->d:Ljava/lang/ThreadLocal;

    .line 1163
    .line 1164
    iget-object v6, v12, Lm9/e;->a:Lr8/g;

    .line 1165
    .line 1166
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v5

    .line 1170
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1171
    .line 1172
    invoke-static {v5, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v5

    .line 1176
    if-eqz v5, :cond_3f

    .line 1177
    .line 1178
    goto/16 :goto_2d

    .line 1179
    .line 1180
    :cond_3f
    iget-object v5, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1181
    .line 1182
    if-eqz v5, :cond_4b

    .line 1183
    .line 1184
    invoke-static {v7, v5}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v5

    .line 1188
    if-eqz v5, :cond_4b

    .line 1189
    .line 1190
    const-string v10, "field_name"

    .line 1191
    .line 1192
    invoke-virtual {v12, v5, v10}, Lm9/e;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v10

    .line 1196
    const-string v11, "field_content"

    .line 1197
    .line 1198
    invoke-virtual {v12, v5, v11}, Lm9/e;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v11

    .line 1202
    const-string v13, "field_md5"

    .line 1203
    .line 1204
    invoke-virtual {v12, v5, v13}, Lm9/e;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v13

    .line 1208
    const-string v14, "dice"

    .line 1209
    .line 1210
    invoke-static {v10, v14, v7}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v14

    .line 1214
    if-nez v14, :cond_43

    .line 1215
    .line 1216
    const-string v14, "type=\"2\""

    .line 1217
    .line 1218
    invoke-static {v11, v14, v9}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v14

    .line 1222
    if-nez v14, :cond_43

    .line 1223
    .line 1224
    sget-object v14, Lm9/e;->l:Ljava/util/HashSet;

    .line 1225
    .line 1226
    invoke-virtual {v14, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v14

    .line 1230
    if-eqz v14, :cond_40

    .line 1231
    .line 1232
    goto :goto_26

    .line 1233
    :cond_40
    const-string v14, "jsb"

    .line 1234
    .line 1235
    invoke-static {v10, v14, v7}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v10

    .line 1239
    if-nez v10, :cond_42

    .line 1240
    .line 1241
    const-string v10, "type=\"1\""

    .line 1242
    .line 1243
    invoke-static {v11, v10, v9}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v10

    .line 1247
    if-nez v10, :cond_42

    .line 1248
    .line 1249
    sget-object v10, Lm9/e;->k:Ljava/util/HashSet;

    .line 1250
    .line 1251
    invoke-virtual {v10, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v10

    .line 1255
    if-eqz v10, :cond_41

    .line 1256
    .line 1257
    goto :goto_25

    .line 1258
    :cond_41
    move-object v14, v8

    .line 1259
    goto :goto_27

    .line 1260
    :cond_42
    :goto_25
    sget-object v10, Lm9/c;->h:Lm9/c;

    .line 1261
    .line 1262
    move-object v14, v10

    .line 1263
    goto :goto_27

    .line 1264
    :cond_43
    :goto_26
    move-object v14, v0

    .line 1265
    :goto_27
    if-eqz v14, :cond_4b

    .line 1266
    .line 1267
    iget-object v10, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1268
    .line 1269
    const-string v11, "Hchat_game_emoji_config"

    .line 1270
    .line 1271
    invoke-static {v10, v11}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v10

    .line 1275
    const-string v13, "game_emoji_pick_before_send"

    .line 1276
    .line 1277
    invoke-interface {v10, v13, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v10

    .line 1281
    if-eqz v10, :cond_49

    .line 1282
    .line 1283
    iget-object v0, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 1284
    .line 1285
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1286
    .line 1287
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    if-eqz v3, :cond_44

    .line 1292
    .line 1293
    invoke-virtual {v3}, Lq8/o;->a()Landroid/app/Activity;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v3

    .line 1297
    goto :goto_28

    .line 1298
    :cond_44
    move-object v3, v8

    .line 1299
    :goto_28
    if-eqz v3, :cond_45

    .line 1300
    .line 1301
    goto :goto_29

    .line 1302
    :cond_45
    move-object v3, v8

    .line 1303
    :goto_29
    if-eqz v3, :cond_4b

    .line 1304
    .line 1305
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 1306
    .line 1307
    .line 1308
    move-result v4

    .line 1309
    if-nez v4, :cond_47

    .line 1310
    .line 1311
    invoke-virtual {v3}, Landroid/app/Activity;->isDestroyed()Z

    .line 1312
    .line 1313
    .line 1314
    move-result v4

    .line 1315
    if-eqz v4, :cond_46

    .line 1316
    .line 1317
    goto :goto_2a

    .line 1318
    :cond_46
    move-object v11, v3

    .line 1319
    goto :goto_2b

    .line 1320
    :cond_47
    :goto_2a
    move-object v11, v8

    .line 1321
    :goto_2b
    if-eqz v11, :cond_4b

    .line 1322
    .line 1323
    iget-object v3, v12, Lm9/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1324
    .line 1325
    invoke-virtual {v3, v9, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v3

    .line 1329
    if-nez v3, :cond_48

    .line 1330
    .line 1331
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1332
    .line 1333
    .line 1334
    goto :goto_2d

    .line 1335
    :cond_48
    new-instance v13, Lm9/d;

    .line 1336
    .line 1337
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1338
    .line 1339
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1340
    .line 1341
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1342
    .line 1343
    .line 1344
    array-length v5, v4

    .line 1345
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v4

    .line 1349
    invoke-direct {v13, v0, v3, v4, v14}, Lm9/d;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;Lm9/c;)V

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1353
    .line 1354
    .line 1355
    iget-object v0, v12, Lm9/e;->c:Landroid/os/Handler;

    .line 1356
    .line 1357
    new-instance v10, Lb9/c;

    .line 1358
    .line 1359
    const/16 v15, 0xc

    .line 1360
    .line 1361
    invoke-direct/range {v10 .. v15}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v0, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1365
    .line 1366
    .line 1367
    goto :goto_2d

    .line 1368
    :cond_49
    iget-object v2, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1369
    .line 1370
    invoke-static {v2, v11}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v2

    .line 1374
    const-string v10, "game_emoji_fixed_result"

    .line 1375
    .line 1376
    invoke-interface {v2, v10, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1377
    .line 1378
    .line 1379
    move-result v2

    .line 1380
    if-eqz v2, :cond_4b

    .line 1381
    .line 1382
    if-ne v14, v0, :cond_4a

    .line 1383
    .line 1384
    iget-object v0, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1385
    .line 1386
    invoke-static {v0, v11}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    const-string v2, "game_emoji_dice_result"

    .line 1391
    .line 1392
    invoke-interface {v0, v2, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1393
    .line 1394
    .line 1395
    move-result v0

    .line 1396
    invoke-static {v0, v7, v3}, Lr9/e0;->r(III)I

    .line 1397
    .line 1398
    .line 1399
    move-result v0

    .line 1400
    goto :goto_2c

    .line 1401
    :cond_4a
    iget-object v0, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1402
    .line 1403
    invoke-static {v0, v11}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    const-string v2, "game_emoji_rps_result"

    .line 1408
    .line 1409
    invoke-interface {v0, v2, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1410
    .line 1411
    .line 1412
    move-result v0

    .line 1413
    invoke-static {v0, v7, v4}, Lr9/e0;->r(III)I

    .line 1414
    .line 1415
    .line 1416
    move-result v0

    .line 1417
    :goto_2c
    invoke-virtual {v12, v5, v14, v0}, Lm9/e;->a(Ljava/lang/Object;Lm9/c;I)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v0

    .line 1421
    if-nez v0, :cond_4b

    .line 1422
    .line 1423
    iget-object v0, v12, Lm9/e;->b:Lia/t;

    .line 1424
    .line 1425
    const-string v2, "\u6539\u5199\u6e38\u620f\u8868\u60c5\u7ed3\u679c\u5931\u8d25"

    .line 1426
    .line 1427
    invoke-virtual {v0, v2, v8}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    :cond_4b
    :goto_2d
    return-void

    .line 1431
    :pswitch_8
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 1432
    .line 1433
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1434
    .line 1435
    iget-object v3, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 1436
    .line 1437
    check-cast v3, Lm8/c;

    .line 1438
    .line 1439
    iget-object v4, v3, Lm8/c;->c:Ljava/lang/Object;

    .line 1440
    .line 1441
    if-eqz v4, :cond_4c

    .line 1442
    .line 1443
    invoke-static {v0}, Lm8/c;->f(Ljava/lang/reflect/Method;)I

    .line 1444
    .line 1445
    .line 1446
    move-result v4

    .line 1447
    iget-object v5, v3, Lm8/c;->d:Ljava/lang/Object;

    .line 1448
    .line 1449
    check-cast v5, Ljava/lang/reflect/Method;

    .line 1450
    .line 1451
    invoke-static {v5}, Lm8/c;->f(Ljava/lang/reflect/Method;)I

    .line 1452
    .line 1453
    .line 1454
    move-result v5

    .line 1455
    if-le v4, v5, :cond_4d

    .line 1456
    .line 1457
    :cond_4c
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1458
    .line 1459
    const-string v4, "\u7f51\u7edc\u53d1\u5305\u5668\u5df2\u7f13\u5b58"

    .line 1460
    .line 1461
    invoke-virtual {v3, v2, v4, v0}, Lm8/c;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1462
    .line 1463
    .line 1464
    :cond_4d
    return-void

    .line 1465
    :pswitch_9
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1466
    .line 1467
    if-nez v0, :cond_4e

    .line 1468
    .line 1469
    goto/16 :goto_33

    .line 1470
    .line 1471
    :cond_4e
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 1472
    .line 1473
    check-cast v0, Ljava/util/ArrayList;

    .line 1474
    .line 1475
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v3

    .line 1479
    :goto_2e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1480
    .line 1481
    .line 1482
    move-result v0

    .line 1483
    if-eqz v0, :cond_53

    .line 1484
    .line 1485
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v0

    .line 1489
    check-cast v0, Ljava/lang/Integer;

    .line 1490
    .line 1491
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1492
    .line 1493
    .line 1494
    move-result v0

    .line 1495
    if-ltz v0, :cond_51

    .line 1496
    .line 1497
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1498
    .line 1499
    array-length v5, v4

    .line 1500
    if-ge v0, v5, :cond_51

    .line 1501
    .line 1502
    aget-object v0, v4, v0

    .line 1503
    .line 1504
    if-eqz v0, :cond_51

    .line 1505
    .line 1506
    iget-object v4, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 1507
    .line 1508
    check-cast v4, Lk8/k;

    .line 1509
    .line 1510
    iget-object v5, v4, Lk8/k;->d:Lf8/c;

    .line 1511
    .line 1512
    :try_start_5
    iget-object v6, v4, Lk8/k;->b:Lg8/a;

    .line 1513
    .line 1514
    if-eqz v6, :cond_4f

    .line 1515
    .line 1516
    invoke-virtual {v6}, Lg8/a;->c()Ljava/lang/String;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v6

    .line 1520
    goto :goto_2f

    .line 1521
    :catchall_3
    move-exception v0

    .line 1522
    move-object/from16 v20, v3

    .line 1523
    .line 1524
    goto :goto_30

    .line 1525
    :cond_4f
    const-string v6, ""

    .line 1526
    .line 1527
    :goto_2f
    iget-object v7, v4, Lk8/k;->c:Lk8/q;

    .line 1528
    .line 1529
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1530
    .line 1531
    .line 1532
    invoke-static {v0, v6}, Lk8/q;->k(Ljava/lang/Object;Ljava/lang/String;)Ll8/e;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    if-nez v0, :cond_50

    .line 1537
    .line 1538
    goto :goto_31

    .line 1539
    :cond_50
    new-instance v6, Lf8/g;

    .line 1540
    .line 1541
    iget-object v7, v0, Ll8/e;->f:Ljava/lang/String;

    .line 1542
    .line 1543
    iget-object v8, v0, Ll8/e;->g:Ljava/lang/String;

    .line 1544
    .line 1545
    iget-object v9, v0, Ll8/e;->h:Ljava/lang/String;

    .line 1546
    .line 1547
    iget-object v10, v0, Ll8/e;->e:Ljava/lang/String;

    .line 1548
    .line 1549
    iget v11, v0, Ll8/e;->b:I

    .line 1550
    .line 1551
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v11

    .line 1555
    iget-wide v12, v0, Ll8/e;->c:J

    .line 1556
    .line 1557
    iget-wide v14, v0, Ll8/e;->d:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1558
    .line 1559
    move-object/from16 v20, v3

    .line 1560
    .line 1561
    :try_start_6
    iget-object v3, v0, Ll8/e;->j:Ljava/lang/String;

    .line 1562
    .line 1563
    move-object/from16 v16, v3

    .line 1564
    .line 1565
    iget-object v3, v0, Ll8/e;->k:Ljava/lang/String;

    .line 1566
    .line 1567
    const/16 v18, 0x0

    .line 1568
    .line 1569
    const/16 v19, 0x0

    .line 1570
    .line 1571
    move-object/from16 v17, v3

    .line 1572
    .line 1573
    invoke-direct/range {v6 .. v19}, Lf8/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v5, v6}, Lf8/c;->b(Ljava/lang/Object;)V

    .line 1577
    .line 1578
    .line 1579
    iget-boolean v0, v0, Ll8/e;->a:Z

    .line 1580
    .line 1581
    if-eqz v0, :cond_52

    .line 1582
    .line 1583
    new-instance v0, Lf8/b;

    .line 1584
    .line 1585
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v5, v0}, Lf8/c;->b(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1589
    .line 1590
    .line 1591
    goto :goto_32

    .line 1592
    :catchall_4
    move-exception v0

    .line 1593
    :goto_30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1594
    .line 1595
    const-string v5, "\u6d3e\u53d1\u6d88\u606f\u4e8b\u4ef6\u5931\u8d25: "

    .line 1596
    .line 1597
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v0

    .line 1604
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    invoke-virtual {v4, v0}, Lk8/k;->d(Ljava/lang/String;)V

    .line 1612
    .line 1613
    .line 1614
    goto :goto_32

    .line 1615
    :cond_51
    :goto_31
    move-object/from16 v20, v3

    .line 1616
    .line 1617
    :cond_52
    :goto_32
    move-object/from16 v3, v20

    .line 1618
    .line 1619
    goto/16 :goto_2e

    .line 1620
    .line 1621
    :cond_53
    :goto_33
    return-void

    .line 1622
    :pswitch_a
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1623
    .line 1624
    .line 1625
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 1626
    .line 1627
    check-cast v0, Lhb/c;

    .line 1628
    .line 1629
    iget-object v3, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 1630
    .line 1631
    check-cast v3, Ljava/lang/reflect/Method;

    .line 1632
    .line 1633
    iget-object v4, v0, Lhb/c;->h:Ljava/lang/Object;

    .line 1634
    .line 1635
    check-cast v4, Lia/t;

    .line 1636
    .line 1637
    iget-object v0, v0, Lhb/c;->i:Ljava/lang/Object;

    .line 1638
    .line 1639
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1640
    .line 1641
    const-string v5, "multi_recall_enable"

    .line 1642
    .line 1643
    invoke-interface {v0, v5, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1644
    .line 1645
    .line 1646
    move-result v0

    .line 1647
    if-nez v0, :cond_54

    .line 1648
    .line 1649
    goto/16 :goto_40

    .line 1650
    .line 1651
    :cond_54
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1652
    .line 1653
    if-eqz v0, :cond_55

    .line 1654
    .line 1655
    invoke-static {v9, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v0

    .line 1659
    goto :goto_34

    .line 1660
    :cond_55
    move-object v0, v8

    .line 1661
    :goto_34
    instance-of v5, v0, Landroid/view/MenuItem;

    .line 1662
    .line 1663
    if-eqz v5, :cond_56

    .line 1664
    .line 1665
    check-cast v0, Landroid/view/MenuItem;

    .line 1666
    .line 1667
    goto :goto_35

    .line 1668
    :cond_56
    move-object v0, v8

    .line 1669
    :goto_35
    if-eqz v0, :cond_65

    .line 1670
    .line 1671
    invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I

    .line 1672
    .line 1673
    .line 1674
    move-result v0

    .line 1675
    const v5, 0x48435243    # 200009.05f

    .line 1676
    .line 1677
    .line 1678
    if-eq v0, v5, :cond_57

    .line 1679
    .line 1680
    goto/16 :goto_40

    .line 1681
    .line 1682
    :cond_57
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    if-eqz v0, :cond_58

    .line 1687
    .line 1688
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    goto :goto_36

    .line 1693
    :cond_58
    move-object v0, v8

    .line 1694
    :goto_36
    if-eqz v0, :cond_59

    .line 1695
    .line 1696
    goto :goto_37

    .line 1697
    :cond_59
    move-object v0, v8

    .line 1698
    :goto_37
    if-eqz v0, :cond_5a

    .line 1699
    .line 1700
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1701
    .line 1702
    .line 1703
    move-result v5

    .line 1704
    if-nez v5, :cond_5a

    .line 1705
    .line 1706
    move-object v5, v0

    .line 1707
    goto :goto_38

    .line 1708
    :cond_5a
    move-object v5, v8

    .line 1709
    :goto_38
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1710
    .line 1711
    invoke-static {v0}, Lk8/b;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v0

    .line 1715
    invoke-static {v0}, Lhb/c;->t(Ljava/util/List;)Ljava/util/List;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v10

    .line 1719
    if-nez v10, :cond_5c

    .line 1720
    .line 1721
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1722
    .line 1723
    .line 1724
    move-result v0

    .line 1725
    if-eqz v0, :cond_5b

    .line 1726
    .line 1727
    const-string v0, "\u672a\u627e\u5230\u9009\u4e2d\u7684\u6d88\u606f"

    .line 1728
    .line 1729
    goto :goto_39

    .line 1730
    :cond_5b
    const-string v0, "\u53ea\u80fd\u6279\u91cf\u64a4\u56de\u81ea\u5df1\u53d1\u9001\u7684\u6d88\u606f"

    .line 1731
    .line 1732
    :goto_39
    invoke-static {v5, v0}, Lhb/c;->A(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1733
    .line 1734
    .line 1735
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1736
    .line 1737
    .line 1738
    goto/16 :goto_40

    .line 1739
    .line 1740
    :cond_5c
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1741
    .line 1742
    invoke-static {v0, v3, v4}, Lbe/h;->X(Ljava/lang/Object;Ljava/lang/reflect/Method;Lfg/p;)Lb/e;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v3

    .line 1746
    if-nez v3, :cond_5d

    .line 1747
    .line 1748
    invoke-static {v5, v6}, Lhb/c;->A(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1752
    .line 1753
    .line 1754
    goto/16 :goto_40

    .line 1755
    .line 1756
    :cond_5d
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v6

    .line 1760
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 1761
    .line 1762
    .line 1763
    move-result v0

    .line 1764
    if-eqz v0, :cond_5e

    .line 1765
    .line 1766
    :goto_3a
    move-object/from16 v16, v10

    .line 1767
    .line 1768
    goto/16 :goto_3f

    .line 1769
    .line 1770
    :cond_5e
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v11

    .line 1774
    move v12, v9

    .line 1775
    :goto_3b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1776
    .line 1777
    .line 1778
    move-result v0

    .line 1779
    if-eqz v0, :cond_64

    .line 1780
    .line 1781
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v13

    .line 1785
    if-eqz v6, :cond_5f

    .line 1786
    .line 1787
    :try_start_7
    invoke-virtual {v6, v13}, Lk8/g;->s(Ljava/lang/Object;)Z

    .line 1788
    .line 1789
    .line 1790
    move-result v0

    .line 1791
    if-ne v0, v7, :cond_5f

    .line 1792
    .line 1793
    move v0, v7

    .line 1794
    goto :goto_3c

    .line 1795
    :catchall_5
    move-exception v0

    .line 1796
    goto :goto_3d

    .line 1797
    :cond_5f
    move v0, v9

    .line 1798
    :goto_3c
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 1802
    goto :goto_3e

    .line 1803
    :goto_3d
    new-instance v14, Lsf/f;

    .line 1804
    .line 1805
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1806
    .line 1807
    .line 1808
    move-object v0, v14

    .line 1809
    :goto_3e
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v14

    .line 1813
    move-object/from16 v16, v10

    .line 1814
    .line 1815
    if-eqz v14, :cond_60

    .line 1816
    .line 1817
    invoke-static {v13}, Lhb/c;->q(Ljava/lang/Object;)J

    .line 1818
    .line 1819
    .line 1820
    move-result-wide v9

    .line 1821
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1822
    .line 1823
    const-string v15, "\u6279\u91cf\u64a4\u56de\u6d88\u606f\u5f02\u5e38: msgId="

    .line 1824
    .line 1825
    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1826
    .line 1827
    .line 1828
    invoke-virtual {v13, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1829
    .line 1830
    .line 1831
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v9

    .line 1835
    invoke-virtual {v4, v9, v14}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    :cond_60
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1839
    .line 1840
    instance-of v10, v0, Lsf/f;

    .line 1841
    .line 1842
    if-eqz v10, :cond_61

    .line 1843
    .line 1844
    move-object v0, v9

    .line 1845
    :cond_61
    check-cast v0, Ljava/lang/Boolean;

    .line 1846
    .line 1847
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1848
    .line 1849
    .line 1850
    move-result v0

    .line 1851
    if-eqz v0, :cond_62

    .line 1852
    .line 1853
    add-int/lit8 v12, v12, 0x1

    .line 1854
    .line 1855
    if-ltz v12, :cond_63

    .line 1856
    .line 1857
    :cond_62
    move-object/from16 v10, v16

    .line 1858
    .line 1859
    const/4 v9, 0x0

    .line 1860
    goto :goto_3b

    .line 1861
    :cond_63
    invoke-static {}, La/a;->P0()V

    .line 1862
    .line 1863
    .line 1864
    throw v8

    .line 1865
    :cond_64
    move v9, v12

    .line 1866
    goto :goto_3a

    .line 1867
    :goto_3f
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    .line 1868
    .line 1869
    .line 1870
    move-result v0

    .line 1871
    const-string v6, "/"

    .line 1872
    .line 1873
    const-string v7, " \u6761\u6d88\u606f"

    .line 1874
    .line 1875
    const-string v10, "\u5df2\u53d1\u8d77\u64a4\u56de "

    .line 1876
    .line 1877
    invoke-static {v9, v0, v10, v6, v7}, Leh/a;->k(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v0

    .line 1881
    invoke-static {v5, v0}, Lhb/c;->A(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1882
    .line 1883
    .line 1884
    invoke-virtual {v3, v4}, Lb/e;->r(Lfg/p;)V

    .line 1885
    .line 1886
    .line 1887
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1888
    .line 1889
    .line 1890
    :cond_65
    :goto_40
    return-void

    .line 1891
    :pswitch_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1892
    .line 1893
    .line 1894
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 1895
    .line 1896
    move-object v13, v0

    .line 1897
    check-cast v13, Lhb/i0;

    .line 1898
    .line 1899
    iget-object v0, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 1900
    .line 1901
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1902
    .line 1903
    iget-object v3, v13, Lhb/i0;->d:Landroid/content/SharedPreferences;

    .line 1904
    .line 1905
    const-string v4, "selected_messages_enable"

    .line 1906
    .line 1907
    invoke-interface {v3, v4, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1908
    .line 1909
    .line 1910
    move-result v3

    .line 1911
    if-nez v3, :cond_66

    .line 1912
    .line 1913
    goto/16 :goto_4a

    .line 1914
    .line 1915
    :cond_66
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1916
    .line 1917
    if-eqz v3, :cond_67

    .line 1918
    .line 1919
    const/4 v15, 0x0

    .line 1920
    invoke-static {v15, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v3

    .line 1924
    goto :goto_41

    .line 1925
    :cond_67
    move-object v3, v8

    .line 1926
    :goto_41
    instance-of v4, v3, Landroid/view/MenuItem;

    .line 1927
    .line 1928
    if-eqz v4, :cond_68

    .line 1929
    .line 1930
    check-cast v3, Landroid/view/MenuItem;

    .line 1931
    .line 1932
    goto :goto_42

    .line 1933
    :cond_68
    move-object v3, v8

    .line 1934
    :goto_42
    if-eqz v3, :cond_74

    .line 1935
    .line 1936
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 1937
    .line 1938
    .line 1939
    move-result v3

    .line 1940
    const v4, 0x4843534d    # 200013.2f

    .line 1941
    .line 1942
    .line 1943
    if-eq v3, v4, :cond_6a

    .line 1944
    .line 1945
    const v4, 0x48435354    # 200013.31f

    .line 1946
    .line 1947
    .line 1948
    if-eq v3, v4, :cond_69

    .line 1949
    .line 1950
    goto/16 :goto_4a

    .line 1951
    .line 1952
    :cond_69
    sget-object v3, Lhb/g0;->h:Lhb/g0;

    .line 1953
    .line 1954
    :goto_43
    move-object v12, v3

    .line 1955
    goto :goto_44

    .line 1956
    :cond_6a
    sget-object v3, Lhb/g0;->g:Lhb/g0;

    .line 1957
    .line 1958
    goto :goto_43

    .line 1959
    :goto_44
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1960
    .line 1961
    .line 1962
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v3

    .line 1966
    if-eqz v3, :cond_6b

    .line 1967
    .line 1968
    invoke-virtual {v3}, Lq8/o;->a()Landroid/app/Activity;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v3

    .line 1972
    goto :goto_45

    .line 1973
    :cond_6b
    move-object v3, v8

    .line 1974
    :goto_45
    if-eqz v3, :cond_6c

    .line 1975
    .line 1976
    goto :goto_46

    .line 1977
    :cond_6c
    move-object v3, v8

    .line 1978
    :goto_46
    if-eqz v3, :cond_6d

    .line 1979
    .line 1980
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 1981
    .line 1982
    .line 1983
    move-result v4

    .line 1984
    if-nez v4, :cond_6d

    .line 1985
    .line 1986
    move-object v11, v3

    .line 1987
    goto :goto_47

    .line 1988
    :cond_6d
    move-object v11, v8

    .line 1989
    :goto_47
    if-nez v11, :cond_6e

    .line 1990
    .line 1991
    goto :goto_4a

    .line 1992
    :cond_6e
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1993
    .line 1994
    invoke-static {v3}, Lk8/b;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v3

    .line 1998
    new-instance v4, Ljava/util/ArrayList;

    .line 1999
    .line 2000
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2001
    .line 2002
    .line 2003
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v5

    .line 2007
    :cond_6f
    :goto_48
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2008
    .line 2009
    .line 2010
    move-result v7

    .line 2011
    if-eqz v7, :cond_70

    .line 2012
    .line 2013
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v7

    .line 2017
    invoke-static {v7}, Lx6/d;->y(Ljava/lang/Object;)Lhb/t;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v7

    .line 2021
    if-eqz v7, :cond_6f

    .line 2022
    .line 2023
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2024
    .line 2025
    .line 2026
    goto :goto_48

    .line 2027
    :cond_70
    new-instance v5, La9/h;

    .line 2028
    .line 2029
    const/16 v7, 0x13

    .line 2030
    .line 2031
    invoke-direct {v5, v7}, La9/h;-><init>(I)V

    .line 2032
    .line 2033
    .line 2034
    new-instance v8, Lc9/a0;

    .line 2035
    .line 2036
    invoke-direct {v8, v5, v7}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 2037
    .line 2038
    .line 2039
    invoke-static {v4, v8}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v14

    .line 2043
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 2044
    .line 2045
    .line 2046
    move-result v4

    .line 2047
    if-nez v4, :cond_73

    .line 2048
    .line 2049
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 2050
    .line 2051
    .line 2052
    move-result v4

    .line 2053
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2054
    .line 2055
    .line 2056
    move-result v3

    .line 2057
    if-eq v4, v3, :cond_71

    .line 2058
    .line 2059
    goto :goto_49

    .line 2060
    :cond_71
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2061
    .line 2062
    iget-object v3, v13, Lhb/i0;->b:Lab/b;

    .line 2063
    .line 2064
    invoke-static {v2, v0, v3}, Lbe/h;->X(Ljava/lang/Object;Ljava/lang/reflect/Method;Lfg/p;)Lb/e;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v15

    .line 2068
    if-nez v15, :cond_72

    .line 2069
    .line 2070
    invoke-virtual {v13, v11, v6}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2071
    .line 2072
    .line 2073
    goto :goto_4a

    .line 2074
    :cond_72
    iget-object v0, v13, Lhb/i0;->c:Landroid/os/Handler;

    .line 2075
    .line 2076
    new-instance v9, Lca/x;

    .line 2077
    .line 2078
    const/4 v10, 0x7

    .line 2079
    invoke-direct/range {v9 .. v15}, Lca/x;-><init>(ILandroid/app/Activity;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2080
    .line 2081
    .line 2082
    invoke-virtual {v0, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2083
    .line 2084
    .line 2085
    goto :goto_4a

    .line 2086
    :cond_73
    :goto_49
    const-string v0, "\u90e8\u5206\u9009\u4e2d\u6d88\u606f\u6682\u4e0d\u652f\u6301\u53d1\u9001"

    .line 2087
    .line 2088
    invoke-virtual {v13, v11, v0}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2089
    .line 2090
    .line 2091
    :cond_74
    :goto_4a
    return-void

    .line 2092
    :pswitch_c
    iget-object v0, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 2093
    .line 2094
    check-cast v0, Ljava/lang/reflect/Method;

    .line 2095
    .line 2096
    iget-object v3, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 2097
    .line 2098
    check-cast v3, Lha/j0;

    .line 2099
    .line 2100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2101
    .line 2102
    .line 2103
    :try_start_8
    invoke-static {v0}, Lha/j0;->m(Ljava/lang/reflect/Method;)Z

    .line 2104
    .line 2105
    .line 2106
    move-result v4

    .line 2107
    if-eqz v4, :cond_75

    .line 2108
    .line 2109
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2110
    .line 2111
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2112
    .line 2113
    invoke-static {v0}, Lha/j0;->l(Ljava/lang/reflect/Method;)Z

    .line 2114
    .line 2115
    .line 2116
    move-result v0

    .line 2117
    invoke-static {v3, v4, v2, v0}, Lha/j0;->b(Lha/j0;Ljava/lang/Object;[Ljava/lang/Object;Z)V

    .line 2118
    .line 2119
    .line 2120
    goto :goto_4c

    .line 2121
    :catchall_6
    move-exception v0

    .line 2122
    goto :goto_4b

    .line 2123
    :cond_75
    invoke-static {v0}, Lha/j0;->k(Ljava/lang/reflect/Method;)Z

    .line 2124
    .line 2125
    .line 2126
    move-result v0

    .line 2127
    if-eqz v0, :cond_78

    .line 2128
    .line 2129
    iget-object v0, v3, Lha/j0;->e:Ljava/lang/ThreadLocal;

    .line 2130
    .line 2131
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v0

    .line 2135
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2136
    .line 2137
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2138
    .line 2139
    .line 2140
    move-result v0

    .line 2141
    if-eqz v0, :cond_76

    .line 2142
    .line 2143
    goto :goto_4c

    .line 2144
    :cond_76
    iget-object v0, v3, Lha/j0;->b:Landroid/content/SharedPreferences;

    .line 2145
    .line 2146
    const-string v4, "sns_anti_recall_enable"

    .line 2147
    .line 2148
    const/4 v15, 0x0

    .line 2149
    invoke-interface {v0, v4, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2150
    .line 2151
    .line 2152
    move-result v0

    .line 2153
    if-nez v0, :cond_77

    .line 2154
    .line 2155
    goto :goto_4c

    .line 2156
    :cond_77
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2157
    .line 2158
    invoke-static {v3, v0}, Lha/j0;->a(Lha/j0;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 2159
    .line 2160
    .line 2161
    goto :goto_4c

    .line 2162
    :goto_4b
    const-string v2, "[Hchat:SnsAntiRecall] Hook\u5904\u7406\u5931\u8d25"

    .line 2163
    .line 2164
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2165
    .line 2166
    .line 2167
    :cond_78
    :goto_4c
    return-void

    .line 2168
    :pswitch_d
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2169
    .line 2170
    .line 2171
    sget-object v0, Lh9/d;->a:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 2172
    .line 2173
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 2174
    .line 2175
    check-cast v0, Landroid/content/Context;

    .line 2176
    .line 2177
    iget-object v3, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 2178
    .line 2179
    check-cast v3, Lfg/p;

    .line 2180
    .line 2181
    :try_start_9
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2182
    .line 2183
    if-eqz v2, :cond_79

    .line 2184
    .line 2185
    invoke-static {v2}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v8

    .line 2189
    goto :goto_4d

    .line 2190
    :catchall_7
    move-exception v0

    .line 2191
    goto :goto_4e

    .line 2192
    :cond_79
    :goto_4d
    invoke-static {v0, v8, v3}, Lh9/d;->a(Landroid/content/Context;Ljava/lang/Object;Lfg/p;)V

    .line 2193
    .line 2194
    .line 2195
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 2196
    .line 2197
    goto :goto_4f

    .line 2198
    :goto_4e
    new-instance v2, Lsf/f;

    .line 2199
    .line 2200
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2201
    .line 2202
    .line 2203
    move-object v0, v2

    .line 2204
    :goto_4f
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v0

    .line 2208
    if-eqz v0, :cond_7a

    .line 2209
    .line 2210
    const-string v2, "\u865a\u62df\u5b9a\u4f4d\u8fd0\u884c\u65f6 Hook \u5931\u8d25"

    .line 2211
    .line 2212
    invoke-interface {v3, v2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2213
    .line 2214
    .line 2215
    :cond_7a
    return-void

    .line 2216
    :pswitch_e
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2217
    .line 2218
    .line 2219
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 2220
    .line 2221
    check-cast v0, Landroid/content/Context;

    .line 2222
    .line 2223
    const-string v3, "Hchat_fake_location_config"

    .line 2224
    .line 2225
    invoke-static {v0, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v0

    .line 2229
    const-string v3, "fake_location_enable"

    .line 2230
    .line 2231
    const/4 v15, 0x0

    .line 2232
    invoke-interface {v0, v3, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2233
    .line 2234
    .line 2235
    move-result v0

    .line 2236
    if-nez v0, :cond_7b

    .line 2237
    .line 2238
    goto :goto_50

    .line 2239
    :cond_7b
    iget-object v0, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 2240
    .line 2241
    check-cast v0, Lfg/a;

    .line 2242
    .line 2243
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2244
    .line 2245
    .line 2246
    move-result-object v0

    .line 2247
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 2248
    .line 2249
    .line 2250
    :goto_50
    return-void

    .line 2251
    :pswitch_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2252
    .line 2253
    .line 2254
    iget-object v0, v1, Lc9/c2;->b:Ljava/lang/Object;

    .line 2255
    .line 2256
    check-cast v0, Lca/e0;

    .line 2257
    .line 2258
    iget-object v4, v1, Lc9/c2;->c:Ljava/lang/Object;

    .line 2259
    .line 2260
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2261
    .line 2262
    iget-object v7, v0, Lca/e0;->c:Lab/b;

    .line 2263
    .line 2264
    iget-object v9, v0, Lca/e0;->e:Landroid/content/SharedPreferences;

    .line 2265
    .line 2266
    const-string v10, "message_forward_multi_moments_enable"

    .line 2267
    .line 2268
    const/4 v15, 0x0

    .line 2269
    invoke-interface {v9, v10, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2270
    .line 2271
    .line 2272
    move-result v9

    .line 2273
    if-nez v9, :cond_7c

    .line 2274
    .line 2275
    goto/16 :goto_56

    .line 2276
    .line 2277
    :cond_7c
    iget-object v9, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2278
    .line 2279
    if-eqz v9, :cond_87

    .line 2280
    .line 2281
    array-length v10, v9

    .line 2282
    :goto_51
    if-ge v15, v10, :cond_7f

    .line 2283
    .line 2284
    aget-object v11, v9, v15

    .line 2285
    .line 2286
    instance-of v12, v11, Landroid/view/MenuItem;

    .line 2287
    .line 2288
    if-eqz v12, :cond_7d

    .line 2289
    .line 2290
    check-cast v11, Landroid/view/MenuItem;

    .line 2291
    .line 2292
    goto :goto_52

    .line 2293
    :cond_7d
    move-object v11, v8

    .line 2294
    :goto_52
    if-eqz v11, :cond_7e

    .line 2295
    .line 2296
    goto :goto_53

    .line 2297
    :cond_7e
    add-int/lit8 v15, v15, 0x1

    .line 2298
    .line 2299
    goto :goto_51

    .line 2300
    :cond_7f
    move-object v11, v8

    .line 2301
    :goto_53
    if-eqz v11, :cond_87

    .line 2302
    .line 2303
    invoke-interface {v11}, Landroid/view/MenuItem;->getItemId()I

    .line 2304
    .line 2305
    .line 2306
    move-result v9

    .line 2307
    const v10, 0x48434d50    # 199989.25f

    .line 2308
    .line 2309
    .line 2310
    if-eq v9, v10, :cond_80

    .line 2311
    .line 2312
    goto/16 :goto_56

    .line 2313
    .line 2314
    :cond_80
    invoke-virtual {v2, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 2315
    .line 2316
    .line 2317
    invoke-static {}, Lca/e0;->b()Landroid/app/Activity;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v8

    .line 2321
    if-eqz v8, :cond_87

    .line 2322
    .line 2323
    iget-object v9, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2324
    .line 2325
    invoke-static {v9}, Lk8/b;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 2326
    .line 2327
    .line 2328
    move-result-object v9

    .line 2329
    new-instance v10, Ljava/util/ArrayList;

    .line 2330
    .line 2331
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 2332
    .line 2333
    .line 2334
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v11

    .line 2338
    :cond_81
    :goto_54
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2339
    .line 2340
    .line 2341
    move-result v12

    .line 2342
    if-eqz v12, :cond_82

    .line 2343
    .line 2344
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v12

    .line 2348
    invoke-static {v12}, Lx6/d;->y(Ljava/lang/Object;)Lhb/t;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v12

    .line 2352
    if-eqz v12, :cond_81

    .line 2353
    .line 2354
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2355
    .line 2356
    .line 2357
    goto :goto_54

    .line 2358
    :cond_82
    new-instance v11, La9/h;

    .line 2359
    .line 2360
    invoke-direct {v11, v3}, La9/h;-><init>(I)V

    .line 2361
    .line 2362
    .line 2363
    new-instance v3, Lc9/a0;

    .line 2364
    .line 2365
    invoke-direct {v3, v11, v5}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 2366
    .line 2367
    .line 2368
    invoke-static {v10, v3}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v3

    .line 2372
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 2373
    .line 2374
    .line 2375
    move-result v5

    .line 2376
    if-nez v5, :cond_86

    .line 2377
    .line 2378
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2379
    .line 2380
    .line 2381
    move-result v5

    .line 2382
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 2383
    .line 2384
    .line 2385
    move-result v9

    .line 2386
    if-eq v5, v9, :cond_83

    .line 2387
    .line 2388
    goto :goto_55

    .line 2389
    :cond_83
    invoke-virtual {v0, v8, v3}, Lca/e0;->j(Landroid/app/Activity;Ljava/util/List;)Lca/c0;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v3

    .line 2393
    iget-object v5, v3, Lca/c0;->a:Landroid/content/Intent;

    .line 2394
    .line 2395
    if-nez v5, :cond_84

    .line 2396
    .line 2397
    iget-object v2, v3, Lca/c0;->b:Ljava/lang/String;

    .line 2398
    .line 2399
    invoke-virtual {v0, v8, v2}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2400
    .line 2401
    .line 2402
    goto :goto_56

    .line 2403
    :cond_84
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2404
    .line 2405
    invoke-static {v2, v4, v7}, Lbe/h;->X(Ljava/lang/Object;Ljava/lang/reflect/Method;Lfg/p;)Lb/e;

    .line 2406
    .line 2407
    .line 2408
    move-result-object v2

    .line 2409
    if-nez v2, :cond_85

    .line 2410
    .line 2411
    invoke-virtual {v0, v8, v6}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2412
    .line 2413
    .line 2414
    goto :goto_56

    .line 2415
    :cond_85
    invoke-virtual {v2, v7}, Lb/e;->r(Lfg/p;)V

    .line 2416
    .line 2417
    .line 2418
    iget-object v2, v0, Lca/e0;->d:Landroid/os/Handler;

    .line 2419
    .line 2420
    new-instance v3, Lac/l;

    .line 2421
    .line 2422
    const/16 v4, 0x8

    .line 2423
    .line 2424
    invoke-direct {v3, v8, v0, v5, v4}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2425
    .line 2426
    .line 2427
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2428
    .line 2429
    .line 2430
    goto :goto_56

    .line 2431
    :cond_86
    :goto_55
    const-string v2, "\u90e8\u5206\u9009\u4e2d\u6d88\u606f\u6682\u4e0d\u652f\u6301\u8f6c\u53d1\u5230\u670b\u53cb\u5708"

    .line 2432
    .line 2433
    invoke-virtual {v0, v8, v2}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2434
    .line 2435
    .line 2436
    :cond_87
    :goto_56
    return-void

    .line 2437
    :pswitch_10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2438
    .line 2439
    .line 2440
    sget-object v0, Lc9/d2;->k:Ljava/lang/ThreadLocal;

    .line 2441
    .line 2442
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 2443
    .line 2444
    .line 2445
    sget-object v3, Lc9/d2;->a:Lc9/d2;

    .line 2446
    .line 2447
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2448
    .line 2449
    invoke-static {v2}, Lc9/d2;->v(Ljava/lang/Object;)Ljava/lang/String;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v2

    .line 2453
    if-eqz v2, :cond_88

    .line 2454
    .line 2455
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 2456
    .line 2457
    .line 2458
    :cond_88
    return-void

    .line 2459
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
