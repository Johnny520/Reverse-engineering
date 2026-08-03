.class public final Lk5/f;
.super Lo5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic j:I

.field public k:I

.field public l:I

.field public final synthetic m:Lo5/c;

.field public n:La/a;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Lk5/g;Landroidx/lifecycle/x;ILo5/m;Lo5/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lk5/f;->j:I

    .line 3
    .line 4
    iput-object p1, p0, Lk5/f;->p:Ljava/lang/Iterable;

    .line 5
    .line 6
    iput-object p4, p0, Lk5/f;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p5, p0, Lk5/f;->m:Lo5/c;

    .line 9
    .line 10
    invoke-direct {p0, p2, p3}, Lo5/t;-><init>(Landroidx/lifecycle/x;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lk5/i;Landroidx/lifecycle/x;ILo5/c;Lo5/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk5/f;->j:I

    .line 14
    iput-object p1, p0, Lk5/f;->p:Ljava/lang/Iterable;

    iput-object p4, p0, Lk5/f;->m:Lo5/c;

    iput-object p5, p0, Lk5/f;->o:Ljava/lang/Object;

    invoke-direct {p0, p2, p3}, Lo5/t;-><init>(Landroidx/lifecycle/x;I)V

    return-void
.end method


# virtual methods
.method public final a(La5/a;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lk5/f;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/f;->p:Ljava/lang/Iterable;

    .line 7
    .line 8
    check-cast v0, Lk5/i;

    .line 9
    .line 10
    iget-object v4, v0, Lk5/i;->l:Lk5/o;

    .line 11
    .line 12
    :goto_0
    iget v1, p0, Lk5/f;->k:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    iput v1, p0, Lk5/f;->k:I

    .line 17
    .line 18
    iget v2, v4, Lk5/o;->s:I

    .line 19
    .line 20
    if-le v1, v2, :cond_0

    .line 21
    .line 22
    iget p1, p1, La5/a;->h:I

    .line 23
    .line 24
    iput p1, v4, Lk5/o;->p:I

    .line 25
    .line 26
    const/4 p1, 0x3

    .line 27
    iput p1, p0, Lo5/t;->g:I

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    iget-object v1, v0, Lk5/i;->j:Ljava/util/Iterator;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :goto_1
    move v8, v1

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/4 v1, 0x7

    .line 48
    goto :goto_1

    .line 49
    :goto_2
    new-instance v1, Lk5/z;

    .line 50
    .line 51
    iget-object v2, v4, Lk5/o;->j:Lk5/u;

    .line 52
    .line 53
    iget v5, p0, Lk5/f;->l:I

    .line 54
    .line 55
    iget-object v3, p0, Lk5/f;->o:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v7, v3

    .line 58
    check-cast v7, Lo5/c;

    .line 59
    .line 60
    iget-object v6, p0, Lk5/f;->m:Lo5/c;

    .line 61
    .line 62
    move-object v3, p1

    .line 63
    invoke-direct/range {v1 .. v8}, Lk5/z;-><init>(Lk5/u;La5/a;Lk5/o;ILo5/c;Lo5/c;I)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lk5/f;->n:La/a;

    .line 67
    .line 68
    check-cast p1, Lz5/b;

    .line 69
    .line 70
    invoke-static {v1}, Lz5/b;->i1(Li5/b;)Lz5/b;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, p0, Lk5/f;->n:La/a;

    .line 75
    .line 76
    iget v5, v1, Lk5/z;->q:I

    .line 77
    .line 78
    iput v5, p0, Lk5/f;->l:I

    .line 79
    .line 80
    iget-boolean v5, v0, Lk5/i;->k:Z

    .line 81
    .line 82
    if-eqz v5, :cond_2

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1, v2}, Li5/b;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    move-object p1, v3

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    move-object p1, v1

    .line 95
    :goto_3
    return-object p1

    .line 96
    :pswitch_0
    move-object v3, p1

    .line 97
    iget-object p1, p0, Lk5/f;->p:Ljava/lang/Iterable;

    .line 98
    .line 99
    check-cast p1, Lk5/g;

    .line 100
    .line 101
    iget-object v5, p1, Lk5/g;->l:Lk5/o;

    .line 102
    .line 103
    :goto_4
    iget v0, p0, Lk5/f;->k:I

    .line 104
    .line 105
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    iput v0, p0, Lk5/f;->k:I

    .line 108
    .line 109
    iget v1, v5, Lk5/o;->q:I

    .line 110
    .line 111
    if-le v0, v1, :cond_3

    .line 112
    .line 113
    iget p1, v3, La5/a;->h:I

    .line 114
    .line 115
    iput p1, v5, Lk5/o;->n:I

    .line 116
    .line 117
    const/4 p1, 0x3

    .line 118
    iput p1, p0, Lo5/t;->g:I

    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    goto :goto_7

    .line 122
    :cond_3
    iget-object v0, p1, Lk5/g;->j:Ljava/util/Iterator;

    .line 123
    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    :goto_5
    move v9, v0

    .line 137
    goto :goto_6

    .line 138
    :cond_4
    const/4 v0, 0x7

    .line 139
    goto :goto_5

    .line 140
    :goto_6
    new-instance v2, Lk5/w;

    .line 141
    .line 142
    move-object v4, v3

    .line 143
    iget-object v3, v5, Lk5/o;->j:Lk5/u;

    .line 144
    .line 145
    iget v6, p0, Lk5/f;->l:I

    .line 146
    .line 147
    iget-object v0, p0, Lk5/f;->o:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v7, v0

    .line 150
    check-cast v7, Lo5/m;

    .line 151
    .line 152
    iget-object v8, p0, Lk5/f;->m:Lo5/c;

    .line 153
    .line 154
    invoke-direct/range {v2 .. v9}, Lk5/w;-><init>(Lk5/u;La5/a;Lk5/o;ILo5/m;Lo5/c;I)V

    .line 155
    .line 156
    .line 157
    move-object v3, v4

    .line 158
    iget-object v0, p0, Lk5/f;->n:La/a;

    .line 159
    .line 160
    check-cast v0, Lz5/a;

    .line 161
    .line 162
    invoke-static {v2}, Lz5/a;->g1(Li5/a;)Lz5/a;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput-object v1, p0, Lk5/f;->n:La/a;

    .line 167
    .line 168
    iget v4, v2, Lk5/w;->o:I

    .line 169
    .line 170
    iput v4, p0, Lk5/f;->l:I

    .line 171
    .line 172
    iget-boolean v4, p1, Lk5/g;->k:Z

    .line 173
    .line 174
    if-eqz v4, :cond_5

    .line 175
    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Li5/a;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_5

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_5
    move-object p1, v2

    .line 186
    :goto_7
    return-object p1

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
