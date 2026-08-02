.class public final Lmq;
.super Lhq;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final k:Lzj0;

.field public final l:Lnn0;


# direct methods
.method public constructor <init>(Lnn0;Lzj0;La20;ILhn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p4, p5}, Lhq;-><init>(La20;ILhn;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lmq;->k:Lzj0;

    .line 5
    .line 6
    iput-object p1, p0, Lmq;->l:Lnn0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lak0;Lt00;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lhq;->i:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    sget-object v2, Lk20;->h:Lk20;

    .line 5
    .line 6
    if-ne v0, v1, :cond_4

    .line 7
    .line 8
    invoke-interface {p2}, Lt00;->f()La20;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    new-instance v3, Lye;

    .line 15
    .line 16
    const/16 v4, 0x1b

    .line 17
    .line 18
    invoke-direct {v3, v4}, Lye;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, Lhq;->h:La20;

    .line 22
    .line 23
    invoke-interface {v4, v3, v1}, La20;->r(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0, v4}, La20;->k(La20;)La20;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v1, 0x0

    .line 41
    invoke-static {v0, v4, v1}, Lrg3;->w(La20;La20;Z)La20;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-static {v1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Lmq;->g(Lak0;Lt00;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v2, :cond_5

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    sget-object v3, Lgd3;->p:Lgd3;

    .line 59
    .line 60
    invoke-interface {v1, v3}, La20;->o(Lz10;)Ly10;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v0, v3}, La20;->o(Lz10;)Ly10;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v4, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-interface {p2}, Lt00;->f()La20;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    instance-of v3, p1, Lto2;

    .line 79
    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    instance-of v3, p1, Ljo1;

    .line 83
    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    new-instance v3, Lzc;

    .line 88
    .line 89
    invoke-direct {v3, p1, v0}, Lzc;-><init>(Lak0;La20;)V

    .line 90
    .line 91
    .line 92
    move-object p1, v3

    .line 93
    :cond_3
    :goto_1
    new-instance v0, La2;

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    const/16 v4, 0x9

    .line 97
    .line 98
    invoke-direct {v0, p0, v3, v4}, La2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Lfg1;->R(La20;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {v1, p1, p0, v0, p2}, Lgf1;->c0(La20;Ljava/lang/Object;Ljava/lang/Object;Lmn0;Lt00;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v2, :cond_5

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_4
    invoke-super {p0, p1, p2}, Lhq;->a(Lak0;Lt00;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v2, :cond_5

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_5
    sget-object p0, La83;->a:La83;

    .line 120
    .line 121
    return-object p0
.end method

.method public final c(Lo32;Lt00;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lto2;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lto2;-><init>(Lo32;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, Lmq;->g(Lak0;Lt00;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Lk20;->h:Lk20;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 16
    .line 17
    return-object p0
.end method

.method public final d(La20;ILhn;)Lhq;
    .locals 6

    .line 1
    new-instance v0, Lmq;

    .line 2
    .line 3
    iget-object v1, p0, Lmq;->l:Lnn0;

    .line 4
    .line 5
    iget-object v2, p0, Lmq;->k:Lzj0;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, Lmq;-><init>(Lnn0;Lzj0;La20;ILhn;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final g(Lak0;Lt00;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljq;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Ljq;-><init>(Lmq;Lak0;Lt00;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, Lte;->u(Lmn0;Lt00;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Lk20;->h:Lk20;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 17
    .line 18
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmq;->k:Lzj0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Lhq;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
