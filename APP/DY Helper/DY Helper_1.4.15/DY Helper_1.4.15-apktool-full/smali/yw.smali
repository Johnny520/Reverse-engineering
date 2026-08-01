.class public final Lyw;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Landroid/os/Handler;

.field public static volatile β:J

.field public static volatile γ:J

.field public static volatile δ:J

.field public static volatile ε:Z

.field public static volatile ζ:I

.field public static volatile η:I

.field public static volatile θ:J

.field public static volatile ι:Z

.field public static volatile κ:I

.field public static λ:Lｓ;

.field public static μ:Ld1;

.field public static ν:Lxw;

.field public static ξ:J


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
    sput-object v0, Lyw;->α:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public static final α(Landroid/app/Activity;Lxw;)V
    .locals 6

    .line 1
    sget-wide v0, Lyw;->γ:J

    .line 2
    .line 3
    sget-boolean v2, Lyw;->ε:Z

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    sget-wide v2, Lyw;->δ:J

    .line 8
    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    sget-wide v4, Lyw;->δ:J

    .line 20
    .line 21
    sub-long/2addr v2, v4

    .line 22
    add-long/2addr v0, v2

    .line 23
    :cond_0
    const-wide/32 v2, 0xea60

    .line 24
    .line 25
    .line 26
    div-long/2addr v0, v2

    .line 27
    long-to-int v0, v0

    .line 28
    iget v1, p1, Lxw;->β:I

    .line 29
    .line 30
    if-ge v0, v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-boolean v2, p1, Lxw;->γ:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    div-int v2, v0, v1

    .line 38
    .line 39
    mul-int/2addr v1, v2

    .line 40
    :cond_2
    sget v2, Lyw;->ζ:I

    .line 41
    .line 42
    if-gt v1, v2, :cond_3

    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :cond_3
    sput v1, Lyw;->ζ:I

    .line 46
    .line 47
    sget v1, Lyw;->η:I

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    add-int/2addr v1, v2

    .line 51
    sput v1, Lyw;->η:I

    .line 52
    .line 53
    iget-object v1, p1, Lxw;->ε:Ljava/lang/String;

    .line 54
    .line 55
    :try_start_0
    const-string v3, "%d"

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    goto :goto_1

    .line 81
    :catchall_0
    const-string v1, "\u4f60\u5df2\u7ecf\u5237\u4e86 "

    .line 82
    .line 83
    const-string v2, " \u5206\u949f\u4e86\uff0c\u4f11\u606f\u4e00\u4e0b\u5427~"

    .line 84
    .line 85
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_4
    :goto_1
    sget v2, Lyw;->η:I

    .line 90
    .line 91
    const-string v3, " \u5206\u949f\uff08\u7b2c "

    .line 92
    .line 93
    const-string v4, " \u6b21\uff09"

    .line 94
    .line 95
    const-string v5, "\u65f6\u957f\u63d0\u9192 - \u5df2\u89c2\u770b "

    .line 96
    .line 97
    invoke-static {v5, v0, v3, v2, v4}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const/4 v3, 0x4

    .line 102
    const-string v4, "DYHelper:DurationAlert"

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    invoke-static {v4, v2, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lyw;->α:Landroid/os/Handler;

    .line 109
    .line 110
    new-instance v3, Lvw;

    .line 111
    .line 112
    invoke-direct {v3, p0, v1, v0, p1}, Lvw;-><init>(Landroid/app/Activity;Ljava/lang/String;ILxw;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public static final β(Landroid/app/Activity;Lxw;)V
    .locals 9

    .line 1
    sget-wide v0, Lyw;->θ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-boolean v0, Lyw;->ι:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sget-wide v2, Lyw;->θ:J

    .line 20
    .line 21
    sub-long/2addr v0, v2

    .line 22
    iget v2, p1, Lxw;->η:I

    .line 23
    .line 24
    int-to-long v3, v2

    .line 25
    const-wide/32 v5, 0xea60

    .line 26
    .line 27
    .line 28
    mul-long/2addr v3, v5

    .line 29
    cmp-long v5, v0, v3

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    const-string v7, "DYHelper:DurationAlert"

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    if-ltz v5, :cond_2

    .line 36
    .line 37
    const-string v0, " \u7a7a\u95f2\u8d85\u65f6\uff08"

    .line 38
    .line 39
    const-string v1, "min\uff09\uff0c\u76f4\u63a5\u9000\u51fa"

    .line 40
    .line 41
    invoke-static {v0, v2, v1}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v7, v0, v8, v6, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lyw;->θ()V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lyw;->α:Landroid/os/Handler;

    .line 52
    .line 53
    new-instance v1, Lw1;

    .line 54
    .line 55
    const/16 v2, 0xc

    .line 56
    .line 57
    invoke-direct {v1, p0, v2, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    iget-boolean v2, p1, Lxw;->ι:Z

    .line 65
    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    sub-long/2addr v3, v0

    .line 69
    const-wide/16 v0, 0x1388

    .line 70
    .line 71
    cmp-long v0, v3, v0

    .line 72
    .line 73
    if-gtz v0, :cond_5

    .line 74
    .line 75
    const-wide/16 v0, 0x3e8

    .line 76
    .line 77
    div-long/2addr v3, v0

    .line 78
    long-to-int v0, v3

    .line 79
    const/4 v1, 0x1

    .line 80
    if-ge v0, v1, :cond_3

    .line 81
    .line 82
    move v0, v1

    .line 83
    :cond_3
    const-string v2, "\u7a7a\u95f2\u5012\u8ba1\u65f6\u5f00\u59cb\uff0c\u5269\u4f59 "

    .line 84
    .line 85
    const-string v3, "s"

    .line 86
    .line 87
    invoke-static {v2, v0, v3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v7, v2, v8, v6, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-boolean v2, Lyw;->ι:Z

    .line 95
    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    sput-boolean v1, Lyw;->ι:Z

    .line 100
    .line 101
    sput v0, Lyw;->κ:I

    .line 102
    .line 103
    new-instance v0, Lｓ;

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-direct {v0, v1, p0, p1, v2}, Lｓ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 108
    .line 109
    .line 110
    sput-object v0, Lyw;->λ:Lｓ;

    .line 111
    .line 112
    sget-object p0, Lyw;->α:Landroid/os/Handler;

    .line 113
    .line 114
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_0
    return-void
.end method

.method public static final γ(Landroid/app/Activity;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 10
    .line 11
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public static final δ()Lxw;
    .locals 19

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Lyw;->ν:Lxw;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-wide v3, Lyw;->ξ:J

    .line 10
    .line 11
    sub-long v3, v0, v3

    .line 12
    .line 13
    const-wide/16 v5, 0x1388

    .line 14
    .line 15
    cmp-long v3, v3, v5

    .line 16
    .line 17
    if-gez v3, :cond_0

    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_0
    invoke-static {}, Lui1;->Α()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x4

    .line 25
    const-string v4, "DYHelper:DurationAlert"

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const-string v0, "[\u914d\u7f6e] PrefsManager \u672a\u521d\u59cb\u5316\uff0c\u4f7f\u7528\u9ed8\u8ba4\u503c"

    .line 31
    .line 32
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v6, Lxw;

    .line 36
    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/16 v8, 0x1e

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    const/4 v10, 0x1

    .line 44
    const-string v11, "\u4f60\u5df2\u7ecf\u5237\u4e86 %d \u5206\u949f\u4e86,\u4f11\u606f\u4e00\u4e0b\u5427~"

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    const/16 v13, 0x1e

    .line 48
    .line 49
    invoke-direct/range {v6 .. v15}, Lxw;-><init>(ZIZZLjava/lang/String;ZIZZ)V

    .line 50
    .line 51
    .line 52
    return-object v6

    .line 53
    :cond_1
    const-string v2, "idle_auto_exit_enabled"

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    invoke-static {v2, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {}, Lx9;->π()Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    const/4 v8, 0x1

    .line 65
    if-eqz v7, :cond_2

    .line 66
    .line 67
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->ε()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    move v7, v8

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    move v7, v6

    .line 76
    :goto_0
    if-eqz v2, :cond_3

    .line 77
    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    const-string v2, "[\u5185\u6d4b\u62e6\u622a] \u68c0\u6d4b\u5230\u5f00\u542f\u4e86\u7a7a\u95f2\u9000\u51fa\uff0c\u4f46\u672a\u901a\u8fc7\u5185\u6d4b\u9a8c\u8bc1\uff0c\u5df2\u5f3a\u5236\u5173\u95ed\u8be5\u529f\u80fd"

    .line 81
    .line 82
    invoke-static {v4, v2, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move v15, v6

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move v15, v2

    .line 88
    :goto_1
    const-string v2, "duration_alert_enabled"

    .line 89
    .line 90
    invoke-static {v2, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    const-string v2, "duration_alert_minutes"

    .line 95
    .line 96
    const/16 v7, 0x1e

    .line 97
    .line 98
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    invoke-interface {v9, v2, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 103
    .line 104
    .line 105
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    goto :goto_2

    .line 107
    :catchall_0
    move v2, v7

    .line 108
    :goto_2
    const/16 v9, 0xb4

    .line 109
    .line 110
    invoke-static {v2, v8, v9}, Lj81;->μ(III)I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    const-string v2, "duration_alert_repeat"

    .line 115
    .line 116
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    const-string v2, "duration_alert_vibrate"

    .line 121
    .line 122
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    const-string v2, "duration_alert_message"

    .line 127
    .line 128
    const-string v9, "\u4f60\u5df2\u7ecf\u5237\u4e86 %d \u5206\u949f\u4e86,\u4f11\u606f\u4e00\u4e0b\u5427~"

    .line 129
    .line 130
    invoke-static {v2, v9}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v14

    .line 138
    if-nez v14, :cond_4

    .line 139
    .line 140
    move-object v14, v9

    .line 141
    goto :goto_3

    .line 142
    :cond_4
    move-object v14, v2

    .line 143
    :goto_3
    const-string v2, "idle_auto_exit_minutes"

    .line 144
    .line 145
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-interface {v9, v2, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 150
    .line 151
    .line 152
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    :catchall_1
    const/16 v2, 0x3c

    .line 154
    .line 155
    invoke-static {v7, v8, v2}, Lj81;->μ(III)I

    .line 156
    .line 157
    .line 158
    move-result v16

    .line 159
    const-string v2, "idle_exit_lock_screen"

    .line 160
    .line 161
    invoke-static {v2, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 162
    .line 163
    .line 164
    move-result v17

    .line 165
    const-string v2, "idle_exit_show_countdown"

    .line 166
    .line 167
    invoke-static {v2, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v18

    .line 171
    new-instance v9, Lxw;

    .line 172
    .line 173
    invoke-direct/range {v9 .. v18}, Lxw;-><init>(ZIZZLjava/lang/String;ZIZZ)V

    .line 174
    .line 175
    .line 176
    move/from16 v2, v16

    .line 177
    .line 178
    move/from16 v6, v17

    .line 179
    .line 180
    move/from16 v7, v18

    .line 181
    .line 182
    new-instance v8, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v14, "[\u914d\u7f6e\u5237\u65b0] \u65f6\u957f\u63d0\u9192="

    .line 185
    .line 186
    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v10, "("

    .line 193
    .line 194
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v11, "min,repeat="

    .line 201
    .line 202
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v11, ",vib="

    .line 206
    .line 207
    const-string v14, ") | \u7a7a\u95f2\u9000\u51fa="

    .line 208
    .line 209
    invoke-static {v8, v12, v11, v13, v14}, Lnx;->Δ(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v2, "min,lock="

    .line 222
    .line 223
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v2, ",countdown="

    .line 230
    .line 231
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v2, ")"

    .line 238
    .line 239
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-static {v4, v2, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    sput-object v9, Lyw;->ν:Lxw;

    .line 250
    .line 251
    sput-wide v0, Lyw;->ξ:J

    .line 252
    .line 253
    return-object v9
.end method

.method public static ε()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lyw;->ι:Z

    .line 3
    .line 4
    sput v0, Lyw;->κ:I

    .line 5
    .line 6
    sget-object v0, Lyw;->λ:Lｓ;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v1, Lyw;->α:Landroid/os/Handler;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    sput-object v0, Lyw;->λ:Lｓ;

    .line 17
    .line 18
    return-void
.end method

.method public static ζ(Landroid/app/Activity;Lxw;)V
    .locals 7

    .line 1
    const-string v0, "DYHelper:DurationAlert"

    .line 2
    .line 3
    const-string v1, "\u7a7a\u95f2\u9000\u51fa\u5b8c\u6210\uff08\u9501\u5c4f="

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    .line 8
    .line 9
    const-string v5, "android.intent.action.MAIN"

    .line 10
    .line 11
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/high16 v5, 0x10000000

    .line 15
    .line 16
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const-string v5, "android.intent.category.HOME"

    .line 20
    .line 21
    invoke-virtual {v4, v5}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 28
    .line 29
    .line 30
    iget-boolean v4, p1, Lxw;->θ:Z

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-static {p0}, Lyw;->η(Landroid/app/Activity;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const-string v4, "\u9501\u5c4f\u5df2\u5173\u95ed\uff0c\u4ec5\u9000\u51fa"

    .line 41
    .line 42
    invoke-static {v0, v4, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    sput-wide v4, Lyw;->β:J

    .line 48
    .line 49
    sput-wide v4, Lyw;->γ:J

    .line 50
    .line 51
    sput-wide v4, Lyw;->δ:J

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    sput v6, Lyw;->ζ:I

    .line 55
    .line 56
    sput v6, Lyw;->η:I

    .line 57
    .line 58
    sput-wide v4, Lyw;->θ:J

    .line 59
    .line 60
    sput-boolean v6, Lyw;->ε:Z

    .line 61
    .line 62
    invoke-static {}, Lyw;->ε()V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lyw;->θ()V

    .line 66
    .line 67
    .line 68
    iget-boolean p1, p1, Lxw;->θ:Z

    .line 69
    .line 70
    new-instance v4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p1, "\uff09"

    .line 79
    .line 80
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {v0, p1, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string v1, "\u9000\u51fa\u5f02\u5e38: "

    .line 96
    .line 97
    invoke-static {v1, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {v0, p1, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    :catchall_1
    return-void
.end method

.method public static η(Landroid/app/Activity;)V
    .locals 7

    .line 1
    const-string v0, "DYHelper:DurationAlert"

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    const-string v3, "power"

    .line 6
    .line 7
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-string v5, "goToSleep"

    .line 18
    .line 19
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v4, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v3

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    const-string v3, "goToSleep \u9501\u5c4f\u6210\u529f"

    .line 50
    .line 51
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, "goToSleep \u5931\u8d25: "

    .line 60
    .line 61
    invoke-static {v4, v3}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const-string v4, "su"

    .line 73
    .line 74
    const-string v5, "-c"

    .line 75
    .line 76
    const-string v6, "input keyevent 26"

    .line 77
    .line 78
    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 83
    .line 84
    .line 85
    const-string v3, "Root \u9501\u5c4f\u6307\u4ee4\u5df2\u53d1\u9001"

    .line 86
    .line 87
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catchall_1
    move-exception v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v4, "Root \u9501\u5c4f\u5931\u8d25: "

    .line 97
    .line 98
    invoke-static {v4, v3}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-string v3, "\u6240\u6709\u9501\u5c4f\u65b9\u6848\u5747\u5931\u8d25\uff0c\u4ec5\u9000\u51fa"

    .line 106
    .line 107
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :try_start_2
    const-string v0, "\u5df2\u9000\u51fa\uff0c\u65e0\u6cd5\u81ea\u52a8\u9501\u5c4f\uff08\u9700\u8981 Root\uff09"

    .line 111
    .line 112
    const/4 v1, 0x1

    .line 113
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 118
    .line 119
    .line 120
    :catchall_2
    :goto_2
    return-void
.end method

.method public static θ()V
    .locals 2

    .line 1
    sget-object v0, Lyw;->μ:Ld1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lyw;->α:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, Lyw;->μ:Ld1;

    .line 12
    .line 13
    return-void
.end method
