.class public final Lr0/W;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lr0/d0;


# direct methods
.method public synthetic constructor <init>(ZLr0/d0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/W;->a:I

    iput-boolean p1, p0, Lr0/W;->b:Z

    iput-object p2, p0, Lr0/W;->c:Lr0/d0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, Lr0/W;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "param"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 12
    .line 13
    const-string v1, "args"

    .line 14
    .line 15
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    :try_start_0
    const-string v2, "itemView"

    .line 28
    .line 29
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 30
    .line 31
    invoke-interface {v3, v0, v2}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    new-instance v2, LE0/d;

    .line 40
    .line 41
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object v0, v2

    .line 45
    :goto_0
    nop

    .line 46
    instance-of v2, v0, LE0/d;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    move-object v0, v3

    .line 52
    :cond_1
    check-cast v0, Landroid/view/View;

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_2
    iget-boolean v2, p0, Lr0/W;->b:Z

    .line 59
    .line 60
    iget-object v4, p0, Lr0/W;->c:Lr0/d0;

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v4, v2}, Lr0/d0;->E0(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_d

    .line 79
    .line 80
    :cond_3
    iget-object v2, v4, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    move-object v2, v3

    .line 90
    :goto_1
    if-eqz v2, :cond_5

    .line 91
    .line 92
    invoke-static {v2}, Lr0/d0;->z(Ljava/lang/Object;)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v2, v3

    .line 98
    :goto_2
    const/4 v5, 0x1

    .line 99
    if-eqz v2, :cond_8

    .line 100
    .line 101
    move-object v6, v0

    .line 102
    :goto_3
    if-eqz v6, :cond_8

    .line 103
    .line 104
    if-ne v6, v2, :cond_6

    .line 105
    .line 106
    move v2, v5

    .line 107
    goto :goto_4

    .line 108
    :cond_6
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    instance-of v7, v6, Landroid/view/View;

    .line 113
    .line 114
    if-eqz v7, :cond_7

    .line 115
    .line 116
    check-cast v6, Landroid/view/View;

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    move-object v6, v3

    .line 120
    goto :goto_3

    .line 121
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-eqz v2, :cond_9

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    :cond_9
    if-nez v3, :cond_a

    .line 136
    .line 137
    const-string v3, ""

    .line 138
    .line 139
    :cond_a
    invoke-static {v3}, Lr0/d0;->q0(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    :goto_4
    if-nez v2, :cond_b

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_b
    invoke-virtual {v4}, Lr0/d0;->F()Ljava/util/Set;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_c

    .line 155
    .line 156
    invoke-virtual {v4, v0}, Lr0/d0;->U0(Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_c
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const-string v3, "adapter="

    .line 171
    .line 172
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v5, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v3, "position="

    .line 188
    .line 189
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    const-string v1, "hide contact mvvm bind"

    .line 200
    .line 201
    filled-new-array {v1, v2, p1}, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v0}, Lr0/d0;->Y0(Landroid/view/View;)V

    .line 209
    .line 210
    .line 211
    new-instance p1, Lr0/H;

    .line 212
    .line 213
    const/4 v1, 0x4

    .line 214
    invoke-direct {p1, v4, v0, v1}, Lr0/H;-><init>(Lr0/d0;Landroid/view/View;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 218
    .line 219
    .line 220
    :cond_d
    :goto_5
    return-void

    .line 221
    :pswitch_0
    const-string v0, "param"

    .line 222
    .line 223
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 227
    .line 228
    const-string v1, "args"

    .line 229
    .line 230
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    array-length v1, v0

    .line 234
    const/4 v2, 0x0

    .line 235
    if-nez v1, :cond_e

    .line 236
    .line 237
    move-object v0, v2

    .line 238
    goto :goto_6

    .line 239
    :cond_e
    const/4 v1, 0x0

    .line 240
    aget-object v0, v0, v1

    .line 241
    .line 242
    :goto_6
    iget-boolean v1, p0, Lr0/W;->b:Z

    .line 243
    .line 244
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-nez v0, :cond_f

    .line 253
    .line 254
    goto :goto_8

    .line 255
    :cond_f
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 256
    .line 257
    if-nez p1, :cond_10

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_10
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 261
    .line 262
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object v1, p0, Lr0/W;->c:Lr0/d0;

    .line 266
    .line 267
    iput-object v0, v1, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 268
    .line 269
    iget-object v0, v1, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 270
    .line 271
    if-eqz v0, :cond_11

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, Landroid/widget/ListView;

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_11
    move-object v0, v2

    .line 281
    :goto_7
    iget-object v3, v1, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 282
    .line 283
    if-eqz v3, :cond_12

    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    check-cast v2, Landroid/view/View;

    .line 290
    .line 291
    :cond_12
    invoke-static {p1, v0, v2}, Lr0/d0;->R0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    if-nez p1, :cond_13

    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_13
    new-instance v0, Lr0/J;

    .line 299
    .line 300
    const/4 v2, 0x0

    .line 301
    invoke-direct {v0, v1, v2}, Lr0/J;-><init>(Lr0/d0;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 305
    .line 306
    .line 307
    new-instance v0, Lr0/J;

    .line 308
    .line 309
    const/4 v2, 0x1

    .line 310
    invoke-direct {v0, v1, v2}, Lr0/J;-><init>(Lr0/d0;I)V

    .line 311
    .line 312
    .line 313
    const-wide/16 v1, 0x60

    .line 314
    .line 315
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 316
    .line 317
    .line 318
    :goto_8
    return-void

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
