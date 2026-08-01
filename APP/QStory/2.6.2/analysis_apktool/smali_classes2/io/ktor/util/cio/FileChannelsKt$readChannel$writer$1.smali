.class final Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1"
    f = "FileChannels.kt"
    l = {
        0x2a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $endInclusive:J

.field final synthetic $fileLength:J

.field final synthetic $randomAccessFile$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;"
        }
    .end annotation
.end field

.field final synthetic $start:J

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(JJJLkotlin/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$start:J

    .line 2
    .line 3
    iput-wide p3, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$endInclusive:J

    .line 4
    .line 5
    iput-wide p5, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$fileLength:J

    .line 6
    .line 7
    iput-object p7, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$randomAccessFile$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 9
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
    new-instance v0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$start:J

    .line 4
    .line 5
    iget-wide v3, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$endInclusive:J

    .line 6
    .line 7
    iget-wide v5, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$fileLength:J

    .line 8
    .line 9
    iget-object v7, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$randomAccessFile$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    move-object v8, p2

    .line 12
    invoke-direct/range {v0 .. v8}, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;-><init>(JJJLkotlin/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/io/Closeable;

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    move-object p1, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v5, p1

    .line 34
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 35
    .line 36
    iget-wide v6, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$start:J

    .line 37
    .line 38
    const-wide/16 v8, 0x0

    .line 39
    .line 40
    cmp-long p1, v6, v8

    .line 41
    .line 42
    if-ltz p1, :cond_6

    .line 43
    .line 44
    iget-wide v1, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$endInclusive:J

    .line 45
    .line 46
    iget-wide v6, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$fileLength:J

    .line 47
    .line 48
    const-wide/16 v8, 0x1

    .line 49
    .line 50
    sub-long v8, v6, v8

    .line 51
    .line 52
    cmp-long p1, v1, v8

    .line 53
    .line 54
    if-gtz p1, :cond_5

    .line 55
    .line 56
    iget-object p1, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$randomAccessFile$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 57
    .line 58
    invoke-interface {p1}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ljava/io/RandomAccessFile;

    .line 63
    .line 64
    iget-wide v6, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$start:J

    .line 65
    .line 66
    iget-wide v8, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->$endInclusive:J

    .line 67
    .line 68
    :try_start_1
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    iput v1, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->I$0:I

    .line 79
    .line 80
    iput v3, p0, Lio/ktor/util/cio/FileChannelsKt$readChannel$writer$1;->label:I

    .line 81
    .line 82
    move-object v10, p0

    .line 83
    invoke-static/range {v4 .. v10}, Lio/ktor/util/cio/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/nio/channels/SeekableByteChannel;Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;JJLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    if-ne p0, v0, :cond_2

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_2
    move-object p0, p1

    .line 91
    :goto_0
    if-eqz p0, :cond_3

    .line 92
    .line 93
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 94
    .line 95
    .line 96
    :cond_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 97
    .line 98
    return-object p0

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    move-object v11, p1

    .line 102
    move-object p1, p0

    .line 103
    move-object p0, v11

    .line 104
    :goto_1
    if-eqz p0, :cond_4

    .line 105
    .line 106
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :catchall_2
    move-exception v0

    .line 111
    move-object p0, v0

    .line 112
    invoke-static {p1, p0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_2
    throw p1

    .line 116
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string p1, "endInclusive points to the position out of the file: file size = "

    .line 119
    .line 120
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p1, ", endInclusive = "

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p1

    .line 148
    :cond_6
    const-string p0, "start position shouldn\'t be negative but it is "

    .line 149
    .line 150
    invoke-static {v6, v7, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(JLjava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    return-object v2
.end method
