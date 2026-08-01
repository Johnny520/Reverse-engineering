.class public final synthetic L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    iget v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    iget-object v0, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    const-string v5, "adapter"

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, v0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 23
    .line 24
    new-instance v6, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 48
    .line 49
    invoke-static {v2}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世苏哲兰(Ltop/suzhelan/plugin/sdk/online/entity/Message;)Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v0, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-static {v0, v6}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "\u5df2\u6807\u8bb0\u5168\u90e8\u4e3a\u5df2\u8bfb"

    .line 65
    .line 66
    :try_start_0
    iget-object v2, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 67
    .line 68
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const v5, 0x240c0099

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const v4, 0x24090386

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰()L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    new-instance v5, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰苏哲;

    .line 96
    .line 97
    invoke-direct {v5, v2, v3}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰苏哲;-><init>(Landroid/view/View;I)V

    .line 98
    .line 99
    .line 100
    iput-object v5, v4, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 101
    .line 102
    invoke-virtual {v4}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰楪苏()V

    .line 103
    .line 104
    .line 105
    sget-object v2, Lcom/kongzue/dialogx/dialogs/CustomDialog$ALIGN;->CENTER:Lcom/kongzue/dialogx/dialogs/CustomDialog$ALIGN;

    .line 106
    .line 107
    iput-object v2, v4, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰哲楪苏:Lcom/kongzue/dialogx/dialogs/CustomDialog$ALIGN;

    .line 108
    .line 109
    invoke-virtual {v4}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰楪苏()V

    .line 110
    .line 111
    .line 112
    sget-object v2, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;->TRUE:Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 113
    .line 114
    iput-object v2, v4, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪世哲兰:Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 115
    .line 116
    invoke-virtual {v4}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰楪苏()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catch_0
    invoke-static {v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;->飘花落叶言子世哲兰苏楪(Ljava/lang/String;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;

    .line 124
    .line 125
    .line 126
    :goto_1
    iget-object v0, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Landroid/os/Handler;

    .line 127
    .line 128
    iget-object v2, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 129
    .line 130
    if-eqz v2, :cond_1

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 133
    .line 134
    .line 135
    :cond_1
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 136
    .line 137
    const/16 v3, 0x1d

    .line 138
    .line 139
    invoke-direct {v2, p0, v3}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    iput-object v2, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v4

    .line 152
    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v4

    .line 156
    :pswitch_0
    check-cast p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;

    .line 157
    .line 158
    iget-object v0, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 159
    .line 160
    move-object v1, v0

    .line 161
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 162
    .line 163
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 168
    .line 169
    iget-wide v1, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 170
    .line 171
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    cmp-long v1, v1, v5

    .line 177
    .line 178
    if-nez v1, :cond_4

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_4
    move-object v1, v0

    .line 182
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 183
    .line 184
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 189
    .line 190
    iget-wide v1, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 191
    .line 192
    invoke-static {v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(J)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_5

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_5
    iget-object p0, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 200
    .line 201
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 202
    .line 203
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 208
    .line 209
    iget-wide v0, v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 210
    .line 211
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(J)Landroid/graphics/Shader;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    :goto_2
    return-object v4

    .line 216
    :pswitch_1
    check-cast p0, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪世苏哲兰;

    .line 217
    .line 218
    iget-object p0, p0, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 219
    .line 220
    const-string v0, "androidx.window.extensions.WindowExtensionsProvider"

    .line 221
    .line 222
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    const-string v1, "getWindowExtensions"

    .line 230
    .line 231
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    const-string v1, "androidx.window.extensions.WindowExtensions"

    .line 236
    .line 237
    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    if-eqz p0, :cond_6

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    if-eqz p0, :cond_6

    .line 266
    .line 267
    const/4 v3, 0x1

    .line 268
    :cond_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    return-object p0

    .line 273
    :pswitch_2
    check-cast p0, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪苏哲兰世;

    .line 274
    .line 275
    iget v0, p0, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 276
    .line 277
    int-to-long v0, v0

    .line 278
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    const/16 v1, 0x20

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget v2, p0, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 289
    .line 290
    int-to-long v2, v2

    .line 291
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget p0, p0, L飘花落叶言子兰哲世苏楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:I

    .line 304
    .line 305
    int-to-long v1, p0

    .line 306
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    return-object p0

    .line 315
    :pswitch_3
    check-cast p0, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰哲苏;

    .line 316
    .line 317
    invoke-interface {p0}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    new-instance v2, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 322
    .line 323
    invoke-direct {v2, p0, v3}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v2}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 327
    .line 328
    .line 329
    return-object v1

    .line 330
    :pswitch_4
    check-cast p0, L飘花落叶言子世楪哲苏兰/飘花落叶言子楪哲世苏兰;

    .line 331
    .line 332
    iput-object v4, p0, L飘花落叶言子世楪哲苏兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲兰楪苏:L飘花落叶言子世楪哲苏兰/飘花落叶言子楪苏兰哲世;

    .line 333
    .line 334
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/node/飘花落叶言子哲楪世苏兰;)V

    .line 335
    .line 336
    .line 337
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;)V

    .line 338
    .line 339
    .line 340
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/node/飘花落叶言子楪哲苏世兰;)V

    .line 341
    .line 342
    .line 343
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 344
    .line 345
    return-object p0

    .line 346
    :pswitch_5
    check-cast p0, L飘花落叶言子世楪哲苏兰/飘花落叶言子楪苏哲世兰;

    .line 347
    .line 348
    iput-object v4, p0, L飘花落叶言子世楪哲苏兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲兰楪苏:L飘花落叶言子世楪哲苏兰/飘花落叶言子楪苏世兰哲;

    .line 349
    .line 350
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/node/飘花落叶言子哲楪世苏兰;)V

    .line 351
    .line 352
    .line 353
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;)V

    .line 354
    .line 355
    .line 356
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/node/飘花落叶言子楪哲苏世兰;)V

    .line 357
    .line 358
    .line 359
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 360
    .line 361
    return-object p0

    .line 362
    :pswitch_6
    check-cast p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;

    .line 363
    .line 364
    iget-object p0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;

    .line 365
    .line 366
    if-eqz p0, :cond_a

    .line 367
    .line 368
    invoke-static {}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世苏兰哲楪()Ljava/util/Map;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    if-eqz v1, :cond_7

    .line 377
    .line 378
    new-array v0, v3, [Lkotlin/Pair;

    .line 379
    .line 380
    goto :goto_4

    .line 381
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    if-eqz v2, :cond_8

    .line 403
    .line 404
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    check-cast v2, Ljava/util/Map$Entry;

    .line 409
    .line 410
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    check-cast v5, Ljava/lang/String;

    .line 415
    .line 416
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    new-instance v6, Lkotlin/Pair;

    .line 421
    .line 422
    invoke-direct {v6, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    goto :goto_3

    .line 429
    :cond_8
    new-array v0, v3, [Lkotlin/Pair;

    .line 430
    .line 431
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, [Lkotlin/Pair;

    .line 436
    .line 437
    :goto_4
    array-length v1, v0

    .line 438
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    check-cast v0, [Lkotlin/Pair;

    .line 443
    .line 444
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {p0, v0}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Landroid/os/Bundle;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result p0

    .line 455
    if-eqz p0, :cond_9

    .line 456
    .line 457
    goto :goto_5

    .line 458
    :cond_9
    move-object v4, v0

    .line 459
    :cond_a
    :goto_5
    return-object v4

    .line 460
    :pswitch_7
    check-cast p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;

    .line 461
    .line 462
    iget-object v0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲兰世;

    .line 463
    .line 464
    iget-object v1, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 465
    .line 466
    if-eqz v1, :cond_b

    .line 467
    .line 468
    invoke-interface {v0, p0, v1}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲世楪兰(L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    goto :goto_6

    .line 473
    :cond_b
    const-string p0, "Value should be initialized"

    .line 474
    .line 475
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    :goto_6
    return-object v4

    .line 479
    :pswitch_8
    check-cast p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲苏兰;

    .line 480
    .line 481
    sget-object v0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世哲苏兰;

    .line 482
    .line 483
    new-array v1, v3, [L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 484
    .line 485
    new-instance v2, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪哲兰苏;

    .line 486
    .line 487
    const/4 v3, 0x5

    .line 488
    invoke-direct {v2, p0, v3}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 489
    .line 490
    .line 491
    const-string v3, "kotlinx.serialization.Polymorphic"

    .line 492
    .line 493
    invoke-static {v3, v0, v1, v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Landroidx/window/area/飘花落叶言子楪世兰哲苏;[L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰哲苏;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 498
    .line 499
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    new-instance v1, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 503
    .line 504
    invoke-direct {v1, v0, p0}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V

    .line 505
    .line 506
    .line 507
    return-object v1

    .line 508
    :pswitch_9
    check-cast p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲世苏兰;

    .line 509
    .line 510
    new-instance v0, Ljava/lang/StringBuilder;

    .line 511
    .line 512
    const-string v1, "No method in "

    .line 513
    .line 514
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    return-object p0

    .line 525
    :pswitch_a
    check-cast p0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰哲苏;

    .line 526
    .line 527
    iget-object v0, p0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲:[L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 528
    .line 529
    invoke-static {p0, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世兰苏哲(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;[L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)I

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 534
    .line 535
    .line 536
    move-result-object p0

    .line 537
    return-object p0

    .line 538
    :pswitch_b
    check-cast p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;

    .line 539
    .line 540
    invoke-virtual {p0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    new-instance v0, Ljava/util/ArrayList;

    .line 545
    .line 546
    invoke-static {p0, v2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 551
    .line 552
    .line 553
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    if-eqz v1, :cond_c

    .line 562
    .line 563
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    check-cast v1, Ljava/security/cert/Certificate;

    .line 568
    .line 569
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 573
    .line 574
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_7

    .line 578
    :cond_c
    return-object v0

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
