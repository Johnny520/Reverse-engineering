.class public final Lh0/d0;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public h:J

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLgg/t;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh0/d0;->g:I

    .line 3
    .line 4
    iput-wide p1, p0, Lh0/d0;->h:J

    .line 5
    .line 6
    iput-object p3, p0, Lh0/d0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0, p4}, Lyf/h;-><init>(Lwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ls1/t;Lwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/d0;->g:I

    .line 12
    iput-object p1, p0, Lh0/d0;->k:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lyf/h;-><init>(Lwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Lh0/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh0/d0;

    .line 7
    .line 8
    iget-object v1, p0, Lh0/d0;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ls1/t;

    .line 11
    .line 12
    invoke-direct {v0, v1, p2}, Lh0/d0;-><init>(Ls1/t;Lwf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lh0/d0;->j:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, Lh0/d0;

    .line 19
    .line 20
    iget-wide v1, p0, Lh0/d0;->h:J

    .line 21
    .line 22
    iget-object v3, p0, Lh0/d0;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lgg/t;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2, v3, p2}, Lh0/d0;-><init>(JLgg/t;Lwf/c;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lh0/d0;->j:Ljava/lang/Object;

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
    iget v0, p0, Lh0/d0;->g:I

    .line 2
    .line 3
    check-cast p1, Ls1/k0;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lh0/d0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lh0/d0;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lh0/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh0/d0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lh0/d0;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lh0/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lh0/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh0/d0;->i:I

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
    iget-wide v2, p0, Lh0/d0;->h:J

    .line 14
    .line 15
    iget-object v0, p0, Lh0/d0;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ls1/k0;

    .line 18
    .line 19
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lh0/d0;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ls1/k0;

    .line 36
    .line 37
    iget-object v0, p0, Lh0/d0;->k:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ls1/t;

    .line 40
    .line 41
    iget-wide v2, v0, Ls1/t;->b:J

    .line 42
    .line 43
    invoke-virtual {p1}, Ls1/k0;->B()Ly1/l2;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-wide/16 v4, 0x28

    .line 51
    .line 52
    add-long/2addr v4, v2

    .line 53
    move-object v0, p1

    .line 54
    move-wide v2, v4

    .line 55
    :cond_2
    iput-object v0, p0, Lh0/d0;->j:Ljava/lang/Object;

    .line 56
    .line 57
    iput-wide v2, p0, Lh0/d0;->h:J

    .line 58
    .line 59
    iput v1, p0, Lh0/d0;->i:I

    .line 60
    .line 61
    const/4 p1, 0x3

    .line 62
    invoke-static {v0, p0, p1}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 67
    .line 68
    if-ne p1, v4, :cond_3

    .line 69
    .line 70
    move-object p1, v4

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    :goto_0
    check-cast p1, Ls1/t;

    .line 73
    .line 74
    iget-wide v4, p1, Ls1/t;->b:J

    .line 75
    .line 76
    cmp-long v4, v4, v2

    .line 77
    .line 78
    if-ltz v4, :cond_2

    .line 79
    .line 80
    :goto_1
    return-object p1

    .line 81
    :pswitch_0
    iget-object v0, p0, Lh0/d0;->k:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lgg/t;

    .line 84
    .line 85
    iget v1, p0, Lh0/d0;->i:I

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    if-eqz v1, :cond_5

    .line 89
    .line 90
    if-ne v1, v2, :cond_4

    .line 91
    .line 92
    iget-object v1, p0, Lh0/d0;->j:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Ls1/k0;

    .line 95
    .line 96
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 101
    .line 102
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lh0/d0;->j:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v1, p1

    .line 113
    check-cast v1, Ls1/k0;

    .line 114
    .line 115
    iget-wide v3, p0, Lh0/d0;->h:J

    .line 116
    .line 117
    new-instance p1, Lb0/t;

    .line 118
    .line 119
    const/4 v5, 0x6

    .line 120
    invoke-direct {p1, v0, v5}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, Lh0/d0;->j:Ljava/lang/Object;

    .line 124
    .line 125
    iput v2, p0, Lh0/d0;->i:I

    .line 126
    .line 127
    invoke-static {v1, v3, v4, p1, p0}, Lm/j0;->c(Ls1/k0;JLb0/t;Lyf/a;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    sget-object v2, Lxf/a;->g:Lxf/a;

    .line 132
    .line 133
    if-ne p1, v2, :cond_6

    .line 134
    .line 135
    move-object p1, v2

    .line 136
    goto :goto_3

    .line 137
    :cond_6
    :goto_2
    check-cast p1, Ls1/t;

    .line 138
    .line 139
    if-eqz p1, :cond_7

    .line 140
    .line 141
    iget-wide v2, v0, Lgg/t;->g:J

    .line 142
    .line 143
    const-wide v4, 0x7fffffff7fffffffL

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    and-long/2addr v2, v4

    .line 149
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    cmp-long p1, v2, v4

    .line 155
    .line 156
    if-eqz p1, :cond_7

    .line 157
    .line 158
    sget-object p1, Lh0/j;->h:Lh0/j;

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    iget-object p1, v1, Ls1/k0;->l:Ls1/l0;

    .line 162
    .line 163
    iget-object p1, p1, Ls1/l0;->z:Ls1/k;

    .line 164
    .line 165
    iget-object p1, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 166
    .line 167
    invoke-static {p1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Ls1/t;

    .line 172
    .line 173
    invoke-static {p1}, Ls1/s;->d(Ls1/t;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_8

    .line 178
    .line 179
    invoke-virtual {p1}, Ls1/t;->a()V

    .line 180
    .line 181
    .line 182
    sget-object p1, Lh0/j;->g:Lh0/j;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_8
    sget-object p1, Lh0/j;->j:Lh0/j;

    .line 186
    .line 187
    :goto_3
    return-object p1

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
