.class public final synthetic Lx71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ld81;


# direct methods
.method public synthetic constructor <init>(Ld81;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx71;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lx71;->ζ:Ld81;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lx71;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lx71;->ζ:Ld81;

    .line 9
    .line 10
    iget-object v2, v0, Ld81;->α:Landroid/app/Activity;

    .line 11
    .line 12
    iget v1, v0, Ld81;->λ:I

    .line 13
    .line 14
    iget-object v3, v0, Ld81;->κ:Ljava/util/List;

    .line 15
    .line 16
    iget-object v5, v0, Ld81;->ι:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v12, Lcc;

    .line 19
    .line 20
    const/4 v4, 0x6

    .line 21
    invoke-direct {v12, v4, v0}, Lcc;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v7, Lz71;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v7, v0, v4}, Lz71;-><init>(Ld81;I)V

    .line 28
    .line 29
    .line 30
    new-instance v9, Lz71;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-direct {v9, v0, v4}, Lz71;-><init>(Ld81;I)V

    .line 34
    .line 35
    .line 36
    new-instance v11, Lz71;

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    invoke-direct {v11, v0, v4}, Lz71;-><init>(Ld81;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v4, 0x4

    .line 56
    div-int/2addr v0, v4

    .line 57
    const/4 v6, 0x1

    .line 58
    if-ge v0, v6, :cond_0

    .line 59
    .line 60
    move v0, v6

    .line 61
    :cond_0
    const/16 v8, 0xa

    .line 62
    .line 63
    invoke-static {v5, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    invoke-static {v8}, Lex0;->Κ(I)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const/16 v10, 0x10

    .line 72
    .line 73
    if-ge v8, v10, :cond_1

    .line 74
    .line 75
    move v8, v10

    .line 76
    :cond_1
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    invoke-direct {v10, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v13

    .line 89
    if-eqz v13, :cond_2

    .line 90
    .line 91
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    move-object v14, v13

    .line 96
    check-cast v14, Ls71;

    .line 97
    .line 98
    iget-object v14, v14, Ls71;->α:Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v10, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    mul-int/lit8 v8, v1, 0x4

    .line 105
    .line 106
    new-instance v13, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    const/4 v15, 0x0

    .line 112
    :goto_1
    if-ge v15, v4, :cond_6

    .line 113
    .line 114
    add-int v4, v8, v15

    .line 115
    .line 116
    invoke-static {v4, v3}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Ljava/lang/String;

    .line 121
    .line 122
    if-nez v4, :cond_3

    .line 123
    .line 124
    const-string v4, ""

    .line 125
    .line 126
    :cond_3
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v16

    .line 130
    if-eqz v16, :cond_4

    .line 131
    .line 132
    const-string v4, "\u672a\u914d\u7f6e"

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    invoke-virtual {v10, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v16

    .line 139
    if-eqz v16, :cond_5

    .line 140
    .line 141
    invoke-static {v10, v4}, Lex0;->Θ(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ls71;

    .line 146
    .line 147
    iget-object v4, v4, Ls71;->β:Ljava/lang/String;

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    invoke-static {v4}, Lw71;->β(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    :goto_2
    add-int/lit8 v15, v15, 0x1

    .line 155
    .line 156
    new-instance v14, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v6, "\u7b2c "

    .line 159
    .line 160
    invoke-direct {v14, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v6, " \u4e2a \u00b7 "

    .line 167
    .line 168
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    const/4 v4, 0x4

    .line 182
    const/4 v6, 0x1

    .line 183
    goto :goto_1

    .line 184
    :cond_6
    const/4 v4, 0x6

    .line 185
    const/4 v6, -0x1

    .line 186
    if-ge v0, v4, :cond_7

    .line 187
    .line 188
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    const-string v10, "\u65b0\u589e\u4e00\u7ec4\u5feb\u6377\u6309\u94ae"

    .line 193
    .line 194
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    :goto_3
    const/4 v10, 0x1

    .line 198
    goto :goto_4

    .line 199
    :cond_7
    move v4, v6

    .line 200
    goto :goto_3

    .line 201
    :goto_4
    if-le v0, v10, :cond_8

    .line 202
    .line 203
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    const-string v0, "\u5220\u9664\u5f53\u524d\u7ec4"

    .line 208
    .line 209
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_8
    move/from16 v16, v10

    .line 213
    .line 214
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    const-string v0, "\u6062\u590d\u9ed8\u8ba4\u5feb\u6377\u6309\u94ae"

    .line 219
    .line 220
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 224
    .line 225
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 226
    .line 227
    .line 228
    add-int/lit8 v1, v1, 0x1

    .line 229
    .line 230
    new-instance v14, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    const-string v15, "\u81ea\u5b9a\u4e49\u5feb\u6377\u64cd\u4f5c \u00b7 \u7b2c "

    .line 233
    .line 234
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v1, " \u7ec4"

    .line 241
    .line 242
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    const/4 v1, 0x0

    .line 254
    new-array v1, v1, [Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    move-object v13, v1

    .line 261
    check-cast v13, [Ljava/lang/CharSequence;

    .line 262
    .line 263
    new-instance v1, Lt71;

    .line 264
    .line 265
    move/from16 v17, v6

    .line 266
    .line 267
    move v6, v4

    .line 268
    move v4, v8

    .line 269
    move/from16 v8, v17

    .line 270
    .line 271
    invoke-direct/range {v1 .. v12}, Lt71;-><init>(Landroid/app/Activity;Ljava/util/List;ILjava/util/List;ILz71;ILz71;ILz71;Lcc;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v13, v1}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-string v1, "\u53d6\u6d88"

    .line 279
    .line 280
    const/4 v2, 0x0

    .line 281
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_0
    iget-object v0, v0, Lx71;->ζ:Ld81;

    .line 290
    .line 291
    iget v1, v0, Ld81;->λ:I

    .line 292
    .line 293
    add-int/lit8 v1, v1, 0x1

    .line 294
    .line 295
    invoke-virtual {v0, v1}, Ld81;->α(I)Z

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_1
    iget-object v0, v0, Lx71;->ζ:Ld81;

    .line 300
    .line 301
    iget v1, v0, Ld81;->λ:I

    .line 302
    .line 303
    add-int/lit8 v1, v1, -0x1

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ld81;->α(I)Z

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
