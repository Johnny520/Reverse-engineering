.class public final Lfd/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr1/a;


# instance fields
.field public g:Z

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lfd/h;->h:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v1, Lwc/a;

    .line 12
    .line 13
    invoke-direct {v1}, Lwc/a;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    filled-new-array {v2, v3}, [Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iput-object v3, v1, Lwc/a;->c:Ljava/util/List;

    .line 29
    .line 30
    new-instance v3, Lme/a;

    .line 31
    .line 32
    const/16 v4, 0x15

    .line 33
    .line 34
    invoke-direct {v3, v4}, Lme/a;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v3, v1, Lwc/a;->e:Lme/a;

    .line 38
    .line 39
    new-instance v3, Lme/a;

    .line 40
    .line 41
    const/16 v4, 0x16

    .line 42
    .line 43
    invoke-direct {v3, v4}, Lme/a;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v3, v1, Lwc/a;->d:Lme/a;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    const-string v3, "verify dex file checksum before load"

    .line 52
    .line 53
    iput-object v3, v1, Lwc/a;->b:Ljava/lang/String;

    .line 54
    .line 55
    iput-object v2, v1, Lwc/a;->g:Ljava/lang/Boolean;

    .line 56
    .line 57
    new-instance v2, Lae/g;

    .line 58
    .line 59
    const/16 v3, 0x8

    .line 60
    .line 61
    invoke-direct {v2, p0, v3}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    iput-object v2, v1, Lwc/a;->f:Lae/g;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lwc/a;

    .line 81
    .line 82
    iget-object v2, v1, Lwc/a;->a:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v3, v1, Lwc/a;->b:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    iget-object v3, v1, Lwc/a;->d:Lme/a;

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    iget-object v3, v1, Lwc/a;->e:Lme/a;

    .line 99
    .line 100
    if-eqz v3, :cond_1

    .line 101
    .line 102
    iget-object v1, v1, Lwc/a;->f:Lae/g;

    .line 103
    .line 104
    if-eqz v1, :cond_0

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    const-string v0, "Setter should be set for option: "

    .line 108
    .line 109
    invoke-static {v0, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    throw v0

    .line 118
    :cond_1
    const-string v0, "Formatter should be set for option: "

    .line 119
    .line 120
    invoke-static {v0, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    throw v0

    .line 129
    :cond_2
    const-string v0, "Parser should be set for option: "

    .line 130
    .line 131
    invoke-static {v0, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    throw v0

    .line 140
    :cond_3
    const-string v0, "Description should be set for option: "

    .line 141
    .line 142
    invoke-static {v0, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const/4 v0, 0x0

    .line 150
    throw v0

    .line 151
    :cond_4
    return-void
.end method

.method public constructor <init>(Lfd/a;Lud/r;)V
    .locals 4

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lfd/h;->h:Ljava/lang/Object;

    .line 154
    iget-boolean v1, p1, Lfd/a;->d:Z

    .line 155
    iput-boolean v1, p0, Lfd/h;->g:Z

    .line 156
    iget-object p1, p1, Lfd/a;->k:Lfd/h;

    if-eqz p1, :cond_0

    .line 157
    iget-object p1, p1, Lfd/h;->h:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 158
    :cond_0
    iget-object p1, p2, Lud/r;->l:Lud/e;

    .line 159
    iget-object v1, p1, Lud/e;->u:Ljava/util/List;

    .line 160
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lud/g;

    .line 161
    iget-object v3, v2, Lud/g;->m:Lb5/k;

    .line 162
    invoke-virtual {v3}, Lb5/k;->h()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 163
    iget-object v2, v2, Lud/g;->l:Lod/c;

    .line 164
    iget-object v2, v2, Lod/c;->j:Ljava/lang/String;

    .line 165
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 166
    :cond_2
    iget-object p1, p1, Lud/e;->v:Ljava/util/List;

    .line 167
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud/e;

    .line 168
    iget-object v1, v1, Lud/e;->m:Lod/a;

    .line 169
    invoke-virtual {v1}, Lod/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 170
    :cond_3
    iget-object p1, p2, Lud/r;->l:Lud/e;

    .line 171
    iget-object p1, p1, Lud/e;->k:Lud/u;

    .line 172
    iget-object p1, p1, Lud/u;->f:Lxe/e;

    .line 173
    iget-object p1, p1, Lxe/e;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    .line 174
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    .line 175
    iput-object p1, p0, Lfd/h;->h:Ljava/lang/Object;

    iput-boolean p2, p0, Lfd/h;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public M0(JJI)J
    .locals 0

    .line 1
    iget-boolean p1, p0, Lfd/h;->g:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lfd/h;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lm/o2;

    .line 8
    .line 9
    iget-object p2, p1, Lm/o2;->a:Lm/i2;

    .line 10
    .line 11
    invoke-interface {p2}, Lm/i2;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p2, p1, Lm/o2;->a:Lm/i2;

    .line 19
    .line 20
    invoke-virtual {p1, p3, p4}, Lm/o2;->g(J)F

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    invoke-virtual {p1, p3}, Lm/o2;->d(F)F

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    invoke-interface {p2, p3}, Lm/i2;->e(F)F

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p1, p2}, Lm/o2;->d(F)F

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p1, p2}, Lm/o2;->h(F)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    return-wide p1

    .line 41
    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    .line 42
    .line 43
    return-wide p1
.end method

.method public a(Lqd/k;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lfd/h;->g:Z

    .line 2
    .line 3
    const-string v1, "r"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "v"

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p1, p1, Lqd/k;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-object v3

    .line 19
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lqd/s;

    .line 24
    .line 25
    iget-object p1, p1, Lqd/s;->i:Lqd/r;

    .line 26
    .line 27
    iget p1, p1, Lqd/r;->l:I

    .line 28
    .line 29
    invoke-static {p1, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    iget-boolean v0, p1, Lqd/k;->e:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const-string p1, "this"

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    iget-object v0, p1, Lqd/k;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0}, Lkd/d;->c(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    iget-object v0, p1, Lqd/k;->c:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lqd/s;

    .line 64
    .line 65
    iget-object v0, v0, Lqd/s;->i:Lqd/r;

    .line 66
    .line 67
    iget v0, v0, Lqd/r;->l:I

    .line 68
    .line 69
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :goto_0
    move-object v0, v3

    .line 74
    :goto_1
    invoke-virtual {p0, v0}, Lfd/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p1, Lqd/k;->a:Ljava/lang/String;

    .line 79
    .line 80
    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lfd/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    move-object v2, p1

    .line 7
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-object v2
.end method

.method public c(Ljava/util/HashMap;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lfd/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lwc/a;

    .line 20
    .line 21
    iget-object v2, v1, Lwc/a;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/String;

    .line 28
    .line 29
    const-string v4, ", value: "

    .line 30
    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    iget-object v3, v1, Lwc/a;->g:Ljava/lang/Boolean;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :try_start_0
    iget-object v5, v1, Lwc/a;->d:Lme/a;

    .line 37
    .line 38
    invoke-virtual {v5, v3}, Lme/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 42
    :goto_1
    :try_start_1
    iget-object v1, v1, Lwc/a;->f:Lae/g;

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Lae/g;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception p1

    .line 49
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "Setter invoke failed for option: "

    .line 54
    .line 55
    invoke-static {v1, v2, v4, v0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0, p1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catch_1
    move-exception p1

    .line 64
    const-string v0, "Parse failed for option: "

    .line 65
    .line 66
    invoke-static {v0, v2, v4, v3}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, p1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public m0(JJLyf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of p1, p5, Lm/b2;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p5

    .line 6
    check-cast p1, Lm/b2;

    .line 7
    .line 8
    iget p2, p1, Lm/b2;->j:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    and-int v1, p2, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p2, v0

    .line 17
    iput p2, p1, Lm/b2;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lm/b2;

    .line 21
    .line 22
    invoke-direct {p1, p0, p5}, Lm/b2;-><init>(Lfd/h;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, p1, Lm/b2;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget p5, p1, Lm/b2;->j:I

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    if-eqz p5, :cond_2

    .line 31
    .line 32
    if-ne p5, v0, :cond_1

    .line 33
    .line 34
    iget-wide p3, p1, Lm/b2;->g:J

    .line 35
    .line 36
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-boolean p2, p0, Lfd/h;->g:Z

    .line 51
    .line 52
    const-wide/16 v1, 0x0

    .line 53
    .line 54
    if-eqz p2, :cond_5

    .line 55
    .line 56
    iget-object p2, p0, Lfd/h;->h:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, Lm/o2;

    .line 59
    .line 60
    iget-boolean p5, p2, Lm/o2;->i:Z

    .line 61
    .line 62
    if-eqz p5, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iput-wide p3, p1, Lm/b2;->g:J

    .line 66
    .line 67
    iput v0, p1, Lm/b2;->j:I

    .line 68
    .line 69
    invoke-virtual {p2, p3, p4, p1}, Lm/o2;->a(JLyf/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 74
    .line 75
    if-ne p2, p1, :cond_4

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4
    :goto_1
    check-cast p2, Lu2/q;

    .line 79
    .line 80
    iget-wide v1, p2, Lu2/q;->a:J

    .line 81
    .line 82
    :goto_2
    invoke-static {p3, p4, v1, v2}, Lu2/q;->d(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v1

    .line 86
    :cond_5
    new-instance p1, Lu2/q;

    .line 87
    .line 88
    invoke-direct {p1, v1, v2}, Lu2/q;-><init>(J)V

    .line 89
    .line 90
    .line 91
    return-object p1
.end method
