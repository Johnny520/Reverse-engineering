.class public final Lma;
.super Lin;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final β:F

.field public final γ:F

.field public final δ:I


# direct methods
.method public constructor <init>(FFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lma;->β:F

    .line 5
    .line 6
    iput p2, p0, Lma;->γ:F

    .line 7
    .line 8
    iput p3, p0, Lma;->δ:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lma;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lma;

    .line 10
    .line 11
    iget v0, p1, Lma;->β:F

    .line 12
    .line 13
    iget v1, p0, Lma;->β:F

    .line 14
    .line 15
    cmpg-float v0, v1, v0

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget v0, p0, Lma;->γ:F

    .line 20
    .line 21
    iget v1, p1, Lma;->γ:F

    .line 22
    .line 23
    cmpg-float v0, v0, v1

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget p0, p0, Lma;->δ:I

    .line 28
    .line 29
    iget p1, p1, Lma;->δ:I

    .line 30
    .line 31
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lma;->β:F

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
    iget v2, p0, Lma;->γ:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p0, p0, Lma;->δ:I

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

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
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BlurEffect(renderEffect=null, radiusX="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lma;->β:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", radiusY="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lma;->γ:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", edgeTreatment="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget p0, p0, Lma;->δ:I

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    const-string p0, "Clamp"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x1

    .line 36
    if-ne p0, v1, :cond_1

    .line 37
    .line 38
    const-string p0, "Repeated"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v1, 0x2

    .line 42
    if-ne p0, v1, :cond_2

    .line 43
    .line 44
    const-string p0, "Mirror"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 v1, 0x3

    .line 48
    if-ne p0, v1, :cond_3

    .line 49
    .line 50
    const-string p0, "Decal"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const-string p0, "Unknown"

    .line 54
    .line 55
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/16 p0, 0x29

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public final ε()Landroid/graphics/RenderEffect;
    .locals 4

    .line 1
    iget v0, p0, Lma;->β:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, v0, v1

    .line 5
    .line 6
    iget v3, p0, Lma;->γ:F

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    cmpg-float v1, v3, v1

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lp1;->δ()Landroid/graphics/RenderEffect;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget p0, p0, Lma;->δ:I

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x1

    .line 27
    if-ne p0, v1, :cond_2

    .line 28
    .line 29
    sget-object p0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 v1, 0x2

    .line 33
    if-ne p0, v1, :cond_3

    .line 34
    .line 35
    sget-object p0, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const/4 v1, 0x3

    .line 39
    if-ne p0, v1, :cond_5

    .line 40
    .line 41
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v1, 0x1f

    .line 44
    .line 45
    if-lt p0, v1, :cond_4

    .line 46
    .line 47
    invoke-static {}, Lk42;->β()Landroid/graphics/Shader$TileMode;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    goto :goto_0

    .line 52
    :cond_4
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 56
    .line 57
    :goto_0
    invoke-static {v0, v3, p0}, Lp1;->ε(FFLandroid/graphics/Shader$TileMode;)Landroid/graphics/RenderEffect;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method
