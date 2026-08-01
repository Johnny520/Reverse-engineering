.class final Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.utils.io.jvm.javaio.WritingKt"
    f = "Writing.kt"
    l = {
        0x16
    }
    m = "copyTo"
.end annotation


# instance fields
.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->result:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->label:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->label:I

    .line 13
    .line 14
    and-int v3, v1, v2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    iput v1, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :goto_0
    iget-object v1, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v3, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->label:I

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v7, :cond_1

    .line 41
    .line 42
    iget-wide v8, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->J$0:J

    .line 43
    .line 44
    iget-object v3, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Ljava/io/OutputStream;

    .line 47
    .line 48
    iget-object v10, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v10, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v4

    .line 62
    :cond_2
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v3, v4

    .line 66
    move-object v10, v3

    .line 67
    move-wide v8, v5

    .line 68
    :cond_3
    invoke-interface {v10}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_9

    .line 73
    .line 74
    invoke-interface {v10}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    iput-object v10, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v3, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    iput-wide v8, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->J$0:J

    .line 89
    .line 90
    iput v7, v0, Lio/ktor/utils/io/jvm/javaio/WritingKt$copyTo$1;->label:I

    .line 91
    .line 92
    invoke-interface {v10, v7, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-ne v1, v2, :cond_4

    .line 97
    .line 98
    return-object v2

    .line 99
    :cond_4
    :goto_1
    invoke-interface {v10}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-interface {v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-wide v11, v1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 108
    .line 109
    add-long/2addr v8, v11

    .line 110
    invoke-interface {v10}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-interface {v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-wide v11, v1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-wide v15, v11

    .line 124
    iget-wide v11, v1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 125
    .line 126
    const-wide/16 v13, 0x0

    .line 127
    .line 128
    invoke-static/range {v11 .. v16}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(JJJ)V

    .line 129
    .line 130
    .line 131
    move-wide v11, v15

    .line 132
    :goto_2
    cmp-long v13, v11, v5

    .line 133
    .line 134
    if-lez v13, :cond_3

    .line 135
    .line 136
    invoke-virtual {v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏()Z

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    if-nez v13, :cond_8

    .line 141
    .line 142
    iget-object v13, v1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 143
    .line 144
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v14, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 148
    .line 149
    iget v15, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 150
    .line 151
    move-object/from16 p0, v4

    .line 152
    .line 153
    iget v4, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 154
    .line 155
    sub-int/2addr v4, v15

    .line 156
    int-to-long v5, v4

    .line 157
    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 158
    .line 159
    .line 160
    move-result-wide v4

    .line 161
    long-to-int v4, v4

    .line 162
    invoke-virtual {v3, v14, v15, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 163
    .line 164
    .line 165
    int-to-long v5, v4

    .line 166
    sub-long/2addr v11, v5

    .line 167
    if-eqz v4, :cond_7

    .line 168
    .line 169
    if-ltz v4, :cond_6

    .line 170
    .line 171
    invoke-virtual {v13}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    if-gt v4, v13, :cond_5

    .line 176
    .line 177
    invoke-virtual {v1, v5, v6}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->skip(J)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    const-string v0, "Returned too many bytes"

    .line 182
    .line 183
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-object p0

    .line 187
    :cond_6
    const-string v0, "Returned negative read bytes count"

    .line 188
    .line 189
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    return-object p0

    .line 193
    :cond_7
    :goto_3
    const-wide/16 v5, 0x0

    .line 194
    .line 195
    move-object/from16 v4, p0

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_8
    move-object/from16 p0, v4

    .line 199
    .line 200
    const-string v0, "Buffer is empty"

    .line 201
    .line 202
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    return-object p0

    .line 206
    :cond_9
    new-instance v0, Ljava/lang/Long;

    .line 207
    .line 208
    invoke-direct {v0, v8, v9}, Ljava/lang/Long;-><init>(J)V

    .line 209
    .line 210
    .line 211
    return-object v0
.end method
