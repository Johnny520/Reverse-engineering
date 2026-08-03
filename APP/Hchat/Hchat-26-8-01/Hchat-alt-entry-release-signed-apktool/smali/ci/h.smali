.class public final Lci/h;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lqg/r0;

.field public final synthetic l:Lyf/i;


# direct methods
.method public constructor <init>(Lqg/r0;Lfg/p;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lci/h;->h:I

    .line 2
    .line 3
    packed-switch p4, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lci/h;->k:Lqg/r0;

    .line 7
    .line 8
    check-cast p2, Lyf/i;

    .line 9
    .line 10
    iput-object p2, p0, Lci/h;->l:Lyf/i;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iput-object p1, p0, Lci/h;->k:Lqg/r0;

    .line 18
    .line 19
    check-cast p2, Lyf/i;

    .line 20
    .line 21
    iput-object p2, p0, Lci/h;->l:Lyf/i;

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Lci/h;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lci/h;

    .line 7
    .line 8
    iget-object v1, p0, Lci/h;->l:Lyf/i;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Lci/h;->k:Lqg/r0;

    .line 12
    .line 13
    invoke-direct {v0, v3, v1, p2, v2}, Lci/h;-><init>(Lqg/r0;Lfg/p;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lci/h;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lci/h;

    .line 20
    .line 21
    iget-object v1, p0, Lci/h;->l:Lyf/i;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object v3, p0, Lci/h;->k:Lqg/r0;

    .line 25
    .line 26
    invoke-direct {v0, v3, v1, p2, v2}, Lci/h;-><init>(Lqg/r0;Lfg/p;Lwf/c;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lci/h;->j:Ljava/lang/Object;

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
    iget v0, p0, Lci/h;->h:I

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
    invoke-virtual {p0, p1, p2}, Lci/h;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lci/h;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lci/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lci/h;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lci/h;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lci/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget v0, p0, Lci/h;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lci/h;->i:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x1

    .line 10
    sget-object v3, Lxf/a;->g:Lxf/a;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    iget-object v0, p0, Lci/h;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lqg/t;

    .line 32
    .line 33
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lci/h;->j:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    check-cast v0, Lqg/t;

    .line 44
    .line 45
    iput-object v0, p0, Lci/h;->j:Ljava/lang/Object;

    .line 46
    .line 47
    iput v2, p0, Lci/h;->i:I

    .line 48
    .line 49
    iget-object p1, p0, Lci/h;->k:Lqg/r0;

    .line 50
    .line 51
    invoke-interface {p1, p0}, Lqg/r0;->g(Lyf/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v3, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 59
    iput-object p1, p0, Lci/h;->j:Ljava/lang/Object;

    .line 60
    .line 61
    iput v1, p0, Lci/h;->i:I

    .line 62
    .line 63
    iget-object p1, p0, Lci/h;->l:Lyf/i;

    .line 64
    .line 65
    invoke-interface {p1, v0, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v3, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_1
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 73
    .line 74
    :goto_2
    return-object v3

    .line 75
    :pswitch_0
    iget-object v0, p0, Lci/h;->j:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lqg/t;

    .line 78
    .line 79
    iget v1, p0, Lci/h;->i:I

    .line 80
    .line 81
    const/4 v2, 0x2

    .line 82
    const/4 v3, 0x1

    .line 83
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 84
    .line 85
    if-eqz v1, :cond_7

    .line 86
    .line 87
    if-eq v1, v3, :cond_6

    .line 88
    .line 89
    if-ne v1, v2, :cond_5

    .line 90
    .line 91
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    goto :goto_5

    .line 102
    :cond_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, Lci/h;->j:Ljava/lang/Object;

    .line 110
    .line 111
    iput v3, p0, Lci/h;->i:I

    .line 112
    .line 113
    iget-object p1, p0, Lci/h;->k:Lqg/r0;

    .line 114
    .line 115
    invoke-interface {p1, p0}, Lqg/r0;->g(Lyf/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v4, :cond_8

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_8
    :goto_3
    const/4 p1, 0x0

    .line 123
    iput-object p1, p0, Lci/h;->j:Ljava/lang/Object;

    .line 124
    .line 125
    iput v2, p0, Lci/h;->i:I

    .line 126
    .line 127
    iget-object p1, p0, Lci/h;->l:Lyf/i;

    .line 128
    .line 129
    invoke-interface {p1, v0, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-ne p1, v4, :cond_9

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_9
    :goto_4
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 137
    .line 138
    :goto_5
    return-object v4

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
