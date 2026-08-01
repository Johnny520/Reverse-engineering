.class public final Lr0/s;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq0/a;


# direct methods
.method public synthetic constructor <init>(Lq0/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/s;->a:I

    iput-object p1, p0, Lr0/s;->b:Lq0/a;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr0/s;->b:Lq0/a;

    .line 3
    .line 4
    const-string v2, "param"

    .line 5
    .line 6
    iget v3, p0, Lr0/s;->a:I

    .line 7
    .line 8
    sparse-switch v3, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-boolean v2, Lz0/i;->a:Z

    .line 16
    .line 17
    invoke-static {}, Lz0/g;->B()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1, p1}, Lq0/a;->a(Lq0/a;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {v1, v2}, Lq0/a;->b(Lq0/a;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 36
    .line 37
    aget-object v1, v1, v0

    .line 38
    .line 39
    const-string v2, "null cannot be cast to non-null type android.view.LayoutInflater"

    .line 40
    .line 41
    invoke-static {v1, v2}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast v1, Landroid/view/LayoutInflater;

    .line 45
    .line 46
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    aget-object v2, v2, v3

    .line 50
    .line 51
    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 52
    .line 53
    invoke-static {v2, v3}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast v2, Landroid/view/ViewGroup;

    .line 57
    .line 58
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 59
    .line 60
    new-array v4, v0, [Ljava/lang/Object;

    .line 61
    .line 62
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 63
    .line 64
    const-string v6, "getLayoutId"

    .line 65
    .line 66
    invoke-interface {v5, v3, v6, v4}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {v1, v3, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    :goto_0
    return-void

    .line 87
    :sswitch_1
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    iput-object p1, v1, Lq0/a;->b:Ljava/lang/Object;

    .line 92
    .line 93
    return-void

    .line 94
    :sswitch_2
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 98
    .line 99
    new-array v0, v0, [Ljava/lang/Object;

    .line 100
    .line 101
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 102
    .line 103
    const-string v3, "getArguments"

    .line 104
    .line 105
    invoke-interface {v2, p1, v3, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Landroid/os/Bundle;

    .line 110
    .line 111
    iput-object p1, v1, Lq0/a;->b:Ljava/lang/Object;

    .line 112
    .line 113
    return-void

    .line 114
    nop

    .line 115
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_1
        0x5 -> :sswitch_0
    .end sparse-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    const-string v0, "null cannot be cast to non-null type java.util.ArrayList<*>"

    .line 2
    .line 3
    const-string v1, "chatUser is null or blank"

    .line 4
    .line 5
    const-class v2, Lq0/h;

    .line 6
    .line 7
    const-string v3, "null cannot be cast to non-null type android.app.Activity"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v5, p0, Lr0/s;->b:Lq0/a;

    .line 11
    .line 12
    const-string v6, "param"

    .line 13
    .line 14
    iget v7, p0, Lr0/s;->a:I

    .line 15
    .line 16
    packed-switch v7, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    return-void

    .line 20
    :pswitch_1
    invoke-static {p1, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-boolean v0, Lz0/i;->a:Z

    .line 24
    .line 25
    invoke-static {}, Lz0/g;->B()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v6, Lo0/b;

    .line 40
    .line 41
    const/4 v7, 0x2

    .line 42
    invoke-direct {v6, p1, v5, v7}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 46
    .line 47
    invoke-interface {v5, v0, v6}, Ld0/b;->i(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Field;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    array-length v5, v0

    .line 55
    if-nez v5, :cond_1

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    aget-object v0, v0, v4

    .line 60
    .line 61
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v0, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0, v3}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    check-cast v0, Landroid/app/Activity;

    .line 71
    .line 72
    :goto_0
    if-nez v0, :cond_2

    .line 73
    .line 74
    const-string p1, "can not find DetailHistoryUIForGallery8044"

    .line 75
    .line 76
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v3, "kintent_talker"

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Lq0/h;

    .line 108
    .line 109
    invoke-static {}, Lz0/g;->s()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_4

    .line 114
    .line 115
    :goto_1
    move v0, v4

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    iget-object v1, v2, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    :goto_2
    if-eqz v0, :cond_7

    .line 138
    .line 139
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 140
    .line 141
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const/4 v2, 0x1

    .line 146
    aput-object v1, v0, v2

    .line 147
    .line 148
    const-string v0, "empty MediaHistoryGalleryUI data"

    .line 149
    .line 150
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 158
    .line 159
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 160
    .line 161
    aput-object v0, p1, v4

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_6
    :goto_3
    const-string p1, "MediaHistoryListUI\u2018s user is empty"

    .line 165
    .line 166
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_7
    :goto_4
    return-void

    .line 174
    :pswitch_2
    invoke-static {p1, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sget-boolean v1, Lz0/i;->a:Z

    .line 178
    .line 179
    invoke-static {}, Lz0/g;->B()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_8

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_8
    invoke-static {v5, p1}, Lq0/a;->a(Lq0/a;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 187
    .line 188
    .line 189
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-static {v5, v1}, Lq0/a;->b(Lq0/a;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_9

    .line 196
    .line 197
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 198
    .line 199
    aget-object p1, p1, v4

    .line 200
    .line 201
    invoke-static {p1, v0}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    check-cast p1, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 207
    .line 208
    .line 209
    :cond_9
    :goto_5
    return-void

    .line 210
    :pswitch_3
    invoke-static {p1, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    sget-boolean v1, Lz0/i;->a:Z

    .line 214
    .line 215
    invoke-static {}, Lz0/g;->B()Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-nez v1, :cond_a

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_a
    invoke-static {v5, p1}, Lq0/a;->a(Lq0/a;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 223
    .line 224
    .line 225
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 226
    .line 227
    invoke-static {v5, v1}, Lq0/a;->b(Lq0/a;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_b

    .line 232
    .line 233
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 234
    .line 235
    aget-object p1, p1, v4

    .line 236
    .line 237
    invoke-static {p1, v0}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    check-cast p1, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 243
    .line 244
    .line 245
    :cond_b
    :goto_6
    return-void

    .line 246
    :pswitch_4
    invoke-static {p1, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-static {p1, v3}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    check-cast p1, Landroid/app/Activity;

    .line 255
    .line 256
    iget-object v0, v5, Lq0/a;->b:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Landroid/os/Bundle;

    .line 259
    .line 260
    if-nez v0, :cond_c

    .line 261
    .line 262
    goto/16 :goto_a

    .line 263
    .line 264
    :cond_c
    const-string v3, "Chat_User"

    .line 265
    .line 266
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    check-cast v2, Lq0/h;

    .line 275
    .line 276
    sget-boolean v5, Lz0/i;->a:Z

    .line 277
    .line 278
    invoke-static {}, Lz0/g;->s()Z

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    if-nez v5, :cond_d

    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_d
    if-eqz v3, :cond_f

    .line 286
    .line 287
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-eqz v5, :cond_e

    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_e
    iget-object v1, v2, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 295
    .line 296
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    goto :goto_8

    .line 301
    :cond_f
    :goto_7
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :goto_8
    if-eqz v4, :cond_10

    .line 309
    .line 310
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 311
    .line 312
    .line 313
    :cond_10
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    new-instance v1, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_11

    .line 331
    .line 332
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    check-cast v2, Ljava/lang/String;

    .line 337
    .line 338
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    new-instance v4, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v2, ": "

    .line 351
    .line 352
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-string v2, ", "

    .line 359
    .line 360
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_11
    const-string p1, "ImageQueryMainUI onCreate"

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :goto_a
    return-void

    .line 385
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
