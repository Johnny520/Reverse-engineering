.class public final synthetic Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;Landroidx/compose/ui/semantics/飘花落叶言子楪兰哲世苏;)V
    .locals 0

    .line 1
    const/4 p2, 0x3

    .line 2
    iput p2, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 10
    iput p2, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;

    .line 22
    .line 23
    check-cast p1, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 24
    .line 25
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    move v2, v3

    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 33
    .line 34
    iget-object v0, v0, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/text/input/飘花落叶言子世楪兰哲苏;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    new-instance v4, Landroidx/compose/ui/text/input/飘花落叶言子楪苏哲世兰;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v5, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 44
    .line 45
    invoke-direct {v5, p1, v2}, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;I)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x2

    .line 49
    new-array p1, p1, [Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 50
    .line 51
    aput-object v4, p1, v3

    .line 52
    .line 53
    aput-object v5, p1, v2

    .line 54
    .line 55
    invoke-static {p1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 60
    .line 61
    iget-object v3, p0, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 62
    .line 63
    iget-object p0, p0, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰苏哲世:Landroidx/compose/foundation/text/飘花落叶言子楪兰苏世哲;

    .line 64
    .line 65
    invoke-virtual {v3, p1}, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/util/List;)Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, v1, p1}, Landroidx/compose/ui/text/input/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/飘花落叶言子楪兰苏世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 77
    .line 78
    iget-object v4, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 79
    .line 80
    iget-object v4, v4, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 81
    .line 82
    iget-wide v5, v0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 83
    .line 84
    sget v0, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 85
    .line 86
    const/16 v0, 0x20

    .line 87
    .line 88
    shr-long v7, v5, v0

    .line 89
    .line 90
    long-to-int v7, v7

    .line 91
    const-wide v8, 0xffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v5, v8

    .line 97
    long-to-int v5, v5

    .line 98
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    if-lt v5, v7, :cond_2

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v4, v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-virtual {v1, v4, v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    const-string v3, "End index ("

    .line 126
    .line 127
    const-string v4, ") is less than start index ("

    .line 128
    .line 129
    invoke-static {v3, v5, v4, v7}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;ILjava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iget-object v3, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 137
    .line 138
    iget-wide v3, v3, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 139
    .line 140
    shr-long/2addr v3, v0

    .line 141
    long-to-int v0, v3

    .line 142
    iget-object p1, p1, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    add-int/2addr p1, v0

    .line 149
    invoke-static {p1, p1}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 150
    .line 151
    .line 152
    move-result-wide v3

    .line 153
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 154
    .line 155
    iget-object p0, p0, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰苏哲世:Landroidx/compose/foundation/text/飘花落叶言子楪兰苏世哲;

    .line 156
    .line 157
    new-instance p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 158
    .line 159
    const/4 v0, 0x4

    .line 160
    invoke-direct {p1, v0, v3, v4, v1}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;-><init>(IJLjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/飘花落叶言子楪兰苏世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :pswitch_1
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;

    .line 172
    .line 173
    check-cast p1, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 174
    .line 175
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 176
    .line 177
    iget-object p1, p1, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 178
    .line 179
    iget-boolean p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲:Z

    .line 180
    .line 181
    invoke-static {v0, p1, p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子兰楪世苏哲(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;Ljava/lang/String;Z)V

    .line 182
    .line 183
    .line 184
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_2
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;

    .line 188
    .line 189
    check-cast p1, Ljava/util/List;

    .line 190
    .line 191
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-eqz v0, :cond_3

    .line 198
    .line 199
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 200
    .line 201
    invoke-virtual {p0}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iget-object p0, p0, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 209
    .line 210
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_3
    move v2, v3

    .line 215
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    :pswitch_3
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;

    .line 221
    .line 222
    check-cast p1, Landroidx/compose/ui/autofill/飘花落叶言子楪哲苏世兰;

    .line 223
    .line 224
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 225
    .line 226
    iget-object v0, v0, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰世哲苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 227
    .line 228
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 229
    .line 230
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 236
    .line 237
    iget-object v0, v0, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰世苏哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 238
    .line 239
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 240
    .line 241
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 245
    .line 246
    check-cast p1, Landroidx/compose/ui/autofill/飘花落叶言子楪世兰苏哲;

    .line 247
    .line 248
    iget-object p1, p1, Landroidx/compose/ui/autofill/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/view/autofill/AutofillValue;

    .line 249
    .line 250
    invoke-virtual {p1}, Landroid/view/autofill/AutofillValue;->isText()Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_4

    .line 255
    .line 256
    invoke-virtual {p1}, Landroid/view/autofill/AutofillValue;->getTextValue()Ljava/lang/CharSequence;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    check-cast v1, Ljava/lang/String;

    .line 264
    .line 265
    iget-boolean p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲:Z

    .line 266
    .line 267
    invoke-static {v0, v1, p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子兰楪世苏哲(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;Ljava/lang/String;Z)V

    .line 268
    .line 269
    .line 270
    return-object v2

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
