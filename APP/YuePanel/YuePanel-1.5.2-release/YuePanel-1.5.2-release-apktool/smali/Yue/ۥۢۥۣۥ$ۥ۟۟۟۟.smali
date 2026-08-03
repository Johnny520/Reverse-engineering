.class public LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:I

.field public ۥ۟:F

.field public final ۥ۟۟:Landroid/view/animation/Interpolator;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟:J

.field public ۥ۟۟۟۟:F


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0
    .param p2    # Landroid/view/animation/Interpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ:I

    iput-object p2, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟:Landroid/view/animation/Interpolator;

    iput-wide p3, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟:J

    return-void
.end method


# virtual methods
.method public ۥ()F
    .locals 1

    iget v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟۟:F

    return v0
.end method

.method public ۥ۟()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟:J

    return-wide v0
.end method

.method public ۥ۟۟()F
    .locals 1

    iget v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟:F

    return v0
.end method

.method public ۥ۟۟۟()F
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_0

    iget v1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟:F

    invoke-interface {v0, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v0

    return v0

    :cond_0
    iget v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟:F

    return v0
.end method

.method public ۥ۟۟۟۟()Landroid/view/animation/Interpolator;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public ۥ۟۟۟۠()I
    .locals 1

    iget v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ:I

    return v0
.end method

.method public ۥ۟۟۟ۡ(F)V
    .locals 0

    iput p1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟۟۟۟:F

    return-void
.end method

.method public ۥ۟۟۟ۢ(F)V
    .locals 0

    iput p1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;->ۥ۟:F

    return-void
.end method
