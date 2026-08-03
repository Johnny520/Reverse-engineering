.class public final synthetic Le9/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 14
    iput p4, p0, Le9/o;->g:I

    iput-object p1, p0, Le9/o;->i:Ljava/lang/Object;

    iput-object p2, p0, Le9/o;->j:Ljava/lang/Object;

    iput p3, p0, Le9/o;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lt3/a;ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Le9/o;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Le9/o;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Le9/o;->h:I

    .line 10
    .line 11
    iput-object p3, p0, Le9/o;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Le9/o;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Le9/o;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iget v5, p0, Le9/o;->h:I

    .line 9
    .line 10
    iget-object v6, p0, Le9/o;->i:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v6, Lt3/a;

    .line 16
    .line 17
    iget-object v0, v6, Lt3/a;->b:Lt3/e;

    .line 18
    .line 19
    invoke-interface {v0, v5, v4}, Lt3/e;->c(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast v6, Lnb/w;

    .line 24
    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    const-string v4, ""

    .line 30
    .line 31
    :cond_0
    iget-boolean v0, v6, Lnb/w;->r:Z

    .line 32
    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, v6, Lnb/w;->p:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget-object v0, v6, Lnb/w;->o:Lnb/l;

    .line 52
    .line 53
    instance-of v1, v0, Lnb/n;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    check-cast v3, Lnb/n;

    .line 59
    .line 60
    :cond_3
    if-eqz v3, :cond_4

    .line 61
    .line 62
    iget v0, v6, Lnb/w;->q:I

    .line 63
    .line 64
    add-int/2addr v0, v5

    .line 65
    iget-object v1, v3, Lnb/n;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {v0, v2, v1}, Lr9/e0;->r(III)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iput v0, v3, Lnb/n;->b:I

    .line 76
    .line 77
    :cond_4
    :goto_0
    return-void

    .line 78
    :pswitch_1
    check-cast v6, Llb/i;

    .line 79
    .line 80
    check-cast v4, Landroid/view/View;

    .line 81
    .line 82
    const-string v0, "m"

    .line 83
    .line 84
    invoke-static {v4, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    const-string v7, "j"

    .line 91
    .line 92
    new-array v8, v2, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v0, v7, v8}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    instance-of v7, v0, Landroid/view/View;

    .line 101
    .line 102
    if-eqz v7, :cond_5

    .line 103
    .line 104
    check-cast v0, Landroid/view/View;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    move-object v0, v3

    .line 108
    :goto_1
    if-eqz v0, :cond_6

    .line 109
    .line 110
    move-object v3, v0

    .line 111
    :cond_6
    if-eqz v3, :cond_a

    .line 112
    .line 113
    invoke-virtual {v3, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 123
    .line 124
    .line 125
    instance-of v0, v3, Landroid/widget/EditText;

    .line 126
    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    move-object v0, v3

    .line 130
    check-cast v0, Landroid/widget/EditText;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    if-eqz v7, :cond_7

    .line 137
    .line 138
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    :cond_7
    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 143
    .line 144
    .line 145
    :cond_8
    invoke-virtual {v3}, Landroid/view/View;->performClick()Z

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-class v2, Landroid/view/inputmethod/InputMethodManager;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 159
    .line 160
    if-eqz v0, :cond_9

    .line 161
    .line 162
    invoke-virtual {v0, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 163
    .line 164
    .line 165
    :cond_9
    const/4 v0, 0x2

    .line 166
    if-ge v5, v0, :cond_a

    .line 167
    .line 168
    invoke-virtual {v3}, Landroid/view/View;->hasFocus()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_a

    .line 173
    .line 174
    add-int/2addr v5, v1

    .line 175
    new-instance v0, Le9/o;

    .line 176
    .line 177
    invoke-direct {v0, v6, v4, v5, v1}, Le9/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 178
    .line 179
    .line 180
    const-wide/16 v1, 0x78

    .line 181
    .line 182
    invoke-virtual {v4, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 183
    .line 184
    .line 185
    :cond_a
    return-void

    .line 186
    :pswitch_2
    check-cast v6, Landroid/content/Context;

    .line 187
    .line 188
    check-cast v4, Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v6, v4, v1}, Lya/i;->f(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_f

    .line 195
    .line 196
    sget-object v0, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 197
    .line 198
    const-string v0, "notification"

    .line 199
    .line 200
    invoke-virtual {v6, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    instance-of v1, v0, Landroid/app/NotificationManager;

    .line 205
    .line 206
    if-eqz v1, :cond_b

    .line 207
    .line 208
    move-object v3, v0

    .line 209
    check-cast v3, Landroid/app/NotificationManager;

    .line 210
    .line 211
    :cond_b
    if-eqz v3, :cond_f

    .line 212
    .line 213
    :try_start_0
    invoke-virtual {v3, v5}, Landroid/app/NotificationManager;->cancel(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    array-length v1, v0

    .line 224
    move v5, v2

    .line 225
    :goto_2
    if-ge v5, v1, :cond_e

    .line 226
    .line 227
    aget-object v6, v0, v5

    .line 228
    .line 229
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    if-eqz v7, :cond_d

    .line 234
    .line 235
    iget-object v7, v7, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 236
    .line 237
    if-eqz v7, :cond_d

    .line 238
    .line 239
    const-string v8, "hchat_custom_notification"

    .line 240
    .line 241
    invoke-virtual {v7, v8, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    if-eqz v8, :cond_d

    .line 246
    .line 247
    const-string v8, "hchat_custom_notification_talker"

    .line 248
    .line 249
    invoke-virtual {v7, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    invoke-static {v7, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    if-eqz v7, :cond_d

    .line 258
    .line 259
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    if-nez v7, :cond_c

    .line 264
    .line 265
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    invoke-virtual {v3, v6}, Landroid/app/NotificationManager;->cancel(I)V

    .line 270
    .line 271
    .line 272
    goto :goto_3

    .line 273
    :catchall_0
    move-exception v0

    .line 274
    goto :goto_4

    .line 275
    :cond_c
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    invoke-virtual {v3, v7, v6}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 284
    .line 285
    .line 286
    :cond_d
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_e
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :goto_4
    new-instance v1, Lsf/f;

    .line 293
    .line 294
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    move-object v0, v1

    .line 298
    :goto_5
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    if-eqz v0, :cond_f

    .line 303
    .line 304
    const-string v1, "[Hchat:CustomNotification] \u6e05\u7406\u4f1a\u8bdd\u901a\u77e5\u5931\u8d25: "

    .line 305
    .line 306
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-static {v1, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    :cond_f
    return-void

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
