.class public abstract Li9;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static volatile b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "com.tencent.mobileqq.troop.file.api.TroopFileApiImpl"

    .line 2
    .line 3
    const-string v1, "com.tencent.mobileqq.troop.file.TroopFileApiImpl"

    .line 4
    .line 5
    const-string v2, "com.tencent.mobileqq.troop.file.api.impl.TroopFileApiImpl"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Li9;->a:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public static a(Ljava/lang/Class;)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    array-length v4, v0

    .line 9
    if-ge v2, v4, :cond_7

    .line 10
    .line 11
    aget-object v4, v0, v2

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    :try_start_0
    const-string v6, "shouldJumpComposeTroopFile"

    .line 30
    .line 31
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    if-ne v6, v7, :cond_1

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    array-length v9, v6

    .line 51
    const/4 v10, 0x2

    .line 52
    if-ne v9, v10, :cond_1

    .line 53
    .line 54
    const-class v9, Landroid/app/Activity;

    .line 55
    .line 56
    aget-object v10, v6, v1

    .line 57
    .line 58
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_1

    .line 63
    .line 64
    const-class v9, Landroid/content/Intent;

    .line 65
    .line 66
    aget-object v6, v6, v8

    .line 67
    .line 68
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    invoke-virtual {v4, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 75
    .line 76
    .line 77
    new-instance v6, Lg9;

    .line 78
    .line 79
    invoke-direct {v6, v1, v4}, Lg9;-><init>(ZLjava/lang/reflect/Method;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v4, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 83
    .line 84
    .line 85
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :catchall_0
    move-exception v4

    .line 90
    goto :goto_4

    .line 91
    :cond_1
    const-string v6, "disableComposeTroopFile"

    .line 92
    .line 93
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_3

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    if-ne v6, v7, :cond_2

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    array-length v6, v6

    .line 110
    if-nez v6, :cond_2

    .line 111
    .line 112
    move v6, v8

    .line 113
    goto :goto_2

    .line 114
    :cond_2
    move v6, v1

    .line 115
    :goto_2
    if-eqz v6, :cond_3

    .line 116
    .line 117
    invoke-virtual {v4, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 118
    .line 119
    .line 120
    new-instance v6, Lg9;

    .line 121
    .line 122
    invoke-direct {v6, v8, v4}, Lg9;-><init>(ZLjava/lang/reflect/Method;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v4, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    const-string v6, "isInExpComposeTroopFileB"

    .line 130
    .line 131
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    if-ne v6, v7, :cond_4

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    array-length v6, v6

    .line 148
    if-nez v6, :cond_4

    .line 149
    .line 150
    move v6, v8

    .line 151
    goto :goto_3

    .line 152
    :cond_4
    move v6, v1

    .line 153
    :goto_3
    if-eqz v6, :cond_5

    .line 154
    .line 155
    invoke-virtual {v4, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 156
    .line 157
    .line 158
    new-instance v6, Lg9;

    .line 159
    .line 160
    invoke-direct {v6, v1, v4}, Lg9;-><init>(ZLjava/lang/reflect/Method;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v4, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_5
    const-string v6, "openTroopFileMainPage"

    .line 168
    .line 169
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_6

    .line 174
    .line 175
    invoke-virtual {v4, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 176
    .line 177
    .line 178
    new-instance v6, Lh9;

    .line 179
    .line 180
    invoke-direct {v6, v4}, Lh9;-><init>(Ljava/lang/reflect/Method;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v4, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :goto_4
    new-instance v6, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v7, "legacy group file layout hook failed method="

    .line 190
    .line 191
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v7, "#"

    .line 202
    .line 203
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v5, ": "

    .line 210
    .line 211
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :cond_6
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_7
    return v3
.end method

.method public static declared-synchronized b(Ljava/lang/ClassLoader;)I
    .locals 5

    .line 1
    const-class v0, Li9;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Li9;->b:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    sget-object v1, Li9;->a:[Ljava/lang/String;

    .line 13
    .line 14
    move v3, v2

    .line 15
    :goto_0
    const/4 v4, 0x3

    .line 16
    if-ge v2, v4, :cond_2

    .line 17
    .line 18
    aget-object v4, v1, v2

    .line 19
    .line 20
    invoke-static {p0, v4}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-static {v4}, Li9;->a(Ljava/lang/Class;)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    add-int/2addr v3, v4

    .line 32
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_3

    .line 37
    :cond_2
    if-lez v3, :cond_3

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    sput-boolean p0, Li9;->b:Z

    .line 41
    .line 42
    new-instance p0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v1, "legacy group file layout hook installed count="

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :cond_3
    monitor-exit v0

    .line 63
    return v3

    .line 64
    :cond_4
    :goto_2
    monitor-exit v0

    .line 65
    return v2

    .line 66
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw p0
.end method
