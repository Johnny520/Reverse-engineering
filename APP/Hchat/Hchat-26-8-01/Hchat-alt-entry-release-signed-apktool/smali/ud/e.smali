.class public final Lud/e;
.super Lnd/b0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final F:Lmh/b;


# instance fields
.field public A:Ljava/util/List;

.field public B:Ljava/util/List;

.field public C:Ljava/util/List;

.field public D:Ljava/util/Map;

.field public E:Lbc/l;

.field public final k:Lud/u;

.field public final l:Ljf/b;

.field public final m:Lod/a;

.field public n:Lud/s;

.field public o:Lb5/k;

.field public p:Lqd/j;

.field public q:Ljava/util/List;

.field public r:Ljava/util/List;

.field public s:Ljava/lang/String;

.field public t:Ljava/util/List;

.field public u:Ljava/util/List;

.field public v:Ljava/util/List;

.field public w:Ljava/util/List;

.field public x:Lud/e;

.field public volatile y:I

.field public z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lud/e;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lud/e;->F:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lud/u;Ljf/b;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lud/e;->r:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, Lud/e;->v:Ljava/util/List;

    .line 9
    .line 10
    iput-object v0, p0, Lud/e;->w:Ljava/util/List;

    .line 11
    .line 12
    iput-object p0, p0, Lud/e;->x:Lud/e;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput v1, p0, Lud/e;->y:I

    .line 16
    .line 17
    iput-object v0, p0, Lud/e;->z:Ljava/util/List;

    .line 18
    .line 19
    iput-object v0, p0, Lud/e;->A:Ljava/util/List;

    .line 20
    .line 21
    iput-object v0, p0, Lud/e;->B:Ljava/util/List;

    .line 22
    .line 23
    iput-object v0, p0, Lud/e;->C:Ljava/util/List;

    .line 24
    .line 25
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 26
    .line 27
    iput-object v0, p0, Lud/e;->D:Ljava/util/Map;

    .line 28
    .line 29
    iput-object p1, p0, Lud/e;->k:Lud/u;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljf/b;->b()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p1, v0}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lud/e;->m:Lod/a;

    .line 44
    .line 45
    invoke-virtual {v0}, Lod/a;->l()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p1, v0}, Lud/s;->I(Lud/u;Ljava/lang/String;)Lud/s;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v0, p1, Lud/s;->o:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lud/e;->n:Lud/s;

    .line 59
    .line 60
    new-instance p1, Ljf/b;

    .line 61
    .line 62
    iget-object v0, p2, Ljf/b;->a:Lac/k;

    .line 63
    .line 64
    invoke-virtual {v0}, Lac/k;->g()Lac/k;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object p2, p2, Ljf/b;->b:Lf/r;

    .line 69
    .line 70
    new-instance v1, Lf/r;

    .line 71
    .line 72
    iget-object v2, p2, Lf/r;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lac/k;

    .line 75
    .line 76
    invoke-virtual {v2}, Lac/k;->g()Lac/k;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget-object p2, p2, Lf/r;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Lac/k;

    .line 83
    .line 84
    invoke-virtual {p2}, Lac/k;->g()Lac/k;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-direct {v1, v2, p2}, Lf/r;-><init>(Lac/k;Lac/k;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p1, v0, v1}, Ljf/b;-><init>(Lac/k;Lf/r;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lud/e;->l:Ljf/b;

    .line 95
    .line 96
    const/4 p2, 0x0

    .line 97
    invoke-virtual {p0, p1, p2}, Lud/e;->f0(Ljf/b;Z)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public constructor <init>(Lud/u;Lod/a;I)V
    .locals 3

    .line 101
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 102
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lud/e;->r:Ljava/util/List;

    .line 103
    iput-object v0, p0, Lud/e;->v:Ljava/util/List;

    .line 104
    iput-object v0, p0, Lud/e;->w:Ljava/util/List;

    .line 105
    iput-object p0, p0, Lud/e;->x:Lud/e;

    const/4 v1, 0x1

    .line 106
    iput v1, p0, Lud/e;->y:I

    .line 107
    iput-object v0, p0, Lud/e;->z:Ljava/util/List;

    .line 108
    iput-object v0, p0, Lud/e;->A:Ljava/util/List;

    .line 109
    iput-object v0, p0, Lud/e;->B:Ljava/util/List;

    .line 110
    iput-object v0, p0, Lud/e;->C:Ljava/util/List;

    .line 111
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Lud/e;->D:Ljava/util/Map;

    .line 112
    iput-object p1, p0, Lud/e;->k:Lud/u;

    const/4 v0, 0x0

    .line 113
    iput-object v0, p0, Lud/e;->l:Ljf/b;

    .line 114
    iput-object p2, p0, Lud/e;->m:Lod/a;

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lud/e;->q:Ljava/util/List;

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lud/e;->t:Ljava/util/List;

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lud/e;->u:Ljava/util/List;

    .line 118
    new-instance v0, Lb5/k;

    const/4 v2, 0x3

    invoke-direct {v0, p3, v1, v2}, Lb5/k;-><init>(III)V

    iput-object v0, p0, Lud/e;->o:Lb5/k;

    .line 119
    invoke-virtual {p2}, Lod/a;->l()Ljava/lang/String;

    move-result-object p2

    .line 120
    invoke-static {p1, p2}, Lud/s;->I(Lud/u;Ljava/lang/String;)Lud/s;

    move-result-object p1

    .line 121
    iget-object p2, p1, Lud/s;->o:Ljava/util/ArrayList;

    .line 122
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    iput-object p1, p0, Lud/e;->n:Lud/s;

    return-void
.end method

.method public static T(Lud/u;Lod/a;I)Lud/e;
    .locals 1

    .line 1
    new-instance v0, Lud/e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lud/e;-><init>(Lud/u;Lod/a;I)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lmd/a;->m:Lmd/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lmd/e;->w(Lmd/a;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "synthetic"

    .line 12
    .line 13
    iput-object p1, v0, Lud/e;->s:Ljava/lang/String;

    .line 14
    .line 15
    const/4 p1, 0x4

    .line 16
    iput p1, v0, Lud/e;->y:I

    .line 17
    .line 18
    iget-object p1, p0, Lud/u;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lud/u;->l:Ljava/util/HashMap;

    .line 24
    .line 25
    iget-object p2, v0, Lud/e;->m:Lod/a;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lud/u;->m:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v0}, Lud/e;->Z()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static g0(Lud/e;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    sget-object v1, Loc/c;->e:Loc/c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lpc/b;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lmd/e;->E(Loc/a;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lpc/b;->g:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lud/e;->n0(Ljava/lang/String;)Lud/r;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    new-instance v3, Lpc/a;

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lnc/a;

    .line 57
    .line 58
    invoke-direct {v3, v1}, Lpc/a;-><init>(Lnc/a;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Lmd/e;->y(Loc/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v3, "Method from annotation default annotation not found: "

    .line 74
    .line 75
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {p0, v1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 90
    .line 91
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 92
    .line 93
    sget-object v2, Loc/c;->c:Loc/c;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lpc/k;

    .line 100
    .line 101
    if-nez v1, :cond_2

    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :cond_2
    iget-object v1, v1, Lpc/k;->g:Ljava/lang/String;

    .line 106
    .line 107
    const-string v3, ".java"

    .line 108
    .line 109
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_3

    .line 114
    .line 115
    const/4 v3, 0x5

    .line 116
    const/4 v4, 0x0

    .line 117
    invoke-static {v3, v4, v1}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-nez v3, :cond_a

    .line 126
    .line 127
    const-string v3, "SourceFile"

    .line 128
    .line 129
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    if-eqz v0, :cond_9

    .line 137
    .line 138
    iget-object v3, v0, Lod/a;->h:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_5

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    iget-object v0, v0, Lod/a;->k:Lod/a;

    .line 148
    .line 149
    :goto_1
    const-string v4, "$"

    .line 150
    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    iget-object v5, v0, Lod/a;->h:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-nez v6, :cond_a

    .line 160
    .line 161
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_6

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    iget-object v0, v0, Lod/a;->k:Lod/a;

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_7
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_8

    .line 180
    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_8
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_9

    .line 205
    .line 206
    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_9
    :goto_2
    return-void

    .line 214
    :cond_a
    :goto_3
    invoke-virtual {p0, v2}, Lmd/e;->E(Loc/a;)V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public static h0(Lbc/d;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Lbc/d;->c()Lb/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/NavigableMap;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lhc/a;

    .line 41
    .line 42
    invoke-interface {v2}, Lhc/a;->j()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/4 v4, 0x7

    .line 47
    if-ne v3, v4, :cond_1

    .line 48
    .line 49
    check-cast v2, Lic/b;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-object v2, v2, Lic/b;->g:Lhc/c;

    .line 62
    .line 63
    invoke-interface {v2, v1}, Lhc/c;->t(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    new-instance v0, Lud/b;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {v0, v1}, Lud/b;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0, v0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 78
    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final O()Lb5/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->o:Lb5/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Lud/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lud/e;->d0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lud/e;->x:Lud/e;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final Q(Lb5/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lud/e;->o:Lb5/k;

    .line 2
    .line 3
    return-void
.end method

.method public final R(Lud/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lud/e;->u:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lud/e;->u:Ljava/util/List;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lud/e;->u:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final S(Lud/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lud/e;->w:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x5

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lud/e;->w:Ljava/util/List;

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lnd/m;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lnd/m;-><init>(Lud/e;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lmd/e;->y(Loc/b;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lud/e;->w:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final U(Ljf/b;)Lqd/j;
    .locals 3

    .line 1
    iget-object p1, p1, Ljf/b;->a:Lac/k;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lac/k;->B(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lac/k;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v0}, Lac/k;->y(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Lud/e;->m:Lod/a;

    .line 23
    .line 24
    iget-object v0, p1, Lod/a;->g:Lqd/j;

    .line 25
    .line 26
    invoke-virtual {v0}, Lqd/j;->l()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "java.lang.Object"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_0
    iget-object v0, p0, Lud/e;->o:Lb5/k;

    .line 41
    .line 42
    iget v0, v0, Lb5/k;->b:I

    .line 43
    .line 44
    const v2, 0x8000

    .line 45
    .line 46
    .line 47
    and-int/2addr v0, v2

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_1
    iget-object p1, p1, Lod/a;->g:Lqd/j;

    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v0, "No super class in "

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    return-object p1

    .line 68
    :cond_2
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
.end method

.method public final declared-synchronized V()Lbc/d;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lud/e;->d0()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lbc/d;->a:Lfc/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_2

    .line 14
    :cond_0
    :try_start_1
    iget-object v0, p0, Lud/e;->k:Lud/u;

    .line 15
    .line 16
    iget-object v0, v0, Lud/u;->a:Lbc/g;

    .line 17
    .line 18
    iget-object v0, v0, Lbc/g;->k:Lbc/c;

    .line 19
    .line 20
    invoke-virtual {p0}, Lud/e;->Z()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Lbc/c;->v(Ljava/lang/String;)Lbc/d;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v3, Lbc/d;->a:Lfc/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-object v2

    .line 34
    :cond_1
    :try_start_2
    iget-object v2, p0, Lud/e;->k:Lud/u;

    .line 35
    .line 36
    iget-object v2, v2, Lud/u;->r:Ldd/b;

    .line 37
    .line 38
    invoke-virtual {v2, p0}, Ldd/b;->b(Lud/e;)Lbc/d;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2}, Lud/e;->h0(Lbc/d;)V
    :try_end_2
    .catch Ljava/lang/StackOverflowError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception v2

    .line 47
    goto :goto_0

    .line 48
    :catch_1
    move-exception v2

    .line 49
    :goto_0
    :try_start_3
    const-string v3, "Code generation failed"

    .line 50
    .line 51
    invoke-static {p0, v3, v2}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lfc/e;

    .line 55
    .line 56
    invoke-static {v2}, Lxe/s;->g(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {v3, v2}, Lfc/e;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v2, v3

    .line 64
    :goto_1
    sget-object v3, Lbc/d;->a:Lfc/e;

    .line 65
    .line 66
    if-eq v2, v3, :cond_2

    .line 67
    .line 68
    invoke-interface {v0, v1, v2}, Lbc/c;->r(Ljava/lang/String;Lbc/d;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_2
    monitor-exit p0

    .line 72
    return-object v2

    .line 73
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 74
    throw v0
.end method

.method public final W()V
    .locals 4

    .line 1
    iget-object v0, p0, Lud/e;->l:Ljf/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v1, Lmd/e;->h:Lmd/g;

    .line 7
    .line 8
    iput-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 9
    .line 10
    invoke-virtual {p0}, Lud/e;->o0()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lud/e;->k:Lud/u;

    .line 14
    .line 15
    iget-object v1, v1, Lud/u;->d:Lj8/f;

    .line 16
    .line 17
    iget-object v2, v1, Lj8/f;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, Lj8/f;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lod/b;

    .line 27
    .line 28
    iget-object v1, v1, Lod/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, Lbe/g0;

    .line 35
    .line 36
    const/4 v3, 0x3

    .line 37
    invoke-direct {v2, p0, v3}, Lbe/g0;-><init>(Lud/e;I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v2}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {p0, v0, v1}, Lud/e;->f0(Ljf/b;Z)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lud/e;->v:Ljava/util/List;

    .line 48
    .line 49
    new-instance v1, Lae/e;

    .line 50
    .line 51
    const/16 v2, 0x1c

    .line 52
    .line 53
    invoke-direct {v1, v2}, Lae/e;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final X(Ljava/lang/Object;Z)Lud/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->k:Lud/u;

    .line 2
    .line 3
    iget-object v0, v0, Lud/u;->d:Lj8/f;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1, p2}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final Y(Lqd/n;)Lud/l;
    .locals 9

    .line 1
    iget-object v0, p0, Lud/e;->k:Lud/u;

    .line 2
    .line 3
    iget-object v0, v0, Lud/u;->d:Lj8/f;

    .line 4
    .line 5
    iget-boolean v1, v0, Lj8/f;->a:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p1, Lqd/l;->i:Lqd/j;

    .line 11
    .line 12
    invoke-virtual {v1}, Lqd/j;->o()Lqd/q;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-wide v2, p1, Lqd/n;->l:J

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const-wide/16 v4, 0xa

    .line 26
    .line 27
    const-wide/16 v6, 0x64

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    const/4 v8, 0x0

    .line 31
    packed-switch p1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    :goto_0
    const/4 p1, 0x0

    .line 35
    return-object p1

    .line 36
    :pswitch_0
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-wide/16 v4, 0x0

    .line 45
    .line 46
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v1, v8

    .line 54
    :goto_1
    invoke-virtual {v0, p0, p1, v1}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :pswitch_1
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const-wide/16 v4, 0x3e8

    .line 68
    .line 69
    cmp-long v2, v2, v4

    .line 70
    .line 71
    if-lez v2, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move v1, v8

    .line 75
    :goto_2
    invoke-virtual {v0, p0, p1, v1}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :pswitch_2
    long-to-int p1, v2

    .line 81
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const/4 v3, 0x0

    .line 90
    invoke-static {p1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move v1, v8

    .line 98
    :goto_3
    invoke-virtual {v0, p0, v2, v1}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :pswitch_3
    long-to-int p1, v2

    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    cmp-long v2, v2, v6

    .line 113
    .line 114
    if-lez v2, :cond_5

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_5
    move v1, v8

    .line 118
    :goto_4
    invoke-virtual {v0, p0, p1, v1}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :pswitch_4
    long-to-int p1, v2

    .line 124
    int-to-short p1, p1

    .line 125
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    cmp-long v2, v2, v6

    .line 134
    .line 135
    if-lez v2, :cond_6

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_6
    move v1, v8

    .line 139
    :goto_5
    invoke-virtual {v0, p0, p1, v1}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :pswitch_5
    long-to-int p1, v2

    .line 145
    int-to-byte p1, p1

    .line 146
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    cmp-long v2, v2, v4

    .line 155
    .line 156
    if-lez v2, :cond_7

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_7
    move v1, v8

    .line 160
    :goto_6
    invoke-virtual {v0, p0, p1, v1}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :pswitch_6
    long-to-int p1, v2

    .line 166
    int-to-char p1, p1

    .line 167
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    cmp-long v2, v2, v4

    .line 176
    .line 177
    if-lez v2, :cond_8

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_8
    move v1, v8

    .line 181
    :goto_7
    invoke-virtual {v0, p0, p1, v1}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1

    .line 186
    :pswitch_7
    const-wide/16 v4, 0x1

    .line 187
    .line 188
    cmp-long p1, v2, v4

    .line 189
    .line 190
    if-nez p1, :cond_9

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_9
    move v1, v8

    .line 194
    :goto_8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {v0, p0, p1, v8}, Lj8/f;->f(Lud/e;Ljava/lang/Object;Z)Lud/l;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final Z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 2
    .line 3
    iget-object v0, v0, Lod/a;->g:Lqd/j;

    .line 4
    .line 5
    invoke-virtual {v0}, Lqd/j;->l()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final a0()Lud/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->x:Lud/e;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lud/e;->a0()Lud/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final b0()Lqd/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 2
    .line 3
    iget-object v0, v0, Lod/a;->g:Lqd/j;

    .line 4
    .line 5
    iget-object v1, p0, Lud/e;->r:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v1}, Lxe/s;->n(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lud/e;->r:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lqd/j;->e(Lqd/j;Ljava/util/List;)Lqd/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    return-object v0
.end method

.method public final c0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lud/e;->o:Lb5/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5/k;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lud/e;->p:Lqd/j;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lqd/j;->l()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lqd/j;->n:Lqd/e;

    .line 18
    .line 19
    iget-object v1, v1, Lqd/e;->K:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lud/e;

    .line 2
    .line 3
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 4
    .line 5
    iget-object p1, p1, Lud/e;->m:Lod/a;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lod/a;->b(Lod/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final d0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->x:Lud/e;

    .line 2
    .line 3
    if-eq v0, p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final e0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lud/e;->t:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/r;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v1}, Lud/r;->a0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v2

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-string v3, "Method load error"

    .line 28
    .line 29
    invoke-static {v1, v3, v2}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lud/e;->v:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lud/e;

    .line 50
    .line 51
    invoke-virtual {v1}, Lud/e;->e0()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v0, 0x2

    .line 56
    iput v0, p0, Lud/e;->y:I

    .line 57
    .line 58
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lud/e;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lud/e;

    .line 10
    .line 11
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 12
    .line 13
    iget-object p1, p1, Lud/e;->m:Lod/a;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final f0(Ljf/b;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljf/b;->a()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Ljf/b;->a:Lac/k;

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lmd/e;->z(Ljava/util/ArrayList;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lb5/k;

    .line 13
    .line 14
    sget-object v3, Loc/c;->d:Loc/c;

    .line 15
    .line 16
    iget-object v4, p0, Lmd/e;->g:Lmd/f;

    .line 17
    .line 18
    invoke-virtual {v4, v3}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lpc/f;

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iget-object v3, v3, Lpc/f;->g:Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljf/b;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lpc/g;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    iget v3, v3, Lpc/g;->c:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v3, 0x4

    .line 44
    invoke-virtual {v2, v3}, Lac/k;->B(I)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v2, Lac/k;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    :goto_0
    const/4 v4, 0x3

    .line 56
    const/4 v5, 0x1

    .line 57
    invoke-direct {v1, v3, v5, v4}, Lb5/k;-><init>(III)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lud/e;->o:Lb5/k;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lud/e;->U(Ljf/b;)Lqd/j;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, p0, Lud/e;->p:Lqd/j;

    .line 67
    .line 68
    const/16 v1, 0xc

    .line 69
    .line 70
    invoke-virtual {v2, v1}, Lac/k;->B(I)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_1

    .line 82
    .line 83
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v2, v1}, Lac/k;->a(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lac/k;->J()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :goto_1
    new-instance v3, Lme/a;

    .line 94
    .line 95
    const/16 v4, 0xe

    .line 96
    .line 97
    invoke-direct {v3, v4}, Lme/a;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v3}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v1, p0, Lud/e;->q:Ljava/util/List;

    .line 105
    .line 106
    iget-object v1, v2, Lac/k;->j:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Lff/e;

    .line 109
    .line 110
    iget-object v1, v1, Lff/e;->b:Ljava/lang/String;

    .line 111
    .line 112
    iput-object v1, p0, Lud/e;->s:Ljava/lang/String;

    .line 113
    .line 114
    new-instance v1, Lqc/e;

    .line 115
    .line 116
    new-instance v2, Lud/c;

    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    invoke-direct {v2, p0, v3}, Lud/c;-><init>(Lud/e;I)V

    .line 120
    .line 121
    .line 122
    invoke-direct {v1, v2}, Lqc/e;-><init>(Ljava/util/function/Function;)V

    .line 123
    .line 124
    .line 125
    new-instance v2, Lqc/e;

    .line 126
    .line 127
    new-instance v3, Lud/c;

    .line 128
    .line 129
    const/4 v4, 0x1

    .line 130
    invoke-direct {v3, p0, v4}, Lud/c;-><init>(Lud/e;I)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v2, v3}, Lqc/e;-><init>(Ljava/util/function/Function;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v1, v2}, Ljf/b;->e(Lqc/e;Lqc/e;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, v1, Lqc/e;->b:Ljava/util/List;

    .line 140
    .line 141
    if-nez p1, :cond_2

    .line 142
    .line 143
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 144
    .line 145
    :cond_2
    iput-object p1, p0, Lud/e;->u:Ljava/util/List;

    .line 146
    .line 147
    iget-object p1, v2, Lqc/e;->b:Ljava/util/List;

    .line 148
    .line 149
    if-nez p1, :cond_3

    .line 150
    .line 151
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 152
    .line 153
    :cond_3
    iput-object p1, p0, Lud/e;->t:Ljava/util/List;

    .line 154
    .line 155
    if-eqz p2, :cond_4

    .line 156
    .line 157
    invoke-virtual {p0}, Lud/e;->k0()V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :catch_0
    move-exception p1

    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :cond_4
    :goto_2
    iget-object p1, p0, Lud/e;->u:Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    if-eqz p2, :cond_5

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_7

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    check-cast p2, Lud/g;

    .line 188
    .line 189
    iget-object v1, p2, Lud/g;->m:Lb5/k;

    .line 190
    .line 191
    invoke-virtual {v1}, Lb5/k;->h()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_6

    .line 196
    .line 197
    invoke-virtual {v1}, Lb5/k;->c()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_6

    .line 202
    .line 203
    sget-object v1, Loc/c;->f:Loc/c;

    .line 204
    .line 205
    iget-object v2, p2, Lmd/e;->g:Lmd/f;

    .line 206
    .line 207
    invoke-virtual {v2, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-nez v1, :cond_6

    .line 212
    .line 213
    sget-object v1, Lnc/a;->i:Lnc/a;

    .line 214
    .line 215
    invoke-virtual {p2, v1}, Lmd/e;->y(Loc/b;)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_7
    :goto_4
    invoke-static {p0}, Lud/e;->g0(Lud/e;)V

    .line 220
    .line 221
    .line 222
    iget-object p1, v0, Lod/a;->h:Ljava/lang/String;

    .line 223
    .line 224
    const-string p2, "package-info"

    .line 225
    .line 226
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_8

    .line 231
    .line 232
    iget-object p1, p0, Lud/e;->u:Ljava/util/List;

    .line 233
    .line 234
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-eqz p1, :cond_8

    .line 239
    .line 240
    iget-object p1, p0, Lud/e;->t:Ljava/util/List;

    .line 241
    .line 242
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_8

    .line 247
    .line 248
    sget-object p1, Lmd/a;->L:Lmd/a;

    .line 249
    .line 250
    invoke-virtual {p0, p1}, Lmd/e;->w(Lmd/a;)V

    .line 251
    .line 252
    .line 253
    sget-object p1, Lmd/a;->x:Lmd/a;

    .line 254
    .line 255
    invoke-virtual {p0, p1}, Lmd/e;->w(Lmd/a;)V

    .line 256
    .line 257
    .line 258
    :cond_8
    new-instance p1, Ljava/util/HashMap;

    .line 259
    .line 260
    iget-object p2, p0, Lud/e;->t:Ljava/util/List;

    .line 261
    .line 262
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    .line 267
    .line 268
    .line 269
    iput-object p1, p0, Lud/e;->D:Ljava/util/Map;

    .line 270
    .line 271
    iget-object p1, p0, Lud/e;->t:Ljava/util/List;

    .line 272
    .line 273
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    if-eqz p2, :cond_9

    .line 282
    .line 283
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    check-cast p2, Lud/r;

    .line 288
    .line 289
    iget-object v1, p0, Lud/e;->D:Ljava/util/Map;

    .line 290
    .line 291
    iget-object v2, p2, Lud/r;->k:Lod/d;

    .line 292
    .line 293
    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_9
    iget-object p1, p0, Lud/e;->o:Lb5/k;

    .line 298
    .line 299
    iget p1, p1, Lb5/k;->b:I

    .line 300
    .line 301
    const p2, 0x8000

    .line 302
    .line 303
    .line 304
    and-int/2addr p1, p2

    .line 305
    if-eqz p1, :cond_a

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_a
    const/4 v5, 0x0

    .line 309
    :goto_6
    if-eqz v5, :cond_b

    .line 310
    .line 311
    const-string p1, "Modules not supported yet"

    .line 312
    .line 313
    invoke-virtual {p0, p1}, Lnd/b0;->L(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 314
    .line 315
    .line 316
    :cond_b
    return-void

    .line 317
    :goto_7
    new-instance p2, Laf/g;

    .line 318
    .line 319
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    const-string v1, "Error decode class: "

    .line 324
    .line 325
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    throw p2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 2
    .line 3
    iget-object v0, v0, Lod/a;->g:Lqd/j;

    .line 4
    .line 5
    iget v0, v0, Lqd/j;->a:I

    .line 6
    .line 7
    return v0
.end method

.method public final i0(Lud/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lud/e;->z:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    .line 26
    :cond_1
    :goto_0
    iput-object v0, p0, Lud/e;->z:Ljava/util/List;

    .line 27
    .line 28
    return-void
.end method

.method public final j()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final j0(Ljava/lang/String;)V
    .locals 6

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    iget-object v2, p0, Lud/e;->m:Lod/a;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Lod/a;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {v2}, Lod/a;->o()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v1, Lod/a;

    .line 21
    .line 22
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v4, p0, Lud/e;->k:Lud/u;

    .line 27
    .line 28
    invoke-direct {v1, v4, v3, v0}, Lod/a;-><init>(Lud/u;Lqd/j;Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lod/a;->l()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, v1, Lod/a;->h:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2}, Lod/a;->o()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v5, "Can\'t change package for inner class: "

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2}, Lod/a;->l()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v3, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, " to "

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {v2, v1}, Lod/a;->a(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    invoke-virtual {v2}, Lod/a;->j()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    invoke-virtual {v2, v1}, Lod/a;->a(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    invoke-virtual {v2}, Lod/a;->o()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_6

    .line 105
    .line 106
    iget-object p1, p0, Lud/e;->n:Lud/s;

    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v3, p1, Lud/s;->o:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_4

    .line 118
    .line 119
    iget-object v3, p1, Lud/s;->o:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_4

    .line 126
    .line 127
    iget-object v3, p1, Lud/s;->n:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    invoke-virtual {v4, p1}, Lud/u;->e(Lud/s;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-static {v4, v0}, Lud/s;->I(Lud/u;Ljava/lang/String;)Lud/s;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object v3, p1, Lud/s;->o:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Lud/e;->n:Lud/s;

    .line 148
    .line 149
    iget-object p1, v4, Lud/u;->p:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Lod/a;->o()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_5

    .line 159
    .line 160
    new-instance p1, Lg8/h;

    .line 161
    .line 162
    invoke-direct {p1, v0, v1}, Lg8/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, p1}, Lod/a;->c(Lg8/h;)V

    .line 166
    .line 167
    .line 168
    iput-object p1, v2, Lod/a;->l:Lg8/h;

    .line 169
    .line 170
    return-void

    .line 171
    :cond_5
    const-string p1, "Can\'t change package for inner class"

    .line 172
    .line 173
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_6
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final k0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lud/e;->k:Lud/u;

    .line 2
    .line 3
    iget-object v1, v0, Lud/u;->a:Lbc/g;

    .line 4
    .line 5
    iget-object v1, v1, Lbc/g;->l:Lbd/a;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Lbd/a;->f(Lud/u;)Li4/c0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v1, v0, Li4/c0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lb5/h;

    .line 16
    .line 17
    iget-object v1, v1, Lb5/h;->a:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/Set;

    .line 24
    .line 25
    invoke-static {v1}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Lud/e;->z:Ljava/util/List;

    .line 30
    .line 31
    iget-object v1, v0, Li4/c0;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lb5/h;

    .line 34
    .line 35
    iget-object v1, v1, Lb5/h;->a:Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/util/Set;

    .line 42
    .line 43
    invoke-static {v1}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p0, Lud/e;->B:Ljava/util/List;

    .line 48
    .line 49
    iget-object v1, v0, Li4/c0;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lb5/h;

    .line 52
    .line 53
    iget-object v1, v1, Lb5/h;->a:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/util/Set;

    .line 60
    .line 61
    invoke-static {v1}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput-object v1, p0, Lud/e;->C:Ljava/util/List;

    .line 66
    .line 67
    iget-object v1, p0, Lud/e;->u:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_0

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lud/g;

    .line 84
    .line 85
    iget-object v3, v0, Li4/c0;->e:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Lb5/h;

    .line 88
    .line 89
    iget-object v3, v3, Lb5/h;->a:Ljava/util/HashMap;

    .line 90
    .line 91
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Ljava/util/Set;

    .line 96
    .line 97
    invoke-static {v3}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iput-object v3, v2, Lud/g;->o:Ljava/util/List;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    iget-object v1, p0, Lud/e;->t:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_1

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Lud/r;

    .line 121
    .line 122
    iget-object v3, v0, Li4/c0;->f:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, Lb5/h;

    .line 125
    .line 126
    iget-object v3, v3, Lb5/h;->a:Ljava/util/HashMap;

    .line 127
    .line 128
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Ljava/util/Set;

    .line 133
    .line 134
    invoke-static {v3}, Li4/c0;->j(Ljava/util/Set;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iput-object v3, v2, Lud/r;->H:Ljava/util/List;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_1
    return-void

    .line 142
    :cond_2
    sget-object v0, Lud/e;->F:Lmh/b;

    .line 143
    .line 144
    const-string v1, "Can\'t restore usage data for class: {}"

    .line 145
    .line 146
    invoke-interface {v0, p0, v1}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public final l0(Lod/c;)Lud/g;
    .locals 3

    .line 1
    iget-object v0, p0, Lud/e;->u:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/g;

    .line 18
    .line 19
    iget-object v2, v1, Lud/g;->l:Lod/c;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Lod/c;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m0(Ljava/lang/String;)Lud/r;
    .locals 3

    .line 1
    iget-object v0, p0, Lud/e;->t:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/r;

    .line 18
    .line 19
    iget-object v2, v1, Lud/r;->k:Lod/d;

    .line 20
    .line 21
    iget-object v2, v2, Lod/d;->k:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public final n()Lud/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->k:Lud/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n0(Ljava/lang/String;)Lud/r;
    .locals 3

    .line 1
    iget-object v0, p0, Lud/e;->t:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/r;

    .line 18
    .line 19
    iget-object v2, v1, Lud/r;->k:Lod/d;

    .line 20
    .line 21
    iget-object v2, v2, Lod/d;->g:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public final o0()V
    .locals 5

    .line 1
    iget v0, p0, Lud/e;->y:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v2, p0, Lud/e;->t:Ljava/util/List;

    .line 11
    .line 12
    new-instance v3, Lae/e;

    .line 13
    .line 14
    const/16 v4, 0x1d

    .line 15
    .line 16
    invoke-direct {v3, v4}, Lae/e;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v2, v3}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lud/e;->v:Ljava/util/List;

    .line 23
    .line 24
    new-instance v3, Lud/d;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v3, v4}, Lud/d;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2, v3}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lud/e;->u:Ljava/util/List;

    .line 34
    .line 35
    new-instance v3, Lud/d;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-direct {v3, v4}, Lud/d;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, v3}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lmd/e;->F()V

    .line 45
    .line 46
    .line 47
    iput v1, p0, Lud/e;->y:I

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw v1
.end method

.method public final p0(Lbe/f0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lud/e;->k:Lud/u;

    .line 2
    .line 3
    iget-object v0, v0, Lud/u;->i:Lfe/a;

    .line 4
    .line 5
    invoke-virtual {p0}, Lud/e;->b0()Lqd/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lud/e;->p:Lqd/j;

    .line 10
    .line 11
    sget-object v3, Lqd/j;->k:Lqd/e;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lud/e;->p:Lqd/j;

    .line 20
    .line 21
    invoke-virtual {p1, v1, v2}, Lbe/f0;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lud/e;->p:Lqd/j;

    .line 25
    .line 26
    invoke-virtual {v0, v2, p1}, Lfe/a;->n(Lqd/j;Lbe/f0;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v2, p0, Lud/e;->q:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lqd/j;

    .line 46
    .line 47
    invoke-virtual {p1, v1, v3}, Lbe/f0;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3, p1}, Lfe/a;->n(Lqd/j;Lbe/f0;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 2
    .line 3
    iget-object v0, v0, Lod/a;->j:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public final typeName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "class"

    .line 2
    .line 3
    return-object v0
.end method
