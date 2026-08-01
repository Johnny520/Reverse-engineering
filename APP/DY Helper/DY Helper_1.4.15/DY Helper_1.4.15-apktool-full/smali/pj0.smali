.class public final Lpj0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static volatile γ:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lpj0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lpj0;->β:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    return-void
.end method

.method public static final α()V
    .locals 10

    .line 1
    sget-object v0, Lpj0;->γ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_7

    .line 6
    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :try_start_0
    const-string v2, "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54725154BE834FA3D709B9E75880CCD23C93866D"

    .line 9
    .line 10
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v2, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    array-length v2, v0

    .line 27
    move v4, v3

    .line 28
    :goto_0
    if-ge v4, v2, :cond_2

    .line 29
    .line 30
    aget-object v5, v0, v4

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-string v7, "getBottomTabAbility"

    .line 37
    .line 38
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    array-length v6, v6

    .line 52
    if-nez v6, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_5

    .line 57
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v5, v1

    .line 61
    :goto_1
    if-nez v5, :cond_3

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_3
    const/4 v0, 0x1

    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    array-length v5, v4

    .line 87
    move v6, v3

    .line 88
    :goto_2
    if-ge v6, v5, :cond_6

    .line 89
    .line 90
    aget-object v7, v4, v6

    .line 91
    .line 92
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    const-string v9, "LLILIL"

    .line 97
    .line 98
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_5

    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    array-length v8, v8

    .line 109
    const/4 v9, 0x3

    .line 110
    if-ne v8, v9, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    move-object v7, v1

    .line 117
    :goto_3
    if-nez v7, :cond_7

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    invoke-virtual {v7, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 121
    .line 122
    .line 123
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v3, "homepage_notification"

    .line 128
    .line 129
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v7, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :goto_4
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :goto_5
    new-instance v2, Leo1;

    .line 142
    .line 143
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    move-object v0, v2

    .line 147
    :goto_6
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    invoke-static {v0}, Lpj0;->ε(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v2, "hideHomeNotificationBadge \u5931\u8d25: "

    .line 162
    .line 163
    invoke-static {v2, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const/4 v2, 0x4

    .line 168
    const-string v3, "DYHelper"

    .line 169
    .line 170
    invoke-static {v3, v0, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    :goto_7
    return-void
.end method

.method public static final β()Z
    .locals 7

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :try_start_0
    const-string v2, "android.app.ActivityThread"

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "currentApplication"

    .line 17
    .line 18
    invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    instance-of v3, v2, Landroid/app/Application;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    check-cast v2, Landroid/app/Application;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v0

    .line 39
    goto :goto_1

    .line 40
    :goto_0
    new-instance v3, Leo1;

    .line 41
    .line 42
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v2, v3

    .line 46
    :goto_1
    instance-of v3, v2, Leo1;

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object v0, v2

    .line 52
    :goto_2
    check-cast v0, Landroid/app/Application;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_3
    const-string v0, "im_dnd_enabled"

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    move v1, v2

    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_4
    const-string v0, "im_dnd_filter_mode"

    .line 72
    .line 73
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 78
    .line 79
    .line 80
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    goto :goto_4

    .line 82
    :catchall_1
    move v0, v2

    .line 83
    :goto_4
    if-nez v0, :cond_5

    .line 84
    .line 85
    goto/16 :goto_9

    .line 86
    .line 87
    :cond_5
    const-string v3, "im_dnd_include_interactive"

    .line 88
    .line 89
    invoke-static {v3, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :cond_6
    :try_start_2
    invoke-static {}, Lpj0;->γ()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_7

    .line 106
    .line 107
    goto :goto_7

    .line 108
    :cond_7
    sget-object v4, Lck0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 109
    .line 110
    const-string v4, "im_dnd_filter_rules"

    .line 111
    .line 112
    const-string v5, ""

    .line 113
    .line 114
    invoke-static {v4, v5}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-static {v4}, Lck0;->ζ(Ljava/lang/String;)Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_8

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_8
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_9

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_d

    .line 145
    .line 146
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    if-eq v0, v1, :cond_c

    .line 151
    .line 152
    const/4 v6, 0x2

    .line 153
    if-eq v0, v6, :cond_b

    .line 154
    .line 155
    move v5, v1

    .line 156
    goto :goto_5

    .line 157
    :cond_b
    invoke-static {v5, v4}, Lck0;->ε(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    goto :goto_5

    .line 162
    :cond_c
    invoke-static {v5, v4}, Lck0;->ε(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    :goto_5
    if-nez v5, :cond_a

    .line 167
    .line 168
    move v1, v2

    .line 169
    :cond_d
    :goto_6
    move v2, v1

    .line 170
    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 171
    .line 172
    .line 173
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 174
    goto :goto_8

    .line 175
    :catchall_2
    move-exception v0

    .line 176
    new-instance v1, Leo1;

    .line 177
    .line 178
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    move-object v0, v1

    .line 182
    :goto_8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 183
    .line 184
    instance-of v2, v0, Leo1;

    .line 185
    .line 186
    if-eqz v2, :cond_e

    .line 187
    .line 188
    move-object v0, v1

    .line 189
    :cond_e
    check-cast v0, Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    :goto_9
    return v1
.end method

.method public static γ()Ljava/util/List;
    .locals 9

    .line 1
    sget-object v0, Ljz;->ε:Ljz;

    .line 2
    .line 3
    sget-object v1, Lpj0;->γ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_7

    .line 8
    .line 9
    :cond_0
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    const-string v4, "~797C580CB4D77E9FE92654AA8516CA258B49B9B5B3DD68E869FD36B1F6444E46E8F45D24730D5ADFB354C76FE18BD6F86DAE687744FDDD0787F5"

    .line 12
    .line 13
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v4, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    array-length v4, v1

    .line 29
    move v5, v2

    .line 30
    :goto_0
    if-ge v5, v4, :cond_2

    .line 31
    .line 32
    aget-object v6, v1, v5

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    const-string v8, "LIZ"

    .line 39
    .line 40
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_1

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    array-length v7, v7

    .line 54
    if-nez v7, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v6, v3

    .line 61
    :goto_1
    if-nez v6, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-virtual {v6, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    goto :goto_3

    .line 69
    :catchall_0
    :goto_2
    move-object v1, v3

    .line 70
    :goto_3
    if-nez v1, :cond_4

    .line 71
    .line 72
    goto :goto_7

    .line 73
    :cond_4
    const-string v4, "getAllConversation"

    .line 74
    .line 75
    const-string v5, "getConversationList"

    .line 76
    .line 77
    const-string v6, "getAllConversationSync"

    .line 78
    .line 79
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    :goto_4
    const/4 v5, 0x3

    .line 84
    if-ge v2, v5, :cond_7

    .line 85
    .line 86
    aget-object v5, v4, v2

    .line 87
    .line 88
    :try_start_1
    invoke-static {v1, v5}, Lpj0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    goto :goto_5

    .line 93
    :catchall_1
    move-exception v5

    .line 94
    new-instance v6, Leo1;

    .line 95
    .line 96
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    move-object v5, v6

    .line 100
    :goto_5
    instance-of v6, v5, Leo1;

    .line 101
    .line 102
    if-eqz v6, :cond_5

    .line 103
    .line 104
    move-object v5, v3

    .line 105
    :cond_5
    instance-of v6, v5, Ljava/lang/Iterable;

    .line 106
    .line 107
    if-eqz v6, :cond_6

    .line 108
    .line 109
    check-cast v5, Ljava/lang/Iterable;

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    move-object v5, v3

    .line 116
    :goto_6
    if-nez v5, :cond_8

    .line 117
    .line 118
    :goto_7
    return-object v0

    .line 119
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :cond_9
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_a

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-eqz v2, :cond_9

    .line 139
    .line 140
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :cond_b
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_e

    .line 158
    .line 159
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const-string v4, "getUnreadCount"

    .line 164
    .line 165
    invoke-static {v2, v4}, Lpj0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    instance-of v5, v4, Ljava/lang/Number;

    .line 170
    .line 171
    if-eqz v5, :cond_c

    .line 172
    .line 173
    check-cast v4, Ljava/lang/Number;

    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_c
    move-object v4, v3

    .line 177
    :goto_a
    const-wide/16 v5, 0x0

    .line 178
    .line 179
    if-eqz v4, :cond_d

    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 182
    .line 183
    .line 184
    move-result-wide v7

    .line 185
    goto :goto_b

    .line 186
    :cond_d
    move-wide v7, v5

    .line 187
    :goto_b
    cmp-long v4, v7, v5

    .line 188
    .line 189
    if-lez v4, :cond_b

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_9

    .line 195
    :cond_e
    return-object v1
.end method

.method public static δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v2, :cond_2

    .line 19
    .line 20
    aget-object v4, v1, v3

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {v5, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    array-length v5, v5

    .line 40
    if-nez v5, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v4, v0

    .line 47
    :goto_1
    if-nez v4, :cond_3

    .line 48
    .line 49
    :goto_2
    return-object v0

    .line 50
    :cond_3
    const/4 p1, 0x1

    .line 51
    invoke-virtual {v4, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static ε(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    :goto_0
    instance-of v0, p0, Ljava/lang/reflect/InvocationTargetException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object p0
.end method
