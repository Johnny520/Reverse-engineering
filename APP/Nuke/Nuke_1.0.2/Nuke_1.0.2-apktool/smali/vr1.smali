.class public abstract Lvr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;


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
    sput-object v0, Lvr1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static a()Lo70;
    .locals 9

    .line 1
    new-instance v0, Lo70;

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lmg;->l0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move-object v1, v2

    .line 19
    move-object v3, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v3, v2

    .line 22
    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-string v5, "."

    .line 30
    .line 31
    const/4 v6, 0x6

    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-static {v4, v5, v7, v7, v6}, Lpv2;->q0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/4 v6, -0x1

    .line 38
    if-ne v5, v6, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v4, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :goto_1
    invoke-static {v4}, Lwv2;->e0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move v4, v2

    .line 57
    :goto_2
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 58
    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    move-object v5, v3

    .line 62
    :cond_3
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 63
    .line 64
    if-nez v6, :cond_4

    .line 65
    .line 66
    move-object v8, v5

    .line 67
    move-object v5, v3

    .line 68
    move v3, v4

    .line 69
    move-object v4, v8

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    move v3, v4

    .line 72
    move-object v4, v5

    .line 73
    move-object v5, v6

    .line 74
    :goto_3
    invoke-direct/range {v0 .. v5}, Lo70;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method

.method public static b(Lvu0;)Ljava/lang/String;
    .locals 14

    .line 1
    sget-object v0, Lvu0;->i:Lvu0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Led3;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    sget-object v0, Led3;->a:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v1, "last_login_nick_name"

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, Lpp1;->a:Lpp1;

    .line 23
    .line 24
    new-instance v1, Lx83;

    .line 25
    .line 26
    new-instance v2, Lt22;

    .line 27
    .line 28
    const-wide/16 v10, 0x0

    .line 29
    .line 30
    const-wide/16 v12, 0x0

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const-string v9, ""

    .line 34
    .line 35
    move-object v7, v2

    .line 36
    invoke-direct/range {v7 .. v13}, Lt22;-><init>(ZLjava/lang/String;JJ)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lvr1;->a()Lo70;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {p0}, Lpp0;->m(Lvu0;)Lnu0;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    sget-object v11, Led3;->b:Ljava/lang/String;

    .line 52
    .line 53
    const/16 v12, 0xc0

    .line 54
    .line 55
    const/4 v13, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    invoke-direct/range {v1 .. v13}, Lx83;-><init>(Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILc50;)V

    .line 59
    .line 60
    .line 61
    sput-object v1, Lpp1;->c:Lx83;

    .line 62
    .line 63
    return-object v5

    .line 64
    :cond_0
    sget-object v0, Lvu0;->h:Lvu0;

    .line 65
    .line 66
    if-ne p0, v0, :cond_1

    .line 67
    .line 68
    sget-object v0, Lpp1;->a:Lpp1;

    .line 69
    .line 70
    new-instance v1, Lx83;

    .line 71
    .line 72
    new-instance v2, Lt22;

    .line 73
    .line 74
    const-wide/16 v5, 0x0

    .line 75
    .line 76
    const-wide/16 v7, 0x0

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    const-string v4, ""

    .line 80
    .line 81
    invoke-direct/range {v2 .. v8}, Lt22;-><init>(ZLjava/lang/String;JJ)V

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lvr1;->a()Lo70;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {p0}, Lpp0;->m(Lvu0;)Lnu0;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v7

    .line 96
    const/16 v12, 0xc0

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const-string v5, "2968447202"

    .line 100
    .line 101
    const-string v6, "kyousuke"

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    const/4 v10, 0x0

    .line 105
    const-string v11, ""

    .line 106
    .line 107
    invoke-direct/range {v1 .. v13}, Lx83;-><init>(Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILc50;)V

    .line 108
    .line 109
    .line 110
    sput-object v1, Lpp1;->c:Lx83;

    .line 111
    .line 112
    const-string p0, "2968447202"

    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_1
    const-string v0, "Invalid hostType: "

    .line 116
    .line 117
    invoke-static {v0, p0}, Lc80;->A(Ljava/lang/String;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const/4 p0, 0x0

    .line 121
    return-object p0
.end method

.method public static c(Ljava/lang/String;Lvu0;)V
    .locals 9

    .line 1
    const-string v0, "[NukeCore]"

    .line 2
    .line 3
    const-string v1, "Nuke server sync failed after feature install: "

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    if-eq v2, v3, :cond_1

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    if-ne v2, v4, :cond_0

    .line 16
    .line 17
    const-string v2, "TIKTOK"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Lc80;->s()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string v2, "WECHAT"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    const-string v2, "QQ"

    .line 28
    .line 29
    :goto_0
    invoke-static {p0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x4

    .line 34
    const-string v6, "NukeCore"

    .line 35
    .line 36
    sget-object v7, La83;->a:La83;

    .line 37
    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    :try_start_0
    const-string p0, "[NukeCore]Skip Nuke server sync: empty user id"

    .line 41
    .line 42
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    new-instance v7, Lx92;

    .line 48
    .line 49
    invoke-direct {v7, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    instance-of p0, v7, Lx92;

    .line 53
    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    const-string p0, "Skip Nuke server sync: empty user id"

    .line 57
    .line 58
    invoke-static {v5, v6, p0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    sget-object v4, Lvr1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    invoke-virtual {v4, v8, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_5

    .line 70
    .line 71
    :try_start_1
    const-string p0, "[NukeCore]Skip Nuke server sync: already running"

    .line 72
    .line 73
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :catchall_1
    move-exception p0

    .line 78
    new-instance v7, Lx92;

    .line 79
    .line 80
    invoke-direct {v7, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :goto_2
    instance-of p0, v7, Lx92;

    .line 84
    .line 85
    if-eqz p0, :cond_4

    .line 86
    .line 87
    const-string p0, "Skip Nuke server sync: already running"

    .line 88
    .line 89
    invoke-static {v5, v6, p0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_4
    :goto_3
    return-void

    .line 93
    :cond_5
    :try_start_2
    invoke-static {p0, v2, p1}, Lvr1;->d(Ljava/lang/String;Ljava/lang/String;Lvu0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 94
    .line 95
    .line 96
    move-object p1, v7

    .line 97
    goto :goto_4

    .line 98
    :catchall_2
    move-exception p0

    .line 99
    :try_start_3
    new-instance p1, Lx92;

    .line 100
    .line 101
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :goto_4
    invoke-static {p1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-eqz p0, :cond_6

    .line 109
    .line 110
    invoke-static {p0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 122
    :try_start_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :catchall_3
    move-exception p1

    .line 139
    :try_start_5
    new-instance v7, Lx92;

    .line 140
    .line 141
    invoke-direct {v7, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    :goto_5
    instance-of p1, v7, Lx92;

    .line 145
    .line 146
    if-eqz p1, :cond_6

    .line 147
    .line 148
    const/4 p1, 0x6

    .line 149
    invoke-static {p1, v6, p0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :catchall_4
    move-exception p0

    .line 154
    goto :goto_7

    .line 155
    :cond_6
    :goto_6
    invoke-virtual {v4, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :goto_7
    invoke-virtual {v4, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 160
    .line 161
    .line 162
    throw p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Lvu0;)V
    .locals 33

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    sget-object v0, Lnuke/data/cipher/NativeCrypto;->INSTANCE:Lnuke/data/cipher/NativeCrypto;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnuke/data/cipher/NativeCrypto;->isConfigured()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x4

    .line 10
    sget-object v3, La83;->a:La83;

    .line 11
    .line 12
    const-string v4, "NukeCore"

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    const-string v0, "[NukeCore]Skip Nuke server sync: native client secrets are not configured"

    .line 17
    .line 18
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    new-instance v3, Lx92;

    .line 24
    .line 25
    invoke-direct {v3, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    instance-of v0, v3, Lx92;

    .line 29
    .line 30
    if-eqz v0, :cond_1c

    .line 31
    .line 32
    const-string v0, "Skip Nuke server sync: native client secrets are not configured"

    .line 33
    .line 34
    invoke-static {v2, v4, v0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    goto/16 :goto_16

    .line 38
    .line 39
    :cond_0
    const-string v0, "WECHAT"

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    sget-object v0, Led3;->a:Landroid/content/SharedPreferences;

    .line 48
    .line 49
    const-string v5, "last_login_nick_name"

    .line 50
    .line 51
    const-string v6, ""

    .line 52
    .line 53
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v5, Led3;->c:Ljava/lang/String;

    .line 61
    .line 62
    const-string v6, "/"

    .line 63
    .line 64
    const-string v7, ", module=1.0.2(release), buildTime=1785243782422"

    .line 65
    .line 66
    const-string v8, "Nuke onLogin: "

    .line 67
    .line 68
    invoke-static {v8, v0, v6, v5, v7}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :goto_1
    move-object v5, v0

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    const-string v0, "Nuke onLogin"

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    new-instance v6, Lot;

    .line 78
    .line 79
    new-instance v7, Le41;

    .line 80
    .line 81
    invoke-direct {v7}, Le41;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v8, Le41;

    .line 85
    .line 86
    invoke-direct {v8}, Le41;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v0, "mode"

    .line 90
    .line 91
    const-string v9, "in_process"

    .line 92
    .line 93
    invoke-virtual {v8, v0, v9}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v9, "sdk"

    .line 103
    .line 104
    invoke-virtual {v8, v9, v0}, Le41;->c(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 105
    .line 106
    .line 107
    const-string v0, "release"

    .line 108
    .line 109
    sget-object v9, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v8, v0, v9}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Ljava/io/File;

    .line 115
    .line 116
    const-string v9, "/sys/fs/selinux"

    .line 117
    .line 118
    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-string v10, "available"

    .line 130
    .line 131
    invoke-virtual {v8, v10, v0}, Le41;->b(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 132
    .line 133
    .line 134
    const-string v0, "isSELinuxEnabled"

    .line 135
    .line 136
    invoke-static {v0}, Ls11;->h0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_2

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    goto :goto_3

    .line 147
    :cond_2
    new-instance v0, Ljava/io/File;

    .line 148
    .line 149
    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const-string v9, "enabled"

    .line 161
    .line 162
    invoke-virtual {v8, v9, v0}, Le41;->b(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 163
    .line 164
    .line 165
    const-string v0, "isSELinuxEnforced"

    .line 166
    .line 167
    invoke-static {v0}, Ls11;->h0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v10, 0x1

    .line 173
    const/4 v11, 0x0

    .line 174
    if-nez v0, :cond_5

    .line 175
    .line 176
    const-string v0, "/sys/fs/selinux/enforce"

    .line 177
    .line 178
    invoke-static {v0}, Ls11;->f0(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_4

    .line 183
    .line 184
    invoke-static {v0}, Lwv2;->e0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    if-eqz v0, :cond_4

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-ne v0, v10, :cond_3

    .line 195
    .line 196
    move v0, v10

    .line 197
    goto :goto_4

    .line 198
    :cond_3
    move v0, v9

    .line 199
    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    goto :goto_5

    .line 204
    :cond_4
    move-object v0, v11

    .line 205
    :cond_5
    :goto_5
    const-string v12, "enforced"

    .line 206
    .line 207
    invoke-virtual {v8, v12, v0}, Le41;->b(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 208
    .line 209
    .line 210
    const-string v0, "getContext"

    .line 211
    .line 212
    :try_start_1
    invoke-static {}, Ls11;->i0()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    if-eqz v12, :cond_6

    .line 217
    .line 218
    invoke-virtual {v12, v0, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-eqz v0, :cond_6

    .line 223
    .line 224
    invoke-virtual {v0, v11, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_6

    .line 229
    :catchall_1
    move-exception v0

    .line 230
    goto :goto_7

    .line 231
    :cond_6
    move-object v0, v11

    .line 232
    :goto_6
    instance-of v12, v0, Ljava/lang/String;

    .line 233
    .line 234
    if-eqz v12, :cond_7

    .line 235
    .line 236
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_7
    move-object v0, v11

    .line 240
    goto :goto_8

    .line 241
    :goto_7
    new-instance v12, Lx92;

    .line 242
    .line 243
    invoke-direct {v12, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    move-object v0, v12

    .line 247
    :goto_8
    nop

    .line 248
    instance-of v12, v0, Lx92;

    .line 249
    .line 250
    if-eqz v12, :cond_8

    .line 251
    .line 252
    move-object v0, v11

    .line 253
    :cond_8
    check-cast v0, Ljava/lang/String;

    .line 254
    .line 255
    if-eqz v0, :cond_9

    .line 256
    .line 257
    invoke-static {v0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    goto :goto_9

    .line 266
    :cond_9
    move-object v0, v11

    .line 267
    :goto_9
    if-nez v0, :cond_a

    .line 268
    .line 269
    invoke-static {}, Landroid/system/Os;->gettid()I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    new-instance v12, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-string v13, "/proc/self/task/"

    .line 276
    .line 277
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v0, "/attr/current"

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v0}, Ls11;->f0(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :cond_a
    const-string v12, "context"

    .line 297
    .line 298
    invoke-virtual {v8, v12, v0}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {}, Landroid/system/Os;->getpid()I

    .line 311
    .line 312
    .line 313
    move-result v12

    .line 314
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object v12

    .line 318
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    const-string v13, "getPidContext"

    .line 323
    .line 324
    invoke-static {v13, v0, v12}, Ls11;->j0(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-nez v0, :cond_b

    .line 329
    .line 330
    const-string v0, "/proc/self/attr/current"

    .line 331
    .line 332
    invoke-static {v0}, Ls11;->f0(Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    :cond_b
    const-string v12, "pidContext"

    .line 337
    .line 338
    invoke-virtual {v8, v12, v0}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const-class v0, Ljava/lang/String;

    .line 342
    .line 343
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    const-string v12, "/proc/self"

    .line 348
    .line 349
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v12

    .line 353
    const-string v13, "getFileContext"

    .line 354
    .line 355
    invoke-static {v13, v0, v12}, Ls11;->j0(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    const-string v12, "procContext"

    .line 360
    .line 361
    invoke-virtual {v8, v12, v0}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    :try_start_2
    new-instance v0, Ljava/io/File;

    .line 365
    .line 366
    const-string v12, "/sys/fs/selinux/status"

    .line 367
    .line 368
    invoke-direct {v0, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-static {v0}, Lwi0;->e0(Ljava/io/File;)[B

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    array-length v12, v0

    .line 376
    const/16 v13, 0x14

    .line 377
    .line 378
    if-ge v12, v13, :cond_c

    .line 379
    .line 380
    move-object v12, v11

    .line 381
    goto :goto_a

    .line 382
    :cond_c
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 387
    .line 388
    .line 389
    move-result-object v12

    .line 390
    invoke-virtual {v0, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    new-instance v12, Le41;

    .line 395
    .line 396
    invoke-direct {v12}, Le41;-><init>()V

    .line 397
    .line 398
    .line 399
    const-string v13, "version"

    .line 400
    .line 401
    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 402
    .line 403
    .line 404
    move-result v14

    .line 405
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v14

    .line 409
    invoke-virtual {v12, v13, v14}, Le41;->c(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 410
    .line 411
    .line 412
    const-string v13, "sequence"

    .line 413
    .line 414
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-virtual {v12, v13, v2}, Le41;->c(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 423
    .line 424
    .line 425
    const-string v2, "enforcing"

    .line 426
    .line 427
    const/16 v13, 0x8

    .line 428
    .line 429
    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 430
    .line 431
    .line 432
    move-result v13

    .line 433
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v13

    .line 437
    invoke-virtual {v12, v2, v13}, Le41;->c(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 438
    .line 439
    .line 440
    const-string v2, "policyload"

    .line 441
    .line 442
    const/16 v13, 0xc

    .line 443
    .line 444
    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 445
    .line 446
    .line 447
    move-result v13

    .line 448
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v13

    .line 452
    invoke-virtual {v12, v2, v13}, Le41;->c(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 453
    .line 454
    .line 455
    const-string v2, "denyUnknown"

    .line 456
    .line 457
    const/16 v13, 0x10

    .line 458
    .line 459
    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {v12, v2, v0}, Le41;->c(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 468
    .line 469
    .line 470
    goto :goto_a

    .line 471
    :catchall_2
    move-exception v0

    .line 472
    new-instance v12, Lx92;

    .line 473
    .line 474
    invoke-direct {v12, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 475
    .line 476
    .line 477
    :goto_a
    instance-of v0, v12, Lx92;

    .line 478
    .line 479
    if-eqz v0, :cond_d

    .line 480
    .line 481
    move-object v12, v11

    .line 482
    :cond_d
    check-cast v12, Le41;

    .line 483
    .line 484
    iget-object v0, v8, Le41;->h:Lmb1;

    .line 485
    .line 486
    if-eqz v12, :cond_e

    .line 487
    .line 488
    const-string v2, "status"

    .line 489
    .line 490
    invoke-virtual {v0, v2, v12}, Lmb1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    :cond_e
    new-instance v2, Le41;

    .line 494
    .line 495
    invoke-direct {v2}, Le41;-><init>()V

    .line 496
    .line 497
    .line 498
    new-instance v12, La31;

    .line 499
    .line 500
    invoke-direct {v12}, La31;-><init>()V

    .line 501
    .line 502
    .line 503
    const-string v13, "execmem"

    .line 504
    .line 505
    const-string v14, "u:r:system_server:s0"

    .line 506
    .line 507
    const-string v15, "process"

    .line 508
    .line 509
    invoke-static {v14, v14, v15, v13}, Ls11;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;

    .line 510
    .line 511
    .line 512
    move-result-object v13

    .line 513
    const-string v9, "system_server_execmem"

    .line 514
    .line 515
    invoke-static {v2, v12, v9, v13}, Ls11;->z(Le41;La31;Ljava/lang/String;Lw80;)V

    .line 516
    .line 517
    .line 518
    const-string v9, "u:r:su:s0"

    .line 519
    .line 520
    const-string v13, "transition"

    .line 521
    .line 522
    const-string v11, "u:r:shell:s0"

    .line 523
    .line 524
    invoke-static {v11, v9, v15, v13}, Ls11;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;

    .line 525
    .line 526
    .line 527
    move-result-object v9

    .line 528
    const-string v11, "aosp_su_transition"

    .line 529
    .line 530
    invoke-static {v2, v12, v11, v9}, Ls11;->z(Le41;La31;Ljava/lang/String;Lw80;)V

    .line 531
    .line 532
    .line 533
    const-string v9, "u:r:adbroot:s0"

    .line 534
    .line 535
    invoke-static {v9}, Ls11;->C(Ljava/lang/String;)Lw80;

    .line 536
    .line 537
    .line 538
    move-result-object v9

    .line 539
    const-string v11, "adbroot_context"

    .line 540
    .line 541
    invoke-static {v2, v12, v11, v9}, Ls11;->z(Le41;La31;Ljava/lang/String;Lw80;)V

    .line 542
    .line 543
    .line 544
    const-string v9, "u:r:magisk:s0"

    .line 545
    .line 546
    invoke-static {v9}, Ls11;->C(Ljava/lang/String;)Lw80;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    const-string v11, "u:object_r:magisk_file:s0"

    .line 551
    .line 552
    invoke-static {v11}, Ls11;->C(Ljava/lang/String;)Lw80;

    .line 553
    .line 554
    .line 555
    move-result-object v11

    .line 556
    const-string v13, "filesystem"

    .line 557
    .line 558
    const-string v15, "associate"

    .line 559
    .line 560
    const-string v10, "u:object_r:rootfs:s0"

    .line 561
    .line 562
    move-object/from16 v31, v3

    .line 563
    .line 564
    const-string v3, "u:object_r:tmpfs:s0"

    .line 565
    .line 566
    invoke-static {v10, v3, v13, v15}, Ls11;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;

    .line 567
    .line 568
    .line 569
    move-result-object v10

    .line 570
    const-string v13, "fifo_file"

    .line 571
    .line 572
    const-string v15, "open"

    .line 573
    .line 574
    move-object/from16 v32, v4

    .line 575
    .line 576
    const-string v4, "u:r:kernel:s0"

    .line 577
    .line 578
    invoke-static {v4, v3, v13, v15}, Ls11;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    filled-new-array {v9, v11, v10, v3}, [Lw80;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    invoke-static {v3}, Ls11;->u([Lw80;)Lw80;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    const-string v9, "magisk_context"

    .line 591
    .line 592
    invoke-static {v2, v12, v9, v3}, Ls11;->z(Le41;La31;Ljava/lang/String;Lw80;)V

    .line 593
    .line 594
    .line 595
    const-string v3, "u:r:ksu:s0"

    .line 596
    .line 597
    invoke-static {v3}, Ls11;->C(Ljava/lang/String;)Lw80;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    const-string v9, "u:object_r:ksu_file:s0"

    .line 602
    .line 603
    invoke-static {v9}, Ls11;->C(Ljava/lang/String;)Lw80;

    .line 604
    .line 605
    .line 606
    move-result-object v9

    .line 607
    const-string v10, "read"

    .line 608
    .line 609
    const-string v11, "u:object_r:adb_data_file:s0"

    .line 610
    .line 611
    const-string v13, "file"

    .line 612
    .line 613
    invoke-static {v4, v11, v13, v10}, Ls11;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    filled-new-array {v3, v9, v4}, [Lw80;

    .line 618
    .line 619
    .line 620
    move-result-object v3

    .line 621
    invoke-static {v3}, Ls11;->u([Lw80;)Lw80;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    const-string v4, "kernelsu_context"

    .line 626
    .line 627
    invoke-static {v2, v12, v4, v3}, Ls11;->z(Le41;La31;Ljava/lang/String;Lw80;)V

    .line 628
    .line 629
    .line 630
    const-string v3, "u:object_r:lsposed_file:s0"

    .line 631
    .line 632
    invoke-static {v3}, Ls11;->C(Ljava/lang/String;)Lw80;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    const-string v4, "u:object_r:apk_data_file:s0"

    .line 637
    .line 638
    const-string v9, "execute"

    .line 639
    .line 640
    invoke-static {v14, v4, v13, v9}, Ls11;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;

    .line 641
    .line 642
    .line 643
    move-result-object v4

    .line 644
    filled-new-array {v3, v4}, [Lw80;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    invoke-static {v3}, Ls11;->u([Lw80;)Lw80;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    const-string v4, "lsposed_context"

    .line 653
    .line 654
    invoke-static {v2, v12, v4, v3}, Ls11;->z(Le41;La31;Ljava/lang/String;Lw80;)V

    .line 655
    .line 656
    .line 657
    const-string v3, "u:object_r:xposed_data:s0"

    .line 658
    .line 659
    invoke-static {v3}, Ls11;->C(Ljava/lang/String;)Lw80;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    const-string v4, "u:object_r:xposed_file:s0"

    .line 664
    .line 665
    invoke-static {v4}, Ls11;->C(Ljava/lang/String;)Lw80;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    const-string v9, "u:object_r:dex2oat_exec:s0"

    .line 670
    .line 671
    const-string v10, "execute_no_trans"

    .line 672
    .line 673
    const-string v14, "u:r:dex2oat:s0"

    .line 674
    .line 675
    invoke-static {v14, v9, v13, v10}, Ls11;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;

    .line 676
    .line 677
    .line 678
    move-result-object v9

    .line 679
    filled-new-array {v3, v4, v9}, [Lw80;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    invoke-static {v3}, Ls11;->u([Lw80;)Lw80;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    const-string v4, "xposed_context"

    .line 688
    .line 689
    invoke-static {v2, v12, v4, v3}, Ls11;->z(Le41;La31;Ljava/lang/String;Lw80;)V

    .line 690
    .line 691
    .line 692
    const-string v3, "dir"

    .line 693
    .line 694
    const-string v4, "search"

    .line 695
    .line 696
    const-string v9, "u:r:zygote:s0"

    .line 697
    .line 698
    invoke-static {v9, v11, v3, v4}, Ls11;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    const-string v4, "zygisk_next_rule"

    .line 703
    .line 704
    invoke-static {v2, v12, v4, v3}, Ls11;->z(Le41;La31;Ljava/lang/String;Lw80;)V

    .line 705
    .line 706
    .line 707
    const-string v3, "markers"

    .line 708
    .line 709
    invoke-virtual {v0, v3, v2}, Lmb1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    const-string v2, "detected"

    .line 713
    .line 714
    invoke-virtual {v0, v2, v12}, Lmb1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    iget-object v0, v7, Le41;->h:Lmb1;

    .line 718
    .line 719
    const-string v2, "dirtySepolicy"

    .line 720
    .line 721
    invoke-virtual {v0, v2, v8}, Lmb1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    sget-object v0, Lup0;->n:Ljava/lang/String;

    .line 725
    .line 726
    const-string v2, "hostPkgName"

    .line 727
    .line 728
    if-eqz v0, :cond_1e

    .line 729
    .line 730
    const-string v3, "hostPackage"

    .line 731
    .line 732
    invoke-virtual {v7, v3, v0}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    const-string v0, "hostType"

    .line 736
    .line 737
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    invoke-virtual {v7, v0, v3}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    move-object/from16 v28, v7

    .line 745
    .line 746
    new-instance v7, Lnt;

    .line 747
    .line 748
    sget-object v8, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 749
    .line 750
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 751
    .line 752
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 753
    .line 754
    .line 755
    move-result-object v9

    .line 756
    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 757
    .line 758
    sget-object v11, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 759
    .line 760
    sget-object v12, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 761
    .line 762
    sget-object v13, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 763
    .line 764
    const/4 v3, 0x0

    .line 765
    sget-object v16, Lup0;->n:Ljava/lang/String;

    .line 766
    .line 767
    if-eqz v16, :cond_1d

    .line 768
    .line 769
    const-string v0, "os.arch"

    .line 770
    .line 771
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    sget-object v2, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 776
    .line 777
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    invoke-static {v2}, Lmg;->l0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    check-cast v2, Ljava/lang/String;

    .line 785
    .line 786
    const-class v4, Lde/robv/android/xposed/XposedBridge;

    .line 787
    .line 788
    :try_start_3
    const-string v14, "TAG"

    .line 789
    .line 790
    invoke-virtual {v4, v14}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 791
    .line 792
    .line 793
    move-result-object v14

    .line 794
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 795
    .line 796
    .line 797
    const/4 v15, 0x1

    .line 798
    :try_start_4
    invoke-virtual {v14, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 799
    .line 800
    .line 801
    const/4 v3, 0x0

    .line 802
    :try_start_5
    invoke-virtual {v14, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v14

    .line 806
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    check-cast v14, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 810
    .line 811
    goto :goto_c

    .line 812
    :catch_0
    const/4 v3, 0x0

    .line 813
    goto :goto_b

    .line 814
    :catch_1
    const/4 v3, 0x0

    .line 815
    const/4 v15, 0x1

    .line 816
    :catch_2
    :goto_b
    const-string v14, "\u672a\u77e5"

    .line 817
    .line 818
    :goto_c
    const-string v3, "BugHook"

    .line 819
    .line 820
    invoke-virtual {v14, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v3

    .line 824
    if-eqz v3, :cond_10

    .line 825
    .line 826
    const-string v14, "\u5e94\u7528\u8f6c\u751f"

    .line 827
    .line 828
    :catch_3
    :cond_f
    :goto_d
    move-object/from16 v19, v14

    .line 829
    .line 830
    goto :goto_e

    .line 831
    :cond_10
    const-string v3, "LSPosed-Bridge"

    .line 832
    .line 833
    invoke-virtual {v14, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v3

    .line 837
    if-eqz v3, :cond_11

    .line 838
    .line 839
    const-string v14, "LSPosed"

    .line 840
    .line 841
    goto :goto_d

    .line 842
    :cond_11
    const-string v3, "SandXposed"

    .line 843
    .line 844
    invoke-virtual {v14, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v3

    .line 848
    if-eqz v3, :cond_12

    .line 849
    .line 850
    const-string v14, "\u5929\u9274"

    .line 851
    .line 852
    goto :goto_d

    .line 853
    :cond_12
    const-string v3, "PineXposed"

    .line 854
    .line 855
    invoke-virtual {v14, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 856
    .line 857
    .line 858
    move-result v3

    .line 859
    if-eqz v3, :cond_13

    .line 860
    .line 861
    const-string v14, "DreamLand"

    .line 862
    .line 863
    goto :goto_d

    .line 864
    :cond_13
    const-string v3, "Xposed"

    .line 865
    .line 866
    invoke-virtual {v14, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 867
    .line 868
    .line 869
    move-result v3

    .line 870
    if-eqz v3, :cond_f

    .line 871
    .line 872
    :try_start_6
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    const-string v4, "me.weishu.exposed.ExposedBridge"

    .line 880
    .line 881
    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    if-eqz v3, :cond_f

    .line 886
    .line 887
    const-string v14, "\u592a\u6781"
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 888
    .line 889
    goto :goto_d

    .line 890
    :goto_e
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    invoke-virtual {v3}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v25

    .line 898
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    invoke-virtual {v3}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v26

    .line 906
    const v29, 0x9d000

    .line 907
    .line 908
    .line 909
    const/16 v30, 0x0

    .line 910
    .line 911
    const-string v14, "1.0.2"

    .line 912
    .line 913
    move/from16 v18, v15

    .line 914
    .line 915
    const-string v15, "234"

    .line 916
    .line 917
    const/16 v20, 0x0

    .line 918
    .line 919
    const-string v21, "unknown"

    .line 920
    .line 921
    const/16 v22, 0x0

    .line 922
    .line 923
    const/16 v23, 0x0

    .line 924
    .line 925
    const/16 v24, 0x0

    .line 926
    .line 927
    const/16 v27, 0x0

    .line 928
    .line 929
    move/from16 v3, v18

    .line 930
    .line 931
    move-object/from16 v18, v2

    .line 932
    .line 933
    move v2, v3

    .line 934
    move-object/from16 v17, v0

    .line 935
    .line 936
    const/4 v3, 0x0

    .line 937
    const/4 v4, 0x0

    .line 938
    invoke-direct/range {v7 .. v30}, Lnt;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk31;ILc50;)V

    .line 939
    .line 940
    .line 941
    invoke-direct {v6, v5, v7}, Lot;-><init>(Ljava/lang/String;Lnt;)V

    .line 942
    .line 943
    .line 944
    new-instance v0, Le41;

    .line 945
    .line 946
    invoke-direct {v0}, Le41;-><init>()V

    .line 947
    .line 948
    .line 949
    const-string v5, "userId"

    .line 950
    .line 951
    move-object/from16 v7, p0

    .line 952
    .line 953
    invoke-virtual {v0, v5, v7}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    const-string v5, "platform"

    .line 957
    .line 958
    invoke-virtual {v0, v5, v1}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    new-instance v1, Lir0;

    .line 962
    .line 963
    invoke-direct {v1}, Lir0;-><init>()V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v1, v6}, Lir0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    new-instance v5, Ljava/io/StringReader;

    .line 971
    .line 972
    invoke-direct {v5, v1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    :try_start_7
    new-instance v1, Ll41;

    .line 976
    .line 977
    invoke-direct {v1, v5}, Ll41;-><init>(Ljava/io/Reader;)V

    .line 978
    .line 979
    .line 980
    invoke-static {v1}, Lte;->Y(Ll41;)Lk31;

    .line 981
    .line 982
    .line 983
    move-result-object v5
    :try_end_7
    .catch Lke1; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 984
    :try_start_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 985
    .line 986
    .line 987
    instance-of v6, v5, La41;
    :try_end_8
    .catch Lke1; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    .line 988
    .line 989
    if-nez v6, :cond_15

    .line 990
    .line 991
    :try_start_9
    invoke-virtual {v1}, Ll41;->I()I

    .line 992
    .line 993
    .line 994
    move-result v1

    .line 995
    const/16 v6, 0xa

    .line 996
    .line 997
    if-ne v1, v6, :cond_14

    .line 998
    .line 999
    goto :goto_f

    .line 1000
    :cond_14
    new-instance v0, Lt31;

    .line 1001
    .line 1002
    const-string v1, "Did not consume the entire document."

    .line 1003
    .line 1004
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    throw v0
    :try_end_9
    .catch Lke1; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 1008
    :cond_15
    :goto_f
    iget-object v1, v0, Le41;->h:Lmb1;

    .line 1009
    .line 1010
    const-string v6, "report"

    .line 1011
    .line 1012
    invoke-virtual {v1, v6, v5}, Lmb1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    :try_start_a
    sget-object v1, Lnuke/data/cipher/NativeCrypto;->INSTANCE:Lnuke/data/cipher/NativeCrypto;

    .line 1016
    .line 1017
    invoke-virtual {v0}, Lk31;->toString()Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v1, v0}, Lnuke/data/cipher/NativeCrypto;->syncClient(Ljava/lang/String;)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1028
    goto :goto_10

    .line 1029
    :catchall_3
    move-exception v0

    .line 1030
    new-instance v1, Lx92;

    .line 1031
    .line 1032
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1033
    .line 1034
    .line 1035
    move-object v0, v1

    .line 1036
    :goto_10
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    const-string v5, "[NukeCore]"

    .line 1041
    .line 1042
    const/4 v6, 0x6

    .line 1043
    if-nez v1, :cond_1b

    .line 1044
    .line 1045
    check-cast v0, Ljava/lang/String;

    .line 1046
    .line 1047
    :try_start_b
    new-instance v1, Lir0;

    .line 1048
    .line 1049
    invoke-direct {v1}, Lir0;-><init>()V

    .line 1050
    .line 1051
    .line 1052
    const-class v7, Lpt;

    .line 1053
    .line 1054
    invoke-virtual {v1, v0, v7}, Lir0;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    check-cast v0, Lpt;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 1059
    .line 1060
    goto :goto_11

    .line 1061
    :catchall_4
    move-exception v0

    .line 1062
    new-instance v1, Lx92;

    .line 1063
    .line 1064
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1065
    .line 1066
    .line 1067
    move-object v0, v1

    .line 1068
    :goto_11
    nop

    .line 1069
    instance-of v1, v0, Lx92;

    .line 1070
    .line 1071
    if-nez v1, :cond_1a

    .line 1072
    .line 1073
    move-object v1, v0

    .line 1074
    check-cast v1, Lpt;

    .line 1075
    .line 1076
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v1}, Lpt;->l()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v7

    .line 1083
    const-string v8, "ACTIVE"

    .line 1084
    .line 1085
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v7

    .line 1089
    if-eqz v7, :cond_17

    .line 1090
    .line 1091
    invoke-virtual {v1}, Lpt;->i()Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v7

    .line 1095
    const-string v8, "VIP"

    .line 1096
    .line 1097
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v7

    .line 1101
    if-nez v7, :cond_16

    .line 1102
    .line 1103
    invoke-virtual {v1}, Lpt;->i()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v7

    .line 1107
    const-string v8, "SPECIAL"

    .line 1108
    .line 1109
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v7

    .line 1113
    if-eqz v7, :cond_17

    .line 1114
    .line 1115
    :cond_16
    move v9, v2

    .line 1116
    goto :goto_12

    .line 1117
    :cond_17
    move v9, v3

    .line 1118
    :goto_12
    invoke-virtual {v1}, Lpt;->k()J

    .line 1119
    .line 1120
    .line 1121
    move-result-wide v2

    .line 1122
    const-wide/16 v7, 0x3e8

    .line 1123
    .line 1124
    mul-long v13, v2, v7

    .line 1125
    .line 1126
    sget-object v2, Lpp1;->a:Lpp1;

    .line 1127
    .line 1128
    sget-object v2, Lpp1;->c:Lx83;

    .line 1129
    .line 1130
    if-eqz v2, :cond_19

    .line 1131
    .line 1132
    new-instance v8, Lt22;

    .line 1133
    .line 1134
    invoke-virtual {v1}, Lpt;->m()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v3

    .line 1138
    if-nez v3, :cond_18

    .line 1139
    .line 1140
    invoke-virtual {v1}, Lpt;->i()Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v3

    .line 1144
    :cond_18
    move-object v10, v3

    .line 1145
    const-wide/16 v11, 0x0

    .line 1146
    .line 1147
    invoke-direct/range {v8 .. v14}, Lt22;-><init>(ZLjava/lang/String;JJ)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v1}, Lpt;->l()Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v18

    .line 1154
    const/16 v21, 0x19e

    .line 1155
    .line 1156
    const/16 v22, 0x0

    .line 1157
    .line 1158
    const/4 v12, 0x0

    .line 1159
    move-wide/from16 v16, v13

    .line 1160
    .line 1161
    const/4 v13, 0x0

    .line 1162
    const/4 v14, 0x0

    .line 1163
    const/4 v15, 0x0

    .line 1164
    const/16 v19, 0x0

    .line 1165
    .line 1166
    const/16 v20, 0x0

    .line 1167
    .line 1168
    move-object v10, v2

    .line 1169
    move-object v11, v8

    .line 1170
    invoke-static/range {v10 .. v22}, Lx83;->k(Lx83;Lt22;Lo70;Lnu0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lx83;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v1

    .line 1174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    sput-object v1, Lpp1;->c:Lx83;

    .line 1178
    .line 1179
    goto :goto_13

    .line 1180
    :cond_19
    const-string v0, "mUser"

    .line 1181
    .line 1182
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 1183
    .line 1184
    .line 1185
    throw v4

    .line 1186
    :cond_1a
    :goto_13
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    if-eqz v0, :cond_1c

    .line 1191
    .line 1192
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    const-string v1, "Decrypt report response failed: "

    .line 1197
    .line 1198
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v1

    .line 1206
    :try_start_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v0

    .line 1218
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 1219
    .line 1220
    .line 1221
    move-object/from16 v3, v31

    .line 1222
    .line 1223
    goto :goto_14

    .line 1224
    :catchall_5
    move-exception v0

    .line 1225
    new-instance v3, Lx92;

    .line 1226
    .line 1227
    invoke-direct {v3, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1228
    .line 1229
    .line 1230
    :goto_14
    instance-of v0, v3, Lx92;

    .line 1231
    .line 1232
    if-eqz v0, :cond_1c

    .line 1233
    .line 1234
    move-object/from16 v2, v32

    .line 1235
    .line 1236
    invoke-static {v6, v2, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 1237
    .line 1238
    .line 1239
    goto :goto_16

    .line 1240
    :cond_1b
    move-object/from16 v2, v32

    .line 1241
    .line 1242
    invoke-static {v1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    const-string v1, "Nuke native client sync failed: "

    .line 1247
    .line 1248
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    :try_start_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1269
    .line 1270
    .line 1271
    move-object/from16 v3, v31

    .line 1272
    .line 1273
    goto :goto_15

    .line 1274
    :catchall_6
    move-exception v0

    .line 1275
    new-instance v3, Lx92;

    .line 1276
    .line 1277
    invoke-direct {v3, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1278
    .line 1279
    .line 1280
    :goto_15
    instance-of v0, v3, Lx92;

    .line 1281
    .line 1282
    if-eqz v0, :cond_1c

    .line 1283
    .line 1284
    invoke-static {v6, v2, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 1285
    .line 1286
    .line 1287
    :cond_1c
    :goto_16
    return-void

    .line 1288
    :catch_4
    move-exception v0

    .line 1289
    goto :goto_17

    .line 1290
    :catch_5
    move-exception v0

    .line 1291
    new-instance v1, Lt31;

    .line 1292
    .line 1293
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1294
    .line 1295
    .line 1296
    throw v1

    .line 1297
    :catch_6
    move-exception v0

    .line 1298
    :goto_17
    new-instance v1, Lt31;

    .line 1299
    .line 1300
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1301
    .line 1302
    .line 1303
    throw v1

    .line 1304
    :cond_1d
    const/4 v4, 0x0

    .line 1305
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    throw v4

    .line 1309
    :cond_1e
    const/4 v4, 0x0

    .line 1310
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 1311
    .line 1312
    .line 1313
    throw v4
.end method
