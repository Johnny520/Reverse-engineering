.class public final synthetic Lyyds/ᛲᛵᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛲᛵᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛲᛵᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛲᛵᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object p0, p0, Lyyds/ᛲᛵᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-wide v0, -0xc713e68a836eL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lyyds/ᛲᲁᲈ;->ᛱᛳᛶᛳ(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    return v4

    .line 30
    :pswitch_0
    check-cast p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 31
    .line 32
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lyyds/ᲈᲇᲇᛴ;

    .line 37
    .line 38
    invoke-direct {v0, p0, v3, v2}, Lyyds/ᲈᲇᲇᛴ;-><init>(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v3, v0, v1}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 42
    .line 43
    .line 44
    return v4

    .line 45
    :pswitch_1
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-wide v0, -0x2a9fce68a836eL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    new-instance v0, Lyyds/ᛵᲇᛵᲇ;

    .line 60
    .line 61
    const/16 v1, 0x14

    .line 62
    .line 63
    invoke-direct {v0, v1, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v0}, Lyyds/ᛲᲁᲈ;->ᛸᛸᛷᛱ(Landroid/content/Context;Lyyds/ᛵᲇᛵᲇ;)V

    .line 67
    .line 68
    .line 69
    return v4

    .line 70
    :pswitch_2
    check-cast p0, Landroid/content/Context;

    .line 71
    .line 72
    const-wide v0, -0xd382e68a836eL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    new-instance p1, Landroid/widget/LinearLayout;

    .line 81
    .line 82
    invoke-direct {p1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 86
    .line 87
    .line 88
    const/16 v0, 0x8

    .line 89
    .line 90
    invoke-static {v0}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-static {v2}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    const/4 v2, 0x0

    .line 99
    invoke-virtual {p1, v2, v0, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 100
    .line 101
    .line 102
    const-wide v0, -0xd38ae68a836eL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛲᛶᛱᲈ()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    new-instance v2, Lyyds/ᛳᛱᛶᛲ;

    .line 121
    .line 122
    const/16 v5, 0x12

    .line 123
    .line 124
    invoke-direct {v2, v5}, Lyyds/ᛳᛱᛶᛲ;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-static {p0, v0, v1, v2}, Lyyds/ᛱᛳᛳᛵ;->ᛱᲈᲁ(Landroid/content/Context;Ljava/lang/String;ZLyyds/ᛷᛴᲈᲀ;)Landroid/widget/LinearLayout;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    const-wide v0, -0xd391e68a836eL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛸᲀᛷᛲ:Lyyds/ᛳᲀᛲ;

    .line 144
    .line 145
    sget-object v2, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 146
    .line 147
    const/16 v5, 0x39

    .line 148
    .line 149
    aget-object v2, v2, v5

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    new-instance v2, Lyyds/ᛳᛱᛶᛲ;

    .line 162
    .line 163
    const/16 v5, 0x13

    .line 164
    .line 165
    invoke-direct {v2, v5}, Lyyds/ᛳᛱᛶᛲ;-><init>(I)V

    .line 166
    .line 167
    .line 168
    invoke-static {p0, v0, v1, v2}, Lyyds/ᛱᛳᛳᛵ;->ᛱᲈᲁ(Landroid/content/Context;Ljava/lang/String;ZLyyds/ᛷᛴᲈᲀ;)Landroid/widget/LinearLayout;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 176
    .line 177
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 178
    .line 179
    .line 180
    const-wide v1, -0xd39ae68a836eL

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    const-wide v0, -0xd39fe68a836eL

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p0, p1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 211
    .line 212
    .line 213
    return v4

    .line 214
    :pswitch_3
    invoke-static {p0}, Lyyds/ᛵᛶᛲᛳ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    return v4

    .line 218
    :pswitch_4
    check-cast p0, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 219
    .line 220
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    new-instance v0, Lyyds/ᛱᲁᛴᛴ;

    .line 225
    .line 226
    const/4 v2, 0x2

    .line 227
    invoke-direct {v0, p0, v3, v2}, Lyyds/ᛱᲁᛴᛴ;-><init>(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 228
    .line 229
    .line 230
    invoke-static {p1, v3, v0, v1}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 231
    .line 232
    .line 233
    return v4

    .line 234
    :pswitch_5
    check-cast p0, Landroid/view/View;

    .line 235
    .line 236
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛲᛱᲁᛳ()Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    xor-int/2addr p1, v4

    .line 246
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛴᛸᛶᛱ:Lyyds/ᛳᲀᛲ;

    .line 247
    .line 248
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 249
    .line 250
    const/16 v2, 0x86

    .line 251
    .line 252
    aget-object v1, v1, v2

    .line 253
    .line 254
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {v0, v1, p1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛲᛱᲁᛳ()Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-eqz p1, :cond_0

    .line 266
    .line 267
    const/4 p1, 0x0

    .line 268
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 269
    .line 270
    .line 271
    goto :goto_0

    .line 272
    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 275
    .line 276
    .line 277
    :goto_0
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛲᛱᲁᛳ()Z

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    if-eqz p0, :cond_1

    .line 282
    .line 283
    const-wide p0, -0x30d63e68a836eL

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    :goto_1
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    goto :goto_2

    .line 293
    :cond_1
    const-wide p0, -0x30d67e68a836eL

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    goto :goto_1

    .line 299
    :goto_2
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 300
    .line 301
    .line 302
    return v4

    .line 303
    :pswitch_6
    check-cast p0, Lyyds/ᛱᛸᛳᛱ;

    .line 304
    .line 305
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛱ;->ᛲᲈᲁ()V

    .line 306
    .line 307
    .line 308
    return v4

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
