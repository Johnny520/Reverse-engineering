.class final Landroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1;->invoke(Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪世苏兰哲;)Landroidx/compose/animation/core/飘花落叶言子苏兰世楪哲;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;",
        "vector",
        "Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
        "invoke-vNxB06k",
        "(Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;)J",
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
.field final synthetic $colorSpace:Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$2;->$colorSpace:Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪世苏兰哲;

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
.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$2;->invoke-vNxB06k(Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    new-instance v0, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;-><init>(J)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke-vNxB06k(Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;)J
    .locals 8

    .line 1
    iget v0, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, v0, v1

    .line 5
    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    .line 10
    .line 11
    cmpl-float v3, v0, v2

    .line 12
    .line 13
    if-lez v3, :cond_1

    .line 14
    .line 15
    move v0, v2

    .line 16
    :cond_1
    iget v3, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:F

    .line 17
    .line 18
    const/high16 v4, -0x41000000    # -0.5f

    .line 19
    .line 20
    cmpg-float v5, v3, v4

    .line 21
    .line 22
    if-gez v5, :cond_2

    .line 23
    .line 24
    move v3, v4

    .line 25
    :cond_2
    const/high16 v5, 0x3f000000    # 0.5f

    .line 26
    .line 27
    cmpl-float v6, v3, v5

    .line 28
    .line 29
    if-lez v6, :cond_3

    .line 30
    .line 31
    move v3, v5

    .line 32
    :cond_3
    iget v6, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:F

    .line 33
    .line 34
    cmpg-float v7, v6, v4

    .line 35
    .line 36
    if-gez v7, :cond_4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    move v4, v6

    .line 40
    :goto_0
    cmpl-float v6, v4, v5

    .line 41
    .line 42
    if-lez v6, :cond_5

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_5
    move v5, v4

    .line 46
    :goto_1
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 47
    .line 48
    cmpg-float v4, p1, v1

    .line 49
    .line 50
    if-gez v4, :cond_6

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_6
    move v1, p1

    .line 54
    :goto_2
    cmpl-float p1, v1, v2

    .line 55
    .line 56
    if-lez p1, :cond_7

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_7
    move v2, v1

    .line 60
    :goto_3
    sget-object p1, Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪苏兰世哲;

    .line 61
    .line 62
    invoke-static {v0, v3, v5, v2, p1}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲(FFFFLandroidx/compose/ui/graphics/colorspace/飘花落叶言子楪世苏兰哲;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    iget-object p0, p0, Landroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$2;->$colorSpace:Landroidx/compose/ui/graphics/colorspace/飘花落叶言子楪世苏兰哲;

    .line 67
    .line 68
    invoke-static {v0, v1, p0}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(JLandroidx/compose/ui/graphics/colorspace/飘花落叶言子楪世苏兰哲;)J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    return-wide p0
.end method
