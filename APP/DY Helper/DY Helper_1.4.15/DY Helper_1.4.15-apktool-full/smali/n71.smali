.class public final Ln71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/lang/String;

.field public final ε:I

.field public final ζ:Ljava/lang/String;

.field public final η:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ln71;->α:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Ln71;->β:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Ln71;->γ:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Ln71;->δ:Ljava/lang/String;

    .line 14
    .line 15
    iput p5, p0, Ln71;->ε:I

    .line 16
    .line 17
    iput-object p6, p0, Ln71;->ζ:Ljava/lang/String;

    .line 18
    .line 19
    iput-boolean p7, p0, Ln71;->η:Z

    .line 20
    .line 21
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
    instance-of v0, p1, Ln71;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Ln71;

    .line 10
    .line 11
    iget-object v0, p0, Ln71;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Ln71;->α:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Ln71;->β:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, Ln71;->β:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Ln71;->γ:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, Ln71;->γ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Ln71;->δ:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, Ln71;->δ:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, Ln71;->ε:I

    .line 56
    .line 57
    iget v1, p1, Ln71;->ε:I

    .line 58
    .line 59
    if-eq v0, v1, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, Ln71;->ζ:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p1, Ln71;->ζ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget-boolean p0, p0, Ln71;->η:Z

    .line 74
    .line 75
    iget-boolean p1, p1, Ln71;->η:Z

    .line 76
    .line 77
    if-eq p0, p1, :cond_8

    .line 78
    .line 79
    :goto_0
    const/4 p0, 0x0

    .line 80
    return p0

    .line 81
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 82
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ln71;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Ln71;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Ln71;->γ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Ln71;->δ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Ln71;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Ln71;->ζ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean p0, p0, Ln71;->η:Z

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", subtitle="

    .line 4
    .line 5
    const-string v2, "SharePanelActionOption(id="

    .line 6
    .line 7
    iget-object v3, p0, Ln71;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Ln71;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", category="

    .line 16
    .line 17
    const-string v2, ", iconRes="

    .line 18
    .line 19
    iget-object v3, p0, Ln71;->γ:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Ln71;->δ:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", iconTint="

    .line 27
    .line 28
    const-string v2, ", requiresBeta="

    .line 29
    .line 30
    iget v3, p0, Ln71;->ε:I

    .line 31
    .line 32
    iget-object v4, p0, Ln71;->ζ:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ")"

    .line 38
    .line 39
    iget-boolean p0, p0, Ln71;->η:Z

    .line 40
    .line 41
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public final α(Z)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ln71;->η:Z

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 11
    return p0
.end method
