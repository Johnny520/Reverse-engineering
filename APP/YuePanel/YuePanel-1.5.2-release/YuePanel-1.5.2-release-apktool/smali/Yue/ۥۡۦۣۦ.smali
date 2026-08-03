.class public final LYue/ۥۡۦۣۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    sget-object p0, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Region;->op(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥ۟(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    sget-object p0, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥ۟۟(Landroid/graphics/Region;Landroid/graphics/Point;)Z
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Point;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, v0, p1}, Landroid/graphics/Region;->contains(II)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟(Landroid/graphics/Region;LYue/ۥۣ۠ۡ۟;)V
    .locals 2
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Region;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/graphics/Rect;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Landroid/graphics/RegionIterator;

    invoke-direct {v0, p0}, Landroid/graphics/RegionIterator;-><init>(Landroid/graphics/Region;)V

    :goto_0
    new-instance p0, Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, p0}, Landroid/graphics/RegionIterator;->next(Landroid/graphics/Rect;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public static final ۥ۟۟۟۟(Landroid/graphics/Region;)Ljava/util/Iterator;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Region;",
            ")",
            "Ljava/util/Iterator<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۦۣۦ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۡۦۣۦ$ۥ;-><init>(Landroid/graphics/Region;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۠(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    sget-object p0, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Region;->op(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥ۟۟۟ۡ(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    sget-object p0, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥ۟۟۟ۢ(Landroid/graphics/Region;)Landroid/graphics/Region;
    .locals 2
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-virtual {p0}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p0, v1}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥۣ۟۟۟(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Region;->union(Landroid/graphics/Rect;)Z

    return-object v0
.end method

.method public static final ۥ۟۟۟ۤ(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    sget-object p0, Landroid/graphics/Region$Op;->UNION:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥ۟۟۟ۥ(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Region;->union(Landroid/graphics/Rect;)Z

    return-object v0
.end method

.method public static final ۥ۟۟۟ۦ(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    sget-object p0, Landroid/graphics/Region$Op;->UNION:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥ۟۟۟ۧ(Landroid/graphics/Region;)Landroid/graphics/Region;
    .locals 2
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-virtual {p0}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p0, v1}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥ۟۟۟ۨ(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    sget-object p0, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Region;->op(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method

.method public static final ۥ۟۟۠(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;
    .locals 1
    .param p0    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Region;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0, p0}, Landroid/graphics/Region;-><init>(Landroid/graphics/Region;)V

    sget-object p0, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;

    invoke-virtual {v0, p1, p0}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v0
.end method
