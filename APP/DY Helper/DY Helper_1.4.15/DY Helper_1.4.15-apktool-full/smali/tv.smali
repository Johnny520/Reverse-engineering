.class final Ltv;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final α:Lep0;

.field public final β:Lp70;

.field public final γ:La80;

.field public final δ:La80;

.field public final ε:La80;

.field public final ζ:Le80;

.field public final η:La80;

.field public final θ:Z


# direct methods
.method public constructor <init>(Lep0;Lp70;La80;La80;La80;Le80;La80;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ltv;->α:Lep0;

    .line 14
    .line 15
    iput-object p2, p0, Ltv;->β:Lp70;

    .line 16
    .line 17
    iput-object p3, p0, Ltv;->γ:La80;

    .line 18
    .line 19
    iput-object p4, p0, Ltv;->δ:La80;

    .line 20
    .line 21
    iput-object p5, p0, Ltv;->ε:La80;

    .line 22
    .line 23
    iput-object p6, p0, Ltv;->ζ:Le80;

    .line 24
    .line 25
    iput-object p7, p0, Ltv;->η:La80;

    .line 26
    .line 27
    iput-boolean p8, p0, Ltv;->θ:Z

    .line 28
    .line 29
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
    instance-of v0, p1, Ltv;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Ltv;

    .line 10
    .line 11
    iget-object v0, p1, Ltv;->α:Lep0;

    .line 12
    .line 13
    iget-object v1, p0, Ltv;->α:Lep0;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Ltv;->β:Lp70;

    .line 23
    .line 24
    iget-object v1, p1, Ltv;->β:Lp70;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Ltv;->γ:La80;

    .line 34
    .line 35
    iget-object v1, p1, Ltv;->γ:La80;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Ltv;->δ:La80;

    .line 45
    .line 46
    iget-object v1, p1, Ltv;->δ:La80;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Ltv;->ε:La80;

    .line 56
    .line 57
    iget-object v1, p1, Ltv;->ε:La80;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, Ltv;->ζ:Le80;

    .line 67
    .line 68
    iget-object v1, p1, Ltv;->ζ:Le80;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object v0, p0, Ltv;->η:La80;

    .line 78
    .line 79
    iget-object v1, p1, Ltv;->η:La80;

    .line 80
    .line 81
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_8

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_8
    iget-boolean p0, p0, Ltv;->θ:Z

    .line 89
    .line 90
    iget-boolean p1, p1, Ltv;->θ:Z

    .line 91
    .line 92
    if-eq p0, p1, :cond_9

    .line 93
    .line 94
    :goto_0
    const/4 p0, 0x0

    .line 95
    return p0

    .line 96
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 97
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Ltv;->α:Lep0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Ltv;->β:Lp70;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Ltv;->γ:La80;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    const/4 v2, 0x0

    .line 27
    iget-object v3, p0, Ltv;->δ:La80;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v3, v2

    .line 37
    :goto_0
    add-int/2addr v0, v3

    .line 38
    mul-int/2addr v0, v1

    .line 39
    iget-object v3, p0, Ltv;->ε:La80;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v3, v2

    .line 49
    :goto_1
    add-int/2addr v0, v3

    .line 50
    mul-int/lit16 v0, v0, 0x3c1

    .line 51
    .line 52
    iget-object v3, p0, Ltv;->ζ:Le80;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    add-int/2addr v3, v0

    .line 59
    mul-int/2addr v3, v1

    .line 60
    iget-object v0, p0, Ltv;->η:La80;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    :cond_2
    add-int/2addr v3, v2

    .line 69
    mul-int/lit16 v3, v3, 0x3c1

    .line 70
    .line 71
    const/4 v0, 0x3

    .line 72
    invoke-static {v0, v3, v1}, La12;->α(III)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean p0, p0, Ltv;->θ:Z

    .line 77
    .line 78
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v0

    .line 83
    return p0
.end method

.method public final δ()Lq01;
    .locals 9

    .line 1
    new-instance v0, Law;

    .line 2
    .line 3
    iget-object v7, p0, Ltv;->η:La80;

    .line 4
    .line 5
    iget-boolean v8, p0, Ltv;->θ:Z

    .line 6
    .line 7
    iget-object v1, p0, Ltv;->α:Lep0;

    .line 8
    .line 9
    iget-object v2, p0, Ltv;->β:Lp70;

    .line 10
    .line 11
    iget-object v3, p0, Ltv;->γ:La80;

    .line 12
    .line 13
    iget-object v4, p0, Ltv;->δ:La80;

    .line 14
    .line 15
    iget-object v5, p0, Ltv;->ε:La80;

    .line 16
    .line 17
    iget-object v6, p0, Ltv;->ζ:Le80;

    .line 18
    .line 19
    invoke-direct/range {v0 .. v8}, Law;-><init>(Lep0;Lp70;La80;La80;La80;Le80;La80;Z)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 4

    .line 1
    check-cast p1, Law;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, Law;->Α:Z

    .line 7
    .line 8
    iget-boolean v1, p0, Ltv;->θ:Z

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Ltv;->α:Lep0;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iput-object v2, p1, Law;->τ:Lep0;

    .line 21
    .line 22
    iget-object v2, p0, Ltv;->β:Lp70;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v3, p1, Law;->Β:Lkv1;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iput-object v2, v3, Lkv1;->α:Lp70;

    .line 33
    .line 34
    iget-object v2, p0, Ltv;->γ:La80;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iput-object v2, p1, Law;->υ:La80;

    .line 40
    .line 41
    iget-object v2, p0, Ltv;->δ:La80;

    .line 42
    .line 43
    iput-object v2, p1, Law;->φ:La80;

    .line 44
    .line 45
    iget-object v2, p0, Ltv;->ε:La80;

    .line 46
    .line 47
    iput-object v2, p1, Law;->χ:La80;

    .line 48
    .line 49
    iget-object v2, p0, Ltv;->ζ:Le80;

    .line 50
    .line 51
    iput-object v2, p1, Law;->ψ:Le80;

    .line 52
    .line 53
    iget-object p0, p0, Ltv;->η:La80;

    .line 54
    .line 55
    iput-object p0, p1, Law;->ω:La80;

    .line 56
    .line 57
    iput-boolean v1, p1, Law;->Α:Z

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p1}, Law;->Ж()V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Lbd;->Α(Lqp0;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    new-instance p0, Lη;

    .line 70
    .line 71
    const/16 v0, 0x8

    .line 72
    .line 73
    invoke-direct {p0, v0, p1}, Lη;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p0}, Lln0;->а(Lq01;Lp70;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
