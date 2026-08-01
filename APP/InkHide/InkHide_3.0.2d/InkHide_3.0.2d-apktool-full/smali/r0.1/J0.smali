.class public final Lr0/J0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/L0;


# direct methods
.method public synthetic constructor <init>(Lr0/L0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/J0;->a:I

    iput-object p1, p0, Lr0/J0;->b:Lr0/L0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, Lr0/J0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v0, p1, Landroid/view/View;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/view/View;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v0, p0, Lr0/J0;->b:Lr0/L0;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lr0/L0;->N(Landroid/view/View;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_1
    return-void

    .line 42
    :pswitch_1
    const-string v0, "param"

    .line 43
    .line 44
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lr0/J0;->b:Lr0/L0;

    .line 48
    .line 49
    invoke-virtual {v0}, Lr0/L0;->n()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-static {v0, p1, v1}, Lr0/L0;->c(Lr0/L0;Ljava/lang/Object;Ljava/util/Set;)V

    .line 63
    .line 64
    .line 65
    :goto_2
    return-void

    .line 66
    :pswitch_2
    const-string v0, "param"

    .line 67
    .line 68
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 72
    .line 73
    instance-of v0, p1, Landroid/app/Activity;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    check-cast p1, Landroid/app/Activity;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    const/4 p1, 0x0

    .line 81
    :goto_3
    if-nez p1, :cond_5

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    iget-object v0, p0, Lr0/J0;->b:Lr0/L0;

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Lr0/L0;->L(Landroid/app/Activity;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_6

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    invoke-static {v0, p1}, Lr0/L0;->a(Lr0/L0;Landroid/app/Activity;)V

    .line 94
    .line 95
    .line 96
    :goto_4
    return-void

    .line 97
    :pswitch_3
    const-string v0, "param"

    .line 98
    .line 99
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 103
    .line 104
    const-string v1, "args"

    .line 105
    .line 106
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_7

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_7
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 124
    .line 125
    instance-of v0, p1, Landroid/app/Activity;

    .line 126
    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    check-cast p1, Landroid/app/Activity;

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_8
    const/4 p1, 0x0

    .line 133
    :goto_5
    if-nez p1, :cond_9

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    iget-object v0, p0, Lr0/J0;->b:Lr0/L0;

    .line 137
    .line 138
    invoke-virtual {v0, p1}, Lr0/L0;->L(Landroid/app/Activity;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_a

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_a
    invoke-static {v0}, Lr0/L0;->f(Lr0/L0;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v0, p1}, Lr0/L0;->a(Lr0/L0;Landroid/app/Activity;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-eqz v1, :cond_b

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-eqz v1, :cond_b

    .line 162
    .line 163
    new-instance v2, LA0/m;

    .line 164
    .line 165
    const/4 v3, 0x7

    .line 166
    invoke-direct {v2, v0, p1, v3}, LA0/m;-><init>(Le0/a;Landroid/app/Activity;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 170
    .line 171
    .line 172
    :cond_b
    :goto_6
    return-void

    .line 173
    :pswitch_4
    const-string v0, "param"

    .line 174
    .line 175
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lr0/J0;->b:Lr0/L0;

    .line 179
    .line 180
    invoke-static {v0}, Lr0/L0;->d(Lr0/L0;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_c

    .line 185
    .line 186
    goto :goto_8

    .line 187
    :cond_c
    invoke-virtual {v0}, Lr0/L0;->n()Ljava/util/Set;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_d

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_d
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-nez p1, :cond_e

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-static {v2}, Lr0/L0;->h(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    const/4 v3, 0x0

    .line 218
    :cond_f
    move v4, v3

    .line 219
    :catchall_0
    :cond_10
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_13

    .line 224
    .line 225
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    check-cast v5, Ljava/lang/reflect/Field;

    .line 230
    .line 231
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    if-eqz v6, :cond_11

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_11
    const/4 v6, 0x1

    .line 243
    :try_start_0
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-static {v5}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-eqz v7, :cond_10

    .line 255
    .line 256
    check-cast v5, Ljava/util/List;

    .line 257
    .line 258
    invoke-virtual {v0, v5, v1}, Lr0/L0;->v(Ljava/util/List;Ljava/util/Set;)Z

    .line 259
    .line 260
    .line 261
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    if-nez v5, :cond_12

    .line 263
    .line 264
    if-eqz v4, :cond_f

    .line 265
    .line 266
    :cond_12
    move v4, v6

    .line 267
    goto :goto_7

    .line 268
    :cond_13
    :goto_8
    return-void

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Lr0/J0;->a:I

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
    iget-object v0, p0, Lr0/J0;->b:Lr0/L0;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "getStackTrace(...)"

    .line 26
    .line 27
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    array-length v2, v1

    .line 31
    const/4 v3, 0x0

    .line 32
    move v4, v3

    .line 33
    :goto_0
    if-ge v4, v2, :cond_4

    .line 34
    .line 35
    aget-object v5, v1, v4

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const-string v6, "com.tencent.mm.ui.contact.item.q1"

    .line 42
    .line 43
    invoke-static {v5, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    invoke-static {v5}, LN0/g;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-string v6, "com.tencent.mm.ui.mvvm.uic.conversation.recent."

    .line 53
    .line 54
    invoke-static {v5, v3, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_1

    .line 59
    .line 60
    const-string v6, "com.tencent.mm.ui.transmit.recent."

    .line 61
    .line 62
    invoke-static {v5, v3, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    :goto_1
    invoke-virtual {v0}, Lr0/L0;->n()Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 84
    .line 85
    const-string v2, "args"

    .line 86
    .line 87
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    array-length v2, p1

    .line 91
    :goto_2
    if-ge v3, v2, :cond_4

    .line 92
    .line 93
    aget-object v4, p1, v3

    .line 94
    .line 95
    invoke-static {v4}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_3

    .line 100
    .line 101
    check-cast v4, Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {v0, v4, v1}, Lr0/L0;->u(Ljava/util/List;Ljava/util/Set;)Z

    .line 104
    .line 105
    .line 106
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    :goto_3
    return-void

    .line 110
    :pswitch_2
    const-string v0, "param"

    .line 111
    .line 112
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 116
    .line 117
    instance-of v1, v0, Landroid/view/View;

    .line 118
    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    check-cast v0, Landroid/view/View;

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    const/4 v0, 0x0

    .line 125
    :goto_4
    if-nez v0, :cond_6

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_6
    iget-object v1, p0, Lr0/J0;->b:Lr0/L0;

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Lr0/L0;->N(Landroid/view/View;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_7

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_7
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 138
    .line 139
    const-string v2, "args"

    .line 140
    .line 141
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-static {v2, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-nez p1, :cond_8

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_8
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 153
    .line 154
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Lr0/L0;->n()Ljava/util/Set;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-nez v2, :cond_9

    .line 169
    .line 170
    invoke-virtual {v1, p1, v0}, Lr0/L0;->x(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 171
    .line 172
    .line 173
    :cond_9
    :goto_5
    return-void

    .line 174
    :pswitch_3
    const-string v0, "param"

    .line 175
    .line 176
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 180
    .line 181
    instance-of v0, p1, Landroid/app/Activity;

    .line 182
    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    check-cast p1, Landroid/app/Activity;

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_a
    const/4 p1, 0x0

    .line 189
    :goto_6
    if-nez p1, :cond_b

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_b
    iget-object v0, p0, Lr0/J0;->b:Lr0/L0;

    .line 193
    .line 194
    invoke-virtual {v0, p1}, Lr0/L0;->L(Landroid/app/Activity;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-nez v1, :cond_c

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_c
    invoke-static {v0}, Lr0/L0;->f(Lr0/L0;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v0, p1}, Lr0/L0;->a(Lr0/L0;Landroid/app/Activity;)V

    .line 205
    .line 206
    .line 207
    :goto_7
    return-void

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
