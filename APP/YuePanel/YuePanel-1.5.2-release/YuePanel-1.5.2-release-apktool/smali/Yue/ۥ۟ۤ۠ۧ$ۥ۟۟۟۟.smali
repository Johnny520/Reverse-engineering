.class public LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۠ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/graphics/Matrix;

.field public final ۥ۟:Landroid/view/View;

.field public final ۥ۟۟:[F

.field public ۥ۟۟۟:F

.field public ۥ۟۟۟۟:F


# direct methods
.method public constructor <init>(Landroid/view/View;[F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Matrix;

    iput-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟:Landroid/view/View;

    invoke-virtual {p2}, [F->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    iput-object p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟:[F

    const/4 p2, 0x2

    aget p2, p1, p2

    iput p2, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟۟:F

    const/4 p2, 0x5

    aget p1, p1, p2

    iput p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟۟۟:F

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟()V

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public final ۥ۟()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟:[F

    const/4 v1, 0x2

    iget v2, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟۟:F

    aput v2, v0, v1

    const/4 v1, 0x5

    iget v2, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟۟۟:F

    aput v2, v0, v1

    iget-object v1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟:Landroid/view/View;

    iget-object v1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Matrix;

    invoke-static {v0, v1}, LYue/ۥۢۤۨ;->ۥ۟۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public ۥ۟۟(Landroid/graphics/PointF;)V
    .locals 1

    iget v0, p1, Landroid/graphics/PointF;->x:F

    iput v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟۟:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    iput p1, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟۟۟:F

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟()V

    return-void
.end method

.method public ۥ۟۟۟([F)V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟۟:[F

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠ۧ$ۥ۟۟۟۟;->ۥ۟()V

    return-void
.end method
