.class public abstract Lio/ktor/http/cio/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const-string v1, "\r\n"

    .line 4
    .line 5
    sget-object v2, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-static {v1, v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    array-length v3, v1

    .line 13
    invoke-direct {v0, v1, v2, v3}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;-><init>([BII)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lio/ktor/http/cio/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    new-array v0, v0, [B

    .line 20
    .line 21
    fill-array-data v0, :array_0

    .line 22
    .line 23
    .line 24
    new-instance v1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    invoke-direct {v1, v0}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;-><init>([B)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lio/ktor/http/cio/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 55
    .line 56
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-boolean v4, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 60
    .line 61
    new-instance v2, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$2;

    .line 62
    .line 63
    invoke-direct {v2, p1, p2, v3}, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$2;-><init>(Ljava/nio/ByteBuffer;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 64
    .line 65
    .line 66
    iput-object p2, v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput v4, v0, Lio/ktor/http/cio/MultipartKt$trySkipDelimiterSuspend$1;->label:I

    .line 69
    .line 70
    new-instance p1, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;

    .line 71
    .line 72
    invoke-direct {p1, p0}, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2, p1, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, v1, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 83
    .line 84
    :goto_1
    if-ne p0, v1, :cond_4

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_4
    move-object p0, p2

    .line 88
    :goto_2
    iget-boolean p0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 89
    .line 90
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    move-object p1, p0

    .line 39
    check-cast p1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    iput v3, v0, Lio/ktor/http/cio/MultipartKt$skipIfFoundReadCount$1;->label:I

    .line 58
    .line 59
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    if-ne p2, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    iget-object p0, p1, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 75
    .line 76
    array-length p0, p0

    .line 77
    int-to-long p0, p0

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    const-wide/16 p0, 0x0

    .line 80
    .line 81
    :goto_2
    new-instance p2, Ljava/lang/Long;

    .line 82
    .line 83
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 84
    .line 85
    .line 86
    return-object p2
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;Ljava/nio/ByteBuffer;)I
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(II)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/4 v3, -0x1

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    move v1, v0

    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    :goto_0
    if-ge v8, v7, :cond_3

    .line 34
    .line 35
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-ne v9, v6, :cond_2

    .line 40
    .line 41
    move v9, v1

    .line 42
    :goto_1
    if-ge v9, v5, :cond_1

    .line 43
    .line 44
    add-int v10, v8, v9

    .line 45
    .line 46
    if-eq v10, v7, :cond_1

    .line 47
    .line 48
    invoke-virtual {v2, v10}, Ljava/nio/ByteBuffer;->get(I)B

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    add-int v11, v4, v9

    .line 53
    .line 54
    invoke-virtual {p1, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-ne v10, v11, :cond_2

    .line 59
    .line 60
    add-int/lit8 v9, v9, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    sub-int/2addr v8, v1

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move v8, v3

    .line 73
    :goto_2
    if-eqz v8, :cond_4

    .line 74
    .line 75
    :goto_3
    move v1, v3

    .line 76
    goto :goto_6

    .line 77
    :cond_4
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    sub-int/2addr v1, v8

    .line 82
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    sub-int/2addr v2, v1

    .line 95
    if-lez v2, :cond_8

    .line 96
    .line 97
    add-int/2addr v8, v1

    .line 98
    invoke-virtual {p0, v8, v2}, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲(II)Ljava/nio/ByteBuffer;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-nez v2, :cond_5

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_5
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    sub-int/2addr v5, v1

    .line 114
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-gtz v4, :cond_6

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    add-int/2addr v6, v1

    .line 130
    move v1, v0

    .line 131
    :goto_4
    if-ge v1, v4, :cond_8

    .line 132
    .line 133
    add-int v7, v5, v1

    .line 134
    .line 135
    invoke-virtual {v2, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    add-int v8, v6, v1

    .line 140
    .line 141
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eq v7, v8, :cond_7

    .line 146
    .line 147
    :goto_5
    goto :goto_3

    .line 148
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_8
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    :goto_6
    if-eq v1, v3, :cond_a

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-ge v1, v0, :cond_9

    .line 162
    .line 163
    return v1

    .line 164
    :cond_9
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iget-object p0, p0, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 169
    .line 170
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    int-to-long v0, v0

    .line 175
    invoke-static {p0, v0, v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)J

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    return p0

    .line 183
    :cond_a
    const-string p0, "Failed to skip delimiter: actual bytes differ from delimiter bytes"

    .line 184
    .line 185
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return v0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 57
    .line 58
    invoke-direct {p1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 59
    .line 60
    .line 61
    :try_start_1
    iput-object p1, v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput v3, v0, Lio/ktor/http/cio/MultipartKt$parsePartHeadersImpl$1;->label:I

    .line 64
    .line 65
    new-instance v2, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;

    .line 66
    .line 67
    invoke-direct {v2}, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, p1, v2, v0}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    if-ne p0, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object v4, p1

    .line 78
    move-object p1, p0

    .line 79
    move-object p0, v4

    .line 80
    :goto_1
    :try_start_2
    check-cast p1, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_4
    new-instance p1, Ljava/io/EOFException;

    .line 86
    .line 87
    const-string v0, "Failed to parse multipart headers: unexpected end of stream"

    .line 88
    .line 89
    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    :goto_2
    move-object v4, p1

    .line 94
    move-object p1, p0

    .line 95
    move-object p0, v4

    .line 96
    goto :goto_3

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    goto :goto_2

    .line 99
    :goto_3
    invoke-virtual {p0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public static final 飘花落叶言子楪世苏哲兰(L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;Lio/ktor/utils/io/飘花落叶言子楪兰苏哲世;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    instance-of v1, v0, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;

    .line 11
    .line 12
    iget v3, v1, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v1, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->label:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v7, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v1, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->label:I

    .line 36
    .line 37
    const/4 v8, 0x4

    .line 38
    const/4 v3, 0x3

    .line 39
    const/4 v4, 0x2

    .line 40
    const/4 v5, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eqz v1, :cond_5

    .line 43
    .line 44
    if-eq v1, v5, :cond_4

    .line 45
    .line 46
    if-eq v1, v4, :cond_3

    .line 47
    .line 48
    if-eq v1, v3, :cond_2

    .line 49
    .line 50
    if-ne v1, v8, :cond_1

    .line 51
    .line 52
    iget-wide v1, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->J$0:J

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_c

    .line 58
    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v9

    .line 65
    :cond_2
    iget-wide v1, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->J$0:J

    .line 66
    .line 67
    iget-object v3, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_9

    .line 75
    .line 76
    :cond_3
    iget-object v1, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 79
    .line 80
    iget-object v2, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 83
    .line 84
    iget-object v4, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v4, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 87
    .line 88
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v10, v4

    .line 92
    goto/16 :goto_8

    .line 93
    .line 94
    :cond_4
    iget-object v1, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 97
    .line 98
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "Content-Length"

    .line 106
    .line 107
    move-object/from16 v1, p3

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-static {v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    new-instance v10, Ljava/lang/Long;

    .line 120
    .line 121
    invoke-direct {v10, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    move-object v10, v9

    .line 126
    :goto_2
    if-nez v10, :cond_8

    .line 127
    .line 128
    iput-object v2, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    iput v5, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->label:I

    .line 131
    .line 132
    const/4 v5, 0x1

    .line 133
    move-object/from16 v1, p0

    .line 134
    .line 135
    move-object/from16 v0, p1

    .line 136
    .line 137
    move-wide/from16 v3, p4

    .line 138
    .line 139
    invoke-static/range {v0 .. v6}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;JZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-ne v0, v7, :cond_7

    .line 144
    .line 145
    goto/16 :goto_b

    .line 146
    .line 147
    :cond_7
    move-object v1, v2

    .line 148
    :goto_3
    check-cast v0, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    move-wide/from16 v20, v2

    .line 155
    .line 156
    move-object v3, v1

    .line 157
    move-wide/from16 v1, v20

    .line 158
    .line 159
    goto/16 :goto_a

    .line 160
    .line 161
    :cond_8
    move-object/from16 v5, p1

    .line 162
    .line 163
    move-wide/from16 v0, p4

    .line 164
    .line 165
    const-wide/16 v11, 0x0

    .line 166
    .line 167
    cmp-long v13, v11, v0

    .line 168
    .line 169
    if-ltz v13, :cond_9

    .line 170
    .line 171
    move-wide v13, v0

    .line 172
    goto :goto_7

    .line 173
    :cond_9
    const-wide/16 v13, 0x1

    .line 174
    .line 175
    rem-long v15, v0, v13

    .line 176
    .line 177
    cmp-long v17, v15, v11

    .line 178
    .line 179
    if-ltz v17, :cond_a

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_a
    add-long/2addr v15, v13

    .line 183
    :goto_4
    rem-long v17, v11, v13

    .line 184
    .line 185
    cmp-long v19, v17, v11

    .line 186
    .line 187
    if-ltz v19, :cond_b

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_b
    add-long v17, v17, v13

    .line 191
    .line 192
    :goto_5
    sub-long v15, v15, v17

    .line 193
    .line 194
    rem-long/2addr v15, v13

    .line 195
    cmp-long v17, v15, v11

    .line 196
    .line 197
    if-ltz v17, :cond_c

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_c
    add-long/2addr v15, v13

    .line 201
    :goto_6
    sub-long v13, v0, v15

    .line 202
    .line 203
    :goto_7
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v15

    .line 207
    cmp-long v11, v11, v15

    .line 208
    .line 209
    if-gtz v11, :cond_10

    .line 210
    .line 211
    cmp-long v11, v15, v13

    .line 212
    .line 213
    if-gtz v11, :cond_10

    .line 214
    .line 215
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    move-object/from16 v10, p0

    .line 220
    .line 221
    iput-object v10, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$0:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v5, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$1:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v2, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$2:Ljava/lang/Object;

    .line 226
    .line 227
    iput v4, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->label:I

    .line 228
    .line 229
    invoke-static {v5, v2, v0, v1, v6}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-ne v0, v7, :cond_d

    .line 234
    .line 235
    goto :goto_b

    .line 236
    :cond_d
    move-object v1, v2

    .line 237
    move-object v2, v5

    .line 238
    :goto_8
    check-cast v0, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 241
    .line 242
    .line 243
    move-result-wide v4

    .line 244
    iput-object v1, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$0:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v9, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$1:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v9, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$2:Ljava/lang/Object;

    .line 249
    .line 250
    iput-wide v4, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->J$0:J

    .line 251
    .line 252
    iput v3, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->label:I

    .line 253
    .line 254
    invoke-static {v2, v10, v6}, Lio/ktor/http/cio/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-ne v0, v7, :cond_e

    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_e
    move-object v3, v1

    .line 262
    move-wide v1, v4

    .line 263
    :goto_9
    check-cast v0, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 266
    .line 267
    .line 268
    move-result-wide v4

    .line 269
    add-long/2addr v4, v1

    .line 270
    move-wide v1, v4

    .line 271
    :goto_a
    iput-object v9, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->L$0:Ljava/lang/Object;

    .line 272
    .line 273
    iput-wide v1, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->J$0:J

    .line 274
    .line 275
    iput v8, v6, Lio/ktor/http/cio/MultipartKt$parsePartBodyImpl$1;->label:I

    .line 276
    .line 277
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 278
    .line 279
    invoke-virtual {v3, v6}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    if-ne v0, v7, :cond_f

    .line 284
    .line 285
    :goto_b
    return-object v7

    .line 286
    :cond_f
    :goto_c
    new-instance v0, Ljava/lang/Long;

    .line 287
    .line 288
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 289
    .line 290
    .line 291
    return-object v0

    .line 292
    :cond_10
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    new-instance v4, Ljava/io/IOException;

    .line 297
    .line 298
    new-instance v5, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v6, "Multipart content length exceeds limit "

    .line 301
    .line 302
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const-string v2, " > "

    .line 309
    .line 310
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string v0, "; limit is defined using \'formFieldLimit\' argument"

    .line 317
    .line 318
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v4
.end method
