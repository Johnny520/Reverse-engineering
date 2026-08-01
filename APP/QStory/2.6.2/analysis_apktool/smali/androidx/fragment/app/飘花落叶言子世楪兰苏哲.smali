.class public final Landroidx/fragment/app/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .line 1
    const-class v0, Landroidx/fragment/app/FragmentContainerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance p0, Landroidx/fragment/app/FragmentContainerView;

    .line 16
    .line 17
    invoke-direct {p0, p3, p4, v1}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string v0, "fragment"

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/4 v0, 0x0

    .line 28
    if-nez p2, :cond_1

    .line 29
    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_1
    const-string p2, "class"

    .line 33
    .line 34
    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    sget-object v2, L飘花落叶言子哲兰楪苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 39
    .line 40
    invoke-virtual {p3, p4, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :cond_2
    const/4 v4, 0x1

    .line 52
    const/4 v5, -0x1

    .line 53
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    const/4 v7, 0x2

    .line 58
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 63
    .line 64
    .line 65
    if-eqz p2, :cond_16

    .line 66
    .line 67
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :try_start_0
    invoke-static {v2, p2}, Landroidx/fragment/app/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-class v9, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 76
    .line 77
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    goto :goto_0

    .line 82
    :catch_0
    move v2, v3

    .line 83
    :goto_0
    if-nez v2, :cond_3

    .line 84
    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_3
    if-eqz p1, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    :cond_4
    if-ne v3, v5, :cond_6

    .line 94
    .line 95
    if-ne v6, v5, :cond_6

    .line 96
    .line 97
    if-eqz v8, :cond_5

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const-string p1, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    .line 105
    .line 106
    invoke-static {p0, p1, p2}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_6
    :goto_1
    if-eq v6, v5, :cond_7

    .line 111
    .line 112
    invoke-virtual {v1, v6}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪哲兰苏(I)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    goto :goto_2

    .line 117
    :cond_7
    move-object v2, v0

    .line 118
    :goto_2
    if-nez v2, :cond_8

    .line 119
    .line 120
    if-eqz v8, :cond_8

    .line 121
    .line 122
    invoke-virtual {v1, v8}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    :cond_8
    if-nez v2, :cond_9

    .line 127
    .line 128
    if-eq v3, v5, :cond_9

    .line 129
    .line 130
    invoke-virtual {v1, v3}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪哲兰苏(I)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    :cond_9
    const-string v5, "Fragment "

    .line 135
    .line 136
    const-string v9, "FragmentManager"

    .line 137
    .line 138
    if-nez v2, :cond_d

    .line 139
    .line 140
    invoke-virtual {v1}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏楪哲兰()Landroidx/fragment/app/飘花落叶言子世苏哲楪兰;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p4, p2}, Landroidx/fragment/app/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    iput-boolean v4, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Z

    .line 152
    .line 153
    if-eqz v6, :cond_a

    .line 154
    .line 155
    move p3, v6

    .line 156
    goto :goto_3

    .line 157
    :cond_a
    move p3, v3

    .line 158
    :goto_3
    iput p3, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:I

    .line 159
    .line 160
    iput v3, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:I

    .line 161
    .line 162
    iput-object v8, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 163
    .line 164
    iput-boolean v4, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪兰苏哲:Z

    .line 165
    .line 166
    iput-object v1, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲楪兰:Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 167
    .line 168
    iget-object p3, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 169
    .line 170
    iput-object p3, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 171
    .line 172
    iget-object p4, p3, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/FragmentActivity;

    .line 173
    .line 174
    iput-boolean v4, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰楪哲苏:Z

    .line 175
    .line 176
    if-nez p3, :cond_b

    .line 177
    .line 178
    move-object p3, v0

    .line 179
    goto :goto_4

    .line 180
    :cond_b
    iget-object p3, p3, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/FragmentActivity;

    .line 181
    .line 182
    :goto_4
    if-eqz p3, :cond_c

    .line 183
    .line 184
    iput-boolean v4, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰楪哲苏:Z

    .line 185
    .line 186
    :cond_c
    invoke-virtual {v1, v2}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)Landroidx/fragment/app/飘花落叶言子世兰哲苏楪;

    .line 187
    .line 188
    .line 189
    move-result-object p3

    .line 190
    invoke-static {v7}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 191
    .line 192
    .line 193
    move-result p4

    .line 194
    if-eqz p4, :cond_10

    .line 195
    .line 196
    new-instance p4, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {p4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v1, " has been inflated via the <fragment> tag: id=0x"

    .line 205
    .line 206
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p4

    .line 220
    invoke-static {v9, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_d
    iget-boolean p3, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪兰苏哲:Z

    .line 225
    .line 226
    if-nez p3, :cond_15

    .line 227
    .line 228
    iput-boolean v4, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪兰苏哲:Z

    .line 229
    .line 230
    iput-object v1, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲楪兰:Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 231
    .line 232
    iget-object p3, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 233
    .line 234
    iput-object p3, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲兰楪:Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;

    .line 235
    .line 236
    iget-object p4, p3, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/FragmentActivity;

    .line 237
    .line 238
    iput-boolean v4, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰楪哲苏:Z

    .line 239
    .line 240
    if-nez p3, :cond_e

    .line 241
    .line 242
    move-object p3, v0

    .line 243
    goto :goto_5

    .line 244
    :cond_e
    iget-object p3, p3, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/FragmentActivity;

    .line 245
    .line 246
    :goto_5
    if-eqz p3, :cond_f

    .line 247
    .line 248
    iput-boolean v4, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰楪哲苏:Z

    .line 249
    .line 250
    :cond_f
    invoke-virtual {v1, v2}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)Landroidx/fragment/app/飘花落叶言子世兰哲苏楪;

    .line 251
    .line 252
    .line 253
    move-result-object p3

    .line 254
    invoke-static {v7}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 255
    .line 256
    .line 257
    move-result p4

    .line 258
    if-eqz p4, :cond_10

    .line 259
    .line 260
    new-instance p4, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v1, "Retained Fragment "

    .line 263
    .line 264
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string v1, " has been re-attached via the <fragment> tag: id=0x"

    .line 271
    .line 272
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p4

    .line 286
    invoke-static {v9, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 287
    .line 288
    .line 289
    :cond_10
    :goto_6
    check-cast p1, Landroid/view/ViewGroup;

    .line 290
    .line 291
    sget-object p4, L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏哲兰;

    .line 292
    .line 293
    new-instance p4, Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;

    .line 294
    .line 295
    invoke-direct {p4, v2, p1}, Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;-><init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroid/view/ViewGroup;)V

    .line 296
    .line 297
    .line 298
    invoke-static {p4}, L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Landroidx/fragment/app/strictmode/Violation;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v2}, L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏哲兰;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    iget-object v3, v1, L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 306
    .line 307
    sget-object v7, Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;->DETECT_FRAGMENT_TAG_USAGE:Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;

    .line 308
    .line 309
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-eqz v3, :cond_11

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    const-class v7, Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;

    .line 320
    .line 321
    invoke-static {v1, v3, v7}, L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏哲兰;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_11

    .line 326
    .line 327
    invoke-static {v1, p4}, L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言子哲兰世楪苏/飘花落叶言子楪世苏哲兰;Landroidx/fragment/app/strictmode/Violation;)V

    .line 328
    .line 329
    .line 330
    :cond_11
    iput-object p1, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏楪哲:Landroid/view/ViewGroup;

    .line 331
    .line 332
    invoke-virtual {p3}, Landroidx/fragment/app/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏兰世哲()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p3}, Landroidx/fragment/app/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏哲兰世()V

    .line 336
    .line 337
    .line 338
    iget-object p1, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 339
    .line 340
    if-eqz p1, :cond_14

    .line 341
    .line 342
    if-eqz v6, :cond_12

    .line 343
    .line 344
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 345
    .line 346
    .line 347
    :cond_12
    iget-object p1, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 348
    .line 349
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    if-nez p1, :cond_13

    .line 354
    .line 355
    iget-object p1, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 356
    .line 357
    invoke-virtual {p1, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    :cond_13
    iget-object p1, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 361
    .line 362
    new-instance p2, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;

    .line 363
    .line 364
    invoke-direct {p2, p0, v4, p3}, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 368
    .line 369
    .line 370
    iget-object p0, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 371
    .line 372
    return-object p0

    .line 373
    :cond_14
    const-string p0, " did not create a view."

    .line 374
    .line 375
    invoke-static {v5, p2, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-object v0

    .line 383
    :cond_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 384
    .line 385
    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object p3

    .line 393
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p4

    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string p1, ": Duplicate id 0x"

    .line 406
    .line 407
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    const-string p1, ", tag "

    .line 414
    .line 415
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string p1, ", or parent id 0x"

    .line 422
    .line 423
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    const-string p1, " with another fragment for "

    .line 430
    .line 431
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw p0

    .line 445
    :cond_16
    :goto_7
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 446
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/飘花落叶言子世楪兰苏哲;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method
