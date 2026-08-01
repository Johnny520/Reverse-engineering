.class public final Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/platform/飘花落叶言子世兰哲楪苏;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:[F

.field public final 飘花落叶言子楪世苏哲兰:[I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:[I

    const/4 p1, 0x2

    .line 53
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:[F

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:[I

    const/4 p1, 0x3

    .line 56
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:[F

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    new-array v1, v0, [I

    .line 9
    .line 10
    iput-object v1, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:[I

    .line 11
    .line 12
    new-array v1, v0, [F

    .line 13
    .line 14
    iput-object v1, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:[F

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, v0, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:[I

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    aput v3, v2, v1

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:[F

    .line 34
    .line 35
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Float;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    aput v3, v2, v1

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method

.method public constructor <init>([F)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:[F

    const/4 p1, 0x2

    .line 58
    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:[I

    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世苏兰哲(Landroid/view/View;[F)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:[F

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p2}, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;[F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-float p0, p0

    .line 21
    neg-float p0, p0

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    neg-float v0, v0

    .line 28
    sget-object v1, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 29
    .line 30
    invoke-static {v2}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏([F)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, p0, v0}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世兰哲苏([FFF)V

    .line 34
    .line 35
    .line 36
    invoke-static {p2, v2}, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰([F[F)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    int-to-float p0, p0

    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v0, v0

    .line 49
    invoke-static {v2}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏([F)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2, p0, v0}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世兰哲苏([FFF)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2, v2}, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰([F[F)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:[I

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-float v0, v0

    .line 69
    neg-float v0, v0

    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    int-to-float v1, v1

    .line 75
    neg-float v1, v1

    .line 76
    sget-object v3, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 77
    .line 78
    invoke-static {v2}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏([F)V

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世兰哲苏([FFF)V

    .line 82
    .line 83
    .line 84
    invoke-static {p2, v2}, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰([F[F)V

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    aget v0, p0, v0

    .line 89
    .line 90
    int-to-float v0, v0

    .line 91
    const/4 v1, 0x1

    .line 92
    aget p0, p0, v1

    .line 93
    .line 94
    int-to-float p0, p0

    .line 95
    invoke-static {v2}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏([F)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v0, p0}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世兰哲苏([FFF)V

    .line 99
    .line 100
    .line 101
    invoke-static {p2, v2}, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰([F[F)V

    .line 102
    .line 103
    .line 104
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_1

    .line 113
    .line 114
    invoke-static {p0, v2}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏世哲(Landroid/graphics/Matrix;[F)V

    .line 115
    .line 116
    .line 117
    invoke-static {p2, v2}, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰([F[F)V

    .line 118
    .line 119
    .line 120
    :cond_1
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(Landroid/view/View;[F)V
    .locals 0

    .line 1
    invoke-static {p2}, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏([F)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;[F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
