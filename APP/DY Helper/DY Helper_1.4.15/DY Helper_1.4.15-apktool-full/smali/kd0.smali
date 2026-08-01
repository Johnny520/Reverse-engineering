.class public final synthetic Lkd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lnd0;


# direct methods
.method public synthetic constructor <init>(Lnd0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lkd0;->ζ:Lnd0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, Lkd0;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkd0;->ζ:Lnd0;

    .line 7
    .line 8
    invoke-virtual {p0}, Lnd0;->κ()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    sget-object p1, Lbe0;->α:Lbe0;

    .line 13
    .line 14
    invoke-virtual {p1}, Lbe0;->ξ()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 26
    .line 27
    iget-object p0, p0, Lkd0;->ζ:Lnd0;

    .line 28
    .line 29
    iget-object v1, p0, Lnd0;->α:Landroid/app/Activity;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "\u5168\u90e8\u6062\u590d"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, "\u6062\u590d\u5f53\u524d\u8d26\u53f7\u7684\u5168\u90e8 "

    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, " \u540d\u8054\u7cfb\u4eba\uff1f"

    .line 51
    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "\u53d6\u6d88"

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-virtual {p1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v0, Lgd0;

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-direct {v0, v2, p0}, Lgd0;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, Led0;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    invoke-direct {v0, p0, p1, v1}, Led0;-><init>(Lnd0;Landroid/app/AlertDialog;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 94
    .line 95
    .line 96
    :goto_0
    return-void

    .line 97
    :pswitch_1
    iget-object p0, p0, Lkd0;->ζ:Lnd0;

    .line 98
    .line 99
    iget-object p1, p0, Lnd0;->α:Landroid/app/Activity;

    .line 100
    .line 101
    invoke-static {p1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v1, Landroid/widget/EditText;

    .line 106
    .line 107
    invoke-direct {v1, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    const-string v2, "\u6570\u5b57 UID"

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    const/4 v2, 0x2

    .line 116
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 117
    .line 118
    .line 119
    const/4 v2, 0x1

    .line 120
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 121
    .line 122
    .line 123
    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    .line 124
    .line 125
    const/16 v3, 0x18

    .line 126
    .line 127
    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 128
    .line 129
    .line 130
    filled-new-array {v2}, [Landroid/text/InputFilter$LengthFilter;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, [Landroid/text/InputFilter;

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, v0, Lxx;->ζ:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 146
    .line 147
    .line 148
    iget-object v2, v0, Lxx;->θ:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 155
    .line 156
    .line 157
    iget-object v0, v0, Lxx;->χ:Ljava/lang/String;

    .line 158
    .line 159
    const/16 v2, 0x8

    .line 160
    .line 161
    invoke-static {v2, p1, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 166
    .line 167
    .line 168
    const/16 v0, 0x14

    .line 169
    .line 170
    invoke-static {p1, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    const/16 v3, 0xc

    .line 175
    .line 176
    invoke-static {p1, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-static {p1, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    const/4 v4, 0x4

    .line 185
    invoke-static {p1, v4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 193
    .line 194
    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 195
    .line 196
    .line 197
    const-string p1, "\u8f93\u5165\u8054\u7cfb\u4eba UID"

    .line 198
    .line 199
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    const-string v0, "\u53d6\u6d88"

    .line 208
    .line 209
    const/4 v2, 0x0

    .line 210
    invoke-virtual {p1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string v0, "\u6dfb\u52a0"

    .line 215
    .line 216
    invoke-virtual {p1, v0, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    new-instance v0, Lid0;

    .line 225
    .line 226
    invoke-direct {v0, p0, p1, v1}, Lid0;-><init>(Lnd0;Landroid/app/AlertDialog;Landroid/widget/EditText;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    if-eqz p0, :cond_1

    .line 240
    .line 241
    const/4 p1, 0x5

    .line 242
    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 243
    .line 244
    .line 245
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_2
    iget-object p0, p0, Lkd0;->ζ:Lnd0;

    .line 250
    .line 251
    iget-object p1, p0, Lnd0;->Δ:Lad0;

    .line 252
    .line 253
    sget-object v0, Lad0;->ζ:Lad0;

    .line 254
    .line 255
    if-ne p1, v0, :cond_2

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_2
    iput-object v0, p0, Lnd0;->Δ:Lad0;

    .line 259
    .line 260
    invoke-virtual {p0}, Lnd0;->μ()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 264
    .line 265
    .line 266
    iget-object p1, p0, Lnd0;->Δ:Lad0;

    .line 267
    .line 268
    if-ne p1, v0, :cond_3

    .line 269
    .line 270
    invoke-virtual {p0}, Lnd0;->η()V

    .line 271
    .line 272
    .line 273
    :cond_3
    :goto_1
    return-void

    .line 274
    :pswitch_3
    iget-object p0, p0, Lkd0;->ζ:Lnd0;

    .line 275
    .line 276
    iget-object p1, p0, Lnd0;->Δ:Lad0;

    .line 277
    .line 278
    sget-object v0, Lad0;->ε:Lad0;

    .line 279
    .line 280
    if-ne p1, v0, :cond_4

    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_4
    iput-object v0, p0, Lnd0;->Δ:Lad0;

    .line 284
    .line 285
    invoke-virtual {p0}, Lnd0;->μ()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 289
    .line 290
    .line 291
    iget-object p1, p0, Lnd0;->Δ:Lad0;

    .line 292
    .line 293
    sget-object v0, Lad0;->ζ:Lad0;

    .line 294
    .line 295
    if-ne p1, v0, :cond_5

    .line 296
    .line 297
    invoke-virtual {p0}, Lnd0;->η()V

    .line 298
    .line 299
    .line 300
    :cond_5
    :goto_2
    return-void

    .line 301
    :pswitch_4
    iget-object p0, p0, Lkd0;->ζ:Lnd0;

    .line 302
    .line 303
    iget-object p0, p0, Lnd0;->Α:Landroid/app/AlertDialog;

    .line 304
    .line 305
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
