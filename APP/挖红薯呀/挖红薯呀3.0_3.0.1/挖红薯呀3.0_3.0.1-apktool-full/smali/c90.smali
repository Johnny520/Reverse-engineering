.class public final Lc90;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lez0;


# static fields
.field public static final x:Ld;


# instance fields
.field public final a:Ldm;

.field public b:Z

.field public c:Lv80;

.field public d:Z

.field public final e:Lfe;

.field public final f:Lgp0;

.field public final g:Lxg0;

.field public h:F

.field public final i:Lnm;

.field public final j:Z

.field public k:Lb60;

.field public final l:La90;

.field public final m:Lo9;

.field public final n:Ll70;

.field public final o:Leb;

.field public final p:Ld80;

.field public final q:Lx1;

.field public final r:La80;

.field public final s:Loh0;

.field public final t:Lgp0;

.field public final u:Lgp0;

.field public final v:Loh0;

.field public final w:Ld;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ls8;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ls8;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lpn;

    .line 9
    .line 10
    const/16 v2, 0x1a

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lpn;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lya;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v2, v3, v0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-static {v0, v1}, Ls91;->m(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ld;

    .line 26
    .line 27
    const/16 v3, 0x13

    .line 28
    .line 29
    invoke-direct {v0, v3, v2, v1}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lc90;->x:Ld;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(II)V
    .locals 10

    .line 1
    new-instance v0, Ldm;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Ldm;->a:I

    .line 8
    .line 9
    iput v1, v0, Ldm;->d:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lc90;->a:Ldm;

    .line 15
    .line 16
    new-instance v0, Lfe;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ldp0;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Ldp0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lfe;->b:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v1, Ldp0;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Ldp0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Lfe;->c:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p2, Lt70;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Lt70;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p2, v0, Lfe;->e:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v0, p0, Lc90;->e:Lfe;

    .line 43
    .line 44
    sget-object p2, Le90;->a:Lv80;

    .line 45
    .line 46
    sget-object v0, Ln2;->M:Ln2;

    .line 47
    .line 48
    new-instance v1, Lgp0;

    .line 49
    .line 50
    invoke-direct {v1, p2, v0}, Lgp0;-><init>(Ljava/lang/Object;Ln2;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lc90;->f:Lgp0;

    .line 54
    .line 55
    new-instance p2, Lxg0;

    .line 56
    .line 57
    invoke-direct {p2}, Lxg0;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lc90;->g:Lxg0;

    .line 61
    .line 62
    new-instance p2, Lo;

    .line 63
    .line 64
    const/16 v0, 0x8

    .line 65
    .line 66
    invoke-direct {p2, v0, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lnm;

    .line 70
    .line 71
    invoke-direct {v1, p2}, Lnm;-><init>(Lsw;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lc90;->i:Lnm;

    .line 75
    .line 76
    const/4 p2, 0x1

    .line 77
    iput-boolean p2, p0, Lc90;->j:Z

    .line 78
    .line 79
    new-instance v1, La90;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    invoke-direct {v1, p0, v2}, La90;-><init>(Lez0;I)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, Lc90;->l:La90;

    .line 86
    .line 87
    new-instance v1, Lo9;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Lc90;->m:Lo9;

    .line 93
    .line 94
    new-instance v1, Ll70;

    .line 95
    .line 96
    invoke-direct {v1}, Ll70;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v1, p0, Lc90;->n:Ll70;

    .line 100
    .line 101
    new-instance v1, Leb;

    .line 102
    .line 103
    invoke-direct {v1, p2}, Leb;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, Lc90;->o:Leb;

    .line 107
    .line 108
    new-instance p2, Ld80;

    .line 109
    .line 110
    new-instance v1, Lz80;

    .line 111
    .line 112
    invoke-direct {v1, p0, p1}, Lz80;-><init>(Lc90;I)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p2, v1}, Ld80;-><init>(Lsw;)V

    .line 116
    .line 117
    .line 118
    iput-object p2, p0, Lc90;->p:Ld80;

    .line 119
    .line 120
    new-instance p1, Lx1;

    .line 121
    .line 122
    const/16 p2, 0xc

    .line 123
    .line 124
    invoke-direct {p1, p2, p0}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lc90;->q:Lx1;

    .line 128
    .line 129
    new-instance p1, La80;

    .line 130
    .line 131
    invoke-direct {p1}, La80;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object p1, p0, Lc90;->r:La80;

    .line 135
    .line 136
    invoke-static {}, Lg60;->i()Loh0;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, p0, Lc90;->s:Loh0;

    .line 141
    .line 142
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    iput-object p2, p0, Lc90;->t:Lgp0;

    .line 149
    .line 150
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iput-object p1, p0, Lc90;->u:Lgp0;

    .line 155
    .line 156
    invoke-static {}, Lg60;->i()Loh0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iput-object p1, p0, Lc90;->v:Loh0;

    .line 161
    .line 162
    new-instance p1, Ld;

    .line 163
    .line 164
    invoke-direct {p1, v0}, Ld;-><init>(I)V

    .line 165
    .line 166
    .line 167
    sget-object v2, Lkl;->x:Lq91;

    .line 168
    .line 169
    const/4 p2, 0x0

    .line 170
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    new-instance v1, Lw7;

    .line 175
    .line 176
    iget-object p2, v2, Lq91;->a:Lsw;

    .line 177
    .line 178
    invoke-interface {p2, v3}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    move-object v4, p2

    .line 183
    check-cast v4, Lb8;

    .line 184
    .line 185
    const-wide/high16 v5, -0x8000000000000000L

    .line 186
    .line 187
    const-wide/high16 v7, -0x8000000000000000L

    .line 188
    .line 189
    const/4 v9, 0x0

    .line 190
    invoke-direct/range {v1 .. v9}, Lw7;-><init>(Lq91;Ljava/lang/Object;Lb8;JJZ)V

    .line 191
    .line 192
    .line 193
    iput-object v1, p1, Ld;->f:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object p1, p0, Lc90;->w:Ld;

    .line 196
    .line 197
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lc90;->u:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lc90;->i:Lnm;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnm;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lc90;->t:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d(Lvh0;Lww;Ljk;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lb90;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lb90;

    .line 7
    .line 8
    iget v1, v0, Lb90;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lb90;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lb90;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lb90;-><init>(Lc90;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lb90;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lb90;->k:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lzk;->d:Lzk;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    iget-object p1, v0, Lb90;->h:Lm51;

    .line 51
    .line 52
    move-object p2, p1

    .line 53
    check-cast p2, Lww;

    .line 54
    .line 55
    iget-object p1, v0, Lb90;->g:Lvh0;

    .line 56
    .line 57
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p3, p0, Lc90;->f:Lgp0;

    .line 65
    .line 66
    invoke-virtual {p3}, Lgp0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    sget-object v1, Le90;->a:Lv80;

    .line 71
    .line 72
    if-ne p3, v1, :cond_4

    .line 73
    .line 74
    iput-object p1, v0, Lb90;->g:Lvh0;

    .line 75
    .line 76
    move-object p3, p2

    .line 77
    check-cast p3, Lm51;

    .line 78
    .line 79
    iput-object p3, v0, Lb90;->h:Lm51;

    .line 80
    .line 81
    iput v4, v0, Lb90;->k:I

    .line 82
    .line 83
    iget-object p3, p0, Lc90;->m:Lo9;

    .line 84
    .line 85
    invoke-virtual {p3, v0}, Lo9;->g(Ljk;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    if-ne p3, v5, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    :goto_1
    iput-object v2, v0, Lb90;->g:Lvh0;

    .line 93
    .line 94
    iput-object v2, v0, Lb90;->h:Lm51;

    .line 95
    .line 96
    iput v3, v0, Lb90;->k:I

    .line 97
    .line 98
    iget-object p0, p0, Lc90;->i:Lnm;

    .line 99
    .line 100
    invoke-virtual {p0, p1, p2, v0}, Lnm;->d(Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v5, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object v5

    .line 107
    :cond_5
    :goto_3
    sget-object p0, Lna1;->a:Lna1;

    .line 108
    .line 109
    return-object p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lc90;->i:Lnm;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnm;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(Lv80;ZZ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lkl;->x:Lq91;

    .line 6
    .line 7
    iget-object v3, v1, Lv80;->k:Ljava/util/List;

    .line 8
    .line 9
    iget v4, v1, Lv80;->n:I

    .line 10
    .line 11
    iget v5, v1, Lv80;->b:I

    .line 12
    .line 13
    iget-object v6, v1, Lv80;->a:Lw80;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v8, v0, Lc90;->p:Ld80;

    .line 20
    .line 21
    iput v7, v8, Ld80;->e:I

    .line 22
    .line 23
    const/16 v7, 0x3c

    .line 24
    .line 25
    iget-object v8, v0, Lc90;->w:Ld;

    .line 26
    .line 27
    iget-object v9, v0, Lc90;->e:Lfe;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    if-nez p2, :cond_4

    .line 32
    .line 33
    iget-boolean v12, v0, Lc90;->b:Z

    .line 34
    .line 35
    if-eqz v12, :cond_4

    .line 36
    .line 37
    iput-object v1, v0, Lc90;->c:Lv80;

    .line 38
    .line 39
    invoke-static {}, Lu50;->k()Ll21;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Ll21;->e()Lsw;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v3, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v3, v11

    .line 52
    :goto_0
    invoke-static {v1}, Lu50;->s(Ll21;)Ll21;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :try_start_0
    iget-object v0, v8, Ld;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lw7;

    .line 59
    .line 60
    iget-object v0, v0, Lw7;->e:Lgp0;

    .line 61
    .line 62
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    cmpg-float v0, v0, v10

    .line 73
    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    if-eqz v6, :cond_3

    .line 78
    .line 79
    iget v0, v6, Lw80;->a:I

    .line 80
    .line 81
    iget-object v6, v9, Lfe;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, Ldp0;

    .line 84
    .line 85
    invoke-virtual {v6}, Ldp0;->g()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-ne v0, v6, :cond_3

    .line 90
    .line 91
    iget-object v0, v9, Lfe;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ldp0;

    .line 94
    .line 95
    invoke-virtual {v0}, Ldp0;->g()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-ne v5, v0, :cond_3

    .line 100
    .line 101
    iget-object v0, v8, Ld;->e:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Lr31;

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0, v11}, Lj40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    new-instance v0, Lw7;

    .line 111
    .line 112
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-direct {v0, v2, v5, v11, v7}, Lw7;-><init>(Lq91;Ljava/lang/Object;Lb8;I)V

    .line 117
    .line 118
    .line 119
    iput-object v0, v8, Ld;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    :goto_1
    invoke-static {v1, v4, v3}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :goto_2
    invoke-static {v1, v4, v3}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_4
    const/4 v12, 0x1

    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    iput-boolean v12, v0, Lc90;->b:Z

    .line 136
    .line 137
    :cond_5
    if-eqz v6, :cond_6

    .line 138
    .line 139
    iget v14, v6, Lw80;->a:I

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    const/4 v14, 0x0

    .line 143
    :goto_3
    if-nez v14, :cond_8

    .line 144
    .line 145
    if-eqz v5, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    const/4 v14, 0x0

    .line 149
    goto :goto_5

    .line 150
    :cond_8
    :goto_4
    move v14, v12

    .line 151
    :goto_5
    iget-object v15, v0, Lc90;->u:Lgp0;

    .line 152
    .line 153
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    invoke-virtual {v15, v14}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-boolean v14, v1, Lv80;->c:Z

    .line 161
    .line 162
    iget-object v15, v0, Lc90;->t:Lgp0;

    .line 163
    .line 164
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    invoke-virtual {v15, v14}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget v14, v0, Lc90;->h:F

    .line 172
    .line 173
    iget v15, v1, Lv80;->d:F

    .line 174
    .line 175
    sub-float/2addr v14, v15

    .line 176
    iput v14, v0, Lc90;->h:F

    .line 177
    .line 178
    iget-object v14, v0, Lc90;->f:Lgp0;

    .line 179
    .line 180
    invoke-virtual {v14, v1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    const-string v14, "scrollOffset should be non-negative"

    .line 184
    .line 185
    if-eqz p3, :cond_a

    .line 186
    .line 187
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    int-to-float v0, v5

    .line 191
    cmpl-float v0, v0, v10

    .line 192
    .line 193
    if-ltz v0, :cond_9

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_9
    invoke-static {v14}, Lz10;->c(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :goto_6
    iget-object v0, v9, Lfe;->c:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Ldp0;

    .line 202
    .line 203
    invoke-virtual {v0, v5}, Ldp0;->h(I)V

    .line 204
    .line 205
    .line 206
    move-object/from16 v19, v8

    .line 207
    .line 208
    goto/16 :goto_e

    .line 209
    .line 210
    :cond_a
    invoke-static {v3}, Lye;->K(Ljava/util/List;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    check-cast v15, Lw80;

    .line 215
    .line 216
    invoke-static {v3}, Lye;->Q(Ljava/util/List;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v16

    .line 220
    move-object/from16 v13, v16

    .line 221
    .line 222
    check-cast v13, Lw80;

    .line 223
    .line 224
    const-wide/16 v17, -0x1

    .line 225
    .line 226
    if-eqz v15, :cond_b

    .line 227
    .line 228
    iget v15, v15, Lw80;->a:I

    .line 229
    .line 230
    move-object/from16 v19, v8

    .line 231
    .line 232
    int-to-long v7, v15

    .line 233
    goto :goto_7

    .line 234
    :cond_b
    move-object/from16 v19, v8

    .line 235
    .line 236
    move-wide/from16 v7, v17

    .line 237
    .line 238
    :goto_7
    const-string v15, "firstVisibleItem:index"

    .line 239
    .line 240
    invoke-static {v15, v7, v8}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    .line 241
    .line 242
    .line 243
    if-eqz v13, :cond_c

    .line 244
    .line 245
    iget v7, v13, Lw80;->a:I

    .line 246
    .line 247
    int-to-long v7, v7

    .line 248
    goto :goto_8

    .line 249
    :cond_c
    move-wide/from16 v7, v17

    .line 250
    .line 251
    :goto_8
    const-string v13, "lastVisibleItem:index"

    .line 252
    .line 253
    invoke-static {v13, v7, v8}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    if-eqz v6, :cond_d

    .line 260
    .line 261
    iget-object v7, v6, Lw80;->f:Ljava/lang/Object;

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_d
    move-object v7, v11

    .line 265
    :goto_9
    iput-object v7, v9, Lfe;->d:Ljava/lang/Object;

    .line 266
    .line 267
    iget-boolean v7, v9, Lfe;->a:Z

    .line 268
    .line 269
    if-nez v7, :cond_e

    .line 270
    .line 271
    if-lez v4, :cond_11

    .line 272
    .line 273
    :cond_e
    iput-boolean v12, v9, Lfe;->a:Z

    .line 274
    .line 275
    int-to-float v7, v5

    .line 276
    cmpl-float v7, v7, v10

    .line 277
    .line 278
    if-ltz v7, :cond_f

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_f
    invoke-static {v14}, Lz10;->c(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :goto_a
    if-eqz v6, :cond_10

    .line 285
    .line 286
    iget v6, v6, Lw80;->a:I

    .line 287
    .line 288
    goto :goto_b

    .line 289
    :cond_10
    const/4 v6, 0x0

    .line 290
    :goto_b
    invoke-virtual {v9, v6, v5}, Lfe;->b(II)V

    .line 291
    .line 292
    .line 293
    :cond_11
    iget-boolean v5, v0, Lc90;->j:Z

    .line 294
    .line 295
    if-eqz v5, :cond_17

    .line 296
    .line 297
    iget-object v5, v0, Lc90;->a:Ldm;

    .line 298
    .line 299
    iget v6, v5, Ldm;->a:I

    .line 300
    .line 301
    iget-boolean v7, v5, Ldm;->c:Z

    .line 302
    .line 303
    const/4 v8, -0x1

    .line 304
    if-eq v6, v8, :cond_13

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    if-nez v9, :cond_13

    .line 311
    .line 312
    invoke-static {v1, v7}, Ldm;->a(Lv80;Z)I

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-eq v6, v7, :cond_13

    .line 317
    .line 318
    iput v8, v5, Ldm;->a:I

    .line 319
    .line 320
    iget-object v6, v5, Ldm;->b:Lc80;

    .line 321
    .line 322
    if-eqz v6, :cond_12

    .line 323
    .line 324
    invoke-interface {v6}, Lc80;->cancel()V

    .line 325
    .line 326
    .line 327
    :cond_12
    iput-object v11, v5, Ldm;->b:Lc80;

    .line 328
    .line 329
    :cond_13
    iget v6, v5, Ldm;->d:I

    .line 330
    .line 331
    if-eq v6, v8, :cond_16

    .line 332
    .line 333
    iget v7, v5, Ldm;->e:F

    .line 334
    .line 335
    cmpg-float v7, v7, v10

    .line 336
    .line 337
    if-nez v7, :cond_14

    .line 338
    .line 339
    goto :goto_d

    .line 340
    :cond_14
    if-eq v6, v4, :cond_16

    .line 341
    .line 342
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    if-nez v3, :cond_16

    .line 347
    .line 348
    iget v3, v5, Ldm;->e:F

    .line 349
    .line 350
    cmpg-float v3, v3, v10

    .line 351
    .line 352
    if-gez v3, :cond_15

    .line 353
    .line 354
    goto :goto_c

    .line 355
    :cond_15
    const/4 v12, 0x0

    .line 356
    :goto_c
    invoke-static {v1, v12}, Ldm;->a(Lv80;Z)I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-ltz v3, :cond_16

    .line 361
    .line 362
    if-ge v3, v4, :cond_16

    .line 363
    .line 364
    iput v3, v5, Ldm;->a:I

    .line 365
    .line 366
    iget-object v0, v0, Lc90;->q:Lx1;

    .line 367
    .line 368
    invoke-static {v0, v3}, Lx1;->t(Lx1;I)Lc80;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iput-object v0, v5, Ldm;->b:Lc80;

    .line 373
    .line 374
    :cond_16
    :goto_d
    iput v4, v5, Ldm;->d:I

    .line 375
    .line 376
    :cond_17
    :goto_e
    if-eqz p2, :cond_1c

    .line 377
    .line 378
    iget v0, v1, Lv80;->f:F

    .line 379
    .line 380
    iget-object v3, v1, Lv80;->i:Lym;

    .line 381
    .line 382
    iget-object v1, v1, Lv80;->h:Lyk;

    .line 383
    .line 384
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    const/high16 v4, 0x3f800000    # 1.0f

    .line 388
    .line 389
    invoke-interface {v3, v4}, Lym;->p(F)F

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    cmpg-float v3, v0, v3

    .line 394
    .line 395
    if-gtz v3, :cond_18

    .line 396
    .line 397
    goto :goto_13

    .line 398
    :cond_18
    invoke-static {}, Lu50;->k()Ll21;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    if-eqz v3, :cond_19

    .line 403
    .line 404
    invoke-virtual {v3}, Ll21;->e()Lsw;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    goto :goto_f

    .line 409
    :cond_19
    move-object v4, v11

    .line 410
    :goto_f
    invoke-static {v3}, Lu50;->s(Ll21;)Ll21;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    move-object/from16 v6, v19

    .line 415
    .line 416
    :try_start_1
    iget-object v7, v6, Ld;->f:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v7, Lw7;

    .line 419
    .line 420
    iget-object v7, v7, Lw7;->e:Lgp0;

    .line 421
    .line 422
    invoke-virtual {v7}, Lgp0;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    check-cast v7, Ljava/lang/Number;

    .line 427
    .line 428
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    iget-object v8, v6, Ld;->e:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v8, Lr31;

    .line 435
    .line 436
    if-eqz v8, :cond_1a

    .line 437
    .line 438
    invoke-virtual {v8, v11}, Lj40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 439
    .line 440
    .line 441
    goto :goto_10

    .line 442
    :catchall_1
    move-exception v0

    .line 443
    goto :goto_12

    .line 444
    :cond_1a
    :goto_10
    iget-object v8, v6, Ld;->f:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v8, Lw7;

    .line 447
    .line 448
    iget-boolean v9, v8, Lw7;->i:Z

    .line 449
    .line 450
    if-eqz v9, :cond_1b

    .line 451
    .line 452
    sub-float/2addr v7, v0

    .line 453
    const/16 v0, 0x1e

    .line 454
    .line 455
    invoke-static {v8, v7, v10, v0}, Lpf1;->q(Lw7;FFI)Lw7;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    iput-object v0, v6, Ld;->f:Ljava/lang/Object;

    .line 460
    .line 461
    goto :goto_11

    .line 462
    :cond_1b
    new-instance v7, Lw7;

    .line 463
    .line 464
    neg-float v0, v0

    .line 465
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    const/16 v8, 0x3c

    .line 470
    .line 471
    invoke-direct {v7, v2, v0, v11, v8}, Lw7;-><init>(Lq91;Ljava/lang/Object;Lb8;I)V

    .line 472
    .line 473
    .line 474
    iput-object v7, v6, Ld;->f:Ljava/lang/Object;

    .line 475
    .line 476
    :goto_11
    new-instance v0, Lcg;

    .line 477
    .line 478
    const/4 v2, 0x3

    .line 479
    invoke-direct {v0, v6, v11, v2}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 480
    .line 481
    .line 482
    invoke-static {v1, v11, v0, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    iput-object v0, v6, Ld;->e:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 487
    .line 488
    invoke-static {v3, v5, v4}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 489
    .line 490
    .line 491
    goto :goto_13

    .line 492
    :goto_12
    invoke-static {v3, v5, v4}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 493
    .line 494
    .line 495
    throw v0

    .line 496
    :cond_1c
    :goto_13
    return-void
.end method

.method public final g()Lv80;
    .locals 0

    .line 1
    iget-object p0, p0, Lc90;->f:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv80;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h(FLv80;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lc90;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p2, Lv80;->k:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lc90;->a:Ldm;

    .line 12
    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    cmpg-float v0, p1, v0

    .line 17
    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-static {p2, v0}, Ldm;->a(Lv80;Z)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ltz v2, :cond_5

    .line 28
    .line 29
    iget v3, p2, Lv80;->n:I

    .line 30
    .line 31
    if-ge v2, v3, :cond_5

    .line 32
    .line 33
    iget v3, v1, Ldm;->a:I

    .line 34
    .line 35
    if-eq v2, v3, :cond_3

    .line 36
    .line 37
    iget-boolean v3, v1, Ldm;->c:Z

    .line 38
    .line 39
    if-eq v3, v0, :cond_2

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    iput v3, v1, Ldm;->a:I

    .line 43
    .line 44
    iget-object v3, v1, Ldm;->b:Lc80;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-interface {v3}, Lc80;->cancel()V

    .line 49
    .line 50
    .line 51
    :cond_1
    const/4 v3, 0x0

    .line 52
    iput-object v3, v1, Ldm;->b:Lc80;

    .line 53
    .line 54
    :cond_2
    iput-boolean v0, v1, Ldm;->c:Z

    .line 55
    .line 56
    iput v2, v1, Ldm;->a:I

    .line 57
    .line 58
    iget-object p0, p0, Lc90;->q:Lx1;

    .line 59
    .line 60
    invoke-static {p0, v2}, Lx1;->t(Lx1;I)Lc80;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iput-object p0, v1, Ldm;->b:Lc80;

    .line 65
    .line 66
    :cond_3
    iget-object p0, p2, Lv80;->k:Ljava/util/List;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-static {p0}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lw80;

    .line 75
    .line 76
    iget v0, p2, Lv80;->q:I

    .line 77
    .line 78
    iget v2, p0, Lw80;->i:I

    .line 79
    .line 80
    iget p0, p0, Lw80;->j:I

    .line 81
    .line 82
    add-int/2addr v2, p0

    .line 83
    add-int/2addr v2, v0

    .line 84
    iget p0, p2, Lv80;->m:I

    .line 85
    .line 86
    sub-int/2addr v2, p0

    .line 87
    int-to-float p0, v2

    .line 88
    neg-float p2, p1

    .line 89
    cmpg-float p0, p0, p2

    .line 90
    .line 91
    if-gez p0, :cond_5

    .line 92
    .line 93
    iget-object p0, v1, Ldm;->b:Lc80;

    .line 94
    .line 95
    if-eqz p0, :cond_5

    .line 96
    .line 97
    invoke-interface {p0}, Lc80;->a()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {p0}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Lw80;

    .line 106
    .line 107
    iget p2, p2, Lv80;->l:I

    .line 108
    .line 109
    iget p0, p0, Lw80;->i:I

    .line 110
    .line 111
    sub-int/2addr p2, p0

    .line 112
    int-to-float p0, p2

    .line 113
    cmpg-float p0, p0, p1

    .line 114
    .line 115
    if-gez p0, :cond_5

    .line 116
    .line 117
    iget-object p0, v1, Ldm;->b:Lc80;

    .line 118
    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    invoke-interface {p0}, Lc80;->a()V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_1
    iput p1, v1, Ldm;->e:F

    .line 125
    .line 126
    :cond_6
    return-void
.end method
