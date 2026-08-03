.class public final LYue/ۥ۠ۢۢۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۢۦۣ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۢۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟۟:F = -4.2f

.field public static final ۥ۟۟۟۟:F = 62.5f


# instance fields
.field public ۥ:F

.field public ۥ۟:F

.field public final ۥ۟۟:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0x3f79999a    # -4.2f

    iput v0, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ:F

    new-instance v0, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    invoke-direct {v0}, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    return-void
.end method


# virtual methods
.method public ۥ(FF)Z
    .locals 0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟:F

    cmpg-float p1, p1, p2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟(FF)F
    .locals 0

    iget p1, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ:F

    mul-float/2addr p2, p1

    return p2
.end method

.method public ۥ۟۟()F
    .locals 2

    iget v0, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ:F

    const v1, -0x3f79999a    # -4.2f

    div-float/2addr v0, v1

    return v0
.end method

.method public ۥ۟۟۟(F)V
    .locals 1

    const v0, -0x3f79999a    # -4.2f

    mul-float/2addr p1, v0

    iput p1, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ:F

    return-void
.end method

.method public ۥ۟۟۟۟(F)V
    .locals 1

    const/high16 v0, 0x427a0000    # 62.5f

    mul-float/2addr p1, v0

    iput p1, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟:F

    return-void
.end method

.method public ۥ۟۟۟۠(FFJ)LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;
    .locals 5

    iget-object v0, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    float-to-double v1, p2

    long-to-float p3, p3

    const/high16 p4, 0x447a0000    # 1000.0f

    div-float v3, p3, p4

    iget v4, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ:F

    mul-float/2addr v3, v4

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->exp(D)D

    move-result-wide v3

    mul-double/2addr v1, v3

    double-to-float v1, v1

    iput v1, v0, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ۟:F

    iget-object v0, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    iget v1, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ:F

    div-float v2, p2, v1

    sub-float/2addr p1, v2

    float-to-double v2, p1

    div-float/2addr p2, v1

    float-to-double p1, p2

    mul-float/2addr v1, p3

    div-float/2addr v1, p4

    float-to-double p3, v1

    invoke-static {p3, p4}, Ljava/lang/Math;->exp(D)D

    move-result-wide p3

    mul-double/2addr p1, p3

    add-double/2addr v2, p1

    double-to-float p1, v2

    iput p1, v0, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ:F

    iget-object p1, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    iget p2, p1, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ:F

    iget p1, p1, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ۟:F

    invoke-virtual {p0, p2, p1}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ(FF)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    const/4 p2, 0x0

    iput p2, p1, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ۟:F

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    return-object p1
.end method
