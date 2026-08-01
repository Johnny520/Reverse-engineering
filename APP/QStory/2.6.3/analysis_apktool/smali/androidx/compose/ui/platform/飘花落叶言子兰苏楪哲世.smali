.class public final synthetic Landroidx/compose/ui/platform/飘花落叶言子兰苏楪哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/platform/飘花落叶言子哲楪苏世兰;
.implements Lkotlin/jvm/internal/飘花落叶言子楪世哲兰苏;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪哲世;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/platform/飘花落叶言子哲楪苏世兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, Lkotlin/jvm/internal/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪哲世;->飘花落叶言子楪世苏哲兰()Lkotlin/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p1, Lkotlin/jvm/internal/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    invoke-interface {p1}, Lkotlin/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()Lkotlin/飘花落叶言子楪世兰苏哲;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪哲世;->飘花落叶言子楪世苏哲兰()Lkotlin/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Lkotlin/飘花落叶言子楪世兰苏哲;
    .locals 7

    .line 1
    new-instance v0, Lkotlin/jvm/internal/FunctionReferenceImpl;

    .line 2
    .line 3
    const-string v5, "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    iget-object v2, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪哲世;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    const-class v3, Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    const-string v4, "scheduleFrameEndCallback"

    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
