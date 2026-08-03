.class public final Lc9/b2;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr8/g;

.field public final synthetic c:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Lr8/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc9/b2;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lc9/b2;->c:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p2, p0, Lc9/b2;->b:Lr8/g;

    .line 7
    .line 8
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lo9/c;Lr8/g;Ljava/lang/reflect/Method;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lc9/b2;->a:I

    iput-object p2, p0, Lc9/b2;->b:Lr8/g;

    iput-object p3, p0, Lc9/b2;->c:Ljava/lang/reflect/Method;

    .line 12
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    iget v0, p0, Lc9/b2;->a:I

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
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 14
    .line 15
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Lc9/b2;->c:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    iget-object v1, p0, Lc9/b2;->b:Lr8/g;

    .line 20
    .line 21
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object v0, Lc9/d2;->q:Ljava/lang/Object;

    .line 37
    .line 38
    if-ne v0, p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sput-object p1, Lc9/d2;->q:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v1}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    iget v0, p0, Lc9/b2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

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
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    const-string v2, "weixin://weixinhongbao/hchat/group_leave_profile/"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    array-length v5, v0

    .line 25
    move v6, v3

    .line 26
    :goto_0
    if-lt v6, v5, :cond_1

    .line 27
    .line 28
    :goto_1
    move-object v7, v4

    .line 29
    goto :goto_4

    .line 30
    :cond_1
    aget-object v7, v0, v6

    .line 31
    .line 32
    if-nez v7, :cond_3

    .line 33
    .line 34
    :cond_2
    move-object v7, v1

    .line 35
    goto :goto_3

    .line 36
    :cond_3
    instance-of v8, v7, Ljava/lang/CharSequence;

    .line 37
    .line 38
    if-eqz v8, :cond_4

    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    goto :goto_3

    .line 45
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-static {v8, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-eqz v9, :cond_5

    .line 54
    .line 55
    move-object v7, v8

    .line 56
    goto :goto_3

    .line 57
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    :goto_2
    if-eqz v8, :cond_2

    .line 62
    .line 63
    const-class v9, Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-nez v9, :cond_2

    .line 70
    .line 71
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    :cond_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-eqz v10, :cond_7

    .line 84
    .line 85
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    check-cast v10, Ljava/lang/reflect/Field;

    .line 90
    .line 91
    invoke-static {v10, v7}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    if-eqz v10, :cond_6

    .line 96
    .line 97
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-static {v10, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_6

    .line 106
    .line 107
    move-object v7, v10

    .line 108
    goto :goto_3

    .line 109
    :cond_7
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    goto :goto_2

    .line 114
    :goto_3
    invoke-static {v7, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_17

    .line 119
    .line 120
    :goto_4
    if-eqz v7, :cond_16

    .line 121
    .line 122
    invoke-static {v7, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_8

    .line 127
    .line 128
    move-object v0, v1

    .line 129
    goto :goto_5

    .line 130
    :cond_8
    const/16 v0, 0x31

    .line 131
    .line 132
    invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-nez v0, :cond_9

    .line 141
    .line 142
    move-object v0, v1

    .line 143
    :cond_9
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :goto_5
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_a

    .line 156
    .line 157
    goto/16 :goto_e

    .line 158
    .line 159
    :cond_a
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 160
    .line 161
    if-eqz v2, :cond_d

    .line 162
    .line 163
    array-length v5, v2

    .line 164
    move v6, v3

    .line 165
    :goto_6
    if-ge v6, v5, :cond_c

    .line 166
    .line 167
    aget-object v7, v2, v6

    .line 168
    .line 169
    instance-of v8, v7, Landroid/view/View;

    .line 170
    .line 171
    if-eqz v8, :cond_b

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_c
    move-object v7, v4

    .line 178
    :goto_7
    if-eqz v7, :cond_d

    .line 179
    .line 180
    check-cast v7, Landroid/view/View;

    .line 181
    .line 182
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    if-eqz v2, :cond_d

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_d
    iget-object v2, p0, Lc9/b2;->b:Lr8/g;

    .line 190
    .line 191
    iget-object v2, v2, Lr8/g;->a:Landroid/content/Context;

    .line 192
    .line 193
    :goto_8
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_e

    .line 198
    .line 199
    goto :goto_d

    .line 200
    :cond_e
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    if-eqz v5, :cond_f

    .line 205
    .line 206
    invoke-virtual {v5}, Lq8/m;->a()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    goto :goto_9

    .line 211
    :cond_f
    move-object v5, v4

    .line 212
    :goto_9
    if-nez v5, :cond_10

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :cond_10
    move-object v1, v5

    .line 216
    :goto_a
    new-instance v5, Landroid/content/Intent;

    .line 217
    .line 218
    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 219
    .line 220
    .line 221
    new-instance v6, Landroid/content/ComponentName;

    .line 222
    .line 223
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    const-string v8, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    .line 228
    .line 229
    invoke-direct {v6, v7, v8}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 233
    .line 234
    .line 235
    const-string v6, "Contact_User"

    .line 236
    .line 237
    invoke-virtual {v5, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 238
    .line 239
    .line 240
    const-string v0, "@chatroom"

    .line 241
    .line 242
    invoke-static {v1, v0, v3}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    const-string v6, "Contact_Scene"

    .line 247
    .line 248
    if-nez v0, :cond_12

    .line 249
    .line 250
    const-string v0, "@im.chatroom"

    .line 251
    .line 252
    invoke-static {v1, v0, v3}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_11

    .line 257
    .line 258
    goto :goto_b

    .line 259
    :cond_11
    const/4 v0, 0x3

    .line 260
    invoke-virtual {v5, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 261
    .line 262
    .line 263
    goto :goto_c

    .line 264
    :cond_12
    :goto_b
    const-string v0, "Contact_ChatRoomId"

    .line 265
    .line 266
    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 267
    .line 268
    .line 269
    const-string v0, "room_name"

    .line 270
    .line 271
    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 272
    .line 273
    .line 274
    const/16 v0, 0xe

    .line 275
    .line 276
    invoke-virtual {v5, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 277
    .line 278
    .line 279
    :goto_c
    instance-of v0, v2, Landroid/app/Activity;

    .line 280
    .line 281
    if-nez v0, :cond_13

    .line 282
    .line 283
    const/high16 v0, 0x10000000

    .line 284
    .line 285
    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 286
    .line 287
    .line 288
    :cond_13
    :try_start_0
    invoke-virtual {v2, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    .line 290
    .line 291
    :catchall_0
    :goto_d
    iget-object v0, p0, Lc9/b2;->c:Ljava/lang/reflect/Method;

    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 298
    .line 299
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-nez v1, :cond_14

    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    const-class v1, Ljava/lang/Boolean;

    .line 310
    .line 311
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_15

    .line 316
    .line 317
    :cond_14
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 318
    .line 319
    :cond_15
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    :cond_16
    :goto_e
    return-void

    .line 323
    :cond_17
    add-int/lit8 v6, v6, 0x1

    .line 324
    .line 325
    goto/16 :goto_0

    .line 326
    .line 327
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
