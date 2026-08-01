.class public final Landroidx/compose/material3/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/material3/飘花落叶言子哲世苏兰楪;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/飘花落叶言子哲世苏兰楪;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material3/飘花落叶言子哲世苏兰楪;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/material3/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 21
    .line 22
    invoke-virtual {p1, p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, Landroidx/compose/material3/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material3/飘花落叶言子哲世苏兰楪;

    .line 29
    .line 30
    iget-object p2, p2, Landroidx/compose/material3/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪苏哲兰世:Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;

    .line 31
    .line 32
    iget-object p0, p0, Landroidx/compose/material3/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 33
    .line 34
    invoke-static {p2, p0, p1, v2}, Landroidx/compose/material3/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 39
    .line 40
    .line 41
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 42
    .line 43
    return-object p0
.end method
