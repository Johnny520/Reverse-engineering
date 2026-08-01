.class final Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;
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
    xi = 0xb0
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.utils.io.ByteReadChannelOperationsKt"
    f = "ByteReadChannelOperations.kt"
    l = {
        0x1b4,
        0x1b9
    }
    m = "read"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

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
            "Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;",
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
    .locals 10

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_8

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    const/4 v4, 0x1

    .line 18
    if-eq v0, v4, :cond_1

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$3:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 25
    .line 26
    iget-object v1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$2:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 29
    .line 30
    iget-object v3, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$1:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    iget-object p0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_1
    iget-object v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰苏世;

    .line 51
    .line 52
    iget-object v4, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v4}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    new-instance p0, Ljava/lang/Integer;

    .line 66
    .line 67
    const/4 p1, -0x1

    .line 68
    invoke-direct {p0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_2
    new-instance p1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 73
    .line 74
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-interface {v4}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-interface {v4}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_7

    .line 90
    .line 91
    iget-object v5, v4, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v6, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 97
    .line 98
    iget v7, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 99
    .line 100
    iget v8, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 101
    .line 102
    new-instance v9, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-direct {v9, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 105
    .line 106
    .line 107
    new-instance v7, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-direct {v7, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v4, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$1:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v5, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$2:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->L$3:Ljava/lang/Object;

    .line 119
    .line 120
    iput v3, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$read$1;->label:I

    .line 121
    .line 122
    invoke-interface {v0, v6, v9, v7, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰苏世;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v1, :cond_3

    .line 127
    .line 128
    return-object v1

    .line 129
    :cond_3
    move-object v0, p1

    .line 130
    move-object v3, v4

    .line 131
    move-object v1, v5

    .line 132
    move-object p1, p0

    .line 133
    move-object p0, v0

    .line 134
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    iput p1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 141
    .line 142
    iget p1, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 143
    .line 144
    if-eqz p1, :cond_6

    .line 145
    .line 146
    if-ltz p1, :cond_5

    .line 147
    .line 148
    invoke-virtual {v1}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-gt p1, v0, :cond_4

    .line 153
    .line 154
    int-to-long v0, p1

    .line 155
    invoke-virtual {v3, v0, v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->skip(J)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_4
    const-string p0, "Returned too many bytes"

    .line 160
    .line 161
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-object v2

    .line 165
    :cond_5
    const-string p0, "Returned negative read bytes count"

    .line 166
    .line 167
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object v2

    .line 171
    :cond_6
    :goto_1
    iget p0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 172
    .line 173
    new-instance p1, Ljava/lang/Integer;

    .line 174
    .line 175
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 176
    .line 177
    .line 178
    return-object p1

    .line 179
    :cond_7
    const-string p0, "Buffer is empty"

    .line 180
    .line 181
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-object v2

    .line 185
    :cond_8
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    throw v2
.end method
