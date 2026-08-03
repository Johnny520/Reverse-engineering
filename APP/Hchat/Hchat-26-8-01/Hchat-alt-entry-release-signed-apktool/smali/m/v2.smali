.class public final Lm/v2;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Lfg/q;

.field public final synthetic k:Lm/t1;

.field public final synthetic l:Ls1/t;


# direct methods
.method public synthetic constructor <init>(Lfg/q;Lm/t1;Ls1/t;Lwf/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lm/v2;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lm/v2;->j:Lfg/q;

    .line 4
    .line 5
    iput-object p2, p0, Lm/v2;->k:Lm/t1;

    .line 6
    .line 7
    iput-object p3, p0, Lm/v2;->l:Ls1/t;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 7

    .line 1
    iget p1, p0, Lm/v2;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm/v2;

    .line 7
    .line 8
    iget-object v3, p0, Lm/v2;->l:Ls1/t;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, Lm/v2;->j:Lfg/q;

    .line 12
    .line 13
    iget-object v2, p0, Lm/v2;->k:Lm/t1;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Lm/v2;-><init>(Lfg/q;Lm/t1;Ls1/t;Lwf/c;I)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, Lm/v2;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, Lm/v2;->l:Ls1/t;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, Lm/v2;->j:Lfg/q;

    .line 28
    .line 29
    iget-object v3, p0, Lm/v2;->k:Lm/t1;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, Lm/v2;-><init>(Lfg/q;Lm/t1;Ls1/t;Lwf/c;I)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lm/v2;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lm/v2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lm/v2;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lm/v2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lm/v2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lm/v2;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lm/v2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lm/v2;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lm/v2;->i:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lm/v2;->l:Ls1/t;

    .line 28
    .line 29
    iget-wide v2, p1, Ls1/t;->c:J

    .line 30
    .line 31
    new-instance p1, Le1/b;

    .line 32
    .line 33
    invoke-direct {p1, v2, v3}, Le1/b;-><init>(J)V

    .line 34
    .line 35
    .line 36
    iput v1, p0, Lm/v2;->i:I

    .line 37
    .line 38
    iget-object v0, p0, Lm/v2;->j:Lfg/q;

    .line 39
    .line 40
    iget-object v1, p0, Lm/v2;->k:Lm/t1;

    .line 41
    .line 42
    invoke-interface {v0, v1, p1, p0}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 47
    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    move-object p1, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    :goto_1
    return-object p1

    .line 55
    :pswitch_0
    iget v0, p0, Lm/v2;->i:I

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    if-ne v0, v1, :cond_3

    .line 61
    .line 62
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lm/v2;->l:Ls1/t;

    .line 77
    .line 78
    iget-wide v2, p1, Ls1/t;->c:J

    .line 79
    .line 80
    new-instance p1, Le1/b;

    .line 81
    .line 82
    invoke-direct {p1, v2, v3}, Le1/b;-><init>(J)V

    .line 83
    .line 84
    .line 85
    iput v1, p0, Lm/v2;->i:I

    .line 86
    .line 87
    iget-object v0, p0, Lm/v2;->j:Lfg/q;

    .line 88
    .line 89
    iget-object v1, p0, Lm/v2;->k:Lm/t1;

    .line 90
    .line 91
    invoke-interface {v0, v1, p1, p0}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 96
    .line 97
    if-ne p1, v0, :cond_5

    .line 98
    .line 99
    move-object p1, v0

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    :goto_3
    return-object p1

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
