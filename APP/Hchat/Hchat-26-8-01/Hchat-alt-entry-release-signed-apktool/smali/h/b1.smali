.class public final Lh/b1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:J

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ly0/n;


# direct methods
.method public constructor <init>(Lh/a1;JLh/d1;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh/b1;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lh/b1;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, Lh/b1;->j:J

    .line 7
    .line 8
    iput-object p4, p0, Lh/b1;->l:Ly0/n;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lm/t0;JLwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh/b1;->h:I

    .line 15
    iput-object p1, p0, Lh/b1;->l:Ly0/n;

    iput-wide p2, p0, Lh/b1;->j:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 10

    .line 1
    iget v0, p0, Lh/b1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh/b1;

    .line 7
    .line 8
    iget-object v1, p0, Lh/b1;->l:Ly0/n;

    .line 9
    .line 10
    check-cast v1, Lm/t0;

    .line 11
    .line 12
    iget-wide v2, p0, Lh/b1;->j:J

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, v3, p2}, Lh/b1;-><init>(Lm/t0;JLwf/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lh/b1;->k:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v4, Lh/b1;

    .line 21
    .line 22
    iget-object p1, p0, Lh/b1;->k:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v5, p1

    .line 25
    check-cast v5, Lh/a1;

    .line 26
    .line 27
    iget-object p1, p0, Lh/b1;->l:Ly0/n;

    .line 28
    .line 29
    move-object v8, p1

    .line 30
    check-cast v8, Lh/d1;

    .line 31
    .line 32
    iget-wide v6, p0, Lh/b1;->j:J

    .line 33
    .line 34
    move-object v9, p2

    .line 35
    invoke-direct/range {v4 .. v9}, Lh/b1;-><init>(Lh/a1;JLh/d1;Lwf/c;)V

    .line 36
    .line 37
    .line 38
    return-object v4

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh/b1;->h:I

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
    invoke-virtual {p0, p1, p2}, Lh/b1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lh/b1;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lh/b1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh/b1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lh/b1;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lh/b1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget v0, p0, Lh/b1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh/b1;->i:I

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
    iget-object p1, p0, Lh/b1;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lqg/t;

    .line 30
    .line 31
    iget-object v0, p0, Lh/b1;->l:Ly0/n;

    .line 32
    .line 33
    check-cast v0, Lm/t0;

    .line 34
    .line 35
    iget-object v0, v0, Lm/t0;->R:Lfg/q;

    .line 36
    .line 37
    new-instance v2, Le1/b;

    .line 38
    .line 39
    iget-wide v3, p0, Lh/b1;->j:J

    .line 40
    .line 41
    invoke-direct {v2, v3, v4}, Le1/b;-><init>(J)V

    .line 42
    .line 43
    .line 44
    iput v1, p0, Lh/b1;->i:I

    .line 45
    .line 46
    invoke-interface {v0, p1, v2, p0}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 51
    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    move-object p1, v0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 57
    .line 58
    :goto_1
    return-object p1

    .line 59
    :pswitch_0
    iget-object v0, p0, Lh/b1;->l:Ly0/n;

    .line 60
    .line 61
    check-cast v0, Lh/d1;

    .line 62
    .line 63
    iget-object v1, p0, Lh/b1;->k:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lh/a1;

    .line 66
    .line 67
    iget v2, p0, Lh/b1;->i:I

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    if-ne v2, v3, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, v1, Lh/a1;->a:Li/c;

    .line 89
    .line 90
    new-instance v1, Lu2/l;

    .line 91
    .line 92
    iget-wide v4, p0, Lh/b1;->j:J

    .line 93
    .line 94
    invoke-direct {v1, v4, v5}, Lu2/l;-><init>(J)V

    .line 95
    .line 96
    .line 97
    iget-object v2, v0, Lh/d1;->v:Li/r0;

    .line 98
    .line 99
    iput v3, p0, Lh/b1;->i:I

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    const/16 v5, 0xc

    .line 103
    .line 104
    move-object v4, p0

    .line 105
    move-object v0, p1

    .line 106
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 111
    .line 112
    if-ne p1, v0, :cond_5

    .line 113
    .line 114
    move-object p1, v0

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    :goto_2
    check-cast p1, Li/i;

    .line 117
    .line 118
    iget-object p1, p1, Li/i;->b:Li/h;

    .line 119
    .line 120
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    :goto_3
    return-object p1

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
