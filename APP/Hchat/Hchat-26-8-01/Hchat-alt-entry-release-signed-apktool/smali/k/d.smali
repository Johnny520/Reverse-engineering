.class public final Lk/d;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Ln/k;

.field public final synthetic k:Ln/m;

.field public final synthetic l:Lk/g;


# direct methods
.method public synthetic constructor <init>(Ln/k;Ln/m;Lk/g;Lwf/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lk/d;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lk/d;->j:Ln/k;

    .line 4
    .line 5
    iput-object p2, p0, Lk/d;->k:Ln/m;

    .line 6
    .line 7
    iput-object p3, p0, Lk/d;->l:Lk/g;

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
    iget p1, p0, Lk/d;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lk/d;

    .line 7
    .line 8
    iget-object v3, p0, Lk/d;->l:Lk/g;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, Lk/d;->j:Ln/k;

    .line 12
    .line 13
    iget-object v2, p0, Lk/d;->k:Ln/m;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Lk/d;-><init>(Ln/k;Ln/m;Lk/g;Lwf/c;I)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, Lk/d;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, Lk/d;->l:Lk/g;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, Lk/d;->j:Ln/k;

    .line 28
    .line 29
    iget-object v3, p0, Lk/d;->k:Ln/m;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, Lk/d;-><init>(Ln/k;Ln/m;Lk/g;Lwf/c;I)V

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
    iget v0, p0, Lk/d;->h:I

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
    invoke-virtual {p0, p1, p2}, Lk/d;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lk/d;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lk/d;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lk/d;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lk/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget v0, p0, Lk/d;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lk/d;->i:I

    .line 7
    .line 8
    iget-object v1, p0, Lk/d;->k:Ln/m;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x1

    .line 12
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-wide v5, Lk/x;->a:J

    .line 39
    .line 40
    iput v3, p0, Lk/d;->i:I

    .line 41
    .line 42
    invoke-static {v5, v6, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v4, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    :goto_0
    iput v2, p0, Lk/d;->i:I

    .line 50
    .line 51
    iget-object p1, p0, Lk/d;->j:Ln/k;

    .line 52
    .line 53
    invoke-virtual {p1, v1, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v4, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    :goto_1
    iget-object p1, p0, Lk/d;->l:Lk/g;

    .line 61
    .line 62
    iput-object v1, p1, Lk/g;->I:Ln/m;

    .line 63
    .line 64
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 65
    .line 66
    :goto_2
    return-object v4

    .line 67
    :pswitch_0
    iget v0, p0, Lk/d;->i:I

    .line 68
    .line 69
    iget-object v1, p0, Lk/d;->k:Ln/m;

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    const/4 v3, 0x1

    .line 73
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    if-eq v0, v3, :cond_6

    .line 78
    .line 79
    if-ne v0, v2, :cond_5

    .line 80
    .line 81
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 86
    .line 87
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    goto :goto_5

    .line 92
    :cond_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-wide v5, Lk/x;->a:J

    .line 100
    .line 101
    iput v3, p0, Lk/d;->i:I

    .line 102
    .line 103
    invoke-static {v5, v6, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v4, :cond_8

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_8
    :goto_3
    iput v2, p0, Lk/d;->i:I

    .line 111
    .line 112
    iget-object p1, p0, Lk/d;->j:Ln/k;

    .line 113
    .line 114
    invoke-virtual {p1, v1, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-ne p1, v4, :cond_9

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_9
    :goto_4
    iget-object p1, p0, Lk/d;->l:Lk/g;

    .line 122
    .line 123
    iput-object v1, p1, Lk/g;->L:Ln/m;

    .line 124
    .line 125
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 126
    .line 127
    :goto_5
    return-object v4

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
