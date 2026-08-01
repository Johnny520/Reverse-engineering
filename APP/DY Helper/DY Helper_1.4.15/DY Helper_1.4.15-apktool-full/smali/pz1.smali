.class public final Lpz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lw3;


# instance fields
.field public final α:F

.field public final β:F

.field public final γ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FFLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lpz1;->α:F

    .line 5
    .line 6
    iput p2, p0, Lpz1;->β:F

    .line 7
    .line 8
    iput-object p3, p0, Lpz1;->γ:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lpz1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lpz1;

    .line 7
    .line 8
    iget v0, p1, Lpz1;->α:F

    .line 9
    .line 10
    iget v2, p0, Lpz1;->α:F

    .line 11
    .line 12
    cmpg-float v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget v0, p1, Lpz1;->β:F

    .line 17
    .line 18
    iget v2, p0, Lpz1;->β:F

    .line 19
    .line 20
    cmpg-float v0, v0, v2

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p1, p1, Lpz1;->γ:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object p0, p0, Lpz1;->γ:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lpz1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget v2, p0, Lpz1;->α:F

    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget p0, p0, Lpz1;->β:F

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v0

    .line 27
    return p0
.end method

.method public final α(Lg62;)Ln72;
    .locals 8

    .line 1
    new-instance v0, Ly21;

    .line 2
    .line 3
    iget-object v1, p0, Lpz1;->γ:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p1, Lg62;->α:La80;

    .line 10
    .line 11
    invoke-interface {p1, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lc4;

    .line 16
    .line 17
    :goto_0
    sget v1, Lm72;->α:I

    .line 18
    .line 19
    iget v1, p0, Lpz1;->α:F

    .line 20
    .line 21
    iget p0, p0, Lpz1;->β:F

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    new-instance v2, Ly21;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lc4;->β()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    new-array v4, v3, [Le40;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    :goto_1
    if-ge v5, v3, :cond_1

    .line 38
    .line 39
    new-instance v6, Le40;

    .line 40
    .line 41
    invoke-virtual {p1, v5}, Lc4;->α(I)F

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-direct {v6, v1, p0, v7}, Le40;-><init>(FFF)V

    .line 46
    .line 47
    .line 48
    aput-object v6, v4, v5

    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iput-object v4, v2, Ly21;->ε:Ljava/lang/Object;

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    new-instance v2, Ll72;

    .line 57
    .line 58
    invoke-direct {v2, v1, p0}, Ll72;-><init>(FF)V

    .line 59
    .line 60
    .line 61
    :goto_2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance p0, Li0;

    .line 65
    .line 66
    invoke-direct {p0, v2}, Li0;-><init>(Ld4;)V

    .line 67
    .line 68
    .line 69
    iput-object p0, v0, Ly21;->ε:Ljava/lang/Object;

    .line 70
    .line 71
    return-object v0
.end method
