.class public final Lwb/yp;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgb/o;ZLwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/yp;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lwb/yp;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/yp;->k:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/yp;->i:Z

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 15
    iput p5, p0, Lwb/yp;->h:I

    iput-boolean p1, p0, Lwb/yp;->i:Z

    iput-object p2, p0, Lwb/yp;->j:Ljava/lang/Object;

    iput-object p3, p0, Lwb/yp;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 7

    .line 1
    iget p1, p0, Lwb/yp;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/yp;

    .line 7
    .line 8
    iget-object p1, p0, Lwb/yp;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Li0/a1;

    .line 12
    .line 13
    iget-object p1, p0, Lwb/yp;->k:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Li0/a1;

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    iget-boolean v1, p0, Lwb/yp;->i:Z

    .line 20
    .line 21
    move-object v4, p2

    .line 22
    invoke-direct/range {v0 .. v5}, Lwb/yp;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    move-object v4, p2

    .line 27
    new-instance v1, Lwb/yp;

    .line 28
    .line 29
    iget-object p1, p0, Lwb/yp;->j:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v3, p1

    .line 32
    check-cast v3, Landroid/content/Context;

    .line 33
    .line 34
    iget-object p1, p0, Lwb/yp;->k:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lgb/o;

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    iget-boolean v2, p0, Lwb/yp;->i:Z

    .line 40
    .line 41
    move-object v5, v4

    .line 42
    move-object v4, p1

    .line 43
    invoke-direct/range {v1 .. v6}, Lwb/yp;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :pswitch_1
    move-object v4, p2

    .line 48
    new-instance p1, Lwb/yp;

    .line 49
    .line 50
    iget-object p2, p0, Lwb/yp;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Landroid/content/Context;

    .line 53
    .line 54
    iget-object v0, p0, Lwb/yp;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lgb/o;

    .line 57
    .line 58
    iget-boolean v1, p0, Lwb/yp;->i:Z

    .line 59
    .line 60
    invoke-direct {p1, p2, v0, v1, v4}, Lwb/yp;-><init>(Landroid/content/Context;Lgb/o;ZLwf/c;)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/yp;->h:I

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
    invoke-virtual {p0, p1, p2}, Lwb/yp;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/yp;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/yp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/yp;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lwb/yp;

    .line 27
    .line 28
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lwb/yp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lwb/yp;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lwb/yp;

    .line 40
    .line 41
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lwb/yp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/yp;->h:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lwb/yp;->i:Z

    .line 4
    .line 5
    iget-object v2, p0, Lwb/yp;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lwb/yp;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    check-cast v3, Li0/a1;

    .line 16
    .line 17
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    check-cast v2, Li0/a1;

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_0
    check-cast v2, Lgb/o;

    .line 38
    .line 39
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast v3, Landroid/content/Context;

    .line 43
    .line 44
    iget-object p1, v2, Lgb/o;->a:Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    :try_start_0
    invoke-static {v3}, Lgb/q;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    check-cast v0, Lgb/s;

    .line 56
    .line 57
    invoke-static {v3, p1, v0}, Lgb/b;->m(Landroid/content/Context;Ljava/lang/String;Lgb/s;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast p1, Lgb/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    new-instance v0, Lsf/f;

    .line 69
    .line 70
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    move-object p1, v0

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    :try_start_1
    invoke-static {v3}, Lgb/q;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    check-cast v0, Lgb/s;

    .line 83
    .line 84
    invoke-static {v3, p1, v0}, Lgb/b;->i(Landroid/content/Context;Ljava/lang/String;Lgb/s;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    check-cast p1, Lgb/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_1
    move-exception p1

    .line 95
    new-instance v0, Lsf/f;

    .line 96
    .line 97
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :goto_1
    new-instance v0, Lsf/g;

    .line 102
    .line 103
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    check-cast v3, Landroid/content/Context;

    .line 111
    .line 112
    check-cast v2, Lgb/o;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    :try_start_2
    invoke-static {v3, v2, v1}, Lgb/k;->m(Landroid/content/Context;Lgb/o;Z)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    check-cast p1, Lgb/i;

    .line 125
    .line 126
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const-string v1, "-"

    .line 138
    .line 139
    const-string v4, ""

    .line 140
    .line 141
    const/4 v5, 0x0

    .line 142
    invoke-static {v0, v1, v4, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v1, Lgb/b;->a:Lokhttp3/MediaType;

    .line 147
    .line 148
    iget-object v1, v2, Lgb/o;->a:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v2, v2, Lgb/o;->f:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v3, v1, v2, v0}, Lgb/b;->k(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/Serializable;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    instance-of v1, v0, Lsf/f;

    .line 157
    .line 158
    if-eqz v1, :cond_2

    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    :cond_2
    check-cast v0, Ljava/lang/Long;

    .line 162
    .line 163
    iget-object v1, p1, Lgb/i;->a:Ljava/lang/String;

    .line 164
    .line 165
    iget-object v2, p1, Lgb/i;->b:Ljava/lang/String;

    .line 166
    .line 167
    iget-boolean p1, p1, Lgb/i;->c:Z

    .line 168
    .line 169
    new-instance v3, Lgb/i;

    .line 170
    .line 171
    invoke-direct {v3, v1, v2, p1, v0}, Lgb/i;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :catchall_2
    move-exception p1

    .line 176
    new-instance v3, Lsf/f;

    .line 177
    .line 178
    invoke-direct {v3, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    :goto_2
    new-instance p1, Lsf/g;

    .line 182
    .line 183
    invoke-direct {p1, v3}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-object p1

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
