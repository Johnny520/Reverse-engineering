.class public abstract Landroidx/compose/ui/viewinterop/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroid/view/View;Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)V
    .locals 4

    .line 1
    iget-object p1, p1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/node/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世哲楪苏兰(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const/16 p1, 0x20

    .line 12
    .line 13
    shr-long v2, v0, p1

    .line 14
    .line 15
    long-to-int p1, v2

    .line 16
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const-wide v2, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v0, v2

    .line 30
    long-to-int v0, v0

    .line 31
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/2addr v1, p1

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->getInteropView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v0

    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "Could not fetch interop view"

    .line 22
    .line 23
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
