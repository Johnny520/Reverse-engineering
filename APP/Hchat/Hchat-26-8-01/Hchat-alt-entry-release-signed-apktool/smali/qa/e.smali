.class public final Lqa/e;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqa/f;


# direct methods
.method public synthetic constructor <init>(Lqa/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqa/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lqa/e;->b:Lqa/f;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Lqa/e;->a:I

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
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 10
    .line 11
    instance-of v0, p1, Landroid/view/View;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p1, Landroid/view/View;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, v1

    .line 20
    :goto_0
    if-eqz p1, :cond_8

    .line 21
    .line 22
    iget-object v0, p0, Lqa/e;->b:Lqa/f;

    .line 23
    .line 24
    invoke-static {v0, p1}, Lqa/f;->i(Lqa/f;Landroid/view/View;)Lqa/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    sget-object v0, Lqa/b;->g:Lqa/b;

    .line 32
    .line 33
    :goto_1
    iget-object v2, p0, Lqa/e;->b:Lqa/f;

    .line 34
    .line 35
    invoke-static {v2, v0}, Lqa/f;->d(Lqa/f;Lqa/b;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_2
    invoke-static {p1}, Lqa/f;->s(Landroid/view/View;)Landroid/animation/ValueAnimator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    const/high16 v3, 0x3f800000    # 1.0f

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setCurrentFraction(F)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget-object v2, p0, Lqa/e;->b:Lqa/f;

    .line 55
    .line 56
    invoke-static {v2, v0}, Lqa/f;->h(Lqa/f;Lqa/b;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_8

    .line 61
    .line 62
    iget-object v0, p0, Lqa/e;->b:Lqa/f;

    .line 63
    .line 64
    iget-object v0, v0, Lqa/f;->d:Ljava/util/WeakHashMap;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_8

    .line 77
    .line 78
    iget-object v0, p0, Lqa/e;->b:Lqa/f;

    .line 79
    .line 80
    iget-object v2, v0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 81
    .line 82
    monitor-enter v2

    .line 83
    :try_start_0
    iget-object v0, v0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lqa/c;

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    iget-object v0, v0, Lqa/c;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    move-object v0, v1

    .line 99
    :goto_2
    monitor-exit v2

    .line 100
    const/4 v2, 0x0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    const-string v0, "getText"

    .line 105
    .line 106
    new-array v3, v2, [Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {p1, v0, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    instance-of v3, v0, Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v3, :cond_6

    .line 115
    .line 116
    move-object v1, v0

    .line 117
    check-cast v1, Ljava/lang/String;

    .line 118
    .line 119
    :cond_6
    if-eqz v1, :cond_8

    .line 120
    .line 121
    move-object v0, v1

    .line 122
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-ge v2, v1, :cond_8

    .line 127
    .line 128
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    const-string v1, "setText"

    .line 139
    .line 140
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {p1, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :goto_4
    monitor-exit v2

    .line 152
    throw p1

    .line 153
    :cond_8
    :goto_5
    return-void

    .line 154
    :pswitch_0
    iget-object p1, p0, Lqa/e;->b:Lqa/f;

    .line 155
    .line 156
    invoke-static {p1}, Lqa/f;->c(Lqa/f;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_1
    iget-object p1, p0, Lqa/e;->b:Lqa/f;

    .line 161
    .line 162
    invoke-static {p1}, Lqa/f;->c(Lqa/f;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_2
    iget-object p1, p0, Lqa/e;->b:Lqa/f;

    .line 167
    .line 168
    invoke-static {p1}, Lqa/f;->c(Lqa/f;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    iget v0, p0, Lqa/e;->a:I

    .line 2
    .line 3
    sget-object v1, Lqa/b;->h:Lqa/b;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lqa/b;->g:Lqa/b;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, p0, Lqa/e;->b:Lqa/f;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 18
    .line 19
    instance-of v0, p1, Landroid/view/View;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move-object v4, p1

    .line 24
    check-cast v4, Landroid/view/View;

    .line 25
    .line 26
    :cond_0
    if-eqz v4, :cond_4

    .line 27
    .line 28
    invoke-static {v5, v4}, Lqa/f;->i(Lqa/f;Landroid/view/View;)Lqa/b;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move-object v3, p1

    .line 35
    :cond_1
    invoke-static {v5, v3}, Lqa/f;->d(Lqa/f;Lqa/b;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {v4}, Lqa/f;->s(Landroid/view/View;)Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->end()V

    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-static {v5, v3}, Lqa/f;->h(Lqa/f;Lqa/b;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    iget-object p1, v5, Lqa/f;->d:Ljava/util/WeakHashMap;

    .line 70
    .line 71
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p1, v4, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_0
    return-void

    .line 77
    :pswitch_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    invoke-static {v2, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_1

    .line 86
    :cond_5
    move-object v0, v4

    .line 87
    :goto_1
    instance-of v1, v0, Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    check-cast v0, Ljava/lang/String;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_6
    move-object v0, v4

    .line 95
    :goto_2
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 96
    .line 97
    instance-of v6, v1, Landroid/view/View;

    .line 98
    .line 99
    if-eqz v6, :cond_7

    .line 100
    .line 101
    move-object v4, v1

    .line 102
    check-cast v4, Landroid/view/View;

    .line 103
    .line 104
    :cond_7
    invoke-static {v5, v4, v0}, Lqa/f;->b(Lqa/f;Landroid/view/View;Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_8

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_8
    if-eqz v4, :cond_d

    .line 112
    .line 113
    invoke-static {v5, v4}, Lqa/f;->i(Lqa/f;Landroid/view/View;)Lqa/b;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-eqz v1, :cond_9

    .line 118
    .line 119
    move-object v3, v1

    .line 120
    :cond_9
    invoke-static {v5, v3}, Lqa/f;->h(Lqa/f;Lqa/b;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_b

    .line 125
    .line 126
    invoke-static {v4}, Lqa/f;->k(Landroid/view/View;)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-eqz v1, :cond_a

    .line 131
    .line 132
    iget-object v6, v5, Lqa/f;->d:Ljava/util/WeakHashMap;

    .line 133
    .line 134
    invoke-virtual {v6, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-static {v1, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    goto :goto_3

    .line 145
    :cond_a
    move v1, v2

    .line 146
    :goto_3
    if-nez v1, :cond_b

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_b
    if-eqz v0, :cond_d

    .line 150
    .line 151
    invoke-static {v5, v3}, Lqa/f;->d(Lqa/f;Lqa/b;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_c

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_c
    invoke-static {v5, v4, v3, v0}, Lqa/f;->f(Lqa/f;Landroid/view/View;Lqa/b;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v5, v3, v0}, Lqa/f;->a(Lqa/f;Lqa/b;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v0, v1}, Lqa/f;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {v5, v4, v3, v1}, Lqa/f;->g(Lqa/f;Landroid/view/View;Lqa/b;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v5, v3, v0}, Lqa/f;->e(Lqa/f;Lqa/b;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 177
    .line 178
    if-eqz p1, :cond_d

    .line 179
    .line 180
    aput-object v1, p1, v2

    .line 181
    .line 182
    :cond_d
    :goto_4
    return-void

    .line 183
    :pswitch_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 184
    .line 185
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 186
    .line 187
    instance-of v6, p1, Landroid/view/View;

    .line 188
    .line 189
    if-eqz v6, :cond_e

    .line 190
    .line 191
    check-cast p1, Landroid/view/View;

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_e
    move-object p1, v4

    .line 195
    :goto_5
    const/4 v6, 0x3

    .line 196
    if-eqz v0, :cond_f

    .line 197
    .line 198
    invoke-static {v6, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    goto :goto_6

    .line 203
    :cond_f
    move-object v7, v4

    .line 204
    :goto_6
    instance-of v8, v7, Ljava/lang/String;

    .line 205
    .line 206
    if-eqz v8, :cond_10

    .line 207
    .line 208
    check-cast v7, Ljava/lang/String;

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_10
    move-object v7, v4

    .line 212
    :goto_7
    invoke-static {v5, p1, v7}, Lqa/f;->b(Lqa/f;Landroid/view/View;Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eqz v8, :cond_11

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_11
    if-eqz v0, :cond_16

    .line 220
    .line 221
    invoke-static {v2, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const-string v8, "i"

    .line 226
    .line 227
    invoke-static {v2, v8}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    instance-of v8, v2, Ljava/lang/String;

    .line 232
    .line 233
    if-eqz v8, :cond_12

    .line 234
    .line 235
    move-object v4, v2

    .line 236
    check-cast v4, Ljava/lang/String;

    .line 237
    .line 238
    :cond_12
    const-string v2, "balance_cell"

    .line 239
    .line 240
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_13

    .line 245
    .line 246
    move-object v1, v3

    .line 247
    goto :goto_8

    .line 248
    :cond_13
    const-string v2, "lqt_cell"

    .line 249
    .line 250
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_16

    .line 255
    .line 256
    :goto_8
    invoke-static {v5, v1}, Lqa/f;->d(Lqa/f;Lqa/b;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-nez v2, :cond_14

    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_14
    if-nez v7, :cond_15

    .line 264
    .line 265
    const-string v7, ""

    .line 266
    .line 267
    :cond_15
    invoke-static {v5, p1, v1, v7}, Lqa/f;->f(Lqa/f;Landroid/view/View;Lqa/b;Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-static {v5, v1, v2}, Lqa/f;->a(Lqa/f;Lqa/b;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-static {v2, v3}, Lqa/f;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-static {v5, p1, v1, v3}, Lqa/f;->g(Lqa/f;Landroid/view/View;Lqa/b;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v5, v1, v2}, Lqa/f;->e(Lqa/f;Lqa/b;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    aput-object v3, v0, v6

    .line 286
    .line 287
    :cond_16
    :goto_9
    return-void

    .line 288
    :pswitch_2
    invoke-static {v5, v4, v4}, Lqa/f;->b(Lqa/f;Landroid/view/View;Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_17

    .line 293
    .line 294
    goto/16 :goto_e

    .line 295
    .line 296
    :cond_17
    invoke-static {v5, v1}, Lqa/f;->d(Lqa/f;Lqa/b;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-nez v0, :cond_18

    .line 301
    .line 302
    goto :goto_e

    .line 303
    :cond_18
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 304
    .line 305
    const/4 v3, 0x1

    .line 306
    if-eqz v0, :cond_19

    .line 307
    .line 308
    invoke-static {v3, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    goto :goto_a

    .line 313
    :cond_19
    move-object v0, v4

    .line 314
    :goto_a
    instance-of v6, v0, Ljava/lang/Long;

    .line 315
    .line 316
    if-eqz v6, :cond_1a

    .line 317
    .line 318
    check-cast v0, Ljava/lang/Long;

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_1a
    move-object v0, v4

    .line 322
    :goto_b
    if-eqz v0, :cond_1c

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 325
    .line 326
    .line 327
    move-result-wide v6

    .line 328
    const/4 v0, 0x2

    .line 329
    invoke-static {v6, v7, v0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    invoke-virtual {v6}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-static {v5, v1, v6}, Lqa/f;->a(Lqa/f;Lqa/b;Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    :try_start_0
    sget-object v8, Lqa/g;->a:Log/k;

    .line 345
    .line 346
    invoke-static {v7}, Lqa/g;->a(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-virtual {v7, v0}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    sget-object v7, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 355
    .line 356
    invoke-virtual {v0, v2, v7}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    .line 361
    .line 362
    .line 363
    move-result-wide v7

    .line 364
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 365
    .line 366
    .line 367
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 368
    goto :goto_c

    .line 369
    :catchall_0
    move-exception v0

    .line 370
    new-instance v2, Lsf/f;

    .line 371
    .line 372
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 373
    .line 374
    .line 375
    move-object v0, v2

    .line 376
    :goto_c
    nop

    .line 377
    instance-of v2, v0, Lsf/f;

    .line 378
    .line 379
    if-eqz v2, :cond_1b

    .line 380
    .line 381
    goto :goto_d

    .line 382
    :cond_1b
    move-object v4, v0

    .line 383
    :goto_d
    check-cast v4, Ljava/lang/Long;

    .line 384
    .line 385
    if-eqz v4, :cond_1c

    .line 386
    .line 387
    invoke-static {v5, v1, v6}, Lqa/f;->e(Lqa/f;Lqa/b;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 391
    .line 392
    if-eqz p1, :cond_1c

    .line 393
    .line 394
    aput-object v4, p1, v3

    .line 395
    .line 396
    :cond_1c
    :goto_e
    return-void

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
