.class public final Ls22;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ln72;

.field public final β:Lg62;

.field public final γ:Ljava/lang/Object;

.field public final δ:Ljava/lang/Object;

.field public final ε:Lc4;

.field public final ζ:Lc4;

.field public final η:Lc4;

.field public θ:J

.field public ι:Lc4;


# direct methods
.method public constructor <init>(Lw3;Lg62;Ljava/lang/Object;Ljava/lang/Object;Lc4;)V
    .locals 0

    .line 1
    invoke-interface {p1, p2}, Lw3;->α(Lg62;)Ln72;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ls22;->α:Ln72;

    .line 9
    .line 10
    iput-object p2, p0, Ls22;->β:Lg62;

    .line 11
    .line 12
    iput-object p4, p0, Ls22;->γ:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p3, p0, Ls22;->δ:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object p1, p2, Lg62;->α:La80;

    .line 17
    .line 18
    invoke-interface {p1, p3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lc4;

    .line 23
    .line 24
    iput-object p1, p0, Ls22;->ε:Lc4;

    .line 25
    .line 26
    iget-object p1, p2, Lg62;->α:La80;

    .line 27
    .line 28
    invoke-interface {p1, p4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, Lc4;

    .line 33
    .line 34
    iput-object p2, p0, Ls22;->ζ:Lc4;

    .line 35
    .line 36
    if-eqz p5, :cond_0

    .line 37
    .line 38
    invoke-static {p5}, Lyh;->υ(Lc4;)Lc4;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p1, p3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lc4;

    .line 48
    .line 49
    invoke-virtual {p1}, Lc4;->γ()Lc4;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    iput-object p1, p0, Ls22;->η:Lc4;

    .line 54
    .line 55
    const-wide/16 p1, -0x1

    .line 56
    .line 57
    iput-wide p1, p0, Ls22;->θ:J

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TargetBasedAnimation: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ls22;->δ:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " -> "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ls22;->γ:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ",initial velocity: "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ls22;->η:Lc4;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", duration: "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ls22;->α()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    const-wide/32 v3, 0xf4240

    .line 43
    .line 44
    .line 45
    div-long/2addr v1, v3

    .line 46
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, " ms,animationSpec: "

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Ls22;->α:Ln72;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public final α()J
    .locals 4

    .line 1
    iget-wide v0, p0, Ls22;->θ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ls22;->ζ:Lc4;

    .line 10
    .line 11
    iget-object v1, p0, Ls22;->η:Lc4;

    .line 12
    .line 13
    iget-object v2, p0, Ls22;->α:Ln72;

    .line 14
    .line 15
    iget-object v3, p0, Ls22;->ε:Lc4;

    .line 16
    .line 17
    invoke-interface {v2, v3, v0, v1}, Ln72;->κ(Lc4;Lc4;Lc4;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p0, Ls22;->θ:J

    .line 22
    .line 23
    :cond_0
    iget-wide v0, p0, Ls22;->θ:J

    .line 24
    .line 25
    return-wide v0
.end method

.method public final β(J)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ls22;->α()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long v0, p1, v0

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ls22;->γ:Ljava/lang/Object;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v4, p0, Ls22;->ζ:Lc4;

    .line 13
    .line 14
    iget-object v5, p0, Ls22;->η:Lc4;

    .line 15
    .line 16
    iget-object v0, p0, Ls22;->α:Ln72;

    .line 17
    .line 18
    iget-object v3, p0, Ls22;->ε:Lc4;

    .line 19
    .line 20
    move-wide v1, p1

    .line 21
    invoke-interface/range {v0 .. v5}, Ln72;->θ(JLc4;Lc4;Lc4;)Lc4;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lc4;->β()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-ge v0, p2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lc4;->α(I)F

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v4, "AnimationVector cannot contain a NaN. "

    .line 45
    .line 46
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v4, ". Animation: "

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v4, ", playTimeNanos: "

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v3}, Lri1;->β(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-object p0, p0, Ls22;->β:Lg62;

    .line 79
    .line 80
    iget-object p0, p0, Lg62;->β:La80;

    .line 81
    .line 82
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public final γ(J)Lc4;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ls22;->α()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long v0, p1, v0

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Ls22;->ι:Lc4;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Ls22;->ζ:Lc4;

    .line 14
    .line 15
    iget-object p2, p0, Ls22;->η:Lc4;

    .line 16
    .line 17
    iget-object v0, p0, Ls22;->α:Ln72;

    .line 18
    .line 19
    iget-object v1, p0, Ls22;->ε:Lc4;

    .line 20
    .line 21
    invoke-interface {v0, v1, p1, p2}, Ln72;->ι(Lc4;Lc4;Lc4;)Lc4;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Ls22;->ι:Lc4;

    .line 26
    .line 27
    :cond_0
    return-object p1

    .line 28
    :cond_1
    iget-object v4, p0, Ls22;->ζ:Lc4;

    .line 29
    .line 30
    iget-object v5, p0, Ls22;->η:Lc4;

    .line 31
    .line 32
    iget-object v0, p0, Ls22;->α:Ln72;

    .line 33
    .line 34
    iget-object v3, p0, Ls22;->ε:Lc4;

    .line 35
    .line 36
    move-wide v1, p1

    .line 37
    invoke-interface/range {v0 .. v5}, Ln72;->ζ(JLc4;Lc4;Lc4;)Lc4;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method
