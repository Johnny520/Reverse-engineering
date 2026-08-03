.class public final synthetic Lwb/os;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Li0/j1;

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Li0/j1;

.field public final synthetic j:Li0/j1;

.field public final synthetic k:Li0/j1;

.field public final synthetic l:Li0/j1;

.field public final synthetic m:Li0/j1;

.field public final synthetic n:Li0/j1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/j1;

.field public final synthetic w:Li0/j1;

.field public final synthetic x:Li0/j1;

.field public final synthetic y:Li0/a1;

.field public final synthetic z:Lwb/yt;


# direct methods
.method public synthetic constructor <init>(Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Landroid/content/Context;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/j1;Li0/a1;Lwb/yt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/os;->g:Li0/j1;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/os;->h:Li0/j1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/os;->i:Li0/j1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/os;->j:Li0/j1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/os;->k:Li0/j1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/os;->l:Li0/j1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/os;->m:Li0/j1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/os;->n:Li0/j1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/os;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/os;->p:Landroid/content/Context;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/os;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/os;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/os;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/os;->t:Li0/a1;

    .line 31
    .line 32
    iput-object p15, p0, Lwb/os;->u:Li0/a1;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lwb/os;->v:Li0/j1;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lwb/os;->w:Li0/j1;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lwb/os;->x:Li0/j1;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Lwb/os;->y:Li0/a1;

    .line 49
    .line 50
    move-object/from16 p1, p20

    .line 51
    .line 52
    iput-object p1, p0, Lwb/os;->z:Lwb/yt;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, v0, Lwb/os;->g:Li0/j1;

    .line 12
    .line 13
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    iget-object v2, v0, Lwb/os;->h:Li0/j1;

    .line 26
    .line 27
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    iget-object v2, v0, Lwb/os;->i:Li0/j1;

    .line 40
    .line 41
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    iget-object v2, v0, Lwb/os;->j:Li0/j1;

    .line 54
    .line 55
    iget-object v3, v0, Lwb/os;->k:Li0/j1;

    .line 56
    .line 57
    iget-object v4, v0, Lwb/os;->l:Li0/j1;

    .line 58
    .line 59
    iget-object v5, v0, Lwb/os;->m:Li0/j1;

    .line 60
    .line 61
    invoke-static {v2, v3, v4, v5}, Lwb/y2;->I0(Li0/a1;Li0/a1;Li0/a1;Li0/a1;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    if-ltz v1, :cond_1

    .line 68
    .line 69
    iget-object v9, v0, Lwb/os;->n:Li0/j1;

    .line 70
    .line 71
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ge v1, v2, :cond_1

    .line 82
    .line 83
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-object v7, v2

    .line 94
    check-cast v7, Lfb/c;

    .line 95
    .line 96
    iget-object v2, v7, Lfb/c;->a:Ljava/lang/String;

    .line 97
    .line 98
    const-string v3, "user"

    .line 99
    .line 100
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_0

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Ljava/util/List;

    .line 112
    .line 113
    invoke-static {v1, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-static {v1, v2}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v4}, Lwb/y2;->G0(Ljava/util/List;)Lfb/y;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    iget-object v14, v0, Lwb/os;->o:Li0/a1;

    .line 126
    .line 127
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    move-object v6, v2

    .line 132
    check-cast v6, Lfb/c1;

    .line 133
    .line 134
    new-instance v15, Lwb/vd;

    .line 135
    .line 136
    iget-object v8, v0, Lwb/os;->p:Landroid/content/Context;

    .line 137
    .line 138
    iget-object v10, v0, Lwb/os;->q:Li0/a1;

    .line 139
    .line 140
    iget-object v11, v0, Lwb/os;->r:Li0/a1;

    .line 141
    .line 142
    iget-object v12, v0, Lwb/os;->s:Li0/a1;

    .line 143
    .line 144
    iget-object v13, v0, Lwb/os;->t:Li0/a1;

    .line 145
    .line 146
    move-object v3, v15

    .line 147
    iget-object v15, v0, Lwb/os;->u:Li0/a1;

    .line 148
    .line 149
    iget-object v2, v0, Lwb/os;->v:Li0/j1;

    .line 150
    .line 151
    move-object/from16 p1, v1

    .line 152
    .line 153
    iget-object v1, v0, Lwb/os;->w:Li0/j1;

    .line 154
    .line 155
    move-object/from16 v17, v1

    .line 156
    .line 157
    iget-object v1, v0, Lwb/os;->x:Li0/j1;

    .line 158
    .line 159
    move-object/from16 v18, v1

    .line 160
    .line 161
    iget-object v1, v0, Lwb/os;->y:Li0/a1;

    .line 162
    .line 163
    move-object/from16 v19, v1

    .line 164
    .line 165
    move-object/from16 v16, v2

    .line 166
    .line 167
    invoke-direct/range {v3 .. v19}, Lwb/vd;-><init>(Ljava/util/List;Lfb/y;Lfb/c1;Lfb/c;Landroid/content/Context;Li0/j1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/j1;Li0/j1;Li0/j1;Li0/a1;)V

    .line 168
    .line 169
    .line 170
    iget-object v10, v0, Lwb/os;->z:Lwb/yt;

    .line 171
    .line 172
    const-string v14, "\u7f16\u8f91\u91cd\u53d1"

    .line 173
    .line 174
    move-object/from16 v13, p1

    .line 175
    .line 176
    move-object v15, v3

    .line 177
    move-object v12, v4

    .line 178
    move-object v11, v8

    .line 179
    invoke-static/range {v10 .. v15}, Lwb/y2;->o1(Lwb/yt;Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lfg/l;)V

    .line 180
    .line 181
    .line 182
    :cond_1
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 183
    .line 184
    return-object v1
.end method
