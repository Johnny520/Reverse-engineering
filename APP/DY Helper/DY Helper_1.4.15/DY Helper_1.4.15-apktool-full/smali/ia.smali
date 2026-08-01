.class public final Lia;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqp0;
.implements Lzr1;


# instance fields
.field public τ:La80;


# direct methods
.method public constructor <init>(La80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq01;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lia;->τ:La80;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BlockGraphicsLayerModifier(block="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lia;->τ:La80;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final Φ(Ldw0;Lkx0;J)Lqx0;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Lch1;->ε:I

    .line 6
    .line 7
    iget p4, p2, Lch1;->ζ:I

    .line 8
    .line 9
    new-instance v0, Li3;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, p2, v1, p0}, Li3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkz;->ε:Lkz;

    .line 16
    .line 17
    invoke-interface {p1, p3, p4, p0, v0}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final Ω(Ljs1;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p0, v0}, Lh62;->ф(Lur;I)Lq31;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-boolean v1, v0, Lq31;->Λ:Z

    .line 7
    .line 8
    if-nez v1, :cond_2

    .line 9
    .line 10
    sget-object v1, Lh62;->γ:Lio1;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lio1;

    .line 15
    .line 16
    invoke-direct {v1}, Lio1;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lh62;->γ:Lio1;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v1}, Lio1;->γ()V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object v1, Lh62;->γ:Lio1;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Lq31;->σ:Lyp0;

    .line 31
    .line 32
    iget-object v2, v2, Lyp0;->Γ:Lyr;

    .line 33
    .line 34
    iput-object v2, v1, Lio1;->σ:Lyr;

    .line 35
    .line 36
    iget-wide v2, v0, Lch1;->η:J

    .line 37
    .line 38
    invoke-static {v2, v3}, Ls1;->Ζ(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    iput-wide v2, v1, Lio1;->ρ:J

    .line 43
    .line 44
    invoke-static {}, Le81;->η()Ltw1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Ltw1;->ε()La80;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v2, 0x0

    .line 56
    :goto_1
    invoke-static {v0}, Le81;->κ(Ltw1;)Ltw1;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :try_start_0
    iget-object p0, p0, Lia;->τ:La80;

    .line 61
    .line 62
    invoke-interface {p0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v3, v2}, Le81;->ο(Ltw1;Ltw1;La80;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, v1, Lio1;->ξ:Liv1;

    .line 69
    .line 70
    iget-boolean v0, v1, Lio1;->ο:Z

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    invoke-static {v0, v3, v2}, Le81;->ο(Ltw1;Ltw1;La80;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    iget-object p0, v0, Lq31;->Ι:Liv1;

    .line 79
    .line 80
    iget-boolean v0, v0, Lq31;->Κ:Z

    .line 81
    .line 82
    :goto_2
    if-nez v0, :cond_3

    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    invoke-static {p1, p0}, Lhs1;->β(Ljs1;Liv1;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final γ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ф()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
