.class public final synthetic Lh10;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Lt91;

.field public final synthetic i:Z

.field public final synthetic j:Z

.field public final synthetic k:Lo03;

.field public final synthetic l:Lk03;

.field public final synthetic m:Lxx0;

.field public final synthetic n:Lus1;

.field public final synthetic o:Lb03;

.field public final synthetic p:Lj20;

.field public final synthetic q:Lom;


# direct methods
.method public synthetic constructor <init>(Lt91;ZZLo03;Lk03;Lxx0;Lus1;Lb03;Lj20;Lom;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh10;->h:Lt91;

    .line 5
    .line 6
    iput-boolean p2, p0, Lh10;->i:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lh10;->j:Z

    .line 9
    .line 10
    iput-object p4, p0, Lh10;->k:Lo03;

    .line 11
    .line 12
    iput-object p5, p0, Lh10;->l:Lk03;

    .line 13
    .line 14
    iput-object p6, p0, Lh10;->m:Lxx0;

    .line 15
    .line 16
    iput-object p7, p0, Lh10;->n:Lus1;

    .line 17
    .line 18
    iput-object p8, p0, Lh10;->o:Lb03;

    .line 19
    .line 20
    iput-object p9, p0, Lh10;->p:Lj20;

    .line 21
    .line 22
    iput-object p10, p0, Lh10;->q:Lom;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Lkl0;

    .line 2
    .line 3
    iget-object v3, p0, Lh10;->h:Lt91;

    .line 4
    .line 5
    invoke-virtual {v3}, Lt91;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lkl0;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v7, La83;->a:La83;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p1}, Lkl0;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, v3, Lt91;->f:Lnx1;

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Lt91;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v2, p0, Lh10;->l:Lk03;

    .line 36
    .line 37
    iget-object v5, p0, Lh10;->n:Lus1;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-boolean v0, p0, Lh10;->i:Z

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-boolean v0, p0, Lh10;->j:Z

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Lh10;->k:Lo03;

    .line 50
    .line 51
    iget-object v1, p0, Lh10;->m:Lxx0;

    .line 52
    .line 53
    invoke-static {v0, v3, v2, v1, v5}, Lgf1;->T(Lo03;Lt91;Lk03;Lxx0;Lus1;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v3}, Lgf1;->s(Lt91;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {p1}, Lkl0;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v8, 0x0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v3}, Lt91;->d()Lz03;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    new-instance v0, Lv0;

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    iget-object v1, p0, Lh10;->q:Lom;

    .line 77
    .line 78
    invoke-direct/range {v0 .. v6}, Lv0;-><init>(Lom;Lk03;Lt91;Lz03;Lus1;Lt00;)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x3

    .line 82
    iget-object v2, p0, Lh10;->p:Lj20;

    .line 83
    .line 84
    invoke-static {v2, v8, v0, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {p1}, Lkl0;->a()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    iget-object p0, p0, Lh10;->o:Lb03;

    .line 94
    .line 95
    invoke-virtual {p0, v8}, Lb03;->g(Lrs1;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_1
    return-object v7
.end method
