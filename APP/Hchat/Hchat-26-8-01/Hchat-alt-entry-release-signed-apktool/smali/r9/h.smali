.class public final synthetic Lr9/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Landroid/widget/EditText;

.field public final synthetic e:Landroid/widget/EditText;

.field public final synthetic f:Lgg/s;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;Lgg/s;I)V
    .locals 0

    .line 1
    iput p6, p0, Lr9/h;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lr9/h;->b:Landroid/widget/EditText;

    .line 4
    .line 5
    iput-object p2, p0, Lr9/h;->c:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p3, p0, Lr9/h;->d:Landroid/widget/EditText;

    .line 8
    .line 9
    iput-object p4, p0, Lr9/h;->e:Landroid/widget/EditText;

    .line 10
    .line 11
    iput-object p5, p0, Lr9/h;->f:Lgg/s;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget p1, p0, Lr9/h;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lr9/h;->b:Landroid/widget/EditText;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v1

    .line 21
    :goto_0
    const-string v2, ""

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    move-object v0, v2

    .line 26
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget-object v4, p0, Lr9/h;->c:Landroid/widget/TextView;

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    const-string p1, "\u8bf7\u8f93\u5165\u641c\u7d22\u5185\u5bb9"

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_2
    iget-object v3, p0, Lr9/h;->d:Landroid/widget/EditText;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move-object v3, v1

    .line 55
    :goto_1
    if-nez v3, :cond_4

    .line 56
    .line 57
    move-object v3, v2

    .line 58
    :cond_4
    iget-object v5, p0, Lr9/h;->e:Landroid/widget/EditText;

    .line 59
    .line 60
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    if-eqz v6, :cond_5

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_5
    if-nez v1, :cond_6

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_6
    move-object v2, v1

    .line 74
    :goto_2
    invoke-static {p1, v5}, Lr9/d0;->I0(Landroid/widget/EditText;Landroid/widget/EditText;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v6, "\u641c\u7d22\u7ed3\u679c: "

    .line 85
    .line 86
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    if-gtz p1, :cond_7

    .line 100
    .line 101
    const-string p1, "\u672a\u627e\u5230: "

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_7
    const/4 v1, 0x0

    .line 112
    invoke-static {v2, v0, v3, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 120
    .line 121
    .line 122
    const/4 v0, -0x1

    .line 123
    iget-object v1, p0, Lr9/h;->f:Lgg/s;

    .line 124
    .line 125
    iput v0, v1, Lgg/s;->g:I

    .line 126
    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v1, "\u5df2\u66ff\u6362 "

    .line 130
    .line 131
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p1, " \u5904"

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    :goto_3
    return-void

    .line 150
    :pswitch_0
    iget-object p1, p0, Lr9/h;->b:Landroid/widget/EditText;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const/4 v1, 0x0

    .line 157
    if-eqz v0, :cond_8

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    goto :goto_4

    .line 164
    :cond_8
    move-object v0, v1

    .line 165
    :goto_4
    const-string v2, ""

    .line 166
    .line 167
    if-nez v0, :cond_9

    .line 168
    .line 169
    move-object v0, v2

    .line 170
    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    iget-object v4, p0, Lr9/h;->c:Landroid/widget/TextView;

    .line 175
    .line 176
    if-nez v3, :cond_a

    .line 177
    .line 178
    const-string p1, "\u8bf7\u8f93\u5165\u641c\u7d22\u5185\u5bb9"

    .line 179
    .line 180
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_7

    .line 184
    .line 185
    :cond_a
    iget-object v3, p0, Lr9/h;->d:Landroid/widget/EditText;

    .line 186
    .line 187
    invoke-virtual {v3}, Landroid/widget/TextView;->getSelectionStart()I

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    invoke-virtual {v3}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-gez v5, :cond_b

    .line 200
    .line 201
    const/4 v5, 0x0

    .line 202
    :cond_b
    invoke-virtual {v3}, Landroid/widget/TextView;->getSelectionStart()I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    invoke-virtual {v3}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    if-ge v6, v5, :cond_c

    .line 215
    .line 216
    move v6, v5

    .line 217
    :cond_c
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    if-eqz v7, :cond_d

    .line 222
    .line 223
    invoke-interface {v7, v5, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    if-eqz v7, :cond_d

    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    goto :goto_5

    .line 234
    :cond_d
    move-object v7, v1

    .line 235
    :goto_5
    if-nez v7, :cond_e

    .line 236
    .line 237
    move-object v7, v2

    .line 238
    :cond_e
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    iget-object v7, p0, Lr9/h;->f:Lgg/s;

    .line 243
    .line 244
    const/4 v8, 0x1

    .line 245
    if-nez v0, :cond_f

    .line 246
    .line 247
    invoke-static {p1, v4, v7, v3, v8}, Lr9/d0;->J0(Landroid/widget/EditText;Landroid/widget/TextView;Lgg/s;Landroid/widget/EditText;Z)V

    .line 248
    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_f
    iget-object v0, p0, Lr9/h;->e:Landroid/widget/EditText;

    .line 252
    .line 253
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-eqz v0, :cond_10

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    :cond_10
    if-nez v1, :cond_11

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_11
    move-object v2, v1

    .line 267
    :goto_6
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-eqz v0, :cond_12

    .line 272
    .line 273
    invoke-interface {v0, v5, v6, v2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 274
    .line 275
    .line 276
    :cond_12
    const/4 v0, -0x1

    .line 277
    iput v0, v7, Lgg/s;->g:I

    .line 278
    .line 279
    const-string v0, "\u5df2\u66ff\u6362 1 \u5904"

    .line 280
    .line 281
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    .line 283
    .line 284
    invoke-static {p1, v4, v7, v3, v8}, Lr9/d0;->J0(Landroid/widget/EditText;Landroid/widget/TextView;Lgg/s;Landroid/widget/EditText;Z)V

    .line 285
    .line 286
    .line 287
    :goto_7
    return-void

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
