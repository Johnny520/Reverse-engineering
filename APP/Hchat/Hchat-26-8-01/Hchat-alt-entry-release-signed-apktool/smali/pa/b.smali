.class public final Lpa/b;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lpa/c;


# direct methods
.method public synthetic constructor <init>(Lpa/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpa/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lpa/b;->b:Lpa/c;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Lpa/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 11
    .line 12
    const-string v0, "m"

    .line 13
    .line 14
    iget-object v1, p0, Lpa/b;->b:Lpa/c;

    .line 15
    .line 16
    iget-object v2, v1, Lpa/c;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ll3/l;

    .line 19
    .line 20
    const-string v3, "hb_fake_packet_enable"

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    :try_start_0
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :catchall_0
    if-nez v4, :cond_0

    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_0
    sget-object v2, Lpa/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_6

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :cond_1
    :try_start_1
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    goto :goto_0

    .line 55
    :catchall_1
    const/4 v2, 0x0

    .line 56
    :goto_0
    const-string v3, "\u5047\u7ea2\u5305\u7fa4ID\u5df2\u4fee\u6b63\uff0c\u907f\u514d\u5206\u88c2\u7fa4"

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    :try_start_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Lpa/a;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_6

    .line 73
    .line 74
    invoke-static {p1, v0, v4}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v3}, Lpa/c;->d(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :catchall_2
    move-exception p1

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :catchall_3
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Ljava/lang/reflect/Field;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 106
    .line 107
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-class v5, Ljava/lang/String;

    .line 112
    .line 113
    if-eq v4, v5, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    if-eqz v4, :cond_3

    .line 121
    .line 122
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    const-string v6, "<wcpayinfo>"

    .line 127
    .line 128
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-nez v5, :cond_5

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-static {v5}, Lpa/a;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-nez v4, :cond_3

    .line 152
    .line 153
    invoke-static {v2, p1, v5}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v3}, Lpa/c;->d(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v2, "ERROR \u5047\u7ea2\u5305\u54cd\u5e94\u4fee\u6b63\u5931\u8d25: "

    .line 163
    .line 164
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {v1, p1}, Lpa/c;->d(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    :goto_3
    return-void

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    iget v0, p0, Lpa/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Lpa/b;->b:Lpa/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "|"

    .line 16
    .line 17
    :try_start_0
    iget-object v2, v0, Lpa/c;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ll3/l;

    .line 20
    .line 21
    const-string v3, "hb_fake_packet_enable"

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    :try_start_1
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move v2, v4

    .line 37
    :goto_0
    if-nez v2, :cond_0

    .line 38
    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :cond_0
    if-eqz p1, :cond_e

    .line 42
    .line 43
    :try_start_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 44
    .line 45
    if-eqz p1, :cond_e

    .line 46
    .line 47
    array-length v2, p1

    .line 48
    const/4 v3, 0x2

    .line 49
    if-ge v2, v3, :cond_1

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_1
    const/4 v2, 0x1

    .line 54
    aget-object p1, p1, v2

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v3, "getType"

    .line 65
    .line 66
    new-array v5, v4, [Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {v2, v3, v5}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-array v3, v4, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {v2, p1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const-string v5, "getUri"

    .line 89
    .line 90
    new-array v6, v4, [Ljava/lang/Class;

    .line 91
    .line 92
    invoke-static {v3, v5, v6}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    new-array v5, v4, [Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {v3, p1, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const/16 v5, 0x627

    .line 107
    .line 108
    if-eq v2, v5, :cond_3

    .line 109
    .line 110
    const-string v5, "requestwxhb"

    .line 111
    .line 112
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_e

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_1
    move-exception p1

    .line 120
    goto/16 :goto_5

    .line 121
    .line 122
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    const-string v6, "getReqObj"

    .line 127
    .line 128
    new-array v7, v4, [Ljava/lang/Class;

    .line 129
    .line 130
    invoke-static {v5, v6, v7}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    new-array v6, v4, [Ljava/lang/Object;

    .line 135
    .line 136
    invoke-static {v5, p1, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p1}, Lpa/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-nez p1, :cond_4

    .line 145
    .line 146
    goto/16 :goto_6

    .line 147
    .line 148
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    const-string v6, "toByteArray"

    .line 153
    .line 154
    new-array v7, v4, [Ljava/lang/Class;

    .line 155
    .line 156
    invoke-static {v5, v6, v7}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    new-array v6, v4, [Ljava/lang/Object;

    .line 161
    .line 162
    invoke-static {v5, p1, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 166
    const/4 v6, 0x0

    .line 167
    if-nez v5, :cond_5

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_5
    :try_start_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-nez v7, :cond_6

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    invoke-static {v5}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    new-array v8, v7, [B

    .line 186
    .line 187
    :goto_2
    if-ge v4, v7, :cond_7

    .line 188
    .line 189
    invoke-static {v5, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    instance-of v10, v9, Ljava/lang/Number;

    .line 194
    .line 195
    if-eqz v10, :cond_8

    .line 196
    .line 197
    check-cast v9, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {v9}, Ljava/lang/Number;->byteValue()B

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    aput-byte v9, v8, v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 204
    .line 205
    add-int/lit8 v4, v4, 0x1

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    move-object v6, v8

    .line 209
    :catchall_2
    :cond_8
    :goto_3
    if-eqz v6, :cond_e

    .line 210
    .line 211
    :try_start_4
    array-length v4, v6

    .line 212
    if-nez v4, :cond_9

    .line 213
    .line 214
    goto/16 :goto_6

    .line 215
    .line 216
    :cond_9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-static {v6}, Ljava/util/Arrays;->hashCode([B)I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    iget-object v4, v0, Lpa/c;->g:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 261
    .line 262
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    if-eqz v5, :cond_a

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 270
    .line 271
    .line 272
    move-result-wide v7

    .line 273
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-virtual {v4, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    check-cast v1, Ljava/lang/Long;

    .line 282
    .line 283
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 284
    .line 285
    .line 286
    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 287
    const/16 v9, 0x14

    .line 288
    .line 289
    if-le v5, v9, :cond_b

    .line 290
    .line 291
    :try_start_5
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    check-cast v5, Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 306
    .line 307
    .line 308
    :catchall_3
    :cond_b
    if-eqz v1, :cond_c

    .line 309
    .line 310
    :try_start_6
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 311
    .line 312
    .line 313
    move-result-wide v4

    .line 314
    sub-long/2addr v7, v4

    .line 315
    const-wide/16 v4, 0x1f4

    .line 316
    .line 317
    cmp-long v1, v7, v4

    .line 318
    .line 319
    if-gez v1, :cond_c

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_c
    :goto_4
    invoke-virtual {v0, v6}, Lpa/c;->f([B)[B

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    if-nez v1, :cond_d

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    const-string v5, "parseFrom"

    .line 334
    .line 335
    const-class v7, [B

    .line 336
    .line 337
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    invoke-static {v4, v5, v7}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-static {v4, p1, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    new-instance p1, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 355
    .line 356
    .line 357
    const-string v4, "\u53d1\u5305\u8bf7\u6c42\u5df2\u7be1\u6539: uri="

    .line 358
    .line 359
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v3, ", cgi="

    .line 366
    .line 367
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    const-string v2, ", len="

    .line 374
    .line 375
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    array-length v2, v6

    .line 379
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string v2, "->"

    .line 383
    .line 384
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    array-length v1, v1

    .line 388
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    invoke-virtual {v0, p1}, Lpa/c;->d(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 396
    .line 397
    .line 398
    goto :goto_6

    .line 399
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    const-string v2, "ERROR \u53d1\u5305\u8bf7\u6c42Hook\u5904\u7406\u5931\u8d25: "

    .line 402
    .line 403
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    invoke-virtual {v0, p1}, Lpa/c;->d(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    :cond_e
    :goto_6
    return-void

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
