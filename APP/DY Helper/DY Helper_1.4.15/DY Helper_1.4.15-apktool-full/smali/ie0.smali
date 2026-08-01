.class public final Lie0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:F

.field public final β:F

.field public final γ:Lla;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lie0;

    .line 2
    .line 3
    sget-object v1, Lla;->η:Lla;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lie0;-><init>(Lla;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lie0;

    .line 9
    .line 10
    sget-object v1, Lla;->θ:Lla;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lie0;-><init>(Lla;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lie0;

    .line 16
    .line 17
    sget-object v1, Lla;->ι:Lla;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lie0;-><init>(Lla;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lie0;

    .line 23
    .line 24
    sget-object v1, Lla;->κ:Lla;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lie0;-><init>(Lla;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lie0;

    .line 30
    .line 31
    sget-object v1, Lla;->λ:Lla;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lie0;-><init>(Lla;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lie0;

    .line 37
    .line 38
    sget-object v1, Lla;->μ:Lla;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lie0;-><init>(Lla;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(FFLla;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lie0;->α:F

    .line 8
    .line 9
    iput p2, p0, Lie0;->β:F

    .line 10
    .line 11
    iput-object p3, p0, Lie0;->γ:Lla;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lla;)V
    .locals 2

    const-wide v0, 0x3fe999999999999aL    # 0.8

    double-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    invoke-direct {p0, v0, v1, p1}, Lie0;-><init>(FFLla;)V

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
    instance-of v0, p1, Lie0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lie0;

    .line 10
    .line 11
    iget v0, p0, Lie0;->α:F

    .line 12
    .line 13
    iget v1, p1, Lie0;->α:F

    .line 14
    .line 15
    invoke-static {v0, v1}, Liv;->β(FF)Z

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
    iget v0, p0, Lie0;->β:F

    .line 23
    .line 24
    iget v1, p1, Lie0;->β:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object p0, p0, Lie0;->γ:Lla;

    .line 34
    .line 35
    iget-object p1, p1, Lie0;->γ:Lla;

    .line 36
    .line 37
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lie0;->α:F

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
    iget v2, p0, Lie0;->β:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, Lie0;->γ:Lla;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lie0;->α:F

    .line 2
    .line 3
    invoke-static {v0}, Liv;->γ(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Highlight(width="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", alpha="

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lie0;->β:F

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", style="

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lie0;->γ:Lla;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, ")"

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
