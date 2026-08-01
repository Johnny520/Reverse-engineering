.class public final synthetic Lcom/example/dyhelper/ui/ω;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/example/dyhelper/ui/ω;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/example/dyhelper/ui/ω;->ζ:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget p1, p0, Lcom/example/dyhelper/ui/ω;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iget-object p0, p0, Lcom/example/dyhelper/ui/ω;->ζ:Landroid/view/View;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;

    .line 14
    .line 15
    sget p1, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Γ:I

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    if-eq p1, v1, :cond_0

    .line 24
    .line 25
    if-eq p1, v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-wide/16 p1, 0x82

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const p1, 0x3f6147ae    # 0.88f

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-wide/16 p1, 0x5a

    .line 84
    .line 85
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 90
    .line 91
    .line 92
    :goto_0
    return v2

    .line 93
    :pswitch_0
    check-cast p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 94
    .line 95
    sget p1, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->σ:I

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_f

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    if-eq p1, v1, :cond_7

    .line 108
    .line 109
    const/4 v5, 0x2

    .line 110
    if-eq p1, v5, :cond_4

    .line 111
    .line 112
    if-eq p1, v0, :cond_7

    .line 113
    .line 114
    move v1, v2

    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_4
    iget-boolean p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ο:Z

    .line 118
    .line 119
    if-nez p1, :cond_5

    .line 120
    .line 121
    goto/16 :goto_2

    .line 122
    .line 123
    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    iget p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ξ:F

    .line 128
    .line 129
    sub-float/2addr p1, p2

    .line 130
    iget-boolean p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 131
    .line 132
    if-eqz p2, :cond_6

    .line 133
    .line 134
    cmpg-float v0, p1, v4

    .line 135
    .line 136
    if-gez v0, :cond_6

    .line 137
    .line 138
    const/high16 p2, 0x42c00000    # 96.0f

    .line 139
    .line 140
    invoke-virtual {p0, p2}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    int-to-float p2, p2

    .line 145
    div-float/2addr p1, p2

    .line 146
    add-float/2addr p1, v3

    .line 147
    invoke-static {p1, v4, v3}, Lj81;->λ(FFF)F

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->β(F)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_2

    .line 155
    .line 156
    :cond_6
    if-nez p2, :cond_11

    .line 157
    .line 158
    cmpl-float p2, p1, v4

    .line 159
    .line 160
    if-lez p2, :cond_11

    .line 161
    .line 162
    const/high16 p2, 0x42d00000    # 104.0f

    .line 163
    .line 164
    invoke-virtual {p0, p2}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    int-to-float p2, p2

    .line 169
    div-float/2addr p1, p2

    .line 170
    invoke-static {p1, v4, v3}, Lj81;->λ(FFF)F

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->β(F)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_2

    .line 178
    .line 179
    :cond_7
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    iget p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ξ:F

    .line 184
    .line 185
    sub-float/2addr p1, p2

    .line 186
    iput-boolean v2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ο:Z

    .line 187
    .line 188
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    if-eqz p2, :cond_8

    .line 193
    .line 194
    invoke-interface {p2, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 195
    .line 196
    .line 197
    :cond_8
    iget-boolean p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 198
    .line 199
    if-eqz p2, :cond_a

    .line 200
    .line 201
    const/high16 p2, 0x41900000    # 18.0f

    .line 202
    .line 203
    invoke-virtual {p0, p2}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 204
    .line 205
    .line 206
    move-result p2

    .line 207
    neg-int p2, p2

    .line 208
    int-to-float p2, p2

    .line 209
    cmpg-float p2, p1, p2

    .line 210
    .line 211
    if-ltz p2, :cond_9

    .line 212
    .line 213
    iget p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 214
    .line 215
    const v0, 0x3f3851ec    # 0.72f

    .line 216
    .line 217
    .line 218
    cmpg-float p2, p2, v0

    .line 219
    .line 220
    if-gez p2, :cond_a

    .line 221
    .line 222
    :cond_9
    iput-boolean v2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 223
    .line 224
    invoke-virtual {p0, v4}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->α(F)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_a
    iget-boolean p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 229
    .line 230
    if-nez p2, :cond_c

    .line 231
    .line 232
    const/high16 p2, 0x41a00000    # 20.0f

    .line 233
    .line 234
    invoke-virtual {p0, p2}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    int-to-float p2, p2

    .line 239
    cmpl-float p2, p1, p2

    .line 240
    .line 241
    if-gtz p2, :cond_b

    .line 242
    .line 243
    iget p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 244
    .line 245
    const v0, 0x3ea3d70a    # 0.32f

    .line 246
    .line 247
    .line 248
    cmpl-float p2, p2, v0

    .line 249
    .line 250
    if-lez p2, :cond_c

    .line 251
    .line 252
    :cond_b
    iput-boolean v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 253
    .line 254
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->α(F)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_c
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    const/high16 p2, 0x41000000    # 8.0f

    .line 263
    .line 264
    invoke-virtual {p0, p2}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    int-to-float p2, p2

    .line 269
    cmpg-float p1, p1, p2

    .line 270
    .line 271
    if-gez p1, :cond_d

    .line 272
    .line 273
    iget-boolean p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 274
    .line 275
    if-nez p1, :cond_d

    .line 276
    .line 277
    iput-boolean v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 278
    .line 279
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->α(F)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_d
    iget-boolean p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 284
    .line 285
    if-eqz p1, :cond_e

    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_e
    move v3, v4

    .line 289
    :goto_1
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->α(F)V

    .line 290
    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_f
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ξ:F

    .line 298
    .line 299
    iput-boolean v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ο:Z

    .line 300
    .line 301
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->π:Landroid/animation/ValueAnimator;

    .line 302
    .line 303
    if-eqz p1, :cond_10

    .line 304
    .line 305
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 306
    .line 307
    .line 308
    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    if-eqz p0, :cond_11

    .line 313
    .line 314
    invoke-interface {p0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 315
    .line 316
    .line 317
    :cond_11
    :goto_2
    return v1

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
