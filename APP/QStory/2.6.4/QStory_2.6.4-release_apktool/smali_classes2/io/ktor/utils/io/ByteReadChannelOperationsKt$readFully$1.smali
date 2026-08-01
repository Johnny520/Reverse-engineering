.class final Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.utils.io.ByteReadChannelOperationsKt"
    f = "ByteReadChannelOperations.kt"
    l = {
        0x1d4
    }
    m = "readFully"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

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
            "Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;",
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
    .locals 9

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->label:I

    .line 9
    .line 10
    instance-of p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->label:I

    .line 15
    .line 16
    and-int v1, p1, v0

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    sub-int/2addr p1, v0

    .line 21
    iput p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    move-object p0, p1

    .line 30
    :goto_0
    iget-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->result:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 33
    .line 34
    iget v1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->label:I

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const-string v3, "Channel is already closed"

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    if-ne v1, v4, :cond_1

    .line 43
    .line 44
    iget v1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->I$1:I

    .line 45
    .line 46
    iget v2, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->I$0:I

    .line 47
    .line 48
    iget-object v5, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, [B

    .line 51
    .line 52
    iget-object v6, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v2

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_7

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    move v1, p1

    .line 78
    move-object v5, v2

    .line 79
    move v2, v1

    .line 80
    move-object p1, v5

    .line 81
    :goto_1
    if-ge v1, v2, :cond_6

    .line 82
    .line 83
    invoke-interface {p1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-interface {v6}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏兰楪哲()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_4

    .line 92
    .line 93
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->L$0:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v5, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    iput v2, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->I$0:I

    .line 98
    .line 99
    iput v1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->I$1:I

    .line 100
    .line 101
    iput v4, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readFully$1;->label:I

    .line 102
    .line 103
    invoke-interface {p1, v4, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-ne v6, v0, :cond_3

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    move-object v6, p1

    .line 111
    :goto_2
    move-object p1, v6

    .line 112
    :cond_4
    invoke-interface {p1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_5

    .line 117
    .line 118
    sub-int v6, v2, v1

    .line 119
    .line 120
    invoke-interface {p1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-static {v7}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v7

    .line 128
    long-to-int v7, v7

    .line 129
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-interface {p1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    add-int/2addr v6, v1

    .line 138
    invoke-static {v7, v5, v1, v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;[BII)V

    .line 139
    .line 140
    .line 141
    move v1, v6

    .line 142
    goto :goto_1

    .line 143
    :cond_5
    new-instance p0, Ljava/io/EOFException;

    .line 144
    .line 145
    invoke-direct {p0, v3}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :cond_6
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 150
    .line 151
    :goto_3
    return-object v0

    .line 152
    :cond_7
    new-instance p0, Ljava/io/EOFException;

    .line 153
    .line 154
    invoke-direct {p0, v3}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p0
.end method
