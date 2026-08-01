.class final Lp41;
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


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lp41;->α:F

    .line 5
    .line 6
    iput p2, p0, Lp41;->β:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lp41;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lp41;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    iget v1, p0, Lp41;->α:F

    .line 17
    .line 18
    iget v2, p1, Lp41;->α:F

    .line 19
    .line 20
    invoke-static {v1, v2}, Liv;->β(FF)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iget p0, p0, Lp41;->β:F

    .line 27
    .line 28
    iget p1, p1, Lp41;->β:F

    .line 29
    .line 30
    invoke-static {p0, p1}, Liv;->β(FF)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    return v0

    .line 37
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lp41;->α:F

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
    iget p0, p0, Lp41;->β:F

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Llz1;->α(FII)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/2addr v0, p0

    .line 22
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "OffsetModifierElement(x="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lp41;->α:F

    .line 9
    .line 10
    invoke-static {v1}, Liv;->γ(F)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", y="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget p0, p0, Lp41;->β:F

    .line 23
    .line 24
    invoke-static {p0}, Liv;->γ(F)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ", rtlAware=true)"

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final δ()Lq01;
    .locals 2

    .line 1
    new-instance v0, Lq41;

    .line 2
    .line 3
    invoke-direct {v0}, Lq01;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lp41;->α:F

    .line 7
    .line 8
    iput v1, v0, Lq41;->τ:F

    .line 9
    .line 10
    iget p0, p0, Lp41;->β:F

    .line 11
    .line 12
    iput p0, v0, Lq41;->υ:F

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    iput-boolean p0, v0, Lq41;->φ:Z

    .line 16
    .line 17
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 4

    .line 1
    check-cast p1, Lq41;

    .line 2
    .line 3
    iget v0, p1, Lq41;->τ:F

    .line 4
    .line 5
    iget v1, p0, Lp41;->α:F

    .line 6
    .line 7
    invoke-static {v0, v1}, Liv;->β(FF)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget p0, p0, Lp41;->β:F

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget v0, p1, Lq41;->υ:F

    .line 17
    .line 18
    invoke-static {v0, p0}, Liv;->β(FF)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-boolean v0, p1, Lq41;->φ:Z

    .line 25
    .line 26
    if-eq v0, v2, :cond_1

    .line 27
    .line 28
    :cond_0
    invoke-static {p1}, Lh62;->ц(Lur;)Lyp0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {v0, v3}, Lyp0;->Τ(Z)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iput v1, p1, Lq41;->τ:F

    .line 37
    .line 38
    iput p0, p1, Lq41;->υ:F

    .line 39
    .line 40
    iput-boolean v2, p1, Lq41;->φ:Z

    .line 41
    .line 42
    return-void
.end method
