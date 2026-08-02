.class public final Lbf;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public l:I


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lt00;

    .line 2
    .line 3
    new-instance p0, Lbf;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-direct {p0, v0, p1}, Ltw2;-><init>(ILt00;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, La83;->a:La83;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lbf;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lbf;->l:I

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
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lve;->a:Lir0;

    .line 23
    .line 24
    iput v2, p0, Lbf;->l:I

    .line 25
    .line 26
    sget-object p1, Lo90;->a:Lc60;

    .line 27
    .line 28
    sget-object p1, Lt50;->j:Lt50;

    .line 29
    .line 30
    new-instance v0, Lsb;

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-direct {v0, v3, v1, v2}, Lsb;-><init>(ILt00;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0, p0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object p1, Lk20;->h:Lk20;

    .line 41
    .line 42
    if-ne p0, p1, :cond_2

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2
    return-object p0
.end method
