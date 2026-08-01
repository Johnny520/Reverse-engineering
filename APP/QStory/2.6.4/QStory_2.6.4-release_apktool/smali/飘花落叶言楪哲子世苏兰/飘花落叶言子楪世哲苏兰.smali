.class public final L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲兰苏;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    iget p0, p0, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 14
    .line 15
    iget p1, p1, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 16
    .line 17
    cmpl-float p0, p0, p1

    .line 18
    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    return v0

    .line 22
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/graphics/RectF;)F
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float/2addr v0, v1

    .line 8
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    div-float/2addr p1, v1

    .line 13
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget p0, p0, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    cmpg-float v1, p0, v0

    .line 21
    .line 22
    if-gez v1, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    cmpl-float v0, p0, p1

    .line 26
    .line 27
    if-lez v0, :cond_1

    .line 28
    .line 29
    return p1

    .line 30
    :cond_1
    return p0
.end method
