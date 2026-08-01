.class final Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "E",
        "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1"
    f = "Deprecated.kt"
    l = {
        0x12b,
        0x12c,
        0x12d
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $predicate:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

.field final synthetic $this_takeWhile:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->$this_takeWhile:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    iput-object p2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->$predicate:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

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
    new-instance v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->$this_takeWhile:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 4
    .line 5
    iget-object p0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->$predicate:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->invoke(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    if-eq v2, v6, :cond_2

    .line 16
    .line 17
    if-eq v2, v5, :cond_1

    .line 18
    .line 19
    if-ne v2, v4, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$1:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :cond_1
    iget-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$2:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v7, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    iget-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->$this_takeWhile:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 58
    .line 59
    invoke-interface {p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->iterator()Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_0
    iput-object v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$2:Ljava/lang/Object;

    .line 68
    .line 69
    iput v6, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->label:I

    .line 70
    .line 71
    move-object v2, p1

    .line 72
    check-cast v2, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 73
    .line 74
    invoke-virtual {v2, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v1, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_8

    .line 88
    .line 89
    check-cast v2, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 90
    .line 91
    invoke-virtual {v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->$predicate:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 96
    .line 97
    iput-object v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$1:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$2:Ljava/lang/Object;

    .line 102
    .line 103
    iput v5, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->label:I

    .line 104
    .line 105
    invoke-interface {v7, p1, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    if-ne v7, v1, :cond_5

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    move-object v8, v2

    .line 113
    move-object v2, p1

    .line 114
    move-object p1, v7

    .line 115
    move-object v7, v8

    .line 116
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_6

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    iput-object v0, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$0:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v7, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$1:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->L$2:Ljava/lang/Object;

    .line 130
    .line 131
    iput v4, p0, Lkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$takeWhile$1;->label:I

    .line 132
    .line 133
    move-object p1, v0

    .line 134
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;

    .line 135
    .line 136
    iget-object p1, p1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 137
    .line 138
    invoke-interface {p1, v2, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v1, :cond_7

    .line 143
    .line 144
    :goto_3
    return-object v1

    .line 145
    :cond_7
    move-object p1, v7

    .line 146
    goto :goto_0

    .line 147
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 148
    .line 149
    return-object p0
.end method
