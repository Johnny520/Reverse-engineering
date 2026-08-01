.class final synthetic Lkotlinx/io/SourcesJvmKt$asByteChannel$isClosed$1;
.super Lkotlin/jvm/internal/MutablePropertyReference0Impl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    .line 1
    const-string v4, "getClosed()Z"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const-class v2, Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    const-string v3, "closed"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/MutablePropertyReference0Impl;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    iget-boolean p0, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput-boolean p1, p0, Lkotlinx/io/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 12
    .line 13
    return-void
.end method
