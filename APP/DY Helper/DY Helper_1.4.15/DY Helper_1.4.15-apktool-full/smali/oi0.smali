.class public final synthetic Loi0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Loi0;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget p0, p0, Loi0;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_b

    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    sget-wide v2, La01;->η:J

    .line 19
    .line 20
    sub-long v2, p0, v2

    .line 21
    .line 22
    const-wide/16 v4, 0x15e

    .line 23
    .line 24
    cmp-long p2, v2, v4

    .line 25
    .line 26
    if-gtz p2, :cond_a

    .line 27
    .line 28
    const-wide/16 p0, 0x0

    .line 29
    .line 30
    sput-wide p0, La01;->η:J

    .line 31
    .line 32
    sget-object p0, La01;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    sget-object p0, Lbe0;->α:Lbe0;

    .line 35
    .line 36
    invoke-virtual {p0}, Lbe0;->ζ()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_0
    sget-object p1, La01;->ε:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-lez p2, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, La01;->γ(Z)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_1
    invoke-virtual {p0}, Lbe0;->ρ()Lae0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object p2, Lzz0;->α:[I

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    aget p2, p2, v2

    .line 68
    .line 69
    const-string v2, "rbe3d87ed96de26de"

    .line 70
    .line 71
    if-ne p2, v1, :cond_9

    .line 72
    .line 73
    invoke-static {}, Lui1;->Α()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    const/16 p2, 0x1e

    .line 78
    .line 79
    if-nez p0, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    const-string p0, "hidden_contact_peek_duration_seconds"

    .line 83
    .line 84
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {v1, p0, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 89
    .line 90
    .line 91
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    :catchall_0
    const/4 p0, 0x5

    .line 93
    const/16 v1, 0x12c

    .line 94
    .line 95
    invoke-static {p2, p0, v1}, Lj81;->μ(III)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    :goto_0
    sget-object p0, La01;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 106
    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Landroid/widget/TextView;

    .line 114
    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    const/4 v1, 0x0

    .line 129
    :goto_1
    if-nez v1, :cond_4

    .line 130
    .line 131
    const-string v1, ""

    .line 132
    .line 133
    :cond_4
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_6

    .line 138
    .line 139
    const/16 v3, 0x28

    .line 140
    .line 141
    invoke-static {v1, v3}, Lq02;->Φ(Ljava/lang/CharSequence;C)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_5

    .line 146
    .line 147
    const/16 v3, 0x29

    .line 148
    .line 149
    invoke-static {v1, v3}, Lq02;->Φ(Ljava/lang/CharSequence;C)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_5

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    sget-object v3, La01;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 157
    .line 158
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    :goto_2
    sget-object v1, La01;->ζ:Lfb0;

    .line 162
    .line 163
    if-eqz v1, :cond_7

    .line 164
    .line 165
    sget-object v3, La01;->β:Landroid/os/Handler;

    .line 166
    .line 167
    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 168
    .line 169
    .line 170
    :cond_7
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 171
    .line 172
    .line 173
    sget-object p1, La01;->ε:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 184
    .line 185
    if-eqz p0, :cond_8

    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    check-cast p0, Landroid/widget/TextView;

    .line 192
    .line 193
    if-eqz p0, :cond_8

    .line 194
    .line 195
    invoke-static {p1}, La01;->β(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    :cond_8
    new-instance p0, Lfb0;

    .line 203
    .line 204
    const/16 p1, 0x9

    .line 205
    .line 206
    invoke-direct {p0, p1}, Lfb0;-><init>(I)V

    .line 207
    .line 208
    .line 209
    sput-object p0, La01;->ζ:Lfb0;

    .line 210
    .line 211
    sget-object p1, La01;->β:Landroid/os/Handler;

    .line 212
    .line 213
    const-wide/16 v3, 0x3e8

    .line 214
    .line 215
    invoke-virtual {p1, p0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 216
    .line 217
    .line 218
    new-instance p0, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string p1, "\u4e34\u65f6\u663e\u793a\u5012\u8ba1\u65f6\u5df2\u5f00\u59cb: "

    .line 221
    .line 222
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string p1, "s"

    .line 229
    .line 230
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string p2, "\u53cc\u51fb\u4e34\u65f6\u663e\u793a\u672a\u751f\u6548: "

    .line 244
    .line 245
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_a
    sput-wide p0, La01;->η:J

    .line 260
    .line 261
    :cond_b
    :goto_3
    return v0

    .line 262
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    if-eqz p0, :cond_e

    .line 267
    .line 268
    const/high16 p2, 0x3f800000    # 1.0f

    .line 269
    .line 270
    if-eq p0, v1, :cond_d

    .line 271
    .line 272
    const/4 v2, 0x3

    .line 273
    if-eq p0, v2, :cond_c

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_c
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 277
    .line 278
    .line 279
    :goto_4
    move v0, v1

    .line 280
    goto :goto_5

    .line 281
    :cond_d
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_e
    const p0, 0x3f2e147b    # 0.68f

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    .line 292
    .line 293
    .line 294
    goto :goto_4

    .line 295
    :goto_5
    return v0

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
