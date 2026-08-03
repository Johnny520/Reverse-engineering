.class public final Lq8/d;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq8/h;


# direct methods
.method public synthetic constructor <init>(Lq8/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq8/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lq8/d;->b:Lq8/h;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lq8/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    iget-object v0, p0, Lq8/d;->b:Lq8/h;

    .line 11
    .line 12
    iget-object v0, v0, Lq8/h;->c:Le8/c;

    .line 13
    .line 14
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Landroid/app/Activity;

    .line 17
    .line 18
    :try_start_0
    iget-object v1, v0, Le8/c;->f:Ljava/lang/Class;

    .line 19
    .line 20
    const-class v2, Landroid/content/Context;

    .line 21
    .line 22
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v1, v2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v1, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, v0, Le8/c;->g:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    const-string v3, "Hchat_settings"

    .line 41
    .line 42
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v2, v1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object v2, v0, Le8/c;->h:Ljava/lang/reflect/Method;

    .line 50
    .line 51
    const-string v3, "Hchat"

    .line 52
    .line 53
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v2, v1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    const-string v2, "getPreferenceScreen"

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    new-array v4, v3, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {p1, v2, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v0, v0, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 70
    .line 71
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v0, p1, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v1, "[Hchat:SettingsInjector] [Legacy] \u63d2\u5165\u5931\u8d25: "

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    return-void

    .line 95
    :pswitch_2
    iget-object v0, p0, Lq8/d;->b:Lq8/h;

    .line 96
    .line 97
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {v0, p1}, Lq8/h;->a(Lq8/h;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_3
    iget-object v0, p0, Lq8/d;->b:Lq8/h;

    .line 104
    .line 105
    :try_start_1
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 106
    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    array-length v1, v1

    .line 110
    const/4 v2, 0x1

    .line 111
    if-ge v1, v2, :cond_0

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    instance-of v2, v1, Landroid/view/View;

    .line 119
    .line 120
    if-nez v2, :cond_1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 124
    .line 125
    const/4 v3, 0x0

    .line 126
    aget-object v2, v2, v3

    .line 127
    .line 128
    check-cast v2, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-static {v0, p1}, Lq8/h;->d(Lq8/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {v0, p1, v2}, Lq8/h;->f(Lq8/h;Ljava/lang/Object;I)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    const/high16 v0, -0x80000000

    .line 145
    .line 146
    if-ne p1, v0, :cond_2

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    check-cast v1, Landroid/view/View;

    .line 150
    .line 151
    invoke-static {v1, p1}, Lq8/h;->b(Landroid/view/View;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_1
    move-exception p1

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v1, "[Hchat:SettingsInjector] [PlusMenu] \u8bbe\u7f6e\u83dc\u5355\u56fe\u6807\u5931\u8d25: "

    .line 159
    .line 160
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :cond_3
    :goto_1
    return-void

    .line 167
    :pswitch_4
    :try_start_2
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    instance-of v0, v0, Landroid/widget/BaseAdapter;

    .line 172
    .line 173
    if-eqz v0, :cond_4

    .line 174
    .line 175
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Landroid/widget/BaseAdapter;

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :catchall_2
    move-exception p1

    .line 183
    goto :goto_3

    .line 184
    :cond_4
    const/4 v0, 0x0

    .line 185
    :goto_2
    iget-object v1, p0, Lq8/d;->b:Lq8/h;

    .line 186
    .line 187
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-virtual {v1, p1, v0}, Lq8/h;->h(Ljava/lang/Object;Landroid/widget/BaseAdapter;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    const-string v1, "[Hchat:SettingsInjector] [PlusMenu] \u6dfb\u52a0\u5165\u53e3\u5931\u8d25: "

    .line 196
    .line 197
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    :goto_4
    return-void

    .line 204
    :pswitch_5
    :try_start_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 205
    .line 206
    instance-of v0, p1, Landroid/view/View;

    .line 207
    .line 208
    if-eqz v0, :cond_5

    .line 209
    .line 210
    check-cast p1, Landroid/view/View;

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_5
    if-eqz p1, :cond_7

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const-string v1, "HomeUI$PlusActionView"

    .line 220
    .line 221
    :goto_5
    if-eqz v0, :cond_7

    .line 222
    .line 223
    const-class v2, Ljava/lang/Object;

    .line 224
    .line 225
    if-eq v0, v2, :cond_7

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 235
    if-eqz v2, :cond_6

    .line 236
    .line 237
    :try_start_4
    const-string v0, "h"

    .line 238
    .line 239
    const/4 v1, 0x0

    .line 240
    new-array v1, v1, [Ljava/lang/Object;

    .line 241
    .line 242
    invoke-static {p1, v0, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    instance-of v0, p1, Landroid/view/View;

    .line 247
    .line 248
    if-eqz v0, :cond_7

    .line 249
    .line 250
    check-cast p1, Landroid/view/View;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_6
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    goto :goto_5

    .line 258
    :catchall_3
    :cond_7
    const/4 p1, 0x0

    .line 259
    :goto_6
    if-nez p1, :cond_8

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 263
    .line 264
    const v1, -0x48435852

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-virtual {v0, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-eqz v2, :cond_9

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_9
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    new-instance v0, Lq8/c;

    .line 282
    .line 283
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 287
    .line 288
    .line 289
    goto :goto_7

    .line 290
    :catchall_4
    move-exception p1

    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    const-string v1, "[Hchat:SettingsInjector] [PlusLongPress] \u7ed1\u5b9a\u52a0\u53f7\u5165\u53e3\u5931\u8d25: "

    .line 294
    .line 295
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    :goto_7
    return-void

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Lq8/d;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    iget-object v0, p0, Lq8/d;->b:Lq8/h;

    .line 11
    .line 12
    :try_start_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x2

    .line 16
    if-ge v2, v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x1

    .line 20
    aget-object v1, v1, v2

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v0, v0, Lq8/h;->c:Le8/c;

    .line 26
    .line 27
    iget-object v0, v0, Le8/c;->i:Ljava/lang/reflect/Method;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    new-array v3, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v0, v1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/String;

    .line 37
    .line 38
    const-string v1, "Hchat_settings"

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Landroid/app/Activity;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-static {v0, v1, v2}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :catchall_0
    :cond_2
    :goto_0
    return-void

    .line 63
    :sswitch_1
    iget-object v0, p0, Lq8/d;->b:Lq8/h;

    .line 64
    .line 65
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v0, p1}, Lq8/h;->a(Lq8/h;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :sswitch_2
    iget-object v0, p0, Lq8/d;->b:Lq8/h;

    .line 72
    .line 73
    :try_start_1
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 74
    .line 75
    if-eqz v1, :cond_9

    .line 76
    .line 77
    array-length v2, v1

    .line 78
    const/4 v3, 0x3

    .line 79
    if-ge v2, v3, :cond_3

    .line 80
    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :cond_3
    const/4 v2, 0x2

    .line 84
    aget-object v1, v1, v2

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v0, v2, v1}, Lq8/h;->f(Lq8/h;Ljava/lang/Object;I)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    const/high16 v2, -0x80000000

    .line 99
    .line 100
    if-ne v1, v2, :cond_4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    const/4 v2, 0x0

    .line 104
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    :try_start_2
    const-string v5, "a"

    .line 111
    .line 112
    new-array v6, v4, [Ljava/lang/Object;

    .line 113
    .line 114
    invoke-static {v3, v5, v6}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 119
    .line 120
    .line 121
    :catchall_1
    const v3, -0x48435850

    .line 122
    .line 123
    .line 124
    if-ne v1, v3, :cond_5

    .line 125
    .line 126
    :try_start_3
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    .line 131
    .line 132
    .line 133
    invoke-static {v4}, Ljava/lang/System;->exit(I)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {v0, p1}, Lq8/h;->c(Lq8/h;Ljava/lang/Object;)Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-nez p1, :cond_6

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    const v0, -0x48435853

    .line 147
    .line 148
    .line 149
    if-ne v1, v0, :cond_7

    .line 150
    .line 151
    invoke-static {p1, v2, v4}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :catchall_2
    move-exception p1

    .line 156
    goto :goto_1

    .line 157
    :cond_7
    const v0, -0x4843584f

    .line 158
    .line 159
    .line 160
    if-ne v1, v0, :cond_8

    .line 161
    .line 162
    new-instance v0, Lwb/u2;

    .line 163
    .line 164
    invoke-direct {v0, v2}, Lwb/u2;-><init>(Lwb/s2;)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1, v0, v4}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_8
    const v0, -0x48435851

    .line 172
    .line 173
    .line 174
    if-ne v1, v0, :cond_9

    .line 175
    .line 176
    const/4 v0, 0x1

    .line 177
    invoke-static {p1, v0}, Lya/i;->e(Landroid/content/Context;Z)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string v1, "[Hchat:SettingsInjector] [PlusMenu] \u5904\u7406\u83dc\u5355\u70b9\u51fb\u5931\u8d25: "

    .line 184
    .line 185
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    :cond_9
    :goto_2
    return-void

    .line 192
    nop

    .line 193
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x5 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
