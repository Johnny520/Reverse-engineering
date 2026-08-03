.class public final Lcb/d;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcb/f;


# direct methods
.method public synthetic constructor <init>(Lcb/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcb/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcb/d;->b:Lcb/f;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Lcb/d;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcb/d;->b:Lcb/f;

    .line 10
    .line 11
    iget-object v0, v0, Lcb/f;->b:Lr8/g;

    .line 12
    .line 13
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 14
    .line 15
    const-string v2, "Hchat_round_avatar_config"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v3, "round_avatar_enable"

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    array-length v1, p1

    .line 37
    :goto_0
    const/4 v3, 0x0

    .line 38
    if-ge v4, v1, :cond_2

    .line 39
    .line 40
    aget-object v5, p1, v4

    .line 41
    .line 42
    instance-of v6, v5, Landroid/app/Notification;

    .line 43
    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v5, v3

    .line 51
    :goto_1
    instance-of p1, v5, Landroid/app/Notification;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    move-object v3, v5

    .line 56
    check-cast v3, Landroid/app/Notification;

    .line 57
    .line 58
    :cond_3
    if-eqz v3, :cond_4

    .line 59
    .line 60
    iget-object p1, v3, Landroid/app/Notification;->largeIcon:Landroid/graphics/Bitmap;

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    sget-object v1, Lcb/b;->a:Lcb/b;

    .line 65
    .line 66
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 67
    .line 68
    invoke-static {v0, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v2, "round_avatar_radius_factor"

    .line 73
    .line 74
    const/high16 v4, 0x3f000000    # 0.5f

    .line 75
    .line 76
    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const v2, 0x3dcccccd    # 0.1f

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v2, v4}, Lr9/e0;->q(FFF)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    const/high16 v2, 0x42c80000    # 100.0f

    .line 88
    .line 89
    mul-float/2addr v0, v2

    .line 90
    invoke-static {v0}, Lig/a;->X(F)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    int-to-float v0, v0

    .line 95
    div-float/2addr v0, v2

    .line 96
    invoke-virtual {v1, p1, v0}, Lcb/b;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, v3, Landroid/app/Notification;->largeIcon:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    :cond_4
    :goto_2
    return-void

    .line 103
    :pswitch_0
    iget-object v0, p0, Lcb/d;->b:Lcb/f;

    .line 104
    .line 105
    iget-object v0, v0, Lcb/f;->b:Lr8/g;

    .line 106
    .line 107
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 108
    .line 109
    const-string v2, "Hchat_round_avatar_config"

    .line 110
    .line 111
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v3, "round_avatar_enable"

    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_5

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v1}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    instance-of v3, v1, Landroid/graphics/drawable/Icon;

    .line 135
    .line 136
    const/4 v5, 0x0

    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    check-cast v1, Landroid/graphics/drawable/Icon;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    move-object v1, v5

    .line 143
    :goto_3
    if-eqz v1, :cond_8

    .line 144
    .line 145
    const-string v3, "getBitmap"

    .line 146
    .line 147
    new-array v6, v4, [Ljava/lang/Object;

    .line 148
    .line 149
    invoke-static {v1, v3, v6}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    instance-of v3, v1, Landroid/graphics/Bitmap;

    .line 154
    .line 155
    if-eqz v3, :cond_7

    .line 156
    .line 157
    move-object v5, v1

    .line 158
    check-cast v5, Landroid/graphics/Bitmap;

    .line 159
    .line 160
    :cond_7
    if-eqz v5, :cond_8

    .line 161
    .line 162
    sget-object v1, Lcb/b;->a:Lcb/b;

    .line 163
    .line 164
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 165
    .line 166
    invoke-static {v0, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-string v2, "round_avatar_radius_factor"

    .line 171
    .line 172
    const/high16 v3, 0x3f000000    # 0.5f

    .line 173
    .line 174
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    const v2, 0x3dcccccd    # 0.1f

    .line 179
    .line 180
    .line 181
    invoke-static {v0, v2, v3}, Lr9/e0;->q(FFF)F

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    const/high16 v2, 0x42c80000    # 100.0f

    .line 186
    .line 187
    mul-float/2addr v0, v2

    .line 188
    invoke-static {v0}, Lig/a;->X(F)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    int-to-float v0, v0

    .line 193
    div-float/2addr v0, v2

    .line 194
    invoke-virtual {v1, v5, v0}, Lcb/b;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-eq v0, v5, :cond_8

    .line 199
    .line 200
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 201
    .line 202
    invoke-static {v0}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    aput-object v0, p1, v4

    .line 207
    .line 208
    :cond_8
    :goto_4
    return-void

    .line 209
    :pswitch_1
    iget-object v0, p0, Lcb/d;->b:Lcb/f;

    .line 210
    .line 211
    iget-object v0, v0, Lcb/f;->b:Lr8/g;

    .line 212
    .line 213
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 214
    .line 215
    const-string v2, "Hchat_round_avatar_config"

    .line 216
    .line 217
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    const-string v3, "round_avatar_enable"

    .line 222
    .line 223
    const/4 v4, 0x0

    .line 224
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_9

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_9
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v1}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    instance-of v3, v1, Landroid/graphics/Bitmap;

    .line 241
    .line 242
    if-eqz v3, :cond_a

    .line 243
    .line 244
    check-cast v1, Landroid/graphics/Bitmap;

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_a
    const/4 v1, 0x0

    .line 248
    :goto_5
    if-eqz v1, :cond_b

    .line 249
    .line 250
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 251
    .line 252
    sget-object v3, Lcb/b;->a:Lcb/b;

    .line 253
    .line 254
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 255
    .line 256
    invoke-static {v0, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const-string v2, "round_avatar_radius_factor"

    .line 261
    .line 262
    const/high16 v5, 0x3f000000    # 0.5f

    .line 263
    .line 264
    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    const v2, 0x3dcccccd    # 0.1f

    .line 269
    .line 270
    .line 271
    invoke-static {v0, v2, v5}, Lr9/e0;->q(FFF)F

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    const/high16 v2, 0x42c80000    # 100.0f

    .line 276
    .line 277
    mul-float/2addr v0, v2

    .line 278
    invoke-static {v0}, Lig/a;->X(F)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    int-to-float v0, v0

    .line 283
    div-float/2addr v0, v2

    .line 284
    invoke-virtual {v3, v1, v0}, Lcb/b;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    aput-object v0, p1, v4

    .line 289
    .line 290
    :cond_b
    :goto_6
    return-void

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
