.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u4e16\u5170\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-wide v0, -0x36a57f99051405a7L    # -2.3640191603790152E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x36a5bc6f051405a7L    # -2.3428209300493085E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const-wide v0, -0x36a5bc39051405a7L    # -2.3428944310405634E45

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    if-eqz p1, :cond_3

    .line 41
    .line 42
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    new-instance v0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;

    .line 52
    .line 53
    invoke-direct {v0}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, v0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 57
    .line 58
    const-wide v1, -0x36a5bc08051405a7L    # -2.34296112638448E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-wide v1, -0x36a5bbfe051405a7L    # -2.3429747376791567E45

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-wide v2, -0x36a5bbe7051405a7L    # -2.3430060436569135E45

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    filled-new-array {p1, v1, v2}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v0, p1}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰([Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪哲兰世()Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-wide v0, -0x36a5ab07051405a7L    # -2.3488861229573073E45

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    move-object v1, v0

    .line 119
    check-cast v1, Ljava/lang/reflect/Method;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    array-length v1, v1

    .line 126
    const/4 v2, 0x3

    .line 127
    if-ne v1, v2, :cond_1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_2
    const/4 v0, 0x0

    .line 131
    :goto_0
    check-cast v0, Ljava/lang/reflect/Method;

    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;

    .line 136
    .line 137
    const/4 v1, 0x1

    .line 138
    invoke-direct {p1, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 142
    .line 143
    .line 144
    :cond_3
    const-wide v0, -0x36a51571051405a7L    # -2.401009214792789E45

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_5

    .line 158
    .line 159
    new-instance v0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;

    .line 160
    .line 161
    invoke-direct {v0}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 162
    .line 163
    .line 164
    iput-object p1, v0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 165
    .line 166
    const-wide v1, -0x36a5bbe8051405a7L    # -2.3430046825274458E45

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    const-wide v2, -0x36a5bbc0051405a7L    # -2.343059127706153E45

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    const-wide v3, -0x36a5bbb9051405a7L    # -2.343068655612427E45

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v0, v1}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰([Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰哲世()Ljava/lang/reflect/Method;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-nez v0, :cond_4

    .line 205
    .line 206
    const-wide v1, -0x36a5bb96051405a7L    # -2.3431162951437958E45

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    if-eqz v1, :cond_4

    .line 220
    .line 221
    invoke-static {v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    const-wide v2, -0x36a5bb64051405a7L    # -2.34318435161718E45

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    iput-object v2, v1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v1}, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    check-cast v1, Ljava/lang/reflect/Method;

    .line 241
    .line 242
    if-eqz v1, :cond_4

    .line 243
    .line 244
    new-instance v0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;

    .line 245
    .line 246
    invoke-direct {v0}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 247
    .line 248
    .line 249
    iput-object p1, v0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 250
    .line 251
    filled-new-array {v1}, [Ljava/lang/reflect/Method;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    iget-object v1, v0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰哲世()Ljava/lang/reflect/Method;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    :cond_4
    if-eqz v0, :cond_5

    .line 269
    .line 270
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;

    .line 271
    .line 272
    const/4 v1, 0x2

    .line 273
    invoke-direct {p1, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;I)V

    .line 274
    .line 275
    .line 276
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 277
    .line 278
    .line 279
    :catch_0
    :cond_5
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a5bc67051405a7L    # -2.34283181908505E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
