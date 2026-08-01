.class public final Lin0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Landroid/os/Handler;

.field public static β:Z

.field public static γ:Z

.field public static δ:Z

.field public static ε:I

.field public static ζ:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lin0;->α:Landroid/os/Handler;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    sput-boolean v0, Lin0;->β:Z

    .line 14
    .line 15
    sput-boolean v0, Lin0;->γ:Z

    .line 16
    .line 17
    const/16 v0, 0xc

    .line 18
    .line 19
    sput v0, Lin0;->ε:I

    .line 20
    .line 21
    new-instance v0, Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final α()V
    .locals 8

    .line 1
    const-string v0, "DYHelper: \u914d\u7f6e\u5df2\u5237\u65b0 fab="

    .line 2
    .line 3
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    sget-wide v4, Lin0;->ζ:J

    .line 15
    .line 16
    sub-long v4, v2, v4

    .line 17
    .line 18
    const-wide/16 v6, 0x7d0

    .line 19
    .line 20
    cmp-long v4, v4, v6

    .line 21
    .line 22
    if-gez v4, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sput-wide v2, Lin0;->ζ:J

    .line 26
    .line 27
    :try_start_0
    const-string v2, "share_panel_enabled"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-static {v1, v2, v3}, Lin0;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sput-boolean v2, Lin0;->β:Z

    .line 35
    .line 36
    const-string v2, "volume_key_enabled"

    .line 37
    .line 38
    invoke-static {v1, v2, v3}, Lin0;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sput-boolean v2, Lin0;->γ:Z

    .line 43
    .line 44
    const-string v2, "fab_enabled"

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-static {v1, v2, v3}, Lin0;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    sput-boolean v2, Lin0;->δ:Z

    .line 52
    .line 53
    const-string v2, "fab_size"

    .line 54
    .line 55
    const/16 v3, 0xc

    .line 56
    .line 57
    invoke-static {v1, v2, v3}, Lin0;->δ(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    sput v2, Lin0;->ε:I

    .line 62
    .line 63
    const-string v2, "fab_alpha"

    .line 64
    .line 65
    const/16 v3, 0x32

    .line 66
    .line 67
    invoke-static {v1, v2, v3}, Lin0;->δ(Landroid/app/Activity;Ljava/lang/String;I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sget-boolean v2, Lin0;->δ:Z

    .line 72
    .line 73
    sget v3, Lin0;->ε:I

    .line 74
    .line 75
    new-instance v4, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ", size="

    .line 84
    .line 85
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, ", alpha="

    .line 92
    .line 93
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    :catchall_0
    :goto_0
    return-void
.end method

.method public static β(Landroid/app/Dialog;I)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    const-string p0, "DYHelper:  \u8f6e\u8be2 8 \u6b21\u4ecd\u672a\u627e\u5230\u5bb9\u5668\uff0c\u653e\u5f03"

    .line 6
    .line 7
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    new-instance v0, Len0;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p1, v1, p0}, Len0;-><init>(IILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const-wide/16 p0, 0x10

    .line 25
    .line 26
    sget-object v1, Lin0;->α:Landroid/os/Handler;

    .line 27
    .line 28
    invoke-virtual {v1, v0, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static γ(Landroid/app/Activity;Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lui1;->π(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "dyhelper_prefs"

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    return p0

    .line 31
    :catchall_1
    move-exception p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, "DYHelper: \u8bfb\u53d6\u5e03\u5c14\u914d\u7f6e\u5931\u8d25 key="

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, ", err="

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return p2
.end method

.method public static δ(Landroid/app/Activity;Ljava/lang/String;I)I
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lui1;->π(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "dyhelper_prefs"

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    return p0

    .line 31
    :catchall_1
    move-exception p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, "DYHelper: \u8bfb\u53d6\u6574\u578b\u914d\u7f6e\u5931\u8d25 key="

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, ", err="

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return p2
.end method

.method public static ε(Landroid/app/Dialog;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :cond_0
    move v1, v2

    .line 17
    goto/16 :goto_d

    .line 18
    .line 19
    :cond_1
    const-string v3, "t31"

    .line 20
    .line 21
    const-string v4, "egr"

    .line 22
    .line 23
    const-string v5, "function_container"

    .line 24
    .line 25
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    move v4, v2

    .line 30
    :goto_0
    const/4 v6, 0x3

    .line 31
    if-ge v4, v6, :cond_0

    .line 32
    .line 33
    aget-object v6, v3, v4

    .line 34
    .line 35
    const/16 v7, 0xa

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    const-string v10, "id"

    .line 42
    .line 43
    const-string v11, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 44
    .line 45
    invoke-static {v11}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    invoke-virtual {v9, v6, v10, v11}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :catchall_0
    :cond_2
    new-instance v9, Lw6;

    .line 63
    .line 64
    invoke-direct {v9}, Lw6;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    new-instance v11, Ll91;

    .line 72
    .line 73
    invoke-direct {v11, v1, v10}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9, v11}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v9}, Lw6;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-nez v10, :cond_5

    .line 84
    .line 85
    invoke-virtual {v9}, Lw6;->removeFirst()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    check-cast v10, Ll91;

    .line 90
    .line 91
    iget-object v11, v10, Ll91;->ε:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v11, Landroid/view/View;

    .line 94
    .line 95
    iget-object v10, v10, Ll91;->ζ:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v10, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-gt v10, v7, :cond_3

    .line 104
    .line 105
    :try_start_1
    invoke-virtual {v11}, Landroid/view/View;->getId()I

    .line 106
    .line 107
    .line 108
    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 109
    const/4 v13, -0x1

    .line 110
    if-eq v12, v13, :cond_4

    .line 111
    .line 112
    if-eqz v12, :cond_4

    .line 113
    .line 114
    :try_start_2
    invoke-virtual {v11}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-virtual {v13, v12}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 122
    goto :goto_1

    .line 123
    :catchall_1
    const/4 v12, 0x0

    .line 124
    :goto_1
    :try_start_3
    invoke-static {v12, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 128
    if-eqz v12, :cond_4

    .line 129
    .line 130
    move-object v9, v11

    .line 131
    goto :goto_3

    .line 132
    :catchall_2
    :cond_4
    instance-of v12, v11, Landroid/view/ViewGroup;

    .line 133
    .line 134
    if-eqz v12, :cond_3

    .line 135
    .line 136
    check-cast v11, Landroid/view/ViewGroup;

    .line 137
    .line 138
    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    move v13, v2

    .line 143
    :goto_2
    if-ge v13, v12, :cond_3

    .line 144
    .line 145
    invoke-virtual {v11, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    add-int/lit8 v15, v10, 0x1

    .line 150
    .line 151
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    new-instance v8, Ll91;

    .line 156
    .line 157
    invoke-direct {v8, v14, v15}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, v8}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v13, v13, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_5
    const/4 v9, 0x0

    .line 167
    :goto_3
    instance-of v8, v9, Landroid/view/ViewGroup;

    .line 168
    .line 169
    if-eqz v8, :cond_6

    .line 170
    .line 171
    check-cast v9, Landroid/view/ViewGroup;

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_6
    const/4 v9, 0x0

    .line 175
    :goto_4
    if-nez v9, :cond_7

    .line 176
    .line 177
    add-int/lit8 v4, v4, 0x1

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_7
    const-string v1, "dyhelper_dl_btn"

    .line 182
    .line 183
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-eqz v3, :cond_8

    .line 188
    .line 189
    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 190
    .line 191
    .line 192
    :cond_8
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Landroid/app/Dialog;->getOwnerActivity()Landroid/app/Activity;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    if-nez v4, :cond_9

    .line 204
    .line 205
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    :cond_9
    if-eqz v4, :cond_11

    .line 210
    .line 211
    sget-object v8, Lq71;->ζ:Ljava/util/List;

    .line 212
    .line 213
    invoke-static {v8}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-static {v8, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    invoke-static {v10}, Lex0;->Κ(I)I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    const/16 v11, 0x10

    .line 226
    .line 227
    if-ge v10, v11, :cond_a

    .line 228
    .line 229
    move v10, v11

    .line 230
    :cond_a
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 231
    .line 232
    invoke-direct {v11, v10}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    if-eqz v10, :cond_b

    .line 244
    .line 245
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    move-object v12, v10

    .line 250
    check-cast v12, Ln71;

    .line 251
    .line 252
    iget-object v12, v12, Ln71;->α:Ljava/lang/String;

    .line 253
    .line 254
    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_b
    sget-object v8, Lq71;->α:Lq71;

    .line 259
    .line 260
    invoke-static {}, Lq71;->χ()Z

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    invoke-static {}, Lxv1;->α()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    new-instance v12, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    :cond_c
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    if-eqz v13, :cond_f

    .line 282
    .line 283
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v13

    .line 287
    check-cast v13, Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v11, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v14

    .line 293
    check-cast v14, Ln71;

    .line 294
    .line 295
    if-nez v14, :cond_d

    .line 296
    .line 297
    const-string v14, "DYHelper: \u8df3\u8fc7\u5df2\u79fb\u9664\u7684\u5206\u4eab\u9762\u677f\u52a8\u4f5c id="

    .line 298
    .line 299
    :goto_7
    invoke-static {v14, v13}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    const/4 v14, 0x0

    .line 303
    goto :goto_8

    .line 304
    :cond_d
    invoke-virtual {v14, v8}, Ln71;->α(Z)Z

    .line 305
    .line 306
    .line 307
    move-result v15

    .line 308
    if-nez v15, :cond_e

    .line 309
    .line 310
    const-string v14, "DYHelper: \u8df3\u8fc7\u65e0\u5185\u6d4b\u8d44\u683c\u7684\u5206\u4eab\u9762\u677f\u52a8\u4f5c id="

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_e
    :goto_8
    if-eqz v14, :cond_c

    .line 314
    .line 315
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_f
    new-instance v8, Lf9;

    .line 320
    .line 321
    const/4 v10, 0x4

    .line 322
    invoke-direct {v8, v4, v10}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 323
    .line 324
    .line 325
    new-instance v10, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-static {v12, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v12

    .line 342
    if-eqz v12, :cond_10

    .line 343
    .line 344
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v12

    .line 348
    check-cast v12, Ln71;

    .line 349
    .line 350
    new-instance v13, Lmv1;

    .line 351
    .line 352
    sget-object v14, Lw71;->α:Ljava/util/List;

    .line 353
    .line 354
    iget-object v14, v12, Ln71;->α:Ljava/lang/String;

    .line 355
    .line 356
    invoke-static {v14}, Lw71;->β(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v14

    .line 360
    iget-object v15, v12, Ln71;->γ:Ljava/lang/String;

    .line 361
    .line 362
    iget v2, v12, Ln71;->ε:I

    .line 363
    .line 364
    iget-object v7, v12, Ln71;->ζ:Ljava/lang/String;

    .line 365
    .line 366
    move/from16 v16, v2

    .line 367
    .line 368
    new-instance v2, Lz61;

    .line 369
    .line 370
    move-object/from16 v17, v7

    .line 371
    .line 372
    const/4 v7, 0x7

    .line 373
    invoke-direct {v2, v8, v7, v12}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    const/16 v18, 0x1

    .line 377
    .line 378
    move-object/from16 v19, v2

    .line 379
    .line 380
    invoke-direct/range {v13 .. v19}, Lmv1;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLp70;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    const/4 v2, 0x0

    .line 387
    const/16 v7, 0xa

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_10
    move-object v8, v10

    .line 391
    goto :goto_a

    .line 392
    :cond_11
    const/4 v8, 0x0

    .line 393
    :goto_a
    if-nez v8, :cond_12

    .line 394
    .line 395
    sget-object v8, Ljz;->ε:Ljz;

    .line 396
    .line 397
    :cond_12
    new-instance v2, Ljava/util/ArrayList;

    .line 398
    .line 399
    const/16 v7, 0xa

    .line 400
    .line 401
    invoke-static {v8, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 406
    .line 407
    .line 408
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result v8

    .line 416
    if-eqz v8, :cond_13

    .line 417
    .line 418
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    check-cast v8, Lmv1;

    .line 423
    .line 424
    new-instance v10, Lz7;

    .line 425
    .line 426
    const/16 v11, 0x9

    .line 427
    .line 428
    invoke-direct {v10, v8, v0, v4, v11}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 429
    .line 430
    .line 431
    iget-object v11, v8, Lmv1;->α:Ljava/lang/String;

    .line 432
    .line 433
    iget-object v12, v8, Lmv1;->β:Ljava/lang/String;

    .line 434
    .line 435
    iget v13, v8, Lmv1;->γ:I

    .line 436
    .line 437
    iget-object v14, v8, Lmv1;->δ:Ljava/lang/String;

    .line 438
    .line 439
    iget-boolean v15, v8, Lmv1;->ε:Z

    .line 440
    .line 441
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-object/from16 v16, v10

    .line 445
    .line 446
    new-instance v10, Lmv1;

    .line 447
    .line 448
    invoke-direct/range {v10 .. v16}, Lmv1;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLp70;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_13
    new-instance v7, Lgn0;

    .line 456
    .line 457
    invoke-direct {v7, v4, v0}, Lgn0;-><init>(Landroid/app/Activity;Landroid/app/Dialog;)V

    .line 458
    .line 459
    .line 460
    invoke-static {v3, v2, v7, v1}, Lv81;->ξ(Landroid/content/Context;Ljava/util/ArrayList;Lp70;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-static {v6, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    if-eqz v1, :cond_14

    .line 469
    .line 470
    const/4 v1, 0x0

    .line 471
    invoke-virtual {v9, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 472
    .line 473
    .line 474
    goto :goto_c

    .line 475
    :cond_14
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 476
    .line 477
    .line 478
    :goto_c
    const-string v0, "DYHelper: \u5206\u4eab\u9762\u677f\u5feb\u6377\u64cd\u4f5c\u5df2\u6ce8\u5165\u5230 "

    .line 479
    .line 480
    invoke-static {v0, v6}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    const/4 v0, 0x1

    .line 484
    return v0

    .line 485
    :goto_d
    return v1
.end method

.method public static ζ(Landroid/app/Dialog;)Z
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Lin0;->ε(Landroid/app/Dialog;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance v0, Leo1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, v0

    .line 17
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const-string v1, "DYHelper"

    .line 24
    .line 25
    const-string v2, "\u5206\u4eab\u9762\u677f\u5feb\u6377\u64cd\u4f5c\u6ce8\u5165\u5931\u8d25"

    .line 26
    .line 27
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    instance-of v1, p0, Leo1;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    move-object p0, v0

    .line 37
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method
