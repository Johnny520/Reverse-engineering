.class public abstract Lg5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static volatile a:Z = false


# direct methods
.method public static a(Ljava/lang/ClassLoader;)I
    .locals 14

    .line 1
    const-string v0, "com.tencent.mobileqq.data.Card"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p0, :cond_b

    .line 5
    .line 6
    sget-boolean v2, Lg5;->a:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_b

    .line 11
    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    sput-boolean v2, Lg5;->a:Z

    .line 14
    .line 15
    const/16 v3, 0x28

    .line 16
    .line 17
    :try_start_0
    invoke-static {p0, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, "com.tencent.mobileqq.profilecard.api.impl.ProfileDataServiceImpl"

    .line 22
    .line 23
    invoke-static {p0, v5}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    if-eqz v4, :cond_3

    .line 28
    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    array-length v6, v5

    .line 37
    move v7, v1

    .line 38
    move v8, v7

    .line 39
    :goto_0
    if-ge v7, v6, :cond_4

    .line 40
    .line 41
    aget-object v9, v5, v7

    .line 42
    .line 43
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    if-ne v10, v4, :cond_2

    .line 58
    .line 59
    new-instance v10, Ld5;

    .line 60
    .line 61
    invoke-direct {v10, v3}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v9, v10}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 65
    .line 66
    .line 67
    add-int/lit8 v8, v8, 0x1

    .line 68
    .line 69
    new-instance v10, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v11, "hooked allow forbid card service: "

    .line 75
    .line 76
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-static {v9}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-static {v9}, Lv4;->C(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception v4

    .line 95
    goto :goto_3

    .line 96
    :cond_2
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    :goto_2
    move v8, v1

    .line 100
    goto :goto_4

    .line 101
    :goto_3
    const-string v5, "hookAllowForbidCardService failed: "

    .line 102
    .line 103
    invoke-static {v5, v4}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    :goto_4
    :try_start_1
    invoke-static {p0, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-nez v0, :cond_5

    .line 112
    .line 113
    goto/16 :goto_a

    .line 114
    .line 115
    :cond_5
    const-string v4, "com.tencent.mobileqq.profilecard.activity.FriendProfileCardActivity"

    .line 116
    .line 117
    const-string v5, "com.tencent.mobileqq.activity.FriendProfileCardActivity"

    .line 118
    .line 119
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    move v5, v1

    .line 124
    move v6, v5

    .line 125
    :goto_5
    const/4 v7, 0x2

    .line 126
    if-ge v5, v7, :cond_9

    .line 127
    .line 128
    aget-object v7, v4, v5

    .line 129
    .line 130
    invoke-static {p0, v7}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    if-nez v7, :cond_6

    .line 135
    .line 136
    goto :goto_8

    .line 137
    :cond_6
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    array-length v9, v7

    .line 142
    move v10, v1

    .line 143
    :goto_6
    if-ge v10, v9, :cond_8

    .line 144
    .line 145
    aget-object v11, v7, v10

    .line 146
    .line 147
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-nez v13, :cond_7

    .line 160
    .line 161
    array-length v13, v12

    .line 162
    if-ne v13, v2, :cond_7

    .line 163
    .line 164
    aget-object v12, v12, v1

    .line 165
    .line 166
    if-ne v12, v0, :cond_7

    .line 167
    .line 168
    new-instance v12, Le5;

    .line 169
    .line 170
    invoke-direct {v12, v3}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-static {v11, v12}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 174
    .line 175
    .line 176
    add-int/lit8 v6, v6, 0x1

    .line 177
    .line 178
    new-instance v12, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    const-string v13, "hooked allow forbid card activity: "

    .line 184
    .line 185
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-static {v11}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-static {v11}, Lv4;->C(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 200
    .line 201
    .line 202
    goto :goto_7

    .line 203
    :catchall_1
    move-exception v0

    .line 204
    goto :goto_9

    .line 205
    :cond_7
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_8
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_9
    move v1, v6

    .line 212
    goto :goto_a

    .line 213
    :goto_9
    const-string v2, "hookAllowForbidCardActivity failed: "

    .line 214
    .line 215
    invoke-static {v2, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    :goto_a
    add-int/2addr v8, v1

    .line 219
    const-string v0, "com.tencent.mobileqq.profilecard.processor.ProfileSecureProcessor"

    .line 220
    .line 221
    invoke-static {p0, v0}, Lg5;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    add-int/2addr v0, v8

    .line 226
    const-string v1, "com.tencent.mobileqq.profilecard.api.impl.ProfileProtocolServiceImpl"

    .line 227
    .line 228
    invoke-static {p0, v1}, Lg5;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    add-int/2addr p0, v0

    .line 233
    if-nez p0, :cond_a

    .line 234
    .line 235
    const-string v0, "allow forbid card data targets not found"

    .line 236
    .line 237
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :cond_a
    return p0

    .line 241
    :cond_b
    :goto_b
    return v1
.end method

.method public static b(Ljava/lang/ClassLoader;Ljava/lang/String;)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0, p1}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length v1, p0

    .line 14
    move v2, v0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v1, :cond_7

    .line 17
    .line 18
    aget-object v4, p0, v2

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    move v6, v0

    .line 25
    :goto_1
    array-length v7, v5

    .line 26
    if-ge v6, v7, :cond_4

    .line 27
    .line 28
    aget-object v7, v5, v6

    .line 29
    .line 30
    if-nez v7, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    const-string v8, "SummaryCard.RespHead"

    .line 38
    .line 39
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_5

    .line 44
    .line 45
    const-string v8, ".SummaryCard$RespHead"

    .line 46
    .line 47
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-nez v8, :cond_5

    .line 52
    .line 53
    const-string v8, ".SummaryCard.RespHead"

    .line 54
    .line 55
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    const-string v8, "SummaryCard"

    .line 63
    .line 64
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-eqz v8, :cond_3

    .line 69
    .line 70
    const-string v8, "RespHead"

    .line 71
    .line 72
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_3

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    goto :goto_4

    .line 84
    :cond_4
    const/4 v6, -0x1

    .line 85
    :cond_5
    :goto_3
    if-ltz v6, :cond_6

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_6

    .line 96
    .line 97
    new-instance v5, Lf5;

    .line 98
    .line 99
    invoke-direct {v5, v6}, Lf5;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v4, v5}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 103
    .line 104
    .line 105
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    new-instance v5, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v6, "hooked profile response sanitizer: "

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-static {v4}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-static {v4}, Lv4;->C(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    if-nez v3, :cond_8

    .line 135
    .line 136
    new-instance p0, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v1, "profile response sanitizer target not found: "

    .line 142
    .line 143
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    :cond_8
    return v3

    .line 157
    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v2, "hookProfileRespHeadSanitizer failed "

    .line 160
    .line 161
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p1, ": "

    .line 168
    .line 169
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return v0
.end method

.method public static c(Ljava/lang/Object;)V
    .locals 6

    .line 1
    const-string v0, "isForbidAccount"

    .line 2
    .line 3
    const-string v1, "forbidCode"

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-static {p0, v1, v2}, Lw4;->c(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {p0, v0}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v4, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v5, 0xc9

    .line 24
    .line 25
    if-eq v3, v5, :cond_1

    .line 26
    .line 27
    const/16 v5, 0xca

    .line 28
    .line 29
    if-eq v3, v5, :cond_1

    .line 30
    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :cond_1
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {p0, v0, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p0, v1, v0}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    const-string v0, "sanitizeForbidCard failed: "

    .line 49
    .line 50
    invoke-static {v0, p0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static d(Ljava/lang/Object;)V
    .locals 11

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    :try_start_0
    const-string v2, "iResult"

    .line 10
    .line 11
    const-string v3, "result"

    .line 12
    .line 13
    const-string v4, "resultCode"

    .line 14
    .line 15
    const-string v5, "ret"

    .line 16
    .line 17
    const-string v6, "retCode"

    .line 18
    .line 19
    const-string v7, "errCode"

    .line 20
    .line 21
    const-string v8, "errorCode"

    .line 22
    .line 23
    const-string v9, "code"

    .line 24
    .line 25
    filled-new-array/range {v2 .. v9}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x0

    .line 30
    move v4, v3

    .line 31
    move v5, v4

    .line 32
    :goto_0
    const/4 v6, 0x1

    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    if-ge v4, v7, :cond_3

    .line 36
    .line 37
    aget-object v7, v2, v4

    .line 38
    .line 39
    invoke-static {p0, v7, v3}, Lw4;->c(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    const/16 v8, 0xc9

    .line 44
    .line 45
    if-eq v7, v8, :cond_1

    .line 46
    .line 47
    const/16 v8, 0xca

    .line 48
    .line 49
    if-ne v7, v8, :cond_2

    .line 50
    .line 51
    :cond_1
    move v5, v6

    .line 52
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-static {p0, v0}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    const-string v8, "message"

    .line 60
    .line 61
    if-nez v4, :cond_4

    .line 62
    .line 63
    :try_start_1
    invoke-static {p0, v8}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :cond_4
    const-string v9, "errMsg"

    .line 68
    .line 69
    if-nez v4, :cond_5

    .line 70
    .line 71
    :try_start_2
    invoke-static {p0, v9}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    :cond_5
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const-string v10, "\u8d26\u53f7\u72b6\u6001\u5f02\u5e38"

    .line 80
    .line 81
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-nez v10, :cond_6

    .line 86
    .line 87
    const-string v10, "\u591a\u4eba\u4e3e\u62a5"

    .line 88
    .line 89
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-nez v10, :cond_6

    .line 94
    .line 95
    const-string v10, "\u8fdd\u89c4\u884c\u4e3a"

    .line 96
    .line 97
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-eqz v10, :cond_7

    .line 102
    .line 103
    :cond_6
    const-string v10, "\u8d44\u6599\u5361"

    .line 104
    .line 105
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-nez v10, :cond_8

    .line 110
    .line 111
    const-string v10, "\u67e5\u770b\u8d44\u6599"

    .line 112
    .line 113
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-nez v10, :cond_8

    .line 118
    .line 119
    const-string v10, "\u6682\u4e0d\u652f\u6301"

    .line 120
    .line 121
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_7

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_7
    move v4, v3

    .line 129
    goto :goto_2

    .line 130
    :cond_8
    :goto_1
    move v4, v6

    .line 131
    :goto_2
    if-nez v4, :cond_9

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_9
    move v5, v6

    .line 135
    :goto_3
    if-eqz v5, :cond_b

    .line 136
    .line 137
    move v4, v3

    .line 138
    :goto_4
    if-ge v4, v7, :cond_a

    .line 139
    .line 140
    aget-object v5, v2, v4

    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-static {p0, v5, v6}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_a
    invoke-static {p0, v0, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-static {p0, v8, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-static {p0, v9, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 159
    .line 160
    .line 161
    :cond_b
    :goto_5
    return-void

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    move-object p0, v0

    .line 164
    const-string v0, "sanitizeRespHead failed: "

    .line 165
    .line 166
    invoke-static {v0, p0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method
