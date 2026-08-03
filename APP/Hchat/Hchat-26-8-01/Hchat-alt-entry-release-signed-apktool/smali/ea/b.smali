.class public final Lea/b;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lea/b;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p2, Lga/a;->e:Ljava/util/HashSet;

    .line 7
    .line 8
    iput-object p1, p0, Lea/b;->b:Landroid/content/Context;

    .line 9
    .line 10
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object p2, Lha/h0;->e:Ljava/util/HashSet;

    .line 15
    .line 16
    iput-object p1, p0, Lea/b;->b:Landroid/content/Context;

    .line 17
    .line 18
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IZ)V
    .locals 0

    .line 23
    iput p2, p0, Lea/b;->a:I

    iput-object p1, p0, Lea/b;->b:Landroid/content/Context;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lea/b;->a:I

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "Hchat_status_text_limit_config"

    .line 14
    .line 15
    iget-object v1, p0, Lea/b;->b:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "status_text_limit_enable"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Li2/z;

    .line 49
    .line 50
    const/16 v3, 0x13

    .line 51
    .line 52
    invoke-direct {v1, v3}, Li2/z;-><init>(I)V

    .line 53
    .line 54
    .line 55
    new-instance v3, Lng/i;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-direct {v3, v0, v4, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lc9/k1;

    .line 62
    .line 63
    const/16 v1, 0x9

    .line 64
    .line 65
    invoke-direct {v0, p1, v1}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lng/i;

    .line 69
    .line 70
    invoke-direct {v1, v3, v4, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lng/h;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lng/h;-><init>(Lng/i;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_0
    invoke-virtual {v0}, Lng/h;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-virtual {v0}, Lng/h;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/lang/reflect/Field;

    .line 89
    .line 90
    const/16 v3, 0x7d0

    .line 91
    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v1, p1, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_2

    .line 101
    .line 102
    move v2, v4

    .line 103
    goto :goto_0

    .line 104
    :cond_3
    if-nez v2, :cond_4

    .line 105
    .line 106
    const-string p1, "[Hchat:StatusTextLimit] \u672a\u627e\u5230\u53ef\u4fee\u6539\u7684\u72b6\u6001\u8bcd\u957f\u5ea6\u5b57\u6bb5"

    .line 107
    .line 108
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    :goto_1
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    iget v0, p0, Lea/b;->a:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lea/b;->b:Landroid/content/Context;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v3

    .line 30
    :goto_0
    instance-of v6, v0, Ljava/lang/CharSequence;

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    check-cast v0, Ljava/lang/CharSequence;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v0, v3

    .line 38
    :goto_1
    if-eqz v0, :cond_15

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const-string v7, "<sysmsg"

    .line 45
    .line 46
    invoke-static {v6, v7, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_4

    .line 51
    .line 52
    const-string v8, "tmpl_type_profile"

    .line 53
    .line 54
    invoke-static {v6, v8, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_4

    .line 59
    .line 60
    const-string v8, " \u9000\u51fa\u4e86\u7fa4\u804a"

    .line 61
    .line 62
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-static {v6, v9, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-nez v9, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const-string v9, "username"

    .line 78
    .line 79
    invoke-static {v6, v9}, Lo9/c;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    const-string v10, "nickname"

    .line 84
    .line 85
    invoke-static {v6, v10}, Lo9/c;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    if-eqz v11, :cond_3

    .line 94
    .line 95
    move-object v10, v9

    .line 96
    :cond_3
    invoke-static {v10}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    if-nez v11, :cond_5

    .line 109
    .line 110
    :cond_4
    :goto_2
    move-object v1, v3

    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :cond_5
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-eqz v11, :cond_8

    .line 118
    .line 119
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-static {v9}, Lo9/c;->e(Ljava/lang/String;)Lo9/b;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    if-eqz v9, :cond_6

    .line 128
    .line 129
    iget-object v9, v9, Lo9/b;->a:Ljava/lang/String;

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move-object v9, v3

    .line 133
    :goto_3
    if-nez v9, :cond_7

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_7
    move-object v1, v9

    .line 137
    :goto_4
    move-object v9, v1

    .line 138
    :cond_8
    const-string v1, "("

    .line 139
    .line 140
    invoke-static {v10, v1, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    const-string v12, ")"

    .line 145
    .line 146
    if-eqz v11, :cond_9

    .line 147
    .line 148
    invoke-static {v10, v12, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    if-eqz v11, :cond_9

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_9
    const-string v11, "["

    .line 156
    .line 157
    invoke-static {v10, v11, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-eqz v11, :cond_a

    .line 162
    .line 163
    const-string v11, "]"

    .line 164
    .line 165
    invoke-static {v10, v11, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-eqz v11, :cond_a

    .line 170
    .line 171
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-static {v9}, Lo9/c;->e(Ljava/lang/String;)Lo9/b;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    if-eqz v9, :cond_b

    .line 180
    .line 181
    iget v11, v9, Lo9/b;->b:I

    .line 182
    .line 183
    sub-int/2addr v11, v2

    .line 184
    iget v13, v9, Lo9/b;->c:I

    .line 185
    .line 186
    add-int/2addr v13, v2

    .line 187
    iget-object v9, v9, Lo9/b;->a:Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {v1, v9, v12}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v10, v11, v13, v1}, Log/m;->C0(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    goto :goto_5

    .line 202
    :cond_a
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    if-nez v11, :cond_b

    .line 207
    .line 208
    invoke-static {v10, v1, v9, v12}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    :cond_b
    :goto_5
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    :goto_6
    if-nez v1, :cond_c

    .line 217
    .line 218
    const-string v8, "<_wc_custom_link_"

    .line 219
    .line 220
    invoke-static {v6, v8, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    if-nez v8, :cond_14

    .line 225
    .line 226
    invoke-static {v6, v7, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_c

    .line 231
    .line 232
    goto/16 :goto_c

    .line 233
    .line 234
    :cond_c
    if-eqz v1, :cond_d

    .line 235
    .line 236
    move-object v6, v1

    .line 237
    :cond_d
    const-string v2, "\u9000\u51fa\u4e86\u7fa4\u804a"

    .line 238
    .line 239
    const/4 v7, 0x6

    .line 240
    invoke-static {v7, v6, v2}, Log/m;->v0(ILjava/lang/String;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-gtz v2, :cond_e

    .line 245
    .line 246
    move-object v7, v3

    .line 247
    goto :goto_7

    .line 248
    :cond_e
    const/16 v7, 0x28

    .line 249
    .line 250
    const/16 v8, 0x29

    .line 251
    .line 252
    invoke-static {v6, v2, v7, v8}, Lo9/c;->a(Ljava/lang/String;ICC)Lo9/b;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    if-eqz v7, :cond_f

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_f
    const/16 v7, 0x5b

    .line 260
    .line 261
    const/16 v8, 0x5d

    .line 262
    .line 263
    invoke-static {v6, v2, v7, v8}, Lo9/c;->a(Ljava/lang/String;ICC)Lo9/b;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    :goto_7
    if-eqz v7, :cond_14

    .line 268
    .line 269
    const-string v2, "Hchat_group_leave_monitor_config"

    .line 270
    .line 271
    invoke-static {v4, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    const-string v4, "group_leave_monitor_enable"

    .line 276
    .line 277
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-nez v4, :cond_10

    .line 282
    .line 283
    goto :goto_c

    .line 284
    :cond_10
    const-string v4, "group_leave_monitor_wxid_color"

    .line 285
    .line 286
    const-string v6, "#576B95"

    .line 287
    .line 288
    invoke-interface {v2, v4, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-static {v2}, Lo9/c;->g(Ljava/lang/String;)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    if-eqz v2, :cond_11

    .line 297
    .line 298
    :goto_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    goto :goto_9

    .line 303
    :cond_11
    invoke-static {v6}, Lo9/c;->g(Ljava/lang/String;)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    if-eqz v2, :cond_14

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :goto_9
    if-eqz v1, :cond_12

    .line 311
    .line 312
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 313
    .line 314
    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 315
    .line 316
    .line 317
    move-object v3, v0

    .line 318
    goto :goto_a

    .line 319
    :cond_12
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 320
    .line 321
    invoke-direct {v1, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 322
    .line 323
    .line 324
    move-object v3, v1

    .line 325
    :goto_a
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    const-class v1, Landroid/text/style/ForegroundColorSpan;

    .line 330
    .line 331
    invoke-virtual {v3, v5, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    array-length v1, v0

    .line 339
    move v4, v5

    .line 340
    :goto_b
    if-ge v4, v1, :cond_13

    .line 341
    .line 342
    aget-object v6, v0, v4

    .line 343
    .line 344
    check-cast v6, Landroid/text/style/ForegroundColorSpan;

    .line 345
    .line 346
    invoke-virtual {v3, v6}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    add-int/lit8 v4, v4, 0x1

    .line 350
    .line 351
    goto :goto_b

    .line 352
    :cond_13
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 353
    .line 354
    invoke-direct {v0, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 355
    .line 356
    .line 357
    iget v1, v7, Lo9/b;->b:I

    .line 358
    .line 359
    iget v2, v7, Lo9/b;->c:I

    .line 360
    .line 361
    const v4, 0xff0021

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3, v0, v1, v2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 365
    .line 366
    .line 367
    :cond_14
    :goto_c
    if-eqz v3, :cond_15

    .line 368
    .line 369
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 370
    .line 371
    aput-object v3, p1, v5

    .line 372
    .line 373
    :cond_15
    return-void

    .line 374
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    sget-object v0, Lha/h0;->e:Ljava/util/HashSet;

    .line 378
    .line 379
    const-string v0, "Hchat_remove_moments_ads_config"

    .line 380
    .line 381
    invoke-static {v4, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    const-string v1, "remove_moments_ads_enable"

    .line 386
    .line 387
    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-nez v0, :cond_16

    .line 392
    .line 393
    goto :goto_d

    .line 394
    :cond_16
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    :goto_d
    return-void

    .line 398
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    sget-object v0, Lga/a;->e:Ljava/util/HashSet;

    .line 402
    .line 403
    const-string v0, "Hchat_skip_mini_program_video_ads_config"

    .line 404
    .line 405
    invoke-static {v4, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    const-string v1, "skip_mini_program_video_ads_enable"

    .line 410
    .line 411
    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-nez v0, :cond_17

    .line 416
    .line 417
    goto :goto_11

    .line 418
    :cond_17
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    const-string v1, "onVideoTimeUpdate"

    .line 428
    .line 429
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-nez v0, :cond_18

    .line 434
    .line 435
    goto :goto_11

    .line 436
    :cond_18
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {v2, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    instance-of v1, v0, Ljava/lang/String;

    .line 446
    .line 447
    if-eqz v1, :cond_19

    .line 448
    .line 449
    check-cast v0, Ljava/lang/String;

    .line 450
    .line 451
    goto :goto_e

    .line 452
    :cond_19
    move-object v0, v3

    .line 453
    :goto_e
    if-eqz v0, :cond_1b

    .line 454
    .line 455
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 456
    .line 457
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 458
    .line 459
    .line 460
    goto :goto_f

    .line 461
    :catchall_0
    move-exception v0

    .line 462
    new-instance v1, Lsf/f;

    .line 463
    .line 464
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 465
    .line 466
    .line 467
    :goto_f
    instance-of v0, v1, Lsf/f;

    .line 468
    .line 469
    if-eqz v0, :cond_1a

    .line 470
    .line 471
    goto :goto_10

    .line 472
    :cond_1a
    move-object v3, v1

    .line 473
    :goto_10
    check-cast v3, Lorg/json/JSONObject;

    .line 474
    .line 475
    if-eqz v3, :cond_1b

    .line 476
    .line 477
    const-string v0, "position"

    .line 478
    .line 479
    const/16 v1, 0x3c

    .line 480
    .line 481
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 482
    .line 483
    .line 484
    const-string v0, "duration"

    .line 485
    .line 486
    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 487
    .line 488
    .line 489
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 490
    .line 491
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    aput-object v0, p1, v2

    .line 496
    .line 497
    :cond_1b
    :goto_11
    return-void

    .line 498
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    sget-object v0, Lfa/a;->f:Ljava/util/HashSet;

    .line 502
    .line 503
    const-string v0, "Hchat_skip_global_mini_program_splash_ads_config"

    .line 504
    .line 505
    invoke-static {v4, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    const-string v1, "skip_global_mini_program_splash_ads_enable"

    .line 510
    .line 511
    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    if-eqz v0, :cond_1c

    .line 516
    .line 517
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 518
    .line 519
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    :cond_1c
    return-void

    .line 523
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    const-string v0, "Hchat_fake_mini_program_base_lib_config"

    .line 527
    .line 528
    invoke-static {v4, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    const-string v4, "fake_mini_program_base_lib_enable"

    .line 533
    .line 534
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-nez v0, :cond_1d

    .line 539
    .line 540
    goto :goto_12

    .line 541
    :cond_1d
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-static {v2, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    instance-of v0, p1, Lorg/json/JSONObject;

    .line 551
    .line 552
    if-eqz v0, :cond_1e

    .line 553
    .line 554
    move-object v3, p1

    .line 555
    check-cast v3, Lorg/json/JSONObject;

    .line 556
    .line 557
    :cond_1e
    if-eqz v3, :cond_20

    .line 558
    .line 559
    const-string p1, "url"

    .line 560
    .line 561
    invoke-virtual {v3, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    const-string v2, "https://support.weixin.qq.com/update"

    .line 569
    .line 570
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    if-nez v2, :cond_1f

    .line 575
    .line 576
    const-string v2, "https://support.weixin.qq.com/update/"

    .line 577
    .line 578
    invoke-static {v0, v2, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 579
    .line 580
    .line 581
    move-result v2

    .line 582
    if-nez v2, :cond_1f

    .line 583
    .line 584
    const-string v2, "https://szsupport.weixin.qq.com/update"

    .line 585
    .line 586
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v2

    .line 590
    if-nez v2, :cond_1f

    .line 591
    .line 592
    const-string v2, "https://szsupport.weixin.qq.com/update/"

    .line 593
    .line 594
    invoke-static {v0, v2, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-eqz v0, :cond_20

    .line 599
    .line 600
    :cond_1f
    invoke-virtual {v3, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 601
    .line 602
    .line 603
    :cond_20
    :goto_12
    return-void

    .line 604
    nop

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
