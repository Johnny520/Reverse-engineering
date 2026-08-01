.class public final L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:I


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:F

.field public final 飘花落叶言子楪世哲兰苏:I

.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0x4014666666666667L    # 5.1000000000000005

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    long-to-int v0, v0

    .line 11
    sput v0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x240401e4

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v1, v2}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子世楪兰苏哲(Landroid/content/res/Resources$Theme;IZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const v1, 0x240401e3

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏(Landroid/content/Context;I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v2

    .line 28
    :goto_0
    const v3, 0x240401e2

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v3}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏(Landroid/content/Context;I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v3, v2

    .line 43
    :goto_1
    const v4, 0x24040145

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v4}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏(Landroid/content/Context;I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-boolean v0, p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 70
    .line 71
    iput v1, p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 72
    .line 73
    iput v3, p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 74
    .line 75
    iput v2, p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 76
    .line 77
    iput p1, p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:F

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(FI)I
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, v0, v1

    .line 5
    .line 6
    if-lez v2, :cond_1

    .line 7
    .line 8
    cmpg-float v2, p1, v1

    .line 9
    .line 10
    if-gtz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    div-float/2addr p1, v0

    .line 14
    float-to-double v2, p1

    .line 15
    invoke-static {v2, v3}, Ljava/lang/Math;->log1p(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    double-to-float p1, v2

    .line 20
    const/high16 v0, 0x40900000    # 4.5f

    .line 21
    .line 22
    mul-float/2addr p1, v0

    .line 23
    const/high16 v0, 0x40000000    # 2.0f

    .line 24
    .line 25
    add-float/2addr p1, v0

    .line 26
    const/high16 v0, 0x42c80000    # 100.0f

    .line 27
    .line 28
    div-float/2addr p1, v0

    .line 29
    const/high16 v0, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    move p1, v1

    .line 37
    :goto_1
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/16 v2, 0xff

    .line 42
    .line 43
    invoke-static {p2, v2}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(II)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    iget v2, p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 48
    .line 49
    invoke-static {p2, p1, v2}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(IFI)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    cmpl-float p1, p1, v1

    .line 54
    .line 55
    if-lez p1, :cond_2

    .line 56
    .line 57
    iget p0, p0, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 58
    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    sget p1, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:I

    .line 62
    .line 63
    invoke-static {p0, p1}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(II)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0, p2}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(II)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    :cond_2
    invoke-static {p2, v0}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(II)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0
.end method
