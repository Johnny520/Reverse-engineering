.class public final Ln/e;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Ln/k;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ln/k;Li0/a1;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Ln/e;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ln/e;->j:Ln/k;

    .line 4
    .line 5
    iput-object p2, p0, Ln/e;->k:Li0/a1;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget p1, p0, Ln/e;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ln/e;

    .line 7
    .line 8
    iget-object v0, p0, Ln/e;->k:Li0/a1;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object v2, p0, Ln/e;->j:Ln/k;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Ln/e;-><init>(Ln/k;Li0/a1;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Ln/e;

    .line 18
    .line 19
    iget-object v0, p0, Ln/e;->k:Li0/a1;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iget-object v2, p0, Ln/e;->j:Ln/k;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Ln/e;-><init>(Ln/k;Li0/a1;Lwf/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, Ln/e;

    .line 29
    .line 30
    iget-object v0, p0, Ln/e;->k:Li0/a1;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iget-object v2, p0, Ln/e;->j:Ln/k;

    .line 34
    .line 35
    invoke-direct {p1, v2, v0, p2, v1}, Ln/e;-><init>(Ln/k;Li0/a1;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    return-object p1

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
    iget v0, p0, Ln/e;->h:I

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
    invoke-virtual {p0, p1, p2}, Ln/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ln/e;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ln/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ln/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ln/e;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ln/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ln/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ln/e;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ln/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget v0, p0, Ln/e;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ln/e;->i:I

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
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Ln/e;->j:Ln/k;

    .line 35
    .line 36
    iget-object v0, v0, Ln/k;->a:Ltg/r;

    .line 37
    .line 38
    new-instance v2, Ln/d;

    .line 39
    .line 40
    iget-object v3, p0, Ln/e;->k:Li0/a1;

    .line 41
    .line 42
    const/4 v4, 0x2

    .line 43
    invoke-direct {v2, p1, v3, v4}, Ln/d;-><init>(Ljava/util/ArrayList;Li0/a1;I)V

    .line 44
    .line 45
    .line 46
    iput v1, p0, Ln/e;->i:I

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v2, p0}, Ltg/r;->j(Ltg/r;Ltg/e;Lwf/c;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 55
    .line 56
    :goto_0
    return-object p1

    .line 57
    :pswitch_0
    iget v0, p0, Ln/e;->i:I

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    if-ne v0, v1, :cond_2

    .line 63
    .line 64
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Ln/e;->j:Ln/k;

    .line 86
    .line 87
    iget-object v0, v0, Ln/k;->a:Ltg/r;

    .line 88
    .line 89
    new-instance v2, Ln/d;

    .line 90
    .line 91
    iget-object v3, p0, Ln/e;->k:Li0/a1;

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    invoke-direct {v2, p1, v3, v4}, Ln/d;-><init>(Ljava/util/ArrayList;Li0/a1;I)V

    .line 95
    .line 96
    .line 97
    iput v1, p0, Ln/e;->i:I

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v2, p0}, Ltg/r;->j(Ltg/r;Ltg/e;Lwf/c;)V

    .line 103
    .line 104
    .line 105
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 106
    .line 107
    :goto_1
    return-object p1

    .line 108
    :pswitch_1
    iget v0, p0, Ln/e;->i:I

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    if-ne v0, v1, :cond_4

    .line 114
    .line 115
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 122
    .line 123
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x0

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    new-instance p1, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Ln/e;->j:Ln/k;

    .line 137
    .line 138
    iget-object v0, v0, Ln/k;->a:Ltg/r;

    .line 139
    .line 140
    new-instance v2, Ln/d;

    .line 141
    .line 142
    iget-object v3, p0, Ln/e;->k:Li0/a1;

    .line 143
    .line 144
    const/4 v4, 0x0

    .line 145
    invoke-direct {v2, p1, v3, v4}, Ln/d;-><init>(Ljava/util/ArrayList;Li0/a1;I)V

    .line 146
    .line 147
    .line 148
    iput v1, p0, Ln/e;->i:I

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v2, p0}, Ltg/r;->j(Ltg/r;Ltg/e;Lwf/c;)V

    .line 154
    .line 155
    .line 156
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 157
    .line 158
    :goto_2
    return-object p1

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
