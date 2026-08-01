.class public final Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->label:I

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
    iput v1, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;-><init>(Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_4

    .line 34
    .line 35
    const/4 p0, 0x2

    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, p0, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p1, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 53
    .line 54
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object v3, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput p0, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->label:I

    .line 60
    .line 61
    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_4
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 77
    .line 78
    .line 79
    return-object v3

    .line 80
    :cond_5
    iget-object p0, p0, Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 81
    .line 82
    iput-object p0, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    iput v4, v0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->label:I

    .line 85
    .line 86
    throw v3
.end method
