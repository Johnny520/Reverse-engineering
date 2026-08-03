.class public final Lwb/sn;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/sn;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/sn;->j:Li0/a1;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    iget p1, p0, Lwb/sn;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lwb/sn;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/sn;->j:Li0/a1;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {p1, v0, p2, v1}, Lwb/sn;-><init>(Li0/a1;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lwb/sn;

    .line 16
    .line 17
    iget-object v0, p0, Lwb/sn;->j:Li0/a1;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, v0, p2, v1}, Lwb/sn;-><init>(Li0/a1;Lwf/c;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/sn;->h:I

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
    invoke-virtual {p0, p1, p2}, Lwb/sn;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/sn;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/sn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/sn;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lwb/sn;

    .line 29
    .line 30
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lwb/sn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/sn;->h:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, Lxf/a;->g:Lxf/a;

    .line 13
    .line 14
    iget v5, v0, Lwb/sn;->i:I

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v3}, Lj8/o;->A(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    iget-object v2, v0, Lwb/sn;->j:Li0/a1;

    .line 29
    .line 30
    sget-object v3, Lfb/v0;->a:Lrb/k;

    .line 31
    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    invoke-virtual {v3}, Lrb/k;->l()Lrb/m;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    new-instance v5, Lrb/m;

    .line 40
    .line 41
    sget-object v12, Ltf/t;->g:Ltf/t;

    .line 42
    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    const/16 v18, 0x0

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    const-string v8, "\u7b49\u5f85\u68c0\u6d4b"

    .line 50
    .line 51
    const-string v9, ""

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v14, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    move-object v13, v12

    .line 60
    invoke-direct/range {v5 .. v18}, Lrb/m;-><init>(ZZLjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/List;ZIIII)V

    .line 61
    .line 62
    .line 63
    move-object v3, v5

    .line 64
    :goto_1
    sget-object v5, Lwb/ho;->a:Log/k;

    .line 65
    .line 66
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iput v4, v0, Lwb/sn;->i:I

    .line 70
    .line 71
    const-wide/16 v2, 0x1f4

    .line 72
    .line 73
    invoke-static {v2, v3, v0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-ne v2, v1, :cond_2

    .line 78
    .line 79
    move-object v2, v1

    .line 80
    :goto_2
    return-object v2

    .line 81
    :pswitch_0
    iget-object v1, v0, Lwb/sn;->j:Li0/a1;

    .line 82
    .line 83
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 84
    .line 85
    iget v6, v0, Lwb/sn;->i:I

    .line 86
    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    if-ne v6, v4, :cond_4

    .line 90
    .line 91
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    invoke-static {v3}, Lj8/o;->A(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :goto_3
    sget-object v2, Lwb/ho;->a:Log/k;

    .line 103
    .line 104
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-lez v2, :cond_7

    .line 115
    .line 116
    iput v4, v0, Lwb/sn;->i:I

    .line 117
    .line 118
    const-wide/16 v2, 0x3e8

    .line 119
    .line 120
    invoke-static {v2, v3, v0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-ne v2, v5, :cond_6

    .line 125
    .line 126
    move-object v2, v5

    .line 127
    goto :goto_5

    .line 128
    :cond_6
    :goto_4
    sget-object v2, Lwb/ho;->a:Log/k;

    .line 129
    .line 130
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    sub-int/2addr v2, v4

    .line 141
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 150
    .line 151
    :goto_5
    return-object v2

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
