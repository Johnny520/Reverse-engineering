.class public final synthetic L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object p0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    iget-object v0, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    const-string v3, "adapter"

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iget-object v0, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 22
    .line 23
    new-instance v5, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v6, 0xa

    .line 26
    .line 27
    invoke-static {v0, v6}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 49
    .line 50
    invoke-static {v6}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世苏哲兰(Ltop/suzhelan/plugin/sdk/online/entity/Message;)Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-static {v0, v5}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    const-string v0, "\u5df2\u6807\u8bb0\u5168\u90e8\u4e3a\u5df2\u8bfb"

    .line 66
    .line 67
    :try_start_0
    iget-object v3, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 68
    .line 69
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const v5, 0x240c0099

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const v4, 0x24090386

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Landroid/widget/TextView;

    .line 88
    .line 89
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰()L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    new-instance v5, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲世兰苏;

    .line 97
    .line 98
    invoke-direct {v5, v3, v2}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲世兰苏;-><init>(Landroid/view/View;I)V

    .line 99
    .line 100
    .line 101
    iput-object v5, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 102
    .line 103
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰楪苏()V

    .line 104
    .line 105
    .line 106
    sget-object v2, Lcom/kongzue/dialogx/dialogs/CustomDialog$ALIGN;->CENTER:Lcom/kongzue/dialogx/dialogs/CustomDialog$ALIGN;

    .line 107
    .line 108
    iput-object v2, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰哲楪苏:Lcom/kongzue/dialogx/dialogs/CustomDialog$ALIGN;

    .line 109
    .line 110
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰楪苏()V

    .line 111
    .line 112
    .line 113
    sget-object v2, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;->TRUE:Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 114
    .line 115
    iput-object v2, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪世哲兰:Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 116
    .line 117
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰楪苏()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catch_0
    invoke-static {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子世哲兰苏楪(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 125
    .line 126
    .line 127
    :goto_1
    iget-object v0, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Landroid/os/Handler;

    .line 128
    .line 129
    iget-object v2, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 130
    .line 131
    if-eqz v2, :cond_1

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 134
    .line 135
    .line 136
    :cond_1
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 137
    .line 138
    const/16 v3, 0x1d

    .line 139
    .line 140
    invoke-direct {v2, p0, v3}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 141
    .line 142
    .line 143
    iput-object v2, p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v4

    .line 153
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v4

    .line 157
    :pswitch_0
    check-cast p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;

    .line 158
    .line 159
    iget-object v0, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 160
    .line 161
    move-object v1, v0

    .line 162
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 163
    .line 164
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 169
    .line 170
    iget-wide v1, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 171
    .line 172
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    cmp-long v1, v1, v5

    .line 178
    .line 179
    if-nez v1, :cond_4

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_4
    move-object v1, v0

    .line 183
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 184
    .line 185
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 190
    .line 191
    iget-wide v1, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 192
    .line 193
    invoke-static {v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(J)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_5

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_5
    iget-object p0, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 201
    .line 202
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 209
    .line 210
    iget-wide v0, v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 211
    .line 212
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(J)Landroid/graphics/Shader;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    :goto_2
    return-object v4

    .line 217
    :pswitch_1
    check-cast p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;

    .line 218
    .line 219
    iget v0, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 220
    .line 221
    int-to-long v0, v0

    .line 222
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    const/16 v1, 0x20

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget v2, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 233
    .line 234
    int-to-long v2, v2

    .line 235
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iget p0, p0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:I

    .line 248
    .line 249
    int-to-long v1, p0

    .line 250
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :pswitch_2
    check-cast p0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;

    .line 260
    .line 261
    iget-object p0, p0, L飘花落叶言子兰苏世哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 262
    .line 263
    const-string v0, "androidx.window.extensions.WindowExtensionsProvider"

    .line 264
    .line 265
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    const-string v1, "getWindowExtensions"

    .line 273
    .line 274
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-string v1, "androidx.window.extensions.WindowExtensions"

    .line 279
    .line 280
    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    if-eqz p0, :cond_6

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 301
    .line 302
    .line 303
    move-result p0

    .line 304
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 305
    .line 306
    .line 307
    move-result p0

    .line 308
    if-eqz p0, :cond_6

    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_6
    move v2, v3

    .line 312
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0

    .line 317
    :pswitch_3
    check-cast p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰哲苏;

    .line 318
    .line 319
    invoke-interface {p0}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    new-instance v2, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;

    .line 324
    .line 325
    invoke-direct {v2, p0, v3}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v2}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 329
    .line 330
    .line 331
    return-object v1

    .line 332
    :pswitch_4
    check-cast p0, L飘花落叶言子世楪哲苏兰/飘花落叶言子楪哲世苏兰;

    .line 333
    .line 334
    iput-object v4, p0, L飘花落叶言子世楪哲苏兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲兰楪苏:L飘花落叶言子世楪哲苏兰/飘花落叶言子楪苏兰哲世;

    .line 335
    .line 336
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/node/飘花落叶言子哲楪世苏兰;)V

    .line 337
    .line 338
    .line 339
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;)V

    .line 340
    .line 341
    .line 342
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/node/飘花落叶言子楪哲苏世兰;)V

    .line 343
    .line 344
    .line 345
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 346
    .line 347
    return-object p0

    .line 348
    :pswitch_5
    check-cast p0, L飘花落叶言子世楪哲苏兰/飘花落叶言子楪苏哲世兰;

    .line 349
    .line 350
    iput-object v4, p0, L飘花落叶言子世楪哲苏兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲兰楪苏:L飘花落叶言子世楪哲苏兰/飘花落叶言子楪苏世兰哲;

    .line 351
    .line 352
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/node/飘花落叶言子哲楪世苏兰;)V

    .line 353
    .line 354
    .line 355
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;)V

    .line 356
    .line 357
    .line 358
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/node/飘花落叶言子楪哲苏世兰;)V

    .line 359
    .line 360
    .line 361
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 362
    .line 363
    return-object p0

    .line 364
    :pswitch_6
    check-cast p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲兰世;

    .line 365
    .line 366
    iget-object p0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;

    .line 367
    .line 368
    if-eqz p0, :cond_a

    .line 369
    .line 370
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲()Ljava/util/Map;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_7

    .line 379
    .line 380
    new-array v0, v3, [Lkotlin/Pair;

    .line 381
    .line 382
    goto :goto_5

    .line 383
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 390
    .line 391
    .line 392
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    if-eqz v2, :cond_8

    .line 405
    .line 406
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    check-cast v2, Ljava/util/Map$Entry;

    .line 411
    .line 412
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    check-cast v5, Ljava/lang/String;

    .line 417
    .line 418
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    new-instance v6, Lkotlin/Pair;

    .line 423
    .line 424
    invoke-direct {v6, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    goto :goto_4

    .line 431
    :cond_8
    new-array v0, v3, [Lkotlin/Pair;

    .line 432
    .line 433
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, [Lkotlin/Pair;

    .line 438
    .line 439
    :goto_5
    array-length v1, v0

    .line 440
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    check-cast v0, [Lkotlin/Pair;

    .line 445
    .line 446
    invoke-static {v0}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-virtual {p0, v0}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Landroid/os/Bundle;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 454
    .line 455
    .line 456
    move-result p0

    .line 457
    if-eqz p0, :cond_9

    .line 458
    .line 459
    goto :goto_6

    .line 460
    :cond_9
    move-object v4, v0

    .line 461
    :cond_a
    :goto_6
    return-object v4

    .line 462
    :pswitch_7
    check-cast p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲苏兰;

    .line 463
    .line 464
    iget-object v0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏兰世哲;

    .line 465
    .line 466
    iget-object v1, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 467
    .line 468
    if-eqz v1, :cond_b

    .line 469
    .line 470
    invoke-interface {v0, p0, v1}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子苏世楪哲兰(L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲苏兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    goto :goto_7

    .line 475
    :cond_b
    const-string p0, "Value should be initialized"

    .line 476
    .line 477
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    :goto_7
    return-object v4

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
