.class final Lio/ktor/util/cio/ReadersJvmKt$pass$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    c = "io.ktor.util.cio.ReadersJvmKt"
    f = "ReadersJvm.kt"
    l = {
        0x11
    }
    m = "pass"
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
            "Lio/ktor/util/cio/ReadersJvmKt$pass$1;",
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
    iput-object p1, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->label:I

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
    iget-object v0, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 22
    .line 23
    iget-object v2, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    iget-object v4, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object p1, v2

    .line 35
    move-object v2, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object p1, v2

    .line 47
    move-object v0, p1

    .line 48
    :goto_0
    invoke-interface {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 55
    .line 56
    .line 57
    iput-object v2, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object p1, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v0, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->L$2:Ljava/lang/Object;

    .line 62
    .line 63
    iput v3, p0, Lio/ktor/util/cio/ReadersJvmKt$pass$1;->label:I

    .line 64
    .line 65
    invoke-static {v2, p1, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-ne v4, v1, :cond_2

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-interface {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-nez p0, :cond_4

    .line 84
    .line 85
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_4
    throw p0
.end method
