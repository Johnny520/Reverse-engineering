.class public final Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile acceptHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;"
        }
    .end annotation
.end field

.field private volatile connectHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;"
        }
    .end annotation
.end field

.field private volatile readHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;"
        }
    .end annotation
.end field

.field private volatile writeHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->Companion:Lio/ktor/network/selector/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lio/ktor/network/selector/SelectInterest;->access$getAllInterests$cp()[Lio/ktor/network/selector/SelectInterest;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    array-length v2, v0

    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    array-length v2, v0

    .line 17
    const/4 v3, 0x0

    .line 18
    move v4, v3

    .line 19
    :goto_0
    if-ge v4, v2, :cond_4

    .line 20
    .line 21
    aget-object v5, v0, v4

    .line 22
    .line 23
    sget-object v6, Lio/ktor/network/selector/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:[I

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    aget v5, v6, v5

    .line 30
    .line 31
    const/4 v6, 0x1

    .line 32
    if-eq v5, v6, :cond_3

    .line 33
    .line 34
    const/4 v6, 0x2

    .line 35
    if-eq v5, v6, :cond_2

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    if-eq v5, v6, :cond_1

    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    if-ne v5, v6, :cond_0

    .line 42
    .line 43
    sget-object v5, Lio/ktor/network/selector/InterestSuspensionsMap$Companion$updaters$1$property$4;->INSTANCE:Lio/ktor/network/selector/InterestSuspensionsMap$Companion$updaters$1$property$4;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    sget-object v5, Lio/ktor/network/selector/InterestSuspensionsMap$Companion$updaters$1$property$3;->INSTANCE:Lio/ktor/network/selector/InterestSuspensionsMap$Companion$updaters$1$property$3;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    sget-object v5, Lio/ktor/network/selector/InterestSuspensionsMap$Companion$updaters$1$property$2;->INSTANCE:Lio/ktor/network/selector/InterestSuspensionsMap$Companion$updaters$1$property$2;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    sget-object v5, Lio/ktor/network/selector/InterestSuspensionsMap$Companion$updaters$1$property$1;->INSTANCE:Lio/ktor/network/selector/InterestSuspensionsMap$Companion$updaters$1$property$1;

    .line 57
    .line 58
    :goto_1
    const-class v6, Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 59
    .line 60
    invoke-interface {v5}, Lkotlin/reflect/飘花落叶言子楪世哲苏兰;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    const-class v7, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 65
    .line 66
    invoke-static {v7, v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    new-array v0, v3, [Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 77
    .line 78
    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, [Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 83
    .line 84
    sput-object v0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 85
    .line 86
    return-void
.end method

.method public static final synthetic 飘花落叶言子楪世兰哲苏(Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->connectHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic 飘花落叶言子楪世兰苏哲(Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->acceptHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic 飘花落叶言子楪世哲兰苏(Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;)Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->writeHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪世哲苏兰(Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;)Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->readHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪世苏兰哲(Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;)Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->connectHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪世苏哲兰(Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;)Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->acceptHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic 飘花落叶言子楪苏世兰哲(Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->writeHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic 飘花落叶言子楪苏世哲兰(Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->readHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "R "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->readHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " W "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->writeHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, " C "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->connectHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, " A "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->acceptHandlerReference:Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
