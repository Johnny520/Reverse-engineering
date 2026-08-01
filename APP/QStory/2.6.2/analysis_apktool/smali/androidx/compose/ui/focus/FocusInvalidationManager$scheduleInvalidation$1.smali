.class final synthetic Landroidx/compose/ui/focus/FocusInvalidationManager$scheduleInvalidation$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "invalidateNodes()V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    const-string v4, "invalidateNodes"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 305
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager$scheduleInvalidation$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 8
    .line 9
    iget-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 10
    .line 11
    iget-object v3, v0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 12
    .line 13
    invoke-virtual {v3}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const/16 v12, 0x8

    .line 18
    .line 19
    const/4 v13, 0x0

    .line 20
    if-nez v4, :cond_3

    .line 21
    .line 22
    iget-object v4, v2, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v14, v2, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 25
    .line 26
    array-length v15, v14

    .line 27
    add-int/lit8 v15, v15, -0x2

    .line 28
    .line 29
    if-ltz v15, :cond_10

    .line 30
    .line 31
    move v5, v13

    .line 32
    const-wide/16 v16, 0x80

    .line 33
    .line 34
    const-wide/16 v18, 0xff

    .line 35
    .line 36
    :goto_0
    aget-wide v7, v14, v5

    .line 37
    .line 38
    const/16 p0, 0x7

    .line 39
    .line 40
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    not-long v9, v7

    .line 46
    shl-long v9, v9, p0

    .line 47
    .line 48
    and-long/2addr v9, v7

    .line 49
    and-long v9, v9, v20

    .line 50
    .line 51
    cmp-long v6, v9, v20

    .line 52
    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    sub-int v6, v5, v15

    .line 56
    .line 57
    not-int v6, v6

    .line 58
    ushr-int/lit8 v6, v6, 0x1f

    .line 59
    .line 60
    rsub-int/lit8 v6, v6, 0x8

    .line 61
    .line 62
    move v9, v13

    .line 63
    :goto_1
    if-ge v9, v6, :cond_1

    .line 64
    .line 65
    and-long v10, v7, v18

    .line 66
    .line 67
    cmp-long v10, v10, v16

    .line 68
    .line 69
    if-gez v10, :cond_0

    .line 70
    .line 71
    shl-int/lit8 v10, v5, 0x3

    .line 72
    .line 73
    add-int/2addr v10, v9

    .line 74
    aget-object v10, v4, v10

    .line 75
    .line 76
    check-cast v10, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;

    .line 77
    .line 78
    sget-object v11, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 79
    .line 80
    invoke-interface {v10, v11}, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;->飘花落叶言子哲楪苏兰世(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    shr-long/2addr v7, v12

    .line 84
    add-int/lit8 v9, v9, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    if-ne v6, v12, :cond_10

    .line 88
    .line 89
    :cond_2
    if-eq v5, v15, :cond_10

    .line 90
    .line 91
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/16 p0, 0x7

    .line 95
    .line 96
    const-wide/16 v16, 0x80

    .line 97
    .line 98
    const-wide/16 v18, 0xff

    .line 99
    .line 100
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    iget-boolean v5, v4, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 106
    .line 107
    if-eqz v5, :cond_10

    .line 108
    .line 109
    invoke-virtual {v1, v4}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    invoke-virtual {v4}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏哲世()V

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {v4}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    iget-object v6, v4, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 123
    .line 124
    iget-boolean v6, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 125
    .line 126
    if-nez v6, :cond_5

    .line 127
    .line 128
    const-string v6, "visitAncestors called on an unattached node"

    .line 129
    .line 130
    invoke-static {v6}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    iget-object v6, v4, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 134
    .line 135
    invoke-static {v4}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    move v7, v13

    .line 140
    :goto_2
    if-eqz v4, :cond_c

    .line 141
    .line 142
    iget-object v8, v4, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 143
    .line 144
    iget-object v8, v8, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 145
    .line 146
    iget v8, v8, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 147
    .line 148
    and-int/lit16 v8, v8, 0x1400

    .line 149
    .line 150
    if-eqz v8, :cond_a

    .line 151
    .line 152
    :goto_3
    if-eqz v6, :cond_a

    .line 153
    .line 154
    iget v8, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 155
    .line 156
    and-int/lit16 v9, v8, 0x1400

    .line 157
    .line 158
    if-eqz v9, :cond_9

    .line 159
    .line 160
    and-int/lit16 v8, v8, 0x400

    .line 161
    .line 162
    if-eqz v8, :cond_6

    .line 163
    .line 164
    add-int/lit8 v7, v7, 0x1

    .line 165
    .line 166
    :cond_6
    instance-of v8, v6, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;

    .line 167
    .line 168
    if-eqz v8, :cond_9

    .line 169
    .line 170
    invoke-virtual {v2, v6}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-nez v8, :cond_7

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_7
    const/4 v8, 0x1

    .line 178
    if-gt v7, v8, :cond_8

    .line 179
    .line 180
    move-object v8, v6

    .line 181
    check-cast v8, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;

    .line 182
    .line 183
    invoke-interface {v8, v5}, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;->飘花落叶言子哲楪苏兰世(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_8
    move-object v8, v6

    .line 188
    check-cast v8, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;

    .line 189
    .line 190
    sget-object v9, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 191
    .line 192
    invoke-interface {v8, v9}, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;->飘花落叶言子哲楪苏兰世(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V

    .line 193
    .line 194
    .line 195
    :goto_4
    invoke-virtual {v2, v6}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    :cond_9
    :goto_5
    iget-object v6, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_a
    invoke-virtual {v4}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-eqz v4, :cond_b

    .line 206
    .line 207
    iget-object v6, v4, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 208
    .line 209
    if-eqz v6, :cond_b

    .line 210
    .line 211
    iget-object v6, v6, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_b
    const/4 v6, 0x0

    .line 215
    goto :goto_2

    .line 216
    :cond_c
    iget-object v4, v2, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 217
    .line 218
    iget-object v5, v2, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 219
    .line 220
    array-length v6, v5

    .line 221
    add-int/lit8 v6, v6, -0x2

    .line 222
    .line 223
    if-ltz v6, :cond_10

    .line 224
    .line 225
    move v7, v13

    .line 226
    :goto_6
    aget-wide v8, v5, v7

    .line 227
    .line 228
    not-long v10, v8

    .line 229
    shl-long v10, v10, p0

    .line 230
    .line 231
    and-long/2addr v10, v8

    .line 232
    and-long v10, v10, v20

    .line 233
    .line 234
    cmp-long v10, v10, v20

    .line 235
    .line 236
    if-eqz v10, :cond_f

    .line 237
    .line 238
    sub-int v10, v7, v6

    .line 239
    .line 240
    not-int v10, v10

    .line 241
    ushr-int/lit8 v10, v10, 0x1f

    .line 242
    .line 243
    rsub-int/lit8 v10, v10, 0x8

    .line 244
    .line 245
    move v11, v13

    .line 246
    :goto_7
    if-ge v11, v10, :cond_e

    .line 247
    .line 248
    and-long v14, v8, v18

    .line 249
    .line 250
    cmp-long v14, v14, v16

    .line 251
    .line 252
    if-gez v14, :cond_d

    .line 253
    .line 254
    shl-int/lit8 v14, v7, 0x3

    .line 255
    .line 256
    add-int/2addr v14, v11

    .line 257
    aget-object v14, v4, v14

    .line 258
    .line 259
    check-cast v14, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;

    .line 260
    .line 261
    sget-object v15, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 262
    .line 263
    invoke-interface {v14, v15}, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;->飘花落叶言子哲楪苏兰世(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V

    .line 264
    .line 265
    .line 266
    :cond_d
    shr-long/2addr v8, v12

    .line 267
    add-int/lit8 v11, v11, 0x1

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_e
    if-ne v10, v12, :cond_10

    .line 271
    .line 272
    :cond_f
    if-eq v7, v6, :cond_10

    .line 273
    .line 274
    add-int/lit8 v7, v7, 0x1

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_10
    invoke-virtual {v3}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    if-eqz v4, :cond_11

    .line 282
    .line 283
    iget-object v4, v3, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 284
    .line 285
    invoke-virtual {v4}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    sget-object v5, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 290
    .line 291
    if-ne v4, v5, :cond_12

    .line 292
    .line 293
    :cond_11
    invoke-virtual {v3}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲()V

    .line 294
    .line 295
    .line 296
    :cond_12
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 300
    .line 301
    .line 302
    iput-boolean v13, v0, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 303
    .line 304
    return-void
.end method
