.class public final Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public 飘花落叶言子楪世兰苏哲:I

.field public 飘花落叶言子楪世哲兰苏:I

.field public 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:I

.field public final 飘花落叶言子楪哲世兰苏:Ljava/util/ArrayList;

.field public 飘花落叶言子楪哲世苏兰:I

.field public 飘花落叶言子楪哲兰世苏:Z

.field public 飘花落叶言子楪哲兰苏世:Z

.field public 飘花落叶言子楪哲苏世兰:I

.field public 飘花落叶言子楪哲苏兰世:I

.field public 飘花落叶言子楪苏世兰哲:I

.field public 飘花落叶言子楪苏世哲兰:I

.field public 飘花落叶言子楪苏兰世哲:F

.field public 飘花落叶言子楪苏兰哲世:I

.field public 飘花落叶言子楪苏哲世兰:I

.field public 飘花落叶言子楪苏哲兰世:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 8
    .line 9
    iput v0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    const/high16 v0, -0x80000000

    .line 12
    .line 13
    iput v0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 14
    .line 15
    iput v0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Ljava/util/ArrayList;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Landroid/view/View;IIII)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/android/flexbox/FlexItem;

    .line 6
    .line 7
    iget v1, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-interface {v0}, Lcom/google/android/flexbox/FlexItem;->飘花落叶言子楪兰世苏哲()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sub-int/2addr v2, v3

    .line 18
    sub-int/2addr v2, p2

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iput p2, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 24
    .line 25
    iget p2, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-interface {v0}, Lcom/google/android/flexbox/FlexItem;->飘花落叶言子楪兰苏哲世()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    sub-int/2addr v1, v2

    .line 36
    sub-int/2addr v1, p3

    .line 37
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iput p2, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 42
    .line 43
    iget p2, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    invoke-interface {v0}, Lcom/google/android/flexbox/FlexItem;->飘花落叶言子世苏楪兰哲()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr p3, v1

    .line 54
    add-int/2addr p3, p4

    .line 55
    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iput p2, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 60
    .line 61
    iget p2, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-interface {v0}, Lcom/google/android/flexbox/FlexItem;->飘花落叶言子楪哲兰苏世()I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    add-int/2addr p1, p3

    .line 72
    add-int/2addr p1, p5

    .line 73
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput p1, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 78
    .line 79
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    iget p0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method
