.class public final Lqz2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public l:I

.field public synthetic m:Lx22;

.field public synthetic n:J

.field public final synthetic o:Lj20;

.field public final synthetic p:Lxk1;


# direct methods
.method public constructor <init>(Lj20;Lxk1;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqz2;->o:Lj20;

    .line 2
    .line 3
    iput-object p2, p0, Lqz2;->p:Lxk1;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lx22;

    .line 2
    .line 3
    check-cast p2, Lrs1;

    .line 4
    .line 5
    iget-wide v0, p2, Lrs1;->a:J

    .line 6
    .line 7
    check-cast p3, Lt00;

    .line 8
    .line 9
    new-instance p2, Lqz2;

    .line 10
    .line 11
    iget-object v2, p0, Lqz2;->o:Lj20;

    .line 12
    .line 13
    iget-object p0, p0, Lqz2;->p:Lxk1;

    .line 14
    .line 15
    invoke-direct {p2, v2, p0, p3}, Lqz2;-><init>(Lj20;Lxk1;Lt00;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p2, Lqz2;->m:Lx22;

    .line 19
    .line 20
    iput-wide v0, p2, Lqz2;->n:J

    .line 21
    .line 22
    sget-object p0, La83;->a:La83;

    .line 23
    .line 24
    invoke-virtual {p2, p0}, Lqz2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lqz2;->l:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, Lqz2;->p:Lxk1;

    .line 5
    .line 6
    iget-object v3, p0, Lqz2;->o:Lj20;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v5, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v4

    .line 24
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lqz2;->m:Lx22;

    .line 28
    .line 29
    iget-wide v6, p0, Lqz2;->n:J

    .line 30
    .line 31
    new-instance v0, Lxl2;

    .line 32
    .line 33
    invoke-direct {v0, v2, v6, v7, v4}, Lxl2;-><init>(Lxk1;JLt00;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4, v0, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 37
    .line 38
    .line 39
    iput v5, p0, Lqz2;->l:I

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Lx22;->f(Lu00;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object p0, Lk20;->h:Lk20;

    .line 46
    .line 47
    if-ne p1, p0, :cond_2

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    new-instance p1, Lup1;

    .line 57
    .line 58
    invoke-direct {p1, v2, p0, v4}, Lup1;-><init>(Lxk1;ZLt00;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v4, p1, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 62
    .line 63
    .line 64
    sget-object p0, La83;->a:La83;

    .line 65
    .line 66
    return-object p0
.end method
