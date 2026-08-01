.class final Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt"
    f = "WriteSuspendSession.kt"
    l = {
        0x3b
    }
    m = "writeWhile"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;",
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
    iput-object p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-ne v0, v3, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 22
    .line 23
    iget-object v4, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 26
    .line 27
    iget-object v5, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    move-object p1, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 46
    .line 47
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 48
    .line 49
    .line 50
    move-object v0, p1

    .line 51
    move-object p1, v2

    .line 52
    move-object v4, p1

    .line 53
    :goto_0
    iget-boolean v5, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 54
    .line 55
    if-nez v5, :cond_7

    .line 56
    .line 57
    move-object v5, p1

    .line 58
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 59
    .line 60
    invoke-virtual {v5}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v3}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget-object v7, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 72
    .line 73
    iget v8, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 74
    .line 75
    array-length v9, v7

    .line 76
    sub-int/2addr v9, v8

    .line 77
    invoke-static {v7, v8, v9}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-interface {v4, v7}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    check-cast v9, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    xor-int/2addr v9, v3

    .line 95
    iput-boolean v9, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    sub-int/2addr v7, v8

    .line 102
    if-ne v7, v3, :cond_3

    .line 103
    .line 104
    iget v8, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 105
    .line 106
    add-int/2addr v8, v7

    .line 107
    iput v8, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 108
    .line 109
    iget-wide v8, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 110
    .line 111
    int-to-long v6, v7

    .line 112
    add-long/2addr v8, v6

    .line 113
    iput-wide v8, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    if-ltz v7, :cond_6

    .line 117
    .line 118
    invoke-virtual {v6}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-gt v7, v8, :cond_6

    .line 123
    .line 124
    if-eqz v7, :cond_4

    .line 125
    .line 126
    iget v8, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 127
    .line 128
    add-int/2addr v8, v7

    .line 129
    iput v8, v6, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 130
    .line 131
    iget-wide v8, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 132
    .line 133
    int-to-long v6, v7

    .line 134
    add-long/2addr v8, v6

    .line 135
    iput-wide v8, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    invoke-static {v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_5

    .line 143
    .line 144
    invoke-virtual {p1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 145
    .line 146
    .line 147
    :cond_5
    :goto_1
    iput-object v5, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v4, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->L$1:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v0, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->L$2:Ljava/lang/Object;

    .line 152
    .line 153
    iput v3, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeWhile$1;->label:I

    .line 154
    .line 155
    invoke-virtual {v5, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-ne p1, v1, :cond_0

    .line 160
    .line 161
    return-object v1

    .line 162
    :cond_6
    const-string p0, "Invalid number of bytes written: "

    .line 163
    .line 164
    const-string p1, ". Should be in 0.."

    .line 165
    .line 166
    invoke-static {v7, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v6}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;I)V

    .line 175
    .line 176
    .line 177
    return-object v2

    .line 178
    :cond_7
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 179
    .line 180
    return-object p0
.end method
