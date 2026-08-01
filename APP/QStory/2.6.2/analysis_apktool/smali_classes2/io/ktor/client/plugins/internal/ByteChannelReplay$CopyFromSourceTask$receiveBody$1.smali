.class final Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;
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
    c = "io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1"
    f = "ByteChannelReplay.kt"
    l = {
        0x3b,
        0x3c,
        0x40,
        0x41
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏兰哲;

.field final synthetic this$1:Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏兰哲;Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/client/plugins/internal/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lio/ktor/client/plugins/internal/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->this$0:Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->this$1:Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
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
    new-instance v0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->this$0:Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    iget-object p0, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->this$1:Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;-><init>(Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏兰哲;Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_7

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq v1, v3, :cond_6

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    const/4 v4, 0x3

    .line 13
    const/4 v5, 0x2

    .line 14
    if-eq v1, v5, :cond_2

    .line 15
    .line 16
    if-eq v1, v4, :cond_1

    .line 17
    .line 18
    if-eq v1, v3, :cond_0

    .line 19
    .line 20
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    iget-object v0, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$2:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 29
    .line 30
    iget-object v1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$1:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 33
    .line 34
    iget-object v3, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    iget-object v1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 45
    .line 46
    iget-object v4, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 49
    .line 50
    iget-object v5, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 53
    .line 54
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    move-object p1, v1

    .line 58
    move-object v1, v4

    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-object v1, v4

    .line 61
    goto :goto_4

    .line 62
    :catch_0
    move-object v0, v1

    .line 63
    move-object v1, v4

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iget-object v1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 68
    .line 69
    iget-object v5, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 72
    .line 73
    :try_start_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    check-cast p1, Lkotlinx/io/飘花落叶言子楪苏兰世哲;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 77
    .line 78
    :try_start_3
    iget-object v6, v5, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 79
    .line 80
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 81
    .line 82
    invoke-virtual {v6}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰哲世()Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_5

    .line 87
    .line 88
    iget-object v6, v5, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 89
    .line 90
    invoke-interface {p1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->peek()Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    iput-object v5, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    iput v4, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->label:I

    .line 101
    .line 102
    invoke-static {v6, v7, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlinx/io/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    if-ne v4, v0, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    :goto_0
    iget-object v4, v5, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 110
    .line 111
    iput-object v5, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$1:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$2:Ljava/lang/Object;

    .line 116
    .line 117
    iput v3, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->label:I

    .line 118
    .line 119
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 120
    .line 121
    invoke-virtual {v4, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 125
    if-ne v3, v0, :cond_4

    .line 126
    .line 127
    :goto_1
    return-object v0

    .line 128
    :catch_1
    :cond_4
    move-object v0, p1

    .line 129
    :catch_2
    :goto_2
    move-object p1, v0

    .line 130
    :cond_5
    :try_start_4
    invoke-static {v1, p1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰(Lkotlinx/io/飘花落叶言子楪苏哲兰世;Lkotlinx/io/飘花落叶言子楪苏兰世哲;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    iget-object v0, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$1:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v1, v0

    .line 137
    check-cast v1, Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 138
    .line 139
    iget-object v0, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$0:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 142
    .line 143
    :try_start_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 147
    :cond_7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->L$0:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 153
    .line 154
    new-instance p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 155
    .line 156
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 157
    .line 158
    .line 159
    move-object v1, p1

    .line 160
    :goto_3
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 161
    :catchall_1
    :goto_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object p0, p0, Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1;->this$1:Lio/ktor/client/plugins/internal/飘花落叶言子楪世苏哲兰;

    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    throw v2
.end method
