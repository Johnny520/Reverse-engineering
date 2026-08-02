.class public final Lnk2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lcq1;

.field public final synthetic o:Z

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Lxk1;

.field public final synthetic r:Lxk1;


# direct methods
.method public constructor <init>(Lcq1;ZLandroid/content/Context;Lxk1;Lxk1;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnk2;->n:Lcq1;

    .line 2
    .line 3
    iput-boolean p2, p0, Lnk2;->o:Z

    .line 4
    .line 5
    iput-object p3, p0, Lnk2;->p:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, Lnk2;->q:Lxk1;

    .line 8
    .line 9
    iput-object p5, p0, Lnk2;->r:Lxk1;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ltw2;-><init>(ILt00;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p2, p1}, Lnk2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lnk2;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lnk2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 7

    .line 1
    new-instance v0, Lnk2;

    .line 2
    .line 3
    iget-object v4, p0, Lnk2;->q:Lxk1;

    .line 4
    .line 5
    iget-object v5, p0, Lnk2;->r:Lxk1;

    .line 6
    .line 7
    iget-object v1, p0, Lnk2;->n:Lcq1;

    .line 8
    .line 9
    iget-boolean v2, p0, Lnk2;->o:Z

    .line 10
    .line 11
    iget-object v3, p0, Lnk2;->p:Landroid/content/Context;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lnk2;-><init>(Lcq1;ZLandroid/content/Context;Lxk1;Lxk1;Lt00;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, v0, Lnk2;->m:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lnk2;->n:Lcq1;

    .line 2
    .line 3
    iget-object v1, v0, Lcq1;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lnk2;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lj20;

    .line 8
    .line 9
    iget v2, p0, Lnk2;->l:I

    .line 10
    .line 11
    sget-object v3, La83;->a:La83;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v4

    .line 31
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-boolean p1, p0, Lnk2;->o:Z

    .line 35
    .line 36
    :try_start_1
    sget-object v2, Lsq1;->a:Lsq1;

    .line 37
    .line 38
    iput-object v4, p0, Lnk2;->m:Ljava/lang/Object;

    .line 39
    .line 40
    iput v5, p0, Lnk2;->l:I

    .line 41
    .line 42
    invoke-virtual {v2, v1, p1, p0}, Lsq1;->n(Ljava/lang/String;ZLu00;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    sget-object v2, Lk20;->h:Lk20;

    .line 47
    .line 48
    if-ne p1, v2, :cond_2

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_2
    :goto_0
    move-object v2, v3

    .line 52
    goto :goto_2

    .line 53
    :goto_1
    new-instance v2, Lx92;

    .line 54
    .line 55
    invoke-direct {v2, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_2
    invoke-static {v2}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_5

    .line 63
    .line 64
    instance-of v2, p1, Lbq1;

    .line 65
    .line 66
    iget-object v6, p0, Lnk2;->r:Lxk1;

    .line 67
    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    new-instance v2, Lvy1;

    .line 71
    .line 72
    iget-object v0, v0, Lcq1;->b:Ljava/lang/String;

    .line 73
    .line 74
    check-cast p1, Lbq1;

    .line 75
    .line 76
    iget-object p1, p1, Lbq1;->h:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v2, v1, v0, p1, v5}, Lvy1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, Lnk2;->q:Lxk1;

    .line 82
    .line 83
    invoke-interface {p0, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v6, v4}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-nez p1, :cond_4

    .line 95
    .line 96
    const p1, 0x790b01f4

    .line 97
    .line 98
    .line 99
    iget-object p0, p0, Lnk2;->p:Landroid/content/Context;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    :cond_4
    invoke-interface {v6, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_3
    return-object v3
.end method
