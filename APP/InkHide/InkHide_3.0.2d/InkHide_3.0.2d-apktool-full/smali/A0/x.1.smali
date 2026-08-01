.class public final LA0/x;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA0/x;->a:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const-string v4, "param"

    .line 7
    .line 8
    iget v5, p0, LA0/x;->a:I

    .line 9
    .line 10
    packed-switch v5, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :pswitch_0
    return-void

    .line 14
    :pswitch_1
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 18
    .line 19
    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    .line 20
    .line 21
    invoke-static {p1, v0}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p1, Landroid/app/Activity;

    .line 25
    .line 26
    const v0, 0x1020002

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    new-instance v1, Lr0/n1;

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    invoke-direct {v1, v3}, Lr0/n1;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lb1/h;->s(Landroid/view/View;Lx/b;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Landroid/view/View;

    .line 60
    .line 61
    new-instance v3, Lr0/O0;

    .line 62
    .line 63
    invoke-direct {v3, v2, p1}, Lr0/O0;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    return-void

    .line 71
    :pswitch_2
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 75
    .line 76
    if-nez p1, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v0, "hide contact ctor adapter"

    .line 88
    .line 89
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :goto_1
    return-void

    .line 97
    :pswitch_3
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 101
    .line 102
    aget-object v2, v4, v2

    .line 103
    .line 104
    if-nez v2, :cond_2

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    new-instance v3, Ljava/lang/String;

    .line 108
    .line 109
    check-cast v2, [B

    .line 110
    .line 111
    sget-object v4, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 112
    .line 113
    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 117
    .line 118
    aget-object v1, v2, v1

    .line 119
    .line 120
    if-eqz v1, :cond_3

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-nez v1, :cond_4

    .line 127
    .line 128
    :cond_3
    move-object v1, v0

    .line 129
    :cond_4
    const-string v2, "hook db"

    .line 130
    .line 131
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    filled-new-array {v2, v1, v3, v4}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_5

    .line 147
    .line 148
    sget-object v0, Lz0/C;->a:Ljava/util/HashMap;

    .line 149
    .line 150
    sget-object v0, Lz0/C;->a:Ljava/util/HashMap;

    .line 151
    .line 152
    new-instance v2, Lcom/lu/wxmask/bean/DBItem;

    .line 153
    .line 154
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-direct {v2, v1, v3, p1}, Lcom/lu/wxmask/bean/DBItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    :cond_5
    return-void

    .line 165
    :pswitch_4
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 169
    .line 170
    if-eqz v2, :cond_6

    .line 171
    .line 172
    invoke-static {v1, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    goto :goto_3

    .line 177
    :cond_6
    move-object v1, v3

    .line 178
    :goto_3
    instance-of v2, v1, Ljava/lang/String;

    .line 179
    .line 180
    if-eqz v2, :cond_7

    .line 181
    .line 182
    check-cast v1, Ljava/lang/String;

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    move-object v1, v3

    .line 186
    :goto_4
    if-nez v1, :cond_8

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_8
    move-object v0, v1

    .line 190
    :goto_5
    sput-object v0, LC0/c;->c:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_9

    .line 197
    .line 198
    move-object v0, v3

    .line 199
    goto :goto_6

    .line 200
    :cond_9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 201
    .line 202
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 203
    .line 204
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :goto_6
    sput-object v0, LC0/c;->d:Ljava/lang/ref/WeakReference;

    .line 208
    .line 209
    sget-object p1, LC0/c;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 210
    .line 211
    sget-object v0, LC0/c;->a:LC0/c;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_a

    .line 222
    .line 223
    return-void

    .line 224
    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-nez v0, :cond_d

    .line 229
    .line 230
    :try_start_0
    sget-object v0, LC0/c;->d:Ljava/lang/ref/WeakReference;

    .line 231
    .line 232
    if-eqz v0, :cond_b

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    :cond_b
    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    :catchall_0
    move-exception v0

    .line 239
    new-instance v1, LE0/d;

    .line 240
    .line 241
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-nez v0, :cond_c

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_c
    throw v3

    .line 252
    :cond_d
    new-instance p1, Ljava/lang/ClassCastException;

    .line 253
    .line 254
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    :pswitch_5
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 262
    .line 263
    instance-of v0, p1, Landroid/app/Activity;

    .line 264
    .line 265
    if-eqz v0, :cond_e

    .line 266
    .line 267
    move-object v3, p1

    .line 268
    check-cast v3, Landroid/app/Activity;

    .line 269
    .line 270
    :cond_e
    if-nez v3, :cond_f

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_f
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    if-nez p1, :cond_10

    .line 278
    .line 279
    move-object p1, v3

    .line 280
    :cond_10
    sget-object v0, LA0/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_11

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_11
    const-string v0, "launcher-resume"

    .line 290
    .line 291
    invoke-static {v3, p1, v0}, LA0/y;->a(Landroid/app/Activity;Landroid/content/Context;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    :goto_8
    return-void

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    const-string v0, "MediaHistoryListUI\u2018s user is empty"

    .line 2
    .line 3
    const-string v1, "chatUser is null or blank"

    .line 4
    .line 5
    const-class v2, Lq0/h;

    .line 6
    .line 7
    const-string v3, "kintent_talker"

    .line 8
    .line 9
    const-string v4, "null cannot be cast to non-null type android.app.Activity"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x4

    .line 13
    const-string v7, "args"

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    const-string v10, "param"

    .line 18
    .line 19
    iget v11, p0, LA0/x;->a:I

    .line 20
    .line 21
    packed-switch v11, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    :pswitch_0
    return-void

    .line 25
    :pswitch_1
    invoke-static {p1, v10}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 29
    .line 30
    instance-of v1, v0, Landroid/app/Activity;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    check-cast v0, Landroid/app/Activity;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v8

    .line 38
    :goto_0
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    sget v1, Lt0/c;->g:I

    .line 42
    .line 43
    invoke-static {v0}, Lb1/h;->p(Landroid/app/Activity;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "AttachUI launcher onBackPressed intercepted"

    .line 58
    .line 59
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v8}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    :goto_1
    return-void

    .line 70
    :pswitch_2
    invoke-static {p1, v10}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v9, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    instance-of v1, v0, Ljava/lang/Integer;

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    check-cast v0, Ljava/lang/Integer;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move-object v0, v8

    .line 90
    :goto_2
    if-eqz v0, :cond_7

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eq v0, v6, :cond_4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 100
    .line 101
    instance-of v1, v0, Landroid/app/Activity;

    .line 102
    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    move-object v8, v0

    .line 106
    check-cast v8, Landroid/app/Activity;

    .line 107
    .line 108
    :cond_5
    if-nez v8, :cond_6

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    sget v0, Lt0/c;->g:I

    .line 112
    .line 113
    invoke-static {v8}, Lb1/h;->p(Landroid/app/Activity;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "AttachUI launcher onKeyDown intercepted"

    .line 128
    .line 129
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    :goto_3
    return-void

    .line 142
    :pswitch_3
    invoke-static {p1, v10}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 146
    .line 147
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v9, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    instance-of v1, v0, Landroid/view/KeyEvent;

    .line 155
    .line 156
    if-eqz v1, :cond_8

    .line 157
    .line 158
    check-cast v0, Landroid/view/KeyEvent;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_8
    move-object v0, v8

    .line 162
    :goto_4
    if-nez v0, :cond_9

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_9
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eq v1, v6, :cond_a

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_a
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 173
    .line 174
    instance-of v2, v1, Landroid/app/Activity;

    .line 175
    .line 176
    if-eqz v2, :cond_b

    .line 177
    .line 178
    move-object v8, v1

    .line 179
    check-cast v8, Landroid/app/Activity;

    .line 180
    .line 181
    :cond_b
    if-nez v8, :cond_c

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_c
    sget v1, Lt0/c;->g:I

    .line 185
    .line 186
    invoke-static {v8}, Lb1/h;->D(Landroid/app/Activity;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_d

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_d
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_e

    .line 198
    .line 199
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v1, "AttachUI launcher back down intercepted"

    .line 208
    .line 209
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_e
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-ne v0, v5, :cond_f

    .line 227
    .line 228
    invoke-static {v8}, Lb1/h;->p(Landroid/app/Activity;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_f

    .line 233
    .line 234
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v1, "AttachUI launcher back up intercepted"

    .line 243
    .line 244
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_f
    :goto_5
    return-void

    .line 257
    :pswitch_4
    invoke-static {p1, v10}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 261
    .line 262
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v9, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    instance-of v1, v0, Landroid/view/KeyEvent;

    .line 270
    .line 271
    if-eqz v1, :cond_10

    .line 272
    .line 273
    check-cast v0, Landroid/view/KeyEvent;

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_10
    move-object v0, v8

    .line 277
    :goto_6
    if-nez v0, :cond_11

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_11
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eq v1, v6, :cond_12

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_12
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 288
    .line 289
    instance-of v2, v1, Landroid/app/Activity;

    .line 290
    .line 291
    if-eqz v2, :cond_13

    .line 292
    .line 293
    move-object v8, v1

    .line 294
    check-cast v8, Landroid/app/Activity;

    .line 295
    .line 296
    :cond_13
    if-nez v8, :cond_14

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_14
    sget v1, Lt0/c;->g:I

    .line 300
    .line 301
    invoke-static {v8}, Lb1/h;->D(Landroid/app/Activity;)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-nez v1, :cond_15

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_15
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-nez v1, :cond_16

    .line 313
    .line 314
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 315
    .line 316
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_16
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-ne v0, v5, :cond_17

    .line 325
    .line 326
    invoke-static {v8}, Lb1/h;->p(Landroid/app/Activity;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_17

    .line 331
    .line 332
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    const-string v1, "AttachUI back intercepted"

    .line 341
    .line 342
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 350
    .line 351
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_17
    :goto_7
    return-void

    .line 355
    :pswitch_5
    invoke-static {p1, v10}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 359
    .line 360
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v9, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    instance-of v1, v0, Ljava/lang/Integer;

    .line 368
    .line 369
    if-eqz v1, :cond_18

    .line 370
    .line 371
    check-cast v0, Ljava/lang/Integer;

    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_18
    move-object v0, v8

    .line 375
    :goto_8
    if-eqz v0, :cond_1c

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-eq v0, v6, :cond_19

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_19
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 385
    .line 386
    instance-of v1, v0, Landroid/app/Activity;

    .line 387
    .line 388
    if-eqz v1, :cond_1a

    .line 389
    .line 390
    move-object v8, v0

    .line 391
    check-cast v8, Landroid/app/Activity;

    .line 392
    .line 393
    :cond_1a
    if-nez v8, :cond_1b

    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_1b
    sget v0, Lt0/c;->g:I

    .line 397
    .line 398
    invoke-static {v8}, Lb1/h;->p(Landroid/app/Activity;)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_1c

    .line 403
    .line 404
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    const-string v1, "AttachUI back intercepted onKeyDown"

    .line 413
    .line 414
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    :cond_1c
    :goto_9
    return-void

    .line 427
    :pswitch_6
    invoke-static {p1, v10}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    sget-boolean v6, Lz0/i;->a:Z

    .line 431
    .line 432
    invoke-static {}, Lz0/g;->B()Z

    .line 433
    .line 434
    .line 435
    move-result v6

    .line 436
    if-nez v6, :cond_1d

    .line 437
    .line 438
    goto :goto_d

    .line 439
    :cond_1d
    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 440
    .line 441
    invoke-static {v6, v4}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    check-cast v6, Landroid/app/Activity;

    .line 445
    .line 446
    invoke-virtual {v6}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-virtual {v4, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    if-eqz v3, :cond_21

    .line 455
    .line 456
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    if-eqz v4, :cond_1e

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :cond_1e
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    check-cast v0, Lq0/h;

    .line 468
    .line 469
    invoke-static {}, Lz0/g;->s()Z

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    if-nez v2, :cond_1f

    .line 474
    .line 475
    :goto_a
    move v0, v9

    .line 476
    goto :goto_b

    .line 477
    :cond_1f
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-eqz v2, :cond_20

    .line 482
    .line 483
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    goto :goto_a

    .line 491
    :cond_20
    iget-object v0, v0, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 492
    .line 493
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    :goto_b
    if-eqz v0, :cond_22

    .line 498
    .line 499
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 500
    .line 501
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    aput-object v0, p1, v5

    .line 506
    .line 507
    const-string p1, "empty MediaHistoryListUI data"

    .line 508
    .line 509
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    invoke-static {p1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_21
    :goto_c
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    :cond_22
    :goto_d
    return-void

    .line 525
    :pswitch_7
    invoke-static {p1, v10}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    sget-boolean v6, Lz0/i;->a:Z

    .line 529
    .line 530
    invoke-static {}, Lz0/g;->B()Z

    .line 531
    .line 532
    .line 533
    move-result v6

    .line 534
    if-nez v6, :cond_23

    .line 535
    .line 536
    goto :goto_11

    .line 537
    :cond_23
    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 538
    .line 539
    invoke-static {v6, v4}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    check-cast v6, Landroid/app/Activity;

    .line 543
    .line 544
    invoke-virtual {v6}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    invoke-virtual {v4, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    if-eqz v3, :cond_27

    .line 553
    .line 554
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    if-eqz v4, :cond_24

    .line 559
    .line 560
    goto :goto_10

    .line 561
    :cond_24
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    check-cast v0, Lq0/h;

    .line 566
    .line 567
    invoke-static {}, Lz0/g;->s()Z

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    if-nez v2, :cond_25

    .line 572
    .line 573
    :goto_e
    move v0, v9

    .line 574
    goto :goto_f

    .line 575
    :cond_25
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    if-eqz v2, :cond_26

    .line 580
    .line 581
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    goto :goto_e

    .line 589
    :cond_26
    iget-object v0, v0, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 590
    .line 591
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    :goto_f
    if-eqz v0, :cond_28

    .line 596
    .line 597
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 598
    .line 599
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    aput-object v0, p1, v5

    .line 604
    .line 605
    const-string p1, "empty MediaHistoryGalleryUI data"

    .line 606
    .line 607
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    invoke-static {p1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    goto :goto_11

    .line 615
    :cond_27
    :goto_10
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object p1

    .line 619
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    :cond_28
    :goto_11
    return-void

    .line 623
    :pswitch_8
    invoke-static {p1, v10}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    sget-boolean v0, Lz0/i;->a:Z

    .line 627
    .line 628
    invoke-static {}, Lz0/g;->s()Z

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    if-eqz v0, :cond_29

    .line 633
    .line 634
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getDisableWechatHotUpdate()Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-eqz v0, :cond_29

    .line 643
    .line 644
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 645
    .line 646
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    :cond_29
    return-void

    .line 650
    nop

    .line 651
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
