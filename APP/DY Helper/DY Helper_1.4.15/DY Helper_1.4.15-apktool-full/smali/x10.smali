.class public final Lx10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ld30;
.implements Le10;


# static fields
.field public static final α:Lx10;

.field public static final β:J

.field public static volatile γ:Z

.field public static volatile δ:Z

.field public static volatile ε:Ljava/lang/ClassLoader;

.field public static final ζ:Ljava/lang/Object;

.field public static volatile η:Z

.field public static volatile θ:J

.field public static volatile ι:J

.field public static final κ:Ljava/util/WeakHashMap;

.field public static final λ:Ljava/util/WeakHashMap;

.field public static final μ:Ljava/lang/Object;

.field public static volatile ν:Lw10;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx10;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx10;->α:Lx10;

    .line 7
    .line 8
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-long v0, v0

    .line 13
    const-wide/16 v2, 0x78

    .line 14
    .line 15
    sub-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x140

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    sput-wide v0, Lx10;->β:J

    .line 23
    .line 24
    new-instance v0, Ljava/lang/Object;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lx10;->ζ:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance v0, Ljava/util/WeakHashMap;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lx10;->κ:Ljava/util/WeakHashMap;

    .line 37
    .line 38
    new-instance v0, Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lx10;->λ:Ljava/util/WeakHashMap;

    .line 44
    .line 45
    new-instance v0, Ljava/lang/Object;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lx10;->μ:Ljava/lang/Object;

    .line 51
    .line 52
    return-void
.end method

.method public static δ(Lv10;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv10;->ι:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lv10;->κ:Ljava/lang/Runnable;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lv10;->ι:Landroid/view/View;

    .line 14
    .line 15
    iput-object v0, p0, Lv10;->κ:Ljava/lang/Runnable;

    .line 16
    .line 17
    return-void
.end method

.method public static ε(Lv10;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lx10;->δ(Lv10;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lv10;->α:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lv10;->β:F

    .line 9
    .line 10
    iput v1, p0, Lv10;->γ:F

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    iput-wide v1, p0, Lv10;->δ:J

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    iput-object v1, p0, Lv10;->ε:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "\u65e0"

    .line 21
    .line 22
    iput-object v1, p0, Lv10;->ζ:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean v0, p0, Lv10;->η:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lv10;->θ:Z

    .line 27
    .line 28
    return-void
.end method

.method public static ζ(Landroid/app/Activity;)V
    .locals 10

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const-string v2, "FeedGestureHook"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-static {p0}, Lui1;->π(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "Prefs \u521d\u59cb\u5316\u5931\u8d25: "

    .line 21
    .line 22
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    const-string p0, "double_tap_menu_enabled"

    .line 30
    .line 31
    invoke-static {}, Lui1;->Α()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    sget-wide v6, Lx10;->θ:J

    .line 43
    .line 44
    sub-long v6, v4, v6

    .line 45
    .line 46
    const-wide/16 v8, 0x7d0

    .line 47
    .line 48
    cmp-long v0, v6, v8

    .line 49
    .line 50
    if-gez v0, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    sput-wide v4, Lx10;->θ:J

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    :try_start_1
    invoke-static {p0, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-static {p0, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    const-string p0, "\u5df2\u5173\u95ed\u65e7\u7248\u53cc\u51fb\u5524\u51fa\u83dc\u5355\u5f00\u5173"

    .line 66
    .line 67
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const-string v0, "\u5173\u95ed\u65e7\u7248\u53cc\u51fb\u83dc\u5355\u5931\u8d25: "

    .line 77
    .line 78
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    :goto_1
    return-void
.end method

.method public static η(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 13

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 2
    .line 3
    invoke-static {p1}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "\u6253\u5f00\u8bc4\u8bba\u533a"

    .line 12
    .line 13
    const-string v3, "\u5206\u4eab\u4f5c\u54c1"

    .line 14
    .line 15
    const-string v4, "\u5173\u6ce8\u4f5c\u8005"

    .line 16
    .line 17
    const-string v5, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 18
    .line 19
    const-string v6, "\u6536\u85cf\u4f5c\u54c1"

    .line 20
    .line 21
    const-string v7, "\u70b9\u8d5e\u4f5c\u54c1"

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x4

    .line 26
    const-string v11, "FeedGestureHook"

    .line 27
    .line 28
    const/4 v12, 0x0

    .line 29
    sparse-switch v1, :sswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_8

    .line 33
    .line 34
    :sswitch_0
    const-string v1, "\u6dfb\u52a0\u4e2a\u4eba\u4e3b\u9875\u4e66\u7b7e"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto/16 :goto_8

    .line 43
    .line 44
    :cond_0
    const-string p1, "\u6dfb\u52a0\u5f53\u524d\u4f5c\u54c1\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 45
    .line 46
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lq71;->α:Lq71;

    .line 50
    .line 51
    new-instance p1, Ln9;

    .line 52
    .line 53
    const/16 v0, 0x1b

    .line 54
    .line 55
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :sswitch_1
    const-string v1, "\u6dfb\u52a0\u4f5c\u54c1\u4e66\u7b7e"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    goto/16 :goto_8

    .line 71
    .line 72
    :cond_1
    const-string p1, "\u6dfb\u52a0\u5f53\u524d\u4f5c\u54c1\u4e66\u7b7e"

    .line 73
    .line 74
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Lq71;->α:Lq71;

    .line 78
    .line 79
    new-instance p1, Ln9;

    .line 80
    .line 81
    const/16 v0, 0x19

    .line 82
    .line 83
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :sswitch_2
    const-string v1, "\u5207\u6362\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_2

    .line 97
    .line 98
    goto/16 :goto_8

    .line 99
    .line 100
    :cond_2
    const-string p1, "\u5207\u6362\u9690\u85cf\u8054\u7cfb\u4eba\u7684\u4e34\u65f6\u663e\u793a\u72b6\u6001"

    .line 101
    .line 102
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Ln9;

    .line 106
    .line 107
    const/16 v0, 0x14

    .line 108
    .line 109
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :sswitch_3
    const-string v1, "\u6e05\u723d\u6a21\u5f0f\u5f00\u5173"

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    goto/16 :goto_8

    .line 125
    .line 126
    :cond_3
    const-string p1, "\u5207\u6362\u6e05\u723d\u6a21\u5f0f"

    .line 127
    .line 128
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    const-string p1, "clean_mode_enabled"

    .line 132
    .line 133
    invoke-static {p1, v9}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    xor-int/2addr v0, v8

    .line 138
    invoke-static {p1, v0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 139
    .line 140
    .line 141
    sget-object v1, Lug;->α:Ltg;

    .line 142
    .line 143
    const-string v1, "feed_gesture"

    .line 144
    .line 145
    invoke-static {p1, v1}, Ltg;->Ω(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    new-instance p1, Ljg;

    .line 149
    .line 150
    invoke-direct {p1, p0, v0, v8}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :sswitch_4
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_e

    .line 162
    .line 163
    goto/16 :goto_8

    .line 164
    .line 165
    :sswitch_5
    const-string v1, "\u6a21\u5757\u83dc\u5355"

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_4

    .line 172
    .line 173
    goto/16 :goto_8

    .line 174
    .line 175
    :cond_4
    const-string p1, "\u6253\u5f00\u6a21\u5757\u83dc\u5355"

    .line 176
    .line 177
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    new-instance p1, Ln9;

    .line 181
    .line 182
    const/16 v0, 0x8

    .line 183
    .line 184
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :sswitch_6
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-nez v1, :cond_e

    .line 196
    .line 197
    goto/16 :goto_8

    .line 198
    .line 199
    :sswitch_7
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-nez v1, :cond_e

    .line 204
    .line 205
    goto/16 :goto_8

    .line 206
    .line 207
    :sswitch_8
    const-string v1, "\u53d1\u5e03\u6309\u94ae"

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-nez v0, :cond_5

    .line 214
    .line 215
    goto/16 :goto_8

    .line 216
    .line 217
    :cond_5
    const-string p1, "\u6267\u884c\u53d1\u5e03\u6309\u94ae\u5165\u53e3"

    .line 218
    .line 219
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    new-instance p1, Ln9;

    .line 223
    .line 224
    const/4 v0, 0x7

    .line 225
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :sswitch_9
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_e

    .line 237
    .line 238
    goto/16 :goto_8

    .line 239
    .line 240
    :sswitch_a
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-nez v1, :cond_e

    .line 245
    .line 246
    goto/16 :goto_8

    .line 247
    .line 248
    :sswitch_b
    const-string v1, "\u4fee\u6539\u500d\u901f"

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-nez v0, :cond_6

    .line 255
    .line 256
    goto/16 :goto_8

    .line 257
    .line 258
    :cond_6
    const-string p1, "gesture_video_speed"

    .line 259
    .line 260
    const/high16 v0, 0x40000000    # 2.0f

    .line 261
    .line 262
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 267
    .line 268
    .line 269
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    :catchall_0
    invoke-static {v0}, Li2;->ψ(F)F

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    sget-object v0, Ll82;->α:Ll82;

    .line 275
    .line 276
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 281
    .line 282
    .line 283
    cmpg-float v0, v0, v1

    .line 284
    .line 285
    if-gtz v0, :cond_8

    .line 286
    .line 287
    const v0, 0x3dcccccd    # 0.1f

    .line 288
    .line 289
    .line 290
    cmpg-float v0, v0, p1

    .line 291
    .line 292
    if-gtz v0, :cond_8

    .line 293
    .line 294
    const/high16 v0, 0x41200000    # 10.0f

    .line 295
    .line 296
    cmpg-float v0, p1, v0

    .line 297
    .line 298
    if-gtz v0, :cond_8

    .line 299
    .line 300
    sget-object v0, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 303
    .line 304
    .line 305
    move-result-wide v1

    .line 306
    sput-wide v1, Ll82;->ι:J

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 309
    .line 310
    .line 311
    move-result-wide v0

    .line 312
    neg-long v0, v0

    .line 313
    sput-wide v0, Ll82;->θ:J

    .line 314
    .line 315
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_7

    .line 328
    .line 329
    invoke-static {p1}, Ll82;->α(F)Z

    .line 330
    .line 331
    .line 332
    move-result v9

    .line 333
    goto :goto_0

    .line 334
    :cond_7
    sget-object v0, Ll82;->ζ:Landroid/os/Handler;

    .line 335
    .line 336
    new-instance v1, Lg82;

    .line 337
    .line 338
    invoke-direct {v1, v9, p1}, Lg82;-><init>(IF)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 342
    .line 343
    .line 344
    move-result v9

    .line 345
    :cond_8
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v1, "\u4fee\u6539\u5f53\u524d\u89c6\u9891\u500d\u901f speed="

    .line 348
    .line 349
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    const-string v1, " success="

    .line 356
    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v11, v0, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    new-instance v0, Lu10;

    .line 371
    .line 372
    invoke-direct {v0, p0, v9, p1}, Lu10;-><init>(Landroid/app/Activity;ZF)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :sswitch_c
    const-string v1, "\u4e00\u952e\u5df2\u8bfb"

    .line 380
    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_9

    .line 386
    .line 387
    goto/16 :goto_8

    .line 388
    .line 389
    :cond_9
    const-string p1, "\u6267\u884c\u4e00\u952e\u5df2\u8bfb"

    .line 390
    .line 391
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    sget-object p1, Lzj0;->α:Lzj0;

    .line 395
    .line 396
    new-instance v0, Lf9;

    .line 397
    .line 398
    const/4 v1, 0x2

    .line 399
    invoke-direct {v0, p0, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p1, p0, v0}, Lzj0;->ψ(Landroid/app/Activity;La80;)V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :sswitch_d
    const-string v1, "\u4e0b\u8f7d\u97f3\u9891"

    .line 407
    .line 408
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-nez v0, :cond_a

    .line 413
    .line 414
    goto/16 :goto_8

    .line 415
    .line 416
    :cond_a
    const-string p1, "\u6267\u884c\u4e0b\u8f7d\u97f3\u9891"

    .line 417
    .line 418
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    sget-object p1, Lq71;->α:Lq71;

    .line 422
    .line 423
    new-instance p1, Ln9;

    .line 424
    .line 425
    const/16 v0, 0x18

    .line 426
    .line 427
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 431
    .line 432
    .line 433
    return-void

    .line 434
    :sswitch_e
    const-string v1, "\u4e0b\u8f7d\u4f5c\u54c1"

    .line 435
    .line 436
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-nez v0, :cond_b

    .line 441
    .line 442
    goto/16 :goto_8

    .line 443
    .line 444
    :cond_b
    const-string p1, "\u6267\u884c\u4e0b\u8f7d\u4f5c\u54c1"

    .line 445
    .line 446
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    sget-object p1, Lq71;->α:Lq71;

    .line 450
    .line 451
    new-instance p1, Ln9;

    .line 452
    .line 453
    const/16 v0, 0x1c

    .line 454
    .line 455
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 459
    .line 460
    .line 461
    return-void

    .line 462
    :sswitch_f
    const-string v1, "\u4e0d\u611f\u5174\u8da3"

    .line 463
    .line 464
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-nez v0, :cond_c

    .line 469
    .line 470
    goto/16 :goto_8

    .line 471
    .line 472
    :cond_c
    const-string p1, "\u6267\u884c\u4e0d\u611f\u5174\u8da3\u52a8\u4f5c"

    .line 473
    .line 474
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    new-instance p1, Ln9;

    .line 478
    .line 479
    const/16 v0, 0x9

    .line 480
    .line 481
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :sswitch_10
    const-string v1, "\u89c2\u770b\u5386\u53f2\u8bb0\u5f55"

    .line 489
    .line 490
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-nez v0, :cond_d

    .line 495
    .line 496
    goto/16 :goto_8

    .line 497
    .line 498
    :cond_d
    const-string p1, "\u6253\u5f00\u89c2\u770b\u5386\u53f2\u8bb0\u5f55"

    .line 499
    .line 500
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    new-instance p1, Ln9;

    .line 504
    .line 505
    const/16 v0, 0xa

    .line 506
    .line 507
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :sswitch_11
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    if-nez v1, :cond_e

    .line 519
    .line 520
    goto/16 :goto_8

    .line 521
    .line 522
    :cond_e
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 523
    .line 524
    .line 525
    move-result p1

    .line 526
    sparse-switch p1, :sswitch_data_1

    .line 527
    .line 528
    .line 529
    goto/16 :goto_7

    .line 530
    .line 531
    :sswitch_12
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result p1

    .line 535
    if-nez p1, :cond_f

    .line 536
    .line 537
    goto/16 :goto_7

    .line 538
    .line 539
    :cond_f
    sget-object p1, Lo10;->ζ:Lo10;

    .line 540
    .line 541
    goto :goto_1

    .line 542
    :sswitch_13
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result p1

    .line 546
    if-nez p1, :cond_10

    .line 547
    .line 548
    goto/16 :goto_7

    .line 549
    .line 550
    :cond_10
    sget-object p1, Lo10;->θ:Lo10;

    .line 551
    .line 552
    goto :goto_1

    .line 553
    :sswitch_14
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result p1

    .line 557
    if-nez p1, :cond_11

    .line 558
    .line 559
    goto/16 :goto_7

    .line 560
    .line 561
    :cond_11
    sget-object p1, Lo10;->κ:Lo10;

    .line 562
    .line 563
    goto :goto_1

    .line 564
    :sswitch_15
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result p1

    .line 568
    if-nez p1, :cond_12

    .line 569
    .line 570
    goto/16 :goto_7

    .line 571
    .line 572
    :cond_12
    sget-object p1, Lo10;->λ:Lo10;

    .line 573
    .line 574
    goto :goto_1

    .line 575
    :sswitch_16
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result p1

    .line 579
    if-nez p1, :cond_13

    .line 580
    .line 581
    goto/16 :goto_7

    .line 582
    .line 583
    :cond_13
    sget-object p1, Lo10;->ι:Lo10;

    .line 584
    .line 585
    goto :goto_1

    .line 586
    :sswitch_17
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result p1

    .line 590
    if-nez p1, :cond_14

    .line 591
    .line 592
    goto/16 :goto_7

    .line 593
    .line 594
    :cond_14
    sget-object p1, Lo10;->η:Lo10;

    .line 595
    .line 596
    :goto_1
    new-instance v1, Le9;

    .line 597
    .line 598
    const/16 v2, 0xd

    .line 599
    .line 600
    invoke-direct {v1, v0, p1, p0, v2}, Le9;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Landroid/app/Activity;I)V

    .line 601
    .line 602
    .line 603
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    if-eqz v2, :cond_15

    .line 608
    .line 609
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 610
    .line 611
    .line 612
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 613
    goto :goto_3

    .line 614
    :catchall_1
    move-exception v2

    .line 615
    goto :goto_2

    .line 616
    :cond_15
    move-object v2, v12

    .line 617
    goto :goto_3

    .line 618
    :goto_2
    new-instance v3, Leo1;

    .line 619
    .line 620
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 621
    .line 622
    .line 623
    move-object v2, v3

    .line 624
    :goto_3
    instance-of v3, v2, Leo1;

    .line 625
    .line 626
    if-eqz v3, :cond_16

    .line 627
    .line 628
    move-object v2, v12

    .line 629
    :cond_16
    check-cast v2, Landroid/view/View;

    .line 630
    .line 631
    if-eqz v2, :cond_18

    .line 632
    .line 633
    :try_start_2
    invoke-virtual {v2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 638
    .line 639
    .line 640
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 641
    goto :goto_4

    .line 642
    :catchall_2
    move-exception v3

    .line 643
    new-instance v4, Leo1;

    .line 644
    .line 645
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 646
    .line 647
    .line 648
    move-object v3, v4

    .line 649
    :goto_4
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 650
    .line 651
    instance-of v5, v3, Leo1;

    .line 652
    .line 653
    if-eqz v5, :cond_17

    .line 654
    .line 655
    move-object v3, v4

    .line 656
    :cond_17
    check-cast v3, Ljava/lang/Boolean;

    .line 657
    .line 658
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 659
    .line 660
    .line 661
    move-result v3

    .line 662
    if-ne v3, v8, :cond_18

    .line 663
    .line 664
    move v3, v8

    .line 665
    goto :goto_5

    .line 666
    :cond_18
    move v3, v9

    .line 667
    :goto_5
    iget-object p1, p1, Lo10;->ε:Ljava/lang/String;

    .line 668
    .line 669
    if-eqz v2, :cond_19

    .line 670
    .line 671
    goto :goto_6

    .line 672
    :cond_19
    move v8, v9

    .line 673
    :goto_6
    const-string v2, " hostAction="

    .line 674
    .line 675
    const-string v4, " decorAvailable="

    .line 676
    .line 677
    const-string v5, "Feed \u539f\u751f\u4e92\u52a8\u52a8\u4f5c\u5df2\u6295\u9012 action="

    .line 678
    .line 679
    invoke-static {v5, v0, v2, p1, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    move-result-object p1

    .line 683
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    const-string v0, " posted="

    .line 687
    .line 688
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object p1

    .line 698
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    if-nez v3, :cond_1a

    .line 702
    .line 703
    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 704
    .line 705
    .line 706
    :cond_1a
    :goto_7
    return-void

    .line 707
    :sswitch_18
    const-string v1, "\u4e00\u952e\u7eed\u706b\u82b1"

    .line 708
    .line 709
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    if-nez v0, :cond_1b

    .line 714
    .line 715
    :goto_8
    const-string p0, "\u5ffd\u7565\u672a\u914d\u7f6e\u6216\u4e0d\u652f\u6301\u7684\u624b\u52bf\u52a8\u4f5c: "

    .line 716
    .line 717
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object p0

    .line 721
    invoke-static {v11, p0, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    return-void

    .line 725
    :cond_1b
    const-string p1, "\u6267\u884c\u4e00\u952e\u7eed\u706b\u82b1"

    .line 726
    .line 727
    invoke-static {v11, p1, v12, v10, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    new-instance p1, Ln9;

    .line 731
    .line 732
    const/4 v0, 0x6

    .line 733
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 737
    .line 738
    .line 739
    return-void

    .line 740
    nop

    .line 741
    :sswitch_data_0
    .sparse-switch
        -0x6f1be69b -> :sswitch_18
        -0x6921d4a9 -> :sswitch_11
        -0x383aa726 -> :sswitch_10
        0x24f1dae1 -> :sswitch_f
        0x259e8737 -> :sswitch_e
        0x25a79550 -> :sswitch_d
        0x25b0dff7 -> :sswitch_c
        0x25dbbdfd -> :sswitch_b
        0x267a690a -> :sswitch_a
        0x26a944be -> :sswitch_9
        0x27874a97 -> :sswitch_8
        0x2945c010 -> :sswitch_7
        0x300245fe -> :sswitch_6
        0x31967ecf -> :sswitch_5
        0x355a476a -> :sswitch_4
        0x391e98d9 -> :sswitch_3
        0x50be4979 -> :sswitch_2
        0x5e3d5f02 -> :sswitch_1
        0x65aa3707 -> :sswitch_0
    .end sparse-switch

    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    :sswitch_data_1
    .sparse-switch
        -0x6921d4a9 -> :sswitch_17
        0x267a690a -> :sswitch_16
        0x26a944be -> :sswitch_15
        0x2945c010 -> :sswitch_14
        0x300245fe -> :sswitch_13
        0x355a476a -> :sswitch_12
    .end sparse-switch
.end method

.method public static θ(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/app/Activity;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static ι(Landroid/view/MotionEvent;)Lw10;
    .locals 15

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getEventTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v4, v2

    .line 15
    :goto_0
    sget-object v6, Lx10;->μ:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v6

    .line 18
    :try_start_0
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    sget-object v8, Lx10;->ν:Lw10;

    .line 23
    .line 24
    if-eqz v8, :cond_1

    .line 25
    .line 26
    invoke-virtual {v7, v8}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_1
    :goto_1
    sget-object v8, Lx10;->λ:Ljava/util/WeakHashMap;

    .line 34
    .line 35
    invoke-virtual {v8}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v8, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    check-cast v9, Lw10;

    .line 59
    .line 60
    invoke-virtual {v7, v9}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-static {v7}, Lyh;->μ(Lzt0;)Lzt0;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const/4 v8, 0x0

    .line 69
    invoke-virtual {v7, v8}, Lzt0;->listIterator(I)Ljava/util/ListIterator;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    const/4 v8, 0x0

    .line 74
    const v9, 0x7f7fffff    # Float.MAX_VALUE

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_3
    move-object v10, v7

    .line 78
    check-cast v10, Lle0;

    .line 79
    .line 80
    invoke-virtual {v10}, Lle0;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_6

    .line 85
    .line 86
    invoke-virtual {v10}, Lle0;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    check-cast v10, Lw10;

    .line 91
    .line 92
    iget-object v11, v10, Lw10;->α:Ljava/lang/ref/WeakReference;

    .line 93
    .line 94
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    if-eqz v11, :cond_3

    .line 99
    .line 100
    iget-wide v11, v10, Lw10;->ε:J

    .line 101
    .line 102
    sub-long v11, v0, v11

    .line 103
    .line 104
    const-wide/16 v13, 0x4b0

    .line 105
    .line 106
    cmp-long v11, v11, v13

    .line 107
    .line 108
    if-gtz v11, :cond_3

    .line 109
    .line 110
    cmp-long v11, v4, v2

    .line 111
    .line 112
    if-lez v11, :cond_4

    .line 113
    .line 114
    iget-wide v11, v10, Lw10;->δ:J

    .line 115
    .line 116
    sub-long v11, v4, v11

    .line 117
    .line 118
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v11

    .line 122
    cmp-long v11, v11, v13

    .line 123
    .line 124
    if-lez v11, :cond_4

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    if-nez p0, :cond_5

    .line 128
    .line 129
    iget-wide v11, v10, Lw10;->ε:J

    .line 130
    .line 131
    sub-long v11, v0, v11

    .line 132
    .line 133
    long-to-float v11, v11

    .line 134
    goto :goto_4

    .line 135
    :cond_5
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    iget v12, v10, Lw10;->β:F

    .line 140
    .line 141
    sub-float/2addr v11, v12

    .line 142
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    iget v13, v10, Lw10;->γ:F

    .line 151
    .line 152
    sub-float/2addr v12, v13

    .line 153
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    add-float/2addr v11, v12

    .line 158
    iget-wide v12, v10, Lw10;->δ:J

    .line 159
    .line 160
    sub-long v12, v4, v12

    .line 161
    .line 162
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    .line 163
    .line 164
    .line 165
    move-result-wide v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    long-to-float v12, v12

    .line 167
    add-float/2addr v11, v12

    .line 168
    :goto_4
    cmpg-float v12, v11, v9

    .line 169
    .line 170
    if-gez v12, :cond_3

    .line 171
    .line 172
    move-object v8, v10

    .line 173
    move v9, v11

    .line 174
    goto :goto_3

    .line 175
    :cond_6
    monitor-exit v6

    .line 176
    return-object v8

    .line 177
    :goto_5
    monitor-exit v6

    .line 178
    throw p0
.end method

.method public static κ(Landroid/app/Activity;)Lv10;
    .locals 2

    .line 1
    sget-object v0, Lx10;->κ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Lv10;

    .line 11
    .line 12
    invoke-direct {v1}, Lv10;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    check-cast v1, Lv10;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-object v1

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public static μ(Landroid/app/Activity;Lv10;Z)Z
    .locals 21

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, Lv10;->λ:J

    .line 10
    .line 11
    sub-long v4, v2, v4

    .line 12
    .line 13
    const-wide/16 v6, 0xc8

    .line 14
    .line 15
    cmp-long v0, v4, v6

    .line 16
    .line 17
    if-gtz v0, :cond_0

    .line 18
    .line 19
    iget-boolean v0, v1, Lv10;->μ:Z

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    :try_start_0
    invoke-static/range {p0 .. p0}, Lh62;->ш(Landroid/app/Activity;)Lt10;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    new-instance v4, Leo1;

    .line 29
    .line 30
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v4

    .line 34
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x0

    .line 39
    const-string v6, ""

    .line 40
    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance v0, Lt10;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v7, "selection_error:"

    .line 55
    .line 56
    invoke-virtual {v7, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-direct {v0, v6, v6, v4, v5}, Lt10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    :goto_1
    move-object v4, v0

    .line 64
    check-cast v4, Lt10;

    .line 65
    .line 66
    new-instance v7, Ls10;

    .line 67
    .line 68
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v6, v7, Ls10;->β:Ljava/lang/String;

    .line 72
    .line 73
    iput-object v6, v7, Ls10;->δ:Ljava/lang/String;

    .line 74
    .line 75
    iput-object v6, v7, Ls10;->ε:Ljava/lang/String;

    .line 76
    .line 77
    iput-object v6, v7, Ls10;->ι:Ljava/lang/String;

    .line 78
    .line 79
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    goto :goto_3

    .line 90
    :catchall_1
    move-exception v0

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const/4 v0, 0x0

    .line 93
    goto :goto_3

    .line 94
    :goto_2
    new-instance v8, Leo1;

    .line 95
    .line 96
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    move-object v0, v8

    .line 100
    :goto_3
    instance-of v8, v0, Leo1;

    .line 101
    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    :cond_3
    check-cast v0, Landroid/view/View;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    :try_start_2
    invoke-static {v0, v7}, Lh62;->я(Landroid/view/View;Ls10;)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :catchall_2
    move-exception v0

    .line 116
    new-instance v8, Leo1;

    .line 117
    .line 118
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    move-object v0, v8

    .line 122
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, v7, Ls10;->ι:Ljava/lang/String;

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_4
    const-string v0, "decor_unavailable"

    .line 140
    .line 141
    iput-object v0, v7, Ls10;->ι:Ljava/lang/String;

    .line 142
    .line 143
    :cond_5
    :goto_5
    iget-boolean v0, v4, Lt10;->α:Z

    .line 144
    .line 145
    iget-boolean v8, v7, Ls10;->α:Z

    .line 146
    .line 147
    iget-boolean v9, v7, Ls10;->γ:Z

    .line 148
    .line 149
    if-nez v0, :cond_6

    .line 150
    .line 151
    if-eqz v8, :cond_7

    .line 152
    .line 153
    :cond_6
    if-nez v9, :cond_7

    .line 154
    .line 155
    const/4 v5, 0x1

    .line 156
    :cond_7
    iget-object v10, v4, Lt10;->β:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v11, v4, Lt10;->γ:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v4, v4, Lt10;->δ:Ljava/lang/String;

    .line 161
    .line 162
    iget-object v12, v7, Ls10;->β:Ljava/lang/String;

    .line 163
    .line 164
    iget-object v13, v7, Ls10;->δ:Ljava/lang/String;

    .line 165
    .line 166
    iget-object v14, v7, Ls10;->ε:Ljava/lang/String;

    .line 167
    .line 168
    iget v15, v7, Ls10;->ζ:I

    .line 169
    .line 170
    iget-boolean v6, v7, Ls10;->η:Z

    .line 171
    .line 172
    move/from16 v16, v6

    .line 173
    .line 174
    iget-boolean v6, v7, Ls10;->θ:Z

    .line 175
    .line 176
    iget-object v7, v7, Ls10;->ι:Ljava/lang/String;

    .line 177
    .line 178
    iput-wide v2, v1, Lv10;->λ:J

    .line 179
    .line 180
    iput-boolean v5, v1, Lv10;->μ:Z

    .line 181
    .line 182
    if-eqz p2, :cond_8

    .line 183
    .line 184
    sget-wide v17, Lx10;->ι:J

    .line 185
    .line 186
    sub-long v17, v2, v17

    .line 187
    .line 188
    const-wide/16 v19, 0x3e8

    .line 189
    .line 190
    cmp-long v1, v17, v19

    .line 191
    .line 192
    if-lez v1, :cond_8

    .line 193
    .line 194
    sput-wide v2, Lx10;->ι:J

    .line 195
    .line 196
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    new-instance v2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v3, "Feed\u573a\u666f\u5224\u65ad allowed="

    .line 207
    .line 208
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v3, " selected="

    .line 215
    .line 216
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v0, " selectionSource="

    .line 223
    .line 224
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v0, " selectionView="

    .line 228
    .line 229
    const-string v3, " selectionReject="

    .line 230
    .line 231
    invoke-static {v2, v10, v0, v11, v3}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v0, " hasPlayer="

    .line 238
    .line 239
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v0, " anchor="

    .line 246
    .line 247
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v0, " commentOpen="

    .line 254
    .line 255
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v0, " commentAnchor="

    .line 262
    .line 263
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v0, " commentRect="

    .line 267
    .line 268
    const-string v3, " visited="

    .line 269
    .line 270
    invoke-static {v2, v13, v0, v14, v3}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v0, " depthLimit="

    .line 277
    .line 278
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    move/from16 v0, v16

    .line 282
    .line 283
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v0, " nodeLimit="

    .line 287
    .line 288
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v0, " scanFailure="

    .line 295
    .line 296
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string v0, " activity="

    .line 303
    .line 304
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    const/4 v1, 0x4

    .line 315
    const-string v2, "FeedGestureHook"

    .line 316
    .line 317
    const/4 v3, 0x0

    .line 318
    invoke-static {v2, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :cond_8
    return v5
.end method

.method public static ν()Z
    .locals 2

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "gesture_enabled"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    return v1
.end method

.method public static ξ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "\u65e0"

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lui1;->Α()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    :goto_0
    return-object v0

    .line 13
    :cond_1
    sget-object v1, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 14
    .line 15
    invoke-static {p0, p1}, Li2;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    invoke-static {p0, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-object v0
.end method

.method public static ο(Landroid/app/Activity;Lv10;)V
    .locals 12

    .line 1
    const-string v1, "FeedGestureHook"

    .line 2
    .line 3
    const-string v2, "\u6d3e\u53d1 ACTION_CANCEL \u5931\u8d25: "

    .line 4
    .line 5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v5

    .line 9
    iget-wide v3, p1, Lv10;->δ:J

    .line 10
    .line 11
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    cmp-long v3, v3, v7

    .line 18
    .line 19
    const/4 v11, 0x0

    .line 20
    if-lez v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v11

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-wide v3, v5

    .line 32
    :goto_1
    iget v8, p1, Lv10;->β:F

    .line 33
    .line 34
    iget v9, p1, Lv10;->γ:F

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v7, 0x3

    .line 38
    invoke-static/range {v3 .. v10}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 v3, 0x4

    .line 43
    :try_start_0
    sget-object v0, Le30;->α:Le30;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1}, Le30;->α(Landroid/app/Activity;Landroid/view/MotionEvent;)V

    .line 49
    .line 50
    .line 51
    const-string p0, "\u5df2\u5411\u539f\u751f\u6d3e\u53d1 ACTION_CANCEL\uff0c\u963b\u6b62\u539f\u751f\u957f\u6309"

    .line 52
    .line 53
    invoke-static {v1, p0, v11, v3, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    move-object p0, v0

    .line 62
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {v1, p0, v11, v3, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 88
    .line 89
    .line 90
    throw p0
.end method

.method public static π(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const-string v0, "\u6ce8\u518c\u5171\u4eab\u53cc\u51fb\u624b\u52bf\u7b56\u7565\u5931\u8d25: "

    .line 2
    .line 3
    sget-object v1, Lx10;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-object v2, Lx10;->α:Lx10;

    .line 7
    .line 8
    invoke-static {}, Lx10;->ν()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    sget-boolean v3, Lx10;->η:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    monitor-exit v1

    .line 19
    return-void

    .line 20
    :cond_0
    :try_start_1
    sget-object v3, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-static {p0, v2}, Lg10;->β(Ljava/lang/ClassLoader;Le10;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    :try_start_2
    new-instance v2, Leo1;

    .line 30
    .line 31
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p0, v2

    .line 35
    :goto_0
    instance-of v2, p0, Leo1;

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    move-object v2, p0

    .line 40
    check-cast v2, Ls62;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    sput-boolean v2, Lx10;->η:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception p0

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    const-string v2, "FeedGestureHook"

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const/4 v0, 0x4

    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-static {v2, p0, v3, v0, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    sget-boolean p0, Lx10;->η:Z

    .line 79
    .line 80
    if-eqz p0, :cond_3

    .line 81
    .line 82
    sget-object p0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 83
    .line 84
    invoke-static {v2}, Lg10;->ζ(Le10;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    sput-boolean p0, Lx10;->η:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    .line 90
    :cond_3
    :goto_2
    monitor-exit v1

    .line 91
    return-void

    .line 92
    :goto_3
    monitor-exit v1

    .line 93
    throw p0
.end method


# virtual methods
.method public final α()I
    .locals 0

    .line 1
    const/16 p0, 0x64

    .line 2
    .line 3
    return p0
.end method

.method public final β(Ljava/lang/Object;Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    const/4 p0, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move-object p1, v0

    .line 6
    goto :goto_4

    .line 7
    :cond_0
    instance-of v1, p1, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move-object v1, v0

    .line 16
    :goto_0
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lx10;->θ(Landroid/content/Context;)Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_4

    .line 27
    :cond_2
    :try_start_0
    const-string v1, "getContext"

    .line 28
    .line 29
    new-array v2, p0, [Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {p1, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    instance-of v1, p1, Landroid/content/Context;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    check-cast p1, Landroid/content/Context;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    move-object p1, v0

    .line 45
    :goto_1
    invoke-static {p1}, Lx10;->θ(Landroid/content/Context;)Landroid/app/Activity;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_3

    .line 50
    :goto_2
    new-instance v1, Leo1;

    .line 51
    .line 52
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v1

    .line 56
    :goto_3
    instance-of v1, p1, Leo1;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    move-object p1, v0

    .line 61
    :cond_4
    check-cast p1, Landroid/app/Activity;

    .line 62
    .line 63
    :goto_4
    if-nez p1, :cond_6

    .line 64
    .line 65
    invoke-static {p2}, Lx10;->ι(Landroid/view/MotionEvent;)Lw10;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    iget-object p1, p1, Lw10;->α:Ljava/lang/ref/WeakReference;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Landroid/app/Activity;

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_5
    move-object p1, v0

    .line 81
    :goto_5
    if-nez p1, :cond_6

    .line 82
    .line 83
    goto/16 :goto_14

    .line 84
    .line 85
    :cond_6
    invoke-static {p1}, Lx10;->ζ(Landroid/app/Activity;)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lui1;->Α()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_7

    .line 93
    .line 94
    goto/16 :goto_14

    .line 95
    .line 96
    :cond_7
    const-string v1, "gesture_enabled"

    .line 97
    .line 98
    invoke-static {v1, p0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_8

    .line 103
    .line 104
    goto/16 :goto_14

    .line 105
    .line 106
    :cond_8
    invoke-static {p1}, Lx10;->κ(Landroid/app/Activity;)Lv10;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const/4 v2, 0x1

    .line 111
    invoke-static {p1, v1, v2}, Lx10;->μ(Landroid/app/Activity;Lv10;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_9

    .line 116
    .line 117
    goto/16 :goto_14

    .line 118
    .line 119
    :cond_9
    invoke-static {p2}, Lx10;->ι(Landroid/view/MotionEvent;)Lw10;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-eqz v3, :cond_a

    .line 124
    .line 125
    iget-object v4, v3, Lw10;->α:Ljava/lang/ref/WeakReference;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    if-ne v4, p1, :cond_a

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_a
    move-object v3, v0

    .line 135
    :goto_6
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    if-eqz v4, :cond_b

    .line 140
    .line 141
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    goto :goto_7

    .line 146
    :cond_b
    move-object v4, v0

    .line 147
    :goto_7
    if-eqz v4, :cond_d

    .line 148
    .line 149
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    if-lez v5, :cond_c

    .line 158
    .line 159
    goto :goto_8

    .line 160
    :cond_c
    move-object v6, v0

    .line 161
    :goto_8
    if-eqz v6, :cond_d

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    :goto_9
    int-to-float v5, v5

    .line 168
    goto :goto_a

    .line 169
    :cond_d
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 178
    .line 179
    goto :goto_9

    .line 180
    :goto_a
    if-eqz v4, :cond_f

    .line 181
    .line 182
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    if-lez v6, :cond_e

    .line 191
    .line 192
    goto :goto_b

    .line 193
    :cond_e
    move-object v7, v0

    .line 194
    :goto_b
    if-eqz v7, :cond_f

    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    :goto_c
    int-to-float v6, v6

    .line 201
    goto :goto_d

    .line 202
    :cond_f
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 211
    .line 212
    goto :goto_c

    .line 213
    :goto_d
    const/4 v7, 0x2

    .line 214
    new-array v7, v7, [I

    .line 215
    .line 216
    if-eqz v4, :cond_10

    .line 217
    .line 218
    :try_start_1
    invoke-virtual {v4, v7}, Landroid/view/View;->getLocationOnScreen([I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 219
    .line 220
    .line 221
    :catchall_1
    :cond_10
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 222
    .line 223
    .line 224
    if-eqz p2, :cond_12

    .line 225
    .line 226
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    cmpg-float v8, v8, v4

    .line 239
    .line 240
    if-gtz v8, :cond_11

    .line 241
    .line 242
    goto :goto_e

    .line 243
    :cond_11
    move-object v9, v0

    .line 244
    :goto_e
    if-nez v9, :cond_14

    .line 245
    .line 246
    :cond_12
    if-eqz v3, :cond_13

    .line 247
    .line 248
    iget v8, v3, Lw10;->β:F

    .line 249
    .line 250
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    cmpg-float v8, v8, v4

    .line 259
    .line 260
    if-gtz v8, :cond_13

    .line 261
    .line 262
    goto :goto_f

    .line 263
    :cond_13
    move-object v9, v0

    .line 264
    :cond_14
    :goto_f
    if-eqz p2, :cond_16

    .line 265
    .line 266
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    cmpg-float v8, v8, v4

    .line 279
    .line 280
    if-gtz v8, :cond_15

    .line 281
    .line 282
    goto :goto_10

    .line 283
    :cond_15
    move-object v10, v0

    .line 284
    :goto_10
    if-nez v10, :cond_18

    .line 285
    .line 286
    :cond_16
    if-eqz v3, :cond_17

    .line 287
    .line 288
    iget v3, v3, Lw10;->γ:F

    .line 289
    .line 290
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    cmpg-float v3, v3, v4

    .line 299
    .line 300
    if-gtz v3, :cond_17

    .line 301
    .line 302
    goto :goto_11

    .line 303
    :cond_17
    move-object v10, v0

    .line 304
    :cond_18
    :goto_11
    const/4 v3, 0x0

    .line 305
    if-eqz v9, :cond_19

    .line 306
    .line 307
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    aget v8, v7, p0

    .line 312
    .line 313
    int-to-float v8, v8

    .line 314
    sub-float/2addr v4, v8

    .line 315
    goto :goto_12

    .line 316
    :cond_19
    if-eqz p2, :cond_1a

    .line 317
    .line 318
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    goto :goto_12

    .line 323
    :cond_1a
    move v4, v3

    .line 324
    :goto_12
    invoke-static {v4, v3, v5}, Lj81;->λ(FFF)F

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v10, :cond_1b

    .line 329
    .line 330
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 331
    .line 332
    .line 333
    move-result p2

    .line 334
    aget v7, v7, v2

    .line 335
    .line 336
    int-to-float v7, v7

    .line 337
    sub-float/2addr p2, v7

    .line 338
    goto :goto_13

    .line 339
    :cond_1b
    if-eqz p2, :cond_1c

    .line 340
    .line 341
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 342
    .line 343
    .line 344
    move-result p2

    .line 345
    goto :goto_13

    .line 346
    :cond_1c
    move p2, v3

    .line 347
    :goto_13
    invoke-static {p2, v3, v6}, Lj81;->λ(FFF)F

    .line 348
    .line 349
    .line 350
    move-result p2

    .line 351
    sget-object v3, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 352
    .line 353
    invoke-static {}, Li2;->σ()Lw90;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-static {v4, p2, v5, v6, v3}, Li2;->π(FFFFLw90;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    const-string v7, "double_tap"

    .line 362
    .line 363
    invoke-static {v3, v7}, Lx10;->ξ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-static {v7}, Li2;->ρ(Ljava/lang/String;)Z

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    const/4 v9, 0x4

    .line 372
    const-string v10, "FeedGestureHook"

    .line 373
    .line 374
    if-nez v8, :cond_1d

    .line 375
    .line 376
    const-string p1, "\u5bbf\u4e3b\u53cc\u51fb\u653e\u884c area="

    .line 377
    .line 378
    const-string p2, " source=decor action="

    .line 379
    .line 380
    invoke-static {p1, v3, p2, v7}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-static {v10, p1, v0, v9, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    goto :goto_14

    .line 388
    :cond_1d
    float-to-int p0, v4

    .line 389
    float-to-int p2, p2

    .line 390
    float-to-int v4, v5

    .line 391
    float-to-int v5, v6

    .line 392
    const-string v6, " source=decor pos=("

    .line 393
    .line 394
    const-string v8, ","

    .line 395
    .line 396
    const-string v11, "\u62e6\u622a\u5bbf\u4e3b\u53cc\u51fb\u70b9\u8d5e area="

    .line 397
    .line 398
    invoke-static {p0, v11, v3, v6, v8}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    const-string v3, ") size="

    .line 403
    .line 404
    const-string v6, "x"

    .line 405
    .line 406
    invoke-static {p0, p2, v3, v4, v6}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    const-string p2, " action="

    .line 413
    .line 414
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    invoke-static {v10, p0, v0, v9, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    invoke-static {v1}, Lx10;->ε(Lv10;)V

    .line 428
    .line 429
    .line 430
    invoke-static {p1, v7}, Lx10;->η(Landroid/app/Activity;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    move p0, v2

    .line 434
    :goto_14
    return p0
.end method

.method public final γ(Landroid/app/Activity;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-static {p1}, Lx10;->ζ(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lx10;->κ(Landroid/app/Activity;)Lv10;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v1

    .line 21
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    check-cast v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object v0, v1

    .line 29
    :goto_1
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    const-string v3, "dyhelper_gesture_position_preview"

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    invoke-static {p0}, Lx10;->ε(Lv10;)V

    .line 42
    .line 43
    .line 44
    return v2

    .line 45
    :cond_3
    :goto_2
    invoke-static {}, Lui1;->Α()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    invoke-static {p0}, Lx10;->ε(Lv10;)V

    .line 52
    .line 53
    .line 54
    return v2

    .line 55
    :cond_4
    const-string v0, "gesture_enabled"

    .line 56
    .line 57
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    invoke-static {p0}, Lx10;->ε(Lv10;)V

    .line 64
    .line 65
    .line 66
    return v2

    .line 67
    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v3, 0x5

    .line 72
    const/4 v4, 0x3

    .line 73
    const/4 v5, 0x1

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    if-eq v0, v5, :cond_6

    .line 77
    .line 78
    if-eq v0, v4, :cond_6

    .line 79
    .line 80
    if-eq v0, v3, :cond_6

    .line 81
    .line 82
    move v0, v2

    .line 83
    goto :goto_3

    .line 84
    :cond_6
    move v0, v5

    .line 85
    :goto_3
    invoke-static {p1, p0, v0}, Lx10;->μ(Landroid/app/Activity;Lv10;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_7

    .line 90
    .line 91
    invoke-static {p0}, Lx10;->ε(Lv10;)V

    .line 92
    .line 93
    .line 94
    return v2

    .line 95
    :cond_7
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_f

    .line 100
    .line 101
    if-eq v0, v5, :cond_d

    .line 102
    .line 103
    const/4 v1, 0x2

    .line 104
    if-eq v0, v1, :cond_b

    .line 105
    .line 106
    if-eq v0, v4, :cond_a

    .line 107
    .line 108
    if-eq v0, v3, :cond_8

    .line 109
    .line 110
    iget-boolean p0, p0, Lv10;->θ:Z

    .line 111
    .line 112
    return p0

    .line 113
    :cond_8
    iget-boolean p1, p0, Lv10;->α:Z

    .line 114
    .line 115
    if-eqz p1, :cond_18

    .line 116
    .line 117
    iget-boolean p1, p0, Lv10;->θ:Z

    .line 118
    .line 119
    if-eqz p1, :cond_9

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_9
    iput-boolean v5, p0, Lv10;->η:Z

    .line 123
    .line 124
    invoke-static {p0}, Lx10;->δ(Lv10;)V

    .line 125
    .line 126
    .line 127
    return v2

    .line 128
    :cond_a
    iget-boolean p1, p0, Lv10;->θ:Z

    .line 129
    .line 130
    invoke-static {p0}, Lx10;->ε(Lv10;)V

    .line 131
    .line 132
    .line 133
    return p1

    .line 134
    :cond_b
    iget-boolean v0, p0, Lv10;->α:Z

    .line 135
    .line 136
    if-eqz v0, :cond_18

    .line 137
    .line 138
    iget-boolean v0, p0, Lv10;->θ:Z

    .line 139
    .line 140
    if-eqz v0, :cond_c

    .line 141
    .line 142
    :goto_4
    return v5

    .line 143
    :cond_c
    iget v0, p0, Lv10;->β:F

    .line 144
    .line 145
    iget v1, p0, Lv10;->γ:F

    .line 146
    .line 147
    :try_start_0
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 152
    .line 153
    .line 154
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    goto :goto_5

    .line 156
    :catchall_0
    const/16 p1, 0x10

    .line 157
    .line 158
    :goto_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    sub-float/2addr v3, v0

    .line 163
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    sub-float/2addr p2, v1

    .line 168
    mul-float/2addr v3, v3

    .line 169
    mul-float/2addr p2, p2

    .line 170
    add-float/2addr p2, v3

    .line 171
    mul-int/2addr p1, p1

    .line 172
    int-to-float p1, p1

    .line 173
    cmpl-float p1, p2, p1

    .line 174
    .line 175
    if-lez p1, :cond_18

    .line 176
    .line 177
    iput-boolean v5, p0, Lv10;->η:Z

    .line 178
    .line 179
    invoke-static {p0}, Lx10;->δ(Lv10;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_d

    .line 183
    .line 184
    :cond_d
    iget-boolean p1, p0, Lv10;->α:Z

    .line 185
    .line 186
    if-eqz p1, :cond_18

    .line 187
    .line 188
    invoke-static {p0}, Lx10;->δ(Lv10;)V

    .line 189
    .line 190
    .line 191
    iget-boolean p1, p0, Lv10;->θ:Z

    .line 192
    .line 193
    if-eqz p1, :cond_e

    .line 194
    .line 195
    invoke-static {p0}, Lx10;->ε(Lv10;)V

    .line 196
    .line 197
    .line 198
    return v5

    .line 199
    :cond_e
    invoke-static {p0}, Lx10;->ε(Lv10;)V

    .line 200
    .line 201
    .line 202
    return v2

    .line 203
    :cond_f
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-eqz v0, :cond_10

    .line 208
    .line 209
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    goto :goto_6

    .line 214
    :cond_10
    move-object v0, v1

    .line 215
    :goto_6
    if-eqz v0, :cond_12

    .line 216
    .line 217
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    if-lez v3, :cond_11

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_11
    move-object v4, v1

    .line 229
    :goto_7
    if-eqz v4, :cond_12

    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    :goto_8
    int-to-float v3, v3

    .line 236
    goto :goto_9

    .line 237
    :cond_12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 246
    .line 247
    goto :goto_8

    .line 248
    :goto_9
    if-eqz v0, :cond_14

    .line 249
    .line 250
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    if-lez v0, :cond_13

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_13
    move-object v4, v1

    .line 262
    :goto_a
    if-eqz v4, :cond_14

    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    :goto_b
    int-to-float v0, v0

    .line 269
    goto :goto_c

    .line 270
    :cond_14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 279
    .line 280
    goto :goto_b

    .line 281
    :goto_c
    sget-object v4, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 282
    .line 283
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    invoke-static {}, Li2;->σ()Lw90;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-static {v4, v6, v3, v0, v7}, Li2;->π(FFFFLw90;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const-string v3, "long_press"

    .line 300
    .line 301
    invoke-static {v0, v3}, Lx10;->ξ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    const-string v4, "double_tap"

    .line 306
    .line 307
    invoke-static {v0, v4}, Lx10;->ξ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-static {v3}, Li2;->ρ(Ljava/lang/String;)Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    invoke-static {v4}, Li2;->ρ(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    const-string v8, " long="

    .line 320
    .line 321
    const-string v9, " ownsLong="

    .line 322
    .line 323
    const-string v10, "DOWN area="

    .line 324
    .line 325
    invoke-static {v10, v0, v8, v3, v9}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    const-string v9, " double="

    .line 333
    .line 334
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v4, " ownsDouble="

    .line 341
    .line 342
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    const/4 v8, 0x4

    .line 353
    const-string v9, "FeedGestureHook"

    .line 354
    .line 355
    invoke-static {v9, v4, v1, v8, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    invoke-static {p0}, Lx10;->ε(Lv10;)V

    .line 359
    .line 360
    .line 361
    if-nez v6, :cond_15

    .line 362
    .line 363
    if-nez v7, :cond_15

    .line 364
    .line 365
    goto :goto_d

    .line 366
    :cond_15
    iput-boolean v5, p0, Lv10;->α:Z

    .line 367
    .line 368
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    iput v1, p0, Lv10;->β:F

    .line 373
    .line 374
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    iput v1, p0, Lv10;->γ:F

    .line 379
    .line 380
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 381
    .line 382
    .line 383
    move-result-wide v4

    .line 384
    iput-wide v4, p0, Lv10;->δ:J

    .line 385
    .line 386
    if-nez v0, :cond_16

    .line 387
    .line 388
    const-string v0, ""

    .line 389
    .line 390
    :cond_16
    iput-object v0, p0, Lv10;->ε:Ljava/lang/String;

    .line 391
    .line 392
    iput-object v3, p0, Lv10;->ζ:Ljava/lang/String;

    .line 393
    .line 394
    iput-boolean v2, p0, Lv10;->η:Z

    .line 395
    .line 396
    iput-boolean v2, p0, Lv10;->θ:Z

    .line 397
    .line 398
    if-eqz v6, :cond_18

    .line 399
    .line 400
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 401
    .line 402
    .line 403
    move-result-object p2

    .line 404
    if-eqz p2, :cond_18

    .line 405
    .line 406
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 407
    .line 408
    .line 409
    move-result-object p2

    .line 410
    if-nez p2, :cond_17

    .line 411
    .line 412
    goto :goto_d

    .line 413
    :cond_17
    new-instance v0, Lum1;

    .line 414
    .line 415
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 416
    .line 417
    .line 418
    new-instance v1, Le9;

    .line 419
    .line 420
    const/16 v3, 0xc

    .line 421
    .line 422
    invoke-direct {v1, p0, v0, p1, v3}, Le9;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Landroid/app/Activity;I)V

    .line 423
    .line 424
    .line 425
    iput-object v1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 426
    .line 427
    iput-object p2, p0, Lv10;->ι:Landroid/view/View;

    .line 428
    .line 429
    iput-object v1, p0, Lv10;->κ:Ljava/lang/Runnable;

    .line 430
    .line 431
    sget-wide p0, Lx10;->β:J

    .line 432
    .line 433
    invoke-virtual {p2, v1, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 434
    .line 435
    .line 436
    :cond_18
    :goto_d
    return v2
.end method

.method public final λ(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    const-string v0, "Feed \u624b\u52bf Hook \u5b89\u88c5\u5931\u8d25: "

    .line 2
    .line 3
    const-string v1, "PublishGestureLauncher Hook \u5931\u8d25: "

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sput-object p1, Lx10;->ε:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    const/4 v3, 0x0

    .line 12
    :try_start_0
    sget-object v4, Lq10;->α:Lq10;

    .line 13
    .line 14
    invoke-virtual {v4, p1}, Lq10;->θ(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v4

    .line 19
    const-string v5, "FeedGestureHook"

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v6, "Feed \u539f\u751f\u4e92\u52a8\u52a8\u4f5c\u6865\u5b89\u88c5\u5931\u8d25: "

    .line 26
    .line 27
    invoke-static {v6, v4}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v5, v4, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-boolean v4, Lx10;->δ:Z

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    invoke-static {}, Lui1;->Α()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    monitor-enter p0

    .line 47
    :try_start_1
    sget-boolean v4, Lx10;->δ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    monitor-exit p0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :try_start_2
    new-instance v4, Lbb;

    .line 54
    .line 55
    const/16 v6, 0x19

    .line 56
    .line 57
    invoke-direct {v4, p1, v6}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 58
    .line 59
    .line 60
    sget-object v6, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 61
    .line 62
    invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    sput-boolean v5, Lx10;->δ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    .line 67
    monitor-exit p0

    .line 68
    goto :goto_1

    .line 69
    :catchall_1
    move-exception p1

    .line 70
    monitor-exit p0

    .line 71
    throw p1

    .line 72
    :cond_2
    :goto_1
    invoke-static {p1}, Lx10;->π(Ljava/lang/ClassLoader;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lx10;->ν()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    const-string p0, "FeedGestureHook"

    .line 82
    .line 83
    const-string p1, "\u624b\u52bf\u5173\u95ed\uff0c\u8df3\u8fc7\u9ad8\u9891 Hook \u5b89\u88c5"

    .line 84
    .line 85
    invoke-static {p0, p1, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    :try_start_3
    sget-object v4, Ll82;->α:Ll82;

    .line 90
    .line 91
    invoke-virtual {v4, p1}, Ll82;->δ(Ljava/lang/ClassLoader;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_2
    move-exception v4

    .line 96
    const-string v6, "FeedGestureHook"

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    const-string v7, "Feed \u500d\u901f\u64ad\u653e\u5668\u8fb9\u754c\u5b89\u88c5\u5931\u8d25\uff0c\u4fdd\u7559\u6309\u9700\u89e3\u6790\u964d\u7ea7: "

    .line 103
    .line 104
    invoke-static {v7, v4}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-static {v6, v4, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :goto_2
    :try_start_4
    sget-object v4, Lx00;->α:Lx00;

    .line 112
    .line 113
    invoke-virtual {v4, p1}, Lx00;->δ(Ljava/lang/ClassLoader;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :catchall_3
    move-exception v4

    .line 118
    const-string v6, "FeedGestureHook"

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    const-string v7, "\u5f53\u524d\u4f5c\u54c1\u9009\u4e2d\u6001 Hook \u5b89\u88c5\u5931\u8d25\uff0c\u4fdd\u7559 View \u626b\u63cf\u964d\u7ea7: "

    .line 125
    .line 126
    invoke-static {v7, v4}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-static {v6, v4, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    sget-boolean v4, Lx10;->γ:Z

    .line 134
    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    return-void

    .line 138
    :cond_4
    monitor-enter p0

    .line 139
    :try_start_5
    sget-boolean v4, Lx10;->γ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 140
    .line 141
    if-eqz v4, :cond_5

    .line 142
    .line 143
    monitor-exit p0

    .line 144
    return-void

    .line 145
    :cond_5
    :try_start_6
    sget-object v4, Ldk1;->α:Ldk1;

    .line 146
    .line 147
    invoke-virtual {v4, p1}, Ldk1;->κ(Ljava/lang/ClassLoader;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :catchall_4
    move-exception v4

    .line 152
    :try_start_7
    const-string v6, "FeedGestureHook"

    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    new-instance v7, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {v6, v1, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :goto_4
    sget-object v1, Lx10;->α:Lx10;

    .line 174
    .line 175
    const-string v4, "FeedGestureHook"

    .line 176
    .line 177
    sget-object v6, Lqe0;->α:Ljava/lang/Object;

    .line 178
    .line 179
    const-string v6, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F03474AEFAA0D9A94E4C21F0622A378CF61B87F8A576C81A592CCB282165A7"

    .line 180
    .line 181
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-static {p1, v6}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    if-nez v6, :cond_6

    .line 190
    .line 191
    const-string v6, "r1407920ef6e35873"

    .line 192
    .line 193
    invoke-static {v4, v6, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_6
    sget-object v7, Lxq0;->α:Lxq0;

    .line 198
    .line 199
    const-string v8, "dispatchTouchEvent"

    .line 200
    .line 201
    new-instance v9, Lf10;

    .line 202
    .line 203
    const v10, 0x7fffffff

    .line 204
    .line 205
    .line 206
    const/4 v11, 0x2

    .line 207
    invoke-direct {v9, v10, v11}, Lf10;-><init>(II)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v7, v6, v8, v9}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 211
    .line 212
    .line 213
    const-string v6, "\u5bbf\u4e3b Feed RootView \u89e6\u6478\u843d\u70b9\u8bb0\u5f55 Hook \u5df2\u5b89\u88c5"

    .line 214
    .line 215
    invoke-static {v4, v6, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :goto_5
    sget-object v4, Le30;->α:Le30;

    .line 219
    .line 220
    invoke-virtual {v4, p1}, Le30;->β(Ljava/lang/ClassLoader;)V

    .line 221
    .line 222
    .line 223
    sget-object p1, Le30;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 224
    .line 225
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-nez v4, :cond_7

    .line 230
    .line 231
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    :cond_7
    sput-boolean v5, Lx10;->γ:Z

    .line 235
    .line 236
    const-string p1, "FeedGestureHook"

    .line 237
    .line 238
    const-string v1, "Feed \u624b\u52bf Hook \u5df2\u6ce8\u518c\u5230\u7edf\u4e00\u89e6\u6478\u5206\u53d1\u5668"

    .line 239
    .line 240
    invoke-static {p1, v1, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 241
    .line 242
    .line 243
    goto :goto_6

    .line 244
    :catchall_5
    move-exception p1

    .line 245
    :try_start_8
    const-string v1, "FeedGestureHook"

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    new-instance v4, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-static {v1, p1, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 264
    .line 265
    .line 266
    :goto_6
    monitor-exit p0

    .line 267
    return-void

    .line 268
    :catchall_6
    move-exception p1

    .line 269
    monitor-exit p0

    .line 270
    throw p1
.end method
