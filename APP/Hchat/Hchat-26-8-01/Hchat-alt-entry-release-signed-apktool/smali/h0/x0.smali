.class public final Lh0/x0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh0/d1;ZLwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh0/x0;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lh0/x0;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, Lh0/x0;->j:Z

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

.method public constructor <init>(Li0/a1;Lwf/c;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/x0;->h:I

    .line 13
    iput-boolean p3, p0, Lh0/x0;->j:Z

    iput-object p1, p0, Lh0/x0;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    iget p1, p0, Lh0/x0;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lh0/x0;

    .line 7
    .line 8
    iget-object v0, p0, Lh0/x0;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Li0/a1;

    .line 11
    .line 12
    iget-boolean v1, p0, Lh0/x0;->j:Z

    .line 13
    .line 14
    invoke-direct {p1, v0, p2, v1}, Lh0/x0;-><init>(Li0/a1;Lwf/c;Z)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p1, Lh0/x0;

    .line 19
    .line 20
    iget-object v0, p0, Lh0/x0;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lh0/d1;

    .line 23
    .line 24
    iget-boolean v1, p0, Lh0/x0;->j:Z

    .line 25
    .line 26
    invoke-direct {p1, v0, v1, p2}, Lh0/x0;-><init>(Lh0/d1;ZLwf/c;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh0/x0;->h:I

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
    invoke-virtual {p0, p1, p2}, Lh0/x0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lh0/x0;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lh0/x0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh0/x0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lh0/x0;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lh0/x0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget v0, p0, Lh0/x0;->h:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-boolean v2, p0, Lh0/x0;->j:Z

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, p0, Lh0/x0;->k:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, Li0/a1;

    .line 19
    .line 20
    iget v0, p0, Lh0/x0;->i:I

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v5, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, Lj8/o;->A(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v1, v7

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 41
    .line 42
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-interface {v6, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iput v5, p0, Lh0/x0;->i:I

    .line 49
    .line 50
    const-wide/16 v2, 0x6e

    .line 51
    .line 52
    invoke-static {v2, v3, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v4, :cond_3

    .line 57
    .line 58
    move-object v1, v4

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 61
    .line 62
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-interface {v6, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    return-object v1

    .line 68
    :pswitch_0
    check-cast v6, Lh0/d1;

    .line 69
    .line 70
    iget v0, p0, Lh0/x0;->i:I

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    if-ne v0, v5, :cond_4

    .line 75
    .line 76
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-static {v3}, Lj8/o;->A(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    move-object v1, v7

    .line 84
    goto :goto_3

    .line 85
    :cond_5
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6}, Lh0/d1;->n()Ln2/s;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-wide v8, p1, Ln2/s;->b:J

    .line 93
    .line 94
    invoke-static {v8, v9}, Li2/m0;->c(J)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_7

    .line 99
    .line 100
    invoke-virtual {v6}, Lh0/d1;->n()Ln2/s;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Lig/a;->z(Ln2/s;)Li2/g;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    if-nez v2, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    invoke-virtual {v6}, Lh0/d1;->n()Ln2/s;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-wide v2, p1, Ln2/s;->b:J

    .line 116
    .line 117
    invoke-static {v2, v3}, Li2/m0;->e(J)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-virtual {v6}, Lh0/d1;->n()Ln2/s;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v0, v0, Ln2/s;->a:Li2/g;

    .line 126
    .line 127
    invoke-static {p1, p1}, Li2/e0;->b(II)J

    .line 128
    .line 129
    .line 130
    move-result-wide v2

    .line 131
    invoke-static {v0, v2, v3}, Lh0/d1;->e(Li2/g;J)Ln2/s;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object v0, v6, Lh0/d1;->c:Lfg/l;

    .line 136
    .line 137
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    sget-object p1, Lw/h0;->g:Lw/h0;

    .line 141
    .line 142
    invoke-virtual {v6, p1}, Lh0/d1;->q(Lw/h0;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    :goto_2
    if-nez v7, :cond_8

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_8
    iget-object p1, v6, Lh0/d1;->g:Ly1/y0;

    .line 149
    .line 150
    if-eqz p1, :cond_9

    .line 151
    .line 152
    invoke-static {v7}, Lo/d;->a(Li2/g;)Ly1/x0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput v5, p0, Lh0/x0;->i:I

    .line 157
    .line 158
    check-cast p1, Ly1/h;

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Ly1/h;->a(Ly1/x0;)V

    .line 161
    .line 162
    .line 163
    if-ne v1, v4, :cond_9

    .line 164
    .line 165
    move-object v1, v4

    .line 166
    :cond_9
    :goto_3
    return-object v1

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
