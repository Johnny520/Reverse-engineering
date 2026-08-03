.class public final synthetic Lwb/z9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Landroid/content/SharedPreferences;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:J

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lfg/a;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Landroid/content/Context;

.field public final synthetic n:Ljava/util/Set;

.field public final synthetic o:Lfg/l;

.field public final synthetic p:Lfg/l;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/util/List;JLjava/lang/String;Lfg/a;Lfg/a;Landroid/content/Context;Ljava/util/Set;Lfg/l;Lfg/l;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/z9;->g:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/z9;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-wide p3, p0, Lwb/z9;->i:J

    .line 9
    .line 10
    iput-object p5, p0, Lwb/z9;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lwb/z9;->k:Lfg/a;

    .line 13
    .line 14
    iput-object p7, p0, Lwb/z9;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p8, p0, Lwb/z9;->m:Landroid/content/Context;

    .line 17
    .line 18
    iput-object p9, p0, Lwb/z9;->n:Ljava/util/Set;

    .line 19
    .line 20
    iput-object p10, p0, Lwb/z9;->o:Lfg/l;

    .line 21
    .line 22
    iput-object p11, p0, Lwb/z9;->p:Lfg/l;

    .line 23
    .line 24
    iput-object p12, p0, Lwb/z9;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p13, p0, Lwb/z9;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p14, p0, Lwb/z9;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p15, p0, Lwb/z9;->t:Li0/a1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lr/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwb/p0;->W1:Ls0/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lwb/bd;

    .line 14
    .line 15
    iget-object v5, p0, Lwb/z9;->g:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    move-object v4, v5

    .line 18
    iget-object v5, p0, Lwb/z9;->h:Ljava/util/List;

    .line 19
    .line 20
    iget-wide v6, p0, Lwb/z9;->i:J

    .line 21
    .line 22
    iget-object v8, p0, Lwb/z9;->j:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct/range {v3 .. v8}, Lwb/bd;-><init>(Landroid/content/SharedPreferences;Ljava/util/List;JLjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ls0/d;

    .line 28
    .line 29
    const v6, -0xa4c0afe

    .line 30
    .line 31
    .line 32
    const/4 v10, 0x1

    .line 33
    invoke-direct {v0, v6, v3, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lwb/p0;->X1:Ls0/d;

    .line 40
    .line 41
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lc9/h0;

    .line 45
    .line 46
    const/16 v3, 0xe

    .line 47
    .line 48
    iget-object v6, p0, Lwb/z9;->k:Lfg/a;

    .line 49
    .line 50
    invoke-direct {v0, v5, v6, v4, v3}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    new-instance v3, Ls0/d;

    .line 54
    .line 55
    const v5, -0x40f87cfc

    .line 56
    .line 57
    .line 58
    invoke-direct {v3, v5, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lwb/p0;->Y1:Ls0/d;

    .line 65
    .line 66
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Ldb/f;

    .line 70
    .line 71
    const/16 v3, 0x9

    .line 72
    .line 73
    iget-object v5, p0, Lwb/z9;->l:Lfg/a;

    .line 74
    .line 75
    invoke-direct {v0, v4, v3, v5}, Ldb/f;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v3, Ls0/d;

    .line 79
    .line 80
    const v5, -0x77a4eefa

    .line 81
    .line 82
    .line 83
    invoke-direct {v3, v5, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lwb/p0;->Z1:Ls0/d;

    .line 90
    .line 91
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lwb/cd;

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    iget-object v5, p0, Lwb/z9;->m:Landroid/content/Context;

    .line 98
    .line 99
    invoke-direct {v0, v5, v4, v3}, Lwb/cd;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;I)V

    .line 100
    .line 101
    .line 102
    new-instance v3, Ls0/d;

    .line 103
    .line 104
    const v6, 0x51ae9f08

    .line 105
    .line 106
    .line 107
    invoke-direct {v3, v6, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 111
    .line 112
    .line 113
    sget-object v0, Lwb/p0;->a2:Ls0/d;

    .line 114
    .line 115
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lwb/cd;

    .line 119
    .line 120
    const/4 v3, 0x1

    .line 121
    invoke-direct {v0, v5, v4, v3}, Lwb/cd;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;I)V

    .line 122
    .line 123
    .line 124
    new-instance v3, Ls0/d;

    .line 125
    .line 126
    const v6, 0x1b022d0a

    .line 127
    .line 128
    .line 129
    invoke-direct {v3, v6, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 130
    .line 131
    .line 132
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lwb/p0;->b2:Ls0/d;

    .line 136
    .line 137
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 138
    .line 139
    .line 140
    new-instance v0, Lwb/cd;

    .line 141
    .line 142
    const/4 v3, 0x2

    .line 143
    invoke-direct {v0, v5, v4, v3}, Lwb/cd;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;I)V

    .line 144
    .line 145
    .line 146
    new-instance v3, Ls0/d;

    .line 147
    .line 148
    const v5, -0x7df2c0bb

    .line 149
    .line 150
    .line 151
    invoke-direct {v3, v5, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 155
    .line 156
    .line 157
    sget-object v0, Lwb/p0;->c2:Ls0/d;

    .line 158
    .line 159
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 160
    .line 161
    .line 162
    move-object v5, v4

    .line 163
    new-instance v4, Lwb/xc;

    .line 164
    .line 165
    iget-object v6, p0, Lwb/z9;->n:Ljava/util/Set;

    .line 166
    .line 167
    iget-object v7, p0, Lwb/z9;->o:Lfg/l;

    .line 168
    .line 169
    iget-object v8, p0, Lwb/z9;->p:Lfg/l;

    .line 170
    .line 171
    iget-object v9, p0, Lwb/z9;->q:Li0/a1;

    .line 172
    .line 173
    invoke-direct/range {v4 .. v9}, Lwb/xc;-><init>(Landroid/content/SharedPreferences;Ljava/util/Set;Lfg/l;Lfg/l;Li0/a1;)V

    .line 174
    .line 175
    .line 176
    new-instance v0, Ls0/d;

    .line 177
    .line 178
    const v3, 0x4b60cd47    # 1.4732615E7f

    .line 179
    .line 180
    .line 181
    invoke-direct {v0, v3, v4, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 182
    .line 183
    .line 184
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Lwb/p0;->d2:Ls0/d;

    .line 188
    .line 189
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 190
    .line 191
    .line 192
    new-instance v4, Lwb/pa;

    .line 193
    .line 194
    const/4 v9, 0x1

    .line 195
    iget-object v6, p0, Lwb/z9;->r:Li0/a1;

    .line 196
    .line 197
    iget-object v7, p0, Lwb/z9;->s:Li0/a1;

    .line 198
    .line 199
    iget-object v8, p0, Lwb/z9;->t:Li0/a1;

    .line 200
    .line 201
    invoke-direct/range {v4 .. v9}, Lwb/pa;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 202
    .line 203
    .line 204
    new-instance v0, Ls0/d;

    .line 205
    .line 206
    const v3, 0x14b45b49

    .line 207
    .line 208
    .line 209
    invoke-direct {v0, v3, v4, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 210
    .line 211
    .line 212
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 213
    .line 214
    .line 215
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 216
    .line 217
    return-object p1
.end method
