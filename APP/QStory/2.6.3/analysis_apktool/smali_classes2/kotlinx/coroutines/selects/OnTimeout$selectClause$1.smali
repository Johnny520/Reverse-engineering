.class final synthetic Lkotlinx/coroutines/selects/OnTimeout$selectClause$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/selects/OnTimeout$selectClause$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/selects/OnTimeout$selectClause$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/selects/OnTimeout$selectClause$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/selects/OnTimeout$selectClause$1;->INSTANCE:Lkotlinx/coroutines/selects/OnTimeout$selectClause$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const-class v2, Lkotlinx/coroutines/selects/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    const-string v3, "register"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 39
    check-cast p1, Lkotlinx/coroutines/selects/飘花落叶言子楪世苏哲兰;

    check-cast p2, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/selects/OnTimeout$selectClause$1;->invoke(Lkotlinx/coroutines/selects/飘花落叶言子楪世苏哲兰;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/selects/飘花落叶言子楪世苏哲兰;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/selects/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "Lkotlinx/coroutines/selects/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    iget-wide v0, p1, Lkotlinx/coroutines/selects/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-gtz p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 10
    .line 11
    invoke-interface {p2, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance p0, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 16
    .line 17
    const/4 p3, 0x5

    .line 18
    invoke-direct {p0, p2, p3, p1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p2, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    iget-object p1, p2, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-interface {p3, v0, v1, p0, p1}, Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(JLjava/lang/Runnable;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iput-object p0, p2, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method
