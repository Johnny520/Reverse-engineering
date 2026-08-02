.class public final Lqc3;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:Lxk1;

.field public m:I

.field public final synthetic n:Lxk1;

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(Lxk1;ZLt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqc3;->n:Lxk1;

    .line 2
    .line 3
    iput-boolean p2, p0, Lqc3;->o:Z

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p2, p1}, Lqc3;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lqc3;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lqc3;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 1

    .line 1
    new-instance p2, Lqc3;

    .line 2
    .line 3
    iget-object v0, p0, Lqc3;->n:Lxk1;

    .line 4
    .line 5
    iget-boolean p0, p0, Lqc3;->o:Z

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p1}, Lqc3;-><init>(Lxk1;ZLt00;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lqc3;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lqc3;->l:Lxk1;

    .line 10
    .line 11
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lmc3;->a:Lmc3;

    .line 25
    .line 26
    iget-object v0, p0, Lqc3;->n:Lxk1;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lo90;->a:Lc60;

    .line 32
    .line 33
    sget-object p1, Lt50;->j:Lt50;

    .line 34
    .line 35
    new-instance v3, Lpc3;

    .line 36
    .line 37
    iget-boolean v4, p0, Lqc3;->o:Z

    .line 38
    .line 39
    invoke-direct {v3, v4, v1}, Lpc3;-><init>(ZLt00;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lqc3;->l:Lxk1;

    .line 43
    .line 44
    iput v2, p0, Lqc3;->m:I

    .line 45
    .line 46
    invoke-static {p1, v3, p0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object p0, Lk20;->h:Lk20;

    .line 51
    .line 52
    if-ne p1, p0, :cond_2

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    move-object p0, v0

    .line 56
    :goto_0
    check-cast p1, Lnc3;

    .line 57
    .line 58
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, La83;->a:La83;

    .line 62
    .line 63
    return-object p0
.end method
