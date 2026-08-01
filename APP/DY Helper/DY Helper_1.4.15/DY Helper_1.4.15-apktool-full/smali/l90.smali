.class public final synthetic Ll90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/app/Activity;Lf8;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ll90;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ll90;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ll90;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ll90;->ζ:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p4, p0, Ll90;->ι:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>([Ls90;Lum1;Landroid/widget/TextView;Landroid/app/Activity;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Ll90;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll90;->η:Ljava/lang/Object;

    iput-object p2, p0, Ll90;->θ:Ljava/lang/Object;

    iput-object p3, p0, Ll90;->ι:Ljava/lang/Object;

    iput-object p4, p0, Ll90;->ζ:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ll90;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Ll90;->ι:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, Ll90;->ζ:Landroid/app/Activity;

    .line 9
    .line 10
    iget-object v5, v0, Ll90;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, Ll90;->η:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Landroid/widget/EditText;

    .line 18
    .line 19
    check-cast v5, Landroid/widget/EditText;

    .line 20
    .line 21
    check-cast v3, Lf8;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v0, v1

    .line 46
    :goto_0
    const-string v6, ""

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    move-object v0, v6

    .line 51
    :cond_1
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move-object v5, v1

    .line 73
    :goto_1
    if-nez v5, :cond_3

    .line 74
    .line 75
    move-object v5, v6

    .line 76
    :cond_3
    iget-object v7, v3, Lf8;->α:Ljava/lang/String;

    .line 77
    .line 78
    const-string v8, "\u672a\u77e5"

    .line 79
    .line 80
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-nez v8, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v7, v1

    .line 88
    :goto_2
    iget-object v3, v3, Lf8;->λ:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-nez v0, :cond_5

    .line 102
    .line 103
    move-object v9, v6

    .line 104
    goto :goto_3

    .line 105
    :cond_5
    move-object v9, v0

    .line 106
    :goto_3
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-nez v0, :cond_6

    .line 115
    .line 116
    move-object v10, v6

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move-object v10, v0

    .line 119
    :goto_4
    invoke-static {v9}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_7

    .line 124
    .line 125
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_7

    .line 130
    .line 131
    const-string v0, "\u672a\u8bc6\u522b\u5230\u4f5c\u8005UID"

    .line 132
    .line 133
    invoke-static {v4, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 138
    .line 139
    .line 140
    const-string v0, "OperationDialog jumpToUserProfile failed: uid/secUid empty"

    .line 141
    .line 142
    const/4 v2, 0x4

    .line 143
    const-string v3, "DYHelper"

    .line 144
    .line 145
    invoke-static {v3, v0, v1, v2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_7
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 150
    .line 151
    new-instance v8, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 152
    .line 153
    if-eqz v7, :cond_8

    .line 154
    .line 155
    invoke-static {v7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    goto :goto_5

    .line 164
    :cond_8
    move-object v5, v1

    .line 165
    :goto_5
    if-nez v5, :cond_9

    .line 166
    .line 167
    move-object v11, v6

    .line 168
    goto :goto_6

    .line 169
    :cond_9
    move-object v11, v5

    .line 170
    :goto_6
    if-eqz v3, :cond_a

    .line 171
    .line 172
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    :cond_a
    if-nez v1, :cond_b

    .line 181
    .line 182
    move-object v12, v6

    .line 183
    goto :goto_7

    .line 184
    :cond_b
    move-object v12, v1

    .line 185
    :goto_7
    const v27, 0xfff0

    .line 186
    .line 187
    .line 188
    const/16 v28, 0x0

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    const/4 v14, 0x0

    .line 192
    const/4 v15, 0x0

    .line 193
    const-wide/16 v16, 0x0

    .line 194
    .line 195
    const-wide/16 v18, 0x0

    .line 196
    .line 197
    const/16 v20, 0x0

    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const/16 v22, 0x0

    .line 202
    .line 203
    const/16 v23, 0x0

    .line 204
    .line 205
    const/16 v24, 0x0

    .line 206
    .line 207
    const/16 v25, 0x0

    .line 208
    .line 209
    const/16 v26, 0x0

    .line 210
    .line 211
    invoke-direct/range {v8 .. v28}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v4, v8}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jumpToProfile(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_c

    .line 219
    .line 220
    const-string v0, "\u6253\u5f00\u4e3b\u9875\u5931\u8d25"

    .line 221
    .line 222
    invoke-static {v4, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 227
    .line 228
    .line 229
    :cond_c
    :goto_8
    return-void

    .line 230
    :pswitch_0
    check-cast v0, [Ls90;

    .line 231
    .line 232
    check-cast v5, Lum1;

    .line 233
    .line 234
    check-cast v3, Landroid/widget/TextView;

    .line 235
    .line 236
    move/from16 v1, p2

    .line 237
    .line 238
    invoke-static {v1, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Ls90;

    .line 243
    .line 244
    if-nez v0, :cond_d

    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_d
    iput-object v0, v5, Lum1;->ε:Ljava/lang/Object;

    .line 248
    .line 249
    iget-object v1, v0, Ls90;->ζ:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    .line 253
    .line 254
    sget-object v1, Lu90;->α:[J

    .line 255
    .line 256
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    const-string v1, "geonames_database"

    .line 260
    .line 261
    invoke-virtual {v4, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    const-string v2, "download_source"

    .line 270
    .line 271
    iget-object v0, v0, Ls90;->ε:Ljava/lang/String;

    .line 272
    .line 273
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 278
    .line 279
    .line 280
    invoke-interface/range {p1 .. p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 281
    .line 282
    .line 283
    :goto_9
    return-void

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
