.class final Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;",
        "parentFrameClock",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2"
    f = "Recomposer.kt"
    l = {
        0x267,
        0x272
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u54f2\u4e16\u696a;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u54f2\u4e16\u696a;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u82cf\u54f2\u696a;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;",
            ">;",
            "Landroidx/collection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf;",
            "Landroidx/collection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf;",
            "Landroidx/collection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf;",
            "Landroidx/collection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    iget-object v4, v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v4

    .line 12
    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->clear()V

    .line 13
    .line 14
    .line 15
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->clear()V

    .line 16
    .line 17
    .line 18
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/4 v7, 0x0

    .line 23
    :goto_0
    if-ge v7, v5, :cond_0

    .line 24
    .line 25
    move-object/from16 v8, p3

    .line 26
    .line 27
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    check-cast v9, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 32
    .line 33
    invoke-virtual {v9}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v9}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v7, v7, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_0
    move-object/from16 v8, p3

    .line 46
    .line 47
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 48
    .line 49
    .line 50
    iget-object v5, v1, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v7, v1, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 53
    .line 54
    array-length v8, v7

    .line 55
    add-int/lit8 v8, v8, -0x2

    .line 56
    .line 57
    const/16 v6, 0x8

    .line 58
    .line 59
    const-wide/16 p2, 0x80

    .line 60
    .line 61
    if-ltz v8, :cond_4

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    const-wide/16 v16, 0xff

    .line 65
    .line 66
    :goto_1
    aget-wide v11, v7, v9

    .line 67
    .line 68
    const/4 v10, 0x7

    .line 69
    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    not-long v13, v11

    .line 75
    shl-long/2addr v13, v10

    .line 76
    and-long/2addr v13, v11

    .line 77
    and-long v13, v13, v18

    .line 78
    .line 79
    cmp-long v13, v13, v18

    .line 80
    .line 81
    if-eqz v13, :cond_3

    .line 82
    .line 83
    sub-int v13, v9, v8

    .line 84
    .line 85
    not-int v13, v13

    .line 86
    ushr-int/lit8 v13, v13, 0x1f

    .line 87
    .line 88
    rsub-int/lit8 v13, v13, 0x8

    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    :goto_2
    if-ge v14, v13, :cond_2

    .line 92
    .line 93
    and-long v20, v11, v16

    .line 94
    .line 95
    cmp-long v15, v20, p2

    .line 96
    .line 97
    if-gez v15, :cond_1

    .line 98
    .line 99
    shl-int/lit8 v15, v9, 0x3

    .line 100
    .line 101
    add-int/2addr v15, v14

    .line 102
    aget-object v15, v5, v15

    .line 103
    .line 104
    check-cast v15, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 105
    .line 106
    invoke-virtual {v15}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v15}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    shr-long/2addr v11, v6

    .line 113
    add-int/lit8 v14, v14, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    if-ne v13, v6, :cond_5

    .line 117
    .line 118
    :cond_3
    if-eq v9, v8, :cond_5

    .line 119
    .line 120
    add-int/lit8 v9, v9, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    const/4 v10, 0x7

    .line 124
    const-wide/16 v16, 0xff

    .line 125
    .line 126
    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 132
    .line 133
    .line 134
    iget-object v1, v2, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 135
    .line 136
    iget-object v5, v2, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 137
    .line 138
    array-length v7, v5

    .line 139
    add-int/lit8 v7, v7, -0x2

    .line 140
    .line 141
    if-ltz v7, :cond_9

    .line 142
    .line 143
    const/4 v8, 0x0

    .line 144
    :goto_3
    aget-wide v11, v5, v8

    .line 145
    .line 146
    not-long v13, v11

    .line 147
    shl-long/2addr v13, v10

    .line 148
    and-long/2addr v13, v11

    .line 149
    and-long v13, v13, v18

    .line 150
    .line 151
    cmp-long v9, v13, v18

    .line 152
    .line 153
    if-eqz v9, :cond_8

    .line 154
    .line 155
    sub-int v9, v8, v7

    .line 156
    .line 157
    not-int v9, v9

    .line 158
    ushr-int/lit8 v9, v9, 0x1f

    .line 159
    .line 160
    rsub-int/lit8 v9, v9, 0x8

    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    :goto_4
    if-ge v13, v9, :cond_7

    .line 164
    .line 165
    and-long v14, v11, v16

    .line 166
    .line 167
    cmp-long v14, v14, p2

    .line 168
    .line 169
    if-gez v14, :cond_6

    .line 170
    .line 171
    shl-int/lit8 v14, v8, 0x3

    .line 172
    .line 173
    add-int/2addr v14, v13

    .line 174
    aget-object v14, v1, v14

    .line 175
    .line 176
    check-cast v14, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 177
    .line 178
    invoke-virtual {v14}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰()V

    .line 179
    .line 180
    .line 181
    :cond_6
    shr-long/2addr v11, v6

    .line 182
    add-int/lit8 v13, v13, 0x1

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    if-ne v9, v6, :cond_9

    .line 186
    .line 187
    :cond_8
    if-eq v8, v7, :cond_9

    .line 188
    .line 189
    add-int/lit8 v8, v8, 0x1

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_9
    invoke-virtual {v2}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {p6 .. p6}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 196
    .line 197
    .line 198
    iget-object v1, v3, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 199
    .line 200
    iget-object v2, v3, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 201
    .line 202
    array-length v5, v2

    .line 203
    add-int/lit8 v5, v5, -0x2

    .line 204
    .line 205
    if-ltz v5, :cond_d

    .line 206
    .line 207
    const/4 v7, 0x0

    .line 208
    :goto_5
    aget-wide v8, v2, v7

    .line 209
    .line 210
    not-long v11, v8

    .line 211
    shl-long/2addr v11, v10

    .line 212
    and-long/2addr v11, v8

    .line 213
    and-long v11, v11, v18

    .line 214
    .line 215
    cmp-long v11, v11, v18

    .line 216
    .line 217
    if-eqz v11, :cond_c

    .line 218
    .line 219
    sub-int v11, v7, v5

    .line 220
    .line 221
    not-int v11, v11

    .line 222
    ushr-int/lit8 v11, v11, 0x1f

    .line 223
    .line 224
    rsub-int/lit8 v11, v11, 0x8

    .line 225
    .line 226
    const/4 v12, 0x0

    .line 227
    :goto_6
    if-ge v12, v11, :cond_b

    .line 228
    .line 229
    and-long v13, v8, v16

    .line 230
    .line 231
    cmp-long v13, v13, p2

    .line 232
    .line 233
    if-gez v13, :cond_a

    .line 234
    .line 235
    shl-int/lit8 v13, v7, 0x3

    .line 236
    .line 237
    add-int/2addr v13, v12

    .line 238
    aget-object v13, v1, v13

    .line 239
    .line 240
    check-cast v13, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 241
    .line 242
    invoke-virtual {v13}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v13}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V

    .line 246
    .line 247
    .line 248
    :cond_a
    shr-long/2addr v8, v6

    .line 249
    add-int/lit8 v12, v12, 0x1

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_b
    if-ne v11, v6, :cond_d

    .line 253
    .line 254
    :cond_c
    if-eq v7, v5, :cond_d

    .line 255
    .line 256
    add-int/lit8 v7, v7, 0x1

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_d
    invoke-virtual {v3}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    .line 261
    .line 262
    monitor-exit v4

    .line 263
    return-void

    .line 264
    :goto_7
    monitor-exit v4

    .line 265
    throw v0
.end method

.method private static final invokeSuspend$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u82cf\u54f2\u696a;",
            ">;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u54f2\u4e16\u696a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Landroidx/compose/runtime/飘花落叶言子世兰苏哲楪;

    .line 21
    .line 22
    invoke-interface {p0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object p0, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    throw p0
.end method

.method private static final invokeSuspend$lambda$2(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/Set;J)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v4, p6

    .line 6
    .line 7
    move-object/from16 v6, p7

    .line 8
    .line 9
    iget-object v3, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v3

    .line 12
    :try_start_0
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏兰哲()Z

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_11

    .line 16
    monitor-exit v3

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v7, 0x0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    const-string v0, "Recomposer:animation"

    .line 23
    .line 24
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :try_start_1
    iget-object v0, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲苏兰;

    .line 28
    .line 29
    iget-object v0, v0, Landroidx/compose/runtime/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 30
    .line 31
    new-instance v8, Landroidx/compose/foundation/text/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    move-wide/from16 v9, p9

    .line 34
    .line 35
    invoke-direct {v8, v9, v10, v3}, Landroidx/compose/foundation/text/飘花落叶言子楪世哲兰苏;-><init>(JI)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v8}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 39
    .line 40
    .line 41
    sget-object v8, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    :try_start_2
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世:Landroidx/compose/runtime/snapshots/飘花落叶言子楪世苏哲兰;

    .line 45
    .line 46
    iget-object v0, v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰()Z

    .line 51
    .line 52
    .line 53
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    if-ne v0, v5, :cond_0

    .line 55
    .line 56
    move v0, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v0, v7

    .line 59
    :goto_0
    :try_start_3
    monitor-exit v8

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    :try_start_4
    monitor-exit v8

    .line 71
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_2
    :goto_1
    const-string v0, "Recomposer:recompose"

    .line 78
    .line 79
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :try_start_5
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲楪兰苏()Z

    .line 83
    .line 84
    .line 85
    iget-object v8, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 86
    .line 87
    monitor-enter v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_10

    .line 88
    :try_start_6
    iget-object v0, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏哲世兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 89
    .line 90
    iget-object v9, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 91
    .line 92
    iget v0, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 93
    .line 94
    move v10, v7

    .line 95
    :goto_2
    if-ge v10, v0, :cond_3

    .line 96
    .line 97
    aget-object v11, v9, v10

    .line 98
    .line 99
    check-cast v11, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 100
    .line 101
    invoke-interface {v2, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    add-int/lit8 v10, v10, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catchall_2
    move-exception v0

    .line 108
    goto/16 :goto_24

    .line 109
    .line 110
    :cond_3
    iget-object v0, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏哲世兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 111
    .line 112
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 113
    .line 114
    .line 115
    :try_start_7
    monitor-exit v8

    .line 116
    invoke-virtual/range {p1 .. p1}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {p2 .. p2}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 120
    .line 121
    .line 122
    :goto_3
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    const/4 v8, 0x0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    invoke-interface/range {p4 .. p4}, Ljava/util/Collection;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_5

    .line 134
    .line 135
    :cond_4
    move-object/from16 v7, p1

    .line 136
    .line 137
    move/from16 v17, v3

    .line 138
    .line 139
    move-object v6, v4

    .line 140
    move v0, v5

    .line 141
    move-object/from16 v4, p4

    .line 142
    .line 143
    move-object/from16 v5, p5

    .line 144
    .line 145
    move-object v3, v2

    .line 146
    move-object/from16 v2, p2

    .line 147
    .line 148
    goto/16 :goto_16

    .line 149
    .line 150
    :cond_5
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    instance-of v9, v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世苏兰哲;

    .line 155
    .line 156
    if-eqz v9, :cond_6

    .line 157
    .line 158
    new-instance v10, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏兰楪哲;

    .line 159
    .line 160
    move-object v11, v0

    .line 161
    check-cast v11, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世苏兰哲;

    .line 162
    .line 163
    const/4 v14, 0x1

    .line 164
    const/4 v15, 0x0

    .line 165
    const/4 v12, 0x0

    .line 166
    const/4 v13, 0x0

    .line 167
    invoke-direct/range {v10 .. v15}, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏兰楪哲;-><init>(Landroidx/compose/runtime/snapshots/飘花落叶言子楪世苏兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;ZZ)V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    new-instance v10, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏兰哲楪;

    .line 172
    .line 173
    invoke-direct {v10, v0, v8, v5, v7}, Landroidx/compose/runtime/snapshots/飘花落叶言子世苏兰哲楪;-><init>(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;ZZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_10

    .line 174
    .line 175
    .line 176
    :goto_4
    :try_start_8
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 177
    .line 178
    .line 179
    move-result-object v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 180
    :try_start_9
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 184
    if-nez v0, :cond_9

    .line 185
    .line 186
    :try_start_a
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    move v5, v7

    .line 191
    :goto_5
    if-ge v5, v0, :cond_7

    .line 192
    .line 193
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    check-cast v11, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 198
    .line 199
    invoke-virtual {v6, v11}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    add-int/lit8 v5, v5, 0x1

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :catchall_3
    move-exception v0

    .line 206
    goto :goto_7

    .line 207
    :cond_7
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    move v5, v7

    .line 212
    :goto_6
    if-ge v5, v0, :cond_8

    .line 213
    .line 214
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    check-cast v11, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 219
    .line 220
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 221
    .line 222
    .line 223
    add-int/lit8 v5, v5, 0x1

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_8
    :try_start_b
    invoke-interface {v4}, Ljava/util/List;->clear()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 227
    .line 228
    .line 229
    :cond_9
    move-object/from16 v5, p5

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :catchall_4
    move-exception v0

    .line 233
    goto/16 :goto_14

    .line 234
    .line 235
    :goto_7
    :try_start_c
    invoke-virtual {v1, v0, v8}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲楪苏兰(Ljava/lang/Throwable;Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v7, p1

    .line 239
    .line 240
    move-object/from16 v8, p2

    .line 241
    .line 242
    move-object/from16 v3, p4

    .line 243
    .line 244
    move-object/from16 v5, p5

    .line 245
    .line 246
    invoke-static/range {v1 .. v8}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;)V

    .line 247
    .line 248
    .line 249
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 250
    .line 251
    :try_start_d
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->clear()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 252
    .line 253
    .line 254
    :try_start_e
    invoke-static {v9}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 255
    .line 256
    .line 257
    :try_start_f
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_10

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 261
    .line 262
    .line 263
    return-object v0

    .line 264
    :catchall_5
    move-exception v0

    .line 265
    goto/16 :goto_15

    .line 266
    .line 267
    :catchall_6
    move-exception v0

    .line 268
    :try_start_10
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->clear()V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :goto_8
    invoke-virtual {v5}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰()Z

    .line 273
    .line 274
    .line 275
    move-result v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 276
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    const/16 v4, 0x8

    .line 282
    .line 283
    if-eqz v0, :cond_f

    .line 284
    .line 285
    :try_start_11
    invoke-virtual {v6, v5}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏哲兰世(Landroidx/collection/飘花落叶言子苏世楪哲兰;)V

    .line 286
    .line 287
    .line 288
    iget-object v0, v5, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 289
    .line 290
    const/16 p8, 0x7

    .line 291
    .line 292
    iget-object v2, v5, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 293
    .line 294
    move/from16 v17, v3

    .line 295
    .line 296
    array-length v3, v2

    .line 297
    add-int/lit8 v3, v3, -0x2

    .line 298
    .line 299
    const-wide/16 p9, 0x80

    .line 300
    .line 301
    if-ltz v3, :cond_d

    .line 302
    .line 303
    :goto_9
    aget-wide v11, v2, v7

    .line 304
    .line 305
    const-wide/16 v18, 0xff

    .line 306
    .line 307
    not-long v13, v11

    .line 308
    shl-long v13, v13, p8

    .line 309
    .line 310
    and-long/2addr v13, v11

    .line 311
    and-long/2addr v13, v15

    .line 312
    cmp-long v13, v13, v15

    .line 313
    .line 314
    if-eqz v13, :cond_c

    .line 315
    .line 316
    sub-int v13, v7, v3

    .line 317
    .line 318
    not-int v13, v13

    .line 319
    ushr-int/lit8 v13, v13, 0x1f

    .line 320
    .line 321
    rsub-int/lit8 v13, v13, 0x8

    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    :goto_a
    if-ge v14, v13, :cond_b

    .line 325
    .line 326
    and-long v20, v11, v18

    .line 327
    .line 328
    cmp-long v20, v20, p9

    .line 329
    .line 330
    if-gez v20, :cond_a

    .line 331
    .line 332
    shl-int/lit8 v20, v7, 0x3

    .line 333
    .line 334
    add-int v20, v20, v14

    .line 335
    .line 336
    aget-object v20, v0, v20

    .line 337
    .line 338
    check-cast v20, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 339
    .line 340
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 341
    .line 342
    .line 343
    goto :goto_b

    .line 344
    :catchall_7
    move-exception v0

    .line 345
    goto :goto_c

    .line 346
    :cond_a
    :goto_b
    shr-long/2addr v11, v4

    .line 347
    add-int/lit8 v14, v14, 0x1

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_b
    if-ne v13, v4, :cond_e

    .line 351
    .line 352
    :cond_c
    if-eq v7, v3, :cond_e

    .line 353
    .line 354
    add-int/lit8 v7, v7, 0x1

    .line 355
    .line 356
    goto :goto_9

    .line 357
    :cond_d
    const-wide/16 v18, 0xff

    .line 358
    .line 359
    :cond_e
    :try_start_12
    invoke-virtual {v5}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 360
    .line 361
    .line 362
    goto :goto_d

    .line 363
    :goto_c
    :try_start_13
    invoke-virtual {v1, v0, v8}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲楪苏兰(Ljava/lang/Throwable;Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V

    .line 364
    .line 365
    .line 366
    move-object/from16 v7, p1

    .line 367
    .line 368
    move-object/from16 v8, p2

    .line 369
    .line 370
    move-object/from16 v2, p3

    .line 371
    .line 372
    move-object/from16 v3, p4

    .line 373
    .line 374
    move-object/from16 v4, p6

    .line 375
    .line 376
    invoke-static/range {v1 .. v8}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;)V

    .line 377
    .line 378
    .line 379
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 380
    .line 381
    :try_start_14
    invoke-virtual/range {p5 .. p5}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 382
    .line 383
    .line 384
    :try_start_15
    invoke-static {v9}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    .line 385
    .line 386
    .line 387
    :try_start_16
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_10

    .line 388
    .line 389
    .line 390
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 391
    .line 392
    .line 393
    return-object v0

    .line 394
    :catchall_8
    move-exception v0

    .line 395
    :try_start_17
    invoke-virtual/range {p5 .. p5}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :cond_f
    move/from16 v17, v3

    .line 400
    .line 401
    const/16 p8, 0x7

    .line 402
    .line 403
    const-wide/16 p9, 0x80

    .line 404
    .line 405
    const-wide/16 v18, 0xff

    .line 406
    .line 407
    :goto_d
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰()Z

    .line 408
    .line 409
    .line 410
    move-result v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_4

    .line 411
    if-eqz v0, :cond_14

    .line 412
    .line 413
    :try_start_18
    iget-object v0, v6, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 414
    .line 415
    iget-object v2, v6, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 416
    .line 417
    array-length v3, v2

    .line 418
    add-int/lit8 v3, v3, -0x2

    .line 419
    .line 420
    if-ltz v3, :cond_13

    .line 421
    .line 422
    const/4 v5, 0x0

    .line 423
    :goto_e
    aget-wide v11, v2, v5

    .line 424
    .line 425
    not-long v13, v11

    .line 426
    shl-long v13, v13, p8

    .line 427
    .line 428
    and-long/2addr v13, v11

    .line 429
    and-long/2addr v13, v15

    .line 430
    cmp-long v7, v13, v15

    .line 431
    .line 432
    if-eqz v7, :cond_12

    .line 433
    .line 434
    sub-int v7, v5, v3

    .line 435
    .line 436
    not-int v7, v7

    .line 437
    ushr-int/lit8 v7, v7, 0x1f

    .line 438
    .line 439
    rsub-int/lit8 v7, v7, 0x8

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    :goto_f
    if-ge v13, v7, :cond_11

    .line 443
    .line 444
    and-long v20, v11, v18

    .line 445
    .line 446
    cmp-long v14, v20, p9

    .line 447
    .line 448
    if-gez v14, :cond_10

    .line 449
    .line 450
    shl-int/lit8 v14, v5, 0x3

    .line 451
    .line 452
    add-int/2addr v14, v13

    .line 453
    aget-object v14, v0, v14

    .line 454
    .line 455
    check-cast v14, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 456
    .line 457
    invoke-virtual {v14}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_9

    .line 458
    .line 459
    .line 460
    goto :goto_10

    .line 461
    :catchall_9
    move-exception v0

    .line 462
    goto :goto_11

    .line 463
    :cond_10
    :goto_10
    shr-long/2addr v11, v4

    .line 464
    add-int/lit8 v13, v13, 0x1

    .line 465
    .line 466
    goto :goto_f

    .line 467
    :cond_11
    if-ne v7, v4, :cond_13

    .line 468
    .line 469
    :cond_12
    if-eq v5, v3, :cond_13

    .line 470
    .line 471
    add-int/lit8 v5, v5, 0x1

    .line 472
    .line 473
    goto :goto_e

    .line 474
    :cond_13
    :try_start_19
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    .line 475
    .line 476
    .line 477
    :cond_14
    move-object/from16 v7, p1

    .line 478
    .line 479
    move-object/from16 v2, p2

    .line 480
    .line 481
    goto :goto_12

    .line 482
    :goto_11
    :try_start_1a
    invoke-virtual {v1, v0, v8}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲楪苏兰(Ljava/lang/Throwable;Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V

    .line 483
    .line 484
    .line 485
    move-object/from16 v7, p1

    .line 486
    .line 487
    move-object/from16 v8, p2

    .line 488
    .line 489
    move-object/from16 v2, p3

    .line 490
    .line 491
    move-object/from16 v3, p4

    .line 492
    .line 493
    move-object/from16 v5, p5

    .line 494
    .line 495
    move-object/from16 v4, p6

    .line 496
    .line 497
    invoke-static/range {v1 .. v8}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;)V

    .line 498
    .line 499
    .line 500
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_a

    .line 501
    .line 502
    :try_start_1b
    invoke-virtual/range {p7 .. p7}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_4

    .line 503
    .line 504
    .line 505
    :try_start_1c
    invoke-static {v9}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_5

    .line 506
    .line 507
    .line 508
    :try_start_1d
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_10

    .line 509
    .line 510
    .line 511
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 512
    .line 513
    .line 514
    return-object v0

    .line 515
    :catchall_a
    move-exception v0

    .line 516
    :try_start_1e
    invoke-virtual/range {p7 .. p7}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 517
    .line 518
    .line 519
    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    .line 520
    :goto_12
    :try_start_1f
    invoke-static {v9}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_5

    .line 521
    .line 522
    .line 523
    :try_start_20
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 524
    .line 525
    .line 526
    iget-object v3, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 527
    .line 528
    monitor-enter v3
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_10

    .line 529
    :try_start_21
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏哲兰()Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    if-nez v0, :cond_15

    .line 534
    .line 535
    goto :goto_13

    .line 536
    :cond_15
    const-string v0, "unexpected to get continuation here"

    .line 537
    .line 538
    invoke-static {v0}, Landroidx/compose/runtime/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_b

    .line 539
    .line 540
    .line 541
    :goto_13
    :try_start_22
    monitor-exit v3

    .line 542
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰()V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v7}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 553
    .line 554
    .line 555
    iput-object v8, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪哲兰世苏:Landroidx/collection/飘花落叶言子世兰楪哲苏;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_10

    .line 556
    .line 557
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 558
    .line 559
    .line 560
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 561
    .line 562
    return-object v0

    .line 563
    :catchall_b
    move-exception v0

    .line 564
    :try_start_23
    monitor-exit v3

    .line 565
    throw v0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_10

    .line 566
    :goto_14
    :try_start_24
    invoke-static {v9}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)V

    .line 567
    .line 568
    .line 569
    throw v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_5

    .line 570
    :goto_15
    :try_start_25
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 571
    .line 572
    .line 573
    throw v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_10

    .line 574
    :goto_16
    :try_start_26
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 575
    .line 576
    .line 577
    move-result v9

    .line 578
    const/4 v10, 0x0

    .line 579
    :goto_17
    if-ge v10, v9, :cond_17

    .line 580
    .line 581
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v11

    .line 585
    check-cast v11, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 586
    .line 587
    invoke-virtual {v1, v11, v7}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世苏兰哲楪(Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;)Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 588
    .line 589
    .line 590
    move-result-object v12

    .line 591
    if-eqz v12, :cond_16

    .line 592
    .line 593
    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    goto :goto_18

    .line 597
    :catchall_c
    move-exception v0

    .line 598
    goto/16 :goto_23

    .line 599
    .line 600
    :cond_16
    :goto_18
    invoke-virtual {v2, v11}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_c

    .line 601
    .line 602
    .line 603
    add-int/lit8 v10, v10, 0x1

    .line 604
    .line 605
    goto :goto_17

    .line 606
    :cond_17
    :try_start_27
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v7}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰()Z

    .line 610
    .line 611
    .line 612
    move-result v9

    .line 613
    if-nez v9, :cond_19

    .line 614
    .line 615
    iget-object v9, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏哲世兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 616
    .line 617
    iget v9, v9, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 618
    .line 619
    if-eqz v9, :cond_18

    .line 620
    .line 621
    goto :goto_19

    .line 622
    :cond_18
    move-object/from16 v14, p8

    .line 623
    .line 624
    goto :goto_1e

    .line 625
    :cond_19
    :goto_19
    iget-object v9, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 626
    .line 627
    monitor-enter v9
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_10

    .line 628
    :try_start_28
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世苏楪哲兰()Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v10

    .line 632
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 633
    .line 634
    .line 635
    move-result v11

    .line 636
    const/4 v12, 0x0

    .line 637
    :goto_1a
    if-ge v12, v11, :cond_1c

    .line 638
    .line 639
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v13

    .line 643
    check-cast v13, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 644
    .line 645
    invoke-virtual {v2, v13}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v14

    .line 649
    if-nez v14, :cond_1a

    .line 650
    .line 651
    move-object/from16 v14, p8

    .line 652
    .line 653
    invoke-virtual {v13, v14}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰苏世哲(Ljava/util/Set;)Z

    .line 654
    .line 655
    .line 656
    move-result v15

    .line 657
    if-eqz v15, :cond_1b

    .line 658
    .line 659
    invoke-interface {v3, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    goto :goto_1b

    .line 663
    :catchall_d
    move-exception v0

    .line 664
    goto/16 :goto_22

    .line 665
    .line 666
    :cond_1a
    move-object/from16 v14, p8

    .line 667
    .line 668
    :cond_1b
    :goto_1b
    add-int/lit8 v12, v12, 0x1

    .line 669
    .line 670
    goto :goto_1a

    .line 671
    :cond_1c
    move-object/from16 v14, p8

    .line 672
    .line 673
    iget-object v10, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏哲世兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 674
    .line 675
    iget v11, v10, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_d

    .line 676
    .line 677
    const/4 v12, 0x0

    .line 678
    const/4 v13, 0x0

    .line 679
    :goto_1c
    iget-object v15, v10, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 680
    .line 681
    if-ge v12, v11, :cond_1f

    .line 682
    .line 683
    :try_start_29
    aget-object v15, v15, v12

    .line 684
    .line 685
    check-cast v15, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 686
    .line 687
    invoke-virtual {v2, v15}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v16

    .line 691
    if-nez v16, :cond_1d

    .line 692
    .line 693
    invoke-interface {v3, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v16

    .line 697
    if-nez v16, :cond_1d

    .line 698
    .line 699
    invoke-interface {v3, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    add-int/lit8 v13, v13, 0x1

    .line 703
    .line 704
    goto :goto_1d

    .line 705
    :cond_1d
    if-lez v13, :cond_1e

    .line 706
    .line 707
    iget-object v15, v10, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 708
    .line 709
    sub-int v16, v12, v13

    .line 710
    .line 711
    aget-object v18, v15, v12

    .line 712
    .line 713
    aput-object v18, v15, v16

    .line 714
    .line 715
    :cond_1e
    :goto_1d
    add-int/lit8 v12, v12, 0x1

    .line 716
    .line 717
    goto :goto_1c

    .line 718
    :cond_1f
    sub-int v12, v11, v13

    .line 719
    .line 720
    invoke-static {v15, v12, v11, v8}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    iput v12, v10, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_d

    .line 724
    .line 725
    :try_start_2a
    monitor-exit v9

    .line 726
    :goto_1e
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 727
    .line 728
    .line 729
    move-result v9
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_10

    .line 730
    if-eqz v9, :cond_22

    .line 731
    .line 732
    :try_start_2b
    invoke-static {v4, v1}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;)V

    .line 733
    .line 734
    .line 735
    :goto_1f
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 736
    .line 737
    .line 738
    move-result v9

    .line 739
    if-nez v9, :cond_21

    .line 740
    .line 741
    invoke-virtual {v1, v4, v7}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世苏兰楪哲(Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;)Ljava/util/List;

    .line 742
    .line 743
    .line 744
    move-result-object v9

    .line 745
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 752
    .line 753
    .line 754
    move-result-object v9

    .line 755
    :goto_20
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 756
    .line 757
    .line 758
    move-result v10

    .line 759
    if-eqz v10, :cond_20

    .line 760
    .line 761
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v10

    .line 765
    invoke-virtual {v5, v10}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    goto :goto_20

    .line 769
    :cond_20
    invoke-static {v4, v1}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;)V
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_e

    .line 770
    .line 771
    .line 772
    goto :goto_1f

    .line 773
    :catchall_e
    move-exception v0

    .line 774
    goto :goto_21

    .line 775
    :cond_21
    move v5, v0

    .line 776
    move-object v2, v3

    .line 777
    move-object v4, v6

    .line 778
    move/from16 v3, v17

    .line 779
    .line 780
    const/4 v7, 0x0

    .line 781
    move-object/from16 v6, p7

    .line 782
    .line 783
    goto/16 :goto_3

    .line 784
    .line 785
    :goto_21
    :try_start_2c
    invoke-virtual {v1, v0, v8}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲楪苏兰(Ljava/lang/Throwable;Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V

    .line 786
    .line 787
    .line 788
    move-object v8, v2

    .line 789
    move-object v2, v3

    .line 790
    move-object v3, v4

    .line 791
    move-object v4, v6

    .line 792
    move-object/from16 v6, p7

    .line 793
    .line 794
    invoke-static/range {v1 .. v8}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;)V

    .line 795
    .line 796
    .line 797
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_10

    .line 798
    .line 799
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 800
    .line 801
    .line 802
    return-object v0

    .line 803
    :cond_22
    move-object/from16 v2, p3

    .line 804
    .line 805
    move-object/from16 v4, p6

    .line 806
    .line 807
    move-object/from16 v6, p7

    .line 808
    .line 809
    move v5, v0

    .line 810
    move/from16 v3, v17

    .line 811
    .line 812
    const/4 v7, 0x0

    .line 813
    goto/16 :goto_3

    .line 814
    .line 815
    :goto_22
    :try_start_2d
    monitor-exit v9

    .line 816
    throw v0
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_10

    .line 817
    :goto_23
    :try_start_2e
    invoke-virtual {v1, v0, v8}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲楪苏兰(Ljava/lang/Throwable;Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V

    .line 818
    .line 819
    .line 820
    move-object/from16 v7, p1

    .line 821
    .line 822
    move-object/from16 v8, p2

    .line 823
    .line 824
    move-object/from16 v2, p3

    .line 825
    .line 826
    move-object/from16 v3, p4

    .line 827
    .line 828
    move-object/from16 v5, p5

    .line 829
    .line 830
    move-object/from16 v4, p6

    .line 831
    .line 832
    move-object/from16 v6, p7

    .line 833
    .line 834
    invoke-static/range {v1 .. v8}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;)V

    .line 835
    .line 836
    .line 837
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_f

    .line 838
    .line 839
    :try_start_2f
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->clear()V
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_10

    .line 840
    .line 841
    .line 842
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 843
    .line 844
    .line 845
    return-object v0

    .line 846
    :catchall_f
    move-exception v0

    .line 847
    :try_start_30
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->clear()V

    .line 848
    .line 849
    .line 850
    throw v0

    .line 851
    :goto_24
    monitor-exit v8

    .line 852
    throw v0
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_10

    .line 853
    :catchall_10
    move-exception v0

    .line 854
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 855
    .line 856
    .line 857
    throw v0

    .line 858
    :catchall_11
    move-exception v0

    .line 859
    monitor-exit v3

    .line 860
    throw v0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/Set;J)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$lambda$2(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/Set;J)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 17
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 4
    .line 5
    invoke-direct {p1, p0, p3}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;-><init>(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->label:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    if-eq v2, v5, :cond_1

    .line 13
    .line 14
    if-ne v2, v4, :cond_0

    .line 15
    .line 16
    iget-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$8:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 19
    .line 20
    iget-object v6, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$7:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v6, Ljava/util/Set;

    .line 23
    .line 24
    iget-object v7, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$6:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v7, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 27
    .line 28
    iget-object v8, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$5:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v8, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 31
    .line 32
    iget-object v9, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$4:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v9, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 35
    .line 36
    iget-object v10, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$3:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v10, Ljava/util/List;

    .line 39
    .line 40
    iget-object v11, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v11, Ljava/util/List;

    .line 43
    .line 44
    iget-object v12, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v12, Ljava/util/List;

    .line 47
    .line 48
    iget-object v13, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v13, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v21, v13

    .line 56
    .line 57
    move-object v13, v2

    .line 58
    move-object/from16 v2, v21

    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v3

    .line 68
    :cond_1
    iget-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$8:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 71
    .line 72
    iget-object v6, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$7:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v6, Ljava/util/Set;

    .line 75
    .line 76
    iget-object v7, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$6:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 79
    .line 80
    iget-object v8, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$5:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v8, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 83
    .line 84
    iget-object v9, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$4:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v9, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 87
    .line 88
    iget-object v10, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$3:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v10, Ljava/util/List;

    .line 91
    .line 92
    iget-object v11, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v11, Ljava/util/List;

    .line 95
    .line 96
    iget-object v12, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v12, Ljava/util/List;

    .line 99
    .line 100
    iget-object v13, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v13, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object v14, v9

    .line 108
    move-object v9, v2

    .line 109
    move-object v2, v13

    .line 110
    move-object v13, v10

    .line 111
    move-object v10, v12

    .line 112
    move-object v12, v14

    .line 113
    :goto_0
    move-object v15, v6

    .line 114
    move-object v14, v8

    .line 115
    move-object v8, v7

    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 124
    .line 125
    new-instance v6, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v7, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    new-instance v8, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    sget-object v9, Landroidx/collection/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 141
    .line 142
    new-instance v9, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 143
    .line 144
    invoke-direct {v9}, Landroidx/collection/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 145
    .line 146
    .line 147
    new-instance v10, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 148
    .line 149
    invoke-direct {v10}, Landroidx/collection/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v11, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 153
    .line 154
    invoke-direct {v11}, Landroidx/collection/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 155
    .line 156
    .line 157
    new-instance v12, Landroidx/compose/runtime/collection/飘花落叶言子楪世哲兰苏;

    .line 158
    .line 159
    invoke-direct {v12, v11}, Landroidx/compose/runtime/collection/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/collection/飘花落叶言子苏世楪哲兰;)V

    .line 160
    .line 161
    .line 162
    new-instance v13, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 163
    .line 164
    invoke-direct {v13}, Landroidx/collection/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 165
    .line 166
    .line 167
    move-object/from16 v21, v12

    .line 168
    .line 169
    move-object v12, v6

    .line 170
    move-object/from16 v6, v21

    .line 171
    .line 172
    move-object/from16 v21, v11

    .line 173
    .line 174
    move-object v11, v7

    .line 175
    move-object/from16 v7, v21

    .line 176
    .line 177
    move-object/from16 v21, v10

    .line 178
    .line 179
    move-object v10, v8

    .line 180
    move-object/from16 v8, v21

    .line 181
    .line 182
    :goto_1
    iget-object v14, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 183
    .line 184
    iget-object v15, v14, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 185
    .line 186
    monitor-enter v15

    .line 187
    :try_start_0
    iget-boolean v3, v14, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪兰世苏哲:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 188
    .line 189
    monitor-exit v15

    .line 190
    if-eqz v3, :cond_5

    .line 191
    .line 192
    iget-object v3, v14, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪兰哲苏世:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 193
    .line 194
    invoke-virtual {v3}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子世兰哲楪苏()Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    iget-object v3, v3, Lkotlin/collections/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v3, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 201
    .line 202
    invoke-static {v3}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lkotlin/sequences/飘花落叶言子楪苏哲兰世;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    :cond_3
    invoke-virtual {v3}, Lkotlin/sequences/飘花落叶言子楪苏哲兰世;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v14

    .line 210
    if-eqz v14, :cond_4

    .line 211
    .line 212
    invoke-virtual {v3}, Lkotlin/sequences/飘花落叶言子楪苏哲兰世;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v14

    .line 216
    check-cast v14, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 217
    .line 218
    invoke-interface {v14}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世兰哲苏()Z

    .line 219
    .line 220
    .line 221
    move-result v14

    .line 222
    if-eqz v14, :cond_3

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_4
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 226
    .line 227
    return-object v0

    .line 228
    :cond_5
    :goto_2
    iget-object v3, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 229
    .line 230
    iput-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 231
    .line 232
    iput-object v12, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 233
    .line 234
    iput-object v11, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object v10, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$3:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v9, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$4:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v8, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$5:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v7, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$6:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v6, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$7:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v13, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$8:Ljava/lang/Object;

    .line 247
    .line 248
    iput v5, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->label:I

    .line 249
    .line 250
    invoke-virtual {v3}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪兰苏哲()Z

    .line 251
    .line 252
    .line 253
    move-result v14

    .line 254
    if-nez v14, :cond_9

    .line 255
    .line 256
    new-instance v14, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 257
    .line 258
    invoke-static {v0}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 259
    .line 260
    .line 261
    move-result-object v15

    .line 262
    invoke-direct {v14, v5, v15}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v14}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲()V

    .line 266
    .line 267
    .line 268
    iget-object v15, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 269
    .line 270
    monitor-enter v15

    .line 271
    :try_start_1
    invoke-virtual {v3}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪兰苏哲()Z

    .line 272
    .line 273
    .line 274
    move-result v16

    .line 275
    if-eqz v16, :cond_6

    .line 276
    .line 277
    move-object v3, v14

    .line 278
    goto :goto_3

    .line 279
    :cond_6
    iput-object v14, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 280
    .line 281
    const/4 v3, 0x0

    .line 282
    :goto_3
    monitor-exit v15

    .line 283
    if-eqz v3, :cond_7

    .line 284
    .line 285
    sget-object v15, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 286
    .line 287
    invoke-static {v15}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v15

    .line 291
    invoke-virtual {v3, v15}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->resumeWith(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_7
    invoke-virtual {v14}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    sget-object v14, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 299
    .line 300
    if-ne v3, v14, :cond_8

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_8
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :catchall_0
    move-exception v0

    .line 307
    monitor-exit v15

    .line 308
    throw v0

    .line 309
    :cond_9
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 310
    .line 311
    :goto_4
    if-ne v3, v1, :cond_a

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_a
    move-object v14, v12

    .line 315
    move-object v12, v9

    .line 316
    move-object v9, v13

    .line 317
    move-object v13, v10

    .line 318
    move-object v10, v14

    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :goto_5
    iget-object v3, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 322
    .line 323
    sget-object v6, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪哲苏兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 324
    .line 325
    invoke-virtual {v3}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世哲楪兰苏()Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-eqz v3, :cond_f

    .line 330
    .line 331
    iget-object v7, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 332
    .line 333
    new-instance v6, Landroidx/compose/runtime/飘花落叶言子苏兰哲楪世;

    .line 334
    .line 335
    invoke-direct/range {v6 .. v15}, Landroidx/compose/runtime/飘花落叶言子苏兰哲楪世;-><init>(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Landroidx/collection/飘花落叶言子世兰楪哲苏;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/List;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/List;Landroidx/collection/飘花落叶言子世兰楪哲苏;Ljava/util/Set;)V

    .line 336
    .line 337
    .line 338
    iput-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v10, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 341
    .line 342
    iput-object v11, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 343
    .line 344
    iput-object v13, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$3:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v12, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$4:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v14, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$5:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v8, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$6:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v15, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$7:Ljava/lang/Object;

    .line 353
    .line 354
    iput-object v9, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$8:Ljava/lang/Object;

    .line 355
    .line 356
    iput v4, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->label:I

    .line 357
    .line 358
    invoke-interface {v2, v6, v0}, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    if-ne v3, v1, :cond_b

    .line 363
    .line 364
    :goto_6
    return-object v1

    .line 365
    :cond_b
    move-object v6, v13

    .line 366
    move-object v13, v9

    .line 367
    move-object v9, v12

    .line 368
    move-object v12, v10

    .line 369
    move-object v10, v6

    .line 370
    move-object v7, v8

    .line 371
    move-object v8, v14

    .line 372
    move-object v6, v15

    .line 373
    :goto_7
    iget-object v3, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 374
    .line 375
    iget-object v14, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 376
    .line 377
    monitor-enter v14

    .line 378
    :try_start_2
    iget-object v15, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏兰哲世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 379
    .line 380
    invoke-virtual {v15}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏哲兰世()Z

    .line 381
    .line 382
    .line 383
    move-result v15

    .line 384
    if-eqz v15, :cond_d

    .line 385
    .line 386
    iget-object v15, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏兰哲世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 387
    .line 388
    invoke-static {v15}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Landroidx/collection/飘花落叶言子世兰楪苏哲;)Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 389
    .line 390
    .line 391
    move-result-object v15

    .line 392
    iget-object v5, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏兰哲世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 393
    .line 394
    invoke-virtual {v5}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 395
    .line 396
    .line 397
    iget-object v5, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪哲世苏兰:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 398
    .line 399
    iget-object v4, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v4, Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 402
    .line 403
    invoke-virtual {v4}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 404
    .line 405
    .line 406
    iget-object v4, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v4, Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 409
    .line 410
    invoke-virtual {v4}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 411
    .line 412
    .line 413
    iget-object v4, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪哲苏世兰:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 414
    .line 415
    invoke-virtual {v4}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 416
    .line 417
    .line 418
    new-instance v4, Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 419
    .line 420
    iget v5, v15, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 421
    .line 422
    invoke-direct {v4, v5}, Landroidx/collection/飘花落叶言子世哲苏楪兰;-><init>(I)V

    .line 423
    .line 424
    .line 425
    iget-object v5, v15, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 426
    .line 427
    iget v15, v15, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 428
    .line 429
    move-object/from16 v17, v1

    .line 430
    .line 431
    const/4 v1, 0x0

    .line 432
    :goto_8
    if-ge v1, v15, :cond_c

    .line 433
    .line 434
    aget-object v18, v5, v1

    .line 435
    .line 436
    move/from16 v19, v1

    .line 437
    .line 438
    move-object/from16 v1, v18

    .line 439
    .line 440
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子世兰苏哲楪;

    .line 441
    .line 442
    move-object/from16 v18, v2

    .line 443
    .line 444
    iget-object v2, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪哲世兰苏:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 445
    .line 446
    invoke-virtual {v2, v1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    move-object/from16 v20, v5

    .line 451
    .line 452
    new-instance v5, Lkotlin/Pair;

    .line 453
    .line 454
    invoke-direct {v5, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4, v5}, Landroidx/collection/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    add-int/lit8 v1, v19, 0x1

    .line 461
    .line 462
    move-object/from16 v2, v18

    .line 463
    .line 464
    move-object/from16 v5, v20

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :catchall_1
    move-exception v0

    .line 468
    goto :goto_b

    .line 469
    :cond_c
    move-object/from16 v18, v2

    .line 470
    .line 471
    iget-object v1, v3, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪哲世兰苏:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 472
    .line 473
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 474
    .line 475
    .line 476
    goto :goto_9

    .line 477
    :cond_d
    move-object/from16 v17, v1

    .line 478
    .line 479
    move-object/from16 v18, v2

    .line 480
    .line 481
    sget-object v4, Landroidx/collection/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 482
    .line 483
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 484
    .line 485
    .line 486
    :goto_9
    monitor-exit v14

    .line 487
    iget-object v1, v4, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 488
    .line 489
    iget v2, v4, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 490
    .line 491
    const/4 v3, 0x0

    .line 492
    :goto_a
    if-ge v3, v2, :cond_e

    .line 493
    .line 494
    aget-object v4, v1, v3

    .line 495
    .line 496
    check-cast v4, Lkotlin/Pair;

    .line 497
    .line 498
    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    check-cast v5, Landroidx/compose/runtime/飘花落叶言子世兰苏哲楪;

    .line 503
    .line 504
    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    check-cast v4, Landroidx/compose/runtime/飘花落叶言子世兰苏楪哲;

    .line 509
    .line 510
    add-int/lit8 v3, v3, 0x1

    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_e
    iget-object v1, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 514
    .line 515
    iget-object v1, v1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/飘花落叶言子哲楪世苏兰;

    .line 516
    .line 517
    iget-object v2, v1, Landroidx/compose/runtime/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v2, Landroidx/compose/runtime/internal/AtomicInt;

    .line 520
    .line 521
    const/4 v3, 0x0

    .line 522
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 523
    .line 524
    .line 525
    iget-object v1, v1, Landroidx/compose/runtime/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 528
    .line 529
    new-instance v2, Landroidx/compose/foundation/text/飘花落叶言子苏世楪兰哲;

    .line 530
    .line 531
    const/16 v3, 0xa

    .line 532
    .line 533
    invoke-direct {v2, v3}, Landroidx/compose/foundation/text/飘花落叶言子苏世楪兰哲;-><init>(I)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 537
    .line 538
    .line 539
    move-object/from16 v1, v17

    .line 540
    .line 541
    move-object/from16 v2, v18

    .line 542
    .line 543
    const/4 v3, 0x0

    .line 544
    const/4 v4, 0x2

    .line 545
    const/4 v5, 0x1

    .line 546
    goto/16 :goto_1

    .line 547
    .line 548
    :goto_b
    monitor-exit v14

    .line 549
    throw v0

    .line 550
    :cond_f
    move-object v3, v13

    .line 551
    move-object v13, v9

    .line 552
    move-object v9, v12

    .line 553
    move-object v12, v10

    .line 554
    move-object v10, v3

    .line 555
    move-object v7, v8

    .line 556
    move-object v8, v14

    .line 557
    move-object v6, v15

    .line 558
    const/4 v3, 0x0

    .line 559
    goto/16 :goto_1

    .line 560
    .line 561
    :catchall_2
    move-exception v0

    .line 562
    monitor-exit v15

    .line 563
    throw v0
.end method
