.class public abstract Lq31;
.super Ldw0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lkx0;
.implements Lmp0;
.implements Lx81;


# static fields
.field public static final Σ:Lio1;

.field public static final Τ:Ljp0;

.field public static final Υ:Ll31;

.field public static final Φ:Lrk0;


# instance fields
.field public Α:Lnp0;

.field public Β:F

.field public Γ:Lqx0;

.field public Δ:Lu11;

.field public Ε:J

.field public Ζ:F

.field public Η:La21;

.field public Θ:Ljp0;

.field public Ι:Liv1;

.field public Κ:Z

.field public Λ:Z

.field public Μ:Lwa0;

.field public Ν:Lde;

.field public Ξ:Ly1;

.field public final Ο:Ln31;

.field public Π:Z

.field public Ρ:Lw81;

.field public final σ:Lyp0;

.field public τ:Lq31;

.field public υ:Lq31;

.field public φ:Z

.field public χ:Z

.field public ψ:La80;

.field public ω:Lyr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio1;

    .line 2
    .line 3
    invoke-direct {v0}, Lio1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq31;->Σ:Lio1;

    .line 7
    .line 8
    new-instance v0, Ljp0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljp0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lq31;->Τ:Ljp0;

    .line 14
    .line 15
    new-instance v0, Ll31;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lq31;->Υ:Ll31;

    .line 21
    .line 22
    new-instance v0, Lrk0;

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    invoke-direct {v0, v1}, Lrk0;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lq31;->Φ:Lrk0;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Lyp0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldw0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq31;->σ:Lyp0;

    .line 5
    .line 6
    iget-object v0, p1, Lyp0;->Γ:Lyr;

    .line 7
    .line 8
    iput-object v0, p0, Lq31;->ω:Lyr;

    .line 9
    .line 10
    iget-object p1, p1, Lyp0;->Δ:Lnp0;

    .line 11
    .line 12
    iput-object p1, p0, Lq31;->Α:Lnp0;

    .line 13
    .line 14
    const p1, 0x3f4ccccd    # 0.8f

    .line 15
    .line 16
    .line 17
    iput p1, p0, Lq31;->Β:F

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, Lq31;->Ε:J

    .line 22
    .line 23
    sget-object p1, Lkn0;->ξ:Lpl1;

    .line 24
    .line 25
    iput-object p1, p0, Lq31;->Ι:Liv1;

    .line 26
    .line 27
    new-instance p1, Ln31;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p1, p0, v0}, Ln31;-><init>(Lq31;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lq31;->Ο:Ln31;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final getLayoutDirection()Lnp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    iget-object p0, p0, Lyp0;->Δ:Lnp0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final Φ(Lmp0;J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lq31;->Ω(Lmp0;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public final Χ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, Lq01;->σ:Z

    .line 6
    .line 7
    return p0
.end method

.method public final Ω(Lmp0;J)J
    .locals 3

    .line 1
    instance-of v0, p1, Lgw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lgw0;

    .line 6
    .line 7
    iget-object v0, p1, Lgw0;->ε:Lfw0;

    .line 8
    .line 9
    iget-object v0, v0, Lfw0;->σ:Lq31;

    .line 10
    .line 11
    invoke-virtual {v0}, Lq31;->ｃ()V

    .line 12
    .line 13
    .line 14
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    xor-long/2addr p2, v0

    .line 20
    invoke-virtual {p1, p0, p2, p3}, Lgw0;->Ω(Lmp0;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    xor-long/2addr p0, v0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    check-cast v0, Lgw0;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lgw0;->ε:Lfw0;

    .line 36
    .line 37
    iget-object v0, v0, Lfw0;->σ:Lq31;

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Lq31;

    .line 46
    .line 47
    :cond_3
    invoke-virtual {v0}, Lq31;->ｃ()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lq31;->С(Lq31;)Lq31;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_1
    if-eq v0, p1, :cond_5

    .line 55
    .line 56
    iget-object v1, v0, Lq31;->Ρ:Lw81;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-interface {v1, p2, p3, v2}, Lw81;->β(JZ)J

    .line 62
    .line 63
    .line 64
    move-result-wide p2

    .line 65
    :cond_4
    iget-wide v1, v0, Lq31;->Ε:J

    .line 66
    .line 67
    invoke-static {p2, p3, v1, v2}, Lh62;->с(JJ)J

    .line 68
    .line 69
    .line 70
    move-result-wide p2

    .line 71
    iget-object v0, v0, Lq31;->υ:Lq31;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Lq31;->Л(Lq31;J)J

    .line 78
    .line 79
    .line 80
    move-result-wide p0

    .line 81
    return-wide p0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    iget-object p0, p0, Lyp0;->Γ:Lyr;

    .line 4
    .line 5
    invoke-interface {p0}, Lyr;->β()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final δ(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lq31;->ｂ(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 19
    .line 20
    invoke-static {p0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->τ(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    iget-object p0, p0, Lyp0;->Γ:Lyr;

    .line 4
    .line 5
    invoke-interface {p0}, Lyr;->θ()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ι(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lq31;->ｂ(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 6
    .line 7
    invoke-static {p0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->Β()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->д:[F

    .line 15
    .line 16
    invoke-static {p0, p1, p2}, Lbd;->Ε([FJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    return-wide p0
.end method

.method public final λ()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    iget-object v1, v0, Lyp0;->Κ:Lk31;

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lk31;->δ(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_9

    .line 13
    .line 14
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, Lyp0;->Κ:Lk31;

    .line 18
    .line 19
    iget-object p0, p0, Lk31;->ε:Lq22;

    .line 20
    .line 21
    move-object v0, v3

    .line 22
    :goto_0
    if-eqz p0, :cond_8

    .line 23
    .line 24
    iget v1, p0, Lq01;->η:I

    .line 25
    .line 26
    and-int/2addr v1, v2

    .line 27
    if-eqz v1, :cond_7

    .line 28
    .line 29
    move-object v1, p0

    .line 30
    move-object v4, v3

    .line 31
    :goto_1
    if-eqz v1, :cond_7

    .line 32
    .line 33
    instance-of v5, v1, Ly91;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    check-cast v1, Ly91;

    .line 38
    .line 39
    invoke-interface {v1, v0}, Ly91;->л(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_4

    .line 44
    :cond_0
    iget v5, v1, Lq01;->η:I

    .line 45
    .line 46
    and-int/2addr v5, v2

    .line 47
    if-eqz v5, :cond_6

    .line 48
    .line 49
    instance-of v5, v1, Lya;

    .line 50
    .line 51
    if-eqz v5, :cond_6

    .line 52
    .line 53
    move-object v5, v1

    .line 54
    check-cast v5, Lya;

    .line 55
    .line 56
    iget-object v5, v5, Lya;->υ:Lq01;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    :goto_2
    const/4 v7, 0x1

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    iget v8, v5, Lq01;->η:I

    .line 63
    .line 64
    and-int/2addr v8, v2

    .line 65
    if-eqz v8, :cond_4

    .line 66
    .line 67
    add-int/lit8 v6, v6, 0x1

    .line 68
    .line 69
    if-ne v6, v7, :cond_1

    .line 70
    .line 71
    move-object v1, v5

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    if-nez v4, :cond_2

    .line 74
    .line 75
    new-instance v4, Lk21;

    .line 76
    .line 77
    const/16 v7, 0x10

    .line 78
    .line 79
    new-array v7, v7, [Lq01;

    .line 80
    .line 81
    invoke-direct {v4, v7}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v4, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object v1, v3

    .line 90
    :cond_3
    invoke-virtual {v4, v5}, Lk21;->β(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_3
    iget-object v5, v5, Lq01;->κ:Lq01;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    if-ne v6, v7, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    :goto_4
    invoke-static {v4}, Lh62;->γ(Lk21;)Lq01;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_1

    .line 104
    :cond_7
    iget-object p0, p0, Lq01;->ι:Lq01;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_8
    return-object v0

    .line 108
    :cond_9
    return-object v3
.end method

.method public final μ()Lmp0;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 6
    .line 7
    iget-object v1, p0, Lq31;->σ:Lyp0;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 14
    .line 15
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v2, v1

    .line 19
    :goto_0
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const-string v3, "\n|"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, " isAttached="

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lyp0;->Η()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, " modifier="

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, v2, Lyp0;->Ο:Lr01;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, " tail="

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lyp0;->σ()Lyp0;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lq31;->ｃ()V

    .line 76
    .line 77
    .line 78
    iget-object p0, v1, Lyp0;->Κ:Lk31;

    .line 79
    .line 80
    iget-object p0, p0, Lk31;->δ:Lq31;

    .line 81
    .line 82
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 83
    .line 84
    return-object p0
.end method

.method public final χ()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lq31;->φ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyp0;->Η()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final А()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->Γ:Lqx0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final Б()Lyp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final В()Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->Γ:Lqx0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Asking for measurement result of unmeasured layout modifier"

    .line 7
    .line 8
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final Г()Ldw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Д()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq31;->Ε:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final И()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lq31;->Ε:J

    .line 2
    .line 3
    iget v2, p0, Lq31;->Ζ:F

    .line 4
    .line 5
    iget-object v3, p0, Lq31;->ψ:La80;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, v3}, Lch1;->у(JFLa80;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final К(Lq31;La21;Z)V
    .locals 4

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lq31;->υ:Lq31;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lq31;->К(Lq31;La21;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, Lq31;->Ε:J

    .line 12
    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shr-long v2, v0, p1

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    iget v3, p2, La21;->α:F

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v3, v2

    .line 22
    iput v3, p2, La21;->α:F

    .line 23
    .line 24
    iget v3, p2, La21;->γ:F

    .line 25
    .line 26
    sub-float/2addr v3, v2

    .line 27
    iput v3, p2, La21;->γ:F

    .line 28
    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    long-to-int v0, v0

    .line 36
    iget v1, p2, La21;->β:F

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    iput v1, p2, La21;->β:F

    .line 41
    .line 42
    iget v1, p2, La21;->δ:F

    .line 43
    .line 44
    sub-float/2addr v1, v0

    .line 45
    iput v1, p2, La21;->δ:F

    .line 46
    .line 47
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-interface {v0, p2, v1}, Lw81;->δ(La21;Z)V

    .line 53
    .line 54
    .line 55
    iget-boolean v0, p0, Lq31;->χ:Z

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    iget-wide v0, p0, Lch1;->η:J

    .line 62
    .line 63
    shr-long p0, v0, p1

    .line 64
    .line 65
    long-to-int p0, p0

    .line 66
    int-to-float p0, p0

    .line 67
    and-long/2addr v0, v2

    .line 68
    long-to-int p1, v0

    .line 69
    int-to-float p1, p1

    .line 70
    const/4 p3, 0x0

    .line 71
    invoke-virtual {p2, p3, p3, p0, p1}, La21;->α(FFFF)V

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_0
    return-void
.end method

.method public final Л(Lq31;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, Lq31;->υ:Lq31;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Lq31;->Л(Lq31;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lq31;->Т(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lq31;->Т(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public final М(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Lch1;->н()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    sub-float/2addr v1, v2

    .line 16
    const-wide v2, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v2

    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Lch1;->м()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-float p0, p0

    .line 32
    sub-float/2addr p1, p0

    .line 33
    const/high16 p0, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v1, p0

    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-static {p2, v1}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    div-float/2addr p1, p0

    .line 42
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    int-to-long p1, p1

    .line 51
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    int-to-long v4, p0

    .line 56
    shl-long p0, p1, v0

    .line 57
    .line 58
    and-long v0, v4, v2

    .line 59
    .line 60
    or-long/2addr p0, v0

    .line 61
    return-wide p0
.end method

.method public final Н(JJ)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Lch1;->н()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p3, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lch1;->м()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    and-long v5, p3, v3

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpl-float v0, v0, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-virtual {p0, p3, p4}, Lq31;->М(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    shr-long v5, p3, v1

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    and-long/2addr p3, v3

    .line 55
    long-to-int p3, p3

    .line 56
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    shr-long v5, p1, v1

    .line 61
    .line 62
    long-to-int p4, v5

    .line 63
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    const/4 v5, 0x0

    .line 68
    cmpg-float v6, p4, v5

    .line 69
    .line 70
    if-gez v6, :cond_1

    .line 71
    .line 72
    neg-float p4, p4

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, Lch1;->н()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    int-to-float v6, v6

    .line 79
    sub-float/2addr p4, v6

    .line 80
    :goto_0
    invoke-static {v5, p4}, Ljava/lang/Math;->max(FF)F

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    and-long/2addr p1, v3

    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    cmpg-float p2, p1, v5

    .line 91
    .line 92
    if-gez p2, :cond_2

    .line 93
    .line 94
    neg-float p0, p1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, Lch1;->м()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    int-to-float p0, p0

    .line 101
    sub-float p0, p1, p0

    .line 102
    .line 103
    :goto_1
    invoke-static {v5, p0}, Ljava/lang/Math;->max(FF)F

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    int-to-long p1, p1

    .line 112
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    int-to-long v6, p0

    .line 117
    shl-long p0, p1, v1

    .line 118
    .line 119
    and-long/2addr v6, v3

    .line 120
    or-long/2addr p0, v6

    .line 121
    cmpl-float p2, v0, v5

    .line 122
    .line 123
    if-gtz p2, :cond_3

    .line 124
    .line 125
    cmpl-float p2, p3, v5

    .line 126
    .line 127
    if-lez p2, :cond_4

    .line 128
    .line 129
    :cond_3
    shr-long v5, p0, v1

    .line 130
    .line 131
    long-to-int p2, v5

    .line 132
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    cmpg-float p4, p4, v0

    .line 137
    .line 138
    if-gtz p4, :cond_4

    .line 139
    .line 140
    and-long/2addr p0, v3

    .line 141
    long-to-int p0, p0

    .line 142
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    cmpg-float p1, p1, p3

    .line 147
    .line 148
    if-gtz p1, :cond_4

    .line 149
    .line 150
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    mul-float/2addr p1, p1

    .line 159
    mul-float/2addr p0, p0

    .line 160
    add-float/2addr p0, p1

    .line 161
    return p0

    .line 162
    :cond_4
    return v2
.end method

.method public final О(Lde;Lwa0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lw81;->ζ(Lde;Lwa0;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-wide v0, p0, Lq31;->Ε:J

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shr-long v2, v0, v2

    .line 14
    .line 15
    long-to-int v2, v2

    .line 16
    int-to-float v2, v2

    .line 17
    const-wide v3, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v0, v3

    .line 23
    long-to-int v0, v0

    .line 24
    int-to-float v0, v0

    .line 25
    invoke-interface {p1, v2, v0}, Lde;->δ(FF)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lq31;->П(Lde;Lwa0;)V

    .line 29
    .line 30
    .line 31
    neg-float p0, v2

    .line 32
    neg-float p2, v0

    .line 33
    invoke-interface {p1, p0, p2}, Lde;->δ(FF)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final П(Lde;Lwa0;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lq31;->Ц(I)Lq01;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lq31;->ｉ(Lde;Lwa0;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, p0, Lq31;->σ:Lyp0;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSharedDrawScope()Laq0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, Lch1;->η:J

    .line 26
    .line 27
    invoke-static {v4, v5}, Ls1;->Ζ(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v10, v2

    .line 36
    :goto_0
    if-eqz v1, :cond_8

    .line 37
    .line 38
    instance-of v4, v1, Lbw;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    move-object v8, v1

    .line 43
    check-cast v8, Lbw;

    .line 44
    .line 45
    move-object v7, p0

    .line 46
    move-object v4, p1

    .line 47
    move-object v9, p2

    .line 48
    invoke-virtual/range {v3 .. v9}, Laq0;->δ(Lde;JLq31;Lbw;Lwa0;)V

    .line 49
    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_1
    move-object v7, p0

    .line 53
    move-object v4, p1

    .line 54
    move-object v9, p2

    .line 55
    iget p0, v1, Lq01;->η:I

    .line 56
    .line 57
    and-int/2addr p0, v0

    .line 58
    if-eqz p0, :cond_7

    .line 59
    .line 60
    instance-of p0, v1, Lya;

    .line 61
    .line 62
    if-eqz p0, :cond_7

    .line 63
    .line 64
    move-object p0, v1

    .line 65
    check-cast p0, Lya;

    .line 66
    .line 67
    iget-object p0, p0, Lya;->υ:Lq01;

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    :goto_1
    const/4 p2, 0x1

    .line 71
    if-eqz p0, :cond_6

    .line 72
    .line 73
    iget v8, p0, Lq01;->η:I

    .line 74
    .line 75
    and-int/2addr v8, v0

    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    if-ne p1, p2, :cond_2

    .line 81
    .line 82
    move-object v1, p0

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    if-nez v10, :cond_3

    .line 85
    .line 86
    new-instance v10, Lk21;

    .line 87
    .line 88
    const/16 p2, 0x10

    .line 89
    .line 90
    new-array p2, p2, [Lq01;

    .line 91
    .line 92
    invoke-direct {v10, p2}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    if-eqz v1, :cond_4

    .line 96
    .line 97
    invoke-virtual {v10, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v1, v2

    .line 101
    :cond_4
    invoke-virtual {v10, p0}, Lk21;->β(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    :goto_2
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    if-ne p1, p2, :cond_7

    .line 108
    .line 109
    :goto_3
    move-object p1, v4

    .line 110
    move-object p0, v7

    .line 111
    move-object p2, v9

    .line 112
    goto :goto_0

    .line 113
    :cond_7
    :goto_4
    invoke-static {v10}, Lh62;->γ(Lk21;)Lq01;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    goto :goto_3

    .line 118
    :cond_8
    return-void
.end method

.method public abstract Р()V
.end method

.method public final С(Lq31;)Lq31;
    .locals 5

    .line 1
    iget-object v0, p1, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    iget-object v1, p0, Lq31;->σ:Lyp0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lq31;->Х()Lq01;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Lq01;->ε:Lq01;

    .line 16
    .line 17
    iget-boolean v2, v2, Lq01;->σ:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "visitLocalAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v2}, Lam0;->β(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Lq01;->ε:Lq01;

    .line 27
    .line 28
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_7

    .line 31
    .line 32
    iget v2, v1, Lq01;->η:I

    .line 33
    .line 34
    and-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    if-ne v1, v0, :cond_1

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget v2, v0, Lyp0;->τ:I

    .line 45
    .line 46
    iget v3, v1, Lyp0;->τ:I

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object v2, v1

    .line 59
    :goto_2
    iget v3, v2, Lyp0;->τ:I

    .line 60
    .line 61
    iget v4, v0, Lyp0;->τ:I

    .line 62
    .line 63
    if-le v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, Lyp0;->σ()Lyp0;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_3
    if-eq v0, v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, Lyp0;->σ()Lyp0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    const-string p0, "layouts are not part of the same hierarchy"

    .line 89
    .line 90
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    return-object p0

    .line 95
    :cond_6
    if-ne v2, v1, :cond_8

    .line 96
    .line 97
    :cond_7
    return-object p0

    .line 98
    :cond_8
    iget-object p0, p1, Lq31;->σ:Lyp0;

    .line 99
    .line 100
    if-ne v0, p0, :cond_9

    .line 101
    .line 102
    :goto_4
    return-object p1

    .line 103
    :cond_9
    iget-object p0, v0, Lyp0;->Κ:Lk31;

    .line 104
    .line 105
    iget-object p0, p0, Lk31;->γ:Lgm0;

    .line 106
    .line 107
    return-object p0
.end method

.method public final Т(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lq31;->Ε:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long v3, p1, v2

    .line 6
    .line 7
    long-to-int v3, v3

    .line 8
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    shr-long v4, v0, v2

    .line 13
    .line 14
    long-to-int v4, v4

    .line 15
    int-to-float v4, v4

    .line 16
    sub-float/2addr v3, v4

    .line 17
    const-wide v4, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v4

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-long/2addr v0, v4

    .line 29
    long-to-int p2, v0

    .line 30
    int-to-float p2, p2

    .line 31
    sub-float/2addr p1, p2

    .line 32
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    int-to-long v0, p2

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-long p1, p1

    .line 42
    shl-long/2addr v0, v2

    .line 43
    and-long/2addr p1, v4

    .line 44
    or-long/2addr p1, v0

    .line 45
    iget-object p0, p0, Lq31;->Ρ:Lw81;

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-interface {p0, p1, p2, v0}, Lw81;->β(JZ)J

    .line 51
    .line 52
    .line 53
    move-result-wide p0

    .line 54
    return-wide p0

    .line 55
    :cond_0
    return-wide p1
.end method

.method public abstract У()Lfw0;
.end method

.method public final Ф()J
    .locals 3

    .line 1
    iget-object v0, p0, Lq31;->ω:Lyr;

    .line 2
    .line 3
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 4
    .line 5
    iget-object p0, p0, Lyp0;->Ε:Lg92;

    .line 6
    .line 7
    invoke-interface {p0}, Lg92;->β()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, Lyr;->Ψ(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public abstract Х()Lq01;
.end method

.method public final Ц(I)Lq01;
    .locals 2

    .line 1
    invoke-static {p1}, Lr31;->ζ(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lq31;->Ч(Z)Lq01;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_1
    if-eqz p0, :cond_3

    .line 22
    .line 23
    iget v0, p0, Lq01;->θ:I

    .line 24
    .line 25
    and-int/2addr v0, p1

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget v0, p0, Lq01;->η:I

    .line 29
    .line 30
    and-int/2addr v0, p1

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    if-eq p0, v1, :cond_3

    .line 35
    .line 36
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public final Ч(Z)Lq01;
    .locals 2

    .line 1
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    iget-object v0, v0, Lyp0;->Κ:Lk31;

    .line 4
    .line 5
    iget-object v1, v0, Lk31;->δ:Lq31;

    .line 6
    .line 7
    if-ne v1, p0, :cond_0

    .line 8
    .line 9
    iget-object p0, v0, Lk31;->ζ:Lq01;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    if-eqz p0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final Ш(Lq01;Lm31;JLne0;IZ)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-virtual/range {v0 .. v6}, Lq31;->Ю(Lm31;JLne0;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-interface {p2, p1}, Lm31;->γ(Lq01;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p2}, Lm31;->β()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1, v0}, Lkn0;->η(Lur;I)Lq01;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual/range {p0 .. p7}, Lq31;->Ш(Lq01;Lm31;JLne0;IZ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget v0, p5, Lne0;->η:I

    .line 32
    .line 33
    iget-object v1, p5, Lne0;->ε:Lv11;

    .line 34
    .line 35
    add-int/lit8 v2, v0, 0x1

    .line 36
    .line 37
    iget v3, v1, Lv11;->β:I

    .line 38
    .line 39
    invoke-virtual {p5, v2, v3}, Lne0;->β(II)V

    .line 40
    .line 41
    .line 42
    iget v2, p5, Lne0;->η:I

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    iput v2, p5, Lne0;->η:I

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Lv11;->α(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p5, Lne0;->ζ:Lq11;

    .line 52
    .line 53
    const/high16 v2, -0x40800000    # -1.0f

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static {v2, p7, v3}, Lkn0;->γ(FZZ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3}, Lq11;->α(J)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Lm31;->β()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {p1, v1}, Lkn0;->η(Lur;I)Lq01;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual/range {p0 .. p7}, Lq31;->Ш(Lq01;Lm31;JLne0;IZ)V

    .line 72
    .line 73
    .line 74
    iput v0, p5, Lne0;->η:I

    .line 75
    .line 76
    return-void
.end method

.method public final Щ(Lq01;Lm31;JLne0;IZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, Lq31;->Ю(Lm31;JLne0;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p2, p1}, Lm31;->γ(Lq01;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Lm31;->β()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, Lkn0;->η(Lur;I)Lq01;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v0, p0

    .line 31
    move-object v2, p2

    .line 32
    move-wide v3, p3

    .line 33
    move-object/from16 v5, p5

    .line 34
    .line 35
    move/from16 v6, p6

    .line 36
    .line 37
    move/from16 v7, p7

    .line 38
    .line 39
    move/from16 v8, p8

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v8}, Lq31;->Щ(Lq01;Lm31;JLne0;IZF)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    move-object/from16 v5, p5

    .line 46
    .line 47
    iget v10, v5, Lne0;->η:I

    .line 48
    .line 49
    iget-object v0, v5, Lne0;->ε:Lv11;

    .line 50
    .line 51
    add-int/lit8 v1, v10, 0x1

    .line 52
    .line 53
    iget v2, v0, Lv11;->β:I

    .line 54
    .line 55
    invoke-virtual {v5, v1, v2}, Lne0;->β(II)V

    .line 56
    .line 57
    .line 58
    iget v1, v5, Lne0;->η:I

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    iput v1, v5, Lne0;->η:I

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lv11;->α(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, Lne0;->ζ:Lq11;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    move/from16 v7, p7

    .line 71
    .line 72
    move/from16 v8, p8

    .line 73
    .line 74
    invoke-static {v8, v7, v1}, Lkn0;->γ(FZZ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    invoke-virtual {v0, v1, v2}, Lq11;->α(J)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, Lm31;->β()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {p1, v0}, Lkn0;->η(Lur;I)Lq01;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const/4 v9, 0x1

    .line 90
    move-object v0, p0

    .line 91
    move-object v2, p2

    .line 92
    move-wide v3, p3

    .line 93
    move/from16 v6, p6

    .line 94
    .line 95
    invoke-virtual/range {v0 .. v9}, Lq31;->ｈ(Lq01;Lm31;JLne0;IZFZ)V

    .line 96
    .line 97
    .line 98
    iput v10, v5, Lne0;->η:I

    .line 99
    .line 100
    return-void
.end method

.method public final Э(Lm31;JLne0;IZ)V
    .locals 14

    .line 1
    move-wide/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p5

    .line 6
    .line 7
    invoke-interface {p1}, Lm31;->β()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, Lq31;->Ц(I)Lq01;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v3, v4}, Lq31;->ｒ(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 21
    .line 22
    const v10, 0x7fffffff

    .line 23
    .line 24
    .line 25
    const/4 v11, 0x1

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    if-ne v6, v11, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lq31;->Ф()J

    .line 31
    .line 32
    .line 33
    move-result-wide v12

    .line 34
    invoke-virtual {p0, v3, v4, v12, v13}, Lq31;->Н(JJ)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    and-int/2addr v2, v10

    .line 43
    if-ge v2, v9, :cond_1

    .line 44
    .line 45
    iget v2, v5, Lne0;->η:I

    .line 46
    .line 47
    iget-object v7, v5, Lne0;->ε:Lv11;

    .line 48
    .line 49
    iget v7, v7, Lv11;->β:I

    .line 50
    .line 51
    sub-int/2addr v7, v11

    .line 52
    if-ne v2, v7, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0, v8, v8}, Lkn0;->γ(FZZ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v5}, Lne0;->α()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    invoke-static {v9, v10, v7, v8}, Lxb;->ξ(JJ)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_1

    .line 68
    .line 69
    :goto_0
    const/4 v7, 0x0

    .line 70
    move-object v2, p1

    .line 71
    move v8, v0

    .line 72
    move-object v0, p0

    .line 73
    invoke-virtual/range {v0 .. v8}, Lq31;->Щ(Lq01;Lm31;JLne0;IZF)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void

    .line 77
    :cond_2
    if-nez v1, :cond_3

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p6}, Lq31;->Ю(Lm31;JLne0;IZ)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const/16 v0, 0x20

    .line 84
    .line 85
    shr-long v2, p2, v0

    .line 86
    .line 87
    long-to-int v0, v2

    .line 88
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const-wide v2, 0xffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    and-long v2, p2, v2

    .line 98
    .line 99
    long-to-int v2, v2

    .line 100
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, 0x0

    .line 105
    cmpl-float v4, v0, v3

    .line 106
    .line 107
    if-ltz v4, :cond_4

    .line 108
    .line 109
    cmpl-float v3, v2, v3

    .line 110
    .line 111
    if-ltz v3, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0}, Lch1;->н()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    int-to-float v3, v3

    .line 118
    cmpg-float v0, v0, v3

    .line 119
    .line 120
    if-gez v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, Lch1;->м()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-float v0, v0

    .line 127
    cmpg-float v0, v2, v0

    .line 128
    .line 129
    if-gez v0, :cond_4

    .line 130
    .line 131
    move-object v0, p0

    .line 132
    move-object v2, p1

    .line 133
    move-wide/from16 v3, p2

    .line 134
    .line 135
    move-object/from16 v5, p4

    .line 136
    .line 137
    move/from16 v6, p5

    .line 138
    .line 139
    move/from16 v7, p6

    .line 140
    .line 141
    invoke-virtual/range {v0 .. v7}, Lq31;->Ш(Lq01;Lm31;JLne0;IZ)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    move-wide/from16 v3, p2

    .line 146
    .line 147
    move-object/from16 v5, p4

    .line 148
    .line 149
    move/from16 v6, p5

    .line 150
    .line 151
    if-ne v6, v11, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0}, Lq31;->Ф()J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    invoke-virtual {p0, v3, v4, v12, v13}, Lq31;->Н(JJ)F

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    goto :goto_1

    .line 162
    :cond_5
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 163
    .line 164
    :goto_1
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    and-int/2addr v7, v10

    .line 169
    if-ge v7, v9, :cond_7

    .line 170
    .line 171
    iget v7, v5, Lne0;->η:I

    .line 172
    .line 173
    iget-object v9, v5, Lne0;->ε:Lv11;

    .line 174
    .line 175
    iget v9, v9, Lv11;->β:I

    .line 176
    .line 177
    sub-int/2addr v9, v11

    .line 178
    if-ne v7, v9, :cond_6

    .line 179
    .line 180
    move/from16 v7, p6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    move/from16 v7, p6

    .line 184
    .line 185
    invoke-static {v2, v7, v8}, Lkn0;->γ(FZZ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-virtual {v5}, Lne0;->α()J

    .line 190
    .line 191
    .line 192
    move-result-wide v12

    .line 193
    invoke-static {v12, v13, v9, v10}, Lxb;->ξ(JJ)I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-lez v9, :cond_8

    .line 198
    .line 199
    :goto_2
    move v9, v11

    .line 200
    :goto_3
    move-object v0, p0

    .line 201
    move v8, v2

    .line 202
    move-object v2, p1

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move/from16 v7, p6

    .line 205
    .line 206
    :cond_8
    move v9, v8

    .line 207
    goto :goto_3

    .line 208
    :goto_4
    invoke-virtual/range {v0 .. v9}, Lq31;->ｈ(Lq01;Lm31;JLne0;IZFZ)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public Ю(Lm31;JLne0;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->τ:Lq31;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lq31;->Т(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    invoke-virtual/range {p0 .. p6}, Lq31;->Э(Lm31;JLne0;IZ)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final Я()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw81;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lq31;->Я()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final ж(Lmp0;Z)Lml1;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Lmp0;->Χ()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "LayoutCoordinates "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " is not attached!"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    instance-of v0, p1, Lgw0;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    move-object v0, p1

    .line 47
    check-cast v0, Lgw0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, v0, Lgw0;->ε:Lfw0;

    .line 54
    .line 55
    iget-object v0, v0, Lfw0;->σ:Lq31;

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    :cond_3
    move-object v0, p1

    .line 60
    check-cast v0, Lq31;

    .line 61
    .line 62
    :cond_4
    invoke-virtual {v0}, Lq31;->ｃ()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lq31;->С(Lq31;)Lq31;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, Lq31;->Η:La21;

    .line 70
    .line 71
    if-nez v2, :cond_5

    .line 72
    .line 73
    new-instance v2, La21;

    .line 74
    .line 75
    invoke-direct {v2}, La21;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, Lq31;->Η:La21;

    .line 79
    .line 80
    :cond_5
    const/4 v3, 0x0

    .line 81
    iput v3, v2, La21;->α:F

    .line 82
    .line 83
    iput v3, v2, La21;->β:F

    .line 84
    .line 85
    invoke-interface {p1}, Lmp0;->з()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    const/16 v5, 0x20

    .line 90
    .line 91
    shr-long/2addr v3, v5

    .line 92
    long-to-int v3, v3

    .line 93
    int-to-float v3, v3

    .line 94
    iput v3, v2, La21;->γ:F

    .line 95
    .line 96
    invoke-interface {p1}, Lmp0;->з()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    const-wide v5, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v3, v5

    .line 106
    long-to-int p1, v3

    .line 107
    int-to-float p1, p1

    .line 108
    iput p1, v2, La21;->δ:F

    .line 109
    .line 110
    :goto_1
    if-eq v0, v1, :cond_7

    .line 111
    .line 112
    const/4 p1, 0x0

    .line 113
    invoke-virtual {v0, v2, p2, p1}, Lq31;->ｋ(La21;ZZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, La21;->β()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    sget-object p0, Lml1;->ε:Lml1;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_6
    iget-object v0, v0, Lq31;->υ:Lq31;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    invoke-virtual {p0, v1, v2, p2}, Lq31;->К(Lq31;La21;Z)V

    .line 132
    .line 133
    .line 134
    new-instance p0, Lml1;

    .line 135
    .line 136
    iget p1, v2, La21;->α:F

    .line 137
    .line 138
    iget p2, v2, La21;->β:F

    .line 139
    .line 140
    iget v0, v2, La21;->γ:F

    .line 141
    .line 142
    iget v1, v2, La21;->δ:F

    .line 143
    .line 144
    invoke-direct {p0, p1, p2, v0, v1}, Lml1;-><init>(FFFF)V

    .line 145
    .line 146
    .line 147
    return-object p0
.end method

.method public final з()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lch1;->η:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final ю()Ldw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->τ:Lq31;

    .line 2
    .line 3
    return-object p0
.end method

.method public final я()Lmp0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ａ()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lq31;->Β:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lq31;->ａ()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final ｂ(J)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lq31;->ｃ()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 20
    .line 21
    iget-object v1, v0, Lyp0;->Κ:Lk31;

    .line 22
    .line 23
    iget-object v1, v1, Lk31;->δ:Lq31;

    .line 24
    .line 25
    if-ne p0, v1, :cond_1

    .line 26
    .line 27
    iget-boolean v1, v0, Lyp0;->η:Z

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-static {v0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v0}, Lol1;->β(Lyp0;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    const-wide v2, 0x7fffffff7fffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, Lum0;->α(JJ)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    invoke-static {p1, p2, v0, v1}, Lh62;->с(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide p0

    .line 58
    return-wide p0

    .line 59
    :cond_1
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-interface {v0, p1, p2, v1}, Lw81;->β(JZ)J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    :cond_2
    iget-wide v0, p0, Lq31;->Ε:J

    .line 69
    .line 70
    invoke-static {p1, p2, v0, v1}, Lh62;->с(JJ)J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    return-wide p1
.end method

.method public final ｃ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 2
    .line 3
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbq0;->β()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ｄ()V
    .locals 13

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Lr31;->ζ(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lq31;->Ч(Z)Lq01;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_c

    .line 12
    .line 13
    iget-object v2, v2, Lq01;->ε:Lq01;

    .line 14
    .line 15
    iget v2, v2, Lq01;->θ:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-static {}, Le81;->η()Ltw1;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Ltw1;->ε()La80;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v4, v3

    .line 33
    :goto_0
    invoke-static {v2}, Le81;->κ(Ltw1;)Ltw1;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v6, v6, Lq01;->ι:Lq01;

    .line 52
    .line 53
    if-nez v6, :cond_2

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_2
    :goto_1
    invoke-virtual {p0, v1}, Lq31;->Ч(Z)Lq01;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    if-eqz v1, :cond_b

    .line 62
    .line 63
    iget v7, v1, Lq01;->θ:I

    .line 64
    .line 65
    and-int/2addr v7, v0

    .line 66
    if-eqz v7, :cond_b

    .line 67
    .line 68
    iget v7, v1, Lq01;->η:I

    .line 69
    .line 70
    and-int/2addr v7, v0

    .line 71
    if-eqz v7, :cond_a

    .line 72
    .line 73
    move-object v7, v1

    .line 74
    move-object v8, v3

    .line 75
    :goto_3
    if-eqz v7, :cond_a

    .line 76
    .line 77
    instance-of v9, v7, Lkp0;

    .line 78
    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    check-cast v7, Lkp0;

    .line 82
    .line 83
    iget-wide v9, p0, Lch1;->η:J

    .line 84
    .line 85
    invoke-interface {v7, v9, v10}, Lkp0;->μ(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_3
    iget v9, v7, Lq01;->η:I

    .line 90
    .line 91
    and-int/2addr v9, v0

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    instance-of v9, v7, Lya;

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    move-object v9, v7

    .line 99
    check-cast v9, Lya;

    .line 100
    .line 101
    iget-object v9, v9, Lya;->υ:Lq01;

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    :goto_4
    const/4 v11, 0x1

    .line 105
    if-eqz v9, :cond_8

    .line 106
    .line 107
    iget v12, v9, Lq01;->η:I

    .line 108
    .line 109
    and-int/2addr v12, v0

    .line 110
    if-eqz v12, :cond_7

    .line 111
    .line 112
    add-int/lit8 v10, v10, 0x1

    .line 113
    .line 114
    if-ne v10, v11, :cond_4

    .line 115
    .line 116
    move-object v7, v9

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    if-nez v8, :cond_5

    .line 119
    .line 120
    new-instance v8, Lk21;

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    new-array v11, v11, [Lq01;

    .line 125
    .line 126
    invoke-direct {v8, v11}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v7, :cond_6

    .line 130
    .line 131
    invoke-virtual {v8, v7}, Lk21;->β(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v7, v3

    .line 135
    :cond_6
    invoke-virtual {v8, v9}, Lk21;->β(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_5
    iget-object v9, v9, Lq01;->κ:Lq01;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    if-ne v10, v11, :cond_9

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    :goto_6
    invoke-static {v8}, Lh62;->γ(Lk21;)Lq01;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    goto :goto_3

    .line 149
    :cond_a
    if-eq v1, v6, :cond_b

    .line 150
    .line 151
    iget-object v1, v1, Lq01;->κ:Lq01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, Le81;->ο(Ltw1;Ltw1;La80;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_8
    invoke-static {v2, v5, v4}, Le81;->ο(Ltw1;Ltw1;La80;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_c
    return-void
.end method

.method public final ｅ()V
    .locals 10

    .line 1
    const/high16 v0, 0x400000

    .line 2
    .line 3
    invoke-static {v0}, Lr31;->ζ(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, v2, Lq01;->ι:Lq01;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lq31;->Ч(Z)Lq01;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_1
    if-eqz v1, :cond_a

    .line 25
    .line 26
    iget v3, v1, Lq01;->θ:I

    .line 27
    .line 28
    and-int/2addr v3, v0

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    iget v3, v1, Lq01;->η:I

    .line 32
    .line 33
    and-int/2addr v3, v0

    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v4, v1

    .line 38
    move-object v5, v3

    .line 39
    :goto_2
    if-eqz v4, :cond_9

    .line 40
    .line 41
    instance-of v6, v4, Lkp0;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    check-cast v4, Lkp0;

    .line 46
    .line 47
    invoke-interface {v4, p0}, Lkp0;->ι(Lmp0;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    iget v6, v4, Lq01;->η:I

    .line 52
    .line 53
    and-int/2addr v6, v0

    .line 54
    if-eqz v6, :cond_8

    .line 55
    .line 56
    instance-of v6, v4, Lya;

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, Lya;

    .line 62
    .line 63
    iget-object v6, v6, Lya;->υ:Lq01;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    :goto_3
    const/4 v8, 0x1

    .line 67
    if-eqz v6, :cond_7

    .line 68
    .line 69
    iget v9, v6, Lq01;->η:I

    .line 70
    .line 71
    and-int/2addr v9, v0

    .line 72
    if-eqz v9, :cond_6

    .line 73
    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    if-ne v7, v8, :cond_3

    .line 77
    .line 78
    move-object v4, v6

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    if-nez v5, :cond_4

    .line 81
    .line 82
    new-instance v5, Lk21;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [Lq01;

    .line 87
    .line 88
    invoke-direct {v5, v8}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v4, v3

    .line 97
    :cond_5
    invoke-virtual {v5, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_4
    iget-object v6, v6, Lq01;->κ:Lq01;

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    if-ne v7, v8, :cond_8

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_8
    :goto_5
    invoke-static {v5}, Lh62;->γ(Lk21;)Lq01;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    goto :goto_2

    .line 111
    :cond_9
    if-eq v1, v2, :cond_a

    .line 112
    .line 113
    iget-object v1, v1, Lq01;->κ:Lq01;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :goto_6
    return-void
.end method

.method public final ｆ()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq31;->φ:Z

    .line 3
    .line 4
    iget-object v0, p0, Lq31;->Ο:Ln31;

    .line 5
    .line 6
    invoke-virtual {v0}, Ln31;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lq31;->ｌ()V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Lq31;->Ε:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Lum0;->α(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lyp0;->Μ(Lq31;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final ｇ()V
    .locals 9

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, Lr31;->ζ(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lq31;->Ч(Z)Lq01;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_9

    .line 12
    .line 13
    iget-object v2, v2, Lq01;->ε:Lq01;

    .line 14
    .line 15
    iget v2, v2, Lq01;->θ:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_9

    .line 19
    .line 20
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, v2, Lq01;->ι:Lq01;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_5

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lq31;->Ч(Z)Lq01;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_1
    if-eqz p0, :cond_9

    .line 37
    .line 38
    iget v1, p0, Lq01;->θ:I

    .line 39
    .line 40
    and-int/2addr v1, v0

    .line 41
    if-eqz v1, :cond_9

    .line 42
    .line 43
    iget v1, p0, Lq01;->η:I

    .line 44
    .line 45
    and-int/2addr v1, v0

    .line 46
    if-eqz v1, :cond_8

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    move-object v3, p0

    .line 50
    move-object v4, v1

    .line 51
    :goto_2
    if-eqz v3, :cond_8

    .line 52
    .line 53
    iget v5, v3, Lq01;->η:I

    .line 54
    .line 55
    and-int/2addr v5, v0

    .line 56
    if-eqz v5, :cond_7

    .line 57
    .line 58
    instance-of v5, v3, Lya;

    .line 59
    .line 60
    if-eqz v5, :cond_7

    .line 61
    .line 62
    move-object v5, v3

    .line 63
    check-cast v5, Lya;

    .line 64
    .line 65
    iget-object v5, v5, Lya;->υ:Lq01;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    :goto_3
    const/4 v7, 0x1

    .line 69
    if-eqz v5, :cond_6

    .line 70
    .line 71
    iget v8, v5, Lq01;->η:I

    .line 72
    .line 73
    and-int/2addr v8, v0

    .line 74
    if-eqz v8, :cond_5

    .line 75
    .line 76
    add-int/lit8 v6, v6, 0x1

    .line 77
    .line 78
    if-ne v6, v7, :cond_2

    .line 79
    .line 80
    move-object v3, v5

    .line 81
    goto :goto_4

    .line 82
    :cond_2
    if-nez v4, :cond_3

    .line 83
    .line 84
    new-instance v4, Lk21;

    .line 85
    .line 86
    const/16 v7, 0x10

    .line 87
    .line 88
    new-array v7, v7, [Lq01;

    .line 89
    .line 90
    invoke-direct {v4, v7}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    if-eqz v3, :cond_4

    .line 94
    .line 95
    invoke-virtual {v4, v3}, Lk21;->β(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v3, v1

    .line 99
    :cond_4
    invoke-virtual {v4, v5}, Lk21;->β(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_4
    iget-object v5, v5, Lq01;->κ:Lq01;

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    if-ne v6, v7, :cond_7

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_7
    invoke-static {v4}, Lh62;->γ(Lk21;)Lq01;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    goto :goto_2

    .line 113
    :cond_8
    if-eq p0, v2, :cond_9

    .line 114
    .line 115
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_9
    :goto_5
    return-void
.end method

.method public final ｈ(Lq01;Lm31;JLne0;IZFZ)V
    .locals 16

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    if-nez v2, :cond_0

    .line 4
    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    move-object/from16 v4, p2

    .line 8
    .line 9
    move-wide/from16 v5, p3

    .line 10
    .line 11
    move-object/from16 v7, p5

    .line 12
    .line 13
    move/from16 v8, p6

    .line 14
    .line 15
    move/from16 v9, p7

    .line 16
    .line 17
    invoke-virtual/range {v3 .. v9}, Lq31;->Ю(Lm31;JLne0;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v3, p2

    .line 22
    .line 23
    invoke-interface {v3, v2}, Lm31;->γ(Lq01;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, Lm31;->β()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v2, v0}, Lkn0;->η(Lur;I)Lq01;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object/from16 v0, p0

    .line 38
    .line 39
    move-object/from16 v5, p5

    .line 40
    .line 41
    move/from16 v6, p6

    .line 42
    .line 43
    move/from16 v7, p7

    .line 44
    .line 45
    move/from16 v8, p8

    .line 46
    .line 47
    move/from16 v9, p9

    .line 48
    .line 49
    move-object v2, v3

    .line 50
    move-wide/from16 v3, p3

    .line 51
    .line 52
    invoke-virtual/range {v0 .. v9}, Lq31;->ｈ(Lq01;Lm31;JLne0;IZFZ)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    move/from16 v6, p6

    .line 57
    .line 58
    const/4 v0, 0x3

    .line 59
    if-ne v6, v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v1, 0x4

    .line 63
    if-ne v6, v1, :cond_12

    .line 64
    .line 65
    :goto_0
    const/4 v1, 0x0

    .line 66
    move-object v4, v1

    .line 67
    move-object v3, v2

    .line 68
    :goto_1
    if-eqz v3, :cond_12

    .line 69
    .line 70
    instance-of v5, v3, Ldi1;

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v11, 0x1

    .line 74
    if-eqz v5, :cond_b

    .line 75
    .line 76
    check-cast v3, Ldi1;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget v1, Ln52;->β:I

    .line 82
    .line 83
    sget-wide v3, Ln52;->α:J

    .line 84
    .line 85
    const/16 v1, 0x20

    .line 86
    .line 87
    shr-long v8, p3, v1

    .line 88
    .line 89
    long-to-int v1, v8

    .line 90
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    move-object/from16 v8, p0

    .line 95
    .line 96
    iget-object v9, v8, Lq31;->σ:Lyp0;

    .line 97
    .line 98
    iget-object v10, v9, Lyp0;->Δ:Lnp0;

    .line 99
    .line 100
    sget v12, Ln52;->β:I

    .line 101
    .line 102
    const-wide/high16 v12, -0x8000000000000000L

    .line 103
    .line 104
    and-long/2addr v12, v3

    .line 105
    const-wide/16 v14, 0x0

    .line 106
    .line 107
    cmp-long v12, v12, v14

    .line 108
    .line 109
    const/4 v13, 0x2

    .line 110
    sget-object v14, Lnp0;->ε:Lnp0;

    .line 111
    .line 112
    if-eqz v12, :cond_4

    .line 113
    .line 114
    if-ne v10, v14, :cond_3

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    invoke-static {v13, v3, v4}, Lzz1;->δ(IJ)I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    :goto_2
    invoke-static {v7, v3, v4}, Lzz1;->δ(IJ)I

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    :goto_3
    neg-int v10, v10

    .line 127
    int-to-float v10, v10

    .line 128
    cmpl-float v5, v5, v10

    .line 129
    .line 130
    if-ltz v5, :cond_12

    .line 131
    .line 132
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-virtual {v8}, Lch1;->н()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    iget-object v9, v9, Lyp0;->Δ:Lnp0;

    .line 141
    .line 142
    if-eqz v12, :cond_6

    .line 143
    .line 144
    if-ne v9, v14, :cond_5

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    invoke-static {v7, v3, v4}, Lzz1;->δ(IJ)I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    goto :goto_5

    .line 152
    :cond_6
    :goto_4
    invoke-static {v13, v3, v4}, Lzz1;->δ(IJ)I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    :goto_5
    add-int/2addr v5, v7

    .line 157
    int-to-float v5, v5

    .line 158
    cmpg-float v1, v1, v5

    .line 159
    .line 160
    if-gez v1, :cond_12

    .line 161
    .line 162
    const-wide v9, 0xffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    and-long v9, p3, v9

    .line 168
    .line 169
    long-to-int v1, v9

    .line 170
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-static {v11, v3, v4}, Lzz1;->δ(IJ)I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    neg-int v7, v7

    .line 179
    int-to-float v7, v7

    .line 180
    cmpl-float v5, v5, v7

    .line 181
    .line 182
    if-ltz v5, :cond_12

    .line 183
    .line 184
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    invoke-virtual {v8}, Lch1;->м()I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-static {v0, v3, v4}, Lzz1;->δ(IJ)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    add-int/2addr v0, v5

    .line 197
    int-to-float v0, v0

    .line 198
    cmpg-float v0, v1, v0

    .line 199
    .line 200
    if-gez v0, :cond_12

    .line 201
    .line 202
    new-instance v0, Lo31;

    .line 203
    .line 204
    move-object/from16 v3, p2

    .line 205
    .line 206
    move-wide/from16 v4, p3

    .line 207
    .line 208
    move/from16 v9, p8

    .line 209
    .line 210
    move/from16 v10, p9

    .line 211
    .line 212
    move v7, v6

    .line 213
    move-object v1, v8

    .line 214
    move-object/from16 v6, p5

    .line 215
    .line 216
    move/from16 v8, p7

    .line 217
    .line 218
    invoke-direct/range {v0 .. v10}, Lo31;-><init>(Lq31;Lq01;Lm31;JLne0;IZFZ)V

    .line 219
    .line 220
    .line 221
    iget-object v1, v6, Lne0;->ζ:Lq11;

    .line 222
    .line 223
    iget-object v3, v6, Lne0;->ε:Lv11;

    .line 224
    .line 225
    iget v4, v6, Lne0;->η:I

    .line 226
    .line 227
    iget v5, v3, Lv11;->β:I

    .line 228
    .line 229
    add-int/lit8 v7, v5, -0x1

    .line 230
    .line 231
    const/4 v9, 0x0

    .line 232
    if-ne v4, v7, :cond_7

    .line 233
    .line 234
    add-int/lit8 v7, v4, 0x1

    .line 235
    .line 236
    invoke-virtual {v6, v7, v5}, Lne0;->β(II)V

    .line 237
    .line 238
    .line 239
    iget v5, v6, Lne0;->η:I

    .line 240
    .line 241
    add-int/2addr v5, v11

    .line 242
    iput v5, v6, Lne0;->η:I

    .line 243
    .line 244
    invoke-virtual {v3, v2}, Lv11;->α(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v9, v8, v11}, Lkn0;->γ(FZZ)J

    .line 248
    .line 249
    .line 250
    move-result-wide v2

    .line 251
    invoke-virtual {v1, v2, v3}, Lq11;->α(J)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Lo31;->invoke()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    iput v4, v6, Lne0;->η:I

    .line 258
    .line 259
    return-void

    .line 260
    :cond_7
    invoke-virtual {v6}, Lne0;->α()J

    .line 261
    .line 262
    .line 263
    move-result-wide v4

    .line 264
    iget v7, v6, Lne0;->η:I

    .line 265
    .line 266
    invoke-static {v4, v5}, Lxb;->Λ(J)Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-eqz v10, :cond_9

    .line 271
    .line 272
    iget v4, v3, Lv11;->β:I

    .line 273
    .line 274
    add-int/lit8 v5, v4, -0x1

    .line 275
    .line 276
    iput v5, v6, Lne0;->η:I

    .line 277
    .line 278
    iget v10, v3, Lv11;->β:I

    .line 279
    .line 280
    invoke-virtual {v6, v4, v10}, Lne0;->β(II)V

    .line 281
    .line 282
    .line 283
    iget v4, v6, Lne0;->η:I

    .line 284
    .line 285
    add-int/2addr v4, v11

    .line 286
    iput v4, v6, Lne0;->η:I

    .line 287
    .line 288
    invoke-virtual {v3, v2}, Lv11;->α(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v9, v8, v11}, Lkn0;->γ(FZZ)J

    .line 292
    .line 293
    .line 294
    move-result-wide v2

    .line 295
    invoke-virtual {v1, v2, v3}, Lq11;->α(J)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, Lo31;->invoke()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    iput v5, v6, Lne0;->η:I

    .line 302
    .line 303
    invoke-virtual {v6}, Lne0;->α()J

    .line 304
    .line 305
    .line 306
    move-result-wide v0

    .line 307
    invoke-static {v0, v1}, Lxb;->Γ(J)F

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    cmpg-float v0, v0, v9

    .line 312
    .line 313
    if-gez v0, :cond_8

    .line 314
    .line 315
    add-int/lit8 v0, v7, 0x1

    .line 316
    .line 317
    iget v1, v6, Lne0;->η:I

    .line 318
    .line 319
    add-int/2addr v1, v11

    .line 320
    invoke-virtual {v6, v0, v1}, Lne0;->β(II)V

    .line 321
    .line 322
    .line 323
    :cond_8
    iput v7, v6, Lne0;->η:I

    .line 324
    .line 325
    return-void

    .line 326
    :cond_9
    invoke-static {v4, v5}, Lxb;->Γ(J)F

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    cmpl-float v4, v4, v9

    .line 331
    .line 332
    if-lez v4, :cond_a

    .line 333
    .line 334
    iget v4, v6, Lne0;->η:I

    .line 335
    .line 336
    add-int/lit8 v5, v4, 0x1

    .line 337
    .line 338
    iget v7, v3, Lv11;->β:I

    .line 339
    .line 340
    invoke-virtual {v6, v5, v7}, Lne0;->β(II)V

    .line 341
    .line 342
    .line 343
    iget v5, v6, Lne0;->η:I

    .line 344
    .line 345
    add-int/2addr v5, v11

    .line 346
    iput v5, v6, Lne0;->η:I

    .line 347
    .line 348
    invoke-virtual {v3, v2}, Lv11;->α(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    invoke-static {v9, v8, v11}, Lkn0;->γ(FZZ)J

    .line 352
    .line 353
    .line 354
    move-result-wide v2

    .line 355
    invoke-virtual {v1, v2, v3}, Lq11;->α(J)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Lo31;->invoke()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    iput v4, v6, Lne0;->η:I

    .line 362
    .line 363
    :cond_a
    return-void

    .line 364
    :cond_b
    move-object/from16 v6, p5

    .line 365
    .line 366
    move/from16 v8, p7

    .line 367
    .line 368
    iget v5, v3, Lq01;->η:I

    .line 369
    .line 370
    const/16 v9, 0x10

    .line 371
    .line 372
    and-int/2addr v5, v9

    .line 373
    if-eqz v5, :cond_11

    .line 374
    .line 375
    instance-of v5, v3, Lya;

    .line 376
    .line 377
    if-eqz v5, :cond_11

    .line 378
    .line 379
    move-object v5, v3

    .line 380
    check-cast v5, Lya;

    .line 381
    .line 382
    iget-object v5, v5, Lya;->υ:Lq01;

    .line 383
    .line 384
    :goto_6
    if-eqz v5, :cond_10

    .line 385
    .line 386
    iget v10, v5, Lq01;->η:I

    .line 387
    .line 388
    and-int/2addr v10, v9

    .line 389
    if-eqz v10, :cond_f

    .line 390
    .line 391
    add-int/lit8 v7, v7, 0x1

    .line 392
    .line 393
    if-ne v7, v11, :cond_c

    .line 394
    .line 395
    move-object v3, v5

    .line 396
    goto :goto_7

    .line 397
    :cond_c
    if-nez v4, :cond_d

    .line 398
    .line 399
    new-instance v4, Lk21;

    .line 400
    .line 401
    new-array v10, v9, [Lq01;

    .line 402
    .line 403
    invoke-direct {v4, v10}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_d
    if-eqz v3, :cond_e

    .line 407
    .line 408
    invoke-virtual {v4, v3}, Lk21;->β(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    move-object v3, v1

    .line 412
    :cond_e
    invoke-virtual {v4, v5}, Lk21;->β(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    :cond_f
    :goto_7
    iget-object v5, v5, Lq01;->κ:Lq01;

    .line 416
    .line 417
    goto :goto_6

    .line 418
    :cond_10
    if-ne v7, v11, :cond_11

    .line 419
    .line 420
    :goto_8
    move/from16 v6, p6

    .line 421
    .line 422
    goto/16 :goto_1

    .line 423
    .line 424
    :cond_11
    invoke-static {v4}, Lh62;->γ(Lk21;)Lq01;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    goto :goto_8

    .line 429
    :cond_12
    move-object/from16 v6, p5

    .line 430
    .line 431
    move/from16 v8, p7

    .line 432
    .line 433
    if-eqz p9, :cond_13

    .line 434
    .line 435
    invoke-virtual/range {p0 .. p8}, Lq31;->Щ(Lq01;Lm31;JLne0;IZF)V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :cond_13
    invoke-virtual/range {p0 .. p8}, Lq31;->ｎ(Lq01;Lm31;JLne0;IZF)V

    .line 440
    .line 441
    .line 442
    return-void
.end method

.method public abstract ｉ(Lde;Lwa0;)V
.end method

.method public final ｊ(JFLa80;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p4, v0}, Lq31;->ｐ(La80;Z)V

    .line 3
    .line 4
    .line 5
    iget-wide v0, p0, Lq31;->Ε:J

    .line 6
    .line 7
    invoke-static {v0, v1, p1, p2}, Lum0;->α(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 12
    .line 13
    if-nez p4, :cond_2

    .line 14
    .line 15
    invoke-static {v0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    const/high16 v1, -0x3f800000    # -4.0f

    .line 20
    .line 21
    invoke-virtual {p4, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->Λ(F)V

    .line 22
    .line 23
    .line 24
    iput-wide p1, p0, Lq31;->Ε:J

    .line 25
    .line 26
    iget-object p4, p0, Lq31;->Ρ:Lw81;

    .line 27
    .line 28
    if-eqz p4, :cond_0

    .line 29
    .line 30
    invoke-interface {p4, p1, p2}, Lw81;->η(J)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object p1, p0, Lq31;->υ:Lq31;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Lq31;->Я()V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    invoke-virtual {v0, p0}, Lyp0;->Μ(Lq31;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Ldw0;->Ж(Lq31;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->χ(Lyp0;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    iput p3, p0, Lq31;->Ζ:F

    .line 55
    .line 56
    iget-object p1, v0, Lyp0;->Κ:Lk31;

    .line 57
    .line 58
    iget-object p1, p1, Lk31;->δ:Lq31;

    .line 59
    .line 60
    if-ne p0, p1, :cond_3

    .line 61
    .line 62
    invoke-static {v0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1, v0}, Lol1;->ε(Lyp0;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-boolean p1, p0, Ldw0;->ξ:Z

    .line 74
    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Lq31;->В()Lqx0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0, p1}, Ldw0;->щ(Lqx0;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public final ｋ(La21;ZZ)V
    .locals 12

    .line 1
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_9

    .line 11
    .line 12
    iget-boolean v4, p0, Lq31;->χ:Z

    .line 13
    .line 14
    if-eqz v4, :cond_8

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz p3, :cond_6

    .line 18
    .line 19
    invoke-virtual {p0}, Lq31;->Ф()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    iget v5, p1, La21;->α:F

    .line 24
    .line 25
    iget v6, p1, La21;->β:F

    .line 26
    .line 27
    iget v7, p1, La21;->γ:F

    .line 28
    .line 29
    cmpg-float v7, v7, v4

    .line 30
    .line 31
    if-ltz v7, :cond_5

    .line 32
    .line 33
    iget-wide v7, p0, Lch1;->η:J

    .line 34
    .line 35
    shr-long v9, v7, v1

    .line 36
    .line 37
    long-to-int v9, v9

    .line 38
    int-to-float v9, v9

    .line 39
    cmpl-float v9, v5, v9

    .line 40
    .line 41
    if-gtz v9, :cond_5

    .line 42
    .line 43
    iget v9, p1, La21;->δ:F

    .line 44
    .line 45
    cmpg-float v9, v9, v4

    .line 46
    .line 47
    if-ltz v9, :cond_5

    .line 48
    .line 49
    and-long/2addr v7, v2

    .line 50
    long-to-int v7, v7

    .line 51
    int-to-float v7, v7

    .line 52
    cmpl-float v7, v6, v7

    .line 53
    .line 54
    if-lez v7, :cond_0

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_0
    shr-long v7, p2, v1

    .line 58
    .line 59
    long-to-int v7, v7

    .line 60
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    and-long v8, p2, v2

    .line 65
    .line 66
    long-to-int v8, v8

    .line 67
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    iget v9, p1, La21;->γ:F

    .line 72
    .line 73
    iget v10, p1, La21;->α:F

    .line 74
    .line 75
    sub-float/2addr v9, v10

    .line 76
    sub-float v9, v7, v9

    .line 77
    .line 78
    const/high16 v10, 0x40000000    # 2.0f

    .line 79
    .line 80
    div-float/2addr v9, v10

    .line 81
    cmpl-float v11, v9, v4

    .line 82
    .line 83
    if-lez v11, :cond_1

    .line 84
    .line 85
    sub-float/2addr v5, v9

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    neg-float v7, v7

    .line 88
    div-float/2addr v7, v10

    .line 89
    cmpg-float v9, v5, v7

    .line 90
    .line 91
    if-gez v9, :cond_2

    .line 92
    .line 93
    move v5, v7

    .line 94
    :cond_2
    :goto_0
    iget v7, p1, La21;->δ:F

    .line 95
    .line 96
    iget v9, p1, La21;->β:F

    .line 97
    .line 98
    sub-float/2addr v7, v9

    .line 99
    sub-float v7, v8, v7

    .line 100
    .line 101
    div-float/2addr v7, v10

    .line 102
    cmpl-float v4, v7, v4

    .line 103
    .line 104
    if-lez v4, :cond_3

    .line 105
    .line 106
    sub-float/2addr v6, v7

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    neg-float v4, v8

    .line 109
    div-float/2addr v4, v10

    .line 110
    cmpg-float v7, v6, v4

    .line 111
    .line 112
    if-gez v7, :cond_4

    .line 113
    .line 114
    move v6, v4

    .line 115
    :cond_4
    :goto_1
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    int-to-long v4, v4

    .line 120
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    int-to-long v6, v6

    .line 125
    shl-long/2addr v4, v1

    .line 126
    and-long/2addr v6, v2

    .line 127
    or-long/2addr v4, v6

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    :goto_2
    const-wide/16 v4, 0x0

    .line 130
    .line 131
    :goto_3
    shr-long v6, v4, v1

    .line 132
    .line 133
    long-to-int v6, v6

    .line 134
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    and-long/2addr v4, v2

    .line 139
    long-to-int v4, v4

    .line 140
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    iget-wide v7, p0, Lch1;->η:J

    .line 145
    .line 146
    shr-long v9, v7, v1

    .line 147
    .line 148
    long-to-int v5, v9

    .line 149
    and-long/2addr v7, v2

    .line 150
    long-to-int v7, v7

    .line 151
    int-to-float v5, v5

    .line 152
    shr-long v8, p2, v1

    .line 153
    .line 154
    long-to-int v8, v8

    .line 155
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    add-float/2addr v9, v5

    .line 160
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    add-float/2addr v8, v6

    .line 165
    invoke-static {v5, v8}, Ljava/lang/Math;->max(FF)F

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-static {v9, v5}, Ljava/lang/Math;->min(FF)F

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    int-to-float v7, v7

    .line 174
    and-long/2addr p2, v2

    .line 175
    long-to-int p2, p2

    .line 176
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    add-float/2addr p3, v7

    .line 181
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    add-float/2addr p2, v4

    .line 186
    invoke-static {v7, p2}, Ljava/lang/Math;->max(FF)F

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    invoke-static {p3, p2}, Ljava/lang/Math;->min(FF)F

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    invoke-virtual {p1, v6, v4, v5, p2}, La21;->α(FFFF)V

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_6
    if-eqz p2, :cond_7

    .line 199
    .line 200
    iget-wide p2, p0, Lch1;->η:J

    .line 201
    .line 202
    shr-long v5, p2, v1

    .line 203
    .line 204
    long-to-int v5, v5

    .line 205
    int-to-float v5, v5

    .line 206
    and-long/2addr p2, v2

    .line 207
    long-to-int p2, p2

    .line 208
    int-to-float p2, p2

    .line 209
    invoke-virtual {p1, v4, v4, v5, p2}, La21;->α(FFFF)V

    .line 210
    .line 211
    .line 212
    :cond_7
    :goto_4
    invoke-virtual {p1}, La21;->β()Z

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    if-eqz p2, :cond_8

    .line 217
    .line 218
    return-void

    .line 219
    :cond_8
    const/4 p2, 0x0

    .line 220
    invoke-interface {v0, p1, p2}, Lw81;->δ(La21;Z)V

    .line 221
    .line 222
    .line 223
    :cond_9
    iget-wide p2, p0, Lq31;->Ε:J

    .line 224
    .line 225
    shr-long v0, p2, v1

    .line 226
    .line 227
    long-to-int p0, v0

    .line 228
    iget v0, p1, La21;->α:F

    .line 229
    .line 230
    int-to-float p0, p0

    .line 231
    add-float/2addr v0, p0

    .line 232
    iput v0, p1, La21;->α:F

    .line 233
    .line 234
    iget v0, p1, La21;->γ:F

    .line 235
    .line 236
    add-float/2addr v0, p0

    .line 237
    iput v0, p1, La21;->γ:F

    .line 238
    .line 239
    and-long/2addr p2, v2

    .line 240
    long-to-int p0, p2

    .line 241
    iget p2, p1, La21;->β:F

    .line 242
    .line 243
    int-to-float p0, p0

    .line 244
    add-float/2addr p2, p0

    .line 245
    iput p2, p1, La21;->β:F

    .line 246
    .line 247
    iget p2, p1, La21;->δ:F

    .line 248
    .line 249
    add-float/2addr p2, p0

    .line 250
    iput p2, p1, La21;->δ:F

    .line 251
    .line 252
    return-void
.end method

.method public final ｌ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Lq31;->ｐ(La80;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lyp0;->Τ(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final ｍ(Lqx0;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lq31;->Γ:Lqx0;

    .line 6
    .line 7
    if-eq v1, v2, :cond_1b

    .line 8
    .line 9
    iput-object v1, v0, Lq31;->Γ:Lqx0;

    .line 10
    .line 11
    iget-object v3, v0, Lq31;->σ:Lyp0;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Lqx0;->ε()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-interface {v2}, Lqx0;->ε()I

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    if-ne v6, v7, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Lqx0;->β()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-interface {v2}, Lqx0;->β()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v6, v2, :cond_10

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lqx0;->ε()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v1}, Lqx0;->β()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    iget-object v7, v0, Lq31;->Ρ:Lw81;

    .line 45
    .line 46
    const-wide v8, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/16 v10, 0x20

    .line 52
    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    int-to-long v11, v2

    .line 56
    shl-long/2addr v11, v10

    .line 57
    int-to-long v13, v6

    .line 58
    and-long/2addr v13, v8

    .line 59
    or-long/2addr v11, v13

    .line 60
    invoke-interface {v7, v11, v12}, Lw81;->γ(J)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v3}, Lyp0;->Θ()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_2

    .line 69
    .line 70
    iget-object v7, v0, Lq31;->υ:Lq31;

    .line 71
    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    invoke-virtual {v7}, Lq31;->Я()V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    int-to-long v11, v2

    .line 78
    shl-long v10, v11, v10

    .line 79
    .line 80
    int-to-long v6, v6

    .line 81
    and-long/2addr v6, v8

    .line 82
    or-long/2addr v6, v10

    .line 83
    invoke-virtual {v0, v6, v7}, Lch1;->ф(J)V

    .line 84
    .line 85
    .line 86
    iget-object v2, v0, Lq31;->ψ:La80;

    .line 87
    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0, v5}, Lq31;->ｑ(Z)V

    .line 91
    .line 92
    .line 93
    :cond_3
    const/4 v2, 0x4

    .line 94
    invoke-static {v2}, Lr31;->ζ(I)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    invoke-virtual {v0}, Lq31;->Х()Lq01;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-eqz v6, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    iget-object v7, v7, Lq01;->ι:Lq01;

    .line 106
    .line 107
    if-nez v7, :cond_5

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_5
    :goto_1
    invoke-virtual {v0, v6}, Lq31;->Ч(Z)Lq01;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    :goto_2
    if-eqz v6, :cond_e

    .line 116
    .line 117
    iget v8, v6, Lq01;->θ:I

    .line 118
    .line 119
    and-int/2addr v8, v2

    .line 120
    if-eqz v8, :cond_e

    .line 121
    .line 122
    iget v8, v6, Lq01;->η:I

    .line 123
    .line 124
    and-int/2addr v8, v2

    .line 125
    if-eqz v8, :cond_d

    .line 126
    .line 127
    move-object v8, v6

    .line 128
    const/4 v9, 0x0

    .line 129
    :goto_3
    if-eqz v8, :cond_d

    .line 130
    .line 131
    instance-of v10, v8, Lbw;

    .line 132
    .line 133
    if-eqz v10, :cond_6

    .line 134
    .line 135
    check-cast v8, Lbw;

    .line 136
    .line 137
    invoke-interface {v8}, Lbw;->м()V

    .line 138
    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_6
    iget v10, v8, Lq01;->η:I

    .line 142
    .line 143
    and-int/2addr v10, v2

    .line 144
    if-eqz v10, :cond_c

    .line 145
    .line 146
    instance-of v10, v8, Lya;

    .line 147
    .line 148
    if-eqz v10, :cond_c

    .line 149
    .line 150
    move-object v10, v8

    .line 151
    check-cast v10, Lya;

    .line 152
    .line 153
    iget-object v10, v10, Lya;->υ:Lq01;

    .line 154
    .line 155
    move v11, v5

    .line 156
    :goto_4
    const/4 v12, 0x1

    .line 157
    if-eqz v10, :cond_b

    .line 158
    .line 159
    iget v13, v10, Lq01;->η:I

    .line 160
    .line 161
    and-int/2addr v13, v2

    .line 162
    if-eqz v13, :cond_a

    .line 163
    .line 164
    add-int/lit8 v11, v11, 0x1

    .line 165
    .line 166
    if-ne v11, v12, :cond_7

    .line 167
    .line 168
    move-object v8, v10

    .line 169
    goto :goto_5

    .line 170
    :cond_7
    if-nez v9, :cond_8

    .line 171
    .line 172
    new-instance v9, Lk21;

    .line 173
    .line 174
    const/16 v12, 0x10

    .line 175
    .line 176
    new-array v12, v12, [Lq01;

    .line 177
    .line 178
    invoke-direct {v9, v12}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_8
    if-eqz v8, :cond_9

    .line 182
    .line 183
    invoke-virtual {v9, v8}, Lk21;->β(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    const/4 v8, 0x0

    .line 187
    :cond_9
    invoke-virtual {v9, v10}, Lk21;->β(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    :goto_5
    iget-object v10, v10, Lq01;->κ:Lq01;

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_b
    if-ne v11, v12, :cond_c

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_c
    :goto_6
    invoke-static {v9}, Lh62;->γ(Lk21;)Lq01;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    goto :goto_3

    .line 201
    :cond_d
    if-eq v6, v7, :cond_e

    .line 202
    .line 203
    iget-object v6, v6, Lq01;->κ:Lq01;

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_e
    :goto_7
    iget-object v2, v3, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 207
    .line 208
    if-eqz v2, :cond_f

    .line 209
    .line 210
    invoke-virtual {v2, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->χ(Lyp0;)V

    .line 211
    .line 212
    .line 213
    :cond_f
    invoke-virtual {v3, v0}, Lyp0;->Μ(Lq31;)V

    .line 214
    .line 215
    .line 216
    :cond_10
    iget-object v2, v0, Lq31;->Δ:Lu11;

    .line 217
    .line 218
    if-eqz v2, :cond_11

    .line 219
    .line 220
    iget v2, v2, Lu11;->ε:I

    .line 221
    .line 222
    if-eqz v2, :cond_11

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_11
    invoke-interface {v1}, Lqx0;->γ()Ljava/util/Map;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-nez v2, :cond_1b

    .line 234
    .line 235
    :goto_8
    iget-object v2, v0, Lq31;->Δ:Lu11;

    .line 236
    .line 237
    invoke-interface {v1}, Lqx0;->γ()Ljava/util/Map;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    const-wide v7, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    if-nez v2, :cond_12

    .line 247
    .line 248
    :goto_9
    const-wide/16 v16, 0xff

    .line 249
    .line 250
    const/16 v18, 0x7

    .line 251
    .line 252
    goto :goto_c

    .line 253
    :cond_12
    iget v12, v2, Lu11;->ε:I

    .line 254
    .line 255
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-eq v12, v13, :cond_13

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_13
    iget-object v12, v2, Lu11;->β:[Ljava/lang/Object;

    .line 263
    .line 264
    iget-object v13, v2, Lu11;->γ:[I

    .line 265
    .line 266
    iget-object v2, v2, Lu11;->α:[J

    .line 267
    .line 268
    array-length v14, v2

    .line 269
    add-int/lit8 v14, v14, -0x2

    .line 270
    .line 271
    if-ltz v14, :cond_1b

    .line 272
    .line 273
    move v15, v5

    .line 274
    const-wide/16 v16, 0xff

    .line 275
    .line 276
    :goto_a
    aget-wide v9, v2, v15

    .line 277
    .line 278
    move-object/from16 v19, v12

    .line 279
    .line 280
    const/16 v18, 0x7

    .line 281
    .line 282
    not-long v11, v9

    .line 283
    shl-long v11, v11, v18

    .line 284
    .line 285
    and-long/2addr v11, v9

    .line 286
    and-long/2addr v11, v7

    .line 287
    cmp-long v11, v11, v7

    .line 288
    .line 289
    if-eqz v11, :cond_1a

    .line 290
    .line 291
    sub-int v11, v15, v14

    .line 292
    .line 293
    not-int v11, v11

    .line 294
    ushr-int/lit8 v11, v11, 0x1f

    .line 295
    .line 296
    const/16 v12, 0x8

    .line 297
    .line 298
    rsub-int/lit8 v11, v11, 0x8

    .line 299
    .line 300
    move/from16 v20, v12

    .line 301
    .line 302
    move v12, v5

    .line 303
    :goto_b
    if-ge v12, v11, :cond_19

    .line 304
    .line 305
    and-long v21, v9, v16

    .line 306
    .line 307
    const-wide/16 v23, 0x80

    .line 308
    .line 309
    cmp-long v21, v21, v23

    .line 310
    .line 311
    if-gez v21, :cond_18

    .line 312
    .line 313
    shl-int/lit8 v21, v15, 0x3

    .line 314
    .line 315
    add-int v21, v21, v12

    .line 316
    .line 317
    aget-object v22, v19, v21

    .line 318
    .line 319
    aget v4, v13, v21

    .line 320
    .line 321
    move-object/from16 v7, v22

    .line 322
    .line 323
    check-cast v7, Lre0;

    .line 324
    .line 325
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    check-cast v7, Ljava/lang/Integer;

    .line 330
    .line 331
    if-nez v7, :cond_14

    .line 332
    .line 333
    goto :goto_c

    .line 334
    :cond_14
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-eq v7, v4, :cond_17

    .line 339
    .line 340
    :goto_c
    iget-object v2, v3, Lyp0;->Λ:Lbq0;

    .line 341
    .line 342
    iget-object v2, v2, Lbq0;->π:Lox0;

    .line 343
    .line 344
    iget-object v2, v2, Lox0;->Β:Lzp0;

    .line 345
    .line 346
    invoke-virtual {v2}, Lzp0;->ζ()V

    .line 347
    .line 348
    .line 349
    iget-object v2, v0, Lq31;->Δ:Lu11;

    .line 350
    .line 351
    if-nez v2, :cond_15

    .line 352
    .line 353
    sget-object v2, Lz31;->α:Lu11;

    .line 354
    .line 355
    new-instance v2, Lu11;

    .line 356
    .line 357
    invoke-direct {v2}, Lu11;-><init>()V

    .line 358
    .line 359
    .line 360
    iput-object v2, v0, Lq31;->Δ:Lu11;

    .line 361
    .line 362
    :cond_15
    iput v5, v2, Lu11;->ε:I

    .line 363
    .line 364
    iget-object v0, v2, Lu11;->α:[J

    .line 365
    .line 366
    sget-object v3, Ltq1;->α:[J

    .line 367
    .line 368
    if-eq v0, v3, :cond_16

    .line 369
    .line 370
    const-wide v7, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    invoke-static {v7, v8, v0}, Lg7;->Φ(J[J)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v2, Lu11;->α:[J

    .line 379
    .line 380
    iget v3, v2, Lu11;->δ:I

    .line 381
    .line 382
    shr-int/lit8 v4, v3, 0x3

    .line 383
    .line 384
    and-int/lit8 v3, v3, 0x7

    .line 385
    .line 386
    shl-int/lit8 v3, v3, 0x3

    .line 387
    .line 388
    aget-wide v6, v0, v4

    .line 389
    .line 390
    shl-long v8, v16, v3

    .line 391
    .line 392
    not-long v10, v8

    .line 393
    and-long/2addr v6, v10

    .line 394
    or-long/2addr v6, v8

    .line 395
    aput-wide v6, v0, v4

    .line 396
    .line 397
    :cond_16
    iget-object v0, v2, Lu11;->β:[Ljava/lang/Object;

    .line 398
    .line 399
    iget v3, v2, Lu11;->δ:I

    .line 400
    .line 401
    const/4 v4, 0x0

    .line 402
    invoke-static {v5, v3, v4, v0}, Lg7;->Υ(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    iget v0, v2, Lu11;->δ:I

    .line 406
    .line 407
    invoke-static {v0}, Ltq1;->α(I)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    iget v3, v2, Lu11;->ε:I

    .line 412
    .line 413
    sub-int/2addr v0, v3

    .line 414
    iput v0, v2, Lu11;->ζ:I

    .line 415
    .line 416
    invoke-interface {v1}, Lqx0;->γ()Ljava/util/Map;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-eqz v1, :cond_1b

    .line 433
    .line 434
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    check-cast v1, Ljava/util/Map$Entry;

    .line 439
    .line 440
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    check-cast v1, Ljava/lang/Number;

    .line 449
    .line 450
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    invoke-virtual {v2, v1, v3}, Lu11;->ζ(ILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    goto :goto_d

    .line 458
    :cond_17
    const-wide v7, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    :cond_18
    const/4 v4, 0x0

    .line 464
    shr-long v9, v9, v20

    .line 465
    .line 466
    add-int/lit8 v12, v12, 0x1

    .line 467
    .line 468
    goto/16 :goto_b

    .line 469
    .line 470
    :cond_19
    move/from16 v9, v20

    .line 471
    .line 472
    const/4 v4, 0x0

    .line 473
    if-ne v11, v9, :cond_1b

    .line 474
    .line 475
    goto :goto_e

    .line 476
    :cond_1a
    const/4 v4, 0x0

    .line 477
    :goto_e
    if-eq v15, v14, :cond_1b

    .line 478
    .line 479
    add-int/lit8 v15, v15, 0x1

    .line 480
    .line 481
    move-object/from16 v12, v19

    .line 482
    .line 483
    goto/16 :goto_a

    .line 484
    .line 485
    :cond_1b
    return-void
.end method

.method public final ｎ(Lq01;Lm31;JLne0;IZF)V
    .locals 13

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v4, p5

    .line 8
    .line 9
    move/from16 v5, p6

    .line 10
    .line 11
    move/from16 v6, p7

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v6}, Lq31;->Ю(Lm31;JLne0;IZ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-interface {p2, p1}, Lm31;->γ(Lq01;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p2}, Lm31;->β()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {p1, v0}, Lkn0;->η(Lur;I)Lq01;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v0, p0

    .line 32
    move-object v2, p2

    .line 33
    move-wide/from16 v3, p3

    .line 34
    .line 35
    move-object/from16 v5, p5

    .line 36
    .line 37
    move/from16 v6, p6

    .line 38
    .line 39
    move/from16 v7, p7

    .line 40
    .line 41
    move/from16 v8, p8

    .line 42
    .line 43
    invoke-virtual/range {v0 .. v8}, Lq31;->ｎ(Lq01;Lm31;JLne0;IZF)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-interface {p2, p1}, Lm31;->α(Lq01;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_9

    .line 52
    .line 53
    new-instance v0, Lp31;

    .line 54
    .line 55
    move-object v1, p0

    .line 56
    move-object v2, p1

    .line 57
    move-object v3, p2

    .line 58
    move-wide/from16 v4, p3

    .line 59
    .line 60
    move-object/from16 v6, p5

    .line 61
    .line 62
    move/from16 v7, p6

    .line 63
    .line 64
    move/from16 v8, p7

    .line 65
    .line 66
    move/from16 v9, p8

    .line 67
    .line 68
    invoke-direct/range {v0 .. v9}, Lp31;-><init>(Lq31;Lq01;Lm31;JLne0;IZF)V

    .line 69
    .line 70
    .line 71
    move-object v5, v6

    .line 72
    move v7, v8

    .line 73
    move v8, v9

    .line 74
    iget-object p0, v5, Lne0;->ζ:Lq11;

    .line 75
    .line 76
    iget-object v1, v5, Lne0;->ε:Lv11;

    .line 77
    .line 78
    iget v3, v5, Lne0;->η:I

    .line 79
    .line 80
    iget v4, v1, Lv11;->β:I

    .line 81
    .line 82
    add-int/lit8 v6, v4, -0x1

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    if-ne v3, v6, :cond_6

    .line 86
    .line 87
    add-int/lit8 v6, v3, 0x1

    .line 88
    .line 89
    invoke-virtual {v5, v6, v4}, Lne0;->β(II)V

    .line 90
    .line 91
    .line 92
    iget v4, v5, Lne0;->η:I

    .line 93
    .line 94
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    iput v4, v5, Lne0;->η:I

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Lv11;->α(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v8, v7, v9}, Lkn0;->γ(FZZ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v7

    .line 105
    invoke-virtual {p0, v7, v8}, Lq11;->α(J)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lp31;->invoke()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    iput v3, v5, Lne0;->η:I

    .line 112
    .line 113
    iget p1, v1, Lv11;->β:I

    .line 114
    .line 115
    add-int/lit8 p1, p1, -0x1

    .line 116
    .line 117
    if-eq v6, p1, :cond_3

    .line 118
    .line 119
    invoke-virtual {v5}, Lne0;->α()J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    invoke-static {v2, v3}, Lxb;->Λ(J)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_2

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_2
    return-void

    .line 131
    :cond_3
    :goto_0
    iget p1, v5, Lne0;->η:I

    .line 132
    .line 133
    add-int/lit8 v0, p1, 0x1

    .line 134
    .line 135
    invoke-virtual {v1, v0}, Lv11;->λ(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    if-ltz v0, :cond_5

    .line 139
    .line 140
    iget v1, p0, Lq11;->β:I

    .line 141
    .line 142
    if-ge v0, v1, :cond_5

    .line 143
    .line 144
    iget-object v2, p0, Lq11;->α:[J

    .line 145
    .line 146
    aget-wide v3, v2, v0

    .line 147
    .line 148
    add-int/lit8 v3, v1, -0x1

    .line 149
    .line 150
    if-eq v0, v3, :cond_4

    .line 151
    .line 152
    add-int/lit8 p1, p1, 0x2

    .line 153
    .line 154
    invoke-static {v2, v2, v0, p1, v1}, Lg7;->Ν([J[JIII)V

    .line 155
    .line 156
    .line 157
    :cond_4
    iget p1, p0, Lq11;->β:I

    .line 158
    .line 159
    add-int/lit8 p1, p1, -0x1

    .line 160
    .line 161
    iput p1, p0, Lq11;->β:I

    .line 162
    .line 163
    return-void

    .line 164
    :cond_5
    const-string p0, "Index must be between 0 and size"

    .line 165
    .line 166
    invoke-static {p0}, Lγ;->η(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_6
    invoke-virtual {v5}, Lne0;->α()J

    .line 171
    .line 172
    .line 173
    move-result-wide v3

    .line 174
    iget v6, v5, Lne0;->η:I

    .line 175
    .line 176
    iget v10, v1, Lv11;->β:I

    .line 177
    .line 178
    add-int/lit8 v11, v10, -0x1

    .line 179
    .line 180
    iput v11, v5, Lne0;->η:I

    .line 181
    .line 182
    iget v12, v1, Lv11;->β:I

    .line 183
    .line 184
    invoke-virtual {v5, v10, v12}, Lne0;->β(II)V

    .line 185
    .line 186
    .line 187
    iget v10, v5, Lne0;->η:I

    .line 188
    .line 189
    add-int/lit8 v10, v10, 0x1

    .line 190
    .line 191
    iput v10, v5, Lne0;->η:I

    .line 192
    .line 193
    invoke-virtual {v1, p1}, Lv11;->α(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v8, v7, v9}, Lkn0;->γ(FZZ)J

    .line 197
    .line 198
    .line 199
    move-result-wide v7

    .line 200
    invoke-virtual {p0, v7, v8}, Lq11;->α(J)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Lp31;->invoke()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    iput v11, v5, Lne0;->η:I

    .line 207
    .line 208
    invoke-virtual {v5}, Lne0;->α()J

    .line 209
    .line 210
    .line 211
    move-result-wide p0

    .line 212
    iget v0, v5, Lne0;->η:I

    .line 213
    .line 214
    add-int/lit8 v0, v0, 0x1

    .line 215
    .line 216
    iget v2, v1, Lv11;->β:I

    .line 217
    .line 218
    add-int/lit8 v2, v2, -0x1

    .line 219
    .line 220
    if-ge v0, v2, :cond_8

    .line 221
    .line 222
    invoke-static {v3, v4, p0, p1}, Lxb;->ξ(JJ)I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-lez v0, :cond_8

    .line 227
    .line 228
    add-int/lit8 v0, v6, 0x1

    .line 229
    .line 230
    invoke-static {p0, p1}, Lxb;->Λ(J)Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    iget p1, v5, Lne0;->η:I

    .line 235
    .line 236
    if-eqz p0, :cond_7

    .line 237
    .line 238
    add-int/lit8 p1, p1, 0x2

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_7
    add-int/lit8 p1, p1, 0x1

    .line 242
    .line 243
    :goto_1
    invoke-virtual {v5, v0, p1}, Lne0;->β(II)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_8
    iget p0, v5, Lne0;->η:I

    .line 248
    .line 249
    add-int/lit8 p0, p0, 0x1

    .line 250
    .line 251
    iget p1, v1, Lv11;->β:I

    .line 252
    .line 253
    invoke-virtual {v5, p0, p1}, Lne0;->β(II)V

    .line 254
    .line 255
    .line 256
    :goto_2
    iput v6, v5, Lne0;->η:I

    .line 257
    .line 258
    return-void

    .line 259
    :cond_9
    move-object/from16 v5, p5

    .line 260
    .line 261
    move/from16 v7, p7

    .line 262
    .line 263
    move/from16 v8, p8

    .line 264
    .line 265
    invoke-interface {p2}, Lm31;->β()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    invoke-static {p1, v0}, Lkn0;->η(Lur;I)Lq01;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    const/4 v9, 0x0

    .line 274
    move-object v0, p0

    .line 275
    move-object v2, p2

    .line 276
    move-wide/from16 v3, p3

    .line 277
    .line 278
    move/from16 v6, p6

    .line 279
    .line 280
    invoke-virtual/range {v0 .. v9}, Lq31;->ｈ(Lq01;Lm31;JLne0;IZFZ)V

    .line 281
    .line 282
    .line 283
    return-void
.end method

.method public final ｏ()Lml1;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {p0}, Ls1;->ι(Lmp0;)Lmp0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lq31;->Η:La21;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-instance v1, La21;

    .line 19
    .line 20
    invoke-direct {v1}, La21;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lq31;->Η:La21;

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lq31;->Ф()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {p0, v2, v3}, Lq31;->М(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    shr-long v4, v2, v4

    .line 36
    .line 37
    long-to-int v4, v4

    .line 38
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    neg-float v5, v5

    .line 43
    iput v5, v1, La21;->α:F

    .line 44
    .line 45
    const-wide v5, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v2, v5

    .line 51
    long-to-int v2, v2

    .line 52
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    neg-float v3, v3

    .line 57
    iput v3, v1, La21;->β:F

    .line 58
    .line 59
    invoke-virtual {p0}, Lch1;->н()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    int-to-float v3, v3

    .line 64
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    add-float/2addr v4, v3

    .line 69
    iput v4, v1, La21;->γ:F

    .line 70
    .line 71
    invoke-virtual {p0}, Lch1;->м()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    int-to-float v3, v3

    .line 76
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    add-float/2addr v2, v3

    .line 81
    iput v2, v1, La21;->δ:F

    .line 82
    .line 83
    :goto_0
    if-eq p0, v0, :cond_3

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-virtual {p0, v1, v2, v3}, Lq31;->ｋ(La21;ZZ)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, La21;->β()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    :goto_1
    sget-object p0, Lml1;->ε:Lml1;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_2
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    new-instance p0, Lml1;

    .line 106
    .line 107
    iget v0, v1, La21;->α:F

    .line 108
    .line 109
    iget v2, v1, La21;->β:F

    .line 110
    .line 111
    iget v3, v1, La21;->γ:F

    .line 112
    .line 113
    iget v1, v1, La21;->δ:F

    .line 114
    .line 115
    invoke-direct {p0, v0, v2, v3, v1}, Lml1;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    return-object p0
.end method

.method public final ｐ(La80;Z)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lq31;->σ:Lyp0;

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, Lq31;->ψ:La80;

    .line 8
    .line 9
    if-ne p2, p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lq31;->ω:Lyr;

    .line 12
    .line 13
    iget-object v3, v2, Lyp0;->Γ:Lyr;

    .line 14
    .line 15
    invoke-static {p2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Lq31;->Α:Lnp0;

    .line 22
    .line 23
    iget-object v3, v2, Lyp0;->Δ:Lnp0;

    .line 24
    .line 25
    if-eq p2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p2, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move p2, v1

    .line 31
    :goto_1
    iget-object v3, v2, Lyp0;->Γ:Lyr;

    .line 32
    .line 33
    iput-object v3, p0, Lq31;->ω:Lyr;

    .line 34
    .line 35
    iget-object v3, v2, Lyp0;->Δ:Lnp0;

    .line 36
    .line 37
    iput-object v3, p0, Lq31;->Α:Lnp0;

    .line 38
    .line 39
    invoke-virtual {v2}, Lyp0;->Η()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v9, p0, Lq31;->Ο:Ln31;

    .line 44
    .line 45
    if-eqz v3, :cond_a

    .line 46
    .line 47
    if-eqz p1, :cond_a

    .line 48
    .line 49
    iput-object p1, p0, Lq31;->ψ:La80;

    .line 50
    .line 51
    iget-object p1, p0, Lq31;->Ρ:Lw81;

    .line 52
    .line 53
    if-nez p1, :cond_8

    .line 54
    .line 55
    invoke-static {v2}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    iget-object p1, p0, Lq31;->Ξ:Ly1;

    .line 60
    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    new-instance p1, Ln31;

    .line 64
    .line 65
    const/4 p2, 0x0

    .line 66
    invoke-direct {p1, p0, p2}, Ln31;-><init>(Lq31;I)V

    .line 67
    .line 68
    .line 69
    new-instance p2, Ly1;

    .line 70
    .line 71
    const/4 v0, 0x2

    .line 72
    invoke-direct {p2, p0, v0, p1}, Ly1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lq31;->Ξ:Ly1;

    .line 76
    .line 77
    move-object v8, p2

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move-object v8, p1

    .line 80
    :goto_2
    iget-object p1, v7, Landroidx/compose/ui/platform/AndroidComposeView;->щ:Lcw1;

    .line 81
    .line 82
    :cond_3
    iget-object p2, p1, Lcw1;->η:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    .line 85
    .line 86
    iget-object v0, p1, Lcw1;->ζ:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lk21;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-virtual {v0, p2}, Lk21;->κ(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_4
    if-nez p2, :cond_3

    .line 100
    .line 101
    :cond_5
    iget p1, v0, Lk21;->η:I

    .line 102
    .line 103
    if-eqz p1, :cond_6

    .line 104
    .line 105
    add-int/lit8 p1, p1, -0x1

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lk21;->λ(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Ljava/lang/ref/Reference;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    const/4 p1, 0x0

    .line 121
    :goto_3
    check-cast p1, Lw81;

    .line 122
    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    invoke-interface {p1, v8, v9}, Lw81;->ε(Le80;Lp70;)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    new-instance v4, Lya0;

    .line 130
    .line 131
    invoke-virtual {v7}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-interface {p1}, Lua0;->β()Lwa0;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {v7}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-direct/range {v4 .. v9}, Lya0;-><init>(Lwa0;Lua0;Landroidx/compose/ui/platform/AndroidComposeView;Le80;Lp70;)V

    .line 144
    .line 145
    .line 146
    move-object p1, v4

    .line 147
    :goto_4
    iget-wide v3, p0, Lch1;->η:J

    .line 148
    .line 149
    invoke-interface {p1, v3, v4}, Lw81;->γ(J)V

    .line 150
    .line 151
    .line 152
    iget-wide v3, p0, Lq31;->Ε:J

    .line 153
    .line 154
    invoke-interface {p1, v3, v4}, Lw81;->η(J)V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, Lq31;->Ρ:Lw81;

    .line 158
    .line 159
    invoke-virtual {p0, v1}, Lq31;->ｑ(Z)V

    .line 160
    .line 161
    .line 162
    iput-boolean v1, v2, Lyp0;->Ξ:Z

    .line 163
    .line 164
    invoke-virtual {v9}, Ln31;->invoke()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_8
    if-eqz p2, :cond_9

    .line 169
    .line 170
    invoke-virtual {p0, v1}, Lq31;->ｑ(Z)V

    .line 171
    .line 172
    .line 173
    :cond_9
    return-void

    .line 174
    :cond_a
    const/4 p1, 0x0

    .line 175
    iput-object p1, p0, Lq31;->ψ:La80;

    .line 176
    .line 177
    iget-object p2, p0, Lq31;->Ρ:Lw81;

    .line 178
    .line 179
    if-eqz p2, :cond_c

    .line 180
    .line 181
    invoke-interface {p2}, Lw81;->getUnderlyingMatrix-sQKQjiQ()[F

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-static {v3}, Lyh;->Χ([F)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-nez v3, :cond_b

    .line 190
    .line 191
    invoke-virtual {v2, p0}, Lyp0;->Μ(Lq31;)V

    .line 192
    .line 193
    .line 194
    :cond_b
    invoke-interface {p2}, Lw81;->destroy()V

    .line 195
    .line 196
    .line 197
    iput-object p1, p0, Lq31;->Ρ:Lw81;

    .line 198
    .line 199
    iput-boolean v1, v2, Lyp0;->Ξ:Z

    .line 200
    .line 201
    invoke-virtual {v9}, Ln31;->invoke()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-boolean p1, p1, Lq01;->σ:Z

    .line 209
    .line 210
    if-eqz p1, :cond_c

    .line 211
    .line 212
    invoke-virtual {v2}, Lyp0;->Θ()Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-eqz p1, :cond_c

    .line 217
    .line 218
    iget-object p1, v2, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 219
    .line 220
    if-eqz p1, :cond_c

    .line 221
    .line 222
    invoke-virtual {p1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->χ(Lyp0;)V

    .line 223
    .line 224
    .line 225
    :cond_c
    iput-boolean v0, p0, Lq31;->Π:Z

    .line 226
    .line 227
    return-void
.end method

.method public final ｑ(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 2
    .line 3
    iget-object v1, p0, Lq31;->ψ:La80;

    .line 4
    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    sget-object v2, Lq31;->Σ:Lio1;

    .line 10
    .line 11
    invoke-virtual {v2}, Lio1;->γ()V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lq31;->σ:Lyp0;

    .line 15
    .line 16
    iget-object v4, v3, Lyp0;->Γ:Lyr;

    .line 17
    .line 18
    iput-object v4, v2, Lio1;->σ:Lyr;

    .line 19
    .line 20
    iget-object v4, v3, Lyp0;->Δ:Lnp0;

    .line 21
    .line 22
    iput-object v4, v2, Lio1;->τ:Lnp0;

    .line 23
    .line 24
    iget-wide v4, p0, Lch1;->η:J

    .line 25
    .line 26
    invoke-static {v4, v5}, Ls1;->Ζ(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    iput-wide v4, v2, Lio1;->ρ:J

    .line 31
    .line 32
    invoke-static {v3}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    sget-object v5, La1;->ρ:La1;

    .line 41
    .line 42
    new-instance v6, Ly0;

    .line 43
    .line 44
    const/4 v7, 0x6

    .line 45
    invoke-direct {v6, v1, v7, p0}, Ly0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, v4, Ly81;->α:Lkx1;

    .line 49
    .line 50
    invoke-virtual {v1, p0, v5, v6}, Lkx1;->β(Ljava/lang/Object;La80;Lp70;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lq31;->Θ:Ljp0;

    .line 54
    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    new-instance v1, Ljp0;

    .line 58
    .line 59
    invoke-direct {v1}, Ljp0;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lq31;->Θ:Ljp0;

    .line 63
    .line 64
    :cond_0
    sget-object v4, Lq31;->Τ:Ljp0;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget v5, v1, Ljp0;->α:F

    .line 70
    .line 71
    iput v5, v4, Ljp0;->α:F

    .line 72
    .line 73
    iget v5, v1, Ljp0;->β:F

    .line 74
    .line 75
    iput v5, v4, Ljp0;->β:F

    .line 76
    .line 77
    iget v5, v1, Ljp0;->γ:F

    .line 78
    .line 79
    iput v5, v4, Ljp0;->γ:F

    .line 80
    .line 81
    iget v5, v1, Ljp0;->δ:F

    .line 82
    .line 83
    iput v5, v4, Ljp0;->δ:F

    .line 84
    .line 85
    iget v5, v1, Ljp0;->ε:F

    .line 86
    .line 87
    iput v5, v4, Ljp0;->ε:F

    .line 88
    .line 89
    iget v5, v1, Ljp0;->ζ:F

    .line 90
    .line 91
    iput v5, v4, Ljp0;->ζ:F

    .line 92
    .line 93
    iget v5, v1, Ljp0;->η:F

    .line 94
    .line 95
    iput v5, v4, Ljp0;->η:F

    .line 96
    .line 97
    iget v5, v1, Ljp0;->θ:F

    .line 98
    .line 99
    iput v5, v4, Ljp0;->θ:F

    .line 100
    .line 101
    iget-wide v5, v1, Ljp0;->ι:J

    .line 102
    .line 103
    iput-wide v5, v4, Ljp0;->ι:J

    .line 104
    .line 105
    iget v5, v2, Lio1;->ζ:F

    .line 106
    .line 107
    iput v5, v1, Ljp0;->α:F

    .line 108
    .line 109
    iget v5, v2, Lio1;->η:F

    .line 110
    .line 111
    iput v5, v1, Ljp0;->β:F

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    iput v5, v1, Ljp0;->γ:F

    .line 115
    .line 116
    iput v5, v1, Ljp0;->δ:F

    .line 117
    .line 118
    iput v5, v1, Ljp0;->ε:F

    .line 119
    .line 120
    iput v5, v1, Ljp0;->ζ:F

    .line 121
    .line 122
    iput v5, v1, Ljp0;->η:F

    .line 123
    .line 124
    iget v5, v2, Lio1;->μ:F

    .line 125
    .line 126
    iput v5, v1, Ljp0;->θ:F

    .line 127
    .line 128
    iget-wide v5, v2, Lio1;->ν:J

    .line 129
    .line 130
    iput-wide v5, v1, Ljp0;->ι:J

    .line 131
    .line 132
    invoke-interface {v0, v2}, Lw81;->α(Lio1;)V

    .line 133
    .line 134
    .line 135
    iget-boolean v0, p0, Lq31;->χ:Z

    .line 136
    .line 137
    iget-boolean v5, v2, Lio1;->ο:Z

    .line 138
    .line 139
    iput-boolean v5, p0, Lq31;->χ:Z

    .line 140
    .line 141
    iget v2, v2, Lio1;->θ:F

    .line 142
    .line 143
    iput v2, p0, Lq31;->Β:F

    .line 144
    .line 145
    iget v2, v4, Ljp0;->α:F

    .line 146
    .line 147
    iget v6, v1, Ljp0;->α:F

    .line 148
    .line 149
    cmpg-float v2, v2, v6

    .line 150
    .line 151
    const/4 v6, 0x1

    .line 152
    if-nez v2, :cond_1

    .line 153
    .line 154
    iget v2, v4, Ljp0;->β:F

    .line 155
    .line 156
    iget v7, v1, Ljp0;->β:F

    .line 157
    .line 158
    cmpg-float v2, v2, v7

    .line 159
    .line 160
    if-nez v2, :cond_1

    .line 161
    .line 162
    iget v2, v4, Ljp0;->γ:F

    .line 163
    .line 164
    iget v7, v1, Ljp0;->γ:F

    .line 165
    .line 166
    cmpg-float v2, v2, v7

    .line 167
    .line 168
    if-nez v2, :cond_1

    .line 169
    .line 170
    iget v2, v4, Ljp0;->δ:F

    .line 171
    .line 172
    iget v7, v1, Ljp0;->δ:F

    .line 173
    .line 174
    cmpg-float v2, v2, v7

    .line 175
    .line 176
    if-nez v2, :cond_1

    .line 177
    .line 178
    iget v2, v4, Ljp0;->ε:F

    .line 179
    .line 180
    iget v7, v1, Ljp0;->ε:F

    .line 181
    .line 182
    cmpg-float v2, v2, v7

    .line 183
    .line 184
    if-nez v2, :cond_1

    .line 185
    .line 186
    iget v2, v4, Ljp0;->ζ:F

    .line 187
    .line 188
    iget v7, v1, Ljp0;->ζ:F

    .line 189
    .line 190
    cmpg-float v2, v2, v7

    .line 191
    .line 192
    if-nez v2, :cond_1

    .line 193
    .line 194
    iget v2, v4, Ljp0;->η:F

    .line 195
    .line 196
    iget v7, v1, Ljp0;->η:F

    .line 197
    .line 198
    cmpg-float v2, v2, v7

    .line 199
    .line 200
    if-nez v2, :cond_1

    .line 201
    .line 202
    iget v2, v4, Ljp0;->θ:F

    .line 203
    .line 204
    iget v7, v1, Ljp0;->θ:F

    .line 205
    .line 206
    cmpg-float v2, v2, v7

    .line 207
    .line 208
    if-nez v2, :cond_1

    .line 209
    .line 210
    iget-wide v7, v4, Ljp0;->ι:J

    .line 211
    .line 212
    iget-wide v1, v1, Ljp0;->ι:J

    .line 213
    .line 214
    cmp-long v1, v7, v1

    .line 215
    .line 216
    if-nez v1, :cond_1

    .line 217
    .line 218
    move v1, v6

    .line 219
    goto :goto_0

    .line 220
    :cond_1
    const/4 v1, 0x0

    .line 221
    :goto_0
    if-eqz p1, :cond_3

    .line 222
    .line 223
    if-eqz v1, :cond_2

    .line 224
    .line 225
    if-eq v0, v5, :cond_3

    .line 226
    .line 227
    :cond_2
    iget-object p1, v3, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 228
    .line 229
    if-eqz p1, :cond_3

    .line 230
    .line 231
    invoke-virtual {p1, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->χ(Lyp0;)V

    .line 232
    .line 233
    .line 234
    :cond_3
    if-nez v1, :cond_7

    .line 235
    .line 236
    invoke-virtual {v3, p0}, Lyp0;->Μ(Lq31;)V

    .line 237
    .line 238
    .line 239
    iget p0, v3, Lyp0;->Σ:I

    .line 240
    .line 241
    if-lez p0, :cond_7

    .line 242
    .line 243
    invoke-static {v3}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 248
    .line 249
    iget-object p1, p1, Lmx0;->ε:Ln5;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget v0, v3, Lyp0;->Σ:I

    .line 255
    .line 256
    if-lez v0, :cond_4

    .line 257
    .line 258
    iget-object p1, p1, Ln5;->ζ:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p1, Lk21;

    .line 261
    .line 262
    invoke-virtual {p1, v3}, Lk21;->β(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iput-boolean v6, v3, Lyp0;->Ρ:Z

    .line 266
    .line 267
    :cond_4
    const/4 p1, 0x0

    .line 268
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->Ε(Lyp0;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_5
    const-string p0, "updateLayerParameters requires a non-null layerBlock"

    .line 273
    .line 274
    invoke-static {p0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    throw p0

    .line 279
    :cond_6
    if-nez v1, :cond_8

    .line 280
    .line 281
    :cond_7
    return-void

    .line 282
    :cond_8
    const-string p0, "null layer with a non-null layerBlock"

    .line 283
    .line 284
    invoke-static {p0}, Lam0;->β(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return-void
.end method

.method public final ｒ(J)Z
    .locals 4

    .line 1
    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long v2, p1, v0

    .line 7
    .line 8
    xor-long/2addr v0, v2

    .line 9
    const-wide v2, 0x100000001L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v0, v2

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lq31;->Ρ:Lw81;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-boolean p0, p0, Lq31;->χ:Z

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-interface {v0, p1, p2}, Lw81;->ι(J)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    :cond_0
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_1
    const/4 p0, 0x0

    .line 44
    return p0
.end method
