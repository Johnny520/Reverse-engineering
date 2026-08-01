.class public final synthetic Lqu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/EditText;I)V
    .locals 0

    .line 1
    iput p3, p0, Lqu;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lqu;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lqu;->η:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lqu;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqu;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_5

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    sget-object v1, Lbv1;->β:Landroid/app/AlertDialog;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const v2, 0x20008

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 35
    .line 36
    .line 37
    const/16 v2, 0x10

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object p0, p0, Lqu;->η:Landroid/widget/EditText;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-virtual {p0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 v2, 0x0

    .line 72
    :goto_0
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 73
    .line 74
    .line 75
    const-string v2, "input_method"

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    instance-of v2, v0, Landroid/view/inputmethod/InputMethodManager;

    .line 82
    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/4 v0, 0x0

    .line 89
    :goto_1
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 92
    .line 93
    .line 94
    :cond_4
    new-instance v1, Lwl0;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-direct {v1, v0, p0, v2}, Lwl0;-><init>(Landroid/view/inputmethod/InputMethodManager;Landroid/widget/EditText;I)V

    .line 98
    .line 99
    .line 100
    const-wide/16 v2, 0x50

    .line 101
    .line 102
    invoke-virtual {p0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 103
    .line 104
    .line 105
    :cond_5
    :goto_2
    return-void

    .line 106
    :pswitch_0
    iget-object v0, p0, Lqu;->ζ:Landroid/app/Activity;

    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_a

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    iget-object p0, p0, Lqu;->η:Landroid/widget/EditText;

    .line 122
    .line 123
    const/4 v1, 0x1

    .line 124
    invoke-virtual {p0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_7

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    goto :goto_3

    .line 150
    :cond_7
    const/4 v2, 0x0

    .line 151
    :goto_3
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 152
    .line 153
    .line 154
    const-string v2, "input_method"

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    instance-of v2, v0, Landroid/view/inputmethod/InputMethodManager;

    .line 161
    .line 162
    if-eqz v2, :cond_8

    .line 163
    .line 164
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    const/4 v0, 0x0

    .line 168
    :goto_4
    if-eqz v0, :cond_9

    .line 169
    .line 170
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 171
    .line 172
    .line 173
    :cond_9
    new-instance v1, Lwl0;

    .line 174
    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-direct {v1, v0, p0, v2}, Lwl0;-><init>(Landroid/view/inputmethod/InputMethodManager;Landroid/widget/EditText;I)V

    .line 177
    .line 178
    .line 179
    const-wide/16 v2, 0x50

    .line 180
    .line 181
    invoke-virtual {p0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 182
    .line 183
    .line 184
    :cond_a
    :goto_5
    return-void

    .line 185
    :pswitch_1
    iget-object v0, p0, Lqu;->ζ:Landroid/app/Activity;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-nez v1, :cond_d

    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_d

    .line 198
    .line 199
    iget-object p0, p0, Lqu;->η:Landroid/widget/EditText;

    .line 200
    .line 201
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-nez v1, :cond_b

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_b
    const-string v1, "input_method"

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    instance-of v1, v0, Landroid/view/inputmethod/InputMethodManager;

    .line 215
    .line 216
    if-eqz v1, :cond_c

    .line 217
    .line 218
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_c
    const/4 v0, 0x0

    .line 222
    :goto_6
    if-eqz v0, :cond_d

    .line 223
    .line 224
    const/4 v1, 0x1

    .line 225
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 226
    .line 227
    .line 228
    :cond_d
    :goto_7
    return-void

    .line 229
    :pswitch_2
    iget-object v0, p0, Lqu;->η:Landroid/widget/EditText;

    .line 230
    .line 231
    iget-object p0, p0, Lqu;->ζ:Landroid/app/Activity;

    .line 232
    .line 233
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_10

    .line 238
    .line 239
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_e

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_e
    const/4 v1, 0x1

    .line 247
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 254
    .line 255
    .line 256
    const-string v2, "input_method"

    .line 257
    .line 258
    invoke-virtual {p0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    instance-of v2, p0, Landroid/view/inputmethod/InputMethodManager;

    .line 263
    .line 264
    if-eqz v2, :cond_f

    .line 265
    .line 266
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_f
    const/4 p0, 0x0

    .line 270
    :goto_8
    if-eqz p0, :cond_10

    .line 271
    .line 272
    invoke-virtual {p0, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 273
    .line 274
    .line 275
    goto :goto_9

    .line 276
    :catchall_0
    move-exception p0

    .line 277
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    const-string v1, "\u62c9\u8d77\u952e\u76d8\u5931\u8d25: "

    .line 282
    .line 283
    const-string v2, "DYHelper"

    .line 284
    .line 285
    invoke-static {v1, v0, v2, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    :cond_10
    :goto_9
    return-void

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
