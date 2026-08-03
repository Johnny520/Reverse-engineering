.class public final Lwb/cq;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public final synthetic i:Z

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Lgb/o;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;


# direct methods
.method public constructor <init>(ZLandroid/content/Context;Lgb/o;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lwb/cq;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lwb/cq;->j:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/cq;->k:Lgb/o;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/cq;->l:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/cq;->m:Li0/a1;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/cq;->n:Li0/a1;

    .line 12
    .line 13
    iput-object p7, p0, Lwb/cq;->o:Li0/a1;

    .line 14
    .line 15
    iput-object p8, p0, Lwb/cq;->p:Li0/a1;

    .line 16
    .line 17
    iput-object p9, p0, Lwb/cq;->q:Li0/a1;

    .line 18
    .line 19
    iput-object p10, p0, Lwb/cq;->r:Li0/a1;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p11}, Lyf/i;-><init>(ILwf/c;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 12

    .line 1
    new-instance v0, Lwb/cq;

    .line 2
    .line 3
    iget-object v9, p0, Lwb/cq;->q:Li0/a1;

    .line 4
    .line 5
    iget-object v10, p0, Lwb/cq;->r:Li0/a1;

    .line 6
    .line 7
    iget-boolean v1, p0, Lwb/cq;->i:Z

    .line 8
    .line 9
    iget-object v2, p0, Lwb/cq;->j:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Lwb/cq;->k:Lgb/o;

    .line 12
    .line 13
    iget-object v4, p0, Lwb/cq;->l:Li0/a1;

    .line 14
    .line 15
    iget-object v5, p0, Lwb/cq;->m:Li0/a1;

    .line 16
    .line 17
    iget-object v6, p0, Lwb/cq;->n:Li0/a1;

    .line 18
    .line 19
    iget-object v7, p0, Lwb/cq;->o:Li0/a1;

    .line 20
    .line 21
    iget-object v8, p0, Lwb/cq;->p:Li0/a1;

    .line 22
    .line 23
    move-object v11, p2

    .line 24
    invoke-direct/range {v0 .. v11}, Lwb/cq;-><init>(ZLandroid/content/Context;Lgb/o;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 25
    .line 26
    .line 27
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
    invoke-virtual {p0, p1, p2}, Lwb/cq;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/cq;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/cq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/cq;->h:I

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    iget-object v4, p0, Lwb/cq;->k:Lgb/o;

    .line 5
    .line 6
    iget-object v3, p0, Lwb/cq;->j:Landroid/content/Context;

    .line 7
    .line 8
    const/4 v7, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v7, :cond_0

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
    return-object p1

    .line 24
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lqg/c0;->a:Lxg/e;

    .line 28
    .line 29
    sget-object p1, Lxg/d;->i:Lxg/d;

    .line 30
    .line 31
    new-instance v1, Lwb/yp;

    .line 32
    .line 33
    iget-boolean v2, p0, Lwb/cq;->i:Z

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    invoke-direct/range {v1 .. v6}, Lwb/yp;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 37
    .line 38
    .line 39
    iput v7, p0, Lwb/cq;->h:I

    .line 40
    .line 41
    invoke-static {p1, v1, p0}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 46
    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    :goto_0
    check-cast p1, Lsf/g;

    .line 51
    .line 52
    iget-object p1, p1, Lsf/g;->g:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    check-cast p1, Lgb/l;

    .line 61
    .line 62
    iget-boolean v0, p1, Lgb/l;->a:Z

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, p0, Lwb/cq;->l:Li0/a1;

    .line 69
    .line 70
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    iget-object v1, p0, Lwb/cq;->m:Li0/a1;

    .line 76
    .line 77
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object v8, v4, Lgb/o;->a:Ljava/lang/String;

    .line 81
    .line 82
    iget-wide v0, p1, Lgb/l;->b:J

    .line 83
    .line 84
    new-instance v9, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-direct {v9, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 87
    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    const/16 v11, 0x20

    .line 91
    .line 92
    iget-object v5, p0, Lwb/cq;->n:Li0/a1;

    .line 93
    .line 94
    iget-object v6, p0, Lwb/cq;->o:Li0/a1;

    .line 95
    .line 96
    iget-object v7, p0, Lwb/cq;->p:Li0/a1;

    .line 97
    .line 98
    invoke-static/range {v5 .. v11}, Lwb/y2;->A1(Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_3
    instance-of p1, v0, Lgb/f;

    .line 103
    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    move-object p1, v0

    .line 107
    check-cast p1, Lgb/f;

    .line 108
    .line 109
    iget-object p1, p1, Lgb/f;->g:Ljava/lang/String;

    .line 110
    .line 111
    const-string v1, "UPLOADER_BLACKLISTED"

    .line 112
    .line 113
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_4

    .line 118
    .line 119
    const-string p1, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u5df2\u88ab\u7981\u6b62\u4e0a\u4f20\u5728\u7ebf\u63d2\u4ef6"

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-eqz p1, :cond_5

    .line 127
    .line 128
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    goto :goto_1

    .line 137
    :cond_5
    move-object p1, v5

    .line 138
    :goto_1
    if-eqz p1, :cond_7

    .line 139
    .line 140
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_6

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    move-object v5, p1

    .line 148
    :cond_7
    :goto_2
    if-eqz v5, :cond_8

    .line 149
    .line 150
    move-object p1, v5

    .line 151
    goto :goto_3

    .line 152
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    :goto_3
    iget-object v0, p0, Lwb/cq;->q:Li0/a1;

    .line 161
    .line 162
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Ljava/lang/String;

    .line 170
    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    const-string v1, "\u64cd\u4f5c\u5931\u8d25: "

    .line 174
    .line 175
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {v3, p1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 190
    .line 191
    .line 192
    :goto_4
    iget-object p1, p0, Lwb/cq;->r:Li0/a1;

    .line 193
    .line 194
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 200
    .line 201
    return-object p1
.end method
