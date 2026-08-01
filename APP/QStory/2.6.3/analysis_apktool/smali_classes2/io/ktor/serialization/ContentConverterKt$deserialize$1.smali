.class final Lio/ktor/serialization/ContentConverterKt$deserialize$1;
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
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.serialization.ContentConverterKt"
    f = "ContentConverter.kt"
    l = {
        0x61
    }
    m = "deserialize"
.end annotation


# instance fields
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
            "Lio/ktor/serialization/ContentConverterKt$deserialize$1;",
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
    .locals 5

    .line 1
    iput-object p1, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v0, v3, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$1;->L$1:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    iget-object p0, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$1;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏兰哲世;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lio/ktor/serialization/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {v0, p1, v4}, Lio/ktor/serialization/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lio/ktor/serialization/ContentConverterKt$deserialize$result$2;

    .line 52
    .line 53
    invoke-direct {p1, v2, v2}, Lio/ktor/serialization/ContentConverterKt$deserialize$result$2;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v2, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$1;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    iput v3, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$1;->label:I

    .line 61
    .line 62
    invoke-static {v0, p1, p0}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/serialization/飘花落叶言子楪世苏兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_2

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_2
    move-object p0, v2

    .line 70
    move-object v0, p0

    .line 71
    :goto_0
    if-nez p1, :cond_5

    .line 72
    .line 73
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_3
    iget-object p0, v0, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 81
    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰哲苏()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-ne p0, v3, :cond_4

    .line 89
    .line 90
    sget-object p0, Lio/ktor/http/content/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/content/飘花落叶言子楪苏世兰哲;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_4
    new-instance p0, Lio/ktor/serialization/ContentConvertException;

    .line 94
    .line 95
    new-instance p1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "No suitable converter found for "

    .line 98
    .line 99
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const/4 v0, 0x2

    .line 110
    invoke-direct {p0, p1, v2, v0, v2}, Lio/ktor/serialization/ContentConvertException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 111
    .line 112
    .line 113
    throw p0

    .line 114
    :cond_5
    return-object p1
.end method
