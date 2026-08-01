.class public final Lla;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lr50;
.implements Lvz0;


# instance fields
.field public r:Lsw;


# virtual methods
.method public final S(Lf01;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p0, v0}, Lpf1;->O(Lrm;I)Lqj0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-boolean v1, v0, Lqj0;->I:Z

    .line 7
    .line 8
    if-nez v1, :cond_2

    .line 9
    .line 10
    sget-object v1, Lp30;->e:Lgv0;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lgv0;

    .line 15
    .line 16
    invoke-direct {v1}, Lgv0;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lp30;->e:Lgv0;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v1}, Lgv0;->a()V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object v1, Lp30;->e:Lgv0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Lqj0;->r:Lb60;

    .line 31
    .line 32
    iget-object v2, v2, Lb60;->B:Lym;

    .line 33
    .line 34
    iput-object v2, v1, Lgv0;->p:Lym;

    .line 35
    .line 36
    iget-wide v2, v0, Lxq0;->f:J

    .line 37
    .line 38
    invoke-static {v2, v3}, Lo30;->C(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    iput-wide v2, v1, Lgv0;->o:J

    .line 43
    .line 44
    invoke-static {}, Lu50;->k()Ll21;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Ll21;->e()Lsw;

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
    invoke-static {v0}, Lu50;->s(Ll21;)Ll21;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :try_start_0
    iget-object p0, p0, Lla;->r:Lsw;

    .line 61
    .line 62
    invoke-interface {p0, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v3, v2}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, v1, Lgv0;->m:Lx01;

    .line 69
    .line 70
    iget-boolean v0, v1, Lgv0;->n:Z

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    invoke-static {v0, v3, v2}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    iget-object p0, v0, Lqj0;->G:Lx01;

    .line 79
    .line 80
    iget-boolean v0, v0, Lqj0;->H:Z

    .line 81
    .line 82
    :goto_2
    if-nez v0, :cond_3

    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    invoke-static {p1, p0}, Ld01;->b(Lf01;Lx01;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final Y(Lzd0;Lsd0;J)Lyd0;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, Lsd0;->e(J)Lxq0;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Lxq0;->d:I

    .line 6
    .line 7
    iget p4, p2, Lxq0;->e:I

    .line 8
    .line 9
    new-instance v0, Lo4;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-direct {v0, v1, p2, p0}, Lo4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lis;->d:Lis;

    .line 16
    .line 17
    invoke-interface {p1, p3, p4, p0, v0}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

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
    iget-object p0, p0, Lla;->r:Lsw;

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
