.class public final Lok2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Lkf2;

.field public final synthetic p:Lj31;

.field public final synthetic q:Lxk1;

.field public final synthetic r:Lxk1;

.field public final synthetic s:Lxk1;

.field public final synthetic t:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkf2;Lj31;Lxk1;Lxk1;Lxk1;Landroid/content/Context;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lok2;->n:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lok2;->o:Lkf2;

    .line 4
    .line 5
    iput-object p3, p0, Lok2;->p:Lj31;

    .line 6
    .line 7
    iput-object p4, p0, Lok2;->q:Lxk1;

    .line 8
    .line 9
    iput-object p5, p0, Lok2;->r:Lxk1;

    .line 10
    .line 11
    iput-object p6, p0, Lok2;->s:Lxk1;

    .line 12
    .line 13
    iput-object p7, p0, Lok2;->t:Landroid/content/Context;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Ltw2;-><init>(ILt00;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lok2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lok2;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lok2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 9

    .line 1
    new-instance v0, Lok2;

    .line 2
    .line 3
    iget-object v6, p0, Lok2;->s:Lxk1;

    .line 4
    .line 5
    iget-object v7, p0, Lok2;->t:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Lok2;->n:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lok2;->o:Lkf2;

    .line 10
    .line 11
    iget-object v3, p0, Lok2;->p:Lj31;

    .line 12
    .line 13
    iget-object v4, p0, Lok2;->q:Lxk1;

    .line 14
    .line 15
    iget-object v5, p0, Lok2;->r:Lxk1;

    .line 16
    .line 17
    move-object v8, p1

    .line 18
    invoke-direct/range {v0 .. v8}, Lok2;-><init>(Ljava/lang/String;Lkf2;Lj31;Lxk1;Lxk1;Lxk1;Landroid/content/Context;Lt00;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, v0, Lok2;->m:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lok2;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj20;

    .line 4
    .line 5
    iget v0, p0, Lok2;->l:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lok2;->n:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v0, p0, Lok2;->o:Lkf2;

    .line 31
    .line 32
    iget-object v3, p0, Lok2;->p:Lj31;

    .line 33
    .line 34
    :try_start_1
    sget-object v4, Lsq1;->a:Lsq1;

    .line 35
    .line 36
    iget-object v0, v0, Lkf2;->a:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v2, p0, Lok2;->m:Ljava/lang/Object;

    .line 39
    .line 40
    iput v1, p0, Lok2;->l:I

    .line 41
    .line 42
    invoke-virtual {v4, p1, v0, v3, p0}, Lsq1;->m(Ljava/lang/String;Ljava/lang/String;Lj31;Lu00;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    sget-object v0, Lk20;->h:Lk20;

    .line 47
    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    :try_start_2
    check-cast p1, Luq1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :goto_1
    new-instance v0, Lx92;

    .line 55
    .line 56
    invoke-direct {v0, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v0

    .line 60
    :goto_2
    nop

    .line 61
    instance-of v0, p1, Lx92;

    .line 62
    .line 63
    iget-object v1, p0, Lok2;->r:Lxk1;

    .line 64
    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    move-object v0, p1

    .line 68
    check-cast v0, Luq1;

    .line 69
    .line 70
    iget-object v3, p0, Lok2;->q:Lxk1;

    .line 71
    .line 72
    invoke-interface {v3, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lok2;->s:Lxk1;

    .line 79
    .line 80
    invoke-interface {v0, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-static {p1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-nez p1, :cond_4

    .line 94
    .line 95
    const p1, 0x790b0217

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, Lok2;->t:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    :cond_4
    invoke-interface {v1, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    sget-object p0, La83;->a:La83;

    .line 111
    .line 112
    return-object p0
.end method
