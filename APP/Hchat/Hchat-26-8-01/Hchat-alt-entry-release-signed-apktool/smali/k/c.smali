.class public final Lk/c;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Ln/k;

.field public final synthetic k:Ln/m;


# direct methods
.method public synthetic constructor <init>(Ln/k;Ln/m;Lwf/c;I)V
    .locals 0

    .line 13
    iput p4, p0, Lk/c;->h:I

    iput-object p1, p0, Lk/c;->j:Ln/k;

    iput-object p2, p0, Lk/c;->k:Ln/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Ln/m;Ln/k;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lk/c;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lk/c;->k:Ln/m;

    .line 5
    .line 6
    iput-object p2, p0, Lk/c;->j:Ln/k;

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
    iget p1, p0, Lk/c;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lk/c;

    .line 7
    .line 8
    iget-object v0, p0, Lk/c;->k:Ln/m;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object v2, p0, Lk/c;->j:Ln/k;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lk/c;-><init>(Ln/k;Ln/m;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lk/c;

    .line 18
    .line 19
    iget-object v0, p0, Lk/c;->k:Ln/m;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iget-object v2, p0, Lk/c;->j:Ln/k;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lk/c;-><init>(Ln/k;Ln/m;Lwf/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, Lk/c;

    .line 29
    .line 30
    iget-object v0, p0, Lk/c;->k:Ln/m;

    .line 31
    .line 32
    iget-object v1, p0, Lk/c;->j:Ln/k;

    .line 33
    .line 34
    invoke-direct {p1, v0, v1, p2}, Lk/c;-><init>(Ln/m;Ln/k;Lwf/c;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk/c;->h:I

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
    invoke-virtual {p0, p1, p2}, Lk/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lk/c;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lk/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lk/c;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lk/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lk/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lk/c;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lk/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lk/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lk/c;->i:I

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
    iput v1, p0, Lk/c;->i:I

    .line 28
    .line 29
    iget-object p1, p0, Lk/c;->j:Ln/k;

    .line 30
    .line 31
    iget-object v0, p0, Lk/c;->k:Ln/m;

    .line 32
    .line 33
    invoke-virtual {p1, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 38
    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    move-object p1, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    :goto_1
    return-object p1

    .line 46
    :pswitch_0
    iget v0, p0, Lk/c;->i:I

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    if-ne v0, v1, :cond_3

    .line 52
    .line 53
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput v1, p0, Lk/c;->i:I

    .line 68
    .line 69
    iget-object p1, p0, Lk/c;->j:Ln/k;

    .line 70
    .line 71
    iget-object v0, p0, Lk/c;->k:Ln/m;

    .line 72
    .line 73
    invoke-virtual {p1, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 78
    .line 79
    if-ne p1, v0, :cond_5

    .line 80
    .line 81
    move-object p1, v0

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 84
    .line 85
    :goto_3
    return-object p1

    .line 86
    :pswitch_1
    iget v0, p0, Lk/c;->i:I

    .line 87
    .line 88
    const/4 v1, 0x1

    .line 89
    if-eqz v0, :cond_7

    .line 90
    .line 91
    if-ne v0, v1, :cond_6

    .line 92
    .line 93
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_6
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 98
    .line 99
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    goto :goto_5

    .line 104
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance p1, Ln/n;

    .line 108
    .line 109
    iget-object v0, p0, Lk/c;->k:Ln/m;

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ln/n;-><init>(Ln/m;)V

    .line 112
    .line 113
    .line 114
    iput v1, p0, Lk/c;->i:I

    .line 115
    .line 116
    iget-object v0, p0, Lk/c;->j:Ln/k;

    .line 117
    .line 118
    invoke-virtual {v0, p1, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 123
    .line 124
    if-ne p1, v0, :cond_8

    .line 125
    .line 126
    move-object p1, v0

    .line 127
    goto :goto_5

    .line 128
    :cond_8
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 129
    .line 130
    :goto_5
    return-object p1

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
