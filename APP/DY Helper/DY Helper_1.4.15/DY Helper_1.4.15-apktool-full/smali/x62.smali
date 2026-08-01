.class final Lx62;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final α:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lx62;->α:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lx62;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lx62;

    .line 7
    .line 8
    iget p1, p1, Lx62;->α:F

    .line 9
    .line 10
    iget p0, p0, Lx62;->α:F

    .line 11
    .line 12
    invoke-static {p0, p1}, Liv;->β(FF)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    invoke-static {p0, p0}, Liv;->β(FF)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget p0, p0, Lx62;->α:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/2addr v0, p0

    .line 16
    return v0
.end method

.method public final δ()Lq01;
    .locals 1

    .line 1
    new-instance v0, Ly62;

    .line 2
    .line 3
    invoke-direct {v0}, Lq01;-><init>()V

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lx62;->α:F

    .line 7
    .line 8
    iput p0, v0, Ly62;->τ:F

    .line 9
    .line 10
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 11
    .line 12
    iput p0, v0, Ly62;->υ:F

    .line 13
    .line 14
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 0

    .line 1
    check-cast p1, Ly62;

    .line 2
    .line 3
    iget p0, p0, Lx62;->α:F

    .line 4
    .line 5
    iput p0, p1, Ly62;->τ:F

    .line 6
    .line 7
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 8
    .line 9
    iput p0, p1, Ly62;->υ:F

    .line 10
    .line 11
    return-void
.end method
