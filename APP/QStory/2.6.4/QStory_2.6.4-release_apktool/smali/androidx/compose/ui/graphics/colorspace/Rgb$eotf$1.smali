.class final Landroidx/compose/ui/graphics/colorspace/Rgb$eotf$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "x",
        "invoke",
        "(D)Ljava/lang/Double;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪哲苏世兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪哲苏世兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/colorspace/Rgb$eotf$1;->this$0:Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(D)Ljava/lang/Double;
    .locals 8

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/colorspace/Rgb$eotf$1;->this$0:Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲世兰苏:Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget v1, p0, Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:F

    .line 6
    .line 7
    float-to-double v4, v1

    .line 8
    iget p0, p0, Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:F

    .line 9
    .line 10
    float-to-double v6, p0

    .line 11
    move-wide v2, p1

    .line 12
    invoke-static/range {v2 .. v7}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(DDD)D

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    invoke-interface {v0, p0, p1}, Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 25
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/graphics/colorspace/Rgb$eotf$1;->invoke(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method
