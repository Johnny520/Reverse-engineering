.class public final synthetic Lr0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Le0/a;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lr0/A1;Landroid/app/Activity;Landroid/widget/EditText;Ljava/lang/Object;ZLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lr0/r0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/r0;->c:Le0/a;

    iput-object p2, p0, Lr0/r0;->f:Ljava/lang/Object;

    iput-object p3, p0, Lr0/r0;->g:Landroid/view/View;

    iput-object p4, p0, Lr0/r0;->d:Ljava/lang/Object;

    iput-boolean p5, p0, Lr0/r0;->b:Z

    iput-object p6, p0, Lr0/r0;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLr0/H0;LM0/a;Ljava/lang/Object;Landroid/view/View;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p7, p0, Lr0/r0;->a:I

    iput-boolean p1, p0, Lr0/r0;->b:Z

    iput-object p2, p0, Lr0/r0;->c:Le0/a;

    iput-object p3, p0, Lr0/r0;->f:Ljava/lang/Object;

    iput-object p4, p0, Lr0/r0;->d:Ljava/lang/Object;

    iput-object p5, p0, Lr0/r0;->g:Landroid/view/View;

    iput-object p6, p0, Lr0/r0;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lr0/r0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/r0;->c:Le0/a;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Lr0/A1;

    .line 10
    .line 11
    iget-object v0, p0, Lr0/r0;->f:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v6, v0

    .line 14
    check-cast v6, Landroid/app/Activity;

    .line 15
    .line 16
    iget-object v3, p0, Lr0/r0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    :try_start_0
    const-string v0, "input_method"

    .line 19
    .line 20
    invoke-virtual {v6, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Landroid/view/inputmethod/InputMethodManager;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    iget-object v1, p0, Lr0/r0;->g:Landroid/view/View;

    .line 35
    .line 36
    move-object v4, v1

    .line 37
    check-cast v4, Landroid/widget/EditText;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v4}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-virtual {v0, v1, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v6, v3, v4}, Lr0/A1;->a(Landroid/app/Activity;Ljava/lang/Object;Landroid/widget/EditText;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lz0/r;->t()Z

    .line 65
    .line 66
    .line 67
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    iget-object v8, v2, Lr0/A1;->c:Landroid/os/Handler;

    .line 69
    .line 70
    iget-boolean v7, p0, Lr0/r0;->b:Z

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    :try_start_2
    new-instance v1, Lr0/z1;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-direct/range {v1 .. v7}, Lr0/z1;-><init>(Lr0/A1;Ljava/lang/Object;Landroid/widget/EditText;ILandroid/app/Activity;Z)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v2, 0xdc

    .line 81
    .line 82
    invoke-virtual {v8, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 83
    .line 84
    .line 85
    sget-object v0, LE0/i;->a:LE0/i;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    new-instance v0, Lr0/i1;

    .line 89
    .line 90
    const/4 v1, 0x1

    .line 91
    invoke-direct {v0, v2, v6, v7, v1}, Lr0/i1;-><init>(Le0/a;Landroid/view/KeyEvent$Callback;ZI)V

    .line 92
    .line 93
    .line 94
    const-wide/16 v1, 0x104

    .line 95
    .line 96
    invoke-virtual {v8, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    goto :goto_2

    .line 105
    :goto_1
    new-instance v1, LE0/d;

    .line 106
    .line 107
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    move-object v0, v1

    .line 111
    :goto_2
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    iget-object v1, p0, Lr0/r0;->e:Ljava/lang/String;

    .line 118
    .line 119
    const-string v2, "search command handle fail"

    .line 120
    .line 121
    filled-new-array {v2, v1, v0}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_4
    return-void

    .line 129
    :pswitch_0
    iget-object v0, p0, Lr0/r0;->d:Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v1, p0, Lr0/r0;->g:Landroid/view/View;

    .line 132
    .line 133
    check-cast v1, Landroid/widget/ListView;

    .line 134
    .line 135
    iget-boolean v2, p0, Lr0/r0;->b:Z

    .line 136
    .line 137
    iget-object v3, p0, Lr0/r0;->c:Le0/a;

    .line 138
    .line 139
    check-cast v3, Lr0/H0;

    .line 140
    .line 141
    if-eqz v2, :cond_5

    .line 142
    .line 143
    const/4 v2, 0x0

    .line 144
    iput-boolean v2, v3, Lr0/H0;->u:Z

    .line 145
    .line 146
    :cond_5
    iget-object v2, p0, Lr0/r0;->f:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Lr0/o0;

    .line 149
    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    :try_start_3
    invoke-virtual {v2}, Lr0/o0;->b()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :catchall_1
    move-exception v0

    .line 157
    goto :goto_4

    .line 158
    :cond_6
    :goto_3
    invoke-virtual {v3, v0}, Lr0/H0;->k1(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, v0}, Lr0/H0;->h1(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 171
    .line 172
    .line 173
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :goto_4
    new-instance v1, LE0/d;

    .line 177
    .line 178
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    move-object v0, v1

    .line 182
    :goto_5
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-eqz v0, :cond_7

    .line 187
    .line 188
    iget-object v1, p0, Lr0/r0;->e:Ljava/lang/String;

    .line 189
    .line 190
    const-string v2, "refresh legacy 65-66 fail"

    .line 191
    .line 192
    filled-new-array {v2, v1, v0}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    return-void

    .line 200
    :pswitch_1
    iget-object v0, p0, Lr0/r0;->d:Ljava/lang/Object;

    .line 201
    .line 202
    iget-object v1, p0, Lr0/r0;->g:Landroid/view/View;

    .line 203
    .line 204
    iget-boolean v2, p0, Lr0/r0;->b:Z

    .line 205
    .line 206
    iget-object v3, p0, Lr0/r0;->c:Le0/a;

    .line 207
    .line 208
    check-cast v3, Lr0/H0;

    .line 209
    .line 210
    const/4 v4, 0x0

    .line 211
    if-eqz v2, :cond_8

    .line 212
    .line 213
    iput-boolean v4, v3, Lr0/H0;->u:Z

    .line 214
    .line 215
    :cond_8
    iget-object v2, p0, Lr0/r0;->f:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v2, LM0/a;

    .line 218
    .line 219
    :try_start_4
    invoke-interface {v2}, LM0/a;->b()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v0}, Lr0/H0;->z0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v0}, Lr0/H0;->g1(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 226
    .line 227
    .line 228
    :try_start_5
    const-string v0, "invalidateViews"

    .line 229
    .line 230
    new-array v2, v4, [Ljava/lang/Object;

    .line 231
    .line 232
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 233
    .line 234
    invoke-interface {v3, v1, v0, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 235
    .line 236
    .line 237
    :catchall_2
    :try_start_6
    const-string v0, "requestLayout"

    .line 238
    .line 239
    new-array v2, v4, [Ljava/lang/Object;

    .line 240
    .line 241
    invoke-static {v1, v0, v2}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    const-string v0, "invalidate"

    .line 245
    .line 246
    new-array v2, v4, [Ljava/lang/Object;

    .line 247
    .line 248
    invoke-static {v1, v0, v2}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    instance-of v2, v0, Landroid/view/View;

    .line 256
    .line 257
    const/4 v3, 0x0

    .line 258
    if-eqz v2, :cond_9

    .line 259
    .line 260
    check-cast v0, Landroid/view/View;

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :catchall_3
    move-exception v0

    .line 264
    goto :goto_8

    .line 265
    :cond_9
    move-object v0, v3

    .line 266
    :goto_6
    if-eqz v0, :cond_a

    .line 267
    .line 268
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 269
    .line 270
    .line 271
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    instance-of v1, v0, Landroid/view/View;

    .line 276
    .line 277
    if-eqz v1, :cond_b

    .line 278
    .line 279
    check-cast v0, Landroid/view/View;

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_b
    move-object v0, v3

    .line 283
    :goto_7
    if-eqz v0, :cond_c

    .line 284
    .line 285
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 286
    .line 287
    .line 288
    sget-object v3, LE0/i;->a:LE0/i;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 289
    .line 290
    goto :goto_9

    .line 291
    :goto_8
    new-instance v3, LE0/d;

    .line 292
    .line 293
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    :cond_c
    :goto_9
    invoke-static {v3}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-eqz v0, :cond_d

    .line 301
    .line 302
    iget-object v1, p0, Lr0/r0;->e:Ljava/lang/String;

    .line 303
    .line 304
    const-string v2, "refresh conversation list fail"

    .line 305
    .line 306
    filled-new-array {v2, v1, v0}, [Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :cond_d
    return-void

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
