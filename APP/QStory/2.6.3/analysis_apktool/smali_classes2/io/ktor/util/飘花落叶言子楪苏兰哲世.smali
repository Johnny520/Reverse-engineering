.class public abstract Lio/ktor/util/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

.field public static final 飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "WINDOWS-PRNG"

    .line 2
    .line 3
    const-string v1, "DRBG"

    .line 4
    .line 5
    const-string v2, "NativePRNGNonBlocking"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪哲世兰([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lio/ktor/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 16
    .line 17
    const/4 v0, 0x6

    .line 18
    const/16 v1, 0x400

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v1, v0, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lio/ktor/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 26
    .line 27
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 28
    .line 29
    const-string v1, "nonce-generator"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 35
    .line 36
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    sget-object v3, Lkotlinx/coroutines/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏兰楪哲世;

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, Lkotlinx/coroutines/CoroutineStart;->LAZY:Lkotlinx/coroutines/CoroutineStart;

    .line 49
    .line 50
    new-instance v3, Lio/ktor/util/NonceKt$nonceGeneratorJob$1;

    .line 51
    .line 52
    invoke-direct {v3, v2}, Lio/ktor/util/NonceKt$nonceGeneratorJob$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 53
    .line 54
    .line 55
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏楪世哲兰;

    .line 56
    .line 57
    invoke-static {v2, v0, v1, v3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏兰哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lio/ktor/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 62
    .line 63
    return-void
.end method
