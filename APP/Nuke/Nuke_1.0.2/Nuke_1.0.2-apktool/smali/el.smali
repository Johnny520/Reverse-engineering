.class public final Lel;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;
.implements Lon2;


# instance fields
.field public v:Lin0;


# direct methods
.method public constructor <init>(Lin0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lel;->v:Lin0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, Lif1;->e(J)Lsz1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Lsz1;->h:I

    .line 6
    .line 7
    iget p4, p2, Lsz1;->i:I

    .line 8
    .line 9
    new-instance v0, Lfa;

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-direct {v0, v1, p2, p0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lce0;->h:Lce0;

    .line 16
    .line 17
    invoke-interface {p1, p3, p4, p0, v0}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l0(Lzn2;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p0, v0}, Lsp0;->Z(Lt60;I)Lzn1;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-boolean v1, v0, Lzn1;->M:Z

    .line 7
    .line 8
    if-nez v1, :cond_2

    .line 9
    .line 10
    sget-object v1, Lte;->b:Lca2;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lca2;

    .line 15
    .line 16
    invoke-direct {v1}, Lca2;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lte;->b:Lca2;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v1}, Lca2;->a()V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object v1, Lte;->b:Lca2;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Lzn1;->v:Lr61;

    .line 31
    .line 32
    iget-object v2, v2, Lr61;->F:Le70;

    .line 33
    .line 34
    iput-object v2, v1, Lca2;->x:Le70;

    .line 35
    .line 36
    iget-wide v2, v0, Lsz1;->j:J

    .line 37
    .line 38
    invoke-static {v2, v3}, Ls11;->q0(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    iput-wide v2, v1, Lca2;->w:J

    .line 43
    .line 44
    invoke-static {}, Ltl;->B()Lvr2;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Lvr2;->e()Lin0;

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
    invoke-static {v0}, Ltl;->K(Lvr2;)Lvr2;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :try_start_0
    iget-object p0, p0, Lel;->v:Lin0;

    .line 61
    .line 62
    invoke-interface {p0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v3, v2}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, v1, Lca2;->u:Leq2;

    .line 69
    .line 70
    iget-boolean v0, v1, Lca2;->v:Z

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    invoke-static {v0, v3, v2}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    iget-object p0, v0, Lzn1;->K:Leq2;

    .line 79
    .line 80
    iget-boolean v0, v0, Lzn1;->L:Z

    .line 81
    .line 82
    :goto_2
    if-nez v0, :cond_3

    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    invoke-static {p1, p0}, Lxn2;->c(Lzn2;Leq2;)V

    .line 86
    .line 87
    .line 88
    return-void
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
    iget-object p0, p0, Lel;->v:Lin0;

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
