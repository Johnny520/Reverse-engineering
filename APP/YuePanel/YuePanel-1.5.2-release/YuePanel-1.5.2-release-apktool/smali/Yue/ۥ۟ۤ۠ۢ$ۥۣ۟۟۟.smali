.class public LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public final ۥ۟۟۟۟:Landroid/view/View;

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/graphics/PointF;)V
    .locals 1

    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟:I

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟:I

    iget p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:I

    iget v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟()V

    :cond_0
    return-void
.end method

.method public final ۥ۟()V
    .locals 5

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟۟:Landroid/view/View;

    iget v1, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ:I

    iget v2, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟:I

    iget v3, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟:I

    iget v4, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟:I

    invoke-static {v0, v1, v2, v3, v4}, LYue/ۥۢۤۨ;->ۥ۟۟۟۟(Landroid/view/View;IIII)V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    iput v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:I

    return-void
.end method

.method public ۥ۟۟(Landroid/graphics/PointF;)V
    .locals 1

    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ:I

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟:I

    iget p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    iget v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:I

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠ۢ$ۥۣ۟۟۟;->ۥ۟()V

    :cond_0
    return-void
.end method
