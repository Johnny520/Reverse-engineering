.class public final Lyb2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lzj0;


# instance fields
.field public final h:Lmn0;


# direct methods
.method public constructor <init>(Lmn0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyb2;->h:Lmn0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lak0;Lt00;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lr2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lr2;

    .line 7
    .line 8
    iget v1, v0, Lr2;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lr2;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lr2;-><init>(Lyb2;Lt00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lr2;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lr2;->n:I

    .line 28
    .line 29
    sget-object v2, La83;->a:La83;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lr2;->k:Lub2;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lub2;

    .line 55
    .line 56
    iget-object v1, v0, Lu00;->i:La20;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-direct {p2, p1, v1}, Lub2;-><init>(Lak0;La20;)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput-object p2, v0, Lr2;->k:Lub2;

    .line 65
    .line 66
    iput v3, v0, Lr2;->n:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 67
    .line 68
    :try_start_2
    iget-object p0, p0, Lyb2;->h:Lmn0;

    .line 69
    .line 70
    invoke-interface {p0, p2, v0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    sget-object p1, Lk20;->h:Lk20;

    .line 75
    .line 76
    if-ne p0, p1, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object p0, v2

    .line 80
    :goto_1
    if-ne p0, p1, :cond_4

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    move-object p0, p2

    .line 84
    :goto_2
    invoke-virtual {p0}, Lu00;->s()V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :catchall_1
    move-exception p0

    .line 89
    move-object p1, p0

    .line 90
    :goto_3
    move-object p0, p2

    .line 91
    goto :goto_4

    .line 92
    :catchall_2
    move-exception p1

    .line 93
    goto :goto_3

    .line 94
    :goto_4
    invoke-virtual {p0}, Lu00;->s()V

    .line 95
    .line 96
    .line 97
    throw p1
.end method
