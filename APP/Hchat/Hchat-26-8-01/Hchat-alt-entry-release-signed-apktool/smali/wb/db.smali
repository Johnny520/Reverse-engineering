.class public final synthetic Lwb/db;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lq9/g;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/util/ArrayList;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lfg/l;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Landroid/content/SharedPreferences;

.field public final synthetic x:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lq9/g;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/db;->g:Lq9/g;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/db;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/db;->i:Ljava/util/ArrayList;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/db;->j:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/db;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/db;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/db;->m:Lfg/l;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/db;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/db;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/db;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/db;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/db;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/db;->s:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/db;->t:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p15, p0, Lwb/db;->u:Ljava/lang/String;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lwb/db;->v:Ljava/lang/String;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lwb/db;->w:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lwb/db;->x:Lfg/a;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lr/h;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lwb/p0;->G3:Ls0/d;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x3

    .line 14
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 15
    .line 16
    .line 17
    new-instance v5, Lwb/e1;

    .line 18
    .line 19
    const/4 v12, 0x5

    .line 20
    iget-object v14, v0, Lwb/db;->g:Lq9/g;

    .line 21
    .line 22
    iget-object v7, v0, Lwb/db;->i:Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v8, v0, Lwb/db;->j:Ljava/util/List;

    .line 25
    .line 26
    iget-object v9, v0, Lwb/db;->k:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v10, v0, Lwb/db;->l:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v11, v0, Lwb/db;->m:Lfg/l;

    .line 31
    .line 32
    move-object v6, v14

    .line 33
    invoke-direct/range {v5 .. v12}, Lwb/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Ls0/d;

    .line 37
    .line 38
    const v6, 0x724921b4

    .line 39
    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    invoke-direct {v2, v6, v5, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 46
    .line 47
    .line 48
    iget-object v15, v0, Lwb/db;->n:Li0/a1;

    .line 49
    .line 50
    iget-object v2, v0, Lwb/db;->o:Li0/a1;

    .line 51
    .line 52
    iget-object v5, v0, Lwb/db;->p:Li0/a1;

    .line 53
    .line 54
    iget-object v6, v0, Lwb/db;->q:Li0/a1;

    .line 55
    .line 56
    iget-object v8, v0, Lwb/db;->r:Li0/a1;

    .line 57
    .line 58
    if-nez v14, :cond_1

    .line 59
    .line 60
    sget-object v10, Lwb/p0;->H3:Ls0/d;

    .line 61
    .line 62
    invoke-static {v1, v3, v10, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 63
    .line 64
    .line 65
    new-instance v10, Lwb/t1;

    .line 66
    .line 67
    const/4 v11, 0x5

    .line 68
    invoke-direct {v10, v11, v15, v2}, Lwb/t1;-><init>(ILi0/a1;Li0/a1;)V

    .line 69
    .line 70
    .line 71
    new-instance v11, Ls0/d;

    .line 72
    .line 73
    const v12, 0x7010cd4f

    .line 74
    .line 75
    .line 76
    invoke-direct {v11, v12, v10, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v3, v11, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 80
    .line 81
    .line 82
    const-string v10, "card"

    .line 83
    .line 84
    iget-object v11, v0, Lwb/db;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v11, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-nez v10, :cond_0

    .line 91
    .line 92
    sget-object v10, Lwb/p0;->I3:Ls0/d;

    .line 93
    .line 94
    invoke-static {v1, v3, v10, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 95
    .line 96
    .line 97
    new-instance v10, Lwb/s1;

    .line 98
    .line 99
    const/16 v12, 0xa

    .line 100
    .line 101
    invoke-direct {v10, v5, v12}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 102
    .line 103
    .line 104
    new-instance v12, Ls0/d;

    .line 105
    .line 106
    const v13, 0xaf6f32a

    .line 107
    .line 108
    .line 109
    invoke-direct {v12, v13, v10, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v3, v12, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 113
    .line 114
    .line 115
    :cond_0
    const-string v10, "text"

    .line 116
    .line 117
    invoke-virtual {v11, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-nez v10, :cond_1

    .line 122
    .line 123
    sget-object v10, Lwb/p0;->J3:Ls0/d;

    .line 124
    .line 125
    invoke-static {v1, v3, v10, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 126
    .line 127
    .line 128
    new-instance v10, Lwb/t1;

    .line 129
    .line 130
    const/4 v11, 0x6

    .line 131
    invoke-direct {v10, v11, v6, v8}, Lwb/t1;-><init>(ILi0/a1;Li0/a1;)V

    .line 132
    .line 133
    .line 134
    new-instance v11, Ls0/d;

    .line 135
    .line 136
    const v12, 0x175d9421

    .line 137
    .line 138
    .line 139
    invoke-direct {v11, v12, v10, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v3, v11, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 143
    .line 144
    .line 145
    :cond_1
    sget-object v10, Lwb/p0;->K3:Ls0/d;

    .line 146
    .line 147
    invoke-static {v1, v3, v10, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 148
    .line 149
    .line 150
    new-instance v13, Lwb/c7;

    .line 151
    .line 152
    iget-object v10, v0, Lwb/db;->s:Ljava/lang/String;

    .line 153
    .line 154
    iget-object v11, v0, Lwb/db;->t:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v12, v0, Lwb/db;->u:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v3, v0, Lwb/db;->v:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v4, v0, Lwb/db;->w:Landroid/content/SharedPreferences;

    .line 161
    .line 162
    iget-object v7, v0, Lwb/db;->x:Lfg/a;

    .line 163
    .line 164
    move-object/from16 v16, v2

    .line 165
    .line 166
    move-object/from16 v23, v3

    .line 167
    .line 168
    move-object/from16 v24, v4

    .line 169
    .line 170
    move-object/from16 v18, v5

    .line 171
    .line 172
    move-object/from16 v20, v6

    .line 173
    .line 174
    move-object/from16 v26, v7

    .line 175
    .line 176
    move-object/from16 v22, v8

    .line 177
    .line 178
    move-object/from16 v25, v9

    .line 179
    .line 180
    move-object/from16 v17, v10

    .line 181
    .line 182
    move-object/from16 v19, v11

    .line 183
    .line 184
    move-object/from16 v21, v12

    .line 185
    .line 186
    invoke-direct/range {v13 .. v26}, Lwb/c7;-><init>(Lq9/g;Li0/a1;Li0/a1;Ljava/lang/String;Li0/a1;Ljava/lang/String;Li0/a1;Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;Ljava/lang/String;Lfg/a;)V

    .line 187
    .line 188
    .line 189
    new-instance v2, Ls0/d;

    .line 190
    .line 191
    const v3, 0x4657bb6

    .line 192
    .line 193
    .line 194
    const/4 v4, 0x1

    .line 195
    invoke-direct {v2, v3, v13, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 196
    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    const/4 v4, 0x3

    .line 200
    invoke-static {v1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 201
    .line 202
    .line 203
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 204
    .line 205
    return-object v1
.end method
