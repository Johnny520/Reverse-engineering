.class public final Lr0/i0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/j0;


# direct methods
.method public synthetic constructor <init>(Lr0/j0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/i0;->a:I

    iput-object p1, p0, Lr0/i0;->b:Lr0/j0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    iget v0, p0, Lr0/i0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v1, v0, Landroid/view/View;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroid/view/View;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v1, p0, Lr0/i0;->b:Lr0/j0;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lr0/j0;->v(Landroid/view/View;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 35
    .line 36
    const-string v2, "args"

    .line 37
    .line 38
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {v2, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    invoke-static {v0}, Lr0/j0;->n(Landroid/view/View;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_3
    if-eqz p1, :cond_4

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v1, p1}, Lr0/j0;->q(Ljava/lang/Class;)V

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-virtual {v1, v0}, Lr0/j0;->H(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    return-void

    .line 65
    :pswitch_2
    const-string v0, "param"

    .line 66
    .line 67
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 71
    .line 72
    instance-of v0, p1, Landroid/app/Activity;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    check-cast p1, Landroid/app/Activity;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    const/4 p1, 0x0

    .line 80
    :goto_2
    if-eqz p1, :cond_6

    .line 81
    .line 82
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 83
    .line 84
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lr0/i0;->b:Lr0/j0;

    .line 88
    .line 89
    iput-object v0, p1, Lr0/j0;->o:Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    :cond_6
    return-void

    .line 92
    :pswitch_3
    const-string v0, "param"

    .line 93
    .line 94
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 98
    .line 99
    instance-of v0, p1, Landroid/widget/ListView;

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    check-cast p1, Landroid/widget/ListView;

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_7
    const/4 p1, 0x0

    .line 107
    :goto_3
    if-nez p1, :cond_8

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    iget-object v0, p0, Lr0/i0;->b:Lr0/j0;

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lr0/j0;->u(Landroid/widget/ListView;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_9

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_9
    iget-object v1, v0, Lr0/j0;->d:Ljava/util/Set;

    .line 120
    .line 121
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p1}, Lr0/j0;->B(Landroid/widget/ListView;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p1}, Lr0/j0;->G(Landroid/widget/ListView;)V

    .line 128
    .line 129
    .line 130
    :goto_4
    return-void

    .line 131
    :pswitch_4
    const-string v0, "param"

    .line 132
    .line 133
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 137
    .line 138
    const-string v0, "args"

    .line 139
    .line 140
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/4 v0, 0x0

    .line 144
    invoke-static {v0, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-nez p1, :cond_a

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_a
    :try_start_0
    const-string v0, "itemView"

    .line 152
    .line 153
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 154
    .line 155
    invoke-interface {v1, p1, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :catchall_0
    move-exception p1

    .line 163
    new-instance v0, LE0/d;

    .line 164
    .line 165
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    move-object p1, v0

    .line 169
    :goto_5
    nop

    .line 170
    instance-of v0, p1, LE0/d;

    .line 171
    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    const/4 p1, 0x0

    .line 175
    :cond_b
    check-cast p1, Landroid/view/View;

    .line 176
    .line 177
    if-nez p1, :cond_c

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_c
    iget-object v0, p0, Lr0/i0;->b:Lr0/j0;

    .line 181
    .line 182
    invoke-virtual {v0, p1}, Lr0/j0;->E(Landroid/view/View;)Z

    .line 183
    .line 184
    .line 185
    :goto_6
    return-void

    .line 186
    :pswitch_5
    const-string v0, "param"

    .line 187
    .line 188
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 192
    .line 193
    const-string v1, "args"

    .line 194
    .line 195
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const/4 v1, 0x0

    .line 199
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-nez v0, :cond_d

    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_d
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 213
    .line 214
    instance-of v0, p1, Landroid/app/Activity;

    .line 215
    .line 216
    const/4 v1, 0x0

    .line 217
    if-eqz v0, :cond_e

    .line 218
    .line 219
    check-cast p1, Landroid/app/Activity;

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_e
    move-object p1, v1

    .line 223
    :goto_7
    if-nez p1, :cond_f

    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const-string v2, "com.tencent.mm.ui.transmit.SelectConversationUI"

    .line 235
    .line 236
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-nez v2, :cond_12

    .line 241
    .line 242
    iget-object v2, p0, Lr0/i0;->b:Lr0/j0;

    .line 243
    .line 244
    invoke-virtual {v2, v0}, Lr0/j0;->y(Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-eqz v3, :cond_12

    .line 249
    .line 250
    invoke-static {p1}, Lb1/h;->F(Landroid/app/Activity;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_10

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_10
    invoke-static {p1}, Lb1/h;->F(Landroid/app/Activity;)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    const-string v4, "tag="

    .line 262
    .line 263
    invoke-static {v4, v3}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    const-string v4, "group=true"

    .line 268
    .line 269
    const-string v5, "focus"

    .line 270
    .line 271
    filled-new-array {v5, v0, v3, v4}, [Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v2, v0}, Lr0/j0;->A([Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-eqz p1, :cond_11

    .line 283
    .line 284
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    :cond_11
    invoke-virtual {v2, v1}, Lr0/j0;->F(Landroid/view/View;)V

    .line 289
    .line 290
    .line 291
    :cond_12
    :goto_8
    return-void

    .line 292
    nop

    .line 293
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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "com.tencent.mm.ui.transmit.SelectConversationUI"

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v5, v0, Lr0/i0;->b:Lr0/j0;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const-string v7, "param"

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    iget v9, v0, Lr0/i0;->a:I

    .line 17
    .line 18
    sparse-switch v9, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_0
    invoke-static {v1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 26
    .line 27
    instance-of v7, v1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    check-cast v1, Landroid/view/ViewGroup;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v6

    .line 35
    :goto_0
    if-nez v1, :cond_1

    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lr0/j0;->o(Landroid/view/View;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    instance-of v8, v1, Landroid/widget/ListView;

    .line 47
    .line 48
    iget-object v9, v5, Lr0/j0;->k:Ljava/util/WeakHashMap;

    .line 49
    .line 50
    if-eqz v8, :cond_8

    .line 51
    .line 52
    const-string v8, "mil"

    .line 53
    .line 54
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-nez v7, :cond_2

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_2
    check-cast v1, Landroid/widget/ListView;

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-static {v7}, Lr0/j0;->j(Landroid/content/Context;)Landroid/app/Activity;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    if-eqz v7, :cond_3

    .line 73
    .line 74
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    :cond_3
    invoke-static {v6, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_4
    iget-object v2, v5, Lr0/j0;->d:Ljava/util/Set;

    .line 91
    .line 92
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_5

    .line 97
    .line 98
    invoke-virtual {v5, v1}, Lr0/j0;->d(Landroid/view/ViewGroup;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    goto :goto_2

    .line 103
    :cond_5
    invoke-virtual {v5, v1}, Lr0/j0;->u(Landroid/widget/ListView;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_6

    .line 108
    .line 109
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-static {v1}, Lr0/j0;->o(Landroid/view/View;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    if-nez v6, :cond_7

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    move-object v3, v6

    .line 132
    :goto_1
    const-string v6, "group list target"

    .line 133
    .line 134
    filled-new-array {v6, v4, v3}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v5, v3}, Lr0/j0;->A([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v1}, Lr0/j0;->d(Landroid/view/ViewGroup;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    :goto_2
    if-eqz v4, :cond_e

    .line 149
    .line 150
    invoke-virtual {v5, v1}, Lr0/j0;->G(Landroid/widget/ListView;)V

    .line 151
    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_8
    const-string v2, "mim"

    .line 155
    .line 156
    invoke-static {v7, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-nez v2, :cond_9

    .line 161
    .line 162
    const-string v2, "q0l"

    .line 163
    .line 164
    invoke-static {v7, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-nez v2, :cond_9

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    iget-object v2, v5, Lr0/j0;->c:Ljava/util/Set;

    .line 172
    .line 173
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eqz v6, :cond_a

    .line 178
    .line 179
    invoke-virtual {v5, v1}, Lr0/j0;->d(Landroid/view/ViewGroup;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    goto :goto_4

    .line 184
    :cond_a
    invoke-virtual {v5, v1}, Lr0/j0;->v(Landroid/view/View;)Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-nez v6, :cond_b

    .line 189
    .line 190
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-static {v1}, Lr0/j0;->o(Landroid/view/View;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    if-nez v6, :cond_c

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_c
    move-object v3, v6

    .line 213
    :goto_3
    const-string v6, "group recycler target"

    .line 214
    .line 215
    filled-new-array {v6, v4, v3}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v5, v3}, Lr0/j0;->A([Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5, v1}, Lr0/j0;->d(Landroid/view/ViewGroup;)Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    :goto_4
    if-eqz v4, :cond_e

    .line 230
    .line 231
    invoke-static {v1}, Lr0/j0;->n(Landroid/view/View;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    if-eqz v2, :cond_d

    .line 236
    .line 237
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v5, v2}, Lr0/j0;->q(Ljava/lang/Class;)V

    .line 242
    .line 243
    .line 244
    :cond_d
    invoke-virtual {v5, v1}, Lr0/j0;->H(Landroid/view/View;)V

    .line 245
    .line 246
    .line 247
    :cond_e
    :goto_5
    return-void

    .line 248
    :sswitch_1
    invoke-static {v1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 252
    .line 253
    instance-of v2, v1, Landroid/view/View;

    .line 254
    .line 255
    if-eqz v2, :cond_f

    .line 256
    .line 257
    move-object v6, v1

    .line 258
    check-cast v6, Landroid/view/View;

    .line 259
    .line 260
    :cond_f
    if-nez v6, :cond_10

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_10
    invoke-virtual {v5, v6}, Lr0/j0;->v(Landroid/view/View;)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-nez v1, :cond_11

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_11
    invoke-static {v6}, Lr0/j0;->n(Landroid/view/View;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-eqz v1, :cond_12

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v5, v1}, Lr0/j0;->q(Ljava/lang/Class;)V

    .line 281
    .line 282
    .line 283
    :cond_12
    invoke-virtual {v5, v6}, Lr0/j0;->H(Landroid/view/View;)V

    .line 284
    .line 285
    .line 286
    :goto_6
    return-void

    .line 287
    :sswitch_2
    invoke-static {v1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 291
    .line 292
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    if-nez v1, :cond_13

    .line 296
    .line 297
    sget-object v1, LF0/s;->a:LF0/s;

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :cond_13
    new-instance v7, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 303
    .line 304
    .line 305
    array-length v9, v1

    .line 306
    move v10, v4

    .line 307
    :goto_7
    if-ge v10, v9, :cond_17

    .line 308
    .line 309
    aget-object v11, v1, v10

    .line 310
    .line 311
    instance-of v12, v11, Landroid/content/Intent;

    .line 312
    .line 313
    if-eqz v12, :cond_14

    .line 314
    .line 315
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_14
    instance-of v12, v11, [Ljava/lang/Object;

    .line 320
    .line 321
    if-eqz v12, :cond_16

    .line 322
    .line 323
    check-cast v11, [Ljava/lang/Object;

    .line 324
    .line 325
    array-length v12, v11

    .line 326
    move v13, v4

    .line 327
    :goto_8
    if-ge v13, v12, :cond_16

    .line 328
    .line 329
    aget-object v14, v11, v13

    .line 330
    .line 331
    instance-of v15, v14, Landroid/content/Intent;

    .line 332
    .line 333
    if-eqz v15, :cond_15

    .line 334
    .line 335
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    :cond_15
    add-int/2addr v13, v8

    .line 339
    goto :goto_8

    .line 340
    :cond_16
    :goto_9
    add-int/2addr v10, v8

    .line 341
    goto :goto_7

    .line 342
    :cond_17
    move-object v1, v7

    .line 343
    :goto_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    :cond_18
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    if-eqz v7, :cond_30

    .line 352
    .line 353
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    check-cast v7, Landroid/content/Intent;

    .line 358
    .line 359
    sget-boolean v9, Lz0/i;->a:Z

    .line 360
    .line 361
    invoke-static {}, Lz0/g;->x()Z

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    if-nez v9, :cond_19

    .line 366
    .line 367
    goto :goto_b

    .line 368
    :cond_19
    invoke-virtual {v7}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    if-eqz v9, :cond_1a

    .line 373
    .line 374
    invoke-virtual {v9}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v9

    .line 378
    goto :goto_c

    .line 379
    :cond_1a
    move-object v9, v6

    .line 380
    :goto_c
    if-nez v9, :cond_1b

    .line 381
    .line 382
    move-object v9, v3

    .line 383
    :cond_1b
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    if-nez v10, :cond_18

    .line 388
    .line 389
    invoke-virtual {v9, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v10

    .line 393
    if-nez v10, :cond_18

    .line 394
    .line 395
    const-string v10, "com.tencent.mm.plugin.fts.ui.FTSMainUI"

    .line 396
    .line 397
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    if-nez v10, :cond_18

    .line 402
    .line 403
    const-string v10, "com.tencent.mm.ui.LauncherUI"

    .line 404
    .line 405
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    if-nez v10, :cond_18

    .line 410
    .line 411
    const-string v10, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    .line 412
    .line 413
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v10

    .line 417
    if-nez v10, :cond_18

    .line 418
    .line 419
    const-string v10, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 420
    .line 421
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v10

    .line 425
    if-nez v10, :cond_18

    .line 426
    .line 427
    const-string v10, "com.tencent.mm.plugin.sns."

    .line 428
    .line 429
    invoke-static {v9, v4, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    if-nez v10, :cond_18

    .line 434
    .line 435
    const-string v10, "com.tencent.mm.plugin.appbrand."

    .line 436
    .line 437
    invoke-static {v9, v4, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 438
    .line 439
    .line 440
    move-result v10

    .line 441
    if-nez v10, :cond_18

    .line 442
    .line 443
    const-string v10, "com.tencent.mm.plugin.setting."

    .line 444
    .line 445
    invoke-static {v9, v4, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 446
    .line 447
    .line 448
    move-result v10

    .line 449
    if-nez v10, :cond_18

    .line 450
    .line 451
    const-string v10, "com.tencent.mm.plugin.brandservice."

    .line 452
    .line 453
    invoke-static {v9, v4, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 454
    .line 455
    .line 456
    move-result v10

    .line 457
    if-nez v10, :cond_18

    .line 458
    .line 459
    const-string v10, "com.tencent.mm.ui.brandservice."

    .line 460
    .line 461
    invoke-static {v9, v4, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 462
    .line 463
    .line 464
    move-result v10

    .line 465
    if-nez v10, :cond_18

    .line 466
    .line 467
    const-string v10, "com.tencent.mm.plugin.game."

    .line 468
    .line 469
    invoke-static {v9, v4, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 470
    .line 471
    .line 472
    move-result v10

    .line 473
    if-eqz v10, :cond_1c

    .line 474
    .line 475
    goto/16 :goto_b

    .line 476
    .line 477
    :cond_1c
    const-string v10, "com.tencent.mm.plugin.label.ui.ContactLabelManagerUI"

    .line 478
    .line 479
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    if-eqz v10, :cond_1d

    .line 484
    .line 485
    goto/16 :goto_b

    .line 486
    .line 487
    :cond_1d
    invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    const-string v11, "label_id"

    .line 492
    .line 493
    invoke-static {v7, v10, v11}, Lb1/h;->M(Landroid/content/Intent;Landroid/os/Bundle;Ljava/lang/String;)I

    .line 494
    .line 495
    .line 496
    move-result v11

    .line 497
    if-lez v11, :cond_1e

    .line 498
    .line 499
    move v11, v8

    .line 500
    goto :goto_d

    .line 501
    :cond_1e
    move v11, v4

    .line 502
    :goto_d
    const-string v12, "INTENT_KEY_SEARCH_LABEL_USERNAME_LIST"

    .line 503
    .line 504
    invoke-virtual {v7, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v13

    .line 508
    if-eqz v13, :cond_20

    .line 509
    .line 510
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 511
    .line 512
    .line 513
    move-result v13

    .line 514
    if-eqz v13, :cond_1f

    .line 515
    .line 516
    goto :goto_e

    .line 517
    :cond_1f
    move v13, v4

    .line 518
    goto :goto_f

    .line 519
    :cond_20
    :goto_e
    move v13, v8

    .line 520
    :goto_f
    const-string v14, "label_name"

    .line 521
    .line 522
    invoke-virtual {v7, v14}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v14

    .line 526
    if-eqz v14, :cond_22

    .line 527
    .line 528
    invoke-static {v14}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 529
    .line 530
    .line 531
    move-result v14

    .line 532
    if-eqz v14, :cond_21

    .line 533
    .line 534
    goto :goto_10

    .line 535
    :cond_21
    move v14, v4

    .line 536
    goto :goto_11

    .line 537
    :cond_22
    :goto_10
    move v14, v8

    .line 538
    :goto_11
    const-string v15, "scene"

    .line 539
    .line 540
    invoke-static {v7, v10, v15}, Lb1/h;->M(Landroid/content/Intent;Landroid/os/Bundle;Ljava/lang/String;)I

    .line 541
    .line 542
    .line 543
    move-result v10

    .line 544
    const/4 v15, 0x7

    .line 545
    if-ne v10, v15, :cond_23

    .line 546
    .line 547
    move v10, v8

    .line 548
    goto :goto_12

    .line 549
    :cond_23
    move v10, v4

    .line 550
    :goto_12
    if-nez v11, :cond_18

    .line 551
    .line 552
    if-eqz v13, :cond_18

    .line 553
    .line 554
    if-nez v14, :cond_24

    .line 555
    .line 556
    if-eqz v10, :cond_24

    .line 557
    .line 558
    goto/16 :goto_b

    .line 559
    .line 560
    :cond_24
    invoke-virtual {v5, v9}, Lr0/j0;->y(Ljava/lang/String;)Z

    .line 561
    .line 562
    .line 563
    move-result v10

    .line 564
    if-eqz v10, :cond_25

    .line 565
    .line 566
    goto :goto_13

    .line 567
    :cond_25
    const-string v10, "com.tencent.mm.ui.contact."

    .line 568
    .line 569
    invoke-static {v9, v4, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 570
    .line 571
    .line 572
    move-result v10

    .line 573
    if-nez v10, :cond_26

    .line 574
    .line 575
    const-string v10, "com.tencent.mm.ui.mvvm.MvvmContactListUI"

    .line 576
    .line 577
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v9

    .line 581
    if-eqz v9, :cond_18

    .line 582
    .line 583
    :cond_26
    invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 584
    .line 585
    .line 586
    move-result-object v9

    .line 587
    if-nez v9, :cond_27

    .line 588
    .line 589
    goto/16 :goto_b

    .line 590
    .line 591
    :cond_27
    const-string v10, "INTENT_KEY_SELECT_CONTACT_FROM_SCENE_SUB_TYPE"

    .line 592
    .line 593
    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 594
    .line 595
    .line 596
    move-result v10

    .line 597
    if-nez v10, :cond_28

    .line 598
    .line 599
    invoke-virtual {v9, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 600
    .line 601
    .line 602
    move-result v10

    .line 603
    if-nez v10, :cond_28

    .line 604
    .line 605
    const-string v10, "key_intent_action_uic_list"

    .line 606
    .line 607
    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 608
    .line 609
    .line 610
    move-result v9

    .line 611
    if-eqz v9, :cond_18

    .line 612
    .line 613
    :cond_28
    :goto_13
    invoke-static {}, Lr0/j0;->g()Ljava/util/Set;

    .line 614
    .line 615
    .line 616
    move-result-object v9

    .line 617
    invoke-interface {v9}, Ljava/util/Set;->isEmpty()Z

    .line 618
    .line 619
    .line 620
    move-result v10

    .line 621
    if-eqz v10, :cond_29

    .line 622
    .line 623
    goto/16 :goto_b

    .line 624
    .line 625
    :cond_29
    const-string v10, "block_contact"

    .line 626
    .line 627
    invoke-virtual {v7, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v11

    .line 631
    if-nez v11, :cond_2a

    .line 632
    .line 633
    move-object v11, v3

    .line 634
    :cond_2a
    new-array v12, v8, [C

    .line 635
    .line 636
    const/16 v13, 0x2c

    .line 637
    .line 638
    aput-char v13, v12, v4

    .line 639
    .line 640
    invoke-static {v11, v12}, LU0/i;->u0(Ljava/lang/String;[C)Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v11

    .line 644
    new-instance v12, Ljava/util/ArrayList;

    .line 645
    .line 646
    invoke-static {v11}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 647
    .line 648
    .line 649
    move-result v13

    .line 650
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 651
    .line 652
    .line 653
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 654
    .line 655
    .line 656
    move-result-object v11

    .line 657
    :goto_14
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 658
    .line 659
    .line 660
    move-result v13

    .line 661
    if-eqz v13, :cond_2b

    .line 662
    .line 663
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v13

    .line 667
    check-cast v13, Ljava/lang/String;

    .line 668
    .line 669
    invoke-static {v13}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 670
    .line 671
    .line 672
    move-result-object v13

    .line 673
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v13

    .line 677
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    goto :goto_14

    .line 681
    :cond_2b
    new-instance v11, Ljava/util/ArrayList;

    .line 682
    .line 683
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 687
    .line 688
    .line 689
    move-result-object v12

    .line 690
    :cond_2c
    :goto_15
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 691
    .line 692
    .line 693
    move-result v13

    .line 694
    if-eqz v13, :cond_2d

    .line 695
    .line 696
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v13

    .line 700
    move-object v14, v13

    .line 701
    check-cast v14, Ljava/lang/String;

    .line 702
    .line 703
    invoke-static {v14}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 704
    .line 705
    .line 706
    move-result v14

    .line 707
    if-nez v14, :cond_2c

    .line 708
    .line 709
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    goto :goto_15

    .line 713
    :cond_2d
    new-instance v15, Ljava/util/LinkedHashSet;

    .line 714
    .line 715
    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v15, v11}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 719
    .line 720
    .line 721
    invoke-virtual {v15, v9}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 722
    .line 723
    .line 724
    const/16 v18, 0x0

    .line 725
    .line 726
    const/16 v19, 0x0

    .line 727
    .line 728
    const-string v16, ","

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    const/16 v20, 0x3e

    .line 733
    .line 734
    invoke-static/range {v15 .. v20}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v11

    .line 738
    invoke-virtual {v7, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v7}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 742
    .line 743
    .line 744
    move-result-object v7

    .line 745
    if-eqz v7, :cond_2e

    .line 746
    .line 747
    invoke-virtual {v7}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v7

    .line 751
    goto :goto_16

    .line 752
    :cond_2e
    move-object v7, v6

    .line 753
    :goto_16
    if-nez v7, :cond_2f

    .line 754
    .line 755
    move-object v7, v3

    .line 756
    :cond_2f
    invoke-interface {v9}, Ljava/util/Set;->size()I

    .line 757
    .line 758
    .line 759
    move-result v9

    .line 760
    const-string v10, "add="

    .line 761
    .line 762
    invoke-static {v9, v10}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v9

    .line 766
    invoke-virtual {v15}, Ljava/util/AbstractCollection;->size()I

    .line 767
    .line 768
    .line 769
    move-result v10

    .line 770
    const-string v11, "total="

    .line 771
    .line 772
    invoke-static {v10, v11}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v10

    .line 776
    const-string v11, "inject block_contact"

    .line 777
    .line 778
    filled-new-array {v11, v7, v9, v10}, [Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v7

    .line 782
    invoke-virtual {v5, v7}, Lr0/j0;->A([Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_b

    .line 786
    .line 787
    :cond_30
    return-void

    .line 788
    nop

    .line 789
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x5 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
