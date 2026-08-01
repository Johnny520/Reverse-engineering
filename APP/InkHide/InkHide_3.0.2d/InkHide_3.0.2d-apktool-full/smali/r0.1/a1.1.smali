.class public final Lr0/a1;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/L0;


# direct methods
.method public synthetic constructor <init>(Lr0/L0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/a1;->a:I

    iput-object p1, p0, Lr0/a1;->b:Lr0/L0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lr0/a1;->a:I

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
    instance-of v0, p1, Landroid/widget/ListView;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/widget/ListView;

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
    goto :goto_2

    .line 25
    :cond_1
    iget-object v0, p0, Lr0/a1;->b:Lr0/L0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lr0/L0;->O(Landroid/widget/ListView;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    iget-object v1, v0, Lr0/L0;->d:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-static {v0, p1, v1}, Lr0/L0;->e(Lr0/L0;Landroid/widget/ListView;Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x0

    .line 51
    :goto_1
    if-ge v2, v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v4, "getChildAt(...)"

    .line 58
    .line 59
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v3, p1}, Lr0/L0;->R(Landroid/view/View;Landroid/widget/ListView;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_2
    return-void

    .line 69
    :pswitch_2
    const-string v0, "param"

    .line 70
    .line 71
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lr0/a1;->b:Lr0/L0;

    .line 75
    .line 76
    iget-object v1, v0, Lr0/L0;->o:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Ljava/lang/ThreadLocal;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 81
    .line 82
    .line 83
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 84
    .line 85
    const-string v2, "args"

    .line 86
    .line 87
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x2

    .line 91
    invoke-static {v2, v1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    instance-of v2, v1, Landroid/widget/ListView;

    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    check-cast v1, Landroid/widget/ListView;

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    move-object v1, v3

    .line 104
    :goto_3
    if-nez v1, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    iget-object v2, v0, Lr0/L0;->d:Ljava/util/Set;

    .line 108
    .line 109
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_6

    .line 114
    .line 115
    invoke-static {v1}, Lr0/L0;->O(Landroid/widget/ListView;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-nez v4, :cond_6

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    instance-of v2, p1, Landroid/view/View;

    .line 130
    .line 131
    if-eqz v2, :cond_7

    .line 132
    .line 133
    move-object v3, p1

    .line 134
    check-cast v3, Landroid/view/View;

    .line 135
    .line 136
    :cond_7
    if-nez v3, :cond_8

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_8
    invoke-virtual {v0, v3, v1}, Lr0/L0;->R(Landroid/view/View;Landroid/widget/ListView;)V

    .line 140
    .line 141
    .line 142
    :goto_4
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    iget v0, p0, Lr0/a1;->a:I

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
    instance-of v0, p1, Landroid/widget/ListView;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/widget/ListView;

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
    goto :goto_2

    .line 25
    :cond_1
    iget-object v0, p0, Lr0/a1;->b:Lr0/L0;

    .line 26
    .line 27
    iget-object v1, v0, Lr0/L0;->d:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    invoke-static {p1}, Lr0/L0;->O(Landroid/widget/ListView;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iget-object v1, v0, Lr0/L0;->d:Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    invoke-static {v0, p1, v1}, Lr0/L0;->e(Lr0/L0;Landroid/widget/ListView;Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    :goto_1
    if-ge v1, v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const-string v4, "getChildAt(...)"

    .line 62
    .line 63
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v3, p1}, Lr0/L0;->R(Landroid/view/View;Landroid/widget/ListView;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    :goto_2
    return-void

    .line 73
    :pswitch_1
    const-string v0, "param"

    .line 74
    .line 75
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v1, p0, Lr0/a1;->b:Lr0/L0;

    .line 81
    .line 82
    invoke-static {v1, v0}, Lr0/L0;->g(Lr0/L0;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_5
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 90
    .line 91
    const-string v2, "args"

    .line 92
    .line 93
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    instance-of v3, v0, Ljava/lang/Integer;

    .line 102
    .line 103
    if-eqz v3, :cond_6

    .line 104
    .line 105
    check-cast v0, Ljava/lang/Integer;

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    const/4 v0, 0x0

    .line 109
    :goto_3
    if-eqz v0, :cond_9

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 116
    .line 117
    const-string v4, "thisObject"

    .line 118
    .line 119
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v3}, Lr0/L0;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-ltz v0, :cond_8

    .line 127
    .line 128
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-lt v0, v4, :cond_7

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Ljava/lang/Number;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    iget-object v1, v1, Lr0/L0;->o:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v1, Ljava/lang/ThreadLocal;

    .line 148
    .line 149
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v1, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 157
    .line 158
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    aput-object v0, p1, v2

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    :goto_4
    iget-object p1, v1, Lr0/L0;->o:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, Ljava/lang/ThreadLocal;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    .line 170
    .line 171
    .line 172
    :cond_9
    :goto_5
    return-void

    .line 173
    :pswitch_2
    const-string v0, "param"

    .line 174
    .line 175
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lr0/a1;->b:Lr0/L0;

    .line 179
    .line 180
    iget-object v1, v0, Lr0/L0;->h:Ljava/util/WeakHashMap;

    .line 181
    .line 182
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-virtual {v1, v2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    iget-object v1, v0, Lr0/L0;->g:Ljava/util/Set;

    .line 188
    .line 189
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-nez v1, :cond_a

    .line 196
    .line 197
    iget-object v0, v0, Lr0/L0;->l:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Ljava/util/WeakHashMap;

    .line 200
    .line 201
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    :cond_a
    return-void

    .line 207
    :pswitch_3
    const-string v0, "param"

    .line 208
    .line 209
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 213
    .line 214
    iget-object v1, p0, Lr0/a1;->b:Lr0/L0;

    .line 215
    .line 216
    invoke-static {v1, v0}, Lr0/L0;->g(Lr0/L0;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-nez v0, :cond_b

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_b
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 224
    .line 225
    const-string v2, "args"

    .line 226
    .line 227
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    const/4 v2, 0x0

    .line 231
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    instance-of v3, v0, Ljava/lang/Integer;

    .line 236
    .line 237
    if-eqz v3, :cond_c

    .line 238
    .line 239
    check-cast v0, Ljava/lang/Integer;

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_c
    const/4 v0, 0x0

    .line 243
    :goto_6
    if-eqz v0, :cond_11

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    iget-object v3, v1, Lr0/L0;->o:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v3, Ljava/lang/ThreadLocal;

    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, Ljava/lang/Integer;

    .line 258
    .line 259
    if-nez v3, :cond_d

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-ne v3, v0, :cond_e

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_e
    :goto_7
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 270
    .line 271
    const-string v4, "thisObject"

    .line 272
    .line 273
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v3}, Lr0/L0;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-ltz v0, :cond_10

    .line 281
    .line 282
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    if-lt v0, v3, :cond_f

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_f
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 290
    .line 291
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    aput-object v0, p1, v2

    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_10
    :goto_8
    const-wide/16 v0, 0x0

    .line 299
    .line 300
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_11
    :goto_9
    return-void

    .line 308
    :pswitch_4
    const-string v0, "param"

    .line 309
    .line 310
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 314
    .line 315
    iget-object v1, p0, Lr0/a1;->b:Lr0/L0;

    .line 316
    .line 317
    invoke-static {v1, v0}, Lr0/L0;->g(Lr0/L0;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_12

    .line 322
    .line 323
    goto :goto_d

    .line 324
    :cond_12
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 325
    .line 326
    const-string v2, "args"

    .line 327
    .line 328
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const/4 v2, 0x0

    .line 332
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    instance-of v2, v0, Ljava/lang/Integer;

    .line 337
    .line 338
    const/4 v3, 0x0

    .line 339
    if-eqz v2, :cond_13

    .line 340
    .line 341
    check-cast v0, Ljava/lang/Integer;

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_13
    move-object v0, v3

    .line 345
    :goto_a
    if-eqz v0, :cond_18

    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    iget-object v2, v1, Lr0/L0;->o:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v2, Ljava/lang/ThreadLocal;

    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    check-cast v2, Ljava/lang/Integer;

    .line 360
    .line 361
    if-nez v2, :cond_14

    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_14
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-ne v2, v0, :cond_15

    .line 369
    .line 370
    goto :goto_d

    .line 371
    :cond_15
    :goto_b
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 372
    .line 373
    const-string v4, "thisObject"

    .line 374
    .line 375
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v2}, Lr0/L0;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    if-ltz v0, :cond_17

    .line 383
    .line 384
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    if-lt v0, v5, :cond_16

    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_16
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 392
    .line 393
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Ljava/lang/Number;

    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-virtual {v1, v0, v3}, Lr0/L0;->J(ILjava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    goto :goto_d

    .line 414
    :cond_17
    :goto_c
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    :cond_18
    :goto_d
    return-void

    .line 418
    :pswitch_5
    const-string v0, "param"

    .line 419
    .line 420
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 424
    .line 425
    iget-object v1, p0, Lr0/a1;->b:Lr0/L0;

    .line 426
    .line 427
    invoke-static {v1, v0}, Lr0/L0;->g(Lr0/L0;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-nez v0, :cond_19

    .line 432
    .line 433
    goto :goto_e

    .line 434
    :cond_19
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 435
    .line 436
    const-string v2, "thisObject"

    .line 437
    .line 438
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1, v0}, Lr0/L0;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    :goto_e
    return-void

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
