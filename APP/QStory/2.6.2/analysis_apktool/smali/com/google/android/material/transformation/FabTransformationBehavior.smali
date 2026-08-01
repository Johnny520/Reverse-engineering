.class public abstract Lcom/google/android/material/transformation/FabTransformationBehavior;
.super Lcom/google/android/material/transformation/ExpandableTransformationBehavior;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p0, Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance p0, Landroid/graphics/RectF;

    .line 15
    .line 16
    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    new-instance p0, Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 22
    new-instance p0, Landroid/graphics/RectF;

    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    .line 23
    new-instance p0, Landroid/graphics/RectF;

    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    iget p0, p1, L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x50

    .line 6
    .line 7
    iput p0, p1, L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 p1, 0x8

    .line 6
    .line 7
    if-eq p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
