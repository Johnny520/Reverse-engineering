.class public final Li/i1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public k:F

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li/k1;Lwf/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li/i1;->h:I

    .line 13
    iput-object p1, p0, Li/i1;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Lxb/i;FLwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Li/i1;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Li/i1;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Li/i1;->k:F

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, Li/i1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Li/i1;

    .line 7
    .line 8
    iget-object v1, p0, Li/i1;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lxb/i;

    .line 11
    .line 12
    iget v2, p0, Li/i1;->k:F

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, p2}, Li/i1;-><init>(Lxb/i;FLwf/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Li/i1;->j:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, Li/i1;

    .line 21
    .line 22
    iget-object v1, p0, Li/i1;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Li/k1;

    .line 25
    .line 26
    invoke-direct {v0, v1, p2}, Li/i1;-><init>(Li/k1;Lwf/c;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Li/i1;->j:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Li/i1;->h:I

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
    invoke-virtual {p0, p1, p2}, Li/i1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Li/i1;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Li/i1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Li/i1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Li/i1;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Li/i1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Li/i1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li/i1;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lqg/t;

    .line 9
    .line 10
    iget v1, p0, Li/i1;->i:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Li/i1;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lxb/i;

    .line 34
    .line 35
    iget-object v1, p1, Lxb/i;->p:Lk/h1;

    .line 36
    .line 37
    new-instance v3, Lxb/c;

    .line 38
    .line 39
    iget v4, p0, Li/i1;->k:F

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-direct {v3, p1, v4, v0, v5}, Lxb/c;-><init>(Lxb/i;FLqg/t;Lwf/c;)V

    .line 43
    .line 44
    .line 45
    iput-object v5, p0, Li/i1;->j:Ljava/lang/Object;

    .line 46
    .line 47
    iput v2, p0, Li/i1;->i:I

    .line 48
    .line 49
    invoke-static {v1, v3, p0}, Lk/h1;->b(Lk/h1;Lfg/l;Lyf/i;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 54
    .line 55
    if-ne p1, v0, :cond_2

    .line 56
    .line 57
    move-object p1, v0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    :goto_1
    return-object p1

    .line 62
    :pswitch_0
    iget v0, p0, Li/i1;->i:I

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    if-ne v0, v1, :cond_3

    .line 68
    .line 69
    iget v0, p0, Li/i1;->k:F

    .line 70
    .line 71
    iget-object v2, p0, Li/i1;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lqg/t;

    .line 74
    .line 75
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Li/i1;->j:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, Lqg/t;

    .line 92
    .line 93
    invoke-interface {p1}, Lqg/t;->n()Lwf/g;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Li/d;->n(Lwf/g;)F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    move-object v2, p1

    .line 102
    :cond_5
    :goto_2
    invoke-static {v2}, Lqg/v;->o(Lqg/t;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    iget-object p1, p0, Li/i1;->l:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, Li/k1;

    .line 111
    .line 112
    new-instance v3, Li/h1;

    .line 113
    .line 114
    invoke-direct {v3, p1, v0}, Li/h1;-><init>(Li/k1;F)V

    .line 115
    .line 116
    .line 117
    iput-object v2, p0, Li/i1;->j:Ljava/lang/Object;

    .line 118
    .line 119
    iput v0, p0, Li/i1;->k:F

    .line 120
    .line 121
    iput v1, p0, Li/i1;->i:I

    .line 122
    .line 123
    invoke-interface {p0}, Lwf/c;->getContext()Lwf/g;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1, v3, p0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    sget-object v3, Lxf/a;->g:Lxf/a;

    .line 136
    .line 137
    if-ne p1, v3, :cond_5

    .line 138
    .line 139
    move-object p1, v3

    .line 140
    goto :goto_3

    .line 141
    :cond_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 142
    .line 143
    :goto_3
    return-object p1

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
