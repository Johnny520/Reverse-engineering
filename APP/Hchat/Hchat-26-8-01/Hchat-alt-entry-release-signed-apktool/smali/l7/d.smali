.class public final Ll7/d;
.super Lz7/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/Iterator;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll7/d;->i:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lz7/m;-><init>(Ljava/util/Iterator;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 9

    .line 1
    iget v0, p0, Ll7/d;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr7/s;

    .line 7
    .line 8
    invoke-virtual {p1}, Lr7/s;->W()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lr7/s;->p:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p1}, Ly7/a;->g(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lbe/m;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const-class v2, Ll7/f;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v0, v2, v1, v3}, Lbe/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v1, Lz7/g;

    .line 36
    .line 37
    invoke-direct {v1, p1, v0}, Lz7/g;-><init>(Ljava/util/Iterator;Ljava/util/function/Function;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v1

    .line 41
    :goto_0
    return-object p1

    .line 42
    :pswitch_0
    check-cast p1, Ll7/l;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-virtual {p1, v0}, Ll7/l;->W(Ll7/f;)Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :pswitch_1
    check-cast p1, Ll7/f;

    .line 51
    .line 52
    new-instance v0, Ll7/d;

    .line 53
    .line 54
    iget-object p1, p1, Ll7/f;->q:Lo7/f;

    .line 55
    .line 56
    iget-object p1, p1, Lo7/f;->m:Lj7/d;

    .line 57
    .line 58
    iget-object p1, p1, Lo7/b;->k:Lz7/c;

    .line 59
    .line 60
    invoke-virtual {p1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p1, v1}, Ll7/d;-><init>(Ljava/util/Iterator;I)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_2
    check-cast p1, Lo7/j;

    .line 70
    .line 71
    const-class v0, Ll7/f;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Ll7/f;

    .line 78
    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_1
    iget-object v1, p1, Lo7/j;->m:Lj7/e;

    .line 85
    .line 86
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 87
    .line 88
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const/4 v2, -0x1

    .line 93
    move v3, v2

    .line 94
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_6

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, Ll7/m;

    .line 105
    .line 106
    iget-object v4, v4, Ll7/m;->o:Ls7/b;

    .line 107
    .line 108
    iget-object v5, v4, Ls7/d;->n:Lo7/c;

    .line 109
    .line 110
    move-object v6, v5

    .line 111
    check-cast v6, Ls7/c;

    .line 112
    .line 113
    iget-object v6, v6, Lo7/b;->l:Lk7/f;

    .line 114
    .line 115
    sget-object v7, Lr7/k;->p:Lokio/a;

    .line 116
    .line 117
    if-ne v6, v7, :cond_4

    .line 118
    .line 119
    check-cast v5, Ls7/c;

    .line 120
    .line 121
    iget-object v4, v5, Lo7/b;->k:Lz7/c;

    .line 122
    .line 123
    invoke-virtual {v4}, Lz7/c;->size()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    const/4 v6, 0x0

    .line 128
    move v7, v2

    .line 129
    :goto_2
    if-ge v6, v4, :cond_5

    .line 130
    .line 131
    invoke-virtual {v5, v6}, Lo7/b;->Q(I)Lk7/a;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    check-cast v8, Lr7/k;

    .line 136
    .line 137
    invoke-virtual {v8}, Lr7/k;->N()I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-le v8, v7, :cond_3

    .line 142
    .line 143
    move v7, v8

    .line 144
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    iget-object v4, v4, Lo7/b;->k:Lz7/c;

    .line 148
    .line 149
    invoke-virtual {v4}, Lz7/c;->size()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    add-int/lit8 v7, v4, -0x1

    .line 154
    .line 155
    :cond_5
    if-le v7, v3, :cond_2

    .line 156
    .line 157
    move v3, v7

    .line 158
    goto :goto_1

    .line 159
    :cond_6
    invoke-virtual {v0}, Ll7/f;->U()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    shl-int/lit8 v1, v1, 0x18

    .line 164
    .line 165
    iget-object p1, p1, Lo7/j;->l:Ll7/j;

    .line 166
    .line 167
    iget-object p1, p1, Ll7/a;->m:Lp7/a;

    .line 168
    .line 169
    check-cast p1, Lp7/g;

    .line 170
    .line 171
    iget-object p1, p1, Lp7/g;->r:Lr7/c;

    .line 172
    .line 173
    invoke-virtual {p1}, Lr7/c;->get()I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    shl-int/lit8 p1, p1, 0x10

    .line 178
    .line 179
    or-int/2addr p1, v1

    .line 180
    new-instance v1, Lo7/i;

    .line 181
    .line 182
    invoke-direct {v1, v3, p1, v0}, Lo7/i;-><init>(IILl7/f;)V

    .line 183
    .line 184
    .line 185
    move-object p1, v1

    .line 186
    :goto_3
    return-object p1

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
