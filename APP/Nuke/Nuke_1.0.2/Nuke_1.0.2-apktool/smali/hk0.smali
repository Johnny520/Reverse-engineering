.class public final Lhk0;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public l:Lak0;

.field public m:I

.field public synthetic n:Lak0;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lmn0;


# direct methods
.method public constructor <init>(Lmn0;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhk0;->p:Lmn0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lak0;

    .line 2
    .line 3
    check-cast p3, Lt00;

    .line 4
    .line 5
    new-instance v0, Lhk0;

    .line 6
    .line 7
    iget-object p0, p0, Lhk0;->p:Lmn0;

    .line 8
    .line 9
    invoke-direct {v0, p0, p3}, Lhk0;-><init>(Lmn0;Lt00;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lhk0;->n:Lak0;

    .line 13
    .line 14
    iput-object p2, v0, Lhk0;->o:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object p0, La83;->a:La83;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lhk0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lhk0;->n:Lak0;

    .line 2
    .line 3
    iget-object v1, p0, Lhk0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lhk0;->m:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    sget-object v6, Lk20;->h:Lk20;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v5

    .line 28
    :cond_1
    iget-object v0, p0, Lhk0;->l:Lak0;

    .line 29
    .line 30
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v5, p0, Lhk0;->n:Lak0;

    .line 38
    .line 39
    iput-object v5, p0, Lhk0;->o:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v0, p0, Lhk0;->l:Lak0;

    .line 42
    .line 43
    iput v4, p0, Lhk0;->m:I

    .line 44
    .line 45
    iget-object p1, p0, Lhk0;->p:Lmn0;

    .line 46
    .line 47
    invoke-interface {p1, v1, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v6, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    :goto_0
    iput-object v5, p0, Lhk0;->n:Lak0;

    .line 55
    .line 56
    iput-object v5, p0, Lhk0;->o:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v5, p0, Lhk0;->l:Lak0;

    .line 59
    .line 60
    iput v3, p0, Lhk0;->m:I

    .line 61
    .line 62
    invoke-interface {v0, p1, p0}, Lak0;->m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v6, :cond_4

    .line 67
    .line 68
    :goto_1
    return-object v6

    .line 69
    :cond_4
    :goto_2
    sget-object p0, La83;->a:La83;

    .line 70
    .line 71
    return-object p0
.end method
