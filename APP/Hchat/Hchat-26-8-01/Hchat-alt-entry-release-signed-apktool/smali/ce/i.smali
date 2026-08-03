.class public final synthetic Lce/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lud/r;


# direct methods
.method public synthetic constructor <init>(Lme/c;Lud/r;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lce/i;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lce/i;->h:Lud/r;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lud/r;)V
    .locals 1

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lce/i;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/i;->h:Lud/r;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget v0, p0, Lce/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqd/r;

    .line 7
    .line 8
    iget-object v0, p1, Lmd/e;->g:Lmd/f;

    .line 9
    .line 10
    sget-object v1, Lmd/a;->u:Lmd/a;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v0, p1, Lqd/l;->j:Lud/p;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v3, v0, Lud/p;->k:Lpd/k;

    .line 25
    .line 26
    sget-object v4, Lpd/k;->S:Lpd/k;

    .line 27
    .line 28
    if-ne v3, v4, :cond_2

    .line 29
    .line 30
    sget-object v3, Lmd/b;->I:Lmd/b;

    .line 31
    .line 32
    iget-object v4, v0, Lmd/e;->g:Lmd/f;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Lmd/f;->b(Loc/a;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lce/i;->h:Lud/r;

    .line 41
    .line 42
    iget-object v3, v3, Lud/r;->l:Lud/e;

    .line 43
    .line 44
    iget-object v3, v3, Lud/e;->k:Lud/u;

    .line 45
    .line 46
    iget-object v3, v3, Lud/u;->h:Lfe/a;

    .line 47
    .line 48
    move-object v4, v0

    .line 49
    check-cast v4, Ltd/a;

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Lfe/a;->g(Lpd/b;)Lud/m;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    instance-of v4, v3, Lud/r;

    .line 56
    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    check-cast v3, Lud/r;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v3, 0x0

    .line 63
    :goto_0
    if-eqz v3, :cond_2

    .line 64
    .line 65
    sget-object v4, Lmd/b;->q:Lmd/b;

    .line 66
    .line 67
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 68
    .line 69
    invoke-virtual {v5, v4}, Lmd/f;->b(Loc/a;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lud/p;->T(Lqd/l;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {v3}, Lud/r;->S()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-ltz v0, :cond_2

    .line 84
    .line 85
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-ge v0, v4, :cond_2

    .line 90
    .line 91
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lqd/r;

    .line 96
    .line 97
    iget-object v3, v0, Lmd/e;->g:Lmd/f;

    .line 98
    .line 99
    invoke-virtual {v3, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    invoke-virtual {p1}, Lqd/r;->I()Lqd/j;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0}, Lqd/r;->I()Lqd/j;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v1, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    sget-object v0, Lmd/a;->s:Lmd/a;

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    const/4 v2, 0x0

    .line 126
    :goto_1
    return v2

    .line 127
    :pswitch_0
    check-cast p1, Lud/a;

    .line 128
    .line 129
    sget-object v0, Lmd/a;->u:Lmd/a;

    .line 130
    .line 131
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    iget-object v0, p1, Lud/a;->m:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_5

    .line 146
    .line 147
    iget-object v0, p1, Lud/a;->n:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_3

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_3
    sget-object v0, Lmd/b;->D:Lmd/b;

    .line 157
    .line 158
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 159
    .line 160
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Lae/h;

    .line 165
    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    iget-object v0, v0, Lae/h;->i:Ljava/util/List;

    .line 169
    .line 170
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_4
    const/4 p1, 0x1

    .line 174
    goto :goto_3

    .line 175
    :cond_5
    :goto_2
    sget-object v0, Lce/l;->g:Lmh/b;

    .line 176
    .line 177
    const-string v1, "Block {} not deleted, method: {}"

    .line 178
    .line 179
    iget-object v2, p0, Lce/i;->h:Lud/r;

    .line 180
    .line 181
    invoke-interface {v0, p1, v1, v2}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_6
    const/4 p1, 0x0

    .line 185
    :goto_3
    return p1

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
