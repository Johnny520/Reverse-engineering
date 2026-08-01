.class final Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u54f2\u696a;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u54f2\u696a;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $maxHeight:I

.field final synthetic $maxWidth:I

.field final synthetic $placeables:[Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

.field final synthetic this$0:Landroidx/compose/animation/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>([Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;Landroidx/compose/animation/飘花落叶言子楪世兰苏哲;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->$placeables:[Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->this$0:Landroidx/compose/animation/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->$maxWidth:I

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->$maxHeight:I

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 72
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->invoke(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->$placeables:[Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->this$0:Landroidx/compose/animation/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    iget v3, v0, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->$maxWidth:I

    .line 8
    .line 9
    iget v0, v0, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;->$maxHeight:I

    .line 10
    .line 11
    array-length v4, v1

    .line 12
    const/4 v5, 0x0

    .line 13
    :goto_0
    if-ge v5, v4, :cond_1

    .line 14
    .line 15
    aget-object v6, v1, v5

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    iget-object v7, v2, Landroidx/compose/animation/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;

    .line 20
    .line 21
    iget-object v8, v7, Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    iget v7, v6, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 24
    .line 25
    iget v9, v6, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 26
    .line 27
    int-to-long v10, v7

    .line 28
    const/16 v7, 0x20

    .line 29
    .line 30
    shl-long/2addr v10, v7

    .line 31
    int-to-long v12, v9

    .line 32
    const-wide v14, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v12, v14

    .line 38
    or-long v9, v10, v12

    .line 39
    .line 40
    int-to-long v11, v3

    .line 41
    shl-long/2addr v11, v7

    .line 42
    move/from16 p0, v7

    .line 43
    .line 44
    move-object v13, v8

    .line 45
    int-to-long v7, v0

    .line 46
    and-long/2addr v7, v14

    .line 47
    or-long/2addr v11, v7

    .line 48
    move-object v8, v13

    .line 49
    sget-object v13, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 50
    .line 51
    invoke-interface/range {v8 .. v13}, Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    shr-long v9, v7, p0

    .line 56
    .line 57
    long-to-int v9, v9

    .line 58
    and-long/2addr v7, v14

    .line 59
    long-to-int v7, v7

    .line 60
    move-object/from16 v8, p1

    .line 61
    .line 62
    invoke-static {v8, v6, v9, v7}, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;II)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    move-object/from16 v8, p1

    .line 67
    .line 68
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    return-void
.end method
