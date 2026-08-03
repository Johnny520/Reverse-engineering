.class public final LYue/ۥۡۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۤ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/graphics/Path;)Ljava/util/Collection;
    .locals 1
    .param p0    # Landroid/graphics/Path;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Path;",
            ")",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e6;",
            ">;"
        }
    .end annotation

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {p0, v0}, LYue/ۥۡۤ;->ۥ۟(Landroid/graphics/Path;F)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/graphics/Path;F)Ljava/util/Collection;
    .locals 10
    .param p0    # Landroid/graphics/Path;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Path;",
            "F)",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e6;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۡۤ$ۥ;->ۥ(Landroid/graphics/Path;F)[F

    move-result-object p0

    array-length p1, p0

    div-int/lit8 p1, p1, 0x3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x1

    :goto_0
    if-ge v1, p1, :cond_2

    mul-int/lit8 v2, v1, 0x3

    add-int/lit8 v3, v1, -0x1

    mul-int/lit8 v3, v3, 0x3

    aget v4, p0, v2

    add-int/lit8 v5, v2, 0x1

    aget v5, p0, v5

    add-int/lit8 v2, v2, 0x2

    aget v2, p0, v2

    aget v6, p0, v3

    add-int/lit8 v7, v3, 0x1

    aget v7, p0, v7

    add-int/lit8 v3, v3, 0x2

    aget v3, p0, v3

    cmpl-float v8, v4, v6

    if-eqz v8, :cond_1

    cmpl-float v8, v5, v7

    if-nez v8, :cond_0

    cmpl-float v8, v2, v3

    if-eqz v8, :cond_1

    :cond_0
    new-instance v8, LYue/ۥۣۡۨۦ;

    new-instance v9, Landroid/graphics/PointF;

    invoke-direct {v9, v7, v3}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3, v5, v2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {v8, v9, v6, v3, v4}, LYue/ۥۣۡۨۦ;-><init>(Landroid/graphics/PointF;FLandroid/graphics/PointF;F)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method
