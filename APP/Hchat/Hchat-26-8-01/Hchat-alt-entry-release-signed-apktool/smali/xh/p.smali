.class public final Lxh/p;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Z

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li/c;

.field public final synthetic m:Li/c;

.field public final synthetic n:Li/c;

.field public final synthetic o:Li0/a1;


# direct methods
.method public constructor <init>(ZLi0/a1;Li/c;Li/c;Li/c;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lxh/p;->j:Z

    .line 2
    .line 3
    iput-object p2, p0, Lxh/p;->k:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lxh/p;->l:Li/c;

    .line 6
    .line 7
    iput-object p4, p0, Lxh/p;->m:Li/c;

    .line 8
    .line 9
    iput-object p5, p0, Lxh/p;->n:Li/c;

    .line 10
    .line 11
    iput-object p6, p0, Lxh/p;->o:Li0/a1;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lyf/i;-><init>(ILwf/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 8

    .line 1
    new-instance v0, Lxh/p;

    .line 2
    .line 3
    iget-object v5, p0, Lxh/p;->n:Li/c;

    .line 4
    .line 5
    iget-object v6, p0, Lxh/p;->o:Li0/a1;

    .line 6
    .line 7
    iget-boolean v1, p0, Lxh/p;->j:Z

    .line 8
    .line 9
    iget-object v2, p0, Lxh/p;->k:Li0/a1;

    .line 10
    .line 11
    iget-object v3, p0, Lxh/p;->l:Li/c;

    .line 12
    .line 13
    iget-object v4, p0, Lxh/p;->m:Li/c;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lxh/p;-><init>(ZLi0/a1;Li/c;Li/c;Li/c;Li0/a1;Lwf/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lxh/p;->i:Ljava/lang/Object;

    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, Lxh/p;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lxh/p;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lxh/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lxh/p;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqg/t;

    .line 4
    .line 5
    iget v1, p0, Lxh/p;->h:I

    .line 6
    .line 7
    sget-object v6, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    iget-object v7, p0, Lxh/p;->k:Li0/a1;

    .line 10
    .line 11
    const/4 v8, 0x3

    .line 12
    const/4 v9, 0x2

    .line 13
    const/4 v2, 0x1

    .line 14
    iget-object v10, p0, Lxh/p;->n:Li/c;

    .line 15
    .line 16
    iget-object v11, p0, Lxh/p;->m:Li/c;

    .line 17
    .line 18
    const/4 v12, 0x0

    .line 19
    sget-object v13, Lxf/a;->g:Lxf/a;

    .line 20
    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    if-eq v1, v2, :cond_2

    .line 24
    .line 25
    if-eq v1, v9, :cond_1

    .line 26
    .line 27
    if-ne v1, v8, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    return-object v0

    .line 41
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-boolean v1, p0, Lxh/p;->j:Z

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-interface {v7, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Lwb/n3;

    .line 63
    .line 64
    const/4 v2, 0x2

    .line 65
    invoke-direct {v1, v11, v12, v2}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v12, v1, v8}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 69
    .line 70
    .line 71
    new-instance v1, Lwb/n3;

    .line 72
    .line 73
    iget-object v2, p0, Lxh/p;->l:Li/c;

    .line 74
    .line 75
    const/4 v3, 0x3

    .line 76
    invoke-direct {v1, v2, v12, v3}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v12, v1, v8}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 80
    .line 81
    .line 82
    new-instance v1, Lwb/n3;

    .line 83
    .line 84
    const/4 v2, 0x4

    .line 85
    invoke-direct {v1, v10, v12, v2}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v12, v1, v8}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 89
    .line 90
    .line 91
    return-object v6

    .line 92
    :cond_4
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_5

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    new-instance v1, Lwb/n3;

    .line 106
    .line 107
    const/4 v3, 0x5

    .line 108
    invoke-direct {v1, v11, v12, v3}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v12, v1, v8}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 112
    .line 113
    .line 114
    new-instance v1, Lwb/n3;

    .line 115
    .line 116
    const/4 v3, 0x6

    .line 117
    invoke-direct {v1, v10, v12, v3}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v12, v1, v8}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 121
    .line 122
    .line 123
    new-instance v1, Ljava/lang/Float;

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    invoke-direct {v1, v0}, Ljava/lang/Float;-><init>(F)V

    .line 127
    .line 128
    .line 129
    sget-object v0, Lsh/z;->c:Li/l1;

    .line 130
    .line 131
    iput-object v12, p0, Lxh/p;->i:Ljava/lang/Object;

    .line 132
    .line 133
    iput v2, p0, Lxh/p;->h:I

    .line 134
    .line 135
    move-object v2, v0

    .line 136
    iget-object v0, p0, Lxh/p;->l:Li/c;

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    const/16 v5, 0xc

    .line 140
    .line 141
    move-object v4, p0

    .line 142
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-ne v0, v13, :cond_6

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    :goto_0
    iput-object v12, p0, Lxh/p;->i:Ljava/lang/Object;

    .line 150
    .line 151
    iput v9, p0, Lxh/p;->h:I

    .line 152
    .line 153
    invoke-virtual {v11, p0}, Li/c;->f(Lyf/i;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-ne v0, v13, :cond_7

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    :goto_1
    iput-object v12, p0, Lxh/p;->i:Ljava/lang/Object;

    .line 161
    .line 162
    iput v8, p0, Lxh/p;->h:I

    .line 163
    .line 164
    invoke-virtual {v10, p0}, Li/c;->f(Lyf/i;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-ne v0, v13, :cond_8

    .line 169
    .line 170
    :goto_2
    return-object v13

    .line 171
    :cond_8
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-interface {v7, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lxh/p;->o:Li0/a1;

    .line 177
    .line 178
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, Lfg/a;

    .line 183
    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    :cond_9
    :goto_4
    return-object v6
.end method
