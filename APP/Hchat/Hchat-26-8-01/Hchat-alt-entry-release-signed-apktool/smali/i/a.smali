.class public final Li/a;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public h:Li/l;

.field public i:Lgg/q;

.field public j:I

.field public final synthetic k:Li/c;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Li/z0;

.field public final synthetic n:J

.field public final synthetic o:Lfg/l;


# direct methods
.method public constructor <init>(Li/c;Ljava/lang/Object;Li/z0;JLfg/l;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li/a;->k:Li/c;

    .line 2
    .line 3
    iput-object p2, p0, Li/a;->l:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Li/a;->m:Li/z0;

    .line 6
    .line 7
    iput-wide p4, p0, Li/a;->n:J

    .line 8
    .line 9
    iput-object p6, p0, Li/a;->o:Lfg/l;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1, p7}, Lyf/i;-><init>(ILwf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Lwf/c;)Lwf/c;
    .locals 8

    .line 1
    new-instance v0, Li/a;

    .line 2
    .line 3
    iget-wide v4, p0, Li/a;->n:J

    .line 4
    .line 5
    iget-object v6, p0, Li/a;->o:Lfg/l;

    .line 6
    .line 7
    iget-object v1, p0, Li/a;->k:Li/c;

    .line 8
    .line 9
    iget-object v2, p0, Li/a;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v3, p0, Li/a;->m:Li/z0;

    .line 12
    .line 13
    move-object v7, p1

    .line 14
    invoke-direct/range {v0 .. v7}, Li/a;-><init>(Li/c;Ljava/lang/Object;Li/z0;JLfg/l;Lwf/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lwf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Li/a;->create(Lwf/c;)Lwf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Li/a;

    .line 8
    .line 9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Li/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v1, p0, Li/a;->m:Li/z0;

    .line 2
    .line 3
    iget v0, p0, Li/a;->j:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v4, p0, Li/a;->k:Li/c;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Li/a;->i:Lgg/q;

    .line 13
    .line 14
    iget-object v1, p0, Li/a;->h:Li/l;

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    move-object p1, v4

    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :catch_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    :goto_0
    move-object p1, v4

    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :try_start_1
    iget-object p1, v4, Li/c;->c:Li/l;

    .line 38
    .line 39
    iget-object v0, v4, Li/c;->a:Li/m1;

    .line 40
    .line 41
    iget-object v0, v0, Li/m1;->a:Lfg/l;

    .line 42
    .line 43
    iget-object v3, p0, Li/a;->l:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-interface {v0, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Li/q;

    .line 50
    .line 51
    iput-object v0, p1, Li/l;->i:Li/q;

    .line 52
    .line 53
    iget-object p1, v1, Li/z0;->c:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v0, v4, Li/c;->e:Li0/j1;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, v4, Li/c;->d:Li0/j1;

    .line 61
    .line 62
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v4, Li/c;->c:Li/l;

    .line 68
    .line 69
    iget-object v0, p1, Li/l;->h:Li0/j1;

    .line 70
    .line 71
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    iget-object v0, p1, Li/l;->i:Li/q;

    .line 76
    .line 77
    invoke-static {v0}, Li/d;->i(Li/q;)Li/q;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    iget-wide v9, p1, Li/l;->j:J

    .line 82
    .line 83
    iget-boolean v13, p1, Li/l;->l:Z

    .line 84
    .line 85
    new-instance v5, Li/l;

    .line 86
    .line 87
    iget-object v6, p1, Li/l;->g:Li/m1;

    .line 88
    .line 89
    const-wide/high16 v11, -0x8000000000000000L

    .line 90
    .line 91
    invoke-direct/range {v5 .. v13}, Li/l;-><init>(Li/m1;Ljava/lang/Object;Li/q;JJZ)V

    .line 92
    .line 93
    .line 94
    new-instance v7, Lgg/q;

    .line 95
    .line 96
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    iget-wide v9, p0, Li/a;->n:J

    .line 100
    .line 101
    iget-object v6, p0, Li/a;->o:Lfg/l;

    .line 102
    .line 103
    new-instance v3, Lc9/k;

    .line 104
    .line 105
    const/4 v8, 0x5

    .line 106
    invoke-direct/range {v3 .. v8}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2

    .line 107
    .line 108
    .line 109
    move-object p1, v4

    .line 110
    :try_start_2
    iput-object v5, p0, Li/a;->h:Li/l;

    .line 111
    .line 112
    iput-object v7, p0, Li/a;->i:Lgg/q;

    .line 113
    .line 114
    iput v2, p0, Li/a;->j:I

    .line 115
    .line 116
    move-object v4, v3

    .line 117
    move-object v0, v5

    .line 118
    move-wide v2, v9

    .line 119
    move-object v5, p0

    .line 120
    invoke-static/range {v0 .. v5}, Li/d;->d(Li/l;Li/g;JLfg/l;Lyf/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 124
    move-object v5, v0

    .line 125
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 126
    .line 127
    if-ne v1, v0, :cond_2

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_2
    move-object v1, v5

    .line 131
    move-object v0, v7

    .line 132
    :goto_1
    :try_start_3
    iget-boolean v0, v0, Lgg/q;->g:Z

    .line 133
    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    sget-object v0, Li/h;->g:Li/h;

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catch_1
    move-exception v0

    .line 140
    goto :goto_3

    .line 141
    :cond_3
    sget-object v0, Li/h;->h:Li/h;

    .line 142
    .line 143
    :goto_2
    invoke-static {p1}, Li/c;->b(Li/c;)V

    .line 144
    .line 145
    .line 146
    new-instance v2, Li/i;

    .line 147
    .line 148
    invoke-direct {v2, v1, v0}, Li/i;-><init>(Li/l;Li/h;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 149
    .line 150
    .line 151
    return-object v2

    .line 152
    :catch_2
    move-exception v0

    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :goto_3
    invoke-static {p1}, Li/c;->b(Li/c;)V

    .line 156
    .line 157
    .line 158
    throw v0
.end method
