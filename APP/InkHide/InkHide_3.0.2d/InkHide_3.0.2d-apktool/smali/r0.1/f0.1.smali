.class public final Lr0/f0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/g0;


# direct methods
.method public synthetic constructor <init>(Lr0/g0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/f0;->a:I

    iput-object p1, p0, Lr0/f0;->b:Lr0/g0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lr0/f0;->a:I

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
    iget-object v1, p0, Lr0/f0;->b:Lr0/g0;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lr0/g0;->o(Landroid/view/View;)Z

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v0}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    const-string v3, ""

    .line 49
    .line 50
    :cond_3
    const-string v4, "tag page setAdapter"

    .line 51
    .line 52
    filled-new-array {v4, v2, v3}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v1, Lr0/g0;->c:Ljava/util/Set;

    .line 60
    .line 61
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 65
    .line 66
    const-string v2, "args"

    .line 67
    .line 68
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-static {v2, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    invoke-static {v0}, Lr0/g0;->h(Landroid/view/View;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :cond_4
    if-eqz p1, :cond_5

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v1, p1}, Lr0/g0;->k(Ljava/lang/Class;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    invoke-virtual {v1, v0}, Lr0/g0;->u(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    return-void

    .line 95
    :pswitch_2
    const-string v0, "param"

    .line 96
    .line 97
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 101
    .line 102
    const-string v1, "args"

    .line 103
    .line 104
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 122
    .line 123
    instance-of v0, p1, Landroid/app/Activity;

    .line 124
    .line 125
    const/4 v1, 0x0

    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    check-cast p1, Landroid/app/Activity;

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_7
    move-object p1, v1

    .line 132
    :goto_2
    if-nez p1, :cond_8

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object v2, p0, Lr0/f0;->b:Lr0/g0;

    .line 144
    .line 145
    invoke-virtual {v2, v0}, Lr0/g0;->m(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_9

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v3, "activity focus"

    .line 160
    .line 161
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v2, v0}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {p1}, Lb1/h;->F(Landroid/app/Activity;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    const-string v4, "tag="

    .line 181
    .line 182
    invoke-static {v4, v3}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    const-string v4, "focus"

    .line 187
    .line 188
    filled-new-array {v4, v0, v3}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v2, v0}, Lr0/g0;->p([Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_9
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    if-eqz p1, :cond_a

    .line 200
    .line 201
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    :cond_a
    invoke-virtual {v2, v1}, Lr0/g0;->t(Landroid/view/View;)V

    .line 206
    .line 207
    .line 208
    :goto_3
    return-void

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lr0/f0;->a:I

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
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/view/ViewGroup;

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
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lr0/f0;->b:Lr0/g0;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "mim"

    .line 36
    .line 37
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const-string v3, ""

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    const-string v2, "k12"

    .line 46
    .line 47
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    move-object v1, v3

    .line 64
    :cond_3
    const-string v4, "viewgroup dispatch"

    .line 65
    .line 66
    filled-new-array {v4, v2, v1}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-virtual {v0, p1}, Lr0/g0;->o(Landroid/view/View;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_5

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    iget-object v1, v0, Lr0/g0;->c:Ljava/util/Set;

    .line 81
    .line 82
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Lr0/g0;->c(Landroid/view/ViewGroup;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    goto :goto_2

    .line 93
    :cond_6
    invoke-virtual {v0, p1}, Lr0/g0;->o(Landroid/view/View;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_7

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    goto :goto_2

    .line 101
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    if-nez v4, :cond_8

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_8
    move-object v3, v4

    .line 117
    :goto_1
    const-string v4, "tag recycler target"

    .line 118
    .line 119
    filled-new-array {v4, v2, v3}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v0, v2}, Lr0/g0;->p([Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p1}, Lr0/g0;->c(Landroid/view/ViewGroup;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    :goto_2
    if-eqz v1, :cond_a

    .line 134
    .line 135
    invoke-static {p1}, Lr0/g0;->h(Landroid/view/View;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    if-eqz v1, :cond_9

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Lr0/g0;->k(Ljava/lang/Class;)V

    .line 146
    .line 147
    .line 148
    :cond_9
    invoke-virtual {v0, p1}, Lr0/g0;->u(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    :cond_a
    :goto_3
    return-void

    .line 152
    :pswitch_2
    const-string v0, "param"

    .line 153
    .line 154
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 158
    .line 159
    instance-of v0, p1, Landroid/view/View;

    .line 160
    .line 161
    if-eqz v0, :cond_b

    .line 162
    .line 163
    check-cast p1, Landroid/view/View;

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_b
    const/4 p1, 0x0

    .line 167
    :goto_4
    if-nez p1, :cond_c

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_c
    iget-object v0, p0, Lr0/f0;->b:Lr0/g0;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v2, "mim"

    .line 180
    .line 181
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    const-string v3, ""

    .line 186
    .line 187
    if-nez v2, :cond_d

    .line 188
    .line 189
    const-string v2, "k12"

    .line 190
    .line 191
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_f

    .line 196
    .line 197
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    if-nez v1, :cond_e

    .line 206
    .line 207
    move-object v1, v3

    .line 208
    :cond_e
    const-string v4, "recycler beforeRender raw"

    .line 209
    .line 210
    filled-new-array {v4, v2, v1}, [Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v0, v1}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_f
    invoke-virtual {v0, p1}, Lr0/g0;->o(Landroid/view/View;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-nez v1, :cond_10

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    if-nez v2, :cond_11

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_11
    move-object v3, v2

    .line 240
    :goto_5
    const-string v2, "tag page beforeRender"

    .line 241
    .line 242
    filled-new-array {v2, v1, v3}, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v0, v1}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object v1, v0, Lr0/g0;->c:Ljava/util/Set;

    .line 250
    .line 251
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    invoke-static {p1}, Lr0/g0;->h(Landroid/view/View;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    if-eqz v1, :cond_12

    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v0, v1}, Lr0/g0;->k(Ljava/lang/Class;)V

    .line 265
    .line 266
    .line 267
    :cond_12
    invoke-virtual {v0, p1}, Lr0/g0;->u(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    :goto_6
    return-void

    .line 271
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
