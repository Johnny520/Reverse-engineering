.class final Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0xb0
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.selects.WhileSelectKt"
    f = "WhileSelect.kt"
    l = {
        0x22
    }
    m = "whileSelect"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

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
            "Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;",
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
    .locals 7

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    iget v0, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->I$0:I

    .line 21
    .line 22
    iget-object v5, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->L$1:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    iget-object v5, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v2

    .line 40
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v5, v2

    .line 44
    move v0, v4

    .line 45
    :cond_2
    new-instance p1, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;

    .line 46
    .line 47
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-direct {p1, v6}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v5, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    iput-object v5, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v2, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    iput v0, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->I$0:I

    .line 62
    .line 63
    iput v4, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->I$1:I

    .line 64
    .line 65
    iput v4, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->I$2:I

    .line 66
    .line 67
    iput v3, p0, Lkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1;->label:I

    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_2

    .line 83
    .line 84
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 85
    .line 86
    return-object p0
.end method
