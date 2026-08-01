.class final Lkotlin/collections/SlidingWindowKt$windowedIterator$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
        "",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "kotlin.collections.SlidingWindowKt$windowedIterator$1"
    f = "SlidingWindow.kt"
    l = {
        0x22,
        0x28,
        0x31,
        0x37,
        0x3a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $iterator:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $partialWindows:Z

.field final synthetic $reuseBuffer:Z

.field final synthetic $size:I

.field final synthetic $step:I

.field I$0:I

.field I$1:I

.field I$2:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(IILjava/util/Iterator;ZZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;ZZ",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/collections/SlidingWindowKt$windowedIterator$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$size:I

    .line 2
    .line 3
    iput p2, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$step:I

    .line 4
    .line 5
    iput-object p3, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$iterator:Ljava/util/Iterator;

    .line 6
    .line 7
    iput-boolean p4, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$reuseBuffer:Z

    .line 8
    .line 9
    iput-boolean p5, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$partialWindows:Z

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;

    .line 2
    .line 3
    iget v1, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$size:I

    .line 4
    .line 5
    iget v2, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$step:I

    .line 6
    .line 7
    iget-object v3, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$iterator:Ljava/util/Iterator;

    .line 8
    .line 9
    iget-boolean v4, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$reuseBuffer:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$partialWindows:Z

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;-><init>(IILjava/util/Iterator;ZZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$0:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->invoke(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    .line 6
    .line 7
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->label:I

    .line 10
    .line 11
    const/4 v4, 0x5

    .line 12
    const/4 v5, 0x4

    .line 13
    const/4 v6, 0x3

    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    if-eqz v3, :cond_5

    .line 18
    .line 19
    if-eq v3, v8, :cond_4

    .line 20
    .line 21
    if-eq v3, v7, :cond_3

    .line 22
    .line 23
    if-eq v3, v6, :cond_2

    .line 24
    .line 25
    if-eq v3, v5, :cond_1

    .line 26
    .line 27
    if-ne v3, v4, :cond_0

    .line 28
    .line 29
    iget-object v0, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lkotlin/collections/飘花落叶言子世楪哲兰苏;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v9

    .line 40
    :cond_1
    iget v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$1:I

    .line 41
    .line 42
    iget v6, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$0:I

    .line 43
    .line 44
    iget-object v7, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, Lkotlin/collections/飘花落叶言子世楪哲兰苏;

    .line 47
    .line 48
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_c

    .line 52
    .line 53
    :cond_2
    iget v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$1:I

    .line 54
    .line 55
    iget v7, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$0:I

    .line 56
    .line 57
    iget-object v10, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v10, Ljava/util/Iterator;

    .line 60
    .line 61
    iget-object v11, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v11, Lkotlin/collections/飘花落叶言子世楪哲兰苏;

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :cond_3
    iget-object v0, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljava/util/ArrayList;

    .line 73
    .line 74
    :goto_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_e

    .line 78
    .line 79
    :cond_4
    iget v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$1:I

    .line 80
    .line 81
    iget v4, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$0:I

    .line 82
    .line 83
    iget-object v5, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$2:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Ljava/util/Iterator;

    .line 86
    .line 87
    iget-object v6, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v6, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move v11, v3

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$size:I

    .line 100
    .line 101
    const/16 v10, 0x400

    .line 102
    .line 103
    if-le v3, v10, :cond_6

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    move v10, v3

    .line 107
    :goto_1
    iget v11, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$step:I

    .line 108
    .line 109
    sub-int/2addr v11, v3

    .line 110
    const/4 v3, 0x0

    .line 111
    if-ltz v11, :cond_d

    .line 112
    .line 113
    new-instance v4, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v4, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    iget-object v5, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$iterator:Ljava/util/Iterator;

    .line 119
    .line 120
    move-object v6, v4

    .line 121
    move v4, v10

    .line 122
    :cond_7
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_b

    .line 127
    .line 128
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    if-lez v3, :cond_8

    .line 133
    .line 134
    add-int/lit8 v3, v3, -0x1

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_8
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    iget v12, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$size:I

    .line 145
    .line 146
    if-ne v10, v12, :cond_7

    .line 147
    .line 148
    iput-object v1, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v6, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v5, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$2:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$3:Ljava/lang/Object;

    .line 155
    .line 156
    iput v4, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$0:I

    .line 157
    .line 158
    iput v11, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$1:I

    .line 159
    .line 160
    iput v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$2:I

    .line 161
    .line 162
    iput v8, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->label:I

    .line 163
    .line 164
    invoke-virtual {v1, v6, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    if-ne v3, v2, :cond_9

    .line 169
    .line 170
    goto/16 :goto_d

    .line 171
    .line 172
    :cond_9
    :goto_3
    iget-boolean v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$reuseBuffer:Z

    .line 173
    .line 174
    if-eqz v3, :cond_a

    .line 175
    .line 176
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    .line 181
    .line 182
    iget v6, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$size:I

    .line 183
    .line 184
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    move-object v6, v3

    .line 188
    :goto_4
    move v3, v11

    .line 189
    goto :goto_2

    .line 190
    :cond_b
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_19

    .line 195
    .line 196
    iget-boolean v5, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$partialWindows:Z

    .line 197
    .line 198
    if-nez v5, :cond_c

    .line 199
    .line 200
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    iget v8, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$size:I

    .line 205
    .line 206
    if-ne v5, v8, :cond_19

    .line 207
    .line 208
    :cond_c
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$0:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$2:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$3:Ljava/lang/Object;

    .line 215
    .line 216
    iput v4, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$0:I

    .line 217
    .line 218
    iput v11, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$1:I

    .line 219
    .line 220
    iput v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$2:I

    .line 221
    .line 222
    iput v7, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->label:I

    .line 223
    .line 224
    invoke-virtual {v1, v6, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-ne v0, v2, :cond_19

    .line 229
    .line 230
    goto/16 :goto_d

    .line 231
    .line 232
    :cond_d
    new-instance v7, Lkotlin/collections/飘花落叶言子世楪哲兰苏;

    .line 233
    .line 234
    new-array v12, v10, [Ljava/lang/Object;

    .line 235
    .line 236
    invoke-direct {v7, v3, v12}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;-><init>(I[Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget-object v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$iterator:Ljava/util/Iterator;

    .line 240
    .line 241
    move/from16 v17, v10

    .line 242
    .line 243
    move-object v10, v3

    .line 244
    move v3, v11

    .line 245
    move-object v11, v7

    .line 246
    move/from16 v7, v17

    .line 247
    .line 248
    :cond_e
    :goto_5
    iget v12, v11, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 249
    .line 250
    iget-object v13, v11, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 251
    .line 252
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v14

    .line 256
    if-eqz v14, :cond_15

    .line 257
    .line 258
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    invoke-virtual {v11}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 263
    .line 264
    .line 265
    move-result v15

    .line 266
    if-eq v15, v12, :cond_14

    .line 267
    .line 268
    iget v15, v11, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 269
    .line 270
    invoke-virtual {v11}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 271
    .line 272
    .line 273
    move-result v16

    .line 274
    add-int v16, v16, v15

    .line 275
    .line 276
    rem-int v16, v16, v12

    .line 277
    .line 278
    aput-object v14, v13, v16

    .line 279
    .line 280
    invoke-virtual {v11}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 281
    .line 282
    .line 283
    move-result v14

    .line 284
    add-int/2addr v14, v8

    .line 285
    iput v14, v11, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 286
    .line 287
    invoke-virtual {v11}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 288
    .line 289
    .line 290
    move-result v14

    .line 291
    if-ne v14, v12, :cond_e

    .line 292
    .line 293
    invoke-virtual {v11}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 294
    .line 295
    .line 296
    move-result v14

    .line 297
    iget v15, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$size:I

    .line 298
    .line 299
    if-ge v14, v15, :cond_11

    .line 300
    .line 301
    shr-int/lit8 v14, v12, 0x1

    .line 302
    .line 303
    add-int/2addr v12, v14

    .line 304
    add-int/2addr v12, v8

    .line 305
    if-le v12, v15, :cond_f

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_f
    move v15, v12

    .line 309
    :goto_6
    iget v12, v11, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 310
    .line 311
    if-nez v12, :cond_10

    .line 312
    .line 313
    invoke-static {v13, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    goto :goto_7

    .line 318
    :cond_10
    new-array v12, v15, [Ljava/lang/Object;

    .line 319
    .line 320
    invoke-virtual {v11, v12}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    :goto_7
    new-instance v13, Lkotlin/collections/飘花落叶言子世楪哲兰苏;

    .line 325
    .line 326
    invoke-virtual {v11}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    invoke-direct {v13, v11, v12}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;-><init>(I[Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    move-object v11, v13

    .line 334
    goto :goto_5

    .line 335
    :cond_11
    iget-boolean v12, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$reuseBuffer:Z

    .line 336
    .line 337
    if-eqz v12, :cond_12

    .line 338
    .line 339
    move-object v12, v11

    .line 340
    goto :goto_8

    .line 341
    :cond_12
    new-instance v12, Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-direct {v12, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 344
    .line 345
    .line 346
    :goto_8
    iput-object v1, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$0:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v11, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v10, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$2:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$3:Ljava/lang/Object;

    .line 353
    .line 354
    iput v7, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$0:I

    .line 355
    .line 356
    iput v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$1:I

    .line 357
    .line 358
    iput v6, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->label:I

    .line 359
    .line 360
    invoke-virtual {v1, v12, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    if-ne v12, v2, :cond_13

    .line 365
    .line 366
    goto :goto_d

    .line 367
    :cond_13
    :goto_9
    iget v12, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$step:I

    .line 368
    .line 369
    invoke-virtual {v11, v12}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 370
    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_14
    const-string v0, "ring buffer is full"

    .line 374
    .line 375
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    return-object v9

    .line 379
    :cond_15
    iget-boolean v6, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$partialWindows:Z

    .line 380
    .line 381
    if-eqz v6, :cond_19

    .line 382
    .line 383
    move v6, v7

    .line 384
    move-object v7, v11

    .line 385
    :goto_a
    invoke-virtual {v7}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 386
    .line 387
    .line 388
    move-result v8

    .line 389
    iget v10, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$step:I

    .line 390
    .line 391
    if-le v8, v10, :cond_18

    .line 392
    .line 393
    iget-boolean v8, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$reuseBuffer:Z

    .line 394
    .line 395
    if-eqz v8, :cond_16

    .line 396
    .line 397
    move-object v8, v7

    .line 398
    goto :goto_b

    .line 399
    :cond_16
    new-instance v8, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 402
    .line 403
    .line 404
    :goto_b
    iput-object v1, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$0:Ljava/lang/Object;

    .line 405
    .line 406
    iput-object v7, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 407
    .line 408
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$2:Ljava/lang/Object;

    .line 409
    .line 410
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$3:Ljava/lang/Object;

    .line 411
    .line 412
    iput v6, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$0:I

    .line 413
    .line 414
    iput v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$1:I

    .line 415
    .line 416
    iput v5, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->label:I

    .line 417
    .line 418
    invoke-virtual {v1, v8, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    if-ne v8, v2, :cond_17

    .line 423
    .line 424
    goto :goto_d

    .line 425
    :cond_17
    :goto_c
    iget v8, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->$step:I

    .line 426
    .line 427
    invoke-virtual {v7, v8}, Lkotlin/collections/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 428
    .line 429
    .line 430
    goto :goto_a

    .line 431
    :cond_18
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-nez v5, :cond_19

    .line 436
    .line 437
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$0:Ljava/lang/Object;

    .line 438
    .line 439
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$1:Ljava/lang/Object;

    .line 440
    .line 441
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$2:Ljava/lang/Object;

    .line 442
    .line 443
    iput-object v9, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->L$3:Ljava/lang/Object;

    .line 444
    .line 445
    iput v6, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$0:I

    .line 446
    .line 447
    iput v3, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->I$1:I

    .line 448
    .line 449
    iput v4, v0, Lkotlin/collections/SlidingWindowKt$windowedIterator$1;->label:I

    .line 450
    .line 451
    invoke-virtual {v1, v7, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    if-ne v0, v2, :cond_19

    .line 456
    .line 457
    :goto_d
    return-object v2

    .line 458
    :cond_19
    :goto_e
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 459
    .line 460
    return-object v0
.end method
