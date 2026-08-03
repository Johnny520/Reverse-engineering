.class public final synthetic Lh9/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh9/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh9/c;->h:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lh9/c;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Hchat_fake_location_config"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    iget-object v5, p0, Lh9/c;->h:Landroid/content/Context;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    invoke-static {}, Lx8/q;->i()V

    .line 17
    .line 18
    .line 19
    const-string v0, "\u5c0f\u667a\u4e0a\u4e0b\u6587\u5df2\u6e05\u7a7a"

    .line 20
    .line 21
    invoke-static {v5, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 26
    .line 27
    .line 28
    return-object v4

    .line 29
    :pswitch_0
    sget-object v0, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    invoke-static {}, Lx8/q;->i()V

    .line 32
    .line 33
    .line 34
    const-string v0, "AI \u4e0a\u4e0b\u6587\u5df2\u6e05\u7a7a"

    .line 35
    .line 36
    invoke-static {v5, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 41
    .line 42
    .line 43
    return-object v4

    .line 44
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    .line 45
    .line 46
    const-string v1, "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/high16 v1, 0x10000000

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v5, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    move-object v1, v4

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    new-instance v1, Lsf/f;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    const-string v0, "\u65e0\u6cd5\u6253\u5f00\u7535\u6c60\u4f18\u5316\u8bbe\u7f6e"

    .line 74
    .line 75
    invoke-static {v5, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 80
    .line 81
    .line 82
    :cond_0
    return-object v4

    .line 83
    :pswitch_2
    const-string v0, "https://t.me/Hchat_Group"

    .line 84
    .line 85
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v4

    .line 89
    :pswitch_3
    const-string v0, "https://t.me/Hchat_ci"

    .line 90
    .line 91
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v4

    .line 95
    :pswitch_4
    const-string v0, "https://github.com/YunJavaPro/Silk-Codec-Android"

    .line 96
    .line 97
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v4

    .line 101
    :pswitch_5
    const-string v0, "https://github.com/CopyLibs/BeanShell-Android"

    .line 102
    .line 103
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v4

    .line 107
    :pswitch_6
    const-string v0, "https://github.com/compose-miuix-ui/miuix"

    .line 108
    .line 109
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v4

    .line 113
    :pswitch_7
    const-string v0, "https://github.com/LSPosed/LSPosed"

    .line 114
    .line 115
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-object v4

    .line 119
    :pswitch_8
    const-string v0, "https://github.com/Xposed-Modules-Repo/top.hookvip.wxtablet"

    .line 120
    .line 121
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v4

    .line 125
    :pswitch_9
    const-string v0, "https://github.com/BillyWei01/FastKV"

    .line 126
    .line 127
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v4

    .line 131
    :pswitch_a
    const-string v0, "https://github.com/LuckyPray/DexKit"

    .line 132
    .line 133
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v4

    .line 137
    :pswitch_b
    const-string v0, "https://github.com/HighCapable/KavaRef"

    .line 138
    .line 139
    invoke-static {v5, v0}, Lwb/ho;->v6(Landroid/content/Context;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v4

    .line 143
    :pswitch_c
    invoke-static {v5, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v2, "fake_location_longitude"

    .line 148
    .line 149
    const-string v3, "121.469170"

    .line 150
    .line 151
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-eqz v0, :cond_2

    .line 156
    .line 157
    invoke-static {v0}, Log/s;->U(Ljava/lang/String;)Ljava/lang/Double;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_2

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 164
    .line 165
    .line 166
    move-result-wide v4

    .line 167
    const-wide v6, -0x3f99800000000000L    # -180.0

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    cmpg-double v2, v6, v4

    .line 173
    .line 174
    if-gtz v2, :cond_1

    .line 175
    .line 176
    const-wide v6, 0x4066800000000000L    # 180.0

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    cmpg-double v2, v4, v6

    .line 182
    .line 183
    if-gtz v2, :cond_1

    .line 184
    .line 185
    move-object v1, v0

    .line 186
    :cond_1
    if-eqz v1, :cond_2

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 189
    .line 190
    .line 191
    move-result-wide v0

    .line 192
    goto :goto_1

    .line 193
    :cond_2
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 194
    .line 195
    .line 196
    move-result-wide v0

    .line 197
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    :pswitch_d
    invoke-static {v5, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-string v2, "fake_location_latitude"

    .line 207
    .line 208
    const-string v3, "31.224361"

    .line 209
    .line 210
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-eqz v0, :cond_4

    .line 215
    .line 216
    invoke-static {v0}, Log/s;->U(Ljava/lang/String;)Ljava/lang/Double;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_4

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 223
    .line 224
    .line 225
    move-result-wide v4

    .line 226
    const-wide v6, -0x3fa9800000000000L    # -90.0

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    cmpg-double v2, v6, v4

    .line 232
    .line 233
    if-gtz v2, :cond_3

    .line 234
    .line 235
    const-wide v6, 0x4056800000000000L    # 90.0

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    cmpg-double v2, v4, v6

    .line 241
    .line 242
    if-gtz v2, :cond_3

    .line 243
    .line 244
    move-object v1, v0

    .line 245
    :cond_3
    if-eqz v1, :cond_4

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 248
    .line 249
    .line 250
    move-result-wide v0

    .line 251
    goto :goto_2

    .line 252
    :cond_4
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 253
    .line 254
    .line 255
    move-result-wide v0

    .line 256
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    return-object v0

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
