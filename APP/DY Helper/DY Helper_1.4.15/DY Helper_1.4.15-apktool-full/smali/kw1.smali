.class final Lkw1;
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

.field public final β:F

.field public final γ:F

.field public final δ:F

.field public final ε:Z


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p1, p0, Lkw1;->α:F

    .line 29
    iput p2, p0, Lkw1;->β:F

    .line 30
    iput p3, p0, Lkw1;->γ:F

    .line 31
    iput p4, p0, Lkw1;->δ:F

    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Lkw1;->ε:Z

    return-void
.end method

.method public synthetic constructor <init>(FFFFI)V
    .locals 2

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move p1, v1

    .line 8
    :cond_0
    and-int/lit8 v0, p5, 0x2

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move p2, v1

    .line 13
    :cond_1
    and-int/lit8 v0, p5, 0x4

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    move p3, v1

    .line 18
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 19
    .line 20
    if-eqz p5, :cond_3

    .line 21
    .line 22
    move p4, v1

    .line 23
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lkw1;-><init>(FFFF)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lkw1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lkw1;

    .line 10
    .line 11
    iget v0, p1, Lkw1;->α:F

    .line 12
    .line 13
    iget v1, p0, Lkw1;->α:F

    .line 14
    .line 15
    invoke-static {v1, v0}, Liv;->β(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget v0, p0, Lkw1;->β:F

    .line 23
    .line 24
    iget v1, p1, Lkw1;->β:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Liv;->β(FF)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget v0, p0, Lkw1;->γ:F

    .line 34
    .line 35
    iget v1, p1, Lkw1;->γ:F

    .line 36
    .line 37
    invoke-static {v0, v1}, Liv;->β(FF)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget v0, p0, Lkw1;->δ:F

    .line 45
    .line 46
    iget v1, p1, Lkw1;->δ:F

    .line 47
    .line 48
    invoke-static {v0, v1}, Liv;->β(FF)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean p0, p0, Lkw1;->ε:Z

    .line 56
    .line 57
    iget-boolean p1, p1, Lkw1;->ε:Z

    .line 58
    .line 59
    if-eq p0, p1, :cond_6

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lkw1;->α:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lkw1;->β:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lkw1;->γ:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lkw1;->δ:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean p0, p0, Lkw1;->ε:Z

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final δ()Lq01;
    .locals 2

    .line 1
    new-instance v0, Llw1;

    .line 2
    .line 3
    invoke-direct {v0}, Lq01;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lkw1;->α:F

    .line 7
    .line 8
    iput v1, v0, Llw1;->τ:F

    .line 9
    .line 10
    iget v1, p0, Lkw1;->β:F

    .line 11
    .line 12
    iput v1, v0, Llw1;->υ:F

    .line 13
    .line 14
    iget v1, p0, Lkw1;->γ:F

    .line 15
    .line 16
    iput v1, v0, Llw1;->φ:F

    .line 17
    .line 18
    iget v1, p0, Lkw1;->δ:F

    .line 19
    .line 20
    iput v1, v0, Llw1;->χ:F

    .line 21
    .line 22
    iget-boolean p0, p0, Lkw1;->ε:Z

    .line 23
    .line 24
    iput-boolean p0, v0, Llw1;->ψ:Z

    .line 25
    .line 26
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 1

    .line 1
    check-cast p1, Llw1;

    .line 2
    .line 3
    iget v0, p0, Lkw1;->α:F

    .line 4
    .line 5
    iput v0, p1, Llw1;->τ:F

    .line 6
    .line 7
    iget v0, p0, Lkw1;->β:F

    .line 8
    .line 9
    iput v0, p1, Llw1;->υ:F

    .line 10
    .line 11
    iget v0, p0, Lkw1;->γ:F

    .line 12
    .line 13
    iput v0, p1, Llw1;->φ:F

    .line 14
    .line 15
    iget v0, p0, Lkw1;->δ:F

    .line 16
    .line 17
    iput v0, p1, Llw1;->χ:F

    .line 18
    .line 19
    iget-boolean p0, p0, Lkw1;->ε:Z

    .line 20
    .line 21
    iput-boolean p0, p1, Llw1;->ψ:Z

    .line 22
    .line 23
    return-void
.end method
