.class public final Lbb0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lge;

.field public final β:Lfe;

.field public final γ:Landroid/graphics/RenderNode;

.field public δ:J

.field public ε:Landroid/graphics/Paint;

.field public ζ:Landroid/graphics/Matrix;

.field public η:Z

.field public θ:F

.field public ι:I

.field public κ:F

.field public λ:F

.field public μ:F

.field public ν:J

.field public ξ:J

.field public ο:F

.field public π:Z

.field public ρ:Z

.field public σ:Z

.field public τ:Lin;

.field public υ:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    new-instance v0, Lge;

    .line 2
    .line 3
    invoke-direct {v0}, Lge;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lfe;

    .line 7
    .line 8
    invoke-direct {v1}, Lfe;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lbb0;->α:Lge;

    .line 15
    .line 16
    iput-object v1, p0, Lbb0;->β:Lfe;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/RenderNode;

    .line 19
    .line 20
    const-string v1, "graphicsLayer"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroid/graphics/RenderNode;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 26
    .line 27
    const-wide/16 v1, 0x0

    .line 28
    .line 29
    iput-wide v1, p0, Lbb0;->δ:J

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/RenderNode;->setClipToBounds(Z)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Lbb0;->β(Landroid/graphics/RenderNode;I)V

    .line 36
    .line 37
    .line 38
    const/high16 v0, 0x3f800000    # 1.0f

    .line 39
    .line 40
    iput v0, p0, Lbb0;->θ:F

    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    iput v2, p0, Lbb0;->ι:I

    .line 44
    .line 45
    iput v0, p0, Lbb0;->κ:F

    .line 46
    .line 47
    iput v0, p0, Lbb0;->λ:F

    .line 48
    .line 49
    sget-wide v2, Lci;->β:J

    .line 50
    .line 51
    iput-wide v2, p0, Lbb0;->ν:J

    .line 52
    .line 53
    iput-wide v2, p0, Lbb0;->ξ:J

    .line 54
    .line 55
    const/high16 v0, 0x41000000    # 8.0f

    .line 56
    .line 57
    iput v0, p0, Lbb0;->ο:F

    .line 58
    .line 59
    iput v1, p0, Lbb0;->υ:I

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lbb0;->π:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v3, p0, Lbb0;->η:Z

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    move v3, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, p0, Lbb0;->η:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_1
    iget-boolean v0, p0, Lbb0;->ρ:Z

    .line 22
    .line 23
    iget-object v2, p0, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 24
    .line 25
    if-eq v3, v0, :cond_2

    .line 26
    .line 27
    iput-boolean v3, p0, Lbb0;->ρ:Z

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/graphics/RenderNode;->setClipToBounds(Z)Z

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-boolean v0, p0, Lbb0;->σ:Z

    .line 33
    .line 34
    if-eq v1, v0, :cond_3

    .line 35
    .line 36
    iput-boolean v1, p0, Lbb0;->σ:Z

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Landroid/graphics/RenderNode;->setClipToOutline(Z)Z

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void
.end method

.method public final β(Landroid/graphics/RenderNode;I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    iget-object p0, p0, Lbb0;->ε:Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-virtual {p1, v0, p0}, Landroid/graphics/RenderNode;->setUseCompositingLayer(ZLandroid/graphics/Paint;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/graphics/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Lbb0;->ε:Landroid/graphics/Paint;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x2

    .line 17
    if-ne p2, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v1, p0}, Landroid/graphics/RenderNode;->setUseCompositingLayer(ZLandroid/graphics/Paint;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/graphics/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {p1, v1, p0}, Landroid/graphics/RenderNode;->setUseCompositingLayer(ZLandroid/graphics/Paint;)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/graphics/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final γ()V
    .locals 5

    .line 1
    iget v0, p0, Lbb0;->υ:I

    .line 2
    .line 3
    iget-object v1, p0, Lbb0;->γ:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget v3, p0, Lbb0;->ι:I

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    if-ne v3, v4, :cond_2

    .line 13
    .line 14
    iget-object v3, p0, Lbb0;->τ:Lin;

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0, v1, v0}, Lbb0;->β(Landroid/graphics/RenderNode;I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    :goto_0
    invoke-virtual {p0, v1, v2}, Lbb0;->β(Landroid/graphics/RenderNode;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
