.class public final Lwb/aq;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lgb/o;

.field public final synthetic k:Lgb/h;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Lqg/t;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgb/o;Lgb/h;Li0/a1;Lqg/t;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/aq;->i:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/aq;->j:Lgb/o;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/aq;->k:Lgb/h;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/aq;->l:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/aq;->m:Lqg/t;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/aq;->n:Li0/a1;

    .line 12
    .line 13
    iput-object p7, p0, Lwb/aq;->o:Li0/a1;

    .line 14
    .line 15
    iput-object p8, p0, Lwb/aq;->p:Li0/a1;

    .line 16
    .line 17
    iput-object p9, p0, Lwb/aq;->q:Li0/a1;

    .line 18
    .line 19
    iput-object p10, p0, Lwb/aq;->r:Li0/a1;

    .line 20
    .line 21
    iput-object p11, p0, Lwb/aq;->s:Li0/a1;

    .line 22
    .line 23
    iput-object p12, p0, Lwb/aq;->t:Li0/a1;

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    invoke-direct {p0, p1, p13}, Lyf/i;-><init>(ILwf/c;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 14

    .line 1
    new-instance v0, Lwb/aq;

    .line 2
    .line 3
    iget-object v11, p0, Lwb/aq;->s:Li0/a1;

    .line 4
    .line 5
    iget-object v12, p0, Lwb/aq;->t:Li0/a1;

    .line 6
    .line 7
    iget-object v1, p0, Lwb/aq;->i:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, p0, Lwb/aq;->j:Lgb/o;

    .line 10
    .line 11
    iget-object v3, p0, Lwb/aq;->k:Lgb/h;

    .line 12
    .line 13
    iget-object v4, p0, Lwb/aq;->l:Li0/a1;

    .line 14
    .line 15
    iget-object v5, p0, Lwb/aq;->m:Lqg/t;

    .line 16
    .line 17
    iget-object v6, p0, Lwb/aq;->n:Li0/a1;

    .line 18
    .line 19
    iget-object v7, p0, Lwb/aq;->o:Li0/a1;

    .line 20
    .line 21
    iget-object v8, p0, Lwb/aq;->p:Li0/a1;

    .line 22
    .line 23
    iget-object v9, p0, Lwb/aq;->q:Li0/a1;

    .line 24
    .line 25
    iget-object v10, p0, Lwb/aq;->r:Li0/a1;

    .line 26
    .line 27
    move-object/from16 v13, p2

    .line 28
    .line 29
    invoke-direct/range {v0 .. v13}, Lwb/aq;-><init>(Landroid/content/Context;Lgb/o;Lgb/h;Li0/a1;Lqg/t;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lwb/aq;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/aq;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/aq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/aq;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lwb/aq;->i:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v7, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-ne v0, v7, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    move-object v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1

    .line 23
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lqg/c0;->a:Lxg/e;

    .line 27
    .line 28
    sget-object p1, Lxg/d;->i:Lxg/d;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    new-instance v1, Lw/u0;

    .line 32
    .line 33
    iget-object v4, p0, Lwb/aq;->k:Lgb/h;

    .line 34
    .line 35
    const/4 v6, 0x7

    .line 36
    iget-object v3, p0, Lwb/aq;->j:Lgb/o;

    .line 37
    .line 38
    invoke-direct/range {v1 .. v6}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 39
    .line 40
    .line 41
    iput v7, p0, Lwb/aq;->h:I

    .line 42
    .line 43
    invoke-static {p1, v1, p0}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 48
    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    :goto_0
    check-cast p1, Lsf/g;

    .line 53
    .line 54
    iget-object p1, p1, Lsf/g;->g:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v0, p0, Lwb/aq;->l:Li0/a1;

    .line 57
    .line 58
    invoke-interface {v0, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    check-cast p1, Lgb/o;

    .line 68
    .line 69
    iget-object v3, p0, Lwb/aq;->n:Li0/a1;

    .line 70
    .line 71
    iget-object v4, p0, Lwb/aq;->o:Li0/a1;

    .line 72
    .line 73
    iget-object v5, p0, Lwb/aq;->p:Li0/a1;

    .line 74
    .line 75
    iget-object v6, p0, Lwb/aq;->q:Li0/a1;

    .line 76
    .line 77
    iget-object v7, p0, Lwb/aq;->r:Li0/a1;

    .line 78
    .line 79
    iget-object v8, p0, Lwb/aq;->s:Li0/a1;

    .line 80
    .line 81
    iget-object v9, p0, Lwb/aq;->t:Li0/a1;

    .line 82
    .line 83
    iget-object v10, p0, Lwb/aq;->m:Lqg/t;

    .line 84
    .line 85
    move-object v1, v2

    .line 86
    move-object v2, p1

    .line 87
    invoke-static/range {v1 .. v10}, Lwb/y2;->E1(Landroid/content/Context;Lgb/o;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lqg/t;)V

    .line 88
    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_3
    instance-of p1, v0, Lgb/f;

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    move-object p1, v0

    .line 96
    check-cast p1, Lgb/f;

    .line 97
    .line 98
    iget-object p1, p1, Lgb/f;->g:Ljava/lang/String;

    .line 99
    .line 100
    const-string v1, "UPLOADER_BLACKLISTED"

    .line 101
    .line 102
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    const-string p1, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u5df2\u88ab\u7981\u6b62\u4e0a\u4f20\u5728\u7ebf\u63d2\u4ef6"

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move-object p1, v5

    .line 127
    :goto_1
    if-eqz p1, :cond_7

    .line 128
    .line 129
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    move-object v5, p1

    .line 137
    :cond_7
    :goto_2
    if-eqz v5, :cond_8

    .line 138
    .line 139
    move-object p1, v5

    .line 140
    goto :goto_3

    .line 141
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :goto_3
    const-string v0, "\u8bfb\u53d6\u5386\u53f2\u7248\u672c\u5931\u8d25: "

    .line 150
    .line 151
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {v2, p1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 160
    .line 161
    .line 162
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 163
    .line 164
    return-object p1
.end method
