.class public abstract Lfw0;
.super Ldw0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lkx0;


# instance fields
.field public final σ:Lq31;

.field public τ:J

.field public υ:Ljava/util/LinkedHashMap;

.field public final φ:Lgw0;

.field public χ:Lqx0;

.field public final ψ:Lu11;


# direct methods
.method public constructor <init>(Lq31;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldw0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfw0;->σ:Lq31;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Lfw0;->τ:J

    .line 9
    .line 10
    new-instance p1, Lgw0;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lgw0;-><init>(Lfw0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lfw0;->φ:Lgw0;

    .line 16
    .line 17
    sget-object p1, Lz31;->α:Lu11;

    .line 18
    .line 19
    new-instance p1, Lu11;

    .line 20
    .line 21
    invoke-direct {p1}, Lu11;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lfw0;->ψ:Lu11;

    .line 25
    .line 26
    return-void
.end method

.method public static final К(Lfw0;Lqx0;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lqx0;->ε()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p1}, Lqx0;->β()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    int-to-long v2, v0

    .line 12
    const/16 v0, 0x20

    .line 13
    .line 14
    shl-long/2addr v2, v0

    .line 15
    int-to-long v0, v1

    .line 16
    const-wide v4, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v0, v4

    .line 22
    or-long/2addr v0, v2

    .line 23
    invoke-virtual {p0, v0, v1}, Lch1;->ф(J)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Lch1;->ф(J)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Lfw0;->χ:Lqx0;

    .line 33
    .line 34
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-object v0, p0, Lfw0;->υ:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    :cond_1
    invoke-interface {p1}, Lqx0;->γ()Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    :cond_2
    invoke-interface {p1}, Lqx0;->γ()Ljava/util/Map;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v1, p0, Lfw0;->υ:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lfw0;->σ:Lq31;

    .line 75
    .line 76
    iget-object v0, v0, Lq31;->σ:Lyp0;

    .line 77
    .line 78
    iget-object v0, v0, Lyp0;->Λ:Lbq0;

    .line 79
    .line 80
    iget-object v0, v0, Lbq0;->ρ:Ljw0;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v0, v0, Ljw0;->φ:Lzp0;

    .line 86
    .line 87
    invoke-virtual {v0}, Lzp0;->ζ()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lfw0;->υ:Ljava/util/LinkedHashMap;

    .line 91
    .line 92
    if-nez v0, :cond_3

    .line 93
    .line 94
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lfw0;->υ:Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    :cond_3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1}, Lqx0;->γ()Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    iput-object p1, p0, Lfw0;->χ:Lqx0;

    .line 112
    .line 113
    return-void
.end method


# virtual methods
.method public final getLayoutDirection()Lnp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 4
    .line 5
    iget-object p0, p0, Lyp0;->Δ:Lnp0;

    .line 6
    .line 7
    return-object p0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq31;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq31;->θ()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final λ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq31;->λ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ν()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final А()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->χ:Lqx0;

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
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final В()Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->χ:Lqx0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "LookaheadDelegate has not been measured yet when measureResult is requested."

    .line 7
    .line 8
    invoke-static {p0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    throw p0
.end method

.method public final Г()Ldw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lq31;->У()Lfw0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final Д()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lfw0;->τ:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final И()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lfw0;->τ:J

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    invoke-virtual {p0, v0, v1, v2, v3}, Lfw0;->у(JFLa80;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public Л()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lfw0;->В()Lqx0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lqx0;->α()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final М(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lfw0;->τ:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lum0;->α(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-wide p1, p0, Lfw0;->τ:J

    .line 10
    .line 11
    iget-object p1, p0, Lfw0;->σ:Lq31;

    .line 12
    .line 13
    iget-object p2, p1, Lq31;->σ:Lyp0;

    .line 14
    .line 15
    iget-object p2, p2, Lyp0;->Λ:Lbq0;

    .line 16
    .line 17
    iget-object p2, p2, Lbq0;->ρ:Ljw0;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Ljw0;->щ()V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {p1}, Ldw0;->Ж(Lq31;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-boolean p1, p0, Ldw0;->ξ:Z

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lfw0;->В()Lqx0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Ldw0;->щ(Lqx0;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public final Н(Lfw0;Z)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    iget-wide v2, p0, Lfw0;->τ:J

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lum0;->γ(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 16
    .line 17
    iget-object p0, p0, Lq31;->υ:Lq31;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lq31;->У()Lfw0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-wide v0
.end method

.method public final у(JFLa80;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfw0;->М(J)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Ldw0;->ν:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Lfw0;->Л()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final ю()Ldw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    iget-object p0, p0, Lq31;->τ:Lq31;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lq31;->У()Lfw0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final я()Lmp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->φ:Lgw0;

    .line 2
    .line 3
    return-object p0
.end method
